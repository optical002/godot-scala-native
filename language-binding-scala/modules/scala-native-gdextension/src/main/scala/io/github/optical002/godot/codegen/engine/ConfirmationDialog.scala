package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ConfirmationDialog`, extends `AcceptDialog`. */
abstract class ConfirmationDialog extends AcceptDialog {

  /** ConfirmationDialog.get_cancel_button */
  final def getCancelButton(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ConfirmationDialog", "get_cancel_button", 1856205918L), hostObject.objectPtr)

  /** ConfirmationDialog.set_cancel_button_text */
  final def setCancelButtonText(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("ConfirmationDialog", "set_cancel_button_text", 83702148L), hostObject.objectPtr, text)

  /** ConfirmationDialog.get_cancel_button_text */
  final def getCancelButtonText(): String =
    Ptrcall.call0[String](MethodBind.get("ConfirmationDialog", "get_cancel_button_text", 201670096L), hostObject.objectPtr)

}

object ConfirmationDialog {
  /** Class metadata for Gd[ConfirmationDialog] lifetime management and casting. */
  given GodotClass[ConfirmationDialog] with {
    def className = "ConfirmationDialog"
    def isRefCounted = false
    def wrap(o: GodotObject): ConfirmationDialog = new ConfirmationDialog {}.withHost(o.objectPtr)
    def unwrap(t: ConfirmationDialog): GodotObject = t.hostObject
  }
}
