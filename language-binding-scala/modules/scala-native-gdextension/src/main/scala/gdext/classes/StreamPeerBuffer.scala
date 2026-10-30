package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `StreamPeerBuffer`, extends `StreamPeer`. */
abstract class StreamPeerBuffer extends StreamPeer {
  override def godotClassName: String = "StreamPeerBuffer"

  /** StreamPeerBuffer.seek */
  final def seek(position: Long): Unit = {
    if (gdext.classes.StreamPeerBuffer.mb_seek == null) gdext.classes.StreamPeerBuffer.mb_seek = MethodBind.get("StreamPeerBuffer", "seek", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.StreamPeerBuffer.mb_seek, livePtr, position)
  }

  /** StreamPeerBuffer.get_size */
  final def getSize(): Long = {
    if (gdext.classes.StreamPeerBuffer.mb_get_size == null) gdext.classes.StreamPeerBuffer.mb_get_size = MethodBind.get("StreamPeerBuffer", "get_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.StreamPeerBuffer.mb_get_size, livePtr)
  }

  /** StreamPeerBuffer.get_position */
  final def getPosition(): Long = {
    if (gdext.classes.StreamPeerBuffer.mb_get_position == null) gdext.classes.StreamPeerBuffer.mb_get_position = MethodBind.get("StreamPeerBuffer", "get_position", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.StreamPeerBuffer.mb_get_position, livePtr)
  }

  /** StreamPeerBuffer.resize */
  final def resize(size: Long): Unit = {
    if (gdext.classes.StreamPeerBuffer.mb_resize == null) gdext.classes.StreamPeerBuffer.mb_resize = MethodBind.get("StreamPeerBuffer", "resize", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.StreamPeerBuffer.mb_resize, livePtr, size)
  }

  /** StreamPeerBuffer.clear */
  final def clear(): Unit = {
    if (gdext.classes.StreamPeerBuffer.mb_clear == null) gdext.classes.StreamPeerBuffer.mb_clear = MethodBind.get("StreamPeerBuffer", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.StreamPeerBuffer.mb_clear, livePtr)
  }

  /** StreamPeerBuffer.duplicate. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def duplicate(): StreamPeerBuffer = {
    if (gdext.classes.StreamPeerBuffer.mb_duplicate == null) gdext.classes.StreamPeerBuffer.mb_duplicate = MethodBind.get("StreamPeerBuffer", "duplicate", 2474064677L)
    Wrappers.owned[StreamPeerBuffer](Ptrcall.call0[Long](gdext.classes.StreamPeerBuffer.mb_duplicate, livePtr))
  }

}

object StreamPeerBuffer {
  private[classes] var mb_seek: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_resize: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_duplicate: GDExtensionMethodBindPtr = null
}
