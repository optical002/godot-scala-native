package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Tween`, extends `RefCounted`. */
abstract class Tween extends RefCounted {
  override def godotClassName: String = "Tween"

  /** Tween.tween_interval. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def tweenInterval(time: Double): IntervalTweener = {
    if (gdext.classes.Tween.mb_tween_interval == null) gdext.classes.Tween.mb_tween_interval = MethodBind.get("Tween", "tween_interval", 413360199L)
    Wrappers.owned[IntervalTweener](Ptrcall.call1[Double, Long](gdext.classes.Tween.mb_tween_interval, livePtr, time))
  }

  /** Tween.tween_subtween. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def tweenSubtween(subtween: Tween): SubtweenTweener = {
    if (gdext.classes.Tween.mb_tween_subtween == null) gdext.classes.Tween.mb_tween_subtween = MethodBind.get("Tween", "tween_subtween", 1567358477L)
    Wrappers.owned[SubtweenTweener](Ptrcall.call1[GodotObject, Long](gdext.classes.Tween.mb_tween_subtween, livePtr, Wrappers.handle(subtween)))
  }

  /** Tween.custom_step */
  final def customStep(delta: Double): Boolean = {
    if (gdext.classes.Tween.mb_custom_step == null) gdext.classes.Tween.mb_custom_step = MethodBind.get("Tween", "custom_step", 330693286L)
    Ptrcall.call1[Double, Boolean](gdext.classes.Tween.mb_custom_step, livePtr, delta)
  }

  /** Tween.stop */
  final def stop(): Unit = {
    if (gdext.classes.Tween.mb_stop == null) gdext.classes.Tween.mb_stop = MethodBind.get("Tween", "stop", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Tween.mb_stop, livePtr)
  }

  /** Tween.pause */
  final def pause(): Unit = {
    if (gdext.classes.Tween.mb_pause == null) gdext.classes.Tween.mb_pause = MethodBind.get("Tween", "pause", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Tween.mb_pause, livePtr)
  }

  /** Tween.play */
  final def play(): Unit = {
    if (gdext.classes.Tween.mb_play == null) gdext.classes.Tween.mb_play = MethodBind.get("Tween", "play", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Tween.mb_play, livePtr)
  }

  /** Tween.kill */
  final def kill(): Unit = {
    if (gdext.classes.Tween.mb_kill == null) gdext.classes.Tween.mb_kill = MethodBind.get("Tween", "kill", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Tween.mb_kill, livePtr)
  }

  /** Tween.get_total_elapsed_time */
  final def getTotalElapsedTime(): Double = {
    if (gdext.classes.Tween.mb_get_total_elapsed_time == null) gdext.classes.Tween.mb_get_total_elapsed_time = MethodBind.get("Tween", "get_total_elapsed_time", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Tween.mb_get_total_elapsed_time, livePtr)
  }

  /** Tween.is_running */
  final def isRunning(): Boolean = {
    if (gdext.classes.Tween.mb_is_running == null) gdext.classes.Tween.mb_is_running = MethodBind.get("Tween", "is_running", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.Tween.mb_is_running, livePtr)
  }

  /** Tween.is_valid */
  final def isValid(): Boolean = {
    if (gdext.classes.Tween.mb_is_valid == null) gdext.classes.Tween.mb_is_valid = MethodBind.get("Tween", "is_valid", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.Tween.mb_is_valid, livePtr)
  }

  /** Tween.bind_node. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def bindNode(node: Node): Tween = {
    if (gdext.classes.Tween.mb_bind_node == null) gdext.classes.Tween.mb_bind_node = MethodBind.get("Tween", "bind_node", 2946786331L)
    Wrappers.owned[Tween](Ptrcall.call1[GodotObject, Long](gdext.classes.Tween.mb_bind_node, livePtr, Wrappers.handle(node)))
  }

  /** Tween.set_process_mode. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def setProcessMode(mode: gdext.classes.Tween.TweenProcessMode): Tween = {
    if (gdext.classes.Tween.mb_set_process_mode == null) gdext.classes.Tween.mb_set_process_mode = MethodBind.get("Tween", "set_process_mode", 855258840L)
    Wrappers.owned[Tween](Ptrcall.call1[Long, Long](gdext.classes.Tween.mb_set_process_mode, livePtr, mode))
  }

  /** Tween.set_pause_mode. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def setPauseMode(mode: gdext.classes.Tween.TweenPauseMode): Tween = {
    if (gdext.classes.Tween.mb_set_pause_mode == null) gdext.classes.Tween.mb_set_pause_mode = MethodBind.get("Tween", "set_pause_mode", 3363368837L)
    Wrappers.owned[Tween](Ptrcall.call1[Long, Long](gdext.classes.Tween.mb_set_pause_mode, livePtr, mode))
  }

  /** Tween.set_ignore_time_scale. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def setIgnoreTimeScale(ignore: Boolean = true): Tween = {
    if (gdext.classes.Tween.mb_set_ignore_time_scale == null) gdext.classes.Tween.mb_set_ignore_time_scale = MethodBind.get("Tween", "set_ignore_time_scale", 1942052223L)
    Wrappers.owned[Tween](Ptrcall.call1[Boolean, Long](gdext.classes.Tween.mb_set_ignore_time_scale, livePtr, ignore))
  }

  /** Tween.set_parallel. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def setParallel(parallel: Boolean = true): Tween = {
    if (gdext.classes.Tween.mb_set_parallel == null) gdext.classes.Tween.mb_set_parallel = MethodBind.get("Tween", "set_parallel", 1942052223L)
    Wrappers.owned[Tween](Ptrcall.call1[Boolean, Long](gdext.classes.Tween.mb_set_parallel, livePtr, parallel))
  }

  /** Tween.set_loops. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def setLoops(loops: Long = 0L): Tween = {
    if (gdext.classes.Tween.mb_set_loops == null) gdext.classes.Tween.mb_set_loops = MethodBind.get("Tween", "set_loops", 2670836414L)
    Wrappers.owned[Tween](Ptrcall.call1[Long, Long](gdext.classes.Tween.mb_set_loops, livePtr, loops))
  }

  /** Tween.get_loops_left */
  final def getLoopsLeft(): Long = {
    if (gdext.classes.Tween.mb_get_loops_left == null) gdext.classes.Tween.mb_get_loops_left = MethodBind.get("Tween", "get_loops_left", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Tween.mb_get_loops_left, livePtr)
  }

  /** Tween.set_speed_scale. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def setSpeedScale(speed: Double): Tween = {
    if (gdext.classes.Tween.mb_set_speed_scale == null) gdext.classes.Tween.mb_set_speed_scale = MethodBind.get("Tween", "set_speed_scale", 3961971106L)
    Wrappers.owned[Tween](Ptrcall.call1[Double, Long](gdext.classes.Tween.mb_set_speed_scale, livePtr, speed))
  }

  /** Tween.set_trans. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def setTrans(trans: gdext.classes.Tween.TransitionType): Tween = {
    if (gdext.classes.Tween.mb_set_trans == null) gdext.classes.Tween.mb_set_trans = MethodBind.get("Tween", "set_trans", 3965963875L)
    Wrappers.owned[Tween](Ptrcall.call1[Long, Long](gdext.classes.Tween.mb_set_trans, livePtr, trans))
  }

  /** Tween.set_ease. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def setEase(ease: gdext.classes.Tween.EaseType): Tween = {
    if (gdext.classes.Tween.mb_set_ease == null) gdext.classes.Tween.mb_set_ease = MethodBind.get("Tween", "set_ease", 1208117252L)
    Wrappers.owned[Tween](Ptrcall.call1[Long, Long](gdext.classes.Tween.mb_set_ease, livePtr, ease))
  }

  /** Tween.parallel. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def parallel(): Tween = {
    if (gdext.classes.Tween.mb_parallel == null) gdext.classes.Tween.mb_parallel = MethodBind.get("Tween", "parallel", 3426978995L)
    Wrappers.owned[Tween](Ptrcall.call0[Long](gdext.classes.Tween.mb_parallel, livePtr))
  }

  /** Tween.chain. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def chain(): Tween = {
    if (gdext.classes.Tween.mb_chain == null) gdext.classes.Tween.mb_chain = MethodBind.get("Tween", "chain", 3426978995L)
    Wrappers.owned[Tween](Ptrcall.call0[Long](gdext.classes.Tween.mb_chain, livePtr))
  }

}

object Tween {
  private[classes] var mb_tween_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_tween_subtween: GDExtensionMethodBindPtr = null
  private[classes] var mb_custom_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_stop: GDExtensionMethodBindPtr = null
  private[classes] var mb_pause: GDExtensionMethodBindPtr = null
  private[classes] var mb_play: GDExtensionMethodBindPtr = null
  private[classes] var mb_kill: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_total_elapsed_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_running: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_valid: GDExtensionMethodBindPtr = null
  private[classes] var mb_bind_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pause_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ignore_time_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_parallel: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_loops: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_loops_left: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_trans: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ease: GDExtensionMethodBindPtr = null
  private[classes] var mb_parallel: GDExtensionMethodBindPtr = null
  private[classes] var mb_chain: GDExtensionMethodBindPtr = null

  /** Godot enum `Tween.TweenProcessMode`. */
  opaque type TweenProcessMode <: Long = Long

  object TweenProcessMode {
    final val Physics: TweenProcessMode = 0L.asInstanceOf[TweenProcessMode]
    final val Idle: TweenProcessMode = 1L.asInstanceOf[TweenProcessMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TweenProcessMode = value.asInstanceOf[TweenProcessMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TweenProcessMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[TweenProcessMode]]

    extension (self: TweenProcessMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Physics"
        case 1L => "Idle"
        case other => other.toString
      }
  }

  /** Godot enum `Tween.TweenPauseMode`. */
  opaque type TweenPauseMode <: Long = Long

  object TweenPauseMode {
    final val Bound: TweenPauseMode = 0L.asInstanceOf[TweenPauseMode]
    final val Stop: TweenPauseMode = 1L.asInstanceOf[TweenPauseMode]
    final val Process: TweenPauseMode = 2L.asInstanceOf[TweenPauseMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TweenPauseMode = value.asInstanceOf[TweenPauseMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TweenPauseMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[TweenPauseMode]]

    extension (self: TweenPauseMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Bound"
        case 1L => "Stop"
        case 2L => "Process"
        case other => other.toString
      }
  }

  /** Godot enum `Tween.TransitionType`. */
  opaque type TransitionType <: Long = Long

  object TransitionType {
    final val Linear: TransitionType = 0L.asInstanceOf[TransitionType]
    final val Sine: TransitionType = 1L.asInstanceOf[TransitionType]
    final val Quint: TransitionType = 2L.asInstanceOf[TransitionType]
    final val Quart: TransitionType = 3L.asInstanceOf[TransitionType]
    final val Quad: TransitionType = 4L.asInstanceOf[TransitionType]
    final val Expo: TransitionType = 5L.asInstanceOf[TransitionType]
    final val Elastic: TransitionType = 6L.asInstanceOf[TransitionType]
    final val Cubic: TransitionType = 7L.asInstanceOf[TransitionType]
    final val Circ: TransitionType = 8L.asInstanceOf[TransitionType]
    final val Bounce: TransitionType = 9L.asInstanceOf[TransitionType]
    final val Back: TransitionType = 10L.asInstanceOf[TransitionType]
    final val Spring: TransitionType = 11L.asInstanceOf[TransitionType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TransitionType = value.asInstanceOf[TransitionType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TransitionType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L).asInstanceOf[scala.IArray[TransitionType]]

    extension (self: TransitionType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Linear"
        case 1L => "Sine"
        case 2L => "Quint"
        case 3L => "Quart"
        case 4L => "Quad"
        case 5L => "Expo"
        case 6L => "Elastic"
        case 7L => "Cubic"
        case 8L => "Circ"
        case 9L => "Bounce"
        case 10L => "Back"
        case 11L => "Spring"
        case other => other.toString
      }
  }

  /** Godot enum `Tween.EaseType`. */
  opaque type EaseType <: Long = Long

  object EaseType {
    final val In: EaseType = 0L.asInstanceOf[EaseType]
    final val Out: EaseType = 1L.asInstanceOf[EaseType]
    final val InOut: EaseType = 2L.asInstanceOf[EaseType]
    final val OutIn: EaseType = 3L.asInstanceOf[EaseType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EaseType = value.asInstanceOf[EaseType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EaseType] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[EaseType]]

    extension (self: EaseType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "In"
        case 1L => "Out"
        case 2L => "InOut"
        case 3L => "OutIn"
        case other => other.toString
      }
  }
}
