package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TextServer`, extends `RefCounted`. */
abstract class TextServer extends RefCounted {
  override def godotClassName: String = "TextServer"

  /** TextServer.has_feature */
  final def hasFeature(feature: Long): Boolean = {
    if (gdext.classes.TextServer.mb_has_feature == null) gdext.classes.TextServer.mb_has_feature = MethodBind.get("TextServer", "has_feature", 3967367083L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TextServer.mb_has_feature, livePtr, feature)
  }

  /** TextServer.get_name */
  final def getName(): String = {
    if (gdext.classes.TextServer.mb_get_name == null) gdext.classes.TextServer.mb_get_name = MethodBind.get("TextServer", "get_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.TextServer.mb_get_name, livePtr)
  }

  /** TextServer.get_features */
  final def getFeatures(): Long = {
    if (gdext.classes.TextServer.mb_get_features == null) gdext.classes.TextServer.mb_get_features = MethodBind.get("TextServer", "get_features", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextServer.mb_get_features, livePtr)
  }

  /** TextServer.load_support_data */
  final def loadSupportData(filename: String): Boolean = {
    if (gdext.classes.TextServer.mb_load_support_data == null) gdext.classes.TextServer.mb_load_support_data = MethodBind.get("TextServer", "load_support_data", 2323990056L)
    Ptrcall.call1[String, Boolean](gdext.classes.TextServer.mb_load_support_data, livePtr, filename)
  }

  /** TextServer.get_support_data_filename */
  final def getSupportDataFilename(): String = {
    if (gdext.classes.TextServer.mb_get_support_data_filename == null) gdext.classes.TextServer.mb_get_support_data_filename = MethodBind.get("TextServer", "get_support_data_filename", 201670096L)
    Ptrcall.call0[String](gdext.classes.TextServer.mb_get_support_data_filename, livePtr)
  }

  /** TextServer.get_support_data_info */
  final def getSupportDataInfo(): String = {
    if (gdext.classes.TextServer.mb_get_support_data_info == null) gdext.classes.TextServer.mb_get_support_data_info = MethodBind.get("TextServer", "get_support_data_info", 201670096L)
    Ptrcall.call0[String](gdext.classes.TextServer.mb_get_support_data_info, livePtr)
  }

  /** TextServer.save_support_data */
  final def saveSupportData(filename: String): Boolean = {
    if (gdext.classes.TextServer.mb_save_support_data == null) gdext.classes.TextServer.mb_save_support_data = MethodBind.get("TextServer", "save_support_data", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.TextServer.mb_save_support_data, livePtr, filename)
  }

  /** TextServer.is_locale_using_support_data */
  final def isLocaleUsingSupportData(locale: String): Boolean = {
    if (gdext.classes.TextServer.mb_is_locale_using_support_data == null) gdext.classes.TextServer.mb_is_locale_using_support_data = MethodBind.get("TextServer", "is_locale_using_support_data", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.TextServer.mb_is_locale_using_support_data, livePtr, locale)
  }

  /** TextServer.is_locale_right_to_left */
  final def isLocaleRightToLeft(locale: String): Boolean = {
    if (gdext.classes.TextServer.mb_is_locale_right_to_left == null) gdext.classes.TextServer.mb_is_locale_right_to_left = MethodBind.get("TextServer", "is_locale_right_to_left", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.TextServer.mb_is_locale_right_to_left, livePtr, locale)
  }

  /** TextServer.name_to_tag */
  final def nameToTag(name: String): Long = {
    if (gdext.classes.TextServer.mb_name_to_tag == null) gdext.classes.TextServer.mb_name_to_tag = MethodBind.get("TextServer", "name_to_tag", 1321353865L)
    Ptrcall.call1[String, Long](gdext.classes.TextServer.mb_name_to_tag, livePtr, name)
  }

  /** TextServer.tag_to_name */
  final def tagToName(tag: Long): String = {
    if (gdext.classes.TextServer.mb_tag_to_name == null) gdext.classes.TextServer.mb_tag_to_name = MethodBind.get("TextServer", "tag_to_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TextServer.mb_tag_to_name, livePtr, tag)
  }

  /** TextServer.font_clear_system_fallback_cache */
  final def fontClearSystemFallbackCache(): Unit = {
    if (gdext.classes.TextServer.mb_font_clear_system_fallback_cache == null) gdext.classes.TextServer.mb_font_clear_system_fallback_cache = MethodBind.get("TextServer", "font_clear_system_fallback_cache", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextServer.mb_font_clear_system_fallback_cache, livePtr)
  }

  /** TextServer.font_get_global_oversampling */
  final def fontGetGlobalOversampling(): Double = {
    if (gdext.classes.TextServer.mb_font_get_global_oversampling == null) gdext.classes.TextServer.mb_font_get_global_oversampling = MethodBind.get("TextServer", "font_get_global_oversampling", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextServer.mb_font_get_global_oversampling, livePtr)
  }

  /** TextServer.font_set_global_oversampling */
  final def fontSetGlobalOversampling(oversampling: Double): Unit = {
    if (gdext.classes.TextServer.mb_font_set_global_oversampling == null) gdext.classes.TextServer.mb_font_set_global_oversampling = MethodBind.get("TextServer", "font_set_global_oversampling", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TextServer.mb_font_set_global_oversampling, livePtr, oversampling)
  }

  /** TextServer.get_hex_code_box_size */
  final def getHexCodeBoxSize(size: Long, index: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.TextServer.mb_get_hex_code_box_size == null) gdext.classes.TextServer.mb_get_hex_code_box_size = MethodBind.get("TextServer", "get_hex_code_box_size", 3016396712L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector2](gdext.classes.TextServer.mb_get_hex_code_box_size, livePtr, size, index)
  }

  /** TextServer.format_number */
  final def formatNumber(number: String, language: String): String = {
    if (gdext.classes.TextServer.mb_format_number == null) gdext.classes.TextServer.mb_format_number = MethodBind.get("TextServer", "format_number", 2664628024L)
    Ptrcall.call2[String, String, String](gdext.classes.TextServer.mb_format_number, livePtr, number, language)
  }

  /** TextServer.parse_number */
  final def parseNumber(number: String, language: String): String = {
    if (gdext.classes.TextServer.mb_parse_number == null) gdext.classes.TextServer.mb_parse_number = MethodBind.get("TextServer", "parse_number", 2664628024L)
    Ptrcall.call2[String, String, String](gdext.classes.TextServer.mb_parse_number, livePtr, number, language)
  }

  /** TextServer.percent_sign */
  final def percentSign(language: String): String = {
    if (gdext.classes.TextServer.mb_percent_sign == null) gdext.classes.TextServer.mb_percent_sign = MethodBind.get("TextServer", "percent_sign", 993269549L)
    Ptrcall.call1[String, String](gdext.classes.TextServer.mb_percent_sign, livePtr, language)
  }

  /** TextServer.spoof_check */
  final def spoofCheck(string: String): Boolean = {
    if (gdext.classes.TextServer.mb_spoof_check == null) gdext.classes.TextServer.mb_spoof_check = MethodBind.get("TextServer", "spoof_check", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.TextServer.mb_spoof_check, livePtr, string)
  }

  /** TextServer.strip_diacritics */
  final def stripDiacritics(string: String): String = {
    if (gdext.classes.TextServer.mb_strip_diacritics == null) gdext.classes.TextServer.mb_strip_diacritics = MethodBind.get("TextServer", "strip_diacritics", 3135753539L)
    Ptrcall.call1[String, String](gdext.classes.TextServer.mb_strip_diacritics, livePtr, string)
  }

  /** TextServer.is_valid_identifier */
  final def isValidIdentifier(string: String): Boolean = {
    if (gdext.classes.TextServer.mb_is_valid_identifier == null) gdext.classes.TextServer.mb_is_valid_identifier = MethodBind.get("TextServer", "is_valid_identifier", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.TextServer.mb_is_valid_identifier, livePtr, string)
  }

  /** TextServer.is_valid_letter */
  final def isValidLetter(unicode: Long): Boolean = {
    if (gdext.classes.TextServer.mb_is_valid_letter == null) gdext.classes.TextServer.mb_is_valid_letter = MethodBind.get("TextServer", "is_valid_letter", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TextServer.mb_is_valid_letter, livePtr, unicode)
  }

  /** TextServer.string_to_upper */
  final def stringToUpper(string: String, language: String): String = {
    if (gdext.classes.TextServer.mb_string_to_upper == null) gdext.classes.TextServer.mb_string_to_upper = MethodBind.get("TextServer", "string_to_upper", 2664628024L)
    Ptrcall.call2[String, String, String](gdext.classes.TextServer.mb_string_to_upper, livePtr, string, language)
  }

  /** TextServer.string_to_lower */
  final def stringToLower(string: String, language: String): String = {
    if (gdext.classes.TextServer.mb_string_to_lower == null) gdext.classes.TextServer.mb_string_to_lower = MethodBind.get("TextServer", "string_to_lower", 2664628024L)
    Ptrcall.call2[String, String, String](gdext.classes.TextServer.mb_string_to_lower, livePtr, string, language)
  }

  /** TextServer.string_to_title */
  final def stringToTitle(string: String, language: String): String = {
    if (gdext.classes.TextServer.mb_string_to_title == null) gdext.classes.TextServer.mb_string_to_title = MethodBind.get("TextServer", "string_to_title", 2664628024L)
    Ptrcall.call2[String, String, String](gdext.classes.TextServer.mb_string_to_title, livePtr, string, language)
  }

}

object TextServer {
  private[classes] var mb_has_feature: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_features: GDExtensionMethodBindPtr = null
  private[classes] var mb_load_support_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_support_data_filename: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_support_data_info: GDExtensionMethodBindPtr = null
  private[classes] var mb_save_support_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_locale_using_support_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_locale_right_to_left: GDExtensionMethodBindPtr = null
  private[classes] var mb_name_to_tag: GDExtensionMethodBindPtr = null
  private[classes] var mb_tag_to_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_font_clear_system_fallback_cache: GDExtensionMethodBindPtr = null
  private[classes] var mb_font_get_global_oversampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_font_set_global_oversampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hex_code_box_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_format_number: GDExtensionMethodBindPtr = null
  private[classes] var mb_parse_number: GDExtensionMethodBindPtr = null
  private[classes] var mb_percent_sign: GDExtensionMethodBindPtr = null
  private[classes] var mb_spoof_check: GDExtensionMethodBindPtr = null
  private[classes] var mb_strip_diacritics: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_valid_identifier: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_valid_letter: GDExtensionMethodBindPtr = null
  private[classes] var mb_string_to_upper: GDExtensionMethodBindPtr = null
  private[classes] var mb_string_to_lower: GDExtensionMethodBindPtr = null
  private[classes] var mb_string_to_title: GDExtensionMethodBindPtr = null
}
