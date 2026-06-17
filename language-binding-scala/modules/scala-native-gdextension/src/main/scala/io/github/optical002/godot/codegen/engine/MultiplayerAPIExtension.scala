package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `MultiplayerAPIExtension`, extends `MultiplayerAPI`. */
abstract class MultiplayerAPIExtension extends MultiplayerAPI {

}

object MultiplayerAPIExtension {
  /** Class metadata for Gd[MultiplayerAPIExtension] lifetime management and casting. */
  given GodotClass[MultiplayerAPIExtension] with {
    def className = "MultiplayerAPIExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): MultiplayerAPIExtension = new MultiplayerAPIExtension {}.withHost(o.objectPtr)
    def unwrap(t: MultiplayerAPIExtension): GodotObject = t.hostObject
  }
}
