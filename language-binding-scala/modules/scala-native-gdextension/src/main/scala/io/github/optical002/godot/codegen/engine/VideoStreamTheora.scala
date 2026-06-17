package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
