package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorImportPlugin`, extends `ResourceImporter`. */
abstract class EditorImportPlugin extends ResourceImporter {

}

object EditorImportPlugin {
  /** Class metadata for Gd[EditorImportPlugin] lifetime management and casting. */
  given GodotClass[EditorImportPlugin] with {
    def className = "EditorImportPlugin"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorImportPlugin = new EditorImportPlugin {}.withHost(o.objectPtr)
    def unwrap(t: EditorImportPlugin): GodotObject = t.hostObject
  }
}
