package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
