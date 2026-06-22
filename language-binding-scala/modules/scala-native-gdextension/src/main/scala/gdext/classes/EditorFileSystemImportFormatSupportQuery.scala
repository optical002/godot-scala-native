package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorFileSystemImportFormatSupportQuery`, extends `RefCounted`. */
abstract class EditorFileSystemImportFormatSupportQuery extends RefCounted {

}

object EditorFileSystemImportFormatSupportQuery {
  /** Class metadata for Gd[EditorFileSystemImportFormatSupportQuery] lifetime management and casting. */
  given GodotClass[EditorFileSystemImportFormatSupportQuery] with {
    def className = "EditorFileSystemImportFormatSupportQuery"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorFileSystemImportFormatSupportQuery = new EditorFileSystemImportFormatSupportQuery {}.withHost(o.objectPtr)
    def unwrap(t: EditorFileSystemImportFormatSupportQuery): GodotObject = t.hostObject
  }
}
