package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorScenePostImportPlugin`, extends `RefCounted`. */
abstract class EditorScenePostImportPlugin extends RefCounted {

}

object EditorScenePostImportPlugin {
  /** Class metadata for Gd[EditorScenePostImportPlugin] lifetime management and casting. */
  given GodotClass[EditorScenePostImportPlugin] with {
    def className = "EditorScenePostImportPlugin"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorScenePostImportPlugin = new EditorScenePostImportPlugin {}.withHost(o.objectPtr)
    def unwrap(t: EditorScenePostImportPlugin): GodotObject = t.hostObject
  }
}
