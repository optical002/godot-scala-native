package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ScriptCreateDialog`, extends `ConfirmationDialog`. */
abstract class ScriptCreateDialog extends ConfirmationDialog {
  override def godotClassName: String = "ScriptCreateDialog"

  /** ScriptCreateDialog.config */
  final def config(inherits: String, path: String, built_in_enabled: Boolean, load_enabled: Boolean): Unit =
    Ptrcall.callVoid4(MethodBind.get("ScriptCreateDialog", "config", 869314288L), hostObject.objectPtr, inherits, path, built_in_enabled, load_enabled)

}
