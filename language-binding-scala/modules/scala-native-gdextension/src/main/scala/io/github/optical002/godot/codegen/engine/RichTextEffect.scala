package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RichTextEffect`, extends `Resource`. */
abstract class RichTextEffect extends Resource {

}

object RichTextEffect {
  /** Class metadata for Gd[RichTextEffect] lifetime management and casting. */
  given GodotClass[RichTextEffect] with {
    def className = "RichTextEffect"
    def isRefCounted = true
    def wrap(o: GodotObject): RichTextEffect = new RichTextEffect {}.withHost(o.objectPtr)
    def unwrap(t: RichTextEffect): GodotObject = t.hostObject
  }
}
