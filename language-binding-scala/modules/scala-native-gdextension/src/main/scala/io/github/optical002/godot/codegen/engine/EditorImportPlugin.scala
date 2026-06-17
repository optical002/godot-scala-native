package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorImportPlugin`, extends `ResourceImporter`. */
abstract class EditorImportPlugin extends ResourceImporter {

}

object EditorImportPlugin {
  /** Class metadata for Gd[EditorImportPlugin] lifetime management and casting. */
  given GodotClass[EditorImportPlugin] with {
    def className = "EditorImportPlugin"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorImportPlugin = new EditorImportPlugin {}.withHost(o.objectPtr)
    def unwrap(t: EditorImportPlugin): GodotObject = t.hostObject
  }
}
