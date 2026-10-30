package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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
  final def setResolution(resolution: gdext.classes.GPUParticlesCollisionHeightField3D.Resolution): Unit = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_resolution == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_resolution = MethodBind.get("GPUParticlesCollisionHeightField3D", "set_resolution", 1009996517L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_resolution, livePtr, resolution)
  }

  /** GPUParticlesCollisionHeightField3D.get_resolution */
  final def getResolution(): gdext.classes.GPUParticlesCollisionHeightField3D.Resolution = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_resolution == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_resolution = MethodBind.get("GPUParticlesCollisionHeightField3D", "get_resolution", 1156065644L)
    gdext.classes.GPUParticlesCollisionHeightField3D.Resolution(Ptrcall.call0[Long](gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_resolution, livePtr))
  }

  /** GPUParticlesCollisionHeightField3D.set_update_mode */
  final def setUpdateMode(updateMode: gdext.classes.GPUParticlesCollisionHeightField3D.UpdateMode): Unit = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_update_mode == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_update_mode = MethodBind.get("GPUParticlesCollisionHeightField3D", "set_update_mode", 673680859L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_update_mode, livePtr, updateMode)
  }

  /** GPUParticlesCollisionHeightField3D.get_update_mode */
  final def getUpdateMode(): gdext.classes.GPUParticlesCollisionHeightField3D.UpdateMode = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_update_mode == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_update_mode = MethodBind.get("GPUParticlesCollisionHeightField3D", "get_update_mode", 1998141380L)
    gdext.classes.GPUParticlesCollisionHeightField3D.UpdateMode(Ptrcall.call0[Long](gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_update_mode, livePtr))
  }

  /** GPUParticlesCollisionHeightField3D.set_heightfield_mask */
  final def setHeightfieldMask(heightfieldMask: Long): Unit = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_heightfield_mask == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_heightfield_mask = MethodBind.get("GPUParticlesCollisionHeightField3D", "set_heightfield_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_heightfield_mask, livePtr, heightfieldMask)
  }

  /** GPUParticlesCollisionHeightField3D.get_heightfield_mask */
  final def getHeightfieldMask(): Long = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_heightfield_mask == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_heightfield_mask = MethodBind.get("GPUParticlesCollisionHeightField3D", "get_heightfield_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_heightfield_mask, livePtr)
  }

  /** GPUParticlesCollisionHeightField3D.set_heightfield_mask_value */
  final def setHeightfieldMaskValue(layerNumber: Long, value: Boolean): Unit = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_heightfield_mask_value == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_heightfield_mask_value = MethodBind.get("GPUParticlesCollisionHeightField3D", "set_heightfield_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.GPUParticlesCollisionHeightField3D.mb_set_heightfield_mask_value, livePtr, layerNumber, value)
  }

  /** GPUParticlesCollisionHeightField3D.get_heightfield_mask_value */
  final def getHeightfieldMaskValue(layerNumber: Long): Boolean = {
    if (gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_heightfield_mask_value == null) gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_heightfield_mask_value = MethodBind.get("GPUParticlesCollisionHeightField3D", "get_heightfield_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.GPUParticlesCollisionHeightField3D.mb_get_heightfield_mask_value, livePtr, layerNumber)
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

  /** Godot enum `GPUParticlesCollisionHeightField3D.Resolution`. */
  opaque type Resolution <: Long = Long

  object Resolution {
    final val Resolution256: Resolution = 0L.asInstanceOf[Resolution]
    final val Resolution512: Resolution = 1L.asInstanceOf[Resolution]
    final val Resolution1024: Resolution = 2L.asInstanceOf[Resolution]
    final val Resolution2048: Resolution = 3L.asInstanceOf[Resolution]
    final val Resolution4096: Resolution = 4L.asInstanceOf[Resolution]
    final val Resolution8192: Resolution = 5L.asInstanceOf[Resolution]
    final val Max: Resolution = 6L.asInstanceOf[Resolution]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Resolution = value.asInstanceOf[Resolution]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Resolution] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[Resolution]]

    extension (self: Resolution)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Resolution256"
        case 1L => "Resolution512"
        case 2L => "Resolution1024"
        case 3L => "Resolution2048"
        case 4L => "Resolution4096"
        case 5L => "Resolution8192"
        case 6L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `GPUParticlesCollisionHeightField3D.UpdateMode`. */
  opaque type UpdateMode <: Long = Long

  object UpdateMode {
    final val WhenMoved: UpdateMode = 0L.asInstanceOf[UpdateMode]
    final val Always: UpdateMode = 1L.asInstanceOf[UpdateMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): UpdateMode = value.asInstanceOf[UpdateMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[UpdateMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[UpdateMode]]

    extension (self: UpdateMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "WhenMoved"
        case 1L => "Always"
        case other => other.toString
      }
  }
}
