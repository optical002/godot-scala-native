package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorSceneFormatImporterGLTF`, extends `EditorSceneFormatImporter`. */
abstract class EditorSceneFormatImporterGLTF extends EditorSceneFormatImporter {

}

object EditorSceneFormatImporterGLTF {
  /** Class metadata for Gd[EditorSceneFormatImporterGLTF] lifetime management and casting. */
  given GodotClass[EditorSceneFormatImporterGLTF] with {
    def className = "EditorSceneFormatImporterGLTF"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorSceneFormatImporterGLTF = new EditorSceneFormatImporterGLTF {}.withHost(o.objectPtr)
    def unwrap(t: EditorSceneFormatImporterGLTF): GodotObject = t.hostObject
  }
}
