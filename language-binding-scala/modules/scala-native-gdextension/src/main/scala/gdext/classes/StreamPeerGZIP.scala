package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `StreamPeerGZIP`, extends `StreamPeer`. */
abstract class StreamPeerGZIP extends StreamPeer {
  override def godotClassName: String = "StreamPeerGZIP"

  /** StreamPeerGZIP.start_compression */
  final def startCompression(useDeflate: Boolean = false, bufferSize: Long = 65535L): gdext.classes.Error = {
    if (gdext.classes.StreamPeerGZIP.mb_start_compression == null) gdext.classes.StreamPeerGZIP.mb_start_compression = MethodBind.get("StreamPeerGZIP", "start_compression", 781582770L)
    gdext.classes.Error(Ptrcall.call2[Boolean, Long, Long](gdext.classes.StreamPeerGZIP.mb_start_compression, livePtr, useDeflate, bufferSize))
  }

  /** StreamPeerGZIP.start_decompression */
  final def startDecompression(useDeflate: Boolean = false, bufferSize: Long = 65535L): gdext.classes.Error = {
    if (gdext.classes.StreamPeerGZIP.mb_start_decompression == null) gdext.classes.StreamPeerGZIP.mb_start_decompression = MethodBind.get("StreamPeerGZIP", "start_decompression", 781582770L)
    gdext.classes.Error(Ptrcall.call2[Boolean, Long, Long](gdext.classes.StreamPeerGZIP.mb_start_decompression, livePtr, useDeflate, bufferSize))
  }

  /** StreamPeerGZIP.finish */
  final def finish(): gdext.classes.Error = {
    if (gdext.classes.StreamPeerGZIP.mb_finish == null) gdext.classes.StreamPeerGZIP.mb_finish = MethodBind.get("StreamPeerGZIP", "finish", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.StreamPeerGZIP.mb_finish, livePtr))
  }

  /** StreamPeerGZIP.clear */
  final def clear(): Unit = {
    if (gdext.classes.StreamPeerGZIP.mb_clear == null) gdext.classes.StreamPeerGZIP.mb_clear = MethodBind.get("StreamPeerGZIP", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.StreamPeerGZIP.mb_clear, livePtr)
  }

}

object StreamPeerGZIP {
  private[classes] var mb_start_compression: GDExtensionMethodBindPtr = null
  private[classes] var mb_start_decompression: GDExtensionMethodBindPtr = null
  private[classes] var mb_finish: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
}
