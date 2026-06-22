package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VideoStream`, extends `Resource`. */
abstract class VideoStream extends Resource {

  /** VideoStream.set_file */
  final def setFile(file: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("VideoStream", "set_file", 83702148L), hostObject.objectPtr, file)

  /** VideoStream.get_file */
  final def getFile(): String =
    Ptrcall.call0[String](MethodBind.get("VideoStream", "get_file", 2841200299L), hostObject.objectPtr)

}

object VideoStream {
  /** Class metadata for Gd[VideoStream] lifetime management and casting. */
  given GodotClass[VideoStream] with {
    def className = "VideoStream"
    def isRefCounted = true
    def wrap(o: GodotObject): VideoStream = new VideoStream {}.withHost(o.objectPtr)
    def unwrap(t: VideoStream): GodotObject = t.hostObject
  }
}
