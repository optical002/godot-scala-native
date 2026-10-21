package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `DPITexture`, extends `Texture2D`. */
abstract class DPITexture extends Texture2D {
  override def godotClassName: String = "DPITexture"

  /** DPITexture.set_source */
  final def setSource(source: String): Unit = {
    if (gdext.classes.DPITexture.mb_set_source == null) gdext.classes.DPITexture.mb_set_source = MethodBind.get("DPITexture", "set_source", 83702148L)
    Ptrcall.callVoid1(gdext.classes.DPITexture.mb_set_source, livePtr, source)
  }

  /** DPITexture.get_source */
  final def getSource(): String = {
    if (gdext.classes.DPITexture.mb_get_source == null) gdext.classes.DPITexture.mb_get_source = MethodBind.get("DPITexture", "get_source", 201670096L)
    Ptrcall.call0[String](gdext.classes.DPITexture.mb_get_source, livePtr)
  }

  /** DPITexture.set_base_scale */
  final def setBaseScale(base_scale: Double): Unit = {
    if (gdext.classes.DPITexture.mb_set_base_scale == null) gdext.classes.DPITexture.mb_set_base_scale = MethodBind.get("DPITexture", "set_base_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.DPITexture.mb_set_base_scale, livePtr, base_scale)
  }

  /** DPITexture.get_base_scale */
  final def getBaseScale(): Double = {
    if (gdext.classes.DPITexture.mb_get_base_scale == null) gdext.classes.DPITexture.mb_get_base_scale = MethodBind.get("DPITexture", "get_base_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.DPITexture.mb_get_base_scale, livePtr)
  }

  /** DPITexture.set_saturation */
  final def setSaturation(saturation: Double): Unit = {
    if (gdext.classes.DPITexture.mb_set_saturation == null) gdext.classes.DPITexture.mb_set_saturation = MethodBind.get("DPITexture", "set_saturation", 373806689L)
    Ptrcall.callVoid1(gdext.classes.DPITexture.mb_set_saturation, livePtr, saturation)
  }

  /** DPITexture.get_saturation */
  final def getSaturation(): Double = {
    if (gdext.classes.DPITexture.mb_get_saturation == null) gdext.classes.DPITexture.mb_get_saturation = MethodBind.get("DPITexture", "get_saturation", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.DPITexture.mb_get_saturation, livePtr)
  }

  /** DPITexture.set_size_override */
  final def setSizeOverride(size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.DPITexture.mb_set_size_override == null) gdext.classes.DPITexture.mb_set_size_override = MethodBind.get("DPITexture", "set_size_override", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.DPITexture.mb_set_size_override, livePtr, size)
  }

}

object DPITexture {
  private[classes] var mb_set_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_base_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_base_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_saturation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_saturation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_size_override: GDExtensionMethodBindPtr = null
}
