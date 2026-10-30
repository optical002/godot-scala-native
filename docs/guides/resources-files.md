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

## Typed `res://` references

The sbt plugin generates an object `game.Res` that mirrors the files in your
Godot project. Each file becomes a typed path, so a renamed, moved or deleted
file is a compile error in the code that uses it, and passing the wrong kind of
resource is a type error.

```
godot/
  icon.svg                  Res.icon             : ResPath[CompressedTexture2D]
  new_player_stats.tres     Res.newPlayerStats   : ResPath[PlayerStats]
  test.tscn                 Res.test             : ScenePath[Player]
  sfx/jump.ogg              Res.sfx.jump         : ResPath[AudioStreamOggVorbis]
  data/levels.json          Res.data.levels      : FilePath
```

```scala
import gdext.api.{Gd, Tscn}

Gd.scoped {
  val stats: PlayerStats = Res.newPlayerStats.load()   // no cast
  val scene: Tscn[Player] = Res.test.load()
}
val player: Player = Res.test.instantiate(this)        // loads, adds as child, releases the PackedScene
val json: String = Res.data.levels.readText()
```

- `ResPath[T].load()` returns an owned `T`, like `ResourceLoader.load`. Release
  it with `unref()` or call it inside `Gd.scoped`. It returns `null` (and logs
  an error) when the file can't be loaded.
- `ScenePath[T].load()` returns the existing `Tscn[T]`, whose `PackedScene` is
  owned in the same way. `instantiate()` / `instantiate(parent)` release the
  scene for you.
- `.path` gives back the `res://` string for any string-based API. The string
  API keeps working unchanged.

Where the type comes from:

| File | Type |
|---|---|
| imported asset (`x.png` + `x.png.import`) | the `type=` in the `.import` file; a `PackedScene` import (`.glb`, `.gltf`) is `ScenePath[Node]` |
| `.tres` | the `type=` in the `[gd_resource ...]` header; your own `Resource` classes resolve to their Scala class |
| `.tscn` | the root node's `type=`; an inherited scene (root has `instance=`) is `ScenePath[Node]` |
| `.res` / `.scn` (binary) | `ResPath[Resource]` / `ScenePath[Node]` |
| anything else | `FilePath` |

A class name the build can't find (e.g. a GDScript `class_name`) falls back to
`Resource` or `Node` with a `[res]` warning. It never fails the build.

Names:

- `new_player_stats.tres` → `newPlayerStats`, `HUD.tscn` → `hud`,
  `2-boss fight.ogg` → `_2BossFight`, `type.tres` → `` `type` ``.
- Two files that would get the same name in one folder both take their
  extension as a suffix: `player.png` and `player.tres` become `playerPng` and
  `playerTres`. A file named like a sibling folder takes the suffix too.

Skipped: `.godot/`, `.scala/`, `addons/`, folders with a `.gdignore` or a
`build.sbt`, dotfiles, and `*.import`, `*.uid`, `*.gd`, `*.cs`,
`*.gdextension`, `project.godot`, `export_presets.cfg`.

Settings in `build.sbt`:

```scala
godotResRefs   := false   // turn it off (default true)
godotResObject := "Assets" // rename the object if `game.Res` clashes with a class of yours
```

Build cost:

- **Scene saves:** the plugin only reads file headers, and it skips the scan
  entirely when no file's size or mtime changed. Saving a scene without changing
  its root type changes nothing, so there is no recompile and no relink.
- **Adding, removing or renaming a file, or changing a root/resource type:**
  this changes `Res`, so the code that uses `Res` recompiles and the library
  relinks. Under the editor's `~godotBuild` watch this happens on its own, so
  the new name exists as soon as Godot has imported the file.

!!! note
    `FilePath` files (json, txt, csv, ...) are only in an exported `.pck` if the
    export preset includes them: *Project → Export → Resources → Filters to
    export non-resource files/folders*, e.g. `*.json`. The compile-time check
    can't see export filters.

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
  val scene = ResourceLoader.load("res://enemy.tscn").cast[PackedScene]
  val enemy = scene.instantiate(0L)
  addChild(enemy)                // the tree owns the node
}                                // our reference to the PackedScene is released
```

Cache mode `1` (`CACHE_MODE_REUSE`) returns the already-loaded resource when
there is one.

Use `res://` paths rather than OS paths: `res://` works both in the editor and
in exported builds.
