package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Joint3D`, extends `Node3D`. */
abstract class Joint3D extends Node3D {

  /** Joint3D.set_solver_priority */
  final def setSolverPriority(priority: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Joint3D", "set_solver_priority", 1286410249L), hostObject.objectPtr, priority)

  /** Joint3D.get_solver_priority */
  final def getSolverPriority(): Long =
    Ptrcall.call0[Long](MethodBind.get("Joint3D", "get_solver_priority", 3905245786L), hostObject.objectPtr)

  /** Joint3D.set_exclude_nodes_from_collision */
  final def setExcludeNodesFromCollision(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Joint3D", "set_exclude_nodes_from_collision", 2586408642L), hostObject.objectPtr, enable)

  /** Joint3D.get_exclude_nodes_from_collision */
  final def getExcludeNodesFromCollision(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Joint3D", "get_exclude_nodes_from_collision", 36873697L), hostObject.objectPtr)

}

object Joint3D {
  /** Class metadata for Gd[Joint3D] lifetime management and casting. */
  given GodotClass[Joint3D] with {
    def className = "Joint3D"
    def isRefCounted = false
    def wrap(o: GodotObject): Joint3D = new Joint3D {}.withHost(o.objectPtr)
    def unwrap(t: Joint3D): GodotObject = t.hostObject
  }
}
