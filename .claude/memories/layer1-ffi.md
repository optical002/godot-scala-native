# Layer 1 — raw GDExtension FFI

Generated from `gdextension/gdextension_interface.json` by
`igen/InterfaceGenerator.scala`. Output (do not hand-edit; `sbt igen/regenerate`):
`gdext/.../codegen/gdextensioninterface/{types,interface}/`.

## What it generates
- `types/` — `Enum`, `Handle` (all `Ptr[Byte]`), `Alias`, `Struct` (opaque
  `CStructN` + `at_field` accessors), `Function` (CFuncPtr typedefs).
- `interface/Interface.scala` — the `Interface` class with a `var` per ~140
  GDExtension functions, loaded by `Interface.load(getProcAddr)`.

## Key facts
- Function pointers resolved via `CFuncPtr.fromPtr[T](getProcAddr(...))` — NOT
  `asInstanceOf` (that throws at runtime).
- Reached globally via `Godot.interface` (set in `GodotEngine.run`).
- Large structs (>22 fields) use `types/CStruct23..26` + `Tags.scala` (Scala
  Native caps `CStruct` at 22).

## Generator
`InterfaceGenerator.run(jsonPath, codeGenPath)` from `Main.scala`. Maps C types
→ Scala Native types in `parseTypeName`. Splits `Interface` loading into batches
(UTF-8 literal size limit).
