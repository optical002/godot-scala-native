package game

import gdext.builtin.{Arr, Dict, Vector2, Vector3, Color, Rect2}
import gdext.classes.Node2D
import gdext.api.{Gd, Tres, Tscn}
import gdext.annotations.*
import gdext.api.*

/** Player's high-level state, exported as a Godot ENUM property. */
enum CharacterState {
  case Idle, Walking, Running, Jumping, Falling
}

/**
 * Example game class: a `Node2D` written in Scala that moves itself every
 * frame, exposes a method and exported properties to Godot, and emits a signal.
 *
 * It extends the engine class directly (`extends Node2D`), so it inherits all of
 * Node2D's methods and the engine virtuals. The exported properties are written
 * as `var` **constructor params** — every `var` param auto-exports (no
 * `@gdexport` needed) and needs **no default**: the macro factory fills each one
 * from its type's `DefaultValue`. An engine reference is held as its plain
 * wrapper type — a node type is a Required node reference and a resource type a
 * Required resource reference (use `Tres[T]` only for resource collection
 * elements), with the matching default (null / unassigned). So `var projectile:
 * Projectile` is a Required node reference, defaulting to null — no `= ...`.
 * `Option[T]` → `None`, `Tscn[T]` → unassigned, `Dict` → empty, enum → first
 * case. Write an explicit `= ...` only to override, as `speed` does.
 * `Register.auto[Player]()` derives the Godot base (`Node2D`) from the
 * superclass. No registration code.
 */
final class Player(
  /** Editable in the inspector and from GDScript (explicit non-zero default). */
  var speed: Double = 120.0,
  /**
   * Optional projectile reference — the editor allows leaving it empty.
   * `Option[Projectile]` is a nullable node reference.
   */
  var maybeProjectile: Option[Projectile],
  /**
   * Required projectile reference. A bare node type `Projectile` is a Required
   * node reference, defaulting to null — no `= ...` needed.
   */
  var projectile: Projectile,
  /**
   * Optional stats resource — the inspector shows a filesystem resource picker.
   * Bare resource type: `Option[PlayerStats]` is shorthand for
   * `Option[Tres[PlayerStats]]`.
   */
  var maybeStats: Option[PlayerStats],
  /**
   * Required stats resource. Bare resource type: `PlayerStats` stands in for
   * `Tres[PlayerStats]` (== Required), unassigned by default.
   */
  var stats: PlayerStats,
  /** Optional scene whose root node is a Player (`.tscn` picker). */
  var maybeScene: Option[Tscn[Player]],
  /** Required scene whose root node is a Player (bare `Tscn` == Required). */
  var scene: Tscn[Player],
  /** Typed dictionary: Int level/slot id -> a PlayerStats resource. */
  var statsById: Dict[Int, Tres[PlayerStats]],
  /** Typed array of ints — inspector shows an editable Array[int]. */
  var scores: Arr[Int],
  /**
   * Typed array of enemy nodes. Engine references are held as their plain wrapper
   * type, so a node element is just `Enemy` (no wrapper) — and `Tres[T]` is still
   * used for resource elements, e.g. `Dict`'s `Tres[PlayerStats]` value.
   */
  var enemies: Arr[Enemy],
  /** Typed array of strings — inspector shows an editable Array[String]. */
  var tags: Arr[String],
  /** Current high-level state, shown as an enum dropdown in the inspector. */
  var characterState: CharacterState,
  /**
   * Math value types export with no wrapper or default needed — the inspector
   * picks the right editor from the Variant type (vector spinboxes, color
   * picker, rect fields). Each `var` param auto-exports; its `DefaultValue`
   * supplies the zero value, or write `= ...` to override (as `spawnOffset`).
   */
  var spawnOffset: Vector2 = Vector2(10f, -10f),
  /** A 3D vector property (Vector3 spinbox editor). */
  var aimDirection: Vector3,
  /** A color property (inspector shows a color picker). */
  var tint: Color = Color(1f, 0f, 0f, 1f),
  /** A rectangle property (Rect2 position/size editor). */
  var hitbox: Rect2
) extends Node2D {
  private var elapsed: Double = 0.0
  private var frame = 0

  /** Callable from Godot/GDScript. */
  @func def getScore(): Long = (elapsed * 10).toLong

  /**
   * Reads the `tags` String array on the Scala side (via `size`/`apply`) and
   * joins it — proves elements set from GDScript decode back to Scala correctly.
   */
  @func def joinTags(): String =
    (0 until tags.size).map(tags.apply).mkString(",")

  /** A signal other nodes can connect to. */
  @signal def pinged(): Unit = ()

  override def _ready(): Unit =
    Gd.print("Player._ready (extends Node2D)")

  override def _process(delta: Double): Unit = {
    elapsed += delta
    // `setPosition` is inherited from Node2D and operates on this instance.
    setPosition(
      Vector2((elapsed * speed).toFloat, (math.sin(elapsed * 3) * 150).toFloat)
    )
    if (frame == 1)
      emitSignal(hostObject, "pinged") // fire once, observable
    Gd.print(
      f"Player._process frame=$frame delta=$delta%.4f pos.x=${elapsed * speed}%.1f"
    )
    frame += 1
  }
}
