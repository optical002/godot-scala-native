package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ConeTwistJoint3D`, extends `Joint3D`. */
abstract class ConeTwistJoint3D extends Joint3D {
  override def godotClassName: String = "ConeTwistJoint3D"

  /** ConeTwistJoint3D.set_param */
  final def setParam(param: Long, value: Double): Unit = {
    if (gdext.classes.ConeTwistJoint3D.mb_set_param == null) gdext.classes.ConeTwistJoint3D.mb_set_param = MethodBind.get("ConeTwistJoint3D", "set_param", 1062470226L)
    Ptrcall.callVoid2(gdext.classes.ConeTwistJoint3D.mb_set_param, livePtr, param, value)
  }

  /** ConeTwistJoint3D.get_param */
  final def getParam(param: Long): Double = {
    if (gdext.classes.ConeTwistJoint3D.mb_get_param == null) gdext.classes.ConeTwistJoint3D.mb_get_param = MethodBind.get("ConeTwistJoint3D", "get_param", 2928790850L)
    Ptrcall.call1[Long, Double](gdext.classes.ConeTwistJoint3D.mb_get_param, livePtr, param)
  }

}

object ConeTwistJoint3D {
  private[classes] var mb_set_param: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param: GDExtensionMethodBindPtr = null
}
