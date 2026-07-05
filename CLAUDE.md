# CLAUDE.md

Scala Native language binding for Godot (a GDExtension), targeting gdext-level
sophistication. Scala 3.8.1 / Scala Native 0.5.10 / Godot 4.6.1.

This repo is a **workspace** of three siblings:
- `language-binding-scala/` — the reusable binding library (sbt build with the
  `igen`, `gdext`, and `sbtGodotPlugin` projects). What downstream game projects
  depend on; also ships the `sbt-godot-scala-native` plugin.
- `harness-scala/` — a separate sbt build that plays "someone's game project":
  it holds **only** the `game` package classes. It carries no build machinery:
  it applies the published `GodotScalaNativePlugin` (one `addSbtPlugin` line) and
  consumes the published `gdext` artifact — **no source `ProjectRef`**.
- `godot/` — the Godot project the built `.so` is loaded into.

## Memories — read these first

Detailed, compact notes on each structural part live in
[`.claude/memories/`](.claude/memories/index.md). **Start at the
[index](.claude/memories/index.md)** and read only the memory relevant to your
task — they tell you which files matter and the gotchas to respect.

Quick map:
- [architecture](.claude/memories/index.md) — modules, layers, build/run flow
- layer1–5 — FFI, builtin, engine classes, object model (`ClassMeta`/`Gd`
  facade; no `Gd[T]` smart pointer), registration
- conventions — native/FFI gotchas, hot-reload, logging, codegen rules

## Golden rules

- **`codegen/` is generated** — never hand-edit. Change the generator in
  `language-binding-scala/modules/interface-generator` and run
  `cd language-binding-scala && sbt igen/regenerate`.
- **Build the game lib**: `cd harness-scala && sbt godotBuild` (atomically swaps
  the `.so` into `godot/lib/`; task provided by the plugin). Verify with
  `cd godot && godot --headless --path . --quit-after N` or `--script verify.gd`.
- **Co-development loop (publishLocal)**: harness consumes the binding + plugin
  as **published artifacts**, so after any change in `language-binding-scala`
  (binding code, the generator, or the plugin), run
  `cd language-binding-scala && sbt publishLocal` **before** `sbt godotBuild` in
  harness — otherwise harness links the stale artifact. Both publish under
  `com.github.optical002.godot-scala-native % <module> % 0.1.1-SNAPSHOT` (pinned
  in `harness-scala/project/plugins.sbt`). Releases go through **JitPack**: push
  a plain semver tag (e.g. `0.1.1`) and JitPack builds via `jitpack.yml` — same
  group, tag as version.
- **After changing how the language binding works, actually test it.** Build the
  lib and open the godot project in headless mode yourself (`cd godot && godot
  --headless --path . --quit-after N`), then read the output and check for errors —
  especially `Cannot get class 'X'`, missing-library, or registration failures.
  A clean `sbt` compile is **not** proof it works; only a clean headless run is.
- **Respect [conventions.md](.claude/memories/conventions.md)** — struct writes,
  concrete `sizeof`, no-inline `Ptrcall`, exception boundary, reload safety.

## Keeping memories current

**After changing the project's structure, update the memories.** This includes:
adding/removing/renaming a module or package, moving the entry point, changing a
layer's public shape, altering the build/codegen flow, or discovering a new
gotcha. Edit the relevant file in `.claude/memories/` (and
`.claude/memories/index.md` if a memory is added/removed) so a from-scratch
session retrieves accurate information. Keep them compact — core parts only.
