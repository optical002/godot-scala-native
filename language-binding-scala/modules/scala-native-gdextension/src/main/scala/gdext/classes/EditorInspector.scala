package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorInspector`, extends `ScrollContainer`. */
abstract class EditorInspector extends ScrollContainer {
  override def godotClassName: String = "EditorInspector"

  /** EditorInspector.edit */
  final def edit(`object`: Object): Unit = {
    if (gdext.classes.EditorInspector.mb_edit == null) gdext.classes.EditorInspector.mb_edit = MethodBind.get("EditorInspector", "edit", 3975164845L)
    Ptrcall.callVoid1(gdext.classes.EditorInspector.mb_edit, livePtr, Wrappers.handle(`object`))
  }

  /** EditorInspector.get_selected_path */
  final def getSelectedPath(): String = {
    if (gdext.classes.EditorInspector.mb_get_selected_path == null) gdext.classes.EditorInspector.mb_get_selected_path = MethodBind.get("EditorInspector", "get_selected_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorInspector.mb_get_selected_path, livePtr)
  }

  /** EditorInspector.get_edited_object */
  final def getEditedObject(): Object = {
    if (gdext.classes.EditorInspector.mb_get_edited_object == null) gdext.classes.EditorInspector.mb_get_edited_object = MethodBind.get("EditorInspector", "get_edited_object", 2050059866L)
    Wrappers.borrowed[Object](Ptrcall.call0[Long](gdext.classes.EditorInspector.mb_get_edited_object, livePtr))
  }

}

object EditorInspector {
  private[classes] var mb_edit: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selected_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_edited_object: GDExtensionMethodBindPtr = null
}
