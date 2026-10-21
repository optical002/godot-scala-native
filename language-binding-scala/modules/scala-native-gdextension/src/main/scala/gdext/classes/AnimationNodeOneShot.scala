package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationNodeOneShot`, extends `AnimationNodeSync`. */
abstract class AnimationNodeOneShot extends AnimationNodeSync {
  override def godotClassName: String = "AnimationNodeOneShot"

  /** AnimationNodeOneShot.set_fadein_time */
  final def setFadeinTime(time: Double): Unit = {
    if (gdext.classes.AnimationNodeOneShot.mb_set_fadein_time == null) gdext.classes.AnimationNodeOneShot.mb_set_fadein_time = MethodBind.get("AnimationNodeOneShot", "set_fadein_time", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeOneShot.mb_set_fadein_time, livePtr, time)
  }

  /** AnimationNodeOneShot.get_fadein_time */
  final def getFadeinTime(): Double = {
    if (gdext.classes.AnimationNodeOneShot.mb_get_fadein_time == null) gdext.classes.AnimationNodeOneShot.mb_get_fadein_time = MethodBind.get("AnimationNodeOneShot", "get_fadein_time", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeOneShot.mb_get_fadein_time, livePtr)
  }

  /** AnimationNodeOneShot.set_fadein_curve */
  final def setFadeinCurve(curve: Curve): Unit = {
    if (gdext.classes.AnimationNodeOneShot.mb_set_fadein_curve == null) gdext.classes.AnimationNodeOneShot.mb_set_fadein_curve = MethodBind.get("AnimationNodeOneShot", "set_fadein_curve", 270443179L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeOneShot.mb_set_fadein_curve, livePtr, Wrappers.handle(curve))
  }

  /** AnimationNodeOneShot.get_fadein_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getFadeinCurve(): Curve = {
    if (gdext.classes.AnimationNodeOneShot.mb_get_fadein_curve == null) gdext.classes.AnimationNodeOneShot.mb_get_fadein_curve = MethodBind.get("AnimationNodeOneShot", "get_fadein_curve", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.AnimationNodeOneShot.mb_get_fadein_curve, livePtr))
  }

  /** AnimationNodeOneShot.set_fadeout_time */
  final def setFadeoutTime(time: Double): Unit = {
    if (gdext.classes.AnimationNodeOneShot.mb_set_fadeout_time == null) gdext.classes.AnimationNodeOneShot.mb_set_fadeout_time = MethodBind.get("AnimationNodeOneShot", "set_fadeout_time", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeOneShot.mb_set_fadeout_time, livePtr, time)
  }

  /** AnimationNodeOneShot.get_fadeout_time */
  final def getFadeoutTime(): Double = {
    if (gdext.classes.AnimationNodeOneShot.mb_get_fadeout_time == null) gdext.classes.AnimationNodeOneShot.mb_get_fadeout_time = MethodBind.get("AnimationNodeOneShot", "get_fadeout_time", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeOneShot.mb_get_fadeout_time, livePtr)
  }

  /** AnimationNodeOneShot.set_fadeout_curve */
  final def setFadeoutCurve(curve: Curve): Unit = {
    if (gdext.classes.AnimationNodeOneShot.mb_set_fadeout_curve == null) gdext.classes.AnimationNodeOneShot.mb_set_fadeout_curve = MethodBind.get("AnimationNodeOneShot", "set_fadeout_curve", 270443179L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeOneShot.mb_set_fadeout_curve, livePtr, Wrappers.handle(curve))
  }

  /** AnimationNodeOneShot.get_fadeout_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getFadeoutCurve(): Curve = {
    if (gdext.classes.AnimationNodeOneShot.mb_get_fadeout_curve == null) gdext.classes.AnimationNodeOneShot.mb_get_fadeout_curve = MethodBind.get("AnimationNodeOneShot", "get_fadeout_curve", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.AnimationNodeOneShot.mb_get_fadeout_curve, livePtr))
  }

  /** AnimationNodeOneShot.set_break_loop_at_end */
  final def setBreakLoopAtEnd(enable: Boolean): Unit = {
    if (gdext.classes.AnimationNodeOneShot.mb_set_break_loop_at_end == null) gdext.classes.AnimationNodeOneShot.mb_set_break_loop_at_end = MethodBind.get("AnimationNodeOneShot", "set_break_loop_at_end", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeOneShot.mb_set_break_loop_at_end, livePtr, enable)
  }

  /** AnimationNodeOneShot.is_loop_broken_at_end */
  final def isLoopBrokenAtEnd(): Boolean = {
    if (gdext.classes.AnimationNodeOneShot.mb_is_loop_broken_at_end == null) gdext.classes.AnimationNodeOneShot.mb_is_loop_broken_at_end = MethodBind.get("AnimationNodeOneShot", "is_loop_broken_at_end", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeOneShot.mb_is_loop_broken_at_end, livePtr)
  }

  /** AnimationNodeOneShot.set_abort_on_reset */
  final def setAbortOnReset(enable: Boolean): Unit = {
    if (gdext.classes.AnimationNodeOneShot.mb_set_abort_on_reset == null) gdext.classes.AnimationNodeOneShot.mb_set_abort_on_reset = MethodBind.get("AnimationNodeOneShot", "set_abort_on_reset", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeOneShot.mb_set_abort_on_reset, livePtr, enable)
  }

  /** AnimationNodeOneShot.is_aborted_on_reset */
  final def isAbortedOnReset(): Boolean = {
    if (gdext.classes.AnimationNodeOneShot.mb_is_aborted_on_reset == null) gdext.classes.AnimationNodeOneShot.mb_is_aborted_on_reset = MethodBind.get("AnimationNodeOneShot", "is_aborted_on_reset", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeOneShot.mb_is_aborted_on_reset, livePtr)
  }

  /** AnimationNodeOneShot.set_autorestart */
  final def setAutorestart(active: Boolean): Unit = {
    if (gdext.classes.AnimationNodeOneShot.mb_set_autorestart == null) gdext.classes.AnimationNodeOneShot.mb_set_autorestart = MethodBind.get("AnimationNodeOneShot", "set_autorestart", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeOneShot.mb_set_autorestart, livePtr, active)
  }

  /** AnimationNodeOneShot.has_autorestart */
  final def hasAutorestart(): Boolean = {
    if (gdext.classes.AnimationNodeOneShot.mb_has_autorestart == null) gdext.classes.AnimationNodeOneShot.mb_has_autorestart = MethodBind.get("AnimationNodeOneShot", "has_autorestart", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeOneShot.mb_has_autorestart, livePtr)
  }

  /** AnimationNodeOneShot.set_autorestart_delay */
  final def setAutorestartDelay(time: Double): Unit = {
    if (gdext.classes.AnimationNodeOneShot.mb_set_autorestart_delay == null) gdext.classes.AnimationNodeOneShot.mb_set_autorestart_delay = MethodBind.get("AnimationNodeOneShot", "set_autorestart_delay", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeOneShot.mb_set_autorestart_delay, livePtr, time)
  }

  /** AnimationNodeOneShot.get_autorestart_delay */
  final def getAutorestartDelay(): Double = {
    if (gdext.classes.AnimationNodeOneShot.mb_get_autorestart_delay == null) gdext.classes.AnimationNodeOneShot.mb_get_autorestart_delay = MethodBind.get("AnimationNodeOneShot", "get_autorestart_delay", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeOneShot.mb_get_autorestart_delay, livePtr)
  }

  /** AnimationNodeOneShot.set_autorestart_random_delay */
  final def setAutorestartRandomDelay(time: Double): Unit = {
    if (gdext.classes.AnimationNodeOneShot.mb_set_autorestart_random_delay == null) gdext.classes.AnimationNodeOneShot.mb_set_autorestart_random_delay = MethodBind.get("AnimationNodeOneShot", "set_autorestart_random_delay", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeOneShot.mb_set_autorestart_random_delay, livePtr, time)
  }

  /** AnimationNodeOneShot.get_autorestart_random_delay */
  final def getAutorestartRandomDelay(): Double = {
    if (gdext.classes.AnimationNodeOneShot.mb_get_autorestart_random_delay == null) gdext.classes.AnimationNodeOneShot.mb_get_autorestart_random_delay = MethodBind.get("AnimationNodeOneShot", "get_autorestart_random_delay", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeOneShot.mb_get_autorestart_random_delay, livePtr)
  }

  /** AnimationNodeOneShot.set_mix_mode */
  final def setMixMode(mode: Long): Unit = {
    if (gdext.classes.AnimationNodeOneShot.mb_set_mix_mode == null) gdext.classes.AnimationNodeOneShot.mb_set_mix_mode = MethodBind.get("AnimationNodeOneShot", "set_mix_mode", 1018899799L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeOneShot.mb_set_mix_mode, livePtr, mode)
  }

  /** AnimationNodeOneShot.get_mix_mode */
  final def getMixMode(): Long = {
    if (gdext.classes.AnimationNodeOneShot.mb_get_mix_mode == null) gdext.classes.AnimationNodeOneShot.mb_get_mix_mode = MethodBind.get("AnimationNodeOneShot", "get_mix_mode", 3076550526L)
    Ptrcall.call0[Long](gdext.classes.AnimationNodeOneShot.mb_get_mix_mode, livePtr)
  }

}

object AnimationNodeOneShot {
  private[classes] var mb_set_fadein_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fadein_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fadein_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fadein_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fadeout_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fadeout_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fadeout_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fadeout_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_break_loop_at_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_loop_broken_at_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_abort_on_reset: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_aborted_on_reset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autorestart: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_autorestart: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autorestart_delay: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autorestart_delay: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autorestart_random_delay: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autorestart_random_delay: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mix_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mix_mode: GDExtensionMethodBindPtr = null
}
