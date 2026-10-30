package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsServer2D`, extends `Object`. */
abstract class PhysicsServer2D extends Object {
  override def godotClassName: String = "PhysicsServer2D"

  /** PhysicsServer2D.set_active */
  final def setActive(active: Boolean): Unit = {
    if (gdext.classes.PhysicsServer2D.mb_set_active == null) gdext.classes.PhysicsServer2D.mb_set_active = MethodBind.get("PhysicsServer2D", "set_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsServer2D.mb_set_active, livePtr, active)
  }

  /** PhysicsServer2D.get_process_info */
  final def getProcessInfo(processInfo: gdext.classes.PhysicsServer2D.ProcessInfo): Long = {
    if (gdext.classes.PhysicsServer2D.mb_get_process_info == null) gdext.classes.PhysicsServer2D.mb_get_process_info = MethodBind.get("PhysicsServer2D", "get_process_info", 576496006L)
    Ptrcall.call1[Long, Long](gdext.classes.PhysicsServer2D.mb_get_process_info, livePtr, processInfo)
  }

}

object PhysicsServer2D {
  private[classes] var mb_set_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_info: GDExtensionMethodBindPtr = null

  private var instance: PhysicsServer2D = null

  /** The process-global PhysicsServer2D singleton instance. */
  def singleton: PhysicsServer2D = {
    if (instance == null)
      instance = Wrappers.borrowed[PhysicsServer2D](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("PhysicsServer2D").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: PhysicsServer2D.set_active */
  final def setActive(active: Boolean): Unit =
    singleton.setActive(active)

  /** Forwards to [[singleton]]: PhysicsServer2D.get_process_info */
  final def getProcessInfo(processInfo: gdext.classes.PhysicsServer2D.ProcessInfo): Long =
    singleton.getProcessInfo(processInfo)

  /** Godot enum `PhysicsServer2D.SpaceParameter`. */
  opaque type SpaceParameter <: Long = Long

  object SpaceParameter {
    final val ContactRecycleRadius: SpaceParameter = 0L.asInstanceOf[SpaceParameter]
    final val ContactMaxSeparation: SpaceParameter = 1L.asInstanceOf[SpaceParameter]
    final val ContactMaxAllowedPenetration: SpaceParameter = 2L.asInstanceOf[SpaceParameter]
    final val ContactDefaultBias: SpaceParameter = 3L.asInstanceOf[SpaceParameter]
    final val BodyLinearVelocitySleepThreshold: SpaceParameter = 4L.asInstanceOf[SpaceParameter]
    final val BodyAngularVelocitySleepThreshold: SpaceParameter = 5L.asInstanceOf[SpaceParameter]
    final val BodyTimeToSleep: SpaceParameter = 6L.asInstanceOf[SpaceParameter]
    final val ConstraintDefaultBias: SpaceParameter = 7L.asInstanceOf[SpaceParameter]
    final val SolverIterations: SpaceParameter = 8L.asInstanceOf[SpaceParameter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SpaceParameter = value.asInstanceOf[SpaceParameter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SpaceParameter] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L).asInstanceOf[scala.IArray[SpaceParameter]]

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
        case 7L => "ConstraintDefaultBias"
        case 8L => "SolverIterations"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer2D.ShapeType`. */
  opaque type ShapeType <: Long = Long

  object ShapeType {
    final val WorldBoundary: ShapeType = 0L.asInstanceOf[ShapeType]
    final val SeparationRay: ShapeType = 1L.asInstanceOf[ShapeType]
    final val Segment: ShapeType = 2L.asInstanceOf[ShapeType]
    final val Circle: ShapeType = 3L.asInstanceOf[ShapeType]
    final val Rectangle: ShapeType = 4L.asInstanceOf[ShapeType]
    final val Capsule: ShapeType = 5L.asInstanceOf[ShapeType]
    final val ConvexPolygon: ShapeType = 6L.asInstanceOf[ShapeType]
    final val ConcavePolygon: ShapeType = 7L.asInstanceOf[ShapeType]
    final val Custom: ShapeType = 8L.asInstanceOf[ShapeType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ShapeType = value.asInstanceOf[ShapeType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ShapeType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L).asInstanceOf[scala.IArray[ShapeType]]

    extension (self: ShapeType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "WorldBoundary"
        case 1L => "SeparationRay"
        case 2L => "Segment"
        case 3L => "Circle"
        case 4L => "Rectangle"
        case 5L => "Capsule"
        case 6L => "ConvexPolygon"
        case 7L => "ConcavePolygon"
        case 8L => "Custom"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer2D.AreaParameter`. */
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

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AreaParameter = value.asInstanceOf[AreaParameter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AreaParameter] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L).asInstanceOf[scala.IArray[AreaParameter]]

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
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer2D.AreaSpaceOverrideMode`. */
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

  /** Godot enum `PhysicsServer2D.BodyMode`. */
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

  /** Godot enum `PhysicsServer2D.BodyParameter`. */
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

  /** Godot enum `PhysicsServer2D.BodyDampMode`. */
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

  /** Godot enum `PhysicsServer2D.BodyState`. */
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

  /** Godot enum `PhysicsServer2D.JointType`. */
  opaque type JointType <: Long = Long

  object JointType {
    final val Pin: JointType = 0L.asInstanceOf[JointType]
    final val Groove: JointType = 1L.asInstanceOf[JointType]
    final val DampedSpring: JointType = 2L.asInstanceOf[JointType]
    final val Max: JointType = 3L.asInstanceOf[JointType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): JointType = value.asInstanceOf[JointType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[JointType] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[JointType]]

    extension (self: JointType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Pin"
        case 1L => "Groove"
        case 2L => "DampedSpring"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer2D.JointParam`. */
  opaque type JointParam <: Long = Long

  object JointParam {
    final val Bias: JointParam = 0L.asInstanceOf[JointParam]
    final val MaxBias: JointParam = 1L.asInstanceOf[JointParam]
    final val MaxForce: JointParam = 2L.asInstanceOf[JointParam]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): JointParam = value.asInstanceOf[JointParam]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[JointParam] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[JointParam]]

    extension (self: JointParam)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Bias"
        case 1L => "MaxBias"
        case 2L => "MaxForce"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer2D.PinJointParam`. */
  opaque type PinJointParam <: Long = Long

  object PinJointParam {
    final val Softness: PinJointParam = 0L.asInstanceOf[PinJointParam]
    final val LimitUpper: PinJointParam = 1L.asInstanceOf[PinJointParam]
    final val LimitLower: PinJointParam = 2L.asInstanceOf[PinJointParam]
    final val MotorTargetVelocity: PinJointParam = 3L.asInstanceOf[PinJointParam]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PinJointParam = value.asInstanceOf[PinJointParam]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PinJointParam] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[PinJointParam]]

    extension (self: PinJointParam)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Softness"
        case 1L => "LimitUpper"
        case 2L => "LimitLower"
        case 3L => "MotorTargetVelocity"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer2D.PinJointFlag`. */
  opaque type PinJointFlag <: Long = Long

  object PinJointFlag {
    final val AngularLimitEnabled: PinJointFlag = 0L.asInstanceOf[PinJointFlag]
    final val MotorEnabled: PinJointFlag = 1L.asInstanceOf[PinJointFlag]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PinJointFlag = value.asInstanceOf[PinJointFlag]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PinJointFlag] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[PinJointFlag]]

    extension (self: PinJointFlag)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "AngularLimitEnabled"
        case 1L => "MotorEnabled"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer2D.DampedSpringParam`. */
  opaque type DampedSpringParam <: Long = Long

  object DampedSpringParam {
    final val RestLength: DampedSpringParam = 0L.asInstanceOf[DampedSpringParam]
    final val Stiffness: DampedSpringParam = 1L.asInstanceOf[DampedSpringParam]
    final val Damping: DampedSpringParam = 2L.asInstanceOf[DampedSpringParam]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DampedSpringParam = value.asInstanceOf[DampedSpringParam]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DampedSpringParam] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[DampedSpringParam]]

    extension (self: DampedSpringParam)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "RestLength"
        case 1L => "Stiffness"
        case 2L => "Damping"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer2D.CCDMode`. */
  opaque type CCDMode <: Long = Long

  object CCDMode {
    final val Disabled: CCDMode = 0L.asInstanceOf[CCDMode]
    final val CastRay: CCDMode = 1L.asInstanceOf[CCDMode]
    final val CastShape: CCDMode = 2L.asInstanceOf[CCDMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CCDMode = value.asInstanceOf[CCDMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CCDMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[CCDMode]]

    extension (self: CCDMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "CastRay"
        case 2L => "CastShape"
        case other => other.toString
      }
  }

  /** Godot enum `PhysicsServer2D.AreaBodyStatus`. */
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

  /** Godot enum `PhysicsServer2D.ProcessInfo`. */
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
}
