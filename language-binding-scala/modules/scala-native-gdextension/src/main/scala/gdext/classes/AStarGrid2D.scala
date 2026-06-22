package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AStarGrid2D`, extends `RefCounted`. */
abstract class AStarGrid2D extends RefCounted {

  /** AStarGrid2D.set_region */
  final def setRegion(region: gdext.builtin.Rect2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("AStarGrid2D", "set_region", 1763793166L), hostObject.objectPtr, region)

  /** AStarGrid2D.get_region */
  final def getRegion(): gdext.builtin.Rect2i =
    Ptrcall.call0[gdext.builtin.Rect2i](MethodBind.get("AStarGrid2D", "get_region", 410525958L), hostObject.objectPtr)

  /** AStarGrid2D.set_size */
  final def setSize(size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("AStarGrid2D", "set_size", 1130785943L), hostObject.objectPtr, size)

  /** AStarGrid2D.get_size */
  final def getSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("AStarGrid2D", "get_size", 3690982128L), hostObject.objectPtr)

  /** AStarGrid2D.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("AStarGrid2D", "set_offset", 743155724L), hostObject.objectPtr, offset)

  /** AStarGrid2D.get_offset */
  final def getOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("AStarGrid2D", "get_offset", 3341600327L), hostObject.objectPtr)

  /** AStarGrid2D.set_cell_size */
  final def setCellSize(cell_size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("AStarGrid2D", "set_cell_size", 743155724L), hostObject.objectPtr, cell_size)

  /** AStarGrid2D.get_cell_size */
  final def getCellSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("AStarGrid2D", "get_cell_size", 3341600327L), hostObject.objectPtr)

  /** AStarGrid2D.set_cell_shape */
  final def setCellShape(cell_shape: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AStarGrid2D", "set_cell_shape", 4130591146L), hostObject.objectPtr, cell_shape)

  /** AStarGrid2D.get_cell_shape */
  final def getCellShape(): Long =
    Ptrcall.call0[Long](MethodBind.get("AStarGrid2D", "get_cell_shape", 3293463634L), hostObject.objectPtr)

  /** AStarGrid2D.is_in_bounds */
  final def isInBounds(x: Long, y: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("AStarGrid2D", "is_in_bounds", 2522259332L), hostObject.objectPtr, x, y)

  /** AStarGrid2D.is_in_boundsv */
  final def isInBoundsv(id: gdext.builtin.Vector2i): Boolean =
    Ptrcall.call1[gdext.builtin.Vector2i, Boolean](MethodBind.get("AStarGrid2D", "is_in_boundsv", 3900751641L), hostObject.objectPtr, id)

  /** AStarGrid2D.is_dirty */
  final def isDirty(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AStarGrid2D", "is_dirty", 36873697L), hostObject.objectPtr)

  /** AStarGrid2D.update */
  final def update(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AStarGrid2D", "update", 3218959716L), hostObject.objectPtr)

  /** AStarGrid2D.set_jumping_enabled */
  final def setJumpingEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AStarGrid2D", "set_jumping_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** AStarGrid2D.is_jumping_enabled */
  final def isJumpingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AStarGrid2D", "is_jumping_enabled", 36873697L), hostObject.objectPtr)

  /** AStarGrid2D.set_diagonal_mode */
  final def setDiagonalMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AStarGrid2D", "set_diagonal_mode", 1017829798L), hostObject.objectPtr, mode)

  /** AStarGrid2D.get_diagonal_mode */
  final def getDiagonalMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("AStarGrid2D", "get_diagonal_mode", 3129282674L), hostObject.objectPtr)

  /** AStarGrid2D.set_default_compute_heuristic */
  final def setDefaultComputeHeuristic(heuristic: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AStarGrid2D", "set_default_compute_heuristic", 1044375519L), hostObject.objectPtr, heuristic)

  /** AStarGrid2D.get_default_compute_heuristic */
  final def getDefaultComputeHeuristic(): Long =
    Ptrcall.call0[Long](MethodBind.get("AStarGrid2D", "get_default_compute_heuristic", 2074731422L), hostObject.objectPtr)

  /** AStarGrid2D.set_default_estimate_heuristic */
  final def setDefaultEstimateHeuristic(heuristic: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AStarGrid2D", "set_default_estimate_heuristic", 1044375519L), hostObject.objectPtr, heuristic)

  /** AStarGrid2D.get_default_estimate_heuristic */
  final def getDefaultEstimateHeuristic(): Long =
    Ptrcall.call0[Long](MethodBind.get("AStarGrid2D", "get_default_estimate_heuristic", 2074731422L), hostObject.objectPtr)

  /** AStarGrid2D.set_point_solid */
  final def setPointSolid(id: gdext.builtin.Vector2i, solid: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("AStarGrid2D", "set_point_solid", 1765703753L), hostObject.objectPtr, id, solid)

  /** AStarGrid2D.is_point_solid */
  final def isPointSolid(id: gdext.builtin.Vector2i): Boolean =
    Ptrcall.call1[gdext.builtin.Vector2i, Boolean](MethodBind.get("AStarGrid2D", "is_point_solid", 3900751641L), hostObject.objectPtr, id)

  /** AStarGrid2D.set_point_weight_scale */
  final def setPointWeightScale(id: gdext.builtin.Vector2i, weight_scale: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AStarGrid2D", "set_point_weight_scale", 2262553149L), hostObject.objectPtr, id, weight_scale)

  /** AStarGrid2D.get_point_weight_scale */
  final def getPointWeightScale(id: gdext.builtin.Vector2i): Double =
    Ptrcall.call1[gdext.builtin.Vector2i, Double](MethodBind.get("AStarGrid2D", "get_point_weight_scale", 719993801L), hostObject.objectPtr, id)

  /** AStarGrid2D.fill_solid_region */
  final def fillSolidRegion(region: gdext.builtin.Rect2i, solid: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("AStarGrid2D", "fill_solid_region", 2261970063L), hostObject.objectPtr, region, solid)

  /** AStarGrid2D.fill_weight_scale_region */
  final def fillWeightScaleRegion(region: gdext.builtin.Rect2i, weight_scale: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AStarGrid2D", "fill_weight_scale_region", 2793244083L), hostObject.objectPtr, region, weight_scale)

  /** AStarGrid2D.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AStarGrid2D", "clear", 3218959716L), hostObject.objectPtr)

  /** AStarGrid2D.get_point_position */
  final def getPointPosition(id: gdext.builtin.Vector2i): gdext.builtin.Vector2 =
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Vector2](MethodBind.get("AStarGrid2D", "get_point_position", 108438297L), hostObject.objectPtr, id)

}

object AStarGrid2D {
  /** Class metadata for Gd[AStarGrid2D] lifetime management and casting. */
  given GodotClass[AStarGrid2D] with {
    def className = "AStarGrid2D"
    def isRefCounted = true
    def wrap(o: GodotObject): AStarGrid2D = new AStarGrid2D {}.withHost(o.objectPtr)
    def unwrap(t: AStarGrid2D): GodotObject = t.hostObject
  }
}
