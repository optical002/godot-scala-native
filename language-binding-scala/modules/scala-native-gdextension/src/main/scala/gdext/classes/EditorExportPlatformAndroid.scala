package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorExportPlatformAndroid`, extends `EditorExportPlatform`. */
abstract class EditorExportPlatformAndroid extends EditorExportPlatform {

}

object EditorExportPlatformAndroid {
  /** Class metadata for Gd[EditorExportPlatformAndroid] lifetime management and casting. */
  given GodotClass[EditorExportPlatformAndroid] with {
    def className = "EditorExportPlatformAndroid"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorExportPlatformAndroid = new EditorExportPlatformAndroid {}.withHost(o.objectPtr)
    def unwrap(t: EditorExportPlatformAndroid): GodotObject = t.hostObject
  }
}
