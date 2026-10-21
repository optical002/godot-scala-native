package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimatedSprite2D`, extends `Node2D`. */
abstract class AnimatedSprite2D extends Node2D {
  override def godotClassName: String = "AnimatedSprite2D"

  /** AnimatedSprite2D.set_sprite_frames */
  final def setSpriteFrames(sprite_frames: SpriteFrames): Unit = {
    if (gdext.classes.AnimatedSprite2D.mb_set_sprite_frames == null) gdext.classes.AnimatedSprite2D.mb_set_sprite_frames = MethodBind.get("AnimatedSprite2D", "set_sprite_frames", 905781144L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite2D.mb_set_sprite_frames, livePtr, Wrappers.handle(sprite_frames))
  }

  /** AnimatedSprite2D.get_sprite_frames. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSpriteFrames(): SpriteFrames = {
    if (gdext.classes.AnimatedSprite2D.mb_get_sprite_frames == null) gdext.classes.AnimatedSprite2D.mb_get_sprite_frames = MethodBind.get("AnimatedSprite2D", "get_sprite_frames", 3804851214L)
    Wrappers.owned[SpriteFrames](Ptrcall.call0[Long](gdext.classes.AnimatedSprite2D.mb_get_sprite_frames, livePtr))
  }

  /** AnimatedSprite2D.set_animation */
  final def setAnimation(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.AnimatedSprite2D.mb_set_animation == null) gdext.classes.AnimatedSprite2D.mb_set_animation = MethodBind.get("AnimatedSprite2D", "set_animation", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite2D.mb_set_animation, livePtr, name)
  }

  /** AnimatedSprite2D.get_animation */
  final def getAnimation(): gdext.builtin.StringName = {
    if (gdext.classes.AnimatedSprite2D.mb_get_animation == null) gdext.classes.AnimatedSprite2D.mb_get_animation = MethodBind.get("AnimatedSprite2D", "get_animation", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.AnimatedSprite2D.mb_get_animation, livePtr)
  }

  /** AnimatedSprite2D.set_autoplay */
  final def setAutoplay(name: String): Unit = {
    if (gdext.classes.AnimatedSprite2D.mb_set_autoplay == null) gdext.classes.AnimatedSprite2D.mb_set_autoplay = MethodBind.get("AnimatedSprite2D", "set_autoplay", 83702148L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite2D.mb_set_autoplay, livePtr, name)
  }

  /** AnimatedSprite2D.get_autoplay */
  final def getAutoplay(): String = {
    if (gdext.classes.AnimatedSprite2D.mb_get_autoplay == null) gdext.classes.AnimatedSprite2D.mb_get_autoplay = MethodBind.get("AnimatedSprite2D", "get_autoplay", 201670096L)
    Ptrcall.call0[String](gdext.classes.AnimatedSprite2D.mb_get_autoplay, livePtr)
  }

  /** AnimatedSprite2D.is_playing */
  final def isPlaying(): Boolean = {
    if (gdext.classes.AnimatedSprite2D.mb_is_playing == null) gdext.classes.AnimatedSprite2D.mb_is_playing = MethodBind.get("AnimatedSprite2D", "is_playing", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimatedSprite2D.mb_is_playing, livePtr)
  }

  /** AnimatedSprite2D.play */
  final def play(name: gdext.builtin.StringName, custom_speed: Double, from_end: Boolean): Unit = {
    if (gdext.classes.AnimatedSprite2D.mb_play == null) gdext.classes.AnimatedSprite2D.mb_play = MethodBind.get("AnimatedSprite2D", "play", 3269405555L)
    Ptrcall.callVoid3(gdext.classes.AnimatedSprite2D.mb_play, livePtr, name, custom_speed, from_end)
  }

  /** AnimatedSprite2D.play_backwards */
  final def playBackwards(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.AnimatedSprite2D.mb_play_backwards == null) gdext.classes.AnimatedSprite2D.mb_play_backwards = MethodBind.get("AnimatedSprite2D", "play_backwards", 3323268493L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite2D.mb_play_backwards, livePtr, name)
  }

  /** AnimatedSprite2D.pause */
  final def pause(): Unit = {
    if (gdext.classes.AnimatedSprite2D.mb_pause == null) gdext.classes.AnimatedSprite2D.mb_pause = MethodBind.get("AnimatedSprite2D", "pause", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AnimatedSprite2D.mb_pause, livePtr)
  }

  /** AnimatedSprite2D.stop */
  final def stop(): Unit = {
    if (gdext.classes.AnimatedSprite2D.mb_stop == null) gdext.classes.AnimatedSprite2D.mb_stop = MethodBind.get("AnimatedSprite2D", "stop", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AnimatedSprite2D.mb_stop, livePtr)
  }

  /** AnimatedSprite2D.set_centered */
  final def setCentered(centered: Boolean): Unit = {
    if (gdext.classes.AnimatedSprite2D.mb_set_centered == null) gdext.classes.AnimatedSprite2D.mb_set_centered = MethodBind.get("AnimatedSprite2D", "set_centered", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite2D.mb_set_centered, livePtr, centered)
  }

  /** AnimatedSprite2D.is_centered */
  final def isCentered(): Boolean = {
    if (gdext.classes.AnimatedSprite2D.mb_is_centered == null) gdext.classes.AnimatedSprite2D.mb_is_centered = MethodBind.get("AnimatedSprite2D", "is_centered", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimatedSprite2D.mb_is_centered, livePtr)
  }

  /** AnimatedSprite2D.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.AnimatedSprite2D.mb_set_offset == null) gdext.classes.AnimatedSprite2D.mb_set_offset = MethodBind.get("AnimatedSprite2D", "set_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite2D.mb_set_offset, livePtr, offset)
  }

  /** AnimatedSprite2D.get_offset */
  final def getOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.AnimatedSprite2D.mb_get_offset == null) gdext.classes.AnimatedSprite2D.mb_get_offset = MethodBind.get("AnimatedSprite2D", "get_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.AnimatedSprite2D.mb_get_offset, livePtr)
  }

  /** AnimatedSprite2D.set_flip_h */
  final def setFlipH(flip_h: Boolean): Unit = {
    if (gdext.classes.AnimatedSprite2D.mb_set_flip_h == null) gdext.classes.AnimatedSprite2D.mb_set_flip_h = MethodBind.get("AnimatedSprite2D", "set_flip_h", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite2D.mb_set_flip_h, livePtr, flip_h)
  }

  /** AnimatedSprite2D.is_flipped_h */
  final def isFlippedH(): Boolean = {
    if (gdext.classes.AnimatedSprite2D.mb_is_flipped_h == null) gdext.classes.AnimatedSprite2D.mb_is_flipped_h = MethodBind.get("AnimatedSprite2D", "is_flipped_h", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimatedSprite2D.mb_is_flipped_h, livePtr)
  }

  /** AnimatedSprite2D.set_flip_v */
  final def setFlipV(flip_v: Boolean): Unit = {
    if (gdext.classes.AnimatedSprite2D.mb_set_flip_v == null) gdext.classes.AnimatedSprite2D.mb_set_flip_v = MethodBind.get("AnimatedSprite2D", "set_flip_v", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite2D.mb_set_flip_v, livePtr, flip_v)
  }

  /** AnimatedSprite2D.is_flipped_v */
  final def isFlippedV(): Boolean = {
    if (gdext.classes.AnimatedSprite2D.mb_is_flipped_v == null) gdext.classes.AnimatedSprite2D.mb_is_flipped_v = MethodBind.get("AnimatedSprite2D", "is_flipped_v", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimatedSprite2D.mb_is_flipped_v, livePtr)
  }

  /** AnimatedSprite2D.set_frame */
  final def setFrame(frame: Long): Unit = {
    if (gdext.classes.AnimatedSprite2D.mb_set_frame == null) gdext.classes.AnimatedSprite2D.mb_set_frame = MethodBind.get("AnimatedSprite2D", "set_frame", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite2D.mb_set_frame, livePtr, frame)
  }

  /** AnimatedSprite2D.get_frame */
  final def getFrame(): Long = {
    if (gdext.classes.AnimatedSprite2D.mb_get_frame == null) gdext.classes.AnimatedSprite2D.mb_get_frame = MethodBind.get("AnimatedSprite2D", "get_frame", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AnimatedSprite2D.mb_get_frame, livePtr)
  }

  /** AnimatedSprite2D.set_frame_progress */
  final def setFrameProgress(progress: Double): Unit = {
    if (gdext.classes.AnimatedSprite2D.mb_set_frame_progress == null) gdext.classes.AnimatedSprite2D.mb_set_frame_progress = MethodBind.get("AnimatedSprite2D", "set_frame_progress", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite2D.mb_set_frame_progress, livePtr, progress)
  }

  /** AnimatedSprite2D.get_frame_progress */
  final def getFrameProgress(): Double = {
    if (gdext.classes.AnimatedSprite2D.mb_get_frame_progress == null) gdext.classes.AnimatedSprite2D.mb_get_frame_progress = MethodBind.get("AnimatedSprite2D", "get_frame_progress", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimatedSprite2D.mb_get_frame_progress, livePtr)
  }

  /** AnimatedSprite2D.set_frame_and_progress */
  final def setFrameAndProgress(frame: Long, progress: Double): Unit = {
    if (gdext.classes.AnimatedSprite2D.mb_set_frame_and_progress == null) gdext.classes.AnimatedSprite2D.mb_set_frame_and_progress = MethodBind.get("AnimatedSprite2D", "set_frame_and_progress", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AnimatedSprite2D.mb_set_frame_and_progress, livePtr, frame, progress)
  }

  /** AnimatedSprite2D.set_speed_scale */
  final def setSpeedScale(speed_scale: Double): Unit = {
    if (gdext.classes.AnimatedSprite2D.mb_set_speed_scale == null) gdext.classes.AnimatedSprite2D.mb_set_speed_scale = MethodBind.get("AnimatedSprite2D", "set_speed_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimatedSprite2D.mb_set_speed_scale, livePtr, speed_scale)
  }

  /** AnimatedSprite2D.get_speed_scale */
  final def getSpeedScale(): Double = {
    if (gdext.classes.AnimatedSprite2D.mb_get_speed_scale == null) gdext.classes.AnimatedSprite2D.mb_get_speed_scale = MethodBind.get("AnimatedSprite2D", "get_speed_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimatedSprite2D.mb_get_speed_scale, livePtr)
  }

  /** AnimatedSprite2D.get_playing_speed */
  final def getPlayingSpeed(): Double = {
    if (gdext.classes.AnimatedSprite2D.mb_get_playing_speed == null) gdext.classes.AnimatedSprite2D.mb_get_playing_speed = MethodBind.get("AnimatedSprite2D", "get_playing_speed", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimatedSprite2D.mb_get_playing_speed, livePtr)
  }

}

object AnimatedSprite2D {
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
  private[classes] var mb_set_centered: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_centered: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flip_h: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_flipped_h: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flip_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_flipped_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frame_progress: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame_progress: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frame_and_progress: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_playing_speed: GDExtensionMethodBindPtr = null
}
