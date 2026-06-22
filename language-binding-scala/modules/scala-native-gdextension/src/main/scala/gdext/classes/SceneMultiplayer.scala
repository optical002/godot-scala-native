package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SceneMultiplayer`, extends `MultiplayerAPI`. */
abstract class SceneMultiplayer extends MultiplayerAPI {

  /** SceneMultiplayer.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SceneMultiplayer", "clear", 3218959716L), hostObject.objectPtr)

  /** SceneMultiplayer.disconnect_peer */
  final def disconnectPeer(id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneMultiplayer", "disconnect_peer", 1286410249L), hostObject.objectPtr, id)

  /** SceneMultiplayer.complete_auth */
  final def completeAuth(id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SceneMultiplayer", "complete_auth", 844576869L), hostObject.objectPtr, id)

  /** SceneMultiplayer.set_auth_timeout */
  final def setAuthTimeout(timeout: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneMultiplayer", "set_auth_timeout", 373806689L), hostObject.objectPtr, timeout)

  /** SceneMultiplayer.get_auth_timeout */
  final def getAuthTimeout(): Double =
    Ptrcall.call0[Double](MethodBind.get("SceneMultiplayer", "get_auth_timeout", 1740695150L), hostObject.objectPtr)

  /** SceneMultiplayer.set_refuse_new_connections */
  final def setRefuseNewConnections(refuse: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneMultiplayer", "set_refuse_new_connections", 2586408642L), hostObject.objectPtr, refuse)

  /** SceneMultiplayer.is_refusing_new_connections */
  final def isRefusingNewConnections(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SceneMultiplayer", "is_refusing_new_connections", 36873697L), hostObject.objectPtr)

  /** SceneMultiplayer.set_allow_object_decoding */
  final def setAllowObjectDecoding(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneMultiplayer", "set_allow_object_decoding", 2586408642L), hostObject.objectPtr, enable)

  /** SceneMultiplayer.is_object_decoding_allowed */
  final def isObjectDecodingAllowed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SceneMultiplayer", "is_object_decoding_allowed", 36873697L), hostObject.objectPtr)

  /** SceneMultiplayer.set_server_relay_enabled */
  final def setServerRelayEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneMultiplayer", "set_server_relay_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** SceneMultiplayer.is_server_relay_enabled */
  final def isServerRelayEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SceneMultiplayer", "is_server_relay_enabled", 36873697L), hostObject.objectPtr)

  /** SceneMultiplayer.get_max_sync_packet_size */
  final def getMaxSyncPacketSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("SceneMultiplayer", "get_max_sync_packet_size", 3905245786L), hostObject.objectPtr)

  /** SceneMultiplayer.set_max_sync_packet_size */
  final def setMaxSyncPacketSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneMultiplayer", "set_max_sync_packet_size", 1286410249L), hostObject.objectPtr, size)

  /** SceneMultiplayer.get_max_delta_packet_size */
  final def getMaxDeltaPacketSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("SceneMultiplayer", "get_max_delta_packet_size", 3905245786L), hostObject.objectPtr)

  /** SceneMultiplayer.set_max_delta_packet_size */
  final def setMaxDeltaPacketSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneMultiplayer", "set_max_delta_packet_size", 1286410249L), hostObject.objectPtr, size)

}

object SceneMultiplayer {
  /** Class metadata for Gd[SceneMultiplayer] lifetime management and casting. */
  given GodotClass[SceneMultiplayer] with {
    def className = "SceneMultiplayer"
    def isRefCounted = true
    def wrap(o: GodotObject): SceneMultiplayer = new SceneMultiplayer {}.withHost(o.objectPtr)
    def unwrap(t: SceneMultiplayer): GodotObject = t.hostObject
  }
}
