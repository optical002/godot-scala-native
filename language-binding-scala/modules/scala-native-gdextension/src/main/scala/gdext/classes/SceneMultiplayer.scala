package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SceneMultiplayer`, extends `MultiplayerAPI`. */
abstract class SceneMultiplayer extends MultiplayerAPI {
  override def godotClassName: String = "SceneMultiplayer"

  /** SceneMultiplayer.clear */
  final def clear(): Unit = {
    if (gdext.classes.SceneMultiplayer.mb_clear == null) gdext.classes.SceneMultiplayer.mb_clear = MethodBind.get("SceneMultiplayer", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SceneMultiplayer.mb_clear, livePtr)
  }

  /** SceneMultiplayer.disconnect_peer */
  final def disconnectPeer(id: Long): Unit = {
    if (gdext.classes.SceneMultiplayer.mb_disconnect_peer == null) gdext.classes.SceneMultiplayer.mb_disconnect_peer = MethodBind.get("SceneMultiplayer", "disconnect_peer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SceneMultiplayer.mb_disconnect_peer, livePtr, id)
  }

  /** SceneMultiplayer.complete_auth */
  final def completeAuth(id: Long): gdext.classes.Error = {
    if (gdext.classes.SceneMultiplayer.mb_complete_auth == null) gdext.classes.SceneMultiplayer.mb_complete_auth = MethodBind.get("SceneMultiplayer", "complete_auth", 844576869L)
    gdext.classes.Error(Ptrcall.call1[Long, Long](gdext.classes.SceneMultiplayer.mb_complete_auth, livePtr, id))
  }

  /** SceneMultiplayer.set_auth_timeout */
  final def setAuthTimeout(timeout: Double): Unit = {
    if (gdext.classes.SceneMultiplayer.mb_set_auth_timeout == null) gdext.classes.SceneMultiplayer.mb_set_auth_timeout = MethodBind.get("SceneMultiplayer", "set_auth_timeout", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SceneMultiplayer.mb_set_auth_timeout, livePtr, timeout)
  }

  /** SceneMultiplayer.get_auth_timeout */
  final def getAuthTimeout(): Double = {
    if (gdext.classes.SceneMultiplayer.mb_get_auth_timeout == null) gdext.classes.SceneMultiplayer.mb_get_auth_timeout = MethodBind.get("SceneMultiplayer", "get_auth_timeout", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SceneMultiplayer.mb_get_auth_timeout, livePtr)
  }

  /** SceneMultiplayer.set_refuse_new_connections */
  final def setRefuseNewConnections(refuse: Boolean): Unit = {
    if (gdext.classes.SceneMultiplayer.mb_set_refuse_new_connections == null) gdext.classes.SceneMultiplayer.mb_set_refuse_new_connections = MethodBind.get("SceneMultiplayer", "set_refuse_new_connections", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SceneMultiplayer.mb_set_refuse_new_connections, livePtr, refuse)
  }

  /** SceneMultiplayer.is_refusing_new_connections */
  final def isRefusingNewConnections(): Boolean = {
    if (gdext.classes.SceneMultiplayer.mb_is_refusing_new_connections == null) gdext.classes.SceneMultiplayer.mb_is_refusing_new_connections = MethodBind.get("SceneMultiplayer", "is_refusing_new_connections", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SceneMultiplayer.mb_is_refusing_new_connections, livePtr)
  }

  /** SceneMultiplayer.set_allow_object_decoding */
  final def setAllowObjectDecoding(enable: Boolean): Unit = {
    if (gdext.classes.SceneMultiplayer.mb_set_allow_object_decoding == null) gdext.classes.SceneMultiplayer.mb_set_allow_object_decoding = MethodBind.get("SceneMultiplayer", "set_allow_object_decoding", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SceneMultiplayer.mb_set_allow_object_decoding, livePtr, enable)
  }

  /** SceneMultiplayer.is_object_decoding_allowed */
  final def isObjectDecodingAllowed(): Boolean = {
    if (gdext.classes.SceneMultiplayer.mb_is_object_decoding_allowed == null) gdext.classes.SceneMultiplayer.mb_is_object_decoding_allowed = MethodBind.get("SceneMultiplayer", "is_object_decoding_allowed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SceneMultiplayer.mb_is_object_decoding_allowed, livePtr)
  }

  /** SceneMultiplayer.set_server_relay_enabled */
  final def setServerRelayEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.SceneMultiplayer.mb_set_server_relay_enabled == null) gdext.classes.SceneMultiplayer.mb_set_server_relay_enabled = MethodBind.get("SceneMultiplayer", "set_server_relay_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SceneMultiplayer.mb_set_server_relay_enabled, livePtr, enabled)
  }

  /** SceneMultiplayer.is_server_relay_enabled */
  final def isServerRelayEnabled(): Boolean = {
    if (gdext.classes.SceneMultiplayer.mb_is_server_relay_enabled == null) gdext.classes.SceneMultiplayer.mb_is_server_relay_enabled = MethodBind.get("SceneMultiplayer", "is_server_relay_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SceneMultiplayer.mb_is_server_relay_enabled, livePtr)
  }

  /** SceneMultiplayer.get_max_sync_packet_size */
  final def getMaxSyncPacketSize(): Long = {
    if (gdext.classes.SceneMultiplayer.mb_get_max_sync_packet_size == null) gdext.classes.SceneMultiplayer.mb_get_max_sync_packet_size = MethodBind.get("SceneMultiplayer", "get_max_sync_packet_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SceneMultiplayer.mb_get_max_sync_packet_size, livePtr)
  }

  /** SceneMultiplayer.set_max_sync_packet_size */
  final def setMaxSyncPacketSize(size: Long): Unit = {
    if (gdext.classes.SceneMultiplayer.mb_set_max_sync_packet_size == null) gdext.classes.SceneMultiplayer.mb_set_max_sync_packet_size = MethodBind.get("SceneMultiplayer", "set_max_sync_packet_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SceneMultiplayer.mb_set_max_sync_packet_size, livePtr, size)
  }

  /** SceneMultiplayer.get_max_delta_packet_size */
  final def getMaxDeltaPacketSize(): Long = {
    if (gdext.classes.SceneMultiplayer.mb_get_max_delta_packet_size == null) gdext.classes.SceneMultiplayer.mb_get_max_delta_packet_size = MethodBind.get("SceneMultiplayer", "get_max_delta_packet_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SceneMultiplayer.mb_get_max_delta_packet_size, livePtr)
  }

  /** SceneMultiplayer.set_max_delta_packet_size */
  final def setMaxDeltaPacketSize(size: Long): Unit = {
    if (gdext.classes.SceneMultiplayer.mb_set_max_delta_packet_size == null) gdext.classes.SceneMultiplayer.mb_set_max_delta_packet_size = MethodBind.get("SceneMultiplayer", "set_max_delta_packet_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SceneMultiplayer.mb_set_max_delta_packet_size, livePtr, size)
  }

}

object SceneMultiplayer {
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_disconnect_peer: GDExtensionMethodBindPtr = null
  private[classes] var mb_complete_auth: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auth_timeout: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_auth_timeout: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_refuse_new_connections: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_refusing_new_connections: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_object_decoding: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_object_decoding_allowed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_server_relay_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_server_relay_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_sync_packet_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_sync_packet_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_delta_packet_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_delta_packet_size: GDExtensionMethodBindPtr = null
}
