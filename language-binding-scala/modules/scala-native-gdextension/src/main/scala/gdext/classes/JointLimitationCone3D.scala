package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `JointLimitationCone3D`, extends `JointLimitation3D`. */
abstract class JointLimitationCone3D extends JointLimitation3D {

  /** JointLimitationCone3D.set_angle */
  final def setAngle(angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("JointLimitationCone3D", "set_angle", 373806689L), hostObject.objectPtr, angle)

  /** JointLimitationCone3D.get_angle */
  final def getAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("JointLimitationCone3D", "get_angle", 1740695150L), hostObject.objectPtr)

}

object JointLimitationCone3D {
  /** Class metadata for Gd[JointLimitationCone3D] lifetime management and casting. */
  given GodotClass[JointLimitationCone3D] with {
    def className = "JointLimitationCone3D"
    def isRefCounted = true
    def wrap(o: GodotObject): JointLimitationCone3D = new JointLimitationCone3D {}.withHost(o.objectPtr)
    def unwrap(t: JointLimitationCone3D): GodotObject = t.hostObject
  }
}
