package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Logger`, extends `RefCounted`. */
abstract class Logger extends RefCounted {

}

object Logger {
  /** Class metadata for Gd[Logger] lifetime management and casting. */
  given GodotClass[Logger] with {
    def className = "Logger"
    def isRefCounted = true
    def wrap(o: GodotObject): Logger = new Logger {}.withHost(o.objectPtr)
    def unwrap(t: Logger): GodotObject = t.hostObject
  }
}
