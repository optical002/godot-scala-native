# Plan: Nullable-primitive exports + type-safety roadmap (gdext parity)

## Context

The binding already reaches near-zero registration boilerplate (macro-driven
`Register.auto[T]`, build-time `RegistrationScan`) and is type-safe for the
cases it covers. The user asked, comparing against **gdext** (Rust) and other
bindings: (1) what else can reduce boilerplate / add type-safety, and (2) is
`Option[Int]` realistic as an export, with editor support.

This plan answers both, then details three chosen workstreams — **nullable
primitives** (the direct ask, fully spec'd and ready to implement), **richer
export hints**, and **typesafe engine enums** — plus a priority roadmap for the
rest. Typed signals were considered but deprioritized by the user.

---

## Findings: how we compare to gdext

What gdext has that we don't yet (ranked by value/effort):

| Feature | gdext | Us today | Gap |
|---|---|---|---|
| Nullable primitive export | `Option<i64>` via Variant | none (primitives always present) | **this plan** |
| Export hints (`range`, `file`, `dir`, `multiline`) | `#[export(range=..)]` etc. | only enum/resource/node/typed-collection | **this plan** |
| Inspector groups/subgroups/categories | `#[export_group]` | none | **this plan** |
| Engine enums type-safe | newtype enums | raw `Long` across ptrcall | **this plan** |
| Typed signals (args, checked emit/connect) | `signals().foo().emit(x)` | no-arg, untyped | roadmap (deferred) |
| `#[constant]` registration | yes | no | roadmap |
| Dynamic `_get_property_list` | no (open issue) | no | not pursued (parity) |

We are already **ahead** of gdext on ergonomics in one place: ctor-`var`
auto-export with zero annotation, and build-time class discovery (gdext requires
`#[derive(GodotClass)]` per class). Worth keeping as the north star.

### `Option[Int]` feasibility + editor support — answer: **yes, realistic**

- Godot's Variant model makes `int`/`float`/`bool` **non-nullable**; only `Nil`
  and `Object` can be null. So a nullable int **cannot** be a plain INT property.
- **Godot 4.5+ supports exporting `Variant`-typed properties** (we target 4.6.1,
  so it's available). The inspector renders a Variant with a **type-picker** that
  includes `Nil` — so `None` is editable as `<null>` and `Some(n)` as an int.
- Mapping: export with `variantType = VARIANT`, marshal `None ↔ Nil variant`,
  `Some(n) ↔ INT variant`. On read, branch on `variant_get_type` (already wired
  as `Variant.variantType`).
- **Caveat (be explicit to user):** the generic Variant editor is not constrained
  to "int-or-nil"; the user could pick another type in the inspector. Our
  `fromVariant` coerces anything non-INT back to `None` (or the declared element
  type), so it's safe but the editor UX is a generic Variant widget, not a
  bespoke "optional int" widget. No PropertyHint exists to constrain a Variant to
  one type + nil. (`@export var x: Variant.Type` only constrains to the *enum of
  type names*, not what we want.)

---

## Workstream 1 — Nullable primitives (`Option[Int]`, `Option[Double]`, …)

**Goal:** `@gdexport var hp: Option[Int] = None` and ctor-param form, editable in
the inspector as a nullable value.

### Files to change

1. **`builtin/Variant.scala`** — add Nil support to the marshalling seam:
   - `ToVariant`/`FromVariant` are the value seam. Add a helper to write a **Nil**
     variant into `dest`: prefer the interface's `variant_new_nil` if present in
     `Godot.interface` (check codegen `interface/Interface.scala`); otherwise zero
     the `BuiltinSizes.Variant` buffer (a zeroed Variant is NIL in Godot's ABI).
   - No new givens for `Option` belong here — keep `Option` in the export layer
     (it carries inspector metadata). Variant.scala only needs the Nil writer +
     the existing `variantType` reader (already present, line 32–34).

2. **`register/ExportType.scala`** — add the optional-primitive given:
   ```scala
   // A marker so Option[primitive] doesn't collide with optRef[Option[RefLeaf]].
   // Only summonable for the value primitives we already support.
   given optPrim[A](using inner: ExportType[A], prim: PrimitiveExport[A])
       : ExportType[Option[A]] = new ExportType[Option[A]] {
     def variantType = GDEXTENSION_VARIANT_TYPE_NIL   // exported as VARIANT
     // usage stays Default; no hint
     def toVariant(value: Option[A], dest) = value match {
       case Some(a) => inner.toVariant(a, dest)       // INT/FLOAT/BOOL/STRING variant
       case None    => Variant.writeNil(dest)
     }
     def fromVariant(v) =
       if (v.variantType == GDEXTENSION_VARIANT_TYPE_NIL) None
       else Some(inner.fromVariant(v))
   }
   ```
   - Add a sealed `PrimitiveExport[A]` marker with givens only for
     `Long, Int, Double, Float, Boolean, String`. This **disambiguates** from the
     existing `optRef[A](using RefLeaf[A])` given (references have `RefLeaf`,
     primitives have `PrimitiveExport`; no type has both) so implicit search stays
     unambiguous.
   - Note: the property's declared `variantType` for a VARIANT export should be
     `NIL` (Godot uses NIL as the "any Variant" type tag in `PropertyInfo`); verify
     against the live inspector — if 4.6.1 wants a usage flag like
     `PROPERTY_USAGE_NIL_IS_VARIANT`, add it to `PropertyUsage` and OR it in (see
     verification).

3. **`register/DefaultValue.scala`** — already has `optDefault[A] = of(None)`
   (per exploration). Confirm it applies to `Option[primitive]` too; if it's
   constrained to refs, broaden it. So `var hp: Option[Int]` needs no explicit
   `= None`.

4. **`register/PropertyHints.scala`** — add `PropertyUsage.NilIsVariant` only if
   verification shows it's required.

### Harness usage to add (for verification)
`harness-scala/src/main/scala/game/ExportsDemo.scala`:
```scala
@gdexport var maybeHp: Option[Int] = None
@gdexport var maybeSpeed: Option[Double] = Some(1.5)
```

---

## Workstream 2 — Richer export hints + inspector organization

**Goal:** approach gdext/GDScript `@export_range`, `@export_file`,
`@export_dir`, `@export_multiline`, and `@export_group/_subgroup/_category`.

### Approach
The `ExportType[A]` trait already exposes `hint`, `hintString`, `usage` — the
inspector machinery is in place. Two ergonomic options; **recommend annotation
parameters** to match the existing `@gdexport` style:

1. **`register/annotations.scala`** — extend `@gdexport` (or add siblings) to
   carry hint params, e.g.:
   ```scala
   @gdexport(range = Range(0, 100, step = 1))      var hp: Int = 50
   @gdexport(file = "*.png")                        var icon: String = ""
   @gdexport(multiline = true)                      var bio: String = ""
   @gdexport(group = "Combat")                      var dmg: Int = 10
   ```
2. **`register/Register.scala`** (the macro, ~360 lines) — read the annotation's
   args at compile time and pass them into `PropertyRegistration.registerExport`
   as an override of `hint`/`hintString`/`usage`. This is the main work: the macro
   currently summons `ExportType[A]` and ignores per-field overrides; add an
   optional `HintOverride` threaded through.

3. **`register/PropertyHints.scala`** — add the hint constants used:
   `Range = 1`, `File = 13`, `Dir = 15`, `MultilineText = 5`, and the
   `PropertyUsage.Group/Subgroup/Category` group-marker usage flags (groups are
   emitted as *separate synthetic properties* with `USAGE_GROUP`, name = group
   label — replicate how GDScript emits them; verify hint_string/usage against the
   live inspector).

Groups/subgroups/categories are emitted as **marker properties** in
`registerExport` ordering, so the macro must preserve declaration order and inject
a group marker before the fields that follow it. Lower priority than range/file
if scope needs trimming.

---

## Workstream 3 — Typesafe engine enums

**Goal:** engine enums (currently raw `Long` in generated `codegen/engine/*.scala`
method signatures) become distinct opaque types so `setMode(raw = 3)` can't be
called with an arbitrary Long or the wrong enum.

### Approach (codegen — never hand-edit `codegen/`)
1. **`interface-generator/.../EngineClassGenerator.scala`** — currently maps
   `enum::`/`bitfield::` → `"Long"`. Change to generate, per Godot enum, a Scala 3
   `opaque type` (or `enum`) with named cases sourced from `extension_api.json`
   `global_enums` + per-class `enums`, e.g.:
   ```scala
   opaque type Mode = Long
   object Mode { val Idle: Mode = 0; val Run: Mode = 1; … 
                 extension (m: Mode) def toLong: Long = m }
   ```
   Use `opaque type … = Long` (not `enum`) so the ptrcall boundary stays a plain
   int64 with **zero marshalling change** — `PtrArg[Long]`/`PtrRet[Long]` are
   reused via `m.toLong` / `Mode(raw)`. Bitfields get `|`/`&` extension ops.
2. Method signatures referencing the enum switch from `Long` to the opaque type;
   `Ptrcall` is untouched because the opaque type erases to `Long`.
3. Regenerate: `cd language-binding-scala && sbt igen/regenerate`. This touches
   ~1023 generated files — **must** go through the generator, not by hand.
4. Update `register/ExportType.scala`: user-facing exported enums already work
   (Scala 3 `enum`); engine-enum exports (if any) reuse the INT given via
   `toLong`.

**Risk:** large generated diff; name collisions between global and nested enums.
Mitigate by namespacing nested enums under the class companion. This is the
highest-effort workstream — sequence it last.

---

## Recommended sequencing

1. **Workstream 1 (nullable primitives)** — small, self-contained, directly
   answers the ask. Ship first.
2. **Workstream 2 (export hints)** — high user value, moderate macro work. Do
   range/file/dir/multiline first; groups second.
3. **Workstream 3 (typesafe enums)** — largest blast radius; do last, on its own
   branch.
4. **Deferred roadmap (not in this plan):** typed signals (extend
   `SignalRegistration` arg-info array + a `Signal[T]` accessor), `@constant`
   registration, `@func` with parameters. Revisit after 1–3.

---

## Verification (per the golden rules — a clean headless run, not just compile)

For **each** workstream:
1. `cd harness-scala && sbt build` (atomically swaps the `.so` into `godot/lib/`).
2. `cd godot && godot --headless --path . --quit-after 5` — read output, confirm
   no `Cannot get class 'X'`, missing-library, or registration failures.
3. **Inspector check (workstreams 1 & 2):** open the project in the editor (or
   dump the property list) and confirm:
   - `Option[Int]` shows a nullable/Variant widget; setting it to `<null>` round-
     trips to `None`, an int to `Some(n)`. Save the scene, reload, confirm
     persistence. This is where the `NIL`-vs-`NIL_IS_VARIANT` usage-flag question
     gets settled empirically.
   - hint widgets render (slider for range, file dialog for file, group headers).
4. Add a `verify.gd` assertion (per existing pattern) reading the new exported
   props back via `get()` to prove the get/set lambdas marshal correctly.
5. **Workstream 3:** confirm `sbt igen/regenerate` produces a clean compile AND a
   clean headless run; spot-check a few engine method calls (e.g. a `setMode`
   using the new enum) still ptrcall correctly.

## Memory upkeep
After implementing, update `.claude/memories/layer5-register.md` (export types,
hints, nullable primitives) and `layer3-engine.md` (typesafe enums) per CLAUDE.md.
