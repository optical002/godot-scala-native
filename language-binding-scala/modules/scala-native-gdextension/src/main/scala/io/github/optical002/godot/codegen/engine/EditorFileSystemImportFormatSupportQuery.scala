package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorFileSystemImportFormatSupportQuery`, extends `RefCounted`. */
abstract class EditorFileSystemImportFormatSupportQuery extends RefCounted {

}

object EditorFileSystemImportFormatSupportQuery {
  /** Class metadata for Gd[EditorFileSystemImportFormatSupportQuery] lifetime management and casting. */
  given GodotClass[EditorFileSystemImportFormatSupportQuery] with {
    def className = "EditorFileSystemImportFormatSupportQuery"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorFileSystemImportFormatSupportQuery = new EditorFileSystemImportFormatSupportQuery {}.withHost(o.objectPtr)
    def unwrap(t: EditorFileSystemImportFormatSupportQuery): GodotObject = t.hostObject
  }
}
