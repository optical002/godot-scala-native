package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CollisionPolygon2D`, extends `Node2D`. */
abstract class CollisionPolygon2D extends Node2D {

  /** CollisionPolygon2D.set_build_mode */
  final def setBuildMode(build_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionPolygon2D", "set_build_mode", 2780803135L), hostObject.objectPtr, build_mode)

  /** CollisionPolygon2D.get_build_mode */
  final def getBuildMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("CollisionPolygon2D", "get_build_mode", 3044948800L), hostObject.objectPtr)

  /** CollisionPolygon2D.set_disabled */
  final def setDisabled(disabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionPolygon2D", "set_disabled", 2586408642L), hostObject.objectPtr, disabled)

  /** CollisionPolygon2D.is_disabled */
  final def isDisabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CollisionPolygon2D", "is_disabled", 36873697L), hostObject.objectPtr)

  /** CollisionPolygon2D.set_one_way_collision */
  final def setOneWayCollision(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionPolygon2D", "set_one_way_collision", 2586408642L), hostObject.objectPtr, enabled)

  /** CollisionPolygon2D.is_one_way_collision_enabled */
  final def isOneWayCollisionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CollisionPolygon2D", "is_one_way_collision_enabled", 36873697L), hostObject.objectPtr)

  /** CollisionPolygon2D.set_one_way_collision_margin */
  final def setOneWayCollisionMargin(margin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionPolygon2D", "set_one_way_collision_margin", 373806689L), hostObject.objectPtr, margin)

  /** CollisionPolygon2D.get_one_way_collision_margin */
  final def getOneWayCollisionMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("CollisionPolygon2D", "get_one_way_collision_margin", 1740695150L), hostObject.objectPtr)

}

object CollisionPolygon2D {
  /** Class metadata for Gd[CollisionPolygon2D] lifetime management and casting. */
  given GodotClass[CollisionPolygon2D] with {
    def className = "CollisionPolygon2D"
    def isRefCounted = false
    def wrap(o: GodotObject): CollisionPolygon2D = new CollisionPolygon2D {}.withHost(o.objectPtr)
    def unwrap(t: CollisionPolygon2D): GodotObject = t.hostObject
  }
}
