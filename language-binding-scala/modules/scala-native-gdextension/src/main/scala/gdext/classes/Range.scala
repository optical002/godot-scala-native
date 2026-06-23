package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Range`, extends `Control`. */
abstract class Range extends Control {

  /** Range.get_value */
  final def getValue(): Double =
    Ptrcall.call0[Double](MethodBind.get("Range", "get_value", 1740695150L), hostObject.objectPtr)

  /** Range.get_min */
  final def getMin(): Double =
    Ptrcall.call0[Double](MethodBind.get("Range", "get_min", 1740695150L), hostObject.objectPtr)

  /** Range.get_max */
  final def getMax(): Double =
    Ptrcall.call0[Double](MethodBind.get("Range", "get_max", 1740695150L), hostObject.objectPtr)

  /** Range.get_step */
  final def getStep(): Double =
    Ptrcall.call0[Double](MethodBind.get("Range", "get_step", 1740695150L), hostObject.objectPtr)

  /** Range.get_page */
  final def getPage(): Double =
    Ptrcall.call0[Double](MethodBind.get("Range", "get_page", 1740695150L), hostObject.objectPtr)

  /** Range.get_as_ratio */
  final def getAsRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("Range", "get_as_ratio", 1740695150L), hostObject.objectPtr)

  /** Range.set_value */
  final def setValue(value: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Range", "set_value", 373806689L), hostObject.objectPtr, value)

  /** Range.set_value_no_signal */
  final def setValueNoSignal(value: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Range", "set_value_no_signal", 373806689L), hostObject.objectPtr, value)

  /** Range.set_min */
  final def setMin(minimum: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Range", "set_min", 373806689L), hostObject.objectPtr, minimum)

  /** Range.set_max */
  final def setMax(maximum: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Range", "set_max", 373806689L), hostObject.objectPtr, maximum)

  /** Range.set_step */
  final def setStep(step: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Range", "set_step", 373806689L), hostObject.objectPtr, step)

  /** Range.set_page */
  final def setPage(pagesize: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Range", "set_page", 373806689L), hostObject.objectPtr, pagesize)

  /** Range.set_as_ratio */
  final def setAsRatio(value: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Range", "set_as_ratio", 373806689L), hostObject.objectPtr, value)

  /** Range.set_use_rounded_values */
  final def setUseRoundedValues(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Range", "set_use_rounded_values", 2586408642L), hostObject.objectPtr, enabled)

  /** Range.is_using_rounded_values */
  final def isUsingRoundedValues(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Range", "is_using_rounded_values", 36873697L), hostObject.objectPtr)

  /** Range.set_exp_ratio */
  final def setExpRatio(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Range", "set_exp_ratio", 2586408642L), hostObject.objectPtr, enabled)

  /** Range.is_ratio_exp */
  final def isRatioExp(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Range", "is_ratio_exp", 36873697L), hostObject.objectPtr)

  /** Range.set_allow_greater */
  final def setAllowGreater(allow: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Range", "set_allow_greater", 2586408642L), hostObject.objectPtr, allow)

  /** Range.is_greater_allowed */
  final def isGreaterAllowed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Range", "is_greater_allowed", 36873697L), hostObject.objectPtr)

  /** Range.set_allow_lesser */
  final def setAllowLesser(allow: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Range", "set_allow_lesser", 2586408642L), hostObject.objectPtr, allow)

  /** Range.is_lesser_allowed */
  final def isLesserAllowed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Range", "is_lesser_allowed", 36873697L), hostObject.objectPtr)

  /** Range.share */
  final def share(`with`: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("Range", "share", 1078189570L), hostObject.objectPtr, `with`.hostObject)

  /** Range.unshare */
  final def unshare(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Range", "unshare", 3218959716L), hostObject.objectPtr)

}

object Range {
  /** Class metadata for Gd[Range] lifetime management and casting. */
  given GodotClass[Range] with {
    def className = "Range"
    def isRefCounted = false
    def wrap(o: GodotObject): Range = new Range {}.withHost(o.objectPtr)
    def unwrap(t: Range): GodotObject = t.hostObject
  }
}
