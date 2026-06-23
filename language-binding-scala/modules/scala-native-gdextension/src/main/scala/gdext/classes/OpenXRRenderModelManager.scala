package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRRenderModelManager`, extends `Node3D`. */
abstract class OpenXRRenderModelManager extends Node3D {

  /** OpenXRRenderModelManager.get_tracker */
  final def getTracker(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRRenderModelManager", "get_tracker", 2456466356L), hostObject.objectPtr)

  /** OpenXRRenderModelManager.set_tracker */
  final def setTracker(tracker: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRRenderModelManager", "set_tracker", 2814627380L), hostObject.objectPtr, tracker)

  /** OpenXRRenderModelManager.get_make_local_to_pose */
  final def getMakeLocalToPose(): String =
    Ptrcall.call0[String](MethodBind.get("OpenXRRenderModelManager", "get_make_local_to_pose", 201670096L), hostObject.objectPtr)

  /** OpenXRRenderModelManager.set_make_local_to_pose */
  final def setMakeLocalToPose(make_local_to_pose: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRRenderModelManager", "set_make_local_to_pose", 83702148L), hostObject.objectPtr, make_local_to_pose)

}

object OpenXRRenderModelManager {
  /** Class metadata for Gd[OpenXRRenderModelManager] lifetime management and casting. */
  given GodotClass[OpenXRRenderModelManager] with {
    def className = "OpenXRRenderModelManager"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRRenderModelManager = new OpenXRRenderModelManager {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRRenderModelManager): GodotObject = t.hostObject
  }
}
