# Your first class

## What the template gives you

```scala title="scala/src/main/scala/game/HelloWorld.scala"
package game

import gdext.api.{Gd, Tscn}
import gdext.classes.Node2D

case class HelloWorld(
  var speed: Double,
  var velocity: Tscn[Node2D],
) extends Node2D:
  override def _ready(): Unit =
    Gd.print(s"Hello from scala! (speed=$speed)")
```

- `extends Node2D`: the class is a real Godot node. It inherits every
  `Node2D` method and virtual.
- `var speed: Double`: every `var` constructor parameter is exported to the
  inspector. No default is needed, because Godot constructs the node with no
  arguments and each parameter is filled from its type's natural default
  (`0.0` here).
- `override def _ready()`: overridden engine virtuals are detected and wired
  up automatically.
- No registration call anywhere. The build scans `src/main/scala` and
  registers every concrete class that extends a Godot class.

## Add a class

Create `scala/src/main/scala/game/Spinner.scala`:

```scala
package game

import gdext.classes.Node2D
import gdext.annotations.*
import gdext.api.*

final class Spinner(
  var degreesPerSecond: Double = 90.0
) extends Node2D {

  @signal def turned(): Unit = ()

  @func def turns(): Long = (getRotationDegrees() / 360.0).toLong

  override def _process(delta: Double): Unit = {
    val before = turns()
    setRotationDegrees(getRotationDegrees() + degreesPerSecond * delta)
    if (turns() != before) emitSignal(hostObject, "turned")
  }
}
```

Rebuild:

```sh
sbt godotBuild
```

In the editor, *Add Child Node* now lists `Spinner` under `Node2D`. Its
inspector shows **Degrees Per Second**. Names are converted to Godot's
snake_case: the property is `degrees_per_second` and the method is `turns()`.

From GDScript:

```gdscript
var s = $Spinner
s.degrees_per_second = 180.0
s.turned.connect(func(): print("full turn, total ", s.turns()))
```

## The development loop

| Step | Command |
|------|---------|
| Rebuild once | `sbt godotBuild` |
| Rebuild on every save | `sbt "~godotBuild"` |
| Rebuild and hot-reload inside the editor | enable the `godot_scala` plugin (see [Editor hot reload](../guides/hot-reload.md)) |

Godot reloads the GDExtension when the library file changes, so a running
editor picks up new classes and properties without a restart.

## Where to go next

- [Game classes](../guides/classes.md): what gets registered, inheritance,
  and creating nodes from code.
- [Exported properties](../guides/properties.md): every supported property type.
- [Methods and signals](../guides/methods-signals.md).
