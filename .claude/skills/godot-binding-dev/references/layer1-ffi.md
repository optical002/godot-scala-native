# Layer 1 — raw GDExtension FFI

Generated from `gdextension/gdextension_interface.json` by
`igen/InterfaceGenerator.scala`. Output (do not hand-edit; `sbt igen/regenerate`):
`gdext/.../internal/ffi/{types,interface}/` (package `gdext.internal.ffi.*`).
FFI support types (`CStructN`, `Tags`, `ConstPtr`) are `gdext.internal.types`.

## What it generates
- `types/` — `Enum`, `Handle` (all `Ptr[Byte]`), `Alias`, `Struct` (opaque
  `CStructN` + `at_field` accessors), `Function` (CFuncPtr typedefs). **Public**
  (the `gdext.api` entry aliases reference a few of these).
- `interface/Interface.scala` — the `Interface` class with a `var` per ~140
  GDExtension functions, loaded by `Interface.load(getProcAddr)`. **Emitted
  `private[gdext]`** (the generator prefixes it), so FFI methods are unreachable
  outside the library.

## Key facts
- Function pointers resolved via `CFuncPtr.fromPtr[T](getProcAddr(...))` — NOT
  `asInstanceOf` (that throws at runtime).
- Reached globally via `Godot.interface` (`Godot` is `private[gdext]`; set in
  `GodotEngine.run`).
- Large structs (>22 fields) use `types/CStruct23..26` + `Tags.scala` (Scala
  Native caps `CStruct` at 22).

## Generator
`InterfaceGenerator.run(jsonPath, codeGenPath)` from `Main.scala`. Maps C types
→ Scala Native types in `parseTypeName`. Splits `Interface` loading into batches
(UTF-8 literal size limit).
