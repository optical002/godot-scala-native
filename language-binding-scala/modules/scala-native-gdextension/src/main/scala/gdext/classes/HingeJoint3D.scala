package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `HingeJoint3D`, extends `Joint3D`. */
abstract class HingeJoint3D extends Joint3D {
  override def godotClassName: String = "HingeJoint3D"

  /** HingeJoint3D.set_param */
  final def setParam(param: Long, value: Double): Unit = {
    if (gdext.classes.HingeJoint3D.mb_set_param == null) gdext.classes.HingeJoint3D.mb_set_param = MethodBind.get("HingeJoint3D", "set_param", 3082977519L)
    Ptrcall.callVoid2(gdext.classes.HingeJoint3D.mb_set_param, livePtr, param, value)
  }

  /** HingeJoint3D.get_param */
  final def getParam(param: Long): Double = {
    if (gdext.classes.HingeJoint3D.mb_get_param == null) gdext.classes.HingeJoint3D.mb_get_param = MethodBind.get("HingeJoint3D", "get_param", 4066002676L)
    Ptrcall.call1[Long, Double](gdext.classes.HingeJoint3D.mb_get_param, livePtr, param)
  }

  /** HingeJoint3D.set_flag */
  final def setFlag(flag: Long, enabled: Boolean): Unit = {
    if (gdext.classes.HingeJoint3D.mb_set_flag == null) gdext.classes.HingeJoint3D.mb_set_flag = MethodBind.get("HingeJoint3D", "set_flag", 1083494620L)
    Ptrcall.callVoid2(gdext.classes.HingeJoint3D.mb_set_flag, livePtr, flag, enabled)
  }

  /** HingeJoint3D.get_flag */
  final def getFlag(flag: Long): Boolean = {
    if (gdext.classes.HingeJoint3D.mb_get_flag == null) gdext.classes.HingeJoint3D.mb_get_flag = MethodBind.get("HingeJoint3D", "get_flag", 2841369610L)
    Ptrcall.call1[Long, Boolean](gdext.classes.HingeJoint3D.mb_get_flag, livePtr, flag)
  }

}

object HingeJoint3D {
  private[classes] var mb_set_param: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flag: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flag: GDExtensionMethodBindPtr = null
}
