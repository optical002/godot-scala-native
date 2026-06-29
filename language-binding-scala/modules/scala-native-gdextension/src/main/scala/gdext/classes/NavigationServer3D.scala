package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationServer3D`, extends `Object`. */
abstract class NavigationServer3D extends Object {
  override def godotClassName: String = "NavigationServer3D"

  /** NavigationServer3D.region_bake_navigation_mesh */
  final def regionBakeNavigationMesh(navigation_mesh: NavigationMesh, root_node: Node): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationServer3D", "region_bake_navigation_mesh", 1401173477L), hostObject.objectPtr, navigation_mesh.hostObject, root_node.hostObject)

  /** NavigationServer3D.is_baking_navigation_mesh */
  final def isBakingNavigationMesh(navigation_mesh: NavigationMesh): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("NavigationServer3D", "is_baking_navigation_mesh", 3142026141L), hostObject.objectPtr, navigation_mesh.hostObject)

  /** NavigationServer3D.set_active */
  final def setActive(active: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationServer3D", "set_active", 2586408642L), hostObject.objectPtr, active)

  /** NavigationServer3D.set_debug_enabled */
  final def setDebugEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationServer3D", "set_debug_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationServer3D.get_debug_enabled */
  final def getDebugEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationServer3D", "get_debug_enabled", 36873697L), hostObject.objectPtr)

  /** NavigationServer3D.get_process_info */
  final def getProcessInfo(process_info: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("NavigationServer3D", "get_process_info", 1938440894L), hostObject.objectPtr, process_info)

}

object NavigationServer3D {
  /** The process-global NavigationServer3D singleton instance. */
  def singleton: NavigationServer3D = new NavigationServer3D {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("NavigationServer3D").ptr))
}
