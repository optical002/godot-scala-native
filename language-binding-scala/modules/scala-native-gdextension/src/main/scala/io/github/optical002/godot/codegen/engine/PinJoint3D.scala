package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PinJoint3D`, extends `Joint3D`. */
abstract class PinJoint3D extends Joint3D {

  /** PinJoint3D.set_param */
  final def setParam(param: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("PinJoint3D", "set_param", 2059913726L), hostObject.objectPtr, param, value)

  /** PinJoint3D.get_param */
  final def getParam(param: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("PinJoint3D", "get_param", 1758438771L), hostObject.objectPtr, param)

}

object PinJoint3D {
  /** Class metadata for Gd[PinJoint3D] lifetime management and casting. */
  given GodotClass[PinJoint3D] with {
    def className = "PinJoint3D"
    def isRefCounted = false
    def wrap(o: GodotObject): PinJoint3D = new PinJoint3D {}.withHost(o.objectPtr)
    def unwrap(t: PinJoint3D): GodotObject = t.hostObject
  }
}
