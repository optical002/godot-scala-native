package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationServer2D`, extends `Object`. */
abstract class NavigationServer2D extends Object {
  override def godotClassName: String = "NavigationServer2D"

  /** NavigationServer2D.is_baking_navigation_polygon */
  final def isBakingNavigationPolygon(navigationPolygon: NavigationPolygon): Boolean = {
    if (gdext.classes.NavigationServer2D.mb_is_baking_navigation_polygon == null) gdext.classes.NavigationServer2D.mb_is_baking_navigation_polygon = MethodBind.get("NavigationServer2D", "is_baking_navigation_polygon", 3729405808L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.NavigationServer2D.mb_is_baking_navigation_polygon, livePtr, Wrappers.handle(navigationPolygon))
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
  final def getProcessInfo(processInfo: gdext.classes.NavigationServer2D.ProcessInfo): Long = {
    if (gdext.classes.NavigationServer2D.mb_get_process_info == null) gdext.classes.NavigationServer2D.mb_get_process_info = MethodBind.get("NavigationServer2D", "get_process_info", 1640219858L)
    Ptrcall.call1[Long, Long](gdext.classes.NavigationServer2D.mb_get_process_info, livePtr, processInfo)
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

  /** Forwards to [[singleton]]: NavigationServer2D.is_baking_navigation_polygon */
  final def isBakingNavigationPolygon(navigationPolygon: NavigationPolygon): Boolean =
    singleton.isBakingNavigationPolygon(navigationPolygon)

  /** Forwards to [[singleton]]: NavigationServer2D.set_active */
  final def setActive(active: Boolean): Unit =
    singleton.setActive(active)

  /** Forwards to [[singleton]]: NavigationServer2D.set_debug_enabled */
  final def setDebugEnabled(enabled: Boolean): Unit =
    singleton.setDebugEnabled(enabled)

  /** Forwards to [[singleton]]: NavigationServer2D.get_debug_enabled */
  final def getDebugEnabled(): Boolean =
    singleton.getDebugEnabled()

  /** Forwards to [[singleton]]: NavigationServer2D.get_process_info */
  final def getProcessInfo(processInfo: gdext.classes.NavigationServer2D.ProcessInfo): Long =
    singleton.getProcessInfo(processInfo)

  /** Godot enum `NavigationServer2D.ProcessInfo`. */
  opaque type ProcessInfo <: Long = Long

  object ProcessInfo {
    final val ActiveMaps: ProcessInfo = 0L.asInstanceOf[ProcessInfo]
    final val RegionCount: ProcessInfo = 1L.asInstanceOf[ProcessInfo]
    final val AgentCount: ProcessInfo = 2L.asInstanceOf[ProcessInfo]
    final val LinkCount: ProcessInfo = 3L.asInstanceOf[ProcessInfo]
    final val PolygonCount: ProcessInfo = 4L.asInstanceOf[ProcessInfo]
    final val EdgeCount: ProcessInfo = 5L.asInstanceOf[ProcessInfo]
    final val EdgeMergeCount: ProcessInfo = 6L.asInstanceOf[ProcessInfo]
    final val EdgeConnectionCount: ProcessInfo = 7L.asInstanceOf[ProcessInfo]
    final val EdgeFreeCount: ProcessInfo = 8L.asInstanceOf[ProcessInfo]
    final val ObstacleCount: ProcessInfo = 9L.asInstanceOf[ProcessInfo]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ProcessInfo = value.asInstanceOf[ProcessInfo]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ProcessInfo] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L).asInstanceOf[scala.IArray[ProcessInfo]]

    extension (self: ProcessInfo)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "ActiveMaps"
        case 1L => "RegionCount"
        case 2L => "AgentCount"
        case 3L => "LinkCount"
        case 4L => "PolygonCount"
        case 5L => "EdgeCount"
        case 6L => "EdgeMergeCount"
        case 7L => "EdgeConnectionCount"
        case 8L => "EdgeFreeCount"
        case 9L => "ObstacleCount"
        case other => other.toString
      }
  }
}
