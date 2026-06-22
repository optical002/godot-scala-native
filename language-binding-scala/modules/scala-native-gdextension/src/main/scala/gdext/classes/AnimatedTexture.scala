package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimatedTexture`, extends `Texture2D`. */
abstract class AnimatedTexture extends Texture2D {

  /** AnimatedTexture.set_frames */
  final def setFrames(frames: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedTexture", "set_frames", 1286410249L), hostObject.objectPtr, frames)

  /** AnimatedTexture.get_frames */
  final def getFrames(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimatedTexture", "get_frames", 3905245786L), hostObject.objectPtr)

  /** AnimatedTexture.set_current_frame */
  final def setCurrentFrame(frame: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedTexture", "set_current_frame", 1286410249L), hostObject.objectPtr, frame)

  /** AnimatedTexture.get_current_frame */
  final def getCurrentFrame(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimatedTexture", "get_current_frame", 3905245786L), hostObject.objectPtr)

  /** AnimatedTexture.set_pause */
  final def setPause(pause: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedTexture", "set_pause", 2586408642L), hostObject.objectPtr, pause)

  /** AnimatedTexture.get_pause */
  final def getPause(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimatedTexture", "get_pause", 36873697L), hostObject.objectPtr)

  /** AnimatedTexture.set_one_shot */
  final def setOneShot(one_shot: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedTexture", "set_one_shot", 2586408642L), hostObject.objectPtr, one_shot)

  /** AnimatedTexture.get_one_shot */
  final def getOneShot(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimatedTexture", "get_one_shot", 36873697L), hostObject.objectPtr)

  /** AnimatedTexture.set_speed_scale */
  final def setSpeedScale(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatedTexture", "set_speed_scale", 373806689L), hostObject.objectPtr, scale)

  /** AnimatedTexture.get_speed_scale */
  final def getSpeedScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimatedTexture", "get_speed_scale", 1740695150L), hostObject.objectPtr)

  /** AnimatedTexture.set_frame_texture */
  final def setFrameTexture(frame: Long, texture: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimatedTexture", "set_frame_texture", 666127730L), hostObject.objectPtr, frame, texture.hostObject)

  /** AnimatedTexture.get_frame_texture */
  final def getFrameTexture(frame: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("AnimatedTexture", "get_frame_texture", 3536238170L), hostObject.objectPtr, frame)

  /** AnimatedTexture.set_frame_duration */
  final def setFrameDuration(frame: Long, duration: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimatedTexture", "set_frame_duration", 1602489585L), hostObject.objectPtr, frame, duration)

  /** AnimatedTexture.get_frame_duration */
  final def getFrameDuration(frame: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("AnimatedTexture", "get_frame_duration", 2339986948L), hostObject.objectPtr, frame)

}

object AnimatedTexture {
  /** Class metadata for Gd[AnimatedTexture] lifetime management and casting. */
  given GodotClass[AnimatedTexture] with {
    def className = "AnimatedTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimatedTexture = new AnimatedTexture {}.withHost(o.objectPtr)
    def unwrap(t: AnimatedTexture): GodotObject = t.hostObject
  }
}
