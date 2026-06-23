package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

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
