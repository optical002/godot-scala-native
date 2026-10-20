# Game classes

A game class is a plain Scala class that extends a Godot engine class. The
build discovers it and registers it with Godot's ClassDB, so it can be used
anywhere a built-in class can: scenes, the *Add Node* dialog, GDScript, and
`ClassDB.instantiate`.

## Imports

```scala
import gdext.classes.Node2D   // engine classes (one file per Godot class)
import gdext.builtin.*        // Vector2, Color, Arr, Dict, ...
import gdext.annotations.*    // @func, @signal, @gdexport, ...
import gdext.api.*            // Gd, Tres, Tscn, ExportHint, emitSignal, Math
```

These four packages are the public surface. Everything under `gdext.internal`
is an implementation detail and can change without notice.

## What gets registered

The `sbt-godot-scala-native` plugin scans `src/main/scala` on every compile
and registers a class when all of these hold:

- It is a concrete `class` or `case class` (not a `trait`, `object`, or
  `abstract class`).
- Its parent chain reaches a Godot engine class, either directly or through
  another game class.
- Godot can construct it with no arguments: every primary-constructor parameter
  is a `var` or has a default value.

There is no registration list or entry-point file to edit. Adding a class
registers it, and deleting one unregisters it.

!!! note "Why discovery happens at build time"
    Scala Native removes unreferenced classes and never runs module
    initializers at load. Classes therefore cannot register themselves at
    runtime. The build generates a `GeneratedRegistrations` source under
    `target/` that references each class, which keeps it linked and registers it.

## Engine virtuals

Override an engine virtual and it is wired up automatically:

| Virtual | Signature |
|---------|-----------|
| `_ready` | `(): Unit` |
| `_process` | `(delta: Double): Unit` |
| `_physics_process` | `(delta: Double): Unit` |
| `_enter_tree` / `_exit_tree` | `(): Unit` |
| `_input` / `_unhandled_input` / `_shortcut_input` / `_unhandled_key_input` | `(event: InputEvent): Unit` |

Only overridden virtuals are registered, so a class pays nothing for the
virtuals it leaves alone.

## Calling engine methods

Engine methods are camelCase Scala methods on the inherited class, so you call
them directly on `this`:

```scala
override def _process(delta: Double): Unit =
  setPosition(getPosition() + Vector2(1f, 0f))
```

Methods that return an engine object return a raw handle. Wrap it as the type
you expect:

```scala
val mesh = Gd.wrap[ArrayMesh](body.getMesh())
```

## Creating objects

```scala
val mesh  = Gd.create[ArrayMesh]()          // engine class
val enemy = Gd.create[Enemy](Some(this))    // game class, added as a child
```

`Gd.create` works for engine and game classes alike. Reference-counted classes
(`Resource` and its subclasses) are reference-initialised. When you pass a parent
`Node`, the new node is added as its child.

## Logging

```scala
Gd.print("shown in the Output panel and on stdout")
Gd.printWarning("shown in the debugger's Errors tab")
Gd.printError("shown in the debugger's Errors tab")
```

## Inheriting from another game class

A game class can extend another game class. Godot then sees the child as
deriving from the parent and exposes the parent's properties, methods, and
signals on it.

```scala
class Enemy(var hp: Int, var projectile: Option[Projectile], var scene: Tscn[Player])
    extends Node2D {
  @func def remainingHealth(): Long = hp.toLong
  @signal def died(): Unit = ()
}

class Skeleton(
  var skeletonName: String = "Bonechill",
  hp: Int = 10,
  var age: Int
) extends Enemy(hp, None, Tscn.unassigned[Player]) {
  override def _ready(): Unit = {
    super._ready()
    Gd.print(s"Skeleton $skeletonName")
  }
}
```

- The base must be an open `class`, not `final` and not a `case class`.
- The child forwards the base's constructor arguments in its `extends` clause.
  Its own parameters must still all be `var` or defaulted.
- Parents are registered before children automatically.

!!! warning "Name clashes with engine members"
    A property or method whose snake_case name matches an existing engine member
    collides with it. For example, a `String` property called `name` clashes with
    `Node.name`. The same applies to a `@func getHp` next to an exported `hp`,
    because Godot already generates `get_hp` for that property. Pick distinct
    names.
