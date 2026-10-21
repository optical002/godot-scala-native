package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CanvasTexture`, extends `Texture2D`. */
abstract class CanvasTexture extends Texture2D {
  override def godotClassName: String = "CanvasTexture"

  /** CanvasTexture.set_diffuse_texture */
  final def setDiffuseTexture(texture: Texture2D): Unit = {
    if (gdext.classes.CanvasTexture.mb_set_diffuse_texture == null) gdext.classes.CanvasTexture.mb_set_diffuse_texture = MethodBind.get("CanvasTexture", "set_diffuse_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.CanvasTexture.mb_set_diffuse_texture, livePtr, Wrappers.handle(texture))
  }

  /** CanvasTexture.get_diffuse_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getDiffuseTexture(): Texture2D = {
    if (gdext.classes.CanvasTexture.mb_get_diffuse_texture == null) gdext.classes.CanvasTexture.mb_get_diffuse_texture = MethodBind.get("CanvasTexture", "get_diffuse_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.CanvasTexture.mb_get_diffuse_texture, livePtr))
  }

  /** CanvasTexture.set_normal_texture */
  final def setNormalTexture(texture: Texture2D): Unit = {
    if (gdext.classes.CanvasTexture.mb_set_normal_texture == null) gdext.classes.CanvasTexture.mb_set_normal_texture = MethodBind.get("CanvasTexture", "set_normal_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.CanvasTexture.mb_set_normal_texture, livePtr, Wrappers.handle(texture))
  }

  /** CanvasTexture.get_normal_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNormalTexture(): Texture2D = {
    if (gdext.classes.CanvasTexture.mb_get_normal_texture == null) gdext.classes.CanvasTexture.mb_get_normal_texture = MethodBind.get("CanvasTexture", "get_normal_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.CanvasTexture.mb_get_normal_texture, livePtr))
  }

  /** CanvasTexture.set_specular_texture */
  final def setSpecularTexture(texture: Texture2D): Unit = {
    if (gdext.classes.CanvasTexture.mb_set_specular_texture == null) gdext.classes.CanvasTexture.mb_set_specular_texture = MethodBind.get("CanvasTexture", "set_specular_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.CanvasTexture.mb_set_specular_texture, livePtr, Wrappers.handle(texture))
  }

  /** CanvasTexture.get_specular_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSpecularTexture(): Texture2D = {
    if (gdext.classes.CanvasTexture.mb_get_specular_texture == null) gdext.classes.CanvasTexture.mb_get_specular_texture = MethodBind.get("CanvasTexture", "get_specular_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.CanvasTexture.mb_get_specular_texture, livePtr))
  }

  /** CanvasTexture.set_specular_color */
  final def setSpecularColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.CanvasTexture.mb_set_specular_color == null) gdext.classes.CanvasTexture.mb_set_specular_color = MethodBind.get("CanvasTexture", "set_specular_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.CanvasTexture.mb_set_specular_color, livePtr, color)
  }

  /** CanvasTexture.get_specular_color */
  final def getSpecularColor(): gdext.builtin.Color = {
    if (gdext.classes.CanvasTexture.mb_get_specular_color == null) gdext.classes.CanvasTexture.mb_get_specular_color = MethodBind.get("CanvasTexture", "get_specular_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.CanvasTexture.mb_get_specular_color, livePtr)
  }

  /** CanvasTexture.set_specular_shininess */
  final def setSpecularShininess(shininess: Double): Unit = {
    if (gdext.classes.CanvasTexture.mb_set_specular_shininess == null) gdext.classes.CanvasTexture.mb_set_specular_shininess = MethodBind.get("CanvasTexture", "set_specular_shininess", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CanvasTexture.mb_set_specular_shininess, livePtr, shininess)
  }

  /** CanvasTexture.get_specular_shininess */
  final def getSpecularShininess(): Double = {
    if (gdext.classes.CanvasTexture.mb_get_specular_shininess == null) gdext.classes.CanvasTexture.mb_get_specular_shininess = MethodBind.get("CanvasTexture", "get_specular_shininess", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CanvasTexture.mb_get_specular_shininess, livePtr)
  }

  /** CanvasTexture.set_texture_filter */
  final def setTextureFilter(filter: Long): Unit = {
    if (gdext.classes.CanvasTexture.mb_set_texture_filter == null) gdext.classes.CanvasTexture.mb_set_texture_filter = MethodBind.get("CanvasTexture", "set_texture_filter", 1037999706L)
    Ptrcall.callVoid1(gdext.classes.CanvasTexture.mb_set_texture_filter, livePtr, filter)
  }

  /** CanvasTexture.get_texture_filter */
  final def getTextureFilter(): Long = {
    if (gdext.classes.CanvasTexture.mb_get_texture_filter == null) gdext.classes.CanvasTexture.mb_get_texture_filter = MethodBind.get("CanvasTexture", "get_texture_filter", 121960042L)
    Ptrcall.call0[Long](gdext.classes.CanvasTexture.mb_get_texture_filter, livePtr)
  }

  /** CanvasTexture.set_texture_repeat */
  final def setTextureRepeat(repeat: Long): Unit = {
    if (gdext.classes.CanvasTexture.mb_set_texture_repeat == null) gdext.classes.CanvasTexture.mb_set_texture_repeat = MethodBind.get("CanvasTexture", "set_texture_repeat", 1716472974L)
    Ptrcall.callVoid1(gdext.classes.CanvasTexture.mb_set_texture_repeat, livePtr, repeat)
  }

  /** CanvasTexture.get_texture_repeat */
  final def getTextureRepeat(): Long = {
    if (gdext.classes.CanvasTexture.mb_get_texture_repeat == null) gdext.classes.CanvasTexture.mb_get_texture_repeat = MethodBind.get("CanvasTexture", "get_texture_repeat", 2667158319L)
    Ptrcall.call0[Long](gdext.classes.CanvasTexture.mb_get_texture_repeat, livePtr)
  }

}

object CanvasTexture {
  private[classes] var mb_set_diffuse_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_diffuse_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_normal_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_normal_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_specular_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_specular_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_specular_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_specular_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_specular_shininess: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_specular_shininess: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_repeat: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_repeat: GDExtensionMethodBindPtr = null
}
