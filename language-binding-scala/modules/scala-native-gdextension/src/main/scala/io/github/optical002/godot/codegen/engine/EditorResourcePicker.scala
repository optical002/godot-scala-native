package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorResourcePicker`, extends `HBoxContainer`. */
abstract class EditorResourcePicker extends HBoxContainer {

  /** EditorResourcePicker.set_base_type */
  final def setBaseType(base_type: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorResourcePicker", "set_base_type", 83702148L), hostObject.objectPtr, base_type)

  /** EditorResourcePicker.get_base_type */
  final def getBaseType(): String =
    Ptrcall.call0[String](MethodBind.get("EditorResourcePicker", "get_base_type", 201670096L), hostObject.objectPtr)

  /** EditorResourcePicker.set_edited_resource */
  final def setEditedResource(resource: Resource): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorResourcePicker", "set_edited_resource", 968641751L), hostObject.objectPtr, resource.hostObject)

  /** EditorResourcePicker.get_edited_resource */
  final def getEditedResource(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorResourcePicker", "get_edited_resource", 2674603643L), hostObject.objectPtr)

  /** EditorResourcePicker.set_toggle_mode */
  final def setToggleMode(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorResourcePicker", "set_toggle_mode", 2586408642L), hostObject.objectPtr, enable)

  /** EditorResourcePicker.is_toggle_mode */
  final def isToggleMode(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorResourcePicker", "is_toggle_mode", 36873697L), hostObject.objectPtr)

  /** EditorResourcePicker.set_toggle_pressed */
  final def setTogglePressed(pressed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorResourcePicker", "set_toggle_pressed", 2586408642L), hostObject.objectPtr, pressed)

  /** EditorResourcePicker.set_editable */
  final def setEditable(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorResourcePicker", "set_editable", 2586408642L), hostObject.objectPtr, enable)

  /** EditorResourcePicker.is_editable */
  final def isEditable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorResourcePicker", "is_editable", 36873697L), hostObject.objectPtr)

}

object EditorResourcePicker {
  /** Class metadata for Gd[EditorResourcePicker] lifetime management and casting. */
  given GodotClass[EditorResourcePicker] with {
    def className = "EditorResourcePicker"
    def isRefCounted = false
    def wrap(o: GodotObject): EditorResourcePicker = new EditorResourcePicker {}.withHost(o.objectPtr)
    def unwrap(t: EditorResourcePicker): GodotObject = t.hostObject
  }
}
