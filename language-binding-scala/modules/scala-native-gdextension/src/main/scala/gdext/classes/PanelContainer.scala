package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PanelContainer`, extends `Container`. */
abstract class PanelContainer extends Container {

}

object PanelContainer {
  /** Class metadata for Gd[PanelContainer] lifetime management and casting. */
  given GodotClass[PanelContainer] with {
    def className = "PanelContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): PanelContainer = new PanelContainer {}.withHost(o.objectPtr)
    def unwrap(t: PanelContainer): GodotObject = t.hostObject
  }
}
