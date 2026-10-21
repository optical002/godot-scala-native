# Changelog

Covers both published artifacts of this repo — the language binding
(`scala-native-gdextension`) and the sbt plugin (`sbt-godot-scala-native`);
they are always released together under one version. Versions are plain-semver
git tags built on demand by [JitPack](https://jitpack.io/#optical002/godot-scala-native)
under the group `com.github.optical002.godot-scala-native`. Versions are plain
semver — the topmost *Unreleased* section is the version being worked toward,
which `sbt publishLocal` produces locally and which appears on JitPack only once
its tag is pushed.

## [0.1.9] — 2026-10-21

Memory and performance release. The Scala heap stays untouched on the engine
call path, `RefCounted` lifetimes are deterministic and leak-checked, and the
math builtins are a complete native port of Godot's `core/math`. Numbers are in
`docs/guides/performance.md`, measured by `godot/memory_verify.gd`.

### Performance
- Engine method calls allocate nothing on the Scala heap and run 20-60x faster
  (`setPosition`: 832 B / 1982 ns → 0 B / 33 ns; `getChild`: 1072 B / 2467 ns →
  0 B / 60 ns).
  - Each generated method caches its `MethodBind` in a companion field instead of
    building a string map key per call.
  - `Ptrcall` dispatchers are `inline` and specialized per argument type at
    compile time (no typeclasses, no boxing).
  - Strings convert as UTF-16 through a stack buffer.
  - Returned `StringName`s are interned, so returning one allocates nothing.
- GDScript → Scala `@func` calls: 2704 B / 5353 ns → 0 B / 100 ns. `_process`
  dispatch: 130 B per node per frame → 0 B. The per-call virtuals and the method
  trampoline are `@exported` functions (address via
  `resources/scala-native/gdext_trampolines.c`) instead of lambda `CFuncPtr`s,
  which box every argument. Primitive getters and setters are specialized at
  compile time.
- `emitSignal`, `Input.singleton` (and every singleton), `getTree` allocate
  nothing. Singletons are cached.
- `Log.trace` builds its message only when tracing is on; registry lookups use
  token-indexed tables and primitive maps instead of boxed `Long` keys; builtin
  constructor and method lookups are cached without per-call keys or closures.

### Added
- `godotNativeMode` plugin setting: `releaseFast` (default), `releaseFull`,
  `debug`. Projects previously always built in `debug` (no optimizer).
- `Gd.scoped { ... }` releases every `RefCounted` reference adopted inside it;
  `keep()` takes one out of the block.
- `gdext.api.Gc`: `collect()`, `disable()`/`enable()`, `paused { }`, `stats`
  (heap, total allocated bytes, collections, owned references).
- Shutdown leak report: a warning naming the classes of `RefCounted`
  references Scala still owns.
- Full math API: all 367 methods, the operators, and the constants of `Vector2/3/4(i)`,
  `Rect2(i)`, `AABB`, `Plane`, `Quaternion`, `Basis`, `Transform2D/3D`,
  `Projection`, `Color` (including HSV, OKHSL, HTML and the 146 named colors),
  plus `GodotMath` scalar helpers.
- Static engine methods (71) are generated in the class companion, e.g.
  `FileAccess.fileExists`, `DirAccess.open`.
- `Arr`, `Dict`, `Packed*Array` are `AutoCloseable`; `Arr.free()`, `Dict.free()`.
- igen `BuiltinGenerator`: generates `BuiltinSizes`, `ColorNames`, and the
  math parity harness from `extension_api.json`.
- Harness: `MemoryProbe` + `godot/memory_verify.gd` (byte budgets per hot path,
  ownership rules); `MathParityProbe` + `godot/math_parity_verify.gd` (604
  Scala-vs-engine checks over every math method, member and operator).

### Changed
- **Breaking:** engine methods returning an object return the typed wrapper
  (`getParent(): Node`, `getMesh(): Mesh`, `load(...): Resource`) instead of a
  raw `GodotObject`. Replace `Gd.wrap[T](x.getFoo())` with `x.getFoo()`, or
  `x.getFoo().cast[T]` to narrow.
- **Breaking:** each engine object has exactly one wrapper (cached through
  Godot instance bindings, like godot-cpp). Wrappers of objects the engine
  freed throw `NullPointerException` on use instead of crashing.
- **Breaking:** `Ref<T>` returns and `Gd.create` of a `RefCounted` are owned by
  the caller: release with `unref()` or `Gd.scoped`. `unref()` destroys the
  object at the last reference (it previously never freed) and ignores a
  wrapper that owns no reference. Decoding an object from a Variant (`Arr` and
  `Dict` elements, `Object.get`, `Tres` elements) borrows instead of taking a
  reference.
- **Breaking:** `Basis`, `Transform2D`, `Transform3D`, `Projection` are stored
  flat (one object instead of 4-6). `Basis(row0, row1, row2)` →
  `Basis.fromRows(...)`; `Basis(x, y, z)` now takes columns (GDScript order);
  `basis.row0` → `basis.row(0)` / `basis.x` for the X axis.
  `Transform3D(basis, origin)`, `Transform2D(x, y, origin)`,
  `Projection(x, y, z, w)` keep working as factories.
- **Breaking:** math method signatures follow the engine API: `int` arguments are
  `Long`, zero-argument methods take no parentheses. `Vector3.rotatedY(a)` is
  removed; use `rotated(Vector3.UP, a)`. Lowercase `zero`/`identity` constants
  are deprecated aliases of `ZERO`/`IDENTITY`.
- Exported resource, scene, `Arr` and `Dict` properties release the value they
  replace and, when the instance is freed, what they still hold.
- `BuiltinSizes` is generated from the API dump.

### Fixed
- Leaks: one Godot `String` per engine call with a `String` argument; a
  `StringName` reference and 8 bytes of malloc per `StringName` return; one
  reference per `Ref<T>` return (`load`, `duplicate`, `getMesh`, ...); one
  reference per export setter call; the binding self-test's `DirAccess`. The
  harness no longer ends with `ERROR: 3 resources still in use at exit`.
- `StringName.from` encoded with the platform default charset but measured
  UTF-8 bytes.
- `GString` conversion used the platform default charset; it is now exact
  UTF-16.
- Hand-written `FileAccess`/`DirAccess` statics in generated files were lost on
  regenerate; statics are now generated.

## [0.1.8] — 2026-10-20

### Removed
- **Breaking:** a `case class` can no longer be a Godot class. Godot objects have
  identity, so the structural `equals`/`hashCode`/`copy` a case class generates
  are wrong for them. `RegistrationScan` now fails the build, naming the file
  and line of every case class whose parent chain reaches an engine class, and
  `Register.auto` rejects one with a compile error. Declare these as a plain
  `class`. Case classes that do not extend an engine class (ordinary game data)
  are unaffected.

### Added
- Documentation site on GitHub Pages (MkDocs Material, `docs/`): getting
  started, guides, sbt plugin reference, troubleshooting, and the binding's
  Scaladoc under `/api/`. Deployed by `.github/workflows/docs.yml`.

## [0.1.7] — 2026-09-29

### Added
- `PackedFloat32Array`, `PackedInt32Array`, `PackedVector3Array` (`gdext.builtin`):
  heap-owned packed arrays with `size`/`resize`/`apply`/`update`/`free` and
  `ToVariant`/`FromVariant`. Element access uses the `packed_*_operator_index`
  interface functions; indices are bounds-checked (`IndexOutOfBoundsException`),
  use-after-`free()` throws, and decoding a Variant of the wrong type throws
  `ClassCastException` instead of reading garbage.
- `GArray.set`, `variantTypeAt`, `isNilAt`, `GArray.allocate()`/`free()`;
  `GArray.get` is now bounds-checked.
- `ToVariant[StringName]`.
- `Basis`/`Transform3D` math: `xform`, `*`, `transposed`, `determinant`,
  `inverse`, `affineInverse`, `identity`.
- `EngineExtras`: `PhysicalBoneSimulator3D.physicalBonesStartSimulation()` (and a
  bone-name subset overload), `Mesh.surfaceGetArrays`,
  `ArrayMesh.addSurfaceFromArrays`, plus `MeshArray` slot/format constants. The
  hand-written wrappers throw `NullPointerException` on a null-host wrapper
  instead of segfaulting.
- Harness: `SliceRagdollProbe` + `godot/slice_ragdoll_verify.gd` covering the
  above (packed-array edge cases and stress, custom-channel mesh rebuilds that
  keep skinning, Jolt ragdoll start/stop/subset/impulse, capturing the live
  ragdoll pose via `modification_processed` and freezing it). The harness
  project now runs on Jolt Physics.

### Changed
- `Ptrcall` dispatchers throw `IllegalStateException` when a method bind is
  null (wrong hash / missing method) instead of handing it to the engine.

## [0.1.6] — 2026-07-18

### Changed
- `RegistrationScan` no longer emits a repo-local documentation path into the
  generated `GeneratedRegistrations.scala` header. The comment pointed at a file
  under this repo's `.claude/` directory, which does not exist in consumer
  projects that receive the generated code.
- Version scheme is now plain semver, matching `godot-scala-native-utilities`.
  The dev version was previously a `-SNAPSHOT` pinned at `0.1.3-SNAPSHOT`, which
  had drifted behind the released tags.

## [0.1.5] — 2026-07-12

Re-tag of `0.1.4` with no code changes (same commit), cut to rebuild on JitPack.

## [0.1.4] — 2026-07-12

Released without a changelog entry at the time; reconstructed from git history.

### Added
- Static `FileAccess`/`DirAccess` methods for reading `res://` (PCK) files.

### Fixed
- Guard `System.getenv` in `Log` init so Windows `godot_scala_init` survives.
- Scala Native Windows init NPE; multithreading-off moved into the binding.

### Changed
- Verbose tracing is gated behind a `.scala/trace` file (default off).

## [0.1.3] — 2026-07-12

Diagnostic release for the Windows `godot_scala_init` crash, tagged without a
changelog entry at the time; reconstructed from git history.

### Changed
- `.scala/log` is verbose by default and records the init stack trace on
  failure (made opt-in again in `0.1.4`).
- The trace prefix no longer calls the Linux-only `gettid`, so logging works the
  same on Windows, macOS and Linux.
- Unconditional log markers around each init call, to locate the crash.
- `install-toolchain.ps1`: `Ensure-BoehmGc` tolerates empty-string `Path`
  entries; the Boehm GC step is documented as a known Windows limitation.

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
