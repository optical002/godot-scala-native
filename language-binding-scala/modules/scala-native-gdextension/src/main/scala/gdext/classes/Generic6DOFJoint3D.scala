package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Generic6DOFJoint3D`, extends `Joint3D`. */
abstract class Generic6DOFJoint3D extends Joint3D {
  override def godotClassName: String = "Generic6DOFJoint3D"

  /** Generic6DOFJoint3D.set_param_x */
  final def setParamX(param: Long, value: Double): Unit = {
    if (gdext.classes.Generic6DOFJoint3D.mb_set_param_x == null) gdext.classes.Generic6DOFJoint3D.mb_set_param_x = MethodBind.get("Generic6DOFJoint3D", "set_param_x", 2018184242L)
    Ptrcall.callVoid2(gdext.classes.Generic6DOFJoint3D.mb_set_param_x, livePtr, param, value)
  }

  /** Generic6DOFJoint3D.get_param_x */
  final def getParamX(param: Long): Double = {
    if (gdext.classes.Generic6DOFJoint3D.mb_get_param_x == null) gdext.classes.Generic6DOFJoint3D.mb_get_param_x = MethodBind.get("Generic6DOFJoint3D", "get_param_x", 2599835054L)
    Ptrcall.call1[Long, Double](gdext.classes.Generic6DOFJoint3D.mb_get_param_x, livePtr, param)
  }

  /** Generic6DOFJoint3D.set_param_y */
  final def setParamY(param: Long, value: Double): Unit = {
    if (gdext.classes.Generic6DOFJoint3D.mb_set_param_y == null) gdext.classes.Generic6DOFJoint3D.mb_set_param_y = MethodBind.get("Generic6DOFJoint3D", "set_param_y", 2018184242L)
    Ptrcall.callVoid2(gdext.classes.Generic6DOFJoint3D.mb_set_param_y, livePtr, param, value)
  }

  /** Generic6DOFJoint3D.get_param_y */
  final def getParamY(param: Long): Double = {
    if (gdext.classes.Generic6DOFJoint3D.mb_get_param_y == null) gdext.classes.Generic6DOFJoint3D.mb_get_param_y = MethodBind.get("Generic6DOFJoint3D", "get_param_y", 2599835054L)
    Ptrcall.call1[Long, Double](gdext.classes.Generic6DOFJoint3D.mb_get_param_y, livePtr, param)
  }

  /** Generic6DOFJoint3D.set_param_z */
  final def setParamZ(param: Long, value: Double): Unit = {
    if (gdext.classes.Generic6DOFJoint3D.mb_set_param_z == null) gdext.classes.Generic6DOFJoint3D.mb_set_param_z = MethodBind.get("Generic6DOFJoint3D", "set_param_z", 2018184242L)
    Ptrcall.callVoid2(gdext.classes.Generic6DOFJoint3D.mb_set_param_z, livePtr, param, value)
  }

  /** Generic6DOFJoint3D.get_param_z */
  final def getParamZ(param: Long): Double = {
    if (gdext.classes.Generic6DOFJoint3D.mb_get_param_z == null) gdext.classes.Generic6DOFJoint3D.mb_get_param_z = MethodBind.get("Generic6DOFJoint3D", "get_param_z", 2599835054L)
    Ptrcall.call1[Long, Double](gdext.classes.Generic6DOFJoint3D.mb_get_param_z, livePtr, param)
  }

  /** Generic6DOFJoint3D.set_flag_x */
  final def setFlagX(flag: Long, value: Boolean): Unit = {
    if (gdext.classes.Generic6DOFJoint3D.mb_set_flag_x == null) gdext.classes.Generic6DOFJoint3D.mb_set_flag_x = MethodBind.get("Generic6DOFJoint3D", "set_flag_x", 2451594564L)
    Ptrcall.callVoid2(gdext.classes.Generic6DOFJoint3D.mb_set_flag_x, livePtr, flag, value)
  }

  /** Generic6DOFJoint3D.get_flag_x */
  final def getFlagX(flag: Long): Boolean = {
    if (gdext.classes.Generic6DOFJoint3D.mb_get_flag_x == null) gdext.classes.Generic6DOFJoint3D.mb_get_flag_x = MethodBind.get("Generic6DOFJoint3D", "get_flag_x", 2122427807L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Generic6DOFJoint3D.mb_get_flag_x, livePtr, flag)
  }

  /** Generic6DOFJoint3D.set_flag_y */
  final def setFlagY(flag: Long, value: Boolean): Unit = {
    if (gdext.classes.Generic6DOFJoint3D.mb_set_flag_y == null) gdext.classes.Generic6DOFJoint3D.mb_set_flag_y = MethodBind.get("Generic6DOFJoint3D", "set_flag_y", 2451594564L)
    Ptrcall.callVoid2(gdext.classes.Generic6DOFJoint3D.mb_set_flag_y, livePtr, flag, value)
  }

  /** Generic6DOFJoint3D.get_flag_y */
  final def getFlagY(flag: Long): Boolean = {
    if (gdext.classes.Generic6DOFJoint3D.mb_get_flag_y == null) gdext.classes.Generic6DOFJoint3D.mb_get_flag_y = MethodBind.get("Generic6DOFJoint3D", "get_flag_y", 2122427807L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Generic6DOFJoint3D.mb_get_flag_y, livePtr, flag)
  }

  /** Generic6DOFJoint3D.set_flag_z */
  final def setFlagZ(flag: Long, value: Boolean): Unit = {
    if (gdext.classes.Generic6DOFJoint3D.mb_set_flag_z == null) gdext.classes.Generic6DOFJoint3D.mb_set_flag_z = MethodBind.get("Generic6DOFJoint3D", "set_flag_z", 2451594564L)
    Ptrcall.callVoid2(gdext.classes.Generic6DOFJoint3D.mb_set_flag_z, livePtr, flag, value)
  }

  /** Generic6DOFJoint3D.get_flag_z */
  final def getFlagZ(flag: Long): Boolean = {
    if (gdext.classes.Generic6DOFJoint3D.mb_get_flag_z == null) gdext.classes.Generic6DOFJoint3D.mb_get_flag_z = MethodBind.get("Generic6DOFJoint3D", "get_flag_z", 2122427807L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Generic6DOFJoint3D.mb_get_flag_z, livePtr, flag)
  }

}

object Generic6DOFJoint3D {
  private[classes] var mb_set_param_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_param_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_param_z: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param_z: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flag_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flag_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flag_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flag_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flag_z: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flag_z: GDExtensionMethodBindPtr = null
}
