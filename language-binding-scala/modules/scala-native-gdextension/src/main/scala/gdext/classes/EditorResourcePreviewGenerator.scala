package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorResourcePreviewGenerator`, extends `RefCounted`. */
abstract class EditorResourcePreviewGenerator extends RefCounted {

}

object EditorResourcePreviewGenerator {
  /** Class metadata for Gd[EditorResourcePreviewGenerator] lifetime management and casting. */
  given GodotClass[EditorResourcePreviewGenerator] with {
    def className = "EditorResourcePreviewGenerator"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorResourcePreviewGenerator = new EditorResourcePreviewGenerator {}.withHost(o.objectPtr)
    def unwrap(t: EditorResourcePreviewGenerator): GodotObject = t.hostObject
  }
}
