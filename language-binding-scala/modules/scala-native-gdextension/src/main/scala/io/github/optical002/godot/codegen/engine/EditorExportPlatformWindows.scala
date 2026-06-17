package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorExportPlatformWindows`, extends `EditorExportPlatformPC`. */
abstract class EditorExportPlatformWindows extends EditorExportPlatformPC {

}

object EditorExportPlatformWindows {
  /** Class metadata for Gd[EditorExportPlatformWindows] lifetime management and casting. */
  given GodotClass[EditorExportPlatformWindows] with {
    def className = "EditorExportPlatformWindows"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorExportPlatformWindows = new EditorExportPlatformWindows {}.withHost(o.objectPtr)
    def unwrap(t: EditorExportPlatformWindows): GodotObject = t.hostObject
  }
}
