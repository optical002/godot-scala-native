package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorVCSInterface`, extends `Object`. */
abstract class EditorVCSInterface extends Object {
  override def godotClassName: String = "EditorVCSInterface"

  /** EditorVCSInterface.popup_error */
  final def popupError(msg: String): Unit = {
    if (gdext.classes.EditorVCSInterface.mb_popup_error == null) gdext.classes.EditorVCSInterface.mb_popup_error = MethodBind.get("EditorVCSInterface", "popup_error", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorVCSInterface.mb_popup_error, livePtr, msg)
  }

}

object EditorVCSInterface {
  private[classes] var mb_popup_error: GDExtensionMethodBindPtr = null
}
