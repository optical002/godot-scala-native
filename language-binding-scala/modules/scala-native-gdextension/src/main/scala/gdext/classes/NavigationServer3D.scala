package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationServer3D`, extends `Object`. */
abstract class NavigationServer3D extends Object {
  override def godotClassName: String = "NavigationServer3D"

  /** NavigationServer3D.region_bake_navigation_mesh */
  final def regionBakeNavigationMesh(navigationMesh: NavigationMesh, rootNode: Node): Unit = {
    if (gdext.classes.NavigationServer3D.mb_region_bake_navigation_mesh == null) gdext.classes.NavigationServer3D.mb_region_bake_navigation_mesh = MethodBind.get("NavigationServer3D", "region_bake_navigation_mesh", 1401173477L)
    Ptrcall.callVoid2(gdext.classes.NavigationServer3D.mb_region_bake_navigation_mesh, livePtr, Wrappers.handle(navigationMesh), Wrappers.handle(rootNode))
  }

  /** NavigationServer3D.is_baking_navigation_mesh */
  final def isBakingNavigationMesh(navigationMesh: NavigationMesh): Boolean = {
    if (gdext.classes.NavigationServer3D.mb_is_baking_navigation_mesh == null) gdext.classes.NavigationServer3D.mb_is_baking_navigation_mesh = MethodBind.get("NavigationServer3D", "is_baking_navigation_mesh", 3142026141L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.NavigationServer3D.mb_is_baking_navigation_mesh, livePtr, Wrappers.handle(navigationMesh))
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
  final def getProcessInfo(processInfo: gdext.classes.NavigationServer3D.ProcessInfo): Long = {
    if (gdext.classes.NavigationServer3D.mb_get_process_info == null) gdext.classes.NavigationServer3D.mb_get_process_info = MethodBind.get("NavigationServer3D", "get_process_info", 1938440894L)
    Ptrcall.call1[Long, Long](gdext.classes.NavigationServer3D.mb_get_process_info, livePtr, processInfo)
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

  /** Forwards to [[singleton]]: NavigationServer3D.region_bake_navigation_mesh */
  final def regionBakeNavigationMesh(navigationMesh: NavigationMesh, rootNode: Node): Unit =
    singleton.regionBakeNavigationMesh(navigationMesh, rootNode)

  /** Forwards to [[singleton]]: NavigationServer3D.is_baking_navigation_mesh */
  final def isBakingNavigationMesh(navigationMesh: NavigationMesh): Boolean =
    singleton.isBakingNavigationMesh(navigationMesh)

  /** Forwards to [[singleton]]: NavigationServer3D.set_active */
  final def setActive(active: Boolean): Unit =
    singleton.setActive(active)

  /** Forwards to [[singleton]]: NavigationServer3D.set_debug_enabled */
  final def setDebugEnabled(enabled: Boolean): Unit =
    singleton.setDebugEnabled(enabled)

  /** Forwards to [[singleton]]: NavigationServer3D.get_debug_enabled */
  final def getDebugEnabled(): Boolean =
    singleton.getDebugEnabled()

  /** Forwards to [[singleton]]: NavigationServer3D.get_process_info */
  final def getProcessInfo(processInfo: gdext.classes.NavigationServer3D.ProcessInfo): Long =
    singleton.getProcessInfo(processInfo)

  /** Godot enum `NavigationServer3D.ProcessInfo`. */
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
