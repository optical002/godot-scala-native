package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `HSlider`, extends `Slider`. */
abstract class HSlider extends Slider {

}

object HSlider {
  /** Class metadata for Gd[HSlider] lifetime management and casting. */
  given GodotClass[HSlider] with {
    def className = "HSlider"
    def isRefCounted = false
    def wrap(o: GodotObject): HSlider = new HSlider {}.withHost(o.objectPtr)
    def unwrap(t: HSlider): GodotObject = t.hostObject
  }
}
