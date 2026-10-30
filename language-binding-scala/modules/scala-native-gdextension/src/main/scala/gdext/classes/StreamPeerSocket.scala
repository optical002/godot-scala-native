package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `StreamPeerSocket`, extends `StreamPeer`. */
abstract class StreamPeerSocket extends StreamPeer {
  override def godotClassName: String = "StreamPeerSocket"

  /** StreamPeerSocket.poll */
  final def poll(): gdext.classes.Error = {
    if (gdext.classes.StreamPeerSocket.mb_poll == null) gdext.classes.StreamPeerSocket.mb_poll = MethodBind.get("StreamPeerSocket", "poll", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.StreamPeerSocket.mb_poll, livePtr))
  }

  /** StreamPeerSocket.get_status */
  final def getStatus(): gdext.classes.StreamPeerSocket.Status = {
    if (gdext.classes.StreamPeerSocket.mb_get_status == null) gdext.classes.StreamPeerSocket.mb_get_status = MethodBind.get("StreamPeerSocket", "get_status", 1156122502L)
    gdext.classes.StreamPeerSocket.Status(Ptrcall.call0[Long](gdext.classes.StreamPeerSocket.mb_get_status, livePtr))
  }

  /** StreamPeerSocket.disconnect_from_host */
  final def disconnectFromHost(): Unit = {
    if (gdext.classes.StreamPeerSocket.mb_disconnect_from_host == null) gdext.classes.StreamPeerSocket.mb_disconnect_from_host = MethodBind.get("StreamPeerSocket", "disconnect_from_host", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.StreamPeerSocket.mb_disconnect_from_host, livePtr)
  }

}

object StreamPeerSocket {
  private[classes] var mb_poll: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_status: GDExtensionMethodBindPtr = null
  private[classes] var mb_disconnect_from_host: GDExtensionMethodBindPtr = null

  /** Godot enum `StreamPeerSocket.Status`. */
  opaque type Status <: Long = Long

  object Status {
    final val None: Status = 0L.asInstanceOf[Status]
    final val Connecting: Status = 1L.asInstanceOf[Status]
    final val Connected: Status = 2L.asInstanceOf[Status]
    final val Error: Status = 3L.asInstanceOf[Status]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Status = value.asInstanceOf[Status]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Status] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[Status]]

    extension (self: Status)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Connecting"
        case 2L => "Connected"
        case 3L => "Error"
        case other => other.toString
      }
  }
}
