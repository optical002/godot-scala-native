package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationServer3D`, extends `Object`. */
abstract class NavigationServer3D extends Object {

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
  /** Class metadata for Gd[NavigationServer3D] lifetime management and casting. */
  given GodotClass[NavigationServer3D] with {
    def className = "NavigationServer3D"
    def isRefCounted = false
    def wrap(o: GodotObject): NavigationServer3D = new NavigationServer3D {}.withHost(o.objectPtr)
    def unwrap(t: NavigationServer3D): GodotObject = t.hostObject
  }

  /** The process-global NavigationServer3D singleton instance. */
  def singleton: NavigationServer3D = new NavigationServer3D {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("NavigationServer3D").ptr))
}
