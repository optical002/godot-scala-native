package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `MultiplayerPeerExtension`, extends `MultiplayerPeer`. */
abstract class MultiplayerPeerExtension extends MultiplayerPeer {

}

object MultiplayerPeerExtension {
  /** Class metadata for Gd[MultiplayerPeerExtension] lifetime management and casting. */
  given GodotClass[MultiplayerPeerExtension] with {
    def className = "MultiplayerPeerExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): MultiplayerPeerExtension = new MultiplayerPeerExtension {}.withHost(o.objectPtr)
    def unwrap(t: MultiplayerPeerExtension): GodotObject = t.hostObject
  }
}
