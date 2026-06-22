# Architecture

A Scala Native language binding for Godot (a GDExtension), targeting gdext-level
sophistication. Godot 4.6.1 runtime; `gdextension/extension_api.json` is the
dumped API.

## Workspace layout (two sbt builds + a Godot project)
The repo root is a workspace, **not** an sbt build. Top level:
`language-binding-scala/`, `harness-scala/`, `godot/` (+ docs, `.claude/`).

## Modules (sbt, Scala 3.8.1, Scala Native 0.5.10)
- **`gdext`** — `language-binding-scala/modules/scala-native-gdextension`. The
  binding **library**. No exported entry symbol, not the `.so` target. Package
  root `gdext`. **The only published artifact**
  (`io.github.optical002:scala-native-gdextension`, Maven Central — see
  Publishing below).
- **`igen`** — `language-binding-scala/modules/interface-generator`. Code
  generators (run via `sbt igen/regenerate` from `language-binding-scala/`).
  `publish / skip := true`.
- **`root`** — explicit aggregating project (`in file(".")`,
  `name := "godot-scala-native"`) in `language-binding-scala/build.sbt`,
  aggregates `igen` + `gdext`, `publish / skip := true`. Exists only to group
  the modules; do NOT add a `Global / onLoad` default-project override (breaks
  the harness's source `ProjectRef` load). Invoke tasks as `sbt gdext/<task>` /
  `sbt igen/<task>`.
- **`harness`** — its **own** sbt build at `harness-scala/` (flat root project,
  sources at `harness-scala/src/main/scala`). The **game project**, base package
  **`game`**. Owns `@exported("godot_scala_init")` and IS the GDExtension dynamic
  library. Depends on the binding via a source
  `ProjectRef(file("../language-binding-scala"), "gdext")` so the two co-develop
  without a publish round-trip; a pure consumer would instead use
  `"io.github.optical002" %%% "scala-native-gdextension" % "<v>"`.

## Layers (bottom→top) — see per-layer memories
1. **FFI** (`codegen/gdextensioninterface`, `Interface`) — raw GDExtension C API.
2. **builtin** (`builtin/`) — Variant + GString/StringName/Vector2/Array/Dictionary.
3. **engine** (`codegen/engine`, generated) — typed engine classes as
   `abstract class Node2D extends CanvasItem`.
4. **obj** (`engine/Gd.scala`, `GodotClass`, `ClassTags`) — `Gd[T]`, casts, refcount.
5. **register** (`register/`) — register user `game` classes via macros/annotations.

## Bootstrap flow
The `@exported` entry symbol → `GodotEngine.run(..., register = () =>
GeneratedRegistrations.registerAll())`. The entry point is **fully generated**:
`game.GeneratedEntry` is emitted by `RegistrationScan` alongside
`GeneratedRegistrations`, and its exported symbol comes from the `entrySymbol`
build setting in `harness-scala/build.sbt` (must equal `entry_symbol` in
`godot/godot_scala.gdextension`). No hand-written entry file exists. `GodotEngine`
(in gdext) loads the interface, fills the init struct, runs self-tests once, and
on SCENE init runs the register callback. `Godot` object holds the global
interface table + library handle.

## Build / run
- `cd harness-scala && sbt build` → runs the auto-registration source generator,
  compiles (incl. the binding via the source `ProjectRef`), native-links,
  atomically swaps the `.so` into `godot/lib/libscala-native-gdextension.so`.
- Auto-registration: `harness`'s `Compile / sourceGenerators` runs
  `harness-scala/project/RegistrationScan.scala` (scalameta) every compile,
  scanning `game` sources and emitting `game.GeneratedRegistrations` (managed,
  under `target/`). Distinct from `igen/regenerate` (which generates the bindings
  from JSON). See [layer5-register](layer5-register.md).
- `cd language-binding-scala && sbt igen/regenerate` → regenerates all codegen:
  FFI, engine classes, AND the validation harness (see below).
- Verify: `cd godot && godot --headless --path . --quit-after N` (scene) or
  `--script verify.gd` (GDScript checks). Binding logs to file `godot-init`;
  game logs to Godot Output. See `BUILD.md`, `godot/godot_scala.gdextension`.

## Publishing (gdext → Maven Central)
`gdext` publishes to the Sonatype **Central Portal** as a normal Scala Native
library (NIR JAR; cross-suffix `_native0.5_3` — no per-OS binaries; consumers
link native code at their own build via `%%%`). Wired with **`sbt-ci-release`**
(plugins.sbt): version from git tags via sbt-dynver (no hardcoded `version`;
untagged → `-SNAPSHOT`). POM metadata (org `io.github.optical002`, MIT, scm,
developers) is set in `inThisBuild(...)` in `build.sbt`;
`sonatypeCredentialHost := xerial.sbt.Sonatype.sonatypeCentralHost` targets the
new portal. `language-binding-scala/.sbtopts` sets `-mem 6144` because scaladoc
over the large `codegen/` sources OOMs at the default heap (the javadoc jar is
required by Central). Release: push a `vX.Y.Z` tag → `.github/workflows/release.yml`
runs `sbt ci-release` (needs secrets `PGP_SECRET`, `PGP_PASSPHRASE`,
`SONATYPE_USERNAME`, `SONATYPE_PASSWORD`). Verify packaging locally with
`sbt gdext/publishM2` (or `publishLocalSigned` once a GPG key exists). One-time
manual setup (namespace verification, GPG key, portal token, GH secrets) is in
the root README.

## Node validation harness (igen `HarnessClassGenerator`)
Proves every base node type is generated + subclassable + registerable.
`igen/regenerate` also emits, for each of the ~238 instantiable non-editor
Node-derived classes:
- `harness-scala/src/main/scala/game/harness/HarnessXxx.scala` — empty
  `final class HarnessNode2D extends ...engine.Node2D` (GENERATED, scanned by
  RegistrationScan like any game class, so each auto-registers).
- `godot/harness_manifest.json` — `[{name,base}]`, the data the validator reads.
- `godot/node_harness.tscn` — one node of every Harness type.
Validate: `cd godot && godot --headless --path . --script node_harness_verify.gd`
→ checks class_exists/parent/instantiate/get_class/is_class for all 238 + scene
load; prints `HARNESS VALIDATION: PASS …` and exits 0/1.

## Status
Phases 0–5 done and verified (41 self-tests + GDScript checks pass). Engine
codegen now covers ALL ~1023 classes; all 238 instantiable node types validated
from Godot (node_harness_verify.gd). Remaining: best-effort method coverage
(NodePath/typed-arrays/Variant/packed arrays still skipped), release build,
GC×threads, docs. Publishing wired (gdext → Maven Central, release CI); only
manual portal/GPG setup + a `vX.Y.Z` tag remain to cut a release.
