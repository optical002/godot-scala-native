package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TextServer`, extends `RefCounted`. */
abstract class TextServer extends RefCounted {

  /** TextServer.has_feature */
  final def hasFeature(feature: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TextServer", "has_feature", 3967367083L), hostObject.objectPtr, feature)

  /** TextServer.get_name */
  final def getName(): String =
    Ptrcall.call0[String](MethodBind.get("TextServer", "get_name", 201670096L), hostObject.objectPtr)

  /** TextServer.get_features */
  final def getFeatures(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextServer", "get_features", 3905245786L), hostObject.objectPtr)

  /** TextServer.load_support_data */
  final def loadSupportData(filename: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("TextServer", "load_support_data", 2323990056L), hostObject.objectPtr, filename)

  /** TextServer.get_support_data_filename */
  final def getSupportDataFilename(): String =
    Ptrcall.call0[String](MethodBind.get("TextServer", "get_support_data_filename", 201670096L), hostObject.objectPtr)

  /** TextServer.get_support_data_info */
  final def getSupportDataInfo(): String =
    Ptrcall.call0[String](MethodBind.get("TextServer", "get_support_data_info", 201670096L), hostObject.objectPtr)

  /** TextServer.save_support_data */
  final def saveSupportData(filename: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("TextServer", "save_support_data", 3927539163L), hostObject.objectPtr, filename)

  /** TextServer.is_locale_using_support_data */
  final def isLocaleUsingSupportData(locale: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("TextServer", "is_locale_using_support_data", 3927539163L), hostObject.objectPtr, locale)

  /** TextServer.is_locale_right_to_left */
  final def isLocaleRightToLeft(locale: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("TextServer", "is_locale_right_to_left", 3927539163L), hostObject.objectPtr, locale)

  /** TextServer.name_to_tag */
  final def nameToTag(name: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("TextServer", "name_to_tag", 1321353865L), hostObject.objectPtr, name)

  /** TextServer.tag_to_name */
  final def tagToName(tag: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TextServer", "tag_to_name", 844755477L), hostObject.objectPtr, tag)

  /** TextServer.font_clear_system_fallback_cache */
  final def fontClearSystemFallbackCache(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextServer", "font_clear_system_fallback_cache", 3218959716L), hostObject.objectPtr)

  /** TextServer.font_get_global_oversampling */
  final def fontGetGlobalOversampling(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextServer", "font_get_global_oversampling", 1740695150L), hostObject.objectPtr)

  /** TextServer.font_set_global_oversampling */
  final def fontSetGlobalOversampling(oversampling: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextServer", "font_set_global_oversampling", 373806689L), hostObject.objectPtr, oversampling)

  /** TextServer.get_hex_code_box_size */
  final def getHexCodeBoxSize(size: Long, index: Long): gdext.builtin.Vector2 =
    Ptrcall.call2[Long, Long, gdext.builtin.Vector2](MethodBind.get("TextServer", "get_hex_code_box_size", 3016396712L), hostObject.objectPtr, size, index)

  /** TextServer.format_number */
  final def formatNumber(number: String, language: String): String =
    Ptrcall.call2[String, String, String](MethodBind.get("TextServer", "format_number", 2664628024L), hostObject.objectPtr, number, language)

  /** TextServer.parse_number */
  final def parseNumber(number: String, language: String): String =
    Ptrcall.call2[String, String, String](MethodBind.get("TextServer", "parse_number", 2664628024L), hostObject.objectPtr, number, language)

  /** TextServer.percent_sign */
  final def percentSign(language: String): String =
    Ptrcall.call1[String, String](MethodBind.get("TextServer", "percent_sign", 993269549L), hostObject.objectPtr, language)

  /** TextServer.spoof_check */
  final def spoofCheck(string: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("TextServer", "spoof_check", 3927539163L), hostObject.objectPtr, string)

  /** TextServer.strip_diacritics */
  final def stripDiacritics(string: String): String =
    Ptrcall.call1[String, String](MethodBind.get("TextServer", "strip_diacritics", 3135753539L), hostObject.objectPtr, string)

  /** TextServer.is_valid_identifier */
  final def isValidIdentifier(string: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("TextServer", "is_valid_identifier", 3927539163L), hostObject.objectPtr, string)

  /** TextServer.is_valid_letter */
  final def isValidLetter(unicode: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TextServer", "is_valid_letter", 1116898809L), hostObject.objectPtr, unicode)

  /** TextServer.string_to_upper */
  final def stringToUpper(string: String, language: String): String =
    Ptrcall.call2[String, String, String](MethodBind.get("TextServer", "string_to_upper", 2664628024L), hostObject.objectPtr, string, language)

  /** TextServer.string_to_lower */
  final def stringToLower(string: String, language: String): String =
    Ptrcall.call2[String, String, String](MethodBind.get("TextServer", "string_to_lower", 2664628024L), hostObject.objectPtr, string, language)

  /** TextServer.string_to_title */
  final def stringToTitle(string: String, language: String): String =
    Ptrcall.call2[String, String, String](MethodBind.get("TextServer", "string_to_title", 2664628024L), hostObject.objectPtr, string, language)

}

object TextServer {
  /** Class metadata for Gd[TextServer] lifetime management and casting. */
  given GodotClass[TextServer] with {
    def className = "TextServer"
    def isRefCounted = true
    def wrap(o: GodotObject): TextServer = new TextServer {}.withHost(o.objectPtr)
    def unwrap(t: TextServer): GodotObject = t.hostObject
  }
}
