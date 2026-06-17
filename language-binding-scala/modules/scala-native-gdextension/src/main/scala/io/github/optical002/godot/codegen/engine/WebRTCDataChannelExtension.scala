package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `WebRTCDataChannelExtension`, extends `WebRTCDataChannel`. */
abstract class WebRTCDataChannelExtension extends WebRTCDataChannel {

}

object WebRTCDataChannelExtension {
  /** Class metadata for Gd[WebRTCDataChannelExtension] lifetime management and casting. */
  given GodotClass[WebRTCDataChannelExtension] with {
    def className = "WebRTCDataChannelExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): WebRTCDataChannelExtension = new WebRTCDataChannelExtension {}.withHost(o.objectPtr)
    def unwrap(t: WebRTCDataChannelExtension): GodotObject = t.hostObject
  }
}
