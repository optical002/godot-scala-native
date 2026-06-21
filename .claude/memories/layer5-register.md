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
generator discovers it; the GDExtension entry point is generated too, so no entry
file is hand-written or edited to add/remove classes. No `@godotClass` annotation
— base comes from `extends`.

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
- **Color** (`builtin/Color.scala`): variant COLOR(5), color-picker widget.
- **typed dict** `Dict[K,V]` (`builtin/Dict.scala`): hint **TYPE_STRING(23)** with
  encoded `hint_string` `"<key>;<value>"`, each part `<type>[/<hint>]:<hintstr>`
  (this is what GDScript emits — NOT DICTIONARY_TYPE; verified vs live engine).
- **typed array** `Arr[A]` (`builtin/Arr.scala`): variant ARRAY(28), hint
  TYPE_STRING(23), `hint_string` = ONE elemPart `<type>[/<hint>]:<hintstr>`
  (e.g. `"2:"` Int, `"4:"` String, `"24/34:Enemy"` node). `arrExport`/`arrDefault`
  givens summon `ExportType[A]`. Object elements need `Gd`/`Tres` wrapper
  (`Arr[Gd[Enemy]]`) — `Arr.fromVariant[A]` needs `To`/`FromVariant[A]`, which bare
  nodes lack. Verified vs live engine (`export_verify.gd` `_check_player`).
Hints/usage constants in `PropertyHints.scala`. `MethodRegistration.fillPropertyInfo`
now writes hint/hint_string/class_name/usage (was all-zero before).

