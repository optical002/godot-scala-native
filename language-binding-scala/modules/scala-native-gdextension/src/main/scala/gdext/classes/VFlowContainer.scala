package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VFlowContainer`, extends `FlowContainer`. */
abstract class VFlowContainer extends FlowContainer {

}

object VFlowContainer {
  /** Class metadata for Gd[VFlowContainer] lifetime management and casting. */
  given GodotClass[VFlowContainer] with {
    def className = "VFlowContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): VFlowContainer = new VFlowContainer {}.withHost(o.objectPtr)
    def unwrap(t: VFlowContainer): GodotObject = t.hostObject
  }
}
