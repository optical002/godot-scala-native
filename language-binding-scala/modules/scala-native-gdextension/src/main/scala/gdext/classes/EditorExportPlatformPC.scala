package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorExportPlatformPC`, extends `EditorExportPlatform`. */
abstract class EditorExportPlatformPC extends EditorExportPlatform {

}

object EditorExportPlatformPC {
  /** Class metadata for Gd[EditorExportPlatformPC] lifetime management and casting. */
  given GodotClass[EditorExportPlatformPC] with {
    def className = "EditorExportPlatformPC"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorExportPlatformPC = new EditorExportPlatformPC {}.withHost(o.objectPtr)
    def unwrap(t: EditorExportPlatformPC): GodotObject = t.hostObject
  }
}
