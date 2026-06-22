package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorExportPlatformWeb`, extends `EditorExportPlatform`. */
abstract class EditorExportPlatformWeb extends EditorExportPlatform {

}

object EditorExportPlatformWeb {
  /** Class metadata for Gd[EditorExportPlatformWeb] lifetime management and casting. */
  given GodotClass[EditorExportPlatformWeb] with {
    def className = "EditorExportPlatformWeb"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorExportPlatformWeb = new EditorExportPlatformWeb {}.withHost(o.objectPtr)
    def unwrap(t: EditorExportPlatformWeb): GodotObject = t.hostObject
  }
}
