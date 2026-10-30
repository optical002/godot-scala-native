package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `FogVolume`, extends `VisualInstance3D`. */
abstract class FogVolume extends VisualInstance3D {
  override def godotClassName: String = "FogVolume"

  /** FogVolume.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.FogVolume.mb_set_size == null) gdext.classes.FogVolume.mb_set_size = MethodBind.get("FogVolume", "set_size", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.FogVolume.mb_set_size, livePtr, size)
  }

  /** FogVolume.get_size */
  final def getSize(): gdext.builtin.Vector3 = {
    if (gdext.classes.FogVolume.mb_get_size == null) gdext.classes.FogVolume.mb_get_size = MethodBind.get("FogVolume", "get_size", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.FogVolume.mb_get_size, livePtr)
  }

  /** FogVolume.set_shape */
  final def setShape(shape: gdext.classes.RenderingServer.FogVolumeShape): Unit = {
    if (gdext.classes.FogVolume.mb_set_shape == null) gdext.classes.FogVolume.mb_set_shape = MethodBind.get("FogVolume", "set_shape", 1416323362L)
    Ptrcall.callVoid1(gdext.classes.FogVolume.mb_set_shape, livePtr, shape)
  }

  /** FogVolume.get_shape */
  final def getShape(): gdext.classes.RenderingServer.FogVolumeShape = {
    if (gdext.classes.FogVolume.mb_get_shape == null) gdext.classes.FogVolume.mb_get_shape = MethodBind.get("FogVolume", "get_shape", 3920334604L)
    gdext.classes.RenderingServer.FogVolumeShape(Ptrcall.call0[Long](gdext.classes.FogVolume.mb_get_shape, livePtr))
  }

  /** FogVolume.set_material */
  final def setMaterial(material: Material): Unit = {
    if (gdext.classes.FogVolume.mb_set_material == null) gdext.classes.FogVolume.mb_set_material = MethodBind.get("FogVolume", "set_material", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.FogVolume.mb_set_material, livePtr, Wrappers.handle(material))
  }

  /** FogVolume.get_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMaterial(): Material = {
    if (gdext.classes.FogVolume.mb_get_material == null) gdext.classes.FogVolume.mb_get_material = MethodBind.get("FogVolume", "get_material", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.FogVolume.mb_get_material, livePtr))
  }

}

object FogVolume {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_material: GDExtensionMethodBindPtr = null
}
