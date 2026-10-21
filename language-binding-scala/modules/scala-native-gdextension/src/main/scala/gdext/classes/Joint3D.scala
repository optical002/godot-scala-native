package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Joint3D`, extends `Node3D`. */
abstract class Joint3D extends Node3D {
  override def godotClassName: String = "Joint3D"

  /** Joint3D.set_solver_priority */
  final def setSolverPriority(priority: Long): Unit = {
    if (gdext.classes.Joint3D.mb_set_solver_priority == null) gdext.classes.Joint3D.mb_set_solver_priority = MethodBind.get("Joint3D", "set_solver_priority", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Joint3D.mb_set_solver_priority, livePtr, priority)
  }

  /** Joint3D.get_solver_priority */
  final def getSolverPriority(): Long = {
    if (gdext.classes.Joint3D.mb_get_solver_priority == null) gdext.classes.Joint3D.mb_get_solver_priority = MethodBind.get("Joint3D", "get_solver_priority", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Joint3D.mb_get_solver_priority, livePtr)
  }

  /** Joint3D.set_exclude_nodes_from_collision */
  final def setExcludeNodesFromCollision(enable: Boolean): Unit = {
    if (gdext.classes.Joint3D.mb_set_exclude_nodes_from_collision == null) gdext.classes.Joint3D.mb_set_exclude_nodes_from_collision = MethodBind.get("Joint3D", "set_exclude_nodes_from_collision", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Joint3D.mb_set_exclude_nodes_from_collision, livePtr, enable)
  }

  /** Joint3D.get_exclude_nodes_from_collision */
  final def getExcludeNodesFromCollision(): Boolean = {
    if (gdext.classes.Joint3D.mb_get_exclude_nodes_from_collision == null) gdext.classes.Joint3D.mb_get_exclude_nodes_from_collision = MethodBind.get("Joint3D", "get_exclude_nodes_from_collision", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Joint3D.mb_get_exclude_nodes_from_collision, livePtr)
  }

}

object Joint3D {
  private[classes] var mb_set_solver_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_solver_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_exclude_nodes_from_collision: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_exclude_nodes_from_collision: GDExtensionMethodBindPtr = null
}
