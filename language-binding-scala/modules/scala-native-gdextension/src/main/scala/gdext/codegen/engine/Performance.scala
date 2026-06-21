package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Performance`, extends `Object`. */
abstract class Performance extends Object {

  /** Performance.get_monitor */
  final def getMonitor(monitor: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Performance", "get_monitor", 1943275655L), hostObject.objectPtr, monitor)

  /** Performance.remove_custom_monitor */
  final def removeCustomMonitor(id: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Performance", "remove_custom_monitor", 3304788590L), hostObject.objectPtr, id)

  /** Performance.has_custom_monitor */
  final def hasCustomMonitor(id: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Performance", "has_custom_monitor", 2041966384L), hostObject.objectPtr, id)

  /** Performance.get_monitor_modification_time */
  final def getMonitorModificationTime(): Long =
    Ptrcall.call0[Long](MethodBind.get("Performance", "get_monitor_modification_time", 2455072627L), hostObject.objectPtr)

}

object Performance {
  /** Class metadata for Gd[Performance] lifetime management and casting. */
  given GodotClass[Performance] with {
    def className = "Performance"
    def isRefCounted = false
    def wrap(o: GodotObject): Performance = new Performance {}.withHost(o.objectPtr)
    def unwrap(t: Performance): GodotObject = t.hostObject
  }

  /** The process-global Performance singleton instance. */
  def singleton: Performance = new Performance {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("Performance").ptr))
}
