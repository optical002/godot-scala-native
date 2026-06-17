package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorExportPlatformMacOS`, extends `EditorExportPlatform`. */
abstract class EditorExportPlatformMacOS extends EditorExportPlatform {

}

object EditorExportPlatformMacOS {
  /** Class metadata for Gd[EditorExportPlatformMacOS] lifetime management and casting. */
  given GodotClass[EditorExportPlatformMacOS] with {
    def className = "EditorExportPlatformMacOS"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorExportPlatformMacOS = new EditorExportPlatformMacOS {}.withHost(o.objectPtr)
    def unwrap(t: EditorExportPlatformMacOS): GodotObject = t.hostObject
  }
}
