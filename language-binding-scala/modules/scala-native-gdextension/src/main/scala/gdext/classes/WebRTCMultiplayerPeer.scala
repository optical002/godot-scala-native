package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `WebRTCMultiplayerPeer`, extends `MultiplayerPeer`. */
abstract class WebRTCMultiplayerPeer extends MultiplayerPeer {
  override def godotClassName: String = "WebRTCMultiplayerPeer"

  /** WebRTCMultiplayerPeer.add_peer */
  final def addPeer(peer: WebRTCPeerConnection, peer_id: Long, unreliable_lifetime: Long): Long = {
    if (gdext.classes.WebRTCMultiplayerPeer.mb_add_peer == null) gdext.classes.WebRTCMultiplayerPeer.mb_add_peer = MethodBind.get("WebRTCMultiplayerPeer", "add_peer", 4078953270L)
    Ptrcall.call3[GodotObject, Long, Long, Long](gdext.classes.WebRTCMultiplayerPeer.mb_add_peer, livePtr, Wrappers.handle(peer), peer_id, unreliable_lifetime)
  }

  /** WebRTCMultiplayerPeer.remove_peer */
  final def removePeer(peer_id: Long): Unit = {
    if (gdext.classes.WebRTCMultiplayerPeer.mb_remove_peer == null) gdext.classes.WebRTCMultiplayerPeer.mb_remove_peer = MethodBind.get("WebRTCMultiplayerPeer", "remove_peer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.WebRTCMultiplayerPeer.mb_remove_peer, livePtr, peer_id)
  }

  /** WebRTCMultiplayerPeer.has_peer */
  final def hasPeer(peer_id: Long): Boolean = {
    if (gdext.classes.WebRTCMultiplayerPeer.mb_has_peer == null) gdext.classes.WebRTCMultiplayerPeer.mb_has_peer = MethodBind.get("WebRTCMultiplayerPeer", "has_peer", 3067735520L)
    Ptrcall.call1[Long, Boolean](gdext.classes.WebRTCMultiplayerPeer.mb_has_peer, livePtr, peer_id)
  }

}

object WebRTCMultiplayerPeer {
  private[classes] var mb_add_peer: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_peer: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_peer: GDExtensionMethodBindPtr = null
}
