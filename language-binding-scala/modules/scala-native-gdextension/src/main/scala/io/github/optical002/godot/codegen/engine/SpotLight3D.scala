package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `SpotLight3D`, extends `Light3D`. */
abstract class SpotLight3D extends Light3D {

}

object SpotLight3D {
  /** Class metadata for Gd[SpotLight3D] lifetime management and casting. */
  given GodotClass[SpotLight3D] with {
    def className = "SpotLight3D"
    def isRefCounted = false
    def wrap(o: GodotObject): SpotLight3D = new SpotLight3D {}.withHost(o.objectPtr)
    def unwrap(t: SpotLight3D): GodotObject = t.hostObject
  }
}
