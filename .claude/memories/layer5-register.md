# Layer 5 — registering user classes (`register/`)

How a `game` class becomes a real Godot class. **Zero registration code in the
game** — only `extends` + annotations.

## User-facing (game)
```scala
final class Player extends Node2D {          // base derived from superclass
  @gdexport var speed: Double = 120.0        // inspector property
  @func def getScore(): Long = ...           // callable from GDScript
  @signal def pinged(): Unit = ()            // signal
  override def _process(delta: Double) = ... // virtual, auto-detected
}
```
**No manual registration anywhere.** Just write the class. A build-time source
generator discovers it; `game.GameEntry` is set up once and **never edited** to
add/remove classes. No `@godotClass` annotation — base comes from `extends`.

## Macro: `Register.scala` (`Register.auto[T]`)
Scans `T` at compile time and emits all registration calls:
- Godot **base** = `T`'s direct superclass symbol name.
- **virtuals** auto-detected from overrides; `knownVirtuals` = `_ready`/`_process`/
  `_physics_process` + editor ones (`_enter_tree`/`_exit_tree`/`_update_property`/
  `_can_handle`/`_parse_property`).
- `@func` → `MethodRegistration.registerGetter`; `@gdexport` →
  `PropertyRegistration.registerExport`; `@signal` → `SignalRegistration`.
- Annotations in `annotations.scala`. `@gdexport` (not `@export` — keyword clash).

## Exports (`ExportType[A]` seam) — `ExportType.scala`
`@gdexport` is **type-agnostic**: the macro reads the field type `A`, summons
`ExportType[A]` (marshalling + inspector metadata: `variantType`/`hint`/
`hintString`/`className`/`usage`/`sceneRootType`), and emits get/set lambdas.
Per-type logic is in givens, NOT the macro. Supported field types:
- primitives Long/Int/Double/Boolean/Float/String;
- **references** via `RefLeaf[A]` givens (in `object RefLeaf` — must be there for
  implicit search) × optionality: `Option[X]` (nullable), `Required[X]` (`.get`
  throws if unassigned), bare `X` (= Required). `X` ∈ `Gd[T]` (node, hint
  NODE_TYPE), `Tres[T]` (resource, RESOURCE_TYPE), `Tscn[T]` (scene,
  RESOURCE_TYPE="PackedScene" + `sceneRootType=T`). Wrappers in
  `engine/ExportWrappers.scala`; object Variant marshalling in
  `engine/ObjectVariant.scala`.
- **enums**: parameterless Scala 3 enums, synthesized inline by the macro
  (hint ENUM, ordinal⇄`fromOrdinal`).
- **typed dict** `Dict[K,V]` (`builtin/Dict.scala`): hint **TYPE_STRING(23)** with
  encoded `hint_string` `"<key>;<value>"`, each part `<type>[/<hint>]:<hintstr>`
  (this is what GDScript emits — NOT DICTIONARY_TYPE; verified vs live engine).
Hints/usage constants in `PropertyHints.scala`. `MethodRegistration.fillPropertyInfo`
now writes hint/hint_string/class_name/usage (was all-zero before).

## Editor integration (Tscn filtering) — `register/editor/EditorIntegration.scala`
`Tscn[T]` exports record `(class,prop)->rootType` in `SceneExportRegistry`. At the
**EDITOR** init level (handled in `GodotEngine`, classes registered with
`isRuntime=false`), `editor_add_plugin` installs `ScalaExportPlugin` (EditorPlugin);
its `_enter_tree` adds `ScalaExportInspectorPlugin` (EditorInspectorPlugin), whose
`_parse_property` looks up the registry to know a scene prop's required root.
Generalized virtual dispatch for the editor virtuals is in `ClassRegistration`
(decode args via raw ptrs; bool returns). **Done + headless-verified**: full
plugin pipeline registers and runs. **Follow-up**: the interactive picker widget
that *rejects* wrong-root scenes needs a Callable→Scala primitive (to react to the
picker's selection signal); currently `_parse_property` only detects + logs.

## Registration substrate
- `GodotScriptClass.scala` — root base: `hostObject`, `withHost`, virtuals.
- `ClassRegistration.scala` — fills `GDExtensionClassCreationInfo4` with static
  trampolines (create/free/recreate/get_virtual). **`is_runtime=1`** (runtime-only,
  so editor doesn't tick it). Reload-safe: probes `classdb_get_class_tag` and
  unregisters a stale class before re-registering. No deinit-side unregister.
- `ClassRegistry.scala` / `Tokens.scala` — integer tokens (in `CVoidPtr` slots)
  map Godot callbacks → Scala state (CFuncPtrs can't capture closures).
- `MethodRegistration` / `PropertyRegistration` / `SignalRegistration` — the
  builder APIs the macro targets. Dispatch via Variant `call_func` trampoline.

## Auto-discovery (build-time codegen)
`GameEntry` only calls `GeneratedRegistrations.registerAll()` — fixed forever.
An sbt **source generator** (`harness-scala/project/RegistrationScan.scala`,
wired in `harness-scala/build.sbt` as `harness`'s `Compile / sourceGenerators`,
uses scalameta from `harness-scala/project/build.sbt`) scans `harness-scala/src`
every compile and emits `game.GeneratedRegistrations` (a managed source under
`target/`, never committed)
with one `Register.auto[T]()` per discovered class.
Registers iff: concrete `class` (not abstract/trait/object) **and** zero-arg
primary ctor (Godot factory builds with no args) **and** parent chain reaches a
Godot engine class (engine class names = file names under generated `codegen/
engine/`), directly or via another harness class (abstract bases relay).
Add a class → it registers; no edits to `GameEntry` or any list.

## Reliability note (Scala Native DCE)
SN dead-code-eliminates unreferenced classes and never runs module initializers
at load — so truly self-registering classes don't work, and discovery must be at
**build time**, not runtime. The generated `Register.auto[T]()` calls both
reference each type (keep it linked) and register it.
