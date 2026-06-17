package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorExportPlatformAppleEmbedded`, extends `EditorExportPlatform`. */
abstract class EditorExportPlatformAppleEmbedded extends EditorExportPlatform {

}

object EditorExportPlatformAppleEmbedded {
  /** Class metadata for Gd[EditorExportPlatformAppleEmbedded] lifetime management and casting. */
  given GodotClass[EditorExportPlatformAppleEmbedded] with {
    def className = "EditorExportPlatformAppleEmbedded"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorExportPlatformAppleEmbedded = new EditorExportPlatformAppleEmbedded {}.withHost(o.objectPtr)
    def unwrap(t: EditorExportPlatformAppleEmbedded): GodotObject = t.hostObject
  }
}
