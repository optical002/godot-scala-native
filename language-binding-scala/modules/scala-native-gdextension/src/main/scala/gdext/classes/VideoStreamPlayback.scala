package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VideoStreamPlayback`, extends `Resource`. */
abstract class VideoStreamPlayback extends Resource {

}

object VideoStreamPlayback {
  /** Class metadata for Gd[VideoStreamPlayback] lifetime management and casting. */
  given GodotClass[VideoStreamPlayback] with {
    def className = "VideoStreamPlayback"
    def isRefCounted = true
    def wrap(o: GodotObject): VideoStreamPlayback = new VideoStreamPlayback {}.withHost(o.objectPtr)
    def unwrap(t: VideoStreamPlayback): GodotObject = t.hostObject
  }
}
