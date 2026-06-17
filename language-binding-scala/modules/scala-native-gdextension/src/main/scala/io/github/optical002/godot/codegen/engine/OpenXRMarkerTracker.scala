package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRMarkerTracker`, extends `OpenXRSpatialEntityTracker`. */
abstract class OpenXRMarkerTracker extends OpenXRSpatialEntityTracker {

  /** OpenXRMarkerTracker.set_bounds_size */
  final def setBoundsSize(bounds_size: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRMarkerTracker", "set_bounds_size", 743155724L), hostObject.objectPtr, bounds_size)

  /** OpenXRMarkerTracker.get_bounds_size */
  final def getBoundsSize(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("OpenXRMarkerTracker", "get_bounds_size", 3341600327L), hostObject.objectPtr)

  /** OpenXRMarkerTracker.set_marker_type */
  final def setMarkerType(marker_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRMarkerTracker", "set_marker_type", 2156241362L), hostObject.objectPtr, marker_type)

  /** OpenXRMarkerTracker.get_marker_type */
  final def getMarkerType(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRMarkerTracker", "get_marker_type", 612702862L), hostObject.objectPtr)

  /** OpenXRMarkerTracker.set_marker_id */
  final def setMarkerId(marker_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRMarkerTracker", "set_marker_id", 1286410249L), hostObject.objectPtr, marker_id)

  /** OpenXRMarkerTracker.get_marker_id */
  final def getMarkerId(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRMarkerTracker", "get_marker_id", 3905245786L), hostObject.objectPtr)

}

object OpenXRMarkerTracker {
  /** Class metadata for Gd[OpenXRMarkerTracker] lifetime management and casting. */
  given GodotClass[OpenXRMarkerTracker] with {
    def className = "OpenXRMarkerTracker"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRMarkerTracker = new OpenXRMarkerTracker {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRMarkerTracker): GodotObject = t.hostObject
  }
}
