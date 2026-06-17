package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `StandardMaterial3D`, extends `BaseMaterial3D`. */
abstract class StandardMaterial3D extends BaseMaterial3D {

}

object StandardMaterial3D {
  /** Class metadata for Gd[StandardMaterial3D] lifetime management and casting. */
  given GodotClass[StandardMaterial3D] with {
    def className = "StandardMaterial3D"
    def isRefCounted = true
    def wrap(o: GodotObject): StandardMaterial3D = new StandardMaterial3D {}.withHost(o.objectPtr)
    def unwrap(t: StandardMaterial3D): GodotObject = t.hostObject
  }
}
