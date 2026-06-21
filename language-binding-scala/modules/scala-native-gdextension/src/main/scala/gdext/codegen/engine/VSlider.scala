package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VSlider`, extends `Slider`. */
abstract class VSlider extends Slider {

}

object VSlider {
  /** Class metadata for Gd[VSlider] lifetime management and casting. */
  given GodotClass[VSlider] with {
    def className = "VSlider"
    def isRefCounted = false
    def wrap(o: GodotObject): VSlider = new VSlider {}.withHost(o.objectPtr)
    def unwrap(t: VSlider): GodotObject = t.hostObject
  }
}
