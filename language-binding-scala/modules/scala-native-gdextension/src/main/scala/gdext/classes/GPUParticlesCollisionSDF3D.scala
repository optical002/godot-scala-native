package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GPUParticlesCollisionSDF3D`, extends `GPUParticlesCollision3D`. */
abstract class GPUParticlesCollisionSDF3D extends GPUParticlesCollision3D {
  override def godotClassName: String = "GPUParticlesCollisionSDF3D"

  /** GPUParticlesCollisionSDF3D.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.GPUParticlesCollisionSDF3D.mb_set_size == null) gdext.classes.GPUParticlesCollisionSDF3D.mb_set_size = MethodBind.get("GPUParticlesCollisionSDF3D", "set_size", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesCollisionSDF3D.mb_set_size, livePtr, size)
  }

  /** GPUParticlesCollisionSDF3D.get_size */
  final def getSize(): gdext.builtin.Vector3 = {
    if (gdext.classes.GPUParticlesCollisionSDF3D.mb_get_size == null) gdext.classes.GPUParticlesCollisionSDF3D.mb_get_size = MethodBind.get("GPUParticlesCollisionSDF3D", "get_size", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.GPUParticlesCollisionSDF3D.mb_get_size, livePtr)
  }

  /** GPUParticlesCollisionSDF3D.set_resolution */
  final def setResolution(resolution: gdext.classes.GPUParticlesCollisionSDF3D.Resolution): Unit = {
    if (gdext.classes.GPUParticlesCollisionSDF3D.mb_set_resolution == null) gdext.classes.GPUParticlesCollisionSDF3D.mb_set_resolution = MethodBind.get("GPUParticlesCollisionSDF3D", "set_resolution", 1155629297L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesCollisionSDF3D.mb_set_resolution, livePtr, resolution)
  }

  /** GPUParticlesCollisionSDF3D.get_resolution */
  final def getResolution(): gdext.classes.GPUParticlesCollisionSDF3D.Resolution = {
    if (gdext.classes.GPUParticlesCollisionSDF3D.mb_get_resolution == null) gdext.classes.GPUParticlesCollisionSDF3D.mb_get_resolution = MethodBind.get("GPUParticlesCollisionSDF3D", "get_resolution", 2919555867L)
    gdext.classes.GPUParticlesCollisionSDF3D.Resolution(Ptrcall.call0[Long](gdext.classes.GPUParticlesCollisionSDF3D.mb_get_resolution, livePtr))
  }

  /** GPUParticlesCollisionSDF3D.set_texture */
  final def setTexture(texture: Texture3D): Unit = {
    if (gdext.classes.GPUParticlesCollisionSDF3D.mb_set_texture == null) gdext.classes.GPUParticlesCollisionSDF3D.mb_set_texture = MethodBind.get("GPUParticlesCollisionSDF3D", "set_texture", 1188404210L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesCollisionSDF3D.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** GPUParticlesCollisionSDF3D.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture3D = {
    if (gdext.classes.GPUParticlesCollisionSDF3D.mb_get_texture == null) gdext.classes.GPUParticlesCollisionSDF3D.mb_get_texture = MethodBind.get("GPUParticlesCollisionSDF3D", "get_texture", 373985333L)
    Wrappers.owned[Texture3D](Ptrcall.call0[Long](gdext.classes.GPUParticlesCollisionSDF3D.mb_get_texture, livePtr))
  }

  /** GPUParticlesCollisionSDF3D.set_thickness */
  final def setThickness(thickness: Double): Unit = {
    if (gdext.classes.GPUParticlesCollisionSDF3D.mb_set_thickness == null) gdext.classes.GPUParticlesCollisionSDF3D.mb_set_thickness = MethodBind.get("GPUParticlesCollisionSDF3D", "set_thickness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesCollisionSDF3D.mb_set_thickness, livePtr, thickness)
  }

  /** GPUParticlesCollisionSDF3D.get_thickness */
  final def getThickness(): Double = {
    if (gdext.classes.GPUParticlesCollisionSDF3D.mb_get_thickness == null) gdext.classes.GPUParticlesCollisionSDF3D.mb_get_thickness = MethodBind.get("GPUParticlesCollisionSDF3D", "get_thickness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticlesCollisionSDF3D.mb_get_thickness, livePtr)
  }

  /** GPUParticlesCollisionSDF3D.set_bake_mask */
  final def setBakeMask(mask: Long): Unit = {
    if (gdext.classes.GPUParticlesCollisionSDF3D.mb_set_bake_mask == null) gdext.classes.GPUParticlesCollisionSDF3D.mb_set_bake_mask = MethodBind.get("GPUParticlesCollisionSDF3D", "set_bake_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesCollisionSDF3D.mb_set_bake_mask, livePtr, mask)
  }

  /** GPUParticlesCollisionSDF3D.get_bake_mask */
  final def getBakeMask(): Long = {
    if (gdext.classes.GPUParticlesCollisionSDF3D.mb_get_bake_mask == null) gdext.classes.GPUParticlesCollisionSDF3D.mb_get_bake_mask = MethodBind.get("GPUParticlesCollisionSDF3D", "get_bake_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GPUParticlesCollisionSDF3D.mb_get_bake_mask, livePtr)
  }

  /** GPUParticlesCollisionSDF3D.set_bake_mask_value */
  final def setBakeMaskValue(layerNumber: Long, value: Boolean): Unit = {
    if (gdext.classes.GPUParticlesCollisionSDF3D.mb_set_bake_mask_value == null) gdext.classes.GPUParticlesCollisionSDF3D.mb_set_bake_mask_value = MethodBind.get("GPUParticlesCollisionSDF3D", "set_bake_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.GPUParticlesCollisionSDF3D.mb_set_bake_mask_value, livePtr, layerNumber, value)
  }

  /** GPUParticlesCollisionSDF3D.get_bake_mask_value */
  final def getBakeMaskValue(layerNumber: Long): Boolean = {
    if (gdext.classes.GPUParticlesCollisionSDF3D.mb_get_bake_mask_value == null) gdext.classes.GPUParticlesCollisionSDF3D.mb_get_bake_mask_value = MethodBind.get("GPUParticlesCollisionSDF3D", "get_bake_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.GPUParticlesCollisionSDF3D.mb_get_bake_mask_value, livePtr, layerNumber)
  }

}

object GPUParticlesCollisionSDF3D {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_resolution: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_resolution: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_thickness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_thickness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bake_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bake_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bake_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bake_mask_value: GDExtensionMethodBindPtr = null

  /** Godot enum `GPUParticlesCollisionSDF3D.Resolution`. */
  opaque type Resolution <: Long = Long

  object Resolution {
    final val Resolution16: Resolution = 0L.asInstanceOf[Resolution]
    final val Resolution32: Resolution = 1L.asInstanceOf[Resolution]
    final val Resolution64: Resolution = 2L.asInstanceOf[Resolution]
    final val Resolution128: Resolution = 3L.asInstanceOf[Resolution]
    final val Resolution256: Resolution = 4L.asInstanceOf[Resolution]
    final val Resolution512: Resolution = 5L.asInstanceOf[Resolution]
    final val Max: Resolution = 6L.asInstanceOf[Resolution]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Resolution = value.asInstanceOf[Resolution]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Resolution] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[Resolution]]

    extension (self: Resolution)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Resolution16"
        case 1L => "Resolution32"
        case 2L => "Resolution64"
        case 3L => "Resolution128"
        case 4L => "Resolution256"
        case 5L => "Resolution512"
        case 6L => "Max"
        case other => other.toString
      }
  }
}
