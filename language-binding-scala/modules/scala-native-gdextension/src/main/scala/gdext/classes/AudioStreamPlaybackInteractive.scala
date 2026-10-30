package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamPlaybackInteractive`, extends `AudioStreamPlayback`. */
abstract class AudioStreamPlaybackInteractive extends AudioStreamPlayback {
  override def godotClassName: String = "AudioStreamPlaybackInteractive"

  /** AudioStreamPlaybackInteractive.switch_to_clip_by_name */
  final def switchToClipByName(clipName: String): Unit = {
    if (gdext.classes.AudioStreamPlaybackInteractive.mb_switch_to_clip_by_name == null) gdext.classes.AudioStreamPlaybackInteractive.mb_switch_to_clip_by_name = MethodBind.get("AudioStreamPlaybackInteractive", "switch_to_clip_by_name", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlaybackInteractive.mb_switch_to_clip_by_name, livePtr, SnArg(clipName))
  }

  /** AudioStreamPlaybackInteractive.switch_to_clip */
  final def switchToClip(clipIndex: Long): Unit = {
    if (gdext.classes.AudioStreamPlaybackInteractive.mb_switch_to_clip == null) gdext.classes.AudioStreamPlaybackInteractive.mb_switch_to_clip = MethodBind.get("AudioStreamPlaybackInteractive", "switch_to_clip", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlaybackInteractive.mb_switch_to_clip, livePtr, clipIndex)
  }

  /** AudioStreamPlaybackInteractive.get_current_clip_index */
  final def getCurrentClipIndex(): Long = {
    if (gdext.classes.AudioStreamPlaybackInteractive.mb_get_current_clip_index == null) gdext.classes.AudioStreamPlaybackInteractive.mb_get_current_clip_index = MethodBind.get("AudioStreamPlaybackInteractive", "get_current_clip_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamPlaybackInteractive.mb_get_current_clip_index, livePtr)
  }

}

object AudioStreamPlaybackInteractive {
  private[classes] var mb_switch_to_clip_by_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_switch_to_clip: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_clip_index: GDExtensionMethodBindPtr = null
}
