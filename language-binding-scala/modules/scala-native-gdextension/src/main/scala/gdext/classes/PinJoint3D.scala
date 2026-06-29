package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PinJoint3D`, extends `Joint3D`. */
abstract class PinJoint3D extends Joint3D {
  override def godotClassName: String = "PinJoint3D"

  /** PinJoint3D.set_param */
  final def setParam(param: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("PinJoint3D", "set_param", 2059913726L), hostObject.objectPtr, param, value)

  /** PinJoint3D.get_param */
  final def getParam(param: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("PinJoint3D", "get_param", 1758438771L), hostObject.objectPtr, param)

}
