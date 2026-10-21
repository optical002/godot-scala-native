package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorResourcePreview`, extends `Node`. */
abstract class EditorResourcePreview extends Node {
  override def godotClassName: String = "EditorResourcePreview"

  /** EditorResourcePreview.add_preview_generator */
  final def addPreviewGenerator(generator: EditorResourcePreviewGenerator): Unit = {
    if (gdext.classes.EditorResourcePreview.mb_add_preview_generator == null) gdext.classes.EditorResourcePreview.mb_add_preview_generator = MethodBind.get("EditorResourcePreview", "add_preview_generator", 332288124L)
    Ptrcall.callVoid1(gdext.classes.EditorResourcePreview.mb_add_preview_generator, livePtr, Wrappers.handle(generator))
  }

  /** EditorResourcePreview.remove_preview_generator */
  final def removePreviewGenerator(generator: EditorResourcePreviewGenerator): Unit = {
    if (gdext.classes.EditorResourcePreview.mb_remove_preview_generator == null) gdext.classes.EditorResourcePreview.mb_remove_preview_generator = MethodBind.get("EditorResourcePreview", "remove_preview_generator", 332288124L)
    Ptrcall.callVoid1(gdext.classes.EditorResourcePreview.mb_remove_preview_generator, livePtr, Wrappers.handle(generator))
  }

  /** EditorResourcePreview.check_for_invalidation */
  final def checkForInvalidation(path: String): Unit = {
    if (gdext.classes.EditorResourcePreview.mb_check_for_invalidation == null) gdext.classes.EditorResourcePreview.mb_check_for_invalidation = MethodBind.get("EditorResourcePreview", "check_for_invalidation", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorResourcePreview.mb_check_for_invalidation, livePtr, path)
  }

}

object EditorResourcePreview {
  private[classes] var mb_add_preview_generator: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_preview_generator: GDExtensionMethodBindPtr = null
  private[classes] var mb_check_for_invalidation: GDExtensionMethodBindPtr = null
}
