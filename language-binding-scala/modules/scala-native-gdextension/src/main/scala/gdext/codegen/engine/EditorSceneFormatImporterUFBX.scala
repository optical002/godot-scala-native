package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorSceneFormatImporterUFBX`, extends `EditorSceneFormatImporter`. */
abstract class EditorSceneFormatImporterUFBX extends EditorSceneFormatImporter {

}

object EditorSceneFormatImporterUFBX {
  /** Class metadata for Gd[EditorSceneFormatImporterUFBX] lifetime management and casting. */
  given GodotClass[EditorSceneFormatImporterUFBX] with {
    def className = "EditorSceneFormatImporterUFBX"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorSceneFormatImporterUFBX = new EditorSceneFormatImporterUFBX {}.withHost(o.objectPtr)
    def unwrap(t: EditorSceneFormatImporterUFBX): GodotObject = t.hostObject
  }
}
