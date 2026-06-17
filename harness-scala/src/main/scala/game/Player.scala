package game

import io.github.optical002.godot.GodotPrint
import io.github.optical002.godot.builtin.Vector2
import io.github.optical002.godot.codegen.engine.Node2D
import io.github.optical002.godot.engine.{Gd, Tres}
import io.github.optical002.godot.register.*

/**
 * Example game class: a `Node2D` written in Scala that moves itself every
 * frame, exposes a method and an `@gdexport` property to Godot, and emits a
 * signal.
 *
 * It extends the engine class directly (`extends Node2D`), so it inherits all
 * of Node2D's methods and the engine virtuals. Members are annotated with
 * `@func` / `@gdexport` / `@signal`; `Register.auto[Player]()` scans them and
 * derives the Godot base (`Node2D`) from the superclass. No registration code.
 */
final class Player extends Node2D {
  private var elapsed: Double = 0.0
  private var frame = 0

  /** Editable in the inspector and from GDScript. */
  @gdexport var speed: Double = 120.0

  /** Optional projectile reference — the editor allows leaving it empty. */
  @gdexport var maybeProjectile: Option[Gd[Projectile]] = None

  /** Required projectile reference (bare `Gd` == Required; null if unassigned). */
  @gdexport var projectile: Gd[Projectile] = Gd.nullOf

  /** Optional stats resource — the inspector shows a filesystem resource picker. */
  @gdexport var maybeStats: Option[Tres[PlayerStats]] = None

  /** Required stats resource (bare `Tres` == Required; unassigned by default). */
  @gdexport var stats: Tres[PlayerStats] = Tres.unassigned[PlayerStats]

  /** Callable from Godot/GDScript. */
  @func def getScore(): Long = (elapsed * 10).toLong

  /** A signal other nodes can connect to. */
  @signal def pinged(): Unit = ()

  override def _ready(): Unit =
    GodotPrint.print("Player._ready (extends Node2D) [reload probe 12]")

  override def _process(delta: Double): Unit = {
    elapsed += delta
    // `setPosition` is inherited from Node2D and operates on this instance.
    setPosition(
      Vector2((elapsed * speed).toFloat, (math.sin(elapsed * 3) * 150).toFloat)
    )
    if (frame == 1)
      SignalRegistration.emit(hostObject, "pinged") // fire once, observable
    GodotPrint.print(
      f"Player._process frame=$frame delta=$delta%.4f pos.x=${elapsed * speed}%.1f"
    )
    frame += 1
  }
}
