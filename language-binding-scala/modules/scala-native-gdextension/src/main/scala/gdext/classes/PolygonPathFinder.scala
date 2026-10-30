package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PolygonPathFinder`, extends `Resource`. */
abstract class PolygonPathFinder extends Resource {
  override def godotClassName: String = "PolygonPathFinder"

  /** PolygonPathFinder.get_closest_point */
  final def getClosestPoint(point: gdext.builtin.Vector2): gdext.builtin.Vector2 = {
    if (gdext.classes.PolygonPathFinder.mb_get_closest_point == null) gdext.classes.PolygonPathFinder.mb_get_closest_point = MethodBind.get("PolygonPathFinder", "get_closest_point", 2656412154L)
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector2](gdext.classes.PolygonPathFinder.mb_get_closest_point, livePtr, point)
  }

  /** PolygonPathFinder.is_point_inside */
  final def isPointInside(point: gdext.builtin.Vector2): Boolean = {
    if (gdext.classes.PolygonPathFinder.mb_is_point_inside == null) gdext.classes.PolygonPathFinder.mb_is_point_inside = MethodBind.get("PolygonPathFinder", "is_point_inside", 556197845L)
    Ptrcall.call1[gdext.builtin.Vector2, Boolean](gdext.classes.PolygonPathFinder.mb_is_point_inside, livePtr, point)
  }

  /** PolygonPathFinder.set_point_penalty */
  final def setPointPenalty(idx: Long, penalty: Double): Unit = {
    if (gdext.classes.PolygonPathFinder.mb_set_point_penalty == null) gdext.classes.PolygonPathFinder.mb_set_point_penalty = MethodBind.get("PolygonPathFinder", "set_point_penalty", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.PolygonPathFinder.mb_set_point_penalty, livePtr, idx, penalty)
  }

  /** PolygonPathFinder.get_point_penalty */
  final def getPointPenalty(idx: Long): Double = {
    if (gdext.classes.PolygonPathFinder.mb_get_point_penalty == null) gdext.classes.PolygonPathFinder.mb_get_point_penalty = MethodBind.get("PolygonPathFinder", "get_point_penalty", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.PolygonPathFinder.mb_get_point_penalty, livePtr, idx)
  }

  /** PolygonPathFinder.get_bounds */
  final def getBounds(): gdext.builtin.Rect2 = {
    if (gdext.classes.PolygonPathFinder.mb_get_bounds == null) gdext.classes.PolygonPathFinder.mb_get_bounds = MethodBind.get("PolygonPathFinder", "get_bounds", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.PolygonPathFinder.mb_get_bounds, livePtr)
  }

}

object PolygonPathFinder {
  private[classes] var mb_get_closest_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_point_inside: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_penalty: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_penalty: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bounds: GDExtensionMethodBindPtr = null
}
