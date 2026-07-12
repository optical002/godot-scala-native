# Changelog

Covers both published artifacts of this repo — the language binding
(`scala-native-gdextension`) and the sbt plugin (`sbt-godot-scala-native`);
they are always released together under one version. Versions are plain-semver
git tags built on demand by [JitPack](https://jitpack.io/#optical002/godot-scala-native)
under the group `com.github.optical002.godot-scala-native`. The topmost
*Unreleased* section is the current dev version — a `-SNAPSHOT` (what
`sbt publishLocal` produces); the plain release version appears on JitPack only
once its tag is pushed.

## [0.1.3-SNAPSHOT] — Unreleased

_No changes yet._

## [0.1.2] — 2026-07-12

### Added
- The sbt watch (`~godotBuild`) now also fires on the prefab/id config inputs:
  the id-bearing asset dirs (`godotIdConfs` × `godotConfigDir`) and
  `godotPrefabsTres` are declared as `genConfig / fileInputs`, so adding or
  removing an asset `.conf` (or editing `prefabs.tres`) regenerates
  `config/generated/*` without touching a Scala source. Content-only edits of
  existing asset confs are deliberately ignored (`watchOnFileInputEvent`) —
  the running game hot-reloads those, no relink/.so swap needed.

### Changed
- Boehm GC is now discovered from the build host's standard toolchain search
  paths instead of two hard-coded absolute paths. The plugin's `nativeConfig`
  no longer injects `-I`/`-L`/`-lgc`/`-rpath` for a specific install prefix; it
  only sets `GC.boehm` (Scala Native emits `-lgc` itself). Boehm must be
  installed on the build host and reachable by clang/ld — via system packages,
  or by exporting `LIBRARY_PATH`/`C_INCLUDE_PATH` (or `pkg-config`) to point at
  a non-standard prefix (e.g. a Nix store path). Fixes the build being pinned to
  one machine's Nix generation.
- Dev-version scheme: the local fallback version is now the plain next release
  (`0.1.2`, no `-SNAPSHOT`) — `publishLocal` and the eventual JitPack release
  share the exact coordinates, and the version doesn't exist on JitPack until
  tagged.

## [0.1.1] — 2026-07-06

First JitPack release.

### Changed
- **Publishing moved from Maven Central (Sonatype) to JitPack**: group is now
  `com.github.optical002.godot-scala-native` (was `io.github.optical002`);
  releases are cut by pushing a plain semver tag (no `v` prefix, no CI
  workflow, no signing) which JitPack builds via the repo-root `jitpack.yml`.
- The plugin injects the JitPack resolver into consumer projects alongside the
  matching binding dependency, so a consumer's `project/plugins.sbt` needs only
  the resolver + one `addSbtPlugin` line.
- API surface rework vs `0.1.0`: everyday helpers live in `gdext.api`
  (`Gd.print` replaces `GodotPrint`, `Tscn`/`Tres` re-exported); `Gd[T]` smart
  pointer and `GodotClass[T]` typeclass removed — game classes extend engine
  classes directly.

### Added
- Exported-property support for `var` constructor params (export-comp
  ctor-params), comp-enum registration, editor verify addons
  (`comp_enum_verify`, `hot_reload_verify`), Godot logo asset in the editor
  addon.
- `Arr`: `iterator`, `foreach`, `isEmpty`; `Vector3`: scalar `*`/`/`, unary
  `-`, `dot`, `cross`, `distance`, `rotatedY`, `moveToward`.

## [0.1.0]

Historical pre-JitPack development under the `io.github.optical002` group
(Maven Central wiring via sbt-ci-release; superseded by the JitPack flow).
