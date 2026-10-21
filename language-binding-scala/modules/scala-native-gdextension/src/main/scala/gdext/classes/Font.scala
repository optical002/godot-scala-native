package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Font`, extends `Resource`. */
abstract class Font extends Resource {
  override def godotClassName: String = "Font"

  /** Font.get_height */
  final def getHeight(font_size: Long): Double = {
    if (gdext.classes.Font.mb_get_height == null) gdext.classes.Font.mb_get_height = MethodBind.get("Font", "get_height", 378113874L)
    Ptrcall.call1[Long, Double](gdext.classes.Font.mb_get_height, livePtr, font_size)
  }

  /** Font.get_ascent */
  final def getAscent(font_size: Long): Double = {
    if (gdext.classes.Font.mb_get_ascent == null) gdext.classes.Font.mb_get_ascent = MethodBind.get("Font", "get_ascent", 378113874L)
    Ptrcall.call1[Long, Double](gdext.classes.Font.mb_get_ascent, livePtr, font_size)
  }

  /** Font.get_descent */
  final def getDescent(font_size: Long): Double = {
    if (gdext.classes.Font.mb_get_descent == null) gdext.classes.Font.mb_get_descent = MethodBind.get("Font", "get_descent", 378113874L)
    Ptrcall.call1[Long, Double](gdext.classes.Font.mb_get_descent, livePtr, font_size)
  }

  /** Font.get_underline_position */
  final def getUnderlinePosition(font_size: Long): Double = {
    if (gdext.classes.Font.mb_get_underline_position == null) gdext.classes.Font.mb_get_underline_position = MethodBind.get("Font", "get_underline_position", 378113874L)
    Ptrcall.call1[Long, Double](gdext.classes.Font.mb_get_underline_position, livePtr, font_size)
  }

  /** Font.get_underline_thickness */
  final def getUnderlineThickness(font_size: Long): Double = {
    if (gdext.classes.Font.mb_get_underline_thickness == null) gdext.classes.Font.mb_get_underline_thickness = MethodBind.get("Font", "get_underline_thickness", 378113874L)
    Ptrcall.call1[Long, Double](gdext.classes.Font.mb_get_underline_thickness, livePtr, font_size)
  }

  /** Font.get_font_name */
  final def getFontName(): String = {
    if (gdext.classes.Font.mb_get_font_name == null) gdext.classes.Font.mb_get_font_name = MethodBind.get("Font", "get_font_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.Font.mb_get_font_name, livePtr)
  }

  /** Font.get_font_style_name */
  final def getFontStyleName(): String = {
    if (gdext.classes.Font.mb_get_font_style_name == null) gdext.classes.Font.mb_get_font_style_name = MethodBind.get("Font", "get_font_style_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.Font.mb_get_font_style_name, livePtr)
  }

  /** Font.get_font_style */
  final def getFontStyle(): Long = {
    if (gdext.classes.Font.mb_get_font_style == null) gdext.classes.Font.mb_get_font_style = MethodBind.get("Font", "get_font_style", 2520224254L)
    Ptrcall.call0[Long](gdext.classes.Font.mb_get_font_style, livePtr)
  }

  /** Font.get_font_weight */
  final def getFontWeight(): Long = {
    if (gdext.classes.Font.mb_get_font_weight == null) gdext.classes.Font.mb_get_font_weight = MethodBind.get("Font", "get_font_weight", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Font.mb_get_font_weight, livePtr)
  }

  /** Font.get_font_stretch */
  final def getFontStretch(): Long = {
    if (gdext.classes.Font.mb_get_font_stretch == null) gdext.classes.Font.mb_get_font_stretch = MethodBind.get("Font", "get_font_stretch", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Font.mb_get_font_stretch, livePtr)
  }

  /** Font.get_spacing */
  final def getSpacing(spacing: Long): Long = {
    if (gdext.classes.Font.mb_get_spacing == null) gdext.classes.Font.mb_get_spacing = MethodBind.get("Font", "get_spacing", 1310880908L)
    Ptrcall.call1[Long, Long](gdext.classes.Font.mb_get_spacing, livePtr, spacing)
  }

  /** Font.set_cache_capacity */
  final def setCacheCapacity(single_line: Long, multi_line: Long): Unit = {
    if (gdext.classes.Font.mb_set_cache_capacity == null) gdext.classes.Font.mb_set_cache_capacity = MethodBind.get("Font", "set_cache_capacity", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.Font.mb_set_cache_capacity, livePtr, single_line, multi_line)
  }

  /** Font.get_char_size */
  final def getCharSize(char: Long, font_size: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.Font.mb_get_char_size == null) gdext.classes.Font.mb_get_char_size = MethodBind.get("Font", "get_char_size", 3016396712L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector2](gdext.classes.Font.mb_get_char_size, livePtr, char, font_size)
  }

  /** Font.has_char */
  final def hasChar(char: Long): Boolean = {
    if (gdext.classes.Font.mb_has_char == null) gdext.classes.Font.mb_has_char = MethodBind.get("Font", "has_char", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Font.mb_has_char, livePtr, char)
  }

  /** Font.get_supported_chars */
  final def getSupportedChars(): String = {
    if (gdext.classes.Font.mb_get_supported_chars == null) gdext.classes.Font.mb_get_supported_chars = MethodBind.get("Font", "get_supported_chars", 201670096L)
    Ptrcall.call0[String](gdext.classes.Font.mb_get_supported_chars, livePtr)
  }

  /** Font.is_language_supported */
  final def isLanguageSupported(language: String): Boolean = {
    if (gdext.classes.Font.mb_is_language_supported == null) gdext.classes.Font.mb_is_language_supported = MethodBind.get("Font", "is_language_supported", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.Font.mb_is_language_supported, livePtr, language)
  }

  /** Font.is_script_supported */
  final def isScriptSupported(script: String): Boolean = {
    if (gdext.classes.Font.mb_is_script_supported == null) gdext.classes.Font.mb_is_script_supported = MethodBind.get("Font", "is_script_supported", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.Font.mb_is_script_supported, livePtr, script)
  }

  /** Font.get_face_count */
  final def getFaceCount(): Long = {
    if (gdext.classes.Font.mb_get_face_count == null) gdext.classes.Font.mb_get_face_count = MethodBind.get("Font", "get_face_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Font.mb_get_face_count, livePtr)
  }

}

object Font {
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ascent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_descent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_underline_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_underline_thickness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_font_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_font_style_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_font_style: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_font_weight: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_font_stretch: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_spacing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cache_capacity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_char_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_char: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_supported_chars: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_language_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_script_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_face_count: GDExtensionMethodBindPtr = null
}
