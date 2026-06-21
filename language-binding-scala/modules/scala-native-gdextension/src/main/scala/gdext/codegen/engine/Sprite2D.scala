package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Sprite2D`, extends `Node2D`. */
abstract class Sprite2D extends Node2D {

  /** Sprite2D.set_texture */
  final def setTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** Sprite2D.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Sprite2D", "get_texture", 3635182373L), hostObject.objectPtr)

  /** Sprite2D.set_centered */
  final def setCentered(centered: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_centered", 2586408642L), hostObject.objectPtr, centered)

  /** Sprite2D.is_centered */
  final def isCentered(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Sprite2D", "is_centered", 36873697L), hostObject.objectPtr)

  /** Sprite2D.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_offset", 743155724L), hostObject.objectPtr, offset)

  /** Sprite2D.get_offset */
  final def getOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Sprite2D", "get_offset", 3341600327L), hostObject.objectPtr)

  /** Sprite2D.set_flip_h */
  final def setFlipH(flip_h: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_flip_h", 2586408642L), hostObject.objectPtr, flip_h)

  /** Sprite2D.is_flipped_h */
  final def isFlippedH(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Sprite2D", "is_flipped_h", 36873697L), hostObject.objectPtr)

  /** Sprite2D.set_flip_v */
  final def setFlipV(flip_v: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_flip_v", 2586408642L), hostObject.objectPtr, flip_v)

  /** Sprite2D.is_flipped_v */
  final def isFlippedV(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Sprite2D", "is_flipped_v", 36873697L), hostObject.objectPtr)

  /** Sprite2D.set_region_enabled */
  final def setRegionEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_region_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Sprite2D.is_region_enabled */
  final def isRegionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Sprite2D", "is_region_enabled", 36873697L), hostObject.objectPtr)

  /** Sprite2D.is_pixel_opaque */
  final def isPixelOpaque(pos: gdext.builtin.Vector2): Boolean =
    Ptrcall.call1[gdext.builtin.Vector2, Boolean](MethodBind.get("Sprite2D", "is_pixel_opaque", 556197845L), hostObject.objectPtr, pos)

  /** Sprite2D.set_region_rect */
  final def setRegionRect(rect: gdext.builtin.Rect2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_region_rect", 2046264180L), hostObject.objectPtr, rect)

  /** Sprite2D.get_region_rect */
  final def getRegionRect(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("Sprite2D", "get_region_rect", 1639390495L), hostObject.objectPtr)

  /** Sprite2D.set_region_filter_clip_enabled */
  final def setRegionFilterClipEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_region_filter_clip_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Sprite2D.is_region_filter_clip_enabled */
  final def isRegionFilterClipEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Sprite2D", "is_region_filter_clip_enabled", 36873697L), hostObject.objectPtr)

  /** Sprite2D.set_frame */
  final def setFrame(frame: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_frame", 1286410249L), hostObject.objectPtr, frame)

  /** Sprite2D.get_frame */
  final def getFrame(): Long =
    Ptrcall.call0[Long](MethodBind.get("Sprite2D", "get_frame", 3905245786L), hostObject.objectPtr)

  /** Sprite2D.set_frame_coords */
  final def setFrameCoords(coords: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_frame_coords", 1130785943L), hostObject.objectPtr, coords)

  /** Sprite2D.get_frame_coords */
  final def getFrameCoords(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("Sprite2D", "get_frame_coords", 3690982128L), hostObject.objectPtr)

  /** Sprite2D.set_vframes */
  final def setVframes(vframes: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_vframes", 1286410249L), hostObject.objectPtr, vframes)

  /** Sprite2D.get_vframes */
  final def getVframes(): Long =
    Ptrcall.call0[Long](MethodBind.get("Sprite2D", "get_vframes", 3905245786L), hostObject.objectPtr)

  /** Sprite2D.set_hframes */
  final def setHframes(hframes: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_hframes", 1286410249L), hostObject.objectPtr, hframes)

  /** Sprite2D.get_hframes */
  final def getHframes(): Long =
    Ptrcall.call0[Long](MethodBind.get("Sprite2D", "get_hframes", 3905245786L), hostObject.objectPtr)

  /** Sprite2D.get_rect */
  final def getRect(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("Sprite2D", "get_rect", 1639390495L), hostObject.objectPtr)

}

object Sprite2D {
  /** Class metadata for Gd[Sprite2D] lifetime management and casting. */
  given GodotClass[Sprite2D] with {
    def className = "Sprite2D"
    def isRefCounted = false
    def wrap(o: GodotObject): Sprite2D = new Sprite2D {}.withHost(o.objectPtr)
    def unwrap(t: Sprite2D): GodotObject = t.hostObject
  }
}
