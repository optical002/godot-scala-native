package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ProgressBar`, extends `Range`. */
abstract class ProgressBar extends Range {

  /** ProgressBar.set_fill_mode */
  final def setFillMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProgressBar", "set_fill_mode", 1286410249L), hostObject.objectPtr, mode)

  /** ProgressBar.get_fill_mode */
  final def getFillMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("ProgressBar", "get_fill_mode", 2455072627L), hostObject.objectPtr)

  /** ProgressBar.set_show_percentage */
  final def setShowPercentage(visible: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProgressBar", "set_show_percentage", 2586408642L), hostObject.objectPtr, visible)

  /** ProgressBar.is_percentage_shown */
  final def isPercentageShown(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ProgressBar", "is_percentage_shown", 36873697L), hostObject.objectPtr)

  /** ProgressBar.set_indeterminate */
  final def setIndeterminate(indeterminate: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProgressBar", "set_indeterminate", 2586408642L), hostObject.objectPtr, indeterminate)

  /** ProgressBar.is_indeterminate */
  final def isIndeterminate(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ProgressBar", "is_indeterminate", 36873697L), hostObject.objectPtr)

  /** ProgressBar.set_editor_preview_indeterminate */
  final def setEditorPreviewIndeterminate(preview_indeterminate: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProgressBar", "set_editor_preview_indeterminate", 2586408642L), hostObject.objectPtr, preview_indeterminate)

  /** ProgressBar.is_editor_preview_indeterminate_enabled */
  final def isEditorPreviewIndeterminateEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ProgressBar", "is_editor_preview_indeterminate_enabled", 36873697L), hostObject.objectPtr)

}

object ProgressBar {
  /** Class metadata for Gd[ProgressBar] lifetime management and casting. */
  given GodotClass[ProgressBar] with {
    def className = "ProgressBar"
    def isRefCounted = false
    def wrap(o: GodotObject): ProgressBar = new ProgressBar {}.withHost(o.objectPtr)
    def unwrap(t: ProgressBar): GodotObject = t.hostObject
  }
}
