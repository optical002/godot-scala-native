package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `LinkButton`, extends `BaseButton`. */
abstract class LinkButton extends BaseButton {
  override def godotClassName: String = "LinkButton"

  /** LinkButton.set_text */
  final def setText(text: String): Unit = {
    if (gdext.classes.LinkButton.mb_set_text == null) gdext.classes.LinkButton.mb_set_text = MethodBind.get("LinkButton", "set_text", 83702148L)
    Ptrcall.callVoid1(gdext.classes.LinkButton.mb_set_text, livePtr, text)
  }

  /** LinkButton.get_text */
  final def getText(): String = {
    if (gdext.classes.LinkButton.mb_get_text == null) gdext.classes.LinkButton.mb_get_text = MethodBind.get("LinkButton", "get_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.LinkButton.mb_get_text, livePtr)
  }

  /** LinkButton.set_text_overrun_behavior */
  final def setTextOverrunBehavior(overrunBehavior: gdext.classes.TextServer.OverrunBehavior): Unit = {
    if (gdext.classes.LinkButton.mb_set_text_overrun_behavior == null) gdext.classes.LinkButton.mb_set_text_overrun_behavior = MethodBind.get("LinkButton", "set_text_overrun_behavior", 1008890932L)
    Ptrcall.callVoid1(gdext.classes.LinkButton.mb_set_text_overrun_behavior, livePtr, overrunBehavior)
  }

  /** LinkButton.get_text_overrun_behavior */
  final def getTextOverrunBehavior(): gdext.classes.TextServer.OverrunBehavior = {
    if (gdext.classes.LinkButton.mb_get_text_overrun_behavior == null) gdext.classes.LinkButton.mb_get_text_overrun_behavior = MethodBind.get("LinkButton", "get_text_overrun_behavior", 3779142101L)
    gdext.classes.TextServer.OverrunBehavior(Ptrcall.call0[Long](gdext.classes.LinkButton.mb_get_text_overrun_behavior, livePtr))
  }

  /** LinkButton.set_ellipsis_char */
  final def setEllipsisChar(char: String): Unit = {
    if (gdext.classes.LinkButton.mb_set_ellipsis_char == null) gdext.classes.LinkButton.mb_set_ellipsis_char = MethodBind.get("LinkButton", "set_ellipsis_char", 83702148L)
    Ptrcall.callVoid1(gdext.classes.LinkButton.mb_set_ellipsis_char, livePtr, char)
  }

  /** LinkButton.get_ellipsis_char */
  final def getEllipsisChar(): String = {
    if (gdext.classes.LinkButton.mb_get_ellipsis_char == null) gdext.classes.LinkButton.mb_get_ellipsis_char = MethodBind.get("LinkButton", "get_ellipsis_char", 201670096L)
    Ptrcall.call0[String](gdext.classes.LinkButton.mb_get_ellipsis_char, livePtr)
  }

  /** LinkButton.set_text_direction */
  final def setTextDirection(direction: gdext.classes.Control.TextDirection): Unit = {
    if (gdext.classes.LinkButton.mb_set_text_direction == null) gdext.classes.LinkButton.mb_set_text_direction = MethodBind.get("LinkButton", "set_text_direction", 119160795L)
    Ptrcall.callVoid1(gdext.classes.LinkButton.mb_set_text_direction, livePtr, direction)
  }

  /** LinkButton.get_text_direction */
  final def getTextDirection(): gdext.classes.Control.TextDirection = {
    if (gdext.classes.LinkButton.mb_get_text_direction == null) gdext.classes.LinkButton.mb_get_text_direction = MethodBind.get("LinkButton", "get_text_direction", 797257663L)
    gdext.classes.Control.TextDirection(Ptrcall.call0[Long](gdext.classes.LinkButton.mb_get_text_direction, livePtr))
  }

  /** LinkButton.set_language */
  final def setLanguage(language: String): Unit = {
    if (gdext.classes.LinkButton.mb_set_language == null) gdext.classes.LinkButton.mb_set_language = MethodBind.get("LinkButton", "set_language", 83702148L)
    Ptrcall.callVoid1(gdext.classes.LinkButton.mb_set_language, livePtr, language)
  }

  /** LinkButton.get_language */
  final def getLanguage(): String = {
    if (gdext.classes.LinkButton.mb_get_language == null) gdext.classes.LinkButton.mb_get_language = MethodBind.get("LinkButton", "get_language", 201670096L)
    Ptrcall.call0[String](gdext.classes.LinkButton.mb_get_language, livePtr)
  }

  /** LinkButton.set_uri */
  final def setUri(uri: String): Unit = {
    if (gdext.classes.LinkButton.mb_set_uri == null) gdext.classes.LinkButton.mb_set_uri = MethodBind.get("LinkButton", "set_uri", 83702148L)
    Ptrcall.callVoid1(gdext.classes.LinkButton.mb_set_uri, livePtr, uri)
  }

  /** LinkButton.get_uri */
  final def getUri(): String = {
    if (gdext.classes.LinkButton.mb_get_uri == null) gdext.classes.LinkButton.mb_get_uri = MethodBind.get("LinkButton", "get_uri", 201670096L)
    Ptrcall.call0[String](gdext.classes.LinkButton.mb_get_uri, livePtr)
  }

  /** LinkButton.set_underline_mode */
  final def setUnderlineMode(underlineMode: gdext.classes.LinkButton.UnderlineMode): Unit = {
    if (gdext.classes.LinkButton.mb_set_underline_mode == null) gdext.classes.LinkButton.mb_set_underline_mode = MethodBind.get("LinkButton", "set_underline_mode", 4032947085L)
    Ptrcall.callVoid1(gdext.classes.LinkButton.mb_set_underline_mode, livePtr, underlineMode)
  }

  /** LinkButton.get_underline_mode */
  final def getUnderlineMode(): gdext.classes.LinkButton.UnderlineMode = {
    if (gdext.classes.LinkButton.mb_get_underline_mode == null) gdext.classes.LinkButton.mb_get_underline_mode = MethodBind.get("LinkButton", "get_underline_mode", 568343738L)
    gdext.classes.LinkButton.UnderlineMode(Ptrcall.call0[Long](gdext.classes.LinkButton.mb_get_underline_mode, livePtr))
  }

  /** LinkButton.set_structured_text_bidi_override */
  final def setStructuredTextBidiOverride(parser: gdext.classes.TextServer.StructuredTextParser): Unit = {
    if (gdext.classes.LinkButton.mb_set_structured_text_bidi_override == null) gdext.classes.LinkButton.mb_set_structured_text_bidi_override = MethodBind.get("LinkButton", "set_structured_text_bidi_override", 55961453L)
    Ptrcall.callVoid1(gdext.classes.LinkButton.mb_set_structured_text_bidi_override, livePtr, parser)
  }

  /** LinkButton.get_structured_text_bidi_override */
  final def getStructuredTextBidiOverride(): gdext.classes.TextServer.StructuredTextParser = {
    if (gdext.classes.LinkButton.mb_get_structured_text_bidi_override == null) gdext.classes.LinkButton.mb_get_structured_text_bidi_override = MethodBind.get("LinkButton", "get_structured_text_bidi_override", 3385126229L)
    gdext.classes.TextServer.StructuredTextParser(Ptrcall.call0[Long](gdext.classes.LinkButton.mb_get_structured_text_bidi_override, livePtr))
  }

}

object LinkButton {
  private[classes] var mb_set_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_overrun_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_overrun_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ellipsis_char: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ellipsis_char: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uri: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_uri: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_underline_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_underline_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_structured_text_bidi_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_structured_text_bidi_override: GDExtensionMethodBindPtr = null

  /** Godot enum `LinkButton.UnderlineMode`. */
  opaque type UnderlineMode <: Long = Long

  object UnderlineMode {
    final val Always: UnderlineMode = 0L.asInstanceOf[UnderlineMode]
    final val OnHover: UnderlineMode = 1L.asInstanceOf[UnderlineMode]
    final val Never: UnderlineMode = 2L.asInstanceOf[UnderlineMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): UnderlineMode = value.asInstanceOf[UnderlineMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[UnderlineMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[UnderlineMode]]

    extension (self: UnderlineMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Always"
        case 1L => "OnHover"
        case 2L => "Never"
        case other => other.toString
      }
  }
}
