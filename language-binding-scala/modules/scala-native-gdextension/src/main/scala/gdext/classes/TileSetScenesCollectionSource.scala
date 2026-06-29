package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `TileSetScenesCollectionSource`, extends `TileSetSource`. */
abstract class TileSetScenesCollectionSource extends TileSetSource {
  override def godotClassName: String = "TileSetScenesCollectionSource"

  /** TileSetScenesCollectionSource.get_scene_tiles_count */
  final def getSceneTilesCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileSetScenesCollectionSource", "get_scene_tiles_count", 2455072627L), hostObject.objectPtr)

  /** TileSetScenesCollectionSource.get_scene_tile_id */
  final def getSceneTileId(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TileSetScenesCollectionSource", "get_scene_tile_id", 3744713108L), hostObject.objectPtr, index)

  /** TileSetScenesCollectionSource.has_scene_tile_id */
  final def hasSceneTileId(id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TileSetScenesCollectionSource", "has_scene_tile_id", 3067735520L), hostObject.objectPtr, id)

  /** TileSetScenesCollectionSource.create_scene_tile */
  final def createSceneTile(packed_scene: PackedScene, id_override: Long): Long =
    Ptrcall.call2[GodotObject, Long, Long](MethodBind.get("TileSetScenesCollectionSource", "create_scene_tile", 1117465415L), hostObject.objectPtr, packed_scene.hostObject, id_override)

  /** TileSetScenesCollectionSource.set_scene_tile_id */
  final def setSceneTileId(id: Long, new_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSetScenesCollectionSource", "set_scene_tile_id", 3937882851L), hostObject.objectPtr, id, new_id)

  /** TileSetScenesCollectionSource.set_scene_tile_scene */
  final def setSceneTileScene(id: Long, packed_scene: PackedScene): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSetScenesCollectionSource", "set_scene_tile_scene", 3435852839L), hostObject.objectPtr, id, packed_scene.hostObject)

  /** TileSetScenesCollectionSource.get_scene_tile_scene */
  final def getSceneTileScene(id: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TileSetScenesCollectionSource", "get_scene_tile_scene", 511017218L), hostObject.objectPtr, id)

  /** TileSetScenesCollectionSource.set_scene_tile_display_placeholder */
  final def setSceneTileDisplayPlaceholder(id: Long, display_placeholder: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSetScenesCollectionSource", "set_scene_tile_display_placeholder", 300928843L), hostObject.objectPtr, id, display_placeholder)

  /** TileSetScenesCollectionSource.get_scene_tile_display_placeholder */
  final def getSceneTileDisplayPlaceholder(id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TileSetScenesCollectionSource", "get_scene_tile_display_placeholder", 1116898809L), hostObject.objectPtr, id)

  /** TileSetScenesCollectionSource.remove_scene_tile */
  final def removeSceneTile(id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSetScenesCollectionSource", "remove_scene_tile", 1286410249L), hostObject.objectPtr, id)

  /** TileSetScenesCollectionSource.get_next_scene_tile_id */
  final def getNextSceneTileId(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileSetScenesCollectionSource", "get_next_scene_tile_id", 3905245786L), hostObject.objectPtr)

}
