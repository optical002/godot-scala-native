package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Shape3D`, extends `Resource`. */
abstract class Shape3D extends Resource {
  override def godotClassName: String = "Shape3D"

  /** Shape3D.set_custom_solver_bias */
  final def setCustomSolverBias(bias: Double): Unit = {
    if (gdext.classes.Shape3D.mb_set_custom_solver_bias == null) gdext.classes.Shape3D.mb_set_custom_solver_bias = MethodBind.get("Shape3D", "set_custom_solver_bias", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Shape3D.mb_set_custom_solver_bias, livePtr, bias)
  }

  /** Shape3D.get_custom_solver_bias */
  final def getCustomSolverBias(): Double = {
    if (gdext.classes.Shape3D.mb_get_custom_solver_bias == null) gdext.classes.Shape3D.mb_get_custom_solver_bias = MethodBind.get("Shape3D", "get_custom_solver_bias", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Shape3D.mb_get_custom_solver_bias, livePtr)
  }

  /** Shape3D.set_margin */
  final def setMargin(margin: Double): Unit = {
    if (gdext.classes.Shape3D.mb_set_margin == null) gdext.classes.Shape3D.mb_set_margin = MethodBind.get("Shape3D", "set_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Shape3D.mb_set_margin, livePtr, margin)
  }

  /** Shape3D.get_margin */
  final def getMargin(): Double = {
    if (gdext.classes.Shape3D.mb_get_margin == null) gdext.classes.Shape3D.mb_get_margin = MethodBind.get("Shape3D", "get_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Shape3D.mb_get_margin, livePtr)
  }

  /** Shape3D.get_debug_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getDebugMesh(): ArrayMesh = {
    if (gdext.classes.Shape3D.mb_get_debug_mesh == null) gdext.classes.Shape3D.mb_get_debug_mesh = MethodBind.get("Shape3D", "get_debug_mesh", 1605880883L)
    Wrappers.owned[ArrayMesh](Ptrcall.call0[Long](gdext.classes.Shape3D.mb_get_debug_mesh, livePtr))
  }

}

object Shape3D {
  private[classes] var mb_set_custom_solver_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_solver_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_debug_mesh: GDExtensionMethodBindPtr = null
}
