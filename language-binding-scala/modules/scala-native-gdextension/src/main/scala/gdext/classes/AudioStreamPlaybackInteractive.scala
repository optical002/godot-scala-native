package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamPlaybackInteractive`, extends `AudioStreamPlayback`. */
abstract class AudioStreamPlaybackInteractive extends AudioStreamPlayback {
  override def godotClassName: String = "AudioStreamPlaybackInteractive"

  /** AudioStreamPlaybackInteractive.switch_to_clip_by_name */
  final def switchToClipByName(clip_name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlaybackInteractive", "switch_to_clip_by_name", 3304788590L), hostObject.objectPtr, clip_name)

  /** AudioStreamPlaybackInteractive.switch_to_clip */
  final def switchToClip(clip_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlaybackInteractive", "switch_to_clip", 1286410249L), hostObject.objectPtr, clip_index)

  /** AudioStreamPlaybackInteractive.get_current_clip_index */
  final def getCurrentClipIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamPlaybackInteractive", "get_current_clip_index", 3905245786L), hostObject.objectPtr)

}
