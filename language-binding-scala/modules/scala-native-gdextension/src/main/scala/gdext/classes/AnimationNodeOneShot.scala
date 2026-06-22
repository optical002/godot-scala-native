package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeOneShot`, extends `AnimationNodeSync`. */
abstract class AnimationNodeOneShot extends AnimationNodeSync {

  /** AnimationNodeOneShot.set_fadein_time */
  final def setFadeinTime(time: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeOneShot", "set_fadein_time", 373806689L), hostObject.objectPtr, time)

  /** AnimationNodeOneShot.get_fadein_time */
  final def getFadeinTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeOneShot", "get_fadein_time", 1740695150L), hostObject.objectPtr)

  /** AnimationNodeOneShot.set_fadein_curve */
  final def setFadeinCurve(curve: Curve): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeOneShot", "set_fadein_curve", 270443179L), hostObject.objectPtr, curve.hostObject)

  /** AnimationNodeOneShot.get_fadein_curve */
  final def getFadeinCurve(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AnimationNodeOneShot", "get_fadein_curve", 2460114913L), hostObject.objectPtr)

  /** AnimationNodeOneShot.set_fadeout_time */
  final def setFadeoutTime(time: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeOneShot", "set_fadeout_time", 373806689L), hostObject.objectPtr, time)

  /** AnimationNodeOneShot.get_fadeout_time */
  final def getFadeoutTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeOneShot", "get_fadeout_time", 1740695150L), hostObject.objectPtr)

  /** AnimationNodeOneShot.set_fadeout_curve */
  final def setFadeoutCurve(curve: Curve): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeOneShot", "set_fadeout_curve", 270443179L), hostObject.objectPtr, curve.hostObject)

  /** AnimationNodeOneShot.get_fadeout_curve */
  final def getFadeoutCurve(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AnimationNodeOneShot", "get_fadeout_curve", 2460114913L), hostObject.objectPtr)

  /** AnimationNodeOneShot.set_break_loop_at_end */
  final def setBreakLoopAtEnd(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeOneShot", "set_break_loop_at_end", 2586408642L), hostObject.objectPtr, enable)

  /** AnimationNodeOneShot.is_loop_broken_at_end */
  final def isLoopBrokenAtEnd(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeOneShot", "is_loop_broken_at_end", 36873697L), hostObject.objectPtr)

  /** AnimationNodeOneShot.set_abort_on_reset */
  final def setAbortOnReset(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeOneShot", "set_abort_on_reset", 2586408642L), hostObject.objectPtr, enable)

  /** AnimationNodeOneShot.is_aborted_on_reset */
  final def isAbortedOnReset(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeOneShot", "is_aborted_on_reset", 36873697L), hostObject.objectPtr)

  /** AnimationNodeOneShot.set_autorestart */
  final def setAutorestart(active: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeOneShot", "set_autorestart", 2586408642L), hostObject.objectPtr, active)

  /** AnimationNodeOneShot.has_autorestart */
  final def hasAutorestart(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeOneShot", "has_autorestart", 36873697L), hostObject.objectPtr)

  /** AnimationNodeOneShot.set_autorestart_delay */
  final def setAutorestartDelay(time: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeOneShot", "set_autorestart_delay", 373806689L), hostObject.objectPtr, time)

  /** AnimationNodeOneShot.get_autorestart_delay */
  final def getAutorestartDelay(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeOneShot", "get_autorestart_delay", 1740695150L), hostObject.objectPtr)

  /** AnimationNodeOneShot.set_autorestart_random_delay */
  final def setAutorestartRandomDelay(time: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeOneShot", "set_autorestart_random_delay", 373806689L), hostObject.objectPtr, time)

  /** AnimationNodeOneShot.get_autorestart_random_delay */
  final def getAutorestartRandomDelay(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeOneShot", "get_autorestart_random_delay", 1740695150L), hostObject.objectPtr)

  /** AnimationNodeOneShot.set_mix_mode */
  final def setMixMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeOneShot", "set_mix_mode", 1018899799L), hostObject.objectPtr, mode)

  /** AnimationNodeOneShot.get_mix_mode */
  final def getMixMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationNodeOneShot", "get_mix_mode", 3076550526L), hostObject.objectPtr)

}

object AnimationNodeOneShot {
  /** Class metadata for Gd[AnimationNodeOneShot] lifetime management and casting. */
  given GodotClass[AnimationNodeOneShot] with {
    def className = "AnimationNodeOneShot"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeOneShot = new AnimationNodeOneShot {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeOneShot): GodotObject = t.hostObject
  }
}
