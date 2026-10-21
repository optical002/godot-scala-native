# Resources and files

## Custom resources

A class extending `Resource` (or any resource subclass) is registered like any
other game class. Godot can then create it as a `.tres` file from the
FileSystem dock (*New Resource...*), and the inspector can edit its exported
properties.

```scala
package game

import gdext.classes.Resource

final class PlayerStats(
  var maxHp: Int = 100,
  var moveSpeed: Double = 5.0
) extends Resource
```

Reference it from a node as a bare type (required) or an `Option` (may be empty):

```scala
final class Player(
  var stats: PlayerStats,
  var maybeStats: Option[PlayerStats]
) extends Node2D
```

Inside collections, wrap resource elements in `Tres[T]`:

```scala
var statsById: Dict[Int, Tres[PlayerStats]]
```

## Scenes

`Tscn[T]` is a reference to a `.tscn` file whose root node is `T`. The inspector
offers a scene picker for it.

```scala
final class Spawner(var enemyScene: Tscn[Enemy]) extends Node2D
```

`Tscn.unassigned[T]` is the empty value. A bare `Tscn[T]` is required, and
`Option[Tscn[T]]` may be left empty.

## Reading `res://` files

`FileAccess` has static helpers for reading files packed into the project,
including inside an exported `.pck`:

```scala
import gdext.classes.{FileAccess, DirAccess}

if (FileAccess.fileExists("res://data/levels.json")) {
  val json: String = FileAccess.getFileAsString("res://data/levels.json")
}

val dir = DirAccess.open("res://data")
// ... use dir ...
dir.unref()
```

`DirAccess.open` returns a reference that you own, like every engine method
that returns a `RefCounted`. Release it with `unref()`, or call it inside
`Gd.scoped { ... }`. See
[Memory and object lifetimes](memory.md#refcounted-references).

## Loading resources at runtime

`ResourceLoader.load` returns an owned reference too:

```scala
import gdext.api.Gd
import gdext.classes.{ResourceLoader, PackedScene}

Gd.scoped {
  val scene = ResourceLoader.singleton.load("res://enemy.tscn", "", 1L).cast[PackedScene]
  val enemy = scene.instantiate(0L)
  addChild(enemy, false, 0L)     // the tree owns the node
}                                // our reference to the PackedScene is released
```

Cache mode `1` (`CACHE_MODE_REUSE`) returns the already-loaded resource when
there is one.

Use `res://` paths rather than OS paths: `res://` works both in the editor and
in exported builds.
