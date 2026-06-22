package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GPUParticlesCollisionHeightField3D`, extends `GPUParticlesCollision3D`. */
abstract class GPUParticlesCollisionHeightField3D extends GPUParticlesCollision3D {

  /** GPUParticlesCollisionHeightField3D.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesCollisionHeightField3D", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** GPUParticlesCollisionHeightField3D.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("GPUParticlesCollisionHeightField3D", "get_size", 3360562783L), hostObject.objectPtr)

  /** GPUParticlesCollisionHeightField3D.set_resolution */
  final def setResolution(resolution: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesCollisionHeightField3D", "set_resolution", 1009996517L), hostObject.objectPtr, resolution)

  /** GPUParticlesCollisionHeightField3D.get_resolution */
  final def getResolution(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticlesCollisionHeightField3D", "get_resolution", 1156065644L), hostObject.objectPtr)

  /** GPUParticlesCollisionHeightField3D.set_update_mode */
  final def setUpdateMode(update_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesCollisionHeightField3D", "set_update_mode", 673680859L), hostObject.objectPtr, update_mode)

  /** GPUParticlesCollisionHeightField3D.get_update_mode */
  final def getUpdateMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticlesCollisionHeightField3D", "get_update_mode", 1998141380L), hostObject.objectPtr)

  /** GPUParticlesCollisionHeightField3D.set_heightfield_mask */
  final def setHeightfieldMask(heightfield_mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesCollisionHeightField3D", "set_heightfield_mask", 1286410249L), hostObject.objectPtr, heightfield_mask)

  /** GPUParticlesCollisionHeightField3D.get_heightfield_mask */
  final def getHeightfieldMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticlesCollisionHeightField3D", "get_heightfield_mask", 3905245786L), hostObject.objectPtr)

  /** GPUParticlesCollisionHeightField3D.set_heightfield_mask_value */
  final def setHeightfieldMaskValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("GPUParticlesCollisionHeightField3D", "set_heightfield_mask_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** GPUParticlesCollisionHeightField3D.get_heightfield_mask_value */
  final def getHeightfieldMaskValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("GPUParticlesCollisionHeightField3D", "get_heightfield_mask_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** GPUParticlesCollisionHeightField3D.set_follow_camera_enabled */
  final def setFollowCameraEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesCollisionHeightField3D", "set_follow_camera_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** GPUParticlesCollisionHeightField3D.is_follow_camera_enabled */
  final def isFollowCameraEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GPUParticlesCollisionHeightField3D", "is_follow_camera_enabled", 36873697L), hostObject.objectPtr)

}

object GPUParticlesCollisionHeightField3D {
  /** Class metadata for Gd[GPUParticlesCollisionHeightField3D] lifetime management and casting. */
  given GodotClass[GPUParticlesCollisionHeightField3D] with {
    def className = "GPUParticlesCollisionHeightField3D"
    def isRefCounted = false
    def wrap(o: GodotObject): GPUParticlesCollisionHeightField3D = new GPUParticlesCollisionHeightField3D {}.withHost(o.objectPtr)
    def unwrap(t: GPUParticlesCollisionHeightField3D): GodotObject = t.hostObject
  }
}
