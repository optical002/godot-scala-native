package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `FBXDocument`, extends `GLTFDocument`. */
abstract class FBXDocument extends GLTFDocument {

}

object FBXDocument {
  /** Class metadata for Gd[FBXDocument] lifetime management and casting. */
  given GodotClass[FBXDocument] with {
    def className = "FBXDocument"
    def isRefCounted = true
    def wrap(o: GodotObject): FBXDocument = new FBXDocument {}.withHost(o.objectPtr)
    def unwrap(t: FBXDocument): GodotObject = t.hostObject
  }
}
