package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorSceneFormatImporterBlend`, extends `EditorSceneFormatImporter`. */
abstract class EditorSceneFormatImporterBlend extends EditorSceneFormatImporter {

}

object EditorSceneFormatImporterBlend {
  /** Class metadata for Gd[EditorSceneFormatImporterBlend] lifetime management and casting. */
  given GodotClass[EditorSceneFormatImporterBlend] with {
    def className = "EditorSceneFormatImporterBlend"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorSceneFormatImporterBlend = new EditorSceneFormatImporterBlend {}.withHost(o.objectPtr)
    def unwrap(t: EditorSceneFormatImporterBlend): GodotObject = t.hostObject
  }
}
