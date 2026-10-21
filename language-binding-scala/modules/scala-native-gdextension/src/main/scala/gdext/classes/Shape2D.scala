package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Shape2D`, extends `Resource`. */
abstract class Shape2D extends Resource {
  override def godotClassName: String = "Shape2D"

  /** Shape2D.set_custom_solver_bias */
  final def setCustomSolverBias(bias: Double): Unit = {
    if (gdext.classes.Shape2D.mb_set_custom_solver_bias == null) gdext.classes.Shape2D.mb_set_custom_solver_bias = MethodBind.get("Shape2D", "set_custom_solver_bias", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Shape2D.mb_set_custom_solver_bias, livePtr, bias)
  }

  /** Shape2D.get_custom_solver_bias */
  final def getCustomSolverBias(): Double = {
    if (gdext.classes.Shape2D.mb_get_custom_solver_bias == null) gdext.classes.Shape2D.mb_get_custom_solver_bias = MethodBind.get("Shape2D", "get_custom_solver_bias", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Shape2D.mb_get_custom_solver_bias, livePtr)
  }

  /** Shape2D.collide */
  final def collide(local_xform: gdext.builtin.Transform2D, with_shape: Shape2D, shape_xform: gdext.builtin.Transform2D): Boolean = {
    if (gdext.classes.Shape2D.mb_collide == null) gdext.classes.Shape2D.mb_collide = MethodBind.get("Shape2D", "collide", 3709843132L)
    Ptrcall.call3[gdext.builtin.Transform2D, GodotObject, gdext.builtin.Transform2D, Boolean](gdext.classes.Shape2D.mb_collide, livePtr, local_xform, Wrappers.handle(with_shape), shape_xform)
  }

  /** Shape2D.collide_with_motion */
  final def collideWithMotion(local_xform: gdext.builtin.Transform2D, local_motion: gdext.builtin.Vector2, with_shape: Shape2D, shape_xform: gdext.builtin.Transform2D, shape_motion: gdext.builtin.Vector2): Boolean = {
    if (gdext.classes.Shape2D.mb_collide_with_motion == null) gdext.classes.Shape2D.mb_collide_with_motion = MethodBind.get("Shape2D", "collide_with_motion", 2869556801L)
    Ptrcall.call5[gdext.builtin.Transform2D, gdext.builtin.Vector2, GodotObject, gdext.builtin.Transform2D, gdext.builtin.Vector2, Boolean](gdext.classes.Shape2D.mb_collide_with_motion, livePtr, local_xform, local_motion, Wrappers.handle(with_shape), shape_xform, shape_motion)
  }

  /** Shape2D.get_rect */
  final def getRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.Shape2D.mb_get_rect == null) gdext.classes.Shape2D.mb_get_rect = MethodBind.get("Shape2D", "get_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.Shape2D.mb_get_rect, livePtr)
  }

}

object Shape2D {
  private[classes] var mb_set_custom_solver_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_solver_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_collide: GDExtensionMethodBindPtr = null
  private[classes] var mb_collide_with_motion: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rect: GDExtensionMethodBindPtr = null
}
