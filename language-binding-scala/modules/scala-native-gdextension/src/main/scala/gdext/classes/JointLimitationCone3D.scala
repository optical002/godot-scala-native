package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `JointLimitationCone3D`, extends `JointLimitation3D`. */
abstract class JointLimitationCone3D extends JointLimitation3D {
  override def godotClassName: String = "JointLimitationCone3D"

  /** JointLimitationCone3D.set_angle */
  final def setAngle(angle: Double): Unit = {
    if (gdext.classes.JointLimitationCone3D.mb_set_angle == null) gdext.classes.JointLimitationCone3D.mb_set_angle = MethodBind.get("JointLimitationCone3D", "set_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.JointLimitationCone3D.mb_set_angle, livePtr, angle)
  }

  /** JointLimitationCone3D.get_angle */
  final def getAngle(): Double = {
    if (gdext.classes.JointLimitationCone3D.mb_get_angle == null) gdext.classes.JointLimitationCone3D.mb_get_angle = MethodBind.get("JointLimitationCone3D", "get_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.JointLimitationCone3D.mb_get_angle, livePtr)
  }

}

object JointLimitationCone3D {
  private[classes] var mb_set_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angle: GDExtensionMethodBindPtr = null
}
