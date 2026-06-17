package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ENetConnection`, extends `RefCounted`. */
abstract class ENetConnection extends RefCounted {

  /** ENetConnection.create_host_bound */
  final def createHostBound(bind_address: String, bind_port: Long, max_peers: Long, max_channels: Long, in_bandwidth: Long, out_bandwidth: Long): Long =
    Ptrcall.call6[String, Long, Long, Long, Long, Long, Long](MethodBind.get("ENetConnection", "create_host_bound", 1515002313L), hostObject.objectPtr, bind_address, bind_port, max_peers, max_channels, in_bandwidth, out_bandwidth)

  /** ENetConnection.create_host */
  final def createHost(max_peers: Long, max_channels: Long, in_bandwidth: Long, out_bandwidth: Long): Long =
    Ptrcall.call4[Long, Long, Long, Long, Long](MethodBind.get("ENetConnection", "create_host", 117198950L), hostObject.objectPtr, max_peers, max_channels, in_bandwidth, out_bandwidth)

  /** ENetConnection.destroy */
  final def destroy(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ENetConnection", "destroy", 3218959716L), hostObject.objectPtr)

  /** ENetConnection.connect_to_host */
  final def connectToHost(address: String, port: Long, channels: Long, data: Long): GodotObject =
    Ptrcall.call4[String, Long, Long, Long, GodotObject](MethodBind.get("ENetConnection", "connect_to_host", 2171300490L), hostObject.objectPtr, address, port, channels, data)

  /** ENetConnection.flush */
  final def flush(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ENetConnection", "flush", 3218959716L), hostObject.objectPtr)

  /** ENetConnection.bandwidth_limit */
  final def bandwidthLimit(in_bandwidth: Long, out_bandwidth: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("ENetConnection", "bandwidth_limit", 2302169788L), hostObject.objectPtr, in_bandwidth, out_bandwidth)

  /** ENetConnection.channel_limit */
  final def channelLimit(limit: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ENetConnection", "channel_limit", 1286410249L), hostObject.objectPtr, limit)

  /** ENetConnection.compress */
  final def compress(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ENetConnection", "compress", 2660215187L), hostObject.objectPtr, mode)

  /** ENetConnection.dtls_server_setup */
  final def dtlsServerSetup(server_options: TLSOptions): Long =
    Ptrcall.call1[GodotObject, Long](MethodBind.get("ENetConnection", "dtls_server_setup", 1262296096L), hostObject.objectPtr, server_options.hostObject)

  /** ENetConnection.dtls_client_setup */
  final def dtlsClientSetup(hostname: String, client_options: TLSOptions): Long =
    Ptrcall.call2[String, GodotObject, Long](MethodBind.get("ENetConnection", "dtls_client_setup", 1966198364L), hostObject.objectPtr, hostname, client_options.hostObject)

  /** ENetConnection.refuse_new_connections */
  final def refuseNewConnections(refuse: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ENetConnection", "refuse_new_connections", 2586408642L), hostObject.objectPtr, refuse)

  /** ENetConnection.pop_statistic */
  final def popStatistic(statistic: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("ENetConnection", "pop_statistic", 2166904170L), hostObject.objectPtr, statistic)

  /** ENetConnection.get_max_channels */
  final def getMaxChannels(): Long =
    Ptrcall.call0[Long](MethodBind.get("ENetConnection", "get_max_channels", 3905245786L), hostObject.objectPtr)

  /** ENetConnection.get_local_port */
  final def getLocalPort(): Long =
    Ptrcall.call0[Long](MethodBind.get("ENetConnection", "get_local_port", 3905245786L), hostObject.objectPtr)

}

object ENetConnection {
  /** Class metadata for Gd[ENetConnection] lifetime management and casting. */
  given GodotClass[ENetConnection] with {
    def className = "ENetConnection"
    def isRefCounted = true
    def wrap(o: GodotObject): ENetConnection = new ENetConnection {}.withHost(o.objectPtr)
    def unwrap(t: ENetConnection): GodotObject = t.hostObject
  }
}
