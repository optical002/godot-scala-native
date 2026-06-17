package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectRecord`, extends `AudioEffect`. */
abstract class AudioEffectRecord extends AudioEffect {

  /** AudioEffectRecord.set_recording_active */
  final def setRecordingActive(record: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectRecord", "set_recording_active", 2586408642L), hostObject.objectPtr, record)

  /** AudioEffectRecord.is_recording_active */
  final def isRecordingActive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioEffectRecord", "is_recording_active", 36873697L), hostObject.objectPtr)

  /** AudioEffectRecord.set_format */
  final def setFormat(format: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectRecord", "set_format", 60648488L), hostObject.objectPtr, format)

  /** AudioEffectRecord.get_format */
  final def getFormat(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioEffectRecord", "get_format", 3151724922L), hostObject.objectPtr)

  /** AudioEffectRecord.get_recording */
  final def getRecording(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AudioEffectRecord", "get_recording", 2964110865L), hostObject.objectPtr)

}

object AudioEffectRecord {
  /** Class metadata for Gd[AudioEffectRecord] lifetime management and casting. */
  given GodotClass[AudioEffectRecord] with {
    def className = "AudioEffectRecord"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectRecord = new AudioEffectRecord {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectRecord): GodotObject = t.hostObject
  }
}
