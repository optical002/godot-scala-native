package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TextureRect`, extends `Control`. */
abstract class TextureRect extends Control {

  /** TextureRect.set_texture */
  final def setTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureRect", "set_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** TextureRect.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextureRect", "get_texture", 3635182373L), hostObject.objectPtr)

  /** TextureRect.set_expand_mode */
  final def setExpandMode(expand_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureRect", "set_expand_mode", 1870766882L), hostObject.objectPtr, expand_mode)

  /** TextureRect.get_expand_mode */
  final def getExpandMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextureRect", "get_expand_mode", 3863824733L), hostObject.objectPtr)

  /** TextureRect.set_flip_h */
  final def setFlipH(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureRect", "set_flip_h", 2586408642L), hostObject.objectPtr, enable)

  /** TextureRect.is_flipped_h */
  final def isFlippedH(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextureRect", "is_flipped_h", 36873697L), hostObject.objectPtr)

  /** TextureRect.set_flip_v */
  final def setFlipV(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureRect", "set_flip_v", 2586408642L), hostObject.objectPtr, enable)

  /** TextureRect.is_flipped_v */
  final def isFlippedV(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextureRect", "is_flipped_v", 36873697L), hostObject.objectPtr)

  /** TextureRect.set_stretch_mode */
  final def setStretchMode(stretch_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureRect", "set_stretch_mode", 58788729L), hostObject.objectPtr, stretch_mode)

  /** TextureRect.get_stretch_mode */
  final def getStretchMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextureRect", "get_stretch_mode", 346396079L), hostObject.objectPtr)

}

object TextureRect {
  /** Class metadata for Gd[TextureRect] lifetime management and casting. */
  given GodotClass[TextureRect] with {
    def className = "TextureRect"
    def isRefCounted = false
    def wrap(o: GodotObject): TextureRect = new TextureRect {}.withHost(o.objectPtr)
    def unwrap(t: TextureRect): GodotObject = t.hostObject
  }
}
