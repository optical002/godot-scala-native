package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorExportPlatformVisionOS`, extends `EditorExportPlatformAppleEmbedded`. */
abstract class EditorExportPlatformVisionOS extends EditorExportPlatformAppleEmbedded {

}

object EditorExportPlatformVisionOS {
  /** Class metadata for Gd[EditorExportPlatformVisionOS] lifetime management and casting. */
  given GodotClass[EditorExportPlatformVisionOS] with {
    def className = "EditorExportPlatformVisionOS"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorExportPlatformVisionOS = new EditorExportPlatformVisionOS {}.withHost(o.objectPtr)
    def unwrap(t: EditorExportPlatformVisionOS): GodotObject = t.hostObject
  }
}
