package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationServer3D`, extends `Object`. */
abstract class NavigationServer3D extends Object {
  override def godotClassName: String = "NavigationServer3D"

  /** NavigationServer3D.region_bake_navigation_mesh */
  final def regionBakeNavigationMesh(navigation_mesh: NavigationMesh, root_node: Node): Unit = {
    if (gdext.classes.NavigationServer3D.mb_region_bake_navigation_mesh == null) gdext.classes.NavigationServer3D.mb_region_bake_navigation_mesh = MethodBind.get("NavigationServer3D", "region_bake_navigation_mesh", 1401173477L)
    Ptrcall.callVoid2(gdext.classes.NavigationServer3D.mb_region_bake_navigation_mesh, livePtr, Wrappers.handle(navigation_mesh), Wrappers.handle(root_node))
  }

  /** NavigationServer3D.is_baking_navigation_mesh */
  final def isBakingNavigationMesh(navigation_mesh: NavigationMesh): Boolean = {
    if (gdext.classes.NavigationServer3D.mb_is_baking_navigation_mesh == null) gdext.classes.NavigationServer3D.mb_is_baking_navigation_mesh = MethodBind.get("NavigationServer3D", "is_baking_navigation_mesh", 3142026141L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.NavigationServer3D.mb_is_baking_navigation_mesh, livePtr, Wrappers.handle(navigation_mesh))
  }

  /** NavigationServer3D.set_active */
  final def setActive(active: Boolean): Unit = {
    if (gdext.classes.NavigationServer3D.mb_set_active == null) gdext.classes.NavigationServer3D.mb_set_active = MethodBind.get("NavigationServer3D", "set_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationServer3D.mb_set_active, livePtr, active)
  }

  /** NavigationServer3D.set_debug_enabled */
  final def setDebugEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationServer3D.mb_set_debug_enabled == null) gdext.classes.NavigationServer3D.mb_set_debug_enabled = MethodBind.get("NavigationServer3D", "set_debug_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationServer3D.mb_set_debug_enabled, livePtr, enabled)
  }

  /** NavigationServer3D.get_debug_enabled */
  final def getDebugEnabled(): Boolean = {
    if (gdext.classes.NavigationServer3D.mb_get_debug_enabled == null) gdext.classes.NavigationServer3D.mb_get_debug_enabled = MethodBind.get("NavigationServer3D", "get_debug_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationServer3D.mb_get_debug_enabled, livePtr)
  }

  /** NavigationServer3D.get_process_info */
  final def getProcessInfo(process_info: Long): Long = {
    if (gdext.classes.NavigationServer3D.mb_get_process_info == null) gdext.classes.NavigationServer3D.mb_get_process_info = MethodBind.get("NavigationServer3D", "get_process_info", 1938440894L)
    Ptrcall.call1[Long, Long](gdext.classes.NavigationServer3D.mb_get_process_info, livePtr, process_info)
  }

}

object NavigationServer3D {
  private[classes] var mb_region_bake_navigation_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_baking_navigation_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_debug_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_info: GDExtensionMethodBindPtr = null

  private var instance: NavigationServer3D = null

  /** The process-global NavigationServer3D singleton instance. */
  def singleton: NavigationServer3D = {
    if (instance == null)
      instance = Wrappers.borrowed[NavigationServer3D](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("NavigationServer3D").ptr)))
    instance
  }
}
