package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VideoStream`, extends `Resource`. */
abstract class VideoStream extends Resource {
  override def godotClassName: String = "VideoStream"

  /** VideoStream.set_file */
  final def setFile(file: String): Unit = {
    if (gdext.classes.VideoStream.mb_set_file == null) gdext.classes.VideoStream.mb_set_file = MethodBind.get("VideoStream", "set_file", 83702148L)
    Ptrcall.callVoid1(gdext.classes.VideoStream.mb_set_file, livePtr, file)
  }

  /** VideoStream.get_file */
  final def getFile(): String = {
    if (gdext.classes.VideoStream.mb_get_file == null) gdext.classes.VideoStream.mb_get_file = MethodBind.get("VideoStream", "get_file", 2841200299L)
    Ptrcall.call0[String](gdext.classes.VideoStream.mb_get_file, livePtr)
  }

}

object VideoStream {
  private[classes] var mb_set_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_file: GDExtensionMethodBindPtr = null
}
