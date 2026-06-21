package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorSceneFormatImporterFBX2GLTF`, extends `EditorSceneFormatImporter`. */
abstract class EditorSceneFormatImporterFBX2GLTF extends EditorSceneFormatImporter {

}

object EditorSceneFormatImporterFBX2GLTF {
  /** Class metadata for Gd[EditorSceneFormatImporterFBX2GLTF] lifetime management and casting. */
  given GodotClass[EditorSceneFormatImporterFBX2GLTF] with {
    def className = "EditorSceneFormatImporterFBX2GLTF"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorSceneFormatImporterFBX2GLTF = new EditorSceneFormatImporterFBX2GLTF {}.withHost(o.objectPtr)
    def unwrap(t: EditorSceneFormatImporterFBX2GLTF): GodotObject = t.hostObject
  }
}
