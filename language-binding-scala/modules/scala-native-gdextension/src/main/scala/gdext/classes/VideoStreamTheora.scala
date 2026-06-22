package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VideoStreamTheora`, extends `VideoStream`. */
abstract class VideoStreamTheora extends VideoStream {

}

object VideoStreamTheora {
  /** Class metadata for Gd[VideoStreamTheora] lifetime management and casting. */
  given GodotClass[VideoStreamTheora] with {
    def className = "VideoStreamTheora"
    def isRefCounted = true
    def wrap(o: GodotObject): VideoStreamTheora = new VideoStreamTheora {}.withHost(o.objectPtr)
    def unwrap(t: VideoStreamTheora): GodotObject = t.hostObject
  }
}
