package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Sky`, extends `Resource`. */
abstract class Sky extends Resource {
  override def godotClassName: String = "Sky"

  /** Sky.set_radiance_size */
  final def setRadianceSize(size: Long): Unit = {
    if (gdext.classes.Sky.mb_set_radiance_size == null) gdext.classes.Sky.mb_set_radiance_size = MethodBind.get("Sky", "set_radiance_size", 1512957179L)
    Ptrcall.callVoid1(gdext.classes.Sky.mb_set_radiance_size, livePtr, size)
  }

  /** Sky.get_radiance_size */
  final def getRadianceSize(): Long = {
    if (gdext.classes.Sky.mb_get_radiance_size == null) gdext.classes.Sky.mb_get_radiance_size = MethodBind.get("Sky", "get_radiance_size", 2708733976L)
    Ptrcall.call0[Long](gdext.classes.Sky.mb_get_radiance_size, livePtr)
  }

  /** Sky.set_process_mode */
  final def setProcessMode(mode: Long): Unit = {
    if (gdext.classes.Sky.mb_set_process_mode == null) gdext.classes.Sky.mb_set_process_mode = MethodBind.get("Sky", "set_process_mode", 875986769L)
    Ptrcall.callVoid1(gdext.classes.Sky.mb_set_process_mode, livePtr, mode)
  }

  /** Sky.get_process_mode */
  final def getProcessMode(): Long = {
    if (gdext.classes.Sky.mb_get_process_mode == null) gdext.classes.Sky.mb_get_process_mode = MethodBind.get("Sky", "get_process_mode", 731245043L)
    Ptrcall.call0[Long](gdext.classes.Sky.mb_get_process_mode, livePtr)
  }

  /** Sky.set_material */
  final def setMaterial(material: Material): Unit = {
    if (gdext.classes.Sky.mb_set_material == null) gdext.classes.Sky.mb_set_material = MethodBind.get("Sky", "set_material", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.Sky.mb_set_material, livePtr, Wrappers.handle(material))
  }

  /** Sky.get_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMaterial(): Material = {
    if (gdext.classes.Sky.mb_get_material == null) gdext.classes.Sky.mb_get_material = MethodBind.get("Sky", "get_material", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.Sky.mb_get_material, livePtr))
  }

}

object Sky {
  private[classes] var mb_set_radiance_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radiance_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_material: GDExtensionMethodBindPtr = null
}
