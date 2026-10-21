package gdext.classes

import gdext.Godot
import gdext.builtin.*
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
  final def setReadOnly(read_only: Boolean): Unit = {
    if (gdext.classes.EditorSpinSlider.mb_set_read_only == null) gdext.classes.EditorSpinSlider.mb_set_read_only = MethodBind.get("EditorSpinSlider", "set_read_only", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorSpinSlider.mb_set_read_only, livePtr, read_only)
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
  final def setControlState(state: Long): Unit = {
    if (gdext.classes.EditorSpinSlider.mb_set_control_state == null) gdext.classes.EditorSpinSlider.mb_set_control_state = MethodBind.get("EditorSpinSlider", "set_control_state", 1324557109L)
    Ptrcall.callVoid1(gdext.classes.EditorSpinSlider.mb_set_control_state, livePtr, state)
  }

  /** EditorSpinSlider.get_control_state */
  final def getControlState(): Long = {
    if (gdext.classes.EditorSpinSlider.mb_get_control_state == null) gdext.classes.EditorSpinSlider.mb_get_control_state = MethodBind.get("EditorSpinSlider", "get_control_state", 3406006200L)
    Ptrcall.call0[Long](gdext.classes.EditorSpinSlider.mb_get_control_state, livePtr)
  }

  /** EditorSpinSlider.set_hide_slider */
  final def setHideSlider(hide_slider: Boolean): Unit = {
    if (gdext.classes.EditorSpinSlider.mb_set_hide_slider == null) gdext.classes.EditorSpinSlider.mb_set_hide_slider = MethodBind.get("EditorSpinSlider", "set_hide_slider", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorSpinSlider.mb_set_hide_slider, livePtr, hide_slider)
  }

  /** EditorSpinSlider.is_hiding_slider */
  final def isHidingSlider(): Boolean = {
    if (gdext.classes.EditorSpinSlider.mb_is_hiding_slider == null) gdext.classes.EditorSpinSlider.mb_is_hiding_slider = MethodBind.get("EditorSpinSlider", "is_hiding_slider", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorSpinSlider.mb_is_hiding_slider, livePtr)
  }

  /** EditorSpinSlider.set_editing_integer */
  final def setEditingInteger(editing_integer: Boolean): Unit = {
    if (gdext.classes.EditorSpinSlider.mb_set_editing_integer == null) gdext.classes.EditorSpinSlider.mb_set_editing_integer = MethodBind.get("EditorSpinSlider", "set_editing_integer", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorSpinSlider.mb_set_editing_integer, livePtr, editing_integer)
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
}
