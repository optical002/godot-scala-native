package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Camera3D`, extends `Node3D`. */
abstract class Camera3D extends Node3D {

  /** Camera3D.project_ray_normal */
  final def projectRayNormal(screen_point: io.github.optical002.godot.builtin.Vector2): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[io.github.optical002.godot.builtin.Vector2, io.github.optical002.godot.builtin.Vector3](MethodBind.get("Camera3D", "project_ray_normal", 1718073306L), hostObject.objectPtr, screen_point)

  /** Camera3D.project_local_ray_normal */
  final def projectLocalRayNormal(screen_point: io.github.optical002.godot.builtin.Vector2): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[io.github.optical002.godot.builtin.Vector2, io.github.optical002.godot.builtin.Vector3](MethodBind.get("Camera3D", "project_local_ray_normal", 1718073306L), hostObject.objectPtr, screen_point)

  /** Camera3D.project_ray_origin */
  final def projectRayOrigin(screen_point: io.github.optical002.godot.builtin.Vector2): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[io.github.optical002.godot.builtin.Vector2, io.github.optical002.godot.builtin.Vector3](MethodBind.get("Camera3D", "project_ray_origin", 1718073306L), hostObject.objectPtr, screen_point)

  /** Camera3D.unproject_position */
  final def unprojectPosition(world_point: io.github.optical002.godot.builtin.Vector3): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call1[io.github.optical002.godot.builtin.Vector3, io.github.optical002.godot.builtin.Vector2](MethodBind.get("Camera3D", "unproject_position", 3758901831L), hostObject.objectPtr, world_point)

  /** Camera3D.is_position_behind */
  final def isPositionBehind(world_point: io.github.optical002.godot.builtin.Vector3): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.Vector3, Boolean](MethodBind.get("Camera3D", "is_position_behind", 3108956480L), hostObject.objectPtr, world_point)

  /** Camera3D.project_position */
  final def projectPosition(screen_point: io.github.optical002.godot.builtin.Vector2, z_depth: Double): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call2[io.github.optical002.godot.builtin.Vector2, Double, io.github.optical002.godot.builtin.Vector3](MethodBind.get("Camera3D", "project_position", 2171975744L), hostObject.objectPtr, screen_point, z_depth)

  /** Camera3D.set_perspective */
  final def setPerspective(fov: Double, z_near: Double, z_far: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("Camera3D", "set_perspective", 2385087082L), hostObject.objectPtr, fov, z_near, z_far)

  /** Camera3D.set_orthogonal */
  final def setOrthogonal(size: Double, z_near: Double, z_far: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("Camera3D", "set_orthogonal", 2385087082L), hostObject.objectPtr, size, z_near, z_far)

  /** Camera3D.set_frustum */
  final def setFrustum(size: Double, offset: io.github.optical002.godot.builtin.Vector2, z_near: Double, z_far: Double): Unit =
    Ptrcall.callVoid4(MethodBind.get("Camera3D", "set_frustum", 354890663L), hostObject.objectPtr, size, offset, z_near, z_far)

  /** Camera3D.make_current */
  final def makeCurrent(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Camera3D", "make_current", 3218959716L), hostObject.objectPtr)

  /** Camera3D.clear_current */
  final def clearCurrent(enable_next: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera3D", "clear_current", 3216645846L), hostObject.objectPtr, enable_next)

  /** Camera3D.set_current */
  final def setCurrent(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera3D", "set_current", 2586408642L), hostObject.objectPtr, enabled)

  /** Camera3D.is_current */
  final def isCurrent(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Camera3D", "is_current", 36873697L), hostObject.objectPtr)

  /** Camera3D.get_camera_transform */
  final def getCameraTransform(): io.github.optical002.godot.builtin.Transform3D =
    Ptrcall.call0[io.github.optical002.godot.builtin.Transform3D](MethodBind.get("Camera3D", "get_camera_transform", 3229777777L), hostObject.objectPtr)

  /** Camera3D.get_camera_projection */
  final def getCameraProjection(): io.github.optical002.godot.builtin.Projection =
    Ptrcall.call0[io.github.optical002.godot.builtin.Projection](MethodBind.get("Camera3D", "get_camera_projection", 2910717950L), hostObject.objectPtr)

  /** Camera3D.get_fov */
  final def getFov(): Double =
    Ptrcall.call0[Double](MethodBind.get("Camera3D", "get_fov", 1740695150L), hostObject.objectPtr)

  /** Camera3D.get_frustum_offset */
  final def getFrustumOffset(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Camera3D", "get_frustum_offset", 3341600327L), hostObject.objectPtr)

  /** Camera3D.get_size */
  final def getSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("Camera3D", "get_size", 1740695150L), hostObject.objectPtr)

  /** Camera3D.get_far */
  final def getFar(): Double =
    Ptrcall.call0[Double](MethodBind.get("Camera3D", "get_far", 1740695150L), hostObject.objectPtr)

  /** Camera3D.get_near */
  final def getNear(): Double =
    Ptrcall.call0[Double](MethodBind.get("Camera3D", "get_near", 1740695150L), hostObject.objectPtr)

  /** Camera3D.set_fov */
  final def setFov(fov: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera3D", "set_fov", 373806689L), hostObject.objectPtr, fov)

  /** Camera3D.set_frustum_offset */
  final def setFrustumOffset(offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera3D", "set_frustum_offset", 743155724L), hostObject.objectPtr, offset)

  /** Camera3D.set_size */
  final def setSize(size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera3D", "set_size", 373806689L), hostObject.objectPtr, size)

  /** Camera3D.set_far */
  final def setFar(far: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera3D", "set_far", 373806689L), hostObject.objectPtr, far)

  /** Camera3D.set_near */
  final def setNear(near: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera3D", "set_near", 373806689L), hostObject.objectPtr, near)

  /** Camera3D.get_projection */
  final def getProjection(): Long =
    Ptrcall.call0[Long](MethodBind.get("Camera3D", "get_projection", 2624185235L), hostObject.objectPtr)

  /** Camera3D.set_projection */
  final def setProjection(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera3D", "set_projection", 4218540108L), hostObject.objectPtr, mode)

  /** Camera3D.set_h_offset */
  final def setHOffset(offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera3D", "set_h_offset", 373806689L), hostObject.objectPtr, offset)

  /** Camera3D.get_h_offset */
  final def getHOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("Camera3D", "get_h_offset", 1740695150L), hostObject.objectPtr)

  /** Camera3D.set_v_offset */
  final def setVOffset(offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera3D", "set_v_offset", 373806689L), hostObject.objectPtr, offset)

  /** Camera3D.get_v_offset */
  final def getVOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("Camera3D", "get_v_offset", 1740695150L), hostObject.objectPtr)

  /** Camera3D.set_cull_mask */
  final def setCullMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera3D", "set_cull_mask", 1286410249L), hostObject.objectPtr, mask)

  /** Camera3D.get_cull_mask */
  final def getCullMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("Camera3D", "get_cull_mask", 3905245786L), hostObject.objectPtr)

  /** Camera3D.set_environment */
  final def setEnvironment(env: Environment): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera3D", "set_environment", 4143518816L), hostObject.objectPtr, env.hostObject)

  /** Camera3D.get_environment */
  final def getEnvironment(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Camera3D", "get_environment", 3082064660L), hostObject.objectPtr)

  /** Camera3D.set_attributes */
  final def setAttributes(env: CameraAttributes): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera3D", "set_attributes", 2817810567L), hostObject.objectPtr, env.hostObject)

  /** Camera3D.get_attributes */
  final def getAttributes(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Camera3D", "get_attributes", 3921283215L), hostObject.objectPtr)

  /** Camera3D.set_compositor */
  final def setCompositor(compositor: Compositor): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera3D", "set_compositor", 1586754307L), hostObject.objectPtr, compositor.hostObject)

  /** Camera3D.get_compositor */
  final def getCompositor(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Camera3D", "get_compositor", 3647707413L), hostObject.objectPtr)

  /** Camera3D.set_keep_aspect_mode */
  final def setKeepAspectMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera3D", "set_keep_aspect_mode", 1740651252L), hostObject.objectPtr, mode)

  /** Camera3D.get_keep_aspect_mode */
  final def getKeepAspectMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Camera3D", "get_keep_aspect_mode", 2790278316L), hostObject.objectPtr)

  /** Camera3D.set_doppler_tracking */
  final def setDopplerTracking(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera3D", "set_doppler_tracking", 3109431270L), hostObject.objectPtr, mode)

  /** Camera3D.get_doppler_tracking */
  final def getDopplerTracking(): Long =
    Ptrcall.call0[Long](MethodBind.get("Camera3D", "get_doppler_tracking", 1584483649L), hostObject.objectPtr)

  /** Camera3D.is_position_in_frustum */
  final def isPositionInFrustum(world_point: io.github.optical002.godot.builtin.Vector3): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.Vector3, Boolean](MethodBind.get("Camera3D", "is_position_in_frustum", 3108956480L), hostObject.objectPtr, world_point)

  /** Camera3D.set_cull_mask_value */
  final def setCullMaskValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Camera3D", "set_cull_mask_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** Camera3D.get_cull_mask_value */
  final def getCullMaskValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Camera3D", "get_cull_mask_value", 1116898809L), hostObject.objectPtr, layer_number)

}

object Camera3D {
  /** Class metadata for Gd[Camera3D] lifetime management and casting. */
  given GodotClass[Camera3D] with {
    def className = "Camera3D"
    def isRefCounted = false
    def wrap(o: GodotObject): Camera3D = new Camera3D {}.withHost(o.objectPtr)
    def unwrap(t: Camera3D): GodotObject = t.hostObject
  }
}
