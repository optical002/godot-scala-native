package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SliderJoint3D`, extends `Joint3D`. */
abstract class SliderJoint3D extends Joint3D {
  override def godotClassName: String = "SliderJoint3D"

  /** SliderJoint3D.set_param */
  final def setParam(param: Long, value: Double): Unit = {
    if (gdext.classes.SliderJoint3D.mb_set_param == null) gdext.classes.SliderJoint3D.mb_set_param = MethodBind.get("SliderJoint3D", "set_param", 918243683L)
    Ptrcall.callVoid2(gdext.classes.SliderJoint3D.mb_set_param, livePtr, param, value)
  }

  /** SliderJoint3D.get_param */
  final def getParam(param: Long): Double = {
    if (gdext.classes.SliderJoint3D.mb_get_param == null) gdext.classes.SliderJoint3D.mb_get_param = MethodBind.get("SliderJoint3D", "get_param", 959925627L)
    Ptrcall.call1[Long, Double](gdext.classes.SliderJoint3D.mb_get_param, livePtr, param)
  }

}

object SliderJoint3D {
  private[classes] var mb_set_param: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param: GDExtensionMethodBindPtr = null
}
