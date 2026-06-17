package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeStateMachineTransition`, extends `Resource`. */
abstract class AnimationNodeStateMachineTransition extends Resource {

  /** AnimationNodeStateMachineTransition.set_switch_mode */
  final def setSwitchMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeStateMachineTransition", "set_switch_mode", 2074906633L), hostObject.objectPtr, mode)

  /** AnimationNodeStateMachineTransition.get_switch_mode */
  final def getSwitchMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationNodeStateMachineTransition", "get_switch_mode", 2138562085L), hostObject.objectPtr)

  /** AnimationNodeStateMachineTransition.set_advance_mode */
  final def setAdvanceMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeStateMachineTransition", "set_advance_mode", 1210869868L), hostObject.objectPtr, mode)

  /** AnimationNodeStateMachineTransition.get_advance_mode */
  final def getAdvanceMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationNodeStateMachineTransition", "get_advance_mode", 61101689L), hostObject.objectPtr)

  /** AnimationNodeStateMachineTransition.set_advance_condition */
  final def setAdvanceCondition(name: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeStateMachineTransition", "set_advance_condition", 3304788590L), hostObject.objectPtr, name)

  /** AnimationNodeStateMachineTransition.get_advance_condition */
  final def getAdvanceCondition(): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call0[io.github.optical002.godot.builtin.StringName](MethodBind.get("AnimationNodeStateMachineTransition", "get_advance_condition", 2002593661L), hostObject.objectPtr)

  /** AnimationNodeStateMachineTransition.set_xfade_time */
  final def setXfadeTime(secs: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeStateMachineTransition", "set_xfade_time", 373806689L), hostObject.objectPtr, secs)

  /** AnimationNodeStateMachineTransition.get_xfade_time */
  final def getXfadeTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeStateMachineTransition", "get_xfade_time", 1740695150L), hostObject.objectPtr)

  /** AnimationNodeStateMachineTransition.set_xfade_curve */
  final def setXfadeCurve(curve: Curve): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeStateMachineTransition", "set_xfade_curve", 270443179L), hostObject.objectPtr, curve.hostObject)

  /** AnimationNodeStateMachineTransition.get_xfade_curve */
  final def getXfadeCurve(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AnimationNodeStateMachineTransition", "get_xfade_curve", 2460114913L), hostObject.objectPtr)

  /** AnimationNodeStateMachineTransition.set_break_loop_at_end */
  final def setBreakLoopAtEnd(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeStateMachineTransition", "set_break_loop_at_end", 2586408642L), hostObject.objectPtr, enable)

  /** AnimationNodeStateMachineTransition.is_loop_broken_at_end */
  final def isLoopBrokenAtEnd(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeStateMachineTransition", "is_loop_broken_at_end", 36873697L), hostObject.objectPtr)

  /** AnimationNodeStateMachineTransition.set_reset */
  final def setReset(reset: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeStateMachineTransition", "set_reset", 2586408642L), hostObject.objectPtr, reset)

  /** AnimationNodeStateMachineTransition.is_reset */
  final def isReset(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeStateMachineTransition", "is_reset", 36873697L), hostObject.objectPtr)

  /** AnimationNodeStateMachineTransition.set_priority */
  final def setPriority(priority: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeStateMachineTransition", "set_priority", 1286410249L), hostObject.objectPtr, priority)

  /** AnimationNodeStateMachineTransition.get_priority */
  final def getPriority(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationNodeStateMachineTransition", "get_priority", 3905245786L), hostObject.objectPtr)

  /** AnimationNodeStateMachineTransition.set_advance_expression */
  final def setAdvanceExpression(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeStateMachineTransition", "set_advance_expression", 83702148L), hostObject.objectPtr, text)

  /** AnimationNodeStateMachineTransition.get_advance_expression */
  final def getAdvanceExpression(): String =
    Ptrcall.call0[String](MethodBind.get("AnimationNodeStateMachineTransition", "get_advance_expression", 201670096L), hostObject.objectPtr)

}

object AnimationNodeStateMachineTransition {
  /** Class metadata for Gd[AnimationNodeStateMachineTransition] lifetime management and casting. */
  given GodotClass[AnimationNodeStateMachineTransition] with {
    def className = "AnimationNodeStateMachineTransition"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeStateMachineTransition = new AnimationNodeStateMachineTransition {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeStateMachineTransition): GodotObject = t.hostObject
  }
}
