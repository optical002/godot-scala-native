package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamInteractive`, extends `AudioStream`. */
abstract class AudioStreamInteractive extends AudioStream {

  /** AudioStreamInteractive.set_clip_count */
  final def setClipCount(clip_count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamInteractive", "set_clip_count", 1286410249L), hostObject.objectPtr, clip_count)

  /** AudioStreamInteractive.get_clip_count */
  final def getClipCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamInteractive", "get_clip_count", 3905245786L), hostObject.objectPtr)

  /** AudioStreamInteractive.set_initial_clip */
  final def setInitialClip(clip_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamInteractive", "set_initial_clip", 1286410249L), hostObject.objectPtr, clip_index)

  /** AudioStreamInteractive.get_initial_clip */
  final def getInitialClip(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamInteractive", "get_initial_clip", 3905245786L), hostObject.objectPtr)

  /** AudioStreamInteractive.set_clip_name */
  final def setClipName(clip_index: Long, name: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioStreamInteractive", "set_clip_name", 3780747571L), hostObject.objectPtr, clip_index, name)

  /** AudioStreamInteractive.get_clip_name */
  final def getClipName(clip_index: Long): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.StringName](MethodBind.get("AudioStreamInteractive", "get_clip_name", 659327637L), hostObject.objectPtr, clip_index)

  /** AudioStreamInteractive.set_clip_stream */
  final def setClipStream(clip_index: Long, stream: AudioStream): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioStreamInteractive", "set_clip_stream", 111075094L), hostObject.objectPtr, clip_index, stream.hostObject)

  /** AudioStreamInteractive.get_clip_stream */
  final def getClipStream(clip_index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("AudioStreamInteractive", "get_clip_stream", 2739380747L), hostObject.objectPtr, clip_index)

  /** AudioStreamInteractive.set_clip_auto_advance */
  final def setClipAutoAdvance(clip_index: Long, mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioStreamInteractive", "set_clip_auto_advance", 57217598L), hostObject.objectPtr, clip_index, mode)

  /** AudioStreamInteractive.get_clip_auto_advance */
  final def getClipAutoAdvance(clip_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("AudioStreamInteractive", "get_clip_auto_advance", 1778634807L), hostObject.objectPtr, clip_index)

  /** AudioStreamInteractive.set_clip_auto_advance_next_clip */
  final def setClipAutoAdvanceNextClip(clip_index: Long, auto_advance_next_clip: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioStreamInteractive", "set_clip_auto_advance_next_clip", 3937882851L), hostObject.objectPtr, clip_index, auto_advance_next_clip)

  /** AudioStreamInteractive.get_clip_auto_advance_next_clip */
  final def getClipAutoAdvanceNextClip(clip_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("AudioStreamInteractive", "get_clip_auto_advance_next_clip", 923996154L), hostObject.objectPtr, clip_index)

  /** AudioStreamInteractive.has_transition */
  final def hasTransition(from_clip: Long, to_clip: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("AudioStreamInteractive", "has_transition", 2522259332L), hostObject.objectPtr, from_clip, to_clip)

  /** AudioStreamInteractive.erase_transition */
  final def eraseTransition(from_clip: Long, to_clip: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioStreamInteractive", "erase_transition", 3937882851L), hostObject.objectPtr, from_clip, to_clip)

  /** AudioStreamInteractive.get_transition_from_time */
  final def getTransitionFromTime(from_clip: Long, to_clip: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("AudioStreamInteractive", "get_transition_from_time", 3453338158L), hostObject.objectPtr, from_clip, to_clip)

  /** AudioStreamInteractive.get_transition_to_time */
  final def getTransitionToTime(from_clip: Long, to_clip: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("AudioStreamInteractive", "get_transition_to_time", 1369651373L), hostObject.objectPtr, from_clip, to_clip)

  /** AudioStreamInteractive.get_transition_fade_mode */
  final def getTransitionFadeMode(from_clip: Long, to_clip: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("AudioStreamInteractive", "get_transition_fade_mode", 4065396087L), hostObject.objectPtr, from_clip, to_clip)

  /** AudioStreamInteractive.get_transition_fade_beats */
  final def getTransitionFadeBeats(from_clip: Long, to_clip: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("AudioStreamInteractive", "get_transition_fade_beats", 3085491603L), hostObject.objectPtr, from_clip, to_clip)

  /** AudioStreamInteractive.is_transition_using_filler_clip */
  final def isTransitionUsingFillerClip(from_clip: Long, to_clip: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("AudioStreamInteractive", "is_transition_using_filler_clip", 2522259332L), hostObject.objectPtr, from_clip, to_clip)

  /** AudioStreamInteractive.get_transition_filler_clip */
  final def getTransitionFillerClip(from_clip: Long, to_clip: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("AudioStreamInteractive", "get_transition_filler_clip", 3175239445L), hostObject.objectPtr, from_clip, to_clip)

  /** AudioStreamInteractive.is_transition_holding_previous */
  final def isTransitionHoldingPrevious(from_clip: Long, to_clip: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("AudioStreamInteractive", "is_transition_holding_previous", 2522259332L), hostObject.objectPtr, from_clip, to_clip)

}

object AudioStreamInteractive {
  /** Class metadata for Gd[AudioStreamInteractive] lifetime management and casting. */
  given GodotClass[AudioStreamInteractive] with {
    def className = "AudioStreamInteractive"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamInteractive = new AudioStreamInteractive {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamInteractive): GodotObject = t.hostObject
  }
}
