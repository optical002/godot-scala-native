# Exported properties

Exported properties show up in the inspector and can be read and written from
GDScript. There are two ways to declare one.

```scala
final class Player(
  var speed: Double = 120.0,            // 1. var constructor parameter
  var stats: PlayerStats
) extends Node2D {
  @gdexport var hp: Int = 100           // 2. @gdexport body field
}
```

1. **`var` constructor parameters** are always exported. They need **no
   default**. Godot constructs the object with no arguments, so each parameter
   is filled from its type's natural default. Write `= ...` only to override
   that default.
2. **`@gdexport var` body fields** need a Scala initializer. Use them when you
   want an [export hint](export-hints.md) or inspector sections.

Plain parameters and `val` parameters are not exported.

Property names are converted to snake_case for Godot: `spawnOffset` becomes
`spawn_offset`.

## Supported types and their defaults

| Scala type | Inspector | Default when no `= ...` is given |
|------------|-----------|-----------------------------|
| `Int`, `Long`, `Float`, `Double` | number | `0` |
| `Boolean` | checkbox | `false` |
| `String` | text | `""` |
| Scala 3 `enum` (no parameters) | dropdown | first case |
| `Color` | color picker | opaque black |
| `Vector2`/`2i`/`3`/`3i`/`4`/`4i`, `Rect2`/`2i`, `Quaternion`, `Plane`, `AABB`, `Basis`, `Transform2D`/`3D`, `Projection` | matching editor | zero (identity for `Basis`/`Transform*`) |
| `Arr[A]` | typed array | empty typed array |
| `Dict[K, V]` | typed dictionary | empty |
| node type, such as `Projectile` | node picker (required) | `null` |
| resource type, such as `PlayerStats` | resource picker (required) | unassigned |
| `Option[T]` for a node or resource | picker that can be left empty | `None` |
| `Tres[T]` | resource picker, used for collection elements | unassigned |
| `Tscn[T]` | `.tscn` picker whose root must be `T` | unassigned |

## Enums

```scala
enum CharacterState { case Idle, Walking, Running, Jumping, Falling }

final class Player(var characterState: CharacterState) extends Node2D
```

The inspector shows a dropdown `Idle, Walking, Running, Jumping, Falling`.
GDScript sees the value as its ordinal `int`.

## Node and resource references

```scala
final class Player(
  var projectile: Projectile,                 // required node reference
  var maybeProjectile: Option[Projectile],    // optional node reference
  var stats: PlayerStats,                     // required resource
  var maybeStats: Option[PlayerStats],        // optional resource
  var scene: Tscn[Player],                    // scene whose root is a Player
  var maybeScene: Option[Tscn[Player]]
) extends Node2D
```

Engine references are held as their plain class type, with no wrapper. A bare
type means *required*, and `Option` means it may be empty.

## Collections

```scala
final class Player(
  var scores: Arr[Int],
  var tags: Arr[String],
  var enemies: Arr[Enemy],                          // node elements are bare
  var statsById: Dict[Int, Tres[PlayerStats]]       // resource elements use Tres
) extends Node2D {
  @func def joinTags(): String =
    (0 until tags.size).map(tags.apply).mkString(",")
}
```

`Arr` and `Dict` export as Godot **typed** collections, so the inspector adds
new rows with the element's default rather than `<null>`.

## Math types and colors

```scala
final class Player(
  var spawnOffset: Vector2 = Vector2(10f, -10f),
  var aimDirection: Vector3,
  var tint: Color = Color(1f, 0f, 0f, 1f),
  var hitbox: Rect2
) extends Node2D
```

Math components are 32-bit `Float`s, matching Godot.

Next: [Export hints and sections](export-hints.md).
