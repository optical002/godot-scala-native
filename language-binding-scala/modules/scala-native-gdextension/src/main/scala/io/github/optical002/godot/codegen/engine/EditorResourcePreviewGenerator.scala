package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorResourcePreviewGenerator`, extends `RefCounted`. */
abstract class EditorResourcePreviewGenerator extends RefCounted {

}

object EditorResourcePreviewGenerator {
  /** Class metadata for Gd[EditorResourcePreviewGenerator] lifetime management and casting. */
  given GodotClass[EditorResourcePreviewGenerator] with {
    def className = "EditorResourcePreviewGenerator"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorResourcePreviewGenerator = new EditorResourcePreviewGenerator {}.withHost(o.objectPtr)
    def unwrap(t: EditorResourcePreviewGenerator): GodotObject = t.hostObject
  }
}
