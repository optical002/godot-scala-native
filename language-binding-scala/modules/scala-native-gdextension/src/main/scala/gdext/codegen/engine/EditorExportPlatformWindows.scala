package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
