package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorToaster`, extends `HBoxContainer`. */
abstract class EditorToaster extends HBoxContainer {

  /** EditorToaster.push_toast */
  final def pushToast(message: String, severity: Long, tooltip: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("EditorToaster", "push_toast", 1813923476L), hostObject.objectPtr, message, severity, tooltip)

}

object EditorToaster {
  /** Class metadata for Gd[EditorToaster] lifetime management and casting. */
  given GodotClass[EditorToaster] with {
    def className = "EditorToaster"
    def isRefCounted = false
    def wrap(o: GodotObject): EditorToaster = new EditorToaster {}.withHost(o.objectPtr)
    def unwrap(t: EditorToaster): GodotObject = t.hostObject
  }
}
