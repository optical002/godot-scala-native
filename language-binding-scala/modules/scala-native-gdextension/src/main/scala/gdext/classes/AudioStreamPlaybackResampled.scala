package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamPlaybackResampled`, extends `AudioStreamPlayback`. */
abstract class AudioStreamPlaybackResampled extends AudioStreamPlayback {
  override def godotClassName: String = "AudioStreamPlaybackResampled"

  /** AudioStreamPlaybackResampled.begin_resample */
  final def beginResample(): Unit = {
    if (gdext.classes.AudioStreamPlaybackResampled.mb_begin_resample == null) gdext.classes.AudioStreamPlaybackResampled.mb_begin_resample = MethodBind.get("AudioStreamPlaybackResampled", "begin_resample", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AudioStreamPlaybackResampled.mb_begin_resample, livePtr)
  }

}

object AudioStreamPlaybackResampled {
  private[classes] var mb_begin_resample: GDExtensionMethodBindPtr = null
}
