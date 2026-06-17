package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorExportPlatformIOS`, extends `EditorExportPlatformAppleEmbedded`. */
abstract class EditorExportPlatformIOS extends EditorExportPlatformAppleEmbedded {

}

object EditorExportPlatformIOS {
  /** Class metadata for Gd[EditorExportPlatformIOS] lifetime management and casting. */
  given GodotClass[EditorExportPlatformIOS] with {
    def className = "EditorExportPlatformIOS"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorExportPlatformIOS = new EditorExportPlatformIOS {}.withHost(o.objectPtr)
    def unwrap(t: EditorExportPlatformIOS): GodotObject = t.hostObject
  }
}
