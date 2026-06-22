package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CollisionShape2D`, extends `Node2D`. */
abstract class CollisionShape2D extends Node2D {

  /** CollisionShape2D.set_shape */
  final def setShape(shape: Shape2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionShape2D", "set_shape", 771364740L), hostObject.objectPtr, shape.hostObject)

  /** CollisionShape2D.get_shape */
  final def getShape(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CollisionShape2D", "get_shape", 522005891L), hostObject.objectPtr)

  /** CollisionShape2D.set_disabled */
  final def setDisabled(disabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionShape2D", "set_disabled", 2586408642L), hostObject.objectPtr, disabled)

  /** CollisionShape2D.is_disabled */
  final def isDisabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CollisionShape2D", "is_disabled", 36873697L), hostObject.objectPtr)

  /** CollisionShape2D.set_one_way_collision */
  final def setOneWayCollision(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionShape2D", "set_one_way_collision", 2586408642L), hostObject.objectPtr, enabled)

  /** CollisionShape2D.is_one_way_collision_enabled */
  final def isOneWayCollisionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CollisionShape2D", "is_one_way_collision_enabled", 36873697L), hostObject.objectPtr)

  /** CollisionShape2D.set_one_way_collision_margin */
  final def setOneWayCollisionMargin(margin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionShape2D", "set_one_way_collision_margin", 373806689L), hostObject.objectPtr, margin)

  /** CollisionShape2D.get_one_way_collision_margin */
  final def getOneWayCollisionMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("CollisionShape2D", "get_one_way_collision_margin", 1740695150L), hostObject.objectPtr)

  /** CollisionShape2D.set_debug_color */
  final def setDebugColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionShape2D", "set_debug_color", 2920490490L), hostObject.objectPtr, color)

  /** CollisionShape2D.get_debug_color */
  final def getDebugColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("CollisionShape2D", "get_debug_color", 3444240500L), hostObject.objectPtr)

}

object CollisionShape2D {
  /** Class metadata for Gd[CollisionShape2D] lifetime management and casting. */
  given GodotClass[CollisionShape2D] with {
    def className = "CollisionShape2D"
    def isRefCounted = false
    def wrap(o: GodotObject): CollisionShape2D = new CollisionShape2D {}.withHost(o.objectPtr)
    def unwrap(t: CollisionShape2D): GodotObject = t.hostObject
  }
}
