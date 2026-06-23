package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `MarginContainer`, extends `Container`. */
abstract class MarginContainer extends Container {

}

object MarginContainer {
  /** Class metadata for Gd[MarginContainer] lifetime management and casting. */
  given GodotClass[MarginContainer] with {
    def className = "MarginContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): MarginContainer = new MarginContainer {}.withHost(o.objectPtr)
    def unwrap(t: MarginContainer): GodotObject = t.hostObject
  }
}
