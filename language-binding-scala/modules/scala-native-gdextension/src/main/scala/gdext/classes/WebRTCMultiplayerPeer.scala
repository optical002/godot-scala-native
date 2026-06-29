package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `WebRTCMultiplayerPeer`, extends `MultiplayerPeer`. */
abstract class WebRTCMultiplayerPeer extends MultiplayerPeer {
  override def godotClassName: String = "WebRTCMultiplayerPeer"

  /** WebRTCMultiplayerPeer.add_peer */
  final def addPeer(peer: WebRTCPeerConnection, peer_id: Long, unreliable_lifetime: Long): Long =
    Ptrcall.call3[GodotObject, Long, Long, Long](MethodBind.get("WebRTCMultiplayerPeer", "add_peer", 4078953270L), hostObject.objectPtr, peer.hostObject, peer_id, unreliable_lifetime)

  /** WebRTCMultiplayerPeer.remove_peer */
  final def removePeer(peer_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebRTCMultiplayerPeer", "remove_peer", 1286410249L), hostObject.objectPtr, peer_id)

  /** WebRTCMultiplayerPeer.has_peer */
  final def hasPeer(peer_id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("WebRTCMultiplayerPeer", "has_peer", 3067735520L), hostObject.objectPtr, peer_id)

}
