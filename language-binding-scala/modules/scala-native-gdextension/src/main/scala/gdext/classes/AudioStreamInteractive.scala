package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamInteractive`, extends `AudioStream`. */
abstract class AudioStreamInteractive extends AudioStream {
  override def godotClassName: String = "AudioStreamInteractive"

  /** AudioStreamInteractive.set_clip_count */
  final def setClipCount(clipCount: Long): Unit = {
    if (gdext.classes.AudioStreamInteractive.mb_set_clip_count == null) gdext.classes.AudioStreamInteractive.mb_set_clip_count = MethodBind.get("AudioStreamInteractive", "set_clip_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamInteractive.mb_set_clip_count, livePtr, clipCount)
  }

  /** AudioStreamInteractive.get_clip_count */
  final def getClipCount(): Long = {
    if (gdext.classes.AudioStreamInteractive.mb_get_clip_count == null) gdext.classes.AudioStreamInteractive.mb_get_clip_count = MethodBind.get("AudioStreamInteractive", "get_clip_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamInteractive.mb_get_clip_count, livePtr)
  }

  /** AudioStreamInteractive.set_initial_clip */
  final def setInitialClip(clipIndex: Long): Unit = {
    if (gdext.classes.AudioStreamInteractive.mb_set_initial_clip == null) gdext.classes.AudioStreamInteractive.mb_set_initial_clip = MethodBind.get("AudioStreamInteractive", "set_initial_clip", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamInteractive.mb_set_initial_clip, livePtr, clipIndex)
  }

  /** AudioStreamInteractive.get_initial_clip */
  final def getInitialClip(): Long = {
    if (gdext.classes.AudioStreamInteractive.mb_get_initial_clip == null) gdext.classes.AudioStreamInteractive.mb_get_initial_clip = MethodBind.get("AudioStreamInteractive", "get_initial_clip", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamInteractive.mb_get_initial_clip, livePtr)
  }

  /** AudioStreamInteractive.set_clip_name */
  final def setClipName(clipIndex: Long, name: String): Unit = {
    if (gdext.classes.AudioStreamInteractive.mb_set_clip_name == null) gdext.classes.AudioStreamInteractive.mb_set_clip_name = MethodBind.get("AudioStreamInteractive", "set_clip_name", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamInteractive.mb_set_clip_name, livePtr, clipIndex, SnArg(name))
  }

  /** AudioStreamInteractive.get_clip_name */
  final def getClipName(clipIndex: Long): String = {
    if (gdext.classes.AudioStreamInteractive.mb_get_clip_name == null) gdext.classes.AudioStreamInteractive.mb_get_clip_name = MethodBind.get("AudioStreamInteractive", "get_clip_name", 659327637L)
    Ptrcall.call1[Long, SnArg](gdext.classes.AudioStreamInteractive.mb_get_clip_name, livePtr, clipIndex)
  }

  /** AudioStreamInteractive.set_clip_stream */
  final def setClipStream(clipIndex: Long, stream: AudioStream): Unit = {
    if (gdext.classes.AudioStreamInteractive.mb_set_clip_stream == null) gdext.classes.AudioStreamInteractive.mb_set_clip_stream = MethodBind.get("AudioStreamInteractive", "set_clip_stream", 111075094L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamInteractive.mb_set_clip_stream, livePtr, clipIndex, Wrappers.handle(stream))
  }

  /** AudioStreamInteractive.get_clip_stream. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getClipStream(clipIndex: Long): AudioStream = {
    if (gdext.classes.AudioStreamInteractive.mb_get_clip_stream == null) gdext.classes.AudioStreamInteractive.mb_get_clip_stream = MethodBind.get("AudioStreamInteractive", "get_clip_stream", 2739380747L)
    Wrappers.owned[AudioStream](Ptrcall.call1[Long, Long](gdext.classes.AudioStreamInteractive.mb_get_clip_stream, livePtr, clipIndex))
  }

  /** AudioStreamInteractive.set_clip_auto_advance */
  final def setClipAutoAdvance(clipIndex: Long, mode: gdext.classes.AudioStreamInteractive.AutoAdvanceMode): Unit = {
    if (gdext.classes.AudioStreamInteractive.mb_set_clip_auto_advance == null) gdext.classes.AudioStreamInteractive.mb_set_clip_auto_advance = MethodBind.get("AudioStreamInteractive", "set_clip_auto_advance", 57217598L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamInteractive.mb_set_clip_auto_advance, livePtr, clipIndex, mode)
  }

  /** AudioStreamInteractive.get_clip_auto_advance */
  final def getClipAutoAdvance(clipIndex: Long): gdext.classes.AudioStreamInteractive.AutoAdvanceMode = {
    if (gdext.classes.AudioStreamInteractive.mb_get_clip_auto_advance == null) gdext.classes.AudioStreamInteractive.mb_get_clip_auto_advance = MethodBind.get("AudioStreamInteractive", "get_clip_auto_advance", 1778634807L)
    gdext.classes.AudioStreamInteractive.AutoAdvanceMode(Ptrcall.call1[Long, Long](gdext.classes.AudioStreamInteractive.mb_get_clip_auto_advance, livePtr, clipIndex))
  }

  /** AudioStreamInteractive.set_clip_auto_advance_next_clip */
  final def setClipAutoAdvanceNextClip(clipIndex: Long, autoAdvanceNextClip: Long): Unit = {
    if (gdext.classes.AudioStreamInteractive.mb_set_clip_auto_advance_next_clip == null) gdext.classes.AudioStreamInteractive.mb_set_clip_auto_advance_next_clip = MethodBind.get("AudioStreamInteractive", "set_clip_auto_advance_next_clip", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamInteractive.mb_set_clip_auto_advance_next_clip, livePtr, clipIndex, autoAdvanceNextClip)
  }

  /** AudioStreamInteractive.get_clip_auto_advance_next_clip */
  final def getClipAutoAdvanceNextClip(clipIndex: Long): Long = {
    if (gdext.classes.AudioStreamInteractive.mb_get_clip_auto_advance_next_clip == null) gdext.classes.AudioStreamInteractive.mb_get_clip_auto_advance_next_clip = MethodBind.get("AudioStreamInteractive", "get_clip_auto_advance_next_clip", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.AudioStreamInteractive.mb_get_clip_auto_advance_next_clip, livePtr, clipIndex)
  }

  /** AudioStreamInteractive.has_transition */
  final def hasTransition(fromClip: Long, toClip: Long): Boolean = {
    if (gdext.classes.AudioStreamInteractive.mb_has_transition == null) gdext.classes.AudioStreamInteractive.mb_has_transition = MethodBind.get("AudioStreamInteractive", "has_transition", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.AudioStreamInteractive.mb_has_transition, livePtr, fromClip, toClip)
  }

  /** AudioStreamInteractive.erase_transition */
  final def eraseTransition(fromClip: Long, toClip: Long): Unit = {
    if (gdext.classes.AudioStreamInteractive.mb_erase_transition == null) gdext.classes.AudioStreamInteractive.mb_erase_transition = MethodBind.get("AudioStreamInteractive", "erase_transition", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamInteractive.mb_erase_transition, livePtr, fromClip, toClip)
  }

  /** AudioStreamInteractive.get_transition_from_time */
  final def getTransitionFromTime(fromClip: Long, toClip: Long): gdext.classes.AudioStreamInteractive.TransitionFromTime = {
    if (gdext.classes.AudioStreamInteractive.mb_get_transition_from_time == null) gdext.classes.AudioStreamInteractive.mb_get_transition_from_time = MethodBind.get("AudioStreamInteractive", "get_transition_from_time", 3453338158L)
    gdext.classes.AudioStreamInteractive.TransitionFromTime(Ptrcall.call2[Long, Long, Long](gdext.classes.AudioStreamInteractive.mb_get_transition_from_time, livePtr, fromClip, toClip))
  }

  /** AudioStreamInteractive.get_transition_to_time */
  final def getTransitionToTime(fromClip: Long, toClip: Long): gdext.classes.AudioStreamInteractive.TransitionToTime = {
    if (gdext.classes.AudioStreamInteractive.mb_get_transition_to_time == null) gdext.classes.AudioStreamInteractive.mb_get_transition_to_time = MethodBind.get("AudioStreamInteractive", "get_transition_to_time", 1369651373L)
    gdext.classes.AudioStreamInteractive.TransitionToTime(Ptrcall.call2[Long, Long, Long](gdext.classes.AudioStreamInteractive.mb_get_transition_to_time, livePtr, fromClip, toClip))
  }

  /** AudioStreamInteractive.get_transition_fade_mode */
  final def getTransitionFadeMode(fromClip: Long, toClip: Long): gdext.classes.AudioStreamInteractive.FadeMode = {
    if (gdext.classes.AudioStreamInteractive.mb_get_transition_fade_mode == null) gdext.classes.AudioStreamInteractive.mb_get_transition_fade_mode = MethodBind.get("AudioStreamInteractive", "get_transition_fade_mode", 4065396087L)
    gdext.classes.AudioStreamInteractive.FadeMode(Ptrcall.call2[Long, Long, Long](gdext.classes.AudioStreamInteractive.mb_get_transition_fade_mode, livePtr, fromClip, toClip))
  }

  /** AudioStreamInteractive.get_transition_fade_beats */
  final def getTransitionFadeBeats(fromClip: Long, toClip: Long): Double = {
    if (gdext.classes.AudioStreamInteractive.mb_get_transition_fade_beats == null) gdext.classes.AudioStreamInteractive.mb_get_transition_fade_beats = MethodBind.get("AudioStreamInteractive", "get_transition_fade_beats", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.AudioStreamInteractive.mb_get_transition_fade_beats, livePtr, fromClip, toClip)
  }

  /** AudioStreamInteractive.is_transition_using_filler_clip */
  final def isTransitionUsingFillerClip(fromClip: Long, toClip: Long): Boolean = {
    if (gdext.classes.AudioStreamInteractive.mb_is_transition_using_filler_clip == null) gdext.classes.AudioStreamInteractive.mb_is_transition_using_filler_clip = MethodBind.get("AudioStreamInteractive", "is_transition_using_filler_clip", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.AudioStreamInteractive.mb_is_transition_using_filler_clip, livePtr, fromClip, toClip)
  }

  /** AudioStreamInteractive.get_transition_filler_clip */
  final def getTransitionFillerClip(fromClip: Long, toClip: Long): Long = {
    if (gdext.classes.AudioStreamInteractive.mb_get_transition_filler_clip == null) gdext.classes.AudioStreamInteractive.mb_get_transition_filler_clip = MethodBind.get("AudioStreamInteractive", "get_transition_filler_clip", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.AudioStreamInteractive.mb_get_transition_filler_clip, livePtr, fromClip, toClip)
  }

  /** AudioStreamInteractive.is_transition_holding_previous */
  final def isTransitionHoldingPrevious(fromClip: Long, toClip: Long): Boolean = {
    if (gdext.classes.AudioStreamInteractive.mb_is_transition_holding_previous == null) gdext.classes.AudioStreamInteractive.mb_is_transition_holding_previous = MethodBind.get("AudioStreamInteractive", "is_transition_holding_previous", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.AudioStreamInteractive.mb_is_transition_holding_previous, livePtr, fromClip, toClip)
  }

}

object AudioStreamInteractive {
  private[classes] var mb_set_clip_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_clip_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_initial_clip: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_initial_clip: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_clip_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_clip_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_clip_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_clip_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_clip_auto_advance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_clip_auto_advance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_clip_auto_advance_next_clip: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_clip_auto_advance_next_clip: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_transition: GDExtensionMethodBindPtr = null
  private[classes] var mb_erase_transition: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transition_from_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transition_to_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transition_fade_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transition_fade_beats: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_transition_using_filler_clip: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transition_filler_clip: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_transition_holding_previous: GDExtensionMethodBindPtr = null

  /** Godot enum `AudioStreamInteractive.TransitionFromTime`. */
  opaque type TransitionFromTime <: Long = Long

  object TransitionFromTime {
    final val Immediate: TransitionFromTime = 0L.asInstanceOf[TransitionFromTime]
    final val NextBeat: TransitionFromTime = 1L.asInstanceOf[TransitionFromTime]
    final val NextBar: TransitionFromTime = 2L.asInstanceOf[TransitionFromTime]
    final val End: TransitionFromTime = 3L.asInstanceOf[TransitionFromTime]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TransitionFromTime = value.asInstanceOf[TransitionFromTime]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TransitionFromTime] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[TransitionFromTime]]

    extension (self: TransitionFromTime)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Immediate"
        case 1L => "NextBeat"
        case 2L => "NextBar"
        case 3L => "End"
        case other => other.toString
      }
  }

  /** Godot enum `AudioStreamInteractive.TransitionToTime`. */
  opaque type TransitionToTime <: Long = Long

  object TransitionToTime {
    final val SamePosition: TransitionToTime = 0L.asInstanceOf[TransitionToTime]
    final val Start: TransitionToTime = 1L.asInstanceOf[TransitionToTime]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TransitionToTime = value.asInstanceOf[TransitionToTime]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TransitionToTime] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[TransitionToTime]]

    extension (self: TransitionToTime)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "SamePosition"
        case 1L => "Start"
        case other => other.toString
      }
  }

  /** Godot enum `AudioStreamInteractive.FadeMode`. */
  opaque type FadeMode <: Long = Long

  object FadeMode {
    final val Disabled: FadeMode = 0L.asInstanceOf[FadeMode]
    final val In: FadeMode = 1L.asInstanceOf[FadeMode]
    final val Out: FadeMode = 2L.asInstanceOf[FadeMode]
    final val Cross: FadeMode = 3L.asInstanceOf[FadeMode]
    final val Automatic: FadeMode = 4L.asInstanceOf[FadeMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FadeMode = value.asInstanceOf[FadeMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FadeMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[FadeMode]]

    extension (self: FadeMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "In"
        case 2L => "Out"
        case 3L => "Cross"
        case 4L => "Automatic"
        case other => other.toString
      }
  }

  /** Godot enum `AudioStreamInteractive.AutoAdvanceMode`. */
  opaque type AutoAdvanceMode <: Long = Long

  object AutoAdvanceMode {
    final val Disabled: AutoAdvanceMode = 0L.asInstanceOf[AutoAdvanceMode]
    final val Enabled: AutoAdvanceMode = 1L.asInstanceOf[AutoAdvanceMode]
    final val ReturnToHold: AutoAdvanceMode = 2L.asInstanceOf[AutoAdvanceMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AutoAdvanceMode = value.asInstanceOf[AutoAdvanceMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AutoAdvanceMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[AutoAdvanceMode]]

    extension (self: AutoAdvanceMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Enabled"
        case 2L => "ReturnToHold"
        case other => other.toString
      }
  }
}
