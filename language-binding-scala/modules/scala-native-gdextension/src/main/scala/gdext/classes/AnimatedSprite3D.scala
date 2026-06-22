package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimatedSprite3D`, extends `SpriteBase3D`. */
abstract class AnimatedSprite3D extends SpriteBase3D {

  /** AnimatedSprite3D.set_sprite_frames */
  final def setSpriteFrames(sprite_frames: SpriteFrames): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite3D", "set_sprite_frames", 905781144L), hostObject.objectPtr, sprite_frames.hostObject)

  /** AnimatedSprite3D.get_sprite_frames */
  final def getSpriteFrames(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AnimatedSprite3D", "get_sprite_frames", 3804851214L), hostObject.objectPtr)

  /** AnimatedSprite3D.set_animation */
  final def setAnimation(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite3D", "set_animation", 3304788590L), hostObject.objectPtr, name)

  /** AnimatedSprite3D.get_animation */
  final def getAnimation(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("AnimatedSprite3D", "get_animation", 2002593661L), hostObject.objectPtr)

  /** AnimatedSprite3D.set_autoplay */
  final def setAutoplay(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite3D", "set_autoplay", 83702148L), hostObject.objectPtr, name)

  /** AnimatedSprite3D.get_autoplay */
  final def getAutoplay(): String =
    Ptrcall.call0[String](MethodBind.get("AnimatedSprite3D", "get_autoplay", 201670096L), hostObject.objectPtr)

  /** AnimatedSprite3D.is_playing */
  final def isPlaying(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimatedSprite3D", "is_playing", 36873697L), hostObject.objectPtr)

  /** AnimatedSprite3D.play */
  final def play(name: gdext.builtin.StringName, custom_speed: Double, from_end: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("AnimatedSprite3D", "play", 3269405555L), hostObject.objectPtr, name, custom_speed, from_end)

  /** AnimatedSprite3D.play_backwards */
  final def playBackwards(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite3D", "play_backwards", 3323268493L), hostObject.objectPtr, name)

  /** AnimatedSprite3D.pause */
  final def pause(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AnimatedSprite3D", "pause", 3218959716L), hostObject.objectPtr)

  /** AnimatedSprite3D.stop */
  final def stop(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AnimatedSprite3D", "stop", 3218959716L), hostObject.objectPtr)

  /** AnimatedSprite3D.set_frame */
  final def setFrame(frame: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite3D", "set_frame", 1286410249L), hostObject.objectPtr, frame)

  /** AnimatedSprite3D.get_frame */
  final def getFrame(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimatedSprite3D", "get_frame", 3905245786L), hostObject.objectPtr)

  /** AnimatedSprite3D.set_frame_progress */
  final def setFrameProgress(progress: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite3D", "set_frame_progress", 373806689L), hostObject.objectPtr, progress)

  /** AnimatedSprite3D.get_frame_progress */
  final def getFrameProgress(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimatedSprite3D", "get_frame_progress", 1740695150L), hostObject.objectPtr)

  /** AnimatedSprite3D.set_frame_and_progress */
  final def setFrameAndProgress(frame: Long, progress: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimatedSprite3D", "set_frame_and_progress", 1602489585L), hostObject.objectPtr, frame, progress)

  /** AnimatedSprite3D.set_speed_scale */
  final def setSpeedScale(speed_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedSprite3D", "set_speed_scale", 373806689L), hostObject.objectPtr, speed_scale)

  /** AnimatedSprite3D.get_speed_scale */
  final def getSpeedScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimatedSprite3D", "get_speed_scale", 1740695150L), hostObject.objectPtr)

  /** AnimatedSprite3D.get_playing_speed */
  final def getPlayingSpeed(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimatedSprite3D", "get_playing_speed", 1740695150L), hostObject.objectPtr)

}

object AnimatedSprite3D {
  /** Class metadata for Gd[AnimatedSprite3D] lifetime management and casting. */
  given GodotClass[AnimatedSprite3D] with {
    def className = "AnimatedSprite3D"
    def isRefCounted = false
    def wrap(o: GodotObject): AnimatedSprite3D = new AnimatedSprite3D {}.withHost(o.objectPtr)
    def unwrap(t: AnimatedSprite3D): GodotObject = t.hostObject
  }
}
