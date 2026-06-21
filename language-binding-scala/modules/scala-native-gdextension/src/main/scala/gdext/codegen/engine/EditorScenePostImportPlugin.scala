package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorScenePostImportPlugin`, extends `RefCounted`. */
abstract class EditorScenePostImportPlugin extends RefCounted {

}

object EditorScenePostImportPlugin {
  /** Class metadata for Gd[EditorScenePostImportPlugin] lifetime management and casting. */
  given GodotClass[EditorScenePostImportPlugin] with {
    def className = "EditorScenePostImportPlugin"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorScenePostImportPlugin = new EditorScenePostImportPlugin {}.withHost(o.objectPtr)
    def unwrap(t: EditorScenePostImportPlugin): GodotObject = t.hostObject
  }
}
