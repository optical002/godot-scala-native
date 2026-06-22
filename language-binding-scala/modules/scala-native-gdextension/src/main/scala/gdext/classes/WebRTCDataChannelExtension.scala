package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
