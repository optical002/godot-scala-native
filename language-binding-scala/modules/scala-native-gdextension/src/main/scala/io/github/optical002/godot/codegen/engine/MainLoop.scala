package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `MainLoop`, extends `Object`. */
abstract class MainLoop extends Object {

}

object MainLoop {
  /** Class metadata for Gd[MainLoop] lifetime management and casting. */
  given GodotClass[MainLoop] with {
    def className = "MainLoop"
    def isRefCounted = false
    def wrap(o: GodotObject): MainLoop = new MainLoop {}.withHost(o.objectPtr)
    def unwrap(t: MainLoop): GodotObject = t.hostObject
  }
}
