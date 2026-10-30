package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRRenderModelManager`, extends `Node3D`. */
abstract class OpenXRRenderModelManager extends Node3D {
  override def godotClassName: String = "OpenXRRenderModelManager"

  /** OpenXRRenderModelManager.get_tracker */
  final def getTracker(): gdext.classes.OpenXRRenderModelManager.RenderModelTracker = {
    if (gdext.classes.OpenXRRenderModelManager.mb_get_tracker == null) gdext.classes.OpenXRRenderModelManager.mb_get_tracker = MethodBind.get("OpenXRRenderModelManager", "get_tracker", 2456466356L)
    gdext.classes.OpenXRRenderModelManager.RenderModelTracker(Ptrcall.call0[Long](gdext.classes.OpenXRRenderModelManager.mb_get_tracker, livePtr))
  }

  /** OpenXRRenderModelManager.set_tracker */
  final def setTracker(tracker: gdext.classes.OpenXRRenderModelManager.RenderModelTracker): Unit = {
    if (gdext.classes.OpenXRRenderModelManager.mb_set_tracker == null) gdext.classes.OpenXRRenderModelManager.mb_set_tracker = MethodBind.get("OpenXRRenderModelManager", "set_tracker", 2814627380L)
    Ptrcall.callVoid1(gdext.classes.OpenXRRenderModelManager.mb_set_tracker, livePtr, tracker)
  }

  /** OpenXRRenderModelManager.get_make_local_to_pose */
  final def getMakeLocalToPose(): String = {
    if (gdext.classes.OpenXRRenderModelManager.mb_get_make_local_to_pose == null) gdext.classes.OpenXRRenderModelManager.mb_get_make_local_to_pose = MethodBind.get("OpenXRRenderModelManager", "get_make_local_to_pose", 201670096L)
    Ptrcall.call0[String](gdext.classes.OpenXRRenderModelManager.mb_get_make_local_to_pose, livePtr)
  }

  /** OpenXRRenderModelManager.set_make_local_to_pose */
  final def setMakeLocalToPose(makeLocalToPose: String): Unit = {
    if (gdext.classes.OpenXRRenderModelManager.mb_set_make_local_to_pose == null) gdext.classes.OpenXRRenderModelManager.mb_set_make_local_to_pose = MethodBind.get("OpenXRRenderModelManager", "set_make_local_to_pose", 83702148L)
    Ptrcall.callVoid1(gdext.classes.OpenXRRenderModelManager.mb_set_make_local_to_pose, livePtr, makeLocalToPose)
  }

}

object OpenXRRenderModelManager {
  private[classes] var mb_get_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_make_local_to_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_make_local_to_pose: GDExtensionMethodBindPtr = null

  /** Godot enum `OpenXRRenderModelManager.RenderModelTracker`. */
  opaque type RenderModelTracker <: Long = Long

  object RenderModelTracker {
    final val Any: RenderModelTracker = 0L.asInstanceOf[RenderModelTracker]
    final val NoneSet: RenderModelTracker = 1L.asInstanceOf[RenderModelTracker]
    final val LeftHand: RenderModelTracker = 2L.asInstanceOf[RenderModelTracker]
    final val RightHand: RenderModelTracker = 3L.asInstanceOf[RenderModelTracker]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): RenderModelTracker = value.asInstanceOf[RenderModelTracker]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[RenderModelTracker] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[RenderModelTracker]]

    extension (self: RenderModelTracker)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Any"
        case 1L => "NoneSet"
        case 2L => "LeftHand"
        case 3L => "RightHand"
        case other => other.toString
      }
  }
}
