package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OggPacketSequencePlayback`, extends `RefCounted`. */
abstract class OggPacketSequencePlayback extends RefCounted {

}

object OggPacketSequencePlayback {
  /** Class metadata for Gd[OggPacketSequencePlayback] lifetime management and casting. */
  given GodotClass[OggPacketSequencePlayback] with {
    def className = "OggPacketSequencePlayback"
    def isRefCounted = true
    def wrap(o: GodotObject): OggPacketSequencePlayback = new OggPacketSequencePlayback {}.withHost(o.objectPtr)
    def unwrap(t: OggPacketSequencePlayback): GodotObject = t.hostObject
  }
}
