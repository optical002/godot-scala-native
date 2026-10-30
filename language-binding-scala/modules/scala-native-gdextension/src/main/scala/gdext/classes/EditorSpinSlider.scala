package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorSpinSlider`, extends `Range`. */
abstract class EditorSpinSlider extends Range {
  override def godotClassName: String = "EditorSpinSlider"

  /** EditorSpinSlider.set_label */
  final def setLabel(label: String): Unit = {
    if (gdext.classes.EditorSpinSlider.mb_set_label == null) gdext.classes.EditorSpinSlider.mb_set_label = MethodBind.get("EditorSpinSlider", "set_label", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorSpinSlider.mb_set_label, livePtr, label)
  }

  /** EditorSpinSlider.get_label */
  final def getLabel(): String = {
    if (gdext.classes.EditorSpinSlider.mb_get_label == null) gdext.classes.EditorSpinSlider.mb_get_label = MethodBind.get("EditorSpinSlider", "get_label", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorSpinSlider.mb_get_label, livePtr)
  }

  /** EditorSpinSlider.set_suffix */
  final def setSuffix(suffix: String): Unit = {
    if (gdext.classes.EditorSpinSlider.mb_set_suffix == null) gdext.classes.EditorSpinSlider.mb_set_suffix = MethodBind.get("EditorSpinSlider", "set_suffix", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorSpinSlider.mb_set_suffix, livePtr, suffix)
  }

  /** EditorSpinSlider.get_suffix */
  final def getSuffix(): String = {
    if (gdext.classes.EditorSpinSlider.mb_get_suffix == null) gdext.classes.EditorSpinSlider.mb_get_suffix = MethodBind.get("EditorSpinSlider", "get_suffix", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorSpinSlider.mb_get_suffix, livePtr)
  }

  /** EditorSpinSlider.set_read_only */
  final def setReadOnly(readOnly: Boolean): Unit = {
    if (gdext.classes.EditorSpinSlider.mb_set_read_only == null) gdext.classes.EditorSpinSlider.mb_set_read_only = MethodBind.get("EditorSpinSlider", "set_read_only", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorSpinSlider.mb_set_read_only, livePtr, readOnly)
  }

  /** EditorSpinSlider.is_read_only */
  final def isReadOnly(): Boolean = {
    if (gdext.classes.EditorSpinSlider.mb_is_read_only == null) gdext.classes.EditorSpinSlider.mb_is_read_only = MethodBind.get("EditorSpinSlider", "is_read_only", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorSpinSlider.mb_is_read_only, livePtr)
  }

  /** EditorSpinSlider.set_flat */
  final def setFlat(flat: Boolean): Unit = {
    if (gdext.classes.EditorSpinSlider.mb_set_flat == null) gdext.classes.EditorSpinSlider.mb_set_flat = MethodBind.get("EditorSpinSlider", "set_flat", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorSpinSlider.mb_set_flat, livePtr, flat)
  }

  /** EditorSpinSlider.is_flat */
  final def isFlat(): Boolean = {
    if (gdext.classes.EditorSpinSlider.mb_is_flat == null) gdext.classes.EditorSpinSlider.mb_is_flat = MethodBind.get("EditorSpinSlider", "is_flat", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorSpinSlider.mb_is_flat, livePtr)
  }

  /** EditorSpinSlider.set_control_state */
  final def setControlState(state: gdext.classes.EditorSpinSlider.ControlState): Unit = {
    if (gdext.classes.EditorSpinSlider.mb_set_control_state == null) gdext.classes.EditorSpinSlider.mb_set_control_state = MethodBind.get("EditorSpinSlider", "set_control_state", 1324557109L)
    Ptrcall.callVoid1(gdext.classes.EditorSpinSlider.mb_set_control_state, livePtr, state)
  }

  /** EditorSpinSlider.get_control_state */
  final def getControlState(): gdext.classes.EditorSpinSlider.ControlState = {
    if (gdext.classes.EditorSpinSlider.mb_get_control_state == null) gdext.classes.EditorSpinSlider.mb_get_control_state = MethodBind.get("EditorSpinSlider", "get_control_state", 3406006200L)
    gdext.classes.EditorSpinSlider.ControlState(Ptrcall.call0[Long](gdext.classes.EditorSpinSlider.mb_get_control_state, livePtr))
  }

  /** EditorSpinSlider.set_hide_slider */
  final def setHideSlider(hideSlider: Boolean): Unit = {
    if (gdext.classes.EditorSpinSlider.mb_set_hide_slider == null) gdext.classes.EditorSpinSlider.mb_set_hide_slider = MethodBind.get("EditorSpinSlider", "set_hide_slider", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorSpinSlider.mb_set_hide_slider, livePtr, hideSlider)
  }

  /** EditorSpinSlider.is_hiding_slider */
  final def isHidingSlider(): Boolean = {
    if (gdext.classes.EditorSpinSlider.mb_is_hiding_slider == null) gdext.classes.EditorSpinSlider.mb_is_hiding_slider = MethodBind.get("EditorSpinSlider", "is_hiding_slider", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorSpinSlider.mb_is_hiding_slider, livePtr)
  }

  /** EditorSpinSlider.set_editing_integer */
  final def setEditingInteger(editingInteger: Boolean): Unit = {
    if (gdext.classes.EditorSpinSlider.mb_set_editing_integer == null) gdext.classes.EditorSpinSlider.mb_set_editing_integer = MethodBind.get("EditorSpinSlider", "set_editing_integer", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorSpinSlider.mb_set_editing_integer, livePtr, editingInteger)
  }

  /** EditorSpinSlider.is_editing_integer */
  final def isEditingInteger(): Boolean = {
    if (gdext.classes.EditorSpinSlider.mb_is_editing_integer == null) gdext.classes.EditorSpinSlider.mb_is_editing_integer = MethodBind.get("EditorSpinSlider", "is_editing_integer", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorSpinSlider.mb_is_editing_integer, livePtr)
  }

}

object EditorSpinSlider {
  private[classes] var mb_set_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_suffix: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_suffix: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_read_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_read_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flat: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_flat: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_control_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_control_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hide_slider: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_hiding_slider: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_editing_integer: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editing_integer: GDExtensionMethodBindPtr = null

  /** Godot enum `EditorSpinSlider.ControlState`. */
  opaque type ControlState <: Long = Long

  object ControlState {
    final val Default: ControlState = 0L.asInstanceOf[ControlState]
    final val PreferSlider: ControlState = 1L.asInstanceOf[ControlState]
    final val Hide: ControlState = 2L.asInstanceOf[ControlState]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ControlState = value.asInstanceOf[ControlState]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ControlState] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ControlState]]

    extension (self: ControlState)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Default"
        case 1L => "PreferSlider"
        case 2L => "Hide"
        case other => other.toString
      }
  }
}
