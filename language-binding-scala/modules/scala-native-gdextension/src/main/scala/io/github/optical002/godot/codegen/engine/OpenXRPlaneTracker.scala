package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRPlaneTracker`, extends `OpenXRSpatialEntityTracker`. */
abstract class OpenXRPlaneTracker extends OpenXRSpatialEntityTracker {

  /** OpenXRPlaneTracker.set_bounds_size */
  final def setBoundsSize(bounds_size: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRPlaneTracker", "set_bounds_size", 743155724L), hostObject.objectPtr, bounds_size)

  /** OpenXRPlaneTracker.get_bounds_size */
  final def getBoundsSize(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("OpenXRPlaneTracker", "get_bounds_size", 3341600327L), hostObject.objectPtr)

  /** OpenXRPlaneTracker.set_plane_alignment */
  final def setPlaneAlignment(plane_alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRPlaneTracker", "set_plane_alignment", 1214382230L), hostObject.objectPtr, plane_alignment)

  /** OpenXRPlaneTracker.get_plane_alignment */
  final def getPlaneAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRPlaneTracker", "get_plane_alignment", 845541441L), hostObject.objectPtr)

  /** OpenXRPlaneTracker.set_plane_label */
  final def setPlaneLabel(plane_label: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRPlaneTracker", "set_plane_label", 83702148L), hostObject.objectPtr, plane_label)

  /** OpenXRPlaneTracker.get_plane_label */
  final def getPlaneLabel(): String =
    Ptrcall.call0[String](MethodBind.get("OpenXRPlaneTracker", "get_plane_label", 201670096L), hostObject.objectPtr)

  /** OpenXRPlaneTracker.clear_mesh_data */
  final def clearMeshData(): Unit =
    Ptrcall.callVoid0(MethodBind.get("OpenXRPlaneTracker", "clear_mesh_data", 3218959716L), hostObject.objectPtr)

  /** OpenXRPlaneTracker.get_mesh_offset */
  final def getMeshOffset(): io.github.optical002.godot.builtin.Transform3D =
    Ptrcall.call0[io.github.optical002.godot.builtin.Transform3D](MethodBind.get("OpenXRPlaneTracker", "get_mesh_offset", 3229777777L), hostObject.objectPtr)

  /** OpenXRPlaneTracker.get_mesh */
  final def getMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("OpenXRPlaneTracker", "get_mesh", 4081188045L), hostObject.objectPtr)

  /** OpenXRPlaneTracker.get_shape */
  final def getShape(thickness: Double): GodotObject =
    Ptrcall.call1[Double, GodotObject](MethodBind.get("OpenXRPlaneTracker", "get_shape", 3358509884L), hostObject.objectPtr, thickness)

}

object OpenXRPlaneTracker {
  /** Class metadata for Gd[OpenXRPlaneTracker] lifetime management and casting. */
  given GodotClass[OpenXRPlaneTracker] with {
    def className = "OpenXRPlaneTracker"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRPlaneTracker = new OpenXRPlaneTracker {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRPlaneTracker): GodotObject = t.hostObject
  }
}
