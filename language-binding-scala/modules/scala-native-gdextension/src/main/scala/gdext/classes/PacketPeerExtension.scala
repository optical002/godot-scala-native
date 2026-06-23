package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PacketPeerExtension`, extends `PacketPeer`. */
abstract class PacketPeerExtension extends PacketPeer {

}

object PacketPeerExtension {
  /** Class metadata for Gd[PacketPeerExtension] lifetime management and casting. */
  given GodotClass[PacketPeerExtension] with {
    def className = "PacketPeerExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): PacketPeerExtension = new PacketPeerExtension {}.withHost(o.objectPtr)
    def unwrap(t: PacketPeerExtension): GodotObject = t.hostObject
  }
}
