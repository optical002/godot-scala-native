package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationNodeAnimation`, extends `AnimationRootNode`. */
abstract class AnimationNodeAnimation extends AnimationRootNode {
  override def godotClassName: String = "AnimationNodeAnimation"

  /** AnimationNodeAnimation.set_animation */
  final def setAnimation(name: String): Unit = {
    if (gdext.classes.AnimationNodeAnimation.mb_set_animation == null) gdext.classes.AnimationNodeAnimation.mb_set_animation = MethodBind.get("AnimationNodeAnimation", "set_animation", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeAnimation.mb_set_animation, livePtr, SnArg(name))
  }

  /** AnimationNodeAnimation.get_animation */
  final def getAnimation(): String = {
    if (gdext.classes.AnimationNodeAnimation.mb_get_animation == null) gdext.classes.AnimationNodeAnimation.mb_get_animation = MethodBind.get("AnimationNodeAnimation", "get_animation", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.AnimationNodeAnimation.mb_get_animation, livePtr)
  }

  /** AnimationNodeAnimation.set_play_mode */
  final def setPlayMode(mode: gdext.classes.AnimationNodeAnimation.PlayMode): Unit = {
    if (gdext.classes.AnimationNodeAnimation.mb_set_play_mode == null) gdext.classes.AnimationNodeAnimation.mb_set_play_mode = MethodBind.get("AnimationNodeAnimation", "set_play_mode", 3347718873L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeAnimation.mb_set_play_mode, livePtr, mode)
  }

  /** AnimationNodeAnimation.get_play_mode */
  final def getPlayMode(): gdext.classes.AnimationNodeAnimation.PlayMode = {
    if (gdext.classes.AnimationNodeAnimation.mb_get_play_mode == null) gdext.classes.AnimationNodeAnimation.mb_get_play_mode = MethodBind.get("AnimationNodeAnimation", "get_play_mode", 2061244637L)
    gdext.classes.AnimationNodeAnimation.PlayMode(Ptrcall.call0[Long](gdext.classes.AnimationNodeAnimation.mb_get_play_mode, livePtr))
  }

  /** AnimationNodeAnimation.set_advance_on_start */
  final def setAdvanceOnStart(advanceOnStart: Boolean): Unit = {
    if (gdext.classes.AnimationNodeAnimation.mb_set_advance_on_start == null) gdext.classes.AnimationNodeAnimation.mb_set_advance_on_start = MethodBind.get("AnimationNodeAnimation", "set_advance_on_start", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeAnimation.mb_set_advance_on_start, livePtr, advanceOnStart)
  }

  /** AnimationNodeAnimation.is_advance_on_start */
  final def isAdvanceOnStart(): Boolean = {
    if (gdext.classes.AnimationNodeAnimation.mb_is_advance_on_start == null) gdext.classes.AnimationNodeAnimation.mb_is_advance_on_start = MethodBind.get("AnimationNodeAnimation", "is_advance_on_start", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeAnimation.mb_is_advance_on_start, livePtr)
  }

  /** AnimationNodeAnimation.set_use_custom_timeline */
  final def setUseCustomTimeline(useCustomTimeline: Boolean): Unit = {
    if (gdext.classes.AnimationNodeAnimation.mb_set_use_custom_timeline == null) gdext.classes.AnimationNodeAnimation.mb_set_use_custom_timeline = MethodBind.get("AnimationNodeAnimation", "set_use_custom_timeline", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeAnimation.mb_set_use_custom_timeline, livePtr, useCustomTimeline)
  }

  /** AnimationNodeAnimation.is_using_custom_timeline */
  final def isUsingCustomTimeline(): Boolean = {
    if (gdext.classes.AnimationNodeAnimation.mb_is_using_custom_timeline == null) gdext.classes.AnimationNodeAnimation.mb_is_using_custom_timeline = MethodBind.get("AnimationNodeAnimation", "is_using_custom_timeline", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeAnimation.mb_is_using_custom_timeline, livePtr)
  }

  /** AnimationNodeAnimation.set_timeline_length */
  final def setTimelineLength(timelineLength: Double): Unit = {
    if (gdext.classes.AnimationNodeAnimation.mb_set_timeline_length == null) gdext.classes.AnimationNodeAnimation.mb_set_timeline_length = MethodBind.get("AnimationNodeAnimation", "set_timeline_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeAnimation.mb_set_timeline_length, livePtr, timelineLength)
  }

  /** AnimationNodeAnimation.get_timeline_length */
  final def getTimelineLength(): Double = {
    if (gdext.classes.AnimationNodeAnimation.mb_get_timeline_length == null) gdext.classes.AnimationNodeAnimation.mb_get_timeline_length = MethodBind.get("AnimationNodeAnimation", "get_timeline_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeAnimation.mb_get_timeline_length, livePtr)
  }

  /** AnimationNodeAnimation.set_stretch_time_scale */
  final def setStretchTimeScale(stretchTimeScale: Boolean): Unit = {
    if (gdext.classes.AnimationNodeAnimation.mb_set_stretch_time_scale == null) gdext.classes.AnimationNodeAnimation.mb_set_stretch_time_scale = MethodBind.get("AnimationNodeAnimation", "set_stretch_time_scale", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeAnimation.mb_set_stretch_time_scale, livePtr, stretchTimeScale)
  }

  /** AnimationNodeAnimation.is_stretching_time_scale */
  final def isStretchingTimeScale(): Boolean = {
    if (gdext.classes.AnimationNodeAnimation.mb_is_stretching_time_scale == null) gdext.classes.AnimationNodeAnimation.mb_is_stretching_time_scale = MethodBind.get("AnimationNodeAnimation", "is_stretching_time_scale", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeAnimation.mb_is_stretching_time_scale, livePtr)
  }

  /** AnimationNodeAnimation.set_start_offset */
  final def setStartOffset(startOffset: Double): Unit = {
    if (gdext.classes.AnimationNodeAnimation.mb_set_start_offset == null) gdext.classes.AnimationNodeAnimation.mb_set_start_offset = MethodBind.get("AnimationNodeAnimation", "set_start_offset", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeAnimation.mb_set_start_offset, livePtr, startOffset)
  }

  /** AnimationNodeAnimation.get_start_offset */
  final def getStartOffset(): Double = {
    if (gdext.classes.AnimationNodeAnimation.mb_get_start_offset == null) gdext.classes.AnimationNodeAnimation.mb_get_start_offset = MethodBind.get("AnimationNodeAnimation", "get_start_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeAnimation.mb_get_start_offset, livePtr)
  }

  /** AnimationNodeAnimation.set_loop_mode */
  final def setLoopMode(loopMode: gdext.classes.Animation.LoopMode): Unit = {
    if (gdext.classes.AnimationNodeAnimation.mb_set_loop_mode == null) gdext.classes.AnimationNodeAnimation.mb_set_loop_mode = MethodBind.get("AnimationNodeAnimation", "set_loop_mode", 3155355575L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeAnimation.mb_set_loop_mode, livePtr, loopMode)
  }

  /** AnimationNodeAnimation.get_loop_mode */
  final def getLoopMode(): gdext.classes.Animation.LoopMode = {
    if (gdext.classes.AnimationNodeAnimation.mb_get_loop_mode == null) gdext.classes.AnimationNodeAnimation.mb_get_loop_mode = MethodBind.get("AnimationNodeAnimation", "get_loop_mode", 1988889481L)
    gdext.classes.Animation.LoopMode(Ptrcall.call0[Long](gdext.classes.AnimationNodeAnimation.mb_get_loop_mode, livePtr))
  }

}

object AnimationNodeAnimation {
  private[classes] var mb_set_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_play_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_play_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_advance_on_start: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_advance_on_start: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_custom_timeline: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_custom_timeline: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_timeline_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_timeline_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stretch_time_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_stretching_time_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_start_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_start_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_loop_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_loop_mode: GDExtensionMethodBindPtr = null

  /** Godot enum `AnimationNodeAnimation.PlayMode`. */
  opaque type PlayMode <: Long = Long

  object PlayMode {
    final val Forward: PlayMode = 0L.asInstanceOf[PlayMode]
    final val Backward: PlayMode = 1L.asInstanceOf[PlayMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PlayMode = value.asInstanceOf[PlayMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PlayMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[PlayMode]]

    extension (self: PlayMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Forward"
        case 1L => "Backward"
        case other => other.toString
      }
  }
}
