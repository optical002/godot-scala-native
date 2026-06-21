package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VBoxContainer`, extends `BoxContainer`. */
abstract class VBoxContainer extends BoxContainer {

}

object VBoxContainer {
  /** Class metadata for Gd[VBoxContainer] lifetime management and casting. */
  given GodotClass[VBoxContainer] with {
    def className = "VBoxContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): VBoxContainer = new VBoxContainer {}.withHost(o.objectPtr)
    def unwrap(t: VBoxContainer): GodotObject = t.hostObject
  }
}
