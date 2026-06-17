package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorExportPlatformLinuxBSD`, extends `EditorExportPlatformPC`. */
abstract class EditorExportPlatformLinuxBSD extends EditorExportPlatformPC {

}

object EditorExportPlatformLinuxBSD {
  /** Class metadata for Gd[EditorExportPlatformLinuxBSD] lifetime management and casting. */
  given GodotClass[EditorExportPlatformLinuxBSD] with {
    def className = "EditorExportPlatformLinuxBSD"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorExportPlatformLinuxBSD = new EditorExportPlatformLinuxBSD {}.withHost(o.objectPtr)
    def unwrap(t: EditorExportPlatformLinuxBSD): GodotObject = t.hostObject
  }
}
