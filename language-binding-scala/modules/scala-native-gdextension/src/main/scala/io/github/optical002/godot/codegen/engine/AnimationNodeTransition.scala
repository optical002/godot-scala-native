package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeTransition`, extends `AnimationNodeSync`. */
abstract class AnimationNodeTransition extends AnimationNodeSync {

  /** AnimationNodeTransition.set_input_count */
  final def setInputCount(input_count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeTransition", "set_input_count", 1286410249L), hostObject.objectPtr, input_count)

  /** AnimationNodeTransition.set_input_as_auto_advance */
  final def setInputAsAutoAdvance(input: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeTransition", "set_input_as_auto_advance", 300928843L), hostObject.objectPtr, input, enable)

  /** AnimationNodeTransition.is_input_set_as_auto_advance */
  final def isInputSetAsAutoAdvance(input: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("AnimationNodeTransition", "is_input_set_as_auto_advance", 1116898809L), hostObject.objectPtr, input)

  /** AnimationNodeTransition.set_input_break_loop_at_end */
  final def setInputBreakLoopAtEnd(input: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeTransition", "set_input_break_loop_at_end", 300928843L), hostObject.objectPtr, input, enable)

  /** AnimationNodeTransition.is_input_loop_broken_at_end */
  final def isInputLoopBrokenAtEnd(input: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("AnimationNodeTransition", "is_input_loop_broken_at_end", 1116898809L), hostObject.objectPtr, input)

  /** AnimationNodeTransition.set_input_reset */
  final def setInputReset(input: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeTransition", "set_input_reset", 300928843L), hostObject.objectPtr, input, enable)

  /** AnimationNodeTransition.is_input_reset */
  final def isInputReset(input: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("AnimationNodeTransition", "is_input_reset", 1116898809L), hostObject.objectPtr, input)

  /** AnimationNodeTransition.set_xfade_time */
  final def setXfadeTime(time: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeTransition", "set_xfade_time", 373806689L), hostObject.objectPtr, time)

  /** AnimationNodeTransition.get_xfade_time */
  final def getXfadeTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeTransition", "get_xfade_time", 1740695150L), hostObject.objectPtr)

  /** AnimationNodeTransition.set_xfade_curve */
  final def setXfadeCurve(curve: Curve): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeTransition", "set_xfade_curve", 270443179L), hostObject.objectPtr, curve.hostObject)

  /** AnimationNodeTransition.get_xfade_curve */
  final def getXfadeCurve(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AnimationNodeTransition", "get_xfade_curve", 2460114913L), hostObject.objectPtr)

  /** AnimationNodeTransition.set_allow_transition_to_self */
  final def setAllowTransitionToSelf(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeTransition", "set_allow_transition_to_self", 2586408642L), hostObject.objectPtr, enable)

  /** AnimationNodeTransition.is_allow_transition_to_self */
  final def isAllowTransitionToSelf(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeTransition", "is_allow_transition_to_self", 36873697L), hostObject.objectPtr)

}

object AnimationNodeTransition {
  /** Class metadata for Gd[AnimationNodeTransition] lifetime management and casting. */
  given GodotClass[AnimationNodeTransition] with {
    def className = "AnimationNodeTransition"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeTransition = new AnimationNodeTransition {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeTransition): GodotObject = t.hostObject
  }
}
