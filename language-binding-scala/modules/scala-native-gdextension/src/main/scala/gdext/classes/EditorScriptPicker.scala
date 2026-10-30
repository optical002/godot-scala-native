package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorScriptPicker`, extends `EditorResourcePicker`. */
abstract class EditorScriptPicker extends EditorResourcePicker {
  override def godotClassName: String = "EditorScriptPicker"

  /** EditorScriptPicker.set_script_owner */
  final def setScriptOwner(ownerNode: Node): Unit = {
    if (gdext.classes.EditorScriptPicker.mb_set_script_owner == null) gdext.classes.EditorScriptPicker.mb_set_script_owner = MethodBind.get("EditorScriptPicker", "set_script_owner", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.EditorScriptPicker.mb_set_script_owner, livePtr, Wrappers.handle(ownerNode))
  }

  /** EditorScriptPicker.get_script_owner */
  final def getScriptOwner(): Node = {
    if (gdext.classes.EditorScriptPicker.mb_get_script_owner == null) gdext.classes.EditorScriptPicker.mb_get_script_owner = MethodBind.get("EditorScriptPicker", "get_script_owner", 3160264692L)
    Wrappers.borrowed[Node](Ptrcall.call0[Long](gdext.classes.EditorScriptPicker.mb_get_script_owner, livePtr))
  }

}

object EditorScriptPicker {
  private[classes] var mb_set_script_owner: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_script_owner: GDExtensionMethodBindPtr = null
}
