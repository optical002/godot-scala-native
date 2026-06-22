package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `StreamPeerExtension`, extends `StreamPeer`. */
abstract class StreamPeerExtension extends StreamPeer {

}

object StreamPeerExtension {
  /** Class metadata for Gd[StreamPeerExtension] lifetime management and casting. */
  given GodotClass[StreamPeerExtension] with {
    def className = "StreamPeerExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): StreamPeerExtension = new StreamPeerExtension {}.withHost(o.objectPtr)
    def unwrap(t: StreamPeerExtension): GodotObject = t.hostObject
  }
}
