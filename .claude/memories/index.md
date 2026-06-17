# Memory index

Each file documents one structural part of the Scala Native ↔ Godot binding.
Read only the ones relevant to your task.

| Memory | Read when you need to… |
|--------|------------------------|
| [architecture.md](architecture.md) | understand the layered design, modules, and the build/run flow |
| [layer1-ffi.md](layer1-ffi.md) | touch the raw GDExtension FFI / interface loading / codegen of `gdextension_interface.json` |
| [layer2-builtin.md](layer2-builtin.md) | work on Variant, GString/StringName, math types, Array/Dictionary marshalling |
| [layer3-engine.md](layer3-engine.md) | work on generated engine classes (`Node2D` etc.) or the engine-class generator |
| [layer4-obj.md](layer4-obj.md) | work on `Gd[T]`, casting, ref-counting, instance lifetime |
| [layer5-register.md](layer5-register.md) | work on registering user classes: macros, annotations, methods/properties/signals |
| [conventions.md](conventions.md) | recall hard-won gotchas (struct writes, sizeof, reload, DCE, logging split) |
