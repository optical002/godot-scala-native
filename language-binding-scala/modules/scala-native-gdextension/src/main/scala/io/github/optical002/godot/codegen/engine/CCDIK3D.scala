package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CCDIK3D`, extends `IterateIK3D`. */
abstract class CCDIK3D extends IterateIK3D {

}

object CCDIK3D {
  /** Class metadata for Gd[CCDIK3D] lifetime management and casting. */
  given GodotClass[CCDIK3D] with {
    def className = "CCDIK3D"
    def isRefCounted = false
    def wrap(o: GodotObject): CCDIK3D = new CCDIK3D {}.withHost(o.objectPtr)
    def unwrap(t: CCDIK3D): GodotObject = t.hostObject
  }
}
