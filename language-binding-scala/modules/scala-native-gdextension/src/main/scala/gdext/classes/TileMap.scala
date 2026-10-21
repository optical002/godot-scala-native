package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TileMap`, extends `Node2D`. */
abstract class TileMap extends Node2D {
  override def godotClassName: String = "TileMap"

  /** TileMap.force_update */
  final def forceUpdate(layer: Long): Unit = {
    if (gdext.classes.TileMap.mb_force_update == null) gdext.classes.TileMap.mb_force_update = MethodBind.get("TileMap", "force_update", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TileMap.mb_force_update, livePtr, layer)
  }

  /** TileMap.set_tileset */
  final def setTileset(tileset: TileSet): Unit = {
    if (gdext.classes.TileMap.mb_set_tileset == null) gdext.classes.TileMap.mb_set_tileset = MethodBind.get("TileMap", "set_tileset", 774531446L)
    Ptrcall.callVoid1(gdext.classes.TileMap.mb_set_tileset, livePtr, Wrappers.handle(tileset))
  }

  /** TileMap.get_tileset. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTileset(): TileSet = {
    if (gdext.classes.TileMap.mb_get_tileset == null) gdext.classes.TileMap.mb_get_tileset = MethodBind.get("TileMap", "get_tileset", 2678226422L)
    Wrappers.owned[TileSet](Ptrcall.call0[Long](gdext.classes.TileMap.mb_get_tileset, livePtr))
  }

  /** TileMap.set_rendering_quadrant_size */
  final def setRenderingQuadrantSize(size: Long): Unit = {
    if (gdext.classes.TileMap.mb_set_rendering_quadrant_size == null) gdext.classes.TileMap.mb_set_rendering_quadrant_size = MethodBind.get("TileMap", "set_rendering_quadrant_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileMap.mb_set_rendering_quadrant_size, livePtr, size)
  }

  /** TileMap.get_rendering_quadrant_size */
  final def getRenderingQuadrantSize(): Long = {
    if (gdext.classes.TileMap.mb_get_rendering_quadrant_size == null) gdext.classes.TileMap.mb_get_rendering_quadrant_size = MethodBind.get("TileMap", "get_rendering_quadrant_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileMap.mb_get_rendering_quadrant_size, livePtr)
  }

  /** TileMap.get_layers_count */
  final def getLayersCount(): Long = {
    if (gdext.classes.TileMap.mb_get_layers_count == null) gdext.classes.TileMap.mb_get_layers_count = MethodBind.get("TileMap", "get_layers_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileMap.mb_get_layers_count, livePtr)
  }

  /** TileMap.add_layer */
  final def addLayer(to_position: Long): Unit = {
    if (gdext.classes.TileMap.mb_add_layer == null) gdext.classes.TileMap.mb_add_layer = MethodBind.get("TileMap", "add_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileMap.mb_add_layer, livePtr, to_position)
  }

  /** TileMap.move_layer */
  final def moveLayer(layer: Long, to_position: Long): Unit = {
    if (gdext.classes.TileMap.mb_move_layer == null) gdext.classes.TileMap.mb_move_layer = MethodBind.get("TileMap", "move_layer", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileMap.mb_move_layer, livePtr, layer, to_position)
  }

  /** TileMap.remove_layer */
  final def removeLayer(layer: Long): Unit = {
    if (gdext.classes.TileMap.mb_remove_layer == null) gdext.classes.TileMap.mb_remove_layer = MethodBind.get("TileMap", "remove_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileMap.mb_remove_layer, livePtr, layer)
  }

  /** TileMap.set_layer_name */
  final def setLayerName(layer: Long, name: String): Unit = {
    if (gdext.classes.TileMap.mb_set_layer_name == null) gdext.classes.TileMap.mb_set_layer_name = MethodBind.get("TileMap", "set_layer_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TileMap.mb_set_layer_name, livePtr, layer, name)
  }

  /** TileMap.get_layer_name */
  final def getLayerName(layer: Long): String = {
    if (gdext.classes.TileMap.mb_get_layer_name == null) gdext.classes.TileMap.mb_get_layer_name = MethodBind.get("TileMap", "get_layer_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TileMap.mb_get_layer_name, livePtr, layer)
  }

  /** TileMap.set_layer_enabled */
  final def setLayerEnabled(layer: Long, enabled: Boolean): Unit = {
    if (gdext.classes.TileMap.mb_set_layer_enabled == null) gdext.classes.TileMap.mb_set_layer_enabled = MethodBind.get("TileMap", "set_layer_enabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TileMap.mb_set_layer_enabled, livePtr, layer, enabled)
  }

  /** TileMap.is_layer_enabled */
  final def isLayerEnabled(layer: Long): Boolean = {
    if (gdext.classes.TileMap.mb_is_layer_enabled == null) gdext.classes.TileMap.mb_is_layer_enabled = MethodBind.get("TileMap", "is_layer_enabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TileMap.mb_is_layer_enabled, livePtr, layer)
  }

  /** TileMap.set_layer_modulate */
  final def setLayerModulate(layer: Long, modulate: gdext.builtin.Color): Unit = {
    if (gdext.classes.TileMap.mb_set_layer_modulate == null) gdext.classes.TileMap.mb_set_layer_modulate = MethodBind.get("TileMap", "set_layer_modulate", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.TileMap.mb_set_layer_modulate, livePtr, layer, modulate)
  }

  /** TileMap.get_layer_modulate */
  final def getLayerModulate(layer: Long): gdext.builtin.Color = {
    if (gdext.classes.TileMap.mb_get_layer_modulate == null) gdext.classes.TileMap.mb_get_layer_modulate = MethodBind.get("TileMap", "get_layer_modulate", 3457211756L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.TileMap.mb_get_layer_modulate, livePtr, layer)
  }

  /** TileMap.set_layer_y_sort_enabled */
  final def setLayerYSortEnabled(layer: Long, y_sort_enabled: Boolean): Unit = {
    if (gdext.classes.TileMap.mb_set_layer_y_sort_enabled == null) gdext.classes.TileMap.mb_set_layer_y_sort_enabled = MethodBind.get("TileMap", "set_layer_y_sort_enabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TileMap.mb_set_layer_y_sort_enabled, livePtr, layer, y_sort_enabled)
  }

  /** TileMap.is_layer_y_sort_enabled */
  final def isLayerYSortEnabled(layer: Long): Boolean = {
    if (gdext.classes.TileMap.mb_is_layer_y_sort_enabled == null) gdext.classes.TileMap.mb_is_layer_y_sort_enabled = MethodBind.get("TileMap", "is_layer_y_sort_enabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TileMap.mb_is_layer_y_sort_enabled, livePtr, layer)
  }

  /** TileMap.set_layer_y_sort_origin */
  final def setLayerYSortOrigin(layer: Long, y_sort_origin: Long): Unit = {
    if (gdext.classes.TileMap.mb_set_layer_y_sort_origin == null) gdext.classes.TileMap.mb_set_layer_y_sort_origin = MethodBind.get("TileMap", "set_layer_y_sort_origin", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileMap.mb_set_layer_y_sort_origin, livePtr, layer, y_sort_origin)
  }

  /** TileMap.get_layer_y_sort_origin */
  final def getLayerYSortOrigin(layer: Long): Long = {
    if (gdext.classes.TileMap.mb_get_layer_y_sort_origin == null) gdext.classes.TileMap.mb_get_layer_y_sort_origin = MethodBind.get("TileMap", "get_layer_y_sort_origin", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileMap.mb_get_layer_y_sort_origin, livePtr, layer)
  }

  /** TileMap.set_layer_z_index */
  final def setLayerZIndex(layer: Long, z_index: Long): Unit = {
    if (gdext.classes.TileMap.mb_set_layer_z_index == null) gdext.classes.TileMap.mb_set_layer_z_index = MethodBind.get("TileMap", "set_layer_z_index", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileMap.mb_set_layer_z_index, livePtr, layer, z_index)
  }

  /** TileMap.get_layer_z_index */
  final def getLayerZIndex(layer: Long): Long = {
    if (gdext.classes.TileMap.mb_get_layer_z_index == null) gdext.classes.TileMap.mb_get_layer_z_index = MethodBind.get("TileMap", "get_layer_z_index", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileMap.mb_get_layer_z_index, livePtr, layer)
  }

  /** TileMap.set_layer_navigation_enabled */
  final def setLayerNavigationEnabled(layer: Long, enabled: Boolean): Unit = {
    if (gdext.classes.TileMap.mb_set_layer_navigation_enabled == null) gdext.classes.TileMap.mb_set_layer_navigation_enabled = MethodBind.get("TileMap", "set_layer_navigation_enabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TileMap.mb_set_layer_navigation_enabled, livePtr, layer, enabled)
  }

  /** TileMap.is_layer_navigation_enabled */
  final def isLayerNavigationEnabled(layer: Long): Boolean = {
    if (gdext.classes.TileMap.mb_is_layer_navigation_enabled == null) gdext.classes.TileMap.mb_is_layer_navigation_enabled = MethodBind.get("TileMap", "is_layer_navigation_enabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TileMap.mb_is_layer_navigation_enabled, livePtr, layer)
  }

  /** TileMap.set_collision_animatable */
  final def setCollisionAnimatable(enabled: Boolean): Unit = {
    if (gdext.classes.TileMap.mb_set_collision_animatable == null) gdext.classes.TileMap.mb_set_collision_animatable = MethodBind.get("TileMap", "set_collision_animatable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TileMap.mb_set_collision_animatable, livePtr, enabled)
  }

  /** TileMap.is_collision_animatable */
  final def isCollisionAnimatable(): Boolean = {
    if (gdext.classes.TileMap.mb_is_collision_animatable == null) gdext.classes.TileMap.mb_is_collision_animatable = MethodBind.get("TileMap", "is_collision_animatable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TileMap.mb_is_collision_animatable, livePtr)
  }

  /** TileMap.set_collision_visibility_mode */
  final def setCollisionVisibilityMode(collision_visibility_mode: Long): Unit = {
    if (gdext.classes.TileMap.mb_set_collision_visibility_mode == null) gdext.classes.TileMap.mb_set_collision_visibility_mode = MethodBind.get("TileMap", "set_collision_visibility_mode", 3193440636L)
    Ptrcall.callVoid1(gdext.classes.TileMap.mb_set_collision_visibility_mode, livePtr, collision_visibility_mode)
  }

  /** TileMap.get_collision_visibility_mode */
  final def getCollisionVisibilityMode(): Long = {
    if (gdext.classes.TileMap.mb_get_collision_visibility_mode == null) gdext.classes.TileMap.mb_get_collision_visibility_mode = MethodBind.get("TileMap", "get_collision_visibility_mode", 1697018252L)
    Ptrcall.call0[Long](gdext.classes.TileMap.mb_get_collision_visibility_mode, livePtr)
  }

  /** TileMap.set_navigation_visibility_mode */
  final def setNavigationVisibilityMode(navigation_visibility_mode: Long): Unit = {
    if (gdext.classes.TileMap.mb_set_navigation_visibility_mode == null) gdext.classes.TileMap.mb_set_navigation_visibility_mode = MethodBind.get("TileMap", "set_navigation_visibility_mode", 3193440636L)
    Ptrcall.callVoid1(gdext.classes.TileMap.mb_set_navigation_visibility_mode, livePtr, navigation_visibility_mode)
  }

  /** TileMap.get_navigation_visibility_mode */
  final def getNavigationVisibilityMode(): Long = {
    if (gdext.classes.TileMap.mb_get_navigation_visibility_mode == null) gdext.classes.TileMap.mb_get_navigation_visibility_mode = MethodBind.get("TileMap", "get_navigation_visibility_mode", 1697018252L)
    Ptrcall.call0[Long](gdext.classes.TileMap.mb_get_navigation_visibility_mode, livePtr)
  }

  /** TileMap.set_cell */
  final def setCell(layer: Long, coords: gdext.builtin.Vector2i, source_id: Long, atlas_coords: gdext.builtin.Vector2i, alternative_tile: Long): Unit = {
    if (gdext.classes.TileMap.mb_set_cell == null) gdext.classes.TileMap.mb_set_cell = MethodBind.get("TileMap", "set_cell", 966713560L)
    Ptrcall.callVoid5(gdext.classes.TileMap.mb_set_cell, livePtr, layer, coords, source_id, atlas_coords, alternative_tile)
  }

  /** TileMap.erase_cell */
  final def eraseCell(layer: Long, coords: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.TileMap.mb_erase_cell == null) gdext.classes.TileMap.mb_erase_cell = MethodBind.get("TileMap", "erase_cell", 2311374912L)
    Ptrcall.callVoid2(gdext.classes.TileMap.mb_erase_cell, livePtr, layer, coords)
  }

  /** TileMap.get_cell_source_id */
  final def getCellSourceId(layer: Long, coords: gdext.builtin.Vector2i, use_proxies: Boolean): Long = {
    if (gdext.classes.TileMap.mb_get_cell_source_id == null) gdext.classes.TileMap.mb_get_cell_source_id = MethodBind.get("TileMap", "get_cell_source_id", 551761942L)
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Boolean, Long](gdext.classes.TileMap.mb_get_cell_source_id, livePtr, layer, coords, use_proxies)
  }

  /** TileMap.get_cell_atlas_coords */
  final def getCellAtlasCoords(layer: Long, coords: gdext.builtin.Vector2i, use_proxies: Boolean): gdext.builtin.Vector2i = {
    if (gdext.classes.TileMap.mb_get_cell_atlas_coords == null) gdext.classes.TileMap.mb_get_cell_atlas_coords = MethodBind.get("TileMap", "get_cell_atlas_coords", 1869815066L)
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Boolean, gdext.builtin.Vector2i](gdext.classes.TileMap.mb_get_cell_atlas_coords, livePtr, layer, coords, use_proxies)
  }

  /** TileMap.get_cell_alternative_tile */
  final def getCellAlternativeTile(layer: Long, coords: gdext.builtin.Vector2i, use_proxies: Boolean): Long = {
    if (gdext.classes.TileMap.mb_get_cell_alternative_tile == null) gdext.classes.TileMap.mb_get_cell_alternative_tile = MethodBind.get("TileMap", "get_cell_alternative_tile", 551761942L)
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Boolean, Long](gdext.classes.TileMap.mb_get_cell_alternative_tile, livePtr, layer, coords, use_proxies)
  }

  /** TileMap.get_cell_tile_data */
  final def getCellTileData(layer: Long, coords: gdext.builtin.Vector2i, use_proxies: Boolean): TileData = {
    if (gdext.classes.TileMap.mb_get_cell_tile_data == null) gdext.classes.TileMap.mb_get_cell_tile_data = MethodBind.get("TileMap", "get_cell_tile_data", 2849631287L)
    Wrappers.borrowed[TileData](Ptrcall.call3[Long, gdext.builtin.Vector2i, Boolean, Long](gdext.classes.TileMap.mb_get_cell_tile_data, livePtr, layer, coords, use_proxies))
  }

  /** TileMap.is_cell_flipped_h */
  final def isCellFlippedH(layer: Long, coords: gdext.builtin.Vector2i, use_proxies: Boolean): Boolean = {
    if (gdext.classes.TileMap.mb_is_cell_flipped_h == null) gdext.classes.TileMap.mb_is_cell_flipped_h = MethodBind.get("TileMap", "is_cell_flipped_h", 2908343862L)
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Boolean, Boolean](gdext.classes.TileMap.mb_is_cell_flipped_h, livePtr, layer, coords, use_proxies)
  }

  /** TileMap.is_cell_flipped_v */
  final def isCellFlippedV(layer: Long, coords: gdext.builtin.Vector2i, use_proxies: Boolean): Boolean = {
    if (gdext.classes.TileMap.mb_is_cell_flipped_v == null) gdext.classes.TileMap.mb_is_cell_flipped_v = MethodBind.get("TileMap", "is_cell_flipped_v", 2908343862L)
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Boolean, Boolean](gdext.classes.TileMap.mb_is_cell_flipped_v, livePtr, layer, coords, use_proxies)
  }

  /** TileMap.is_cell_transposed */
  final def isCellTransposed(layer: Long, coords: gdext.builtin.Vector2i, use_proxies: Boolean): Boolean = {
    if (gdext.classes.TileMap.mb_is_cell_transposed == null) gdext.classes.TileMap.mb_is_cell_transposed = MethodBind.get("TileMap", "is_cell_transposed", 2908343862L)
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Boolean, Boolean](gdext.classes.TileMap.mb_is_cell_transposed, livePtr, layer, coords, use_proxies)
  }

  /** TileMap.map_pattern */
  final def mapPattern(position_in_tilemap: gdext.builtin.Vector2i, coords_in_pattern: gdext.builtin.Vector2i, pattern: TileMapPattern): gdext.builtin.Vector2i = {
    if (gdext.classes.TileMap.mb_map_pattern == null) gdext.classes.TileMap.mb_map_pattern = MethodBind.get("TileMap", "map_pattern", 1864516957L)
    Ptrcall.call3[gdext.builtin.Vector2i, gdext.builtin.Vector2i, GodotObject, gdext.builtin.Vector2i](gdext.classes.TileMap.mb_map_pattern, livePtr, position_in_tilemap, coords_in_pattern, Wrappers.handle(pattern))
  }

  /** TileMap.set_pattern */
  final def setPattern(layer: Long, position: gdext.builtin.Vector2i, pattern: TileMapPattern): Unit = {
    if (gdext.classes.TileMap.mb_set_pattern == null) gdext.classes.TileMap.mb_set_pattern = MethodBind.get("TileMap", "set_pattern", 1195853946L)
    Ptrcall.callVoid3(gdext.classes.TileMap.mb_set_pattern, livePtr, layer, position, Wrappers.handle(pattern))
  }

  /** TileMap.fix_invalid_tiles */
  final def fixInvalidTiles(): Unit = {
    if (gdext.classes.TileMap.mb_fix_invalid_tiles == null) gdext.classes.TileMap.mb_fix_invalid_tiles = MethodBind.get("TileMap", "fix_invalid_tiles", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TileMap.mb_fix_invalid_tiles, livePtr)
  }

  /** TileMap.clear_layer */
  final def clearLayer(layer: Long): Unit = {
    if (gdext.classes.TileMap.mb_clear_layer == null) gdext.classes.TileMap.mb_clear_layer = MethodBind.get("TileMap", "clear_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileMap.mb_clear_layer, livePtr, layer)
  }

  /** TileMap.clear */
  final def clear(): Unit = {
    if (gdext.classes.TileMap.mb_clear == null) gdext.classes.TileMap.mb_clear = MethodBind.get("TileMap", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TileMap.mb_clear, livePtr)
  }

  /** TileMap.update_internals */
  final def updateInternals(): Unit = {
    if (gdext.classes.TileMap.mb_update_internals == null) gdext.classes.TileMap.mb_update_internals = MethodBind.get("TileMap", "update_internals", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TileMap.mb_update_internals, livePtr)
  }

  /** TileMap.notify_runtime_tile_data_update */
  final def notifyRuntimeTileDataUpdate(layer: Long): Unit = {
    if (gdext.classes.TileMap.mb_notify_runtime_tile_data_update == null) gdext.classes.TileMap.mb_notify_runtime_tile_data_update = MethodBind.get("TileMap", "notify_runtime_tile_data_update", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TileMap.mb_notify_runtime_tile_data_update, livePtr, layer)
  }

  /** TileMap.get_used_rect */
  final def getUsedRect(): gdext.builtin.Rect2i = {
    if (gdext.classes.TileMap.mb_get_used_rect == null) gdext.classes.TileMap.mb_get_used_rect = MethodBind.get("TileMap", "get_used_rect", 410525958L)
    Ptrcall.call0[gdext.builtin.Rect2i](gdext.classes.TileMap.mb_get_used_rect, livePtr)
  }

  /** TileMap.map_to_local */
  final def mapToLocal(map_position: gdext.builtin.Vector2i): gdext.builtin.Vector2 = {
    if (gdext.classes.TileMap.mb_map_to_local == null) gdext.classes.TileMap.mb_map_to_local = MethodBind.get("TileMap", "map_to_local", 108438297L)
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Vector2](gdext.classes.TileMap.mb_map_to_local, livePtr, map_position)
  }

  /** TileMap.local_to_map */
  final def localToMap(local_position: gdext.builtin.Vector2): gdext.builtin.Vector2i = {
    if (gdext.classes.TileMap.mb_local_to_map == null) gdext.classes.TileMap.mb_local_to_map = MethodBind.get("TileMap", "local_to_map", 837806996L)
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector2i](gdext.classes.TileMap.mb_local_to_map, livePtr, local_position)
  }

  /** TileMap.get_neighbor_cell */
  final def getNeighborCell(coords: gdext.builtin.Vector2i, neighbor: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.TileMap.mb_get_neighbor_cell == null) gdext.classes.TileMap.mb_get_neighbor_cell = MethodBind.get("TileMap", "get_neighbor_cell", 986575103L)
    Ptrcall.call2[gdext.builtin.Vector2i, Long, gdext.builtin.Vector2i](gdext.classes.TileMap.mb_get_neighbor_cell, livePtr, coords, neighbor)
  }

}

object TileMap {
  private[classes] var mb_force_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tileset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tileset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rendering_quadrant_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rendering_quadrant_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layers_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_layer_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layer_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_layer_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_layer_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_layer_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layer_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_layer_y_sort_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_layer_y_sort_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_layer_y_sort_origin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layer_y_sort_origin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_layer_z_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layer_z_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_layer_navigation_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_layer_navigation_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_animatable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collision_animatable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_visibility_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_visibility_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_navigation_visibility_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_navigation_visibility_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cell: GDExtensionMethodBindPtr = null
  private[classes] var mb_erase_cell: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_source_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_atlas_coords: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_alternative_tile: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_tile_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_cell_flipped_h: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_cell_flipped_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_cell_transposed: GDExtensionMethodBindPtr = null
  private[classes] var mb_map_pattern: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pattern: GDExtensionMethodBindPtr = null
  private[classes] var mb_fix_invalid_tiles: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_update_internals: GDExtensionMethodBindPtr = null
  private[classes] var mb_notify_runtime_tile_data_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_used_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_map_to_local: GDExtensionMethodBindPtr = null
  private[classes] var mb_local_to_map: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_neighbor_cell: GDExtensionMethodBindPtr = null
}
