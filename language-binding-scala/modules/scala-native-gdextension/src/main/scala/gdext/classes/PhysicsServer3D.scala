package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsServer3D`, extends `Object`. */
abstract class PhysicsServer3D extends Object {
  override def godotClassName: String = "PhysicsServer3D"

  /** PhysicsServer3D.set_active */
  final def setActive(active: Boolean): Unit = {
    if (gdext.classes.PhysicsServer3D.mb_set_active == null) gdext.classes.PhysicsServer3D.mb_set_active = MethodBind.get("PhysicsServer3D", "set_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsServer3D.mb_set_active, livePtr, active)
  }

  /** PhysicsServer3D.get_process_info */
  final def getProcessInfo(processInfo: gdext.classes.PhysicsServer3D.ProcessInfo): Long = {
    if (gdext.classes.PhysicsServer3D.mb_get_process_info == null) gdext.classes.PhysicsServer3D.mb_get_process_info = MethodBind.get("PhysicsServer3D", "get_process_info", 1332958745L)
    Ptrcall.call1[Long, Long](gdext.classes.PhysicsServer3D.mb_get_process_info, livePtr, processInfo)
  }

}

object PhysicsServer3D {
  private[classes] var mb_set_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_info: GDExtensionMethodBindPtr = null

  private var instance: PhysicsServer3D = null

  /** The process-global PhysicsServer3D singleton instance. */
  def singleton: PhysicsServer3D = {
    if (instance == null)
      instance = Wrappers.borrowed[PhysicsServer3D](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("PhysicsServer3D").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: PhysicsServer3D.set_active */
  final def setActive(active: Boolean): Unit =
    singleton.setActive(active)

  /** Forwards to [[singleton]]: PhysicsServer3D.get_process_info */
  final def getProcessInfo(processInfo: gdext.classes.PhysicsServer3D.ProcessInfo): Long =
    singleton.getProcessInfo(processInfo)

  /** Godot enum `PhysicsServer3D.JointType`. */
  opaque type JointType <: Long = Long

  object JointType {
    final val Pin: JointType = 0L.asInstanceOf[JointType]
    final val Hinge: JointType = 1L.asInstanceOf[JointType]
    final val Slider: JointType = 2L.asInstanceOf[JointType]
    final val ConeTwist: JointType = 3L.asInstanceOf[JointType]
    final val Type6dof: JointType = 4L.asInstanceOf[JointType]
    final val Max: JointType = 5L.asInstanceOf[JointType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): JointType = value.asInstanceOf[JointType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[JointType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[JointType]]

    extension (self: JointType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Pin"
        case 1L => "Hinge"
        case 2L => "Slider"
        case 3L => "ConeTwist"
        case 4L => "Type6dof"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer3D.PinJointParam`. */
  opaque type PinJointParam <: Long = Long

  object PinJointParam {
    final val Bias: PinJointParam = 0L.asInstanceOf[PinJointParam]
    final val Damping: PinJointParam = 1L.asInstanceOf[PinJointParam]
    final val ImpulseClamp: PinJointParam = 2L.asInstanceOf[PinJointParam]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PinJointParam = value.asInstanceOf[PinJointParam]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PinJointParam] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[PinJointParam]]

    extension (self: PinJointParam)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Bias"
        case 1L => "Damping"
        case 2L => "ImpulseClamp"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer3D.HingeJointParam`. */
  opaque type HingeJointParam <: Long = Long

  object HingeJointParam {
    final val Bias: HingeJointParam = 0L.asInstanceOf[HingeJointParam]
    final val LimitUpper: HingeJointParam = 1L.asInstanceOf[HingeJointParam]
    final val LimitLower: HingeJointParam = 2L.asInstanceOf[HingeJointParam]
    final val LimitBias: HingeJointParam = 3L.asInstanceOf[HingeJointParam]
    final val LimitSoftness: HingeJointParam = 4L.asInstanceOf[HingeJointParam]
    final val LimitRelaxation: HingeJointParam = 5L.asInstanceOf[HingeJointParam]
    final val MotorTargetVelocity: HingeJointParam = 6L.asInstanceOf[HingeJointParam]
    final val MotorMaxImpulse: HingeJointParam = 7L.asInstanceOf[HingeJointParam]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): HingeJointParam = value.asInstanceOf[HingeJointParam]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[HingeJointParam] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).asInstanceOf[scala.IArray[HingeJointParam]]

    extension (self: HingeJointParam)
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
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer3D.HingeJointFlag`. */
  opaque type HingeJointFlag <: Long = Long

  object HingeJointFlag {
    final val UseLimit: HingeJointFlag = 0L.asInstanceOf[HingeJointFlag]
    final val EnableMotor: HingeJointFlag = 1L.asInstanceOf[HingeJointFlag]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): HingeJointFlag = value.asInstanceOf[HingeJointFlag]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[HingeJointFlag] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[HingeJointFlag]]

    extension (self: HingeJointFlag)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "UseLimit"
        case 1L => "EnableMotor"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer3D.SliderJointParam`. */
  opaque type SliderJointParam <: Long = Long

  object SliderJointParam {
    final val LinearLimitUpper: SliderJointParam = 0L.asInstanceOf[SliderJointParam]
    final val LinearLimitLower: SliderJointParam = 1L.asInstanceOf[SliderJointParam]
    final val LinearLimitSoftness: SliderJointParam = 2L.asInstanceOf[SliderJointParam]
    final val LinearLimitRestitution: SliderJointParam = 3L.asInstanceOf[SliderJointParam]
    final val LinearLimitDamping: SliderJointParam = 4L.asInstanceOf[SliderJointParam]
    final val LinearMotionSoftness: SliderJointParam = 5L.asInstanceOf[SliderJointParam]
    final val LinearMotionRestitution: SliderJointParam = 6L.asInstanceOf[SliderJointParam]
    final val LinearMotionDamping: SliderJointParam = 7L.asInstanceOf[SliderJointParam]
    final val LinearOrthogonalSoftness: SliderJointParam = 8L.asInstanceOf[SliderJointParam]
    final val LinearOrthogonalRestitution: SliderJointParam = 9L.asInstanceOf[SliderJointParam]
    final val LinearOrthogonalDamping: SliderJointParam = 10L.asInstanceOf[SliderJointParam]
    final val AngularLimitUpper: SliderJointParam = 11L.asInstanceOf[SliderJointParam]
    final val AngularLimitLower: SliderJointParam = 12L.asInstanceOf[SliderJointParam]
    final val AngularLimitSoftness: SliderJointParam = 13L.asInstanceOf[SliderJointParam]
    final val AngularLimitRestitution: SliderJointParam = 14L.asInstanceOf[SliderJointParam]
    final val AngularLimitDamping: SliderJointParam = 15L.asInstanceOf[SliderJointParam]
    final val AngularMotionSoftness: SliderJointParam = 16L.asInstanceOf[SliderJointParam]
    final val AngularMotionRestitution: SliderJointParam = 17L.asInstanceOf[SliderJointParam]
    final val AngularMotionDamping: SliderJointParam = 18L.asInstanceOf[SliderJointParam]
    final val AngularOrthogonalSoftness: SliderJointParam = 19L.asInstanceOf[SliderJointParam]
    final val AngularOrthogonalRestitution: SliderJointParam = 20L.asInstanceOf[SliderJointParam]
    final val AngularOrthogonalDamping: SliderJointParam = 21L.asInstanceOf[SliderJointParam]
    final val Max: SliderJointParam = 22L.asInstanceOf[SliderJointParam]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SliderJointParam = value.asInstanceOf[SliderJointParam]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SliderJointParam] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L).asInstanceOf[scala.IArray[SliderJointParam]]

    extension (self: SliderJointParam)
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

  /** Godot enum `PhysicsServer3D.ConeTwistJointParam`. */
  opaque type ConeTwistJointParam <: Long = Long

  object ConeTwistJointParam {
    final val SwingSpan: ConeTwistJointParam = 0L.asInstanceOf[ConeTwistJointParam]
    final val TwistSpan: ConeTwistJointParam = 1L.asInstanceOf[ConeTwistJointParam]
    final val Bias: ConeTwistJointParam = 2L.asInstanceOf[ConeTwistJointParam]
    final val Softness: ConeTwistJointParam = 3L.asInstanceOf[ConeTwistJointParam]
    final val Relaxation: ConeTwistJointParam = 4L.asInstanceOf[ConeTwistJointParam]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ConeTwistJointParam = value.asInstanceOf[ConeTwistJointParam]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ConeTwistJointParam] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[ConeTwistJointParam]]

    extension (self: ConeTwistJointParam)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "SwingSpan"
        case 1L => "TwistSpan"
        case 2L => "Bias"
        case 3L => "Softness"
        case 4L => "Relaxation"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer3D.G6DOFJointAxisParam`. */
  opaque type G6DOFJointAxisParam <: Long = Long

  object G6DOFJointAxisParam {
    final val LinearLowerLimit: G6DOFJointAxisParam = 0L.asInstanceOf[G6DOFJointAxisParam]
    final val LinearUpperLimit: G6DOFJointAxisParam = 1L.asInstanceOf[G6DOFJointAxisParam]
    final val LinearLimitSoftness: G6DOFJointAxisParam = 2L.asInstanceOf[G6DOFJointAxisParam]
    final val LinearRestitution: G6DOFJointAxisParam = 3L.asInstanceOf[G6DOFJointAxisParam]
    final val LinearDamping: G6DOFJointAxisParam = 4L.asInstanceOf[G6DOFJointAxisParam]
    final val LinearMotorTargetVelocity: G6DOFJointAxisParam = 5L.asInstanceOf[G6DOFJointAxisParam]
    final val LinearMotorForceLimit: G6DOFJointAxisParam = 6L.asInstanceOf[G6DOFJointAxisParam]
    final val LinearSpringStiffness: G6DOFJointAxisParam = 7L.asInstanceOf[G6DOFJointAxisParam]
    final val LinearSpringDamping: G6DOFJointAxisParam = 8L.asInstanceOf[G6DOFJointAxisParam]
    final val LinearSpringEquilibriumPoint: G6DOFJointAxisParam = 9L.asInstanceOf[G6DOFJointAxisParam]
    final val AngularLowerLimit: G6DOFJointAxisParam = 10L.asInstanceOf[G6DOFJointAxisParam]
    final val AngularUpperLimit: G6DOFJointAxisParam = 11L.asInstanceOf[G6DOFJointAxisParam]
    final val AngularLimitSoftness: G6DOFJointAxisParam = 12L.asInstanceOf[G6DOFJointAxisParam]
    final val AngularDamping: G6DOFJointAxisParam = 13L.asInstanceOf[G6DOFJointAxisParam]
    final val AngularRestitution: G6DOFJointAxisParam = 14L.asInstanceOf[G6DOFJointAxisParam]
    final val AngularForceLimit: G6DOFJointAxisParam = 15L.asInstanceOf[G6DOFJointAxisParam]
    final val AngularErp: G6DOFJointAxisParam = 16L.asInstanceOf[G6DOFJointAxisParam]
    final val AngularMotorTargetVelocity: G6DOFJointAxisParam = 17L.asInstanceOf[G6DOFJointAxisParam]
    final val AngularMotorForceLimit: G6DOFJointAxisParam = 18L.asInstanceOf[G6DOFJointAxisParam]
    final val AngularSpringStiffness: G6DOFJointAxisParam = 19L.asInstanceOf[G6DOFJointAxisParam]
    final val AngularSpringDamping: G6DOFJointAxisParam = 20L.asInstanceOf[G6DOFJointAxisParam]
    final val AngularSpringEquilibriumPoint: G6DOFJointAxisParam = 21L.asInstanceOf[G6DOFJointAxisParam]
    final val Max: G6DOFJointAxisParam = 22L.asInstanceOf[G6DOFJointAxisParam]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): G6DOFJointAxisParam = value.asInstanceOf[G6DOFJointAxisParam]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[G6DOFJointAxisParam] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L).asInstanceOf[scala.IArray[G6DOFJointAxisParam]]

    extension (self: G6DOFJointAxisParam)
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

  /** Godot enum `PhysicsServer3D.G6DOFJointAxisFlag`. */
  opaque type G6DOFJointAxisFlag <: Long = Long

  object G6DOFJointAxisFlag {
    final val EnableLinearLimit: G6DOFJointAxisFlag = 0L.asInstanceOf[G6DOFJointAxisFlag]
    final val EnableAngularLimit: G6DOFJointAxisFlag = 1L.asInstanceOf[G6DOFJointAxisFlag]
    final val EnableAngularSpring: G6DOFJointAxisFlag = 2L.asInstanceOf[G6DOFJointAxisFlag]
    final val EnableLinearSpring: G6DOFJointAxisFlag = 3L.asInstanceOf[G6DOFJointAxisFlag]
    final val EnableMotor: G6DOFJointAxisFlag = 4L.asInstanceOf[G6DOFJointAxisFlag]
    final val EnableLinearMotor: G6DOFJointAxisFlag = 5L.asInstanceOf[G6DOFJointAxisFlag]
    final val Max: G6DOFJointAxisFlag = 6L.asInstanceOf[G6DOFJointAxisFlag]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): G6DOFJointAxisFlag = value.asInstanceOf[G6DOFJointAxisFlag]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[G6DOFJointAxisFlag] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[G6DOFJointAxisFlag]]

    extension (self: G6DOFJointAxisFlag)
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

  /** Godot enum `PhysicsServer3D.ShapeType`. */
  opaque type ShapeType <: Long = Long

  object ShapeType {
    final val WorldBoundary: ShapeType = 0L.asInstanceOf[ShapeType]
    final val SeparationRay: ShapeType = 1L.asInstanceOf[ShapeType]
    final val Sphere: ShapeType = 2L.asInstanceOf[ShapeType]
    final val Box: ShapeType = 3L.asInstanceOf[ShapeType]
    final val Capsule: ShapeType = 4L.asInstanceOf[ShapeType]
    final val Cylinder: ShapeType = 5L.asInstanceOf[ShapeType]
    final val ConvexPolygon: ShapeType = 6L.asInstanceOf[ShapeType]
    final val ConcavePolygon: ShapeType = 7L.asInstanceOf[ShapeType]
    final val Heightmap: ShapeType = 8L.asInstanceOf[ShapeType]
    final val SoftBody: ShapeType = 9L.asInstanceOf[ShapeType]
    final val Custom: ShapeType = 10L.asInstanceOf[ShapeType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ShapeType = value.asInstanceOf[ShapeType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ShapeType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L).asInstanceOf[scala.IArray[ShapeType]]

    extension (self: ShapeType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "WorldBoundary"
        case 1L => "SeparationRay"
        case 2L => "Sphere"
        case 3L => "Box"
        case 4L => "Capsule"
        case 5L => "Cylinder"
        case 6L => "ConvexPolygon"
        case 7L => "ConcavePolygon"
        case 8L => "Heightmap"
        case 9L => "SoftBody"
        case 10L => "Custom"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer3D.AreaParameter`. */
  opaque type AreaParameter <: Long = Long

  object AreaParameter {
    final val GravityOverrideMode: AreaParameter = 0L.asInstanceOf[AreaParameter]
    final val Gravity: AreaParameter = 1L.asInstanceOf[AreaParameter]
    final val GravityVector: AreaParameter = 2L.asInstanceOf[AreaParameter]
    final val GravityIsPoint: AreaParameter = 3L.asInstanceOf[AreaParameter]
    final val GravityPointUnitDistance: AreaParameter = 4L.asInstanceOf[AreaParameter]
    final val LinearDampOverrideMode: AreaParameter = 5L.asInstanceOf[AreaParameter]
    final val LinearDamp: AreaParameter = 6L.asInstanceOf[AreaParameter]
    final val AngularDampOverrideMode: AreaParameter = 7L.asInstanceOf[AreaParameter]
    final val AngularDamp: AreaParameter = 8L.asInstanceOf[AreaParameter]
    final val Priority: AreaParameter = 9L.asInstanceOf[AreaParameter]
    final val WindForceMagnitude: AreaParameter = 10L.asInstanceOf[AreaParameter]
    final val WindSource: AreaParameter = 11L.asInstanceOf[AreaParameter]
    final val WindDirection: AreaParameter = 12L.asInstanceOf[AreaParameter]
    final val WindAttenuationFactor: AreaParameter = 13L.asInstanceOf[AreaParameter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AreaParameter = value.asInstanceOf[AreaParameter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AreaParameter] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L).asInstanceOf[scala.IArray[AreaParameter]]

    extension (self: AreaParameter)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "GravityOverrideMode"
        case 1L => "Gravity"
        case 2L => "GravityVector"
        case 3L => "GravityIsPoint"
        case 4L => "GravityPointUnitDistance"
        case 5L => "LinearDampOverrideMode"
        case 6L => "LinearDamp"
        case 7L => "AngularDampOverrideMode"
        case 8L => "AngularDamp"
        case 9L => "Priority"
        case 10L => "WindForceMagnitude"
        case 11L => "WindSource"
        case 12L => "WindDirection"
        case 13L => "WindAttenuationFactor"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer3D.AreaSpaceOverrideMode`. */
  opaque type AreaSpaceOverrideMode <: Long = Long

  object AreaSpaceOverrideMode {
    final val Disabled: AreaSpaceOverrideMode = 0L.asInstanceOf[AreaSpaceOverrideMode]
    final val Combine: AreaSpaceOverrideMode = 1L.asInstanceOf[AreaSpaceOverrideMode]
    final val CombineReplace: AreaSpaceOverrideMode = 2L.asInstanceOf[AreaSpaceOverrideMode]
    final val Replace: AreaSpaceOverrideMode = 3L.asInstanceOf[AreaSpaceOverrideMode]
    final val ReplaceCombine: AreaSpaceOverrideMode = 4L.asInstanceOf[AreaSpaceOverrideMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AreaSpaceOverrideMode = value.asInstanceOf[AreaSpaceOverrideMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AreaSpaceOverrideMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[AreaSpaceOverrideMode]]

    extension (self: AreaSpaceOverrideMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Combine"
        case 2L => "CombineReplace"
        case 3L => "Replace"
        case 4L => "ReplaceCombine"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer3D.BodyMode`. */
  opaque type BodyMode <: Long = Long

  object BodyMode {
    final val Static: BodyMode = 0L.asInstanceOf[BodyMode]
    final val Kinematic: BodyMode = 1L.asInstanceOf[BodyMode]
    final val Rigid: BodyMode = 2L.asInstanceOf[BodyMode]
    final val RigidLinear: BodyMode = 3L.asInstanceOf[BodyMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BodyMode = value.asInstanceOf[BodyMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BodyMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[BodyMode]]

    extension (self: BodyMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Static"
        case 1L => "Kinematic"
        case 2L => "Rigid"
        case 3L => "RigidLinear"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer3D.BodyParameter`. */
  opaque type BodyParameter <: Long = Long

  object BodyParameter {
    final val Bounce: BodyParameter = 0L.asInstanceOf[BodyParameter]
    final val Friction: BodyParameter = 1L.asInstanceOf[BodyParameter]
    final val Mass: BodyParameter = 2L.asInstanceOf[BodyParameter]
    final val Inertia: BodyParameter = 3L.asInstanceOf[BodyParameter]
    final val CenterOfMass: BodyParameter = 4L.asInstanceOf[BodyParameter]
    final val GravityScale: BodyParameter = 5L.asInstanceOf[BodyParameter]
    final val LinearDampMode: BodyParameter = 6L.asInstanceOf[BodyParameter]
    final val AngularDampMode: BodyParameter = 7L.asInstanceOf[BodyParameter]
    final val LinearDamp: BodyParameter = 8L.asInstanceOf[BodyParameter]
    final val AngularDamp: BodyParameter = 9L.asInstanceOf[BodyParameter]
    final val Max: BodyParameter = 10L.asInstanceOf[BodyParameter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BodyParameter = value.asInstanceOf[BodyParameter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BodyParameter] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L).asInstanceOf[scala.IArray[BodyParameter]]

    extension (self: BodyParameter)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Bounce"
        case 1L => "Friction"
        case 2L => "Mass"
        case 3L => "Inertia"
        case 4L => "CenterOfMass"
        case 5L => "GravityScale"
        case 6L => "LinearDampMode"
        case 7L => "AngularDampMode"
        case 8L => "LinearDamp"
        case 9L => "AngularDamp"
        case 10L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer3D.BodyDampMode`. */
  opaque type BodyDampMode <: Long = Long

  object BodyDampMode {
    final val Combine: BodyDampMode = 0L.asInstanceOf[BodyDampMode]
    final val Replace: BodyDampMode = 1L.asInstanceOf[BodyDampMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BodyDampMode = value.asInstanceOf[BodyDampMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BodyDampMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[BodyDampMode]]

    extension (self: BodyDampMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Combine"
        case 1L => "Replace"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer3D.BodyState`. */
  opaque type BodyState <: Long = Long

  object BodyState {
    final val Transform: BodyState = 0L.asInstanceOf[BodyState]
    final val LinearVelocity: BodyState = 1L.asInstanceOf[BodyState]
    final val AngularVelocity: BodyState = 2L.asInstanceOf[BodyState]
    final val Sleeping: BodyState = 3L.asInstanceOf[BodyState]
    final val CanSleep: BodyState = 4L.asInstanceOf[BodyState]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BodyState = value.asInstanceOf[BodyState]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BodyState] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[BodyState]]

    extension (self: BodyState)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Transform"
        case 1L => "LinearVelocity"
        case 2L => "AngularVelocity"
        case 3L => "Sleeping"
        case 4L => "CanSleep"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer3D.AreaBodyStatus`. */
  opaque type AreaBodyStatus <: Long = Long

  object AreaBodyStatus {
    final val Added: AreaBodyStatus = 0L.asInstanceOf[AreaBodyStatus]
    final val Removed: AreaBodyStatus = 1L.asInstanceOf[AreaBodyStatus]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AreaBodyStatus = value.asInstanceOf[AreaBodyStatus]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AreaBodyStatus] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[AreaBodyStatus]]

    extension (self: AreaBodyStatus)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Added"
        case 1L => "Removed"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer3D.ProcessInfo`. */
  opaque type ProcessInfo <: Long = Long

  object ProcessInfo {
    final val ActiveObjects: ProcessInfo = 0L.asInstanceOf[ProcessInfo]
    final val CollisionPairs: ProcessInfo = 1L.asInstanceOf[ProcessInfo]
    final val IslandCount: ProcessInfo = 2L.asInstanceOf[ProcessInfo]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ProcessInfo = value.asInstanceOf[ProcessInfo]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ProcessInfo] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ProcessInfo]]

    extension (self: ProcessInfo)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "ActiveObjects"
        case 1L => "CollisionPairs"
        case 2L => "IslandCount"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer3D.SpaceParameter`. */
  opaque type SpaceParameter <: Long = Long

  object SpaceParameter {
    final val ContactRecycleRadius: SpaceParameter = 0L.asInstanceOf[SpaceParameter]
    final val ContactMaxSeparation: SpaceParameter = 1L.asInstanceOf[SpaceParameter]
    final val ContactMaxAllowedPenetration: SpaceParameter = 2L.asInstanceOf[SpaceParameter]
    final val ContactDefaultBias: SpaceParameter = 3L.asInstanceOf[SpaceParameter]
    final val BodyLinearVelocitySleepThreshold: SpaceParameter = 4L.asInstanceOf[SpaceParameter]
    final val BodyAngularVelocitySleepThreshold: SpaceParameter = 5L.asInstanceOf[SpaceParameter]
    final val BodyTimeToSleep: SpaceParameter = 6L.asInstanceOf[SpaceParameter]
    final val SolverIterations: SpaceParameter = 7L.asInstanceOf[SpaceParameter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SpaceParameter = value.asInstanceOf[SpaceParameter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SpaceParameter] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).asInstanceOf[scala.IArray[SpaceParameter]]

    extension (self: SpaceParameter)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "ContactRecycleRadius"
        case 1L => "ContactMaxSeparation"
        case 2L => "ContactMaxAllowedPenetration"
        case 3L => "ContactDefaultBias"
        case 4L => "BodyLinearVelocitySleepThreshold"
        case 5L => "BodyAngularVelocitySleepThreshold"
        case 6L => "BodyTimeToSleep"
        case 7L => "SolverIterations"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer3D.BodyAxis`. */
  opaque type BodyAxis <: Long = Long

  object BodyAxis {
    final val LinearX: BodyAxis = 1L.asInstanceOf[BodyAxis]
    final val LinearY: BodyAxis = 2L.asInstanceOf[BodyAxis]
    final val LinearZ: BodyAxis = 4L.asInstanceOf[BodyAxis]
    final val AngularX: BodyAxis = 8L.asInstanceOf[BodyAxis]
    final val AngularY: BodyAxis = 16L.asInstanceOf[BodyAxis]
    final val AngularZ: BodyAxis = 32L.asInstanceOf[BodyAxis]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BodyAxis = value.asInstanceOf[BodyAxis]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BodyAxis] = scala.IArray[Long](1L, 2L, 4L, 8L, 16L, 32L).asInstanceOf[scala.IArray[BodyAxis]]

    extension (self: BodyAxis)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "LinearX"
        case 2L => "LinearY"
        case 4L => "LinearZ"
        case 8L => "AngularX"
        case 16L => "AngularY"
        case 32L => "AngularZ"
        case other => other.toString
      }
  }
}
