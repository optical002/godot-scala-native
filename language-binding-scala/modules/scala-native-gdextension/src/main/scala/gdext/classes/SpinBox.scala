package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SpinBox`, extends `Range`. */
abstract class SpinBox extends Range {
  override def godotClassName: String = "SpinBox"

  /** SpinBox.set_horizontal_alignment */
  final def setHorizontalAlignment(alignment: gdext.classes.HorizontalAlignment): Unit = {
    if (gdext.classes.SpinBox.mb_set_horizontal_alignment == null) gdext.classes.SpinBox.mb_set_horizontal_alignment = MethodBind.get("SpinBox", "set_horizontal_alignment", 2312603777L)
    Ptrcall.callVoid1(gdext.classes.SpinBox.mb_set_horizontal_alignment, livePtr, alignment)
  }

  /** SpinBox.get_horizontal_alignment */
  final def getHorizontalAlignment(): gdext.classes.HorizontalAlignment = {
    if (gdext.classes.SpinBox.mb_get_horizontal_alignment == null) gdext.classes.SpinBox.mb_get_horizontal_alignment = MethodBind.get("SpinBox", "get_horizontal_alignment", 341400642L)
    gdext.classes.HorizontalAlignment(Ptrcall.call0[Long](gdext.classes.SpinBox.mb_get_horizontal_alignment, livePtr))
  }

  /** SpinBox.set_suffix */
  final def setSuffix(suffix: String): Unit = {
    if (gdext.classes.SpinBox.mb_set_suffix == null) gdext.classes.SpinBox.mb_set_suffix = MethodBind.get("SpinBox", "set_suffix", 83702148L)
    Ptrcall.callVoid1(gdext.classes.SpinBox.mb_set_suffix, livePtr, suffix)
  }

  /** SpinBox.get_suffix */
  final def getSuffix(): String = {
    if (gdext.classes.SpinBox.mb_get_suffix == null) gdext.classes.SpinBox.mb_get_suffix = MethodBind.get("SpinBox", "get_suffix", 201670096L)
    Ptrcall.call0[String](gdext.classes.SpinBox.mb_get_suffix, livePtr)
  }

  /** SpinBox.set_prefix */
  final def setPrefix(prefix: String): Unit = {
    if (gdext.classes.SpinBox.mb_set_prefix == null) gdext.classes.SpinBox.mb_set_prefix = MethodBind.get("SpinBox", "set_prefix", 83702148L)
    Ptrcall.callVoid1(gdext.classes.SpinBox.mb_set_prefix, livePtr, prefix)
  }

  /** SpinBox.get_prefix */
  final def getPrefix(): String = {
    if (gdext.classes.SpinBox.mb_get_prefix == null) gdext.classes.SpinBox.mb_get_prefix = MethodBind.get("SpinBox", "get_prefix", 201670096L)
    Ptrcall.call0[String](gdext.classes.SpinBox.mb_get_prefix, livePtr)
  }

  /** SpinBox.set_editable */
  final def setEditable(enabled: Boolean): Unit = {
    if (gdext.classes.SpinBox.mb_set_editable == null) gdext.classes.SpinBox.mb_set_editable = MethodBind.get("SpinBox", "set_editable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SpinBox.mb_set_editable, livePtr, enabled)
  }

  /** SpinBox.set_custom_arrow_step */
  final def setCustomArrowStep(arrowStep: Double): Unit = {
    if (gdext.classes.SpinBox.mb_set_custom_arrow_step == null) gdext.classes.SpinBox.mb_set_custom_arrow_step = MethodBind.get("SpinBox", "set_custom_arrow_step", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SpinBox.mb_set_custom_arrow_step, livePtr, arrowStep)
  }

  /** SpinBox.get_custom_arrow_step */
  final def getCustomArrowStep(): Double = {
    if (gdext.classes.SpinBox.mb_get_custom_arrow_step == null) gdext.classes.SpinBox.mb_get_custom_arrow_step = MethodBind.get("SpinBox", "get_custom_arrow_step", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SpinBox.mb_get_custom_arrow_step, livePtr)
  }

  /** SpinBox.set_custom_arrow_round */
  final def setCustomArrowRound(round: Boolean): Unit = {
    if (gdext.classes.SpinBox.mb_set_custom_arrow_round == null) gdext.classes.SpinBox.mb_set_custom_arrow_round = MethodBind.get("SpinBox", "set_custom_arrow_round", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SpinBox.mb_set_custom_arrow_round, livePtr, round)
  }

  /** SpinBox.is_custom_arrow_rounding */
  final def isCustomArrowRounding(): Boolean = {
    if (gdext.classes.SpinBox.mb_is_custom_arrow_rounding == null) gdext.classes.SpinBox.mb_is_custom_arrow_rounding = MethodBind.get("SpinBox", "is_custom_arrow_rounding", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SpinBox.mb_is_custom_arrow_rounding, livePtr)
  }

  /** SpinBox.is_editable */
  final def isEditable(): Boolean = {
    if (gdext.classes.SpinBox.mb_is_editable == null) gdext.classes.SpinBox.mb_is_editable = MethodBind.get("SpinBox", "is_editable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SpinBox.mb_is_editable, livePtr)
  }

  /** SpinBox.set_update_on_text_changed */
  final def setUpdateOnTextChanged(enabled: Boolean): Unit = {
    if (gdext.classes.SpinBox.mb_set_update_on_text_changed == null) gdext.classes.SpinBox.mb_set_update_on_text_changed = MethodBind.get("SpinBox", "set_update_on_text_changed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SpinBox.mb_set_update_on_text_changed, livePtr, enabled)
  }

  /** SpinBox.get_update_on_text_changed */
  final def getUpdateOnTextChanged(): Boolean = {
    if (gdext.classes.SpinBox.mb_get_update_on_text_changed == null) gdext.classes.SpinBox.mb_get_update_on_text_changed = MethodBind.get("SpinBox", "get_update_on_text_changed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SpinBox.mb_get_update_on_text_changed, livePtr)
  }

  /** SpinBox.set_select_all_on_focus */
  final def setSelectAllOnFocus(enabled: Boolean): Unit = {
    if (gdext.classes.SpinBox.mb_set_select_all_on_focus == null) gdext.classes.SpinBox.mb_set_select_all_on_focus = MethodBind.get("SpinBox", "set_select_all_on_focus", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SpinBox.mb_set_select_all_on_focus, livePtr, enabled)
  }

  /** SpinBox.is_select_all_on_focus */
  final def isSelectAllOnFocus(): Boolean = {
    if (gdext.classes.SpinBox.mb_is_select_all_on_focus == null) gdext.classes.SpinBox.mb_is_select_all_on_focus = MethodBind.get("SpinBox", "is_select_all_on_focus", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SpinBox.mb_is_select_all_on_focus, livePtr)
  }

  /** SpinBox.apply */
  final def apply(): Unit = {
    if (gdext.classes.SpinBox.mb_apply == null) gdext.classes.SpinBox.mb_apply = MethodBind.get("SpinBox", "apply", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SpinBox.mb_apply, livePtr)
  }

  /** SpinBox.get_line_edit */
  final def getLineEdit(): LineEdit = {
    if (gdext.classes.SpinBox.mb_get_line_edit == null) gdext.classes.SpinBox.mb_get_line_edit = MethodBind.get("SpinBox", "get_line_edit", 4071694264L)
    Wrappers.borrowed[LineEdit](Ptrcall.call0[Long](gdext.classes.SpinBox.mb_get_line_edit, livePtr))
  }

}

object SpinBox {
  private[classes] var mb_set_horizontal_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_horizontal_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_suffix: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_suffix: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_prefix: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_prefix: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_editable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_arrow_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_arrow_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_arrow_round: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_custom_arrow_rounding: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_update_on_text_changed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_update_on_text_changed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_select_all_on_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_select_all_on_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_edit: GDExtensionMethodBindPtr = null
}
