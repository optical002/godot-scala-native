package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Timer`, extends `Node`. */
abstract class Timer extends Node {
  override def godotClassName: String = "Timer"

  /** Timer.set_wait_time */
  final def setWaitTime(timeSec: Double): Unit = {
    if (gdext.classes.Timer.mb_set_wait_time == null) gdext.classes.Timer.mb_set_wait_time = MethodBind.get("Timer", "set_wait_time", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Timer.mb_set_wait_time, livePtr, timeSec)
  }

  /** Timer.get_wait_time */
  final def getWaitTime(): Double = {
    if (gdext.classes.Timer.mb_get_wait_time == null) gdext.classes.Timer.mb_get_wait_time = MethodBind.get("Timer", "get_wait_time", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Timer.mb_get_wait_time, livePtr)
  }

  /** Timer.set_one_shot */
  final def setOneShot(enable: Boolean): Unit = {
    if (gdext.classes.Timer.mb_set_one_shot == null) gdext.classes.Timer.mb_set_one_shot = MethodBind.get("Timer", "set_one_shot", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Timer.mb_set_one_shot, livePtr, enable)
  }

  /** Timer.is_one_shot */
  final def isOneShot(): Boolean = {
    if (gdext.classes.Timer.mb_is_one_shot == null) gdext.classes.Timer.mb_is_one_shot = MethodBind.get("Timer", "is_one_shot", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Timer.mb_is_one_shot, livePtr)
  }

  /** Timer.set_autostart */
  final def setAutostart(enable: Boolean): Unit = {
    if (gdext.classes.Timer.mb_set_autostart == null) gdext.classes.Timer.mb_set_autostart = MethodBind.get("Timer", "set_autostart", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Timer.mb_set_autostart, livePtr, enable)
  }

  /** Timer.has_autostart */
  final def hasAutostart(): Boolean = {
    if (gdext.classes.Timer.mb_has_autostart == null) gdext.classes.Timer.mb_has_autostart = MethodBind.get("Timer", "has_autostart", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Timer.mb_has_autostart, livePtr)
  }

  /** Timer.start */
  final def start(timeSec: Double = -1.0): Unit = {
    if (gdext.classes.Timer.mb_start == null) gdext.classes.Timer.mb_start = MethodBind.get("Timer", "start", 1392008558L)
    Ptrcall.callVoid1(gdext.classes.Timer.mb_start, livePtr, timeSec)
  }

  /** Timer.stop */
  final def stop(): Unit = {
    if (gdext.classes.Timer.mb_stop == null) gdext.classes.Timer.mb_stop = MethodBind.get("Timer", "stop", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Timer.mb_stop, livePtr)
  }

  /** Timer.set_paused */
  final def setPaused(paused: Boolean): Unit = {
    if (gdext.classes.Timer.mb_set_paused == null) gdext.classes.Timer.mb_set_paused = MethodBind.get("Timer", "set_paused", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Timer.mb_set_paused, livePtr, paused)
  }

  /** Timer.is_paused */
  final def isPaused(): Boolean = {
    if (gdext.classes.Timer.mb_is_paused == null) gdext.classes.Timer.mb_is_paused = MethodBind.get("Timer", "is_paused", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Timer.mb_is_paused, livePtr)
  }

  /** Timer.set_ignore_time_scale */
  final def setIgnoreTimeScale(ignore: Boolean): Unit = {
    if (gdext.classes.Timer.mb_set_ignore_time_scale == null) gdext.classes.Timer.mb_set_ignore_time_scale = MethodBind.get("Timer", "set_ignore_time_scale", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Timer.mb_set_ignore_time_scale, livePtr, ignore)
  }

  /** Timer.is_ignoring_time_scale */
  final def isIgnoringTimeScale(): Boolean = {
    if (gdext.classes.Timer.mb_is_ignoring_time_scale == null) gdext.classes.Timer.mb_is_ignoring_time_scale = MethodBind.get("Timer", "is_ignoring_time_scale", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.Timer.mb_is_ignoring_time_scale, livePtr)
  }

  /** Timer.is_stopped */
  final def isStopped(): Boolean = {
    if (gdext.classes.Timer.mb_is_stopped == null) gdext.classes.Timer.mb_is_stopped = MethodBind.get("Timer", "is_stopped", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Timer.mb_is_stopped, livePtr)
  }

  /** Timer.get_time_left */
  final def getTimeLeft(): Double = {
    if (gdext.classes.Timer.mb_get_time_left == null) gdext.classes.Timer.mb_get_time_left = MethodBind.get("Timer", "get_time_left", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Timer.mb_get_time_left, livePtr)
  }

  /** Timer.set_timer_process_callback */
  final def setTimerProcessCallback(callback: gdext.classes.Timer.TimerProcessCallback): Unit = {
    if (gdext.classes.Timer.mb_set_timer_process_callback == null) gdext.classes.Timer.mb_set_timer_process_callback = MethodBind.get("Timer", "set_timer_process_callback", 3469495063L)
    Ptrcall.callVoid1(gdext.classes.Timer.mb_set_timer_process_callback, livePtr, callback)
  }

  /** Timer.get_timer_process_callback */
  final def getTimerProcessCallback(): gdext.classes.Timer.TimerProcessCallback = {
    if (gdext.classes.Timer.mb_get_timer_process_callback == null) gdext.classes.Timer.mb_get_timer_process_callback = MethodBind.get("Timer", "get_timer_process_callback", 2672570227L)
    gdext.classes.Timer.TimerProcessCallback(Ptrcall.call0[Long](gdext.classes.Timer.mb_get_timer_process_callback, livePtr))
  }

}

object Timer {
  private[classes] var mb_set_wait_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_wait_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_one_shot: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_one_shot: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autostart: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_autostart: GDExtensionMethodBindPtr = null
  private[classes] var mb_start: GDExtensionMethodBindPtr = null
  private[classes] var mb_stop: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_paused: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_paused: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ignore_time_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_ignoring_time_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_stopped: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_time_left: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_timer_process_callback: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_timer_process_callback: GDExtensionMethodBindPtr = null

  /** Godot enum `Timer.TimerProcessCallback`. */
  opaque type TimerProcessCallback <: Long = Long

  object TimerProcessCallback {
    final val Physics: TimerProcessCallback = 0L.asInstanceOf[TimerProcessCallback]
    final val Idle: TimerProcessCallback = 1L.asInstanceOf[TimerProcessCallback]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TimerProcessCallback = value.asInstanceOf[TimerProcessCallback]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TimerProcessCallback] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[TimerProcessCallback]]

    extension (self: TimerProcessCallback)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Physics"
        case 1L => "Idle"
        case other => other.toString
      }
  }
}
