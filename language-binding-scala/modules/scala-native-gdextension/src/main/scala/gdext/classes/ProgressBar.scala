package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ProgressBar`, extends `Range`. */
abstract class ProgressBar extends Range {
  override def godotClassName: String = "ProgressBar"

  /** ProgressBar.set_fill_mode */
  final def setFillMode(mode: Long): Unit = {
    if (gdext.classes.ProgressBar.mb_set_fill_mode == null) gdext.classes.ProgressBar.mb_set_fill_mode = MethodBind.get("ProgressBar", "set_fill_mode", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ProgressBar.mb_set_fill_mode, livePtr, mode)
  }

  /** ProgressBar.get_fill_mode */
  final def getFillMode(): Long = {
    if (gdext.classes.ProgressBar.mb_get_fill_mode == null) gdext.classes.ProgressBar.mb_get_fill_mode = MethodBind.get("ProgressBar", "get_fill_mode", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.ProgressBar.mb_get_fill_mode, livePtr)
  }

  /** ProgressBar.set_show_percentage */
  final def setShowPercentage(visible: Boolean): Unit = {
    if (gdext.classes.ProgressBar.mb_set_show_percentage == null) gdext.classes.ProgressBar.mb_set_show_percentage = MethodBind.get("ProgressBar", "set_show_percentage", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ProgressBar.mb_set_show_percentage, livePtr, visible)
  }

  /** ProgressBar.is_percentage_shown */
  final def isPercentageShown(): Boolean = {
    if (gdext.classes.ProgressBar.mb_is_percentage_shown == null) gdext.classes.ProgressBar.mb_is_percentage_shown = MethodBind.get("ProgressBar", "is_percentage_shown", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ProgressBar.mb_is_percentage_shown, livePtr)
  }

  /** ProgressBar.set_indeterminate */
  final def setIndeterminate(indeterminate: Boolean): Unit = {
    if (gdext.classes.ProgressBar.mb_set_indeterminate == null) gdext.classes.ProgressBar.mb_set_indeterminate = MethodBind.get("ProgressBar", "set_indeterminate", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ProgressBar.mb_set_indeterminate, livePtr, indeterminate)
  }

  /** ProgressBar.is_indeterminate */
  final def isIndeterminate(): Boolean = {
    if (gdext.classes.ProgressBar.mb_is_indeterminate == null) gdext.classes.ProgressBar.mb_is_indeterminate = MethodBind.get("ProgressBar", "is_indeterminate", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ProgressBar.mb_is_indeterminate, livePtr)
  }

  /** ProgressBar.set_editor_preview_indeterminate */
  final def setEditorPreviewIndeterminate(preview_indeterminate: Boolean): Unit = {
    if (gdext.classes.ProgressBar.mb_set_editor_preview_indeterminate == null) gdext.classes.ProgressBar.mb_set_editor_preview_indeterminate = MethodBind.get("ProgressBar", "set_editor_preview_indeterminate", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ProgressBar.mb_set_editor_preview_indeterminate, livePtr, preview_indeterminate)
  }

  /** ProgressBar.is_editor_preview_indeterminate_enabled */
  final def isEditorPreviewIndeterminateEnabled(): Boolean = {
    if (gdext.classes.ProgressBar.mb_is_editor_preview_indeterminate_enabled == null) gdext.classes.ProgressBar.mb_is_editor_preview_indeterminate_enabled = MethodBind.get("ProgressBar", "is_editor_preview_indeterminate_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ProgressBar.mb_is_editor_preview_indeterminate_enabled, livePtr)
  }

}

object ProgressBar {
  private[classes] var mb_set_fill_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fill_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_show_percentage: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_percentage_shown: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_indeterminate: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_indeterminate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_editor_preview_indeterminate: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editor_preview_indeterminate_enabled: GDExtensionMethodBindPtr = null
}
