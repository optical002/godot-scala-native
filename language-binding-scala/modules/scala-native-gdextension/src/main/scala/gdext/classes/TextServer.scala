package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TextServer`, extends `RefCounted`. */
abstract class TextServer extends RefCounted {
  override def godotClassName: String = "TextServer"

  /** TextServer.has_feature */
  final def hasFeature(feature: gdext.classes.TextServer.Feature): Boolean = {
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
  final def formatNumber(number: String, language: String = ""): String = {
    if (gdext.classes.TextServer.mb_format_number == null) gdext.classes.TextServer.mb_format_number = MethodBind.get("TextServer", "format_number", 2664628024L)
    Ptrcall.call2[String, String, String](gdext.classes.TextServer.mb_format_number, livePtr, number, language)
  }

  /** TextServer.parse_number */
  final def parseNumber(number: String, language: String = ""): String = {
    if (gdext.classes.TextServer.mb_parse_number == null) gdext.classes.TextServer.mb_parse_number = MethodBind.get("TextServer", "parse_number", 2664628024L)
    Ptrcall.call2[String, String, String](gdext.classes.TextServer.mb_parse_number, livePtr, number, language)
  }

  /** TextServer.percent_sign */
  final def percentSign(language: String = ""): String = {
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
  final def stringToUpper(string: String, language: String = ""): String = {
    if (gdext.classes.TextServer.mb_string_to_upper == null) gdext.classes.TextServer.mb_string_to_upper = MethodBind.get("TextServer", "string_to_upper", 2664628024L)
    Ptrcall.call2[String, String, String](gdext.classes.TextServer.mb_string_to_upper, livePtr, string, language)
  }

  /** TextServer.string_to_lower */
  final def stringToLower(string: String, language: String = ""): String = {
    if (gdext.classes.TextServer.mb_string_to_lower == null) gdext.classes.TextServer.mb_string_to_lower = MethodBind.get("TextServer", "string_to_lower", 2664628024L)
    Ptrcall.call2[String, String, String](gdext.classes.TextServer.mb_string_to_lower, livePtr, string, language)
  }

  /** TextServer.string_to_title */
  final def stringToTitle(string: String, language: String = ""): String = {
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

  /** Godot enum `TextServer.FontAntialiasing`. */
  opaque type FontAntialiasing <: Long = Long

  object FontAntialiasing {
    final val None: FontAntialiasing = 0L.asInstanceOf[FontAntialiasing]
    final val Gray: FontAntialiasing = 1L.asInstanceOf[FontAntialiasing]
    final val Lcd: FontAntialiasing = 2L.asInstanceOf[FontAntialiasing]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FontAntialiasing = value.asInstanceOf[FontAntialiasing]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FontAntialiasing] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[FontAntialiasing]]

    extension (self: FontAntialiasing)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Gray"
        case 2L => "Lcd"
        case other => other.toString
      }
  }

  /** Godot enum `TextServer.FontLCDSubpixelLayout`. */
  opaque type FontLCDSubpixelLayout <: Long = Long

  object FontLCDSubpixelLayout {
    final val None: FontLCDSubpixelLayout = 0L.asInstanceOf[FontLCDSubpixelLayout]
    final val Hrgb: FontLCDSubpixelLayout = 1L.asInstanceOf[FontLCDSubpixelLayout]
    final val Hbgr: FontLCDSubpixelLayout = 2L.asInstanceOf[FontLCDSubpixelLayout]
    final val Vrgb: FontLCDSubpixelLayout = 3L.asInstanceOf[FontLCDSubpixelLayout]
    final val Vbgr: FontLCDSubpixelLayout = 4L.asInstanceOf[FontLCDSubpixelLayout]
    final val Max: FontLCDSubpixelLayout = 5L.asInstanceOf[FontLCDSubpixelLayout]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FontLCDSubpixelLayout = value.asInstanceOf[FontLCDSubpixelLayout]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FontLCDSubpixelLayout] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[FontLCDSubpixelLayout]]

    extension (self: FontLCDSubpixelLayout)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Hrgb"
        case 2L => "Hbgr"
        case 3L => "Vrgb"
        case 4L => "Vbgr"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `TextServer.Direction`. */
  opaque type Direction <: Long = Long

  object Direction {
    final val Auto: Direction = 0L.asInstanceOf[Direction]
    final val Ltr: Direction = 1L.asInstanceOf[Direction]
    final val Rtl: Direction = 2L.asInstanceOf[Direction]
    final val Inherited: Direction = 3L.asInstanceOf[Direction]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Direction = value.asInstanceOf[Direction]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Direction] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[Direction]]

    extension (self: Direction)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Auto"
        case 1L => "Ltr"
        case 2L => "Rtl"
        case 3L => "Inherited"
        case other => other.toString
      }
  }

  /** Godot enum `TextServer.Orientation`. */
  opaque type Orientation <: Long = Long

  object Orientation {
    final val Horizontal: Orientation = 0L.asInstanceOf[Orientation]
    final val Vertical: Orientation = 1L.asInstanceOf[Orientation]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Orientation = value.asInstanceOf[Orientation]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Orientation] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[Orientation]]

    extension (self: Orientation)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Horizontal"
        case 1L => "Vertical"
        case other => other.toString
      }
  }

  /** Godot bitfield `TextServer.JustificationFlag`. */
  opaque type JustificationFlag = Long

  object JustificationFlag {
    final val None: JustificationFlag = 0L.asInstanceOf[JustificationFlag]
    final val Kashida: JustificationFlag = 1L.asInstanceOf[JustificationFlag]
    final val WordBound: JustificationFlag = 2L.asInstanceOf[JustificationFlag]
    final val TrimEdgeSpaces: JustificationFlag = 4L.asInstanceOf[JustificationFlag]
    final val AfterLastTab: JustificationFlag = 8L.asInstanceOf[JustificationFlag]
    final val ConstrainEllipsis: JustificationFlag = 16L.asInstanceOf[JustificationFlag]
    final val SkipLastLine: JustificationFlag = 32L.asInstanceOf[JustificationFlag]
    final val SkipLastLineWithVisibleChars: JustificationFlag = 64L.asInstanceOf[JustificationFlag]
    final val DoNotSkipSingleLine: JustificationFlag = 128L.asInstanceOf[JustificationFlag]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): JustificationFlag = value.asInstanceOf[JustificationFlag]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[JustificationFlag] = scala.IArray[Long](0L, 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L).asInstanceOf[scala.IArray[JustificationFlag]]

    extension (self: JustificationFlag)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Kashida"
        case 2L => "WordBound"
        case 4L => "TrimEdgeSpaces"
        case 8L => "AfterLastTab"
        case 16L => "ConstrainEllipsis"
        case 32L => "SkipLastLine"
        case 64L => "SkipLastLineWithVisibleChars"
        case 128L => "DoNotSkipSingleLine"
        case other => other.toString
      }
    extension (self: JustificationFlag) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: JustificationFlag): JustificationFlag = (self.value | other.value).asInstanceOf[JustificationFlag]
      inline def &(other: JustificationFlag): JustificationFlag = (self.value & other.value).asInstanceOf[JustificationFlag]
      /** Every bit of `flag` is set. */
      inline def has(flag: JustificationFlag): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot enum `TextServer.AutowrapMode`. */
  opaque type AutowrapMode <: Long = Long

  object AutowrapMode {
    final val Off: AutowrapMode = 0L.asInstanceOf[AutowrapMode]
    final val Arbitrary: AutowrapMode = 1L.asInstanceOf[AutowrapMode]
    final val Word: AutowrapMode = 2L.asInstanceOf[AutowrapMode]
    final val WordSmart: AutowrapMode = 3L.asInstanceOf[AutowrapMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AutowrapMode = value.asInstanceOf[AutowrapMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AutowrapMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[AutowrapMode]]

    extension (self: AutowrapMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Off"
        case 1L => "Arbitrary"
        case 2L => "Word"
        case 3L => "WordSmart"
        case other => other.toString
      }
  }

  /** Godot bitfield `TextServer.LineBreakFlag`. */
  opaque type LineBreakFlag = Long

  object LineBreakFlag {
    final val None: LineBreakFlag = 0L.asInstanceOf[LineBreakFlag]
    final val Mandatory: LineBreakFlag = 1L.asInstanceOf[LineBreakFlag]
    final val WordBound: LineBreakFlag = 2L.asInstanceOf[LineBreakFlag]
    final val GraphemeBound: LineBreakFlag = 4L.asInstanceOf[LineBreakFlag]
    final val Adaptive: LineBreakFlag = 8L.asInstanceOf[LineBreakFlag]
    final val TrimEdgeSpaces: LineBreakFlag = 16L.asInstanceOf[LineBreakFlag]
    final val TrimIndent: LineBreakFlag = 32L.asInstanceOf[LineBreakFlag]
    final val TrimStartEdgeSpaces: LineBreakFlag = 64L.asInstanceOf[LineBreakFlag]
    final val TrimEndEdgeSpaces: LineBreakFlag = 128L.asInstanceOf[LineBreakFlag]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LineBreakFlag = value.asInstanceOf[LineBreakFlag]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LineBreakFlag] = scala.IArray[Long](0L, 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L).asInstanceOf[scala.IArray[LineBreakFlag]]

    extension (self: LineBreakFlag)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Mandatory"
        case 2L => "WordBound"
        case 4L => "GraphemeBound"
        case 8L => "Adaptive"
        case 16L => "TrimEdgeSpaces"
        case 32L => "TrimIndent"
        case 64L => "TrimStartEdgeSpaces"
        case 128L => "TrimEndEdgeSpaces"
        case other => other.toString
      }
    extension (self: LineBreakFlag) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: LineBreakFlag): LineBreakFlag = (self.value | other.value).asInstanceOf[LineBreakFlag]
      inline def &(other: LineBreakFlag): LineBreakFlag = (self.value & other.value).asInstanceOf[LineBreakFlag]
      /** Every bit of `flag` is set. */
      inline def has(flag: LineBreakFlag): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot enum `TextServer.VisibleCharactersBehavior`. */
  opaque type VisibleCharactersBehavior <: Long = Long

  object VisibleCharactersBehavior {
    final val CharsBeforeShaping: VisibleCharactersBehavior = 0L.asInstanceOf[VisibleCharactersBehavior]
    final val CharsAfterShaping: VisibleCharactersBehavior = 1L.asInstanceOf[VisibleCharactersBehavior]
    final val GlyphsAuto: VisibleCharactersBehavior = 2L.asInstanceOf[VisibleCharactersBehavior]
    final val GlyphsLtr: VisibleCharactersBehavior = 3L.asInstanceOf[VisibleCharactersBehavior]
    final val GlyphsRtl: VisibleCharactersBehavior = 4L.asInstanceOf[VisibleCharactersBehavior]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): VisibleCharactersBehavior = value.asInstanceOf[VisibleCharactersBehavior]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[VisibleCharactersBehavior] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[VisibleCharactersBehavior]]

    extension (self: VisibleCharactersBehavior)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "CharsBeforeShaping"
        case 1L => "CharsAfterShaping"
        case 2L => "GlyphsAuto"
        case 3L => "GlyphsLtr"
        case 4L => "GlyphsRtl"
        case other => other.toString
      }
  }

  /** Godot enum `TextServer.OverrunBehavior`. */
  opaque type OverrunBehavior <: Long = Long

  object OverrunBehavior {
    final val NoTrimming: OverrunBehavior = 0L.asInstanceOf[OverrunBehavior]
    final val TrimChar: OverrunBehavior = 1L.asInstanceOf[OverrunBehavior]
    final val TrimWord: OverrunBehavior = 2L.asInstanceOf[OverrunBehavior]
    final val TrimEllipsis: OverrunBehavior = 3L.asInstanceOf[OverrunBehavior]
    final val TrimWordEllipsis: OverrunBehavior = 4L.asInstanceOf[OverrunBehavior]
    final val TrimEllipsisForce: OverrunBehavior = 5L.asInstanceOf[OverrunBehavior]
    final val TrimWordEllipsisForce: OverrunBehavior = 6L.asInstanceOf[OverrunBehavior]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): OverrunBehavior = value.asInstanceOf[OverrunBehavior]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[OverrunBehavior] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[OverrunBehavior]]

    extension (self: OverrunBehavior)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "NoTrimming"
        case 1L => "TrimChar"
        case 2L => "TrimWord"
        case 3L => "TrimEllipsis"
        case 4L => "TrimWordEllipsis"
        case 5L => "TrimEllipsisForce"
        case 6L => "TrimWordEllipsisForce"
        case other => other.toString
      }
  }

  /** Godot bitfield `TextServer.TextOverrunFlag`. */
  opaque type TextOverrunFlag = Long

  object TextOverrunFlag {
    final val NoTrim: TextOverrunFlag = 0L.asInstanceOf[TextOverrunFlag]
    final val Trim: TextOverrunFlag = 1L.asInstanceOf[TextOverrunFlag]
    final val TrimWordOnly: TextOverrunFlag = 2L.asInstanceOf[TextOverrunFlag]
    final val AddEllipsis: TextOverrunFlag = 4L.asInstanceOf[TextOverrunFlag]
    final val EnforceEllipsis: TextOverrunFlag = 8L.asInstanceOf[TextOverrunFlag]
    final val JustificationAware: TextOverrunFlag = 16L.asInstanceOf[TextOverrunFlag]
    final val ShortStringEllipsis: TextOverrunFlag = 32L.asInstanceOf[TextOverrunFlag]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextOverrunFlag = value.asInstanceOf[TextOverrunFlag]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextOverrunFlag] = scala.IArray[Long](0L, 1L, 2L, 4L, 8L, 16L, 32L).asInstanceOf[scala.IArray[TextOverrunFlag]]

    extension (self: TextOverrunFlag)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "NoTrim"
        case 1L => "Trim"
        case 2L => "TrimWordOnly"
        case 4L => "AddEllipsis"
        case 8L => "EnforceEllipsis"
        case 16L => "JustificationAware"
        case 32L => "ShortStringEllipsis"
        case other => other.toString
      }
    extension (self: TextOverrunFlag) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: TextOverrunFlag): TextOverrunFlag = (self.value | other.value).asInstanceOf[TextOverrunFlag]
      inline def &(other: TextOverrunFlag): TextOverrunFlag = (self.value & other.value).asInstanceOf[TextOverrunFlag]
      /** Every bit of `flag` is set. */
      inline def has(flag: TextOverrunFlag): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot bitfield `TextServer.GraphemeFlag`. */
  opaque type GraphemeFlag = Long

  object GraphemeFlag {
    final val Valid: GraphemeFlag = 1L.asInstanceOf[GraphemeFlag]
    final val Rtl: GraphemeFlag = 2L.asInstanceOf[GraphemeFlag]
    final val Virtual: GraphemeFlag = 4L.asInstanceOf[GraphemeFlag]
    final val Space: GraphemeFlag = 8L.asInstanceOf[GraphemeFlag]
    final val BreakHard: GraphemeFlag = 16L.asInstanceOf[GraphemeFlag]
    final val BreakSoft: GraphemeFlag = 32L.asInstanceOf[GraphemeFlag]
    final val Tab: GraphemeFlag = 64L.asInstanceOf[GraphemeFlag]
    final val Elongation: GraphemeFlag = 128L.asInstanceOf[GraphemeFlag]
    final val Punctuation: GraphemeFlag = 256L.asInstanceOf[GraphemeFlag]
    final val Underscore: GraphemeFlag = 512L.asInstanceOf[GraphemeFlag]
    final val Connected: GraphemeFlag = 1024L.asInstanceOf[GraphemeFlag]
    final val SafeToInsertTatweel: GraphemeFlag = 2048L.asInstanceOf[GraphemeFlag]
    final val EmbeddedObject: GraphemeFlag = 4096L.asInstanceOf[GraphemeFlag]
    final val SoftHyphen: GraphemeFlag = 8192L.asInstanceOf[GraphemeFlag]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): GraphemeFlag = value.asInstanceOf[GraphemeFlag]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[GraphemeFlag] = scala.IArray[Long](1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L).asInstanceOf[scala.IArray[GraphemeFlag]]

    extension (self: GraphemeFlag)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Valid"
        case 2L => "Rtl"
        case 4L => "Virtual"
        case 8L => "Space"
        case 16L => "BreakHard"
        case 32L => "BreakSoft"
        case 64L => "Tab"
        case 128L => "Elongation"
        case 256L => "Punctuation"
        case 512L => "Underscore"
        case 1024L => "Connected"
        case 2048L => "SafeToInsertTatweel"
        case 4096L => "EmbeddedObject"
        case 8192L => "SoftHyphen"
        case other => other.toString
      }
    extension (self: GraphemeFlag) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: GraphemeFlag): GraphemeFlag = (self.value | other.value).asInstanceOf[GraphemeFlag]
      inline def &(other: GraphemeFlag): GraphemeFlag = (self.value & other.value).asInstanceOf[GraphemeFlag]
      /** Every bit of `flag` is set. */
      inline def has(flag: GraphemeFlag): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot enum `TextServer.Hinting`. */
  opaque type Hinting <: Long = Long

  object Hinting {
    final val None: Hinting = 0L.asInstanceOf[Hinting]
    final val Light: Hinting = 1L.asInstanceOf[Hinting]
    final val Normal: Hinting = 2L.asInstanceOf[Hinting]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Hinting = value.asInstanceOf[Hinting]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Hinting] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[Hinting]]

    extension (self: Hinting)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Light"
        case 2L => "Normal"
        case other => other.toString
      }
  }

  /** Godot enum `TextServer.SubpixelPositioning`. */
  opaque type SubpixelPositioning <: Long = Long

  object SubpixelPositioning {
    final val Disabled: SubpixelPositioning = 0L.asInstanceOf[SubpixelPositioning]
    final val Auto: SubpixelPositioning = 1L.asInstanceOf[SubpixelPositioning]
    final val OneHalf: SubpixelPositioning = 2L.asInstanceOf[SubpixelPositioning]
    final val OneQuarter: SubpixelPositioning = 3L.asInstanceOf[SubpixelPositioning]
    final val OneHalfMaxSize: SubpixelPositioning = 20L.asInstanceOf[SubpixelPositioning]
    final val OneQuarterMaxSize: SubpixelPositioning = 16L.asInstanceOf[SubpixelPositioning]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SubpixelPositioning = value.asInstanceOf[SubpixelPositioning]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SubpixelPositioning] = scala.IArray[Long](0L, 1L, 2L, 3L, 16L, 20L).asInstanceOf[scala.IArray[SubpixelPositioning]]

    extension (self: SubpixelPositioning)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Auto"
        case 2L => "OneHalf"
        case 3L => "OneQuarter"
        case 16L => "OneQuarterMaxSize"
        case 20L => "OneHalfMaxSize"
        case other => other.toString
      }
  }

  /** Godot enum `TextServer.Feature`. */
  opaque type Feature <: Long = Long

  object Feature {
    final val SimpleLayout: Feature = 1L.asInstanceOf[Feature]
    final val BidiLayout: Feature = 2L.asInstanceOf[Feature]
    final val VerticalLayout: Feature = 4L.asInstanceOf[Feature]
    final val Shaping: Feature = 8L.asInstanceOf[Feature]
    final val KashidaJustification: Feature = 16L.asInstanceOf[Feature]
    final val BreakIterators: Feature = 32L.asInstanceOf[Feature]
    final val FontBitmap: Feature = 64L.asInstanceOf[Feature]
    final val FontDynamic: Feature = 128L.asInstanceOf[Feature]
    final val FontMsdf: Feature = 256L.asInstanceOf[Feature]
    final val FontSystem: Feature = 512L.asInstanceOf[Feature]
    final val FontVariable: Feature = 1024L.asInstanceOf[Feature]
    final val ContextSensitiveCaseConversion: Feature = 2048L.asInstanceOf[Feature]
    final val UseSupportData: Feature = 4096L.asInstanceOf[Feature]
    final val UnicodeIdentifiers: Feature = 8192L.asInstanceOf[Feature]
    final val UnicodeSecurity: Feature = 16384L.asInstanceOf[Feature]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Feature = value.asInstanceOf[Feature]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Feature] = scala.IArray[Long](1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L).asInstanceOf[scala.IArray[Feature]]

    extension (self: Feature)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "SimpleLayout"
        case 2L => "BidiLayout"
        case 4L => "VerticalLayout"
        case 8L => "Shaping"
        case 16L => "KashidaJustification"
        case 32L => "BreakIterators"
        case 64L => "FontBitmap"
        case 128L => "FontDynamic"
        case 256L => "FontMsdf"
        case 512L => "FontSystem"
        case 1024L => "FontVariable"
        case 2048L => "ContextSensitiveCaseConversion"
        case 4096L => "UseSupportData"
        case 8192L => "UnicodeIdentifiers"
        case 16384L => "UnicodeSecurity"
        case other => other.toString
      }
  }

  /** Godot enum `TextServer.ContourPointTag`. */
  opaque type ContourPointTag <: Long = Long

  object ContourPointTag {
    final val On: ContourPointTag = 1L.asInstanceOf[ContourPointTag]
    final val OffConic: ContourPointTag = 0L.asInstanceOf[ContourPointTag]
    final val OffCubic: ContourPointTag = 2L.asInstanceOf[ContourPointTag]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ContourPointTag = value.asInstanceOf[ContourPointTag]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ContourPointTag] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ContourPointTag]]

    extension (self: ContourPointTag)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "OffConic"
        case 1L => "On"
        case 2L => "OffCubic"
        case other => other.toString
      }
  }

  /** Godot enum `TextServer.SpacingType`. */
  opaque type SpacingType <: Long = Long

  object SpacingType {
    final val Glyph: SpacingType = 0L.asInstanceOf[SpacingType]
    final val Space: SpacingType = 1L.asInstanceOf[SpacingType]
    final val Top: SpacingType = 2L.asInstanceOf[SpacingType]
    final val Bottom: SpacingType = 3L.asInstanceOf[SpacingType]
    final val Max: SpacingType = 4L.asInstanceOf[SpacingType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SpacingType = value.asInstanceOf[SpacingType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SpacingType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[SpacingType]]

    extension (self: SpacingType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Glyph"
        case 1L => "Space"
        case 2L => "Top"
        case 3L => "Bottom"
        case 4L => "Max"
        case other => other.toString
      }
  }

  /** Godot bitfield `TextServer.FontStyle`. */
  opaque type FontStyle = Long

  object FontStyle {
    final val Bold: FontStyle = 1L.asInstanceOf[FontStyle]
    final val Italic: FontStyle = 2L.asInstanceOf[FontStyle]
    final val FixedWidth: FontStyle = 4L.asInstanceOf[FontStyle]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FontStyle = value.asInstanceOf[FontStyle]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FontStyle] = scala.IArray[Long](1L, 2L, 4L).asInstanceOf[scala.IArray[FontStyle]]

    extension (self: FontStyle)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Bold"
        case 2L => "Italic"
        case 4L => "FixedWidth"
        case other => other.toString
      }
    extension (self: FontStyle) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: FontStyle): FontStyle = (self.value | other.value).asInstanceOf[FontStyle]
      inline def &(other: FontStyle): FontStyle = (self.value & other.value).asInstanceOf[FontStyle]
      /** Every bit of `flag` is set. */
      inline def has(flag: FontStyle): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot enum `TextServer.StructuredTextParser`. */
  opaque type StructuredTextParser <: Long = Long

  object StructuredTextParser {
    final val Default: StructuredTextParser = 0L.asInstanceOf[StructuredTextParser]
    final val Uri: StructuredTextParser = 1L.asInstanceOf[StructuredTextParser]
    final val File: StructuredTextParser = 2L.asInstanceOf[StructuredTextParser]
    final val Email: StructuredTextParser = 3L.asInstanceOf[StructuredTextParser]
    final val List: StructuredTextParser = 4L.asInstanceOf[StructuredTextParser]
    final val Gdscript: StructuredTextParser = 5L.asInstanceOf[StructuredTextParser]
    final val Custom: StructuredTextParser = 6L.asInstanceOf[StructuredTextParser]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): StructuredTextParser = value.asInstanceOf[StructuredTextParser]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[StructuredTextParser] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[StructuredTextParser]]

    extension (self: StructuredTextParser)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Default"
        case 1L => "Uri"
        case 2L => "File"
        case 3L => "Email"
        case 4L => "List"
        case 5L => "Gdscript"
        case 6L => "Custom"
        case other => other.toString
      }
  }

  /** Godot enum `TextServer.FixedSizeScaleMode`. */
  opaque type FixedSizeScaleMode <: Long = Long

  object FixedSizeScaleMode {
    final val Disable: FixedSizeScaleMode = 0L.asInstanceOf[FixedSizeScaleMode]
    final val IntegerOnly: FixedSizeScaleMode = 1L.asInstanceOf[FixedSizeScaleMode]
    final val Enabled: FixedSizeScaleMode = 2L.asInstanceOf[FixedSizeScaleMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FixedSizeScaleMode = value.asInstanceOf[FixedSizeScaleMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FixedSizeScaleMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[FixedSizeScaleMode]]

    extension (self: FixedSizeScaleMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disable"
        case 1L => "IntegerOnly"
        case 2L => "Enabled"
        case other => other.toString
      }
  }
}
