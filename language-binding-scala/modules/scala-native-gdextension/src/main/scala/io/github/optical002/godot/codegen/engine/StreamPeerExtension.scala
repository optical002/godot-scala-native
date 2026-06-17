package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `StreamPeerExtension`, extends `StreamPeer`. */
abstract class StreamPeerExtension extends StreamPeer {

}

object StreamPeerExtension {
  /** Class metadata for Gd[StreamPeerExtension] lifetime management and casting. */
  given GodotClass[StreamPeerExtension] with {
    def className = "StreamPeerExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): StreamPeerExtension = new StreamPeerExtension {}.withHost(o.objectPtr)
    def unwrap(t: StreamPeerExtension): GodotObject = t.hostObject
  }
}
