package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorInspectorPlugin`, extends `RefCounted`. */
abstract class EditorInspectorPlugin extends RefCounted {
  override def godotClassName: String = "EditorInspectorPlugin"

  /** EditorInspectorPlugin.add_custom_control */
  final def addCustomControl(control: Control): Unit = {
    if (gdext.classes.EditorInspectorPlugin.mb_add_custom_control == null) gdext.classes.EditorInspectorPlugin.mb_add_custom_control = MethodBind.get("EditorInspectorPlugin", "add_custom_control", 1496901182L)
    Ptrcall.callVoid1(gdext.classes.EditorInspectorPlugin.mb_add_custom_control, livePtr, Wrappers.handle(control))
  }

  /** EditorInspectorPlugin.add_property_editor */
  final def addPropertyEditor(property: String, editor: Control, addToEnd: Boolean = false, label: String = ""): Unit = {
    if (gdext.classes.EditorInspectorPlugin.mb_add_property_editor == null) gdext.classes.EditorInspectorPlugin.mb_add_property_editor = MethodBind.get("EditorInspectorPlugin", "add_property_editor", 2042698479L)
    Ptrcall.callVoid4(gdext.classes.EditorInspectorPlugin.mb_add_property_editor, livePtr, property, Wrappers.handle(editor), addToEnd, label)
  }

}

object EditorInspectorPlugin {
  private[classes] var mb_add_custom_control: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_property_editor: GDExtensionMethodBindPtr = null
}
