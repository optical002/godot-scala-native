# godot-scala-native

Write your [Godot 4](https://godotengine.org/) game classes in **Scala 3**. They
are compiled to a native GDExtension library with
[Scala Native](https://scala-native.org/), with no JVM at runtime.

```scala
package game

import gdext.classes.Node2D
import gdext.annotations.*
import gdext.api.*

final class Player(var speed: Double = 120.0) extends Node2D {
  @func def getScore(): Long = 42
  @signal def pinged(): Unit = ()

  override def process(delta: Double): Unit =
    Gd.print(s"moving at $speed")
}
```

Run `sbt godotBuild` and `Player` shows up in Godot's *Add Node* dialog. `speed`
is editable in the inspector, and `get_score()` and the `pinged` signal can be
used from GDScript.

## Highlights

- **Extend engine classes directly.** `class Player extends Node2D` inherits
  every engine method and virtual. Around 1000 engine classes are generated
  from Godot's own `extension_api.json`.
- **Zero registration code.** A build-time scanner finds every class that
  extends a Godot class, and the GDExtension entry point is generated too.
- **Inspector exports.** Every `var` constructor parameter becomes an
  inspector property. This covers primitives, enums, math types, `Color`,
  typed `Arr`/`Dict`, node and resource references, and `Tscn` scenes.
  Range, file, and other hints are supported, as are inspector groups.
- **Deterministic memory.** Engine objects follow Godot's lifetimes, not the
  GC's. A `RefCounted` you receive is owned until `unref()` or the end of a
  `Gd.scoped` block, exported properties release what they hold, wrappers of
  freed objects throw instead of crashing, and leaks are reported at shutdown.
- **Allocation-free hot path.** Engine calls, signals, `process`, and
  `@func` calls from GDScript allocate nothing on the Scala heap: method binds are
  cached, marshalling is specialized at compile time, and wrappers are cached on
  the engine object. The 16 math types are a native port of Godot's
  `core/math`, checked against the engine.
- **Editor hot reload.** The bundled `godot_scala` editor plugin runs a warm
  sbt watch and swaps the rebuilt library while the editor stays open.
- **One sbt plugin.** A game project adds one `addSbtPlugin` line. The plugin
  brings the binding, Scala Native config, codegen, and the `godotBuild` task.

## Quick start

Install the [toolchain](getting-started/install.md) first. Then run:

```sh
sbt new optical002/godot-scala-native-template.g8
```

```sh
cd my-godot-scala-game/scala
sbt godotBuild
```

```sh
godot --path ../godot
```

Continue with [Create a project](getting-started/new-project.md).

## Versions

| Component | Version |
|-----------|---------|
| Scala | 3.8.1 |
| Scala Native | 0.5.10 |
| Godot | 4.6.x (standard build, not .NET) |
| Latest release | see [Artifacts and versions](reference/artifacts.md) |

!!! warning "Early stage"
    The binding is pre-1.0. APIs can change between minor releases; check the
    [changelog](changelog.md) before upgrading.
