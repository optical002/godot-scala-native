package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `HingeJoint3D`, extends `Joint3D`. */
abstract class HingeJoint3D extends Joint3D {
  override def godotClassName: String = "HingeJoint3D"

  /** HingeJoint3D.set_param */
  final def setParam(param: gdext.classes.HingeJoint3D.Param, value: Double): Unit = {
    if (gdext.classes.HingeJoint3D.mb_set_param == null) gdext.classes.HingeJoint3D.mb_set_param = MethodBind.get("HingeJoint3D", "set_param", 3082977519L)
    Ptrcall.callVoid2(gdext.classes.HingeJoint3D.mb_set_param, livePtr, param, value)
  }

  /** HingeJoint3D.get_param */
  final def getParam(param: gdext.classes.HingeJoint3D.Param): Double = {
    if (gdext.classes.HingeJoint3D.mb_get_param == null) gdext.classes.HingeJoint3D.mb_get_param = MethodBind.get("HingeJoint3D", "get_param", 4066002676L)
    Ptrcall.call1[Long, Double](gdext.classes.HingeJoint3D.mb_get_param, livePtr, param)
  }

  /** HingeJoint3D.set_flag */
  final def setFlag(flag: gdext.classes.HingeJoint3D.Flag, enabled: Boolean): Unit = {
    if (gdext.classes.HingeJoint3D.mb_set_flag == null) gdext.classes.HingeJoint3D.mb_set_flag = MethodBind.get("HingeJoint3D", "set_flag", 1083494620L)
    Ptrcall.callVoid2(gdext.classes.HingeJoint3D.mb_set_flag, livePtr, flag, enabled)
  }

  /** HingeJoint3D.get_flag */
  final def getFlag(flag: gdext.classes.HingeJoint3D.Flag): Boolean = {
    if (gdext.classes.HingeJoint3D.mb_get_flag == null) gdext.classes.HingeJoint3D.mb_get_flag = MethodBind.get("HingeJoint3D", "get_flag", 2841369610L)
    Ptrcall.call1[Long, Boolean](gdext.classes.HingeJoint3D.mb_get_flag, livePtr, flag)
  }

}

object HingeJoint3D {
  private[classes] var mb_set_param: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flag: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flag: GDExtensionMethodBindPtr = null

  /** Godot enum `HingeJoint3D.Param`. */
  opaque type Param <: Long = Long

  object Param {
    final val Bias: Param = 0L.asInstanceOf[Param]
    final val LimitUpper: Param = 1L.asInstanceOf[Param]
    final val LimitLower: Param = 2L.asInstanceOf[Param]
    final val LimitBias: Param = 3L.asInstanceOf[Param]
    final val LimitSoftness: Param = 4L.asInstanceOf[Param]
    final val LimitRelaxation: Param = 5L.asInstanceOf[Param]
    final val MotorTargetVelocity: Param = 6L.asInstanceOf[Param]
    final val MotorMaxImpulse: Param = 7L.asInstanceOf[Param]
    final val Max: Param = 8L.asInstanceOf[Param]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Param = value.asInstanceOf[Param]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Param] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L).asInstanceOf[scala.IArray[Param]]

    extension (self: Param)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Bias"
        case 1L => "LimitUpper"
        case 2L => "LimitLower"
        case 3L => "LimitBias"
        case 4L => "LimitSoftness"
        case 5L => "LimitRelaxation"
        case 6L => "MotorTargetVelocity"
        case 7L => "MotorMaxImpulse"
        case 8L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `HingeJoint3D.Flag`. */
  opaque type Flag <: Long = Long

  object Flag {
    final val UseLimit: Flag = 0L.asInstanceOf[Flag]
    final val EnableMotor: Flag = 1L.asInstanceOf[Flag]
    final val Max: Flag = 2L.asInstanceOf[Flag]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Flag = value.asInstanceOf[Flag]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Flag] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[Flag]]

    extension (self: Flag)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "UseLimit"
        case 1L => "EnableMotor"
        case 2L => "Max"
        case other => other.toString
      }
  }
}
