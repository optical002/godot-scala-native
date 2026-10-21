package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TextureRect`, extends `Control`. */
abstract class TextureRect extends Control {
  override def godotClassName: String = "TextureRect"

  /** TextureRect.set_texture */
  final def setTexture(texture: Texture2D): Unit = {
    if (gdext.classes.TextureRect.mb_set_texture == null) gdext.classes.TextureRect.mb_set_texture = MethodBind.get("TextureRect", "set_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.TextureRect.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** TextureRect.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture2D = {
    if (gdext.classes.TextureRect.mb_get_texture == null) gdext.classes.TextureRect.mb_get_texture = MethodBind.get("TextureRect", "get_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.TextureRect.mb_get_texture, livePtr))
  }

  /** TextureRect.set_expand_mode */
  final def setExpandMode(expand_mode: Long): Unit = {
    if (gdext.classes.TextureRect.mb_set_expand_mode == null) gdext.classes.TextureRect.mb_set_expand_mode = MethodBind.get("TextureRect", "set_expand_mode", 1870766882L)
    Ptrcall.callVoid1(gdext.classes.TextureRect.mb_set_expand_mode, livePtr, expand_mode)
  }

  /** TextureRect.get_expand_mode */
  final def getExpandMode(): Long = {
    if (gdext.classes.TextureRect.mb_get_expand_mode == null) gdext.classes.TextureRect.mb_get_expand_mode = MethodBind.get("TextureRect", "get_expand_mode", 3863824733L)
    Ptrcall.call0[Long](gdext.classes.TextureRect.mb_get_expand_mode, livePtr)
  }

  /** TextureRect.set_flip_h */
  final def setFlipH(enable: Boolean): Unit = {
    if (gdext.classes.TextureRect.mb_set_flip_h == null) gdext.classes.TextureRect.mb_set_flip_h = MethodBind.get("TextureRect", "set_flip_h", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextureRect.mb_set_flip_h, livePtr, enable)
  }

  /** TextureRect.is_flipped_h */
  final def isFlippedH(): Boolean = {
    if (gdext.classes.TextureRect.mb_is_flipped_h == null) gdext.classes.TextureRect.mb_is_flipped_h = MethodBind.get("TextureRect", "is_flipped_h", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextureRect.mb_is_flipped_h, livePtr)
  }

  /** TextureRect.set_flip_v */
  final def setFlipV(enable: Boolean): Unit = {
    if (gdext.classes.TextureRect.mb_set_flip_v == null) gdext.classes.TextureRect.mb_set_flip_v = MethodBind.get("TextureRect", "set_flip_v", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextureRect.mb_set_flip_v, livePtr, enable)
  }

  /** TextureRect.is_flipped_v */
  final def isFlippedV(): Boolean = {
    if (gdext.classes.TextureRect.mb_is_flipped_v == null) gdext.classes.TextureRect.mb_is_flipped_v = MethodBind.get("TextureRect", "is_flipped_v", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextureRect.mb_is_flipped_v, livePtr)
  }

  /** TextureRect.set_stretch_mode */
  final def setStretchMode(stretch_mode: Long): Unit = {
    if (gdext.classes.TextureRect.mb_set_stretch_mode == null) gdext.classes.TextureRect.mb_set_stretch_mode = MethodBind.get("TextureRect", "set_stretch_mode", 58788729L)
    Ptrcall.callVoid1(gdext.classes.TextureRect.mb_set_stretch_mode, livePtr, stretch_mode)
  }

  /** TextureRect.get_stretch_mode */
  final def getStretchMode(): Long = {
    if (gdext.classes.TextureRect.mb_get_stretch_mode == null) gdext.classes.TextureRect.mb_get_stretch_mode = MethodBind.get("TextureRect", "get_stretch_mode", 346396079L)
    Ptrcall.call0[Long](gdext.classes.TextureRect.mb_get_stretch_mode, livePtr)
  }

}

object TextureRect {
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_expand_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_expand_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flip_h: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_flipped_h: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flip_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_flipped_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stretch_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stretch_mode: GDExtensionMethodBindPtr = null
}
