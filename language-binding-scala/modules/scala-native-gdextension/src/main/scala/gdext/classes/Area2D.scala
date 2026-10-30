package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Area2D`, extends `CollisionObject2D`. */
abstract class Area2D extends CollisionObject2D {
  override def godotClassName: String = "Area2D"

  /** Area2D.set_gravity_space_override_mode */
  final def setGravitySpaceOverrideMode(spaceOverrideMode: gdext.classes.Area2D.SpaceOverride): Unit = {
    if (gdext.classes.Area2D.mb_set_gravity_space_override_mode == null) gdext.classes.Area2D.mb_set_gravity_space_override_mode = MethodBind.get("Area2D", "set_gravity_space_override_mode", 2879900038L)
    Ptrcall.callVoid1(gdext.classes.Area2D.mb_set_gravity_space_override_mode, livePtr, spaceOverrideMode)
  }

  /** Area2D.get_gravity_space_override_mode */
  final def getGravitySpaceOverrideMode(): gdext.classes.Area2D.SpaceOverride = {
    if (gdext.classes.Area2D.mb_get_gravity_space_override_mode == null) gdext.classes.Area2D.mb_get_gravity_space_override_mode = MethodBind.get("Area2D", "get_gravity_space_override_mode", 3990256304L)
    gdext.classes.Area2D.SpaceOverride(Ptrcall.call0[Long](gdext.classes.Area2D.mb_get_gravity_space_override_mode, livePtr))
  }

  /** Area2D.set_gravity_is_point */
  final def setGravityIsPoint(enable: Boolean): Unit = {
    if (gdext.classes.Area2D.mb_set_gravity_is_point == null) gdext.classes.Area2D.mb_set_gravity_is_point = MethodBind.get("Area2D", "set_gravity_is_point", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Area2D.mb_set_gravity_is_point, livePtr, enable)
  }

  /** Area2D.is_gravity_a_point */
  final def isGravityAPoint(): Boolean = {
    if (gdext.classes.Area2D.mb_is_gravity_a_point == null) gdext.classes.Area2D.mb_is_gravity_a_point = MethodBind.get("Area2D", "is_gravity_a_point", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Area2D.mb_is_gravity_a_point, livePtr)
  }

  /** Area2D.set_gravity_point_unit_distance */
  final def setGravityPointUnitDistance(distanceScale: Double): Unit = {
    if (gdext.classes.Area2D.mb_set_gravity_point_unit_distance == null) gdext.classes.Area2D.mb_set_gravity_point_unit_distance = MethodBind.get("Area2D", "set_gravity_point_unit_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Area2D.mb_set_gravity_point_unit_distance, livePtr, distanceScale)
  }

  /** Area2D.get_gravity_point_unit_distance */
  final def getGravityPointUnitDistance(): Double = {
    if (gdext.classes.Area2D.mb_get_gravity_point_unit_distance == null) gdext.classes.Area2D.mb_get_gravity_point_unit_distance = MethodBind.get("Area2D", "get_gravity_point_unit_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Area2D.mb_get_gravity_point_unit_distance, livePtr)
  }

  /** Area2D.set_gravity_point_center */
  final def setGravityPointCenter(center: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Area2D.mb_set_gravity_point_center == null) gdext.classes.Area2D.mb_set_gravity_point_center = MethodBind.get("Area2D", "set_gravity_point_center", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Area2D.mb_set_gravity_point_center, livePtr, center)
  }

  /** Area2D.get_gravity_point_center */
  final def getGravityPointCenter(): gdext.builtin.Vector2 = {
    if (gdext.classes.Area2D.mb_get_gravity_point_center == null) gdext.classes.Area2D.mb_get_gravity_point_center = MethodBind.get("Area2D", "get_gravity_point_center", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Area2D.mb_get_gravity_point_center, livePtr)
  }

  /** Area2D.set_gravity_direction */
  final def setGravityDirection(direction: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Area2D.mb_set_gravity_direction == null) gdext.classes.Area2D.mb_set_gravity_direction = MethodBind.get("Area2D", "set_gravity_direction", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Area2D.mb_set_gravity_direction, livePtr, direction)
  }

  /** Area2D.get_gravity_direction */
  final def getGravityDirection(): gdext.builtin.Vector2 = {
    if (gdext.classes.Area2D.mb_get_gravity_direction == null) gdext.classes.Area2D.mb_get_gravity_direction = MethodBind.get("Area2D", "get_gravity_direction", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Area2D.mb_get_gravity_direction, livePtr)
  }

  /** Area2D.set_gravity */
  final def setGravity(gravity: Double): Unit = {
    if (gdext.classes.Area2D.mb_set_gravity == null) gdext.classes.Area2D.mb_set_gravity = MethodBind.get("Area2D", "set_gravity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Area2D.mb_set_gravity, livePtr, gravity)
  }

  /** Area2D.get_gravity */
  final def getGravity(): Double = {
    if (gdext.classes.Area2D.mb_get_gravity == null) gdext.classes.Area2D.mb_get_gravity = MethodBind.get("Area2D", "get_gravity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Area2D.mb_get_gravity, livePtr)
  }

  /** Area2D.set_linear_damp_space_override_mode */
  final def setLinearDampSpaceOverrideMode(spaceOverrideMode: gdext.classes.Area2D.SpaceOverride): Unit = {
    if (gdext.classes.Area2D.mb_set_linear_damp_space_override_mode == null) gdext.classes.Area2D.mb_set_linear_damp_space_override_mode = MethodBind.get("Area2D", "set_linear_damp_space_override_mode", 2879900038L)
    Ptrcall.callVoid1(gdext.classes.Area2D.mb_set_linear_damp_space_override_mode, livePtr, spaceOverrideMode)
  }

  /** Area2D.get_linear_damp_space_override_mode */
  final def getLinearDampSpaceOverrideMode(): gdext.classes.Area2D.SpaceOverride = {
    if (gdext.classes.Area2D.mb_get_linear_damp_space_override_mode == null) gdext.classes.Area2D.mb_get_linear_damp_space_override_mode = MethodBind.get("Area2D", "get_linear_damp_space_override_mode", 3990256304L)
    gdext.classes.Area2D.SpaceOverride(Ptrcall.call0[Long](gdext.classes.Area2D.mb_get_linear_damp_space_override_mode, livePtr))
  }

  /** Area2D.set_angular_damp_space_override_mode */
  final def setAngularDampSpaceOverrideMode(spaceOverrideMode: gdext.classes.Area2D.SpaceOverride): Unit = {
    if (gdext.classes.Area2D.mb_set_angular_damp_space_override_mode == null) gdext.classes.Area2D.mb_set_angular_damp_space_override_mode = MethodBind.get("Area2D", "set_angular_damp_space_override_mode", 2879900038L)
    Ptrcall.callVoid1(gdext.classes.Area2D.mb_set_angular_damp_space_override_mode, livePtr, spaceOverrideMode)
  }

  /** Area2D.get_angular_damp_space_override_mode */
  final def getAngularDampSpaceOverrideMode(): gdext.classes.Area2D.SpaceOverride = {
    if (gdext.classes.Area2D.mb_get_angular_damp_space_override_mode == null) gdext.classes.Area2D.mb_get_angular_damp_space_override_mode = MethodBind.get("Area2D", "get_angular_damp_space_override_mode", 3990256304L)
    gdext.classes.Area2D.SpaceOverride(Ptrcall.call0[Long](gdext.classes.Area2D.mb_get_angular_damp_space_override_mode, livePtr))
  }

  /** Area2D.set_linear_damp */
  final def setLinearDamp(linearDamp: Double): Unit = {
    if (gdext.classes.Area2D.mb_set_linear_damp == null) gdext.classes.Area2D.mb_set_linear_damp = MethodBind.get("Area2D", "set_linear_damp", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Area2D.mb_set_linear_damp, livePtr, linearDamp)
  }

  /** Area2D.get_linear_damp */
  final def getLinearDamp(): Double = {
    if (gdext.classes.Area2D.mb_get_linear_damp == null) gdext.classes.Area2D.mb_get_linear_damp = MethodBind.get("Area2D", "get_linear_damp", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Area2D.mb_get_linear_damp, livePtr)
  }

  /** Area2D.set_angular_damp */
  final def setAngularDamp(angularDamp: Double): Unit = {
    if (gdext.classes.Area2D.mb_set_angular_damp == null) gdext.classes.Area2D.mb_set_angular_damp = MethodBind.get("Area2D", "set_angular_damp", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Area2D.mb_set_angular_damp, livePtr, angularDamp)
  }

  /** Area2D.get_angular_damp */
  final def getAngularDamp(): Double = {
    if (gdext.classes.Area2D.mb_get_angular_damp == null) gdext.classes.Area2D.mb_get_angular_damp = MethodBind.get("Area2D", "get_angular_damp", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Area2D.mb_get_angular_damp, livePtr)
  }

  /** Area2D.set_priority */
  final def setPriority(priority: Long): Unit = {
    if (gdext.classes.Area2D.mb_set_priority == null) gdext.classes.Area2D.mb_set_priority = MethodBind.get("Area2D", "set_priority", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Area2D.mb_set_priority, livePtr, priority)
  }

  /** Area2D.get_priority */
  final def getPriority(): Long = {
    if (gdext.classes.Area2D.mb_get_priority == null) gdext.classes.Area2D.mb_get_priority = MethodBind.get("Area2D", "get_priority", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Area2D.mb_get_priority, livePtr)
  }

  /** Area2D.set_monitoring */
  final def setMonitoring(enable: Boolean): Unit = {
    if (gdext.classes.Area2D.mb_set_monitoring == null) gdext.classes.Area2D.mb_set_monitoring = MethodBind.get("Area2D", "set_monitoring", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Area2D.mb_set_monitoring, livePtr, enable)
  }

  /** Area2D.is_monitoring */
  final def isMonitoring(): Boolean = {
    if (gdext.classes.Area2D.mb_is_monitoring == null) gdext.classes.Area2D.mb_is_monitoring = MethodBind.get("Area2D", "is_monitoring", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Area2D.mb_is_monitoring, livePtr)
  }

  /** Area2D.set_monitorable */
  final def setMonitorable(enable: Boolean): Unit = {
    if (gdext.classes.Area2D.mb_set_monitorable == null) gdext.classes.Area2D.mb_set_monitorable = MethodBind.get("Area2D", "set_monitorable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Area2D.mb_set_monitorable, livePtr, enable)
  }

  /** Area2D.is_monitorable */
  final def isMonitorable(): Boolean = {
    if (gdext.classes.Area2D.mb_is_monitorable == null) gdext.classes.Area2D.mb_is_monitorable = MethodBind.get("Area2D", "is_monitorable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Area2D.mb_is_monitorable, livePtr)
  }

  /** Area2D.has_overlapping_bodies */
  final def hasOverlappingBodies(): Boolean = {
    if (gdext.classes.Area2D.mb_has_overlapping_bodies == null) gdext.classes.Area2D.mb_has_overlapping_bodies = MethodBind.get("Area2D", "has_overlapping_bodies", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Area2D.mb_has_overlapping_bodies, livePtr)
  }

  /** Area2D.has_overlapping_areas */
  final def hasOverlappingAreas(): Boolean = {
    if (gdext.classes.Area2D.mb_has_overlapping_areas == null) gdext.classes.Area2D.mb_has_overlapping_areas = MethodBind.get("Area2D", "has_overlapping_areas", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Area2D.mb_has_overlapping_areas, livePtr)
  }

  /** Area2D.overlaps_body */
  final def overlapsBody(body: Node): Boolean = {
    if (gdext.classes.Area2D.mb_overlaps_body == null) gdext.classes.Area2D.mb_overlaps_body = MethodBind.get("Area2D", "overlaps_body", 3093956946L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.Area2D.mb_overlaps_body, livePtr, Wrappers.handle(body))
  }

  /** Area2D.overlaps_area */
  final def overlapsArea(area: Node): Boolean = {
    if (gdext.classes.Area2D.mb_overlaps_area == null) gdext.classes.Area2D.mb_overlaps_area = MethodBind.get("Area2D", "overlaps_area", 3093956946L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.Area2D.mb_overlaps_area, livePtr, Wrappers.handle(area))
  }

  /** Area2D.set_audio_bus_name */
  final def setAudioBusName(name: String): Unit = {
    if (gdext.classes.Area2D.mb_set_audio_bus_name == null) gdext.classes.Area2D.mb_set_audio_bus_name = MethodBind.get("Area2D", "set_audio_bus_name", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Area2D.mb_set_audio_bus_name, livePtr, SnArg(name))
  }

  /** Area2D.get_audio_bus_name */
  final def getAudioBusName(): String = {
    if (gdext.classes.Area2D.mb_get_audio_bus_name == null) gdext.classes.Area2D.mb_get_audio_bus_name = MethodBind.get("Area2D", "get_audio_bus_name", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.Area2D.mb_get_audio_bus_name, livePtr)
  }

  /** Area2D.set_audio_bus_override */
  final def setAudioBusOverride(enable: Boolean): Unit = {
    if (gdext.classes.Area2D.mb_set_audio_bus_override == null) gdext.classes.Area2D.mb_set_audio_bus_override = MethodBind.get("Area2D", "set_audio_bus_override", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Area2D.mb_set_audio_bus_override, livePtr, enable)
  }

  /** Area2D.is_overriding_audio_bus */
  final def isOverridingAudioBus(): Boolean = {
    if (gdext.classes.Area2D.mb_is_overriding_audio_bus == null) gdext.classes.Area2D.mb_is_overriding_audio_bus = MethodBind.get("Area2D", "is_overriding_audio_bus", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Area2D.mb_is_overriding_audio_bus, livePtr)
  }

}

object Area2D {
  private[classes] var mb_set_gravity_space_override_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gravity_space_override_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gravity_is_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_gravity_a_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gravity_point_unit_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gravity_point_unit_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gravity_point_center: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gravity_point_center: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gravity_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gravity_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_linear_damp_space_override_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_linear_damp_space_override_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_angular_damp_space_override_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angular_damp_space_override_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_linear_damp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_linear_damp: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_angular_damp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angular_damp: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_monitoring: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_monitoring: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_monitorable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_monitorable: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_overlapping_bodies: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_overlapping_areas: GDExtensionMethodBindPtr = null
  private[classes] var mb_overlaps_body: GDExtensionMethodBindPtr = null
  private[classes] var mb_overlaps_area: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_audio_bus_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_audio_bus_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_audio_bus_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_overriding_audio_bus: GDExtensionMethodBindPtr = null

  /** Godot enum `Area2D.SpaceOverride`. */
  opaque type SpaceOverride <: Long = Long

  object SpaceOverride {
    final val Disabled: SpaceOverride = 0L.asInstanceOf[SpaceOverride]
    final val Combine: SpaceOverride = 1L.asInstanceOf[SpaceOverride]
    final val CombineReplace: SpaceOverride = 2L.asInstanceOf[SpaceOverride]
    final val Replace: SpaceOverride = 3L.asInstanceOf[SpaceOverride]
    final val ReplaceCombine: SpaceOverride = 4L.asInstanceOf[SpaceOverride]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SpaceOverride = value.asInstanceOf[SpaceOverride]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SpaceOverride] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[SpaceOverride]]

    extension (self: SpaceOverride)
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
}
