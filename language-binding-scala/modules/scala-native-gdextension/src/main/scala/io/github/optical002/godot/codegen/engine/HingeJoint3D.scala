package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `HingeJoint3D`, extends `Joint3D`. */
abstract class HingeJoint3D extends Joint3D {

  /** HingeJoint3D.set_param */
  final def setParam(param: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("HingeJoint3D", "set_param", 3082977519L), hostObject.objectPtr, param, value)

  /** HingeJoint3D.get_param */
  final def getParam(param: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("HingeJoint3D", "get_param", 4066002676L), hostObject.objectPtr, param)

  /** HingeJoint3D.set_flag */
  final def setFlag(flag: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("HingeJoint3D", "set_flag", 1083494620L), hostObject.objectPtr, flag, enabled)

  /** HingeJoint3D.get_flag */
  final def getFlag(flag: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("HingeJoint3D", "get_flag", 2841369610L), hostObject.objectPtr, flag)

}

object HingeJoint3D {
  /** Class metadata for Gd[HingeJoint3D] lifetime management and casting. */
  given GodotClass[HingeJoint3D] with {
    def className = "HingeJoint3D"
    def isRefCounted = false
    def wrap(o: GodotObject): HingeJoint3D = new HingeJoint3D {}.withHost(o.objectPtr)
    def unwrap(t: HingeJoint3D): GodotObject = t.hostObject
  }
}
