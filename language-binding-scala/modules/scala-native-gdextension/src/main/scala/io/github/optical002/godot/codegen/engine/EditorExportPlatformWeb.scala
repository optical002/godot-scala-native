package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorExportPlatformWeb`, extends `EditorExportPlatform`. */
abstract class EditorExportPlatformWeb extends EditorExportPlatform {

}

object EditorExportPlatformWeb {
  /** Class metadata for Gd[EditorExportPlatformWeb] lifetime management and casting. */
  given GodotClass[EditorExportPlatformWeb] with {
    def className = "EditorExportPlatformWeb"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorExportPlatformWeb = new EditorExportPlatformWeb {}.withHost(o.objectPtr)
    def unwrap(t: EditorExportPlatformWeb): GodotObject = t.hostObject
  }
}
