package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `TextureButton`, extends `BaseButton`. */
abstract class TextureButton extends BaseButton {

  /** TextureButton.set_texture_normal */
  final def setTextureNormal(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureButton", "set_texture_normal", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** TextureButton.set_texture_pressed */
  final def setTexturePressed(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureButton", "set_texture_pressed", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** TextureButton.set_texture_hover */
  final def setTextureHover(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureButton", "set_texture_hover", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** TextureButton.set_texture_disabled */
  final def setTextureDisabled(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureButton", "set_texture_disabled", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** TextureButton.set_texture_focused */
  final def setTextureFocused(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureButton", "set_texture_focused", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** TextureButton.set_click_mask */
  final def setClickMask(mask: BitMap): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureButton", "set_click_mask", 698588216L), hostObject.objectPtr, mask.hostObject)

  /** TextureButton.set_ignore_texture_size */
  final def setIgnoreTextureSize(ignore: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureButton", "set_ignore_texture_size", 2586408642L), hostObject.objectPtr, ignore)

  /** TextureButton.set_stretch_mode */
  final def setStretchMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureButton", "set_stretch_mode", 252530840L), hostObject.objectPtr, mode)

  /** TextureButton.set_flip_h */
  final def setFlipH(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureButton", "set_flip_h", 2586408642L), hostObject.objectPtr, enable)

  /** TextureButton.is_flipped_h */
  final def isFlippedH(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextureButton", "is_flipped_h", 36873697L), hostObject.objectPtr)

  /** TextureButton.set_flip_v */
  final def setFlipV(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureButton", "set_flip_v", 2586408642L), hostObject.objectPtr, enable)

  /** TextureButton.is_flipped_v */
  final def isFlippedV(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextureButton", "is_flipped_v", 36873697L), hostObject.objectPtr)

  /** TextureButton.get_texture_normal */
  final def getTextureNormal(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextureButton", "get_texture_normal", 3635182373L), hostObject.objectPtr)

  /** TextureButton.get_texture_pressed */
  final def getTexturePressed(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextureButton", "get_texture_pressed", 3635182373L), hostObject.objectPtr)

  /** TextureButton.get_texture_hover */
  final def getTextureHover(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextureButton", "get_texture_hover", 3635182373L), hostObject.objectPtr)

  /** TextureButton.get_texture_disabled */
  final def getTextureDisabled(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextureButton", "get_texture_disabled", 3635182373L), hostObject.objectPtr)

  /** TextureButton.get_texture_focused */
  final def getTextureFocused(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextureButton", "get_texture_focused", 3635182373L), hostObject.objectPtr)

  /** TextureButton.get_click_mask */
  final def getClickMask(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextureButton", "get_click_mask", 2459671998L), hostObject.objectPtr)

  /** TextureButton.get_ignore_texture_size */
  final def getIgnoreTextureSize(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextureButton", "get_ignore_texture_size", 36873697L), hostObject.objectPtr)

  /** TextureButton.get_stretch_mode */
  final def getStretchMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextureButton", "get_stretch_mode", 33815122L), hostObject.objectPtr)

}

object TextureButton {
  /** Class metadata for Gd[TextureButton] lifetime management and casting. */
  given GodotClass[TextureButton] with {
    def className = "TextureButton"
    def isRefCounted = false
    def wrap(o: GodotObject): TextureButton = new TextureButton {}.withHost(o.objectPtr)
    def unwrap(t: TextureButton): GodotObject = t.hostObject
  }
}
