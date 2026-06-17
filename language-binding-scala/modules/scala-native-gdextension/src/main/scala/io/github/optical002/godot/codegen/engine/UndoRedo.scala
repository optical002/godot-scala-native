package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `UndoRedo`, extends `Object`. */
abstract class UndoRedo extends Object {

  /** UndoRedo.create_action */
  final def createAction(name: String, merge_mode: Long, backward_undo_ops: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("UndoRedo", "create_action", 3171901514L), hostObject.objectPtr, name, merge_mode, backward_undo_ops)

  /** UndoRedo.commit_action */
  final def commitAction(execute: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("UndoRedo", "commit_action", 3216645846L), hostObject.objectPtr, execute)

  /** UndoRedo.is_committing_action */
  final def isCommittingAction(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("UndoRedo", "is_committing_action", 36873697L), hostObject.objectPtr)

  /** UndoRedo.add_do_reference */
  final def addDoReference(`object`: Object): Unit =
    Ptrcall.callVoid1(MethodBind.get("UndoRedo", "add_do_reference", 3975164845L), hostObject.objectPtr, `object`.hostObject)

  /** UndoRedo.add_undo_reference */
  final def addUndoReference(`object`: Object): Unit =
    Ptrcall.callVoid1(MethodBind.get("UndoRedo", "add_undo_reference", 3975164845L), hostObject.objectPtr, `object`.hostObject)

  /** UndoRedo.start_force_keep_in_merge_ends */
  final def startForceKeepInMergeEnds(): Unit =
    Ptrcall.callVoid0(MethodBind.get("UndoRedo", "start_force_keep_in_merge_ends", 3218959716L), hostObject.objectPtr)

  /** UndoRedo.end_force_keep_in_merge_ends */
  final def endForceKeepInMergeEnds(): Unit =
    Ptrcall.callVoid0(MethodBind.get("UndoRedo", "end_force_keep_in_merge_ends", 3218959716L), hostObject.objectPtr)

  /** UndoRedo.get_history_count */
  final def getHistoryCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("UndoRedo", "get_history_count", 2455072627L), hostObject.objectPtr)

  /** UndoRedo.get_current_action */
  final def getCurrentAction(): Long =
    Ptrcall.call0[Long](MethodBind.get("UndoRedo", "get_current_action", 2455072627L), hostObject.objectPtr)

  /** UndoRedo.get_action_name */
  final def getActionName(id: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("UndoRedo", "get_action_name", 990163283L), hostObject.objectPtr, id)

  /** UndoRedo.clear_history */
  final def clearHistory(increase_version: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("UndoRedo", "clear_history", 3216645846L), hostObject.objectPtr, increase_version)

  /** UndoRedo.get_current_action_name */
  final def getCurrentActionName(): String =
    Ptrcall.call0[String](MethodBind.get("UndoRedo", "get_current_action_name", 201670096L), hostObject.objectPtr)

  /** UndoRedo.has_undo */
  final def hasUndo(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("UndoRedo", "has_undo", 36873697L), hostObject.objectPtr)

  /** UndoRedo.has_redo */
  final def hasRedo(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("UndoRedo", "has_redo", 36873697L), hostObject.objectPtr)

  /** UndoRedo.get_version */
  final def getVersion(): Long =
    Ptrcall.call0[Long](MethodBind.get("UndoRedo", "get_version", 3905245786L), hostObject.objectPtr)

  /** UndoRedo.set_max_steps */
  final def setMaxSteps(max_steps: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("UndoRedo", "set_max_steps", 1286410249L), hostObject.objectPtr, max_steps)

  /** UndoRedo.get_max_steps */
  final def getMaxSteps(): Long =
    Ptrcall.call0[Long](MethodBind.get("UndoRedo", "get_max_steps", 3905245786L), hostObject.objectPtr)

  /** UndoRedo.redo */
  final def redo(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("UndoRedo", "redo", 2240911060L), hostObject.objectPtr)

  /** UndoRedo.undo */
  final def undo(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("UndoRedo", "undo", 2240911060L), hostObject.objectPtr)

}

object UndoRedo {
  /** Class metadata for Gd[UndoRedo] lifetime management and casting. */
  given GodotClass[UndoRedo] with {
    def className = "UndoRedo"
    def isRefCounted = false
    def wrap(o: GodotObject): UndoRedo = new UndoRedo {}.withHost(o.objectPtr)
    def unwrap(t: UndoRedo): GodotObject = t.hostObject
  }
}
