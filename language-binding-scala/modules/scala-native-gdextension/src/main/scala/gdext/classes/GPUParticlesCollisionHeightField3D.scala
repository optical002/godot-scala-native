package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GPUParticlesCollisionHeightField3D`, extends `GPUParticlesCollision3D`. */
abstract class GPUParticlesCollisionHeightField3D extends GPUParticlesCollision3D {
  override def godotClassName: String = "GPUParticlesCollisionHeightField3D"

  /** GPUParticlesCollisionHeightField3D.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_size == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_size = MethodBind.get("GPUParticlesCollisionHeightField3D", "set_size", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_size, livePtr, size)
  }

  /** GPUParticlesCollisionHeightField3D.get_size */
  final def getSize(): gdext.builtin.Vector3 = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_size == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_size = MethodBind.get("GPUParticlesCollisionHeightField3D", "get_size", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_size, livePtr)
  }

  /** GPUParticlesCollisionHeightField3D.set_resolution */
  final def setResolution(resolution: Long): Unit = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_resolution == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_resolution = MethodBind.get("GPUParticlesCollisionHeightField3D", "set_resolution", 1009996517L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_resolution, livePtr, resolution)
  }

  /** GPUParticlesCollisionHeightField3D.get_resolution */
  final def getResolution(): Long = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_resolution == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_resolution = MethodBind.get("GPUParticlesCollisionHeightField3D", "get_resolution", 1156065644L)
    Ptrcall.call0[Long](gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_resolution, livePtr)
  }

  /** GPUParticlesCollisionHeightField3D.set_update_mode */
  final def setUpdateMode(update_mode: Long): Unit = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_update_mode == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_update_mode = MethodBind.get("GPUParticlesCollisionHeightField3D", "set_update_mode", 673680859L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_update_mode, livePtr, update_mode)
  }

  /** GPUParticlesCollisionHeightField3D.get_update_mode */
  final def getUpdateMode(): Long = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_update_mode == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_update_mode = MethodBind.get("GPUParticlesCollisionHeightField3D", "get_update_mode", 1998141380L)
    Ptrcall.call0[Long](gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_update_mode, livePtr)
  }

  /** GPUParticlesCollisionHeightField3D.set_heightfield_mask */
  final def setHeightfieldMask(heightfield_mask: Long): Unit = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_heightfield_mask == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_heightfield_mask = MethodBind.get("GPUParticlesCollisionHeightField3D", "set_heightfield_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_heightfield_mask, livePtr, heightfield_mask)
  }

  /** GPUParticlesCollisionHeightField3D.get_heightfield_mask */
  final def getHeightfieldMask(): Long = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_heightfield_mask == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_heightfield_mask = MethodBind.get("GPUParticlesCollisionHeightField3D", "get_heightfield_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_heightfield_mask, livePtr)
  }

  /** GPUParticlesCollisionHeightField3D.set_heightfield_mask_value */
  final def setHeightfieldMaskValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_heightfield_mask_value == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_heightfield_mask_value = MethodBind.get("GPUParticlesCollisionHeightField3D", "set_heightfield_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_heightfield_mask_value, livePtr, layer_number, value)
  }

  /** GPUParticlesCollisionHeightField3D.get_heightfield_mask_value */
  final def getHeightfieldMaskValue(layer_number: Long): Boolean = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_heightfield_mask_value == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_heightfield_mask_value = MethodBind.get("GPUParticlesCollisionHeightField3D", "get_heightfield_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_heightfield_mask_value, livePtr, layer_number)
  }

  /** GPUParticlesCollisionHeightField3D.set_follow_camera_enabled */
  final def setFollowCameraEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_follow_camera_enabled == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_follow_camera_enabled = MethodBind.get("GPUParticlesCollisionHeightField3D", "set_follow_camera_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_follow_camera_enabled, livePtr, enabled)
  }

  /** GPUParticlesCollisionHeightField3D.is_follow_camera_enabled */
  final def isFollowCameraEnabled(): Boolean = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_is_follow_camera_enabled == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_is_follow_camera_enabled = MethodBind.get("GPUParticlesCollisionHeightField3D", "is_follow_camera_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GPUParticlesCollisionHeightField3D.mb_is_follow_camera_enabled, livePtr)
  }

}

object GPUParticlesCollisionHeightField3D {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_resolution: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_resolution: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_update_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_update_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_heightfield_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_heightfield_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_heightfield_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_heightfield_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_follow_camera_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_follow_camera_enabled: GDExtensionMethodBindPtr = null
}
