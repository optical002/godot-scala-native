package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `JointLimitation3D`, extends `Resource`. */
abstract class JointLimitation3D extends Resource {

}

object JointLimitation3D {
  /** Class metadata for Gd[JointLimitation3D] lifetime management and casting. */
  given GodotClass[JointLimitation3D] with {
    def className = "JointLimitation3D"
    def isRefCounted = true
    def wrap(o: GodotObject): JointLimitation3D = new JointLimitation3D {}.withHost(o.objectPtr)
    def unwrap(t: JointLimitation3D): GodotObject = t.hostObject
  }
}
