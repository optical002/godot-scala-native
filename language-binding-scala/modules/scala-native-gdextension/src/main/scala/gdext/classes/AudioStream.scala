package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStream`, extends `Resource`. */
abstract class AudioStream extends Resource {
  override def godotClassName: String = "AudioStream"

  /** AudioStream.get_length */
  final def getLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStream", "get_length", 1740695150L), hostObject.objectPtr)

  /** AudioStream.is_monophonic */
  final def isMonophonic(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStream", "is_monophonic", 36873697L), hostObject.objectPtr)

  /** AudioStream.instantiate_playback */
  final def instantiatePlayback(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AudioStream", "instantiate_playback", 210135309L), hostObject.objectPtr)

  /** AudioStream.can_be_sampled */
  final def canBeSampled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStream", "can_be_sampled", 36873697L), hostObject.objectPtr)

  /** AudioStream.generate_sample */
  final def generateSample(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AudioStream", "generate_sample", 2646048999L), hostObject.objectPtr)

  /** AudioStream.is_meta_stream */
  final def isMetaStream(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStream", "is_meta_stream", 36873697L), hostObject.objectPtr)

}
