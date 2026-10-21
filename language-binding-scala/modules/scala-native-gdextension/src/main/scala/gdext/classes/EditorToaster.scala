package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorToaster`, extends `HBoxContainer`. */
abstract class EditorToaster extends HBoxContainer {
  override def godotClassName: String = "EditorToaster"

  /** EditorToaster.push_toast */
  final def pushToast(message: String, severity: Long, tooltip: String): Unit = {
    if (gdext.classes.EditorToaster.mb_push_toast == null) gdext.classes.EditorToaster.mb_push_toast = MethodBind.get("EditorToaster", "push_toast", 1813923476L)
    Ptrcall.callVoid3(gdext.classes.EditorToaster.mb_push_toast, livePtr, message, severity, tooltip)
  }

}

object EditorToaster {
  private[classes] var mb_push_toast: GDExtensionMethodBindPtr = null
}
