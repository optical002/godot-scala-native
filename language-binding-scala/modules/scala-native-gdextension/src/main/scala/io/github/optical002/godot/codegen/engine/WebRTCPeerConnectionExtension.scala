package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `WebRTCPeerConnectionExtension`, extends `WebRTCPeerConnection`. */
abstract class WebRTCPeerConnectionExtension extends WebRTCPeerConnection {

}

object WebRTCPeerConnectionExtension {
  /** Class metadata for Gd[WebRTCPeerConnectionExtension] lifetime management and casting. */
  given GodotClass[WebRTCPeerConnectionExtension] with {
    def className = "WebRTCPeerConnectionExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): WebRTCPeerConnectionExtension = new WebRTCPeerConnectionExtension {}.withHost(o.objectPtr)
    def unwrap(t: WebRTCPeerConnectionExtension): GodotObject = t.hostObject
  }
}
