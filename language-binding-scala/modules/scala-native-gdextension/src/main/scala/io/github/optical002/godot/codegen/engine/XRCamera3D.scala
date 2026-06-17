package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `XRCamera3D`, extends `Camera3D`. */
abstract class XRCamera3D extends Camera3D {

}

object XRCamera3D {
  /** Class metadata for Gd[XRCamera3D] lifetime management and casting. */
  given GodotClass[XRCamera3D] with {
    def className = "XRCamera3D"
    def isRefCounted = false
    def wrap(o: GodotObject): XRCamera3D = new XRCamera3D {}.withHost(o.objectPtr)
    def unwrap(t: XRCamera3D): GodotObject = t.hostObject
  }
}
