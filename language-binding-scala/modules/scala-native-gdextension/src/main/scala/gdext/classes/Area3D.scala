package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Area3D`, extends `CollisionObject3D`. */
abstract class Area3D extends CollisionObject3D {

  /** Area3D.set_gravity_space_override_mode */
  final def setGravitySpaceOverrideMode(space_override_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_gravity_space_override_mode", 2311433571L), hostObject.objectPtr, space_override_mode)

  /** Area3D.get_gravity_space_override_mode */
  final def getGravitySpaceOverrideMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Area3D", "get_gravity_space_override_mode", 958191869L), hostObject.objectPtr)

  /** Area3D.set_gravity_is_point */
  final def setGravityIsPoint(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_gravity_is_point", 2586408642L), hostObject.objectPtr, enable)

  /** Area3D.is_gravity_a_point */
  final def isGravityAPoint(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Area3D", "is_gravity_a_point", 36873697L), hostObject.objectPtr)

  /** Area3D.set_gravity_point_unit_distance */
  final def setGravityPointUnitDistance(distance_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_gravity_point_unit_distance", 373806689L), hostObject.objectPtr, distance_scale)

  /** Area3D.get_gravity_point_unit_distance */
  final def getGravityPointUnitDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("Area3D", "get_gravity_point_unit_distance", 1740695150L), hostObject.objectPtr)

  /** Area3D.set_gravity_point_center */
  final def setGravityPointCenter(center: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_gravity_point_center", 3460891852L), hostObject.objectPtr, center)

  /** Area3D.get_gravity_point_center */
  final def getGravityPointCenter(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("Area3D", "get_gravity_point_center", 3360562783L), hostObject.objectPtr)

  /** Area3D.set_gravity_direction */
  final def setGravityDirection(direction: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_gravity_direction", 3460891852L), hostObject.objectPtr, direction)

  /** Area3D.get_gravity_direction */
  final def getGravityDirection(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("Area3D", "get_gravity_direction", 3360562783L), hostObject.objectPtr)

  /** Area3D.set_gravity */
  final def setGravity(gravity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_gravity", 373806689L), hostObject.objectPtr, gravity)

  /** Area3D.get_gravity */
  final def getGravity(): Double =
    Ptrcall.call0[Double](MethodBind.get("Area3D", "get_gravity", 1740695150L), hostObject.objectPtr)

  /** Area3D.set_linear_damp_space_override_mode */
  final def setLinearDampSpaceOverrideMode(space_override_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_linear_damp_space_override_mode", 2311433571L), hostObject.objectPtr, space_override_mode)

  /** Area3D.get_linear_damp_space_override_mode */
  final def getLinearDampSpaceOverrideMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Area3D", "get_linear_damp_space_override_mode", 958191869L), hostObject.objectPtr)

  /** Area3D.set_angular_damp_space_override_mode */
  final def setAngularDampSpaceOverrideMode(space_override_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_angular_damp_space_override_mode", 2311433571L), hostObject.objectPtr, space_override_mode)

  /** Area3D.get_angular_damp_space_override_mode */
  final def getAngularDampSpaceOverrideMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Area3D", "get_angular_damp_space_override_mode", 958191869L), hostObject.objectPtr)

  /** Area3D.set_angular_damp */
  final def setAngularDamp(angular_damp: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_angular_damp", 373806689L), hostObject.objectPtr, angular_damp)

  /** Area3D.get_angular_damp */
  final def getAngularDamp(): Double =
    Ptrcall.call0[Double](MethodBind.get("Area3D", "get_angular_damp", 1740695150L), hostObject.objectPtr)

  /** Area3D.set_linear_damp */
  final def setLinearDamp(linear_damp: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_linear_damp", 373806689L), hostObject.objectPtr, linear_damp)

  /** Area3D.get_linear_damp */
  final def getLinearDamp(): Double =
    Ptrcall.call0[Double](MethodBind.get("Area3D", "get_linear_damp", 1740695150L), hostObject.objectPtr)

  /** Area3D.set_priority */
  final def setPriority(priority: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_priority", 1286410249L), hostObject.objectPtr, priority)

  /** Area3D.get_priority */
  final def getPriority(): Long =
    Ptrcall.call0[Long](MethodBind.get("Area3D", "get_priority", 3905245786L), hostObject.objectPtr)

  /** Area3D.set_wind_force_magnitude */
  final def setWindForceMagnitude(wind_force_magnitude: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_wind_force_magnitude", 373806689L), hostObject.objectPtr, wind_force_magnitude)

  /** Area3D.get_wind_force_magnitude */
  final def getWindForceMagnitude(): Double =
    Ptrcall.call0[Double](MethodBind.get("Area3D", "get_wind_force_magnitude", 1740695150L), hostObject.objectPtr)

  /** Area3D.set_wind_attenuation_factor */
  final def setWindAttenuationFactor(wind_attenuation_factor: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_wind_attenuation_factor", 373806689L), hostObject.objectPtr, wind_attenuation_factor)

  /** Area3D.get_wind_attenuation_factor */
  final def getWindAttenuationFactor(): Double =
    Ptrcall.call0[Double](MethodBind.get("Area3D", "get_wind_attenuation_factor", 1740695150L), hostObject.objectPtr)

  /** Area3D.set_monitorable */
  final def setMonitorable(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_monitorable", 2586408642L), hostObject.objectPtr, enable)

  /** Area3D.is_monitorable */
  final def isMonitorable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Area3D", "is_monitorable", 36873697L), hostObject.objectPtr)

  /** Area3D.set_monitoring */
  final def setMonitoring(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_monitoring", 2586408642L), hostObject.objectPtr, enable)

  /** Area3D.is_monitoring */
  final def isMonitoring(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Area3D", "is_monitoring", 36873697L), hostObject.objectPtr)

  /** Area3D.has_overlapping_bodies */
  final def hasOverlappingBodies(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Area3D", "has_overlapping_bodies", 36873697L), hostObject.objectPtr)

  /** Area3D.has_overlapping_areas */
  final def hasOverlappingAreas(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Area3D", "has_overlapping_areas", 36873697L), hostObject.objectPtr)

  /** Area3D.overlaps_body */
  final def overlapsBody(body: Node): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("Area3D", "overlaps_body", 3093956946L), hostObject.objectPtr, body.hostObject)

  /** Area3D.overlaps_area */
  final def overlapsArea(area: Node): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("Area3D", "overlaps_area", 3093956946L), hostObject.objectPtr, area.hostObject)

  /** Area3D.set_audio_bus_override */
  final def setAudioBusOverride(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_audio_bus_override", 2586408642L), hostObject.objectPtr, enable)

  /** Area3D.is_overriding_audio_bus */
  final def isOverridingAudioBus(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Area3D", "is_overriding_audio_bus", 36873697L), hostObject.objectPtr)

  /** Area3D.set_audio_bus_name */
  final def setAudioBusName(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_audio_bus_name", 3304788590L), hostObject.objectPtr, name)

  /** Area3D.get_audio_bus_name */
  final def getAudioBusName(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("Area3D", "get_audio_bus_name", 2002593661L), hostObject.objectPtr)

  /** Area3D.set_use_reverb_bus */
  final def setUseReverbBus(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_use_reverb_bus", 2586408642L), hostObject.objectPtr, enable)

  /** Area3D.is_using_reverb_bus */
  final def isUsingReverbBus(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Area3D", "is_using_reverb_bus", 36873697L), hostObject.objectPtr)

  /** Area3D.set_reverb_bus_name */
  final def setReverbBusName(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_reverb_bus_name", 3304788590L), hostObject.objectPtr, name)

  /** Area3D.get_reverb_bus_name */
  final def getReverbBusName(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("Area3D", "get_reverb_bus_name", 2002593661L), hostObject.objectPtr)

  /** Area3D.set_reverb_amount */
  final def setReverbAmount(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_reverb_amount", 373806689L), hostObject.objectPtr, amount)

  /** Area3D.get_reverb_amount */
  final def getReverbAmount(): Double =
    Ptrcall.call0[Double](MethodBind.get("Area3D", "get_reverb_amount", 1740695150L), hostObject.objectPtr)

  /** Area3D.set_reverb_uniformity */
  final def setReverbUniformity(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area3D", "set_reverb_uniformity", 373806689L), hostObject.objectPtr, amount)

  /** Area3D.get_reverb_uniformity */
  final def getReverbUniformity(): Double =
    Ptrcall.call0[Double](MethodBind.get("Area3D", "get_reverb_uniformity", 1740695150L), hostObject.objectPtr)

}

object Area3D {
  /** Class metadata for Gd[Area3D] lifetime management and casting. */
  given GodotClass[Area3D] with {
    def className = "Area3D"
    def isRefCounted = false
    def wrap(o: GodotObject): Area3D = new Area3D {}.withHost(o.objectPtr)
    def unwrap(t: Area3D): GodotObject = t.hostObject
  }
}
