package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorResourcePreview`, extends `Node`. */
abstract class EditorResourcePreview extends Node {
  override def godotClassName: String = "EditorResourcePreview"

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
