package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectCapture`, extends `AudioEffect`. */
abstract class AudioEffectCapture extends AudioEffect {
  override def godotClassName: String = "AudioEffectCapture"

  /** AudioEffectCapture.can_get_buffer */
  final def canGetBuffer(frames: Long): Boolean = {
    if (gdext.classes.AudioEffectCapture.mb_can_get_buffer == null) gdext.classes.AudioEffectCapture.mb_can_get_buffer = MethodBind.get("AudioEffectCapture", "can_get_buffer", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.AudioEffectCapture.mb_can_get_buffer, livePtr, frames)
  }

  /** AudioEffectCapture.clear_buffer */
  final def clearBuffer(): Unit = {
    if (gdext.classes.AudioEffectCapture.mb_clear_buffer == null) gdext.classes.AudioEffectCapture.mb_clear_buffer = MethodBind.get("AudioEffectCapture", "clear_buffer", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AudioEffectCapture.mb_clear_buffer, livePtr)
  }

  /** AudioEffectCapture.set_buffer_length */
  final def setBufferLength(buffer_length_seconds: Double): Unit = {
    if (gdext.classes.AudioEffectCapture.mb_set_buffer_length == null) gdext.classes.AudioEffectCapture.mb_set_buffer_length = MethodBind.get("AudioEffectCapture", "set_buffer_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectCapture.mb_set_buffer_length, livePtr, buffer_length_seconds)
  }

  /** AudioEffectCapture.get_buffer_length */
  final def getBufferLength(): Double = {
    if (gdext.classes.AudioEffectCapture.mb_get_buffer_length == null) gdext.classes.AudioEffectCapture.mb_get_buffer_length = MethodBind.get("AudioEffectCapture", "get_buffer_length", 191475506L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectCapture.mb_get_buffer_length, livePtr)
  }

  /** AudioEffectCapture.get_frames_available */
  final def getFramesAvailable(): Long = {
    if (gdext.classes.AudioEffectCapture.mb_get_frames_available == null) gdext.classes.AudioEffectCapture.mb_get_frames_available = MethodBind.get("AudioEffectCapture", "get_frames_available", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioEffectCapture.mb_get_frames_available, livePtr)
  }

  /** AudioEffectCapture.get_discarded_frames */
  final def getDiscardedFrames(): Long = {
    if (gdext.classes.AudioEffectCapture.mb_get_discarded_frames == null) gdext.classes.AudioEffectCapture.mb_get_discarded_frames = MethodBind.get("AudioEffectCapture", "get_discarded_frames", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioEffectCapture.mb_get_discarded_frames, livePtr)
  }

  /** AudioEffectCapture.get_buffer_length_frames */
  final def getBufferLengthFrames(): Long = {
    if (gdext.classes.AudioEffectCapture.mb_get_buffer_length_frames == null) gdext.classes.AudioEffectCapture.mb_get_buffer_length_frames = MethodBind.get("AudioEffectCapture", "get_buffer_length_frames", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioEffectCapture.mb_get_buffer_length_frames, livePtr)
  }

  /** AudioEffectCapture.get_pushed_frames */
  final def getPushedFrames(): Long = {
    if (gdext.classes.AudioEffectCapture.mb_get_pushed_frames == null) gdext.classes.AudioEffectCapture.mb_get_pushed_frames = MethodBind.get("AudioEffectCapture", "get_pushed_frames", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioEffectCapture.mb_get_pushed_frames, livePtr)
  }

}

object AudioEffectCapture {
  private[classes] var mb_can_get_buffer: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_buffer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_buffer_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_buffer_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frames_available: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_discarded_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_buffer_length_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pushed_frames: GDExtensionMethodBindPtr = null
}
