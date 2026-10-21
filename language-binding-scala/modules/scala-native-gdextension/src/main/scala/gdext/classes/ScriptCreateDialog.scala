package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ScriptCreateDialog`, extends `ConfirmationDialog`. */
abstract class ScriptCreateDialog extends ConfirmationDialog {
  override def godotClassName: String = "ScriptCreateDialog"

  /** ScriptCreateDialog.config */
  final def config(inherits: String, path: String, built_in_enabled: Boolean, load_enabled: Boolean): Unit = {
    if (gdext.classes.ScriptCreateDialog.mb_config == null) gdext.classes.ScriptCreateDialog.mb_config = MethodBind.get("ScriptCreateDialog", "config", 869314288L)
    Ptrcall.callVoid4(gdext.classes.ScriptCreateDialog.mb_config, livePtr, inherits, path, built_in_enabled, load_enabled)
  }

}

object ScriptCreateDialog {
  private[classes] var mb_config: GDExtensionMethodBindPtr = null
}
