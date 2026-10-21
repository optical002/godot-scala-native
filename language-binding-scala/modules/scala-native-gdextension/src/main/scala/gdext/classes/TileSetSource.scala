package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TileSetSource`, extends `Resource`. */
abstract class TileSetSource extends Resource {
  override def godotClassName: String = "TileSetSource"

  /** TileSetSource.get_tiles_count */
  final def getTilesCount(): Long = {
    if (gdext.classes.TileSetSource.mb_get_tiles_count == null) gdext.classes.TileSetSource.mb_get_tiles_count = MethodBind.get("TileSetSource", "get_tiles_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileSetSource.mb_get_tiles_count, livePtr)
  }

  /** TileSetSource.get_tile_id */
  final def getTileId(index: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.TileSetSource.mb_get_tile_id == null) gdext.classes.TileSetSource.mb_get_tile_id = MethodBind.get("TileSetSource", "get_tile_id", 880721226L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.TileSetSource.mb_get_tile_id, livePtr, index)
  }

  /** TileSetSource.has_tile */
  final def hasTile(atlas_coords: gdext.builtin.Vector2i): Boolean = {
    if (gdext.classes.TileSetSource.mb_has_tile == null) gdext.classes.TileSetSource.mb_has_tile = MethodBind.get("TileSetSource", "has_tile", 3900751641L)
    Ptrcall.call1[gdext.builtin.Vector2i, Boolean](gdext.classes.TileSetSource.mb_has_tile, livePtr, atlas_coords)
  }

  /** TileSetSource.get_alternative_tiles_count */
  final def getAlternativeTilesCount(atlas_coords: gdext.builtin.Vector2i): Long = {
    if (gdext.classes.TileSetSource.mb_get_alternative_tiles_count == null) gdext.classes.TileSetSource.mb_get_alternative_tiles_count = MethodBind.get("TileSetSource", "get_alternative_tiles_count", 2485466453L)
    Ptrcall.call1[gdext.builtin.Vector2i, Long](gdext.classes.TileSetSource.mb_get_alternative_tiles_count, livePtr, atlas_coords)
  }

  /** TileSetSource.get_alternative_tile_id */
  final def getAlternativeTileId(atlas_coords: gdext.builtin.Vector2i, index: Long): Long = {
    if (gdext.classes.TileSetSource.mb_get_alternative_tile_id == null) gdext.classes.TileSetSource.mb_get_alternative_tile_id = MethodBind.get("TileSetSource", "get_alternative_tile_id", 89881719L)
    Ptrcall.call2[gdext.builtin.Vector2i, Long, Long](gdext.classes.TileSetSource.mb_get_alternative_tile_id, livePtr, atlas_coords, index)
  }

  /** TileSetSource.has_alternative_tile */
  final def hasAlternativeTile(atlas_coords: gdext.builtin.Vector2i, alternative_tile: Long): Boolean = {
    if (gdext.classes.TileSetSource.mb_has_alternative_tile == null) gdext.classes.TileSetSource.mb_has_alternative_tile = MethodBind.get("TileSetSource", "has_alternative_tile", 1073731340L)
    Ptrcall.call2[gdext.builtin.Vector2i, Long, Boolean](gdext.classes.TileSetSource.mb_has_alternative_tile, livePtr, atlas_coords, alternative_tile)
  }

}

object TileSetSource {
  private[classes] var mb_get_tiles_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_tile: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alternative_tiles_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alternative_tile_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_alternative_tile: GDExtensionMethodBindPtr = null
}
