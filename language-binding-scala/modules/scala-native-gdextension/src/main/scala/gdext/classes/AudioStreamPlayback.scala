package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamPlayback`, extends `RefCounted`. */
abstract class AudioStreamPlayback extends RefCounted {
  override def godotClassName: String = "AudioStreamPlayback"

  /** AudioStreamPlayback.set_sample_playback */
  final def setSamplePlayback(playbackSample: AudioSamplePlayback): Unit = {
    if (gdext.classes.AudioStreamPlayback.mb_set_sample_playback == null) gdext.classes.AudioStreamPlayback.mb_set_sample_playback = MethodBind.get("AudioStreamPlayback", "set_sample_playback", 3195455091L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayback.mb_set_sample_playback, livePtr, Wrappers.handle(playbackSample))
  }

  /** AudioStreamPlayback.get_sample_playback. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSamplePlayback(): AudioSamplePlayback = {
    if (gdext.classes.AudioStreamPlayback.mb_get_sample_playback == null) gdext.classes.AudioStreamPlayback.mb_get_sample_playback = MethodBind.get("AudioStreamPlayback", "get_sample_playback", 3482738536L)
    Wrappers.owned[AudioSamplePlayback](Ptrcall.call0[Long](gdext.classes.AudioStreamPlayback.mb_get_sample_playback, livePtr))
  }

  /** AudioStreamPlayback.start */
  final def start(fromPos: Double = 0.0): Unit = {
    if (gdext.classes.AudioStreamPlayback.mb_start == null) gdext.classes.AudioStreamPlayback.mb_start = MethodBind.get("AudioStreamPlayback", "start", 1958160172L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayback.mb_start, livePtr, fromPos)
  }

  /** AudioStreamPlayback.seek */
  final def seek(time: Double = 0.0): Unit = {
    if (gdext.classes.AudioStreamPlayback.mb_seek == null) gdext.classes.AudioStreamPlayback.mb_seek = MethodBind.get("AudioStreamPlayback", "seek", 1958160172L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayback.mb_seek, livePtr, time)
  }

  /** AudioStreamPlayback.stop */
  final def stop(): Unit = {
    if (gdext.classes.AudioStreamPlayback.mb_stop == null) gdext.classes.AudioStreamPlayback.mb_stop = MethodBind.get("AudioStreamPlayback", "stop", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AudioStreamPlayback.mb_stop, livePtr)
  }

  /** AudioStreamPlayback.get_loop_count */
  final def getLoopCount(): Long = {
    if (gdext.classes.AudioStreamPlayback.mb_get_loop_count == null) gdext.classes.AudioStreamPlayback.mb_get_loop_count = MethodBind.get("AudioStreamPlayback", "get_loop_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamPlayback.mb_get_loop_count, livePtr)
  }

  /** AudioStreamPlayback.get_playback_position */
  final def getPlaybackPosition(): Double = {
    if (gdext.classes.AudioStreamPlayback.mb_get_playback_position == null) gdext.classes.AudioStreamPlayback.mb_get_playback_position = MethodBind.get("AudioStreamPlayback", "get_playback_position", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayback.mb_get_playback_position, livePtr)
  }

  /** AudioStreamPlayback.is_playing */
  final def isPlaying(): Boolean = {
    if (gdext.classes.AudioStreamPlayback.mb_is_playing == null) gdext.classes.AudioStreamPlayback.mb_is_playing = MethodBind.get("AudioStreamPlayback", "is_playing", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamPlayback.mb_is_playing, livePtr)
  }

}

object AudioStreamPlayback {
  private[classes] var mb_set_sample_playback: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sample_playback: GDExtensionMethodBindPtr = null
  private[classes] var mb_start: GDExtensionMethodBindPtr = null
  private[classes] var mb_seek: GDExtensionMethodBindPtr = null
  private[classes] var mb_stop: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_loop_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_playback_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_playing: GDExtensionMethodBindPtr = null
}
