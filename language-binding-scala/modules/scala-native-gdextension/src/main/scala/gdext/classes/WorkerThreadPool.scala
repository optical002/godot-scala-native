package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `WorkerThreadPool`, extends `Object`. */
abstract class WorkerThreadPool extends Object {
  override def godotClassName: String = "WorkerThreadPool"

  /** WorkerThreadPool.is_task_completed */
  final def isTaskCompleted(task_id: Long): Boolean = {
    if (gdext.classes.WorkerThreadPool.mb_is_task_completed == null) gdext.classes.WorkerThreadPool.mb_is_task_completed = MethodBind.get("WorkerThreadPool", "is_task_completed", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.WorkerThreadPool.mb_is_task_completed, livePtr, task_id)
  }

  /** WorkerThreadPool.wait_for_task_completion */
  final def waitForTaskCompletion(task_id: Long): Long = {
    if (gdext.classes.WorkerThreadPool.mb_wait_for_task_completion == null) gdext.classes.WorkerThreadPool.mb_wait_for_task_completion = MethodBind.get("WorkerThreadPool", "wait_for_task_completion", 844576869L)
    Ptrcall.call1[Long, Long](gdext.classes.WorkerThreadPool.mb_wait_for_task_completion, livePtr, task_id)
  }

  /** WorkerThreadPool.get_caller_task_id */
  final def getCallerTaskId(): Long = {
    if (gdext.classes.WorkerThreadPool.mb_get_caller_task_id == null) gdext.classes.WorkerThreadPool.mb_get_caller_task_id = MethodBind.get("WorkerThreadPool", "get_caller_task_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.WorkerThreadPool.mb_get_caller_task_id, livePtr)
  }

  /** WorkerThreadPool.is_group_task_completed */
  final def isGroupTaskCompleted(group_id: Long): Boolean = {
    if (gdext.classes.WorkerThreadPool.mb_is_group_task_completed == null) gdext.classes.WorkerThreadPool.mb_is_group_task_completed = MethodBind.get("WorkerThreadPool", "is_group_task_completed", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.WorkerThreadPool.mb_is_group_task_completed, livePtr, group_id)
  }

  /** WorkerThreadPool.get_group_processed_element_count */
  final def getGroupProcessedElementCount(group_id: Long): Long = {
    if (gdext.classes.WorkerThreadPool.mb_get_group_processed_element_count == null) gdext.classes.WorkerThreadPool.mb_get_group_processed_element_count = MethodBind.get("WorkerThreadPool", "get_group_processed_element_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.WorkerThreadPool.mb_get_group_processed_element_count, livePtr, group_id)
  }

  /** WorkerThreadPool.wait_for_group_task_completion */
  final def waitForGroupTaskCompletion(group_id: Long): Unit = {
    if (gdext.classes.WorkerThreadPool.mb_wait_for_group_task_completion == null) gdext.classes.WorkerThreadPool.mb_wait_for_group_task_completion = MethodBind.get("WorkerThreadPool", "wait_for_group_task_completion", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.WorkerThreadPool.mb_wait_for_group_task_completion, livePtr, group_id)
  }

  /** WorkerThreadPool.get_caller_group_id */
  final def getCallerGroupId(): Long = {
    if (gdext.classes.WorkerThreadPool.mb_get_caller_group_id == null) gdext.classes.WorkerThreadPool.mb_get_caller_group_id = MethodBind.get("WorkerThreadPool", "get_caller_group_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.WorkerThreadPool.mb_get_caller_group_id, livePtr)
  }

}

object WorkerThreadPool {
  private[classes] var mb_is_task_completed: GDExtensionMethodBindPtr = null
  private[classes] var mb_wait_for_task_completion: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_caller_task_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_group_task_completed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_group_processed_element_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_wait_for_group_task_completion: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_caller_group_id: GDExtensionMethodBindPtr = null

  private var instance: WorkerThreadPool = null

  /** The process-global WorkerThreadPool singleton instance. */
  def singleton: WorkerThreadPool = {
    if (instance == null)
      instance = Wrappers.borrowed[WorkerThreadPool](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("WorkerThreadPool").ptr)))
    instance
  }
}
