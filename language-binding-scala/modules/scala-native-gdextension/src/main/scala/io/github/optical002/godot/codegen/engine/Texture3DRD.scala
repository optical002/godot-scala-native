package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Texture3DRD`, extends `Texture3D`. */
abstract class Texture3DRD extends Texture3D {

}

object Texture3DRD {
  /** Class metadata for Gd[Texture3DRD] lifetime management and casting. */
  given GodotClass[Texture3DRD] with {
    def className = "Texture3DRD"
    def isRefCounted = true
    def wrap(o: GodotObject): Texture3DRD = new Texture3DRD {}.withHost(o.objectPtr)
    def unwrap(t: Texture3DRD): GodotObject = t.hostObject
  }
}
