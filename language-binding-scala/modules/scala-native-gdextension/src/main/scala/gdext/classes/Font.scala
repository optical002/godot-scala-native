package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Font`, extends `Resource`. */
abstract class Font extends Resource {
  override def godotClassName: String = "Font"

  /** Font.get_height */
  final def getHeight(font_size: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Font", "get_height", 378113874L), hostObject.objectPtr, font_size)

  /** Font.get_ascent */
  final def getAscent(font_size: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Font", "get_ascent", 378113874L), hostObject.objectPtr, font_size)

  /** Font.get_descent */
  final def getDescent(font_size: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Font", "get_descent", 378113874L), hostObject.objectPtr, font_size)

  /** Font.get_underline_position */
  final def getUnderlinePosition(font_size: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Font", "get_underline_position", 378113874L), hostObject.objectPtr, font_size)

  /** Font.get_underline_thickness */
  final def getUnderlineThickness(font_size: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Font", "get_underline_thickness", 378113874L), hostObject.objectPtr, font_size)

  /** Font.get_font_name */
  final def getFontName(): String =
    Ptrcall.call0[String](MethodBind.get("Font", "get_font_name", 201670096L), hostObject.objectPtr)

  /** Font.get_font_style_name */
  final def getFontStyleName(): String =
    Ptrcall.call0[String](MethodBind.get("Font", "get_font_style_name", 201670096L), hostObject.objectPtr)

  /** Font.get_font_style */
  final def getFontStyle(): Long =
    Ptrcall.call0[Long](MethodBind.get("Font", "get_font_style", 2520224254L), hostObject.objectPtr)

  /** Font.get_font_weight */
  final def getFontWeight(): Long =
    Ptrcall.call0[Long](MethodBind.get("Font", "get_font_weight", 3905245786L), hostObject.objectPtr)

  /** Font.get_font_stretch */
  final def getFontStretch(): Long =
    Ptrcall.call0[Long](MethodBind.get("Font", "get_font_stretch", 3905245786L), hostObject.objectPtr)

  /** Font.get_spacing */
  final def getSpacing(spacing: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Font", "get_spacing", 1310880908L), hostObject.objectPtr, spacing)

  /** Font.set_cache_capacity */
  final def setCacheCapacity(single_line: Long, multi_line: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Font", "set_cache_capacity", 3937882851L), hostObject.objectPtr, single_line, multi_line)

  /** Font.get_char_size */
  final def getCharSize(char: Long, font_size: Long): gdext.builtin.Vector2 =
    Ptrcall.call2[Long, Long, gdext.builtin.Vector2](MethodBind.get("Font", "get_char_size", 3016396712L), hostObject.objectPtr, char, font_size)

  /** Font.has_char */
  final def hasChar(char: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Font", "has_char", 1116898809L), hostObject.objectPtr, char)

  /** Font.get_supported_chars */
  final def getSupportedChars(): String =
    Ptrcall.call0[String](MethodBind.get("Font", "get_supported_chars", 201670096L), hostObject.objectPtr)

  /** Font.is_language_supported */
  final def isLanguageSupported(language: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("Font", "is_language_supported", 3927539163L), hostObject.objectPtr, language)

  /** Font.is_script_supported */
  final def isScriptSupported(script: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("Font", "is_script_supported", 3927539163L), hostObject.objectPtr, script)

  /** Font.get_face_count */
  final def getFaceCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Font", "get_face_count", 3905245786L), hostObject.objectPtr)

}
