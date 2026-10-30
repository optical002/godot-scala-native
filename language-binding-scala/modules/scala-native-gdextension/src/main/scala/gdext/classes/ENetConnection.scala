package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ENetConnection`, extends `RefCounted`. */
abstract class ENetConnection extends RefCounted {
  override def godotClassName: String = "ENetConnection"

  /** ENetConnection.create_host_bound */
  final def createHostBound(bindAddress: String, bindPort: Long, maxPeers: Long = 32L, maxChannels: Long = 0L, inBandwidth: Long = 0L, outBandwidth: Long = 0L): gdext.classes.Error = {
    if (gdext.classes.ENetConnection.mb_create_host_bound == null) gdext.classes.ENetConnection.mb_create_host_bound = MethodBind.get("ENetConnection", "create_host_bound", 1515002313L)
    gdext.classes.Error(Ptrcall.call6[String, Long, Long, Long, Long, Long, Long](gdext.classes.ENetConnection.mb_create_host_bound, livePtr, bindAddress, bindPort, maxPeers, maxChannels, inBandwidth, outBandwidth))
  }

  /** ENetConnection.create_host */
  final def createHost(maxPeers: Long = 32L, maxChannels: Long = 0L, inBandwidth: Long = 0L, outBandwidth: Long = 0L): gdext.classes.Error = {
    if (gdext.classes.ENetConnection.mb_create_host == null) gdext.classes.ENetConnection.mb_create_host = MethodBind.get("ENetConnection", "create_host", 117198950L)
    gdext.classes.Error(Ptrcall.call4[Long, Long, Long, Long, Long](gdext.classes.ENetConnection.mb_create_host, livePtr, maxPeers, maxChannels, inBandwidth, outBandwidth))
  }

  /** ENetConnection.destroy */
  final def destroy(): Unit = {
    if (gdext.classes.ENetConnection.mb_destroy == null) gdext.classes.ENetConnection.mb_destroy = MethodBind.get("ENetConnection", "destroy", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ENetConnection.mb_destroy, livePtr)
  }

  /** ENetConnection.connect_to_host. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def connectToHost(address: String, port: Long, channels: Long = 0L, data: Long = 0L): ENetPacketPeer = {
    if (gdext.classes.ENetConnection.mb_connect_to_host == null) gdext.classes.ENetConnection.mb_connect_to_host = MethodBind.get("ENetConnection", "connect_to_host", 2171300490L)
    Wrappers.owned[ENetPacketPeer](Ptrcall.call4[String, Long, Long, Long, Long](gdext.classes.ENetConnection.mb_connect_to_host, livePtr, address, port, channels, data))
  }

  /** ENetConnection.flush */
  final def flush(): Unit = {
    if (gdext.classes.ENetConnection.mb_flush == null) gdext.classes.ENetConnection.mb_flush = MethodBind.get("ENetConnection", "flush", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ENetConnection.mb_flush, livePtr)
  }

  /** ENetConnection.bandwidth_limit */
  final def bandwidthLimit(inBandwidth: Long = 0L, outBandwidth: Long = 0L): Unit = {
    if (gdext.classes.ENetConnection.mb_bandwidth_limit == null) gdext.classes.ENetConnection.mb_bandwidth_limit = MethodBind.get("ENetConnection", "bandwidth_limit", 2302169788L)
    Ptrcall.callVoid2(gdext.classes.ENetConnection.mb_bandwidth_limit, livePtr, inBandwidth, outBandwidth)
  }

  /** ENetConnection.channel_limit */
  final def channelLimit(limit: Long): Unit = {
    if (gdext.classes.ENetConnection.mb_channel_limit == null) gdext.classes.ENetConnection.mb_channel_limit = MethodBind.get("ENetConnection", "channel_limit", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ENetConnection.mb_channel_limit, livePtr, limit)
  }

  /** ENetConnection.compress */
  final def compress(mode: gdext.classes.ENetConnection.CompressionMode): Unit = {
    if (gdext.classes.ENetConnection.mb_compress == null) gdext.classes.ENetConnection.mb_compress = MethodBind.get("ENetConnection", "compress", 2660215187L)
    Ptrcall.callVoid1(gdext.classes.ENetConnection.mb_compress, livePtr, mode)
  }

  /** ENetConnection.dtls_server_setup */
  final def dtlsServerSetup(serverOptions: TLSOptions): gdext.classes.Error = {
    if (gdext.classes.ENetConnection.mb_dtls_server_setup == null) gdext.classes.ENetConnection.mb_dtls_server_setup = MethodBind.get("ENetConnection", "dtls_server_setup", 1262296096L)
    gdext.classes.Error(Ptrcall.call1[GodotObject, Long](gdext.classes.ENetConnection.mb_dtls_server_setup, livePtr, Wrappers.handle(serverOptions)))
  }

  /** ENetConnection.dtls_client_setup */
  final def dtlsClientSetup(hostname: String, clientOptions: TLSOptions = null): gdext.classes.Error = {
    if (gdext.classes.ENetConnection.mb_dtls_client_setup == null) gdext.classes.ENetConnection.mb_dtls_client_setup = MethodBind.get("ENetConnection", "dtls_client_setup", 1966198364L)
    gdext.classes.Error(Ptrcall.call2[String, GodotObject, Long](gdext.classes.ENetConnection.mb_dtls_client_setup, livePtr, hostname, Wrappers.handle(clientOptions)))
  }

  /** ENetConnection.refuse_new_connections */
  final def refuseNewConnections(refuse: Boolean): Unit = {
    if (gdext.classes.ENetConnection.mb_refuse_new_connections == null) gdext.classes.ENetConnection.mb_refuse_new_connections = MethodBind.get("ENetConnection", "refuse_new_connections", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ENetConnection.mb_refuse_new_connections, livePtr, refuse)
  }

  /** ENetConnection.pop_statistic */
  final def popStatistic(statistic: gdext.classes.ENetConnection.HostStatistic): Double = {
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

  /** Godot enum `ENetConnection.CompressionMode`. */
  opaque type CompressionMode <: Long = Long

  object CompressionMode {
    final val None: CompressionMode = 0L.asInstanceOf[CompressionMode]
    final val RangeCoder: CompressionMode = 1L.asInstanceOf[CompressionMode]
    final val Fastlz: CompressionMode = 2L.asInstanceOf[CompressionMode]
    final val Zlib: CompressionMode = 3L.asInstanceOf[CompressionMode]
    final val Zstd: CompressionMode = 4L.asInstanceOf[CompressionMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CompressionMode = value.asInstanceOf[CompressionMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CompressionMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[CompressionMode]]

    extension (self: CompressionMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "RangeCoder"
        case 2L => "Fastlz"
        case 3L => "Zlib"
        case 4L => "Zstd"
        case other => other.toString
      }
  }

  /** Godot enum `ENetConnection.EventType`. */
  opaque type EventType <: Long = Long

  object EventType {
    final val Error: EventType = -1L.asInstanceOf[EventType]
    final val None: EventType = 0L.asInstanceOf[EventType]
    final val Connect: EventType = 1L.asInstanceOf[EventType]
    final val Disconnect: EventType = 2L.asInstanceOf[EventType]
    final val Receive: EventType = 3L.asInstanceOf[EventType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EventType = value.asInstanceOf[EventType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EventType] = scala.IArray[Long](-1L, 0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[EventType]]

    extension (self: EventType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case -1L => "Error"
        case 0L => "None"
        case 1L => "Connect"
        case 2L => "Disconnect"
        case 3L => "Receive"
        case other => other.toString
      }
  }

  /** Godot enum `ENetConnection.HostStatistic`. */
  opaque type HostStatistic <: Long = Long

  object HostStatistic {
    final val SentData: HostStatistic = 0L.asInstanceOf[HostStatistic]
    final val SentPackets: HostStatistic = 1L.asInstanceOf[HostStatistic]
    final val ReceivedData: HostStatistic = 2L.asInstanceOf[HostStatistic]
    final val ReceivedPackets: HostStatistic = 3L.asInstanceOf[HostStatistic]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): HostStatistic = value.asInstanceOf[HostStatistic]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[HostStatistic] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[HostStatistic]]

    extension (self: HostStatistic)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "SentData"
        case 1L => "SentPackets"
        case 2L => "ReceivedData"
        case 3L => "ReceivedPackets"
        case other => other.toString
      }
  }
}
