package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TileMapLayer`, extends `Node2D`. */
abstract class TileMapLayer extends Node2D {
  override def godotClassName: String = "TileMapLayer"

  /** TileMapLayer.set_cell */
  final def setCell(coords: gdext.builtin.Vector2i, source_id: Long, atlas_coords: gdext.builtin.Vector2i, alternative_tile: Long): Unit = {
    if (gdext.classes.TileMapLayer.mb_set_cell == null) gdext.classes.TileMapLayer.mb_set_cell = MethodBind.get("TileMapLayer", "set_cell", 2428518503L)
    Ptrcall.callVoid4(gdext.classes.TileMapLayer.mb_set_cell, livePtr, coords, source_id, atlas_coords, alternative_tile)
  }

  /** TileMapLayer.erase_cell */
  final def eraseCell(coords: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.TileMapLayer.mb_erase_cell == null) gdext.classes.TileMapLayer.mb_erase_cell = MethodBind.get("TileMapLayer", "erase_cell", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.TileMapLayer.mb_erase_cell, livePtr, coords)
  }

  /** TileMapLayer.fix_invalid_tiles */
  final def fixInvalidTiles(): Unit = {
    if (gdext.classes.TileMapLayer.mb_fix_invalid_tiles == null) gdext.classes.TileMapLayer.mb_fix_invalid_tiles = MethodBind.get("TileMapLayer", "fix_invalid_tiles", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TileMapLayer.mb_fix_invalid_tiles, livePtr)
  }

  /** TileMapLayer.clear */
  final def clear(): Unit = {
    if (gdext.classes.TileMapLayer.mb_clear == null) gdext.classes.TileMapLayer.mb_clear = MethodBind.get("TileMapLayer", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TileMapLayer.mb_clear, livePtr)
  }

  /** TileMapLayer.get_cell_source_id */
  final def getCellSourceId(coords: gdext.builtin.Vector2i): Long = {
    if (gdext.classes.TileMapLayer.mb_get_cell_source_id == null) gdext.classes.TileMapLayer.mb_get_cell_source_id = MethodBind.get("TileMapLayer", "get_cell_source_id", 2485466453L)
    Ptrcall.call1[gdext.builtin.Vector2i, Long](gdext.classes.TileMapLayer.mb_get_cell_source_id, livePtr, coords)
  }

  /** TileMapLayer.get_cell_atlas_coords */
  final def getCellAtlasCoords(coords: gdext.builtin.Vector2i): gdext.builtin.Vector2i = {
    if (gdext.classes.TileMapLayer.mb_get_cell_atlas_coords == null) gdext.classes.TileMapLayer.mb_get_cell_atlas_coords = MethodBind.get("TileMapLayer", "get_cell_atlas_coords", 3050897911L)
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Vector2i](gdext.classes.TileMapLayer.mb_get_cell_atlas_coords, livePtr, coords)
  }

  /** TileMapLayer.get_cell_alternative_tile */
  final def getCellAlternativeTile(coords: gdext.builtin.Vector2i): Long = {
    if (gdext.classes.TileMapLayer.mb_get_cell_alternative_tile == null) gdext.classes.TileMapLayer.mb_get_cell_alternative_tile = MethodBind.get("TileMapLayer", "get_cell_alternative_tile", 2485466453L)
    Ptrcall.call1[gdext.builtin.Vector2i, Long](gdext.classes.TileMapLayer.mb_get_cell_alternative_tile, livePtr, coords)
  }

  /** TileMapLayer.get_cell_tile_data */
  final def getCellTileData(coords: gdext.builtin.Vector2i): TileData = {
    if (gdext.classes.TileMapLayer.mb_get_cell_tile_data == null) gdext.classes.TileMapLayer.mb_get_cell_tile_data = MethodBind.get("TileMapLayer", "get_cell_tile_data", 205084707L)
    Wrappers.borrowed[TileData](Ptrcall.call1[gdext.builtin.Vector2i, Long](gdext.classes.TileMapLayer.mb_get_cell_tile_data, livePtr, coords))
  }

  /** TileMapLayer.is_cell_flipped_h */
  final def isCellFlippedH(coords: gdext.builtin.Vector2i): Boolean = {
    if (gdext.classes.TileMapLayer.mb_is_cell_flipped_h == null) gdext.classes.TileMapLayer.mb_is_cell_flipped_h = MethodBind.get("TileMapLayer", "is_cell_flipped_h", 3900751641L)
    Ptrcall.call1[gdext.builtin.Vector2i, Boolean](gdext.classes.TileMapLayer.mb_is_cell_flipped_h, livePtr, coords)
  }

  /** TileMapLayer.is_cell_flipped_v */
  final def isCellFlippedV(coords: gdext.builtin.Vector2i): Boolean = {
    if (gdext.classes.TileMapLayer.mb_is_cell_flipped_v == null) gdext.classes.TileMapLayer.mb_is_cell_flipped_v = MethodBind.get("TileMapLayer", "is_cell_flipped_v", 3900751641L)
    Ptrcall.call1[gdext.builtin.Vector2i, Boolean](gdext.classes.TileMapLayer.mb_is_cell_flipped_v, livePtr, coords)
  }

  /** TileMapLayer.is_cell_transposed */
  final def isCellTransposed(coords: gdext.builtin.Vector2i): Boolean = {
    if (gdext.classes.TileMapLayer.mb_is_cell_transposed == null) gdext.classes.TileMapLayer.mb_is_cell_transposed = MethodBind.get("TileMapLayer", "is_cell_transposed", 3900751641L)
    Ptrcall.call1[gdext.builtin.Vector2i, Boolean](gdext.classes.TileMapLayer.mb_is_cell_transposed, livePtr, coords)
  }

  /** TileMapLayer.get_used_rect */
  final def getUsedRect(): gdext.builtin.Rect2i = {
    if (gdext.classes.TileMapLayer.mb_get_used_rect == null) gdext.classes.TileMapLayer.mb_get_used_rect = MethodBind.get("TileMapLayer", "get_used_rect", 410525958L)
    Ptrcall.call0[gdext.builtin.Rect2i](gdext.classes.TileMapLayer.mb_get_used_rect, livePtr)
  }

  /** TileMapLayer.set_pattern */
  final def setPattern(position: gdext.builtin.Vector2i, pattern: TileMapPattern): Unit = {
    if (gdext.classes.TileMapLayer.mb_set_pattern == null) gdext.classes.TileMapLayer.mb_set_pattern = MethodBind.get("TileMapLayer", "set_pattern", 1491151770L)
    Ptrcall.callVoid2(gdext.classes.TileMapLayer.mb_set_pattern, livePtr, position, Wrappers.handle(pattern))
  }

  /** TileMapLayer.update_internals */
  final def updateInternals(): Unit = {
    if (gdext.classes.TileMapLayer.mb_update_internals == null) gdext.classes.TileMapLayer.mb_update_internals = MethodBind.get("TileMapLayer", "update_internals", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TileMapLayer.mb_update_internals, livePtr)
  }

  /** TileMapLayer.notify_runtime_tile_data_update */
  final def notifyRuntimeTileDataUpdate(): Unit = {
    if (gdext.classes.TileMapLayer.mb_notify_runtime_tile_data_update == null) gdext.classes.TileMapLayer.mb_notify_runtime_tile_data_update = MethodBind.get("TileMapLayer", "notify_runtime_tile_data_update", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TileMapLayer.mb_notify_runtime_tile_data_update, livePtr)
  }

  /** TileMapLayer.map_pattern */
  final def mapPattern(position_in_tilemap: gdext.builtin.Vector2i, coords_in_pattern: gdext.builtin.Vector2i, pattern: TileMapPattern): gdext.builtin.Vector2i = {
    if (gdext.classes.TileMapLayer.mb_map_pattern == null) gdext.classes.TileMapLayer.mb_map_pattern = MethodBind.get("TileMapLayer", "map_pattern", 1864516957L)
    Ptrcall.call3[gdext.builtin.Vector2i, gdext.builtin.Vector2i, GodotObject, gdext.builtin.Vector2i](gdext.classes.TileMapLayer.mb_map_pattern, livePtr, position_in_tilemap, coords_in_pattern, Wrappers.handle(pattern))
  }

  /** TileMapLayer.get_neighbor_cell */
  final def getNeighborCell(coords: gdext.builtin.Vector2i, neighbor: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.TileMapLayer.mb_get_neighbor_cell == null) gdext.classes.TileMapLayer.mb_get_neighbor_cell = MethodBind.get("TileMapLayer", "get_neighbor_cell", 986575103L)
    Ptrcall.call2[gdext.builtin.Vector2i, Long, gdext.builtin.Vector2i](gdext.classes.TileMapLayer.mb_get_neighbor_cell, livePtr, coords, neighbor)
  }

  /** TileMapLayer.map_to_local */
  final def mapToLocal(map_position: gdext.builtin.Vector2i): gdext.builtin.Vector2 = {
    if (gdext.classes.TileMapLayer.mb_map_to_local == null) gdext.classes.TileMapLayer.mb_map_to_local = MethodBind.get("TileMapLayer", "map_to_local", 108438297L)
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Vector2](gdext.classes.TileMapLayer.mb_map_to_local, livePtr, map_position)
  }

  /** TileMapLayer.local_to_map */
  final def localToMap(local_position: gdext.builtin.Vector2): gdext.builtin.Vector2i = {
    if (gdext.classes.TileMapLayer.mb_local_to_map == null) gdext.classes.TileMapLayer.mb_local_to_map = MethodBind.get("TileMapLayer", "local_to_map", 837806996L)
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector2i](gdext.classes.TileMapLayer.mb_local_to_map, livePtr, local_position)
  }

  /** TileMapLayer.set_enabled */
  final def setEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TileMapLayer.mb_set_enabled == null) gdext.classes.TileMapLayer.mb_set_enabled = MethodBind.get("TileMapLayer", "set_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TileMapLayer.mb_set_enabled, livePtr, enabled)
  }

  /** TileMapLayer.is_enabled */
  final def isEnabled(): Boolean = {
    if (gdext.classes.TileMapLayer.mb_is_enabled == null) gdext.classes.TileMapLayer.mb_is_enabled = MethodBind.get("TileMapLayer", "is_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TileMapLayer.mb_is_enabled, livePtr)
  }

  /** TileMapLayer.set_tile_set */
  final def setTileSet(tile_set: TileSet): Unit = {
    if (gdext.classes.TileMapLayer.mb_set_tile_set == null) gdext.classes.TileMapLayer.mb_set_tile_set = MethodBind.get("TileMapLayer", "set_tile_set", 774531446L)
    Ptrcall.callVoid1(gdext.classes.TileMapLayer.mb_set_tile_set, livePtr, Wrappers.handle(tile_set))
  }

  /** TileMapLayer.get_tile_set. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTileSet(): TileSet = {
    if (gdext.classes.TileMapLayer.mb_get_tile_set == null) gdext.classes.TileMapLayer.mb_get_tile_set = MethodBind.get("TileMapLayer", "get_tile_set", 2678226422L)
    Wrappers.owned[TileSet](Ptrcall.call0[Long](gdext.classes.TileMapLayer.mb_get_tile_set, livePtr))
  }

  /** TileMapLayer.set_y_sort_origin */
  final def setYSortOrigin(y_sort_origin: Long): Unit = {
    if (gdext.classes.TileMapLayer.mb_set_y_sort_origin == null) gdext.classes.TileMapLayer.mb_set_y_sort_origin = MethodBind.get("TileMapLayer", "set_y_sort_origin", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileMapLayer.mb_set_y_sort_origin, livePtr, y_sort_origin)
  }

  /** TileMapLayer.get_y_sort_origin */
  final def getYSortOrigin(): Long = {
    if (gdext.classes.TileMapLayer.mb_get_y_sort_origin == null) gdext.classes.TileMapLayer.mb_get_y_sort_origin = MethodBind.get("TileMapLayer", "get_y_sort_origin", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileMapLayer.mb_get_y_sort_origin, livePtr)
  }

  /** TileMapLayer.set_x_draw_order_reversed */
  final def setXDrawOrderReversed(x_draw_order_reversed: Boolean): Unit = {
    if (gdext.classes.TileMapLayer.mb_set_x_draw_order_reversed == null) gdext.classes.TileMapLayer.mb_set_x_draw_order_reversed = MethodBind.get("TileMapLayer", "set_x_draw_order_reversed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TileMapLayer.mb_set_x_draw_order_reversed, livePtr, x_draw_order_reversed)
  }

  /** TileMapLayer.is_x_draw_order_reversed */
  final def isXDrawOrderReversed(): Boolean = {
    if (gdext.classes.TileMapLayer.mb_is_x_draw_order_reversed == null) gdext.classes.TileMapLayer.mb_is_x_draw_order_reversed = MethodBind.get("TileMapLayer", "is_x_draw_order_reversed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TileMapLayer.mb_is_x_draw_order_reversed, livePtr)
  }

  /** TileMapLayer.set_rendering_quadrant_size */
  final def setRenderingQuadrantSize(size: Long): Unit = {
    if (gdext.classes.TileMapLayer.mb_set_rendering_quadrant_size == null) gdext.classes.TileMapLayer.mb_set_rendering_quadrant_size = MethodBind.get("TileMapLayer", "set_rendering_quadrant_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileMapLayer.mb_set_rendering_quadrant_size, livePtr, size)
  }

  /** TileMapLayer.get_rendering_quadrant_size */
  final def getRenderingQuadrantSize(): Long = {
    if (gdext.classes.TileMapLayer.mb_get_rendering_quadrant_size == null) gdext.classes.TileMapLayer.mb_get_rendering_quadrant_size = MethodBind.get("TileMapLayer", "get_rendering_quadrant_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileMapLayer.mb_get_rendering_quadrant_size, livePtr)
  }

  /** TileMapLayer.set_collision_enabled */
  final def setCollisionEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TileMapLayer.mb_set_collision_enabled == null) gdext.classes.TileMapLayer.mb_set_collision_enabled = MethodBind.get("TileMapLayer", "set_collision_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TileMapLayer.mb_set_collision_enabled, livePtr, enabled)
  }

  /** TileMapLayer.is_collision_enabled */
  final def isCollisionEnabled(): Boolean = {
    if (gdext.classes.TileMapLayer.mb_is_collision_enabled == null) gdext.classes.TileMapLayer.mb_is_collision_enabled = MethodBind.get("TileMapLayer", "is_collision_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TileMapLayer.mb_is_collision_enabled, livePtr)
  }

  /** TileMapLayer.set_use_kinematic_bodies */
  final def setUseKinematicBodies(use_kinematic_bodies: Boolean): Unit = {
    if (gdext.classes.TileMapLayer.mb_set_use_kinematic_bodies == null) gdext.classes.TileMapLayer.mb_set_use_kinematic_bodies = MethodBind.get("TileMapLayer", "set_use_kinematic_bodies", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TileMapLayer.mb_set_use_kinematic_bodies, livePtr, use_kinematic_bodies)
  }

  /** TileMapLayer.is_using_kinematic_bodies */
  final def isUsingKinematicBodies(): Boolean = {
    if (gdext.classes.TileMapLayer.mb_is_using_kinematic_bodies == null) gdext.classes.TileMapLayer.mb_is_using_kinematic_bodies = MethodBind.get("TileMapLayer", "is_using_kinematic_bodies", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TileMapLayer.mb_is_using_kinematic_bodies, livePtr)
  }

  /** TileMapLayer.set_collision_visibility_mode */
  final def setCollisionVisibilityMode(visibility_mode: Long): Unit = {
    if (gdext.classes.TileMapLayer.mb_set_collision_visibility_mode == null) gdext.classes.TileMapLayer.mb_set_collision_visibility_mode = MethodBind.get("TileMapLayer", "set_collision_visibility_mode", 3508099847L)
    Ptrcall.callVoid1(gdext.classes.TileMapLayer.mb_set_collision_visibility_mode, livePtr, visibility_mode)
  }

  /** TileMapLayer.get_collision_visibility_mode */
  final def getCollisionVisibilityMode(): Long = {
    if (gdext.classes.TileMapLayer.mb_get_collision_visibility_mode == null) gdext.classes.TileMapLayer.mb_get_collision_visibility_mode = MethodBind.get("TileMapLayer", "get_collision_visibility_mode", 338220793L)
    Ptrcall.call0[Long](gdext.classes.TileMapLayer.mb_get_collision_visibility_mode, livePtr)
  }

  /** TileMapLayer.set_physics_quadrant_size */
  final def setPhysicsQuadrantSize(size: Long): Unit = {
    if (gdext.classes.TileMapLayer.mb_set_physics_quadrant_size == null) gdext.classes.TileMapLayer.mb_set_physics_quadrant_size = MethodBind.get("TileMapLayer", "set_physics_quadrant_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileMapLayer.mb_set_physics_quadrant_size, livePtr, size)
  }

  /** TileMapLayer.get_physics_quadrant_size */
  final def getPhysicsQuadrantSize(): Long = {
    if (gdext.classes.TileMapLayer.mb_get_physics_quadrant_size == null) gdext.classes.TileMapLayer.mb_get_physics_quadrant_size = MethodBind.get("TileMapLayer", "get_physics_quadrant_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileMapLayer.mb_get_physics_quadrant_size, livePtr)
  }

  /** TileMapLayer.set_occlusion_enabled */
  final def setOcclusionEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TileMapLayer.mb_set_occlusion_enabled == null) gdext.classes.TileMapLayer.mb_set_occlusion_enabled = MethodBind.get("TileMapLayer", "set_occlusion_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TileMapLayer.mb_set_occlusion_enabled, livePtr, enabled)
  }

  /** TileMapLayer.is_occlusion_enabled */
  final def isOcclusionEnabled(): Boolean = {
    if (gdext.classes.TileMapLayer.mb_is_occlusion_enabled == null) gdext.classes.TileMapLayer.mb_is_occlusion_enabled = MethodBind.get("TileMapLayer", "is_occlusion_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TileMapLayer.mb_is_occlusion_enabled, livePtr)
  }

  /** TileMapLayer.set_navigation_enabled */
  final def setNavigationEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TileMapLayer.mb_set_navigation_enabled == null) gdext.classes.TileMapLayer.mb_set_navigation_enabled = MethodBind.get("TileMapLayer", "set_navigation_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TileMapLayer.mb_set_navigation_enabled, livePtr, enabled)
  }

  /** TileMapLayer.is_navigation_enabled */
  final def isNavigationEnabled(): Boolean = {
    if (gdext.classes.TileMapLayer.mb_is_navigation_enabled == null) gdext.classes.TileMapLayer.mb_is_navigation_enabled = MethodBind.get("TileMapLayer", "is_navigation_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TileMapLayer.mb_is_navigation_enabled, livePtr)
  }

  /** TileMapLayer.set_navigation_visibility_mode */
  final def setNavigationVisibilityMode(show_navigation: Long): Unit = {
    if (gdext.classes.TileMapLayer.mb_set_navigation_visibility_mode == null) gdext.classes.TileMapLayer.mb_set_navigation_visibility_mode = MethodBind.get("TileMapLayer", "set_navigation_visibility_mode", 3508099847L)
    Ptrcall.callVoid1(gdext.classes.TileMapLayer.mb_set_navigation_visibility_mode, livePtr, show_navigation)
  }

  /** TileMapLayer.get_navigation_visibility_mode */
  final def getNavigationVisibilityMode(): Long = {
    if (gdext.classes.TileMapLayer.mb_get_navigation_visibility_mode == null) gdext.classes.TileMapLayer.mb_get_navigation_visibility_mode = MethodBind.get("TileMapLayer", "get_navigation_visibility_mode", 338220793L)
    Ptrcall.call0[Long](gdext.classes.TileMapLayer.mb_get_navigation_visibility_mode, livePtr)
  }

}

object TileMapLayer {
  private[classes] var mb_set_cell: GDExtensionMethodBindPtr = null
  private[classes] var mb_erase_cell: GDExtensionMethodBindPtr = null
  private[classes] var mb_fix_invalid_tiles: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_source_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_atlas_coords: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_alternative_tile: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_tile_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_cell_flipped_h: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_cell_flipped_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_cell_transposed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_used_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pattern: GDExtensionMethodBindPtr = null
  private[classes] var mb_update_internals: GDExtensionMethodBindPtr = null
  private[classes] var mb_notify_runtime_tile_data_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_map_pattern: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_neighbor_cell: GDExtensionMethodBindPtr = null
  private[classes] var mb_map_to_local: GDExtensionMethodBindPtr = null
  private[classes] var mb_local_to_map: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tile_set: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_set: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_y_sort_origin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_y_sort_origin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_x_draw_order_reversed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_x_draw_order_reversed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rendering_quadrant_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rendering_quadrant_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collision_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_kinematic_bodies: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_kinematic_bodies: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_visibility_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_visibility_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_quadrant_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_quadrant_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_occlusion_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_occlusion_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_navigation_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_navigation_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_navigation_visibility_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_navigation_visibility_mode: GDExtensionMethodBindPtr = null
}
