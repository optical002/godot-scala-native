package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TextureButton`, extends `BaseButton`. */
abstract class TextureButton extends BaseButton {
  override def godotClassName: String = "TextureButton"

  /** TextureButton.set_texture_normal */
  final def setTextureNormal(texture: Texture2D): Unit = {
    if (gdext.classes.TextureButton.mb_set_texture_normal == null) gdext.classes.TextureButton.mb_set_texture_normal = MethodBind.get("TextureButton", "set_texture_normal", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.TextureButton.mb_set_texture_normal, livePtr, Wrappers.handle(texture))
  }

  /** TextureButton.set_texture_pressed */
  final def setTexturePressed(texture: Texture2D): Unit = {
    if (gdext.classes.TextureButton.mb_set_texture_pressed == null) gdext.classes.TextureButton.mb_set_texture_pressed = MethodBind.get("TextureButton", "set_texture_pressed", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.TextureButton.mb_set_texture_pressed, livePtr, Wrappers.handle(texture))
  }

  /** TextureButton.set_texture_hover */
  final def setTextureHover(texture: Texture2D): Unit = {
    if (gdext.classes.TextureButton.mb_set_texture_hover == null) gdext.classes.TextureButton.mb_set_texture_hover = MethodBind.get("TextureButton", "set_texture_hover", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.TextureButton.mb_set_texture_hover, livePtr, Wrappers.handle(texture))
  }

  /** TextureButton.set_texture_disabled */
  final def setTextureDisabled(texture: Texture2D): Unit = {
    if (gdext.classes.TextureButton.mb_set_texture_disabled == null) gdext.classes.TextureButton.mb_set_texture_disabled = MethodBind.get("TextureButton", "set_texture_disabled", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.TextureButton.mb_set_texture_disabled, livePtr, Wrappers.handle(texture))
  }

  /** TextureButton.set_texture_focused */
  final def setTextureFocused(texture: Texture2D): Unit = {
    if (gdext.classes.TextureButton.mb_set_texture_focused == null) gdext.classes.TextureButton.mb_set_texture_focused = MethodBind.get("TextureButton", "set_texture_focused", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.TextureButton.mb_set_texture_focused, livePtr, Wrappers.handle(texture))
  }

  /** TextureButton.set_click_mask */
  final def setClickMask(mask: BitMap): Unit = {
    if (gdext.classes.TextureButton.mb_set_click_mask == null) gdext.classes.TextureButton.mb_set_click_mask = MethodBind.get("TextureButton", "set_click_mask", 698588216L)
    Ptrcall.callVoid1(gdext.classes.TextureButton.mb_set_click_mask, livePtr, Wrappers.handle(mask))
  }

  /** TextureButton.set_ignore_texture_size */
  final def setIgnoreTextureSize(ignore: Boolean): Unit = {
    if (gdext.classes.TextureButton.mb_set_ignore_texture_size == null) gdext.classes.TextureButton.mb_set_ignore_texture_size = MethodBind.get("TextureButton", "set_ignore_texture_size", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextureButton.mb_set_ignore_texture_size, livePtr, ignore)
  }

  /** TextureButton.set_stretch_mode */
  final def setStretchMode(mode: gdext.classes.TextureButton.StretchMode): Unit = {
    if (gdext.classes.TextureButton.mb_set_stretch_mode == null) gdext.classes.TextureButton.mb_set_stretch_mode = MethodBind.get("TextureButton", "set_stretch_mode", 252530840L)
    Ptrcall.callVoid1(gdext.classes.TextureButton.mb_set_stretch_mode, livePtr, mode)
  }

  /** TextureButton.set_flip_h */
  final def setFlipH(enable: Boolean): Unit = {
    if (gdext.classes.TextureButton.mb_set_flip_h == null) gdext.classes.TextureButton.mb_set_flip_h = MethodBind.get("TextureButton", "set_flip_h", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextureButton.mb_set_flip_h, livePtr, enable)
  }

  /** TextureButton.is_flipped_h */
  final def isFlippedH(): Boolean = {
    if (gdext.classes.TextureButton.mb_is_flipped_h == null) gdext.classes.TextureButton.mb_is_flipped_h = MethodBind.get("TextureButton", "is_flipped_h", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextureButton.mb_is_flipped_h, livePtr)
  }

  /** TextureButton.set_flip_v */
  final def setFlipV(enable: Boolean): Unit = {
    if (gdext.classes.TextureButton.mb_set_flip_v == null) gdext.classes.TextureButton.mb_set_flip_v = MethodBind.get("TextureButton", "set_flip_v", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextureButton.mb_set_flip_v, livePtr, enable)
  }

  /** TextureButton.is_flipped_v */
  final def isFlippedV(): Boolean = {
    if (gdext.classes.TextureButton.mb_is_flipped_v == null) gdext.classes.TextureButton.mb_is_flipped_v = MethodBind.get("TextureButton", "is_flipped_v", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextureButton.mb_is_flipped_v, livePtr)
  }

  /** TextureButton.get_texture_normal. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTextureNormal(): Texture2D = {
    if (gdext.classes.TextureButton.mb_get_texture_normal == null) gdext.classes.TextureButton.mb_get_texture_normal = MethodBind.get("TextureButton", "get_texture_normal", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.TextureButton.mb_get_texture_normal, livePtr))
  }

  /** TextureButton.get_texture_pressed. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexturePressed(): Texture2D = {
    if (gdext.classes.TextureButton.mb_get_texture_pressed == null) gdext.classes.TextureButton.mb_get_texture_pressed = MethodBind.get("TextureButton", "get_texture_pressed", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.TextureButton.mb_get_texture_pressed, livePtr))
  }

  /** TextureButton.get_texture_hover. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTextureHover(): Texture2D = {
    if (gdext.classes.TextureButton.mb_get_texture_hover == null) gdext.classes.TextureButton.mb_get_texture_hover = MethodBind.get("TextureButton", "get_texture_hover", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.TextureButton.mb_get_texture_hover, livePtr))
  }

  /** TextureButton.get_texture_disabled. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTextureDisabled(): Texture2D = {
    if (gdext.classes.TextureButton.mb_get_texture_disabled == null) gdext.classes.TextureButton.mb_get_texture_disabled = MethodBind.get("TextureButton", "get_texture_disabled", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.TextureButton.mb_get_texture_disabled, livePtr))
  }

  /** TextureButton.get_texture_focused. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTextureFocused(): Texture2D = {
    if (gdext.classes.TextureButton.mb_get_texture_focused == null) gdext.classes.TextureButton.mb_get_texture_focused = MethodBind.get("TextureButton", "get_texture_focused", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.TextureButton.mb_get_texture_focused, livePtr))
  }

  /** TextureButton.get_click_mask. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getClickMask(): BitMap = {
    if (gdext.classes.TextureButton.mb_get_click_mask == null) gdext.classes.TextureButton.mb_get_click_mask = MethodBind.get("TextureButton", "get_click_mask", 2459671998L)
    Wrappers.owned[BitMap](Ptrcall.call0[Long](gdext.classes.TextureButton.mb_get_click_mask, livePtr))
  }

  /** TextureButton.get_ignore_texture_size */
  final def getIgnoreTextureSize(): Boolean = {
    if (gdext.classes.TextureButton.mb_get_ignore_texture_size == null) gdext.classes.TextureButton.mb_get_ignore_texture_size = MethodBind.get("TextureButton", "get_ignore_texture_size", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextureButton.mb_get_ignore_texture_size, livePtr)
  }

  /** TextureButton.get_stretch_mode */
  final def getStretchMode(): gdext.classes.TextureButton.StretchMode = {
    if (gdext.classes.TextureButton.mb_get_stretch_mode == null) gdext.classes.TextureButton.mb_get_stretch_mode = MethodBind.get("TextureButton", "get_stretch_mode", 33815122L)
    gdext.classes.TextureButton.StretchMode(Ptrcall.call0[Long](gdext.classes.TextureButton.mb_get_stretch_mode, livePtr))
  }

}

object TextureButton {
  private[classes] var mb_set_texture_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_hover: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_focused: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_click_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ignore_texture_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stretch_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flip_h: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_flipped_h: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flip_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_flipped_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_hover: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_focused: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_click_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ignore_texture_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stretch_mode: GDExtensionMethodBindPtr = null

  /** Godot enum `TextureButton.StretchMode`. */
  opaque type StretchMode <: Long = Long

  object StretchMode {
    final val Scale: StretchMode = 0L.asInstanceOf[StretchMode]
    final val Tile: StretchMode = 1L.asInstanceOf[StretchMode]
    final val Keep: StretchMode = 2L.asInstanceOf[StretchMode]
    final val KeepCentered: StretchMode = 3L.asInstanceOf[StretchMode]
    final val KeepAspect: StretchMode = 4L.asInstanceOf[StretchMode]
    final val KeepAspectCentered: StretchMode = 5L.asInstanceOf[StretchMode]
    final val KeepAspectCovered: StretchMode = 6L.asInstanceOf[StretchMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): StretchMode = value.asInstanceOf[StretchMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[StretchMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[StretchMode]]

    extension (self: StretchMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Scale"
        case 1L => "Tile"
        case 2L => "Keep"
        case 3L => "KeepCentered"
        case 4L => "KeepAspect"
        case 5L => "KeepAspectCentered"
        case 6L => "KeepAspectCovered"
        case other => other.toString
      }
  }
}
