package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AStarGrid2D`, extends `RefCounted`. */
abstract class AStarGrid2D extends RefCounted {
  override def godotClassName: String = "AStarGrid2D"

  /** AStarGrid2D.set_region */
  final def setRegion(region: gdext.builtin.Rect2i): Unit = {
    if (gdext.classes.AStarGrid2D.mb_set_region == null) gdext.classes.AStarGrid2D.mb_set_region = MethodBind.get("AStarGrid2D", "set_region", 1763793166L)
    Ptrcall.callVoid1(gdext.classes.AStarGrid2D.mb_set_region, livePtr, region)
  }

  /** AStarGrid2D.get_region */
  final def getRegion(): gdext.builtin.Rect2i = {
    if (gdext.classes.AStarGrid2D.mb_get_region == null) gdext.classes.AStarGrid2D.mb_get_region = MethodBind.get("AStarGrid2D", "get_region", 410525958L)
    Ptrcall.call0[gdext.builtin.Rect2i](gdext.classes.AStarGrid2D.mb_get_region, livePtr)
  }

  /** AStarGrid2D.set_size */
  final def setSize(size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.AStarGrid2D.mb_set_size == null) gdext.classes.AStarGrid2D.mb_set_size = MethodBind.get("AStarGrid2D", "set_size", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.AStarGrid2D.mb_set_size, livePtr, size)
  }

  /** AStarGrid2D.get_size */
  final def getSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.AStarGrid2D.mb_get_size == null) gdext.classes.AStarGrid2D.mb_get_size = MethodBind.get("AStarGrid2D", "get_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.AStarGrid2D.mb_get_size, livePtr)
  }

  /** AStarGrid2D.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.AStarGrid2D.mb_set_offset == null) gdext.classes.AStarGrid2D.mb_set_offset = MethodBind.get("AStarGrid2D", "set_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.AStarGrid2D.mb_set_offset, livePtr, offset)
  }

  /** AStarGrid2D.get_offset */
  final def getOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.AStarGrid2D.mb_get_offset == null) gdext.classes.AStarGrid2D.mb_get_offset = MethodBind.get("AStarGrid2D", "get_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.AStarGrid2D.mb_get_offset, livePtr)
  }

  /** AStarGrid2D.set_cell_size */
  final def setCellSize(cell_size: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.AStarGrid2D.mb_set_cell_size == null) gdext.classes.AStarGrid2D.mb_set_cell_size = MethodBind.get("AStarGrid2D", "set_cell_size", 743155724L)
    Ptrcall.callVoid1(gdext.classes.AStarGrid2D.mb_set_cell_size, livePtr, cell_size)
  }

  /** AStarGrid2D.get_cell_size */
  final def getCellSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.AStarGrid2D.mb_get_cell_size == null) gdext.classes.AStarGrid2D.mb_get_cell_size = MethodBind.get("AStarGrid2D", "get_cell_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.AStarGrid2D.mb_get_cell_size, livePtr)
  }

  /** AStarGrid2D.set_cell_shape */
  final def setCellShape(cell_shape: Long): Unit = {
    if (gdext.classes.AStarGrid2D.mb_set_cell_shape == null) gdext.classes.AStarGrid2D.mb_set_cell_shape = MethodBind.get("AStarGrid2D", "set_cell_shape", 4130591146L)
    Ptrcall.callVoid1(gdext.classes.AStarGrid2D.mb_set_cell_shape, livePtr, cell_shape)
  }

  /** AStarGrid2D.get_cell_shape */
  final def getCellShape(): Long = {
    if (gdext.classes.AStarGrid2D.mb_get_cell_shape == null) gdext.classes.AStarGrid2D.mb_get_cell_shape = MethodBind.get("AStarGrid2D", "get_cell_shape", 3293463634L)
    Ptrcall.call0[Long](gdext.classes.AStarGrid2D.mb_get_cell_shape, livePtr)
  }

  /** AStarGrid2D.is_in_bounds */
  final def isInBounds(x: Long, y: Long): Boolean = {
    if (gdext.classes.AStarGrid2D.mb_is_in_bounds == null) gdext.classes.AStarGrid2D.mb_is_in_bounds = MethodBind.get("AStarGrid2D", "is_in_bounds", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.AStarGrid2D.mb_is_in_bounds, livePtr, x, y)
  }

  /** AStarGrid2D.is_in_boundsv */
  final def isInBoundsv(id: gdext.builtin.Vector2i): Boolean = {
    if (gdext.classes.AStarGrid2D.mb_is_in_boundsv == null) gdext.classes.AStarGrid2D.mb_is_in_boundsv = MethodBind.get("AStarGrid2D", "is_in_boundsv", 3900751641L)
    Ptrcall.call1[gdext.builtin.Vector2i, Boolean](gdext.classes.AStarGrid2D.mb_is_in_boundsv, livePtr, id)
  }

  /** AStarGrid2D.is_dirty */
  final def isDirty(): Boolean = {
    if (gdext.classes.AStarGrid2D.mb_is_dirty == null) gdext.classes.AStarGrid2D.mb_is_dirty = MethodBind.get("AStarGrid2D", "is_dirty", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AStarGrid2D.mb_is_dirty, livePtr)
  }

  /** AStarGrid2D.update */
  final def update(): Unit = {
    if (gdext.classes.AStarGrid2D.mb_update == null) gdext.classes.AStarGrid2D.mb_update = MethodBind.get("AStarGrid2D", "update", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AStarGrid2D.mb_update, livePtr)
  }

  /** AStarGrid2D.set_jumping_enabled */
  final def setJumpingEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.AStarGrid2D.mb_set_jumping_enabled == null) gdext.classes.AStarGrid2D.mb_set_jumping_enabled = MethodBind.get("AStarGrid2D", "set_jumping_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AStarGrid2D.mb_set_jumping_enabled, livePtr, enabled)
  }

  /** AStarGrid2D.is_jumping_enabled */
  final def isJumpingEnabled(): Boolean = {
    if (gdext.classes.AStarGrid2D.mb_is_jumping_enabled == null) gdext.classes.AStarGrid2D.mb_is_jumping_enabled = MethodBind.get("AStarGrid2D", "is_jumping_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AStarGrid2D.mb_is_jumping_enabled, livePtr)
  }

  /** AStarGrid2D.set_diagonal_mode */
  final def setDiagonalMode(mode: Long): Unit = {
    if (gdext.classes.AStarGrid2D.mb_set_diagonal_mode == null) gdext.classes.AStarGrid2D.mb_set_diagonal_mode = MethodBind.get("AStarGrid2D", "set_diagonal_mode", 1017829798L)
    Ptrcall.callVoid1(gdext.classes.AStarGrid2D.mb_set_diagonal_mode, livePtr, mode)
  }

  /** AStarGrid2D.get_diagonal_mode */
  final def getDiagonalMode(): Long = {
    if (gdext.classes.AStarGrid2D.mb_get_diagonal_mode == null) gdext.classes.AStarGrid2D.mb_get_diagonal_mode = MethodBind.get("AStarGrid2D", "get_diagonal_mode", 3129282674L)
    Ptrcall.call0[Long](gdext.classes.AStarGrid2D.mb_get_diagonal_mode, livePtr)
  }

  /** AStarGrid2D.set_default_compute_heuristic */
  final def setDefaultComputeHeuristic(heuristic: Long): Unit = {
    if (gdext.classes.AStarGrid2D.mb_set_default_compute_heuristic == null) gdext.classes.AStarGrid2D.mb_set_default_compute_heuristic = MethodBind.get("AStarGrid2D", "set_default_compute_heuristic", 1044375519L)
    Ptrcall.callVoid1(gdext.classes.AStarGrid2D.mb_set_default_compute_heuristic, livePtr, heuristic)
  }

  /** AStarGrid2D.get_default_compute_heuristic */
  final def getDefaultComputeHeuristic(): Long = {
    if (gdext.classes.AStarGrid2D.mb_get_default_compute_heuristic == null) gdext.classes.AStarGrid2D.mb_get_default_compute_heuristic = MethodBind.get("AStarGrid2D", "get_default_compute_heuristic", 2074731422L)
    Ptrcall.call0[Long](gdext.classes.AStarGrid2D.mb_get_default_compute_heuristic, livePtr)
  }

  /** AStarGrid2D.set_default_estimate_heuristic */
  final def setDefaultEstimateHeuristic(heuristic: Long): Unit = {
    if (gdext.classes.AStarGrid2D.mb_set_default_estimate_heuristic == null) gdext.classes.AStarGrid2D.mb_set_default_estimate_heuristic = MethodBind.get("AStarGrid2D", "set_default_estimate_heuristic", 1044375519L)
    Ptrcall.callVoid1(gdext.classes.AStarGrid2D.mb_set_default_estimate_heuristic, livePtr, heuristic)
  }

  /** AStarGrid2D.get_default_estimate_heuristic */
  final def getDefaultEstimateHeuristic(): Long = {
    if (gdext.classes.AStarGrid2D.mb_get_default_estimate_heuristic == null) gdext.classes.AStarGrid2D.mb_get_default_estimate_heuristic = MethodBind.get("AStarGrid2D", "get_default_estimate_heuristic", 2074731422L)
    Ptrcall.call0[Long](gdext.classes.AStarGrid2D.mb_get_default_estimate_heuristic, livePtr)
  }

  /** AStarGrid2D.set_point_solid */
  final def setPointSolid(id: gdext.builtin.Vector2i, solid: Boolean): Unit = {
    if (gdext.classes.AStarGrid2D.mb_set_point_solid == null) gdext.classes.AStarGrid2D.mb_set_point_solid = MethodBind.get("AStarGrid2D", "set_point_solid", 1765703753L)
    Ptrcall.callVoid2(gdext.classes.AStarGrid2D.mb_set_point_solid, livePtr, id, solid)
  }

  /** AStarGrid2D.is_point_solid */
  final def isPointSolid(id: gdext.builtin.Vector2i): Boolean = {
    if (gdext.classes.AStarGrid2D.mb_is_point_solid == null) gdext.classes.AStarGrid2D.mb_is_point_solid = MethodBind.get("AStarGrid2D", "is_point_solid", 3900751641L)
    Ptrcall.call1[gdext.builtin.Vector2i, Boolean](gdext.classes.AStarGrid2D.mb_is_point_solid, livePtr, id)
  }

  /** AStarGrid2D.set_point_weight_scale */
  final def setPointWeightScale(id: gdext.builtin.Vector2i, weight_scale: Double): Unit = {
    if (gdext.classes.AStarGrid2D.mb_set_point_weight_scale == null) gdext.classes.AStarGrid2D.mb_set_point_weight_scale = MethodBind.get("AStarGrid2D", "set_point_weight_scale", 2262553149L)
    Ptrcall.callVoid2(gdext.classes.AStarGrid2D.mb_set_point_weight_scale, livePtr, id, weight_scale)
  }

  /** AStarGrid2D.get_point_weight_scale */
  final def getPointWeightScale(id: gdext.builtin.Vector2i): Double = {
    if (gdext.classes.AStarGrid2D.mb_get_point_weight_scale == null) gdext.classes.AStarGrid2D.mb_get_point_weight_scale = MethodBind.get("AStarGrid2D", "get_point_weight_scale", 719993801L)
    Ptrcall.call1[gdext.builtin.Vector2i, Double](gdext.classes.AStarGrid2D.mb_get_point_weight_scale, livePtr, id)
  }

  /** AStarGrid2D.fill_solid_region */
  final def fillSolidRegion(region: gdext.builtin.Rect2i, solid: Boolean): Unit = {
    if (gdext.classes.AStarGrid2D.mb_fill_solid_region == null) gdext.classes.AStarGrid2D.mb_fill_solid_region = MethodBind.get("AStarGrid2D", "fill_solid_region", 2261970063L)
    Ptrcall.callVoid2(gdext.classes.AStarGrid2D.mb_fill_solid_region, livePtr, region, solid)
  }

  /** AStarGrid2D.fill_weight_scale_region */
  final def fillWeightScaleRegion(region: gdext.builtin.Rect2i, weight_scale: Double): Unit = {
    if (gdext.classes.AStarGrid2D.mb_fill_weight_scale_region == null) gdext.classes.AStarGrid2D.mb_fill_weight_scale_region = MethodBind.get("AStarGrid2D", "fill_weight_scale_region", 2793244083L)
    Ptrcall.callVoid2(gdext.classes.AStarGrid2D.mb_fill_weight_scale_region, livePtr, region, weight_scale)
  }

  /** AStarGrid2D.clear */
  final def clear(): Unit = {
    if (gdext.classes.AStarGrid2D.mb_clear == null) gdext.classes.AStarGrid2D.mb_clear = MethodBind.get("AStarGrid2D", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AStarGrid2D.mb_clear, livePtr)
  }

  /** AStarGrid2D.get_point_position */
  final def getPointPosition(id: gdext.builtin.Vector2i): gdext.builtin.Vector2 = {
    if (gdext.classes.AStarGrid2D.mb_get_point_position == null) gdext.classes.AStarGrid2D.mb_get_point_position = MethodBind.get("AStarGrid2D", "get_point_position", 108438297L)
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Vector2](gdext.classes.AStarGrid2D.mb_get_point_position, livePtr, id)
  }

}

object AStarGrid2D {
  private[classes] var mb_set_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cell_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cell_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_in_bounds: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_in_boundsv: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_dirty: GDExtensionMethodBindPtr = null
  private[classes] var mb_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_jumping_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_jumping_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_diagonal_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_diagonal_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_compute_heuristic: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_compute_heuristic: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_estimate_heuristic: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_estimate_heuristic: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_solid: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_point_solid: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_weight_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_weight_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_fill_solid_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_fill_weight_scale_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_position: GDExtensionMethodBindPtr = null
}
