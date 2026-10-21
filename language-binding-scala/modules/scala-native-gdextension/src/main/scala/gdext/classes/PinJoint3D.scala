package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PinJoint3D`, extends `Joint3D`. */
abstract class PinJoint3D extends Joint3D {
  override def godotClassName: String = "PinJoint3D"

  /** PinJoint3D.set_param */
  final def setParam(param: Long, value: Double): Unit = {
    if (gdext.classes.PinJoint3D.mb_set_param == null) gdext.classes.PinJoint3D.mb_set_param = MethodBind.get("PinJoint3D", "set_param", 2059913726L)
    Ptrcall.callVoid2(gdext.classes.PinJoint3D.mb_set_param, livePtr, param, value)
  }

  /** PinJoint3D.get_param */
  final def getParam(param: Long): Double = {
    if (gdext.classes.PinJoint3D.mb_get_param == null) gdext.classes.PinJoint3D.mb_get_param = MethodBind.get("PinJoint3D", "get_param", 1758438771L)
    Ptrcall.call1[Long, Double](gdext.classes.PinJoint3D.mb_get_param, livePtr, param)
  }

}

object PinJoint3D {
  private[classes] var mb_set_param: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param: GDExtensionMethodBindPtr = null
}
