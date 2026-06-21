package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Area2D`, extends `CollisionObject2D`. */
abstract class Area2D extends CollisionObject2D {

  /** Area2D.set_gravity_space_override_mode */
  final def setGravitySpaceOverrideMode(space_override_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area2D", "set_gravity_space_override_mode", 2879900038L), hostObject.objectPtr, space_override_mode)

  /** Area2D.get_gravity_space_override_mode */
  final def getGravitySpaceOverrideMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Area2D", "get_gravity_space_override_mode", 3990256304L), hostObject.objectPtr)

  /** Area2D.set_gravity_is_point */
  final def setGravityIsPoint(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area2D", "set_gravity_is_point", 2586408642L), hostObject.objectPtr, enable)

  /** Area2D.is_gravity_a_point */
  final def isGravityAPoint(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Area2D", "is_gravity_a_point", 36873697L), hostObject.objectPtr)

  /** Area2D.set_gravity_point_unit_distance */
  final def setGravityPointUnitDistance(distance_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area2D", "set_gravity_point_unit_distance", 373806689L), hostObject.objectPtr, distance_scale)

  /** Area2D.get_gravity_point_unit_distance */
  final def getGravityPointUnitDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("Area2D", "get_gravity_point_unit_distance", 1740695150L), hostObject.objectPtr)

  /** Area2D.set_gravity_point_center */
  final def setGravityPointCenter(center: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area2D", "set_gravity_point_center", 743155724L), hostObject.objectPtr, center)

  /** Area2D.get_gravity_point_center */
  final def getGravityPointCenter(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Area2D", "get_gravity_point_center", 3341600327L), hostObject.objectPtr)

  /** Area2D.set_gravity_direction */
  final def setGravityDirection(direction: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area2D", "set_gravity_direction", 743155724L), hostObject.objectPtr, direction)

  /** Area2D.get_gravity_direction */
  final def getGravityDirection(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Area2D", "get_gravity_direction", 3341600327L), hostObject.objectPtr)

  /** Area2D.set_gravity */
  final def setGravity(gravity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area2D", "set_gravity", 373806689L), hostObject.objectPtr, gravity)

  /** Area2D.get_gravity */
  final def getGravity(): Double =
    Ptrcall.call0[Double](MethodBind.get("Area2D", "get_gravity", 1740695150L), hostObject.objectPtr)

  /** Area2D.set_linear_damp_space_override_mode */
  final def setLinearDampSpaceOverrideMode(space_override_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area2D", "set_linear_damp_space_override_mode", 2879900038L), hostObject.objectPtr, space_override_mode)

  /** Area2D.get_linear_damp_space_override_mode */
  final def getLinearDampSpaceOverrideMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Area2D", "get_linear_damp_space_override_mode", 3990256304L), hostObject.objectPtr)

  /** Area2D.set_angular_damp_space_override_mode */
  final def setAngularDampSpaceOverrideMode(space_override_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area2D", "set_angular_damp_space_override_mode", 2879900038L), hostObject.objectPtr, space_override_mode)

  /** Area2D.get_angular_damp_space_override_mode */
  final def getAngularDampSpaceOverrideMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Area2D", "get_angular_damp_space_override_mode", 3990256304L), hostObject.objectPtr)

  /** Area2D.set_linear_damp */
  final def setLinearDamp(linear_damp: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area2D", "set_linear_damp", 373806689L), hostObject.objectPtr, linear_damp)

  /** Area2D.get_linear_damp */
  final def getLinearDamp(): Double =
    Ptrcall.call0[Double](MethodBind.get("Area2D", "get_linear_damp", 1740695150L), hostObject.objectPtr)

  /** Area2D.set_angular_damp */
  final def setAngularDamp(angular_damp: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area2D", "set_angular_damp", 373806689L), hostObject.objectPtr, angular_damp)

  /** Area2D.get_angular_damp */
  final def getAngularDamp(): Double =
    Ptrcall.call0[Double](MethodBind.get("Area2D", "get_angular_damp", 1740695150L), hostObject.objectPtr)

  /** Area2D.set_priority */
  final def setPriority(priority: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area2D", "set_priority", 1286410249L), hostObject.objectPtr, priority)

  /** Area2D.get_priority */
  final def getPriority(): Long =
    Ptrcall.call0[Long](MethodBind.get("Area2D", "get_priority", 3905245786L), hostObject.objectPtr)

  /** Area2D.set_monitoring */
  final def setMonitoring(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area2D", "set_monitoring", 2586408642L), hostObject.objectPtr, enable)

  /** Area2D.is_monitoring */
  final def isMonitoring(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Area2D", "is_monitoring", 36873697L), hostObject.objectPtr)

  /** Area2D.set_monitorable */
  final def setMonitorable(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area2D", "set_monitorable", 2586408642L), hostObject.objectPtr, enable)

  /** Area2D.is_monitorable */
  final def isMonitorable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Area2D", "is_monitorable", 36873697L), hostObject.objectPtr)

  /** Area2D.has_overlapping_bodies */
  final def hasOverlappingBodies(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Area2D", "has_overlapping_bodies", 36873697L), hostObject.objectPtr)

  /** Area2D.has_overlapping_areas */
  final def hasOverlappingAreas(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Area2D", "has_overlapping_areas", 36873697L), hostObject.objectPtr)

  /** Area2D.overlaps_body */
  final def overlapsBody(body: Node): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("Area2D", "overlaps_body", 3093956946L), hostObject.objectPtr, body.hostObject)

  /** Area2D.overlaps_area */
  final def overlapsArea(area: Node): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("Area2D", "overlaps_area", 3093956946L), hostObject.objectPtr, area.hostObject)

  /** Area2D.set_audio_bus_name */
  final def setAudioBusName(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area2D", "set_audio_bus_name", 3304788590L), hostObject.objectPtr, name)

  /** Area2D.get_audio_bus_name */
  final def getAudioBusName(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("Area2D", "get_audio_bus_name", 2002593661L), hostObject.objectPtr)

  /** Area2D.set_audio_bus_override */
  final def setAudioBusOverride(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Area2D", "set_audio_bus_override", 2586408642L), hostObject.objectPtr, enable)

  /** Area2D.is_overriding_audio_bus */
  final def isOverridingAudioBus(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Area2D", "is_overriding_audio_bus", 36873697L), hostObject.objectPtr)

}

object Area2D {
  /** Class metadata for Gd[Area2D] lifetime management and casting. */
  given GodotClass[Area2D] with {
    def className = "Area2D"
    def isRefCounted = false
    def wrap(o: GodotObject): Area2D = new Area2D {}.withHost(o.objectPtr)
    def unwrap(t: Area2D): GodotObject = t.hostObject
  }
}
