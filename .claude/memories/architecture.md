# Architecture

A Scala Native language binding for Godot (a GDExtension), targeting gdext-level
sophistication. Godot 4.6.1 runtime; `gdextension/extension_api.json` is the
dumped API.

## Modules (sbt, Scala 3.8.1, Scala Native 0.5.10)
- **`gdext`** — `modules/scala-native-gdextension`. The binding **library**.
  No exported entry symbol, not the `.so` target. Package root
  `io.github.optical002.godot`.
- **`harness`** — `modules/harness`. The **game project** (`dependsOn(gdext)`),
  base package **`game`**. Owns `@exported("godot_scala_init")` and IS the
  GDExtension dynamic library. Default sbt project.
- **`igen`** — `modules/interface-generator`. Code generators (run via
  `sbt igen/regenerate`).

## Layers (bottom→top) — see per-layer memories
1. **FFI** (`codegen/gdextensioninterface`, `Interface`) — raw GDExtension C API.
2. **builtin** (`builtin/`) — Variant + GString/StringName/Vector2/Array/Dictionary.
3. **engine** (`codegen/engine`, generated) — typed engine classes as
   `abstract class Node2D extends CanvasItem`.
4. **obj** (`engine/Gd.scala`, `GodotClass`, `ClassTags`) — `Gd[T]`, casts, refcount.
5. **register** (`register/`) — register user `game` classes via macros/annotations.

## Bootstrap flow
`game.GameEntry.godot_scala_init` → `GodotEngine.run(..., register = () =>
Register.auto[Player]())`. `GodotEngine` (in gdext) loads the interface, fills
the init struct, runs self-tests once, and on SCENE init runs the register
callback. `Godot` object holds the global interface table + library handle.

## Build / run
- `sbt harness/build` → compiles, native-links, atomically swaps the `.so` into
  `demo/lib/libscala-native-gdextension.so`.
- `sbt igen/regenerate` → regenerates both codegen passes.
- Verify: `cd demo && godot --headless --path . --quit-after N` (scene) or
  `--script verify.gd` (GDScript checks). Binding logs to file `godot-init`;
  game logs to Godot Output. See `BUILD.md`, `demo/godot_scala.gdextension`.

## Status
Phases 0–5 done and verified (38 self-tests + GDScript checks pass). Phase 6
(release build, GC×threads, full codegen, CI, docs) not started.
