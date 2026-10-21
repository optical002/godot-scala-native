package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ENetPacketPeer`, extends `PacketPeer`. */
abstract class ENetPacketPeer extends PacketPeer {
  override def godotClassName: String = "ENetPacketPeer"

  /** ENetPacketPeer.peer_disconnect */
  final def peerDisconnect(data: Long): Unit = {
    if (gdext.classes.ENetPacketPeer.mb_peer_disconnect == null) gdext.classes.ENetPacketPeer.mb_peer_disconnect = MethodBind.get("ENetPacketPeer", "peer_disconnect", 1995695955L)
    Ptrcall.callVoid1(gdext.classes.ENetPacketPeer.mb_peer_disconnect, livePtr, data)
  }

  /** ENetPacketPeer.peer_disconnect_later */
  final def peerDisconnectLater(data: Long): Unit = {
    if (gdext.classes.ENetPacketPeer.mb_peer_disconnect_later == null) gdext.classes.ENetPacketPeer.mb_peer_disconnect_later = MethodBind.get("ENetPacketPeer", "peer_disconnect_later", 1995695955L)
    Ptrcall.callVoid1(gdext.classes.ENetPacketPeer.mb_peer_disconnect_later, livePtr, data)
  }

  /** ENetPacketPeer.peer_disconnect_now */
  final def peerDisconnectNow(data: Long): Unit = {
    if (gdext.classes.ENetPacketPeer.mb_peer_disconnect_now == null) gdext.classes.ENetPacketPeer.mb_peer_disconnect_now = MethodBind.get("ENetPacketPeer", "peer_disconnect_now", 1995695955L)
    Ptrcall.callVoid1(gdext.classes.ENetPacketPeer.mb_peer_disconnect_now, livePtr, data)
  }

  /** ENetPacketPeer.ping */
  final def ping(): Unit = {
    if (gdext.classes.ENetPacketPeer.mb_ping == null) gdext.classes.ENetPacketPeer.mb_ping = MethodBind.get("ENetPacketPeer", "ping", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ENetPacketPeer.mb_ping, livePtr)
  }

  /** ENetPacketPeer.ping_interval */
  final def pingInterval(ping_interval: Long): Unit = {
    if (gdext.classes.ENetPacketPeer.mb_ping_interval == null) gdext.classes.ENetPacketPeer.mb_ping_interval = MethodBind.get("ENetPacketPeer", "ping_interval", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ENetPacketPeer.mb_ping_interval, livePtr, ping_interval)
  }

  /** ENetPacketPeer.reset */
  final def reset(): Unit = {
    if (gdext.classes.ENetPacketPeer.mb_reset == null) gdext.classes.ENetPacketPeer.mb_reset = MethodBind.get("ENetPacketPeer", "reset", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ENetPacketPeer.mb_reset, livePtr)
  }

  /** ENetPacketPeer.throttle_configure */
  final def throttleConfigure(interval: Long, acceleration: Long, deceleration: Long): Unit = {
    if (gdext.classes.ENetPacketPeer.mb_throttle_configure == null) gdext.classes.ENetPacketPeer.mb_throttle_configure = MethodBind.get("ENetPacketPeer", "throttle_configure", 1649997291L)
    Ptrcall.callVoid3(gdext.classes.ENetPacketPeer.mb_throttle_configure, livePtr, interval, acceleration, deceleration)
  }

  /** ENetPacketPeer.set_timeout */
  final def setTimeout(timeout: Long, timeout_min: Long, timeout_max: Long): Unit = {
    if (gdext.classes.ENetPacketPeer.mb_set_timeout == null) gdext.classes.ENetPacketPeer.mb_set_timeout = MethodBind.get("ENetPacketPeer", "set_timeout", 1649997291L)
    Ptrcall.callVoid3(gdext.classes.ENetPacketPeer.mb_set_timeout, livePtr, timeout, timeout_min, timeout_max)
  }

  /** ENetPacketPeer.get_packet_flags */
  final def getPacketFlags(): Long = {
    if (gdext.classes.ENetPacketPeer.mb_get_packet_flags == null) gdext.classes.ENetPacketPeer.mb_get_packet_flags = MethodBind.get("ENetPacketPeer", "get_packet_flags", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ENetPacketPeer.mb_get_packet_flags, livePtr)
  }

  /** ENetPacketPeer.get_remote_address */
  final def getRemoteAddress(): String = {
    if (gdext.classes.ENetPacketPeer.mb_get_remote_address == null) gdext.classes.ENetPacketPeer.mb_get_remote_address = MethodBind.get("ENetPacketPeer", "get_remote_address", 201670096L)
    Ptrcall.call0[String](gdext.classes.ENetPacketPeer.mb_get_remote_address, livePtr)
  }

  /** ENetPacketPeer.get_remote_port */
  final def getRemotePort(): Long = {
    if (gdext.classes.ENetPacketPeer.mb_get_remote_port == null) gdext.classes.ENetPacketPeer.mb_get_remote_port = MethodBind.get("ENetPacketPeer", "get_remote_port", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ENetPacketPeer.mb_get_remote_port, livePtr)
  }

  /** ENetPacketPeer.get_statistic */
  final def getStatistic(statistic: Long): Double = {
    if (gdext.classes.ENetPacketPeer.mb_get_statistic == null) gdext.classes.ENetPacketPeer.mb_get_statistic = MethodBind.get("ENetPacketPeer", "get_statistic", 1642578323L)
    Ptrcall.call1[Long, Double](gdext.classes.ENetPacketPeer.mb_get_statistic, livePtr, statistic)
  }

  /** ENetPacketPeer.get_state */
  final def getState(): Long = {
    if (gdext.classes.ENetPacketPeer.mb_get_state == null) gdext.classes.ENetPacketPeer.mb_get_state = MethodBind.get("ENetPacketPeer", "get_state", 711068532L)
    Ptrcall.call0[Long](gdext.classes.ENetPacketPeer.mb_get_state, livePtr)
  }

  /** ENetPacketPeer.get_channels */
  final def getChannels(): Long = {
    if (gdext.classes.ENetPacketPeer.mb_get_channels == null) gdext.classes.ENetPacketPeer.mb_get_channels = MethodBind.get("ENetPacketPeer", "get_channels", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ENetPacketPeer.mb_get_channels, livePtr)
  }

  /** ENetPacketPeer.is_active */
  final def isActive(): Boolean = {
    if (gdext.classes.ENetPacketPeer.mb_is_active == null) gdext.classes.ENetPacketPeer.mb_is_active = MethodBind.get("ENetPacketPeer", "is_active", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ENetPacketPeer.mb_is_active, livePtr)
  }

}

object ENetPacketPeer {
  private[classes] var mb_peer_disconnect: GDExtensionMethodBindPtr = null
  private[classes] var mb_peer_disconnect_later: GDExtensionMethodBindPtr = null
  private[classes] var mb_peer_disconnect_now: GDExtensionMethodBindPtr = null
  private[classes] var mb_ping: GDExtensionMethodBindPtr = null
  private[classes] var mb_ping_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset: GDExtensionMethodBindPtr = null
  private[classes] var mb_throttle_configure: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_timeout: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_packet_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_remote_address: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_remote_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_statistic: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_channels: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_active: GDExtensionMethodBindPtr = null
}
