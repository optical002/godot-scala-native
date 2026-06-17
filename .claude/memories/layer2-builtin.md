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
- `Vector2.scala`, `Color.scala` — math value types. **Components are 32-bit
  float even in float_64** (Vector2 = 2×CFloat = 8 bytes). `writeType`/`readType`
  are `private[godot]` (used by Ptrcall). Remaining math types are TODO codegen.
- `GArray.scala`, `Dictionary.scala` — containers via builtin-method ptrcall.
  Method hashes hardcoded from API (e.g. Array.size=3173160232).
- `BuiltinMethods.scala` — caches builtin-method ptrcall pointers.

## Gotcha
No `ToVariant[String]` (String is a handle, not a primitive). Build a
String-typed Variant via `VariantConstructors.fromType(STRING)(dest, gstr.ptr)`.
