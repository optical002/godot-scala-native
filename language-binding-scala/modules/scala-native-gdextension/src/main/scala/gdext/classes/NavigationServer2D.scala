package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationServer2D`, extends `Object`. */
abstract class NavigationServer2D extends Object {
  override def godotClassName: String = "NavigationServer2D"

  /** NavigationServer2D.is_baking_navigation_polygon */
  final def isBakingNavigationPolygon(navigation_polygon: NavigationPolygon): Boolean = {
    if (gdext.classes.NavigationServer2D.mb_is_baking_navigation_polygon == null) gdext.classes.NavigationServer2D.mb_is_baking_navigation_polygon = MethodBind.get("NavigationServer2D", "is_baking_navigation_polygon", 3729405808L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.NavigationServer2D.mb_is_baking_navigation_polygon, livePtr, Wrappers.handle(navigation_polygon))
  }

  /** NavigationServer2D.set_active */
  final def setActive(active: Boolean): Unit = {
    if (gdext.classes.NavigationServer2D.mb_set_active == null) gdext.classes.NavigationServer2D.mb_set_active = MethodBind.get("NavigationServer2D", "set_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationServer2D.mb_set_active, livePtr, active)
  }

  /** NavigationServer2D.set_debug_enabled */
  final def setDebugEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationServer2D.mb_set_debug_enabled == null) gdext.classes.NavigationServer2D.mb_set_debug_enabled = MethodBind.get("NavigationServer2D", "set_debug_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationServer2D.mb_set_debug_enabled, livePtr, enabled)
  }

  /** NavigationServer2D.get_debug_enabled */
  final def getDebugEnabled(): Boolean = {
    if (gdext.classes.NavigationServer2D.mb_get_debug_enabled == null) gdext.classes.NavigationServer2D.mb_get_debug_enabled = MethodBind.get("NavigationServer2D", "get_debug_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationServer2D.mb_get_debug_enabled, livePtr)
  }

  /** NavigationServer2D.get_process_info */
  final def getProcessInfo(process_info: Long): Long = {
    if (gdext.classes.NavigationServer2D.mb_get_process_info == null) gdext.classes.NavigationServer2D.mb_get_process_info = MethodBind.get("NavigationServer2D", "get_process_info", 1640219858L)
    Ptrcall.call1[Long, Long](gdext.classes.NavigationServer2D.mb_get_process_info, livePtr, process_info)
  }

}

object NavigationServer2D {
  private[classes] var mb_is_baking_navigation_polygon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_debug_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_info: GDExtensionMethodBindPtr = null

  private var instance: NavigationServer2D = null

  /** The process-global NavigationServer2D singleton instance. */
  def singleton: NavigationServer2D = {
    if (instance == null)
      instance = Wrappers.borrowed[NavigationServer2D](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("NavigationServer2D").ptr)))
    instance
  }
}
