package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Shape3D`, extends `Resource`. */
abstract class Shape3D extends Resource {
  override def godotClassName: String = "Shape3D"

  /** Shape3D.set_custom_solver_bias */
  final def setCustomSolverBias(bias: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Shape3D", "set_custom_solver_bias", 373806689L), hostObject.objectPtr, bias)

  /** Shape3D.get_custom_solver_bias */
  final def getCustomSolverBias(): Double =
    Ptrcall.call0[Double](MethodBind.get("Shape3D", "get_custom_solver_bias", 1740695150L), hostObject.objectPtr)

  /** Shape3D.set_margin */
  final def setMargin(margin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Shape3D", "set_margin", 373806689L), hostObject.objectPtr, margin)

  /** Shape3D.get_margin */
  final def getMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("Shape3D", "get_margin", 1740695150L), hostObject.objectPtr)

  /** Shape3D.get_debug_mesh */
  final def getDebugMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Shape3D", "get_debug_mesh", 1605880883L), hostObject.objectPtr)

}
