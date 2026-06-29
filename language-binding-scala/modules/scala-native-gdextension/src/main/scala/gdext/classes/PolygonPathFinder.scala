package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PolygonPathFinder`, extends `Resource`. */
abstract class PolygonPathFinder extends Resource {
  override def godotClassName: String = "PolygonPathFinder"

  /** PolygonPathFinder.get_closest_point */
  final def getClosestPoint(point: gdext.builtin.Vector2): gdext.builtin.Vector2 =
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector2](MethodBind.get("PolygonPathFinder", "get_closest_point", 2656412154L), hostObject.objectPtr, point)

  /** PolygonPathFinder.is_point_inside */
  final def isPointInside(point: gdext.builtin.Vector2): Boolean =
    Ptrcall.call1[gdext.builtin.Vector2, Boolean](MethodBind.get("PolygonPathFinder", "is_point_inside", 556197845L), hostObject.objectPtr, point)

  /** PolygonPathFinder.set_point_penalty */
  final def setPointPenalty(idx: Long, penalty: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("PolygonPathFinder", "set_point_penalty", 1602489585L), hostObject.objectPtr, idx, penalty)

  /** PolygonPathFinder.get_point_penalty */
  final def getPointPenalty(idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("PolygonPathFinder", "get_point_penalty", 2339986948L), hostObject.objectPtr, idx)

  /** PolygonPathFinder.get_bounds */
  final def getBounds(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("PolygonPathFinder", "get_bounds", 1639390495L), hostObject.objectPtr)

}
