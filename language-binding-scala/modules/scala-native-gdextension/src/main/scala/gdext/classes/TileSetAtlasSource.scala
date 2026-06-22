package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TileSetAtlasSource`, extends `TileSetSource`. */
abstract class TileSetAtlasSource extends TileSetSource {

  /** TileSetAtlasSource.set_texture */
  final def setTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSetAtlasSource", "set_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** TileSetAtlasSource.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TileSetAtlasSource", "get_texture", 3635182373L), hostObject.objectPtr)

  /** TileSetAtlasSource.set_margins */
  final def setMargins(margins: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSetAtlasSource", "set_margins", 1130785943L), hostObject.objectPtr, margins)

  /** TileSetAtlasSource.get_margins */
  final def getMargins(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("TileSetAtlasSource", "get_margins", 3690982128L), hostObject.objectPtr)

  /** TileSetAtlasSource.set_separation */
  final def setSeparation(separation: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSetAtlasSource", "set_separation", 1130785943L), hostObject.objectPtr, separation)

  /** TileSetAtlasSource.get_separation */
  final def getSeparation(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("TileSetAtlasSource", "get_separation", 3690982128L), hostObject.objectPtr)

  /** TileSetAtlasSource.set_texture_region_size */
  final def setTextureRegionSize(texture_region_size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSetAtlasSource", "set_texture_region_size", 1130785943L), hostObject.objectPtr, texture_region_size)

  /** TileSetAtlasSource.get_texture_region_size */
  final def getTextureRegionSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("TileSetAtlasSource", "get_texture_region_size", 3690982128L), hostObject.objectPtr)

  /** TileSetAtlasSource.set_use_texture_padding */
  final def setUseTexturePadding(use_texture_padding: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSetAtlasSource", "set_use_texture_padding", 2586408642L), hostObject.objectPtr, use_texture_padding)

  /** TileSetAtlasSource.get_use_texture_padding */
  final def getUseTexturePadding(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TileSetAtlasSource", "get_use_texture_padding", 36873697L), hostObject.objectPtr)

  /** TileSetAtlasSource.create_tile */
  final def createTile(atlas_coords: gdext.builtin.Vector2i, size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSetAtlasSource", "create_tile", 190528769L), hostObject.objectPtr, atlas_coords, size)

  /** TileSetAtlasSource.remove_tile */
  final def removeTile(atlas_coords: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSetAtlasSource", "remove_tile", 1130785943L), hostObject.objectPtr, atlas_coords)

  /** TileSetAtlasSource.move_tile_in_atlas */
  final def moveTileInAtlas(atlas_coords: gdext.builtin.Vector2i, new_atlas_coords: gdext.builtin.Vector2i, new_size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid3(MethodBind.get("TileSetAtlasSource", "move_tile_in_atlas", 3870111920L), hostObject.objectPtr, atlas_coords, new_atlas_coords, new_size)

  /** TileSetAtlasSource.get_tile_size_in_atlas */
  final def getTileSizeInAtlas(atlas_coords: gdext.builtin.Vector2i): gdext.builtin.Vector2i =
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Vector2i](MethodBind.get("TileSetAtlasSource", "get_tile_size_in_atlas", 3050897911L), hostObject.objectPtr, atlas_coords)

  /** TileSetAtlasSource.has_room_for_tile */
  final def hasRoomForTile(atlas_coords: gdext.builtin.Vector2i, size: gdext.builtin.Vector2i, animation_columns: Long, animation_separation: gdext.builtin.Vector2i, frames_count: Long, ignored_tile: gdext.builtin.Vector2i): Boolean =
    Ptrcall.call6[gdext.builtin.Vector2i, gdext.builtin.Vector2i, Long, gdext.builtin.Vector2i, Long, gdext.builtin.Vector2i, Boolean](MethodBind.get("TileSetAtlasSource", "has_room_for_tile", 3018597268L), hostObject.objectPtr, atlas_coords, size, animation_columns, animation_separation, frames_count, ignored_tile)

  /** TileSetAtlasSource.get_tile_at_coords */
  final def getTileAtCoords(atlas_coords: gdext.builtin.Vector2i): gdext.builtin.Vector2i =
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Vector2i](MethodBind.get("TileSetAtlasSource", "get_tile_at_coords", 3050897911L), hostObject.objectPtr, atlas_coords)

  /** TileSetAtlasSource.has_tiles_outside_texture */
  final def hasTilesOutsideTexture(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TileSetAtlasSource", "has_tiles_outside_texture", 36873697L), hostObject.objectPtr)

  /** TileSetAtlasSource.clear_tiles_outside_texture */
  final def clearTilesOutsideTexture(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TileSetAtlasSource", "clear_tiles_outside_texture", 3218959716L), hostObject.objectPtr)

  /** TileSetAtlasSource.set_tile_animation_columns */
  final def setTileAnimationColumns(atlas_coords: gdext.builtin.Vector2i, frame_columns: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSetAtlasSource", "set_tile_animation_columns", 3200960707L), hostObject.objectPtr, atlas_coords, frame_columns)

  /** TileSetAtlasSource.get_tile_animation_columns */
  final def getTileAnimationColumns(atlas_coords: gdext.builtin.Vector2i): Long =
    Ptrcall.call1[gdext.builtin.Vector2i, Long](MethodBind.get("TileSetAtlasSource", "get_tile_animation_columns", 2485466453L), hostObject.objectPtr, atlas_coords)

  /** TileSetAtlasSource.set_tile_animation_separation */
  final def setTileAnimationSeparation(atlas_coords: gdext.builtin.Vector2i, separation: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSetAtlasSource", "set_tile_animation_separation", 1941061099L), hostObject.objectPtr, atlas_coords, separation)

  /** TileSetAtlasSource.get_tile_animation_separation */
  final def getTileAnimationSeparation(atlas_coords: gdext.builtin.Vector2i): gdext.builtin.Vector2i =
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Vector2i](MethodBind.get("TileSetAtlasSource", "get_tile_animation_separation", 3050897911L), hostObject.objectPtr, atlas_coords)

  /** TileSetAtlasSource.set_tile_animation_speed */
  final def setTileAnimationSpeed(atlas_coords: gdext.builtin.Vector2i, speed: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSetAtlasSource", "set_tile_animation_speed", 2262553149L), hostObject.objectPtr, atlas_coords, speed)

  /** TileSetAtlasSource.get_tile_animation_speed */
  final def getTileAnimationSpeed(atlas_coords: gdext.builtin.Vector2i): Double =
    Ptrcall.call1[gdext.builtin.Vector2i, Double](MethodBind.get("TileSetAtlasSource", "get_tile_animation_speed", 719993801L), hostObject.objectPtr, atlas_coords)

  /** TileSetAtlasSource.set_tile_animation_mode */
  final def setTileAnimationMode(atlas_coords: gdext.builtin.Vector2i, mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSetAtlasSource", "set_tile_animation_mode", 3192753483L), hostObject.objectPtr, atlas_coords, mode)

  /** TileSetAtlasSource.get_tile_animation_mode */
  final def getTileAnimationMode(atlas_coords: gdext.builtin.Vector2i): Long =
    Ptrcall.call1[gdext.builtin.Vector2i, Long](MethodBind.get("TileSetAtlasSource", "get_tile_animation_mode", 4025349959L), hostObject.objectPtr, atlas_coords)

  /** TileSetAtlasSource.set_tile_animation_frames_count */
  final def setTileAnimationFramesCount(atlas_coords: gdext.builtin.Vector2i, frames_count: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSetAtlasSource", "set_tile_animation_frames_count", 3200960707L), hostObject.objectPtr, atlas_coords, frames_count)

  /** TileSetAtlasSource.get_tile_animation_frames_count */
  final def getTileAnimationFramesCount(atlas_coords: gdext.builtin.Vector2i): Long =
    Ptrcall.call1[gdext.builtin.Vector2i, Long](MethodBind.get("TileSetAtlasSource", "get_tile_animation_frames_count", 2485466453L), hostObject.objectPtr, atlas_coords)

  /** TileSetAtlasSource.set_tile_animation_frame_duration */
  final def setTileAnimationFrameDuration(atlas_coords: gdext.builtin.Vector2i, frame_index: Long, duration: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("TileSetAtlasSource", "set_tile_animation_frame_duration", 2843487787L), hostObject.objectPtr, atlas_coords, frame_index, duration)

  /** TileSetAtlasSource.get_tile_animation_frame_duration */
  final def getTileAnimationFrameDuration(atlas_coords: gdext.builtin.Vector2i, frame_index: Long): Double =
    Ptrcall.call2[gdext.builtin.Vector2i, Long, Double](MethodBind.get("TileSetAtlasSource", "get_tile_animation_frame_duration", 1802448425L), hostObject.objectPtr, atlas_coords, frame_index)

  /** TileSetAtlasSource.get_tile_animation_total_duration */
  final def getTileAnimationTotalDuration(atlas_coords: gdext.builtin.Vector2i): Double =
    Ptrcall.call1[gdext.builtin.Vector2i, Double](MethodBind.get("TileSetAtlasSource", "get_tile_animation_total_duration", 719993801L), hostObject.objectPtr, atlas_coords)

  /** TileSetAtlasSource.create_alternative_tile */
  final def createAlternativeTile(atlas_coords: gdext.builtin.Vector2i, alternative_id_override: Long): Long =
    Ptrcall.call2[gdext.builtin.Vector2i, Long, Long](MethodBind.get("TileSetAtlasSource", "create_alternative_tile", 2226298068L), hostObject.objectPtr, atlas_coords, alternative_id_override)

  /** TileSetAtlasSource.remove_alternative_tile */
  final def removeAlternativeTile(atlas_coords: gdext.builtin.Vector2i, alternative_tile: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSetAtlasSource", "remove_alternative_tile", 3200960707L), hostObject.objectPtr, atlas_coords, alternative_tile)

  /** TileSetAtlasSource.set_alternative_tile_id */
  final def setAlternativeTileId(atlas_coords: gdext.builtin.Vector2i, alternative_tile: Long, new_id: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("TileSetAtlasSource", "set_alternative_tile_id", 1499785778L), hostObject.objectPtr, atlas_coords, alternative_tile, new_id)

  /** TileSetAtlasSource.get_next_alternative_tile_id */
  final def getNextAlternativeTileId(atlas_coords: gdext.builtin.Vector2i): Long =
    Ptrcall.call1[gdext.builtin.Vector2i, Long](MethodBind.get("TileSetAtlasSource", "get_next_alternative_tile_id", 2485466453L), hostObject.objectPtr, atlas_coords)

  /** TileSetAtlasSource.get_tile_data */
  final def getTileData(atlas_coords: gdext.builtin.Vector2i, alternative_tile: Long): GodotObject =
    Ptrcall.call2[gdext.builtin.Vector2i, Long, GodotObject](MethodBind.get("TileSetAtlasSource", "get_tile_data", 3534028207L), hostObject.objectPtr, atlas_coords, alternative_tile)

  /** TileSetAtlasSource.get_atlas_grid_size */
  final def getAtlasGridSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("TileSetAtlasSource", "get_atlas_grid_size", 3690982128L), hostObject.objectPtr)

  /** TileSetAtlasSource.get_tile_texture_region */
  final def getTileTextureRegion(atlas_coords: gdext.builtin.Vector2i, frame: Long): gdext.builtin.Rect2i =
    Ptrcall.call2[gdext.builtin.Vector2i, Long, gdext.builtin.Rect2i](MethodBind.get("TileSetAtlasSource", "get_tile_texture_region", 241857547L), hostObject.objectPtr, atlas_coords, frame)

  /** TileSetAtlasSource.get_runtime_texture */
  final def getRuntimeTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TileSetAtlasSource", "get_runtime_texture", 3635182373L), hostObject.objectPtr)

  /** TileSetAtlasSource.get_runtime_tile_texture_region */
  final def getRuntimeTileTextureRegion(atlas_coords: gdext.builtin.Vector2i, frame: Long): gdext.builtin.Rect2i =
    Ptrcall.call2[gdext.builtin.Vector2i, Long, gdext.builtin.Rect2i](MethodBind.get("TileSetAtlasSource", "get_runtime_tile_texture_region", 104874263L), hostObject.objectPtr, atlas_coords, frame)

}

object TileSetAtlasSource {
  /** Class metadata for Gd[TileSetAtlasSource] lifetime management and casting. */
  given GodotClass[TileSetAtlasSource] with {
    def className = "TileSetAtlasSource"
    def isRefCounted = true
    def wrap(o: GodotObject): TileSetAtlasSource = new TileSetAtlasSource {}.withHost(o.objectPtr)
    def unwrap(t: TileSetAtlasSource): GodotObject = t.hostObject
  }
}
