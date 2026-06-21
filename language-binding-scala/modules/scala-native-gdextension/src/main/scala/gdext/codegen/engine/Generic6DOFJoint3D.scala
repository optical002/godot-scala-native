package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Generic6DOFJoint3D`, extends `Joint3D`. */
abstract class Generic6DOFJoint3D extends Joint3D {

  /** Generic6DOFJoint3D.set_param_x */
  final def setParamX(param: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Generic6DOFJoint3D", "set_param_x", 2018184242L), hostObject.objectPtr, param, value)

  /** Generic6DOFJoint3D.get_param_x */
  final def getParamX(param: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Generic6DOFJoint3D", "get_param_x", 2599835054L), hostObject.objectPtr, param)

  /** Generic6DOFJoint3D.set_param_y */
  final def setParamY(param: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Generic6DOFJoint3D", "set_param_y", 2018184242L), hostObject.objectPtr, param, value)

  /** Generic6DOFJoint3D.get_param_y */
  final def getParamY(param: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Generic6DOFJoint3D", "get_param_y", 2599835054L), hostObject.objectPtr, param)

  /** Generic6DOFJoint3D.set_param_z */
  final def setParamZ(param: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Generic6DOFJoint3D", "set_param_z", 2018184242L), hostObject.objectPtr, param, value)

  /** Generic6DOFJoint3D.get_param_z */
  final def getParamZ(param: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Generic6DOFJoint3D", "get_param_z", 2599835054L), hostObject.objectPtr, param)

  /** Generic6DOFJoint3D.set_flag_x */
  final def setFlagX(flag: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Generic6DOFJoint3D", "set_flag_x", 2451594564L), hostObject.objectPtr, flag, value)

  /** Generic6DOFJoint3D.get_flag_x */
  final def getFlagX(flag: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Generic6DOFJoint3D", "get_flag_x", 2122427807L), hostObject.objectPtr, flag)

  /** Generic6DOFJoint3D.set_flag_y */
  final def setFlagY(flag: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Generic6DOFJoint3D", "set_flag_y", 2451594564L), hostObject.objectPtr, flag, value)

  /** Generic6DOFJoint3D.get_flag_y */
  final def getFlagY(flag: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Generic6DOFJoint3D", "get_flag_y", 2122427807L), hostObject.objectPtr, flag)

  /** Generic6DOFJoint3D.set_flag_z */
  final def setFlagZ(flag: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Generic6DOFJoint3D", "set_flag_z", 2451594564L), hostObject.objectPtr, flag, value)

  /** Generic6DOFJoint3D.get_flag_z */
  final def getFlagZ(flag: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Generic6DOFJoint3D", "get_flag_z", 2122427807L), hostObject.objectPtr, flag)

}

object Generic6DOFJoint3D {
  /** Class metadata for Gd[Generic6DOFJoint3D] lifetime management and casting. */
  given GodotClass[Generic6DOFJoint3D] with {
    def className = "Generic6DOFJoint3D"
    def isRefCounted = false
    def wrap(o: GodotObject): Generic6DOFJoint3D = new Generic6DOFJoint3D {}.withHost(o.objectPtr)
    def unwrap(t: Generic6DOFJoint3D): GodotObject = t.hostObject
  }
}
