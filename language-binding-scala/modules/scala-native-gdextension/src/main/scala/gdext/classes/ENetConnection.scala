package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ENetConnection`, extends `RefCounted`. */
abstract class ENetConnection extends RefCounted {
  override def godotClassName: String = "ENetConnection"

  /** ENetConnection.create_host_bound */
  final def createHostBound(bind_address: String, bind_port: Long, max_peers: Long, max_channels: Long, in_bandwidth: Long, out_bandwidth: Long): Long = {
    if (gdext.classes.ENetConnection.mb_create_host_bound == null) gdext.classes.ENetConnection.mb_create_host_bound = MethodBind.get("ENetConnection", "create_host_bound", 1515002313L)
    Ptrcall.call6[String, Long, Long, Long, Long, Long, Long](gdext.classes.ENetConnection.mb_create_host_bound, livePtr, bind_address, bind_port, max_peers, max_channels, in_bandwidth, out_bandwidth)
  }

  /** ENetConnection.create_host */
  final def createHost(max_peers: Long, max_channels: Long, in_bandwidth: Long, out_bandwidth: Long): Long = {
    if (gdext.classes.ENetConnection.mb_create_host == null) gdext.classes.ENetConnection.mb_create_host = MethodBind.get("ENetConnection", "create_host", 117198950L)
    Ptrcall.call4[Long, Long, Long, Long, Long](gdext.classes.ENetConnection.mb_create_host, livePtr, max_peers, max_channels, in_bandwidth, out_bandwidth)
  }

  /** ENetConnection.destroy */
  final def destroy(): Unit = {
    if (gdext.classes.ENetConnection.mb_destroy == null) gdext.classes.ENetConnection.mb_destroy = MethodBind.get("ENetConnection", "destroy", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ENetConnection.mb_destroy, livePtr)
  }

  /** ENetConnection.connect_to_host. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def connectToHost(address: String, port: Long, channels: Long, data: Long): ENetPacketPeer = {
    if (gdext.classes.ENetConnection.mb_connect_to_host == null) gdext.classes.ENetConnection.mb_connect_to_host = MethodBind.get("ENetConnection", "connect_to_host", 2171300490L)
    Wrappers.owned[ENetPacketPeer](Ptrcall.call4[String, Long, Long, Long, Long](gdext.classes.ENetConnection.mb_connect_to_host, livePtr, address, port, channels, data))
  }

  /** ENetConnection.flush */
  final def flush(): Unit = {
    if (gdext.classes.ENetConnection.mb_flush == null) gdext.classes.ENetConnection.mb_flush = MethodBind.get("ENetConnection", "flush", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ENetConnection.mb_flush, livePtr)
  }

  /** ENetConnection.bandwidth_limit */
  final def bandwidthLimit(in_bandwidth: Long, out_bandwidth: Long): Unit = {
    if (gdext.classes.ENetConnection.mb_bandwidth_limit == null) gdext.classes.ENetConnection.mb_bandwidth_limit = MethodBind.get("ENetConnection", "bandwidth_limit", 2302169788L)
    Ptrcall.callVoid2(gdext.classes.ENetConnection.mb_bandwidth_limit, livePtr, in_bandwidth, out_bandwidth)
  }

  /** ENetConnection.channel_limit */
  final def channelLimit(limit: Long): Unit = {
    if (gdext.classes.ENetConnection.mb_channel_limit == null) gdext.classes.ENetConnection.mb_channel_limit = MethodBind.get("ENetConnection", "channel_limit", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ENetConnection.mb_channel_limit, livePtr, limit)
  }

  /** ENetConnection.compress */
  final def compress(mode: Long): Unit = {
    if (gdext.classes.ENetConnection.mb_compress == null) gdext.classes.ENetConnection.mb_compress = MethodBind.get("ENetConnection", "compress", 2660215187L)
    Ptrcall.callVoid1(gdext.classes.ENetConnection.mb_compress, livePtr, mode)
  }

  /** ENetConnection.dtls_server_setup */
  final def dtlsServerSetup(server_options: TLSOptions): Long = {
    if (gdext.classes.ENetConnection.mb_dtls_server_setup == null) gdext.classes.ENetConnection.mb_dtls_server_setup = MethodBind.get("ENetConnection", "dtls_server_setup", 1262296096L)
    Ptrcall.call1[GodotObject, Long](gdext.classes.ENetConnection.mb_dtls_server_setup, livePtr, Wrappers.handle(server_options))
  }

  /** ENetConnection.dtls_client_setup */
  final def dtlsClientSetup(hostname: String, client_options: TLSOptions): Long = {
    if (gdext.classes.ENetConnection.mb_dtls_client_setup == null) gdext.classes.ENetConnection.mb_dtls_client_setup = MethodBind.get("ENetConnection", "dtls_client_setup", 1966198364L)
    Ptrcall.call2[String, GodotObject, Long](gdext.classes.ENetConnection.mb_dtls_client_setup, livePtr, hostname, Wrappers.handle(client_options))
  }

  /** ENetConnection.refuse_new_connections */
  final def refuseNewConnections(refuse: Boolean): Unit = {
    if (gdext.classes.ENetConnection.mb_refuse_new_connections == null) gdext.classes.ENetConnection.mb_refuse_new_connections = MethodBind.get("ENetConnection", "refuse_new_connections", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ENetConnection.mb_refuse_new_connections, livePtr, refuse)
  }

  /** ENetConnection.pop_statistic */
  final def popStatistic(statistic: Long): Double = {
    if (gdext.classes.ENetConnection.mb_pop_statistic == null) gdext.classes.ENetConnection.mb_pop_statistic = MethodBind.get("ENetConnection", "pop_statistic", 2166904170L)
    Ptrcall.call1[Long, Double](gdext.classes.ENetConnection.mb_pop_statistic, livePtr, statistic)
  }

  /** ENetConnection.get_max_channels */
  final def getMaxChannels(): Long = {
    if (gdext.classes.ENetConnection.mb_get_max_channels == null) gdext.classes.ENetConnection.mb_get_max_channels = MethodBind.get("ENetConnection", "get_max_channels", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ENetConnection.mb_get_max_channels, livePtr)
  }

  /** ENetConnection.get_local_port */
  final def getLocalPort(): Long = {
    if (gdext.classes.ENetConnection.mb_get_local_port == null) gdext.classes.ENetConnection.mb_get_local_port = MethodBind.get("ENetConnection", "get_local_port", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ENetConnection.mb_get_local_port, livePtr)
  }

}

object ENetConnection {
  private[classes] var mb_create_host_bound: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_host: GDExtensionMethodBindPtr = null
  private[classes] var mb_destroy: GDExtensionMethodBindPtr = null
  private[classes] var mb_connect_to_host: GDExtensionMethodBindPtr = null
  private[classes] var mb_flush: GDExtensionMethodBindPtr = null
  private[classes] var mb_bandwidth_limit: GDExtensionMethodBindPtr = null
  private[classes] var mb_channel_limit: GDExtensionMethodBindPtr = null
  private[classes] var mb_compress: GDExtensionMethodBindPtr = null
  private[classes] var mb_dtls_server_setup: GDExtensionMethodBindPtr = null
  private[classes] var mb_dtls_client_setup: GDExtensionMethodBindPtr = null
  private[classes] var mb_refuse_new_connections: GDExtensionMethodBindPtr = null
  private[classes] var mb_pop_statistic: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_channels: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_local_port: GDExtensionMethodBindPtr = null
}
