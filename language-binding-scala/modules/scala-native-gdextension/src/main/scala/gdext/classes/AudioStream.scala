package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStream`, extends `Resource`. */
abstract class AudioStream extends Resource {
  override def godotClassName: String = "AudioStream"

  /** AudioStream.get_length */
  final def getLength(): Double = {
    if (gdext.classes.AudioStream.mb_get_length == null) gdext.classes.AudioStream.mb_get_length = MethodBind.get("AudioStream", "get_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStream.mb_get_length, livePtr)
  }

  /** AudioStream.is_monophonic */
  final def isMonophonic(): Boolean = {
    if (gdext.classes.AudioStream.mb_is_monophonic == null) gdext.classes.AudioStream.mb_is_monophonic = MethodBind.get("AudioStream", "is_monophonic", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStream.mb_is_monophonic, livePtr)
  }

  /** AudioStream.instantiate_playback. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def instantiatePlayback(): AudioStreamPlayback = {
    if (gdext.classes.AudioStream.mb_instantiate_playback == null) gdext.classes.AudioStream.mb_instantiate_playback = MethodBind.get("AudioStream", "instantiate_playback", 210135309L)
    Wrappers.owned[AudioStreamPlayback](Ptrcall.call0[Long](gdext.classes.AudioStream.mb_instantiate_playback, livePtr))
  }

  /** AudioStream.can_be_sampled */
  final def canBeSampled(): Boolean = {
    if (gdext.classes.AudioStream.mb_can_be_sampled == null) gdext.classes.AudioStream.mb_can_be_sampled = MethodBind.get("AudioStream", "can_be_sampled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStream.mb_can_be_sampled, livePtr)
  }

  /** AudioStream.generate_sample. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def generateSample(): AudioSample = {
    if (gdext.classes.AudioStream.mb_generate_sample == null) gdext.classes.AudioStream.mb_generate_sample = MethodBind.get("AudioStream", "generate_sample", 2646048999L)
    Wrappers.owned[AudioSample](Ptrcall.call0[Long](gdext.classes.AudioStream.mb_generate_sample, livePtr))
  }

  /** AudioStream.is_meta_stream */
  final def isMetaStream(): Boolean = {
    if (gdext.classes.AudioStream.mb_is_meta_stream == null) gdext.classes.AudioStream.mb_is_meta_stream = MethodBind.get("AudioStream", "is_meta_stream", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStream.mb_is_meta_stream, livePtr)
  }

}

object AudioStream {
  private[classes] var mb_get_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_monophonic: GDExtensionMethodBindPtr = null
  private[classes] var mb_instantiate_playback: GDExtensionMethodBindPtr = null
  private[classes] var mb_can_be_sampled: GDExtensionMethodBindPtr = null
  private[classes] var mb_generate_sample: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_meta_stream: GDExtensionMethodBindPtr = null
}
