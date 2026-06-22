package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorUndoRedoManager`, extends `Object`. */
abstract class EditorUndoRedoManager extends Object {

  /** EditorUndoRedoManager.create_action */
  final def createAction(name: String, merge_mode: Long, custom_context: Object, backward_undo_ops: Boolean, mark_unsaved: Boolean): Unit =
    Ptrcall.callVoid5(MethodBind.get("EditorUndoRedoManager", "create_action", 796197507L), hostObject.objectPtr, name, merge_mode, custom_context.hostObject, backward_undo_ops, mark_unsaved)

  /** EditorUndoRedoManager.commit_action */
  final def commitAction(execute: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorUndoRedoManager", "commit_action", 3216645846L), hostObject.objectPtr, execute)

  /** EditorUndoRedoManager.is_committing_action */
  final def isCommittingAction(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorUndoRedoManager", "is_committing_action", 36873697L), hostObject.objectPtr)

  /** EditorUndoRedoManager.force_fixed_history */
  final def forceFixedHistory(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorUndoRedoManager", "force_fixed_history", 3218959716L), hostObject.objectPtr)

  /** EditorUndoRedoManager.add_do_reference */
  final def addDoReference(`object`: Object): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorUndoRedoManager", "add_do_reference", 3975164845L), hostObject.objectPtr, `object`.hostObject)

  /** EditorUndoRedoManager.add_undo_reference */
  final def addUndoReference(`object`: Object): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorUndoRedoManager", "add_undo_reference", 3975164845L), hostObject.objectPtr, `object`.hostObject)

  /** EditorUndoRedoManager.get_object_history_id */
  final def getObjectHistoryId(`object`: Object): Long =
    Ptrcall.call1[GodotObject, Long](MethodBind.get("EditorUndoRedoManager", "get_object_history_id", 1107568780L), hostObject.objectPtr, `object`.hostObject)

  /** EditorUndoRedoManager.get_history_undo_redo */
  final def getHistoryUndoRedo(id: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("EditorUndoRedoManager", "get_history_undo_redo", 2417974513L), hostObject.objectPtr, id)

  /** EditorUndoRedoManager.clear_history */
  final def clearHistory(id: Long, increase_version: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorUndoRedoManager", "clear_history", 2020603371L), hostObject.objectPtr, id, increase_version)

}

object EditorUndoRedoManager {
  /** Class metadata for Gd[EditorUndoRedoManager] lifetime management and casting. */
  given GodotClass[EditorUndoRedoManager] with {
    def className = "EditorUndoRedoManager"
    def isRefCounted = false
    def wrap(o: GodotObject): EditorUndoRedoManager = new EditorUndoRedoManager {}.withHost(o.objectPtr)
    def unwrap(t: EditorUndoRedoManager): GodotObject = t.hostObject
  }
}
