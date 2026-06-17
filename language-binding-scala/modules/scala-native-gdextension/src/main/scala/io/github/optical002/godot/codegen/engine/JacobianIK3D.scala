package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `JacobianIK3D`, extends `IterateIK3D`. */
abstract class JacobianIK3D extends IterateIK3D {

}

object JacobianIK3D {
  /** Class metadata for Gd[JacobianIK3D] lifetime management and casting. */
  given GodotClass[JacobianIK3D] with {
    def className = "JacobianIK3D"
    def isRefCounted = false
    def wrap(o: GodotObject): JacobianIK3D = new JacobianIK3D {}.withHost(o.objectPtr)
    def unwrap(t: JacobianIK3D): GodotObject = t.hostObject
  }
}
