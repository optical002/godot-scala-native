package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorSceneFormatImporter`, extends `RefCounted`. */
abstract class EditorSceneFormatImporter extends RefCounted {

}

object EditorSceneFormatImporter {
  /** Class metadata for Gd[EditorSceneFormatImporter] lifetime management and casting. */
  given GodotClass[EditorSceneFormatImporter] with {
    def className = "EditorSceneFormatImporter"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorSceneFormatImporter = new EditorSceneFormatImporter {}.withHost(o.objectPtr)
    def unwrap(t: EditorSceneFormatImporter): GodotObject = t.hostObject
  }
}
