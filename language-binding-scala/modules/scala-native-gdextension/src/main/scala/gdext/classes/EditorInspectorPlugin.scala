package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorInspectorPlugin`, extends `RefCounted`. */
abstract class EditorInspectorPlugin extends RefCounted {
  override def godotClassName: String = "EditorInspectorPlugin"

  /** EditorInspectorPlugin.add_custom_control */
  final def addCustomControl(control: Control): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorInspectorPlugin", "add_custom_control", 1496901182L), hostObject.objectPtr, control.hostObject)

  /** EditorInspectorPlugin.add_property_editor */
  final def addPropertyEditor(property: String, editor: Control, add_to_end: Boolean, label: String): Unit =
    Ptrcall.callVoid4(MethodBind.get("EditorInspectorPlugin", "add_property_editor", 2042698479L), hostObject.objectPtr, property, editor.hostObject, add_to_end, label)

}
