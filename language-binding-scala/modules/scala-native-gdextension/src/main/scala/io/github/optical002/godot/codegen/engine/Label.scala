package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Label`, extends `Control`. */
abstract class Label extends Control {

  /** Label.set_horizontal_alignment */
  final def setHorizontalAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_horizontal_alignment", 2312603777L), hostObject.objectPtr, alignment)

  /** Label.get_horizontal_alignment */
  final def getHorizontalAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label", "get_horizontal_alignment", 341400642L), hostObject.objectPtr)

  /** Label.set_vertical_alignment */
  final def setVerticalAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_vertical_alignment", 1796458609L), hostObject.objectPtr, alignment)

  /** Label.get_vertical_alignment */
  final def getVerticalAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label", "get_vertical_alignment", 3274884059L), hostObject.objectPtr)

  /** Label.set_text */
  final def setText(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_text", 83702148L), hostObject.objectPtr, text)

  /** Label.get_text */
  final def getText(): String =
    Ptrcall.call0[String](MethodBind.get("Label", "get_text", 201670096L), hostObject.objectPtr)

  /** Label.set_label_settings */
  final def setLabelSettings(settings: LabelSettings): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_label_settings", 1030653839L), hostObject.objectPtr, settings.hostObject)

  /** Label.get_label_settings */
  final def getLabelSettings(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Label", "get_label_settings", 826676056L), hostObject.objectPtr)

  /** Label.set_text_direction */
  final def setTextDirection(direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_text_direction", 119160795L), hostObject.objectPtr, direction)

  /** Label.get_text_direction */
  final def getTextDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label", "get_text_direction", 797257663L), hostObject.objectPtr)

  /** Label.set_language */
  final def setLanguage(language: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_language", 83702148L), hostObject.objectPtr, language)

  /** Label.get_language */
  final def getLanguage(): String =
    Ptrcall.call0[String](MethodBind.get("Label", "get_language", 201670096L), hostObject.objectPtr)

  /** Label.set_paragraph_separator */
  final def setParagraphSeparator(paragraph_separator: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_paragraph_separator", 83702148L), hostObject.objectPtr, paragraph_separator)

  /** Label.get_paragraph_separator */
  final def getParagraphSeparator(): String =
    Ptrcall.call0[String](MethodBind.get("Label", "get_paragraph_separator", 201670096L), hostObject.objectPtr)

  /** Label.set_autowrap_mode */
  final def setAutowrapMode(autowrap_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_autowrap_mode", 3289138044L), hostObject.objectPtr, autowrap_mode)

  /** Label.get_autowrap_mode */
  final def getAutowrapMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label", "get_autowrap_mode", 1549071663L), hostObject.objectPtr)

  /** Label.set_autowrap_trim_flags */
  final def setAutowrapTrimFlags(autowrap_trim_flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_autowrap_trim_flags", 2809697122L), hostObject.objectPtr, autowrap_trim_flags)

  /** Label.get_autowrap_trim_flags */
  final def getAutowrapTrimFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label", "get_autowrap_trim_flags", 2340632602L), hostObject.objectPtr)

  /** Label.set_justification_flags */
  final def setJustificationFlags(justification_flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_justification_flags", 2877345813L), hostObject.objectPtr, justification_flags)

  /** Label.get_justification_flags */
  final def getJustificationFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label", "get_justification_flags", 1583363614L), hostObject.objectPtr)

  /** Label.set_clip_text */
  final def setClipText(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_clip_text", 2586408642L), hostObject.objectPtr, enable)

  /** Label.is_clipping_text */
  final def isClippingText(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Label", "is_clipping_text", 36873697L), hostObject.objectPtr)

  /** Label.set_text_overrun_behavior */
  final def setTextOverrunBehavior(overrun_behavior: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_text_overrun_behavior", 1008890932L), hostObject.objectPtr, overrun_behavior)

  /** Label.get_text_overrun_behavior */
  final def getTextOverrunBehavior(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label", "get_text_overrun_behavior", 3779142101L), hostObject.objectPtr)

  /** Label.set_ellipsis_char */
  final def setEllipsisChar(char: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_ellipsis_char", 83702148L), hostObject.objectPtr, char)

  /** Label.get_ellipsis_char */
  final def getEllipsisChar(): String =
    Ptrcall.call0[String](MethodBind.get("Label", "get_ellipsis_char", 201670096L), hostObject.objectPtr)

  /** Label.set_uppercase */
  final def setUppercase(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_uppercase", 2586408642L), hostObject.objectPtr, enable)

  /** Label.is_uppercase */
  final def isUppercase(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Label", "is_uppercase", 36873697L), hostObject.objectPtr)

  /** Label.get_line_height */
  final def getLineHeight(line: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Label", "get_line_height", 181039630L), hostObject.objectPtr, line)

  /** Label.get_line_count */
  final def getLineCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label", "get_line_count", 3905245786L), hostObject.objectPtr)

  /** Label.get_visible_line_count */
  final def getVisibleLineCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label", "get_visible_line_count", 3905245786L), hostObject.objectPtr)

  /** Label.get_total_character_count */
  final def getTotalCharacterCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label", "get_total_character_count", 3905245786L), hostObject.objectPtr)

  /** Label.set_visible_characters */
  final def setVisibleCharacters(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_visible_characters", 1286410249L), hostObject.objectPtr, amount)

  /** Label.get_visible_characters */
  final def getVisibleCharacters(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label", "get_visible_characters", 3905245786L), hostObject.objectPtr)

  /** Label.get_visible_characters_behavior */
  final def getVisibleCharactersBehavior(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label", "get_visible_characters_behavior", 258789322L), hostObject.objectPtr)

  /** Label.set_visible_characters_behavior */
  final def setVisibleCharactersBehavior(behavior: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_visible_characters_behavior", 3383839701L), hostObject.objectPtr, behavior)

  /** Label.set_visible_ratio */
  final def setVisibleRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_visible_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** Label.get_visible_ratio */
  final def getVisibleRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("Label", "get_visible_ratio", 1740695150L), hostObject.objectPtr)

  /** Label.set_lines_skipped */
  final def setLinesSkipped(lines_skipped: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_lines_skipped", 1286410249L), hostObject.objectPtr, lines_skipped)

  /** Label.get_lines_skipped */
  final def getLinesSkipped(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label", "get_lines_skipped", 3905245786L), hostObject.objectPtr)

  /** Label.set_max_lines_visible */
  final def setMaxLinesVisible(lines_visible: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_max_lines_visible", 1286410249L), hostObject.objectPtr, lines_visible)

  /** Label.get_max_lines_visible */
  final def getMaxLinesVisible(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label", "get_max_lines_visible", 3905245786L), hostObject.objectPtr)

  /** Label.set_structured_text_bidi_override */
  final def setStructuredTextBidiOverride(parser: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label", "set_structured_text_bidi_override", 55961453L), hostObject.objectPtr, parser)

  /** Label.get_structured_text_bidi_override */
  final def getStructuredTextBidiOverride(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label", "get_structured_text_bidi_override", 3385126229L), hostObject.objectPtr)

  /** Label.get_character_bounds */
  final def getCharacterBounds(pos: Long): io.github.optical002.godot.builtin.Rect2 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Rect2](MethodBind.get("Label", "get_character_bounds", 3327874267L), hostObject.objectPtr, pos)

}

object Label {
  /** Class metadata for Gd[Label] lifetime management and casting. */
  given GodotClass[Label] with {
    def className = "Label"
    def isRefCounted = false
    def wrap(o: GodotObject): Label = new Label {}.withHost(o.objectPtr)
    def unwrap(t: Label): GodotObject = t.hostObject
  }
}
