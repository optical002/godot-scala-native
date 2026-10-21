package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorUndoRedoManager`, extends `Object`. */
abstract class EditorUndoRedoManager extends Object {
  override def godotClassName: String = "EditorUndoRedoManager"

  /** EditorUndoRedoManager.create_action */
  final def createAction(name: String, merge_mode: Long, custom_context: Object, backward_undo_ops: Boolean, mark_unsaved: Boolean): Unit = {
    if (gdext.classes.EditorUndoRedoManager.mb_create_action == null) gdext.classes.EditorUndoRedoManager.mb_create_action = MethodBind.get("EditorUndoRedoManager", "create_action", 796197507L)
    Ptrcall.callVoid5(gdext.classes.EditorUndoRedoManager.mb_create_action, livePtr, name, merge_mode, Wrappers.handle(custom_context), backward_undo_ops, mark_unsaved)
  }

  /** EditorUndoRedoManager.commit_action */
  final def commitAction(execute: Boolean): Unit = {
    if (gdext.classes.EditorUndoRedoManager.mb_commit_action == null) gdext.classes.EditorUndoRedoManager.mb_commit_action = MethodBind.get("EditorUndoRedoManager", "commit_action", 3216645846L)
    Ptrcall.callVoid1(gdext.classes.EditorUndoRedoManager.mb_commit_action, livePtr, execute)
  }

  /** EditorUndoRedoManager.is_committing_action */
  final def isCommittingAction(): Boolean = {
    if (gdext.classes.EditorUndoRedoManager.mb_is_committing_action == null) gdext.classes.EditorUndoRedoManager.mb_is_committing_action = MethodBind.get("EditorUndoRedoManager", "is_committing_action", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorUndoRedoManager.mb_is_committing_action, livePtr)
  }

  /** EditorUndoRedoManager.force_fixed_history */
  final def forceFixedHistory(): Unit = {
    if (gdext.classes.EditorUndoRedoManager.mb_force_fixed_history == null) gdext.classes.EditorUndoRedoManager.mb_force_fixed_history = MethodBind.get("EditorUndoRedoManager", "force_fixed_history", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorUndoRedoManager.mb_force_fixed_history, livePtr)
  }

  /** EditorUndoRedoManager.add_do_reference */
  final def addDoReference(`object`: Object): Unit = {
    if (gdext.classes.EditorUndoRedoManager.mb_add_do_reference == null) gdext.classes.EditorUndoRedoManager.mb_add_do_reference = MethodBind.get("EditorUndoRedoManager", "add_do_reference", 3975164845L)
    Ptrcall.callVoid1(gdext.classes.EditorUndoRedoManager.mb_add_do_reference, livePtr, Wrappers.handle(`object`))
  }

  /** EditorUndoRedoManager.add_undo_reference */
  final def addUndoReference(`object`: Object): Unit = {
    if (gdext.classes.EditorUndoRedoManager.mb_add_undo_reference == null) gdext.classes.EditorUndoRedoManager.mb_add_undo_reference = MethodBind.get("EditorUndoRedoManager", "add_undo_reference", 3975164845L)
    Ptrcall.callVoid1(gdext.classes.EditorUndoRedoManager.mb_add_undo_reference, livePtr, Wrappers.handle(`object`))
  }

  /** EditorUndoRedoManager.get_object_history_id */
  final def getObjectHistoryId(`object`: Object): Long = {
    if (gdext.classes.EditorUndoRedoManager.mb_get_object_history_id == null) gdext.classes.EditorUndoRedoManager.mb_get_object_history_id = MethodBind.get("EditorUndoRedoManager", "get_object_history_id", 1107568780L)
    Ptrcall.call1[GodotObject, Long](gdext.classes.EditorUndoRedoManager.mb_get_object_history_id, livePtr, Wrappers.handle(`object`))
  }

  /** EditorUndoRedoManager.get_history_undo_redo */
  final def getHistoryUndoRedo(id: Long): UndoRedo = {
    if (gdext.classes.EditorUndoRedoManager.mb_get_history_undo_redo == null) gdext.classes.EditorUndoRedoManager.mb_get_history_undo_redo = MethodBind.get("EditorUndoRedoManager", "get_history_undo_redo", 2417974513L)
    Wrappers.borrowed[UndoRedo](Ptrcall.call1[Long, Long](gdext.classes.EditorUndoRedoManager.mb_get_history_undo_redo, livePtr, id))
  }

  /** EditorUndoRedoManager.clear_history */
  final def clearHistory(id: Long, increase_version: Boolean): Unit = {
    if (gdext.classes.EditorUndoRedoManager.mb_clear_history == null) gdext.classes.EditorUndoRedoManager.mb_clear_history = MethodBind.get("EditorUndoRedoManager", "clear_history", 2020603371L)
    Ptrcall.callVoid2(gdext.classes.EditorUndoRedoManager.mb_clear_history, livePtr, id, increase_version)
  }

}

object EditorUndoRedoManager {
  private[classes] var mb_create_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_commit_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_committing_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_force_fixed_history: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_do_reference: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_undo_reference: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_object_history_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_history_undo_redo: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_history: GDExtensionMethodBindPtr = null
}
