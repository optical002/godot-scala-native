package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TileMapPattern`, extends `Resource`. */
abstract class TileMapPattern extends Resource {
  override def godotClassName: String = "TileMapPattern"

  /** TileMapPattern.set_cell */
  final def setCell(coords: gdext.builtin.Vector2i, source_id: Long, atlas_coords: gdext.builtin.Vector2i, alternative_tile: Long): Unit = {
    if (gdext.classes.TileMapPattern.mb_set_cell == null) gdext.classes.TileMapPattern.mb_set_cell = MethodBind.get("TileMapPattern", "set_cell", 2224802556L)
    Ptrcall.callVoid4(gdext.classes.TileMapPattern.mb_set_cell, livePtr, coords, source_id, atlas_coords, alternative_tile)
  }

  /** TileMapPattern.has_cell */
  final def hasCell(coords: gdext.builtin.Vector2i): Boolean = {
    if (gdext.classes.TileMapPattern.mb_has_cell == null) gdext.classes.TileMapPattern.mb_has_cell = MethodBind.get("TileMapPattern", "has_cell", 3900751641L)
    Ptrcall.call1[gdext.builtin.Vector2i, Boolean](gdext.classes.TileMapPattern.mb_has_cell, livePtr, coords)
  }

  /** TileMapPattern.remove_cell */
  final def removeCell(coords: gdext.builtin.Vector2i, update_size: Boolean): Unit = {
    if (gdext.classes.TileMapPattern.mb_remove_cell == null) gdext.classes.TileMapPattern.mb_remove_cell = MethodBind.get("TileMapPattern", "remove_cell", 4153096796L)
    Ptrcall.callVoid2(gdext.classes.TileMapPattern.mb_remove_cell, livePtr, coords, update_size)
  }

  /** TileMapPattern.get_cell_source_id */
  final def getCellSourceId(coords: gdext.builtin.Vector2i): Long = {
    if (gdext.classes.TileMapPattern.mb_get_cell_source_id == null) gdext.classes.TileMapPattern.mb_get_cell_source_id = MethodBind.get("TileMapPattern", "get_cell_source_id", 2485466453L)
    Ptrcall.call1[gdext.builtin.Vector2i, Long](gdext.classes.TileMapPattern.mb_get_cell_source_id, livePtr, coords)
  }

  /** TileMapPattern.get_cell_atlas_coords */
  final def getCellAtlasCoords(coords: gdext.builtin.Vector2i): gdext.builtin.Vector2i = {
    if (gdext.classes.TileMapPattern.mb_get_cell_atlas_coords == null) gdext.classes.TileMapPattern.mb_get_cell_atlas_coords = MethodBind.get("TileMapPattern", "get_cell_atlas_coords", 3050897911L)
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Vector2i](gdext.classes.TileMapPattern.mb_get_cell_atlas_coords, livePtr, coords)
  }

  /** TileMapPattern.get_cell_alternative_tile */
  final def getCellAlternativeTile(coords: gdext.builtin.Vector2i): Long = {
    if (gdext.classes.TileMapPattern.mb_get_cell_alternative_tile == null) gdext.classes.TileMapPattern.mb_get_cell_alternative_tile = MethodBind.get("TileMapPattern", "get_cell_alternative_tile", 2485466453L)
    Ptrcall.call1[gdext.builtin.Vector2i, Long](gdext.classes.TileMapPattern.mb_get_cell_alternative_tile, livePtr, coords)
  }

  /** TileMapPattern.get_size */
  final def getSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.TileMapPattern.mb_get_size == null) gdext.classes.TileMapPattern.mb_get_size = MethodBind.get("TileMapPattern", "get_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.TileMapPattern.mb_get_size, livePtr)
  }

  /** TileMapPattern.set_size */
  final def setSize(size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.TileMapPattern.mb_set_size == null) gdext.classes.TileMapPattern.mb_set_size = MethodBind.get("TileMapPattern", "set_size", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.TileMapPattern.mb_set_size, livePtr, size)
  }

  /** TileMapPattern.is_empty */
  final def isEmpty(): Boolean = {
    if (gdext.classes.TileMapPattern.mb_is_empty == null) gdext.classes.TileMapPattern.mb_is_empty = MethodBind.get("TileMapPattern", "is_empty", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TileMapPattern.mb_is_empty, livePtr)
  }

}

object TileMapPattern {
  private[classes] var mb_set_cell: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_cell: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_cell: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_source_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_atlas_coords: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_alternative_tile: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_empty: GDExtensionMethodBindPtr = null
}
