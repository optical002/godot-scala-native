# godot-scala-native

[![Release](https://jitpack.io/v/optical002/godot-scala-native.svg)](https://jitpack.io/#optical002/godot-scala-native)

A Scala Native language binding for [Godot](https://godotengine.org/) (a
GDExtension), targeting gdext-level sophistication. Write your game classes in
Scala, extend Godot engine classes directly, and they are auto-registered —
compiled to a native library via [Scala Native](https://scala-native.org/).

## Quick start

Use the [giter8 template](https://github.com/optical002/godot-scala-native-template.g8)
— it scaffolds a ready-to-run Godot 4 + Scala project and carries the full
instructions:

```sh
sbt new optical002/godot-scala-native-template.g8
```

## Artifacts

Released on [JitPack](https://jitpack.io/#optical002/godot-scala-native) under
the group `com.github.optical002.godot-scala-native`:

- `sbt-godot-scala-native` — the sbt plugin a game project adds (it injects
  everything else)
- `scala-native-gdextension` — the binding library itself

```scala
// project/plugins.sbt
resolvers += "jitpack" at "https://jitpack.io"
addSbtPlugin("com.github.optical002.godot-scala-native" % "sbt-godot-scala-native" % "<version>")
```

Companion game-development libraries (reactive cells, HOCON config, prefabs, …)
live in
[godot-scala-native-utilities](https://github.com/optical002/godot-scala-native-utilities).
