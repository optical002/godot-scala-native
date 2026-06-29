package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorToaster`, extends `HBoxContainer`. */
abstract class EditorToaster extends HBoxContainer {
  override def godotClassName: String = "EditorToaster"

  /** EditorToaster.push_toast */
  final def pushToast(message: String, severity: Long, tooltip: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("EditorToaster", "push_toast", 1813923476L), hostObject.objectPtr, message, severity, tooltip)

}
