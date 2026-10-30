package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TileSetAtlasSource`, extends `TileSetSource`. */
abstract class TileSetAtlasSource extends TileSetSource {
  override def godotClassName: String = "TileSetAtlasSource"

  /** TileSetAtlasSource.set_texture */
  final def setTexture(texture: Texture2D): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_set_texture == null) gdext.classes.TileSetAtlasSource.mb_set_texture = MethodBind.get("TileSetAtlasSource", "set_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.TileSetAtlasSource.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** TileSetAtlasSource.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture2D = {
    if (gdext.classes.TileSetAtlasSource.mb_get_texture == null) gdext.classes.TileSetAtlasSource.mb_get_texture = MethodBind.get("TileSetAtlasSource", "get_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.TileSetAtlasSource.mb_get_texture, livePtr))
  }

  /** TileSetAtlasSource.set_margins */
  final def setMargins(margins: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_set_margins == null) gdext.classes.TileSetAtlasSource.mb_set_margins = MethodBind.get("TileSetAtlasSource", "set_margins", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.TileSetAtlasSource.mb_set_margins, livePtr, margins)
  }

  /** TileSetAtlasSource.get_margins */
  final def getMargins(): gdext.builtin.Vector2i = {
    if (gdext.classes.TileSetAtlasSource.mb_get_margins == null) gdext.classes.TileSetAtlasSource.mb_get_margins = MethodBind.get("TileSetAtlasSource", "get_margins", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.TileSetAtlasSource.mb_get_margins, livePtr)
  }

  /** TileSetAtlasSource.set_separation */
  final def setSeparation(separation: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_set_separation == null) gdext.classes.TileSetAtlasSource.mb_set_separation = MethodBind.get("TileSetAtlasSource", "set_separation", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.TileSetAtlasSource.mb_set_separation, livePtr, separation)
  }

  /** TileSetAtlasSource.get_separation */
  final def getSeparation(): gdext.builtin.Vector2i = {
    if (gdext.classes.TileSetAtlasSource.mb_get_separation == null) gdext.classes.TileSetAtlasSource.mb_get_separation = MethodBind.get("TileSetAtlasSource", "get_separation", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.TileSetAtlasSource.mb_get_separation, livePtr)
  }

  /** TileSetAtlasSource.set_texture_region_size */
  final def setTextureRegionSize(textureRegionSize: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_set_texture_region_size == null) gdext.classes.TileSetAtlasSource.mb_set_texture_region_size = MethodBind.get("TileSetAtlasSource", "set_texture_region_size", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.TileSetAtlasSource.mb_set_texture_region_size, livePtr, textureRegionSize)
  }

  /** TileSetAtlasSource.get_texture_region_size */
  final def getTextureRegionSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.TileSetAtlasSource.mb_get_texture_region_size == null) gdext.classes.TileSetAtlasSource.mb_get_texture_region_size = MethodBind.get("TileSetAtlasSource", "get_texture_region_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.TileSetAtlasSource.mb_get_texture_region_size, livePtr)
  }

  /** TileSetAtlasSource.set_use_texture_padding */
  final def setUseTexturePadding(useTexturePadding: Boolean): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_set_use_texture_padding == null) gdext.classes.TileSetAtlasSource.mb_set_use_texture_padding = MethodBind.get("TileSetAtlasSource", "set_use_texture_padding", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TileSetAtlasSource.mb_set_use_texture_padding, livePtr, useTexturePadding)
  }

  /** TileSetAtlasSource.get_use_texture_padding */
  final def getUseTexturePadding(): Boolean = {
    if (gdext.classes.TileSetAtlasSource.mb_get_use_texture_padding == null) gdext.classes.TileSetAtlasSource.mb_get_use_texture_padding = MethodBind.get("TileSetAtlasSource", "get_use_texture_padding", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TileSetAtlasSource.mb_get_use_texture_padding, livePtr)
  }

  /** TileSetAtlasSource.create_tile */
  final def createTile(atlasCoords: gdext.builtin.Vector2i, size: gdext.builtin.Vector2i = gdext.builtin.Vector2i(1, 1)): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_create_tile == null) gdext.classes.TileSetAtlasSource.mb_create_tile = MethodBind.get("TileSetAtlasSource", "create_tile", 190528769L)
    Ptrcall.callVoid2(gdext.classes.TileSetAtlasSource.mb_create_tile, livePtr, atlasCoords, size)
  }

  /** TileSetAtlasSource.remove_tile */
  final def removeTile(atlasCoords: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_remove_tile == null) gdext.classes.TileSetAtlasSource.mb_remove_tile = MethodBind.get("TileSetAtlasSource", "remove_tile", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.TileSetAtlasSource.mb_remove_tile, livePtr, atlasCoords)
  }

  /** TileSetAtlasSource.move_tile_in_atlas */
  final def moveTileInAtlas(atlasCoords: gdext.builtin.Vector2i, newAtlasCoords: gdext.builtin.Vector2i = gdext.builtin.Vector2i(-1, -1), newSize: gdext.builtin.Vector2i = gdext.builtin.Vector2i(-1, -1)): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_move_tile_in_atlas == null) gdext.classes.TileSetAtlasSource.mb_move_tile_in_atlas = MethodBind.get("TileSetAtlasSource", "move_tile_in_atlas", 3870111920L)
    Ptrcall.callVoid3(gdext.classes.TileSetAtlasSource.mb_move_tile_in_atlas, livePtr, atlasCoords, newAtlasCoords, newSize)
  }

  /** TileSetAtlasSource.get_tile_size_in_atlas */
  final def getTileSizeInAtlas(atlasCoords: gdext.builtin.Vector2i): gdext.builtin.Vector2i = {
    if (gdext.classes.TileSetAtlasSource.mb_get_tile_size_in_atlas == null) gdext.classes.TileSetAtlasSource.mb_get_tile_size_in_atlas = MethodBind.get("TileSetAtlasSource", "get_tile_size_in_atlas", 3050897911L)
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Vector2i](gdext.classes.TileSetAtlasSource.mb_get_tile_size_in_atlas, livePtr, atlasCoords)
  }

  /** TileSetAtlasSource.has_room_for_tile */
  final def hasRoomForTile(atlasCoords: gdext.builtin.Vector2i, size: gdext.builtin.Vector2i, animationColumns: Long, animationSeparation: gdext.builtin.Vector2i, framesCount: Long, ignoredTile: gdext.builtin.Vector2i = gdext.builtin.Vector2i(-1, -1)): Boolean = {
    if (gdext.classes.TileSetAtlasSource.mb_has_room_for_tile == null) gdext.classes.TileSetAtlasSource.mb_has_room_for_tile = MethodBind.get("TileSetAtlasSource", "has_room_for_tile", 3018597268L)
    Ptrcall.call6[gdext.builtin.Vector2i, gdext.builtin.Vector2i, Long, gdext.builtin.Vector2i, Long, gdext.builtin.Vector2i, Boolean](gdext.classes.TileSetAtlasSource.mb_has_room_for_tile, livePtr, atlasCoords, size, animationColumns, animationSeparation, framesCount, ignoredTile)
  }

  /** TileSetAtlasSource.get_tile_at_coords */
  final def getTileAtCoords(atlasCoords: gdext.builtin.Vector2i): gdext.builtin.Vector2i = {
    if (gdext.classes.TileSetAtlasSource.mb_get_tile_at_coords == null) gdext.classes.TileSetAtlasSource.mb_get_tile_at_coords = MethodBind.get("TileSetAtlasSource", "get_tile_at_coords", 3050897911L)
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Vector2i](gdext.classes.TileSetAtlasSource.mb_get_tile_at_coords, livePtr, atlasCoords)
  }

  /** TileSetAtlasSource.has_tiles_outside_texture */
  final def hasTilesOutsideTexture(): Boolean = {
    if (gdext.classes.TileSetAtlasSource.mb_has_tiles_outside_texture == null) gdext.classes.TileSetAtlasSource.mb_has_tiles_outside_texture = MethodBind.get("TileSetAtlasSource", "has_tiles_outside_texture", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TileSetAtlasSource.mb_has_tiles_outside_texture, livePtr)
  }

  /** TileSetAtlasSource.clear_tiles_outside_texture */
  final def clearTilesOutsideTexture(): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_clear_tiles_outside_texture == null) gdext.classes.TileSetAtlasSource.mb_clear_tiles_outside_texture = MethodBind.get("TileSetAtlasSource", "clear_tiles_outside_texture", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TileSetAtlasSource.mb_clear_tiles_outside_texture, livePtr)
  }

  /** TileSetAtlasSource.set_tile_animation_columns */
  final def setTileAnimationColumns(atlasCoords: gdext.builtin.Vector2i, frameColumns: Long): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_set_tile_animation_columns == null) gdext.classes.TileSetAtlasSource.mb_set_tile_animation_columns = MethodBind.get("TileSetAtlasSource", "set_tile_animation_columns", 3200960707L)
    Ptrcall.callVoid2(gdext.classes.TileSetAtlasSource.mb_set_tile_animation_columns, livePtr, atlasCoords, frameColumns)
  }

  /** TileSetAtlasSource.get_tile_animation_columns */
  final def getTileAnimationColumns(atlasCoords: gdext.builtin.Vector2i): Long = {
    if (gdext.classes.TileSetAtlasSource.mb_get_tile_animation_columns == null) gdext.classes.TileSetAtlasSource.mb_get_tile_animation_columns = MethodBind.get("TileSetAtlasSource", "get_tile_animation_columns", 2485466453L)
    Ptrcall.call1[gdext.builtin.Vector2i, Long](gdext.classes.TileSetAtlasSource.mb_get_tile_animation_columns, livePtr, atlasCoords)
  }

  /** TileSetAtlasSource.set_tile_animation_separation */
  final def setTileAnimationSeparation(atlasCoords: gdext.builtin.Vector2i, separation: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_set_tile_animation_separation == null) gdext.classes.TileSetAtlasSource.mb_set_tile_animation_separation = MethodBind.get("TileSetAtlasSource", "set_tile_animation_separation", 1941061099L)
    Ptrcall.callVoid2(gdext.classes.TileSetAtlasSource.mb_set_tile_animation_separation, livePtr, atlasCoords, separation)
  }

  /** TileSetAtlasSource.get_tile_animation_separation */
  final def getTileAnimationSeparation(atlasCoords: gdext.builtin.Vector2i): gdext.builtin.Vector2i = {
    if (gdext.classes.TileSetAtlasSource.mb_get_tile_animation_separation == null) gdext.classes.TileSetAtlasSource.mb_get_tile_animation_separation = MethodBind.get("TileSetAtlasSource", "get_tile_animation_separation", 3050897911L)
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Vector2i](gdext.classes.TileSetAtlasSource.mb_get_tile_animation_separation, livePtr, atlasCoords)
  }

  /** TileSetAtlasSource.set_tile_animation_speed */
  final def setTileAnimationSpeed(atlasCoords: gdext.builtin.Vector2i, speed: Double): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_set_tile_animation_speed == null) gdext.classes.TileSetAtlasSource.mb_set_tile_animation_speed = MethodBind.get("TileSetAtlasSource", "set_tile_animation_speed", 2262553149L)
    Ptrcall.callVoid2(gdext.classes.TileSetAtlasSource.mb_set_tile_animation_speed, livePtr, atlasCoords, speed)
  }

  /** TileSetAtlasSource.get_tile_animation_speed */
  final def getTileAnimationSpeed(atlasCoords: gdext.builtin.Vector2i): Double = {
    if (gdext.classes.TileSetAtlasSource.mb_get_tile_animation_speed == null) gdext.classes.TileSetAtlasSource.mb_get_tile_animation_speed = MethodBind.get("TileSetAtlasSource", "get_tile_animation_speed", 719993801L)
    Ptrcall.call1[gdext.builtin.Vector2i, Double](gdext.classes.TileSetAtlasSource.mb_get_tile_animation_speed, livePtr, atlasCoords)
  }

  /** TileSetAtlasSource.set_tile_animation_mode */
  final def setTileAnimationMode(atlasCoords: gdext.builtin.Vector2i, mode: gdext.classes.TileSetAtlasSource.TileAnimationMode): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_set_tile_animation_mode == null) gdext.classes.TileSetAtlasSource.mb_set_tile_animation_mode = MethodBind.get("TileSetAtlasSource", "set_tile_animation_mode", 3192753483L)
    Ptrcall.callVoid2(gdext.classes.TileSetAtlasSource.mb_set_tile_animation_mode, livePtr, atlasCoords, mode)
  }

  /** TileSetAtlasSource.get_tile_animation_mode */
  final def getTileAnimationMode(atlasCoords: gdext.builtin.Vector2i): gdext.classes.TileSetAtlasSource.TileAnimationMode = {
    if (gdext.classes.TileSetAtlasSource.mb_get_tile_animation_mode == null) gdext.classes.TileSetAtlasSource.mb_get_tile_animation_mode = MethodBind.get("TileSetAtlasSource", "get_tile_animation_mode", 4025349959L)
    gdext.classes.TileSetAtlasSource.TileAnimationMode(Ptrcall.call1[gdext.builtin.Vector2i, Long](gdext.classes.TileSetAtlasSource.mb_get_tile_animation_mode, livePtr, atlasCoords))
  }

  /** TileSetAtlasSource.set_tile_animation_frames_count */
  final def setTileAnimationFramesCount(atlasCoords: gdext.builtin.Vector2i, framesCount: Long): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_set_tile_animation_frames_count == null) gdext.classes.TileSetAtlasSource.mb_set_tile_animation_frames_count = MethodBind.get("TileSetAtlasSource", "set_tile_animation_frames_count", 3200960707L)
    Ptrcall.callVoid2(gdext.classes.TileSetAtlasSource.mb_set_tile_animation_frames_count, livePtr, atlasCoords, framesCount)
  }

  /** TileSetAtlasSource.get_tile_animation_frames_count */
  final def getTileAnimationFramesCount(atlasCoords: gdext.builtin.Vector2i): Long = {
    if (gdext.classes.TileSetAtlasSource.mb_get_tile_animation_frames_count == null) gdext.classes.TileSetAtlasSource.mb_get_tile_animation_frames_count = MethodBind.get("TileSetAtlasSource", "get_tile_animation_frames_count", 2485466453L)
    Ptrcall.call1[gdext.builtin.Vector2i, Long](gdext.classes.TileSetAtlasSource.mb_get_tile_animation_frames_count, livePtr, atlasCoords)
  }

  /** TileSetAtlasSource.set_tile_animation_frame_duration */
  final def setTileAnimationFrameDuration(atlasCoords: gdext.builtin.Vector2i, frameIndex: Long, duration: Double): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_set_tile_animation_frame_duration == null) gdext.classes.TileSetAtlasSource.mb_set_tile_animation_frame_duration = MethodBind.get("TileSetAtlasSource", "set_tile_animation_frame_duration", 2843487787L)
    Ptrcall.callVoid3(gdext.classes.TileSetAtlasSource.mb_set_tile_animation_frame_duration, livePtr, atlasCoords, frameIndex, duration)
  }

  /** TileSetAtlasSource.get_tile_animation_frame_duration */
  final def getTileAnimationFrameDuration(atlasCoords: gdext.builtin.Vector2i, frameIndex: Long): Double = {
    if (gdext.classes.TileSetAtlasSource.mb_get_tile_animation_frame_duration == null) gdext.classes.TileSetAtlasSource.mb_get_tile_animation_frame_duration = MethodBind.get("TileSetAtlasSource", "get_tile_animation_frame_duration", 1802448425L)
    Ptrcall.call2[gdext.builtin.Vector2i, Long, Double](gdext.classes.TileSetAtlasSource.mb_get_tile_animation_frame_duration, livePtr, atlasCoords, frameIndex)
  }

  /** TileSetAtlasSource.get_tile_animation_total_duration */
  final def getTileAnimationTotalDuration(atlasCoords: gdext.builtin.Vector2i): Double = {
    if (gdext.classes.TileSetAtlasSource.mb_get_tile_animation_total_duration == null) gdext.classes.TileSetAtlasSource.mb_get_tile_animation_total_duration = MethodBind.get("TileSetAtlasSource", "get_tile_animation_total_duration", 719993801L)
    Ptrcall.call1[gdext.builtin.Vector2i, Double](gdext.classes.TileSetAtlasSource.mb_get_tile_animation_total_duration, livePtr, atlasCoords)
  }

  /** TileSetAtlasSource.create_alternative_tile */
  final def createAlternativeTile(atlasCoords: gdext.builtin.Vector2i, alternativeIdOverride: Long = -1L): Long = {
    if (gdext.classes.TileSetAtlasSource.mb_create_alternative_tile == null) gdext.classes.TileSetAtlasSource.mb_create_alternative_tile = MethodBind.get("TileSetAtlasSource", "create_alternative_tile", 2226298068L)
    Ptrcall.call2[gdext.builtin.Vector2i, Long, Long](gdext.classes.TileSetAtlasSource.mb_create_alternative_tile, livePtr, atlasCoords, alternativeIdOverride)
  }

  /** TileSetAtlasSource.remove_alternative_tile */
  final def removeAlternativeTile(atlasCoords: gdext.builtin.Vector2i, alternativeTile: Long): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_remove_alternative_tile == null) gdext.classes.TileSetAtlasSource.mb_remove_alternative_tile = MethodBind.get("TileSetAtlasSource", "remove_alternative_tile", 3200960707L)
    Ptrcall.callVoid2(gdext.classes.TileSetAtlasSource.mb_remove_alternative_tile, livePtr, atlasCoords, alternativeTile)
  }

  /** TileSetAtlasSource.set_alternative_tile_id */
  final def setAlternativeTileId(atlasCoords: gdext.builtin.Vector2i, alternativeTile: Long, newId: Long): Unit = {
    if (gdext.classes.TileSetAtlasSource.mb_set_alternative_tile_id == null) gdext.classes.TileSetAtlasSource.mb_set_alternative_tile_id = MethodBind.get("TileSetAtlasSource", "set_alternative_tile_id", 1499785778L)
    Ptrcall.callVoid3(gdext.classes.TileSetAtlasSource.mb_set_alternative_tile_id, livePtr, atlasCoords, alternativeTile, newId)
  }

  /** TileSetAtlasSource.get_next_alternative_tile_id */
  final def getNextAlternativeTileId(atlasCoords: gdext.builtin.Vector2i): Long = {
    if (gdext.classes.TileSetAtlasSource.mb_get_next_alternative_tile_id == null) gdext.classes.TileSetAtlasSource.mb_get_next_alternative_tile_id = MethodBind.get("TileSetAtlasSource", "get_next_alternative_tile_id", 2485466453L)
    Ptrcall.call1[gdext.builtin.Vector2i, Long](gdext.classes.TileSetAtlasSource.mb_get_next_alternative_tile_id, livePtr, atlasCoords)
  }

  /** TileSetAtlasSource.get_tile_data */
  final def getTileData(atlasCoords: gdext.builtin.Vector2i, alternativeTile: Long): TileData = {
    if (gdext.classes.TileSetAtlasSource.mb_get_tile_data == null) gdext.classes.TileSetAtlasSource.mb_get_tile_data = MethodBind.get("TileSetAtlasSource", "get_tile_data", 3534028207L)
    Wrappers.borrowed[TileData](Ptrcall.call2[gdext.builtin.Vector2i, Long, Long](gdext.classes.TileSetAtlasSource.mb_get_tile_data, livePtr, atlasCoords, alternativeTile))
  }

  /** TileSetAtlasSource.get_atlas_grid_size */
  final def getAtlasGridSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.TileSetAtlasSource.mb_get_atlas_grid_size == null) gdext.classes.TileSetAtlasSource.mb_get_atlas_grid_size = MethodBind.get("TileSetAtlasSource", "get_atlas_grid_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.TileSetAtlasSource.mb_get_atlas_grid_size, livePtr)
  }

  /** TileSetAtlasSource.get_tile_texture_region */
  final def getTileTextureRegion(atlasCoords: gdext.builtin.Vector2i, frame: Long = 0L): gdext.builtin.Rect2i = {
    if (gdext.classes.TileSetAtlasSource.mb_get_tile_texture_region == null) gdext.classes.TileSetAtlasSource.mb_get_tile_texture_region = MethodBind.get("TileSetAtlasSource", "get_tile_texture_region", 241857547L)
    Ptrcall.call2[gdext.builtin.Vector2i, Long, gdext.builtin.Rect2i](gdext.classes.TileSetAtlasSource.mb_get_tile_texture_region, livePtr, atlasCoords, frame)
  }

  /** TileSetAtlasSource.get_runtime_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getRuntimeTexture(): Texture2D = {
    if (gdext.classes.TileSetAtlasSource.mb_get_runtime_texture == null) gdext.classes.TileSetAtlasSource.mb_get_runtime_texture = MethodBind.get("TileSetAtlasSource", "get_runtime_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.TileSetAtlasSource.mb_get_runtime_texture, livePtr))
  }

  /** TileSetAtlasSource.get_runtime_tile_texture_region */
  final def getRuntimeTileTextureRegion(atlasCoords: gdext.builtin.Vector2i, frame: Long): gdext.builtin.Rect2i = {
    if (gdext.classes.TileSetAtlasSource.mb_get_runtime_tile_texture_region == null) gdext.classes.TileSetAtlasSource.mb_get_runtime_tile_texture_region = MethodBind.get("TileSetAtlasSource", "get_runtime_tile_texture_region", 104874263L)
    Ptrcall.call2[gdext.builtin.Vector2i, Long, gdext.builtin.Rect2i](gdext.classes.TileSetAtlasSource.mb_get_runtime_tile_texture_region, livePtr, atlasCoords, frame)
  }

}

object TileSetAtlasSource {
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_margins: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_margins: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_separation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_separation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_region_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_region_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_texture_padding: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_texture_padding: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_tile: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_tile: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_tile_in_atlas: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_size_in_atlas: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_room_for_tile: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_at_coords: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_tiles_outside_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_tiles_outside_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tile_animation_columns: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_animation_columns: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tile_animation_separation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_animation_separation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tile_animation_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_animation_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tile_animation_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_animation_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tile_animation_frames_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_animation_frames_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tile_animation_frame_duration: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_animation_frame_duration: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_animation_total_duration: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_alternative_tile: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_alternative_tile: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alternative_tile_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_next_alternative_tile_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_atlas_grid_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_texture_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_runtime_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_runtime_tile_texture_region: GDExtensionMethodBindPtr = null

  /** Godot enum `TileSetAtlasSource.TileAnimationMode`. */
  opaque type TileAnimationMode <: Long = Long

  object TileAnimationMode {
    final val Default: TileAnimationMode = 0L.asInstanceOf[TileAnimationMode]
    final val RandomStartTimes: TileAnimationMode = 1L.asInstanceOf[TileAnimationMode]
    final val Max: TileAnimationMode = 2L.asInstanceOf[TileAnimationMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TileAnimationMode = value.asInstanceOf[TileAnimationMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TileAnimationMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[TileAnimationMode]]

    extension (self: TileAnimationMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Default"
        case 1L => "RandomStartTimes"
        case 2L => "Max"
        case other => other.toString
      }
  }
}
