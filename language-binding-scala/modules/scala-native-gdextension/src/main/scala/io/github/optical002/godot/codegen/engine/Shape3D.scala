package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Shape3D`, extends `Resource`. */
abstract class Shape3D extends Resource {

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

object Shape3D {
  /** Class metadata for Gd[Shape3D] lifetime management and casting. */
  given GodotClass[Shape3D] with {
    def className = "Shape3D"
    def isRefCounted = true
    def wrap(o: GodotObject): Shape3D = new Shape3D {}.withHost(o.objectPtr)
    def unwrap(t: Shape3D): GodotObject = t.hostObject
  }
}
