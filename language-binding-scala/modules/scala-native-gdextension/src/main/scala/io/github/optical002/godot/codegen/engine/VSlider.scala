package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
