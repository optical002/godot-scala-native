package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorProperty`, extends `Container`. */
abstract class EditorProperty extends Container {
  override def godotClassName: String = "EditorProperty"

  /** EditorProperty.set_label */
  final def setLabel(text: String): Unit = {
    if (gdext.classes.EditorProperty.mb_set_label == null) gdext.classes.EditorProperty.mb_set_label = MethodBind.get("EditorProperty", "set_label", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorProperty.mb_set_label, livePtr, text)
  }

  /** EditorProperty.get_label */
  final def getLabel(): String = {
    if (gdext.classes.EditorProperty.mb_get_label == null) gdext.classes.EditorProperty.mb_get_label = MethodBind.get("EditorProperty", "get_label", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorProperty.mb_get_label, livePtr)
  }

  /** EditorProperty.set_read_only */
  final def setReadOnly(readOnly: Boolean): Unit = {
    if (gdext.classes.EditorProperty.mb_set_read_only == null) gdext.classes.EditorProperty.mb_set_read_only = MethodBind.get("EditorProperty", "set_read_only", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorProperty.mb_set_read_only, livePtr, readOnly)
  }

  /** EditorProperty.is_read_only */
  final def isReadOnly(): Boolean = {
    if (gdext.classes.EditorProperty.mb_is_read_only == null) gdext.classes.EditorProperty.mb_is_read_only = MethodBind.get("EditorProperty", "is_read_only", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorProperty.mb_is_read_only, livePtr)
  }

  /** EditorProperty.set_draw_label */
  final def setDrawLabel(drawLabel: Boolean): Unit = {
    if (gdext.classes.EditorProperty.mb_set_draw_label == null) gdext.classes.EditorProperty.mb_set_draw_label = MethodBind.get("EditorProperty", "set_draw_label", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorProperty.mb_set_draw_label, livePtr, drawLabel)
  }

  /** EditorProperty.is_draw_label */
  final def isDrawLabel(): Boolean = {
    if (gdext.classes.EditorProperty.mb_is_draw_label == null) gdext.classes.EditorProperty.mb_is_draw_label = MethodBind.get("EditorProperty", "is_draw_label", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorProperty.mb_is_draw_label, livePtr)
  }

  /** EditorProperty.set_draw_background */
  final def setDrawBackground(drawBackground: Boolean): Unit = {
    if (gdext.classes.EditorProperty.mb_set_draw_background == null) gdext.classes.EditorProperty.mb_set_draw_background = MethodBind.get("EditorProperty", "set_draw_background", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorProperty.mb_set_draw_background, livePtr, drawBackground)
  }

  /** EditorProperty.is_draw_background */
  final def isDrawBackground(): Boolean = {
    if (gdext.classes.EditorProperty.mb_is_draw_background == null) gdext.classes.EditorProperty.mb_is_draw_background = MethodBind.get("EditorProperty", "is_draw_background", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorProperty.mb_is_draw_background, livePtr)
  }

  /** EditorProperty.set_checkable */
  final def setCheckable(checkable: Boolean): Unit = {
    if (gdext.classes.EditorProperty.mb_set_checkable == null) gdext.classes.EditorProperty.mb_set_checkable = MethodBind.get("EditorProperty", "set_checkable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorProperty.mb_set_checkable, livePtr, checkable)
  }

  /** EditorProperty.is_checkable */
  final def isCheckable(): Boolean = {
    if (gdext.classes.EditorProperty.mb_is_checkable == null) gdext.classes.EditorProperty.mb_is_checkable = MethodBind.get("EditorProperty", "is_checkable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorProperty.mb_is_checkable, livePtr)
  }

  /** EditorProperty.set_checked */
  final def setChecked(checked: Boolean): Unit = {
    if (gdext.classes.EditorProperty.mb_set_checked == null) gdext.classes.EditorProperty.mb_set_checked = MethodBind.get("EditorProperty", "set_checked", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorProperty.mb_set_checked, livePtr, checked)
  }

  /** EditorProperty.is_checked */
  final def isChecked(): Boolean = {
    if (gdext.classes.EditorProperty.mb_is_checked == null) gdext.classes.EditorProperty.mb_is_checked = MethodBind.get("EditorProperty", "is_checked", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorProperty.mb_is_checked, livePtr)
  }

  /** EditorProperty.set_draw_warning */
  final def setDrawWarning(drawWarning: Boolean): Unit = {
    if (gdext.classes.EditorProperty.mb_set_draw_warning == null) gdext.classes.EditorProperty.mb_set_draw_warning = MethodBind.get("EditorProperty", "set_draw_warning", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorProperty.mb_set_draw_warning, livePtr, drawWarning)
  }

  /** EditorProperty.is_draw_warning */
  final def isDrawWarning(): Boolean = {
    if (gdext.classes.EditorProperty.mb_is_draw_warning == null) gdext.classes.EditorProperty.mb_is_draw_warning = MethodBind.get("EditorProperty", "is_draw_warning", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorProperty.mb_is_draw_warning, livePtr)
  }

  /** EditorProperty.set_keying */
  final def setKeying(keying: Boolean): Unit = {
    if (gdext.classes.EditorProperty.mb_set_keying == null) gdext.classes.EditorProperty.mb_set_keying = MethodBind.get("EditorProperty", "set_keying", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorProperty.mb_set_keying, livePtr, keying)
  }

  /** EditorProperty.is_keying */
  final def isKeying(): Boolean = {
    if (gdext.classes.EditorProperty.mb_is_keying == null) gdext.classes.EditorProperty.mb_is_keying = MethodBind.get("EditorProperty", "is_keying", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorProperty.mb_is_keying, livePtr)
  }

  /** EditorProperty.set_deletable */
  final def setDeletable(deletable: Boolean): Unit = {
    if (gdext.classes.EditorProperty.mb_set_deletable == null) gdext.classes.EditorProperty.mb_set_deletable = MethodBind.get("EditorProperty", "set_deletable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorProperty.mb_set_deletable, livePtr, deletable)
  }

  /** EditorProperty.is_deletable */
  final def isDeletable(): Boolean = {
    if (gdext.classes.EditorProperty.mb_is_deletable == null) gdext.classes.EditorProperty.mb_is_deletable = MethodBind.get("EditorProperty", "is_deletable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorProperty.mb_is_deletable, livePtr)
  }

  /** EditorProperty.get_edited_property */
  final def getEditedProperty(): String = {
    if (gdext.classes.EditorProperty.mb_get_edited_property == null) gdext.classes.EditorProperty.mb_get_edited_property = MethodBind.get("EditorProperty", "get_edited_property", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.EditorProperty.mb_get_edited_property, livePtr)
  }

  /** EditorProperty.get_edited_object */
  final def getEditedObject(): Object = {
    if (gdext.classes.EditorProperty.mb_get_edited_object == null) gdext.classes.EditorProperty.mb_get_edited_object = MethodBind.get("EditorProperty", "get_edited_object", 2050059866L)
    Wrappers.borrowed[Object](Ptrcall.call0[Long](gdext.classes.EditorProperty.mb_get_edited_object, livePtr))
  }

  /** EditorProperty.update_property */
  final def updateProperty(): Unit = {
    if (gdext.classes.EditorProperty.mb_update_property == null) gdext.classes.EditorProperty.mb_update_property = MethodBind.get("EditorProperty", "update_property", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorProperty.mb_update_property, livePtr)
  }

  /** EditorProperty.add_focusable */
  final def addFocusable(control: Control): Unit = {
    if (gdext.classes.EditorProperty.mb_add_focusable == null) gdext.classes.EditorProperty.mb_add_focusable = MethodBind.get("EditorProperty", "add_focusable", 1496901182L)
    Ptrcall.callVoid1(gdext.classes.EditorProperty.mb_add_focusable, livePtr, Wrappers.handle(control))
  }

  /** EditorProperty.set_bottom_editor */
  final def setBottomEditor(editor: Control): Unit = {
    if (gdext.classes.EditorProperty.mb_set_bottom_editor == null) gdext.classes.EditorProperty.mb_set_bottom_editor = MethodBind.get("EditorProperty", "set_bottom_editor", 1496901182L)
    Ptrcall.callVoid1(gdext.classes.EditorProperty.mb_set_bottom_editor, livePtr, Wrappers.handle(editor))
  }

  /** EditorProperty.set_selectable */
  final def setSelectable(selectable: Boolean): Unit = {
    if (gdext.classes.EditorProperty.mb_set_selectable == null) gdext.classes.EditorProperty.mb_set_selectable = MethodBind.get("EditorProperty", "set_selectable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorProperty.mb_set_selectable, livePtr, selectable)
  }

  /** EditorProperty.is_selectable */
  final def isSelectable(): Boolean = {
    if (gdext.classes.EditorProperty.mb_is_selectable == null) gdext.classes.EditorProperty.mb_is_selectable = MethodBind.get("EditorProperty", "is_selectable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorProperty.mb_is_selectable, livePtr)
  }

  /** EditorProperty.set_use_folding */
  final def setUseFolding(useFolding: Boolean): Unit = {
    if (gdext.classes.EditorProperty.mb_set_use_folding == null) gdext.classes.EditorProperty.mb_set_use_folding = MethodBind.get("EditorProperty", "set_use_folding", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorProperty.mb_set_use_folding, livePtr, useFolding)
  }

  /** EditorProperty.is_using_folding */
  final def isUsingFolding(): Boolean = {
    if (gdext.classes.EditorProperty.mb_is_using_folding == null) gdext.classes.EditorProperty.mb_is_using_folding = MethodBind.get("EditorProperty", "is_using_folding", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorProperty.mb_is_using_folding, livePtr)
  }

  /** EditorProperty.set_name_split_ratio */
  final def setNameSplitRatio(ratio: Double): Unit = {
    if (gdext.classes.EditorProperty.mb_set_name_split_ratio == null) gdext.classes.EditorProperty.mb_set_name_split_ratio = MethodBind.get("EditorProperty", "set_name_split_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.EditorProperty.mb_set_name_split_ratio, livePtr, ratio)
  }

  /** EditorProperty.get_name_split_ratio */
  final def getNameSplitRatio(): Double = {
    if (gdext.classes.EditorProperty.mb_get_name_split_ratio == null) gdext.classes.EditorProperty.mb_get_name_split_ratio = MethodBind.get("EditorProperty", "get_name_split_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.EditorProperty.mb_get_name_split_ratio, livePtr)
  }

  /** EditorProperty.deselect */
  final def deselect(): Unit = {
    if (gdext.classes.EditorProperty.mb_deselect == null) gdext.classes.EditorProperty.mb_deselect = MethodBind.get("EditorProperty", "deselect", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorProperty.mb_deselect, livePtr)
  }

  /** EditorProperty.is_selected */
  final def isSelected(): Boolean = {
    if (gdext.classes.EditorProperty.mb_is_selected == null) gdext.classes.EditorProperty.mb_is_selected = MethodBind.get("EditorProperty", "is_selected", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorProperty.mb_is_selected, livePtr)
  }

  /** EditorProperty.select */
  final def select(focusable: Long = -1L): Unit = {
    if (gdext.classes.EditorProperty.mb_select == null) gdext.classes.EditorProperty.mb_select = MethodBind.get("EditorProperty", "select", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.EditorProperty.mb_select, livePtr, focusable)
  }

  /** EditorProperty.set_object_and_property */
  final def setObjectAndProperty(`object`: Object, property: String): Unit = {
    if (gdext.classes.EditorProperty.mb_set_object_and_property == null) gdext.classes.EditorProperty.mb_set_object_and_property = MethodBind.get("EditorProperty", "set_object_and_property", 4157606280L)
    Ptrcall.callVoid2(gdext.classes.EditorProperty.mb_set_object_and_property, livePtr, Wrappers.handle(`object`), SnArg(property))
  }

  /** EditorProperty.set_label_reference */
  final def setLabelReference(control: Control): Unit = {
    if (gdext.classes.EditorProperty.mb_set_label_reference == null) gdext.classes.EditorProperty.mb_set_label_reference = MethodBind.get("EditorProperty", "set_label_reference", 1496901182L)
    Ptrcall.callVoid1(gdext.classes.EditorProperty.mb_set_label_reference, livePtr, Wrappers.handle(control))
  }

}

object EditorProperty {
  private[classes] var mb_set_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_read_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_read_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_draw_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_background: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_draw_background: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_checkable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_checkable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_checked: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_checked: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_warning: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_draw_warning: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_keying: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_keying: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_deletable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_deletable: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_edited_property: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_edited_object: GDExtensionMethodBindPtr = null
  private[classes] var mb_update_property: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_focusable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bottom_editor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_selectable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_selectable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_folding: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_folding: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_name_split_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_name_split_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_deselect: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_selected: GDExtensionMethodBindPtr = null
  private[classes] var mb_select: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_object_and_property: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_label_reference: GDExtensionMethodBindPtr = null
}
