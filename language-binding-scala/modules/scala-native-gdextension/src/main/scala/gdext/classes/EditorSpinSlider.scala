package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorSpinSlider`, extends `Range`. */
abstract class EditorSpinSlider extends Range {

  /** EditorSpinSlider.set_label */
  final def setLabel(label: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorSpinSlider", "set_label", 83702148L), hostObject.objectPtr, label)

  /** EditorSpinSlider.get_label */
  final def getLabel(): String =
    Ptrcall.call0[String](MethodBind.get("EditorSpinSlider", "get_label", 201670096L), hostObject.objectPtr)

  /** EditorSpinSlider.set_suffix */
  final def setSuffix(suffix: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorSpinSlider", "set_suffix", 83702148L), hostObject.objectPtr, suffix)

  /** EditorSpinSlider.get_suffix */
  final def getSuffix(): String =
    Ptrcall.call0[String](MethodBind.get("EditorSpinSlider", "get_suffix", 201670096L), hostObject.objectPtr)

  /** EditorSpinSlider.set_read_only */
  final def setReadOnly(read_only: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorSpinSlider", "set_read_only", 2586408642L), hostObject.objectPtr, read_only)

  /** EditorSpinSlider.is_read_only */
  final def isReadOnly(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorSpinSlider", "is_read_only", 36873697L), hostObject.objectPtr)

  /** EditorSpinSlider.set_flat */
  final def setFlat(flat: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorSpinSlider", "set_flat", 2586408642L), hostObject.objectPtr, flat)

  /** EditorSpinSlider.is_flat */
  final def isFlat(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorSpinSlider", "is_flat", 36873697L), hostObject.objectPtr)

  /** EditorSpinSlider.set_control_state */
  final def setControlState(state: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorSpinSlider", "set_control_state", 1324557109L), hostObject.objectPtr, state)

  /** EditorSpinSlider.get_control_state */
  final def getControlState(): Long =
    Ptrcall.call0[Long](MethodBind.get("EditorSpinSlider", "get_control_state", 3406006200L), hostObject.objectPtr)

  /** EditorSpinSlider.set_hide_slider */
  final def setHideSlider(hide_slider: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorSpinSlider", "set_hide_slider", 2586408642L), hostObject.objectPtr, hide_slider)

  /** EditorSpinSlider.is_hiding_slider */
  final def isHidingSlider(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorSpinSlider", "is_hiding_slider", 36873697L), hostObject.objectPtr)

  /** EditorSpinSlider.set_editing_integer */
  final def setEditingInteger(editing_integer: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorSpinSlider", "set_editing_integer", 2586408642L), hostObject.objectPtr, editing_integer)

  /** EditorSpinSlider.is_editing_integer */
  final def isEditingInteger(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorSpinSlider", "is_editing_integer", 36873697L), hostObject.objectPtr)

}

object EditorSpinSlider {
  /** Class metadata for Gd[EditorSpinSlider] lifetime management and casting. */
  given GodotClass[EditorSpinSlider] with {
    def className = "EditorSpinSlider"
    def isRefCounted = false
    def wrap(o: GodotObject): EditorSpinSlider = new EditorSpinSlider {}.withHost(o.objectPtr)
    def unwrap(t: EditorSpinSlider): GodotObject = t.hostObject
  }
}
