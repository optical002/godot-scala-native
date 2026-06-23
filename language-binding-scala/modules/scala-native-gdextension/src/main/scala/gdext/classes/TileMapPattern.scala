package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `TileMapPattern`, extends `Resource`. */
abstract class TileMapPattern extends Resource {

  /** TileMapPattern.set_cell */
  final def setCell(coords: gdext.builtin.Vector2i, source_id: Long, atlas_coords: gdext.builtin.Vector2i, alternative_tile: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("TileMapPattern", "set_cell", 2224802556L), hostObject.objectPtr, coords, source_id, atlas_coords, alternative_tile)

  /** TileMapPattern.has_cell */
  final def hasCell(coords: gdext.builtin.Vector2i): Boolean =
    Ptrcall.call1[gdext.builtin.Vector2i, Boolean](MethodBind.get("TileMapPattern", "has_cell", 3900751641L), hostObject.objectPtr, coords)

  /** TileMapPattern.remove_cell */
  final def removeCell(coords: gdext.builtin.Vector2i, update_size: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileMapPattern", "remove_cell", 4153096796L), hostObject.objectPtr, coords, update_size)

  /** TileMapPattern.get_cell_source_id */
  final def getCellSourceId(coords: gdext.builtin.Vector2i): Long =
    Ptrcall.call1[gdext.builtin.Vector2i, Long](MethodBind.get("TileMapPattern", "get_cell_source_id", 2485466453L), hostObject.objectPtr, coords)

  /** TileMapPattern.get_cell_atlas_coords */
  final def getCellAtlasCoords(coords: gdext.builtin.Vector2i): gdext.builtin.Vector2i =
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Vector2i](MethodBind.get("TileMapPattern", "get_cell_atlas_coords", 3050897911L), hostObject.objectPtr, coords)

  /** TileMapPattern.get_cell_alternative_tile */
  final def getCellAlternativeTile(coords: gdext.builtin.Vector2i): Long =
    Ptrcall.call1[gdext.builtin.Vector2i, Long](MethodBind.get("TileMapPattern", "get_cell_alternative_tile", 2485466453L), hostObject.objectPtr, coords)

  /** TileMapPattern.get_size */
  final def getSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("TileMapPattern", "get_size", 3690982128L), hostObject.objectPtr)

  /** TileMapPattern.set_size */
  final def setSize(size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileMapPattern", "set_size", 1130785943L), hostObject.objectPtr, size)

  /** TileMapPattern.is_empty */
  final def isEmpty(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TileMapPattern", "is_empty", 36873697L), hostObject.objectPtr)

}

object TileMapPattern {
  /** Class metadata for Gd[TileMapPattern] lifetime management and casting. */
  given GodotClass[TileMapPattern] with {
    def className = "TileMapPattern"
    def isRefCounted = true
    def wrap(o: GodotObject): TileMapPattern = new TileMapPattern {}.withHost(o.objectPtr)
    def unwrap(t: TileMapPattern): GodotObject = t.hostObject
  }
}
