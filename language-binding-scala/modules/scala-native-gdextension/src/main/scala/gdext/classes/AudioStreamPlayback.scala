package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamPlayback`, extends `RefCounted`. */
abstract class AudioStreamPlayback extends RefCounted {

  /** AudioStreamPlayback.set_sample_playback */
  final def setSamplePlayback(playback_sample: AudioSamplePlayback): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayback", "set_sample_playback", 3195455091L), hostObject.objectPtr, playback_sample.hostObject)

  /** AudioStreamPlayback.get_sample_playback */
  final def getSamplePlayback(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AudioStreamPlayback", "get_sample_playback", 3482738536L), hostObject.objectPtr)

  /** AudioStreamPlayback.start */
  final def start(from_pos: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayback", "start", 1958160172L), hostObject.objectPtr, from_pos)

  /** AudioStreamPlayback.seek */
  final def seek(time: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayback", "seek", 1958160172L), hostObject.objectPtr, time)

  /** AudioStreamPlayback.stop */
  final def stop(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AudioStreamPlayback", "stop", 3218959716L), hostObject.objectPtr)

  /** AudioStreamPlayback.get_loop_count */
  final def getLoopCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamPlayback", "get_loop_count", 3905245786L), hostObject.objectPtr)

  /** AudioStreamPlayback.get_playback_position */
  final def getPlaybackPosition(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamPlayback", "get_playback_position", 1740695150L), hostObject.objectPtr)

  /** AudioStreamPlayback.is_playing */
  final def isPlaying(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStreamPlayback", "is_playing", 36873697L), hostObject.objectPtr)

}

object AudioStreamPlayback {
  /** Class metadata for Gd[AudioStreamPlayback] lifetime management and casting. */
  given GodotClass[AudioStreamPlayback] with {
    def className = "AudioStreamPlayback"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamPlayback = new AudioStreamPlayback {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamPlayback): GodotObject = t.hostObject
  }
}
