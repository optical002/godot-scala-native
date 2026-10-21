package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorResourcePicker`, extends `HBoxContainer`. */
abstract class EditorResourcePicker extends HBoxContainer {
  override def godotClassName: String = "EditorResourcePicker"

  /** EditorResourcePicker.set_base_type */
  final def setBaseType(base_type: String): Unit = {
    if (gdext.classes.EditorResourcePicker.mb_set_base_type == null) gdext.classes.EditorResourcePicker.mb_set_base_type = MethodBind.get("EditorResourcePicker", "set_base_type", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorResourcePicker.mb_set_base_type, livePtr, base_type)
  }

  /** EditorResourcePicker.get_base_type */
  final def getBaseType(): String = {
    if (gdext.classes.EditorResourcePicker.mb_get_base_type == null) gdext.classes.EditorResourcePicker.mb_get_base_type = MethodBind.get("EditorResourcePicker", "get_base_type", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorResourcePicker.mb_get_base_type, livePtr)
  }

  /** EditorResourcePicker.set_edited_resource */
  final def setEditedResource(resource: Resource): Unit = {
    if (gdext.classes.EditorResourcePicker.mb_set_edited_resource == null) gdext.classes.EditorResourcePicker.mb_set_edited_resource = MethodBind.get("EditorResourcePicker", "set_edited_resource", 968641751L)
    Ptrcall.callVoid1(gdext.classes.EditorResourcePicker.mb_set_edited_resource, livePtr, Wrappers.handle(resource))
  }

  /** EditorResourcePicker.get_edited_resource. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getEditedResource(): Resource = {
    if (gdext.classes.EditorResourcePicker.mb_get_edited_resource == null) gdext.classes.EditorResourcePicker.mb_get_edited_resource = MethodBind.get("EditorResourcePicker", "get_edited_resource", 2674603643L)
    Wrappers.owned[Resource](Ptrcall.call0[Long](gdext.classes.EditorResourcePicker.mb_get_edited_resource, livePtr))
  }

  /** EditorResourcePicker.set_toggle_mode */
  final def setToggleMode(enable: Boolean): Unit = {
    if (gdext.classes.EditorResourcePicker.mb_set_toggle_mode == null) gdext.classes.EditorResourcePicker.mb_set_toggle_mode = MethodBind.get("EditorResourcePicker", "set_toggle_mode", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorResourcePicker.mb_set_toggle_mode, livePtr, enable)
  }

  /** EditorResourcePicker.is_toggle_mode */
  final def isToggleMode(): Boolean = {
    if (gdext.classes.EditorResourcePicker.mb_is_toggle_mode == null) gdext.classes.EditorResourcePicker.mb_is_toggle_mode = MethodBind.get("EditorResourcePicker", "is_toggle_mode", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorResourcePicker.mb_is_toggle_mode, livePtr)
  }

  /** EditorResourcePicker.set_toggle_pressed */
  final def setTogglePressed(pressed: Boolean): Unit = {
    if (gdext.classes.EditorResourcePicker.mb_set_toggle_pressed == null) gdext.classes.EditorResourcePicker.mb_set_toggle_pressed = MethodBind.get("EditorResourcePicker", "set_toggle_pressed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorResourcePicker.mb_set_toggle_pressed, livePtr, pressed)
  }

  /** EditorResourcePicker.set_editable */
  final def setEditable(enable: Boolean): Unit = {
    if (gdext.classes.EditorResourcePicker.mb_set_editable == null) gdext.classes.EditorResourcePicker.mb_set_editable = MethodBind.get("EditorResourcePicker", "set_editable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorResourcePicker.mb_set_editable, livePtr, enable)
  }

  /** EditorResourcePicker.is_editable */
  final def isEditable(): Boolean = {
    if (gdext.classes.EditorResourcePicker.mb_is_editable == null) gdext.classes.EditorResourcePicker.mb_is_editable = MethodBind.get("EditorResourcePicker", "is_editable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorResourcePicker.mb_is_editable, livePtr)
  }

}

object EditorResourcePicker {
  private[classes] var mb_set_base_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_base_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_edited_resource: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_edited_resource: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_toggle_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_toggle_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_toggle_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_editable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editable: GDExtensionMethodBindPtr = null
}
