package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Sprite3D`, extends `SpriteBase3D`. */
abstract class Sprite3D extends SpriteBase3D {
  override def godotClassName: String = "Sprite3D"

  /** Sprite3D.set_texture */
  final def setTexture(texture: Texture2D): Unit = {
    if (gdext.classes.Sprite3D.mb_set_texture == null) gdext.classes.Sprite3D.mb_set_texture = MethodBind.get("Sprite3D", "set_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.Sprite3D.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** Sprite3D.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture2D = {
    if (gdext.classes.Sprite3D.mb_get_texture == null) gdext.classes.Sprite3D.mb_get_texture = MethodBind.get("Sprite3D", "get_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.Sprite3D.mb_get_texture, livePtr))
  }

  /** Sprite3D.set_region_enabled */
  final def setRegionEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Sprite3D.mb_set_region_enabled == null) gdext.classes.Sprite3D.mb_set_region_enabled = MethodBind.get("Sprite3D", "set_region_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Sprite3D.mb_set_region_enabled, livePtr, enabled)
  }

  /** Sprite3D.is_region_enabled */
  final def isRegionEnabled(): Boolean = {
    if (gdext.classes.Sprite3D.mb_is_region_enabled == null) gdext.classes.Sprite3D.mb_is_region_enabled = MethodBind.get("Sprite3D", "is_region_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Sprite3D.mb_is_region_enabled, livePtr)
  }

  /** Sprite3D.set_region_rect */
  final def setRegionRect(rect: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.Sprite3D.mb_set_region_rect == null) gdext.classes.Sprite3D.mb_set_region_rect = MethodBind.get("Sprite3D", "set_region_rect", 2046264180L)
    Ptrcall.callVoid1(gdext.classes.Sprite3D.mb_set_region_rect, livePtr, rect)
  }

  /** Sprite3D.get_region_rect */
  final def getRegionRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.Sprite3D.mb_get_region_rect == null) gdext.classes.Sprite3D.mb_get_region_rect = MethodBind.get("Sprite3D", "get_region_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.Sprite3D.mb_get_region_rect, livePtr)
  }

  /** Sprite3D.set_frame */
  final def setFrame(frame: Long): Unit = {
    if (gdext.classes.Sprite3D.mb_set_frame == null) gdext.classes.Sprite3D.mb_set_frame = MethodBind.get("Sprite3D", "set_frame", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Sprite3D.mb_set_frame, livePtr, frame)
  }

  /** Sprite3D.get_frame */
  final def getFrame(): Long = {
    if (gdext.classes.Sprite3D.mb_get_frame == null) gdext.classes.Sprite3D.mb_get_frame = MethodBind.get("Sprite3D", "get_frame", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Sprite3D.mb_get_frame, livePtr)
  }

  /** Sprite3D.set_frame_coords */
  final def setFrameCoords(coords: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Sprite3D.mb_set_frame_coords == null) gdext.classes.Sprite3D.mb_set_frame_coords = MethodBind.get("Sprite3D", "set_frame_coords", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.Sprite3D.mb_set_frame_coords, livePtr, coords)
  }

  /** Sprite3D.get_frame_coords */
  final def getFrameCoords(): gdext.builtin.Vector2i = {
    if (gdext.classes.Sprite3D.mb_get_frame_coords == null) gdext.classes.Sprite3D.mb_get_frame_coords = MethodBind.get("Sprite3D", "get_frame_coords", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.Sprite3D.mb_get_frame_coords, livePtr)
  }

  /** Sprite3D.set_vframes */
  final def setVframes(vframes: Long): Unit = {
    if (gdext.classes.Sprite3D.mb_set_vframes == null) gdext.classes.Sprite3D.mb_set_vframes = MethodBind.get("Sprite3D", "set_vframes", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Sprite3D.mb_set_vframes, livePtr, vframes)
  }

  /** Sprite3D.get_vframes */
  final def getVframes(): Long = {
    if (gdext.classes.Sprite3D.mb_get_vframes == null) gdext.classes.Sprite3D.mb_get_vframes = MethodBind.get("Sprite3D", "get_vframes", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Sprite3D.mb_get_vframes, livePtr)
  }

  /** Sprite3D.set_hframes */
  final def setHframes(hframes: Long): Unit = {
    if (gdext.classes.Sprite3D.mb_set_hframes == null) gdext.classes.Sprite3D.mb_set_hframes = MethodBind.get("Sprite3D", "set_hframes", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Sprite3D.mb_set_hframes, livePtr, hframes)
  }

  /** Sprite3D.get_hframes */
  final def getHframes(): Long = {
    if (gdext.classes.Sprite3D.mb_get_hframes == null) gdext.classes.Sprite3D.mb_get_hframes = MethodBind.get("Sprite3D", "get_hframes", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Sprite3D.mb_get_hframes, livePtr)
  }

}

object Sprite3D {
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_region_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_region_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_region_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_region_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frame_coords: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame_coords: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vframes: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vframes: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hframes: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hframes: GDExtensionMethodBindPtr = null
}
