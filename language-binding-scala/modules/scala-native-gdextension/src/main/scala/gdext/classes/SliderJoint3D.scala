package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SliderJoint3D`, extends `Joint3D`. */
abstract class SliderJoint3D extends Joint3D {
  override def godotClassName: String = "SliderJoint3D"

  /** SliderJoint3D.set_param */
  final def setParam(param: gdext.classes.SliderJoint3D.Param, value: Double): Unit = {
    if (gdext.classes.SliderJoint3D.mb_set_param == null) gdext.classes.SliderJoint3D.mb_set_param = MethodBind.get("SliderJoint3D", "set_param", 918243683L)
    Ptrcall.callVoid2(gdext.classes.SliderJoint3D.mb_set_param, livePtr, param, value)
  }

  /** SliderJoint3D.get_param */
  final def getParam(param: gdext.classes.SliderJoint3D.Param): Double = {
    if (gdext.classes.SliderJoint3D.mb_get_param == null) gdext.classes.SliderJoint3D.mb_get_param = MethodBind.get("SliderJoint3D", "get_param", 959925627L)
    Ptrcall.call1[Long, Double](gdext.classes.SliderJoint3D.mb_get_param, livePtr, param)
  }

}

object SliderJoint3D {
  private[classes] var mb_set_param: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param: GDExtensionMethodBindPtr = null

  /** Godot enum `SliderJoint3D.Param`. */
  opaque type Param <: Long = Long

  object Param {
    final val LinearLimitUpper: Param = 0L.asInstanceOf[Param]
    final val LinearLimitLower: Param = 1L.asInstanceOf[Param]
    final val LinearLimitSoftness: Param = 2L.asInstanceOf[Param]
    final val LinearLimitRestitution: Param = 3L.asInstanceOf[Param]
    final val LinearLimitDamping: Param = 4L.asInstanceOf[Param]
    final val LinearMotionSoftness: Param = 5L.asInstanceOf[Param]
    final val LinearMotionRestitution: Param = 6L.asInstanceOf[Param]
    final val LinearMotionDamping: Param = 7L.asInstanceOf[Param]
    final val LinearOrthogonalSoftness: Param = 8L.asInstanceOf[Param]
    final val LinearOrthogonalRestitution: Param = 9L.asInstanceOf[Param]
    final val LinearOrthogonalDamping: Param = 10L.asInstanceOf[Param]
    final val AngularLimitUpper: Param = 11L.asInstanceOf[Param]
    final val AngularLimitLower: Param = 12L.asInstanceOf[Param]
    final val AngularLimitSoftness: Param = 13L.asInstanceOf[Param]
    final val AngularLimitRestitution: Param = 14L.asInstanceOf[Param]
    final val AngularLimitDamping: Param = 15L.asInstanceOf[Param]
    final val AngularMotionSoftness: Param = 16L.asInstanceOf[Param]
    final val AngularMotionRestitution: Param = 17L.asInstanceOf[Param]
    final val AngularMotionDamping: Param = 18L.asInstanceOf[Param]
    final val AngularOrthogonalSoftness: Param = 19L.asInstanceOf[Param]
    final val AngularOrthogonalRestitution: Param = 20L.asInstanceOf[Param]
    final val AngularOrthogonalDamping: Param = 21L.asInstanceOf[Param]
    final val Max: Param = 22L.asInstanceOf[Param]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Param = value.asInstanceOf[Param]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Param] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L).asInstanceOf[scala.IArray[Param]]

    extension (self: Param)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "LinearLimitUpper"
        case 1L => "LinearLimitLower"
        case 2L => "LinearLimitSoftness"
        case 3L => "LinearLimitRestitution"
        case 4L => "LinearLimitDamping"
        case 5L => "LinearMotionSoftness"
        case 6L => "LinearMotionRestitution"
        case 7L => "LinearMotionDamping"
        case 8L => "LinearOrthogonalSoftness"
        case 9L => "LinearOrthogonalRestitution"
        case 10L => "LinearOrthogonalDamping"
        case 11L => "AngularLimitUpper"
        case 12L => "AngularLimitLower"
        case 13L => "AngularLimitSoftness"
        case 14L => "AngularLimitRestitution"
        case 15L => "AngularLimitDamping"
        case 16L => "AngularMotionSoftness"
        case 17L => "AngularMotionRestitution"
        case 18L => "AngularMotionDamping"
        case 19L => "AngularOrthogonalSoftness"
        case 20L => "AngularOrthogonalRestitution"
        case 21L => "AngularOrthogonalDamping"
        case 22L => "Max"
        case other => other.toString
      }
  }
}
