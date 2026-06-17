package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `MultiplayerAPI`, extends `RefCounted`. */
abstract class MultiplayerAPI extends RefCounted {

  /** MultiplayerAPI.has_multiplayer_peer */
  final def hasMultiplayerPeer(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MultiplayerAPI", "has_multiplayer_peer", 2240911060L), hostObject.objectPtr)

  /** MultiplayerAPI.get_multiplayer_peer */
  final def getMultiplayerPeer(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("MultiplayerAPI", "get_multiplayer_peer", 3223692825L), hostObject.objectPtr)

  /** MultiplayerAPI.set_multiplayer_peer */
  final def setMultiplayerPeer(peer: MultiplayerPeer): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiplayerAPI", "set_multiplayer_peer", 3694835298L), hostObject.objectPtr, peer.hostObject)

  /** MultiplayerAPI.get_unique_id */
  final def getUniqueId(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiplayerAPI", "get_unique_id", 2455072627L), hostObject.objectPtr)

  /** MultiplayerAPI.is_server */
  final def isServer(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MultiplayerAPI", "is_server", 2240911060L), hostObject.objectPtr)

  /** MultiplayerAPI.get_remote_sender_id */
  final def getRemoteSenderId(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiplayerAPI", "get_remote_sender_id", 2455072627L), hostObject.objectPtr)

  /** MultiplayerAPI.poll */
  final def poll(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiplayerAPI", "poll", 166280745L), hostObject.objectPtr)

}

object MultiplayerAPI {
  /** Class metadata for Gd[MultiplayerAPI] lifetime management and casting. */
  given GodotClass[MultiplayerAPI] with {
    def className = "MultiplayerAPI"
    def isRefCounted = true
    def wrap(o: GodotObject): MultiplayerAPI = new MultiplayerAPI {}.withHost(o.objectPtr)
    def unwrap(t: MultiplayerAPI): GodotObject = t.hostObject
  }
}
