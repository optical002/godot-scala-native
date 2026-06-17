package game

import io.github.optical002.godot.GodotPrint
import io.github.optical002.godot.builtin.Vector2
import io.github.optical002.godot.codegen.engine.Node2D
import io.github.optical002.godot.register.*

/**
 * Example game class: a `Node2D` written in Scala that moves itself every
 * frame, exposes a method and an `@export` property to Godot, and emits a
 * signal.
 *
 * Everything is declared with annotations — `@godotClass` for the engine base,
 * `@func` for a callable method, `@export` for an inspector property, `@signal`
 * for a signal. There is no registration boilerplate; `Register.auto[Player]()`
 * (called from the entry point) scans these annotations and registers it all.
 */
@godotClass(base = "Node2D")
final class Player extends GodotScriptClass {
  private var elapsed: Double = 0.0
  private var frame = 0

  /** Editable in the inspector and from GDScript. */
  @gdexport var speed: Double = 120.0

  /** Callable from Godot/GDScript. */
  @func def getScore(): Long = (elapsed * 10).toLong

  /** A signal other nodes can connect to. */
  @signal def pinged(): Unit = ()

  override def _ready(): Unit =
    GodotPrint.print("Player._ready (auto-registered)")

  override def _process(delta: Double): Unit = {
    elapsed += delta
    val self = Node2D.fromObject(hostObject)
    self.setPosition(
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
