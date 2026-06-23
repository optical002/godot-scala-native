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
- **`sbtGodotPlugin`** — `language-binding-scala/modules/sbt-godot-scala-native`.
  A **pure-JVM sbt plugin** (Scala 2.12, `enablePlugins(SbtPlugin)`) — NOT a
  Scala Native module and does NOT depend on `gdext`. Published alongside `gdext`
  (same version). Ships `RegistrationScan` + the `GodotScalaNativePlugin`
  AutoPlugin (all the build machinery a consumer used to hand-carry); brings
  `sbt-scala-native` transitively. See [layer5-register](layer5-register.md).
- **`root`** — explicit aggregating project (`in file(".")`,
  `name := "godot-scala-native"`) in `language-binding-scala/build.sbt`,
  aggregates `igen` + `gdext` + `sbtGodotPlugin`, `publish / skip := true`.
  Exists only to group the modules. Invoke tasks as `sbt gdext/<task>` /
  `sbt igen/<task>`. `ThisBuild / version` is pinned to `0.1.0-SNAPSHOT` (stable,
  pinnable for `publishLocal`; overrides dynver — guard on a git tag when cutting
  a real release).
- **`harness`** — its **own** sbt build at `harness-scala/` (flat root project,
  sources at `harness-scala/src/main/scala`). The **game project**, base package
  **`game`**. Holds **only** `game` classes. It carries no build machinery:
  `build.sbt` is `enablePlugins(GodotScalaNativePlugin)` + name/scalaVersion +
  the **mandatory** `godotProjectDir` (+ optional `godotEntrySelfTest`);
  `project/plugins.sbt` is one
  `addSbtPlugin("io.github.optical002" % "sbt-godot-scala-native" % "<v>")`.
  The plugin adds the published `gdext` dependency, `nativeConfig`, the
  auto-registration source generator, and the `godotBuild` task. **No source
  `ProjectRef`** — co-development uses `sbt publishLocal` (see Build / run).

## Layers (bottom→top) — see per-layer memories
1. **FFI** (`internal/ffi`, `Interface`) — raw GDExtension C API. **Internal**:
   `Interface` is `private[gdext]`; the FFI *types* stay public (needed by the
   entry aliases) but live under `gdext.internal.ffi`.
2. **builtin** (`builtin/`) — Variant + GString/StringName/Vector2/Array/Dictionary.
3. **engine** (`classes/`, generated) — typed engine classes as
   `abstract class Node2D extends CanvasItem`, package **`gdext.classes`**.
4. **obj** (`internal/engine/Gd.scala`, `GodotClass`, `ClassTags`) — `Gd[T]`, casts, refcount.
5. **register** (`internal/register/`) — register user `game` classes via macros/annotations.

## Package layout — public surface vs internal
Consumer (game) code imports ONLY these:
- **`gdext.classes`** — generated engine classes (was `gdext.codegen.engine`).
- **`gdext.builtin`** — builtin types.
- **`gdext.annotations`** — the registration annotations (`@func`/`@gdexport`/
  `@signal`/… — was in `gdext.register`).
- **`gdext.api`** (object `api` in package `gdext`) — everyday helpers re-exported
  from internal homes: `Gd, Tres, Tscn, Required, GodotPrint, ExportHint,
  emitSignal`, plus the generated-glue surface `Register`, `GodotEntry` and the
  entry FFI type aliases `Entry{GetProcAddress,ClassLibraryPtr,Initialization}`.

Internal (all under `gdext.internal.*`, so `import gdext.` shows only `api`,
`classes`, `builtin`, `annotations`, `internal`): `gdext.internal.ffi` (was
`gdext.codegen.gdextensioninterface`), `gdext.internal.types` (was `gdext.types`),
`gdext.internal.engine` (substrate, was `gdext.engine`), `gdext.internal.register`
(machinery, was `gdext.register`). **`private[gdext]` (compiler-enforced, even
from the published jar): `Godot`, `GodotEngine`, `Log`, `FileLogger`, `GodotPrint`,
and the FFI `Interface`** — so no top-level `gdext.*` object is visible and no FFI
method is reachable outside the library (use `gdext.api.GodotPrint`). Things that
MUST stay public because they appear in public signatures or macro-emitted calls —
`Gd`/`GodotObject` (in `gdext.internal.engine`), the registration builders
`ClassRegistration`/`MethodRegistration`/… (in `gdext.internal.register`), the FFI
*types* — are public but live under `gdext.internal.*` (off the everyday surface).
The sbt plugin's own package is **`godotscala`** (not `gdext.*`), so it never
appears under `gdext.` either.

## Bootstrap flow
The `@exported` entry symbol → `GodotEngine.run(..., register = () =>
GeneratedRegistrations.registerAll())`. The entry point is **fully generated**:
`game.GeneratedEntry` is emitted by `RegistrationScan` alongside
`GeneratedRegistrations`, and its exported symbol is fixed in
`RegistrationScan.EntrySymbol` (`"godot_scala_init"` — not a build setting; must
equal `entry_symbol` in `godot/scala.gdextension`). No hand-written entry
file exists. `GodotEngine`
(in gdext) loads the interface, fills the init struct, runs self-tests once, and
on SCENE init runs the register callback. `Godot` object holds the global
interface table + library handle.

## Build / run
- **publishLocal first**: harness consumes the binding + plugin as published
  artifacts. After any change in `language-binding-scala`,
  `cd language-binding-scala && sbt publishLocal` (publishes `gdext` + the sbt
  plugin under `0.1.0-SNAPSHOT`) **before** building harness.
- `cd harness-scala && sbt godotBuild` → (task from the plugin) runs the
  auto-registration source generator, compiles (linking the published binding),
  native-links, atomically swaps the `.so` into
  `godot/lib/libscala-native-gdextension.so`, **and generates the
  `godot/scala.gdextension` manifest** (also available standalone as
  `godotManifest`). The manifest is GENERATED — don't hand-edit; tune it via the
  plugin settings `godotProjectDir` (Godot root — **mandatory, no default**;
  tasks fail with a clear message if unset), `godotLibName` (library base name),
  `godotManifestName`, `godotCompatibilityMinimum`. `godotEntrySelfTest` is
  optional (default false).
- Auto-registration: `GodotScalaNativePlugin` adds a `Compile / sourceGenerators`
  that runs `RegistrationScan` (scalameta, shipped in the plugin) every compile,
  scanning `game` sources and emitting `game.GeneratedRegistrations` (managed,
  under `target/`). Distinct from `igen/regenerate` (which generates the bindings
  from JSON). See [layer5-register](layer5-register.md).
- `cd language-binding-scala && sbt igen/regenerate` → regenerates all codegen:
  FFI, engine classes, AND the validation harness (see below).
- Verify: `cd godot && godot --headless --path . --quit-after N` (scene) or
  `--script verify.gd` (GDScript checks). Binding logs to file `.scala/log`;
  game logs to Godot Output. See `BUILD.md`, `godot/scala.gdextension`.

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
