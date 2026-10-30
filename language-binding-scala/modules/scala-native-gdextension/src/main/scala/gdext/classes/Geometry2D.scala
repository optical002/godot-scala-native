package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Geometry2D`, extends `Object`. */
abstract class Geometry2D extends Object {
  override def godotClassName: String = "Geometry2D"

  /** Geometry2D.is_point_in_circle */
  final def isPointInCircle(point: gdext.builtin.Vector2, circlePosition: gdext.builtin.Vector2, circleRadius: Double): Boolean = {
    if (gdext.classes.Geometry2D.mb_is_point_in_circle == null) gdext.classes.Geometry2D.mb_is_point_in_circle = MethodBind.get("Geometry2D", "is_point_in_circle", 2929491703L)
    Ptrcall.call3[gdext.builtin.Vector2, gdext.builtin.Vector2, Double, Boolean](gdext.classes.Geometry2D.mb_is_point_in_circle, livePtr, point, circlePosition, circleRadius)
  }

  /** Geometry2D.segment_intersects_circle */
  final def segmentIntersectsCircle(segmentFrom: gdext.builtin.Vector2, segmentTo: gdext.builtin.Vector2, circlePosition: gdext.builtin.Vector2, circleRadius: Double): Double = {
    if (gdext.classes.Geometry2D.mb_segment_intersects_circle == null) gdext.classes.Geometry2D.mb_segment_intersects_circle = MethodBind.get("Geometry2D", "segment_intersects_circle", 1356928167L)
    Ptrcall.call4[gdext.builtin.Vector2, gdext.builtin.Vector2, gdext.builtin.Vector2, Double, Double](gdext.classes.Geometry2D.mb_segment_intersects_circle, livePtr, segmentFrom, segmentTo, circlePosition, circleRadius)
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

  /** Forwards to [[singleton]]: Geometry2D.is_point_in_circle */
  final def isPointInCircle(point: gdext.builtin.Vector2, circlePosition: gdext.builtin.Vector2, circleRadius: Double): Boolean =
    singleton.isPointInCircle(point, circlePosition, circleRadius)

  /** Forwards to [[singleton]]: Geometry2D.segment_intersects_circle */
  final def segmentIntersectsCircle(segmentFrom: gdext.builtin.Vector2, segmentTo: gdext.builtin.Vector2, circlePosition: gdext.builtin.Vector2, circleRadius: Double): Double =
    singleton.segmentIntersectsCircle(segmentFrom, segmentTo, circlePosition, circleRadius)

  /** Forwards to [[singleton]]: Geometry2D.get_closest_point_to_segment */
  final def getClosestPointToSegment(point: gdext.builtin.Vector2, s1: gdext.builtin.Vector2, s2: gdext.builtin.Vector2): gdext.builtin.Vector2 =
    singleton.getClosestPointToSegment(point, s1, s2)

  /** Forwards to [[singleton]]: Geometry2D.get_closest_point_to_segment_uncapped */
  final def getClosestPointToSegmentUncapped(point: gdext.builtin.Vector2, s1: gdext.builtin.Vector2, s2: gdext.builtin.Vector2): gdext.builtin.Vector2 =
    singleton.getClosestPointToSegmentUncapped(point, s1, s2)

  /** Forwards to [[singleton]]: Geometry2D.point_is_inside_triangle */
  final def pointIsInsideTriangle(point: gdext.builtin.Vector2, a: gdext.builtin.Vector2, b: gdext.builtin.Vector2, c: gdext.builtin.Vector2): Boolean =
    singleton.pointIsInsideTriangle(point, a, b, c)

  /** Godot enum `Geometry2D.PolyBooleanOperation`. */
  opaque type PolyBooleanOperation <: Long = Long

  object PolyBooleanOperation {
    final val Union: PolyBooleanOperation = 0L.asInstanceOf[PolyBooleanOperation]
    final val Difference: PolyBooleanOperation = 1L.asInstanceOf[PolyBooleanOperation]
    final val Intersection: PolyBooleanOperation = 2L.asInstanceOf[PolyBooleanOperation]
    final val Xor: PolyBooleanOperation = 3L.asInstanceOf[PolyBooleanOperation]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PolyBooleanOperation = value.asInstanceOf[PolyBooleanOperation]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PolyBooleanOperation] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[PolyBooleanOperation]]

    extension (self: PolyBooleanOperation)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Union"
        case 1L => "Difference"
        case 2L => "Intersection"
        case 3L => "Xor"
        case other => other.toString
      }
  }

  /** Godot enum `Geometry2D.PolyJoinType`. */
  opaque type PolyJoinType <: Long = Long

  object PolyJoinType {
    final val Square: PolyJoinType = 0L.asInstanceOf[PolyJoinType]
    final val Round: PolyJoinType = 1L.asInstanceOf[PolyJoinType]
    final val Miter: PolyJoinType = 2L.asInstanceOf[PolyJoinType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PolyJoinType = value.asInstanceOf[PolyJoinType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PolyJoinType] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[PolyJoinType]]

    extension (self: PolyJoinType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Square"
        case 1L => "Round"
        case 2L => "Miter"
        case other => other.toString
      }
  }

  /** Godot enum `Geometry2D.PolyEndType`. */
  opaque type PolyEndType <: Long = Long

  object PolyEndType {
    final val Polygon: PolyEndType = 0L.asInstanceOf[PolyEndType]
    final val Joined: PolyEndType = 1L.asInstanceOf[PolyEndType]
    final val Butt: PolyEndType = 2L.asInstanceOf[PolyEndType]
    final val Square: PolyEndType = 3L.asInstanceOf[PolyEndType]
    final val Round: PolyEndType = 4L.asInstanceOf[PolyEndType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PolyEndType = value.asInstanceOf[PolyEndType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PolyEndType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[PolyEndType]]

    extension (self: PolyEndType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Polygon"
        case 1L => "Joined"
        case 2L => "Butt"
        case 3L => "Square"
        case 4L => "Round"
        case other => other.toString
      }
  }
}
