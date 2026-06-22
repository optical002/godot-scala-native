package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TileMapLayer`, extends `Node2D`. */
abstract class TileMapLayer extends Node2D {

  /** TileMapLayer.set_cell */
  final def setCell(coords: gdext.builtin.Vector2i, source_id: Long, atlas_coords: gdext.builtin.Vector2i, alternative_tile: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("TileMapLayer", "set_cell", 2428518503L), hostObject.objectPtr, coords, source_id, atlas_coords, alternative_tile)

  /** TileMapLayer.erase_cell */
  final def eraseCell(coords: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMapLayer", "erase_cell", 1130785943L), hostObject.objectPtr, coords)

  /** TileMapLayer.fix_invalid_tiles */
  final def fixInvalidTiles(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TileMapLayer", "fix_invalid_tiles", 3218959716L), hostObject.objectPtr)

  /** TileMapLayer.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TileMapLayer", "clear", 3218959716L), hostObject.objectPtr)

  /** TileMapLayer.get_cell_source_id */
  final def getCellSourceId(coords: gdext.builtin.Vector2i): Long =
    Ptrcall.call1[gdext.builtin.Vector2i, Long](MethodBind.get("TileMapLayer", "get_cell_source_id", 2485466453L), hostObject.objectPtr, coords)

  /** TileMapLayer.get_cell_atlas_coords */
  final def getCellAtlasCoords(coords: gdext.builtin.Vector2i): gdext.builtin.Vector2i =
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Vector2i](MethodBind.get("TileMapLayer", "get_cell_atlas_coords", 3050897911L), hostObject.objectPtr, coords)

  /** TileMapLayer.get_cell_alternative_tile */
  final def getCellAlternativeTile(coords: gdext.builtin.Vector2i): Long =
    Ptrcall.call1[gdext.builtin.Vector2i, Long](MethodBind.get("TileMapLayer", "get_cell_alternative_tile", 2485466453L), hostObject.objectPtr, coords)

  /** TileMapLayer.get_cell_tile_data */
  final def getCellTileData(coords: gdext.builtin.Vector2i): GodotObject =
    Ptrcall.call1[gdext.builtin.Vector2i, GodotObject](MethodBind.get("TileMapLayer", "get_cell_tile_data", 205084707L), hostObject.objectPtr, coords)

  /** TileMapLayer.is_cell_flipped_h */
  final def isCellFlippedH(coords: gdext.builtin.Vector2i): Boolean =
    Ptrcall.call1[gdext.builtin.Vector2i, Boolean](MethodBind.get("TileMapLayer", "is_cell_flipped_h", 3900751641L), hostObject.objectPtr, coords)

  /** TileMapLayer.is_cell_flipped_v */
  final def isCellFlippedV(coords: gdext.builtin.Vector2i): Boolean =
    Ptrcall.call1[gdext.builtin.Vector2i, Boolean](MethodBind.get("TileMapLayer", "is_cell_flipped_v", 3900751641L), hostObject.objectPtr, coords)

  /** TileMapLayer.is_cell_transposed */
  final def isCellTransposed(coords: gdext.builtin.Vector2i): Boolean =
    Ptrcall.call1[gdext.builtin.Vector2i, Boolean](MethodBind.get("TileMapLayer", "is_cell_transposed", 3900751641L), hostObject.objectPtr, coords)

  /** TileMapLayer.get_used_rect */
  final def getUsedRect(): gdext.builtin.Rect2i =
    Ptrcall.call0[gdext.builtin.Rect2i](MethodBind.get("TileMapLayer", "get_used_rect", 410525958L), hostObject.objectPtr)

  /** TileMapLayer.set_pattern */
  final def setPattern(position: gdext.builtin.Vector2i, pattern: TileMapPattern): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileMapLayer", "set_pattern", 1491151770L), hostObject.objectPtr, position, pattern.hostObject)

  /** TileMapLayer.update_internals */
  final def updateInternals(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TileMapLayer", "update_internals", 3218959716L), hostObject.objectPtr)

  /** TileMapLayer.notify_runtime_tile_data_update */
  final def notifyRuntimeTileDataUpdate(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TileMapLayer", "notify_runtime_tile_data_update", 3218959716L), hostObject.objectPtr)

  /** TileMapLayer.map_pattern */
  final def mapPattern(position_in_tilemap: gdext.builtin.Vector2i, coords_in_pattern: gdext.builtin.Vector2i, pattern: TileMapPattern): gdext.builtin.Vector2i =
    Ptrcall.call3[gdext.builtin.Vector2i, gdext.builtin.Vector2i, GodotObject, gdext.builtin.Vector2i](MethodBind.get("TileMapLayer", "map_pattern", 1864516957L), hostObject.objectPtr, position_in_tilemap, coords_in_pattern, pattern.hostObject)

  /** TileMapLayer.get_neighbor_cell */
  final def getNeighborCell(coords: gdext.builtin.Vector2i, neighbor: Long): gdext.builtin.Vector2i =
    Ptrcall.call2[gdext.builtin.Vector2i, Long, gdext.builtin.Vector2i](MethodBind.get("TileMapLayer", "get_neighbor_cell", 986575103L), hostObject.objectPtr, coords, neighbor)

  /** TileMapLayer.map_to_local */
  final def mapToLocal(map_position: gdext.builtin.Vector2i): gdext.builtin.Vector2 =
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Vector2](MethodBind.get("TileMapLayer", "map_to_local", 108438297L), hostObject.objectPtr, map_position)

  /** TileMapLayer.local_to_map */
  final def localToMap(local_position: gdext.builtin.Vector2): gdext.builtin.Vector2i =
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector2i](MethodBind.get("TileMapLayer", "local_to_map", 837806996L), hostObject.objectPtr, local_position)

  /** TileMapLayer.set_enabled */
  final def setEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMapLayer", "set_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TileMapLayer.is_enabled */
  final def isEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TileMapLayer", "is_enabled", 36873697L), hostObject.objectPtr)

  /** TileMapLayer.set_tile_set */
  final def setTileSet(tile_set: TileSet): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMapLayer", "set_tile_set", 774531446L), hostObject.objectPtr, tile_set.hostObject)

  /** TileMapLayer.get_tile_set */
  final def getTileSet(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TileMapLayer", "get_tile_set", 2678226422L), hostObject.objectPtr)

  /** TileMapLayer.set_y_sort_origin */
  final def setYSortOrigin(y_sort_origin: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMapLayer", "set_y_sort_origin", 1286410249L), hostObject.objectPtr, y_sort_origin)

  /** TileMapLayer.get_y_sort_origin */
  final def getYSortOrigin(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileMapLayer", "get_y_sort_origin", 3905245786L), hostObject.objectPtr)

  /** TileMapLayer.set_x_draw_order_reversed */
  final def setXDrawOrderReversed(x_draw_order_reversed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMapLayer", "set_x_draw_order_reversed", 2586408642L), hostObject.objectPtr, x_draw_order_reversed)

  /** TileMapLayer.is_x_draw_order_reversed */
  final def isXDrawOrderReversed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TileMapLayer", "is_x_draw_order_reversed", 36873697L), hostObject.objectPtr)

  /** TileMapLayer.set_rendering_quadrant_size */
  final def setRenderingQuadrantSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMapLayer", "set_rendering_quadrant_size", 1286410249L), hostObject.objectPtr, size)

  /** TileMapLayer.get_rendering_quadrant_size */
  final def getRenderingQuadrantSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileMapLayer", "get_rendering_quadrant_size", 3905245786L), hostObject.objectPtr)

  /** TileMapLayer.set_collision_enabled */
  final def setCollisionEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMapLayer", "set_collision_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TileMapLayer.is_collision_enabled */
  final def isCollisionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TileMapLayer", "is_collision_enabled", 36873697L), hostObject.objectPtr)

  /** TileMapLayer.set_use_kinematic_bodies */
  final def setUseKinematicBodies(use_kinematic_bodies: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMapLayer", "set_use_kinematic_bodies", 2586408642L), hostObject.objectPtr, use_kinematic_bodies)

  /** TileMapLayer.is_using_kinematic_bodies */
  final def isUsingKinematicBodies(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TileMapLayer", "is_using_kinematic_bodies", 36873697L), hostObject.objectPtr)

  /** TileMapLayer.set_collision_visibility_mode */
  final def setCollisionVisibilityMode(visibility_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMapLayer", "set_collision_visibility_mode", 3508099847L), hostObject.objectPtr, visibility_mode)

  /** TileMapLayer.get_collision_visibility_mode */
  final def getCollisionVisibilityMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileMapLayer", "get_collision_visibility_mode", 338220793L), hostObject.objectPtr)

  /** TileMapLayer.set_physics_quadrant_size */
  final def setPhysicsQuadrantSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMapLayer", "set_physics_quadrant_size", 1286410249L), hostObject.objectPtr, size)

  /** TileMapLayer.get_physics_quadrant_size */
  final def getPhysicsQuadrantSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileMapLayer", "get_physics_quadrant_size", 3905245786L), hostObject.objectPtr)

  /** TileMapLayer.set_occlusion_enabled */
  final def setOcclusionEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMapLayer", "set_occlusion_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TileMapLayer.is_occlusion_enabled */
  final def isOcclusionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TileMapLayer", "is_occlusion_enabled", 36873697L), hostObject.objectPtr)

  /** TileMapLayer.set_navigation_enabled */
  final def setNavigationEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMapLayer", "set_navigation_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TileMapLayer.is_navigation_enabled */
  final def isNavigationEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TileMapLayer", "is_navigation_enabled", 36873697L), hostObject.objectPtr)

  /** TileMapLayer.set_navigation_visibility_mode */
  final def setNavigationVisibilityMode(show_navigation: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMapLayer", "set_navigation_visibility_mode", 3508099847L), hostObject.objectPtr, show_navigation)

  /** TileMapLayer.get_navigation_visibility_mode */
  final def getNavigationVisibilityMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileMapLayer", "get_navigation_visibility_mode", 338220793L), hostObject.objectPtr)

}

object TileMapLayer {
  /** Class metadata for Gd[TileMapLayer] lifetime management and casting. */
  given GodotClass[TileMapLayer] with {
    def className = "TileMapLayer"
    def isRefCounted = false
    def wrap(o: GodotObject): TileMapLayer = new TileMapLayer {}.withHost(o.objectPtr)
    def unwrap(t: TileMapLayer): GodotObject = t.hostObject
  }
}
