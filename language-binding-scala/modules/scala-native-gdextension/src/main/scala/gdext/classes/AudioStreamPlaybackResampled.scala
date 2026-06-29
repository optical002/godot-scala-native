package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamPlaybackResampled`, extends `AudioStreamPlayback`. */
abstract class AudioStreamPlaybackResampled extends AudioStreamPlayback {
  override def godotClassName: String = "AudioStreamPlaybackResampled"

  /** AudioStreamPlaybackResampled.begin_resample */
  final def beginResample(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AudioStreamPlaybackResampled", "begin_resample", 3218959716L), hostObject.objectPtr)

}
