package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimatedSprite3D`, extends `SpriteBase3D`. */
abstract class AnimatedSprite3D extends SpriteBase3D {
  override def godotClassName: String = "AnimatedSprite3D"

  /** AnimatedSprite3D.set_sprite_frames */
  final def setSpriteFrames(sprite_frames: SpriteFrames): Unit = {
    if (gdext.classes.AnimatedSprite3D.mb_set_sprite_frames == null) gdext.classes.AnimatedSprite3D.mb_set_sprite_frames = MethodBind.get("AnimatedSprite3D", "set_sprite_frames", 905781144L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite3D.mb_set_sprite_frames, livePtr, Wrappers.handle(sprite_frames))
  }

  /** AnimatedSprite3D.get_sprite_frames. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSpriteFrames(): SpriteFrames = {
    if (gdext.classes.AnimatedSprite3D.mb_get_sprite_frames == null) gdext.classes.AnimatedSprite3D.mb_get_sprite_frames = MethodBind.get("AnimatedSprite3D", "get_sprite_frames", 3804851214L)
    Wrappers.owned[SpriteFrames](Ptrcall.call0[Long](gdext.classes.AnimatedSprite3D.mb_get_sprite_frames, livePtr))
  }

  /** AnimatedSprite3D.set_animation */
  final def setAnimation(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.AnimatedSprite3D.mb_set_animation == null) gdext.classes.AnimatedSprite3D.mb_set_animation = MethodBind.get("AnimatedSprite3D", "set_animation", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite3D.mb_set_animation, livePtr, name)
  }

  /** AnimatedSprite3D.get_animation */
  final def getAnimation(): gdext.builtin.StringName = {
    if (gdext.classes.AnimatedSprite3D.mb_get_animation == null) gdext.classes.AnimatedSprite3D.mb_get_animation = MethodBind.get("AnimatedSprite3D", "get_animation", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.AnimatedSprite3D.mb_get_animation, livePtr)
  }

  /** AnimatedSprite3D.set_autoplay */
  final def setAutoplay(name: String): Unit = {
    if (gdext.classes.AnimatedSprite3D.mb_set_autoplay == null) gdext.classes.AnimatedSprite3D.mb_set_autoplay = MethodBind.get("AnimatedSprite3D", "set_autoplay", 83702148L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite3D.mb_set_autoplay, livePtr, name)
  }

  /** AnimatedSprite3D.get_autoplay */
  final def getAutoplay(): String = {
    if (gdext.classes.AnimatedSprite3D.mb_get_autoplay == null) gdext.classes.AnimatedSprite3D.mb_get_autoplay = MethodBind.get("AnimatedSprite3D", "get_autoplay", 201670096L)
    Ptrcall.call0[String](gdext.classes.AnimatedSprite3D.mb_get_autoplay, livePtr)
  }

  /** AnimatedSprite3D.is_playing */
  final def isPlaying(): Boolean = {
    if (gdext.classes.AnimatedSprite3D.mb_is_playing == null) gdext.classes.AnimatedSprite3D.mb_is_playing = MethodBind.get("AnimatedSprite3D", "is_playing", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimatedSprite3D.mb_is_playing, livePtr)
  }

  /** AnimatedSprite3D.play */
  final def play(name: gdext.builtin.StringName, custom_speed: Double, from_end: Boolean): Unit = {
    if (gdext.classes.AnimatedSprite3D.mb_play == null) gdext.classes.AnimatedSprite3D.mb_play = MethodBind.get("AnimatedSprite3D", "play", 3269405555L)
    Ptrcall.callVoid3(gdext.classes.AnimatedSprite3D.mb_play, livePtr, name, custom_speed, from_end)
  }

  /** AnimatedSprite3D.play_backwards */
  final def playBackwards(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.AnimatedSprite3D.mb_play_backwards == null) gdext.classes.AnimatedSprite3D.mb_play_backwards = MethodBind.get("AnimatedSprite3D", "play_backwards", 3323268493L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite3D.mb_play_backwards, livePtr, name)
  }

  /** AnimatedSprite3D.pause */
  final def pause(): Unit = {
    if (gdext.classes.AnimatedSprite3D.mb_pause == null) gdext.classes.AnimatedSprite3D.mb_pause = MethodBind.get("AnimatedSprite3D", "pause", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AnimatedSprite3D.mb_pause, livePtr)
  }

  /** AnimatedSprite3D.stop */
  final def stop(): Unit = {
    if (gdext.classes.AnimatedSprite3D.mb_stop == null) gdext.classes.AnimatedSprite3D.mb_stop = MethodBind.get("AnimatedSprite3D", "stop", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AnimatedSprite3D.mb_stop, livePtr)
  }

  /** AnimatedSprite3D.set_frame */
  final def setFrame(frame: Long): Unit = {
    if (gdext.classes.AnimatedSprite3D.mb_set_frame == null) gdext.classes.AnimatedSprite3D.mb_set_frame = MethodBind.get("AnimatedSprite3D", "set_frame", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite3D.mb_set_frame, livePtr, frame)
  }

  /** AnimatedSprite3D.get_frame */
  final def getFrame(): Long = {
    if (gdext.classes.AnimatedSprite3D.mb_get_frame == null) gdext.classes.AnimatedSprite3D.mb_get_frame = MethodBind.get("AnimatedSprite3D", "get_frame", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AnimatedSprite3D.mb_get_frame, livePtr)
  }

  /** AnimatedSprite3D.set_frame_progress */
  final def setFrameProgress(progress: Double): Unit = {
    if (gdext.classes.AnimatedSprite3D.mb_set_frame_progress == null) gdext.classes.AnimatedSprite3D.mb_set_frame_progress = MethodBind.get("AnimatedSprite3D", "set_frame_progress", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite3D.mb_set_frame_progress, livePtr, progress)
  }

  /** AnimatedSprite3D.get_frame_progress */
  final def getFrameProgress(): Double = {
    if (gdext.classes.AnimatedSprite3D.mb_get_frame_progress == null) gdext.classes.AnimatedSprite3D.mb_get_frame_progress = MethodBind.get("AnimatedSprite3D", "get_frame_progress", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimatedSprite3D.mb_get_frame_progress, livePtr)
  }

  /** AnimatedSprite3D.set_frame_and_progress */
  final def setFrameAndProgress(frame: Long, progress: Double): Unit = {
    if (gdext.classes.AnimatedSprite3D.mb_set_frame_and_progress == null) gdext.classes.AnimatedSprite3D.mb_set_frame_and_progress = MethodBind.get("AnimatedSprite3D", "set_frame_and_progress", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AnimatedSprite3D.mb_set_frame_and_progress, livePtr, frame, progress)
  }

  /** AnimatedSprite3D.set_speed_scale */
  final def setSpeedScale(speed_scale: Double): Unit = {
    if (gdext.classes.AnimatedSprite3D.mb_set_speed_scale == null) gdext.classes.AnimatedSprite3D.mb_set_speed_scale = MethodBind.get("AnimatedSprite3D", "set_speed_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite3D.mb_set_speed_scale, livePtr, speed_scale)
  }

  /** AnimatedSprite3D.get_speed_scale */
  final def getSpeedScale(): Double = {
    if (gdext.classes.AnimatedSprite3D.mb_get_speed_scale == null) gdext.classes.AnimatedSprite3D.mb_get_speed_scale = MethodBind.get("AnimatedSprite3D", "get_speed_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimatedSprite3D.mb_get_speed_scale, livePtr)
  }

  /** AnimatedSprite3D.get_playing_speed */
  final def getPlayingSpeed(): Double = {
    if (gdext.classes.AnimatedSprite3D.mb_get_playing_speed == null) gdext.classes.AnimatedSprite3D.mb_get_playing_speed = MethodBind.get("AnimatedSprite3D", "get_playing_speed", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimatedSprite3D.mb_get_playing_speed, livePtr)
  }

}

object AnimatedSprite3D {
  private[classes] var mb_set_sprite_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sprite_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autoplay: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autoplay: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_playing: GDExtensionMethodBindPtr = null
  private[classes] var mb_play: GDExtensionMethodBindPtr = null
  private[classes] var mb_play_backwards: GDExtensionMethodBindPtr = null
  private[classes] var mb_pause: GDExtensionMethodBindPtr = null
  private[classes] var mb_stop: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frame_progress: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame_progress: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frame_and_progress: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_playing_speed: GDExtensionMethodBindPtr = null
}
