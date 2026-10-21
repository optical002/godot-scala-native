package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Area3D`, extends `CollisionObject3D`. */
abstract class Area3D extends CollisionObject3D {
  override def godotClassName: String = "Area3D"

  /** Area3D.set_gravity_space_override_mode */
  final def setGravitySpaceOverrideMode(space_override_mode: Long): Unit = {
    if (gdext.classes.Area3D.mb_set_gravity_space_override_mode == null) gdext.classes.Area3D.mb_set_gravity_space_override_mode = MethodBind.get("Area3D", "set_gravity_space_override_mode", 2311433571L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_gravity_space_override_mode, livePtr, space_override_mode)
  }

  /** Area3D.get_gravity_space_override_mode */
  final def getGravitySpaceOverrideMode(): Long = {
    if (gdext.classes.Area3D.mb_get_gravity_space_override_mode == null) gdext.classes.Area3D.mb_get_gravity_space_override_mode = MethodBind.get("Area3D", "get_gravity_space_override_mode", 958191869L)
    Ptrcall.call0[Long](gdext.classes.Area3D.mb_get_gravity_space_override_mode, livePtr)
  }

  /** Area3D.set_gravity_is_point */
  final def setGravityIsPoint(enable: Boolean): Unit = {
    if (gdext.classes.Area3D.mb_set_gravity_is_point == null) gdext.classes.Area3D.mb_set_gravity_is_point = MethodBind.get("Area3D", "set_gravity_is_point", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_gravity_is_point, livePtr, enable)
  }

  /** Area3D.is_gravity_a_point */
  final def isGravityAPoint(): Boolean = {
    if (gdext.classes.Area3D.mb_is_gravity_a_point == null) gdext.classes.Area3D.mb_is_gravity_a_point = MethodBind.get("Area3D", "is_gravity_a_point", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Area3D.mb_is_gravity_a_point, livePtr)
  }

  /** Area3D.set_gravity_point_unit_distance */
  final def setGravityPointUnitDistance(distance_scale: Double): Unit = {
    if (gdext.classes.Area3D.mb_set_gravity_point_unit_distance == null) gdext.classes.Area3D.mb_set_gravity_point_unit_distance = MethodBind.get("Area3D", "set_gravity_point_unit_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_gravity_point_unit_distance, livePtr, distance_scale)
  }

  /** Area3D.get_gravity_point_unit_distance */
  final def getGravityPointUnitDistance(): Double = {
    if (gdext.classes.Area3D.mb_get_gravity_point_unit_distance == null) gdext.classes.Area3D.mb_get_gravity_point_unit_distance = MethodBind.get("Area3D", "get_gravity_point_unit_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Area3D.mb_get_gravity_point_unit_distance, livePtr)
  }

  /** Area3D.set_gravity_point_center */
  final def setGravityPointCenter(center: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Area3D.mb_set_gravity_point_center == null) gdext.classes.Area3D.mb_set_gravity_point_center = MethodBind.get("Area3D", "set_gravity_point_center", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_gravity_point_center, livePtr, center)
  }

  /** Area3D.get_gravity_point_center */
  final def getGravityPointCenter(): gdext.builtin.Vector3 = {
    if (gdext.classes.Area3D.mb_get_gravity_point_center == null) gdext.classes.Area3D.mb_get_gravity_point_center = MethodBind.get("Area3D", "get_gravity_point_center", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.Area3D.mb_get_gravity_point_center, livePtr)
  }

  /** Area3D.set_gravity_direction */
  final def setGravityDirection(direction: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Area3D.mb_set_gravity_direction == null) gdext.classes.Area3D.mb_set_gravity_direction = MethodBind.get("Area3D", "set_gravity_direction", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_gravity_direction, livePtr, direction)
  }

  /** Area3D.get_gravity_direction */
  final def getGravityDirection(): gdext.builtin.Vector3 = {
    if (gdext.classes.Area3D.mb_get_gravity_direction == null) gdext.classes.Area3D.mb_get_gravity_direction = MethodBind.get("Area3D", "get_gravity_direction", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.Area3D.mb_get_gravity_direction, livePtr)
  }

  /** Area3D.set_gravity */
  final def setGravity(gravity: Double): Unit = {
    if (gdext.classes.Area3D.mb_set_gravity == null) gdext.classes.Area3D.mb_set_gravity = MethodBind.get("Area3D", "set_gravity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_gravity, livePtr, gravity)
  }

  /** Area3D.get_gravity */
  final def getGravity(): Double = {
    if (gdext.classes.Area3D.mb_get_gravity == null) gdext.classes.Area3D.mb_get_gravity = MethodBind.get("Area3D", "get_gravity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Area3D.mb_get_gravity, livePtr)
  }

  /** Area3D.set_linear_damp_space_override_mode */
  final def setLinearDampSpaceOverrideMode(space_override_mode: Long): Unit = {
    if (gdext.classes.Area3D.mb_set_linear_damp_space_override_mode == null) gdext.classes.Area3D.mb_set_linear_damp_space_override_mode = MethodBind.get("Area3D", "set_linear_damp_space_override_mode", 2311433571L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_linear_damp_space_override_mode, livePtr, space_override_mode)
  }

  /** Area3D.get_linear_damp_space_override_mode */
  final def getLinearDampSpaceOverrideMode(): Long = {
    if (gdext.classes.Area3D.mb_get_linear_damp_space_override_mode == null) gdext.classes.Area3D.mb_get_linear_damp_space_override_mode = MethodBind.get("Area3D", "get_linear_damp_space_override_mode", 958191869L)
    Ptrcall.call0[Long](gdext.classes.Area3D.mb_get_linear_damp_space_override_mode, livePtr)
  }

  /** Area3D.set_angular_damp_space_override_mode */
  final def setAngularDampSpaceOverrideMode(space_override_mode: Long): Unit = {
    if (gdext.classes.Area3D.mb_set_angular_damp_space_override_mode == null) gdext.classes.Area3D.mb_set_angular_damp_space_override_mode = MethodBind.get("Area3D", "set_angular_damp_space_override_mode", 2311433571L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_angular_damp_space_override_mode, livePtr, space_override_mode)
  }

  /** Area3D.get_angular_damp_space_override_mode */
  final def getAngularDampSpaceOverrideMode(): Long = {
    if (gdext.classes.Area3D.mb_get_angular_damp_space_override_mode == null) gdext.classes.Area3D.mb_get_angular_damp_space_override_mode = MethodBind.get("Area3D", "get_angular_damp_space_override_mode", 958191869L)
    Ptrcall.call0[Long](gdext.classes.Area3D.mb_get_angular_damp_space_override_mode, livePtr)
  }

  /** Area3D.set_angular_damp */
  final def setAngularDamp(angular_damp: Double): Unit = {
    if (gdext.classes.Area3D.mb_set_angular_damp == null) gdext.classes.Area3D.mb_set_angular_damp = MethodBind.get("Area3D", "set_angular_damp", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_angular_damp, livePtr, angular_damp)
  }

  /** Area3D.get_angular_damp */
  final def getAngularDamp(): Double = {
    if (gdext.classes.Area3D.mb_get_angular_damp == null) gdext.classes.Area3D.mb_get_angular_damp = MethodBind.get("Area3D", "get_angular_damp", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Area3D.mb_get_angular_damp, livePtr)
  }

  /** Area3D.set_linear_damp */
  final def setLinearDamp(linear_damp: Double): Unit = {
    if (gdext.classes.Area3D.mb_set_linear_damp == null) gdext.classes.Area3D.mb_set_linear_damp = MethodBind.get("Area3D", "set_linear_damp", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_linear_damp, livePtr, linear_damp)
  }

  /** Area3D.get_linear_damp */
  final def getLinearDamp(): Double = {
    if (gdext.classes.Area3D.mb_get_linear_damp == null) gdext.classes.Area3D.mb_get_linear_damp = MethodBind.get("Area3D", "get_linear_damp", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Area3D.mb_get_linear_damp, livePtr)
  }

  /** Area3D.set_priority */
  final def setPriority(priority: Long): Unit = {
    if (gdext.classes.Area3D.mb_set_priority == null) gdext.classes.Area3D.mb_set_priority = MethodBind.get("Area3D", "set_priority", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_priority, livePtr, priority)
  }

  /** Area3D.get_priority */
  final def getPriority(): Long = {
    if (gdext.classes.Area3D.mb_get_priority == null) gdext.classes.Area3D.mb_get_priority = MethodBind.get("Area3D", "get_priority", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Area3D.mb_get_priority, livePtr)
  }

  /** Area3D.set_wind_force_magnitude */
  final def setWindForceMagnitude(wind_force_magnitude: Double): Unit = {
    if (gdext.classes.Area3D.mb_set_wind_force_magnitude == null) gdext.classes.Area3D.mb_set_wind_force_magnitude = MethodBind.get("Area3D", "set_wind_force_magnitude", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_wind_force_magnitude, livePtr, wind_force_magnitude)
  }

  /** Area3D.get_wind_force_magnitude */
  final def getWindForceMagnitude(): Double = {
    if (gdext.classes.Area3D.mb_get_wind_force_magnitude == null) gdext.classes.Area3D.mb_get_wind_force_magnitude = MethodBind.get("Area3D", "get_wind_force_magnitude", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Area3D.mb_get_wind_force_magnitude, livePtr)
  }

  /** Area3D.set_wind_attenuation_factor */
  final def setWindAttenuationFactor(wind_attenuation_factor: Double): Unit = {
    if (gdext.classes.Area3D.mb_set_wind_attenuation_factor == null) gdext.classes.Area3D.mb_set_wind_attenuation_factor = MethodBind.get("Area3D", "set_wind_attenuation_factor", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_wind_attenuation_factor, livePtr, wind_attenuation_factor)
  }

  /** Area3D.get_wind_attenuation_factor */
  final def getWindAttenuationFactor(): Double = {
    if (gdext.classes.Area3D.mb_get_wind_attenuation_factor == null) gdext.classes.Area3D.mb_get_wind_attenuation_factor = MethodBind.get("Area3D", "get_wind_attenuation_factor", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Area3D.mb_get_wind_attenuation_factor, livePtr)
  }

  /** Area3D.set_monitorable */
  final def setMonitorable(enable: Boolean): Unit = {
    if (gdext.classes.Area3D.mb_set_monitorable == null) gdext.classes.Area3D.mb_set_monitorable = MethodBind.get("Area3D", "set_monitorable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_monitorable, livePtr, enable)
  }

  /** Area3D.is_monitorable */
  final def isMonitorable(): Boolean = {
    if (gdext.classes.Area3D.mb_is_monitorable == null) gdext.classes.Area3D.mb_is_monitorable = MethodBind.get("Area3D", "is_monitorable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Area3D.mb_is_monitorable, livePtr)
  }

  /** Area3D.set_monitoring */
  final def setMonitoring(enable: Boolean): Unit = {
    if (gdext.classes.Area3D.mb_set_monitoring == null) gdext.classes.Area3D.mb_set_monitoring = MethodBind.get("Area3D", "set_monitoring", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_monitoring, livePtr, enable)
  }

  /** Area3D.is_monitoring */
  final def isMonitoring(): Boolean = {
    if (gdext.classes.Area3D.mb_is_monitoring == null) gdext.classes.Area3D.mb_is_monitoring = MethodBind.get("Area3D", "is_monitoring", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Area3D.mb_is_monitoring, livePtr)
  }

  /** Area3D.has_overlapping_bodies */
  final def hasOverlappingBodies(): Boolean = {
    if (gdext.classes.Area3D.mb_has_overlapping_bodies == null) gdext.classes.Area3D.mb_has_overlapping_bodies = MethodBind.get("Area3D", "has_overlapping_bodies", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Area3D.mb_has_overlapping_bodies, livePtr)
  }

  /** Area3D.has_overlapping_areas */
  final def hasOverlappingAreas(): Boolean = {
    if (gdext.classes.Area3D.mb_has_overlapping_areas == null) gdext.classes.Area3D.mb_has_overlapping_areas = MethodBind.get("Area3D", "has_overlapping_areas", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Area3D.mb_has_overlapping_areas, livePtr)
  }

  /** Area3D.overlaps_body */
  final def overlapsBody(body: Node): Boolean = {
    if (gdext.classes.Area3D.mb_overlaps_body == null) gdext.classes.Area3D.mb_overlaps_body = MethodBind.get("Area3D", "overlaps_body", 3093956946L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.Area3D.mb_overlaps_body, livePtr, Wrappers.handle(body))
  }

  /** Area3D.overlaps_area */
  final def overlapsArea(area: Node): Boolean = {
    if (gdext.classes.Area3D.mb_overlaps_area == null) gdext.classes.Area3D.mb_overlaps_area = MethodBind.get("Area3D", "overlaps_area", 3093956946L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.Area3D.mb_overlaps_area, livePtr, Wrappers.handle(area))
  }

  /** Area3D.set_audio_bus_override */
  final def setAudioBusOverride(enable: Boolean): Unit = {
    if (gdext.classes.Area3D.mb_set_audio_bus_override == null) gdext.classes.Area3D.mb_set_audio_bus_override = MethodBind.get("Area3D", "set_audio_bus_override", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_audio_bus_override, livePtr, enable)
  }

  /** Area3D.is_overriding_audio_bus */
  final def isOverridingAudioBus(): Boolean = {
    if (gdext.classes.Area3D.mb_is_overriding_audio_bus == null) gdext.classes.Area3D.mb_is_overriding_audio_bus = MethodBind.get("Area3D", "is_overriding_audio_bus", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Area3D.mb_is_overriding_audio_bus, livePtr)
  }

  /** Area3D.set_audio_bus_name */
  final def setAudioBusName(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Area3D.mb_set_audio_bus_name == null) gdext.classes.Area3D.mb_set_audio_bus_name = MethodBind.get("Area3D", "set_audio_bus_name", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_audio_bus_name, livePtr, name)
  }

  /** Area3D.get_audio_bus_name */
  final def getAudioBusName(): gdext.builtin.StringName = {
    if (gdext.classes.Area3D.mb_get_audio_bus_name == null) gdext.classes.Area3D.mb_get_audio_bus_name = MethodBind.get("Area3D", "get_audio_bus_name", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.Area3D.mb_get_audio_bus_name, livePtr)
  }

  /** Area3D.set_use_reverb_bus */
  final def setUseReverbBus(enable: Boolean): Unit = {
    if (gdext.classes.Area3D.mb_set_use_reverb_bus == null) gdext.classes.Area3D.mb_set_use_reverb_bus = MethodBind.get("Area3D", "set_use_reverb_bus", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_use_reverb_bus, livePtr, enable)
  }

  /** Area3D.is_using_reverb_bus */
  final def isUsingReverbBus(): Boolean = {
    if (gdext.classes.Area3D.mb_is_using_reverb_bus == null) gdext.classes.Area3D.mb_is_using_reverb_bus = MethodBind.get("Area3D", "is_using_reverb_bus", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Area3D.mb_is_using_reverb_bus, livePtr)
  }

  /** Area3D.set_reverb_bus_name */
  final def setReverbBusName(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Area3D.mb_set_reverb_bus_name == null) gdext.classes.Area3D.mb_set_reverb_bus_name = MethodBind.get("Area3D", "set_reverb_bus_name", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_reverb_bus_name, livePtr, name)
  }

  /** Area3D.get_reverb_bus_name */
  final def getReverbBusName(): gdext.builtin.StringName = {
    if (gdext.classes.Area3D.mb_get_reverb_bus_name == null) gdext.classes.Area3D.mb_get_reverb_bus_name = MethodBind.get("Area3D", "get_reverb_bus_name", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.Area3D.mb_get_reverb_bus_name, livePtr)
  }

  /** Area3D.set_reverb_amount */
  final def setReverbAmount(amount: Double): Unit = {
    if (gdext.classes.Area3D.mb_set_reverb_amount == null) gdext.classes.Area3D.mb_set_reverb_amount = MethodBind.get("Area3D", "set_reverb_amount", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_reverb_amount, livePtr, amount)
  }

  /** Area3D.get_reverb_amount */
  final def getReverbAmount(): Double = {
    if (gdext.classes.Area3D.mb_get_reverb_amount == null) gdext.classes.Area3D.mb_get_reverb_amount = MethodBind.get("Area3D", "get_reverb_amount", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Area3D.mb_get_reverb_amount, livePtr)
  }

  /** Area3D.set_reverb_uniformity */
  final def setReverbUniformity(amount: Double): Unit = {
    if (gdext.classes.Area3D.mb_set_reverb_uniformity == null) gdext.classes.Area3D.mb_set_reverb_uniformity = MethodBind.get("Area3D", "set_reverb_uniformity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Area3D.mb_set_reverb_uniformity, livePtr, amount)
  }

  /** Area3D.get_reverb_uniformity */
  final def getReverbUniformity(): Double = {
    if (gdext.classes.Area3D.mb_get_reverb_uniformity == null) gdext.classes.Area3D.mb_get_reverb_uniformity = MethodBind.get("Area3D", "get_reverb_uniformity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Area3D.mb_get_reverb_uniformity, livePtr)
  }

}

object Area3D {
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
  private[classes] var mb_set_angular_damp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angular_damp: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_linear_damp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_linear_damp: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_wind_force_magnitude: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_wind_force_magnitude: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_wind_attenuation_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_wind_attenuation_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_monitorable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_monitorable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_monitoring: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_monitoring: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_overlapping_bodies: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_overlapping_areas: GDExtensionMethodBindPtr = null
  private[classes] var mb_overlaps_body: GDExtensionMethodBindPtr = null
  private[classes] var mb_overlaps_area: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_audio_bus_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_overriding_audio_bus: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_audio_bus_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_audio_bus_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_reverb_bus: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_reverb_bus: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reverb_bus_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reverb_bus_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reverb_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reverb_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reverb_uniformity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reverb_uniformity: GDExtensionMethodBindPtr = null
}
