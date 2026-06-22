package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorSceneFormatImporterBlend`, extends `EditorSceneFormatImporter`. */
abstract class EditorSceneFormatImporterBlend extends EditorSceneFormatImporter {

}

object EditorSceneFormatImporterBlend {
  /** Class metadata for Gd[EditorSceneFormatImporterBlend] lifetime management and casting. */
  given GodotClass[EditorSceneFormatImporterBlend] with {
    def className = "EditorSceneFormatImporterBlend"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorSceneFormatImporterBlend = new EditorSceneFormatImporterBlend {}.withHost(o.objectPtr)
    def unwrap(t: EditorSceneFormatImporterBlend): GodotObject = t.hostObject
  }
}
