package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CharFXTransform`, extends `RefCounted`. */
abstract class CharFXTransform extends RefCounted {
  override def godotClassName: String = "CharFXTransform"

  /** CharFXTransform.get_transform */
  final def getTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.CharFXTransform.mb_get_transform == null) gdext.classes.CharFXTransform.mb_get_transform = MethodBind.get("CharFXTransform", "get_transform", 3761352769L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.CharFXTransform.mb_get_transform, livePtr)
  }

  /** CharFXTransform.set_transform */
  final def setTransform(transform: gdext.builtin.Transform2D): Unit = {
    if (gdext.classes.CharFXTransform.mb_set_transform == null) gdext.classes.CharFXTransform.mb_set_transform = MethodBind.get("CharFXTransform", "set_transform", 2761652528L)
    Ptrcall.callVoid1(gdext.classes.CharFXTransform.mb_set_transform, livePtr, transform)
  }

  /** CharFXTransform.get_range */
  final def getRange(): gdext.builtin.Vector2i = {
    if (gdext.classes.CharFXTransform.mb_get_range == null) gdext.classes.CharFXTransform.mb_get_range = MethodBind.get("CharFXTransform", "get_range", 2741790807L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.CharFXTransform.mb_get_range, livePtr)
  }

  /** CharFXTransform.set_range */
  final def setRange(range: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.CharFXTransform.mb_set_range == null) gdext.classes.CharFXTransform.mb_set_range = MethodBind.get("CharFXTransform", "set_range", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.CharFXTransform.mb_set_range, livePtr, range)
  }

  /** CharFXTransform.get_elapsed_time */
  final def getElapsedTime(): Double = {
    if (gdext.classes.CharFXTransform.mb_get_elapsed_time == null) gdext.classes.CharFXTransform.mb_get_elapsed_time = MethodBind.get("CharFXTransform", "get_elapsed_time", 191475506L)
    Ptrcall.call0[Double](gdext.classes.CharFXTransform.mb_get_elapsed_time, livePtr)
  }

  /** CharFXTransform.set_elapsed_time */
  final def setElapsedTime(time: Double): Unit = {
    if (gdext.classes.CharFXTransform.mb_set_elapsed_time == null) gdext.classes.CharFXTransform.mb_set_elapsed_time = MethodBind.get("CharFXTransform", "set_elapsed_time", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CharFXTransform.mb_set_elapsed_time, livePtr, time)
  }

  /** CharFXTransform.is_visible */
  final def isVisible(): Boolean = {
    if (gdext.classes.CharFXTransform.mb_is_visible == null) gdext.classes.CharFXTransform.mb_is_visible = MethodBind.get("CharFXTransform", "is_visible", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.CharFXTransform.mb_is_visible, livePtr)
  }

  /** CharFXTransform.set_visibility */
  final def setVisibility(visibility: Boolean): Unit = {
    if (gdext.classes.CharFXTransform.mb_set_visibility == null) gdext.classes.CharFXTransform.mb_set_visibility = MethodBind.get("CharFXTransform", "set_visibility", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CharFXTransform.mb_set_visibility, livePtr, visibility)
  }

  /** CharFXTransform.is_outline */
  final def isOutline(): Boolean = {
    if (gdext.classes.CharFXTransform.mb_is_outline == null) gdext.classes.CharFXTransform.mb_is_outline = MethodBind.get("CharFXTransform", "is_outline", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.CharFXTransform.mb_is_outline, livePtr)
  }

  /** CharFXTransform.set_outline */
  final def setOutline(outline: Boolean): Unit = {
    if (gdext.classes.CharFXTransform.mb_set_outline == null) gdext.classes.CharFXTransform.mb_set_outline = MethodBind.get("CharFXTransform", "set_outline", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CharFXTransform.mb_set_outline, livePtr, outline)
  }

  /** CharFXTransform.get_offset */
  final def getOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.CharFXTransform.mb_get_offset == null) gdext.classes.CharFXTransform.mb_get_offset = MethodBind.get("CharFXTransform", "get_offset", 1497962370L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.CharFXTransform.mb_get_offset, livePtr)
  }

  /** CharFXTransform.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.CharFXTransform.mb_set_offset == null) gdext.classes.CharFXTransform.mb_set_offset = MethodBind.get("CharFXTransform", "set_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.CharFXTransform.mb_set_offset, livePtr, offset)
  }

  /** CharFXTransform.get_color */
  final def getColor(): gdext.builtin.Color = {
    if (gdext.classes.CharFXTransform.mb_get_color == null) gdext.classes.CharFXTransform.mb_get_color = MethodBind.get("CharFXTransform", "get_color", 3200896285L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.CharFXTransform.mb_get_color, livePtr)
  }

  /** CharFXTransform.set_color */
  final def setColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.CharFXTransform.mb_set_color == null) gdext.classes.CharFXTransform.mb_set_color = MethodBind.get("CharFXTransform", "set_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.CharFXTransform.mb_set_color, livePtr, color)
  }

  /** CharFXTransform.get_glyph_index */
  final def getGlyphIndex(): Long = {
    if (gdext.classes.CharFXTransform.mb_get_glyph_index == null) gdext.classes.CharFXTransform.mb_get_glyph_index = MethodBind.get("CharFXTransform", "get_glyph_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CharFXTransform.mb_get_glyph_index, livePtr)
  }

  /** CharFXTransform.set_glyph_index */
  final def setGlyphIndex(glyphIndex: Long): Unit = {
    if (gdext.classes.CharFXTransform.mb_set_glyph_index == null) gdext.classes.CharFXTransform.mb_set_glyph_index = MethodBind.get("CharFXTransform", "set_glyph_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CharFXTransform.mb_set_glyph_index, livePtr, glyphIndex)
  }

  /** CharFXTransform.get_relative_index */
  final def getRelativeIndex(): Long = {
    if (gdext.classes.CharFXTransform.mb_get_relative_index == null) gdext.classes.CharFXTransform.mb_get_relative_index = MethodBind.get("CharFXTransform", "get_relative_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CharFXTransform.mb_get_relative_index, livePtr)
  }

  /** CharFXTransform.set_relative_index */
  final def setRelativeIndex(relativeIndex: Long): Unit = {
    if (gdext.classes.CharFXTransform.mb_set_relative_index == null) gdext.classes.CharFXTransform.mb_set_relative_index = MethodBind.get("CharFXTransform", "set_relative_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CharFXTransform.mb_set_relative_index, livePtr, relativeIndex)
  }

  /** CharFXTransform.get_glyph_count */
  final def getGlyphCount(): Long = {
    if (gdext.classes.CharFXTransform.mb_get_glyph_count == null) gdext.classes.CharFXTransform.mb_get_glyph_count = MethodBind.get("CharFXTransform", "get_glyph_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CharFXTransform.mb_get_glyph_count, livePtr)
  }

  /** CharFXTransform.set_glyph_count */
  final def setGlyphCount(glyphCount: Long): Unit = {
    if (gdext.classes.CharFXTransform.mb_set_glyph_count == null) gdext.classes.CharFXTransform.mb_set_glyph_count = MethodBind.get("CharFXTransform", "set_glyph_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CharFXTransform.mb_set_glyph_count, livePtr, glyphCount)
  }

  /** CharFXTransform.get_glyph_flags */
  final def getGlyphFlags(): Long = {
    if (gdext.classes.CharFXTransform.mb_get_glyph_flags == null) gdext.classes.CharFXTransform.mb_get_glyph_flags = MethodBind.get("CharFXTransform", "get_glyph_flags", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CharFXTransform.mb_get_glyph_flags, livePtr)
  }

  /** CharFXTransform.set_glyph_flags */
  final def setGlyphFlags(glyphFlags: Long): Unit = {
    if (gdext.classes.CharFXTransform.mb_set_glyph_flags == null) gdext.classes.CharFXTransform.mb_set_glyph_flags = MethodBind.get("CharFXTransform", "set_glyph_flags", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CharFXTransform.mb_set_glyph_flags, livePtr, glyphFlags)
  }

}

object CharFXTransform {
  private[classes] var mb_get_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_elapsed_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_elapsed_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_outline: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_outline: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glyph_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glyph_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_relative_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_relative_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glyph_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glyph_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glyph_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glyph_flags: GDExtensionMethodBindPtr = null
}
