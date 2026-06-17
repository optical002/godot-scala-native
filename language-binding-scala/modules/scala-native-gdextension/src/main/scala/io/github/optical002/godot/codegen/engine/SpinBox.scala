package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `SpinBox`, extends `Range`. */
abstract class SpinBox extends Range {

  /** SpinBox.set_horizontal_alignment */
  final def setHorizontalAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpinBox", "set_horizontal_alignment", 2312603777L), hostObject.objectPtr, alignment)

  /** SpinBox.get_horizontal_alignment */
  final def getHorizontalAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("SpinBox", "get_horizontal_alignment", 341400642L), hostObject.objectPtr)

  /** SpinBox.set_suffix */
  final def setSuffix(suffix: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpinBox", "set_suffix", 83702148L), hostObject.objectPtr, suffix)

  /** SpinBox.get_suffix */
  final def getSuffix(): String =
    Ptrcall.call0[String](MethodBind.get("SpinBox", "get_suffix", 201670096L), hostObject.objectPtr)

  /** SpinBox.set_prefix */
  final def setPrefix(prefix: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpinBox", "set_prefix", 83702148L), hostObject.objectPtr, prefix)

  /** SpinBox.get_prefix */
  final def getPrefix(): String =
    Ptrcall.call0[String](MethodBind.get("SpinBox", "get_prefix", 201670096L), hostObject.objectPtr)

  /** SpinBox.set_editable */
  final def setEditable(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpinBox", "set_editable", 2586408642L), hostObject.objectPtr, enabled)

  /** SpinBox.set_custom_arrow_step */
  final def setCustomArrowStep(arrow_step: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpinBox", "set_custom_arrow_step", 373806689L), hostObject.objectPtr, arrow_step)

  /** SpinBox.get_custom_arrow_step */
  final def getCustomArrowStep(): Double =
    Ptrcall.call0[Double](MethodBind.get("SpinBox", "get_custom_arrow_step", 1740695150L), hostObject.objectPtr)

  /** SpinBox.set_custom_arrow_round */
  final def setCustomArrowRound(round: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpinBox", "set_custom_arrow_round", 2586408642L), hostObject.objectPtr, round)

  /** SpinBox.is_custom_arrow_rounding */
  final def isCustomArrowRounding(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SpinBox", "is_custom_arrow_rounding", 36873697L), hostObject.objectPtr)

  /** SpinBox.is_editable */
  final def isEditable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SpinBox", "is_editable", 36873697L), hostObject.objectPtr)

  /** SpinBox.set_update_on_text_changed */
  final def setUpdateOnTextChanged(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpinBox", "set_update_on_text_changed", 2586408642L), hostObject.objectPtr, enabled)

  /** SpinBox.get_update_on_text_changed */
  final def getUpdateOnTextChanged(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SpinBox", "get_update_on_text_changed", 36873697L), hostObject.objectPtr)

  /** SpinBox.set_select_all_on_focus */
  final def setSelectAllOnFocus(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpinBox", "set_select_all_on_focus", 2586408642L), hostObject.objectPtr, enabled)

  /** SpinBox.is_select_all_on_focus */
  final def isSelectAllOnFocus(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SpinBox", "is_select_all_on_focus", 36873697L), hostObject.objectPtr)

  /** SpinBox.apply */
  final def apply(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SpinBox", "apply", 3218959716L), hostObject.objectPtr)

  /** SpinBox.get_line_edit */
  final def getLineEdit(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SpinBox", "get_line_edit", 4071694264L), hostObject.objectPtr)

}

object SpinBox {
  /** Class metadata for Gd[SpinBox] lifetime management and casting. */
  given GodotClass[SpinBox] with {
    def className = "SpinBox"
    def isRefCounted = false
    def wrap(o: GodotObject): SpinBox = new SpinBox {}.withHost(o.objectPtr)
    def unwrap(t: SpinBox): GodotObject = t.hostObject
  }
}
