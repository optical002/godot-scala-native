package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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
  final def setEditorPreviewIndeterminate(previewIndeterminate: Boolean): Unit = {
    if (gdext.classes.ProgressBar.mb_set_editor_preview_indeterminate == null) gdext.classes.ProgressBar.mb_set_editor_preview_indeterminate = MethodBind.get("ProgressBar", "set_editor_preview_indeterminate", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ProgressBar.mb_set_editor_preview_indeterminate, livePtr, previewIndeterminate)
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

  /** Godot enum `ProgressBar.FillMode`. */
  opaque type FillMode <: Long = Long

  object FillMode {
    final val BeginToEnd: FillMode = 0L.asInstanceOf[FillMode]
    final val EndToBegin: FillMode = 1L.asInstanceOf[FillMode]
    final val TopToBottom: FillMode = 2L.asInstanceOf[FillMode]
    final val BottomToTop: FillMode = 3L.asInstanceOf[FillMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FillMode = value.asInstanceOf[FillMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FillMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[FillMode]]

    extension (self: FillMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "BeginToEnd"
        case 1L => "EndToBegin"
        case 2L => "TopToBottom"
        case 3L => "BottomToTop"
        case other => other.toString
      }
  }
}
