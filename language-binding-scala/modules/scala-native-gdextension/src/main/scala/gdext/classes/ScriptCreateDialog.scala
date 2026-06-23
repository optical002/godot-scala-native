package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ScriptCreateDialog`, extends `ConfirmationDialog`. */
abstract class ScriptCreateDialog extends ConfirmationDialog {

  /** ScriptCreateDialog.config */
  final def config(inherits: String, path: String, built_in_enabled: Boolean, load_enabled: Boolean): Unit =
    Ptrcall.callVoid4(MethodBind.get("ScriptCreateDialog", "config", 869314288L), hostObject.objectPtr, inherits, path, built_in_enabled, load_enabled)

}

object ScriptCreateDialog {
  /** Class metadata for Gd[ScriptCreateDialog] lifetime management and casting. */
  given GodotClass[ScriptCreateDialog] with {
    def className = "ScriptCreateDialog"
    def isRefCounted = false
    def wrap(o: GodotObject): ScriptCreateDialog = new ScriptCreateDialog {}.withHost(o.objectPtr)
    def unwrap(t: ScriptCreateDialog): GodotObject = t.hostObject
  }
}
