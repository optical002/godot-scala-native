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
  (`com.github.optical002.godot-scala-native:scala-native-gdextension`, JitPack —
  see Publishing below).
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
  `sbt igen/<task>`. `ThisBuild / version` is
  `sys.env.getOrElse("VERSION", "0.1.6")` — the fallback is the NEXT
  release version in plain semver, used by `publishLocal` (it doesn't exist on
  JitPack until tagged; local ivy wins over JitPack); JitPack sets `VERSION` to
  the requested tag when building a release.
- **`harness`** — its **own** sbt build at `harness-scala/` (flat root project,
  sources at `harness-scala/src/main/scala`). The **game project**, base package
  **`game`**. Holds **only** `game` classes. It carries no build machinery:
  `build.sbt` is `enablePlugins(GodotScalaNativePlugin)` + name/scalaVersion +
  the **mandatory** `godotProjectDir` (+ optional `godotEntrySelfTest`);
  `project/plugins.sbt` is one
  `addSbtPlugin("com.github.optical002.godot-scala-native" % "sbt-godot-scala-native" % "<v>")`.
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
4. **obj** (`internal/engine/`, `GodotScriptClass`, `ClassMeta`, `ClassTags`) —
   plain wrapper types (there is **no** `Gd[T]` smart pointer), casts, refcount.
   `Gd` survives only as a facade object in `gdext.api`. See [layer4-obj](layer4-obj.md).
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
  plugin under `0.1.6`) **before** building harness.
- `cd harness-scala && sbt godotBuild` → (task from the plugin) runs the
  auto-registration source generator, compiles (linking the published binding),
  native-links, atomically swaps the `.so` into `godot/.scala/`, **generates the
  `godot/scala.gdextension` manifest** (also available standalone as
  `godotManifest`), **and installs the GDScript editor addon** into
  `godot/addons/godot_scala/` if absent. The addon source lives in the plugin jar
  (`modules/sbt-godot-scala-native/src/main/resources/godot-addon/{plugin.cfg,
  scala_build.gd,icon.svg,godot.svg}`); on install, `scala_build.gd`'s
  `@SBT_PROJECT_DIR@` is templated to the godot→sbt relative path, and it's
  enabled in `project.godot` when that file has no `[editor_plugins]` section
  yet. It's install-if-absent (per the addon dir), so user edits are never
  clobbered — delete the dir to reinstall; **when editing the addon, edit BOTH
  the template resource and the installed copy** (they differ only in
  `SBT_PROJECT_DIR`). The addon runs `sbt --client "~godotBuild"` and shows in
  the editor: a top-bar status group `[sbt status · scala logo · hot-reload
  status · godot logo]` (sbt spinner cyan, godot-reload spinner Godot-blue) and
  two bottom docks built from a shared `LogDock` inner class — "SBT Output"
  (sbt log, tailed from `res://.scala/sbt.log`) and "Scala Hot Reload" (verbose
  reload pipeline: swap/lib/reload.stamp info, `EditorFileSystem` signals +
  scan %, `GDExtensionManager.extensions_reloaded` timing, plus hot-reload-
  related lines from the editor's print stream captured via a custom `Logger`
  + `OS.add_logger` — **editor sessions do NOT write `user://logs/godot.log`**
  (only game runs do; the addon tails that file too as a secondary source).
  Godot core's reload messages are `print_verbose`; `verbose_stdout` is
  deliberately NOT enabled (it floods the editor's Output panel), and the
  addon itself never `print()`s — all its messaging stays inside its two
  docks. The addon DRIVES the reload after each swap (see
  [conventions](conventions.md) "Editor hot-reload" for the mechanism and its
  gotchas: focus-in-only reloads, reload_extension + emit signal, sbt.log
  truncated synchronously at spawn, `_classify` checks independent — one poll
  chunk can carry swap + success + Monitoring together, trigger only on
  `[godot] swapped`). E2E test addon: `godot/addons/hot_reload_verify/`
  (`godot --headless -e -- verify-hot-reload`). The manifest is
  GENERATED — don't hand-edit; tune it via the
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

## Publishing (JitPack)
Both artifacts (`gdext` = a normal Scala Native NIR jar, cross-suffix
`_native0.5_3`, no per-OS binaries — consumers link native code at their own
build via `%%%`; and the sbt plugin, `_2.12_1.0` Maven-style layout via
`sbtPluginPublishLegacyMavenStyle := false`) are served by **JitPack** under
group **`com.github.optical002.godot-scala-native`**. `organization` in
`build.sbt` is set to exactly that group so `publishLocal` yields the same
coordinates (dev version `0.1.6`; last release tag `0.1.5`).
Release flow: push a **plain semver tag** (`0.1.1`, no `v` prefix — the tag IS
the version) → JitPack builds on demand via repo-root `jitpack.yml`
(`cd language-binding-scala && sbt gdext/publishM2 sbtGodotPlugin/publishM2`;
JitPack exports `VERSION=<tag>`, which `ThisBuild / version` reads). No CI
workflow, no signing, no secrets. Trigger/inspect a build:
`https://jitpack.io/#optical002/godot-scala-native` or
`curl https://jitpack.io/api/builds/com.github.optical002/godot-scala-native/<tag>`.
Consumers add `resolvers += "jitpack" at "https://jitpack.io"` in
project/plugins.sbt for the plugin; the plugin injects the same resolver into
the project for `gdext`. `language-binding-scala/.sbtopts` sets `-mem 6144`
(scaladoc over the large `codegen/` OOMs at default heap).

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
