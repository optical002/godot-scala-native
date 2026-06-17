package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
