package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ConeTwistJoint3D`, extends `Joint3D`. */
abstract class ConeTwistJoint3D extends Joint3D {

  /** ConeTwistJoint3D.set_param */
  final def setParam(param: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("ConeTwistJoint3D", "set_param", 1062470226L), hostObject.objectPtr, param, value)

  /** ConeTwistJoint3D.get_param */
  final def getParam(param: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("ConeTwistJoint3D", "get_param", 2928790850L), hostObject.objectPtr, param)

}

object ConeTwistJoint3D {
  /** Class metadata for Gd[ConeTwistJoint3D] lifetime management and casting. */
  given GodotClass[ConeTwistJoint3D] with {
    def className = "ConeTwistJoint3D"
    def isRefCounted = false
    def wrap(o: GodotObject): ConeTwistJoint3D = new ConeTwistJoint3D {}.withHost(o.objectPtr)
    def unwrap(t: ConeTwistJoint3D): GodotObject = t.hostObject
  }
}
