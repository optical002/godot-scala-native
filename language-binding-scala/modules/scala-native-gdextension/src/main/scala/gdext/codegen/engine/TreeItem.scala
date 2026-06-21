package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TreeItem`, extends `Object`. */
abstract class TreeItem extends Object {

  /** TreeItem.set_cell_mode */
  final def setCellMode(column: Long, mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_cell_mode", 289920701L), hostObject.objectPtr, column, mode)

  /** TreeItem.get_cell_mode */
  final def getCellMode(column: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TreeItem", "get_cell_mode", 3406114978L), hostObject.objectPtr, column)

  /** TreeItem.set_auto_translate_mode */
  final def setAutoTranslateMode(column: Long, mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_auto_translate_mode", 287402019L), hostObject.objectPtr, column, mode)

  /** TreeItem.get_auto_translate_mode */
  final def getAutoTranslateMode(column: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TreeItem", "get_auto_translate_mode", 906302372L), hostObject.objectPtr, column)

  /** TreeItem.set_edit_multiline */
  final def setEditMultiline(column: Long, multiline: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_edit_multiline", 300928843L), hostObject.objectPtr, column, multiline)

  /** TreeItem.is_edit_multiline */
  final def isEditMultiline(column: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TreeItem", "is_edit_multiline", 1116898809L), hostObject.objectPtr, column)

  /** TreeItem.set_checked */
  final def setChecked(column: Long, checked: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_checked", 300928843L), hostObject.objectPtr, column, checked)

  /** TreeItem.set_indeterminate */
  final def setIndeterminate(column: Long, indeterminate: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_indeterminate", 300928843L), hostObject.objectPtr, column, indeterminate)

  /** TreeItem.is_checked */
  final def isChecked(column: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TreeItem", "is_checked", 1116898809L), hostObject.objectPtr, column)

  /** TreeItem.is_indeterminate */
  final def isIndeterminate(column: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TreeItem", "is_indeterminate", 1116898809L), hostObject.objectPtr, column)

  /** TreeItem.propagate_check */
  final def propagateCheck(column: Long, emit_signal: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "propagate_check", 972357352L), hostObject.objectPtr, column, emit_signal)

  /** TreeItem.set_text */
  final def setText(column: Long, text: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_text", 501894301L), hostObject.objectPtr, column, text)

  /** TreeItem.get_text */
  final def getText(column: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TreeItem", "get_text", 844755477L), hostObject.objectPtr, column)

  /** TreeItem.set_description */
  final def setDescription(column: Long, description: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_description", 501894301L), hostObject.objectPtr, column, description)

  /** TreeItem.get_description */
  final def getDescription(column: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TreeItem", "get_description", 844755477L), hostObject.objectPtr, column)

  /** TreeItem.set_text_direction */
  final def setTextDirection(column: Long, direction: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_text_direction", 1707680378L), hostObject.objectPtr, column, direction)

  /** TreeItem.get_text_direction */
  final def getTextDirection(column: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TreeItem", "get_text_direction", 4235602388L), hostObject.objectPtr, column)

  /** TreeItem.set_autowrap_mode */
  final def setAutowrapMode(column: Long, autowrap_mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_autowrap_mode", 3633006561L), hostObject.objectPtr, column, autowrap_mode)

  /** TreeItem.get_autowrap_mode */
  final def getAutowrapMode(column: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TreeItem", "get_autowrap_mode", 2902757236L), hostObject.objectPtr, column)

  /** TreeItem.set_text_overrun_behavior */
  final def setTextOverrunBehavior(column: Long, overrun_behavior: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_text_overrun_behavior", 1940772195L), hostObject.objectPtr, column, overrun_behavior)

  /** TreeItem.get_text_overrun_behavior */
  final def getTextOverrunBehavior(column: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TreeItem", "get_text_overrun_behavior", 3782727860L), hostObject.objectPtr, column)

  /** TreeItem.set_structured_text_bidi_override */
  final def setStructuredTextBidiOverride(column: Long, parser: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_structured_text_bidi_override", 868756907L), hostObject.objectPtr, column, parser)

  /** TreeItem.get_structured_text_bidi_override */
  final def getStructuredTextBidiOverride(column: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TreeItem", "get_structured_text_bidi_override", 3377823772L), hostObject.objectPtr, column)

  /** TreeItem.set_language */
  final def setLanguage(column: Long, language: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_language", 501894301L), hostObject.objectPtr, column, language)

  /** TreeItem.get_language */
  final def getLanguage(column: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TreeItem", "get_language", 844755477L), hostObject.objectPtr, column)

  /** TreeItem.set_suffix */
  final def setSuffix(column: Long, text: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_suffix", 501894301L), hostObject.objectPtr, column, text)

  /** TreeItem.get_suffix */
  final def getSuffix(column: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TreeItem", "get_suffix", 844755477L), hostObject.objectPtr, column)

  /** TreeItem.set_icon */
  final def setIcon(column: Long, texture: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_icon", 666127730L), hostObject.objectPtr, column, texture.hostObject)

  /** TreeItem.get_icon */
  final def getIcon(column: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TreeItem", "get_icon", 3536238170L), hostObject.objectPtr, column)

  /** TreeItem.set_icon_overlay */
  final def setIconOverlay(column: Long, texture: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_icon_overlay", 666127730L), hostObject.objectPtr, column, texture.hostObject)

  /** TreeItem.get_icon_overlay */
  final def getIconOverlay(column: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TreeItem", "get_icon_overlay", 3536238170L), hostObject.objectPtr, column)

  /** TreeItem.set_icon_region */
  final def setIconRegion(column: Long, region: gdext.builtin.Rect2): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_icon_region", 1356297692L), hostObject.objectPtr, column, region)

  /** TreeItem.get_icon_region */
  final def getIconRegion(column: Long): gdext.builtin.Rect2 =
    Ptrcall.call1[Long, gdext.builtin.Rect2](MethodBind.get("TreeItem", "get_icon_region", 3327874267L), hostObject.objectPtr, column)

  /** TreeItem.set_icon_max_width */
  final def setIconMaxWidth(column: Long, width: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_icon_max_width", 3937882851L), hostObject.objectPtr, column, width)

  /** TreeItem.get_icon_max_width */
  final def getIconMaxWidth(column: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TreeItem", "get_icon_max_width", 923996154L), hostObject.objectPtr, column)

  /** TreeItem.set_icon_modulate */
  final def setIconModulate(column: Long, modulate: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_icon_modulate", 2878471219L), hostObject.objectPtr, column, modulate)

  /** TreeItem.get_icon_modulate */
  final def getIconModulate(column: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("TreeItem", "get_icon_modulate", 3457211756L), hostObject.objectPtr, column)

  /** TreeItem.set_range */
  final def setRange(column: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_range", 1602489585L), hostObject.objectPtr, column, value)

  /** TreeItem.get_range */
  final def getRange(column: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("TreeItem", "get_range", 2339986948L), hostObject.objectPtr, column)

  /** TreeItem.set_range_config */
  final def setRangeConfig(column: Long, min: Double, max: Double, step: Double, expr: Boolean): Unit =
    Ptrcall.callVoid5(MethodBind.get("TreeItem", "set_range_config", 1547181014L), hostObject.objectPtr, column, min, max, step, expr)

  /** TreeItem.set_custom_draw */
  final def setCustomDraw(column: Long, `object`: Object, callback: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid3(MethodBind.get("TreeItem", "set_custom_draw", 272420368L), hostObject.objectPtr, column, `object`.hostObject, callback)

  /** TreeItem.set_custom_stylebox */
  final def setCustomStylebox(column: Long, stylebox: StyleBox): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_custom_stylebox", 1433009359L), hostObject.objectPtr, column, stylebox.hostObject)

  /** TreeItem.get_custom_stylebox */
  final def getCustomStylebox(column: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TreeItem", "get_custom_stylebox", 3362509644L), hostObject.objectPtr, column)

  /** TreeItem.set_collapsed */
  final def setCollapsed(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TreeItem", "set_collapsed", 2586408642L), hostObject.objectPtr, enable)

  /** TreeItem.is_collapsed */
  final def isCollapsed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TreeItem", "is_collapsed", 2240911060L), hostObject.objectPtr)

  /** TreeItem.set_collapsed_recursive */
  final def setCollapsedRecursive(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TreeItem", "set_collapsed_recursive", 2586408642L), hostObject.objectPtr, enable)

  /** TreeItem.is_any_collapsed */
  final def isAnyCollapsed(only_visible: Boolean): Boolean =
    Ptrcall.call1[Boolean, Boolean](MethodBind.get("TreeItem", "is_any_collapsed", 2595650253L), hostObject.objectPtr, only_visible)

  /** TreeItem.set_visible */
  final def setVisible(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TreeItem", "set_visible", 2586408642L), hostObject.objectPtr, enable)

  /** TreeItem.is_visible */
  final def isVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TreeItem", "is_visible", 2240911060L), hostObject.objectPtr)

  /** TreeItem.is_visible_in_tree */
  final def isVisibleInTree(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TreeItem", "is_visible_in_tree", 36873697L), hostObject.objectPtr)

  /** TreeItem.uncollapse_tree */
  final def uncollapseTree(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TreeItem", "uncollapse_tree", 3218959716L), hostObject.objectPtr)

  /** TreeItem.set_custom_minimum_height */
  final def setCustomMinimumHeight(height: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TreeItem", "set_custom_minimum_height", 1286410249L), hostObject.objectPtr, height)

  /** TreeItem.get_custom_minimum_height */
  final def getCustomMinimumHeight(): Long =
    Ptrcall.call0[Long](MethodBind.get("TreeItem", "get_custom_minimum_height", 3905245786L), hostObject.objectPtr)

  /** TreeItem.set_selectable */
  final def setSelectable(column: Long, selectable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_selectable", 300928843L), hostObject.objectPtr, column, selectable)

  /** TreeItem.is_selectable */
  final def isSelectable(column: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TreeItem", "is_selectable", 1116898809L), hostObject.objectPtr, column)

  /** TreeItem.is_selected */
  final def isSelected(column: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TreeItem", "is_selected", 3067735520L), hostObject.objectPtr, column)

  /** TreeItem.select */
  final def select(column: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TreeItem", "select", 1286410249L), hostObject.objectPtr, column)

  /** TreeItem.deselect */
  final def deselect(column: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TreeItem", "deselect", 1286410249L), hostObject.objectPtr, column)

  /** TreeItem.set_editable */
  final def setEditable(column: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_editable", 300928843L), hostObject.objectPtr, column, enabled)

  /** TreeItem.is_editable */
  final def isEditable(column: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TreeItem", "is_editable", 3067735520L), hostObject.objectPtr, column)

  /** TreeItem.set_custom_color */
  final def setCustomColor(column: Long, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_custom_color", 2878471219L), hostObject.objectPtr, column, color)

  /** TreeItem.get_custom_color */
  final def getCustomColor(column: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("TreeItem", "get_custom_color", 3457211756L), hostObject.objectPtr, column)

  /** TreeItem.clear_custom_color */
  final def clearCustomColor(column: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TreeItem", "clear_custom_color", 1286410249L), hostObject.objectPtr, column)

  /** TreeItem.set_custom_font */
  final def setCustomFont(column: Long, font: Font): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_custom_font", 2637609184L), hostObject.objectPtr, column, font.hostObject)

  /** TreeItem.get_custom_font */
  final def getCustomFont(column: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TreeItem", "get_custom_font", 4244553094L), hostObject.objectPtr, column)

  /** TreeItem.set_custom_font_size */
  final def setCustomFontSize(column: Long, font_size: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_custom_font_size", 3937882851L), hostObject.objectPtr, column, font_size)

  /** TreeItem.get_custom_font_size */
  final def getCustomFontSize(column: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TreeItem", "get_custom_font_size", 923996154L), hostObject.objectPtr, column)

  /** TreeItem.set_custom_bg_color */
  final def setCustomBgColor(column: Long, color: gdext.builtin.Color, just_outline: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("TreeItem", "set_custom_bg_color", 894174518L), hostObject.objectPtr, column, color, just_outline)

  /** TreeItem.clear_custom_bg_color */
  final def clearCustomBgColor(column: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TreeItem", "clear_custom_bg_color", 1286410249L), hostObject.objectPtr, column)

  /** TreeItem.get_custom_bg_color */
  final def getCustomBgColor(column: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("TreeItem", "get_custom_bg_color", 3457211756L), hostObject.objectPtr, column)

  /** TreeItem.set_custom_as_button */
  final def setCustomAsButton(column: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_custom_as_button", 300928843L), hostObject.objectPtr, column, enable)

  /** TreeItem.is_custom_set_as_button */
  final def isCustomSetAsButton(column: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TreeItem", "is_custom_set_as_button", 1116898809L), hostObject.objectPtr, column)

  /** TreeItem.clear_buttons */
  final def clearButtons(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TreeItem", "clear_buttons", 3218959716L), hostObject.objectPtr)

  /** TreeItem.add_button */
  final def addButton(column: Long, button: Texture2D, id: Long, disabled: Boolean, tooltip_text: String, description: String): Unit =
    Ptrcall.callVoid6(MethodBind.get("TreeItem", "add_button", 973481897L), hostObject.objectPtr, column, button.hostObject, id, disabled, tooltip_text, description)

  /** TreeItem.get_button_count */
  final def getButtonCount(column: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TreeItem", "get_button_count", 923996154L), hostObject.objectPtr, column)

  /** TreeItem.get_button_tooltip_text */
  final def getButtonTooltipText(column: Long, button_index: Long): String =
    Ptrcall.call2[Long, Long, String](MethodBind.get("TreeItem", "get_button_tooltip_text", 1391810591L), hostObject.objectPtr, column, button_index)

  /** TreeItem.get_button_id */
  final def getButtonId(column: Long, button_index: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("TreeItem", "get_button_id", 3175239445L), hostObject.objectPtr, column, button_index)

  /** TreeItem.get_button_by_id */
  final def getButtonById(column: Long, id: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("TreeItem", "get_button_by_id", 3175239445L), hostObject.objectPtr, column, id)

  /** TreeItem.get_button_color */
  final def getButtonColor(column: Long, id: Long): gdext.builtin.Color =
    Ptrcall.call2[Long, Long, gdext.builtin.Color](MethodBind.get("TreeItem", "get_button_color", 2165839948L), hostObject.objectPtr, column, id)

  /** TreeItem.get_button */
  final def getButton(column: Long, button_index: Long): GodotObject =
    Ptrcall.call2[Long, Long, GodotObject](MethodBind.get("TreeItem", "get_button", 2584904275L), hostObject.objectPtr, column, button_index)

  /** TreeItem.set_button_tooltip_text */
  final def setButtonTooltipText(column: Long, button_index: Long, tooltip: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("TreeItem", "set_button_tooltip_text", 2285447957L), hostObject.objectPtr, column, button_index, tooltip)

  /** TreeItem.set_button */
  final def setButton(column: Long, button_index: Long, button: Texture2D): Unit =
    Ptrcall.callVoid3(MethodBind.get("TreeItem", "set_button", 176101966L), hostObject.objectPtr, column, button_index, button.hostObject)

  /** TreeItem.erase_button */
  final def eraseButton(column: Long, button_index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "erase_button", 3937882851L), hostObject.objectPtr, column, button_index)

  /** TreeItem.set_button_description */
  final def setButtonDescription(column: Long, button_index: Long, description: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("TreeItem", "set_button_description", 2285447957L), hostObject.objectPtr, column, button_index, description)

  /** TreeItem.set_button_disabled */
  final def setButtonDisabled(column: Long, button_index: Long, disabled: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("TreeItem", "set_button_disabled", 1383440665L), hostObject.objectPtr, column, button_index, disabled)

  /** TreeItem.set_button_color */
  final def setButtonColor(column: Long, button_index: Long, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid3(MethodBind.get("TreeItem", "set_button_color", 3733378741L), hostObject.objectPtr, column, button_index, color)

  /** TreeItem.is_button_disabled */
  final def isButtonDisabled(column: Long, button_index: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("TreeItem", "is_button_disabled", 2522259332L), hostObject.objectPtr, column, button_index)

  /** TreeItem.set_tooltip_text */
  final def setTooltipText(column: Long, tooltip: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_tooltip_text", 501894301L), hostObject.objectPtr, column, tooltip)

  /** TreeItem.get_tooltip_text */
  final def getTooltipText(column: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TreeItem", "get_tooltip_text", 844755477L), hostObject.objectPtr, column)

  /** TreeItem.set_text_alignment */
  final def setTextAlignment(column: Long, text_alignment: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_text_alignment", 3276431499L), hostObject.objectPtr, column, text_alignment)

  /** TreeItem.get_text_alignment */
  final def getTextAlignment(column: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TreeItem", "get_text_alignment", 4171562184L), hostObject.objectPtr, column)

  /** TreeItem.set_expand_right */
  final def setExpandRight(column: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TreeItem", "set_expand_right", 300928843L), hostObject.objectPtr, column, enable)

  /** TreeItem.get_expand_right */
  final def getExpandRight(column: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TreeItem", "get_expand_right", 1116898809L), hostObject.objectPtr, column)

  /** TreeItem.set_disable_folding */
  final def setDisableFolding(disable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TreeItem", "set_disable_folding", 2586408642L), hostObject.objectPtr, disable)

  /** TreeItem.is_folding_disabled */
  final def isFoldingDisabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TreeItem", "is_folding_disabled", 36873697L), hostObject.objectPtr)

  /** TreeItem.create_child */
  final def createChild(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TreeItem", "create_child", 954243986L), hostObject.objectPtr, index)

  /** TreeItem.add_child */
  final def addChild(child: TreeItem): Unit =
    Ptrcall.callVoid1(MethodBind.get("TreeItem", "add_child", 1819951137L), hostObject.objectPtr, child.hostObject)

  /** TreeItem.remove_child */
  final def removeChild(child: TreeItem): Unit =
    Ptrcall.callVoid1(MethodBind.get("TreeItem", "remove_child", 1819951137L), hostObject.objectPtr, child.hostObject)

  /** TreeItem.get_tree */
  final def getTree(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TreeItem", "get_tree", 2243340556L), hostObject.objectPtr)

  /** TreeItem.get_next */
  final def getNext(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TreeItem", "get_next", 1514277247L), hostObject.objectPtr)

  /** TreeItem.get_prev */
  final def getPrev(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TreeItem", "get_prev", 2768121250L), hostObject.objectPtr)

  /** TreeItem.get_parent */
  final def getParent(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TreeItem", "get_parent", 1514277247L), hostObject.objectPtr)

  /** TreeItem.get_first_child */
  final def getFirstChild(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TreeItem", "get_first_child", 1514277247L), hostObject.objectPtr)

  /** TreeItem.get_next_in_tree */
  final def getNextInTree(wrap: Boolean): GodotObject =
    Ptrcall.call1[Boolean, GodotObject](MethodBind.get("TreeItem", "get_next_in_tree", 1666920593L), hostObject.objectPtr, wrap)

  /** TreeItem.get_prev_in_tree */
  final def getPrevInTree(wrap: Boolean): GodotObject =
    Ptrcall.call1[Boolean, GodotObject](MethodBind.get("TreeItem", "get_prev_in_tree", 1666920593L), hostObject.objectPtr, wrap)

  /** TreeItem.get_next_visible */
  final def getNextVisible(wrap: Boolean): GodotObject =
    Ptrcall.call1[Boolean, GodotObject](MethodBind.get("TreeItem", "get_next_visible", 1666920593L), hostObject.objectPtr, wrap)

  /** TreeItem.get_prev_visible */
  final def getPrevVisible(wrap: Boolean): GodotObject =
    Ptrcall.call1[Boolean, GodotObject](MethodBind.get("TreeItem", "get_prev_visible", 1666920593L), hostObject.objectPtr, wrap)

  /** TreeItem.get_child */
  final def getChild(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TreeItem", "get_child", 306700752L), hostObject.objectPtr, index)

  /** TreeItem.get_child_count */
  final def getChildCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TreeItem", "get_child_count", 2455072627L), hostObject.objectPtr)

  /** TreeItem.get_index */
  final def getIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("TreeItem", "get_index", 2455072627L), hostObject.objectPtr)

  /** TreeItem.move_before */
  final def moveBefore(item: TreeItem): Unit =
    Ptrcall.callVoid1(MethodBind.get("TreeItem", "move_before", 1819951137L), hostObject.objectPtr, item.hostObject)

  /** TreeItem.move_after */
  final def moveAfter(item: TreeItem): Unit =
    Ptrcall.callVoid1(MethodBind.get("TreeItem", "move_after", 1819951137L), hostObject.objectPtr, item.hostObject)

}

object TreeItem {
  /** Class metadata for Gd[TreeItem] lifetime management and casting. */
  given GodotClass[TreeItem] with {
    def className = "TreeItem"
    def isRefCounted = false
    def wrap(o: GodotObject): TreeItem = new TreeItem {}.withHost(o.objectPtr)
    def unwrap(t: TreeItem): GodotObject = t.hostObject
  }
}
