# CLAUDE.md

Scala Native language binding for Godot (a GDExtension), targeting gdext-level
sophistication. Scala 3.8.1 / Scala Native 0.5.10 / Godot 4.6.1.

## Workspace

The repo root is a **workspace, not an sbt build**. Three siblings:

- `language-binding-scala/` — the reusable binding library. Three sbt projects:
  `gdext` (the binding, the only published library artifact), `igen` (code
  generators), `sbtGodotPlugin` (the `sbt-godot-scala-native` plugin).
- `harness-scala/` — a separate sbt build playing "someone's game project". Holds
  **only** `game` package classes and carries no build machinery: one
  `addSbtPlugin` line plus `enablePlugins(GodotScalaNativePlugin)`.
- `godot/` — the Godot project the built `.so` is loaded into.

Harness consumes the binding and plugin as **published artifacts** — there is no
source `ProjectRef`. Dev version `0.1.3-SNAPSHOT`, group
`com.github.optical002.godot-scala-native`.

## Build & verify

```
cd language-binding-scala && sbt publishLocal   # after ANY change here
cd harness-scala          && sbt godotBuild     # generate, compile, link, swap .so
cd godot && godot --headless --path . --quit-after 5
```

Skipping `publishLocal` makes harness link the previous jar — a confusing runtime
failure, not a build error. A `PreToolUse` hook warns when this is about to happen.

Codegen: `cd language-binding-scala && sbt igen/regenerate`.

**A clean `sbt` compile is not proof that a change works.** Only a clean headless
run is. Run it yourself and read the output — exit 0 is not enough. Failures show
up as `Cannot get class 'X'`, `Can't open dynamic library`, `ERROR:`, or a missing
self-test banner.

## Invariants

- **Generated code is never hand-edited** — `gdext/classes/` (~1025 files),
  `gdext/internal/ffi/`, `godot/scala.gdextension`, `GeneratedRegistrations`/
  `GeneratedEntry`, and the `game/harness/` files. Change the generator and
  regenerate. A hook blocks the first three.
- **`publishLocal` precedes `godotBuild`** after any binding, generator, or
  plugin change.
- **`CHANGELOG.md` gets an entry** under the topmost *Unreleased* section for
  every binding or plugin change. A hook reminds you.
- **Public surface** is `gdext.api`, `gdext.classes`, `gdext.builtin`,
  `gdext.annotations`; everything else is `gdext.internal.*`, much of it
  `private[gdext]` and compiler-enforced.
- **Releases** are plain semver tags (`0.1.2`, no `v` prefix) built by JitPack
  via `jitpack.yml`. Bump the fallback version everywhere after tagging.

## Where the knowledge lives

Two skills carry the detail; they load on demand, so don't duplicate them here.

- **godot-binding-dev** — any work on the binding, generators, plugin, or
  registration. Indexes per-layer reference docs (FFI, builtin/Variant, engine
  classes, object model, registration macros, conventions) under its
  `references/`.
- **godot-binding-verify** — proving a change works: which verify script to run
  and what counts as failure.

When you change the project's structure or discover a new gotcha, update the
matching `references/*.md` in `godot-binding-dev` — that is how a from-scratch
session stays accurate.

## Style

scalafmt for formatting. No emojis. Don't add comments that restate the code.
Match the terse-bullet voice used in the reference docs.
