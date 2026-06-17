package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ENetPacketPeer`, extends `PacketPeer`. */
abstract class ENetPacketPeer extends PacketPeer {

  /** ENetPacketPeer.peer_disconnect */
  final def peerDisconnect(data: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ENetPacketPeer", "peer_disconnect", 1995695955L), hostObject.objectPtr, data)

  /** ENetPacketPeer.peer_disconnect_later */
  final def peerDisconnectLater(data: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ENetPacketPeer", "peer_disconnect_later", 1995695955L), hostObject.objectPtr, data)

  /** ENetPacketPeer.peer_disconnect_now */
  final def peerDisconnectNow(data: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ENetPacketPeer", "peer_disconnect_now", 1995695955L), hostObject.objectPtr, data)

  /** ENetPacketPeer.ping */
  final def ping(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ENetPacketPeer", "ping", 3218959716L), hostObject.objectPtr)

  /** ENetPacketPeer.ping_interval */
  final def pingInterval(ping_interval: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ENetPacketPeer", "ping_interval", 1286410249L), hostObject.objectPtr, ping_interval)

  /** ENetPacketPeer.reset */
  final def reset(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ENetPacketPeer", "reset", 3218959716L), hostObject.objectPtr)

  /** ENetPacketPeer.throttle_configure */
  final def throttleConfigure(interval: Long, acceleration: Long, deceleration: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("ENetPacketPeer", "throttle_configure", 1649997291L), hostObject.objectPtr, interval, acceleration, deceleration)

  /** ENetPacketPeer.set_timeout */
  final def setTimeout(timeout: Long, timeout_min: Long, timeout_max: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("ENetPacketPeer", "set_timeout", 1649997291L), hostObject.objectPtr, timeout, timeout_min, timeout_max)

  /** ENetPacketPeer.get_packet_flags */
  final def getPacketFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("ENetPacketPeer", "get_packet_flags", 3905245786L), hostObject.objectPtr)

  /** ENetPacketPeer.get_remote_address */
  final def getRemoteAddress(): String =
    Ptrcall.call0[String](MethodBind.get("ENetPacketPeer", "get_remote_address", 201670096L), hostObject.objectPtr)

  /** ENetPacketPeer.get_remote_port */
  final def getRemotePort(): Long =
    Ptrcall.call0[Long](MethodBind.get("ENetPacketPeer", "get_remote_port", 3905245786L), hostObject.objectPtr)

  /** ENetPacketPeer.get_statistic */
  final def getStatistic(statistic: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("ENetPacketPeer", "get_statistic", 1642578323L), hostObject.objectPtr, statistic)

  /** ENetPacketPeer.get_state */
  final def getState(): Long =
    Ptrcall.call0[Long](MethodBind.get("ENetPacketPeer", "get_state", 711068532L), hostObject.objectPtr)

  /** ENetPacketPeer.get_channels */
  final def getChannels(): Long =
    Ptrcall.call0[Long](MethodBind.get("ENetPacketPeer", "get_channels", 3905245786L), hostObject.objectPtr)

  /** ENetPacketPeer.is_active */
  final def isActive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ENetPacketPeer", "is_active", 36873697L), hostObject.objectPtr)

}

object ENetPacketPeer {
  /** Class metadata for Gd[ENetPacketPeer] lifetime management and casting. */
  given GodotClass[ENetPacketPeer] with {
    def className = "ENetPacketPeer"
    def isRefCounted = true
    def wrap(o: GodotObject): ENetPacketPeer = new ENetPacketPeer {}.withHost(o.objectPtr)
    def unwrap(t: ENetPacketPeer): GodotObject = t.hostObject
  }
}
