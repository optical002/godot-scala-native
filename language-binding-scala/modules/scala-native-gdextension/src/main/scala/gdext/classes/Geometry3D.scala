package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Geometry3D`, extends `Object`. */
abstract class Geometry3D extends Object {
  override def godotClassName: String = "Geometry3D"

  /** Geometry3D.get_closest_point_to_segment */
  final def getClosestPointToSegment(point: gdext.builtin.Vector3, s1: gdext.builtin.Vector3, s2: gdext.builtin.Vector3): gdext.builtin.Vector3 =
    Ptrcall.call3[gdext.builtin.Vector3, gdext.builtin.Vector3, gdext.builtin.Vector3, gdext.builtin.Vector3](MethodBind.get("Geometry3D", "get_closest_point_to_segment", 2168193209L), hostObject.objectPtr, point, s1, s2)

  /** Geometry3D.get_closest_point_to_segment_uncapped */
  final def getClosestPointToSegmentUncapped(point: gdext.builtin.Vector3, s1: gdext.builtin.Vector3, s2: gdext.builtin.Vector3): gdext.builtin.Vector3 =
    Ptrcall.call3[gdext.builtin.Vector3, gdext.builtin.Vector3, gdext.builtin.Vector3, gdext.builtin.Vector3](MethodBind.get("Geometry3D", "get_closest_point_to_segment_uncapped", 2168193209L), hostObject.objectPtr, point, s1, s2)

  /** Geometry3D.get_triangle_barycentric_coords */
  final def getTriangleBarycentricCoords(point: gdext.builtin.Vector3, a: gdext.builtin.Vector3, b: gdext.builtin.Vector3, c: gdext.builtin.Vector3): gdext.builtin.Vector3 =
    Ptrcall.call4[gdext.builtin.Vector3, gdext.builtin.Vector3, gdext.builtin.Vector3, gdext.builtin.Vector3, gdext.builtin.Vector3](MethodBind.get("Geometry3D", "get_triangle_barycentric_coords", 1362048029L), hostObject.objectPtr, point, a, b, c)

}

object Geometry3D {
  /** The process-global Geometry3D singleton instance. */
  def singleton: Geometry3D = new Geometry3D {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("Geometry3D").ptr))
}
