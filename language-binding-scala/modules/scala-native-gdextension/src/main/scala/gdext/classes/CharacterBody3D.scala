package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CharacterBody3D`, extends `PhysicsBody3D`. */
abstract class CharacterBody3D extends PhysicsBody3D {
  override def godotClassName: String = "CharacterBody3D"

  /** CharacterBody3D.move_and_slide */
  final def moveAndSlide(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CharacterBody3D", "move_and_slide", 2240911060L), hostObject.objectPtr)

  /** CharacterBody3D.apply_floor_snap */
  final def applyFloorSnap(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CharacterBody3D", "apply_floor_snap", 3218959716L), hostObject.objectPtr)

  /** CharacterBody3D.set_velocity */
  final def setVelocity(velocity: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharacterBody3D", "set_velocity", 3460891852L), hostObject.objectPtr, velocity)

  /** CharacterBody3D.get_velocity */
  final def getVelocity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("CharacterBody3D", "get_velocity", 3360562783L), hostObject.objectPtr)

  /** CharacterBody3D.set_safe_margin */
  final def setSafeMargin(margin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharacterBody3D", "set_safe_margin", 373806689L), hostObject.objectPtr, margin)

  /** CharacterBody3D.get_safe_margin */
  final def getSafeMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("CharacterBody3D", "get_safe_margin", 1740695150L), hostObject.objectPtr)

  /** CharacterBody3D.is_floor_stop_on_slope_enabled */
  final def isFloorStopOnSlopeEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CharacterBody3D", "is_floor_stop_on_slope_enabled", 36873697L), hostObject.objectPtr)

  /** CharacterBody3D.set_floor_stop_on_slope_enabled */
  final def setFloorStopOnSlopeEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharacterBody3D", "set_floor_stop_on_slope_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** CharacterBody3D.set_floor_constant_speed_enabled */
  final def setFloorConstantSpeedEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharacterBody3D", "set_floor_constant_speed_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** CharacterBody3D.is_floor_constant_speed_enabled */
  final def isFloorConstantSpeedEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CharacterBody3D", "is_floor_constant_speed_enabled", 36873697L), hostObject.objectPtr)

  /** CharacterBody3D.set_floor_block_on_wall_enabled */
  final def setFloorBlockOnWallEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharacterBody3D", "set_floor_block_on_wall_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** CharacterBody3D.is_floor_block_on_wall_enabled */
  final def isFloorBlockOnWallEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CharacterBody3D", "is_floor_block_on_wall_enabled", 36873697L), hostObject.objectPtr)

  /** CharacterBody3D.set_slide_on_ceiling_enabled */
  final def setSlideOnCeilingEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharacterBody3D", "set_slide_on_ceiling_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** CharacterBody3D.is_slide_on_ceiling_enabled */
  final def isSlideOnCeilingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CharacterBody3D", "is_slide_on_ceiling_enabled", 36873697L), hostObject.objectPtr)

  /** CharacterBody3D.set_platform_floor_layers */
  final def setPlatformFloorLayers(exclude_layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharacterBody3D", "set_platform_floor_layers", 1286410249L), hostObject.objectPtr, exclude_layer)

  /** CharacterBody3D.get_platform_floor_layers */
  final def getPlatformFloorLayers(): Long =
    Ptrcall.call0[Long](MethodBind.get("CharacterBody3D", "get_platform_floor_layers", 3905245786L), hostObject.objectPtr)

  /** CharacterBody3D.set_platform_wall_layers */
  final def setPlatformWallLayers(exclude_layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharacterBody3D", "set_platform_wall_layers", 1286410249L), hostObject.objectPtr, exclude_layer)

  /** CharacterBody3D.get_platform_wall_layers */
  final def getPlatformWallLayers(): Long =
    Ptrcall.call0[Long](MethodBind.get("CharacterBody3D", "get_platform_wall_layers", 3905245786L), hostObject.objectPtr)

  /** CharacterBody3D.get_max_slides */
  final def getMaxSlides(): Long =
    Ptrcall.call0[Long](MethodBind.get("CharacterBody3D", "get_max_slides", 3905245786L), hostObject.objectPtr)

  /** CharacterBody3D.set_max_slides */
  final def setMaxSlides(max_slides: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharacterBody3D", "set_max_slides", 1286410249L), hostObject.objectPtr, max_slides)

  /** CharacterBody3D.get_floor_max_angle */
  final def getFloorMaxAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("CharacterBody3D", "get_floor_max_angle", 1740695150L), hostObject.objectPtr)

  /** CharacterBody3D.set_floor_max_angle */
  final def setFloorMaxAngle(radians: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharacterBody3D", "set_floor_max_angle", 373806689L), hostObject.objectPtr, radians)

  /** CharacterBody3D.get_floor_snap_length */
  final def getFloorSnapLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("CharacterBody3D", "get_floor_snap_length", 191475506L), hostObject.objectPtr)

  /** CharacterBody3D.set_floor_snap_length */
  final def setFloorSnapLength(floor_snap_length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharacterBody3D", "set_floor_snap_length", 373806689L), hostObject.objectPtr, floor_snap_length)

  /** CharacterBody3D.get_wall_min_slide_angle */
  final def getWallMinSlideAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("CharacterBody3D", "get_wall_min_slide_angle", 1740695150L), hostObject.objectPtr)

  /** CharacterBody3D.set_wall_min_slide_angle */
  final def setWallMinSlideAngle(radians: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharacterBody3D", "set_wall_min_slide_angle", 373806689L), hostObject.objectPtr, radians)

  /** CharacterBody3D.get_up_direction */
  final def getUpDirection(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("CharacterBody3D", "get_up_direction", 3360562783L), hostObject.objectPtr)

  /** CharacterBody3D.set_up_direction */
  final def setUpDirection(up_direction: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharacterBody3D", "set_up_direction", 3460891852L), hostObject.objectPtr, up_direction)

  /** CharacterBody3D.set_motion_mode */
  final def setMotionMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharacterBody3D", "set_motion_mode", 2690739026L), hostObject.objectPtr, mode)

  /** CharacterBody3D.get_motion_mode */
  final def getMotionMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("CharacterBody3D", "get_motion_mode", 3529553604L), hostObject.objectPtr)

  /** CharacterBody3D.set_platform_on_leave */
  final def setPlatformOnLeave(on_leave_apply_velocity: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharacterBody3D", "set_platform_on_leave", 1459986142L), hostObject.objectPtr, on_leave_apply_velocity)

  /** CharacterBody3D.get_platform_on_leave */
  final def getPlatformOnLeave(): Long =
    Ptrcall.call0[Long](MethodBind.get("CharacterBody3D", "get_platform_on_leave", 996491171L), hostObject.objectPtr)

  /** CharacterBody3D.is_on_floor */
  final def isOnFloor(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CharacterBody3D", "is_on_floor", 36873697L), hostObject.objectPtr)

  /** CharacterBody3D.is_on_floor_only */
  final def isOnFloorOnly(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CharacterBody3D", "is_on_floor_only", 36873697L), hostObject.objectPtr)

  /** CharacterBody3D.is_on_ceiling */
  final def isOnCeiling(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CharacterBody3D", "is_on_ceiling", 36873697L), hostObject.objectPtr)

  /** CharacterBody3D.is_on_ceiling_only */
  final def isOnCeilingOnly(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CharacterBody3D", "is_on_ceiling_only", 36873697L), hostObject.objectPtr)

  /** CharacterBody3D.is_on_wall */
  final def isOnWall(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CharacterBody3D", "is_on_wall", 36873697L), hostObject.objectPtr)

  /** CharacterBody3D.is_on_wall_only */
  final def isOnWallOnly(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CharacterBody3D", "is_on_wall_only", 36873697L), hostObject.objectPtr)

  /** CharacterBody3D.get_floor_normal */
  final def getFloorNormal(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("CharacterBody3D", "get_floor_normal", 3360562783L), hostObject.objectPtr)

  /** CharacterBody3D.get_wall_normal */
  final def getWallNormal(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("CharacterBody3D", "get_wall_normal", 3360562783L), hostObject.objectPtr)

  /** CharacterBody3D.get_last_motion */
  final def getLastMotion(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("CharacterBody3D", "get_last_motion", 3360562783L), hostObject.objectPtr)

  /** CharacterBody3D.get_position_delta */
  final def getPositionDelta(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("CharacterBody3D", "get_position_delta", 3360562783L), hostObject.objectPtr)

  /** CharacterBody3D.get_real_velocity */
  final def getRealVelocity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("CharacterBody3D", "get_real_velocity", 3360562783L), hostObject.objectPtr)

  /** CharacterBody3D.get_floor_angle */
  final def getFloorAngle(up_direction: gdext.builtin.Vector3): Double =
    Ptrcall.call1[gdext.builtin.Vector3, Double](MethodBind.get("CharacterBody3D", "get_floor_angle", 2906300789L), hostObject.objectPtr, up_direction)

  /** CharacterBody3D.get_platform_velocity */
  final def getPlatformVelocity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("CharacterBody3D", "get_platform_velocity", 3360562783L), hostObject.objectPtr)

  /** CharacterBody3D.get_platform_angular_velocity */
  final def getPlatformAngularVelocity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("CharacterBody3D", "get_platform_angular_velocity", 3360562783L), hostObject.objectPtr)

  /** CharacterBody3D.get_slide_collision_count */
  final def getSlideCollisionCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("CharacterBody3D", "get_slide_collision_count", 3905245786L), hostObject.objectPtr)

  /** CharacterBody3D.get_slide_collision */
  final def getSlideCollision(slide_idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("CharacterBody3D", "get_slide_collision", 107003663L), hostObject.objectPtr, slide_idx)

  /** CharacterBody3D.get_last_slide_collision */
  final def getLastSlideCollision(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CharacterBody3D", "get_last_slide_collision", 186875014L), hostObject.objectPtr)

}
