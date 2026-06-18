# Layer 4 — object model (`engine/Gd.scala`, `GodotClass`, `ClassTags`)

For holding/managing engine objects you fetch or construct.

- **`Gd[T]`** — smart pointer over `GDExtensionObjectPtr` + `GodotClass[T]`
  evidence. `Gd.newInstance[T]` (constructs + `init_ref` for RefCounted),
  `.get` (typed wrapper via `cls.wrap`), `.instanceId`, `.cast[U]`, `.free`,
  `.unref`.
- **`GodotClass[T]`** — typeclass: `className`, `isRefCounted`, `wrap`/`unwrap`.
  One `given` is generated per engine class (Layer 3).
- **`ClassTags.scala`** — caches `classdb_get_class_tag(name)` for `object_cast_to`.

## Two lifetime regimes
- Manually-managed (Object/Node subtree): `free()` → `object_destroy`. Nodes in
  the scene tree are owned by their parent — don't free those.
- RefCounted (Resource subtree): `newInstance` calls `init_ref`; `unref()` drops.
  `free()` is a deliberate no-op on RefCounted. Scala has no deterministic
  destructor → release is explicit (a Cleaner hook is a future option).

## Casting
`gd.cast[U]` uses `object_cast_to(handle, ClassTags.tag(U))`; returns a null
`Gd[U]` if not actually a `U` (real engine type check, not a Scala cast).

## Variant marshalling for object refs
`object Gd` and `object Tres` (in `ExportWrappers.scala`) each provide
`given ToVariant`/`FromVariant` over `ObjectVariant.write/read` (null handle ⇄
empty/NIL OBJECT Variant; `from` needs `GodotClass[T]`). This is what lets a
`Dict[K,V]` hold object values, e.g. `Dict[Int, Tres[PlayerStats]]` (the Dict
givens require `ToVariant`/`FromVariant` for K and V). The `@gdexport` ref path
itself still goes through `RefLeaf`/`ObjectVariant`, not these givens.
