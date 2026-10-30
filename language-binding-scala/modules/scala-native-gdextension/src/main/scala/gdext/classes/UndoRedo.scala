package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `UndoRedo`, extends `Object`. */
abstract class UndoRedo extends Object {
  override def godotClassName: String = "UndoRedo"

  /** UndoRedo.create_action */
  final def createAction(name: String, mergeMode: gdext.classes.UndoRedo.MergeMode = gdext.classes.UndoRedo.MergeMode(0L), backwardUndoOps: Boolean = false): Unit = {
    if (gdext.classes.UndoRedo.mb_create_action == null) gdext.classes.UndoRedo.mb_create_action = MethodBind.get("UndoRedo", "create_action", 3171901514L)
    Ptrcall.callVoid3(gdext.classes.UndoRedo.mb_create_action, livePtr, name, mergeMode, backwardUndoOps)
  }

  /** UndoRedo.commit_action */
  final def commitAction(execute: Boolean = true): Unit = {
    if (gdext.classes.UndoRedo.mb_commit_action == null) gdext.classes.UndoRedo.mb_commit_action = MethodBind.get("UndoRedo", "commit_action", 3216645846L)
    Ptrcall.callVoid1(gdext.classes.UndoRedo.mb_commit_action, livePtr, execute)
  }

  /** UndoRedo.is_committing_action */
  final def isCommittingAction(): Boolean = {
    if (gdext.classes.UndoRedo.mb_is_committing_action == null) gdext.classes.UndoRedo.mb_is_committing_action = MethodBind.get("UndoRedo", "is_committing_action", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.UndoRedo.mb_is_committing_action, livePtr)
  }

  /** UndoRedo.add_do_reference */
  final def addDoReference(`object`: Object): Unit = {
    if (gdext.classes.UndoRedo.mb_add_do_reference == null) gdext.classes.UndoRedo.mb_add_do_reference = MethodBind.get("UndoRedo", "add_do_reference", 3975164845L)
    Ptrcall.callVoid1(gdext.classes.UndoRedo.mb_add_do_reference, livePtr, Wrappers.handle(`object`))
  }

  /** UndoRedo.add_undo_reference */
  final def addUndoReference(`object`: Object): Unit = {
    if (gdext.classes.UndoRedo.mb_add_undo_reference == null) gdext.classes.UndoRedo.mb_add_undo_reference = MethodBind.get("UndoRedo", "add_undo_reference", 3975164845L)
    Ptrcall.callVoid1(gdext.classes.UndoRedo.mb_add_undo_reference, livePtr, Wrappers.handle(`object`))
  }

  /** UndoRedo.start_force_keep_in_merge_ends */
  final def startForceKeepInMergeEnds(): Unit = {
    if (gdext.classes.UndoRedo.mb_start_force_keep_in_merge_ends == null) gdext.classes.UndoRedo.mb_start_force_keep_in_merge_ends = MethodBind.get("UndoRedo", "start_force_keep_in_merge_ends", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.UndoRedo.mb_start_force_keep_in_merge_ends, livePtr)
  }

  /** UndoRedo.end_force_keep_in_merge_ends */
  final def endForceKeepInMergeEnds(): Unit = {
    if (gdext.classes.UndoRedo.mb_end_force_keep_in_merge_ends == null) gdext.classes.UndoRedo.mb_end_force_keep_in_merge_ends = MethodBind.get("UndoRedo", "end_force_keep_in_merge_ends", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.UndoRedo.mb_end_force_keep_in_merge_ends, livePtr)
  }

  /** UndoRedo.get_history_count */
  final def getHistoryCount(): Long = {
    if (gdext.classes.UndoRedo.mb_get_history_count == null) gdext.classes.UndoRedo.mb_get_history_count = MethodBind.get("UndoRedo", "get_history_count", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.UndoRedo.mb_get_history_count, livePtr)
  }

  /** UndoRedo.get_current_action */
  final def getCurrentAction(): Long = {
    if (gdext.classes.UndoRedo.mb_get_current_action == null) gdext.classes.UndoRedo.mb_get_current_action = MethodBind.get("UndoRedo", "get_current_action", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.UndoRedo.mb_get_current_action, livePtr)
  }

  /** UndoRedo.get_action_name */
  final def getActionName(id: Long): String = {
    if (gdext.classes.UndoRedo.mb_get_action_name == null) gdext.classes.UndoRedo.mb_get_action_name = MethodBind.get("UndoRedo", "get_action_name", 990163283L)
    Ptrcall.call1[Long, String](gdext.classes.UndoRedo.mb_get_action_name, livePtr, id)
  }

