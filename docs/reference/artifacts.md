# Artifacts and versions

[![Release](https://img.shields.io/jitpack/version/com.github.optical002/godot-scala-native?label=release&color=brightgreen)](https://jitpack.io/#optical002/godot-scala-native)

Releases are built on demand by
[JitPack](https://jitpack.io/#optical002/godot-scala-native) from git tags,
under the group `com.github.optical002.godot-scala-native`:

| Artifact | What it is |
|----------|------------|
| `sbt-godot-scala-native` | The sbt plugin a game project adds. It brings in everything else. |
| `scala-native-gdextension` | The binding library. The plugin adds it, so you never declare it yourself. |

Both artifacts are released together under one version.

## Versioning

- Versions are plain semver tags such as `0.1.5`, with no `v` prefix.
- Before 1.0, a minor bump can break the API. Read the
  [changelog](../changelog.md) before upgrading.
- The first build of a new tag on JitPack takes several minutes. Later
  resolutions are cached.

## Upgrading a project

Change the version in `project/plugins.sbt`, then rebuild:

```sh
sbt clean godotBuild
```

A clean build makes sure no stale Scala Native intermediate files from the old
binding are linked.

### From 0.1.9 to 0.1.10

No code changes are needed. Two new defaults can affect a project:

1. **`game.Res` is generated** from your Godot project (typed `res://`
   references; see [Resources and files](../guides/resources-files.md#typed-res-references)).
   If you have your own `game.Res`, rename the generated one with
   `godotResObject := "Assets"`, or turn it off with `godotResRefs := false`.
2. **Only the engine classes your game can observe are linked.** If a
   dependency that is not a godot-library uses engine classes your own code
   never names, add `godotTrimEngineClasses := false`.

Don't override the `sbt-scala-native` version: the plugin ships patches for
Scala Native 0.5.10 and warns if another version is on the build classpath.

### From 0.1.8 to 0.1.9

0.1.9 changes how engine objects and math values are represented. The compiler
points at every place that needs an edit, apart from item 2, which you have to
look for yourself.

1. **Engine methods return typed objects.** Remove `Gd.wrap` around engine
   calls, and use `cast` to narrow:

    ```scala
    // 0.1.8
    val mesh = Gd.wrap[ArrayMesh](body.getMesh())
    // 0.1.9
    val mesh = body.getMesh().cast[ArrayMesh]
    ```

    Null checks on returned objects change from `x.isNull` to `x == null`.

2. **Release the references you receive.** Engine methods returning a
   `RefCounted` (`ResourceLoader.load`, `Resource.duplicate`, `DirAccess.open`,
   `getMesh`, ...) and `Gd.create` of a `RefCounted` now hand you a reference.
   Call `unref()` when done, or wrap the code in `Gd.scoped { ... }`. Code that
   doesn't still runs, but leaks those objects, and the binding prints
   `RefCounted reference(s) still owned by Scala` at shutdown, naming the
   classes. See [Memory and object lifetimes](../guides/memory.md).
3. **Object reads from containers are borrowed.** `Arr`/`Dict` elements and
   `Object.get` no longer take a reference. Call `refInc()` on an element you
   keep after the container is gone.
4. **`Basis` constructors.** `Basis(row0, row1, row2)` is now
   `Basis.fromRows(row0, row1, row2)`. `Basis(x, y, z)` takes the columns (the
   axes), as in GDScript. `basis.row0` is `basis.row(0)`. The X axis is
   `basis.x`.
5. **Math method signatures follow the engine API.** Methods without arguments
   take no parentheses (`v.normalized`, `t.affineInverse`). Godot `int`
   arguments are `Long`. `Vector3.rotatedY(a)` is gone; use
   `rotated(Vector3.UP, a)`. `Vector3.zero`, `Basis.identity`, and
   `Transform3D.identity` still work but are deprecated in favour of `ZERO`
   and `IDENTITY`.
6. **Free containers you create.** An `Arr` or `Dict` you build yourself
   (`Arr.empty`, `Dict.empty`) holds engine storage until `free()`. Exported
   container properties are released by the binding.
7. **Build mode.** Projects now build with Scala Native's optimizer
   (`releaseFast`). Add `godotNativeMode := "debug"` to keep the previous
   behaviour. See [Performance](../guides/performance.md#build-modes).

## Companion libraries

Game-development libraries built on the binding live in
[godot-scala-native-utilities](https://github.com/optical002/godot-scala-native-utilities):
reactive cells, HOCON config, prefabs, an init system, and more. They are
published on JitPack under `com.github.optical002.godot-scala-native-utilities`.
