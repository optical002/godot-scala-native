package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TreeItem`, extends `Object`. */
abstract class TreeItem extends Object {
  override def godotClassName: String = "TreeItem"

  /** TreeItem.set_cell_mode */
  final def setCellMode(column: Long, mode: gdext.classes.TreeItem.TreeCellMode): Unit = {
    if (gdext.classes.TreeItem.mb_set_cell_mode == null) gdext.classes.TreeItem.mb_set_cell_mode = MethodBind.get("TreeItem", "set_cell_mode", 289920701L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_cell_mode, livePtr, column, mode)
  }

  /** TreeItem.get_cell_mode */
  final def getCellMode(column: Long): gdext.classes.TreeItem.TreeCellMode = {
    if (gdext.classes.TreeItem.mb_get_cell_mode == null) gdext.classes.TreeItem.mb_get_cell_mode = MethodBind.get("TreeItem", "get_cell_mode", 3406114978L)
    gdext.classes.TreeItem.TreeCellMode(Ptrcall.call1[Long, Long](gdext.classes.TreeItem.mb_get_cell_mode, livePtr, column))
  }

  /** TreeItem.set_auto_translate_mode */
  final def setAutoTranslateMode(column: Long, mode: gdext.classes.Node.AutoTranslateMode): Unit = {
    if (gdext.classes.TreeItem.mb_set_auto_translate_mode == null) gdext.classes.TreeItem.mb_set_auto_translate_mode = MethodBind.get("TreeItem", "set_auto_translate_mode", 287402019L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_auto_translate_mode, livePtr, column, mode)
  }

  /** TreeItem.get_auto_translate_mode */
  final def getAutoTranslateMode(column: Long): gdext.classes.Node.AutoTranslateMode = {
    if (gdext.classes.TreeItem.mb_get_auto_translate_mode == null) gdext.classes.TreeItem.mb_get_auto_translate_mode = MethodBind.get("TreeItem", "get_auto_translate_mode", 906302372L)
    gdext.classes.Node.AutoTranslateMode(Ptrcall.call1[Long, Long](gdext.classes.TreeItem.mb_get_auto_translate_mode, livePtr, column))
  }

  /** TreeItem.set_edit_multiline */
  final def setEditMultiline(column: Long, multiline: Boolean): Unit = {
    if (gdext.classes.TreeItem.mb_set_edit_multiline == null) gdext.classes.TreeItem.mb_set_edit_multiline = MethodBind.get("TreeItem", "set_edit_multiline", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_edit_multiline, livePtr, column, multiline)
  }

  /** TreeItem.is_edit_multiline */
  final def isEditMultiline(column: Long): Boolean = {
    if (gdext.classes.TreeItem.mb_is_edit_multiline == null) gdext.classes.TreeItem.mb_is_edit_multiline = MethodBind.get("TreeItem", "is_edit_multiline", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TreeItem.mb_is_edit_multiline, livePtr, column)
  }

  /** TreeItem.set_checked */
  final def setChecked(column: Long, checked: Boolean): Unit = {
    if (gdext.classes.TreeItem.mb_set_checked == null) gdext.classes.TreeItem.mb_set_checked = MethodBind.get("TreeItem", "set_checked", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_checked, livePtr, column, checked)
  }

  /** TreeItem.set_indeterminate */
  final def setIndeterminate(column: Long, indeterminate: Boolean): Unit = {
    if (gdext.classes.TreeItem.mb_set_indeterminate == null) gdext.classes.TreeItem.mb_set_indeterminate = MethodBind.get("TreeItem", "set_indeterminate", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_indeterminate, livePtr, column, indeterminate)
  }

  /** TreeItem.is_checked */
  final def isChecked(column: Long): Boolean = {
    if (gdext.classes.TreeItem.mb_is_checked == null) gdext.classes.TreeItem.mb_is_checked = MethodBind.get("TreeItem", "is_checked", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TreeItem.mb_is_checked, livePtr, column)
  }

  /** TreeItem.is_indeterminate */
  final def isIndeterminate(column: Long): Boolean = {
    if (gdext.classes.TreeItem.mb_is_indeterminate == null) gdext.classes.TreeItem.mb_is_indeterminate = MethodBind.get("TreeItem", "is_indeterminate", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TreeItem.mb_is_indeterminate, livePtr, column)
  }

  /** TreeItem.propagate_check */
  final def propagateCheck(column: Long, emitSignal: Boolean = true): Unit = {
    if (gdext.classes.TreeItem.mb_propagate_check == null) gdext.classes.TreeItem.mb_propagate_check = MethodBind.get("TreeItem", "propagate_check", 972357352L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_propagate_check, livePtr, column, emitSignal)
  }

  /** TreeItem.set_text */
  final def setText(column: Long, text: String): Unit = {
    if (gdext.classes.TreeItem.mb_set_text == null) gdext.classes.TreeItem.mb_set_text = MethodBind.get("TreeItem", "set_text", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_text, livePtr, column, text)
  }

  /** TreeItem.get_text */
  final def getText(column: Long): String = {
    if (gdext.classes.TreeItem.mb_get_text == null) gdext.classes.TreeItem.mb_get_text = MethodBind.get("TreeItem", "get_text", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TreeItem.mb_get_text, livePtr, column)
  }

  /** TreeItem.set_description */
  final def setDescription(column: Long, description: String): Unit = {
    if (gdext.classes.TreeItem.mb_set_description == null) gdext.classes.TreeItem.mb_set_description = MethodBind.get("TreeItem", "set_description", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_description, livePtr, column, description)
  }

  /** TreeItem.get_description */
  final def getDescription(column: Long): String = {
    if (gdext.classes.TreeItem.mb_get_description == null) gdext.classes.TreeItem.mb_get_description = MethodBind.get("TreeItem", "get_description", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TreeItem.mb_get_description, livePtr, column)
  }

  /** TreeItem.set_text_direction */
  final def setTextDirection(column: Long, direction: gdext.classes.Control.TextDirection): Unit = {
    if (gdext.classes.TreeItem.mb_set_text_direction == null) gdext.classes.TreeItem.mb_set_text_direction = MethodBind.get("TreeItem", "set_text_direction", 1707680378L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_text_direction, livePtr, column, direction)
  }

  /** TreeItem.get_text_direction */
  final def getTextDirection(column: Long): gdext.classes.Control.TextDirection = {
    if (gdext.classes.TreeItem.mb_get_text_direction == null) gdext.classes.TreeItem.mb_get_text_direction = MethodBind.get("TreeItem", "get_text_direction", 4235602388L)
    gdext.classes.Control.TextDirection(Ptrcall.call1[Long, Long](gdext.classes.TreeItem.mb_get_text_direction, livePtr, column))
  }

  /** TreeItem.set_autowrap_mode */
  final def setAutowrapMode(column: Long, autowrapMode: gdext.classes.TextServer.AutowrapMode): Unit = {
    if (gdext.classes.TreeItem.mb_set_autowrap_mode == null) gdext.classes.TreeItem.mb_set_autowrap_mode = MethodBind.get("TreeItem", "set_autowrap_mode", 3633006561L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_autowrap_mode, livePtr, column, autowrapMode)
  }

  /** TreeItem.get_autowrap_mode */
  final def getAutowrapMode(column: Long): gdext.classes.TextServer.AutowrapMode = {
    if (gdext.classes.TreeItem.mb_get_autowrap_mode == null) gdext.classes.TreeItem.mb_get_autowrap_mode = MethodBind.get("TreeItem", "get_autowrap_mode", 2902757236L)
    gdext.classes.TextServer.AutowrapMode(Ptrcall.call1[Long, Long](gdext.classes.TreeItem.mb_get_autowrap_mode, livePtr, column))
  }

  /** TreeItem.set_text_overrun_behavior */
  final def setTextOverrunBehavior(column: Long, overrunBehavior: gdext.classes.TextServer.OverrunBehavior): Unit = {
    if (gdext.classes.TreeItem.mb_set_text_overrun_behavior == null) gdext.classes.TreeItem.mb_set_text_overrun_behavior = MethodBind.get("TreeItem", "set_text_overrun_behavior", 1940772195L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_text_overrun_behavior, livePtr, column, overrunBehavior)
  }

  /** TreeItem.get_text_overrun_behavior */
  final def getTextOverrunBehavior(column: Long): gdext.classes.TextServer.OverrunBehavior = {
    if (gdext.classes.TreeItem.mb_get_text_overrun_behavior == null) gdext.classes.TreeItem.mb_get_text_overrun_behavior = MethodBind.get("TreeItem", "get_text_overrun_behavior", 3782727860L)
    gdext.classes.TextServer.OverrunBehavior(Ptrcall.call1[Long, Long](gdext.classes.TreeItem.mb_get_text_overrun_behavior, livePtr, column))
  }

  /** TreeItem.set_structured_text_bidi_override */
  final def setStructuredTextBidiOverride(column: Long, parser: gdext.classes.TextServer.StructuredTextParser): Unit = {
    if (gdext.classes.TreeItem.mb_set_structured_text_bidi_override == null) gdext.classes.TreeItem.mb_set_structured_text_bidi_override = MethodBind.get("TreeItem", "set_structured_text_bidi_override", 868756907L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_structured_text_bidi_override, livePtr, column, parser)
  }

  /** TreeItem.get_structured_text_bidi_override */
  final def getStructuredTextBidiOverride(column: Long): gdext.classes.TextServer.StructuredTextParser = {
    if (gdext.classes.TreeItem.mb_get_structured_text_bidi_override == null) gdext.classes.TreeItem.mb_get_structured_text_bidi_override = MethodBind.get("TreeItem", "get_structured_text_bidi_override", 3377823772L)
    gdext.classes.TextServer.StructuredTextParser(Ptrcall.call1[Long, Long](gdext.classes.TreeItem.mb_get_structured_text_bidi_override, livePtr, column))
  }

  /** TreeItem.set_language */
  final def setLanguage(column: Long, language: String): Unit = {
    if (gdext.classes.TreeItem.mb_set_language == null) gdext.classes.TreeItem.mb_set_language = MethodBind.get("TreeItem", "set_language", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_language, livePtr, column, language)
  }

  /** TreeItem.get_language */
  final def getLanguage(column: Long): String = {
    if (gdext.classes.TreeItem.mb_get_language == null) gdext.classes.TreeItem.mb_get_language = MethodBind.get("TreeItem", "get_language", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TreeItem.mb_get_language, livePtr, column)
  }

  /** TreeItem.set_suffix */
  final def setSuffix(column: Long, text: String): Unit = {
    if (gdext.classes.TreeItem.mb_set_suffix == null) gdext.classes.TreeItem.mb_set_suffix = MethodBind.get("TreeItem", "set_suffix", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_suffix, livePtr, column, text)
  }

  /** TreeItem.get_suffix */
  final def getSuffix(column: Long): String = {
    if (gdext.classes.TreeItem.mb_get_suffix == null) gdext.classes.TreeItem.mb_get_suffix = MethodBind.get("TreeItem", "get_suffix", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TreeItem.mb_get_suffix, livePtr, column)
  }

  /** TreeItem.set_icon */
  final def setIcon(column: Long, texture: Texture2D): Unit = {
    if (gdext.classes.TreeItem.mb_set_icon == null) gdext.classes.TreeItem.mb_set_icon = MethodBind.get("TreeItem", "set_icon", 666127730L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_icon, livePtr, column, Wrappers.handle(texture))
  }

  /** TreeItem.get_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getIcon(column: Long): Texture2D = {
    if (gdext.classes.TreeItem.mb_get_icon == null) gdext.classes.TreeItem.mb_get_icon = MethodBind.get("TreeItem", "get_icon", 3536238170L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.TreeItem.mb_get_icon, livePtr, column))
  }

  /** TreeItem.set_icon_overlay */
  final def setIconOverlay(column: Long, texture: Texture2D): Unit = {
    if (gdext.classes.TreeItem.mb_set_icon_overlay == null) gdext.classes.TreeItem.mb_set_icon_overlay = MethodBind.get("TreeItem", "set_icon_overlay", 666127730L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_icon_overlay, livePtr, column, Wrappers.handle(texture))
  }

  /** TreeItem.get_icon_overlay. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getIconOverlay(column: Long): Texture2D = {
    if (gdext.classes.TreeItem.mb_get_icon_overlay == null) gdext.classes.TreeItem.mb_get_icon_overlay = MethodBind.get("TreeItem", "get_icon_overlay", 3536238170L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.TreeItem.mb_get_icon_overlay, livePtr, column))
  }

  /** TreeItem.set_icon_region */
  final def setIconRegion(column: Long, region: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.TreeItem.mb_set_icon_region == null) gdext.classes.TreeItem.mb_set_icon_region = MethodBind.get("TreeItem", "set_icon_region", 1356297692L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_icon_region, livePtr, column, region)
  }

  /** TreeItem.get_icon_region */
  final def getIconRegion(column: Long): gdext.builtin.Rect2 = {
    if (gdext.classes.TreeItem.mb_get_icon_region == null) gdext.classes.TreeItem.mb_get_icon_region = MethodBind.get("TreeItem", "get_icon_region", 3327874267L)
    Ptrcall.call1[Long, gdext.builtin.Rect2](gdext.classes.TreeItem.mb_get_icon_region, livePtr, column)
  }

  /** TreeItem.set_icon_max_width */
  final def setIconMaxWidth(column: Long, width: Long): Unit = {
    if (gdext.classes.TreeItem.mb_set_icon_max_width == null) gdext.classes.TreeItem.mb_set_icon_max_width = MethodBind.get("TreeItem", "set_icon_max_width", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_icon_max_width, livePtr, column, width)
  }

  /** TreeItem.get_icon_max_width */
  final def getIconMaxWidth(column: Long): Long = {
    if (gdext.classes.TreeItem.mb_get_icon_max_width == null) gdext.classes.TreeItem.mb_get_icon_max_width = MethodBind.get("TreeItem", "get_icon_max_width", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TreeItem.mb_get_icon_max_width, livePtr, column)
  }

  /** TreeItem.set_icon_modulate */
  final def setIconModulate(column: Long, modulate: gdext.builtin.Color): Unit = {
    if (gdext.classes.TreeItem.mb_set_icon_modulate == null) gdext.classes.TreeItem.mb_set_icon_modulate = MethodBind.get("TreeItem", "set_icon_modulate", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_icon_modulate, livePtr, column, modulate)
  }

  /** TreeItem.get_icon_modulate */
  final def getIconModulate(column: Long): gdext.builtin.Color = {
    if (gdext.classes.TreeItem.mb_get_icon_modulate == null) gdext.classes.TreeItem.mb_get_icon_modulate = MethodBind.get("TreeItem", "get_icon_modulate", 3457211756L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.TreeItem.mb_get_icon_modulate, livePtr, column)
  }

  /** TreeItem.set_range */
  final def setRange(column: Long, value: Double): Unit = {
    if (gdext.classes.TreeItem.mb_set_range == null) gdext.classes.TreeItem.mb_set_range = MethodBind.get("TreeItem", "set_range", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_range, livePtr, column, value)
  }

  /** TreeItem.get_range */
  final def getRange(column: Long): Double = {
    if (gdext.classes.TreeItem.mb_get_range == null) gdext.classes.TreeItem.mb_get_range = MethodBind.get("TreeItem", "get_range", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.TreeItem.mb_get_range, livePtr, column)
  }

  /** TreeItem.set_range_config */
  final def setRangeConfig(column: Long, min: Double, max: Double, step: Double, expr: Boolean = false): Unit = {
    if (gdext.classes.TreeItem.mb_set_range_config == null) gdext.classes.TreeItem.mb_set_range_config = MethodBind.get("TreeItem", "set_range_config", 1547181014L)
    Ptrcall.callVoid5(gdext.classes.TreeItem.mb_set_range_config, livePtr, column, min, max, step, expr)
  }

  /** TreeItem.set_custom_draw */
  final def setCustomDraw(column: Long, `object`: Object, callback: String): Unit = {
    if (gdext.classes.TreeItem.mb_set_custom_draw == null) gdext.classes.TreeItem.mb_set_custom_draw = MethodBind.get("TreeItem", "set_custom_draw", 272420368L)
    Ptrcall.callVoid3(gdext.classes.TreeItem.mb_set_custom_draw, livePtr, column, Wrappers.handle(`object`), SnArg(callback))
  }

  /** TreeItem.set_custom_stylebox */
  final def setCustomStylebox(column: Long, stylebox: StyleBox): Unit = {
    if (gdext.classes.TreeItem.mb_set_custom_stylebox == null) gdext.classes.TreeItem.mb_set_custom_stylebox = MethodBind.get("TreeItem", "set_custom_stylebox", 1433009359L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_custom_stylebox, livePtr, column, Wrappers.handle(stylebox))
  }

  /** TreeItem.get_custom_stylebox. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCustomStylebox(column: Long): StyleBox = {
    if (gdext.classes.TreeItem.mb_get_custom_stylebox == null) gdext.classes.TreeItem.mb_get_custom_stylebox = MethodBind.get("TreeItem", "get_custom_stylebox", 3362509644L)
    Wrappers.owned[StyleBox](Ptrcall.call1[Long, Long](gdext.classes.TreeItem.mb_get_custom_stylebox, livePtr, column))
  }

  /** TreeItem.set_collapsed */
  final def setCollapsed(enable: Boolean): Unit = {
    if (gdext.classes.TreeItem.mb_set_collapsed == null) gdext.classes.TreeItem.mb_set_collapsed = MethodBind.get("TreeItem", "set_collapsed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TreeItem.mb_set_collapsed, livePtr, enable)
  }

  /** TreeItem.is_collapsed */
  final def isCollapsed(): Boolean = {
    if (gdext.classes.TreeItem.mb_is_collapsed == null) gdext.classes.TreeItem.mb_is_collapsed = MethodBind.get("TreeItem", "is_collapsed", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.TreeItem.mb_is_collapsed, livePtr)
  }

  /** TreeItem.set_collapsed_recursive */
  final def setCollapsedRecursive(enable: Boolean): Unit = {
    if (gdext.classes.TreeItem.mb_set_collapsed_recursive == null) gdext.classes.TreeItem.mb_set_collapsed_recursive = MethodBind.get("TreeItem", "set_collapsed_recursive", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TreeItem.mb_set_collapsed_recursive, livePtr, enable)
  }

  /** TreeItem.is_any_collapsed */
  final def isAnyCollapsed(onlyVisible: Boolean = false): Boolean = {
    if (gdext.classes.TreeItem.mb_is_any_collapsed == null) gdext.classes.TreeItem.mb_is_any_collapsed = MethodBind.get("TreeItem", "is_any_collapsed", 2595650253L)
    Ptrcall.call1[Boolean, Boolean](gdext.classes.TreeItem.mb_is_any_collapsed, livePtr, onlyVisible)
  }

  /** TreeItem.set_visible */
  final def setVisible(enable: Boolean): Unit = {
    if (gdext.classes.TreeItem.mb_set_visible == null) gdext.classes.TreeItem.mb_set_visible = MethodBind.get("TreeItem", "set_visible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TreeItem.mb_set_visible, livePtr, enable)
  }

  /** TreeItem.is_visible */
  final def isVisible(): Boolean = {
    if (gdext.classes.TreeItem.mb_is_visible == null) gdext.classes.TreeItem.mb_is_visible = MethodBind.get("TreeItem", "is_visible", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.TreeItem.mb_is_visible, livePtr)
  }

  /** TreeItem.is_visible_in_tree */
  final def isVisibleInTree(): Boolean = {
    if (gdext.classes.TreeItem.mb_is_visible_in_tree == null) gdext.classes.TreeItem.mb_is_visible_in_tree = MethodBind.get("TreeItem", "is_visible_in_tree", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TreeItem.mb_is_visible_in_tree, livePtr)
  }

  /** TreeItem.uncollapse_tree */
  final def uncollapseTree(): Unit = {
    if (gdext.classes.TreeItem.mb_uncollapse_tree == null) gdext.classes.TreeItem.mb_uncollapse_tree = MethodBind.get("TreeItem", "uncollapse_tree", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TreeItem.mb_uncollapse_tree, livePtr)
  }

  /** TreeItem.set_custom_minimum_height */
  final def setCustomMinimumHeight(height: Long): Unit = {
    if (gdext.classes.TreeItem.mb_set_custom_minimum_height == null) gdext.classes.TreeItem.mb_set_custom_minimum_height = MethodBind.get("TreeItem", "set_custom_minimum_height", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TreeItem.mb_set_custom_minimum_height, livePtr, height)
  }

  /** TreeItem.get_custom_minimum_height */
  final def getCustomMinimumHeight(): Long = {
    if (gdext.classes.TreeItem.mb_get_custom_minimum_height == null) gdext.classes.TreeItem.mb_get_custom_minimum_height = MethodBind.get("TreeItem", "get_custom_minimum_height", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TreeItem.mb_get_custom_minimum_height, livePtr)
  }

  /** TreeItem.set_selectable */
  final def setSelectable(column: Long, selectable: Boolean): Unit = {
    if (gdext.classes.TreeItem.mb_set_selectable == null) gdext.classes.TreeItem.mb_set_selectable = MethodBind.get("TreeItem", "set_selectable", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_selectable, livePtr, column, selectable)
  }

  /** TreeItem.is_selectable */
  final def isSelectable(column: Long): Boolean = {
    if (gdext.classes.TreeItem.mb_is_selectable == null) gdext.classes.TreeItem.mb_is_selectable = MethodBind.get("TreeItem", "is_selectable", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TreeItem.mb_is_selectable, livePtr, column)
  }

  /** TreeItem.is_selected */
  final def isSelected(column: Long): Boolean = {
    if (gdext.classes.TreeItem.mb_is_selected == null) gdext.classes.TreeItem.mb_is_selected = MethodBind.get("TreeItem", "is_selected", 3067735520L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TreeItem.mb_is_selected, livePtr, column)
  }

  /** TreeItem.select */
  final def select(column: Long): Unit = {
    if (gdext.classes.TreeItem.mb_select == null) gdext.classes.TreeItem.mb_select = MethodBind.get("TreeItem", "select", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TreeItem.mb_select, livePtr, column)
  }

  /** TreeItem.deselect */
  final def deselect(column: Long): Unit = {
    if (gdext.classes.TreeItem.mb_deselect == null) gdext.classes.TreeItem.mb_deselect = MethodBind.get("TreeItem", "deselect", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TreeItem.mb_deselect, livePtr, column)
  }

  /** TreeItem.set_editable */
  final def setEditable(column: Long, enabled: Boolean): Unit = {
    if (gdext.classes.TreeItem.mb_set_editable == null) gdext.classes.TreeItem.mb_set_editable = MethodBind.get("TreeItem", "set_editable", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_editable, livePtr, column, enabled)
  }

  /** TreeItem.is_editable */
  final def isEditable(column: Long): Boolean = {
    if (gdext.classes.TreeItem.mb_is_editable == null) gdext.classes.TreeItem.mb_is_editable = MethodBind.get("TreeItem", "is_editable", 3067735520L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TreeItem.mb_is_editable, livePtr, column)
  }

  /** TreeItem.set_custom_color */
  final def setCustomColor(column: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.TreeItem.mb_set_custom_color == null) gdext.classes.TreeItem.mb_set_custom_color = MethodBind.get("TreeItem", "set_custom_color", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_custom_color, livePtr, column, color)
  }

  /** TreeItem.get_custom_color */
  final def getCustomColor(column: Long): gdext.builtin.Color = {
    if (gdext.classes.TreeItem.mb_get_custom_color == null) gdext.classes.TreeItem.mb_get_custom_color = MethodBind.get("TreeItem", "get_custom_color", 3457211756L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.TreeItem.mb_get_custom_color, livePtr, column)
  }

  /** TreeItem.clear_custom_color */
  final def clearCustomColor(column: Long): Unit = {
    if (gdext.classes.TreeItem.mb_clear_custom_color == null) gdext.classes.TreeItem.mb_clear_custom_color = MethodBind.get("TreeItem", "clear_custom_color", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TreeItem.mb_clear_custom_color, livePtr, column)
  }

  /** TreeItem.set_custom_font */
  final def setCustomFont(column: Long, font: Font): Unit = {
    if (gdext.classes.TreeItem.mb_set_custom_font == null) gdext.classes.TreeItem.mb_set_custom_font = MethodBind.get("TreeItem", "set_custom_font", 2637609184L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_custom_font, livePtr, column, Wrappers.handle(font))
  }

  /** TreeItem.get_custom_font. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCustomFont(column: Long): Font = {
    if (gdext.classes.TreeItem.mb_get_custom_font == null) gdext.classes.TreeItem.mb_get_custom_font = MethodBind.get("TreeItem", "get_custom_font", 4244553094L)
    Wrappers.owned[Font](Ptrcall.call1[Long, Long](gdext.classes.TreeItem.mb_get_custom_font, livePtr, column))
  }

  /** TreeItem.set_custom_font_size */
  final def setCustomFontSize(column: Long, fontSize: Long): Unit = {
    if (gdext.classes.TreeItem.mb_set_custom_font_size == null) gdext.classes.TreeItem.mb_set_custom_font_size = MethodBind.get("TreeItem", "set_custom_font_size", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_custom_font_size, livePtr, column, fontSize)
  }

  /** TreeItem.get_custom_font_size */
  final def getCustomFontSize(column: Long): Long = {
    if (gdext.classes.TreeItem.mb_get_custom_font_size == null) gdext.classes.TreeItem.mb_get_custom_font_size = MethodBind.get("TreeItem", "get_custom_font_size", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TreeItem.mb_get_custom_font_size, livePtr, column)
  }

  /** TreeItem.set_custom_bg_color */
  final def setCustomBgColor(column: Long, color: gdext.builtin.Color, justOutline: Boolean = false): Unit = {
    if (gdext.classes.TreeItem.mb_set_custom_bg_color == null) gdext.classes.TreeItem.mb_set_custom_bg_color = MethodBind.get("TreeItem", "set_custom_bg_color", 894174518L)
    Ptrcall.callVoid3(gdext.classes.TreeItem.mb_set_custom_bg_color, livePtr, column, color, justOutline)
  }

  /** TreeItem.clear_custom_bg_color */
  final def clearCustomBgColor(column: Long): Unit = {
    if (gdext.classes.TreeItem.mb_clear_custom_bg_color == null) gdext.classes.TreeItem.mb_clear_custom_bg_color = MethodBind.get("TreeItem", "clear_custom_bg_color", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TreeItem.mb_clear_custom_bg_color, livePtr, column)
  }

  /** TreeItem.get_custom_bg_color */
  final def getCustomBgColor(column: Long): gdext.builtin.Color = {
    if (gdext.classes.TreeItem.mb_get_custom_bg_color == null) gdext.classes.TreeItem.mb_get_custom_bg_color = MethodBind.get("TreeItem", "get_custom_bg_color", 3457211756L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.TreeItem.mb_get_custom_bg_color, livePtr, column)
  }

  /** TreeItem.set_custom_as_button */
  final def setCustomAsButton(column: Long, enable: Boolean): Unit = {
    if (gdext.classes.TreeItem.mb_set_custom_as_button == null) gdext.classes.TreeItem.mb_set_custom_as_button = MethodBind.get("TreeItem", "set_custom_as_button", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_custom_as_button, livePtr, column, enable)
  }

  /** TreeItem.is_custom_set_as_button */
  final def isCustomSetAsButton(column: Long): Boolean = {
    if (gdext.classes.TreeItem.mb_is_custom_set_as_button == null) gdext.classes.TreeItem.mb_is_custom_set_as_button = MethodBind.get("TreeItem", "is_custom_set_as_button", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TreeItem.mb_is_custom_set_as_button, livePtr, column)
  }

  /** TreeItem.clear_buttons */
  final def clearButtons(): Unit = {
    if (gdext.classes.TreeItem.mb_clear_buttons == null) gdext.classes.TreeItem.mb_clear_buttons = MethodBind.get("TreeItem", "clear_buttons", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TreeItem.mb_clear_buttons, livePtr)
  }

  /** TreeItem.add_button */
  final def addButton(column: Long, button: Texture2D, id: Long = -1L, disabled: Boolean = false, tooltipText: String = "", description: String = ""): Unit = {
    if (gdext.classes.TreeItem.mb_add_button == null) gdext.classes.TreeItem.mb_add_button = MethodBind.get("TreeItem", "add_button", 973481897L)
    Ptrcall.callVoid6(gdext.classes.TreeItem.mb_add_button, livePtr, column, Wrappers.handle(button), id, disabled, tooltipText, description)
  }

  /** TreeItem.get_button_count */
  final def getButtonCount(column: Long): Long = {
    if (gdext.classes.TreeItem.mb_get_button_count == null) gdext.classes.TreeItem.mb_get_button_count = MethodBind.get("TreeItem", "get_button_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TreeItem.mb_get_button_count, livePtr, column)
  }

  /** TreeItem.get_button_tooltip_text */
  final def getButtonTooltipText(column: Long, buttonIndex: Long): String = {
    if (gdext.classes.TreeItem.mb_get_button_tooltip_text == null) gdext.classes.TreeItem.mb_get_button_tooltip_text = MethodBind.get("TreeItem", "get_button_tooltip_text", 1391810591L)
    Ptrcall.call2[Long, Long, String](gdext.classes.TreeItem.mb_get_button_tooltip_text, livePtr, column, buttonIndex)
  }

  /** TreeItem.get_button_id */
  final def getButtonId(column: Long, buttonIndex: Long): Long = {
    if (gdext.classes.TreeItem.mb_get_button_id == null) gdext.classes.TreeItem.mb_get_button_id = MethodBind.get("TreeItem", "get_button_id", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.TreeItem.mb_get_button_id, livePtr, column, buttonIndex)
  }

  /** TreeItem.get_button_by_id */
  final def getButtonById(column: Long, id: Long): Long = {
    if (gdext.classes.TreeItem.mb_get_button_by_id == null) gdext.classes.TreeItem.mb_get_button_by_id = MethodBind.get("TreeItem", "get_button_by_id", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.TreeItem.mb_get_button_by_id, livePtr, column, id)
  }

  /** TreeItem.get_button_color */
  final def getButtonColor(column: Long, id: Long): gdext.builtin.Color = {
    if (gdext.classes.TreeItem.mb_get_button_color == null) gdext.classes.TreeItem.mb_get_button_color = MethodBind.get("TreeItem", "get_button_color", 2165839948L)
    Ptrcall.call2[Long, Long, gdext.builtin.Color](gdext.classes.TreeItem.mb_get_button_color, livePtr, column, id)
  }

  /** TreeItem.get_button. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getButton(column: Long, buttonIndex: Long): Texture2D = {
    if (gdext.classes.TreeItem.mb_get_button == null) gdext.classes.TreeItem.mb_get_button = MethodBind.get("TreeItem", "get_button", 2584904275L)
    Wrappers.owned[Texture2D](Ptrcall.call2[Long, Long, Long](gdext.classes.TreeItem.mb_get_button, livePtr, column, buttonIndex))
  }

  /** TreeItem.set_button_tooltip_text */
  final def setButtonTooltipText(column: Long, buttonIndex: Long, tooltip: String): Unit = {
    if (gdext.classes.TreeItem.mb_set_button_tooltip_text == null) gdext.classes.TreeItem.mb_set_button_tooltip_text = MethodBind.get("TreeItem", "set_button_tooltip_text", 2285447957L)
    Ptrcall.callVoid3(gdext.classes.TreeItem.mb_set_button_tooltip_text, livePtr, column, buttonIndex, tooltip)
  }

  /** TreeItem.set_button */
  final def setButton(column: Long, buttonIndex: Long, button: Texture2D): Unit = {
    if (gdext.classes.TreeItem.mb_set_button == null) gdext.classes.TreeItem.mb_set_button = MethodBind.get("TreeItem", "set_button", 176101966L)
    Ptrcall.callVoid3(gdext.classes.TreeItem.mb_set_button, livePtr, column, buttonIndex, Wrappers.handle(button))
  }

  /** TreeItem.erase_button */
  final def eraseButton(column: Long, buttonIndex: Long): Unit = {
    if (gdext.classes.TreeItem.mb_erase_button == null) gdext.classes.TreeItem.mb_erase_button = MethodBind.get("TreeItem", "erase_button", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_erase_button, livePtr, column, buttonIndex)
  }

  /** TreeItem.set_button_description */
  final def setButtonDescription(column: Long, buttonIndex: Long, description: String): Unit = {
    if (gdext.classes.TreeItem.mb_set_button_description == null) gdext.classes.TreeItem.mb_set_button_description = MethodBind.get("TreeItem", "set_button_description", 2285447957L)
    Ptrcall.callVoid3(gdext.classes.TreeItem.mb_set_button_description, livePtr, column, buttonIndex, description)
  }

  /** TreeItem.set_button_disabled */
  final def setButtonDisabled(column: Long, buttonIndex: Long, disabled: Boolean): Unit = {
    if (gdext.classes.TreeItem.mb_set_button_disabled == null) gdext.classes.TreeItem.mb_set_button_disabled = MethodBind.get("TreeItem", "set_button_disabled", 1383440665L)
    Ptrcall.callVoid3(gdext.classes.TreeItem.mb_set_button_disabled, livePtr, column, buttonIndex, disabled)
  }

  /** TreeItem.set_button_color */
  final def setButtonColor(column: Long, buttonIndex: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.TreeItem.mb_set_button_color == null) gdext.classes.TreeItem.mb_set_button_color = MethodBind.get("TreeItem", "set_button_color", 3733378741L)
    Ptrcall.callVoid3(gdext.classes.TreeItem.mb_set_button_color, livePtr, column, buttonIndex, color)
  }

  /** TreeItem.is_button_disabled */
  final def isButtonDisabled(column: Long, buttonIndex: Long): Boolean = {
    if (gdext.classes.TreeItem.mb_is_button_disabled == null) gdext.classes.TreeItem.mb_is_button_disabled = MethodBind.get("TreeItem", "is_button_disabled", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.TreeItem.mb_is_button_disabled, livePtr, column, buttonIndex)
  }

  /** TreeItem.set_tooltip_text */
  final def setTooltipText(column: Long, tooltip: String): Unit = {
    if (gdext.classes.TreeItem.mb_set_tooltip_text == null) gdext.classes.TreeItem.mb_set_tooltip_text = MethodBind.get("TreeItem", "set_tooltip_text", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_tooltip_text, livePtr, column, tooltip)
  }

  /** TreeItem.get_tooltip_text */
  final def getTooltipText(column: Long): String = {
    if (gdext.classes.TreeItem.mb_get_tooltip_text == null) gdext.classes.TreeItem.mb_get_tooltip_text = MethodBind.get("TreeItem", "get_tooltip_text", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TreeItem.mb_get_tooltip_text, livePtr, column)
  }

  /** TreeItem.set_text_alignment */
  final def setTextAlignment(column: Long, textAlignment: gdext.classes.HorizontalAlignment): Unit = {
    if (gdext.classes.TreeItem.mb_set_text_alignment == null) gdext.classes.TreeItem.mb_set_text_alignment = MethodBind.get("TreeItem", "set_text_alignment", 3276431499L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_text_alignment, livePtr, column, textAlignment)
  }

  /** TreeItem.get_text_alignment */
  final def getTextAlignment(column: Long): gdext.classes.HorizontalAlignment = {
    if (gdext.classes.TreeItem.mb_get_text_alignment == null) gdext.classes.TreeItem.mb_get_text_alignment = MethodBind.get("TreeItem", "get_text_alignment", 4171562184L)
    gdext.classes.HorizontalAlignment(Ptrcall.call1[Long, Long](gdext.classes.TreeItem.mb_get_text_alignment, livePtr, column))
  }

  /** TreeItem.set_expand_right */
  final def setExpandRight(column: Long, enable: Boolean): Unit = {
    if (gdext.classes.TreeItem.mb_set_expand_right == null) gdext.classes.TreeItem.mb_set_expand_right = MethodBind.get("TreeItem", "set_expand_right", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TreeItem.mb_set_expand_right, livePtr, column, enable)
  }

  /** TreeItem.get_expand_right */
  final def getExpandRight(column: Long): Boolean = {
    if (gdext.classes.TreeItem.mb_get_expand_right == null) gdext.classes.TreeItem.mb_get_expand_right = MethodBind.get("TreeItem", "get_expand_right", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TreeItem.mb_get_expand_right, livePtr, column)
  }

  /** TreeItem.set_disable_folding */
  final def setDisableFolding(disable: Boolean): Unit = {
    if (gdext.classes.TreeItem.mb_set_disable_folding == null) gdext.classes.TreeItem.mb_set_disable_folding = MethodBind.get("TreeItem", "set_disable_folding", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TreeItem.mb_set_disable_folding, livePtr, disable)
  }

  /** TreeItem.is_folding_disabled */
  final def isFoldingDisabled(): Boolean = {
    if (gdext.classes.TreeItem.mb_is_folding_disabled == null) gdext.classes.TreeItem.mb_is_folding_disabled = MethodBind.get("TreeItem", "is_folding_disabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TreeItem.mb_is_folding_disabled, livePtr)
  }

  /** TreeItem.create_child */
  final def createChild(index: Long = -1L): TreeItem = {
    if (gdext.classes.TreeItem.mb_create_child == null) gdext.classes.TreeItem.mb_create_child = MethodBind.get("TreeItem", "create_child", 954243986L)
    Wrappers.borrowed[TreeItem](Ptrcall.call1[Long, Long](gdext.classes.TreeItem.mb_create_child, livePtr, index))
  }

  /** TreeItem.add_child */
  final def addChild(child: TreeItem): Unit = {
    if (gdext.classes.TreeItem.mb_add_child == null) gdext.classes.TreeItem.mb_add_child = MethodBind.get("TreeItem", "add_child", 1819951137L)
    Ptrcall.callVoid1(gdext.classes.TreeItem.mb_add_child, livePtr, Wrappers.handle(child))
  }

  /** TreeItem.remove_child */
  final def removeChild(child: TreeItem): Unit = {
    if (gdext.classes.TreeItem.mb_remove_child == null) gdext.classes.TreeItem.mb_remove_child = MethodBind.get("TreeItem", "remove_child", 1819951137L)
    Ptrcall.callVoid1(gdext.classes.TreeItem.mb_remove_child, livePtr, Wrappers.handle(child))
  }

  /** TreeItem.get_tree */
  final def getTree(): Tree = {
    if (gdext.classes.TreeItem.mb_get_tree == null) gdext.classes.TreeItem.mb_get_tree = MethodBind.get("TreeItem", "get_tree", 2243340556L)
    Wrappers.borrowed[Tree](Ptrcall.call0[Long](gdext.classes.TreeItem.mb_get_tree, livePtr))
  }

  /** TreeItem.get_next */
  final def getNext(): TreeItem = {
    if (gdext.classes.TreeItem.mb_get_next == null) gdext.classes.TreeItem.mb_get_next = MethodBind.get("TreeItem", "get_next", 1514277247L)
    Wrappers.borrowed[TreeItem](Ptrcall.call0[Long](gdext.classes.TreeItem.mb_get_next, livePtr))
  }

  /** TreeItem.get_prev */
  final def getPrev(): TreeItem = {
    if (gdext.classes.TreeItem.mb_get_prev == null) gdext.classes.TreeItem.mb_get_prev = MethodBind.get("TreeItem", "get_prev", 2768121250L)
    Wrappers.borrowed[TreeItem](Ptrcall.call0[Long](gdext.classes.TreeItem.mb_get_prev, livePtr))
  }

  /** TreeItem.get_parent */
  final def getParent(): TreeItem = {
    if (gdext.classes.TreeItem.mb_get_parent == null) gdext.classes.TreeItem.mb_get_parent = MethodBind.get("TreeItem", "get_parent", 1514277247L)
    Wrappers.borrowed[TreeItem](Ptrcall.call0[Long](gdext.classes.TreeItem.mb_get_parent, livePtr))
  }

  /** TreeItem.get_first_child */
  final def getFirstChild(): TreeItem = {
    if (gdext.classes.TreeItem.mb_get_first_child == null) gdext.classes.TreeItem.mb_get_first_child = MethodBind.get("TreeItem", "get_first_child", 1514277247L)
    Wrappers.borrowed[TreeItem](Ptrcall.call0[Long](gdext.classes.TreeItem.mb_get_first_child, livePtr))
  }

  /** TreeItem.get_next_in_tree */
  final def getNextInTree(wrap: Boolean = false): TreeItem = {
    if (gdext.classes.TreeItem.mb_get_next_in_tree == null) gdext.classes.TreeItem.mb_get_next_in_tree = MethodBind.get("TreeItem", "get_next_in_tree", 1666920593L)
    Wrappers.borrowed[TreeItem](Ptrcall.call1[Boolean, Long](gdext.classes.TreeItem.mb_get_next_in_tree, livePtr, wrap))
  }

  /** TreeItem.get_prev_in_tree */
  final def getPrevInTree(wrap: Boolean = false): TreeItem = {
    if (gdext.classes.TreeItem.mb_get_prev_in_tree == null) gdext.classes.TreeItem.mb_get_prev_in_tree = MethodBind.get("TreeItem", "get_prev_in_tree", 1666920593L)
    Wrappers.borrowed[TreeItem](Ptrcall.call1[Boolean, Long](gdext.classes.TreeItem.mb_get_prev_in_tree, livePtr, wrap))
  }

  /** TreeItem.get_next_visible */
  final def getNextVisible(wrap: Boolean = false): TreeItem = {
    if (gdext.classes.TreeItem.mb_get_next_visible == null) gdext.classes.TreeItem.mb_get_next_visible = MethodBind.get("TreeItem", "get_next_visible", 1666920593L)
    Wrappers.borrowed[TreeItem](Ptrcall.call1[Boolean, Long](gdext.classes.TreeItem.mb_get_next_visible, livePtr, wrap))
  }

  /** TreeItem.get_prev_visible */
  final def getPrevVisible(wrap: Boolean = false): TreeItem = {
    if (gdext.classes.TreeItem.mb_get_prev_visible == null) gdext.classes.TreeItem.mb_get_prev_visible = MethodBind.get("TreeItem", "get_prev_visible", 1666920593L)
    Wrappers.borrowed[TreeItem](Ptrcall.call1[Boolean, Long](gdext.classes.TreeItem.mb_get_prev_visible, livePtr, wrap))
  }

  /** TreeItem.get_child */
  final def getChild(index: Long): TreeItem = {
    if (gdext.classes.TreeItem.mb_get_child == null) gdext.classes.TreeItem.mb_get_child = MethodBind.get("TreeItem", "get_child", 306700752L)
    Wrappers.borrowed[TreeItem](Ptrcall.call1[Long, Long](gdext.classes.TreeItem.mb_get_child, livePtr, index))
  }

  /** TreeItem.get_child_count */
  final def getChildCount(): Long = {
    if (gdext.classes.TreeItem.mb_get_child_count == null) gdext.classes.TreeItem.mb_get_child_count = MethodBind.get("TreeItem", "get_child_count", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.TreeItem.mb_get_child_count, livePtr)
  }

  /** TreeItem.get_index */
  final def getIndex(): Long = {
    if (gdext.classes.TreeItem.mb_get_index == null) gdext.classes.TreeItem.mb_get_index = MethodBind.get("TreeItem", "get_index", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.TreeItem.mb_get_index, livePtr)
  }

  /** TreeItem.move_before */
  final def moveBefore(item: TreeItem): Unit = {
    if (gdext.classes.TreeItem.mb_move_before == null) gdext.classes.TreeItem.mb_move_before = MethodBind.get("TreeItem", "move_before", 1819951137L)
    Ptrcall.callVoid1(gdext.classes.TreeItem.mb_move_before, livePtr, Wrappers.handle(item))
  }

  /** TreeItem.move_after */
  final def moveAfter(item: TreeItem): Unit = {
    if (gdext.classes.TreeItem.mb_move_after == null) gdext.classes.TreeItem.mb_move_after = MethodBind.get("TreeItem", "move_after", 1819951137L)
    Ptrcall.callVoid1(gdext.classes.TreeItem.mb_move_after, livePtr, Wrappers.handle(item))
  }

}

object TreeItem {
  private[classes] var mb_set_cell_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_translate_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_auto_translate_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_edit_multiline: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_edit_multiline: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_checked: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_indeterminate: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_checked: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_indeterminate: GDExtensionMethodBindPtr = null
  private[classes] var mb_propagate_check: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_description: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_description: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autowrap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autowrap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_overrun_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_overrun_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_structured_text_bidi_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_structured_text_bidi_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_suffix: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_suffix: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_icon_overlay: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_icon_overlay: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_icon_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_icon_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_icon_max_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_icon_max_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_icon_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_icon_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_range_config: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_draw: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_stylebox: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_stylebox: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collapsed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collapsed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collapsed_recursive: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_any_collapsed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_visible_in_tree: GDExtensionMethodBindPtr = null
  private[classes] var mb_uncollapse_tree: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_minimum_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_minimum_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_selectable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_selectable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_selected: GDExtensionMethodBindPtr = null
  private[classes] var mb_select: GDExtensionMethodBindPtr = null
  private[classes] var mb_deselect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_editable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_custom_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_bg_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_custom_bg_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_bg_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_as_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_custom_set_as_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_buttons: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_button_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_button_tooltip_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_button_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_button_by_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_button_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_button_tooltip_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_erase_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_button_description: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_button_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_button_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_button_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tooltip_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tooltip_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_expand_right: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_expand_right: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disable_folding: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_folding_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_child: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_child: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_child: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tree: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_next: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_prev: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_parent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_first_child: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_next_in_tree: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_prev_in_tree: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_next_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_prev_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_child: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_child_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_before: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_after: GDExtensionMethodBindPtr = null

  /** Godot enum `TreeItem.TreeCellMode`. */
  opaque type TreeCellMode <: Long = Long

  object TreeCellMode {
    final val String: TreeCellMode = 0L.asInstanceOf[TreeCellMode]
    final val Check: TreeCellMode = 1L.asInstanceOf[TreeCellMode]
    final val Range: TreeCellMode = 2L.asInstanceOf[TreeCellMode]
    final val Icon: TreeCellMode = 3L.asInstanceOf[TreeCellMode]
    final val Custom: TreeCellMode = 4L.asInstanceOf[TreeCellMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TreeCellMode = value.asInstanceOf[TreeCellMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TreeCellMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[TreeCellMode]]

    extension (self: TreeCellMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "String"
        case 1L => "Check"
        case 2L => "Range"
        case 3L => "Icon"
        case 4L => "Custom"
        case other => other.toString
      }
  }
}
