package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectCapture`, extends `AudioEffect`. */
abstract class AudioEffectCapture extends AudioEffect {
  override def godotClassName: String = "AudioEffectCapture"

  /** AudioEffectCapture.can_get_buffer */
  final def canGetBuffer(frames: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("AudioEffectCapture", "can_get_buffer", 1116898809L), hostObject.objectPtr, frames)

  /** AudioEffectCapture.clear_buffer */
  final def clearBuffer(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AudioEffectCapture", "clear_buffer", 3218959716L), hostObject.objectPtr)

  /** AudioEffectCapture.set_buffer_length */
  final def setBufferLength(buffer_length_seconds: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectCapture", "set_buffer_length", 373806689L), hostObject.objectPtr, buffer_length_seconds)

  /** AudioEffectCapture.get_buffer_length */
  final def getBufferLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectCapture", "get_buffer_length", 191475506L), hostObject.objectPtr)

  /** AudioEffectCapture.get_frames_available */
  final def getFramesAvailable(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioEffectCapture", "get_frames_available", 3905245786L), hostObject.objectPtr)

  /** AudioEffectCapture.get_discarded_frames */
  final def getDiscardedFrames(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioEffectCapture", "get_discarded_frames", 3905245786L), hostObject.objectPtr)

  /** AudioEffectCapture.get_buffer_length_frames */
  final def getBufferLengthFrames(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioEffectCapture", "get_buffer_length_frames", 3905245786L), hostObject.objectPtr)

  /** AudioEffectCapture.get_pushed_frames */
  final def getPushedFrames(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioEffectCapture", "get_pushed_frames", 3905245786L), hostObject.objectPtr)

}
