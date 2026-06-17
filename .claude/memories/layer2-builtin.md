# Layer 2 — builtin types (`builtin/`)

The Variant marshalling seam everything above depends on.

## Core
- `Variant.scala` — `Variant` opaque over a 24-byte buffer + the
  **`ToVariant[A]` / `FromVariant[A]`** typeclasses (primitives: Int/Long/Bool/
  Float/Double). `Variant.scope`/`from`/`to`.
- `VariantConstructors.scala` — caches per-type from/to/destructor function
  pointers (indexed by variant-type tag).
- `BuiltinSizes.scala` — byte sizes pinned from `extension_api.json` `float_64`
  config (Variant=24, String/StringName/Array/Dictionary=8, Vector2=8, …). The
  ABI source of truth.

## Types
- `GString.scala` — Godot String ↔ Scala String (UTF-8, two-call length probe).
- `StringName.scala` — interned 8-byte handle + `StringNames.cached(name)` cache
  (used for ALL class/method/property/signal names). `StringName.toScala(sn)`
  decodes via String-from-StringName constructor.
- `Vector2.scala`, `Color.scala` — representative math value types.
  **Components are 32-bit float even in float_64** (Vector2 = 2×CFloat = 8 bytes;
  `*i` vectors are CInt). `writeType`/`readType` are `private[godot]` (used by
  Ptrcall).
- `MathBuiltins.scala` — the rest of the fixed-layout math family in one file:
  Vector2i/3/3i/4/4i, Rect2/Rect2i, Quaternion, Plane, AABB, Basis,
  Transform2D/3D, Projection. Same `writeType`/`readType` + `ToVariant`/
  `FromVariant` pattern; sizes from `BuiltinSizes`. (Still hand-written, not yet
  codegen.)
- `GArray.scala`, `Dictionary.scala` — containers via builtin-method ptrcall.
  Method hashes hardcoded from API (e.g. Array.size=3173160232).
- `Dict.scala` — typed `Dict[K,V]` over `Dictionary` (heap-owned backing handle);
  `ToVariant`/`FromVariant[Dict[K,V]]` (DICTIONARY variant). Used by `@gdexport`.
- `BuiltinMethods.scala` — caches builtin-method ptrcall pointers.

## Variant marshalling notes
- `ToVariant[String]`/`FromVariant[String]` now exist (build a STRING Variant from
  a temp GString via `VariantConstructors.fromType(STRING)`; decode + destroy).
- OBJECT-typed Variants (node/resource refs): `engine/ObjectVariant.scala`
  read/write the object handle through the OBJECT type constructors.
