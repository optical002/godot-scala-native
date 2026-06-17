package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PolygonPathFinder`, extends `Resource`. */
abstract class PolygonPathFinder extends Resource {

  /** PolygonPathFinder.get_closest_point */
  final def getClosestPoint(point: io.github.optical002.godot.builtin.Vector2): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call1[io.github.optical002.godot.builtin.Vector2, io.github.optical002.godot.builtin.Vector2](MethodBind.get("PolygonPathFinder", "get_closest_point", 2656412154L), hostObject.objectPtr, point)

  /** PolygonPathFinder.is_point_inside */
  final def isPointInside(point: io.github.optical002.godot.builtin.Vector2): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.Vector2, Boolean](MethodBind.get("PolygonPathFinder", "is_point_inside", 556197845L), hostObject.objectPtr, point)

  /** PolygonPathFinder.set_point_penalty */
  final def setPointPenalty(idx: Long, penalty: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("PolygonPathFinder", "set_point_penalty", 1602489585L), hostObject.objectPtr, idx, penalty)

  /** PolygonPathFinder.get_point_penalty */
  final def getPointPenalty(idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("PolygonPathFinder", "get_point_penalty", 2339986948L), hostObject.objectPtr, idx)

  /** PolygonPathFinder.get_bounds */
  final def getBounds(): io.github.optical002.godot.builtin.Rect2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Rect2](MethodBind.get("PolygonPathFinder", "get_bounds", 1639390495L), hostObject.objectPtr)

}

object PolygonPathFinder {
  /** Class metadata for Gd[PolygonPathFinder] lifetime management and casting. */
  given GodotClass[PolygonPathFinder] with {
    def className = "PolygonPathFinder"
    def isRefCounted = true
    def wrap(o: GodotObject): PolygonPathFinder = new PolygonPathFinder {}.withHost(o.objectPtr)
    def unwrap(t: PolygonPathFinder): GodotObject = t.hostObject
  }
}
