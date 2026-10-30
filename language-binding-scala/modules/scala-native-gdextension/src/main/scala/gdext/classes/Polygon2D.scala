package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Polygon2D`, extends `Node2D`. */
abstract class Polygon2D extends Node2D {
  override def godotClassName: String = "Polygon2D"

  /** Polygon2D.set_color */
  final def setColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Polygon2D.mb_set_color == null) gdext.classes.Polygon2D.mb_set_color = MethodBind.get("Polygon2D", "set_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.Polygon2D.mb_set_color, livePtr, color)
  }

  /** Polygon2D.get_color */
  final def getColor(): gdext.builtin.Color = {
    if (gdext.classes.Polygon2D.mb_get_color == null) gdext.classes.Polygon2D.mb_get_color = MethodBind.get("Polygon2D", "get_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.Polygon2D.mb_get_color, livePtr)
  }

  /** Polygon2D.set_texture */
  final def setTexture(texture: Texture2D): Unit = {
    if (gdext.classes.Polygon2D.mb_set_texture == null) gdext.classes.Polygon2D.mb_set_texture = MethodBind.get("Polygon2D", "set_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.Polygon2D.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** Polygon2D.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture2D = {
    if (gdext.classes.Polygon2D.mb_get_texture == null) gdext.classes.Polygon2D.mb_get_texture = MethodBind.get("Polygon2D", "get_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.Polygon2D.mb_get_texture, livePtr))
  }

  /** Polygon2D.set_texture_offset */
  final def setTextureOffset(textureOffset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Polygon2D.mb_set_texture_offset == null) gdext.classes.Polygon2D.mb_set_texture_offset = MethodBind.get("Polygon2D", "set_texture_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Polygon2D.mb_set_texture_offset, livePtr, textureOffset)
  }

  /** Polygon2D.get_texture_offset */
  final def getTextureOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.Polygon2D.mb_get_texture_offset == null) gdext.classes.Polygon2D.mb_get_texture_offset = MethodBind.get("Polygon2D", "get_texture_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Polygon2D.mb_get_texture_offset, livePtr)
  }

  /** Polygon2D.set_texture_rotation */
  final def setTextureRotation(textureRotation: Double): Unit = {
    if (gdext.classes.Polygon2D.mb_set_texture_rotation == null) gdext.classes.Polygon2D.mb_set_texture_rotation = MethodBind.get("Polygon2D", "set_texture_rotation", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Polygon2D.mb_set_texture_rotation, livePtr, textureRotation)
  }

  /** Polygon2D.get_texture_rotation */
  final def getTextureRotation(): Double = {
    if (gdext.classes.Polygon2D.mb_get_texture_rotation == null) gdext.classes.Polygon2D.mb_get_texture_rotation = MethodBind.get("Polygon2D", "get_texture_rotation", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Polygon2D.mb_get_texture_rotation, livePtr)
  }

  /** Polygon2D.set_texture_scale */
  final def setTextureScale(textureScale: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Polygon2D.mb_set_texture_scale == null) gdext.classes.Polygon2D.mb_set_texture_scale = MethodBind.get("Polygon2D", "set_texture_scale", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Polygon2D.mb_set_texture_scale, livePtr, textureScale)
  }

  /** Polygon2D.get_texture_scale */
  final def getTextureScale(): gdext.builtin.Vector2 = {
    if (gdext.classes.Polygon2D.mb_get_texture_scale == null) gdext.classes.Polygon2D.mb_get_texture_scale = MethodBind.get("Polygon2D", "get_texture_scale", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Polygon2D.mb_get_texture_scale, livePtr)
  }

  /** Polygon2D.set_invert_enabled */
  final def setInvertEnabled(invert: Boolean): Unit = {
    if (gdext.classes.Polygon2D.mb_set_invert_enabled == null) gdext.classes.Polygon2D.mb_set_invert_enabled = MethodBind.get("Polygon2D", "set_invert_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Polygon2D.mb_set_invert_enabled, livePtr, invert)
  }

  /** Polygon2D.get_invert_enabled */
  final def getInvertEnabled(): Boolean = {
    if (gdext.classes.Polygon2D.mb_get_invert_enabled == null) gdext.classes.Polygon2D.mb_get_invert_enabled = MethodBind.get("Polygon2D", "get_invert_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Polygon2D.mb_get_invert_enabled, livePtr)
  }

  /** Polygon2D.set_antialiased */
  final def setAntialiased(antialiased: Boolean): Unit = {
    if (gdext.classes.Polygon2D.mb_set_antialiased == null) gdext.classes.Polygon2D.mb_set_antialiased = MethodBind.get("Polygon2D", "set_antialiased", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Polygon2D.mb_set_antialiased, livePtr, antialiased)
  }

  /** Polygon2D.get_antialiased */
  final def getAntialiased(): Boolean = {
    if (gdext.classes.Polygon2D.mb_get_antialiased == null) gdext.classes.Polygon2D.mb_get_antialiased = MethodBind.get("Polygon2D", "get_antialiased", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Polygon2D.mb_get_antialiased, livePtr)
  }

  /** Polygon2D.set_invert_border */
  final def setInvertBorder(invertBorder: Double): Unit = {
    if (gdext.classes.Polygon2D.mb_set_invert_border == null) gdext.classes.Polygon2D.mb_set_invert_border = MethodBind.get("Polygon2D", "set_invert_border", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Polygon2D.mb_set_invert_border, livePtr, invertBorder)
  }

  /** Polygon2D.get_invert_border */
  final def getInvertBorder(): Double = {
    if (gdext.classes.Polygon2D.mb_get_invert_border == null) gdext.classes.Polygon2D.mb_get_invert_border = MethodBind.get("Polygon2D", "get_invert_border", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Polygon2D.mb_get_invert_border, livePtr)
  }

  /** Polygon2D.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Polygon2D.mb_set_offset == null) gdext.classes.Polygon2D.mb_set_offset = MethodBind.get("Polygon2D", "set_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Polygon2D.mb_set_offset, livePtr, offset)
  }

  /** Polygon2D.get_offset */
  final def getOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.Polygon2D.mb_get_offset == null) gdext.classes.Polygon2D.mb_get_offset = MethodBind.get("Polygon2D", "get_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Polygon2D.mb_get_offset, livePtr)
  }

  /** Polygon2D.get_bone_count */
  final def getBoneCount(): Long = {
    if (gdext.classes.Polygon2D.mb_get_bone_count == null) gdext.classes.Polygon2D.mb_get_bone_count = MethodBind.get("Polygon2D", "get_bone_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Polygon2D.mb_get_bone_count, livePtr)
  }

  /** Polygon2D.erase_bone */
  final def eraseBone(index: Long): Unit = {
    if (gdext.classes.Polygon2D.mb_erase_bone == null) gdext.classes.Polygon2D.mb_erase_bone = MethodBind.get("Polygon2D", "erase_bone", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Polygon2D.mb_erase_bone, livePtr, index)
  }

  /** Polygon2D.clear_bones */
  final def clearBones(): Unit = {
    if (gdext.classes.Polygon2D.mb_clear_bones == null) gdext.classes.Polygon2D.mb_clear_bones = MethodBind.get("Polygon2D", "clear_bones", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Polygon2D.mb_clear_bones, livePtr)
  }

  /** Polygon2D.set_internal_vertex_count */
  final def setInternalVertexCount(internalVertexCount: Long): Unit = {
    if (gdext.classes.Polygon2D.mb_set_internal_vertex_count == null) gdext.classes.Polygon2D.mb_set_internal_vertex_count = MethodBind.get("Polygon2D", "set_internal_vertex_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Polygon2D.mb_set_internal_vertex_count, livePtr, internalVertexCount)
  }

  /** Polygon2D.get_internal_vertex_count */
  final def getInternalVertexCount(): Long = {
    if (gdext.classes.Polygon2D.mb_get_internal_vertex_count == null) gdext.classes.Polygon2D.mb_get_internal_vertex_count = MethodBind.get("Polygon2D", "get_internal_vertex_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Polygon2D.mb_get_internal_vertex_count, livePtr)
  }

}

object Polygon2D {
  private[classes] var mb_set_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_invert_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_invert_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_antialiased: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_antialiased: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_invert_border: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_invert_border: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_erase_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_bones: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_internal_vertex_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_internal_vertex_count: GDExtensionMethodBindPtr = null
}
