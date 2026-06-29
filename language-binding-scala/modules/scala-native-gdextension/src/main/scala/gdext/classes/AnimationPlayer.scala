package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationPlayer`, extends `AnimationMixer`. */
abstract class AnimationPlayer extends AnimationMixer {
  override def godotClassName: String = "AnimationPlayer"

  /** AnimationPlayer.animation_set_next */
  final def animationSetNext(animation_from: gdext.builtin.StringName, animation_to: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationPlayer", "animation_set_next", 3740211285L), hostObject.objectPtr, animation_from, animation_to)

  /** AnimationPlayer.animation_get_next */
  final def animationGetNext(animation_from: gdext.builtin.StringName): gdext.builtin.StringName =
    Ptrcall.call1[gdext.builtin.StringName, gdext.builtin.StringName](MethodBind.get("AnimationPlayer", "animation_get_next", 1965194235L), hostObject.objectPtr, animation_from)

  /** AnimationPlayer.set_blend_time */
  final def setBlendTime(animation_from: gdext.builtin.StringName, animation_to: gdext.builtin.StringName, sec: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("AnimationPlayer", "set_blend_time", 3231131886L), hostObject.objectPtr, animation_from, animation_to, sec)

  /** AnimationPlayer.get_blend_time */
  final def getBlendTime(animation_from: gdext.builtin.StringName, animation_to: gdext.builtin.StringName): Double =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Double](MethodBind.get("AnimationPlayer", "get_blend_time", 1958752504L), hostObject.objectPtr, animation_from, animation_to)

  /** AnimationPlayer.set_default_blend_time */
  final def setDefaultBlendTime(sec: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationPlayer", "set_default_blend_time", 373806689L), hostObject.objectPtr, sec)

  /** AnimationPlayer.get_default_blend_time */
  final def getDefaultBlendTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationPlayer", "get_default_blend_time", 1740695150L), hostObject.objectPtr)

  /** AnimationPlayer.set_auto_capture */
  final def setAutoCapture(auto_capture: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationPlayer", "set_auto_capture", 2586408642L), hostObject.objectPtr, auto_capture)

  /** AnimationPlayer.is_auto_capture */
  final def isAutoCapture(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationPlayer", "is_auto_capture", 36873697L), hostObject.objectPtr)

  /** AnimationPlayer.set_auto_capture_duration */
  final def setAutoCaptureDuration(auto_capture_duration: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationPlayer", "set_auto_capture_duration", 373806689L), hostObject.objectPtr, auto_capture_duration)

  /** AnimationPlayer.get_auto_capture_duration */
  final def getAutoCaptureDuration(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationPlayer", "get_auto_capture_duration", 1740695150L), hostObject.objectPtr)

  /** AnimationPlayer.set_auto_capture_transition_type */
  final def setAutoCaptureTransitionType(auto_capture_transition_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationPlayer", "set_auto_capture_transition_type", 1058637742L), hostObject.objectPtr, auto_capture_transition_type)

  /** AnimationPlayer.get_auto_capture_transition_type */
  final def getAutoCaptureTransitionType(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationPlayer", "get_auto_capture_transition_type", 3842314528L), hostObject.objectPtr)

  /** AnimationPlayer.set_auto_capture_ease_type */
  final def setAutoCaptureEaseType(auto_capture_ease_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationPlayer", "set_auto_capture_ease_type", 1208105857L), hostObject.objectPtr, auto_capture_ease_type)

  /** AnimationPlayer.get_auto_capture_ease_type */
  final def getAutoCaptureEaseType(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationPlayer", "get_auto_capture_ease_type", 631880200L), hostObject.objectPtr)

  /** AnimationPlayer.play */
  final def play(name: gdext.builtin.StringName, custom_blend: Double, custom_speed: Double, from_end: Boolean): Unit =
    Ptrcall.callVoid4(MethodBind.get("AnimationPlayer", "play", 3118260607L), hostObject.objectPtr, name, custom_blend, custom_speed, from_end)

  /** AnimationPlayer.play_section_with_markers */
  final def playSectionWithMarkers(name: gdext.builtin.StringName, start_marker: gdext.builtin.StringName, end_marker: gdext.builtin.StringName, custom_blend: Double, custom_speed: Double, from_end: Boolean): Unit =
    Ptrcall.callVoid6(MethodBind.get("AnimationPlayer", "play_section_with_markers", 1421431412L), hostObject.objectPtr, name, start_marker, end_marker, custom_blend, custom_speed, from_end)

  /** AnimationPlayer.play_section */
  final def playSection(name: gdext.builtin.StringName, start_time: Double, end_time: Double, custom_blend: Double, custom_speed: Double, from_end: Boolean): Unit =
    Ptrcall.callVoid6(MethodBind.get("AnimationPlayer", "play_section", 284774635L), hostObject.objectPtr, name, start_time, end_time, custom_blend, custom_speed, from_end)

  /** AnimationPlayer.play_backwards */
  final def playBackwards(name: gdext.builtin.StringName, custom_blend: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationPlayer", "play_backwards", 2787282401L), hostObject.objectPtr, name, custom_blend)

  /** AnimationPlayer.play_section_with_markers_backwards */
  final def playSectionWithMarkersBackwards(name: gdext.builtin.StringName, start_marker: gdext.builtin.StringName, end_marker: gdext.builtin.StringName, custom_blend: Double): Unit =
    Ptrcall.callVoid4(MethodBind.get("AnimationPlayer", "play_section_with_markers_backwards", 910195100L), hostObject.objectPtr, name, start_marker, end_marker, custom_blend)

  /** AnimationPlayer.play_section_backwards */
  final def playSectionBackwards(name: gdext.builtin.StringName, start_time: Double, end_time: Double, custom_blend: Double): Unit =
    Ptrcall.callVoid4(MethodBind.get("AnimationPlayer", "play_section_backwards", 831955981L), hostObject.objectPtr, name, start_time, end_time, custom_blend)

  /** AnimationPlayer.pause */
  final def pause(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AnimationPlayer", "pause", 3218959716L), hostObject.objectPtr)

  /** AnimationPlayer.stop */
  final def stop(keep_state: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationPlayer", "stop", 107499316L), hostObject.objectPtr, keep_state)

  /** AnimationPlayer.is_playing */
  final def isPlaying(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationPlayer", "is_playing", 36873697L), hostObject.objectPtr)

  /** AnimationPlayer.is_animation_active */
  final def isAnimationActive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationPlayer", "is_animation_active", 36873697L), hostObject.objectPtr)

  /** AnimationPlayer.set_current_animation */
  final def setCurrentAnimation(animation: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationPlayer", "set_current_animation", 3304788590L), hostObject.objectPtr, animation)

  /** AnimationPlayer.get_current_animation */
  final def getCurrentAnimation(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("AnimationPlayer", "get_current_animation", 2002593661L), hostObject.objectPtr)

  /** AnimationPlayer.set_assigned_animation */
  final def setAssignedAnimation(animation: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationPlayer", "set_assigned_animation", 3304788590L), hostObject.objectPtr, animation)

  /** AnimationPlayer.get_assigned_animation */
  final def getAssignedAnimation(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("AnimationPlayer", "get_assigned_animation", 2002593661L), hostObject.objectPtr)

  /** AnimationPlayer.queue */
  final def queue(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationPlayer", "queue", 3304788590L), hostObject.objectPtr, name)

  /** AnimationPlayer.clear_queue */
  final def clearQueue(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AnimationPlayer", "clear_queue", 3218959716L), hostObject.objectPtr)

  /** AnimationPlayer.set_speed_scale */
  final def setSpeedScale(speed: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationPlayer", "set_speed_scale", 373806689L), hostObject.objectPtr, speed)

  /** AnimationPlayer.get_speed_scale */
  final def getSpeedScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationPlayer", "get_speed_scale", 1740695150L), hostObject.objectPtr)

  /** AnimationPlayer.get_playing_speed */
  final def getPlayingSpeed(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationPlayer", "get_playing_speed", 1740695150L), hostObject.objectPtr)

  /** AnimationPlayer.set_autoplay */
  final def setAutoplay(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationPlayer", "set_autoplay", 3304788590L), hostObject.objectPtr, name)

  /** AnimationPlayer.get_autoplay */
  final def getAutoplay(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("AnimationPlayer", "get_autoplay", 2002593661L), hostObject.objectPtr)

  /** AnimationPlayer.set_movie_quit_on_finish_enabled */
  final def setMovieQuitOnFinishEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationPlayer", "set_movie_quit_on_finish_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** AnimationPlayer.is_movie_quit_on_finish_enabled */
  final def isMovieQuitOnFinishEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationPlayer", "is_movie_quit_on_finish_enabled", 36873697L), hostObject.objectPtr)

  /** AnimationPlayer.get_current_animation_position */
  final def getCurrentAnimationPosition(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationPlayer", "get_current_animation_position", 1740695150L), hostObject.objectPtr)

  /** AnimationPlayer.get_current_animation_length */
  final def getCurrentAnimationLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationPlayer", "get_current_animation_length", 1740695150L), hostObject.objectPtr)

  /** AnimationPlayer.set_section_with_markers */
  final def setSectionWithMarkers(start_marker: gdext.builtin.StringName, end_marker: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationPlayer", "set_section_with_markers", 794792241L), hostObject.objectPtr, start_marker, end_marker)

  /** AnimationPlayer.set_section */
  final def setSection(start_time: Double, end_time: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationPlayer", "set_section", 3749779719L), hostObject.objectPtr, start_time, end_time)

  /** AnimationPlayer.reset_section */
  final def resetSection(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AnimationPlayer", "reset_section", 3218959716L), hostObject.objectPtr)

  /** AnimationPlayer.get_section_start_time */
  final def getSectionStartTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationPlayer", "get_section_start_time", 1740695150L), hostObject.objectPtr)

  /** AnimationPlayer.get_section_end_time */
  final def getSectionEndTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationPlayer", "get_section_end_time", 1740695150L), hostObject.objectPtr)

  /** AnimationPlayer.has_section */
  final def hasSection(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationPlayer", "has_section", 36873697L), hostObject.objectPtr)

  /** AnimationPlayer.seek */
  final def seek(seconds: Double, update: Boolean, update_only: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("AnimationPlayer", "seek", 1807872683L), hostObject.objectPtr, seconds, update, update_only)

  /** AnimationPlayer.set_process_callback */
  final def setProcessCallback(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationPlayer", "set_process_callback", 1663839457L), hostObject.objectPtr, mode)

  /** AnimationPlayer.get_process_callback */
  final def getProcessCallback(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationPlayer", "get_process_callback", 4207496604L), hostObject.objectPtr)

  /** AnimationPlayer.set_method_call_mode */
  final def setMethodCallMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationPlayer", "set_method_call_mode", 3413514846L), hostObject.objectPtr, mode)

  /** AnimationPlayer.get_method_call_mode */
  final def getMethodCallMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationPlayer", "get_method_call_mode", 3583380054L), hostObject.objectPtr)

}
