package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorSceneFormatImporterGLTF`, extends `EditorSceneFormatImporter`. */
abstract class EditorSceneFormatImporterGLTF extends EditorSceneFormatImporter {

}

object EditorSceneFormatImporterGLTF {
  /** Class metadata for Gd[EditorSceneFormatImporterGLTF] lifetime management and casting. */
  given GodotClass[EditorSceneFormatImporterGLTF] with {
    def className = "EditorSceneFormatImporterGLTF"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorSceneFormatImporterGLTF = new EditorSceneFormatImporterGLTF {}.withHost(o.objectPtr)
    def unwrap(t: EditorSceneFormatImporterGLTF): GodotObject = t.hostObject
  }
}
