package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `TileMap`, extends `Node2D`. */
abstract class TileMap extends Node2D {
  override def godotClassName: String = "TileMap"

  /** TileMap.force_update */
  final def forceUpdate(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMap", "force_update", 1025054187L), hostObject.objectPtr, layer)

  /** TileMap.set_tileset */
  final def setTileset(tileset: TileSet): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMap", "set_tileset", 774531446L), hostObject.objectPtr, tileset.hostObject)

  /** TileMap.get_tileset */
  final def getTileset(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TileMap", "get_tileset", 2678226422L), hostObject.objectPtr)

  /** TileMap.set_rendering_quadrant_size */
  final def setRenderingQuadrantSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMap", "set_rendering_quadrant_size", 1286410249L), hostObject.objectPtr, size)

  /** TileMap.get_rendering_quadrant_size */
  final def getRenderingQuadrantSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileMap", "get_rendering_quadrant_size", 3905245786L), hostObject.objectPtr)

  /** TileMap.get_layers_count */
  final def getLayersCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileMap", "get_layers_count", 3905245786L), hostObject.objectPtr)

  /** TileMap.add_layer */
  final def addLayer(to_position: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMap", "add_layer", 1286410249L), hostObject.objectPtr, to_position)

  /** TileMap.move_layer */
  final def moveLayer(layer: Long, to_position: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileMap", "move_layer", 3937882851L), hostObject.objectPtr, layer, to_position)

  /** TileMap.remove_layer */
  final def removeLayer(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMap", "remove_layer", 1286410249L), hostObject.objectPtr, layer)

  /** TileMap.set_layer_name */
  final def setLayerName(layer: Long, name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileMap", "set_layer_name", 501894301L), hostObject.objectPtr, layer, name)

  /** TileMap.get_layer_name */
  final def getLayerName(layer: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TileMap", "get_layer_name", 844755477L), hostObject.objectPtr, layer)

  /** TileMap.set_layer_enabled */
  final def setLayerEnabled(layer: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileMap", "set_layer_enabled", 300928843L), hostObject.objectPtr, layer, enabled)

  /** TileMap.is_layer_enabled */
  final def isLayerEnabled(layer: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TileMap", "is_layer_enabled", 1116898809L), hostObject.objectPtr, layer)

  /** TileMap.set_layer_modulate */
  final def setLayerModulate(layer: Long, modulate: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileMap", "set_layer_modulate", 2878471219L), hostObject.objectPtr, layer, modulate)

  /** TileMap.get_layer_modulate */
  final def getLayerModulate(layer: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("TileMap", "get_layer_modulate", 3457211756L), hostObject.objectPtr, layer)

  /** TileMap.set_layer_y_sort_enabled */
  final def setLayerYSortEnabled(layer: Long, y_sort_enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileMap", "set_layer_y_sort_enabled", 300928843L), hostObject.objectPtr, layer, y_sort_enabled)

  /** TileMap.is_layer_y_sort_enabled */
  final def isLayerYSortEnabled(layer: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TileMap", "is_layer_y_sort_enabled", 1116898809L), hostObject.objectPtr, layer)

  /** TileMap.set_layer_y_sort_origin */
  final def setLayerYSortOrigin(layer: Long, y_sort_origin: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileMap", "set_layer_y_sort_origin", 3937882851L), hostObject.objectPtr, layer, y_sort_origin)

  /** TileMap.get_layer_y_sort_origin */
  final def getLayerYSortOrigin(layer: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TileMap", "get_layer_y_sort_origin", 923996154L), hostObject.objectPtr, layer)

  /** TileMap.set_layer_z_index */
  final def setLayerZIndex(layer: Long, z_index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileMap", "set_layer_z_index", 3937882851L), hostObject.objectPtr, layer, z_index)

  /** TileMap.get_layer_z_index */
  final def getLayerZIndex(layer: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TileMap", "get_layer_z_index", 923996154L), hostObject.objectPtr, layer)

  /** TileMap.set_layer_navigation_enabled */
  final def setLayerNavigationEnabled(layer: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileMap", "set_layer_navigation_enabled", 300928843L), hostObject.objectPtr, layer, enabled)

  /** TileMap.is_layer_navigation_enabled */
  final def isLayerNavigationEnabled(layer: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TileMap", "is_layer_navigation_enabled", 1116898809L), hostObject.objectPtr, layer)

  /** TileMap.set_collision_animatable */
  final def setCollisionAnimatable(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMap", "set_collision_animatable", 2586408642L), hostObject.objectPtr, enabled)

  /** TileMap.is_collision_animatable */
  final def isCollisionAnimatable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TileMap", "is_collision_animatable", 36873697L), hostObject.objectPtr)

  /** TileMap.set_collision_visibility_mode */
  final def setCollisionVisibilityMode(collision_visibility_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMap", "set_collision_visibility_mode", 3193440636L), hostObject.objectPtr, collision_visibility_mode)

  /** TileMap.get_collision_visibility_mode */
  final def getCollisionVisibilityMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileMap", "get_collision_visibility_mode", 1697018252L), hostObject.objectPtr)

  /** TileMap.set_navigation_visibility_mode */
  final def setNavigationVisibilityMode(navigation_visibility_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMap", "set_navigation_visibility_mode", 3193440636L), hostObject.objectPtr, navigation_visibility_mode)

  /** TileMap.get_navigation_visibility_mode */
  final def getNavigationVisibilityMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileMap", "get_navigation_visibility_mode", 1697018252L), hostObject.objectPtr)

  /** TileMap.set_cell */
  final def setCell(layer: Long, coords: gdext.builtin.Vector2i, source_id: Long, atlas_coords: gdext.builtin.Vector2i, alternative_tile: Long): Unit =
    Ptrcall.callVoid5(MethodBind.get("TileMap", "set_cell", 966713560L), hostObject.objectPtr, layer, coords, source_id, atlas_coords, alternative_tile)

  /** TileMap.erase_cell */
  final def eraseCell(layer: Long, coords: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileMap", "erase_cell", 2311374912L), hostObject.objectPtr, layer, coords)

  /** TileMap.get_cell_source_id */
  final def getCellSourceId(layer: Long, coords: gdext.builtin.Vector2i, use_proxies: Boolean): Long =
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Boolean, Long](MethodBind.get("TileMap", "get_cell_source_id", 551761942L), hostObject.objectPtr, layer, coords, use_proxies)

  /** TileMap.get_cell_atlas_coords */
  final def getCellAtlasCoords(layer: Long, coords: gdext.builtin.Vector2i, use_proxies: Boolean): gdext.builtin.Vector2i =
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Boolean, gdext.builtin.Vector2i](MethodBind.get("TileMap", "get_cell_atlas_coords", 1869815066L), hostObject.objectPtr, layer, coords, use_proxies)

  /** TileMap.get_cell_alternative_tile */
  final def getCellAlternativeTile(layer: Long, coords: gdext.builtin.Vector2i, use_proxies: Boolean): Long =
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Boolean, Long](MethodBind.get("TileMap", "get_cell_alternative_tile", 551761942L), hostObject.objectPtr, layer, coords, use_proxies)

  /** TileMap.get_cell_tile_data */
  final def getCellTileData(layer: Long, coords: gdext.builtin.Vector2i, use_proxies: Boolean): GodotObject =
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Boolean, GodotObject](MethodBind.get("TileMap", "get_cell_tile_data", 2849631287L), hostObject.objectPtr, layer, coords, use_proxies)

  /** TileMap.is_cell_flipped_h */
  final def isCellFlippedH(layer: Long, coords: gdext.builtin.Vector2i, use_proxies: Boolean): Boolean =
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Boolean, Boolean](MethodBind.get("TileMap", "is_cell_flipped_h", 2908343862L), hostObject.objectPtr, layer, coords, use_proxies)

  /** TileMap.is_cell_flipped_v */
  final def isCellFlippedV(layer: Long, coords: gdext.builtin.Vector2i, use_proxies: Boolean): Boolean =
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Boolean, Boolean](MethodBind.get("TileMap", "is_cell_flipped_v", 2908343862L), hostObject.objectPtr, layer, coords, use_proxies)

  /** TileMap.is_cell_transposed */
  final def isCellTransposed(layer: Long, coords: gdext.builtin.Vector2i, use_proxies: Boolean): Boolean =
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Boolean, Boolean](MethodBind.get("TileMap", "is_cell_transposed", 2908343862L), hostObject.objectPtr, layer, coords, use_proxies)

  /** TileMap.map_pattern */
  final def mapPattern(position_in_tilemap: gdext.builtin.Vector2i, coords_in_pattern: gdext.builtin.Vector2i, pattern: TileMapPattern): gdext.builtin.Vector2i =
    Ptrcall.call3[gdext.builtin.Vector2i, gdext.builtin.Vector2i, GodotObject, gdext.builtin.Vector2i](MethodBind.get("TileMap", "map_pattern", 1864516957L), hostObject.objectPtr, position_in_tilemap, coords_in_pattern, pattern.hostObject)

  /** TileMap.set_pattern */
  final def setPattern(layer: Long, position: gdext.builtin.Vector2i, pattern: TileMapPattern): Unit =
    Ptrcall.callVoid3(MethodBind.get("TileMap", "set_pattern", 1195853946L), hostObject.objectPtr, layer, position, pattern.hostObject)

  /** TileMap.fix_invalid_tiles */
  final def fixInvalidTiles(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TileMap", "fix_invalid_tiles", 3218959716L), hostObject.objectPtr)

  /** TileMap.clear_layer */
  final def clearLayer(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMap", "clear_layer", 1286410249L), hostObject.objectPtr, layer)

  /** TileMap.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TileMap", "clear", 3218959716L), hostObject.objectPtr)

  /** TileMap.update_internals */
  final def updateInternals(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TileMap", "update_internals", 3218959716L), hostObject.objectPtr)

  /** TileMap.notify_runtime_tile_data_update */
  final def notifyRuntimeTileDataUpdate(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMap", "notify_runtime_tile_data_update", 1025054187L), hostObject.objectPtr, layer)

  /** TileMap.get_used_rect */
  final def getUsedRect(): gdext.builtin.Rect2i =
    Ptrcall.call0[gdext.builtin.Rect2i](MethodBind.get("TileMap", "get_used_rect", 410525958L), hostObject.objectPtr)

  /** TileMap.map_to_local */
  final def mapToLocal(map_position: gdext.builtin.Vector2i): gdext.builtin.Vector2 =
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Vector2](MethodBind.get("TileMap", "map_to_local", 108438297L), hostObject.objectPtr, map_position)

  /** TileMap.local_to_map */
  final def localToMap(local_position: gdext.builtin.Vector2): gdext.builtin.Vector2i =
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector2i](MethodBind.get("TileMap", "local_to_map", 837806996L), hostObject.objectPtr, local_position)

  /** TileMap.get_neighbor_cell */
  final def getNeighborCell(coords: gdext.builtin.Vector2i, neighbor: Long): gdext.builtin.Vector2i =
    Ptrcall.call2[gdext.builtin.Vector2i, Long, gdext.builtin.Vector2i](MethodBind.get("TileMap", "get_neighbor_cell", 986575103L), hostObject.objectPtr, coords, neighbor)

}
