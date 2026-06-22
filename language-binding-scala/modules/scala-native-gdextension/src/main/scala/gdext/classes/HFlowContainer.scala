package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `HFlowContainer`, extends `FlowContainer`. */
abstract class HFlowContainer extends FlowContainer {

}

object HFlowContainer {
  /** Class metadata for Gd[HFlowContainer] lifetime management and casting. */
  given GodotClass[HFlowContainer] with {
    def className = "HFlowContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): HFlowContainer = new HFlowContainer {}.withHost(o.objectPtr)
    def unwrap(t: HFlowContainer): GodotObject = t.hostObject
  }
}
