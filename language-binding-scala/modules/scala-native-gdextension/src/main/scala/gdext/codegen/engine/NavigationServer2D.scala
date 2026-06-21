package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationServer2D`, extends `Object`. */
abstract class NavigationServer2D extends Object {

  /** NavigationServer2D.is_baking_navigation_polygon */
  final def isBakingNavigationPolygon(navigation_polygon: NavigationPolygon): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("NavigationServer2D", "is_baking_navigation_polygon", 3729405808L), hostObject.objectPtr, navigation_polygon.hostObject)

  /** NavigationServer2D.set_active */
  final def setActive(active: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationServer2D", "set_active", 2586408642L), hostObject.objectPtr, active)

  /** NavigationServer2D.set_debug_enabled */
  final def setDebugEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationServer2D", "set_debug_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationServer2D.get_debug_enabled */
  final def getDebugEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationServer2D", "get_debug_enabled", 36873697L), hostObject.objectPtr)

  /** NavigationServer2D.get_process_info */
  final def getProcessInfo(process_info: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("NavigationServer2D", "get_process_info", 1640219858L), hostObject.objectPtr, process_info)

}

object NavigationServer2D {
  /** Class metadata for Gd[NavigationServer2D] lifetime management and casting. */
  given GodotClass[NavigationServer2D] with {
    def className = "NavigationServer2D"
    def isRefCounted = false
    def wrap(o: GodotObject): NavigationServer2D = new NavigationServer2D {}.withHost(o.objectPtr)
    def unwrap(t: NavigationServer2D): GodotObject = t.hostObject
  }

  /** The process-global NavigationServer2D singleton instance. */
  def singleton: NavigationServer2D = new NavigationServer2D {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("NavigationServer2D").ptr))
}
