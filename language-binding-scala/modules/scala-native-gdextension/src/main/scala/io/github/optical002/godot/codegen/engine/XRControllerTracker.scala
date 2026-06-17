package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
