package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
