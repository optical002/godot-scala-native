package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `XRControllerTracker`, extends `XRPositionalTracker`. */
abstract class XRControllerTracker extends XRPositionalTracker {

}

object XRControllerTracker {
  /** Class metadata for Gd[XRControllerTracker] lifetime management and casting. */
  given GodotClass[XRControllerTracker] with {
    def className = "XRControllerTracker"
    def isRefCounted = true
    def wrap(o: GodotObject): XRControllerTracker = new XRControllerTracker {}.withHost(o.objectPtr)
    def unwrap(t: XRControllerTracker): GodotObject = t.hostObject
  }
}
