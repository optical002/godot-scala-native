package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Performance`, extends `Object`. */
abstract class Performance extends Object {
  override def godotClassName: String = "Performance"

  /** Performance.get_monitor */
  final def getMonitor(monitor: gdext.classes.Performance.Monitor): Double = {
    if (gdext.classes.Performance.mb_get_monitor == null) gdext.classes.Performance.mb_get_monitor = MethodBind.get("Performance", "get_monitor", 1943275655L)
    Ptrcall.call1[Long, Double](gdext.classes.Performance.mb_get_monitor, livePtr, monitor)
  }

  /** Performance.remove_custom_monitor */
  final def removeCustomMonitor(id: String): Unit = {
    if (gdext.classes.Performance.mb_remove_custom_monitor == null) gdext.classes.Performance.mb_remove_custom_monitor = MethodBind.get("Performance", "remove_custom_monitor", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Performance.mb_remove_custom_monitor, livePtr, SnArg(id))
  }

  /** Performance.has_custom_monitor */
  final def hasCustomMonitor(id: String): Boolean = {
    if (gdext.classes.Performance.mb_has_custom_monitor == null) gdext.classes.Performance.mb_has_custom_monitor = MethodBind.get("Performance", "has_custom_monitor", 2041966384L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Performance.mb_has_custom_monitor, livePtr, SnArg(id))
  }

  /** Performance.get_monitor_modification_time */
  final def getMonitorModificationTime(): Long = {
    if (gdext.classes.Performance.mb_get_monitor_modification_time == null) gdext.classes.Performance.mb_get_monitor_modification_time = MethodBind.get("Performance", "get_monitor_modification_time", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.Performance.mb_get_monitor_modification_time, livePtr)
  }

}

object Performance {
  private[classes] var mb_get_monitor: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_custom_monitor: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_custom_monitor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_monitor_modification_time: GDExtensionMethodBindPtr = null

  private var instance: Performance = null

  /** The process-global Performance singleton instance. */
  def singleton: Performance = {
    if (instance == null)
      instance = Wrappers.borrowed[Performance](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("Performance").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: Performance.get_monitor */
  final def getMonitor(monitor: gdext.classes.Performance.Monitor): Double =
    singleton.getMonitor(monitor)

  /** Forwards to [[singleton]]: Performance.remove_custom_monitor */
  final def removeCustomMonitor(id: String): Unit =
    singleton.removeCustomMonitor(id)

  /** Forwards to [[singleton]]: Performance.has_custom_monitor */
  final def hasCustomMonitor(id: String): Boolean =
    singleton.hasCustomMonitor(id)

  /** Forwards to [[singleton]]: Performance.get_monitor_modification_time */
  final def getMonitorModificationTime(): Long =
    singleton.getMonitorModificationTime()

  /** Godot enum `Performance.Monitor`. */
  opaque type Monitor <: Long = Long

  object Monitor {
    final val TimeFps: Monitor = 0L.asInstanceOf[Monitor]
    final val TimeProcess: Monitor = 1L.asInstanceOf[Monitor]
    final val TimePhysicsProcess: Monitor = 2L.asInstanceOf[Monitor]
    final val TimeNavigationProcess: Monitor = 3L.asInstanceOf[Monitor]
    final val MemoryStatic: Monitor = 4L.asInstanceOf[Monitor]
    final val MemoryStaticMax: Monitor = 5L.asInstanceOf[Monitor]
    final val MemoryMessageBufferMax: Monitor = 6L.asInstanceOf[Monitor]
    final val ObjectCount: Monitor = 7L.asInstanceOf[Monitor]
    final val ObjectResourceCount: Monitor = 8L.asInstanceOf[Monitor]
    final val ObjectNodeCount: Monitor = 9L.asInstanceOf[Monitor]
    final val ObjectOrphanNodeCount: Monitor = 10L.asInstanceOf[Monitor]
    final val RenderTotalObjectsInFrame: Monitor = 11L.asInstanceOf[Monitor]
    final val RenderTotalPrimitivesInFrame: Monitor = 12L.asInstanceOf[Monitor]
    final val RenderTotalDrawCallsInFrame: Monitor = 13L.asInstanceOf[Monitor]
    final val RenderVideoMemUsed: Monitor = 14L.asInstanceOf[Monitor]
    final val RenderTextureMemUsed: Monitor = 15L.asInstanceOf[Monitor]
    final val RenderBufferMemUsed: Monitor = 16L.asInstanceOf[Monitor]
    final val Physics2dActiveObjects: Monitor = 17L.asInstanceOf[Monitor]
    final val Physics2dCollisionPairs: Monitor = 18L.asInstanceOf[Monitor]
    final val Physics2dIslandCount: Monitor = 19L.asInstanceOf[Monitor]
    final val Physics3dActiveObjects: Monitor = 20L.asInstanceOf[Monitor]
    final val Physics3dCollisionPairs: Monitor = 21L.asInstanceOf[Monitor]
    final val Physics3dIslandCount: Monitor = 22L.asInstanceOf[Monitor]
    final val AudioOutputLatency: Monitor = 23L.asInstanceOf[Monitor]
    final val NavigationActiveMaps: Monitor = 24L.asInstanceOf[Monitor]
    final val NavigationRegionCount: Monitor = 25L.asInstanceOf[Monitor]
    final val NavigationAgentCount: Monitor = 26L.asInstanceOf[Monitor]
    final val NavigationLinkCount: Monitor = 27L.asInstanceOf[Monitor]
    final val NavigationPolygonCount: Monitor = 28L.asInstanceOf[Monitor]
    final val NavigationEdgeCount: Monitor = 29L.asInstanceOf[Monitor]
    final val NavigationEdgeMergeCount: Monitor = 30L.asInstanceOf[Monitor]
    final val NavigationEdgeConnectionCount: Monitor = 31L.asInstanceOf[Monitor]
    final val NavigationEdgeFreeCount: Monitor = 32L.asInstanceOf[Monitor]
    final val NavigationObstacleCount: Monitor = 33L.asInstanceOf[Monitor]
    final val PipelineCompilationsCanvas: Monitor = 34L.asInstanceOf[Monitor]
    final val PipelineCompilationsMesh: Monitor = 35L.asInstanceOf[Monitor]
    final val PipelineCompilationsSurface: Monitor = 36L.asInstanceOf[Monitor]
    final val PipelineCompilationsDraw: Monitor = 37L.asInstanceOf[Monitor]
    final val PipelineCompilationsSpecialization: Monitor = 38L.asInstanceOf[Monitor]
    final val Navigation2dActiveMaps: Monitor = 39L.asInstanceOf[Monitor]
    final val Navigation2dRegionCount: Monitor = 40L.asInstanceOf[Monitor]
    final val Navigation2dAgentCount: Monitor = 41L.asInstanceOf[Monitor]
    final val Navigation2dLinkCount: Monitor = 42L.asInstanceOf[Monitor]
    final val Navigation2dPolygonCount: Monitor = 43L.asInstanceOf[Monitor]
    final val Navigation2dEdgeCount: Monitor = 44L.asInstanceOf[Monitor]
    final val Navigation2dEdgeMergeCount: Monitor = 45L.asInstanceOf[Monitor]
    final val Navigation2dEdgeConnectionCount: Monitor = 46L.asInstanceOf[Monitor]
    final val Navigation2dEdgeFreeCount: Monitor = 47L.asInstanceOf[Monitor]
    final val Navigation2dObstacleCount: Monitor = 48L.asInstanceOf[Monitor]
    final val Navigation3dActiveMaps: Monitor = 49L.asInstanceOf[Monitor]
    final val Navigation3dRegionCount: Monitor = 50L.asInstanceOf[Monitor]
    final val Navigation3dAgentCount: Monitor = 51L.asInstanceOf[Monitor]
    final val Navigation3dLinkCount: Monitor = 52L.asInstanceOf[Monitor]
    final val Navigation3dPolygonCount: Monitor = 53L.asInstanceOf[Monitor]
    final val Navigation3dEdgeCount: Monitor = 54L.asInstanceOf[Monitor]
    final val Navigation3dEdgeMergeCount: Monitor = 55L.asInstanceOf[Monitor]
    final val Navigation3dEdgeConnectionCount: Monitor = 56L.asInstanceOf[Monitor]
    final val Navigation3dEdgeFreeCount: Monitor = 57L.asInstanceOf[Monitor]
    final val Navigation3dObstacleCount: Monitor = 58L.asInstanceOf[Monitor]
    final val MonitorMax: Monitor = 59L.asInstanceOf[Monitor]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Monitor = value.asInstanceOf[Monitor]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Monitor] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 35L, 36L, 37L, 38L, 39L, 40L, 41L, 42L, 43L, 44L, 45L, 46L, 47L, 48L, 49L, 50L, 51L, 52L, 53L, 54L, 55L, 56L, 57L, 58L, 59L).asInstanceOf[scala.IArray[Monitor]]

    extension (self: Monitor)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "TimeFps"
        case 1L => "TimeProcess"
        case 2L => "TimePhysicsProcess"
        case 3L => "TimeNavigationProcess"
        case 4L => "MemoryStatic"
        case 5L => "MemoryStaticMax"
        case 6L => "MemoryMessageBufferMax"
        case 7L => "ObjectCount"
        case 8L => "ObjectResourceCount"
        case 9L => "ObjectNodeCount"
        case 10L => "ObjectOrphanNodeCount"
        case 11L => "RenderTotalObjectsInFrame"
        case 12L => "RenderTotalPrimitivesInFrame"
        case 13L => "RenderTotalDrawCallsInFrame"
        case 14L => "RenderVideoMemUsed"
        case 15L => "RenderTextureMemUsed"
        case 16L => "RenderBufferMemUsed"
        case 17L => "Physics2dActiveObjects"
        case 18L => "Physics2dCollisionPairs"
        case 19L => "Physics2dIslandCount"
        case 20L => "Physics3dActiveObjects"
        case 21L => "Physics3dCollisionPairs"
        case 22L => "Physics3dIslandCount"
        case 23L => "AudioOutputLatency"
        case 24L => "NavigationActiveMaps"
        case 25L => "NavigationRegionCount"
        case 26L => "NavigationAgentCount"
        case 27L => "NavigationLinkCount"
        case 28L => "NavigationPolygonCount"
        case 29L => "NavigationEdgeCount"
        case 30L => "NavigationEdgeMergeCount"
        case 31L => "NavigationEdgeConnectionCount"
        case 32L => "NavigationEdgeFreeCount"
        case 33L => "NavigationObstacleCount"
        case 34L => "PipelineCompilationsCanvas"
        case 35L => "PipelineCompilationsMesh"
        case 36L => "PipelineCompilationsSurface"
        case 37L => "PipelineCompilationsDraw"
        case 38L => "PipelineCompilationsSpecialization"
        case 39L => "Navigation2dActiveMaps"
        case 40L => "Navigation2dRegionCount"
        case 41L => "Navigation2dAgentCount"
        case 42L => "Navigation2dLinkCount"
        case 43L => "Navigation2dPolygonCount"
        case 44L => "Navigation2dEdgeCount"
        case 45L => "Navigation2dEdgeMergeCount"
        case 46L => "Navigation2dEdgeConnectionCount"
        case 47L => "Navigation2dEdgeFreeCount"
        case 48L => "Navigation2dObstacleCount"
        case 49L => "Navigation3dActiveMaps"
        case 50L => "Navigation3dRegionCount"
        case 51L => "Navigation3dAgentCount"
        case 52L => "Navigation3dLinkCount"
        case 53L => "Navigation3dPolygonCount"
        case 54L => "Navigation3dEdgeCount"
        case 55L => "Navigation3dEdgeMergeCount"
        case 56L => "Navigation3dEdgeConnectionCount"
        case 57L => "Navigation3dEdgeFreeCount"
        case 58L => "Navigation3dObstacleCount"
        case 59L => "MonitorMax"
        case other => other.toString
      }
  }

  /** Godot enum `Performance.MonitorType`. */
  opaque type MonitorType <: Long = Long

  object MonitorType {
    final val Quantity: MonitorType = 0L.asInstanceOf[MonitorType]
    final val Memory: MonitorType = 1L.asInstanceOf[MonitorType]
    final val Time: MonitorType = 2L.asInstanceOf[MonitorType]
    final val Percentage: MonitorType = 3L.asInstanceOf[MonitorType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): MonitorType = value.asInstanceOf[MonitorType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[MonitorType] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[MonitorType]]

    extension (self: MonitorType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Quantity"
        case 1L => "Memory"
        case 2L => "Time"
        case 3L => "Percentage"
        case other => other.toString
      }
  }
}
