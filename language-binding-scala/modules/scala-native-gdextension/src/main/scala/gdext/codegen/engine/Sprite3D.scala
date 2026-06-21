package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Sprite3D`, extends `SpriteBase3D`. */
abstract class Sprite3D extends SpriteBase3D {

  /** Sprite3D.set_texture */
  final def setTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite3D", "set_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** Sprite3D.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Sprite3D", "get_texture", 3635182373L), hostObject.objectPtr)

  /** Sprite3D.set_region_enabled */
  final def setRegionEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite3D", "set_region_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Sprite3D.is_region_enabled */
  final def isRegionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Sprite3D", "is_region_enabled", 36873697L), hostObject.objectPtr)

  /** Sprite3D.set_region_rect */
  final def setRegionRect(rect: gdext.builtin.Rect2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite3D", "set_region_rect", 2046264180L), hostObject.objectPtr, rect)

  /** Sprite3D.get_region_rect */
  final def getRegionRect(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("Sprite3D", "get_region_rect", 1639390495L), hostObject.objectPtr)

  /** Sprite3D.set_frame */
  final def setFrame(frame: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite3D", "set_frame", 1286410249L), hostObject.objectPtr, frame)

  /** Sprite3D.get_frame */
  final def getFrame(): Long =
    Ptrcall.call0[Long](MethodBind.get("Sprite3D", "get_frame", 3905245786L), hostObject.objectPtr)

  /** Sprite3D.set_frame_coords */
  final def setFrameCoords(coords: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite3D", "set_frame_coords", 1130785943L), hostObject.objectPtr, coords)

  /** Sprite3D.get_frame_coords */
  final def getFrameCoords(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("Sprite3D", "get_frame_coords", 3690982128L), hostObject.objectPtr)

  /** Sprite3D.set_vframes */
  final def setVframes(vframes: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite3D", "set_vframes", 1286410249L), hostObject.objectPtr, vframes)

  /** Sprite3D.get_vframes */
  final def getVframes(): Long =
    Ptrcall.call0[Long](MethodBind.get("Sprite3D", "get_vframes", 3905245786L), hostObject.objectPtr)

  /** Sprite3D.set_hframes */
  final def setHframes(hframes: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sprite3D", "set_hframes", 1286410249L), hostObject.objectPtr, hframes)

  /** Sprite3D.get_hframes */
  final def getHframes(): Long =
    Ptrcall.call0[Long](MethodBind.get("Sprite3D", "get_hframes", 3905245786L), hostObject.objectPtr)

}

object Sprite3D {
  /** Class metadata for Gd[Sprite3D] lifetime management and casting. */
  given GodotClass[Sprite3D] with {
    def className = "Sprite3D"
    def isRefCounted = false
    def wrap(o: GodotObject): Sprite3D = new Sprite3D {}.withHost(o.objectPtr)
    def unwrap(t: Sprite3D): GodotObject = t.hostObject
  }
}
