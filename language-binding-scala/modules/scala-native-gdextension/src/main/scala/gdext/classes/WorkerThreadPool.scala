package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `WorkerThreadPool`, extends `Object`. */
abstract class WorkerThreadPool extends Object {
  override def godotClassName: String = "WorkerThreadPool"

  /** WorkerThreadPool.is_task_completed */
  final def isTaskCompleted(task_id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("WorkerThreadPool", "is_task_completed", 1116898809L), hostObject.objectPtr, task_id)

  /** WorkerThreadPool.wait_for_task_completion */
  final def waitForTaskCompletion(task_id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("WorkerThreadPool", "wait_for_task_completion", 844576869L), hostObject.objectPtr, task_id)

  /** WorkerThreadPool.get_caller_task_id */
  final def getCallerTaskId(): Long =
    Ptrcall.call0[Long](MethodBind.get("WorkerThreadPool", "get_caller_task_id", 3905245786L), hostObject.objectPtr)

  /** WorkerThreadPool.is_group_task_completed */
  final def isGroupTaskCompleted(group_id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("WorkerThreadPool", "is_group_task_completed", 1116898809L), hostObject.objectPtr, group_id)

  /** WorkerThreadPool.get_group_processed_element_count */
  final def getGroupProcessedElementCount(group_id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("WorkerThreadPool", "get_group_processed_element_count", 923996154L), hostObject.objectPtr, group_id)

  /** WorkerThreadPool.wait_for_group_task_completion */
  final def waitForGroupTaskCompletion(group_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("WorkerThreadPool", "wait_for_group_task_completion", 1286410249L), hostObject.objectPtr, group_id)

  /** WorkerThreadPool.get_caller_group_id */
  final def getCallerGroupId(): Long =
    Ptrcall.call0[Long](MethodBind.get("WorkerThreadPool", "get_caller_group_id", 3905245786L), hostObject.objectPtr)

}

object WorkerThreadPool {
  /** The process-global WorkerThreadPool singleton instance. */
  def singleton: WorkerThreadPool = new WorkerThreadPool {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("WorkerThreadPool").ptr))
}
