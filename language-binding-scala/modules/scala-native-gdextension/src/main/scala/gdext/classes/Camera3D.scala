package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Camera3D`, extends `Node3D`. */
abstract class Camera3D extends Node3D {
  override def godotClassName: String = "Camera3D"

  /** Camera3D.project_ray_normal */
  final def projectRayNormal(screen_point: gdext.builtin.Vector2): gdext.builtin.Vector3 = {
    if (gdext.classes.Camera3D.mb_project_ray_normal == null) gdext.classes.Camera3D.mb_project_ray_normal = MethodBind.get("Camera3D", "project_ray_normal", 1718073306L)
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector3](gdext.classes.Camera3D.mb_project_ray_normal, livePtr, screen_point)
  }

  /** Camera3D.project_local_ray_normal */
  final def projectLocalRayNormal(screen_point: gdext.builtin.Vector2): gdext.builtin.Vector3 = {
    if (gdext.classes.Camera3D.mb_project_local_ray_normal == null) gdext.classes.Camera3D.mb_project_local_ray_normal = MethodBind.get("Camera3D", "project_local_ray_normal", 1718073306L)
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector3](gdext.classes.Camera3D.mb_project_local_ray_normal, livePtr, screen_point)
  }

  /** Camera3D.project_ray_origin */
  final def projectRayOrigin(screen_point: gdext.builtin.Vector2): gdext.builtin.Vector3 = {
    if (gdext.classes.Camera3D.mb_project_ray_origin == null) gdext.classes.Camera3D.mb_project_ray_origin = MethodBind.get("Camera3D", "project_ray_origin", 1718073306L)
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector3](gdext.classes.Camera3D.mb_project_ray_origin, livePtr, screen_point)
  }

  /** Camera3D.unproject_position */
  final def unprojectPosition(world_point: gdext.builtin.Vector3): gdext.builtin.Vector2 = {
    if (gdext.classes.Camera3D.mb_unproject_position == null) gdext.classes.Camera3D.mb_unproject_position = MethodBind.get("Camera3D", "unproject_position", 3758901831L)
    Ptrcall.call1[gdext.builtin.Vector3, gdext.builtin.Vector2](gdext.classes.Camera3D.mb_unproject_position, livePtr, world_point)
  }

  /** Camera3D.is_position_behind */
  final def isPositionBehind(world_point: gdext.builtin.Vector3): Boolean = {
    if (gdext.classes.Camera3D.mb_is_position_behind == null) gdext.classes.Camera3D.mb_is_position_behind = MethodBind.get("Camera3D", "is_position_behind", 3108956480L)
    Ptrcall.call1[gdext.builtin.Vector3, Boolean](gdext.classes.Camera3D.mb_is_position_behind, livePtr, world_point)
  }

  /** Camera3D.project_position */
  final def projectPosition(screen_point: gdext.builtin.Vector2, z_depth: Double): gdext.builtin.Vector3 = {
    if (gdext.classes.Camera3D.mb_project_position == null) gdext.classes.Camera3D.mb_project_position = MethodBind.get("Camera3D", "project_position", 2171975744L)
    Ptrcall.call2[gdext.builtin.Vector2, Double, gdext.builtin.Vector3](gdext.classes.Camera3D.mb_project_position, livePtr, screen_point, z_depth)
  }

  /** Camera3D.set_perspective */
  final def setPerspective(fov: Double, z_near: Double, z_far: Double): Unit = {
    if (gdext.classes.Camera3D.mb_set_perspective == null) gdext.classes.Camera3D.mb_set_perspective = MethodBind.get("Camera3D", "set_perspective", 2385087082L)
    Ptrcall.callVoid3(gdext.classes.Camera3D.mb_set_perspective, livePtr, fov, z_near, z_far)
  }

  /** Camera3D.set_orthogonal */
  final def setOrthogonal(size: Double, z_near: Double, z_far: Double): Unit = {
    if (gdext.classes.Camera3D.mb_set_orthogonal == null) gdext.classes.Camera3D.mb_set_orthogonal = MethodBind.get("Camera3D", "set_orthogonal", 2385087082L)
    Ptrcall.callVoid3(gdext.classes.Camera3D.mb_set_orthogonal, livePtr, size, z_near, z_far)
  }

  /** Camera3D.set_frustum */
  final def setFrustum(size: Double, offset: gdext.builtin.Vector2, z_near: Double, z_far: Double): Unit = {
    if (gdext.classes.Camera3D.mb_set_frustum == null) gdext.classes.Camera3D.mb_set_frustum = MethodBind.get("Camera3D", "set_frustum", 354890663L)
    Ptrcall.callVoid4(gdext.classes.Camera3D.mb_set_frustum, livePtr, size, offset, z_near, z_far)
  }

  /** Camera3D.make_current */
  final def makeCurrent(): Unit = {
    if (gdext.classes.Camera3D.mb_make_current == null) gdext.classes.Camera3D.mb_make_current = MethodBind.get("Camera3D", "make_current", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Camera3D.mb_make_current, livePtr)
  }

  /** Camera3D.clear_current */
  final def clearCurrent(enable_next: Boolean): Unit = {
    if (gdext.classes.Camera3D.mb_clear_current == null) gdext.classes.Camera3D.mb_clear_current = MethodBind.get("Camera3D", "clear_current", 3216645846L)
    Ptrcall.callVoid1(gdext.classes.Camera3D.mb_clear_current, livePtr, enable_next)
  }

  /** Camera3D.set_current */
  final def setCurrent(enabled: Boolean): Unit = {
    if (gdext.classes.Camera3D.mb_set_current == null) gdext.classes.Camera3D.mb_set_current = MethodBind.get("Camera3D", "set_current", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Camera3D.mb_set_current, livePtr, enabled)
  }

  /** Camera3D.is_current */
  final def isCurrent(): Boolean = {
    if (gdext.classes.Camera3D.mb_is_current == null) gdext.classes.Camera3D.mb_is_current = MethodBind.get("Camera3D", "is_current", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Camera3D.mb_is_current, livePtr)
  }

  /** Camera3D.get_camera_transform */
  final def getCameraTransform(): gdext.builtin.Transform3D = {
    if (gdext.classes.Camera3D.mb_get_camera_transform == null) gdext.classes.Camera3D.mb_get_camera_transform = MethodBind.get("Camera3D", "get_camera_transform", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.Camera3D.mb_get_camera_transform, livePtr)
  }

  /** Camera3D.get_camera_projection */
  final def getCameraProjection(): gdext.builtin.Projection = {
    if (gdext.classes.Camera3D.mb_get_camera_projection == null) gdext.classes.Camera3D.mb_get_camera_projection = MethodBind.get("Camera3D", "get_camera_projection", 2910717950L)
    Ptrcall.call0[gdext.builtin.Projection](gdext.classes.Camera3D.mb_get_camera_projection, livePtr)
  }

  /** Camera3D.get_fov */
  final def getFov(): Double = {
    if (gdext.classes.Camera3D.mb_get_fov == null) gdext.classes.Camera3D.mb_get_fov = MethodBind.get("Camera3D", "get_fov", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Camera3D.mb_get_fov, livePtr)
  }

  /** Camera3D.get_frustum_offset */
  final def getFrustumOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.Camera3D.mb_get_frustum_offset == null) gdext.classes.Camera3D.mb_get_frustum_offset = MethodBind.get("Camera3D", "get_frustum_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Camera3D.mb_get_frustum_offset, livePtr)
  }

  /** Camera3D.get_size */
  final def getSize(): Double = {
    if (gdext.classes.Camera3D.mb_get_size == null) gdext.classes.Camera3D.mb_get_size = MethodBind.get("Camera3D", "get_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Camera3D.mb_get_size, livePtr)
  }

  /** Camera3D.get_far */
  final def getFar(): Double = {
    if (gdext.classes.Camera3D.mb_get_far == null) gdext.classes.Camera3D.mb_get_far = MethodBind.get("Camera3D", "get_far", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Camera3D.mb_get_far, livePtr)
  }

  /** Camera3D.get_near */
  final def getNear(): Double = {
    if (gdext.classes.Camera3D.mb_get_near == null) gdext.classes.Camera3D.mb_get_near = MethodBind.get("Camera3D", "get_near", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Camera3D.mb_get_near, livePtr)
  }

  /** Camera3D.set_fov */
  final def setFov(fov: Double): Unit = {
    if (gdext.classes.Camera3D.mb_set_fov == null) gdext.classes.Camera3D.mb_set_fov = MethodBind.get("Camera3D", "set_fov", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Camera3D.mb_set_fov, livePtr, fov)
  }

  /** Camera3D.set_frustum_offset */
  final def setFrustumOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Camera3D.mb_set_frustum_offset == null) gdext.classes.Camera3D.mb_set_frustum_offset = MethodBind.get("Camera3D", "set_frustum_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Camera3D.mb_set_frustum_offset, livePtr, offset)
  }

  /** Camera3D.set_size */
  final def setSize(size: Double): Unit = {
    if (gdext.classes.Camera3D.mb_set_size == null) gdext.classes.Camera3D.mb_set_size = MethodBind.get("Camera3D", "set_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Camera3D.mb_set_size, livePtr, size)
  }

  /** Camera3D.set_far */
  final def setFar(far: Double): Unit = {
    if (gdext.classes.Camera3D.mb_set_far == null) gdext.classes.Camera3D.mb_set_far = MethodBind.get("Camera3D", "set_far", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Camera3D.mb_set_far, livePtr, far)
  }

  /** Camera3D.set_near */
  final def setNear(near: Double): Unit = {
    if (gdext.classes.Camera3D.mb_set_near == null) gdext.classes.Camera3D.mb_set_near = MethodBind.get("Camera3D", "set_near", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Camera3D.mb_set_near, livePtr, near)
  }

  /** Camera3D.get_projection */
  final def getProjection(): Long = {
    if (gdext.classes.Camera3D.mb_get_projection == null) gdext.classes.Camera3D.mb_get_projection = MethodBind.get("Camera3D", "get_projection", 2624185235L)
    Ptrcall.call0[Long](gdext.classes.Camera3D.mb_get_projection, livePtr)
  }

  /** Camera3D.set_projection */
  final def setProjection(mode: Long): Unit = {
    if (gdext.classes.Camera3D.mb_set_projection == null) gdext.classes.Camera3D.mb_set_projection = MethodBind.get("Camera3D", "set_projection", 4218540108L)
    Ptrcall.callVoid1(gdext.classes.Camera3D.mb_set_projection, livePtr, mode)
  }

  /** Camera3D.set_h_offset */
  final def setHOffset(offset: Double): Unit = {
    if (gdext.classes.Camera3D.mb_set_h_offset == null) gdext.classes.Camera3D.mb_set_h_offset = MethodBind.get("Camera3D", "set_h_offset", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Camera3D.mb_set_h_offset, livePtr, offset)
  }

  /** Camera3D.get_h_offset */
  final def getHOffset(): Double = {
    if (gdext.classes.Camera3D.mb_get_h_offset == null) gdext.classes.Camera3D.mb_get_h_offset = MethodBind.get("Camera3D", "get_h_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Camera3D.mb_get_h_offset, livePtr)
  }

  /** Camera3D.set_v_offset */
  final def setVOffset(offset: Double): Unit = {
    if (gdext.classes.Camera3D.mb_set_v_offset == null) gdext.classes.Camera3D.mb_set_v_offset = MethodBind.get("Camera3D", "set_v_offset", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Camera3D.mb_set_v_offset, livePtr, offset)
  }

  /** Camera3D.get_v_offset */
  final def getVOffset(): Double = {
    if (gdext.classes.Camera3D.mb_get_v_offset == null) gdext.classes.Camera3D.mb_get_v_offset = MethodBind.get("Camera3D", "get_v_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Camera3D.mb_get_v_offset, livePtr)
  }

  /** Camera3D.set_cull_mask */
  final def setCullMask(mask: Long): Unit = {
    if (gdext.classes.Camera3D.mb_set_cull_mask == null) gdext.classes.Camera3D.mb_set_cull_mask = MethodBind.get("Camera3D", "set_cull_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Camera3D.mb_set_cull_mask, livePtr, mask)
  }

  /** Camera3D.get_cull_mask */
  final def getCullMask(): Long = {
    if (gdext.classes.Camera3D.mb_get_cull_mask == null) gdext.classes.Camera3D.mb_get_cull_mask = MethodBind.get("Camera3D", "get_cull_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Camera3D.mb_get_cull_mask, livePtr)
  }

  /** Camera3D.set_environment */
  final def setEnvironment(env: Environment): Unit = {
    if (gdext.classes.Camera3D.mb_set_environment == null) gdext.classes.Camera3D.mb_set_environment = MethodBind.get("Camera3D", "set_environment", 4143518816L)
    Ptrcall.callVoid1(gdext.classes.Camera3D.mb_set_environment, livePtr, Wrappers.handle(env))
  }

  /** Camera3D.get_environment. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getEnvironment(): Environment = {
    if (gdext.classes.Camera3D.mb_get_environment == null) gdext.classes.Camera3D.mb_get_environment = MethodBind.get("Camera3D", "get_environment", 3082064660L)
    Wrappers.owned[Environment](Ptrcall.call0[Long](gdext.classes.Camera3D.mb_get_environment, livePtr))
  }

  /** Camera3D.set_attributes */
  final def setAttributes(env: CameraAttributes): Unit = {
    if (gdext.classes.Camera3D.mb_set_attributes == null) gdext.classes.Camera3D.mb_set_attributes = MethodBind.get("Camera3D", "set_attributes", 2817810567L)
    Ptrcall.callVoid1(gdext.classes.Camera3D.mb_set_attributes, livePtr, Wrappers.handle(env))
  }

  /** Camera3D.get_attributes. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getAttributes(): CameraAttributes = {
    if (gdext.classes.Camera3D.mb_get_attributes == null) gdext.classes.Camera3D.mb_get_attributes = MethodBind.get("Camera3D", "get_attributes", 3921283215L)
    Wrappers.owned[CameraAttributes](Ptrcall.call0[Long](gdext.classes.Camera3D.mb_get_attributes, livePtr))
  }

  /** Camera3D.set_compositor */
  final def setCompositor(compositor: Compositor): Unit = {
    if (gdext.classes.Camera3D.mb_set_compositor == null) gdext.classes.Camera3D.mb_set_compositor = MethodBind.get("Camera3D", "set_compositor", 1586754307L)
    Ptrcall.callVoid1(gdext.classes.Camera3D.mb_set_compositor, livePtr, Wrappers.handle(compositor))
  }

  /** Camera3D.get_compositor. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCompositor(): Compositor = {
    if (gdext.classes.Camera3D.mb_get_compositor == null) gdext.classes.Camera3D.mb_get_compositor = MethodBind.get("Camera3D", "get_compositor", 3647707413L)
    Wrappers.owned[Compositor](Ptrcall.call0[Long](gdext.classes.Camera3D.mb_get_compositor, livePtr))
  }

  /** Camera3D.set_keep_aspect_mode */
  final def setKeepAspectMode(mode: Long): Unit = {
    if (gdext.classes.Camera3D.mb_set_keep_aspect_mode == null) gdext.classes.Camera3D.mb_set_keep_aspect_mode = MethodBind.get("Camera3D", "set_keep_aspect_mode", 1740651252L)
    Ptrcall.callVoid1(gdext.classes.Camera3D.mb_set_keep_aspect_mode, livePtr, mode)
  }

  /** Camera3D.get_keep_aspect_mode */
  final def getKeepAspectMode(): Long = {
    if (gdext.classes.Camera3D.mb_get_keep_aspect_mode == null) gdext.classes.Camera3D.mb_get_keep_aspect_mode = MethodBind.get("Camera3D", "get_keep_aspect_mode", 2790278316L)
    Ptrcall.call0[Long](gdext.classes.Camera3D.mb_get_keep_aspect_mode, livePtr)
  }

  /** Camera3D.set_doppler_tracking */
  final def setDopplerTracking(mode: Long): Unit = {
    if (gdext.classes.Camera3D.mb_set_doppler_tracking == null) gdext.classes.Camera3D.mb_set_doppler_tracking = MethodBind.get("Camera3D", "set_doppler_tracking", 3109431270L)
    Ptrcall.callVoid1(gdext.classes.Camera3D.mb_set_doppler_tracking, livePtr, mode)
  }

  /** Camera3D.get_doppler_tracking */
  final def getDopplerTracking(): Long = {
    if (gdext.classes.Camera3D.mb_get_doppler_tracking == null) gdext.classes.Camera3D.mb_get_doppler_tracking = MethodBind.get("Camera3D", "get_doppler_tracking", 1584483649L)
    Ptrcall.call0[Long](gdext.classes.Camera3D.mb_get_doppler_tracking, livePtr)
  }

  /** Camera3D.is_position_in_frustum */
  final def isPositionInFrustum(world_point: gdext.builtin.Vector3): Boolean = {
    if (gdext.classes.Camera3D.mb_is_position_in_frustum == null) gdext.classes.Camera3D.mb_is_position_in_frustum = MethodBind.get("Camera3D", "is_position_in_frustum", 3108956480L)
    Ptrcall.call1[gdext.builtin.Vector3, Boolean](gdext.classes.Camera3D.mb_is_position_in_frustum, livePtr, world_point)
  }

  /** Camera3D.set_cull_mask_value */
  final def setCullMaskValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.Camera3D.mb_set_cull_mask_value == null) gdext.classes.Camera3D.mb_set_cull_mask_value = MethodBind.get("Camera3D", "set_cull_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.Camera3D.mb_set_cull_mask_value, livePtr, layer_number, value)
  }

  /** Camera3D.get_cull_mask_value */
  final def getCullMaskValue(layer_number: Long): Boolean = {
    if (gdext.classes.Camera3D.mb_get_cull_mask_value == null) gdext.classes.Camera3D.mb_get_cull_mask_value = MethodBind.get("Camera3D", "get_cull_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Camera3D.mb_get_cull_mask_value, livePtr, layer_number)
  }

}

object Camera3D {
  private[classes] var mb_project_ray_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_project_local_ray_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_project_ray_origin: GDExtensionMethodBindPtr = null
  private[classes] var mb_unproject_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_position_behind: GDExtensionMethodBindPtr = null
  private[classes] var mb_project_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_perspective: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_orthogonal: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frustum: GDExtensionMethodBindPtr = null
  private[classes] var mb_make_current: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_current: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_current: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_current: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_camera_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_camera_projection: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fov: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frustum_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_far: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_near: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fov: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frustum_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_far: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_near: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_projection: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_projection: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_h_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_h_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_v_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_v_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cull_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cull_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_environment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_environment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_attributes: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_attributes: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_compositor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_compositor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_keep_aspect_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_keep_aspect_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_doppler_tracking: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_doppler_tracking: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_position_in_frustum: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cull_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cull_mask_value: GDExtensionMethodBindPtr = null
}
