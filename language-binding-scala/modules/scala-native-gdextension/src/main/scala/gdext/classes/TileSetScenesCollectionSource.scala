package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TileSetScenesCollectionSource`, extends `TileSetSource`. */
abstract class TileSetScenesCollectionSource extends TileSetSource {
  override def godotClassName: String = "TileSetScenesCollectionSource"

  /** TileSetScenesCollectionSource.get_scene_tiles_count */
  final def getSceneTilesCount(): Long = {
    if (gdext.classes.TileSetScenesCollectionSource.mb_get_scene_tiles_count == null) gdext.classes.TileSetScenesCollectionSource.mb_get_scene_tiles_count = MethodBind.get("TileSetScenesCollectionSource", "get_scene_tiles_count", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.TileSetScenesCollectionSource.mb_get_scene_tiles_count, livePtr)
  }

  /** TileSetScenesCollectionSource.get_scene_tile_id */
  final def getSceneTileId(index: Long): Long = {
    if (gdext.classes.TileSetScenesCollectionSource.mb_get_scene_tile_id == null) gdext.classes.TileSetScenesCollectionSource.mb_get_scene_tile_id = MethodBind.get("TileSetScenesCollectionSource", "get_scene_tile_id", 3744713108L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSetScenesCollectionSource.mb_get_scene_tile_id, livePtr, index)
  }

  /** TileSetScenesCollectionSource.has_scene_tile_id */
  final def hasSceneTileId(id: Long): Boolean = {
    if (gdext.classes.TileSetScenesCollectionSource.mb_has_scene_tile_id == null) gdext.classes.TileSetScenesCollectionSource.mb_has_scene_tile_id = MethodBind.get("TileSetScenesCollectionSource", "has_scene_tile_id", 3067735520L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TileSetScenesCollectionSource.mb_has_scene_tile_id, livePtr, id)
  }

  /** TileSetScenesCollectionSource.create_scene_tile */
  final def createSceneTile(packedScene: PackedScene, idOverride: Long = -1L): Long = {
    if (gdext.classes.TileSetScenesCollectionSource.mb_create_scene_tile == null) gdext.classes.TileSetScenesCollectionSource.mb_create_scene_tile = MethodBind.get("TileSetScenesCollectionSource", "create_scene_tile", 1117465415L)
    Ptrcall.call2[GodotObject, Long, Long](gdext.classes.TileSetScenesCollectionSource.mb_create_scene_tile, livePtr, Wrappers.handle(packedScene), idOverride)
  }

  /** TileSetScenesCollectionSource.set_scene_tile_id */
  final def setSceneTileId(id: Long, newId: Long): Unit = {
    if (gdext.classes.TileSetScenesCollectionSource.mb_set_scene_tile_id == null) gdext.classes.TileSetScenesCollectionSource.mb_set_scene_tile_id = MethodBind.get("TileSetScenesCollectionSource", "set_scene_tile_id", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSetScenesCollectionSource.mb_set_scene_tile_id, livePtr, id, newId)
  }

  /** TileSetScenesCollectionSource.set_scene_tile_scene */
  final def setSceneTileScene(id: Long, packedScene: PackedScene): Unit = {
    if (gdext.classes.TileSetScenesCollectionSource.mb_set_scene_tile_scene == null) gdext.classes.TileSetScenesCollectionSource.mb_set_scene_tile_scene = MethodBind.get("TileSetScenesCollectionSource", "set_scene_tile_scene", 3435852839L)
    Ptrcall.callVoid2(gdext.classes.TileSetScenesCollectionSource.mb_set_scene_tile_scene, livePtr, id, Wrappers.handle(packedScene))
  }

  /** TileSetScenesCollectionSource.get_scene_tile_scene. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSceneTileScene(id: Long): PackedScene = {
    if (gdext.classes.TileSetScenesCollectionSource.mb_get_scene_tile_scene == null) gdext.classes.TileSetScenesCollectionSource.mb_get_scene_tile_scene = MethodBind.get("TileSetScenesCollectionSource", "get_scene_tile_scene", 511017218L)
    Wrappers.owned[PackedScene](Ptrcall.call1[Long, Long](gdext.classes.TileSetScenesCollectionSource.mb_get_scene_tile_scene, livePtr, id))
  }

  /** TileSetScenesCollectionSource.set_scene_tile_display_placeholder */
  final def setSceneTileDisplayPlaceholder(id: Long, displayPlaceholder: Boolean): Unit = {
    if (gdext.classes.TileSetScenesCollectionSource.mb_set_scene_tile_display_placeholder == null) gdext.classes.TileSetScenesCollectionSource.mb_set_scene_tile_display_placeholder = MethodBind.get("TileSetScenesCollectionSource", "set_scene_tile_display_placeholder", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TileSetScenesCollectionSource.mb_set_scene_tile_display_placeholder, livePtr, id, displayPlaceholder)
  }

  /** TileSetScenesCollectionSource.get_scene_tile_display_placeholder */
  final def getSceneTileDisplayPlaceholder(id: Long): Boolean = {
    if (gdext.classes.TileSetScenesCollectionSource.mb_get_scene_tile_display_placeholder == null) gdext.classes.TileSetScenesCollectionSource.mb_get_scene_tile_display_placeholder = MethodBind.get("TileSetScenesCollectionSource", "get_scene_tile_display_placeholder", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TileSetScenesCollectionSource.mb_get_scene_tile_display_placeholder, livePtr, id)
  }

  /** TileSetScenesCollectionSource.remove_scene_tile */
  final def removeSceneTile(id: Long): Unit = {
    if (gdext.classes.TileSetScenesCollectionSource.mb_remove_scene_tile == null) gdext.classes.TileSetScenesCollectionSource.mb_remove_scene_tile = MethodBind.get("TileSetScenesCollectionSource", "remove_scene_tile", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileSetScenesCollectionSource.mb_remove_scene_tile, livePtr, id)
  }

  /** TileSetScenesCollectionSource.get_next_scene_tile_id */
  final def getNextSceneTileId(): Long = {
    if (gdext.classes.TileSetScenesCollectionSource.mb_get_next_scene_tile_id == null) gdext.classes.TileSetScenesCollectionSource.mb_get_next_scene_tile_id = MethodBind.get("TileSetScenesCollectionSource", "get_next_scene_tile_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileSetScenesCollectionSource.mb_get_next_scene_tile_id, livePtr)
  }

}

object TileSetScenesCollectionSource {
  private[classes] var mb_get_scene_tiles_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scene_tile_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_scene_tile_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_scene_tile: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scene_tile_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scene_tile_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scene_tile_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scene_tile_display_placeholder: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scene_tile_display_placeholder: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_scene_tile: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_next_scene_tile_id: GDExtensionMethodBindPtr = null
}
