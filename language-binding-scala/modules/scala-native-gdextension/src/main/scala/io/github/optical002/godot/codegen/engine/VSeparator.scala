package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VSeparator`, extends `Separator`. */
abstract class VSeparator extends Separator {

}

object VSeparator {
  /** Class metadata for Gd[VSeparator] lifetime management and casting. */
  given GodotClass[VSeparator] with {
    def className = "VSeparator"
    def isRefCounted = false
    def wrap(o: GodotObject): VSeparator = new VSeparator {}.withHost(o.objectPtr)
    def unwrap(t: VSeparator): GodotObject = t.hostObject
  }
}
