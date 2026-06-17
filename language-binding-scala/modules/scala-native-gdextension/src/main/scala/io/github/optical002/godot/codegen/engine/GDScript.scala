package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `GDScript`, extends `Script`. */
abstract class GDScript extends Script {

}

object GDScript {
  /** Class metadata for Gd[GDScript] lifetime management and casting. */
  given GodotClass[GDScript] with {
    def className = "GDScript"
    def isRefCounted = true
    def wrap(o: GodotObject): GDScript = new GDScript {}.withHost(o.objectPtr)
    def unwrap(t: GDScript): GodotObject = t.hostObject
  }
}
