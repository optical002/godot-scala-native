package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `TileSetSource`, extends `Resource`. */
abstract class TileSetSource extends Resource {

  /** TileSetSource.get_tiles_count */
  final def getTilesCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileSetSource", "get_tiles_count", 3905245786L), hostObject.objectPtr)

  /** TileSetSource.get_tile_id */
  final def getTileId(index: Long): gdext.builtin.Vector2i =
    Ptrcall.call1[Long, gdext.builtin.Vector2i](MethodBind.get("TileSetSource", "get_tile_id", 880721226L), hostObject.objectPtr, index)

  /** TileSetSource.has_tile */
  final def hasTile(atlas_coords: gdext.builtin.Vector2i): Boolean =
    Ptrcall.call1[gdext.builtin.Vector2i, Boolean](MethodBind.get("TileSetSource", "has_tile", 3900751641L), hostObject.objectPtr, atlas_coords)

  /** TileSetSource.get_alternative_tiles_count */
  final def getAlternativeTilesCount(atlas_coords: gdext.builtin.Vector2i): Long =
    Ptrcall.call1[gdext.builtin.Vector2i, Long](MethodBind.get("TileSetSource", "get_alternative_tiles_count", 2485466453L), hostObject.objectPtr, atlas_coords)

  /** TileSetSource.get_alternative_tile_id */
  final def getAlternativeTileId(atlas_coords: gdext.builtin.Vector2i, index: Long): Long =
    Ptrcall.call2[gdext.builtin.Vector2i, Long, Long](MethodBind.get("TileSetSource", "get_alternative_tile_id", 89881719L), hostObject.objectPtr, atlas_coords, index)

  /** TileSetSource.has_alternative_tile */
  final def hasAlternativeTile(atlas_coords: gdext.builtin.Vector2i, alternative_tile: Long): Boolean =
    Ptrcall.call2[gdext.builtin.Vector2i, Long, Boolean](MethodBind.get("TileSetSource", "has_alternative_tile", 1073731340L), hostObject.objectPtr, atlas_coords, alternative_tile)

}

object TileSetSource {
  /** Class metadata for Gd[TileSetSource] lifetime management and casting. */
  given GodotClass[TileSetSource] with {
    def className = "TileSetSource"
    def isRefCounted = true
    def wrap(o: GodotObject): TileSetSource = new TileSetSource {}.withHost(o.objectPtr)
    def unwrap(t: TileSetSource): GodotObject = t.hostObject
  }
}
