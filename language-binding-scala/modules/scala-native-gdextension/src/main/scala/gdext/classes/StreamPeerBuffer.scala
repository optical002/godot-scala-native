package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `StreamPeerBuffer`, extends `StreamPeer`. */
abstract class StreamPeerBuffer extends StreamPeer {

  /** StreamPeerBuffer.seek */
  final def seek(position: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeerBuffer", "seek", 1286410249L), hostObject.objectPtr, position)

  /** StreamPeerBuffer.get_size */
  final def getSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeerBuffer", "get_size", 3905245786L), hostObject.objectPtr)

  /** StreamPeerBuffer.get_position */
  final def getPosition(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeerBuffer", "get_position", 3905245786L), hostObject.objectPtr)

  /** StreamPeerBuffer.resize */
  final def resize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeerBuffer", "resize", 1286410249L), hostObject.objectPtr, size)

  /** StreamPeerBuffer.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("StreamPeerBuffer", "clear", 3218959716L), hostObject.objectPtr)

  /** StreamPeerBuffer.duplicate */
  final def duplicate(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("StreamPeerBuffer", "duplicate", 2474064677L), hostObject.objectPtr)

}

object StreamPeerBuffer {
  /** Class metadata for Gd[StreamPeerBuffer] lifetime management and casting. */
  given GodotClass[StreamPeerBuffer] with {
    def className = "StreamPeerBuffer"
    def isRefCounted = true
    def wrap(o: GodotObject): StreamPeerBuffer = new StreamPeerBuffer {}.withHost(o.objectPtr)
    def unwrap(t: StreamPeerBuffer): GodotObject = t.hostObject
  }
}
