package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorExportPlatformAndroid`, extends `EditorExportPlatform`. */
abstract class EditorExportPlatformAndroid extends EditorExportPlatform {

}

object EditorExportPlatformAndroid {
  /** Class metadata for Gd[EditorExportPlatformAndroid] lifetime management and casting. */
  given GodotClass[EditorExportPlatformAndroid] with {
    def className = "EditorExportPlatformAndroid"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorExportPlatformAndroid = new EditorExportPlatformAndroid {}.withHost(o.objectPtr)
    def unwrap(t: EditorExportPlatformAndroid): GodotObject = t.hostObject
  }
}
