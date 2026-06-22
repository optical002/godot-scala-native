package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Shape2D`, extends `Resource`. */
abstract class Shape2D extends Resource {

  /** Shape2D.set_custom_solver_bias */
  final def setCustomSolverBias(bias: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Shape2D", "set_custom_solver_bias", 373806689L), hostObject.objectPtr, bias)

  /** Shape2D.get_custom_solver_bias */
  final def getCustomSolverBias(): Double =
    Ptrcall.call0[Double](MethodBind.get("Shape2D", "get_custom_solver_bias", 1740695150L), hostObject.objectPtr)

  /** Shape2D.collide */
  final def collide(local_xform: gdext.builtin.Transform2D, with_shape: Shape2D, shape_xform: gdext.builtin.Transform2D): Boolean =
    Ptrcall.call3[gdext.builtin.Transform2D, GodotObject, gdext.builtin.Transform2D, Boolean](MethodBind.get("Shape2D", "collide", 3709843132L), hostObject.objectPtr, local_xform, with_shape.hostObject, shape_xform)

  /** Shape2D.collide_with_motion */
  final def collideWithMotion(local_xform: gdext.builtin.Transform2D, local_motion: gdext.builtin.Vector2, with_shape: Shape2D, shape_xform: gdext.builtin.Transform2D, shape_motion: gdext.builtin.Vector2): Boolean =
    Ptrcall.call5[gdext.builtin.Transform2D, gdext.builtin.Vector2, GodotObject, gdext.builtin.Transform2D, gdext.builtin.Vector2, Boolean](MethodBind.get("Shape2D", "collide_with_motion", 2869556801L), hostObject.objectPtr, local_xform, local_motion, with_shape.hostObject, shape_xform, shape_motion)

  /** Shape2D.get_rect */
  final def getRect(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("Shape2D", "get_rect", 1639390495L), hostObject.objectPtr)

}

object Shape2D {
  /** Class metadata for Gd[Shape2D] lifetime management and casting. */
  given GodotClass[Shape2D] with {
    def className = "Shape2D"
    def isRefCounted = true
    def wrap(o: GodotObject): Shape2D = new Shape2D {}.withHost(o.objectPtr)
    def unwrap(t: Shape2D): GodotObject = t.hostObject
  }
}
