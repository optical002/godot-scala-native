package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Sprite2D`, extends `Node2D`. */
abstract class Sprite2D extends Node2D {
  override def godotClassName: String = "Sprite2D"

  /** Sprite2D.set_texture */
  final def setTexture(texture: Texture2D): Unit = {
    if (gdext.classes.Sprite2D.mb_set_texture == null) gdext.classes.Sprite2D.mb_set_texture = MethodBind.get("Sprite2D", "set_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.Sprite2D.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** Sprite2D.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture2D = {
    if (gdext.classes.Sprite2D.mb_get_texture == null) gdext.classes.Sprite2D.mb_get_texture = MethodBind.get("Sprite2D", "get_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.Sprite2D.mb_get_texture, livePtr))
  }

  /** Sprite2D.set_centered */
  final def setCentered(centered: Boolean): Unit = {
    if (gdext.classes.Sprite2D.mb_set_centered == null) gdext.classes.Sprite2D.mb_set_centered = MethodBind.get("Sprite2D", "set_centered", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Sprite2D.mb_set_centered, livePtr, centered)
  }

  /** Sprite2D.is_centered */
  final def isCentered(): Boolean = {
    if (gdext.classes.Sprite2D.mb_is_centered == null) gdext.classes.Sprite2D.mb_is_centered = MethodBind.get("Sprite2D", "is_centered", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Sprite2D.mb_is_centered, livePtr)
  }

  /** Sprite2D.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Sprite2D.mb_set_offset == null) gdext.classes.Sprite2D.mb_set_offset = MethodBind.get("Sprite2D", "set_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Sprite2D.mb_set_offset, livePtr, offset)
  }

  /** Sprite2D.get_offset */
  final def getOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.Sprite2D.mb_get_offset == null) gdext.classes.Sprite2D.mb_get_offset = MethodBind.get("Sprite2D", "get_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Sprite2D.mb_get_offset, livePtr)
  }

  /** Sprite2D.set_flip_h */
  final def setFlipH(flipH: Boolean): Unit = {
    if (gdext.classes.Sprite2D.mb_set_flip_h == null) gdext.classes.Sprite2D.mb_set_flip_h = MethodBind.get("Sprite2D", "set_flip_h", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Sprite2D.mb_set_flip_h, livePtr, flipH)
  }

  /** Sprite2D.is_flipped_h */
  final def isFlippedH(): Boolean = {
    if (gdext.classes.Sprite2D.mb_is_flipped_h == null) gdext.classes.Sprite2D.mb_is_flipped_h = MethodBind.get("Sprite2D", "is_flipped_h", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Sprite2D.mb_is_flipped_h, livePtr)
  }

  /** Sprite2D.set_flip_v */
  final def setFlipV(flipV: Boolean): Unit = {
    if (gdext.classes.Sprite2D.mb_set_flip_v == null) gdext.classes.Sprite2D.mb_set_flip_v = MethodBind.get("Sprite2D", "set_flip_v", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Sprite2D.mb_set_flip_v, livePtr, flipV)
  }

  /** Sprite2D.is_flipped_v */
  final def isFlippedV(): Boolean = {
    if (gdext.classes.Sprite2D.mb_is_flipped_v == null) gdext.classes.Sprite2D.mb_is_flipped_v = MethodBind.get("Sprite2D", "is_flipped_v", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Sprite2D.mb_is_flipped_v, livePtr)
  }

  /** Sprite2D.set_region_enabled */
  final def setRegionEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Sprite2D.mb_set_region_enabled == null) gdext.classes.Sprite2D.mb_set_region_enabled = MethodBind.get("Sprite2D", "set_region_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Sprite2D.mb_set_region_enabled, livePtr, enabled)
  }

  /** Sprite2D.is_region_enabled */
  final def isRegionEnabled(): Boolean = {
    if (gdext.classes.Sprite2D.mb_is_region_enabled == null) gdext.classes.Sprite2D.mb_is_region_enabled = MethodBind.get("Sprite2D", "is_region_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Sprite2D.mb_is_region_enabled, livePtr)
  }

  /** Sprite2D.is_pixel_opaque */
  final def isPixelOpaque(pos: gdext.builtin.Vector2): Boolean = {
    if (gdext.classes.Sprite2D.mb_is_pixel_opaque == null) gdext.classes.Sprite2D.mb_is_pixel_opaque = MethodBind.get("Sprite2D", "is_pixel_opaque", 556197845L)
    Ptrcall.call1[gdext.builtin.Vector2, Boolean](gdext.classes.Sprite2D.mb_is_pixel_opaque, livePtr, pos)
  }

  /** Sprite2D.set_region_rect */
  final def setRegionRect(rect: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.Sprite2D.mb_set_region_rect == null) gdext.classes.Sprite2D.mb_set_region_rect = MethodBind.get("Sprite2D", "set_region_rect", 2046264180L)
    Ptrcall.callVoid1(gdext.classes.Sprite2D.mb_set_region_rect, livePtr, rect)
  }

  /** Sprite2D.get_region_rect */
  final def getRegionRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.Sprite2D.mb_get_region_rect == null) gdext.classes.Sprite2D.mb_get_region_rect = MethodBind.get("Sprite2D", "get_region_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.Sprite2D.mb_get_region_rect, livePtr)
  }

  /** Sprite2D.set_region_filter_clip_enabled */
  final def setRegionFilterClipEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Sprite2D.mb_set_region_filter_clip_enabled == null) gdext.classes.Sprite2D.mb_set_region_filter_clip_enabled = MethodBind.get("Sprite2D", "set_region_filter_clip_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Sprite2D.mb_set_region_filter_clip_enabled, livePtr, enabled)
  }

  /** Sprite2D.is_region_filter_clip_enabled */
  final def isRegionFilterClipEnabled(): Boolean = {
    if (gdext.classes.Sprite2D.mb_is_region_filter_clip_enabled == null) gdext.classes.Sprite2D.mb_is_region_filter_clip_enabled = MethodBind.get("Sprite2D", "is_region_filter_clip_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Sprite2D.mb_is_region_filter_clip_enabled, livePtr)
  }

  /** Sprite2D.set_frame */
  final def setFrame(frame: Long): Unit = {
    if (gdext.classes.Sprite2D.mb_set_frame == null) gdext.classes.Sprite2D.mb_set_frame = MethodBind.get("Sprite2D", "set_frame", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Sprite2D.mb_set_frame, livePtr, frame)
  }

  /** Sprite2D.get_frame */
  final def getFrame(): Long = {
    if (gdext.classes.Sprite2D.mb_get_frame == null) gdext.classes.Sprite2D.mb_get_frame = MethodBind.get("Sprite2D", "get_frame", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Sprite2D.mb_get_frame, livePtr)
  }

  /** Sprite2D.set_frame_coords */
  final def setFrameCoords(coords: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Sprite2D.mb_set_frame_coords == null) gdext.classes.Sprite2D.mb_set_frame_coords = MethodBind.get("Sprite2D", "set_frame_coords", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.Sprite2D.mb_set_frame_coords, livePtr, coords)
  }

  /** Sprite2D.get_frame_coords */
  final def getFrameCoords(): gdext.builtin.Vector2i = {
    if (gdext.classes.Sprite2D.mb_get_frame_coords == null) gdext.classes.Sprite2D.mb_get_frame_coords = MethodBind.get("Sprite2D", "get_frame_coords", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.Sprite2D.mb_get_frame_coords, livePtr)
  }

  /** Sprite2D.set_vframes */
  final def setVframes(vframes: Long): Unit = {
    if (gdext.classes.Sprite2D.mb_set_vframes == null) gdext.classes.Sprite2D.mb_set_vframes = MethodBind.get("Sprite2D", "set_vframes", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Sprite2D.mb_set_vframes, livePtr, vframes)
  }

  /** Sprite2D.get_vframes */
  final def getVframes(): Long = {
    if (gdext.classes.Sprite2D.mb_get_vframes == null) gdext.classes.Sprite2D.mb_get_vframes = MethodBind.get("Sprite2D", "get_vframes", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Sprite2D.mb_get_vframes, livePtr)
  }

  /** Sprite2D.set_hframes */
  final def setHframes(hframes: Long): Unit = {
    if (gdext.classes.Sprite2D.mb_set_hframes == null) gdext.classes.Sprite2D.mb_set_hframes = MethodBind.get("Sprite2D", "set_hframes", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Sprite2D.mb_set_hframes, livePtr, hframes)
  }

  /** Sprite2D.get_hframes */
  final def getHframes(): Long = {
    if (gdext.classes.Sprite2D.mb_get_hframes == null) gdext.classes.Sprite2D.mb_get_hframes = MethodBind.get("Sprite2D", "get_hframes", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Sprite2D.mb_get_hframes, livePtr)
  }

  /** Sprite2D.get_rect */
  final def getRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.Sprite2D.mb_get_rect == null) gdext.classes.Sprite2D.mb_get_rect = MethodBind.get("Sprite2D", "get_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.Sprite2D.mb_get_rect, livePtr)
  }

}

object Sprite2D {
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_centered: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_centered: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flip_h: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_flipped_h: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flip_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_flipped_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_region_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_region_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_pixel_opaque: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_region_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_region_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_region_filter_clip_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_region_filter_clip_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frame_coords: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame_coords: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vframes: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vframes: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hframes: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hframes: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rect: GDExtensionMethodBindPtr = null
}
