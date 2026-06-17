package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Geometry3D`, extends `Object`. */
abstract class Geometry3D extends Object {

  /** Geometry3D.get_closest_point_to_segment */
  final def getClosestPointToSegment(point: io.github.optical002.godot.builtin.Vector3, s1: io.github.optical002.godot.builtin.Vector3, s2: io.github.optical002.godot.builtin.Vector3): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call3[io.github.optical002.godot.builtin.Vector3, io.github.optical002.godot.builtin.Vector3, io.github.optical002.godot.builtin.Vector3, io.github.optical002.godot.builtin.Vector3](MethodBind.get("Geometry3D", "get_closest_point_to_segment", 2168193209L), hostObject.objectPtr, point, s1, s2)

  /** Geometry3D.get_closest_point_to_segment_uncapped */
  final def getClosestPointToSegmentUncapped(point: io.github.optical002.godot.builtin.Vector3, s1: io.github.optical002.godot.builtin.Vector3, s2: io.github.optical002.godot.builtin.Vector3): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call3[io.github.optical002.godot.builtin.Vector3, io.github.optical002.godot.builtin.Vector3, io.github.optical002.godot.builtin.Vector3, io.github.optical002.godot.builtin.Vector3](MethodBind.get("Geometry3D", "get_closest_point_to_segment_uncapped", 2168193209L), hostObject.objectPtr, point, s1, s2)

  /** Geometry3D.get_triangle_barycentric_coords */
  final def getTriangleBarycentricCoords(point: io.github.optical002.godot.builtin.Vector3, a: io.github.optical002.godot.builtin.Vector3, b: io.github.optical002.godot.builtin.Vector3, c: io.github.optical002.godot.builtin.Vector3): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call4[io.github.optical002.godot.builtin.Vector3, io.github.optical002.godot.builtin.Vector3, io.github.optical002.godot.builtin.Vector3, io.github.optical002.godot.builtin.Vector3, io.github.optical002.godot.builtin.Vector3](MethodBind.get("Geometry3D", "get_triangle_barycentric_coords", 1362048029L), hostObject.objectPtr, point, a, b, c)

}

object Geometry3D {
  /** Class metadata for Gd[Geometry3D] lifetime management and casting. */
  given GodotClass[Geometry3D] with {
    def className = "Geometry3D"
    def isRefCounted = false
    def wrap(o: GodotObject): Geometry3D = new Geometry3D {}.withHost(o.objectPtr)
    def unwrap(t: Geometry3D): GodotObject = t.hostObject
  }

  /** The process-global Geometry3D singleton instance. */
  def singleton: Geometry3D = new Geometry3D {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("Geometry3D").ptr))
}
