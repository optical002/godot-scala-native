package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Geometry2D`, extends `Object`. */
abstract class Geometry2D extends Object {

  /** Geometry2D.is_point_in_circle */
  final def isPointInCircle(point: gdext.builtin.Vector2, circle_position: gdext.builtin.Vector2, circle_radius: Double): Boolean =
    Ptrcall.call3[gdext.builtin.Vector2, gdext.builtin.Vector2, Double, Boolean](MethodBind.get("Geometry2D", "is_point_in_circle", 2929491703L), hostObject.objectPtr, point, circle_position, circle_radius)

  /** Geometry2D.segment_intersects_circle */
  final def segmentIntersectsCircle(segment_from: gdext.builtin.Vector2, segment_to: gdext.builtin.Vector2, circle_position: gdext.builtin.Vector2, circle_radius: Double): Double =
    Ptrcall.call4[gdext.builtin.Vector2, gdext.builtin.Vector2, gdext.builtin.Vector2, Double, Double](MethodBind.get("Geometry2D", "segment_intersects_circle", 1356928167L), hostObject.objectPtr, segment_from, segment_to, circle_position, circle_radius)

  /** Geometry2D.get_closest_point_to_segment */
  final def getClosestPointToSegment(point: gdext.builtin.Vector2, s1: gdext.builtin.Vector2, s2: gdext.builtin.Vector2): gdext.builtin.Vector2 =
    Ptrcall.call3[gdext.builtin.Vector2, gdext.builtin.Vector2, gdext.builtin.Vector2, gdext.builtin.Vector2](MethodBind.get("Geometry2D", "get_closest_point_to_segment", 4172901909L), hostObject.objectPtr, point, s1, s2)

  /** Geometry2D.get_closest_point_to_segment_uncapped */
  final def getClosestPointToSegmentUncapped(point: gdext.builtin.Vector2, s1: gdext.builtin.Vector2, s2: gdext.builtin.Vector2): gdext.builtin.Vector2 =
    Ptrcall.call3[gdext.builtin.Vector2, gdext.builtin.Vector2, gdext.builtin.Vector2, gdext.builtin.Vector2](MethodBind.get("Geometry2D", "get_closest_point_to_segment_uncapped", 4172901909L), hostObject.objectPtr, point, s1, s2)

  /** Geometry2D.point_is_inside_triangle */
  final def pointIsInsideTriangle(point: gdext.builtin.Vector2, a: gdext.builtin.Vector2, b: gdext.builtin.Vector2, c: gdext.builtin.Vector2): Boolean =
    Ptrcall.call4[gdext.builtin.Vector2, gdext.builtin.Vector2, gdext.builtin.Vector2, gdext.builtin.Vector2, Boolean](MethodBind.get("Geometry2D", "point_is_inside_triangle", 1025948137L), hostObject.objectPtr, point, a, b, c)

}

object Geometry2D {
  /** Class metadata for Gd[Geometry2D] lifetime management and casting. */
  given GodotClass[Geometry2D] with {
    def className = "Geometry2D"
    def isRefCounted = false
    def wrap(o: GodotObject): Geometry2D = new Geometry2D {}.withHost(o.objectPtr)
    def unwrap(t: Geometry2D): GodotObject = t.hostObject
  }

  /** The process-global Geometry2D singleton instance. */
  def singleton: Geometry2D = new Geometry2D {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("Geometry2D").ptr))
}
