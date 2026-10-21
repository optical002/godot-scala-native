package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Performance`, extends `Object`. */
abstract class Performance extends Object {
  override def godotClassName: String = "Performance"

  /** Performance.get_monitor */
  final def getMonitor(monitor: Long): Double = {
    if (gdext.classes.Performance.mb_get_monitor == null) gdext.classes.Performance.mb_get_monitor = MethodBind.get("Performance", "get_monitor", 1943275655L)
    Ptrcall.call1[Long, Double](gdext.classes.Performance.mb_get_monitor, livePtr, monitor)
  }

  /** Performance.remove_custom_monitor */
  final def removeCustomMonitor(id: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Performance.mb_remove_custom_monitor == null) gdext.classes.Performance.mb_remove_custom_monitor = MethodBind.get("Performance", "remove_custom_monitor", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Performance.mb_remove_custom_monitor, livePtr, id)
  }

  /** Performance.has_custom_monitor */
  final def hasCustomMonitor(id: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Performance.mb_has_custom_monitor == null) gdext.classes.Performance.mb_has_custom_monitor = MethodBind.get("Performance", "has_custom_monitor", 2041966384L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.Performance.mb_has_custom_monitor, livePtr, id)
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
}
