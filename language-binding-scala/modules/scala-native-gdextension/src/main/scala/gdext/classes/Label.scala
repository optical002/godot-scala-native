package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Label`, extends `Control`. */
abstract class Label extends Control {
  override def godotClassName: String = "Label"

  /** Label.set_horizontal_alignment */
  final def setHorizontalAlignment(alignment: Long): Unit = {
    if (gdext.classes.Label.mb_set_horizontal_alignment == null) gdext.classes.Label.mb_set_horizontal_alignment = MethodBind.get("Label", "set_horizontal_alignment", 2312603777L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_horizontal_alignment, livePtr, alignment)
  }

  /** Label.get_horizontal_alignment */
  final def getHorizontalAlignment(): Long = {
    if (gdext.classes.Label.mb_get_horizontal_alignment == null) gdext.classes.Label.mb_get_horizontal_alignment = MethodBind.get("Label", "get_horizontal_alignment", 341400642L)
    Ptrcall.call0[Long](gdext.classes.Label.mb_get_horizontal_alignment, livePtr)
  }

  /** Label.set_vertical_alignment */
  final def setVerticalAlignment(alignment: Long): Unit = {
    if (gdext.classes.Label.mb_set_vertical_alignment == null) gdext.classes.Label.mb_set_vertical_alignment = MethodBind.get("Label", "set_vertical_alignment", 1796458609L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_vertical_alignment, livePtr, alignment)
  }

  /** Label.get_vertical_alignment */
  final def getVerticalAlignment(): Long = {
    if (gdext.classes.Label.mb_get_vertical_alignment == null) gdext.classes.Label.mb_get_vertical_alignment = MethodBind.get("Label", "get_vertical_alignment", 3274884059L)
    Ptrcall.call0[Long](gdext.classes.Label.mb_get_vertical_alignment, livePtr)
  }

  /** Label.set_text */
  final def setText(text: String): Unit = {
    if (gdext.classes.Label.mb_set_text == null) gdext.classes.Label.mb_set_text = MethodBind.get("Label", "set_text", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_text, livePtr, text)
  }

  /** Label.get_text */
  final def getText(): String = {
    if (gdext.classes.Label.mb_get_text == null) gdext.classes.Label.mb_get_text = MethodBind.get("Label", "get_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.Label.mb_get_text, livePtr)
  }

  /** Label.set_label_settings */
  final def setLabelSettings(settings: LabelSettings): Unit = {
    if (gdext.classes.Label.mb_set_label_settings == null) gdext.classes.Label.mb_set_label_settings = MethodBind.get("Label", "set_label_settings", 1030653839L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_label_settings, livePtr, Wrappers.handle(settings))
  }

  /** Label.get_label_settings. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getLabelSettings(): LabelSettings = {
    if (gdext.classes.Label.mb_get_label_settings == null) gdext.classes.Label.mb_get_label_settings = MethodBind.get("Label", "get_label_settings", 826676056L)
    Wrappers.owned[LabelSettings](Ptrcall.call0[Long](gdext.classes.Label.mb_get_label_settings, livePtr))
  }

  /** Label.set_text_direction */
  final def setTextDirection(direction: Long): Unit = {
    if (gdext.classes.Label.mb_set_text_direction == null) gdext.classes.Label.mb_set_text_direction = MethodBind.get("Label", "set_text_direction", 119160795L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_text_direction, livePtr, direction)
  }

  /** Label.get_text_direction */
  final def getTextDirection(): Long = {
    if (gdext.classes.Label.mb_get_text_direction == null) gdext.classes.Label.mb_get_text_direction = MethodBind.get("Label", "get_text_direction", 797257663L)
    Ptrcall.call0[Long](gdext.classes.Label.mb_get_text_direction, livePtr)
  }

  /** Label.set_language */
  final def setLanguage(language: String): Unit = {
    if (gdext.classes.Label.mb_set_language == null) gdext.classes.Label.mb_set_language = MethodBind.get("Label", "set_language", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_language, livePtr, language)
  }

  /** Label.get_language */
  final def getLanguage(): String = {
    if (gdext.classes.Label.mb_get_language == null) gdext.classes.Label.mb_get_language = MethodBind.get("Label", "get_language", 201670096L)
    Ptrcall.call0[String](gdext.classes.Label.mb_get_language, livePtr)
  }

  /** Label.set_paragraph_separator */
  final def setParagraphSeparator(paragraph_separator: String): Unit = {
    if (gdext.classes.Label.mb_set_paragraph_separator == null) gdext.classes.Label.mb_set_paragraph_separator = MethodBind.get("Label", "set_paragraph_separator", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_paragraph_separator, livePtr, paragraph_separator)
  }

  /** Label.get_paragraph_separator */
  final def getParagraphSeparator(): String = {
    if (gdext.classes.Label.mb_get_paragraph_separator == null) gdext.classes.Label.mb_get_paragraph_separator = MethodBind.get("Label", "get_paragraph_separator", 201670096L)
    Ptrcall.call0[String](gdext.classes.Label.mb_get_paragraph_separator, livePtr)
  }

  /** Label.set_autowrap_mode */
  final def setAutowrapMode(autowrap_mode: Long): Unit = {
    if (gdext.classes.Label.mb_set_autowrap_mode == null) gdext.classes.Label.mb_set_autowrap_mode = MethodBind.get("Label", "set_autowrap_mode", 3289138044L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_autowrap_mode, livePtr, autowrap_mode)
  }

  /** Label.get_autowrap_mode */
  final def getAutowrapMode(): Long = {
    if (gdext.classes.Label.mb_get_autowrap_mode == null) gdext.classes.Label.mb_get_autowrap_mode = MethodBind.get("Label", "get_autowrap_mode", 1549071663L)
    Ptrcall.call0[Long](gdext.classes.Label.mb_get_autowrap_mode, livePtr)
  }

  /** Label.set_autowrap_trim_flags */
  final def setAutowrapTrimFlags(autowrap_trim_flags: Long): Unit = {
    if (gdext.classes.Label.mb_set_autowrap_trim_flags == null) gdext.classes.Label.mb_set_autowrap_trim_flags = MethodBind.get("Label", "set_autowrap_trim_flags", 2809697122L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_autowrap_trim_flags, livePtr, autowrap_trim_flags)
  }

  /** Label.get_autowrap_trim_flags */
  final def getAutowrapTrimFlags(): Long = {
    if (gdext.classes.Label.mb_get_autowrap_trim_flags == null) gdext.classes.Label.mb_get_autowrap_trim_flags = MethodBind.get("Label", "get_autowrap_trim_flags", 2340632602L)
    Ptrcall.call0[Long](gdext.classes.Label.mb_get_autowrap_trim_flags, livePtr)
  }

  /** Label.set_justification_flags */
  final def setJustificationFlags(justification_flags: Long): Unit = {
    if (gdext.classes.Label.mb_set_justification_flags == null) gdext.classes.Label.mb_set_justification_flags = MethodBind.get("Label", "set_justification_flags", 2877345813L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_justification_flags, livePtr, justification_flags)
  }

  /** Label.get_justification_flags */
  final def getJustificationFlags(): Long = {
    if (gdext.classes.Label.mb_get_justification_flags == null) gdext.classes.Label.mb_get_justification_flags = MethodBind.get("Label", "get_justification_flags", 1583363614L)
    Ptrcall.call0[Long](gdext.classes.Label.mb_get_justification_flags, livePtr)
  }

  /** Label.set_clip_text */
  final def setClipText(enable: Boolean): Unit = {
    if (gdext.classes.Label.mb_set_clip_text == null) gdext.classes.Label.mb_set_clip_text = MethodBind.get("Label", "set_clip_text", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_clip_text, livePtr, enable)
  }

  /** Label.is_clipping_text */
  final def isClippingText(): Boolean = {
    if (gdext.classes.Label.mb_is_clipping_text == null) gdext.classes.Label.mb_is_clipping_text = MethodBind.get("Label", "is_clipping_text", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Label.mb_is_clipping_text, livePtr)
  }

  /** Label.set_text_overrun_behavior */
  final def setTextOverrunBehavior(overrun_behavior: Long): Unit = {
    if (gdext.classes.Label.mb_set_text_overrun_behavior == null) gdext.classes.Label.mb_set_text_overrun_behavior = MethodBind.get("Label", "set_text_overrun_behavior", 1008890932L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_text_overrun_behavior, livePtr, overrun_behavior)
  }

  /** Label.get_text_overrun_behavior */
  final def getTextOverrunBehavior(): Long = {
    if (gdext.classes.Label.mb_get_text_overrun_behavior == null) gdext.classes.Label.mb_get_text_overrun_behavior = MethodBind.get("Label", "get_text_overrun_behavior", 3779142101L)
    Ptrcall.call0[Long](gdext.classes.Label.mb_get_text_overrun_behavior, livePtr)
  }

  /** Label.set_ellipsis_char */
  final def setEllipsisChar(char: String): Unit = {
    if (gdext.classes.Label.mb_set_ellipsis_char == null) gdext.classes.Label.mb_set_ellipsis_char = MethodBind.get("Label", "set_ellipsis_char", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_ellipsis_char, livePtr, char)
  }

  /** Label.get_ellipsis_char */
  final def getEllipsisChar(): String = {
    if (gdext.classes.Label.mb_get_ellipsis_char == null) gdext.classes.Label.mb_get_ellipsis_char = MethodBind.get("Label", "get_ellipsis_char", 201670096L)
    Ptrcall.call0[String](gdext.classes.Label.mb_get_ellipsis_char, livePtr)
  }

  /** Label.set_uppercase */
  final def setUppercase(enable: Boolean): Unit = {
    if (gdext.classes.Label.mb_set_uppercase == null) gdext.classes.Label.mb_set_uppercase = MethodBind.get("Label", "set_uppercase", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_uppercase, livePtr, enable)
  }

  /** Label.is_uppercase */
  final def isUppercase(): Boolean = {
    if (gdext.classes.Label.mb_is_uppercase == null) gdext.classes.Label.mb_is_uppercase = MethodBind.get("Label", "is_uppercase", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Label.mb_is_uppercase, livePtr)
  }

  /** Label.get_line_height */
  final def getLineHeight(line: Long): Long = {
    if (gdext.classes.Label.mb_get_line_height == null) gdext.classes.Label.mb_get_line_height = MethodBind.get("Label", "get_line_height", 181039630L)
    Ptrcall.call1[Long, Long](gdext.classes.Label.mb_get_line_height, livePtr, line)
  }

  /** Label.get_line_count */
  final def getLineCount(): Long = {
    if (gdext.classes.Label.mb_get_line_count == null) gdext.classes.Label.mb_get_line_count = MethodBind.get("Label", "get_line_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Label.mb_get_line_count, livePtr)
  }

  /** Label.get_visible_line_count */
  final def getVisibleLineCount(): Long = {
    if (gdext.classes.Label.mb_get_visible_line_count == null) gdext.classes.Label.mb_get_visible_line_count = MethodBind.get("Label", "get_visible_line_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Label.mb_get_visible_line_count, livePtr)
  }

  /** Label.get_total_character_count */
  final def getTotalCharacterCount(): Long = {
    if (gdext.classes.Label.mb_get_total_character_count == null) gdext.classes.Label.mb_get_total_character_count = MethodBind.get("Label", "get_total_character_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Label.mb_get_total_character_count, livePtr)
  }

  /** Label.set_visible_characters */
  final def setVisibleCharacters(amount: Long): Unit = {
    if (gdext.classes.Label.mb_set_visible_characters == null) gdext.classes.Label.mb_set_visible_characters = MethodBind.get("Label", "set_visible_characters", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_visible_characters, livePtr, amount)
  }

  /** Label.get_visible_characters */
  final def getVisibleCharacters(): Long = {
    if (gdext.classes.Label.mb_get_visible_characters == null) gdext.classes.Label.mb_get_visible_characters = MethodBind.get("Label", "get_visible_characters", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Label.mb_get_visible_characters, livePtr)
  }

  /** Label.get_visible_characters_behavior */
  final def getVisibleCharactersBehavior(): Long = {
    if (gdext.classes.Label.mb_get_visible_characters_behavior == null) gdext.classes.Label.mb_get_visible_characters_behavior = MethodBind.get("Label", "get_visible_characters_behavior", 258789322L)
    Ptrcall.call0[Long](gdext.classes.Label.mb_get_visible_characters_behavior, livePtr)
  }

  /** Label.set_visible_characters_behavior */
  final def setVisibleCharactersBehavior(behavior: Long): Unit = {
    if (gdext.classes.Label.mb_set_visible_characters_behavior == null) gdext.classes.Label.mb_set_visible_characters_behavior = MethodBind.get("Label", "set_visible_characters_behavior", 3383839701L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_visible_characters_behavior, livePtr, behavior)
  }

  /** Label.set_visible_ratio */
  final def setVisibleRatio(ratio: Double): Unit = {
    if (gdext.classes.Label.mb_set_visible_ratio == null) gdext.classes.Label.mb_set_visible_ratio = MethodBind.get("Label", "set_visible_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_visible_ratio, livePtr, ratio)
  }

  /** Label.get_visible_ratio */
  final def getVisibleRatio(): Double = {
    if (gdext.classes.Label.mb_get_visible_ratio == null) gdext.classes.Label.mb_get_visible_ratio = MethodBind.get("Label", "get_visible_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Label.mb_get_visible_ratio, livePtr)
  }

  /** Label.set_lines_skipped */
  final def setLinesSkipped(lines_skipped: Long): Unit = {
    if (gdext.classes.Label.mb_set_lines_skipped == null) gdext.classes.Label.mb_set_lines_skipped = MethodBind.get("Label", "set_lines_skipped", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_lines_skipped, livePtr, lines_skipped)
  }

  /** Label.get_lines_skipped */
  final def getLinesSkipped(): Long = {
    if (gdext.classes.Label.mb_get_lines_skipped == null) gdext.classes.Label.mb_get_lines_skipped = MethodBind.get("Label", "get_lines_skipped", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Label.mb_get_lines_skipped, livePtr)
  }

  /** Label.set_max_lines_visible */
  final def setMaxLinesVisible(lines_visible: Long): Unit = {
    if (gdext.classes.Label.mb_set_max_lines_visible == null) gdext.classes.Label.mb_set_max_lines_visible = MethodBind.get("Label", "set_max_lines_visible", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_max_lines_visible, livePtr, lines_visible)
  }

  /** Label.get_max_lines_visible */
  final def getMaxLinesVisible(): Long = {
    if (gdext.classes.Label.mb_get_max_lines_visible == null) gdext.classes.Label.mb_get_max_lines_visible = MethodBind.get("Label", "get_max_lines_visible", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Label.mb_get_max_lines_visible, livePtr)
  }

  /** Label.set_structured_text_bidi_override */
  final def setStructuredTextBidiOverride(parser: Long): Unit = {
    if (gdext.classes.Label.mb_set_structured_text_bidi_override == null) gdext.classes.Label.mb_set_structured_text_bidi_override = MethodBind.get("Label", "set_structured_text_bidi_override", 55961453L)
    Ptrcall.callVoid1(gdext.classes.Label.mb_set_structured_text_bidi_override, livePtr, parser)
  }

  /** Label.get_structured_text_bidi_override */
  final def getStructuredTextBidiOverride(): Long = {
    if (gdext.classes.Label.mb_get_structured_text_bidi_override == null) gdext.classes.Label.mb_get_structured_text_bidi_override = MethodBind.get("Label", "get_structured_text_bidi_override", 3385126229L)
    Ptrcall.call0[Long](gdext.classes.Label.mb_get_structured_text_bidi_override, livePtr)
  }

  /** Label.get_character_bounds */
  final def getCharacterBounds(pos: Long): gdext.builtin.Rect2 = {
    if (gdext.classes.Label.mb_get_character_bounds == null) gdext.classes.Label.mb_get_character_bounds = MethodBind.get("Label", "get_character_bounds", 3327874267L)
    Ptrcall.call1[Long, gdext.builtin.Rect2](gdext.classes.Label.mb_get_character_bounds, livePtr, pos)
  }

}

object Label {
  private[classes] var mb_set_horizontal_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_horizontal_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertical_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertical_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_label_settings: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_label_settings: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_paragraph_separator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_paragraph_separator: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autowrap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autowrap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autowrap_trim_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autowrap_trim_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_justification_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_justification_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_clip_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_clipping_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_overrun_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_overrun_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ellipsis_char: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ellipsis_char: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uppercase: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_uppercase: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visible_line_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_total_character_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visible_characters: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visible_characters: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visible_characters_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visible_characters_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visible_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visible_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lines_skipped: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lines_skipped: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_lines_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_lines_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_structured_text_bidi_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_structured_text_bidi_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_character_bounds: GDExtensionMethodBindPtr = null
}
