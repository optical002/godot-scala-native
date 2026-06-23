package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `StreamPeerTCP`, extends `StreamPeerSocket`. */
abstract class StreamPeerTCP extends StreamPeerSocket {

  /** StreamPeerTCP.bind */
  final def bind(port: Long, host: String): Long =
    Ptrcall.call2[Long, String, Long](MethodBind.get("StreamPeerTCP", "bind", 3167955072L), hostObject.objectPtr, port, host)

  /** StreamPeerTCP.connect_to_host */
  final def connectToHost(host: String, port: Long): Long =
    Ptrcall.call2[String, Long, Long](MethodBind.get("StreamPeerTCP", "connect_to_host", 993915709L), hostObject.objectPtr, host, port)

  /** StreamPeerTCP.get_connected_host */
  final def getConnectedHost(): String =
    Ptrcall.call0[String](MethodBind.get("StreamPeerTCP", "get_connected_host", 201670096L), hostObject.objectPtr)

  /** StreamPeerTCP.get_connected_port */
  final def getConnectedPort(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeerTCP", "get_connected_port", 3905245786L), hostObject.objectPtr)

  /** StreamPeerTCP.get_local_port */
  final def getLocalPort(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeerTCP", "get_local_port", 3905245786L), hostObject.objectPtr)

  /** StreamPeerTCP.set_no_delay */
  final def setNoDelay(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeerTCP", "set_no_delay", 2586408642L), hostObject.objectPtr, enabled)

}

object StreamPeerTCP {
  /** Class metadata for Gd[StreamPeerTCP] lifetime management and casting. */
  given GodotClass[StreamPeerTCP] with {
    def className = "StreamPeerTCP"
    def isRefCounted = true
    def wrap(o: GodotObject): StreamPeerTCP = new StreamPeerTCP {}.withHost(o.objectPtr)
    def unwrap(t: StreamPeerTCP): GodotObject = t.hostObject
  }
}
