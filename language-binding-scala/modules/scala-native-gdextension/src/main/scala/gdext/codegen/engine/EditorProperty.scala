package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorProperty`, extends `Container`. */
abstract class EditorProperty extends Container {

  /** EditorProperty.set_label */
  final def setLabel(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorProperty", "set_label", 83702148L), hostObject.objectPtr, text)

  /** EditorProperty.get_label */
  final def getLabel(): String =
    Ptrcall.call0[String](MethodBind.get("EditorProperty", "get_label", 201670096L), hostObject.objectPtr)

  /** EditorProperty.set_read_only */
  final def setReadOnly(read_only: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorProperty", "set_read_only", 2586408642L), hostObject.objectPtr, read_only)

  /** EditorProperty.is_read_only */
  final def isReadOnly(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorProperty", "is_read_only", 36873697L), hostObject.objectPtr)

  /** EditorProperty.set_draw_label */
  final def setDrawLabel(draw_label: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorProperty", "set_draw_label", 2586408642L), hostObject.objectPtr, draw_label)

  /** EditorProperty.is_draw_label */
  final def isDrawLabel(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorProperty", "is_draw_label", 36873697L), hostObject.objectPtr)

  /** EditorProperty.set_draw_background */
  final def setDrawBackground(draw_background: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorProperty", "set_draw_background", 2586408642L), hostObject.objectPtr, draw_background)

  /** EditorProperty.is_draw_background */
  final def isDrawBackground(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorProperty", "is_draw_background", 36873697L), hostObject.objectPtr)

  /** EditorProperty.set_checkable */
  final def setCheckable(checkable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorProperty", "set_checkable", 2586408642L), hostObject.objectPtr, checkable)

  /** EditorProperty.is_checkable */
  final def isCheckable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorProperty", "is_checkable", 36873697L), hostObject.objectPtr)

  /** EditorProperty.set_checked */
  final def setChecked(checked: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorProperty", "set_checked", 2586408642L), hostObject.objectPtr, checked)

  /** EditorProperty.is_checked */
  final def isChecked(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorProperty", "is_checked", 36873697L), hostObject.objectPtr)

  /** EditorProperty.set_draw_warning */
  final def setDrawWarning(draw_warning: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorProperty", "set_draw_warning", 2586408642L), hostObject.objectPtr, draw_warning)

  /** EditorProperty.is_draw_warning */
  final def isDrawWarning(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorProperty", "is_draw_warning", 36873697L), hostObject.objectPtr)

  /** EditorProperty.set_keying */
  final def setKeying(keying: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorProperty", "set_keying", 2586408642L), hostObject.objectPtr, keying)

  /** EditorProperty.is_keying */
  final def isKeying(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorProperty", "is_keying", 36873697L), hostObject.objectPtr)

  /** EditorProperty.set_deletable */
  final def setDeletable(deletable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorProperty", "set_deletable", 2586408642L), hostObject.objectPtr, deletable)

  /** EditorProperty.is_deletable */
  final def isDeletable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorProperty", "is_deletable", 36873697L), hostObject.objectPtr)

  /** EditorProperty.get_edited_property */
  final def getEditedProperty(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("EditorProperty", "get_edited_property", 2002593661L), hostObject.objectPtr)

  /** EditorProperty.get_edited_object */
  final def getEditedObject(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorProperty", "get_edited_object", 2050059866L), hostObject.objectPtr)

  /** EditorProperty.update_property */
  final def updateProperty(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorProperty", "update_property", 3218959716L), hostObject.objectPtr)

  /** EditorProperty.add_focusable */
  final def addFocusable(control: Control): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorProperty", "add_focusable", 1496901182L), hostObject.objectPtr, control.hostObject)

  /** EditorProperty.set_bottom_editor */
  final def setBottomEditor(editor: Control): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorProperty", "set_bottom_editor", 1496901182L), hostObject.objectPtr, editor.hostObject)

  /** EditorProperty.set_selectable */
  final def setSelectable(selectable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorProperty", "set_selectable", 2586408642L), hostObject.objectPtr, selectable)

  /** EditorProperty.is_selectable */
  final def isSelectable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorProperty", "is_selectable", 36873697L), hostObject.objectPtr)

  /** EditorProperty.set_use_folding */
  final def setUseFolding(use_folding: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorProperty", "set_use_folding", 2586408642L), hostObject.objectPtr, use_folding)

  /** EditorProperty.is_using_folding */
  final def isUsingFolding(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorProperty", "is_using_folding", 36873697L), hostObject.objectPtr)

  /** EditorProperty.set_name_split_ratio */
  final def setNameSplitRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorProperty", "set_name_split_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** EditorProperty.get_name_split_ratio */
  final def getNameSplitRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("EditorProperty", "get_name_split_ratio", 1740695150L), hostObject.objectPtr)

  /** EditorProperty.deselect */
  final def deselect(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorProperty", "deselect", 3218959716L), hostObject.objectPtr)

  /** EditorProperty.is_selected */
  final def isSelected(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorProperty", "is_selected", 36873697L), hostObject.objectPtr)

  /** EditorProperty.select */
  final def select(focusable: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorProperty", "select", 1025054187L), hostObject.objectPtr, focusable)

  /** EditorProperty.set_object_and_property */
  final def setObjectAndProperty(`object`: Object, property: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorProperty", "set_object_and_property", 4157606280L), hostObject.objectPtr, `object`.hostObject, property)

  /** EditorProperty.set_label_reference */
  final def setLabelReference(control: Control): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorProperty", "set_label_reference", 1496901182L), hostObject.objectPtr, control.hostObject)

}

object EditorProperty {
  /** Class metadata for Gd[EditorProperty] lifetime management and casting. */
  given GodotClass[EditorProperty] with {
    def className = "EditorProperty"
    def isRefCounted = false
    def wrap(o: GodotObject): EditorProperty = new EditorProperty {}.withHost(o.objectPtr)
    def unwrap(t: EditorProperty): GodotObject = t.hostObject
  }
}
