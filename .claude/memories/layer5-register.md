# Layer 5 — registering user classes (`register/`)

How a `game` class becomes a real Godot class. **Zero registration code in the
game** — only `extends` + annotations.

## User-facing (game)
```scala
final class Player(                           // base derived from superclass
  var speed: Double = 120.0,                  // var ctor param = auto-export
  var projectile: Gd[Projectile]             // no default needed (see below)
) extends Node2D {
  @gdexport var hp: Int = 100                 // body @gdexport still works too
  @func def getScore(): Long = ...           // callable from GDScript
  @signal def pinged(): Unit = ()            // signal
  override def _process(delta: Double) = ... // virtual, auto-detected
}
```
Two export forms: **body** `@gdexport var` fields (need a Scala initializer) and
**`var` constructor params** (auto-export, need NO default — see `DefaultValue`).
**No manual registration anywhere.** Just write the class. A build-time source
generator discovers it; `game.GameEntry` is set up once and **never edited** to
add/remove classes. No `@godotClass` annotation — base comes from `extends`.

## Macro: `Register.scala` (`Register.auto[T]`)
Scans `T` at compile time and emits all registration calls:
- Godot **base** = `T`'s first **non-trait** superclass symbol name (filter traits:
  a `case class` also mixes in `Product`/`Serializable`, which can sort ahead).
- **virtuals** auto-detected from overrides; `knownVirtuals` = `_ready`/`_process`/
  `_physics_process` + editor ones (`_enter_tree`/`_exit_tree`/`_update_property`/
  `_can_handle`/`_parse_property`).
- `@func` → `MethodRegistration.registerGetter`; `@gdexport` →
  `PropertyRegistration.registerExport`; `@signal` → `SignalRegistration`.
- Annotations in `annotations.scala`. `@gdexport` (not `@export` — keyword clash).
- **ctor-param auto-export** (ANY class, case or not): every `var` primary-ctor
  param behaves as an inlined `@gdexport` — collected as the mutable
  (`Flags.Mutable`) fields matching the ctor param names; `val`/plain params
  skipped silently. Combined with body `@gdexport` fields, de-duped by name.
  Params need a setter (so `var`) but **no default**.
- **factory / `DefaultValue`** (`DefaultValue.scala`): Godot builds instances with
  no args, so the factory supplies every primary-ctor param explicitly. Per param,
  in order: (1) the user's explicit default via the companion's nullary
  `$lessinit$greater$default$N` getter (Select, not Apply — no params); else
  (2) `DefaultValue[A].default` summoned from the param type (primitives→0/""/false,
  `Option`→None, `Required`/`Gd`/`Tres`/`Tscn`→unassigned/null, `Dict`→empty, bare
  node/resource→null wrapper); else (3) parameterless enum→`fromOrdinal(0)`; else
  compile error. So a param needs `= ...` only to override the type's default.
  GOTCHA: a `@func` must not snake_case onto a property accessor — `getHp`
  collides with exported `hp`'s `get_hp` ("Method already bound").

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
  **Wrapper-free shorthand**: a bare game/engine type may stand in for `Gd`/`Tres`
  — `bareNodeLeaf[T <: Node]`/`bareResourceLeaf[T <: Resource]` give `RefLeaf[T]`,
  so `Option[Projectile]` ≡ `Option[Gd[Projectile]]` (NODE_TYPE) and
  `Option[PlayerStats]` ≡ `Option[Tres[PlayerStats]]` (RESOURCE_TYPE); node-vs-
  resource hint inferred by the type bound. Marshals via `GodotClass.wrap/unwrap`.
  Bare also works as a Required ctor param with NO default: `var projectile:
  Projectile` ≡ `Gd[Projectile]` (null default), `var stats: PlayerStats` ≡
  `Tres[PlayerStats]` (unassigned) — the matching `DefaultValue.bareNodeDefault`/
  `bareResourceDefault` supply the null-handle wrapper (see DefaultValue.scala).
  `Tscn[T]` has no bare form (root type can't be inferred). Additive — existing
  `Gd`/`Tres` exports unchanged.
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
Registers iff: concrete `class` (not abstract/trait/object) **and** every
primary-ctor param is constructible with no caller args — has a default **OR** is
a `var` (the macro factory fills an un-defaulted `var` from its `DefaultValue`);
zero-param is vacuously fine, so a class/`case class` with all-`var` params
qualifies **and** parent chain reaches a Godot engine class (engine class names =
file names under generated `codegen/engine/`), directly or via another harness
class (abstract bases relay). (Scalameta checks `p.default.isDefined ||
Mod.VarParam`.)
Add a class → it registers; no edits to `GameEntry` or any list.

## Reliability note (Scala Native DCE)
SN dead-code-eliminates unreferenced classes and never runs module initializers
at load — so truly self-registering classes don't work, and discovery must be at
**build time**, not runtime. The generated `Register.auto[T]()` calls both
reference each type (keep it linked) and register it.
