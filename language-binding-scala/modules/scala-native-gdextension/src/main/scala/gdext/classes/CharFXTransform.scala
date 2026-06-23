package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CharFXTransform`, extends `RefCounted`. */
abstract class CharFXTransform extends RefCounted {

  /** CharFXTransform.get_transform */
  final def getTransform(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("CharFXTransform", "get_transform", 3761352769L), hostObject.objectPtr)

  /** CharFXTransform.set_transform */
  final def setTransform(transform: gdext.builtin.Transform2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharFXTransform", "set_transform", 2761652528L), hostObject.objectPtr, transform)

  /** CharFXTransform.get_range */
  final def getRange(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("CharFXTransform", "get_range", 2741790807L), hostObject.objectPtr)

  /** CharFXTransform.set_range */
  final def setRange(range: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharFXTransform", "set_range", 1130785943L), hostObject.objectPtr, range)

  /** CharFXTransform.get_elapsed_time */
  final def getElapsedTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("CharFXTransform", "get_elapsed_time", 191475506L), hostObject.objectPtr)

  /** CharFXTransform.set_elapsed_time */
  final def setElapsedTime(time: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharFXTransform", "set_elapsed_time", 373806689L), hostObject.objectPtr, time)

  /** CharFXTransform.is_visible */
  final def isVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CharFXTransform", "is_visible", 2240911060L), hostObject.objectPtr)

  /** CharFXTransform.set_visibility */
  final def setVisibility(visibility: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharFXTransform", "set_visibility", 2586408642L), hostObject.objectPtr, visibility)

  /** CharFXTransform.is_outline */
  final def isOutline(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CharFXTransform", "is_outline", 2240911060L), hostObject.objectPtr)

  /** CharFXTransform.set_outline */
  final def setOutline(outline: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharFXTransform", "set_outline", 2586408642L), hostObject.objectPtr, outline)

  /** CharFXTransform.get_offset */
  final def getOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("CharFXTransform", "get_offset", 1497962370L), hostObject.objectPtr)

  /** CharFXTransform.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharFXTransform", "set_offset", 743155724L), hostObject.objectPtr, offset)

  /** CharFXTransform.get_color */
  final def getColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("CharFXTransform", "get_color", 3200896285L), hostObject.objectPtr)

  /** CharFXTransform.set_color */
  final def setColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharFXTransform", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** CharFXTransform.get_glyph_index */
  final def getGlyphIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("CharFXTransform", "get_glyph_index", 3905245786L), hostObject.objectPtr)

  /** CharFXTransform.set_glyph_index */
  final def setGlyphIndex(glyph_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharFXTransform", "set_glyph_index", 1286410249L), hostObject.objectPtr, glyph_index)

  /** CharFXTransform.get_relative_index */
  final def getRelativeIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("CharFXTransform", "get_relative_index", 3905245786L), hostObject.objectPtr)

  /** CharFXTransform.set_relative_index */
  final def setRelativeIndex(relative_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharFXTransform", "set_relative_index", 1286410249L), hostObject.objectPtr, relative_index)

  /** CharFXTransform.get_glyph_count */
  final def getGlyphCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("CharFXTransform", "get_glyph_count", 3905245786L), hostObject.objectPtr)

  /** CharFXTransform.set_glyph_count */
  final def setGlyphCount(glyph_count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharFXTransform", "set_glyph_count", 1286410249L), hostObject.objectPtr, glyph_count)

  /** CharFXTransform.get_glyph_flags */
  final def getGlyphFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("CharFXTransform", "get_glyph_flags", 3905245786L), hostObject.objectPtr)

  /** CharFXTransform.set_glyph_flags */
  final def setGlyphFlags(glyph_flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CharFXTransform", "set_glyph_flags", 1286410249L), hostObject.objectPtr, glyph_flags)

}

object CharFXTransform {
  /** Class metadata for Gd[CharFXTransform] lifetime management and casting. */
  given GodotClass[CharFXTransform] with {
    def className = "CharFXTransform"
    def isRefCounted = true
    def wrap(o: GodotObject): CharFXTransform = new CharFXTransform {}.withHost(o.objectPtr)
    def unwrap(t: CharFXTransform): GodotObject = t.hostObject
  }
}
