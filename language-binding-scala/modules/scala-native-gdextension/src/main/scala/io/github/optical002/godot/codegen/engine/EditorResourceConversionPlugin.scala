package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorResourceConversionPlugin`, extends `RefCounted`. */
abstract class EditorResourceConversionPlugin extends RefCounted {

}

object EditorResourceConversionPlugin {
  /** Class metadata for Gd[EditorResourceConversionPlugin] lifetime management and casting. */
  given GodotClass[EditorResourceConversionPlugin] with {
    def className = "EditorResourceConversionPlugin"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorResourceConversionPlugin = new EditorResourceConversionPlugin {}.withHost(o.objectPtr)
    def unwrap(t: EditorResourceConversionPlugin): GodotObject = t.hostObject
  }
}
