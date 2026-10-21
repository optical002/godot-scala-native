package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamInteractive`, extends `AudioStream`. */
abstract class AudioStreamInteractive extends AudioStream {
  override def godotClassName: String = "AudioStreamInteractive"

  /** AudioStreamInteractive.set_clip_count */
  final def setClipCount(clip_count: Long): Unit = {
    if (gdext.classes.AudioStreamInteractive.mb_set_clip_count == null) gdext.classes.AudioStreamInteractive.mb_set_clip_count = MethodBind.get("AudioStreamInteractive", "set_clip_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamInteractive.mb_set_clip_count, livePtr, clip_count)
  }

  /** AudioStreamInteractive.get_clip_count */
  final def getClipCount(): Long = {
    if (gdext.classes.AudioStreamInteractive.mb_get_clip_count == null) gdext.classes.AudioStreamInteractive.mb_get_clip_count = MethodBind.get("AudioStreamInteractive", "get_clip_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamInteractive.mb_get_clip_count, livePtr)
  }

  /** AudioStreamInteractive.set_initial_clip */
  final def setInitialClip(clip_index: Long): Unit = {
    if (gdext.classes.AudioStreamInteractive.mb_set_initial_clip == null) gdext.classes.AudioStreamInteractive.mb_set_initial_clip = MethodBind.get("AudioStreamInteractive", "set_initial_clip", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamInteractive.mb_set_initial_clip, livePtr, clip_index)
  }

  /** AudioStreamInteractive.get_initial_clip */
  final def getInitialClip(): Long = {
    if (gdext.classes.AudioStreamInteractive.mb_get_initial_clip == null) gdext.classes.AudioStreamInteractive.mb_get_initial_clip = MethodBind.get("AudioStreamInteractive", "get_initial_clip", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamInteractive.mb_get_initial_clip, livePtr)
  }

  /** AudioStreamInteractive.set_clip_name */
  final def setClipName(clip_index: Long, name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.AudioStreamInteractive.mb_set_clip_name == null) gdext.classes.AudioStreamInteractive.mb_set_clip_name = MethodBind.get("AudioStreamInteractive", "set_clip_name", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamInteractive.mb_set_clip_name, livePtr, clip_index, name)
  }

  /** AudioStreamInteractive.get_clip_name */
  final def getClipName(clip_index: Long): gdext.builtin.StringName = {
    if (gdext.classes.AudioStreamInteractive.mb_get_clip_name == null) gdext.classes.AudioStreamInteractive.mb_get_clip_name = MethodBind.get("AudioStreamInteractive", "get_clip_name", 659327637L)
    Ptrcall.call1[Long, gdext.builtin.StringName](gdext.classes.AudioStreamInteractive.mb_get_clip_name, livePtr, clip_index)
  }

  /** AudioStreamInteractive.set_clip_stream */
  final def setClipStream(clip_index: Long, stream: AudioStream): Unit = {
    if (gdext.classes.AudioStreamInteractive.mb_set_clip_stream == null) gdext.classes.AudioStreamInteractive.mb_set_clip_stream = MethodBind.get("AudioStreamInteractive", "set_clip_stream", 111075094L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamInteractive.mb_set_clip_stream, livePtr, clip_index, Wrappers.handle(stream))
  }

  /** AudioStreamInteractive.get_clip_stream. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getClipStream(clip_index: Long): AudioStream = {
    if (gdext.classes.AudioStreamInteractive.mb_get_clip_stream == null) gdext.classes.AudioStreamInteractive.mb_get_clip_stream = MethodBind.get("AudioStreamInteractive", "get_clip_stream", 2739380747L)
    Wrappers.owned[AudioStream](Ptrcall.call1[Long, Long](gdext.classes.AudioStreamInteractive.mb_get_clip_stream, livePtr, clip_index))
  }

  /** AudioStreamInteractive.set_clip_auto_advance */
  final def setClipAutoAdvance(clip_index: Long, mode: Long): Unit = {
    if (gdext.classes.AudioStreamInteractive.mb_set_clip_auto_advance == null) gdext.classes.AudioStreamInteractive.mb_set_clip_auto_advance = MethodBind.get("AudioStreamInteractive", "set_clip_auto_advance", 57217598L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamInteractive.mb_set_clip_auto_advance, livePtr, clip_index, mode)
  }

  /** AudioStreamInteractive.get_clip_auto_advance */
  final def getClipAutoAdvance(clip_index: Long): Long = {
    if (gdext.classes.AudioStreamInteractive.mb_get_clip_auto_advance == null) gdext.classes.AudioStreamInteractive.mb_get_clip_auto_advance = MethodBind.get("AudioStreamInteractive", "get_clip_auto_advance", 1778634807L)
    Ptrcall.call1[Long, Long](gdext.classes.AudioStreamInteractive.mb_get_clip_auto_advance, livePtr, clip_index)
  }

  /** AudioStreamInteractive.set_clip_auto_advance_next_clip */
  final def setClipAutoAdvanceNextClip(clip_index: Long, auto_advance_next_clip: Long): Unit = {
    if (gdext.classes.AudioStreamInteractive.mb_set_clip_auto_advance_next_clip == null) gdext.classes.AudioStreamInteractive.mb_set_clip_auto_advance_next_clip = MethodBind.get("AudioStreamInteractive", "set_clip_auto_advance_next_clip", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamInteractive.mb_set_clip_auto_advance_next_clip, livePtr, clip_index, auto_advance_next_clip)
  }

  /** AudioStreamInteractive.get_clip_auto_advance_next_clip */
  final def getClipAutoAdvanceNextClip(clip_index: Long): Long = {
    if (gdext.classes.AudioStreamInteractive.mb_get_clip_auto_advance_next_clip == null) gdext.classes.AudioStreamInteractive.mb_get_clip_auto_advance_next_clip = MethodBind.get("AudioStreamInteractive", "get_clip_auto_advance_next_clip", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.AudioStreamInteractive.mb_get_clip_auto_advance_next_clip, livePtr, clip_index)
  }

  /** AudioStreamInteractive.has_transition */
  final def hasTransition(from_clip: Long, to_clip: Long): Boolean = {
    if (gdext.classes.AudioStreamInteractive.mb_has_transition == null) gdext.classes.AudioStreamInteractive.mb_has_transition = MethodBind.get("AudioStreamInteractive", "has_transition", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.AudioStreamInteractive.mb_has_transition, livePtr, from_clip, to_clip)
  }

  /** AudioStreamInteractive.erase_transition */
  final def eraseTransition(from_clip: Long, to_clip: Long): Unit = {
    if (gdext.classes.AudioStreamInteractive.mb_erase_transition == null) gdext.classes.AudioStreamInteractive.mb_erase_transition = MethodBind.get("AudioStreamInteractive", "erase_transition", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamInteractive.mb_erase_transition, livePtr, from_clip, to_clip)
  }

  /** AudioStreamInteractive.get_transition_from_time */
  final def getTransitionFromTime(from_clip: Long, to_clip: Long): Long = {
    if (gdext.classes.AudioStreamInteractive.mb_get_transition_from_time == null) gdext.classes.AudioStreamInteractive.mb_get_transition_from_time = MethodBind.get("AudioStreamInteractive", "get_transition_from_time", 3453338158L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.AudioStreamInteractive.mb_get_transition_from_time, livePtr, from_clip, to_clip)
  }

  /** AudioStreamInteractive.get_transition_to_time */
  final def getTransitionToTime(from_clip: Long, to_clip: Long): Long = {
    if (gdext.classes.AudioStreamInteractive.mb_get_transition_to_time == null) gdext.classes.AudioStreamInteractive.mb_get_transition_to_time = MethodBind.get("AudioStreamInteractive", "get_transition_to_time", 1369651373L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.AudioStreamInteractive.mb_get_transition_to_time, livePtr, from_clip, to_clip)
  }

  /** AudioStreamInteractive.get_transition_fade_mode */
  final def getTransitionFadeMode(from_clip: Long, to_clip: Long): Long = {
    if (gdext.classes.AudioStreamInteractive.mb_get_transition_fade_mode == null) gdext.classes.AudioStreamInteractive.mb_get_transition_fade_mode = MethodBind.get("AudioStreamInteractive", "get_transition_fade_mode", 4065396087L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.AudioStreamInteractive.mb_get_transition_fade_mode, livePtr, from_clip, to_clip)
  }

  /** AudioStreamInteractive.get_transition_fade_beats */
  final def getTransitionFadeBeats(from_clip: Long, to_clip: Long): Double = {
    if (gdext.classes.AudioStreamInteractive.mb_get_transition_fade_beats == null) gdext.classes.AudioStreamInteractive.mb_get_transition_fade_beats = MethodBind.get("AudioStreamInteractive", "get_transition_fade_beats", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.AudioStreamInteractive.mb_get_transition_fade_beats, livePtr, from_clip, to_clip)
  }

  /** AudioStreamInteractive.is_transition_using_filler_clip */
  final def isTransitionUsingFillerClip(from_clip: Long, to_clip: Long): Boolean = {
    if (gdext.classes.AudioStreamInteractive.mb_is_transition_using_filler_clip == null) gdext.classes.AudioStreamInteractive.mb_is_transition_using_filler_clip = MethodBind.get("AudioStreamInteractive", "is_transition_using_filler_clip", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.AudioStreamInteractive.mb_is_transition_using_filler_clip, livePtr, from_clip, to_clip)
  }

  /** AudioStreamInteractive.get_transition_filler_clip */
  final def getTransitionFillerClip(from_clip: Long, to_clip: Long): Long = {
    if (gdext.classes.AudioStreamInteractive.mb_get_transition_filler_clip == null) gdext.classes.AudioStreamInteractive.mb_get_transition_filler_clip = MethodBind.get("AudioStreamInteractive", "get_transition_filler_clip", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.AudioStreamInteractive.mb_get_transition_filler_clip, livePtr, from_clip, to_clip)
  }

  /** AudioStreamInteractive.is_transition_holding_previous */
  final def isTransitionHoldingPrevious(from_clip: Long, to_clip: Long): Boolean = {
    if (gdext.classes.AudioStreamInteractive.mb_is_transition_holding_previous == null) gdext.classes.AudioStreamInteractive.mb_is_transition_holding_previous = MethodBind.get("AudioStreamInteractive", "is_transition_holding_previous", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.AudioStreamInteractive.mb_is_transition_holding_previous, livePtr, from_clip, to_clip)
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
}
