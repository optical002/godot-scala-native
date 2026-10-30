package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CharacterBody3D`, extends `PhysicsBody3D`. */
abstract class CharacterBody3D extends PhysicsBody3D {
  override def godotClassName: String = "CharacterBody3D"

  /** CharacterBody3D.move_and_slide */
  final def moveAndSlide(): Boolean = {
    if (gdext.classes.CharacterBody3D.mb_move_and_slide == null) gdext.classes.CharacterBody3D.mb_move_and_slide = MethodBind.get("CharacterBody3D", "move_and_slide", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.CharacterBody3D.mb_move_and_slide, livePtr)
  }

  /** CharacterBody3D.apply_floor_snap */
  final def applyFloorSnap(): Unit = {
    if (gdext.classes.CharacterBody3D.mb_apply_floor_snap == null) gdext.classes.CharacterBody3D.mb_apply_floor_snap = MethodBind.get("CharacterBody3D", "apply_floor_snap", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CharacterBody3D.mb_apply_floor_snap, livePtr)
  }

  /** CharacterBody3D.set_velocity */
  final def setVelocity(velocity: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.CharacterBody3D.mb_set_velocity == null) gdext.classes.CharacterBody3D.mb_set_velocity = MethodBind.get("CharacterBody3D", "set_velocity", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.CharacterBody3D.mb_set_velocity, livePtr, velocity)
  }

  /** CharacterBody3D.get_velocity */
  final def getVelocity(): gdext.builtin.Vector3 = {
    if (gdext.classes.CharacterBody3D.mb_get_velocity == null) gdext.classes.CharacterBody3D.mb_get_velocity = MethodBind.get("CharacterBody3D", "get_velocity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.CharacterBody3D.mb_get_velocity, livePtr)
  }

  /** CharacterBody3D.set_safe_margin */
  final def setSafeMargin(margin: Double): Unit = {
    if (gdext.classes.CharacterBody3D.mb_set_safe_margin == null) gdext.classes.CharacterBody3D.mb_set_safe_margin = MethodBind.get("CharacterBody3D", "set_safe_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CharacterBody3D.mb_set_safe_margin, livePtr, margin)
  }

  /** CharacterBody3D.get_safe_margin */
  final def getSafeMargin(): Double = {
    if (gdext.classes.CharacterBody3D.mb_get_safe_margin == null) gdext.classes.CharacterBody3D.mb_get_safe_margin = MethodBind.get("CharacterBody3D", "get_safe_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CharacterBody3D.mb_get_safe_margin, livePtr)
  }

  /** CharacterBody3D.is_floor_stop_on_slope_enabled */
  final def isFloorStopOnSlopeEnabled(): Boolean = {
    if (gdext.classes.CharacterBody3D.mb_is_floor_stop_on_slope_enabled == null) gdext.classes.CharacterBody3D.mb_is_floor_stop_on_slope_enabled = MethodBind.get("CharacterBody3D", "is_floor_stop_on_slope_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CharacterBody3D.mb_is_floor_stop_on_slope_enabled, livePtr)
  }

  /** CharacterBody3D.set_floor_stop_on_slope_enabled */
  final def setFloorStopOnSlopeEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.CharacterBody3D.mb_set_floor_stop_on_slope_enabled == null) gdext.classes.CharacterBody3D.mb_set_floor_stop_on_slope_enabled = MethodBind.get("CharacterBody3D", "set_floor_stop_on_slope_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CharacterBody3D.mb_set_floor_stop_on_slope_enabled, livePtr, enabled)
  }

  /** CharacterBody3D.set_floor_constant_speed_enabled */
  final def setFloorConstantSpeedEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.CharacterBody3D.mb_set_floor_constant_speed_enabled == null) gdext.classes.CharacterBody3D.mb_set_floor_constant_speed_enabled = MethodBind.get("CharacterBody3D", "set_floor_constant_speed_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CharacterBody3D.mb_set_floor_constant_speed_enabled, livePtr, enabled)
  }

  /** CharacterBody3D.is_floor_constant_speed_enabled */
  final def isFloorConstantSpeedEnabled(): Boolean = {
    if (gdext.classes.CharacterBody3D.mb_is_floor_constant_speed_enabled == null) gdext.classes.CharacterBody3D.mb_is_floor_constant_speed_enabled = MethodBind.get("CharacterBody3D", "is_floor_constant_speed_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CharacterBody3D.mb_is_floor_constant_speed_enabled, livePtr)
  }

  /** CharacterBody3D.set_floor_block_on_wall_enabled */
  final def setFloorBlockOnWallEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.CharacterBody3D.mb_set_floor_block_on_wall_enabled == null) gdext.classes.CharacterBody3D.mb_set_floor_block_on_wall_enabled = MethodBind.get("CharacterBody3D", "set_floor_block_on_wall_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CharacterBody3D.mb_set_floor_block_on_wall_enabled, livePtr, enabled)
  }

  /** CharacterBody3D.is_floor_block_on_wall_enabled */
  final def isFloorBlockOnWallEnabled(): Boolean = {
    if (gdext.classes.CharacterBody3D.mb_is_floor_block_on_wall_enabled == null) gdext.classes.CharacterBody3D.mb_is_floor_block_on_wall_enabled = MethodBind.get("CharacterBody3D", "is_floor_block_on_wall_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CharacterBody3D.mb_is_floor_block_on_wall_enabled, livePtr)
  }

  /** CharacterBody3D.set_slide_on_ceiling_enabled */
  final def setSlideOnCeilingEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.CharacterBody3D.mb_set_slide_on_ceiling_enabled == null) gdext.classes.CharacterBody3D.mb_set_slide_on_ceiling_enabled = MethodBind.get("CharacterBody3D", "set_slide_on_ceiling_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CharacterBody3D.mb_set_slide_on_ceiling_enabled, livePtr, enabled)
  }

  /** CharacterBody3D.is_slide_on_ceiling_enabled */
  final def isSlideOnCeilingEnabled(): Boolean = {
    if (gdext.classes.CharacterBody3D.mb_is_slide_on_ceiling_enabled == null) gdext.classes.CharacterBody3D.mb_is_slide_on_ceiling_enabled = MethodBind.get("CharacterBody3D", "is_slide_on_ceiling_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CharacterBody3D.mb_is_slide_on_ceiling_enabled, livePtr)
  }

  /** CharacterBody3D.set_platform_floor_layers */
  final def setPlatformFloorLayers(excludeLayer: Long): Unit = {
    if (gdext.classes.CharacterBody3D.mb_set_platform_floor_layers == null) gdext.classes.CharacterBody3D.mb_set_platform_floor_layers = MethodBind.get("CharacterBody3D", "set_platform_floor_layers", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CharacterBody3D.mb_set_platform_floor_layers, livePtr, excludeLayer)
  }

  /** CharacterBody3D.get_platform_floor_layers */
  final def getPlatformFloorLayers(): Long = {
    if (gdext.classes.CharacterBody3D.mb_get_platform_floor_layers == null) gdext.classes.CharacterBody3D.mb_get_platform_floor_layers = MethodBind.get("CharacterBody3D", "get_platform_floor_layers", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CharacterBody3D.mb_get_platform_floor_layers, livePtr)
  }

  /** CharacterBody3D.set_platform_wall_layers */
  final def setPlatformWallLayers(excludeLayer: Long): Unit = {
    if (gdext.classes.CharacterBody3D.mb_set_platform_wall_layers == null) gdext.classes.CharacterBody3D.mb_set_platform_wall_layers = MethodBind.get("CharacterBody3D", "set_platform_wall_layers", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CharacterBody3D.mb_set_platform_wall_layers, livePtr, excludeLayer)
  }

  /** CharacterBody3D.get_platform_wall_layers */
  final def getPlatformWallLayers(): Long = {
    if (gdext.classes.CharacterBody3D.mb_get_platform_wall_layers == null) gdext.classes.CharacterBody3D.mb_get_platform_wall_layers = MethodBind.get("CharacterBody3D", "get_platform_wall_layers", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CharacterBody3D.mb_get_platform_wall_layers, livePtr)
  }

  /** CharacterBody3D.get_max_slides */
  final def getMaxSlides(): Long = {
    if (gdext.classes.CharacterBody3D.mb_get_max_slides == null) gdext.classes.CharacterBody3D.mb_get_max_slides = MethodBind.get("CharacterBody3D", "get_max_slides", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CharacterBody3D.mb_get_max_slides, livePtr)
  }

  /** CharacterBody3D.set_max_slides */
  final def setMaxSlides(maxSlides: Long): Unit = {
    if (gdext.classes.CharacterBody3D.mb_set_max_slides == null) gdext.classes.CharacterBody3D.mb_set_max_slides = MethodBind.get("CharacterBody3D", "set_max_slides", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CharacterBody3D.mb_set_max_slides, livePtr, maxSlides)
  }

  /** CharacterBody3D.get_floor_max_angle */
  final def getFloorMaxAngle(): Double = {
    if (gdext.classes.CharacterBody3D.mb_get_floor_max_angle == null) gdext.classes.CharacterBody3D.mb_get_floor_max_angle = MethodBind.get("CharacterBody3D", "get_floor_max_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CharacterBody3D.mb_get_floor_max_angle, livePtr)
  }

  /** CharacterBody3D.set_floor_max_angle */
  final def setFloorMaxAngle(radians: Double): Unit = {
    if (gdext.classes.CharacterBody3D.mb_set_floor_max_angle == null) gdext.classes.CharacterBody3D.mb_set_floor_max_angle = MethodBind.get("CharacterBody3D", "set_floor_max_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CharacterBody3D.mb_set_floor_max_angle, livePtr, radians)
  }

  /** CharacterBody3D.get_floor_snap_length */
  final def getFloorSnapLength(): Double = {
    if (gdext.classes.CharacterBody3D.mb_get_floor_snap_length == null) gdext.classes.CharacterBody3D.mb_get_floor_snap_length = MethodBind.get("CharacterBody3D", "get_floor_snap_length", 191475506L)
    Ptrcall.call0[Double](gdext.classes.CharacterBody3D.mb_get_floor_snap_length, livePtr)
  }

  /** CharacterBody3D.set_floor_snap_length */
  final def setFloorSnapLength(floorSnapLength: Double): Unit = {
    if (gdext.classes.CharacterBody3D.mb_set_floor_snap_length == null) gdext.classes.CharacterBody3D.mb_set_floor_snap_length = MethodBind.get("CharacterBody3D", "set_floor_snap_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CharacterBody3D.mb_set_floor_snap_length, livePtr, floorSnapLength)
  }

  /** CharacterBody3D.get_wall_min_slide_angle */
  final def getWallMinSlideAngle(): Double = {
    if (gdext.classes.CharacterBody3D.mb_get_wall_min_slide_angle == null) gdext.classes.CharacterBody3D.mb_get_wall_min_slide_angle = MethodBind.get("CharacterBody3D", "get_wall_min_slide_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CharacterBody3D.mb_get_wall_min_slide_angle, livePtr)
  }

  /** CharacterBody3D.set_wall_min_slide_angle */
  final def setWallMinSlideAngle(radians: Double): Unit = {
    if (gdext.classes.CharacterBody3D.mb_set_wall_min_slide_angle == null) gdext.classes.CharacterBody3D.mb_set_wall_min_slide_angle = MethodBind.get("CharacterBody3D", "set_wall_min_slide_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CharacterBody3D.mb_set_wall_min_slide_angle, livePtr, radians)
  }

  /** CharacterBody3D.get_up_direction */
  final def getUpDirection(): gdext.builtin.Vector3 = {
    if (gdext.classes.CharacterBody3D.mb_get_up_direction == null) gdext.classes.CharacterBody3D.mb_get_up_direction = MethodBind.get("CharacterBody3D", "get_up_direction", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.CharacterBody3D.mb_get_up_direction, livePtr)
  }

  /** CharacterBody3D.set_up_direction */
  final def setUpDirection(upDirection: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.CharacterBody3D.mb_set_up_direction == null) gdext.classes.CharacterBody3D.mb_set_up_direction = MethodBind.get("CharacterBody3D", "set_up_direction", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.CharacterBody3D.mb_set_up_direction, livePtr, upDirection)
  }

  /** CharacterBody3D.set_motion_mode */
  final def setMotionMode(mode: gdext.classes.CharacterBody3D.MotionMode): Unit = {
    if (gdext.classes.CharacterBody3D.mb_set_motion_mode == null) gdext.classes.CharacterBody3D.mb_set_motion_mode = MethodBind.get("CharacterBody3D", "set_motion_mode", 2690739026L)
    Ptrcall.callVoid1(gdext.classes.CharacterBody3D.mb_set_motion_mode, livePtr, mode)
  }

  /** CharacterBody3D.get_motion_mode */
  final def getMotionMode(): gdext.classes.CharacterBody3D.MotionMode = {
    if (gdext.classes.CharacterBody3D.mb_get_motion_mode == null) gdext.classes.CharacterBody3D.mb_get_motion_mode = MethodBind.get("CharacterBody3D", "get_motion_mode", 3529553604L)
    gdext.classes.CharacterBody3D.MotionMode(Ptrcall.call0[Long](gdext.classes.CharacterBody3D.mb_get_motion_mode, livePtr))
  }

  /** CharacterBody3D.set_platform_on_leave */
  final def setPlatformOnLeave(onLeaveApplyVelocity: gdext.classes.CharacterBody3D.PlatformOnLeave): Unit = {
    if (gdext.classes.CharacterBody3D.mb_set_platform_on_leave == null) gdext.classes.CharacterBody3D.mb_set_platform_on_leave = MethodBind.get("CharacterBody3D", "set_platform_on_leave", 1459986142L)
    Ptrcall.callVoid1(gdext.classes.CharacterBody3D.mb_set_platform_on_leave, livePtr, onLeaveApplyVelocity)
  }

  /** CharacterBody3D.get_platform_on_leave */
  final def getPlatformOnLeave(): gdext.classes.CharacterBody3D.PlatformOnLeave = {
    if (gdext.classes.CharacterBody3D.mb_get_platform_on_leave == null) gdext.classes.CharacterBody3D.mb_get_platform_on_leave = MethodBind.get("CharacterBody3D", "get_platform_on_leave", 996491171L)
    gdext.classes.CharacterBody3D.PlatformOnLeave(Ptrcall.call0[Long](gdext.classes.CharacterBody3D.mb_get_platform_on_leave, livePtr))
  }

  /** CharacterBody3D.is_on_floor */
  final def isOnFloor(): Boolean = {
    if (gdext.classes.CharacterBody3D.mb_is_on_floor == null) gdext.classes.CharacterBody3D.mb_is_on_floor = MethodBind.get("CharacterBody3D", "is_on_floor", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CharacterBody3D.mb_is_on_floor, livePtr)
  }

  /** CharacterBody3D.is_on_floor_only */
  final def isOnFloorOnly(): Boolean = {
    if (gdext.classes.CharacterBody3D.mb_is_on_floor_only == null) gdext.classes.CharacterBody3D.mb_is_on_floor_only = MethodBind.get("CharacterBody3D", "is_on_floor_only", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CharacterBody3D.mb_is_on_floor_only, livePtr)
  }

  /** CharacterBody3D.is_on_ceiling */
  final def isOnCeiling(): Boolean = {
    if (gdext.classes.CharacterBody3D.mb_is_on_ceiling == null) gdext.classes.CharacterBody3D.mb_is_on_ceiling = MethodBind.get("CharacterBody3D", "is_on_ceiling", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CharacterBody3D.mb_is_on_ceiling, livePtr)
  }

  /** CharacterBody3D.is_on_ceiling_only */
  final def isOnCeilingOnly(): Boolean = {
    if (gdext.classes.CharacterBody3D.mb_is_on_ceiling_only == null) gdext.classes.CharacterBody3D.mb_is_on_ceiling_only = MethodBind.get("CharacterBody3D", "is_on_ceiling_only", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CharacterBody3D.mb_is_on_ceiling_only, livePtr)
  }

  /** CharacterBody3D.is_on_wall */
  final def isOnWall(): Boolean = {
    if (gdext.classes.CharacterBody3D.mb_is_on_wall == null) gdext.classes.CharacterBody3D.mb_is_on_wall = MethodBind.get("CharacterBody3D", "is_on_wall", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CharacterBody3D.mb_is_on_wall, livePtr)
  }

  /** CharacterBody3D.is_on_wall_only */
  final def isOnWallOnly(): Boolean = {
    if (gdext.classes.CharacterBody3D.mb_is_on_wall_only == null) gdext.classes.CharacterBody3D.mb_is_on_wall_only = MethodBind.get("CharacterBody3D", "is_on_wall_only", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CharacterBody3D.mb_is_on_wall_only, livePtr)
  }

  /** CharacterBody3D.get_floor_normal */
  final def getFloorNormal(): gdext.builtin.Vector3 = {
    if (gdext.classes.CharacterBody3D.mb_get_floor_normal == null) gdext.classes.CharacterBody3D.mb_get_floor_normal = MethodBind.get("CharacterBody3D", "get_floor_normal", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.CharacterBody3D.mb_get_floor_normal, livePtr)
  }

  /** CharacterBody3D.get_wall_normal */
  final def getWallNormal(): gdext.builtin.Vector3 = {
    if (gdext.classes.CharacterBody3D.mb_get_wall_normal == null) gdext.classes.CharacterBody3D.mb_get_wall_normal = MethodBind.get("CharacterBody3D", "get_wall_normal", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.CharacterBody3D.mb_get_wall_normal, livePtr)
  }

  /** CharacterBody3D.get_last_motion */
  final def getLastMotion(): gdext.builtin.Vector3 = {
    if (gdext.classes.CharacterBody3D.mb_get_last_motion == null) gdext.classes.CharacterBody3D.mb_get_last_motion = MethodBind.get("CharacterBody3D", "get_last_motion", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.CharacterBody3D.mb_get_last_motion, livePtr)
  }

  /** CharacterBody3D.get_position_delta */
  final def getPositionDelta(): gdext.builtin.Vector3 = {
    if (gdext.classes.CharacterBody3D.mb_get_position_delta == null) gdext.classes.CharacterBody3D.mb_get_position_delta = MethodBind.get("CharacterBody3D", "get_position_delta", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.CharacterBody3D.mb_get_position_delta, livePtr)
  }

  /** CharacterBody3D.get_real_velocity */
  final def getRealVelocity(): gdext.builtin.Vector3 = {
    if (gdext.classes.CharacterBody3D.mb_get_real_velocity == null) gdext.classes.CharacterBody3D.mb_get_real_velocity = MethodBind.get("CharacterBody3D", "get_real_velocity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.CharacterBody3D.mb_get_real_velocity, livePtr)
  }

  /** CharacterBody3D.get_floor_angle */
  final def getFloorAngle(upDirection: gdext.builtin.Vector3 = gdext.builtin.Vector3(0f, 1f, 0f)): Double = {
    if (gdext.classes.CharacterBody3D.mb_get_floor_angle == null) gdext.classes.CharacterBody3D.mb_get_floor_angle = MethodBind.get("CharacterBody3D", "get_floor_angle", 2906300789L)
    Ptrcall.call1[gdext.builtin.Vector3, Double](gdext.classes.CharacterBody3D.mb_get_floor_angle, livePtr, upDirection)
  }

  /** CharacterBody3D.get_platform_velocity */
  final def getPlatformVelocity(): gdext.builtin.Vector3 = {
    if (gdext.classes.CharacterBody3D.mb_get_platform_velocity == null) gdext.classes.CharacterBody3D.mb_get_platform_velocity = MethodBind.get("CharacterBody3D", "get_platform_velocity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.CharacterBody3D.mb_get_platform_velocity, livePtr)
  }

  /** CharacterBody3D.get_platform_angular_velocity */
  final def getPlatformAngularVelocity(): gdext.builtin.Vector3 = {
    if (gdext.classes.CharacterBody3D.mb_get_platform_angular_velocity == null) gdext.classes.CharacterBody3D.mb_get_platform_angular_velocity = MethodBind.get("CharacterBody3D", "get_platform_angular_velocity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.CharacterBody3D.mb_get_platform_angular_velocity, livePtr)
  }

  /** CharacterBody3D.get_slide_collision_count */
  final def getSlideCollisionCount(): Long = {
    if (gdext.classes.CharacterBody3D.mb_get_slide_collision_count == null) gdext.classes.CharacterBody3D.mb_get_slide_collision_count = MethodBind.get("CharacterBody3D", "get_slide_collision_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CharacterBody3D.mb_get_slide_collision_count, livePtr)
  }

  /** CharacterBody3D.get_slide_collision. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSlideCollision(slideIdx: Long): KinematicCollision3D = {
    if (gdext.classes.CharacterBody3D.mb_get_slide_collision == null) gdext.classes.CharacterBody3D.mb_get_slide_collision = MethodBind.get("CharacterBody3D", "get_slide_collision", 107003663L)
    Wrappers.owned[KinematicCollision3D](Ptrcall.call1[Long, Long](gdext.classes.CharacterBody3D.mb_get_slide_collision, livePtr, slideIdx))
  }

  /** CharacterBody3D.get_last_slide_collision. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getLastSlideCollision(): KinematicCollision3D = {
    if (gdext.classes.CharacterBody3D.mb_get_last_slide_collision == null) gdext.classes.CharacterBody3D.mb_get_last_slide_collision = MethodBind.get("CharacterBody3D", "get_last_slide_collision", 186875014L)
    Wrappers.owned[KinematicCollision3D](Ptrcall.call0[Long](gdext.classes.CharacterBody3D.mb_get_last_slide_collision, livePtr))
  }

}

object CharacterBody3D {
  private[classes] var mb_move_and_slide: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_floor_snap: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_safe_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_safe_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_floor_stop_on_slope_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_floor_stop_on_slope_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_floor_constant_speed_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_floor_constant_speed_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_floor_block_on_wall_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_floor_block_on_wall_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_slide_on_ceiling_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_slide_on_ceiling_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_platform_floor_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_platform_floor_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_platform_wall_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_platform_wall_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_slides: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_slides: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_floor_max_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_floor_max_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_floor_snap_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_floor_snap_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_wall_min_slide_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_wall_min_slide_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_up_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_up_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_motion_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_motion_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_platform_on_leave: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_platform_on_leave: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_on_floor: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_on_floor_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_on_ceiling: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_on_ceiling_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_on_wall: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_on_wall_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_floor_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_wall_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_last_motion: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position_delta: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_real_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_floor_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_platform_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_platform_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_slide_collision_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_slide_collision: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_last_slide_collision: GDExtensionMethodBindPtr = null

  /** Godot enum `CharacterBody3D.MotionMode`. */
  opaque type MotionMode <: Long = Long

  object MotionMode {
    final val Grounded: MotionMode = 0L.asInstanceOf[MotionMode]
    final val Floating: MotionMode = 1L.asInstanceOf[MotionMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): MotionMode = value.asInstanceOf[MotionMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[MotionMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[MotionMode]]

    extension (self: MotionMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Grounded"
        case 1L => "Floating"
        case other => other.toString
      }
  }

  /** Godot enum `CharacterBody3D.PlatformOnLeave`. */
  opaque type PlatformOnLeave <: Long = Long

  object PlatformOnLeave {
    final val AddVelocity: PlatformOnLeave = 0L.asInstanceOf[PlatformOnLeave]
    final val AddUpwardVelocity: PlatformOnLeave = 1L.asInstanceOf[PlatformOnLeave]
    final val DoNothing: PlatformOnLeave = 2L.asInstanceOf[PlatformOnLeave]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PlatformOnLeave = value.asInstanceOf[PlatformOnLeave]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PlatformOnLeave] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[PlatformOnLeave]]

    extension (self: PlatformOnLeave)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "AddVelocity"
        case 1L => "AddUpwardVelocity"
        case 2L => "DoNothing"
        case other => other.toString
      }
  }
}
