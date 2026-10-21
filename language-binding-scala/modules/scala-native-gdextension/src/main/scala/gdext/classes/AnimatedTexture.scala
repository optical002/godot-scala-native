package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimatedTexture`, extends `Texture2D`. */
abstract class AnimatedTexture extends Texture2D {
  override def godotClassName: String = "AnimatedTexture"

  /** AnimatedTexture.set_frames */
  final def setFrames(frames: Long): Unit = {
    if (gdext.classes.AnimatedTexture.mb_set_frames == null) gdext.classes.AnimatedTexture.mb_set_frames = MethodBind.get("AnimatedTexture", "set_frames", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AnimatedTexture.mb_set_frames, livePtr, frames)
  }

  /** AnimatedTexture.get_frames */
  final def getFrames(): Long = {
    if (gdext.classes.AnimatedTexture.mb_get_frames == null) gdext.classes.AnimatedTexture.mb_get_frames = MethodBind.get("AnimatedTexture", "get_frames", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AnimatedTexture.mb_get_frames, livePtr)
  }

  /** AnimatedTexture.set_current_frame */
  final def setCurrentFrame(frame: Long): Unit = {
    if (gdext.classes.AnimatedTexture.mb_set_current_frame == null) gdext.classes.AnimatedTexture.mb_set_current_frame = MethodBind.get("AnimatedTexture", "set_current_frame", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AnimatedTexture.mb_set_current_frame, livePtr, frame)
  }

  /** AnimatedTexture.get_current_frame */
  final def getCurrentFrame(): Long = {
    if (gdext.classes.AnimatedTexture.mb_get_current_frame == null) gdext.classes.AnimatedTexture.mb_get_current_frame = MethodBind.get("AnimatedTexture", "get_current_frame", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AnimatedTexture.mb_get_current_frame, livePtr)
  }

  /** AnimatedTexture.set_pause */
  final def setPause(pause: Boolean): Unit = {
    if (gdext.classes.AnimatedTexture.mb_set_pause == null) gdext.classes.AnimatedTexture.mb_set_pause = MethodBind.get("AnimatedTexture", "set_pause", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimatedTexture.mb_set_pause, livePtr, pause)
  }

  /** AnimatedTexture.get_pause */
  final def getPause(): Boolean = {
    if (gdext.classes.AnimatedTexture.mb_get_pause == null) gdext.classes.AnimatedTexture.mb_get_pause = MethodBind.get("AnimatedTexture", "get_pause", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimatedTexture.mb_get_pause, livePtr)
  }

  /** AnimatedTexture.set_one_shot */
  final def setOneShot(one_shot: Boolean): Unit = {
    if (gdext.classes.AnimatedTexture.mb_set_one_shot == null) gdext.classes.AnimatedTexture.mb_set_one_shot = MethodBind.get("AnimatedTexture", "set_one_shot", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimatedTexture.mb_set_one_shot, livePtr, one_shot)
  }

  /** AnimatedTexture.get_one_shot */
  final def getOneShot(): Boolean = {
    if (gdext.classes.AnimatedTexture.mb_get_one_shot == null) gdext.classes.AnimatedTexture.mb_get_one_shot = MethodBind.get("AnimatedTexture", "get_one_shot", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimatedTexture.mb_get_one_shot, livePtr)
  }

  /** AnimatedTexture.set_speed_scale */
  final def setSpeedScale(scale: Double): Unit = {
    if (gdext.classes.AnimatedTexture.mb_set_speed_scale == null) gdext.classes.AnimatedTexture.mb_set_speed_scale = MethodBind.get("AnimatedTexture", "set_speed_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimatedTexture.mb_set_speed_scale, livePtr, scale)
  }

  /** AnimatedTexture.get_speed_scale */
  final def getSpeedScale(): Double = {
    if (gdext.classes.AnimatedTexture.mb_get_speed_scale == null) gdext.classes.AnimatedTexture.mb_get_speed_scale = MethodBind.get("AnimatedTexture", "get_speed_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimatedTexture.mb_get_speed_scale, livePtr)
  }

  /** AnimatedTexture.set_frame_texture */
  final def setFrameTexture(frame: Long, texture: Texture2D): Unit = {
    if (gdext.classes.AnimatedTexture.mb_set_frame_texture == null) gdext.classes.AnimatedTexture.mb_set_frame_texture = MethodBind.get("AnimatedTexture", "set_frame_texture", 666127730L)
    Ptrcall.callVoid2(gdext.classes.AnimatedTexture.mb_set_frame_texture, livePtr, frame, Wrappers.handle(texture))
  }

  /** AnimatedTexture.get_frame_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getFrameTexture(frame: Long): Texture2D = {
    if (gdext.classes.AnimatedTexture.mb_get_frame_texture == null) gdext.classes.AnimatedTexture.mb_get_frame_texture = MethodBind.get("AnimatedTexture", "get_frame_texture", 3536238170L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.AnimatedTexture.mb_get_frame_texture, livePtr, frame))
  }

  /** AnimatedTexture.set_frame_duration */
  final def setFrameDuration(frame: Long, duration: Double): Unit = {
    if (gdext.classes.AnimatedTexture.mb_set_frame_duration == null) gdext.classes.AnimatedTexture.mb_set_frame_duration = MethodBind.get("AnimatedTexture", "set_frame_duration", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AnimatedTexture.mb_set_frame_duration, livePtr, frame, duration)
  }

  /** AnimatedTexture.get_frame_duration */
  final def getFrameDuration(frame: Long): Double = {
    if (gdext.classes.AnimatedTexture.mb_get_frame_duration == null) gdext.classes.AnimatedTexture.mb_get_frame_duration = MethodBind.get("AnimatedTexture", "get_frame_duration", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.AnimatedTexture.mb_get_frame_duration, livePtr, frame)
  }

}

object AnimatedTexture {
  private[classes] var mb_set_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_current_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pause: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pause: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_one_shot: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_one_shot: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frame_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frame_duration: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame_duration: GDExtensionMethodBindPtr = null
}
