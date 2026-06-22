package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CollisionPolygon3D`, extends `Node3D`. */
abstract class CollisionPolygon3D extends Node3D {

  /** CollisionPolygon3D.set_depth */
  final def setDepth(depth: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionPolygon3D", "set_depth", 373806689L), hostObject.objectPtr, depth)

  /** CollisionPolygon3D.get_depth */
  final def getDepth(): Double =
    Ptrcall.call0[Double](MethodBind.get("CollisionPolygon3D", "get_depth", 1740695150L), hostObject.objectPtr)

  /** CollisionPolygon3D.set_disabled */
  final def setDisabled(disabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionPolygon3D", "set_disabled", 2586408642L), hostObject.objectPtr, disabled)

  /** CollisionPolygon3D.is_disabled */
  final def isDisabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CollisionPolygon3D", "is_disabled", 36873697L), hostObject.objectPtr)

  /** CollisionPolygon3D.set_debug_color */
  final def setDebugColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionPolygon3D", "set_debug_color", 2920490490L), hostObject.objectPtr, color)

  /** CollisionPolygon3D.get_debug_color */
  final def getDebugColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("CollisionPolygon3D", "get_debug_color", 3444240500L), hostObject.objectPtr)

  /** CollisionPolygon3D.set_enable_debug_fill */
  final def setEnableDebugFill(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionPolygon3D", "set_enable_debug_fill", 2586408642L), hostObject.objectPtr, enable)

  /** CollisionPolygon3D.get_enable_debug_fill */
  final def getEnableDebugFill(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CollisionPolygon3D", "get_enable_debug_fill", 36873697L), hostObject.objectPtr)

  /** CollisionPolygon3D.set_margin */
  final def setMargin(margin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionPolygon3D", "set_margin", 373806689L), hostObject.objectPtr, margin)

  /** CollisionPolygon3D.get_margin */
  final def getMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("CollisionPolygon3D", "get_margin", 1740695150L), hostObject.objectPtr)

}

object CollisionPolygon3D {
  /** Class metadata for Gd[CollisionPolygon3D] lifetime management and casting. */
  given GodotClass[CollisionPolygon3D] with {
    def className = "CollisionPolygon3D"
    def isRefCounted = false
    def wrap(o: GodotObject): CollisionPolygon3D = new CollisionPolygon3D {}.withHost(o.objectPtr)
    def unwrap(t: CollisionPolygon3D): GodotObject = t.hostObject
  }
}
