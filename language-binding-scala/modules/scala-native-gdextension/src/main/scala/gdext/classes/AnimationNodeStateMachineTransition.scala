package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationNodeStateMachineTransition`, extends `Resource`. */
abstract class AnimationNodeStateMachineTransition extends Resource {
  override def godotClassName: String = "AnimationNodeStateMachineTransition"

  /** AnimationNodeStateMachineTransition.set_switch_mode */
  final def setSwitchMode(mode: gdext.classes.AnimationNodeStateMachineTransition.SwitchMode): Unit = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_set_switch_mode == null) gdext.classes.AnimationNodeStateMachineTransition.mb_set_switch_mode = MethodBind.get("AnimationNodeStateMachineTransition", "set_switch_mode", 2074906633L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeStateMachineTransition.mb_set_switch_mode, livePtr, mode)
  }

  /** AnimationNodeStateMachineTransition.get_switch_mode */
  final def getSwitchMode(): gdext.classes.AnimationNodeStateMachineTransition.SwitchMode = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_get_switch_mode == null) gdext.classes.AnimationNodeStateMachineTransition.mb_get_switch_mode = MethodBind.get("AnimationNodeStateMachineTransition", "get_switch_mode", 2138562085L)
    gdext.classes.AnimationNodeStateMachineTransition.SwitchMode(Ptrcall.call0[Long](gdext.classes.AnimationNodeStateMachineTransition.mb_get_switch_mode, livePtr))
  }

  /** AnimationNodeStateMachineTransition.set_advance_mode */
  final def setAdvanceMode(mode: gdext.classes.AnimationNodeStateMachineTransition.AdvanceMode): Unit = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_set_advance_mode == null) gdext.classes.AnimationNodeStateMachineTransition.mb_set_advance_mode = MethodBind.get("AnimationNodeStateMachineTransition", "set_advance_mode", 1210869868L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeStateMachineTransition.mb_set_advance_mode, livePtr, mode)
  }

  /** AnimationNodeStateMachineTransition.get_advance_mode */
  final def getAdvanceMode(): gdext.classes.AnimationNodeStateMachineTransition.AdvanceMode = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_get_advance_mode == null) gdext.classes.AnimationNodeStateMachineTransition.mb_get_advance_mode = MethodBind.get("AnimationNodeStateMachineTransition", "get_advance_mode", 61101689L)
    gdext.classes.AnimationNodeStateMachineTransition.AdvanceMode(Ptrcall.call0[Long](gdext.classes.AnimationNodeStateMachineTransition.mb_get_advance_mode, livePtr))
  }

  /** AnimationNodeStateMachineTransition.set_advance_condition */
  final def setAdvanceCondition(name: String): Unit = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_set_advance_condition == null) gdext.classes.AnimationNodeStateMachineTransition.mb_set_advance_condition = MethodBind.get("AnimationNodeStateMachineTransition", "set_advance_condition", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeStateMachineTransition.mb_set_advance_condition, livePtr, SnArg(name))
  }

  /** AnimationNodeStateMachineTransition.get_advance_condition */
  final def getAdvanceCondition(): String = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_get_advance_condition == null) gdext.classes.AnimationNodeStateMachineTransition.mb_get_advance_condition = MethodBind.get("AnimationNodeStateMachineTransition", "get_advance_condition", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.AnimationNodeStateMachineTransition.mb_get_advance_condition, livePtr)
  }

  /** AnimationNodeStateMachineTransition.set_xfade_time */
  final def setXfadeTime(secs: Double): Unit = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_set_xfade_time == null) gdext.classes.AnimationNodeStateMachineTransition.mb_set_xfade_time = MethodBind.get("AnimationNodeStateMachineTransition", "set_xfade_time", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeStateMachineTransition.mb_set_xfade_time, livePtr, secs)
  }

  /** AnimationNodeStateMachineTransition.get_xfade_time */
  final def getXfadeTime(): Double = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_get_xfade_time == null) gdext.classes.AnimationNodeStateMachineTransition.mb_get_xfade_time = MethodBind.get("AnimationNodeStateMachineTransition", "get_xfade_time", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeStateMachineTransition.mb_get_xfade_time, livePtr)
  }

  /** AnimationNodeStateMachineTransition.set_xfade_curve */
  final def setXfadeCurve(curve: Curve): Unit = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_set_xfade_curve == null) gdext.classes.AnimationNodeStateMachineTransition.mb_set_xfade_curve = MethodBind.get("AnimationNodeStateMachineTransition", "set_xfade_curve", 270443179L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeStateMachineTransition.mb_set_xfade_curve, livePtr, Wrappers.handle(curve))
  }

  /** AnimationNodeStateMachineTransition.get_xfade_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getXfadeCurve(): Curve = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_get_xfade_curve == null) gdext.classes.AnimationNodeStateMachineTransition.mb_get_xfade_curve = MethodBind.get("AnimationNodeStateMachineTransition", "get_xfade_curve", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.AnimationNodeStateMachineTransition.mb_get_xfade_curve, livePtr))
  }

  /** AnimationNodeStateMachineTransition.set_break_loop_at_end */
  final def setBreakLoopAtEnd(enable: Boolean): Unit = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_set_break_loop_at_end == null) gdext.classes.AnimationNodeStateMachineTransition.mb_set_break_loop_at_end = MethodBind.get("AnimationNodeStateMachineTransition", "set_break_loop_at_end", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeStateMachineTransition.mb_set_break_loop_at_end, livePtr, enable)
  }

  /** AnimationNodeStateMachineTransition.is_loop_broken_at_end */
  final def isLoopBrokenAtEnd(): Boolean = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_is_loop_broken_at_end == null) gdext.classes.AnimationNodeStateMachineTransition.mb_is_loop_broken_at_end = MethodBind.get("AnimationNodeStateMachineTransition", "is_loop_broken_at_end", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeStateMachineTransition.mb_is_loop_broken_at_end, livePtr)
  }

  /** AnimationNodeStateMachineTransition.set_reset */
  final def setReset(reset: Boolean): Unit = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_set_reset == null) gdext.classes.AnimationNodeStateMachineTransition.mb_set_reset = MethodBind.get("AnimationNodeStateMachineTransition", "set_reset", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeStateMachineTransition.mb_set_reset, livePtr, reset)
  }

  /** AnimationNodeStateMachineTransition.is_reset */
  final def isReset(): Boolean = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_is_reset == null) gdext.classes.AnimationNodeStateMachineTransition.mb_is_reset = MethodBind.get("AnimationNodeStateMachineTransition", "is_reset", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeStateMachineTransition.mb_is_reset, livePtr)
  }

  /** AnimationNodeStateMachineTransition.set_priority */
  final def setPriority(priority: Long): Unit = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_set_priority == null) gdext.classes.AnimationNodeStateMachineTransition.mb_set_priority = MethodBind.get("AnimationNodeStateMachineTransition", "set_priority", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeStateMachineTransition.mb_set_priority, livePtr, priority)
  }

  /** AnimationNodeStateMachineTransition.get_priority */
  final def getPriority(): Long = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_get_priority == null) gdext.classes.AnimationNodeStateMachineTransition.mb_get_priority = MethodBind.get("AnimationNodeStateMachineTransition", "get_priority", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AnimationNodeStateMachineTransition.mb_get_priority, livePtr)
  }

  /** AnimationNodeStateMachineTransition.set_advance_expression */
  final def setAdvanceExpression(text: String): Unit = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_set_advance_expression == null) gdext.classes.AnimationNodeStateMachineTransition.mb_set_advance_expression = MethodBind.get("AnimationNodeStateMachineTransition", "set_advance_expression", 83702148L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeStateMachineTransition.mb_set_advance_expression, livePtr, text)
  }

  /** AnimationNodeStateMachineTransition.get_advance_expression */
  final def getAdvanceExpression(): String = {
    if (gdext.classes.AnimationNodeStateMachineTransition.mb_get_advance_expression == null) gdext.classes.AnimationNodeStateMachineTransition.mb_get_advance_expression = MethodBind.get("AnimationNodeStateMachineTransition", "get_advance_expression", 201670096L)
    Ptrcall.call0[String](gdext.classes.AnimationNodeStateMachineTransition.mb_get_advance_expression, livePtr)
  }

}

object AnimationNodeStateMachineTransition {
  private[classes] var mb_set_switch_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_switch_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_advance_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_advance_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_advance_condition: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_advance_condition: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_xfade_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_xfade_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_xfade_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_xfade_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_break_loop_at_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_loop_broken_at_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reset: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_reset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_advance_expression: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_advance_expression: GDExtensionMethodBindPtr = null

  /** Godot enum `AnimationNodeStateMachineTransition.SwitchMode`. */
  opaque type SwitchMode <: Long = Long

  object SwitchMode {
    final val Immediate: SwitchMode = 0L.asInstanceOf[SwitchMode]
    final val Sync: SwitchMode = 1L.asInstanceOf[SwitchMode]
    final val AtEnd: SwitchMode = 2L.asInstanceOf[SwitchMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SwitchMode = value.asInstanceOf[SwitchMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SwitchMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[SwitchMode]]

    extension (self: SwitchMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Immediate"
        case 1L => "Sync"
        case 2L => "AtEnd"
        case other => other.toString
      }
  }

  /** Godot enum `AnimationNodeStateMachineTransition.AdvanceMode`. */
  opaque type AdvanceMode <: Long = Long

  object AdvanceMode {
    final val Disabled: AdvanceMode = 0L.asInstanceOf[AdvanceMode]
    final val Enabled: AdvanceMode = 1L.asInstanceOf[AdvanceMode]
    final val Auto: AdvanceMode = 2L.asInstanceOf[AdvanceMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AdvanceMode = value.asInstanceOf[AdvanceMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AdvanceMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[AdvanceMode]]

    extension (self: AdvanceMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Enabled"
        case 2L => "Auto"
        case other => other.toString
      }
  }
}
