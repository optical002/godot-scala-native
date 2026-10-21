package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Geometry2D`, extends `Object`. */
abstract class Geometry2D extends Object {
  override def godotClassName: String = "Geometry2D"

  /** Geometry2D.is_point_in_circle */
  final def isPointInCircle(point: gdext.builtin.Vector2, circle_position: gdext.builtin.Vector2, circle_radius: Double): Boolean = {
    if (gdext.classes.Geometry2D.mb_is_point_in_circle == null) gdext.classes.Geometry2D.mb_is_point_in_circle = MethodBind.get("Geometry2D", "is_point_in_circle", 2929491703L)
    Ptrcall.call3[gdext.builtin.Vector2, gdext.builtin.Vector2, Double, Boolean](gdext.classes.Geometry2D.mb_is_point_in_circle, livePtr, point, circle_position, circle_radius)
  }

  /** Geometry2D.segment_intersects_circle */
  final def segmentIntersectsCircle(segment_from: gdext.builtin.Vector2, segment_to: gdext.builtin.Vector2, circle_position: gdext.builtin.Vector2, circle_radius: Double): Double = {
    if (gdext.classes.Geometry2D.mb_segment_intersects_circle == null) gdext.classes.Geometry2D.mb_segment_intersects_circle = MethodBind.get("Geometry2D", "segment_intersects_circle", 1356928167L)
    Ptrcall.call4[gdext.builtin.Vector2, gdext.builtin.Vector2, gdext.builtin.Vector2, Double, Double](gdext.classes.Geometry2D.mb_segment_intersects_circle, livePtr, segment_from, segment_to, circle_position, circle_radius)
  }

  /** Geometry2D.get_closest_point_to_segment */
  final def getClosestPointToSegment(point: gdext.builtin.Vector2, s1: gdext.builtin.Vector2, s2: gdext.builtin.Vector2): gdext.builtin.Vector2 = {
    if (gdext.classes.Geometry2D.mb_get_closest_point_to_segment == null) gdext.classes.Geometry2D.mb_get_closest_point_to_segment = MethodBind.get("Geometry2D", "get_closest_point_to_segment", 4172901909L)
    Ptrcall.call3[gdext.builtin.Vector2, gdext.builtin.Vector2, gdext.builtin.Vector2, gdext.builtin.Vector2](gdext.classes.Geometry2D.mb_get_closest_point_to_segment, livePtr, point, s1, s2)
  }

  /** Geometry2D.get_closest_point_to_segment_uncapped */
  final def getClosestPointToSegmentUncapped(point: gdext.builtin.Vector2, s1: gdext.builtin.Vector2, s2: gdext.builtin.Vector2): gdext.builtin.Vector2 = {
    if (gdext.classes.Geometry2D.mb_get_closest_point_to_segment_uncapped == null) gdext.classes.Geometry2D.mb_get_closest_point_to_segment_uncapped = MethodBind.get("Geometry2D", "get_closest_point_to_segment_uncapped", 4172901909L)
    Ptrcall.call3[gdext.builtin.Vector2, gdext.builtin.Vector2, gdext.builtin.Vector2, gdext.builtin.Vector2](gdext.classes.Geometry2D.mb_get_closest_point_to_segment_uncapped, livePtr, point, s1, s2)
  }

  /** Geometry2D.point_is_inside_triangle */
  final def pointIsInsideTriangle(point: gdext.builtin.Vector2, a: gdext.builtin.Vector2, b: gdext.builtin.Vector2, c: gdext.builtin.Vector2): Boolean = {
    if (gdext.classes.Geometry2D.mb_point_is_inside_triangle == null) gdext.classes.Geometry2D.mb_point_is_inside_triangle = MethodBind.get("Geometry2D", "point_is_inside_triangle", 1025948137L)
    Ptrcall.call4[gdext.builtin.Vector2, gdext.builtin.Vector2, gdext.builtin.Vector2, gdext.builtin.Vector2, Boolean](gdext.classes.Geometry2D.mb_point_is_inside_triangle, livePtr, point, a, b, c)
  }

}

object Geometry2D {
  private[classes] var mb_is_point_in_circle: GDExtensionMethodBindPtr = null
  private[classes] var mb_segment_intersects_circle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_closest_point_to_segment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_closest_point_to_segment_uncapped: GDExtensionMethodBindPtr = null
  private[classes] var mb_point_is_inside_triangle: GDExtensionMethodBindPtr = null

  private var instance: Geometry2D = null

  /** The process-global Geometry2D singleton instance. */
  def singleton: Geometry2D = {
    if (instance == null)
      instance = Wrappers.borrowed[Geometry2D](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("Geometry2D").ptr)))
    instance
  }
}
