package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectRecord`, extends `AudioEffect`. */
abstract class AudioEffectRecord extends AudioEffect {
  override def godotClassName: String = "AudioEffectRecord"

  /** AudioEffectRecord.set_recording_active */
  final def setRecordingActive(record: Boolean): Unit = {
    if (gdext.classes.AudioEffectRecord.mb_set_recording_active == null) gdext.classes.AudioEffectRecord.mb_set_recording_active = MethodBind.get("AudioEffectRecord", "set_recording_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectRecord.mb_set_recording_active, livePtr, record)
  }

  /** AudioEffectRecord.is_recording_active */
  final def isRecordingActive(): Boolean = {
    if (gdext.classes.AudioEffectRecord.mb_is_recording_active == null) gdext.classes.AudioEffectRecord.mb_is_recording_active = MethodBind.get("AudioEffectRecord", "is_recording_active", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioEffectRecord.mb_is_recording_active, livePtr)
  }

  /** AudioEffectRecord.set_format */
  final def setFormat(format: Long): Unit = {
    if (gdext.classes.AudioEffectRecord.mb_set_format == null) gdext.classes.AudioEffectRecord.mb_set_format = MethodBind.get("AudioEffectRecord", "set_format", 60648488L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectRecord.mb_set_format, livePtr, format)
  }

  /** AudioEffectRecord.get_format */
  final def getFormat(): Long = {
    if (gdext.classes.AudioEffectRecord.mb_get_format == null) gdext.classes.AudioEffectRecord.mb_get_format = MethodBind.get("AudioEffectRecord", "get_format", 3151724922L)
    Ptrcall.call0[Long](gdext.classes.AudioEffectRecord.mb_get_format, livePtr)
  }

  /** AudioEffectRecord.get_recording. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getRecording(): AudioStreamWAV = {
    if (gdext.classes.AudioEffectRecord.mb_get_recording == null) gdext.classes.AudioEffectRecord.mb_get_recording = MethodBind.get("AudioEffectRecord", "get_recording", 2964110865L)
    Wrappers.owned[AudioStreamWAV](Ptrcall.call0[Long](gdext.classes.AudioEffectRecord.mb_get_recording, livePtr))
  }

}

object AudioEffectRecord {
  private[classes] var mb_set_recording_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_recording_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_recording: GDExtensionMethodBindPtr = null
}
