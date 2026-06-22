package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorSceneFormatImporter`, extends `RefCounted`. */
abstract class EditorSceneFormatImporter extends RefCounted {

}

object EditorSceneFormatImporter {
  /** Class metadata for Gd[EditorSceneFormatImporter] lifetime management and casting. */
  given GodotClass[EditorSceneFormatImporter] with {
    def className = "EditorSceneFormatImporter"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorSceneFormatImporter = new EditorSceneFormatImporter {}.withHost(o.objectPtr)
    def unwrap(t: EditorSceneFormatImporter): GodotObject = t.hostObject
  }
}