  /** UndoRedo.clear_history */
  final def clearHistory(increaseVersion: Boolean = true): Unit = {
    if (gdext.classes.UndoRedo.mb_clear_history == null) gdext.classes.UndoRedo.mb_clear_history = MethodBind.get("UndoRedo", "clear_history", 3216645846L)
    Ptrcall.callVoid1(gdext.classes.UndoRedo.mb_clear_history, livePtr, increaseVersion)
  }

  /** UndoRedo.get_current_action_name */
  final def getCurrentActionName(): String = {
    if (gdext.classes.UndoRedo.mb_get_current_action_name == null) gdext.classes.UndoRedo.mb_get_current_action_name = MethodBind.get("UndoRedo", "get_current_action_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.UndoRedo.mb_get_current_action_name, livePtr)
  }

  /** UndoRedo.has_undo */
  final def hasUndo(): Boolean = {
    if (gdext.classes.UndoRedo.mb_has_undo == null) gdext.classes.UndoRedo.mb_has_undo = MethodBind.get("UndoRedo", "has_undo", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.UndoRedo.mb_has_undo, livePtr)
  }

  /** UndoRedo.has_redo */
  final def hasRedo(): Boolean = {
    if (gdext.classes.UndoRedo.mb_has_redo == null) gdext.classes.UndoRedo.mb_has_redo = MethodBind.get("UndoRedo", "has_redo", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.UndoRedo.mb_has_redo, livePtr)
  }

  /** UndoRedo.get_version */
  final def getVersion(): Long = {
    if (gdext.classes.UndoRedo.mb_get_version == null) gdext.classes.UndoRedo.mb_get_version = MethodBind.get("UndoRedo", "get_version", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.UndoRedo.mb_get_version, livePtr)
  }

  /** UndoRedo.set_max_steps */
  final def setMaxSteps(maxSteps: Long): Unit = {
    if (gdext.classes.UndoRedo.mb_set_max_steps == null) gdext.classes.UndoRedo.mb_set_max_steps = MethodBind.get("UndoRedo", "set_max_steps", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.UndoRedo.mb_set_max_steps, livePtr, maxSteps)
  }

  /** UndoRedo.get_max_steps */
  final def getMaxSteps(): Long = {
    if (gdext.classes.UndoRedo.mb_get_max_steps == null) gdext.classes.UndoRedo.mb_get_max_steps = MethodBind.get("UndoRedo", "get_max_steps", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.UndoRedo.mb_get_max_steps, livePtr)
  }

  /** UndoRedo.redo */
  final def redo(): Boolean = {
    if (gdext.classes.UndoRedo.mb_redo == null) gdext.classes.UndoRedo.mb_redo = MethodBind.get("UndoRedo", "redo", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.UndoRedo.mb_redo, livePtr)
  }

  /** UndoRedo.undo */
  final def undo(): Boolean = {
    if (gdext.classes.UndoRedo.mb_undo == null) gdext.classes.UndoRedo.mb_undo = MethodBind.get("UndoRedo", "undo", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.UndoRedo.mb_undo, livePtr)
  }

}

object UndoRedo {
  private[classes] var mb_create_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_commit_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_committing_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_do_reference: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_undo_reference: GDExtensionMethodBindPtr = null
  private[classes] var mb_start_force_keep_in_merge_ends: GDExtensionMethodBindPtr = null
  private[classes] var mb_end_force_keep_in_merge_ends: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_history_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_action_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_history: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_action_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_undo: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_redo: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_version: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_steps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_steps: GDExtensionMethodBindPtr = null
  private[classes] var mb_redo: GDExtensionMethodBindPtr = null
  private[classes] var mb_undo: GDExtensionMethodBindPtr = null

  /** Godot enum `UndoRedo.MergeMode`. */
  opaque type MergeMode <: Long = Long

  object MergeMode {
    final val Disable: MergeMode = 0L.asInstanceOf[MergeMode]
    final val Ends: MergeMode = 1L.asInstanceOf[MergeMode]
    final val All: MergeMode = 2L.asInstanceOf[MergeMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): MergeMode = value.asInstanceOf[MergeMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[MergeMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[MergeMode]]

    extension (self: MergeMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disable"
        case 1L => "Ends"
        case 2L => "All"
        case other => other.toString
      }
  }
}
