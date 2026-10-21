package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamGeneratorPlayback`, extends `AudioStreamPlaybackResampled`. */
abstract class AudioStreamGeneratorPlayback extends AudioStreamPlaybackResampled {
  override def godotClassName: String = "AudioStreamGeneratorPlayback"

  /** AudioStreamGeneratorPlayback.push_frame */
  final def pushFrame(frame: gdext.builtin.Vector2): Boolean = {
    if (gdext.classes.AudioStreamGeneratorPlayback.mb_push_frame == null) gdext.classes.AudioStreamGeneratorPlayback.mb_push_frame = MethodBind.get("AudioStreamGeneratorPlayback", "push_frame", 3975407249L)
    Ptrcall.call1[gdext.builtin.Vector2, Boolean](gdext.classes.AudioStreamGeneratorPlayback.mb_push_frame, livePtr, frame)
  }

  /** AudioStreamGeneratorPlayback.can_push_buffer */
  final def canPushBuffer(amount: Long): Boolean = {
    if (gdext.classes.AudioStreamGeneratorPlayback.mb_can_push_buffer == null) gdext.classes.AudioStreamGeneratorPlayback.mb_can_push_buffer = MethodBind.get("AudioStreamGeneratorPlayback", "can_push_buffer", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.AudioStreamGeneratorPlayback.mb_can_push_buffer, livePtr, amount)
  }

  /** AudioStreamGeneratorPlayback.get_frames_available */
  final def getFramesAvailable(): Long = {
    if (gdext.classes.AudioStreamGeneratorPlayback.mb_get_frames_available == null) gdext.classes.AudioStreamGeneratorPlayback.mb_get_frames_available = MethodBind.get("AudioStreamGeneratorPlayback", "get_frames_available", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamGeneratorPlayback.mb_get_frames_available, livePtr)
  }

  /** AudioStreamGeneratorPlayback.get_skips */
  final def getSkips(): Long = {
    if (gdext.classes.AudioStreamGeneratorPlayback.mb_get_skips == null) gdext.classes.AudioStreamGeneratorPlayback.mb_get_skips = MethodBind.get("AudioStreamGeneratorPlayback", "get_skips", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamGeneratorPlayback.mb_get_skips, livePtr)
  }

  /** AudioStreamGeneratorPlayback.clear_buffer */
  final def clearBuffer(): Unit = {
    if (gdext.classes.AudioStreamGeneratorPlayback.mb_clear_buffer == null) gdext.classes.AudioStreamGeneratorPlayback.mb_clear_buffer = MethodBind.get("AudioStreamGeneratorPlayback", "clear_buffer", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AudioStreamGeneratorPlayback.mb_clear_buffer, livePtr)
  }

}

object AudioStreamGeneratorPlayback {
  private[classes] var mb_push_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_can_push_buffer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frames_available: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skips: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_buffer: GDExtensionMethodBindPtr = null
}