## Export hints & inspector sections (`ExportHint.scala`, `annotations.scala`)
`@gdexport` takes an optional `ExportHint` (the GDScript `@export_range`/`_file`/…
analogue): `@gdexport(ExportHint.range(0,100)) var hp: Int`. `ExportHint(hint,
hintString, usageExtra)` **overrides** the `ExportType`'s hint/hint_string and ORs
`usageExtra`; bare `@gdexport` = `ExportHint.none` (ExportType metadata used as-is).
Factories: `range(min,max,step,flags*)` (flags e.g. `"or_greater"`,`"suffix:px"`),
`expEasing`, `multiline`, `file(filter)`/`dir`/`globalFile`/`globalDir`, `locale`,
`colorNoAlpha`. Hints pinned in `PropertyHints.scala` (RANGE=1, EXP_EASING=4,
FILE=13, DIR=14, GLOBAL_FILE=15, GLOBAL_DIR=16, MULTILINE=18, COLOR_NO_ALPHA=21,
LOCALE=32). The macro reads the annotation's arg **Term** and re-splices it into
`registerExport(..., hint=…)` — no compile-time eval.
**Inspector sections** = positional markers via `@exportCategory(name)` /
`@exportGroup(name,prefix="")` / `@exportSubgroup(name,prefix="")` on a `@gdexport`
field; each applies to every property registered *after* it. So the macro **sorts
export fields by source position** (`f.pos.start`) and emits markers (category→
group→subgroup) before that field's property. Group/subgroup use the dedicated
ClassDB calls (`classdb_register_extension_class_property_{group,subgroup}`, which
set their own usage flag); **category has no GDExtension call**, so it's emitted as
a NIL marker property with `PropertyUsage.Category` and empty getter/setter names
(works, no errors). **Godot usage-flag values** (don't reuse the wrong ones):
GROUP=64, CATEGORY=128, SUBGROUP=256. Showcase: `game/ExportTest.scala` (extends
Node, every hint+section); verified by `godot/export_hints_verify.gd`.

## Component-reference dropdowns (`CompEnumRegistry.scala`, `annotations.scala`)
Turn a `String` `@gdexport` into an inspector **ENUM dropdown** whose options are
enumerated, at inspect time, from another exported "comp" property on the same
class. Four annotations (each `class X(comp: String)`, `comp` = sibling Scala
field name): `@exportBoneName` (Skeleton3D bones), `@exportAnimation`
(AnimationPlayer/Mixer animations), `@exportSpriteAnimation` (SpriteFrames anims),
`@exportAnimationProperty` (AnimationTree `parameters/...` paths). Usage:
`@gdexport var skeleton: Gd[Skeleton3D] = …; @exportBoneName("skeleton") @gdexport
var boneName: String = ""`.
- **Mechanism = Godot `validate_property`** (NOT a custom editor widget, so no
  theme crash). `ClassRegistration` now also sets `at_validate_property_func`
  (struct field 12 of `GDExtensionClassCreationInfo4`) to a static trampoline
  that, per property, looks up a `CompEnumRegistry` builder by
  `(getClass.getSimpleName, propName)`; if found it rewrites the PropertyInfo's
  `hint`→ENUM(2) and `hint_string`→comma-joined names (via
  `MethodRegistration.heapGString`), returns true; else false. Exercised by a
  plain headless `get_property_list()` (the instance is real).
- **Macro** (`Register.scala`): `compAnnotationOf`/`compEnumRegFor` — finds the
  sibling comp field, gets its type `C`, builds a typed getter via `fieldLambdas`,
  summons `CompEnum.AsGd[C,E]` (E fixed by the annotation; `<:<`-based givens so
  `Gd[AnimationPlayer]` projects to `Gd[AnimationMixer]`, plus `Tres`/`Option`/
  `Required`), and emits `CompEnumRegistry.register(class, prop, builder)`. Comp
  annotation is only valid on a `String` field.
- **Enumeration** (`CompEnum`): boneNames iterates `getBoneCount`/`getBoneName`
  (NOT `getConcatenatedBoneNames` — StringName ptrcall **return** is a known-buggy
  Phase-2 caveat in `Ptrcall.PtrRet`, segfaults `toScala`). Animation/sprite use
  `builtin/PackedStringArrayRead.call0` (codegen drops PackedStringArray-returning
  methods, so it raw-`object_method_bind_ptrcall`s by baked hash — get_animation_list
  /get_animation_names hash `1139954409`). Tree params use
  `builtin/ObjectPropertyList.names` (raw `Object.get_property_list` hash
  `3995934104`, reads each Dictionary's `"name"`, filters `parameters/`). Null comp
  → `Seq("")`. Hashes from `gdextension/extension_api.json` (4.6.1, matches runtime).
- Hot-reload: `GodotEngine` deinit(SCENE) calls `CompEnumRegistry.clear()` beside
  `unregisterAll`. Demo: `harness/game/ExportCompProperties.scala`; verified by
  `godot/export_comp_verify.gd`.

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
  trampolines (create/free/recreate/get_virtual + `validate_property` for the
  comp-reference dropdowns above). **`is_runtime=1`** (runtime-only,
  so editor doesn't tick it). Reload-safe: probes `classdb_get_class_tag` and
  unregisters a stale class before re-registering. No deinit-side unregister.
- `ClassRegistry.scala` / `Tokens.scala` — integer tokens (in `CVoidPtr` slots)
  map Godot callbacks → Scala state (CFuncPtrs can't capture closures).
- `MethodRegistration` / `PropertyRegistration` / `SignalRegistration` — the
  builder APIs the macro targets. Dispatch via Variant `call_func` trampoline.

## Auto-discovery (build-time codegen)
An sbt **source generator** (`harness-scala/project/RegistrationScan.scala`,
wired in `harness-scala/build.sbt` as `harness`'s `Compile / sourceGenerators`,
uses scalameta from `harness-scala/project/build.sbt`) scans `harness-scala/src`
every compile and emits `game.GeneratedRegistrations` (a managed source under
`target/`, never committed) with one `Register.auto[T]()` per discovered class.
The same generator also emits `game.GeneratedEntry` — the
`@exported(entrySymbol)` GDExtension entry point that calls `registerAll()` once.
The exported symbol + `selfTest` come from the `entrySymbol` / `entrySelfTest`
settings in `harness-scala/build.sbt`; `entrySymbol` must equal `entry_symbol` in
`godot/godot_scala.gdextension`. No entry file is hand-written.
Registers iff: concrete `class` (not abstract/trait/object) **and** every
primary-ctor param is constructible with no caller args — has a default **OR** is
a `var` (the macro factory fills an un-defaulted `var` from its `DefaultValue`);
zero-param is vacuously fine, so a class/`case class` with all-`var` params
qualifies **and** parent chain reaches a Godot engine class (engine class names =
file names under generated `codegen/engine/`), directly or via another harness
class (abstract bases relay). (Scalameta checks `p.default.isDefined ||
Mod.VarParam`.)
Add a class → it registers; no edits to any entry file or list.

## Custom-node inheritance (custom extends custom)
A custom node may extend **another custom node**, not just an engine class —
e.g. `class Skeleton(var skeletonName: String=…) extends Enemy(hp, …)`. It just
works: the macro's base-name derivation (`baseClasses.drop(1).find(non-trait)`)
yields the custom parent's name (`"Enemy"`), `declaresOverride` walks the whole
chain so inherited virtual overrides are still detected, and Godot's ClassDB
exposes the parent's properties/methods/signals on the child — the child's macro
registers only its **own** declared members (no double-registration). Example:
`harness-scala/src/main/scala/game/{Enemy,Skeleton}.scala`, verified by
`godot/export_verify.gd` `_check_skeleton`.
Requirements/gotchas:
- The base must be an **open `class`** — not `final`, not a `case class` (Scala
  forbids extending a case class). The child forwards the base's required ctor
  args in its `extends Base(...)` clause; its own primary-ctor params must still
  all be `var`-or-defaulted so the no-arg factory works.
- **Ordering matters.** Godot needs a parent extension class registered *before*
  its child, and refuses to *unregister* a class while a registered child still
  inherits it. So: `RegistrationScan` emits parents-first (sorts by `depth` = hops
  up the in-module parent chain, then pkg/name); `ClassRegistration.unregisterAll`
  removes children-first (sorts by **descending** depth, using
  `ClassRegistry.parentNameOf`). Don't revert these to plain alphabetical sorts.
- A `String` property named after a built-in (e.g. `name` on `Node`) collides —
  use a distinct field name (`skeletonName`).

## Reliability note (Scala Native DCE)
SN dead-code-eliminates unreferenced classes and never runs module initializers
at load — so truly self-registering classes don't work, and discovery must be at
**build time**, not runtime. The generated `Register.auto[T]()` calls both
reference each type (keep it linked) and register it.
