package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Range`, extends `Control`. */
abstract class Range extends Control {
  override def godotClassName: String = "Range"

  /** Range.get_value */
  final def getValue(): Double = {
    if (gdext.classes.Range.mb_get_value == null) gdext.classes.Range.mb_get_value = MethodBind.get("Range", "get_value", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Range.mb_get_value, livePtr)
  }

  /** Range.get_min */
  final def getMin(): Double = {
    if (gdext.classes.Range.mb_get_min == null) gdext.classes.Range.mb_get_min = MethodBind.get("Range", "get_min", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Range.mb_get_min, livePtr)
  }

  /** Range.get_max */
  final def getMax(): Double = {
    if (gdext.classes.Range.mb_get_max == null) gdext.classes.Range.mb_get_max = MethodBind.get("Range", "get_max", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Range.mb_get_max, livePtr)
  }

  /** Range.get_step */
  final def getStep(): Double = {
    if (gdext.classes.Range.mb_get_step == null) gdext.classes.Range.mb_get_step = MethodBind.get("Range", "get_step", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Range.mb_get_step, livePtr)
  }

  /** Range.get_page */
  final def getPage(): Double = {
    if (gdext.classes.Range.mb_get_page == null) gdext.classes.Range.mb_get_page = MethodBind.get("Range", "get_page", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Range.mb_get_page, livePtr)
  }

  /** Range.get_as_ratio */
  final def getAsRatio(): Double = {
    if (gdext.classes.Range.mb_get_as_ratio == null) gdext.classes.Range.mb_get_as_ratio = MethodBind.get("Range", "get_as_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Range.mb_get_as_ratio, livePtr)
  }

  /** Range.set_value */
  final def setValue(value: Double): Unit = {
    if (gdext.classes.Range.mb_set_value == null) gdext.classes.Range.mb_set_value = MethodBind.get("Range", "set_value", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Range.mb_set_value, livePtr, value)
  }

  /** Range.set_value_no_signal */
  final def setValueNoSignal(value: Double): Unit = {
    if (gdext.classes.Range.mb_set_value_no_signal == null) gdext.classes.Range.mb_set_value_no_signal = MethodBind.get("Range", "set_value_no_signal", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Range.mb_set_value_no_signal, livePtr, value)
  }

  /** Range.set_min */
  final def setMin(minimum: Double): Unit = {
    if (gdext.classes.Range.mb_set_min == null) gdext.classes.Range.mb_set_min = MethodBind.get("Range", "set_min", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Range.mb_set_min, livePtr, minimum)
  }

  /** Range.set_max */
  final def setMax(maximum: Double): Unit = {
    if (gdext.classes.Range.mb_set_max == null) gdext.classes.Range.mb_set_max = MethodBind.get("Range", "set_max", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Range.mb_set_max, livePtr, maximum)
  }

  /** Range.set_step */
  final def setStep(step: Double): Unit = {
    if (gdext.classes.Range.mb_set_step == null) gdext.classes.Range.mb_set_step = MethodBind.get("Range", "set_step", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Range.mb_set_step, livePtr, step)
  }

  /** Range.set_page */
  final def setPage(pagesize: Double): Unit = {
    if (gdext.classes.Range.mb_set_page == null) gdext.classes.Range.mb_set_page = MethodBind.get("Range", "set_page", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Range.mb_set_page, livePtr, pagesize)
  }

  /** Range.set_as_ratio */
  final def setAsRatio(value: Double): Unit = {
    if (gdext.classes.Range.mb_set_as_ratio == null) gdext.classes.Range.mb_set_as_ratio = MethodBind.get("Range", "set_as_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Range.mb_set_as_ratio, livePtr, value)
  }

  /** Range.set_use_rounded_values */
  final def setUseRoundedValues(enabled: Boolean): Unit = {
    if (gdext.classes.Range.mb_set_use_rounded_values == null) gdext.classes.Range.mb_set_use_rounded_values = MethodBind.get("Range", "set_use_rounded_values", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Range.mb_set_use_rounded_values, livePtr, enabled)
  }

  /** Range.is_using_rounded_values */
  final def isUsingRoundedValues(): Boolean = {
    if (gdext.classes.Range.mb_is_using_rounded_values == null) gdext.classes.Range.mb_is_using_rounded_values = MethodBind.get("Range", "is_using_rounded_values", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Range.mb_is_using_rounded_values, livePtr)
  }

  /** Range.set_exp_ratio */
  final def setExpRatio(enabled: Boolean): Unit = {
    if (gdext.classes.Range.mb_set_exp_ratio == null) gdext.classes.Range.mb_set_exp_ratio = MethodBind.get("Range", "set_exp_ratio", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Range.mb_set_exp_ratio, livePtr, enabled)
  }

  /** Range.is_ratio_exp */
  final def isRatioExp(): Boolean = {
    if (gdext.classes.Range.mb_is_ratio_exp == null) gdext.classes.Range.mb_is_ratio_exp = MethodBind.get("Range", "is_ratio_exp", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Range.mb_is_ratio_exp, livePtr)
  }

  /** Range.set_allow_greater */
  final def setAllowGreater(allow: Boolean): Unit = {
    if (gdext.classes.Range.mb_set_allow_greater == null) gdext.classes.Range.mb_set_allow_greater = MethodBind.get("Range", "set_allow_greater", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Range.mb_set_allow_greater, livePtr, allow)
  }

  /** Range.is_greater_allowed */
  final def isGreaterAllowed(): Boolean = {
    if (gdext.classes.Range.mb_is_greater_allowed == null) gdext.classes.Range.mb_is_greater_allowed = MethodBind.get("Range", "is_greater_allowed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Range.mb_is_greater_allowed, livePtr)
  }

  /** Range.set_allow_lesser */
  final def setAllowLesser(allow: Boolean): Unit = {
    if (gdext.classes.Range.mb_set_allow_lesser == null) gdext.classes.Range.mb_set_allow_lesser = MethodBind.get("Range", "set_allow_lesser", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Range.mb_set_allow_lesser, livePtr, allow)
  }

  /** Range.is_lesser_allowed */
  final def isLesserAllowed(): Boolean = {
    if (gdext.classes.Range.mb_is_lesser_allowed == null) gdext.classes.Range.mb_is_lesser_allowed = MethodBind.get("Range", "is_lesser_allowed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Range.mb_is_lesser_allowed, livePtr)
  }

  /** Range.share */
  final def share(`with`: Node): Unit = {
    if (gdext.classes.Range.mb_share == null) gdext.classes.Range.mb_share = MethodBind.get("Range", "share", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.Range.mb_share, livePtr, Wrappers.handle(`with`))
  }

  /** Range.unshare */
  final def unshare(): Unit = {
    if (gdext.classes.Range.mb_unshare == null) gdext.classes.Range.mb_unshare = MethodBind.get("Range", "unshare", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Range.mb_unshare, livePtr)
  }

}

object Range {
  private[classes] var mb_get_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_page: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_as_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_value_no_signal: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_page: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_as_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_rounded_values: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_rounded_values: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_exp_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_ratio_exp: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_greater: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_greater_allowed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_lesser: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_lesser_allowed: GDExtensionMethodBindPtr = null
  private[classes] var mb_share: GDExtensionMethodBindPtr = null
  private[classes] var mb_unshare: GDExtensionMethodBindPtr = null
}
