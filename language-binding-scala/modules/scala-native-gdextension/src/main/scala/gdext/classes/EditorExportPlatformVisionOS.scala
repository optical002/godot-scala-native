package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
