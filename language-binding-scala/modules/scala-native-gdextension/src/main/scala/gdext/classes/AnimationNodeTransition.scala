package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationNodeTransition`, extends `AnimationNodeSync`. */
abstract class AnimationNodeTransition extends AnimationNodeSync {
  override def godotClassName: String = "AnimationNodeTransition"

  /** AnimationNodeTransition.set_input_count */
  final def setInputCount(input_count: Long): Unit = {
    if (gdext.classes.AnimationNodeTransition.mb_set_input_count == null) gdext.classes.AnimationNodeTransition.mb_set_input_count = MethodBind.get("AnimationNodeTransition", "set_input_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeTransition.mb_set_input_count, livePtr, input_count)
  }

  /** AnimationNodeTransition.set_input_as_auto_advance */
  final def setInputAsAutoAdvance(input: Long, enable: Boolean): Unit = {
    if (gdext.classes.AnimationNodeTransition.mb_set_input_as_auto_advance == null) gdext.classes.AnimationNodeTransition.mb_set_input_as_auto_advance = MethodBind.get("AnimationNodeTransition", "set_input_as_auto_advance", 300928843L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeTransition.mb_set_input_as_auto_advance, livePtr, input, enable)
  }

  /** AnimationNodeTransition.is_input_set_as_auto_advance */
  final def isInputSetAsAutoAdvance(input: Long): Boolean = {
    if (gdext.classes.AnimationNodeTransition.mb_is_input_set_as_auto_advance == null) gdext.classes.AnimationNodeTransition.mb_is_input_set_as_auto_advance = MethodBind.get("AnimationNodeTransition", "is_input_set_as_auto_advance", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.AnimationNodeTransition.mb_is_input_set_as_auto_advance, livePtr, input)
  }

  /** AnimationNodeTransition.set_input_break_loop_at_end */
  final def setInputBreakLoopAtEnd(input: Long, enable: Boolean): Unit = {
    if (gdext.classes.AnimationNodeTransition.mb_set_input_break_loop_at_end == null) gdext.classes.AnimationNodeTransition.mb_set_input_break_loop_at_end = MethodBind.get("AnimationNodeTransition", "set_input_break_loop_at_end", 300928843L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeTransition.mb_set_input_break_loop_at_end, livePtr, input, enable)
  }

  /** AnimationNodeTransition.is_input_loop_broken_at_end */
  final def isInputLoopBrokenAtEnd(input: Long): Boolean = {
    if (gdext.classes.AnimationNodeTransition.mb_is_input_loop_broken_at_end == null) gdext.classes.AnimationNodeTransition.mb_is_input_loop_broken_at_end = MethodBind.get("AnimationNodeTransition", "is_input_loop_broken_at_end", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.AnimationNodeTransition.mb_is_input_loop_broken_at_end, livePtr, input)
  }

  /** AnimationNodeTransition.set_input_reset */
  final def setInputReset(input: Long, enable: Boolean): Unit = {
    if (gdext.classes.AnimationNodeTransition.mb_set_input_reset == null) gdext.classes.AnimationNodeTransition.mb_set_input_reset = MethodBind.get("AnimationNodeTransition", "set_input_reset", 300928843L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeTransition.mb_set_input_reset, livePtr, input, enable)
  }

  /** AnimationNodeTransition.is_input_reset */
  final def isInputReset(input: Long): Boolean = {
    if (gdext.classes.AnimationNodeTransition.mb_is_input_reset == null) gdext.classes.AnimationNodeTransition.mb_is_input_reset = MethodBind.get("AnimationNodeTransition", "is_input_reset", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.AnimationNodeTransition.mb_is_input_reset, livePtr, input)
  }

  /** AnimationNodeTransition.set_xfade_time */
  final def setXfadeTime(time: Double): Unit = {
    if (gdext.classes.AnimationNodeTransition.mb_set_xfade_time == null) gdext.classes.AnimationNodeTransition.mb_set_xfade_time = MethodBind.get("AnimationNodeTransition", "set_xfade_time", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeTransition.mb_set_xfade_time, livePtr, time)
  }

  /** AnimationNodeTransition.get_xfade_time */
  final def getXfadeTime(): Double = {
    if (gdext.classes.AnimationNodeTransition.mb_get_xfade_time == null) gdext.classes.AnimationNodeTransition.mb_get_xfade_time = MethodBind.get("AnimationNodeTransition", "get_xfade_time", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeTransition.mb_get_xfade_time, livePtr)
  }

  /** AnimationNodeTransition.set_xfade_curve */
  final def setXfadeCurve(curve: Curve): Unit = {
    if (gdext.classes.AnimationNodeTransition.mb_set_xfade_curve == null) gdext.classes.AnimationNodeTransition.mb_set_xfade_curve = MethodBind.get("AnimationNodeTransition", "set_xfade_curve", 270443179L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeTransition.mb_set_xfade_curve, livePtr, Wrappers.handle(curve))
  }

  /** AnimationNodeTransition.get_xfade_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getXfadeCurve(): Curve = {
    if (gdext.classes.AnimationNodeTransition.mb_get_xfade_curve == null) gdext.classes.AnimationNodeTransition.mb_get_xfade_curve = MethodBind.get("AnimationNodeTransition", "get_xfade_curve", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.AnimationNodeTransition.mb_get_xfade_curve, livePtr))
  }

  /** AnimationNodeTransition.set_allow_transition_to_self */
  final def setAllowTransitionToSelf(enable: Boolean): Unit = {
    if (gdext.classes.AnimationNodeTransition.mb_set_allow_transition_to_self == null) gdext.classes.AnimationNodeTransition.mb_set_allow_transition_to_self = MethodBind.get("AnimationNodeTransition", "set_allow_transition_to_self", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeTransition.mb_set_allow_transition_to_self, livePtr, enable)
  }

  /** AnimationNodeTransition.is_allow_transition_to_self */
  final def isAllowTransitionToSelf(): Boolean = {
    if (gdext.classes.AnimationNodeTransition.mb_is_allow_transition_to_self == null) gdext.classes.AnimationNodeTransition.mb_is_allow_transition_to_self = MethodBind.get("AnimationNodeTransition", "is_allow_transition_to_self", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeTransition.mb_is_allow_transition_to_self, livePtr)
  }

}

object AnimationNodeTransition {
  private[classes] var mb_set_input_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_input_as_auto_advance: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_input_set_as_auto_advance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_input_break_loop_at_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_input_loop_broken_at_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_input_reset: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_input_reset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_xfade_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_xfade_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_xfade_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_xfade_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_transition_to_self: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_allow_transition_to_self: GDExtensionMethodBindPtr = null
}
