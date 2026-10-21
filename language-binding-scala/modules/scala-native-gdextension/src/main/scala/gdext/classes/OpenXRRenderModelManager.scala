package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRRenderModelManager`, extends `Node3D`. */
abstract class OpenXRRenderModelManager extends Node3D {
  override def godotClassName: String = "OpenXRRenderModelManager"

  /** OpenXRRenderModelManager.get_tracker */
  final def getTracker(): Long = {
    if (gdext.classes.OpenXRRenderModelManager.mb_get_tracker == null) gdext.classes.OpenXRRenderModelManager.mb_get_tracker = MethodBind.get("OpenXRRenderModelManager", "get_tracker", 2456466356L)
    Ptrcall.call0[Long](gdext.classes.OpenXRRenderModelManager.mb_get_tracker, livePtr)
  }

  /** OpenXRRenderModelManager.set_tracker */
  final def setTracker(tracker: Long): Unit = {
    if (gdext.classes.OpenXRRenderModelManager.mb_set_tracker == null) gdext.classes.OpenXRRenderModelManager.mb_set_tracker = MethodBind.get("OpenXRRenderModelManager", "set_tracker", 2814627380L)
    Ptrcall.callVoid1(gdext.classes.OpenXRRenderModelManager.mb_set_tracker, livePtr, tracker)
  }

  /** OpenXRRenderModelManager.get_make_local_to_pose */
  final def getMakeLocalToPose(): String = {
    if (gdext.classes.OpenXRRenderModelManager.mb_get_make_local_to_pose == null) gdext.classes.OpenXRRenderModelManager.mb_get_make_local_to_pose = MethodBind.get("OpenXRRenderModelManager", "get_make_local_to_pose", 201670096L)
    Ptrcall.call0[String](gdext.classes.OpenXRRenderModelManager.mb_get_make_local_to_pose, livePtr)
  }

  /** OpenXRRenderModelManager.set_make_local_to_pose */
  final def setMakeLocalToPose(make_local_to_pose: String): Unit = {
    if (gdext.classes.OpenXRRenderModelManager.mb_set_make_local_to_pose == null) gdext.classes.OpenXRRenderModelManager.mb_set_make_local_to_pose = MethodBind.get("OpenXRRenderModelManager", "set_make_local_to_pose", 83702148L)
    Ptrcall.callVoid1(gdext.classes.OpenXRRenderModelManager.mb_set_make_local_to_pose, livePtr, make_local_to_pose)
  }

}

object OpenXRRenderModelManager {
  private[classes] var mb_get_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_make_local_to_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_make_local_to_pose: GDExtensionMethodBindPtr = null
}
