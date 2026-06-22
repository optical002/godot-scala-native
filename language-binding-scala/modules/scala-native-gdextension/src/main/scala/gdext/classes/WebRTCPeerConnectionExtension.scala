package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
