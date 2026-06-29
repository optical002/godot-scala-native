package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SliderJoint3D`, extends `Joint3D`. */
abstract class SliderJoint3D extends Joint3D {
  override def godotClassName: String = "SliderJoint3D"

  /** SliderJoint3D.set_param */
  final def setParam(param: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("SliderJoint3D", "set_param", 918243683L), hostObject.objectPtr, param, value)

  /** SliderJoint3D.get_param */
  final def getParam(param: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("SliderJoint3D", "get_param", 959925627L), hostObject.objectPtr, param)

}
