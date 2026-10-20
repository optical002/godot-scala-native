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

## Companion libraries

Game-development libraries built on the binding live in
[godot-scala-native-utilities](https://github.com/optical002/godot-scala-native-utilities):
reactive cells, HOCON config, prefabs, an init system, and more. They are
published on JitPack under `com.github.optical002.godot-scala-native-utilities`.
