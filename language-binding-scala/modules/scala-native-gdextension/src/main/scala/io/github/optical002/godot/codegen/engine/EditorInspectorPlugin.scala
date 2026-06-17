package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorInspectorPlugin`, extends `RefCounted`. */
abstract class EditorInspectorPlugin extends RefCounted {

  /** EditorInspectorPlugin.add_custom_control */
  final def addCustomControl(control: Control): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorInspectorPlugin", "add_custom_control", 1496901182L), hostObject.objectPtr, control.hostObject)

  /** EditorInspectorPlugin.add_property_editor */
  final def addPropertyEditor(property: String, editor: Control, add_to_end: Boolean, label: String): Unit =
    Ptrcall.callVoid4(MethodBind.get("EditorInspectorPlugin", "add_property_editor", 2042698479L), hostObject.objectPtr, property, editor.hostObject, add_to_end, label)

}

object EditorInspectorPlugin {
  /** Class metadata for Gd[EditorInspectorPlugin] lifetime management and casting. */
  given GodotClass[EditorInspectorPlugin] with {
    def className = "EditorInspectorPlugin"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorInspectorPlugin = new EditorInspectorPlugin {}.withHost(o.objectPtr)
    def unwrap(t: EditorInspectorPlugin): GodotObject = t.hostObject
  }
}
