package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `LinkButton`, extends `BaseButton`. */
abstract class LinkButton extends BaseButton {

  /** LinkButton.set_text */
  final def setText(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("LinkButton", "set_text", 83702148L), hostObject.objectPtr, text)

  /** LinkButton.get_text */
  final def getText(): String =
    Ptrcall.call0[String](MethodBind.get("LinkButton", "get_text", 201670096L), hostObject.objectPtr)

  /** LinkButton.set_text_overrun_behavior */
  final def setTextOverrunBehavior(overrun_behavior: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LinkButton", "set_text_overrun_behavior", 1008890932L), hostObject.objectPtr, overrun_behavior)

  /** LinkButton.get_text_overrun_behavior */
  final def getTextOverrunBehavior(): Long =
    Ptrcall.call0[Long](MethodBind.get("LinkButton", "get_text_overrun_behavior", 3779142101L), hostObject.objectPtr)

  /** LinkButton.set_ellipsis_char */
  final def setEllipsisChar(char: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("LinkButton", "set_ellipsis_char", 83702148L), hostObject.objectPtr, char)

  /** LinkButton.get_ellipsis_char */
  final def getEllipsisChar(): String =
    Ptrcall.call0[String](MethodBind.get("LinkButton", "get_ellipsis_char", 201670096L), hostObject.objectPtr)

  /** LinkButton.set_text_direction */
  final def setTextDirection(direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LinkButton", "set_text_direction", 119160795L), hostObject.objectPtr, direction)

  /** LinkButton.get_text_direction */
  final def getTextDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("LinkButton", "get_text_direction", 797257663L), hostObject.objectPtr)

  /** LinkButton.set_language */
  final def setLanguage(language: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("LinkButton", "set_language", 83702148L), hostObject.objectPtr, language)

  /** LinkButton.get_language */
  final def getLanguage(): String =
    Ptrcall.call0[String](MethodBind.get("LinkButton", "get_language", 201670096L), hostObject.objectPtr)

  /** LinkButton.set_uri */
  final def setUri(uri: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("LinkButton", "set_uri", 83702148L), hostObject.objectPtr, uri)

  /** LinkButton.get_uri */
  final def getUri(): String =
    Ptrcall.call0[String](MethodBind.get("LinkButton", "get_uri", 201670096L), hostObject.objectPtr)

  /** LinkButton.set_underline_mode */
  final def setUnderlineMode(underline_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LinkButton", "set_underline_mode", 4032947085L), hostObject.objectPtr, underline_mode)

  /** LinkButton.get_underline_mode */
  final def getUnderlineMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("LinkButton", "get_underline_mode", 568343738L), hostObject.objectPtr)

  /** LinkButton.set_structured_text_bidi_override */
  final def setStructuredTextBidiOverride(parser: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LinkButton", "set_structured_text_bidi_override", 55961453L), hostObject.objectPtr, parser)

  /** LinkButton.get_structured_text_bidi_override */
  final def getStructuredTextBidiOverride(): Long =
    Ptrcall.call0[Long](MethodBind.get("LinkButton", "get_structured_text_bidi_override", 3385126229L), hostObject.objectPtr)

}

object LinkButton {
  /** Class metadata for Gd[LinkButton] lifetime management and casting. */
  given GodotClass[LinkButton] with {
    def className = "LinkButton"
    def isRefCounted = false
    def wrap(o: GodotObject): LinkButton = new LinkButton {}.withHost(o.objectPtr)
    def unwrap(t: LinkButton): GodotObject = t.hostObject
  }
}
