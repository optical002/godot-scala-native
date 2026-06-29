package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorVCSInterface`, extends `Object`. */
abstract class EditorVCSInterface extends Object {
  override def godotClassName: String = "EditorVCSInterface"

  /** EditorVCSInterface.popup_error */
  final def popupError(msg: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorVCSInterface", "popup_error", 83702148L), hostObject.objectPtr, msg)

}
