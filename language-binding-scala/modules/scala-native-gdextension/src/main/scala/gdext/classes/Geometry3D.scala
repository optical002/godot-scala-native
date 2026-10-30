package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Geometry3D`, extends `Object`. */
abstract class Geometry3D extends Object {
  override def godotClassName: String = "Geometry3D"

  /** Geometry3D.get_closest_point_to_segment */
  final def getClosestPointToSegment(point: gdext.builtin.Vector3, s1: gdext.builtin.Vector3, s2: gdext.builtin.Vector3): gdext.builtin.Vector3 = {
    if (gdext.classes.Geometry3D.mb_get_closest_point_to_segment == null) gdext.classes.Geometry3D.mb_get_closest_point_to_segment = MethodBind.get("Geometry3D", "get_closest_point_to_segment", 2168193209L)
    Ptrcall.call3[gdext.builtin.Vector3, gdext.builtin.Vector3, gdext.builtin.Vector3, gdext.builtin.Vector3](gdext.classes.Geometry3D.mb_get_closest_point_to_segment, livePtr, point, s1, s2)
  }

  /** Geometry3D.get_closest_point_to_segment_uncapped */
  final def getClosestPointToSegmentUncapped(point: gdext.builtin.Vector3, s1: gdext.builtin.Vector3, s2: gdext.builtin.Vector3): gdext.builtin.Vector3 = {
    if (gdext.classes.Geometry3D.mb_get_closest_point_to_segment_uncapped == null) gdext.classes.Geometry3D.mb_get_closest_point_to_segment_uncapped = MethodBind.get("Geometry3D", "get_closest_point_to_segment_uncapped", 2168193209L)
    Ptrcall.call3[gdext.builtin.Vector3, gdext.builtin.Vector3, gdext.builtin.Vector3, gdext.builtin.Vector3](gdext.classes.Geometry3D.mb_get_closest_point_to_segment_uncapped, livePtr, point, s1, s2)
  }

  /** Geometry3D.get_triangle_barycentric_coords */
  final def getTriangleBarycentricCoords(point: gdext.builtin.Vector3, a: gdext.builtin.Vector3, b: gdext.builtin.Vector3, c: gdext.builtin.Vector3): gdext.builtin.Vector3 = {
    if (gdext.classes.Geometry3D.mb_get_triangle_barycentric_coords == null) gdext.classes.Geometry3D.mb_get_triangle_barycentric_coords = MethodBind.get("Geometry3D", "get_triangle_barycentric_coords", 1362048029L)
    Ptrcall.call4[gdext.builtin.Vector3, gdext.builtin.Vector3, gdext.builtin.Vector3, gdext.builtin.Vector3, gdext.builtin.Vector3](gdext.classes.Geometry3D.mb_get_triangle_barycentric_coords, livePtr, point, a, b, c)
  }

}

object Geometry3D {
  private[classes] var mb_get_closest_point_to_segment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_closest_point_to_segment_uncapped: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_triangle_barycentric_coords: GDExtensionMethodBindPtr = null

  private var instance: Geometry3D = null

  /** The process-global Geometry3D singleton instance. */
  def singleton: Geometry3D = {
    if (instance == null)
      instance = Wrappers.borrowed[Geometry3D](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("Geometry3D").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: Geometry3D.get_closest_point_to_segment */
  final def getClosestPointToSegment(point: gdext.builtin.Vector3, s1: gdext.builtin.Vector3, s2: gdext.builtin.Vector3): gdext.builtin.Vector3 =
    singleton.getClosestPointToSegment(point, s1, s2)

  /** Forwards to [[singleton]]: Geometry3D.get_closest_point_to_segment_uncapped */
  final def getClosestPointToSegmentUncapped(point: gdext.builtin.Vector3, s1: gdext.builtin.Vector3, s2: gdext.builtin.Vector3): gdext.builtin.Vector3 =
    singleton.getClosestPointToSegmentUncapped(point, s1, s2)

  /** Forwards to [[singleton]]: Geometry3D.get_triangle_barycentric_coords */
  final def getTriangleBarycentricCoords(point: gdext.builtin.Vector3, a: gdext.builtin.Vector3, b: gdext.builtin.Vector3, c: gdext.builtin.Vector3): gdext.builtin.Vector3 =
    singleton.getTriangleBarycentricCoords(point, a, b, c)
}
