package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PointLight2D`, extends `Light2D`. */
abstract class PointLight2D extends Light2D {
  override def godotClassName: String = "PointLight2D"

  /** PointLight2D.set_texture */
  final def setTexture(texture: Texture2D): Unit = {
    if (gdext.classes.PointLight2D.mb_set_texture == null) gdext.classes.PointLight2D.mb_set_texture = MethodBind.get("PointLight2D", "set_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.PointLight2D.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** PointLight2D.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture2D = {
    if (gdext.classes.PointLight2D.mb_get_texture == null) gdext.classes.PointLight2D.mb_get_texture = MethodBind.get("PointLight2D", "get_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.PointLight2D.mb_get_texture, livePtr))
  }

  /** PointLight2D.set_texture_offset */
  final def setTextureOffset(textureOffset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.PointLight2D.mb_set_texture_offset == null) gdext.classes.PointLight2D.mb_set_texture_offset = MethodBind.get("PointLight2D", "set_texture_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.PointLight2D.mb_set_texture_offset, livePtr, textureOffset)
  }

  /** PointLight2D.get_texture_offset */
  final def getTextureOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.PointLight2D.mb_get_texture_offset == null) gdext.classes.PointLight2D.mb_get_texture_offset = MethodBind.get("PointLight2D", "get_texture_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PointLight2D.mb_get_texture_offset, livePtr)
  }

  /** PointLight2D.set_texture_scale */
  final def setTextureScale(textureScale: Double): Unit = {
    if (gdext.classes.PointLight2D.mb_set_texture_scale == null) gdext.classes.PointLight2D.mb_set_texture_scale = MethodBind.get("PointLight2D", "set_texture_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PointLight2D.mb_set_texture_scale, livePtr, textureScale)
  }

  /** PointLight2D.get_texture_scale */
  final def getTextureScale(): Double = {
    if (gdext.classes.PointLight2D.mb_get_texture_scale == null) gdext.classes.PointLight2D.mb_get_texture_scale = MethodBind.get("PointLight2D", "get_texture_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PointLight2D.mb_get_texture_scale, livePtr)
  }

}

object PointLight2D {
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_scale: GDExtensionMethodBindPtr = null
}
