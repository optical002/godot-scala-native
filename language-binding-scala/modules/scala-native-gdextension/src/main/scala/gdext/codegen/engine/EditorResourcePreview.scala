package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorResourcePreview`, extends `Node`. */
abstract class EditorResourcePreview extends Node {

  /** EditorResourcePreview.add_preview_generator */
  final def addPreviewGenerator(generator: EditorResourcePreviewGenerator): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorResourcePreview", "add_preview_generator", 332288124L), hostObject.objectPtr, generator.hostObject)

  /** EditorResourcePreview.remove_preview_generator */
  final def removePreviewGenerator(generator: EditorResourcePreviewGenerator): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorResourcePreview", "remove_preview_generator", 332288124L), hostObject.objectPtr, generator.hostObject)

  /** EditorResourcePreview.check_for_invalidation */
  final def checkForInvalidation(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorResourcePreview", "check_for_invalidation", 83702148L), hostObject.objectPtr, path)

}

object EditorResourcePreview {
  /** Class metadata for Gd[EditorResourcePreview] lifetime management and casting. */
  given GodotClass[EditorResourcePreview] with {
    def className = "EditorResourcePreview"
    def isRefCounted = false
    def wrap(o: GodotObject): EditorResourcePreview = new EditorResourcePreview {}.withHost(o.objectPtr)
    def unwrap(t: EditorResourcePreview): GodotObject = t.hostObject
  }
}
