package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Polygon2D`, extends `Node2D`. */
abstract class Polygon2D extends Node2D {

  /** Polygon2D.set_color */
  final def setColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("Polygon2D", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** Polygon2D.get_color */
  final def getColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("Polygon2D", "get_color", 3444240500L), hostObject.objectPtr)

  /** Polygon2D.set_texture */
  final def setTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Polygon2D", "set_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** Polygon2D.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Polygon2D", "get_texture", 3635182373L), hostObject.objectPtr)

  /** Polygon2D.set_texture_offset */
  final def setTextureOffset(texture_offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Polygon2D", "set_texture_offset", 743155724L), hostObject.objectPtr, texture_offset)

  /** Polygon2D.get_texture_offset */
  final def getTextureOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Polygon2D", "get_texture_offset", 3341600327L), hostObject.objectPtr)

  /** Polygon2D.set_texture_rotation */
  final def setTextureRotation(texture_rotation: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Polygon2D", "set_texture_rotation", 373806689L), hostObject.objectPtr, texture_rotation)

  /** Polygon2D.get_texture_rotation */
  final def getTextureRotation(): Double =
    Ptrcall.call0[Double](MethodBind.get("Polygon2D", "get_texture_rotation", 1740695150L), hostObject.objectPtr)

  /** Polygon2D.set_texture_scale */
  final def setTextureScale(texture_scale: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Polygon2D", "set_texture_scale", 743155724L), hostObject.objectPtr, texture_scale)

  /** Polygon2D.get_texture_scale */
  final def getTextureScale(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Polygon2D", "get_texture_scale", 3341600327L), hostObject.objectPtr)

  /** Polygon2D.set_invert_enabled */
  final def setInvertEnabled(invert: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Polygon2D", "set_invert_enabled", 2586408642L), hostObject.objectPtr, invert)

  /** Polygon2D.get_invert_enabled */
  final def getInvertEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Polygon2D", "get_invert_enabled", 36873697L), hostObject.objectPtr)

  /** Polygon2D.set_antialiased */
  final def setAntialiased(antialiased: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Polygon2D", "set_antialiased", 2586408642L), hostObject.objectPtr, antialiased)

  /** Polygon2D.get_antialiased */
  final def getAntialiased(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Polygon2D", "get_antialiased", 36873697L), hostObject.objectPtr)

  /** Polygon2D.set_invert_border */
  final def setInvertBorder(invert_border: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Polygon2D", "set_invert_border", 373806689L), hostObject.objectPtr, invert_border)

  /** Polygon2D.get_invert_border */
  final def getInvertBorder(): Double =
    Ptrcall.call0[Double](MethodBind.get("Polygon2D", "get_invert_border", 1740695150L), hostObject.objectPtr)

  /** Polygon2D.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Polygon2D", "set_offset", 743155724L), hostObject.objectPtr, offset)

  /** Polygon2D.get_offset */
  final def getOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Polygon2D", "get_offset", 3341600327L), hostObject.objectPtr)

  /** Polygon2D.get_bone_count */
  final def getBoneCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Polygon2D", "get_bone_count", 3905245786L), hostObject.objectPtr)

  /** Polygon2D.erase_bone */
  final def eraseBone(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Polygon2D", "erase_bone", 1286410249L), hostObject.objectPtr, index)

  /** Polygon2D.clear_bones */
  final def clearBones(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Polygon2D", "clear_bones", 3218959716L), hostObject.objectPtr)

  /** Polygon2D.set_internal_vertex_count */
  final def setInternalVertexCount(internal_vertex_count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Polygon2D", "set_internal_vertex_count", 1286410249L), hostObject.objectPtr, internal_vertex_count)

  /** Polygon2D.get_internal_vertex_count */
  final def getInternalVertexCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Polygon2D", "get_internal_vertex_count", 3905245786L), hostObject.objectPtr)

}

object Polygon2D {
  /** Class metadata for Gd[Polygon2D] lifetime management and casting. */
  given GodotClass[Polygon2D] with {
    def className = "Polygon2D"
    def isRefCounted = false
    def wrap(o: GodotObject): Polygon2D = new Polygon2D {}.withHost(o.objectPtr)
    def unwrap(t: Polygon2D): GodotObject = t.hostObject
  }
}
