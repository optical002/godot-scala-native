package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimatedSprite2D`, extends `Node2D`. */
abstract class AnimatedSprite2D extends Node2D {

  /** AnimatedSprite2D.set_sprite_frames */
  final def setSpriteFrames(sprite_frames: SpriteFrames): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite2D", "set_sprite_frames", 905781144L), hostObject.objectPtr, sprite_frames.hostObject)

  /** AnimatedSprite2D.get_sprite_frames */
  final def getSpriteFrames(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AnimatedSprite2D", "get_sprite_frames", 3804851214L), hostObject.objectPtr)

  /** AnimatedSprite2D.set_animation */
  final def setAnimation(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite2D", "set_animation", 3304788590L), hostObject.objectPtr, name)

  /** AnimatedSprite2D.get_animation */
  final def getAnimation(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("AnimatedSprite2D", "get_animation", 2002593661L), hostObject.objectPtr)

  /** AnimatedSprite2D.set_autoplay */
  final def setAutoplay(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite2D", "set_autoplay", 83702148L), hostObject.objectPtr, name)

  /** AnimatedSprite2D.get_autoplay */
  final def getAutoplay(): String =
    Ptrcall.call0[String](MethodBind.get("AnimatedSprite2D", "get_autoplay", 201670096L), hostObject.objectPtr)

  /** AnimatedSprite2D.is_playing */
  final def isPlaying(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimatedSprite2D", "is_playing", 36873697L), hostObject.objectPtr)

  /** AnimatedSprite2D.play */
  final def play(name: gdext.builtin.StringName, custom_speed: Double, from_end: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("AnimatedSprite2D", "play", 3269405555L), hostObject.objectPtr, name, custom_speed, from_end)

  /** AnimatedSprite2D.play_backwards */
  final def playBackwards(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite2D", "play_backwards", 3323268493L), hostObject.objectPtr, name)

  /** AnimatedSprite2D.pause */
  final def pause(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AnimatedSprite2D", "pause", 3218959716L), hostObject.objectPtr)

  /** AnimatedSprite2D.stop */
  final def stop(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AnimatedSprite2D", "stop", 3218959716L), hostObject.objectPtr)

  /** AnimatedSprite2D.set_centered */
  final def setCentered(centered: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite2D", "set_centered", 2586408642L), hostObject.objectPtr, centered)

  /** AnimatedSprite2D.is_centered */
  final def isCentered(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimatedSprite2D", "is_centered", 36873697L), hostObject.objectPtr)

  /** AnimatedSprite2D.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite2D", "set_offset", 743155724L), hostObject.objectPtr, offset)

  /** AnimatedSprite2D.get_offset */
  final def getOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("AnimatedSprite2D", "get_offset", 3341600327L), hostObject.objectPtr)

  /** AnimatedSprite2D.set_flip_h */
  final def setFlipH(flip_h: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite2D", "set_flip_h", 2586408642L), hostObject.objectPtr, flip_h)

  /** AnimatedSprite2D.is_flipped_h */
  final def isFlippedH(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimatedSprite2D", "is_flipped_h", 36873697L), hostObject.objectPtr)

  /** AnimatedSprite2D.set_flip_v */
  final def setFlipV(flip_v: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite2D", "set_flip_v", 2586408642L), hostObject.objectPtr, flip_v)

  /** AnimatedSprite2D.is_flipped_v */
  final def isFlippedV(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimatedSprite2D", "is_flipped_v", 36873697L), hostObject.objectPtr)

  /** AnimatedSprite2D.set_frame */
  final def setFrame(frame: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite2D", "set_frame", 1286410249L), hostObject.objectPtr, frame)

  /** AnimatedSprite2D.get_frame */
  final def getFrame(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimatedSprite2D", "get_frame", 3905245786L), hostObject.objectPtr)

  /** AnimatedSprite2D.set_frame_progress */
  final def setFrameProgress(progress: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite2D", "set_frame_progress", 373806689L), hostObject.objectPtr, progress)

  /** AnimatedSprite2D.get_frame_progress */
  final def getFrameProgress(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimatedSprite2D", "get_frame_progress", 1740695150L), hostObject.objectPtr)

  /** AnimatedSprite2D.set_frame_and_progress */
  final def setFrameAndProgress(frame: Long, progress: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimatedSprite2D", "set_frame_and_progress", 1602489585L), hostObject.objectPtr, frame, progress)

  /** AnimatedSprite2D.set_speed_scale */
  final def setSpeedScale(speed_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite2D", "set_speed_scale", 373806689L), hostObject.objectPtr, speed_scale)

  /** AnimatedSprite2D.get_speed_scale */
  final def getSpeedScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimatedSprite2D", "get_speed_scale", 1740695150L), hostObject.objectPtr)

  /** AnimatedSprite2D.get_playing_speed */
  final def getPlayingSpeed(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimatedSprite2D", "get_playing_speed", 1740695150L), hostObject.objectPtr)

}

object AnimatedSprite2D {
  /** Class metadata for Gd[AnimatedSprite2D] lifetime management and casting. */
  given GodotClass[AnimatedSprite2D] with {
    def className = "AnimatedSprite2D"
    def isRefCounted = false
    def wrap(o: GodotObject): AnimatedSprite2D = new AnimatedSprite2D {}.withHost(o.objectPtr)
    def unwrap(t: AnimatedSprite2D): GodotObject = t.hostObject
  }
}
