package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Generic6DOFJoint3D`, extends `Joint3D`. */
abstract class Generic6DOFJoint3D extends Joint3D {
  override def godotClassName: String = "Generic6DOFJoint3D"

  /** Generic6DOFJoint3D.set_param_x */
  final def setParamX(param: gdext.classes.Generic6DOFJoint3D.Param, value: Double): Unit = {
    if (gdext.classes.Generic6DOFJoint3D.mb_set_param_x == null) gdext.classes.Generic6DOFJoint3D.mb_set_param_x = MethodBind.get("Generic6DOFJoint3D", "set_param_x", 2018184242L)
    Ptrcall.callVoid2(gdext.classes.Generic6DOFJoint3D.mb_set_param_x, livePtr, param, value)
  }

  /** Generic6DOFJoint3D.get_param_x */
  final def getParamX(param: gdext.classes.Generic6DOFJoint3D.Param): Double = {
    if (gdext.classes.Generic6DOFJoint3D.mb_get_param_x == null) gdext.classes.Generic6DOFJoint3D.mb_get_param_x = MethodBind.get("Generic6DOFJoint3D", "get_param_x", 2599835054L)
    Ptrcall.call1[Long, Double](gdext.classes.Generic6DOFJoint3D.mb_get_param_x, livePtr, param)
  }

  /** Generic6DOFJoint3D.set_param_y */
  final def setParamY(param: gdext.classes.Generic6DOFJoint3D.Param, value: Double): Unit = {
    if (gdext.classes.Generic6DOFJoint3D.mb_set_param_y == null) gdext.classes.Generic6DOFJoint3D.mb_set_param_y = MethodBind.get("Generic6DOFJoint3D", "set_param_y", 2018184242L)
    Ptrcall.callVoid2(gdext.classes.Generic6DOFJoint3D.mb_set_param_y, livePtr, param, value)
  }

  /** Generic6DOFJoint3D.get_param_y */
  final def getParamY(param: gdext.classes.Generic6DOFJoint3D.Param): Double = {
    if (gdext.classes.Generic6DOFJoint3D.mb_get_param_y == null) gdext.classes.Generic6DOFJoint3D.mb_get_param_y = MethodBind.get("Generic6DOFJoint3D", "get_param_y", 2599835054L)
    Ptrcall.call1[Long, Double](gdext.classes.Generic6DOFJoint3D.mb_get_param_y, livePtr, param)
  }

  /** Generic6DOFJoint3D.set_param_z */
  final def setParamZ(param: gdext.classes.Generic6DOFJoint3D.Param, value: Double): Unit = {
    if (gdext.classes.Generic6DOFJoint3D.mb_set_param_z == null) gdext.classes.Generic6DOFJoint3D.mb_set_param_z = MethodBind.get("Generic6DOFJoint3D", "set_param_z", 2018184242L)
    Ptrcall.callVoid2(gdext.classes.Generic6DOFJoint3D.mb_set_param_z, livePtr, param, value)
  }

  /** Generic6DOFJoint3D.get_param_z */
  final def getParamZ(param: gdext.classes.Generic6DOFJoint3D.Param): Double = {
    if (gdext.classes.Generic6DOFJoint3D.mb_get_param_z == null) gdext.classes.Generic6DOFJoint3D.mb_get_param_z = MethodBind.get("Generic6DOFJoint3D", "get_param_z", 2599835054L)
    Ptrcall.call1[Long, Double](gdext.classes.Generic6DOFJoint3D.mb_get_param_z, livePtr, param)
  }

  /** Generic6DOFJoint3D.set_flag_x */
  final def setFlagX(flag: gdext.classes.Generic6DOFJoint3D.Flag, value: Boolean): Unit = {
    if (gdext.classes.Generic6DOFJoint3D.mb_set_flag_x == null) gdext.classes.Generic6DOFJoint3D.mb_set_flag_x = MethodBind.get("Generic6DOFJoint3D", "set_flag_x", 2451594564L)
    Ptrcall.callVoid2(gdext.classes.Generic6DOFJoint3D.mb_set_flag_x, livePtr, flag, value)
  }

  /** Generic6DOFJoint3D.get_flag_x */
  final def getFlagX(flag: gdext.classes.Generic6DOFJoint3D.Flag): Boolean = {
    if (gdext.classes.Generic6DOFJoint3D.mb_get_flag_x == null) gdext.classes.Generic6DOFJoint3D.mb_get_flag_x = MethodBind.get("Generic6DOFJoint3D", "get_flag_x", 2122427807L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Generic6DOFJoint3D.mb_get_flag_x, livePtr, flag)
  }

  /** Generic6DOFJoint3D.set_flag_y */
  final def setFlagY(flag: gdext.classes.Generic6DOFJoint3D.Flag, value: Boolean): Unit = {
    if (gdext.classes.Generic6DOFJoint3D.mb_set_flag_y == null) gdext.classes.Generic6DOFJoint3D.mb_set_flag_y = MethodBind.get("Generic6DOFJoint3D", "set_flag_y", 2451594564L)
    Ptrcall.callVoid2(gdext.classes.Generic6DOFJoint3D.mb_set_flag_y, livePtr, flag, value)
  }

  /** Generic6DOFJoint3D.get_flag_y */
  final def getFlagY(flag: gdext.classes.Generic6DOFJoint3D.Flag): Boolean = {
    if (gdext.classes.Generic6DOFJoint3D.mb_get_flag_y == null) gdext.classes.Generic6DOFJoint3D.mb_get_flag_y = MethodBind.get("Generic6DOFJoint3D", "get_flag_y", 2122427807L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Generic6DOFJoint3D.mb_get_flag_y, livePtr, flag)
  }

  /** Generic6DOFJoint3D.set_flag_z */
  final def setFlagZ(flag: gdext.classes.Generic6DOFJoint3D.Flag, value: Boolean): Unit = {
    if (gdext.classes.Generic6DOFJoint3D.mb_set_flag_z == null) gdext.classes.Generic6DOFJoint3D.mb_set_flag_z = MethodBind.get("Generic6DOFJoint3D", "set_flag_z", 2451594564L)
    Ptrcall.callVoid2(gdext.classes.Generic6DOFJoint3D.mb_set_flag_z, livePtr, flag, value)
  }

  /** Generic6DOFJoint3D.get_flag_z */
  final def getFlagZ(flag: gdext.classes.Generic6DOFJoint3D.Flag): Boolean = {
    if (gdext.classes.Generic6DOFJoint3D.mb_get_flag_z == null) gdext.classes.Generic6DOFJoint3D.mb_get_flag_z = MethodBind.get("Generic6DOFJoint3D", "get_flag_z", 2122427807L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Generic6DOFJoint3D.mb_get_flag_z, livePtr, flag)
  }

}

object Generic6DOFJoint3D {
  private[classes] var mb_set_param_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_param_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_param_z: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param_z: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flag_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flag_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flag_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flag_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flag_z: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flag_z: GDExtensionMethodBindPtr = null

  /** Godot enum `Generic6DOFJoint3D.Param`. */
  opaque type Param <: Long = Long

  object Param {
    final val LinearLowerLimit: Param = 0L.asInstanceOf[Param]
    final val LinearUpperLimit: Param = 1L.asInstanceOf[Param]
    final val LinearLimitSoftness: Param = 2L.asInstanceOf[Param]
    final val LinearRestitution: Param = 3L.asInstanceOf[Param]
    final val LinearDamping: Param = 4L.asInstanceOf[Param]
    final val LinearMotorTargetVelocity: Param = 5L.asInstanceOf[Param]
    final val LinearMotorForceLimit: Param = 6L.asInstanceOf[Param]
    final val LinearSpringStiffness: Param = 7L.asInstanceOf[Param]
    final val LinearSpringDamping: Param = 8L.asInstanceOf[Param]
    final val LinearSpringEquilibriumPoint: Param = 9L.asInstanceOf[Param]
    final val AngularLowerLimit: Param = 10L.asInstanceOf[Param]
    final val AngularUpperLimit: Param = 11L.asInstanceOf[Param]
    final val AngularLimitSoftness: Param = 12L.asInstanceOf[Param]
    final val AngularDamping: Param = 13L.asInstanceOf[Param]
    final val AngularRestitution: Param = 14L.asInstanceOf[Param]
    final val AngularForceLimit: Param = 15L.asInstanceOf[Param]
    final val AngularErp: Param = 16L.asInstanceOf[Param]
    final val AngularMotorTargetVelocity: Param = 17L.asInstanceOf[Param]
    final val AngularMotorForceLimit: Param = 18L.asInstanceOf[Param]
    final val AngularSpringStiffness: Param = 19L.asInstanceOf[Param]
    final val AngularSpringDamping: Param = 20L.asInstanceOf[Param]
    final val AngularSpringEquilibriumPoint: Param = 21L.asInstanceOf[Param]
    final val Max: Param = 22L.asInstanceOf[Param]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Param = value.asInstanceOf[Param]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Param] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L).asInstanceOf[scala.IArray[Param]]

    extension (self: Param)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "LinearLowerLimit"
        case 1L => "LinearUpperLimit"
        case 2L => "LinearLimitSoftness"
        case 3L => "LinearRestitution"
        case 4L => "LinearDamping"
        case 5L => "LinearMotorTargetVelocity"
        case 6L => "LinearMotorForceLimit"
        case 7L => "LinearSpringStiffness"
        case 8L => "LinearSpringDamping"
        case 9L => "LinearSpringEquilibriumPoint"
        case 10L => "AngularLowerLimit"
        case 11L => "AngularUpperLimit"
        case 12L => "AngularLimitSoftness"
        case 13L => "AngularDamping"
        case 14L => "AngularRestitution"
        case 15L => "AngularForceLimit"
        case 16L => "AngularErp"
        case 17L => "AngularMotorTargetVelocity"
        case 18L => "AngularMotorForceLimit"
        case 19L => "AngularSpringStiffness"
        case 20L => "AngularSpringDamping"
        case 21L => "AngularSpringEquilibriumPoint"
        case 22L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `Generic6DOFJoint3D.Flag`. */
  opaque type Flag <: Long = Long

  object Flag {
    final val EnableLinearLimit: Flag = 0L.asInstanceOf[Flag]
    final val EnableAngularLimit: Flag = 1L.asInstanceOf[Flag]
    final val EnableLinearSpring: Flag = 3L.asInstanceOf[Flag]
    final val EnableAngularSpring: Flag = 2L.asInstanceOf[Flag]
    final val EnableMotor: Flag = 4L.asInstanceOf[Flag]
    final val EnableLinearMotor: Flag = 5L.asInstanceOf[Flag]
    final val Max: Flag = 6L.asInstanceOf[Flag]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Flag = value.asInstanceOf[Flag]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Flag] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[Flag]]

    extension (self: Flag)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "EnableLinearLimit"
        case 1L => "EnableAngularLimit"
        case 2L => "EnableAngularSpring"
        case 3L => "EnableLinearSpring"
        case 4L => "EnableMotor"
        case 5L => "EnableLinearMotor"
        case 6L => "Max"
        case other => other.toString
      }
  }
}
