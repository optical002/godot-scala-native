package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

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
