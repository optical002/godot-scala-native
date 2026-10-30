package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationPlayer`, extends `AnimationMixer`. */
abstract class AnimationPlayer extends AnimationMixer {
  override def godotClassName: String = "AnimationPlayer"

  /** AnimationPlayer.animation_set_next */
  final def animationSetNext(animationFrom: String, animationTo: String): Unit = {
    if (gdext.classes.AnimationPlayer.mb_animation_set_next == null) gdext.classes.AnimationPlayer.mb_animation_set_next = MethodBind.get("AnimationPlayer", "animation_set_next", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.AnimationPlayer.mb_animation_set_next, livePtr, SnArg(animationFrom), SnArg(animationTo))
  }

  /** AnimationPlayer.animation_get_next */
  final def animationGetNext(animationFrom: String): String = {
    if (gdext.classes.AnimationPlayer.mb_animation_get_next == null) gdext.classes.AnimationPlayer.mb_animation_get_next = MethodBind.get("AnimationPlayer", "animation_get_next", 1965194235L)
    Ptrcall.call1[SnArg, SnArg](gdext.classes.AnimationPlayer.mb_animation_get_next, livePtr, SnArg(animationFrom))
  }

  /** AnimationPlayer.set_blend_time */
  final def setBlendTime(animationFrom: String, animationTo: String, sec: Double): Unit = {
    if (gdext.classes.AnimationPlayer.mb_set_blend_time == null) gdext.classes.AnimationPlayer.mb_set_blend_time = MethodBind.get("AnimationPlayer", "set_blend_time", 3231131886L)
    Ptrcall.callVoid3(gdext.classes.AnimationPlayer.mb_set_blend_time, livePtr, SnArg(animationFrom), SnArg(animationTo), sec)
  }

  /** AnimationPlayer.get_blend_time */
  final def getBlendTime(animationFrom: String, animationTo: String): Double = {
    if (gdext.classes.AnimationPlayer.mb_get_blend_time == null) gdext.classes.AnimationPlayer.mb_get_blend_time = MethodBind.get("AnimationPlayer", "get_blend_time", 1958752504L)
    Ptrcall.call2[SnArg, SnArg, Double](gdext.classes.AnimationPlayer.mb_get_blend_time, livePtr, SnArg(animationFrom), SnArg(animationTo))
  }

  /** AnimationPlayer.set_default_blend_time */
  final def setDefaultBlendTime(sec: Double): Unit = {
    if (gdext.classes.AnimationPlayer.mb_set_default_blend_time == null) gdext.classes.AnimationPlayer.mb_set_default_blend_time = MethodBind.get("AnimationPlayer", "set_default_blend_time", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimationPlayer.mb_set_default_blend_time, livePtr, sec)
  }

  /** AnimationPlayer.get_default_blend_time */
  final def getDefaultBlendTime(): Double = {
    if (gdext.classes.AnimationPlayer.mb_get_default_blend_time == null) gdext.classes.AnimationPlayer.mb_get_default_blend_time = MethodBind.get("AnimationPlayer", "get_default_blend_time", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationPlayer.mb_get_default_blend_time, livePtr)
  }

  /** AnimationPlayer.set_auto_capture */
  final def setAutoCapture(autoCapture: Boolean): Unit = {
    if (gdext.classes.AnimationPlayer.mb_set_auto_capture == null) gdext.classes.AnimationPlayer.mb_set_auto_capture = MethodBind.get("AnimationPlayer", "set_auto_capture", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationPlayer.mb_set_auto_capture, livePtr, autoCapture)
  }

  /** AnimationPlayer.is_auto_capture */
  final def isAutoCapture(): Boolean = {
    if (gdext.classes.AnimationPlayer.mb_is_auto_capture == null) gdext.classes.AnimationPlayer.mb_is_auto_capture = MethodBind.get("AnimationPlayer", "is_auto_capture", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationPlayer.mb_is_auto_capture, livePtr)
  }

  /** AnimationPlayer.set_auto_capture_duration */
  final def setAutoCaptureDuration(autoCaptureDuration: Double): Unit = {
    if (gdext.classes.AnimationPlayer.mb_set_auto_capture_duration == null) gdext.classes.AnimationPlayer.mb_set_auto_capture_duration = MethodBind.get("AnimationPlayer", "set_auto_capture_duration", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimationPlayer.mb_set_auto_capture_duration, livePtr, autoCaptureDuration)
  }

  /** AnimationPlayer.get_auto_capture_duration */
  final def getAutoCaptureDuration(): Double = {
    if (gdext.classes.AnimationPlayer.mb_get_auto_capture_duration == null) gdext.classes.AnimationPlayer.mb_get_auto_capture_duration = MethodBind.get("AnimationPlayer", "get_auto_capture_duration", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationPlayer.mb_get_auto_capture_duration, livePtr)
  }

  /** AnimationPlayer.set_auto_capture_transition_type */
  final def setAutoCaptureTransitionType(autoCaptureTransitionType: gdext.classes.Tween.TransitionType): Unit = {
    if (gdext.classes.AnimationPlayer.mb_set_auto_capture_transition_type == null) gdext.classes.AnimationPlayer.mb_set_auto_capture_transition_type = MethodBind.get("AnimationPlayer", "set_auto_capture_transition_type", 1058637742L)
    Ptrcall.callVoid1(gdext.classes.AnimationPlayer.mb_set_auto_capture_transition_type, livePtr, autoCaptureTransitionType)
  }

  /** AnimationPlayer.get_auto_capture_transition_type */
  final def getAutoCaptureTransitionType(): gdext.classes.Tween.TransitionType = {
    if (gdext.classes.AnimationPlayer.mb_get_auto_capture_transition_type == null) gdext.classes.AnimationPlayer.mb_get_auto_capture_transition_type = MethodBind.get("AnimationPlayer", "get_auto_capture_transition_type", 3842314528L)
    gdext.classes.Tween.TransitionType(Ptrcall.call0[Long](gdext.classes.AnimationPlayer.mb_get_auto_capture_transition_type, livePtr))
  }

  /** AnimationPlayer.set_auto_capture_ease_type */
  final def setAutoCaptureEaseType(autoCaptureEaseType: gdext.classes.Tween.EaseType): Unit = {
    if (gdext.classes.AnimationPlayer.mb_set_auto_capture_ease_type == null) gdext.classes.AnimationPlayer.mb_set_auto_capture_ease_type = MethodBind.get("AnimationPlayer", "set_auto_capture_ease_type", 1208105857L)
    Ptrcall.callVoid1(gdext.classes.AnimationPlayer.mb_set_auto_capture_ease_type, livePtr, autoCaptureEaseType)
  }

  /** AnimationPlayer.get_auto_capture_ease_type */
  final def getAutoCaptureEaseType(): gdext.classes.Tween.EaseType = {
    if (gdext.classes.AnimationPlayer.mb_get_auto_capture_ease_type == null) gdext.classes.AnimationPlayer.mb_get_auto_capture_ease_type = MethodBind.get("AnimationPlayer", "get_auto_capture_ease_type", 631880200L)
    gdext.classes.Tween.EaseType(Ptrcall.call0[Long](gdext.classes.AnimationPlayer.mb_get_auto_capture_ease_type, livePtr))
  }

  /** AnimationPlayer.play */
  final def play(name: String = "", customBlend: Double = -1.0, customSpeed: Double = 1.0, fromEnd: Boolean = false): Unit = {
    if (gdext.classes.AnimationPlayer.mb_play == null) gdext.classes.AnimationPlayer.mb_play = MethodBind.get("AnimationPlayer", "play", 3118260607L)
    Ptrcall.callVoid4(gdext.classes.AnimationPlayer.mb_play, livePtr, SnArg(name), customBlend, customSpeed, fromEnd)
  }

  /** AnimationPlayer.play_section_with_markers */
  final def playSectionWithMarkers(name: String = "", startMarker: String = "", endMarker: String = "", customBlend: Double = -1.0, customSpeed: Double = 1.0, fromEnd: Boolean = false): Unit = {
    if (gdext.classes.AnimationPlayer.mb_play_section_with_markers == null) gdext.classes.AnimationPlayer.mb_play_section_with_markers = MethodBind.get("AnimationPlayer", "play_section_with_markers", 1421431412L)
    Ptrcall.callVoid6(gdext.classes.AnimationPlayer.mb_play_section_with_markers, livePtr, SnArg(name), SnArg(startMarker), SnArg(endMarker), customBlend, customSpeed, fromEnd)
  }

  /** AnimationPlayer.play_section */
  final def playSection(name: String = "", startTime: Double = -1.0, endTime: Double = -1.0, customBlend: Double = -1.0, customSpeed: Double = 1.0, fromEnd: Boolean = false): Unit = {
    if (gdext.classes.AnimationPlayer.mb_play_section == null) gdext.classes.AnimationPlayer.mb_play_section = MethodBind.get("AnimationPlayer", "play_section", 284774635L)
    Ptrcall.callVoid6(gdext.classes.AnimationPlayer.mb_play_section, livePtr, SnArg(name), startTime, endTime, customBlend, customSpeed, fromEnd)
  }

  /** AnimationPlayer.play_backwards */
  final def playBackwards(name: String = "", customBlend: Double = -1.0): Unit = {
    if (gdext.classes.AnimationPlayer.mb_play_backwards == null) gdext.classes.AnimationPlayer.mb_play_backwards = MethodBind.get("AnimationPlayer", "play_backwards", 2787282401L)
    Ptrcall.callVoid2(gdext.classes.AnimationPlayer.mb_play_backwards, livePtr, SnArg(name), customBlend)
  }

  /** AnimationPlayer.play_section_with_markers_backwards */
  final def playSectionWithMarkersBackwards(name: String = "", startMarker: String = "", endMarker: String = "", customBlend: Double = -1.0): Unit = {
    if (gdext.classes.AnimationPlayer.mb_play_section_with_markers_backwards == null) gdext.classes.AnimationPlayer.mb_play_section_with_markers_backwards = MethodBind.get("AnimationPlayer", "play_section_with_markers_backwards", 910195100L)
    Ptrcall.callVoid4(gdext.classes.AnimationPlayer.mb_play_section_with_markers_backwards, livePtr, SnArg(name), SnArg(startMarker), SnArg(endMarker), customBlend)
  }

  /** AnimationPlayer.play_section_backwards */
  final def playSectionBackwards(name: String = "", startTime: Double = -1.0, endTime: Double = -1.0, customBlend: Double = -1.0): Unit = {
    if (gdext.classes.AnimationPlayer.mb_play_section_backwards == null) gdext.classes.AnimationPlayer.mb_play_section_backwards = MethodBind.get("AnimationPlayer", "play_section_backwards", 831955981L)
    Ptrcall.callVoid4(gdext.classes.AnimationPlayer.mb_play_section_backwards, livePtr, SnArg(name), startTime, endTime, customBlend)
  }

  /** AnimationPlayer.pause */
  final def pause(): Unit = {
    if (gdext.classes.AnimationPlayer.mb_pause == null) gdext.classes.AnimationPlayer.mb_pause = MethodBind.get("AnimationPlayer", "pause", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AnimationPlayer.mb_pause, livePtr)
  }

  /** AnimationPlayer.stop */
  final def stop(keepState: Boolean = false): Unit = {
    if (gdext.classes.AnimationPlayer.mb_stop == null) gdext.classes.AnimationPlayer.mb_stop = MethodBind.get("AnimationPlayer", "stop", 107499316L)
    Ptrcall.callVoid1(gdext.classes.AnimationPlayer.mb_stop, livePtr, keepState)
  }

  /** AnimationPlayer.is_playing */
  final def isPlaying(): Boolean = {
    if (gdext.classes.AnimationPlayer.mb_is_playing == null) gdext.classes.AnimationPlayer.mb_is_playing = MethodBind.get("AnimationPlayer", "is_playing", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationPlayer.mb_is_playing, livePtr)
  }

  /** AnimationPlayer.is_animation_active */
  final def isAnimationActive(): Boolean = {
    if (gdext.classes.AnimationPlayer.mb_is_animation_active == null) gdext.classes.AnimationPlayer.mb_is_animation_active = MethodBind.get("AnimationPlayer", "is_animation_active", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationPlayer.mb_is_animation_active, livePtr)
  }

  /** AnimationPlayer.set_current_animation */
  final def setCurrentAnimation(animation: String): Unit = {
    if (gdext.classes.AnimationPlayer.mb_set_current_animation == null) gdext.classes.AnimationPlayer.mb_set_current_animation = MethodBind.get("AnimationPlayer", "set_current_animation", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AnimationPlayer.mb_set_current_animation, livePtr, SnArg(animation))
  }

  /** AnimationPlayer.get_current_animation */
  final def getCurrentAnimation(): String = {
    if (gdext.classes.AnimationPlayer.mb_get_current_animation == null) gdext.classes.AnimationPlayer.mb_get_current_animation = MethodBind.get("AnimationPlayer", "get_current_animation", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.AnimationPlayer.mb_get_current_animation, livePtr)
  }

  /** AnimationPlayer.set_assigned_animation */
  final def setAssignedAnimation(animation: String): Unit = {
    if (gdext.classes.AnimationPlayer.mb_set_assigned_animation == null) gdext.classes.AnimationPlayer.mb_set_assigned_animation = MethodBind.get("AnimationPlayer", "set_assigned_animation", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AnimationPlayer.mb_set_assigned_animation, livePtr, SnArg(animation))
  }

  /** AnimationPlayer.get_assigned_animation */
  final def getAssignedAnimation(): String = {
    if (gdext.classes.AnimationPlayer.mb_get_assigned_animation == null) gdext.classes.AnimationPlayer.mb_get_assigned_animation = MethodBind.get("AnimationPlayer", "get_assigned_animation", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.AnimationPlayer.mb_get_assigned_animation, livePtr)
  }

  /** AnimationPlayer.queue */
  final def queue(name: String): Unit = {
    if (gdext.classes.AnimationPlayer.mb_queue == null) gdext.classes.AnimationPlayer.mb_queue = MethodBind.get("AnimationPlayer", "queue", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AnimationPlayer.mb_queue, livePtr, SnArg(name))
  }

  /** AnimationPlayer.clear_queue */
  final def clearQueue(): Unit = {
    if (gdext.classes.AnimationPlayer.mb_clear_queue == null) gdext.classes.AnimationPlayer.mb_clear_queue = MethodBind.get("AnimationPlayer", "clear_queue", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AnimationPlayer.mb_clear_queue, livePtr)
  }

  /** AnimationPlayer.set_speed_scale */
  final def setSpeedScale(speed: Double): Unit = {
    if (gdext.classes.AnimationPlayer.mb_set_speed_scale == null) gdext.classes.AnimationPlayer.mb_set_speed_scale = MethodBind.get("AnimationPlayer", "set_speed_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimationPlayer.mb_set_speed_scale, livePtr, speed)
  }

  /** AnimationPlayer.get_speed_scale */
  final def getSpeedScale(): Double = {
    if (gdext.classes.AnimationPlayer.mb_get_speed_scale == null) gdext.classes.AnimationPlayer.mb_get_speed_scale = MethodBind.get("AnimationPlayer", "get_speed_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationPlayer.mb_get_speed_scale, livePtr)
  }

  /** AnimationPlayer.get_playing_speed */
  final def getPlayingSpeed(): Double = {
    if (gdext.classes.AnimationPlayer.mb_get_playing_speed == null) gdext.classes.AnimationPlayer.mb_get_playing_speed = MethodBind.get("AnimationPlayer", "get_playing_speed", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationPlayer.mb_get_playing_speed, livePtr)
  }

  /** AnimationPlayer.set_autoplay */
  final def setAutoplay(name: String): Unit = {
    if (gdext.classes.AnimationPlayer.mb_set_autoplay == null) gdext.classes.AnimationPlayer.mb_set_autoplay = MethodBind.get("AnimationPlayer", "set_autoplay", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AnimationPlayer.mb_set_autoplay, livePtr, SnArg(name))
  }

  /** AnimationPlayer.get_autoplay */
  final def getAutoplay(): String = {
    if (gdext.classes.AnimationPlayer.mb_get_autoplay == null) gdext.classes.AnimationPlayer.mb_get_autoplay = MethodBind.get("AnimationPlayer", "get_autoplay", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.AnimationPlayer.mb_get_autoplay, livePtr)
  }

  /** AnimationPlayer.set_movie_quit_on_finish_enabled */
  final def setMovieQuitOnFinishEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.AnimationPlayer.mb_set_movie_quit_on_finish_enabled == null) gdext.classes.AnimationPlayer.mb_set_movie_quit_on_finish_enabled = MethodBind.get("AnimationPlayer", "set_movie_quit_on_finish_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationPlayer.mb_set_movie_quit_on_finish_enabled, livePtr, enabled)
  }

  /** AnimationPlayer.is_movie_quit_on_finish_enabled */
  final def isMovieQuitOnFinishEnabled(): Boolean = {
    if (gdext.classes.AnimationPlayer.mb_is_movie_quit_on_finish_enabled == null) gdext.classes.AnimationPlayer.mb_is_movie_quit_on_finish_enabled = MethodBind.get("AnimationPlayer", "is_movie_quit_on_finish_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationPlayer.mb_is_movie_quit_on_finish_enabled, livePtr)
  }

  /** AnimationPlayer.get_current_animation_position */
  final def getCurrentAnimationPosition(): Double = {
    if (gdext.classes.AnimationPlayer.mb_get_current_animation_position == null) gdext.classes.AnimationPlayer.mb_get_current_animation_position = MethodBind.get("AnimationPlayer", "get_current_animation_position", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationPlayer.mb_get_current_animation_position, livePtr)
  }

  /** AnimationPlayer.get_current_animation_length */
  final def getCurrentAnimationLength(): Double = {
    if (gdext.classes.AnimationPlayer.mb_get_current_animation_length == null) gdext.classes.AnimationPlayer.mb_get_current_animation_length = MethodBind.get("AnimationPlayer", "get_current_animation_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationPlayer.mb_get_current_animation_length, livePtr)
  }

  /** AnimationPlayer.set_section_with_markers */
  final def setSectionWithMarkers(startMarker: String = "", endMarker: String = ""): Unit = {
    if (gdext.classes.AnimationPlayer.mb_set_section_with_markers == null) gdext.classes.AnimationPlayer.mb_set_section_with_markers = MethodBind.get("AnimationPlayer", "set_section_with_markers", 794792241L)
    Ptrcall.callVoid2(gdext.classes.AnimationPlayer.mb_set_section_with_markers, livePtr, SnArg(startMarker), SnArg(endMarker))
  }

  /** AnimationPlayer.set_section */
  final def setSection(startTime: Double = -1.0, endTime: Double = -1.0): Unit = {
    if (gdext.classes.AnimationPlayer.mb_set_section == null) gdext.classes.AnimationPlayer.mb_set_section = MethodBind.get("AnimationPlayer", "set_section", 3749779719L)
    Ptrcall.callVoid2(gdext.classes.AnimationPlayer.mb_set_section, livePtr, startTime, endTime)
  }

  /** AnimationPlayer.reset_section */
  final def resetSection(): Unit = {
    if (gdext.classes.AnimationPlayer.mb_reset_section == null) gdext.classes.AnimationPlayer.mb_reset_section = MethodBind.get("AnimationPlayer", "reset_section", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AnimationPlayer.mb_reset_section, livePtr)
  }

  /** AnimationPlayer.get_section_start_time */
  final def getSectionStartTime(): Double = {
    if (gdext.classes.AnimationPlayer.mb_get_section_start_time == null) gdext.classes.AnimationPlayer.mb_get_section_start_time = MethodBind.get("AnimationPlayer", "get_section_start_time", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationPlayer.mb_get_section_start_time, livePtr)
  }

  /** AnimationPlayer.get_section_end_time */
  final def getSectionEndTime(): Double = {
    if (gdext.classes.AnimationPlayer.mb_get_section_end_time == null) gdext.classes.AnimationPlayer.mb_get_section_end_time = MethodBind.get("AnimationPlayer", "get_section_end_time", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationPlayer.mb_get_section_end_time, livePtr)
  }

  /** AnimationPlayer.has_section */
  final def hasSection(): Boolean = {
    if (gdext.classes.AnimationPlayer.mb_has_section == null) gdext.classes.AnimationPlayer.mb_has_section = MethodBind.get("AnimationPlayer", "has_section", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationPlayer.mb_has_section, livePtr)
  }

  /** AnimationPlayer.seek */
  final def seek(seconds: Double, update: Boolean = false, updateOnly: Boolean = false): Unit = {
    if (gdext.classes.AnimationPlayer.mb_seek == null) gdext.classes.AnimationPlayer.mb_seek = MethodBind.get("AnimationPlayer", "seek", 1807872683L)
    Ptrcall.callVoid3(gdext.classes.AnimationPlayer.mb_seek, livePtr, seconds, update, updateOnly)
  }

  /** AnimationPlayer.set_process_callback */
  final def setProcessCallback(mode: gdext.classes.AnimationPlayer.AnimationProcessCallback): Unit = {
    if (gdext.classes.AnimationPlayer.mb_set_process_callback == null) gdext.classes.AnimationPlayer.mb_set_process_callback = MethodBind.get("AnimationPlayer", "set_process_callback", 1663839457L)
    Ptrcall.callVoid1(gdext.classes.AnimationPlayer.mb_set_process_callback, livePtr, mode)
  }

  /** AnimationPlayer.get_process_callback */
  final def getProcessCallback(): gdext.classes.AnimationPlayer.AnimationProcessCallback = {
    if (gdext.classes.AnimationPlayer.mb_get_process_callback == null) gdext.classes.AnimationPlayer.mb_get_process_callback = MethodBind.get("AnimationPlayer", "get_process_callback", 4207496604L)
    gdext.classes.AnimationPlayer.AnimationProcessCallback(Ptrcall.call0[Long](gdext.classes.AnimationPlayer.mb_get_process_callback, livePtr))
  }

  /** AnimationPlayer.set_method_call_mode */
  final def setMethodCallMode(mode: gdext.classes.AnimationPlayer.AnimationMethodCallMode): Unit = {
    if (gdext.classes.AnimationPlayer.mb_set_method_call_mode == null) gdext.classes.AnimationPlayer.mb_set_method_call_mode = MethodBind.get("AnimationPlayer", "set_method_call_mode", 3413514846L)
    Ptrcall.callVoid1(gdext.classes.AnimationPlayer.mb_set_method_call_mode, livePtr, mode)
  }

  /** AnimationPlayer.get_method_call_mode */
  final def getMethodCallMode(): gdext.classes.AnimationPlayer.AnimationMethodCallMode = {
    if (gdext.classes.AnimationPlayer.mb_get_method_call_mode == null) gdext.classes.AnimationPlayer.mb_get_method_call_mode = MethodBind.get("AnimationPlayer", "get_method_call_mode", 3583380054L)
    gdext.classes.AnimationPlayer.AnimationMethodCallMode(Ptrcall.call0[Long](gdext.classes.AnimationPlayer.mb_get_method_call_mode, livePtr))
  }

}

object AnimationPlayer {
  private[classes] var mb_animation_set_next: GDExtensionMethodBindPtr = null
  private[classes] var mb_animation_get_next: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_blend_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_blend_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_capture: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_auto_capture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_capture_duration: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_auto_capture_duration: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_capture_transition_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_auto_capture_transition_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_capture_ease_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_auto_capture_ease_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_play: GDExtensionMethodBindPtr = null
  private[classes] var mb_play_section_with_markers: GDExtensionMethodBindPtr = null
  private[classes] var mb_play_section: GDExtensionMethodBindPtr = null
  private[classes] var mb_play_backwards: GDExtensionMethodBindPtr = null
  private[classes] var mb_play_section_with_markers_backwards: GDExtensionMethodBindPtr = null
  private[classes] var mb_play_section_backwards: GDExtensionMethodBindPtr = null
  private[classes] var mb_pause: GDExtensionMethodBindPtr = null
  private[classes] var mb_stop: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_playing: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_animation_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_current_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_assigned_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_assigned_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_queue: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_queue: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_playing_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autoplay: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autoplay: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_movie_quit_on_finish_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_movie_quit_on_finish_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_animation_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_animation_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_section_with_markers: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_section: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset_section: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_section_start_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_section_end_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_section: GDExtensionMethodBindPtr = null
  private[classes] var mb_seek: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_callback: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_callback: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_method_call_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_method_call_mode: GDExtensionMethodBindPtr = null

  /** Godot enum `AnimationPlayer.AnimationProcessCallback`. */
  opaque type AnimationProcessCallback <: Long = Long

  object AnimationProcessCallback {
    final val Physics: AnimationProcessCallback = 0L.asInstanceOf[AnimationProcessCallback]
    final val Idle: AnimationProcessCallback = 1L.asInstanceOf[AnimationProcessCallback]
    final val Manual: AnimationProcessCallback = 2L.asInstanceOf[AnimationProcessCallback]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AnimationProcessCallback = value.asInstanceOf[AnimationProcessCallback]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AnimationProcessCallback] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[AnimationProcessCallback]]

    extension (self: AnimationProcessCallback)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Physics"
        case 1L => "Idle"
        case 2L => "Manual"
        case other => other.toString
      }
  }

  /** Godot enum `AnimationPlayer.AnimationMethodCallMode`. */
  opaque type AnimationMethodCallMode <: Long = Long

  object AnimationMethodCallMode {
    final val Deferred: AnimationMethodCallMode = 0L.asInstanceOf[AnimationMethodCallMode]
    final val Immediate: AnimationMethodCallMode = 1L.asInstanceOf[AnimationMethodCallMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AnimationMethodCallMode = value.asInstanceOf[AnimationMethodCallMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AnimationMethodCallMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[AnimationMethodCallMode]]

    extension (self: AnimationMethodCallMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Deferred"
        case 1L => "Immediate"
        case other => other.toString
      }
  }
}
