package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Timer`, extends `Node`. */
abstract class Timer extends Node {

  /** Timer.set_wait_time */
  final def setWaitTime(time_sec: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Timer", "set_wait_time", 373806689L), hostObject.objectPtr, time_sec)

  /** Timer.get_wait_time */
  final def getWaitTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("Timer", "get_wait_time", 1740695150L), hostObject.objectPtr)

  /** Timer.set_one_shot */
  final def setOneShot(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Timer", "set_one_shot", 2586408642L), hostObject.objectPtr, enable)

  /** Timer.is_one_shot */
  final def isOneShot(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Timer", "is_one_shot", 36873697L), hostObject.objectPtr)

  /** Timer.set_autostart */
  final def setAutostart(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Timer", "set_autostart", 2586408642L), hostObject.objectPtr, enable)

  /** Timer.has_autostart */
  final def hasAutostart(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Timer", "has_autostart", 36873697L), hostObject.objectPtr)

  /** Timer.start */
  final def start(time_sec: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Timer", "start", 1392008558L), hostObject.objectPtr, time_sec)

  /** Timer.stop */
  final def stop(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Timer", "stop", 3218959716L), hostObject.objectPtr)

  /** Timer.set_paused */
  final def setPaused(paused: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Timer", "set_paused", 2586408642L), hostObject.objectPtr, paused)

  /** Timer.is_paused */
  final def isPaused(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Timer", "is_paused", 36873697L), hostObject.objectPtr)

  /** Timer.set_ignore_time_scale */
  final def setIgnoreTimeScale(ignore: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Timer", "set_ignore_time_scale", 2586408642L), hostObject.objectPtr, ignore)

  /** Timer.is_ignoring_time_scale */
  final def isIgnoringTimeScale(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Timer", "is_ignoring_time_scale", 2240911060L), hostObject.objectPtr)

  /** Timer.is_stopped */
  final def isStopped(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Timer", "is_stopped", 36873697L), hostObject.objectPtr)

  /** Timer.get_time_left */
  final def getTimeLeft(): Double =
    Ptrcall.call0[Double](MethodBind.get("Timer", "get_time_left", 1740695150L), hostObject.objectPtr)

  /** Timer.set_timer_process_callback */
  final def setTimerProcessCallback(callback: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Timer", "set_timer_process_callback", 3469495063L), hostObject.objectPtr, callback)

  /** Timer.get_timer_process_callback */
  final def getTimerProcessCallback(): Long =
    Ptrcall.call0[Long](MethodBind.get("Timer", "get_timer_process_callback", 2672570227L), hostObject.objectPtr)

}

object Timer {
  /** Class metadata for Gd[Timer] lifetime management and casting. */
  given GodotClass[Timer] with {
    def className = "Timer"
    def isRefCounted = false
    def wrap(o: GodotObject): Timer = new Timer {}.withHost(o.objectPtr)
    def unwrap(t: Timer): GodotObject = t.hostObject
  }
}
