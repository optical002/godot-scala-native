package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `HSplitContainer`, extends `SplitContainer`. */
abstract class HSplitContainer extends SplitContainer {

}

object HSplitContainer {
  /** Class metadata for Gd[HSplitContainer] lifetime management and casting. */
  given GodotClass[HSplitContainer] with {
    def className = "HSplitContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): HSplitContainer = new HSplitContainer {}.withHost(o.objectPtr)
    def unwrap(t: HSplitContainer): GodotObject = t.hostObject
  }
}
