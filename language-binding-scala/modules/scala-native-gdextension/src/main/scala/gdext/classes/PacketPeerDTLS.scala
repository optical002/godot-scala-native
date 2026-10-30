package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PacketPeerDTLS`, extends `PacketPeer`. */
abstract class PacketPeerDTLS extends PacketPeer {
  override def godotClassName: String = "PacketPeerDTLS"

  /** PacketPeerDTLS.poll */
  final def poll(): Unit = {
    if (gdext.classes.PacketPeerDTLS.mb_poll == null) gdext.classes.PacketPeerDTLS.mb_poll = MethodBind.get("PacketPeerDTLS", "poll", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.PacketPeerDTLS.mb_poll, livePtr)
  }

  /** PacketPeerDTLS.connect_to_peer */
  final def connectToPeer(packetPeer: PacketPeerUDP, hostname: String, clientOptions: TLSOptions = null): gdext.classes.Error = {
    if (gdext.classes.PacketPeerDTLS.mb_connect_to_peer == null) gdext.classes.PacketPeerDTLS.mb_connect_to_peer = MethodBind.get("PacketPeerDTLS", "connect_to_peer", 2880188099L)
    gdext.classes.Error(Ptrcall.call3[GodotObject, String, GodotObject, Long](gdext.classes.PacketPeerDTLS.mb_connect_to_peer, livePtr, Wrappers.handle(packetPeer), hostname, Wrappers.handle(clientOptions)))
  }

  /** PacketPeerDTLS.get_status */
  final def getStatus(): gdext.classes.PacketPeerDTLS.Status = {
    if (gdext.classes.PacketPeerDTLS.mb_get_status == null) gdext.classes.PacketPeerDTLS.mb_get_status = MethodBind.get("PacketPeerDTLS", "get_status", 3248654679L)
    gdext.classes.PacketPeerDTLS.Status(Ptrcall.call0[Long](gdext.classes.PacketPeerDTLS.mb_get_status, livePtr))
  }

  /** PacketPeerDTLS.disconnect_from_peer */
  final def disconnectFromPeer(): Unit = {
    if (gdext.classes.PacketPeerDTLS.mb_disconnect_from_peer == null) gdext.classes.PacketPeerDTLS.mb_disconnect_from_peer = MethodBind.get("PacketPeerDTLS", "disconnect_from_peer", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.PacketPeerDTLS.mb_disconnect_from_peer, livePtr)
  }

}

object PacketPeerDTLS {
  private[classes] var mb_poll: GDExtensionMethodBindPtr = null
  private[classes] var mb_connect_to_peer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_status: GDExtensionMethodBindPtr = null
  private[classes] var mb_disconnect_from_peer: GDExtensionMethodBindPtr = null

  /** Godot enum `PacketPeerDTLS.Status`. */
  opaque type Status <: Long = Long

  object Status {
    final val Disconnected: Status = 0L.asInstanceOf[Status]
    final val Handshaking: Status = 1L.asInstanceOf[Status]
    final val Connected: Status = 2L.asInstanceOf[Status]
    final val Error: Status = 3L.asInstanceOf[Status]
    final val ErrorHostnameMismatch: Status = 4L.asInstanceOf[Status]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Status = value.asInstanceOf[Status]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Status] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[Status]]

    extension (self: Status)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disconnected"
        case 1L => "Handshaking"
        case 2L => "Connected"
        case 3L => "Error"
        case 4L => "ErrorHostnameMismatch"
        case other => other.toString
      }
  }
}
