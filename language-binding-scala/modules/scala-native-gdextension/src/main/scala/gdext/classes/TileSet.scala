package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TileSet`, extends `Resource`. */
abstract class TileSet extends Resource {
  override def godotClassName: String = "TileSet"

  /** TileSet.get_next_source_id */
  final def getNextSourceId(): Long = {
    if (gdext.classes.TileSet.mb_get_next_source_id == null) gdext.classes.TileSet.mb_get_next_source_id = MethodBind.get("TileSet", "get_next_source_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_next_source_id, livePtr)
  }

  /** TileSet.add_source */
  final def addSource(source: TileSetSource, atlasSourceIdOverride: Long = -1L): Long = {
    if (gdext.classes.TileSet.mb_add_source == null) gdext.classes.TileSet.mb_add_source = MethodBind.get("TileSet", "add_source", 1059186179L)
    Ptrcall.call2[GodotObject, Long, Long](gdext.classes.TileSet.mb_add_source, livePtr, Wrappers.handle(source), atlasSourceIdOverride)
  }

  /** TileSet.remove_source */
  final def removeSource(sourceId: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_source == null) gdext.classes.TileSet.mb_remove_source = MethodBind.get("TileSet", "remove_source", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_remove_source, livePtr, sourceId)
  }

  /** TileSet.set_source_id */
  final def setSourceId(sourceId: Long, newSourceId: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_source_id == null) gdext.classes.TileSet.mb_set_source_id = MethodBind.get("TileSet", "set_source_id", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_source_id, livePtr, sourceId, newSourceId)
  }

  /** TileSet.get_source_count */
  final def getSourceCount(): Long = {
    if (gdext.classes.TileSet.mb_get_source_count == null) gdext.classes.TileSet.mb_get_source_count = MethodBind.get("TileSet", "get_source_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_source_count, livePtr)
  }

  /** TileSet.get_source_id */
  final def getSourceId(index: Long): Long = {
    if (gdext.classes.TileSet.mb_get_source_id == null) gdext.classes.TileSet.mb_get_source_id = MethodBind.get("TileSet", "get_source_id", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_source_id, livePtr, index)
  }

  /** TileSet.has_source */
  final def hasSource(sourceId: Long): Boolean = {
    if (gdext.classes.TileSet.mb_has_source == null) gdext.classes.TileSet.mb_has_source = MethodBind.get("TileSet", "has_source", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TileSet.mb_has_source, livePtr, sourceId)
  }

  /** TileSet.get_source. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSource(sourceId: Long): TileSetSource = {
    if (gdext.classes.TileSet.mb_get_source == null) gdext.classes.TileSet.mb_get_source = MethodBind.get("TileSet", "get_source", 1763540252L)
    Wrappers.owned[TileSetSource](Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_source, livePtr, sourceId))
  }

  /** TileSet.set_tile_shape */
  final def setTileShape(shape: gdext.classes.TileSet.TileShape): Unit = {
    if (gdext.classes.TileSet.mb_set_tile_shape == null) gdext.classes.TileSet.mb_set_tile_shape = MethodBind.get("TileSet", "set_tile_shape", 2131427112L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_set_tile_shape, livePtr, shape)
  }

  /** TileSet.get_tile_shape */
  final def getTileShape(): gdext.classes.TileSet.TileShape = {
    if (gdext.classes.TileSet.mb_get_tile_shape == null) gdext.classes.TileSet.mb_get_tile_shape = MethodBind.get("TileSet", "get_tile_shape", 716918169L)
    gdext.classes.TileSet.TileShape(Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_tile_shape, livePtr))
  }

  /** TileSet.set_tile_layout */
  final def setTileLayout(layout: gdext.classes.TileSet.TileLayout): Unit = {
    if (gdext.classes.TileSet.mb_set_tile_layout == null) gdext.classes.TileSet.mb_set_tile_layout = MethodBind.get("TileSet", "set_tile_layout", 1071216679L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_set_tile_layout, livePtr, layout)
  }

  /** TileSet.get_tile_layout */
  final def getTileLayout(): gdext.classes.TileSet.TileLayout = {
    if (gdext.classes.TileSet.mb_get_tile_layout == null) gdext.classes.TileSet.mb_get_tile_layout = MethodBind.get("TileSet", "get_tile_layout", 194628839L)
    gdext.classes.TileSet.TileLayout(Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_tile_layout, livePtr))
  }

  /** TileSet.set_tile_offset_axis */
  final def setTileOffsetAxis(alignment: gdext.classes.TileSet.TileOffsetAxis): Unit = {
    if (gdext.classes.TileSet.mb_set_tile_offset_axis == null) gdext.classes.TileSet.mb_set_tile_offset_axis = MethodBind.get("TileSet", "set_tile_offset_axis", 3300198521L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_set_tile_offset_axis, livePtr, alignment)
  }

  /** TileSet.get_tile_offset_axis */
  final def getTileOffsetAxis(): gdext.classes.TileSet.TileOffsetAxis = {
    if (gdext.classes.TileSet.mb_get_tile_offset_axis == null) gdext.classes.TileSet.mb_get_tile_offset_axis = MethodBind.get("TileSet", "get_tile_offset_axis", 762494114L)
    gdext.classes.TileSet.TileOffsetAxis(Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_tile_offset_axis, livePtr))
  }

  /** TileSet.set_tile_size */
  final def setTileSize(size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.TileSet.mb_set_tile_size == null) gdext.classes.TileSet.mb_set_tile_size = MethodBind.get("TileSet", "set_tile_size", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_set_tile_size, livePtr, size)
  }

  /** TileSet.get_tile_size */
  final def getTileSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.TileSet.mb_get_tile_size == null) gdext.classes.TileSet.mb_get_tile_size = MethodBind.get("TileSet", "get_tile_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.TileSet.mb_get_tile_size, livePtr)
  }

  /** TileSet.set_uv_clipping */
  final def setUvClipping(uvClipping: Boolean): Unit = {
    if (gdext.classes.TileSet.mb_set_uv_clipping == null) gdext.classes.TileSet.mb_set_uv_clipping = MethodBind.get("TileSet", "set_uv_clipping", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_set_uv_clipping, livePtr, uvClipping)
  }

  /** TileSet.is_uv_clipping */
  final def isUvClipping(): Boolean = {
    if (gdext.classes.TileSet.mb_is_uv_clipping == null) gdext.classes.TileSet.mb_is_uv_clipping = MethodBind.get("TileSet", "is_uv_clipping", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TileSet.mb_is_uv_clipping, livePtr)
  }

  /** TileSet.get_occlusion_layers_count */
  final def getOcclusionLayersCount(): Long = {
    if (gdext.classes.TileSet.mb_get_occlusion_layers_count == null) gdext.classes.TileSet.mb_get_occlusion_layers_count = MethodBind.get("TileSet", "get_occlusion_layers_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_occlusion_layers_count, livePtr)
  }

  /** TileSet.add_occlusion_layer */
  final def addOcclusionLayer(toPosition: Long = -1L): Unit = {
    if (gdext.classes.TileSet.mb_add_occlusion_layer == null) gdext.classes.TileSet.mb_add_occlusion_layer = MethodBind.get("TileSet", "add_occlusion_layer", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_add_occlusion_layer, livePtr, toPosition)
  }

  /** TileSet.move_occlusion_layer */
  final def moveOcclusionLayer(layerIndex: Long, toPosition: Long): Unit = {
    if (gdext.classes.TileSet.mb_move_occlusion_layer == null) gdext.classes.TileSet.mb_move_occlusion_layer = MethodBind.get("TileSet", "move_occlusion_layer", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_move_occlusion_layer, livePtr, layerIndex, toPosition)
  }

  /** TileSet.remove_occlusion_layer */
  final def removeOcclusionLayer(layerIndex: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_occlusion_layer == null) gdext.classes.TileSet.mb_remove_occlusion_layer = MethodBind.get("TileSet", "remove_occlusion_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_remove_occlusion_layer, livePtr, layerIndex)
  }

  /** TileSet.set_occlusion_layer_light_mask */
  final def setOcclusionLayerLightMask(layerIndex: Long, lightMask: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_occlusion_layer_light_mask == null) gdext.classes.TileSet.mb_set_occlusion_layer_light_mask = MethodBind.get("TileSet", "set_occlusion_layer_light_mask", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_occlusion_layer_light_mask, livePtr, layerIndex, lightMask)
  }

  /** TileSet.get_occlusion_layer_light_mask */
  final def getOcclusionLayerLightMask(layerIndex: Long): Long = {
    if (gdext.classes.TileSet.mb_get_occlusion_layer_light_mask == null) gdext.classes.TileSet.mb_get_occlusion_layer_light_mask = MethodBind.get("TileSet", "get_occlusion_layer_light_mask", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_occlusion_layer_light_mask, livePtr, layerIndex)
  }

  /** TileSet.set_occlusion_layer_sdf_collision */
  final def setOcclusionLayerSdfCollision(layerIndex: Long, sdfCollision: Boolean): Unit = {
    if (gdext.classes.TileSet.mb_set_occlusion_layer_sdf_collision == null) gdext.classes.TileSet.mb_set_occlusion_layer_sdf_collision = MethodBind.get("TileSet", "set_occlusion_layer_sdf_collision", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_occlusion_layer_sdf_collision, livePtr, layerIndex, sdfCollision)
  }

  /** TileSet.get_occlusion_layer_sdf_collision */
  final def getOcclusionLayerSdfCollision(layerIndex: Long): Boolean = {
    if (gdext.classes.TileSet.mb_get_occlusion_layer_sdf_collision == null) gdext.classes.TileSet.mb_get_occlusion_layer_sdf_collision = MethodBind.get("TileSet", "get_occlusion_layer_sdf_collision", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TileSet.mb_get_occlusion_layer_sdf_collision, livePtr, layerIndex)
  }

  /** TileSet.get_physics_layers_count */
  final def getPhysicsLayersCount(): Long = {
    if (gdext.classes.TileSet.mb_get_physics_layers_count == null) gdext.classes.TileSet.mb_get_physics_layers_count = MethodBind.get("TileSet", "get_physics_layers_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_physics_layers_count, livePtr)
  }

  /** TileSet.add_physics_layer */
  final def addPhysicsLayer(toPosition: Long = -1L): Unit = {
    if (gdext.classes.TileSet.mb_add_physics_layer == null) gdext.classes.TileSet.mb_add_physics_layer = MethodBind.get("TileSet", "add_physics_layer", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_add_physics_layer, livePtr, toPosition)
  }

  /** TileSet.move_physics_layer */
  final def movePhysicsLayer(layerIndex: Long, toPosition: Long): Unit = {
    if (gdext.classes.TileSet.mb_move_physics_layer == null) gdext.classes.TileSet.mb_move_physics_layer = MethodBind.get("TileSet", "move_physics_layer", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_move_physics_layer, livePtr, layerIndex, toPosition)
  }

  /** TileSet.remove_physics_layer */
  final def removePhysicsLayer(layerIndex: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_physics_layer == null) gdext.classes.TileSet.mb_remove_physics_layer = MethodBind.get("TileSet", "remove_physics_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_remove_physics_layer, livePtr, layerIndex)
  }

  /** TileSet.set_physics_layer_collision_layer */
  final def setPhysicsLayerCollisionLayer(layerIndex: Long, layer: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_physics_layer_collision_layer == null) gdext.classes.TileSet.mb_set_physics_layer_collision_layer = MethodBind.get("TileSet", "set_physics_layer_collision_layer", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_physics_layer_collision_layer, livePtr, layerIndex, layer)
  }

  /** TileSet.get_physics_layer_collision_layer */
  final def getPhysicsLayerCollisionLayer(layerIndex: Long): Long = {
    if (gdext.classes.TileSet.mb_get_physics_layer_collision_layer == null) gdext.classes.TileSet.mb_get_physics_layer_collision_layer = MethodBind.get("TileSet", "get_physics_layer_collision_layer", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_physics_layer_collision_layer, livePtr, layerIndex)
  }

  /** TileSet.set_physics_layer_collision_mask */
  final def setPhysicsLayerCollisionMask(layerIndex: Long, mask: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_physics_layer_collision_mask == null) gdext.classes.TileSet.mb_set_physics_layer_collision_mask = MethodBind.get("TileSet", "set_physics_layer_collision_mask", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_physics_layer_collision_mask, livePtr, layerIndex, mask)
  }

  /** TileSet.get_physics_layer_collision_mask */
  final def getPhysicsLayerCollisionMask(layerIndex: Long): Long = {
    if (gdext.classes.TileSet.mb_get_physics_layer_collision_mask == null) gdext.classes.TileSet.mb_get_physics_layer_collision_mask = MethodBind.get("TileSet", "get_physics_layer_collision_mask", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_physics_layer_collision_mask, livePtr, layerIndex)
  }

  /** TileSet.set_physics_layer_collision_priority */
  final def setPhysicsLayerCollisionPriority(layerIndex: Long, priority: Double): Unit = {
    if (gdext.classes.TileSet.mb_set_physics_layer_collision_priority == null) gdext.classes.TileSet.mb_set_physics_layer_collision_priority = MethodBind.get("TileSet", "set_physics_layer_collision_priority", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_physics_layer_collision_priority, livePtr, layerIndex, priority)
  }

  /** TileSet.get_physics_layer_collision_priority */
  final def getPhysicsLayerCollisionPriority(layerIndex: Long): Double = {
    if (gdext.classes.TileSet.mb_get_physics_layer_collision_priority == null) gdext.classes.TileSet.mb_get_physics_layer_collision_priority = MethodBind.get("TileSet", "get_physics_layer_collision_priority", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.TileSet.mb_get_physics_layer_collision_priority, livePtr, layerIndex)
  }

  /** TileSet.set_physics_layer_physics_material */
  final def setPhysicsLayerPhysicsMaterial(layerIndex: Long, physicsMaterial: PhysicsMaterial): Unit = {
    if (gdext.classes.TileSet.mb_set_physics_layer_physics_material == null) gdext.classes.TileSet.mb_set_physics_layer_physics_material = MethodBind.get("TileSet", "set_physics_layer_physics_material", 1018687357L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_physics_layer_physics_material, livePtr, layerIndex, Wrappers.handle(physicsMaterial))
  }

  /** TileSet.get_physics_layer_physics_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPhysicsLayerPhysicsMaterial(layerIndex: Long): PhysicsMaterial = {
    if (gdext.classes.TileSet.mb_get_physics_layer_physics_material == null) gdext.classes.TileSet.mb_get_physics_layer_physics_material = MethodBind.get("TileSet", "get_physics_layer_physics_material", 788318639L)
    Wrappers.owned[PhysicsMaterial](Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_physics_layer_physics_material, livePtr, layerIndex))
  }

  /** TileSet.get_terrain_sets_count */
  final def getTerrainSetsCount(): Long = {
    if (gdext.classes.TileSet.mb_get_terrain_sets_count == null) gdext.classes.TileSet.mb_get_terrain_sets_count = MethodBind.get("TileSet", "get_terrain_sets_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_terrain_sets_count, livePtr)
  }

  /** TileSet.add_terrain_set */
  final def addTerrainSet(toPosition: Long = -1L): Unit = {
    if (gdext.classes.TileSet.mb_add_terrain_set == null) gdext.classes.TileSet.mb_add_terrain_set = MethodBind.get("TileSet", "add_terrain_set", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_add_terrain_set, livePtr, toPosition)
  }

  /** TileSet.move_terrain_set */
  final def moveTerrainSet(terrainSet: Long, toPosition: Long): Unit = {
    if (gdext.classes.TileSet.mb_move_terrain_set == null) gdext.classes.TileSet.mb_move_terrain_set = MethodBind.get("TileSet", "move_terrain_set", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_move_terrain_set, livePtr, terrainSet, toPosition)
  }

  /** TileSet.remove_terrain_set */
  final def removeTerrainSet(terrainSet: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_terrain_set == null) gdext.classes.TileSet.mb_remove_terrain_set = MethodBind.get("TileSet", "remove_terrain_set", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_remove_terrain_set, livePtr, terrainSet)
  }

  /** TileSet.set_terrain_set_mode */
  final def setTerrainSetMode(terrainSet: Long, mode: gdext.classes.TileSet.TerrainMode): Unit = {
    if (gdext.classes.TileSet.mb_set_terrain_set_mode == null) gdext.classes.TileSet.mb_set_terrain_set_mode = MethodBind.get("TileSet", "set_terrain_set_mode", 3943003916L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_terrain_set_mode, livePtr, terrainSet, mode)
  }

  /** TileSet.get_terrain_set_mode */
  final def getTerrainSetMode(terrainSet: Long): gdext.classes.TileSet.TerrainMode = {
    if (gdext.classes.TileSet.mb_get_terrain_set_mode == null) gdext.classes.TileSet.mb_get_terrain_set_mode = MethodBind.get("TileSet", "get_terrain_set_mode", 2084469411L)
    gdext.classes.TileSet.TerrainMode(Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_terrain_set_mode, livePtr, terrainSet))
  }

  /** TileSet.get_terrains_count */
  final def getTerrainsCount(terrainSet: Long): Long = {
    if (gdext.classes.TileSet.mb_get_terrains_count == null) gdext.classes.TileSet.mb_get_terrains_count = MethodBind.get("TileSet", "get_terrains_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_terrains_count, livePtr, terrainSet)
  }

  /** TileSet.add_terrain */
  final def addTerrain(terrainSet: Long, toPosition: Long = -1L): Unit = {
    if (gdext.classes.TileSet.mb_add_terrain == null) gdext.classes.TileSet.mb_add_terrain = MethodBind.get("TileSet", "add_terrain", 1230568737L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_add_terrain, livePtr, terrainSet, toPosition)
  }

  /** TileSet.move_terrain */
  final def moveTerrain(terrainSet: Long, terrainIndex: Long, toPosition: Long): Unit = {
    if (gdext.classes.TileSet.mb_move_terrain == null) gdext.classes.TileSet.mb_move_terrain = MethodBind.get("TileSet", "move_terrain", 1649997291L)
    Ptrcall.callVoid3(gdext.classes.TileSet.mb_move_terrain, livePtr, terrainSet, terrainIndex, toPosition)
  }

  /** TileSet.remove_terrain */
  final def removeTerrain(terrainSet: Long, terrainIndex: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_terrain == null) gdext.classes.TileSet.mb_remove_terrain = MethodBind.get("TileSet", "remove_terrain", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_remove_terrain, livePtr, terrainSet, terrainIndex)
  }

  /** TileSet.set_terrain_name */
  final def setTerrainName(terrainSet: Long, terrainIndex: Long, name: String): Unit = {
    if (gdext.classes.TileSet.mb_set_terrain_name == null) gdext.classes.TileSet.mb_set_terrain_name = MethodBind.get("TileSet", "set_terrain_name", 2285447957L)
    Ptrcall.callVoid3(gdext.classes.TileSet.mb_set_terrain_name, livePtr, terrainSet, terrainIndex, name)
  }

  /** TileSet.get_terrain_name */
  final def getTerrainName(terrainSet: Long, terrainIndex: Long): String = {
    if (gdext.classes.TileSet.mb_get_terrain_name == null) gdext.classes.TileSet.mb_get_terrain_name = MethodBind.get("TileSet", "get_terrain_name", 1391810591L)
    Ptrcall.call2[Long, Long, String](gdext.classes.TileSet.mb_get_terrain_name, livePtr, terrainSet, terrainIndex)
  }

  /** TileSet.set_terrain_color */
  final def setTerrainColor(terrainSet: Long, terrainIndex: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.TileSet.mb_set_terrain_color == null) gdext.classes.TileSet.mb_set_terrain_color = MethodBind.get("TileSet", "set_terrain_color", 3733378741L)
    Ptrcall.callVoid3(gdext.classes.TileSet.mb_set_terrain_color, livePtr, terrainSet, terrainIndex, color)
  }

  /** TileSet.get_terrain_color */
  final def getTerrainColor(terrainSet: Long, terrainIndex: Long): gdext.builtin.Color = {
    if (gdext.classes.TileSet.mb_get_terrain_color == null) gdext.classes.TileSet.mb_get_terrain_color = MethodBind.get("TileSet", "get_terrain_color", 2165839948L)
    Ptrcall.call2[Long, Long, gdext.builtin.Color](gdext.classes.TileSet.mb_get_terrain_color, livePtr, terrainSet, terrainIndex)
  }

  /** TileSet.get_navigation_layers_count */
  final def getNavigationLayersCount(): Long = {
    if (gdext.classes.TileSet.mb_get_navigation_layers_count == null) gdext.classes.TileSet.mb_get_navigation_layers_count = MethodBind.get("TileSet", "get_navigation_layers_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_navigation_layers_count, livePtr)
  }

  /** TileSet.add_navigation_layer */
  final def addNavigationLayer(toPosition: Long = -1L): Unit = {
    if (gdext.classes.TileSet.mb_add_navigation_layer == null) gdext.classes.TileSet.mb_add_navigation_layer = MethodBind.get("TileSet", "add_navigation_layer", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_add_navigation_layer, livePtr, toPosition)
  }

  /** TileSet.move_navigation_layer */
  final def moveNavigationLayer(layerIndex: Long, toPosition: Long): Unit = {
    if (gdext.classes.TileSet.mb_move_navigation_layer == null) gdext.classes.TileSet.mb_move_navigation_layer = MethodBind.get("TileSet", "move_navigation_layer", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_move_navigation_layer, livePtr, layerIndex, toPosition)
  }

  /** TileSet.remove_navigation_layer */
  final def removeNavigationLayer(layerIndex: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_navigation_layer == null) gdext.classes.TileSet.mb_remove_navigation_layer = MethodBind.get("TileSet", "remove_navigation_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_remove_navigation_layer, livePtr, layerIndex)
  }

  /** TileSet.set_navigation_layer_layers */
  final def setNavigationLayerLayers(layerIndex: Long, layers: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_navigation_layer_layers == null) gdext.classes.TileSet.mb_set_navigation_layer_layers = MethodBind.get("TileSet", "set_navigation_layer_layers", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_navigation_layer_layers, livePtr, layerIndex, layers)
  }

  /** TileSet.get_navigation_layer_layers */
  final def getNavigationLayerLayers(layerIndex: Long): Long = {
    if (gdext.classes.TileSet.mb_get_navigation_layer_layers == null) gdext.classes.TileSet.mb_get_navigation_layer_layers = MethodBind.get("TileSet", "get_navigation_layer_layers", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_navigation_layer_layers, livePtr, layerIndex)
  }

  /** TileSet.set_navigation_layer_layer_value */
  final def setNavigationLayerLayerValue(layerIndex: Long, layerNumber: Long, value: Boolean): Unit = {
    if (gdext.classes.TileSet.mb_set_navigation_layer_layer_value == null) gdext.classes.TileSet.mb_set_navigation_layer_layer_value = MethodBind.get("TileSet", "set_navigation_layer_layer_value", 1383440665L)
    Ptrcall.callVoid3(gdext.classes.TileSet.mb_set_navigation_layer_layer_value, livePtr, layerIndex, layerNumber, value)
  }

  /** TileSet.get_navigation_layer_layer_value */
  final def getNavigationLayerLayerValue(layerIndex: Long, layerNumber: Long): Boolean = {
    if (gdext.classes.TileSet.mb_get_navigation_layer_layer_value == null) gdext.classes.TileSet.mb_get_navigation_layer_layer_value = MethodBind.get("TileSet", "get_navigation_layer_layer_value", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.TileSet.mb_get_navigation_layer_layer_value, livePtr, layerIndex, layerNumber)
  }

  /** TileSet.get_custom_data_layers_count */
  final def getCustomDataLayersCount(): Long = {
    if (gdext.classes.TileSet.mb_get_custom_data_layers_count == null) gdext.classes.TileSet.mb_get_custom_data_layers_count = MethodBind.get("TileSet", "get_custom_data_layers_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_custom_data_layers_count, livePtr)
  }

  /** TileSet.add_custom_data_layer */
  final def addCustomDataLayer(toPosition: Long = -1L): Unit = {
    if (gdext.classes.TileSet.mb_add_custom_data_layer == null) gdext.classes.TileSet.mb_add_custom_data_layer = MethodBind.get("TileSet", "add_custom_data_layer", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_add_custom_data_layer, livePtr, toPosition)
  }

  /** TileSet.move_custom_data_layer */
  final def moveCustomDataLayer(layerIndex: Long, toPosition: Long): Unit = {
    if (gdext.classes.TileSet.mb_move_custom_data_layer == null) gdext.classes.TileSet.mb_move_custom_data_layer = MethodBind.get("TileSet", "move_custom_data_layer", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_move_custom_data_layer, livePtr, layerIndex, toPosition)
  }

  /** TileSet.remove_custom_data_layer */
  final def removeCustomDataLayer(layerIndex: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_custom_data_layer == null) gdext.classes.TileSet.mb_remove_custom_data_layer = MethodBind.get("TileSet", "remove_custom_data_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_remove_custom_data_layer, livePtr, layerIndex)
  }

  /** TileSet.get_custom_data_layer_by_name */
  final def getCustomDataLayerByName(layerName: String): Long = {
    if (gdext.classes.TileSet.mb_get_custom_data_layer_by_name == null) gdext.classes.TileSet.mb_get_custom_data_layer_by_name = MethodBind.get("TileSet", "get_custom_data_layer_by_name", 1321353865L)
    Ptrcall.call1[String, Long](gdext.classes.TileSet.mb_get_custom_data_layer_by_name, livePtr, layerName)
  }

  /** TileSet.set_custom_data_layer_name */
  final def setCustomDataLayerName(layerIndex: Long, layerName: String): Unit = {
    if (gdext.classes.TileSet.mb_set_custom_data_layer_name == null) gdext.classes.TileSet.mb_set_custom_data_layer_name = MethodBind.get("TileSet", "set_custom_data_layer_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_custom_data_layer_name, livePtr, layerIndex, layerName)
  }

  /** TileSet.has_custom_data_layer_by_name */
  final def hasCustomDataLayerByName(layerName: String): Boolean = {
    if (gdext.classes.TileSet.mb_has_custom_data_layer_by_name == null) gdext.classes.TileSet.mb_has_custom_data_layer_by_name = MethodBind.get("TileSet", "has_custom_data_layer_by_name", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.TileSet.mb_has_custom_data_layer_by_name, livePtr, layerName)
  }

  /** TileSet.get_custom_data_layer_name */
  final def getCustomDataLayerName(layerIndex: Long): String = {
    if (gdext.classes.TileSet.mb_get_custom_data_layer_name == null) gdext.classes.TileSet.mb_get_custom_data_layer_name = MethodBind.get("TileSet", "get_custom_data_layer_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TileSet.mb_get_custom_data_layer_name, livePtr, layerIndex)
  }

  /** TileSet.set_custom_data_layer_type */
  final def setCustomDataLayerType(layerIndex: Long, layerType: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_custom_data_layer_type == null) gdext.classes.TileSet.mb_set_custom_data_layer_type = MethodBind.get("TileSet", "set_custom_data_layer_type", 3492912874L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_custom_data_layer_type, livePtr, layerIndex, layerType)
  }

  /** TileSet.get_custom_data_layer_type */
  final def getCustomDataLayerType(layerIndex: Long): Long = {
    if (gdext.classes.TileSet.mb_get_custom_data_layer_type == null) gdext.classes.TileSet.mb_get_custom_data_layer_type = MethodBind.get("TileSet", "get_custom_data_layer_type", 2990820875L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_custom_data_layer_type, livePtr, layerIndex)
  }

  /** TileSet.set_source_level_tile_proxy */
  final def setSourceLevelTileProxy(sourceFrom: Long, sourceTo: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_source_level_tile_proxy == null) gdext.classes.TileSet.mb_set_source_level_tile_proxy = MethodBind.get("TileSet", "set_source_level_tile_proxy", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_source_level_tile_proxy, livePtr, sourceFrom, sourceTo)
  }

  /** TileSet.get_source_level_tile_proxy */
  final def getSourceLevelTileProxy(sourceFrom: Long): Long = {
    if (gdext.classes.TileSet.mb_get_source_level_tile_proxy == null) gdext.classes.TileSet.mb_get_source_level_tile_proxy = MethodBind.get("TileSet", "get_source_level_tile_proxy", 3744713108L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_source_level_tile_proxy, livePtr, sourceFrom)
  }

  /** TileSet.has_source_level_tile_proxy */
  final def hasSourceLevelTileProxy(sourceFrom: Long): Boolean = {
    if (gdext.classes.TileSet.mb_has_source_level_tile_proxy == null) gdext.classes.TileSet.mb_has_source_level_tile_proxy = MethodBind.get("TileSet", "has_source_level_tile_proxy", 3067735520L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TileSet.mb_has_source_level_tile_proxy, livePtr, sourceFrom)
  }

  /** TileSet.remove_source_level_tile_proxy */
  final def removeSourceLevelTileProxy(sourceFrom: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_source_level_tile_proxy == null) gdext.classes.TileSet.mb_remove_source_level_tile_proxy = MethodBind.get("TileSet", "remove_source_level_tile_proxy", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_remove_source_level_tile_proxy, livePtr, sourceFrom)
  }

  /** TileSet.set_coords_level_tile_proxy */
  final def setCoordsLevelTileProxy(pSourceFrom: Long, coordsFrom: gdext.builtin.Vector2i, sourceTo: Long, coordsTo: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.TileSet.mb_set_coords_level_tile_proxy == null) gdext.classes.TileSet.mb_set_coords_level_tile_proxy = MethodBind.get("TileSet", "set_coords_level_tile_proxy", 1769939278L)
    Ptrcall.callVoid4(gdext.classes.TileSet.mb_set_coords_level_tile_proxy, livePtr, pSourceFrom, coordsFrom, sourceTo, coordsTo)
  }

  /** TileSet.has_coords_level_tile_proxy */
  final def hasCoordsLevelTileProxy(sourceFrom: Long, coordsFrom: gdext.builtin.Vector2i): Boolean = {
    if (gdext.classes.TileSet.mb_has_coords_level_tile_proxy == null) gdext.classes.TileSet.mb_has_coords_level_tile_proxy = MethodBind.get("TileSet", "has_coords_level_tile_proxy", 3957903770L)
    Ptrcall.call2[Long, gdext.builtin.Vector2i, Boolean](gdext.classes.TileSet.mb_has_coords_level_tile_proxy, livePtr, sourceFrom, coordsFrom)
  }

  /** TileSet.remove_coords_level_tile_proxy */
  final def removeCoordsLevelTileProxy(sourceFrom: Long, coordsFrom: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.TileSet.mb_remove_coords_level_tile_proxy == null) gdext.classes.TileSet.mb_remove_coords_level_tile_proxy = MethodBind.get("TileSet", "remove_coords_level_tile_proxy", 2311374912L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_remove_coords_level_tile_proxy, livePtr, sourceFrom, coordsFrom)
  }

  /** TileSet.set_alternative_level_tile_proxy */
  final def setAlternativeLevelTileProxy(sourceFrom: Long, coordsFrom: gdext.builtin.Vector2i, alternativeFrom: Long, sourceTo: Long, coordsTo: gdext.builtin.Vector2i, alternativeTo: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_alternative_level_tile_proxy == null) gdext.classes.TileSet.mb_set_alternative_level_tile_proxy = MethodBind.get("TileSet", "set_alternative_level_tile_proxy", 3862385460L)
    Ptrcall.callVoid6(gdext.classes.TileSet.mb_set_alternative_level_tile_proxy, livePtr, sourceFrom, coordsFrom, alternativeFrom, sourceTo, coordsTo, alternativeTo)
  }

  /** TileSet.has_alternative_level_tile_proxy */
  final def hasAlternativeLevelTileProxy(sourceFrom: Long, coordsFrom: gdext.builtin.Vector2i, alternativeFrom: Long): Boolean = {
    if (gdext.classes.TileSet.mb_has_alternative_level_tile_proxy == null) gdext.classes.TileSet.mb_has_alternative_level_tile_proxy = MethodBind.get("TileSet", "has_alternative_level_tile_proxy", 180086755L)
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Long, Boolean](gdext.classes.TileSet.mb_has_alternative_level_tile_proxy, livePtr, sourceFrom, coordsFrom, alternativeFrom)
  }

  /** TileSet.remove_alternative_level_tile_proxy */
  final def removeAlternativeLevelTileProxy(sourceFrom: Long, coordsFrom: gdext.builtin.Vector2i, alternativeFrom: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_alternative_level_tile_proxy == null) gdext.classes.TileSet.mb_remove_alternative_level_tile_proxy = MethodBind.get("TileSet", "remove_alternative_level_tile_proxy", 2328951467L)
    Ptrcall.callVoid3(gdext.classes.TileSet.mb_remove_alternative_level_tile_proxy, livePtr, sourceFrom, coordsFrom, alternativeFrom)
  }

  /** TileSet.cleanup_invalid_tile_proxies */
  final def cleanupInvalidTileProxies(): Unit = {
    if (gdext.classes.TileSet.mb_cleanup_invalid_tile_proxies == null) gdext.classes.TileSet.mb_cleanup_invalid_tile_proxies = MethodBind.get("TileSet", "cleanup_invalid_tile_proxies", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TileSet.mb_cleanup_invalid_tile_proxies, livePtr)
  }

  /** TileSet.clear_tile_proxies */
  final def clearTileProxies(): Unit = {
    if (gdext.classes.TileSet.mb_clear_tile_proxies == null) gdext.classes.TileSet.mb_clear_tile_proxies = MethodBind.get("TileSet", "clear_tile_proxies", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TileSet.mb_clear_tile_proxies, livePtr)
  }

  /** TileSet.add_pattern */
  final def addPattern(pattern: TileMapPattern, index: Long = -1L): Long = {
    if (gdext.classes.TileSet.mb_add_pattern == null) gdext.classes.TileSet.mb_add_pattern = MethodBind.get("TileSet", "add_pattern", 763712015L)
    Ptrcall.call2[GodotObject, Long, Long](gdext.classes.TileSet.mb_add_pattern, livePtr, Wrappers.handle(pattern), index)
  }

  /** TileSet.get_pattern. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPattern(index: Long = -1L): TileMapPattern = {
    if (gdext.classes.TileSet.mb_get_pattern == null) gdext.classes.TileSet.mb_get_pattern = MethodBind.get("TileSet", "get_pattern", 4207737510L)
    Wrappers.owned[TileMapPattern](Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_pattern, livePtr, index))
  }

  /** TileSet.remove_pattern */
  final def removePattern(index: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_pattern == null) gdext.classes.TileSet.mb_remove_pattern = MethodBind.get("TileSet", "remove_pattern", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_remove_pattern, livePtr, index)
  }

  /** TileSet.get_patterns_count */
  final def getPatternsCount(): Long = {
    if (gdext.classes.TileSet.mb_get_patterns_count == null) gdext.classes.TileSet.mb_get_patterns_count = MethodBind.get("TileSet", "get_patterns_count", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_patterns_count, livePtr)
  }

}

object TileSet {
  private[classes] var mb_get_next_source_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_source_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_source_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_source_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tile_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tile_layout: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_layout: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tile_offset_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_offset_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tile_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tile_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uv_clipping: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_uv_clipping: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_occlusion_layers_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_occlusion_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_occlusion_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_occlusion_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_occlusion_layer_light_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_occlusion_layer_light_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_occlusion_layer_sdf_collision: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_occlusion_layer_sdf_collision: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_layers_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_physics_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_physics_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_physics_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_layer_collision_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_layer_collision_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_layer_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_layer_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_layer_collision_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_layer_collision_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_layer_physics_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_layer_physics_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_terrain_sets_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_terrain_set: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_terrain_set: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_terrain_set: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_terrain_set_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_terrain_set_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_terrains_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_terrain: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_terrain: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_terrain: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_terrain_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_terrain_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_terrain_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_terrain_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_navigation_layers_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_navigation_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_navigation_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_navigation_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_navigation_layer_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_navigation_layer_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_navigation_layer_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_navigation_layer_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_data_layers_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_custom_data_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_custom_data_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_custom_data_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_data_layer_by_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_data_layer_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_custom_data_layer_by_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_data_layer_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_data_layer_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_data_layer_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_source_level_tile_proxy: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_source_level_tile_proxy: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_source_level_tile_proxy: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_source_level_tile_proxy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_coords_level_tile_proxy: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_coords_level_tile_proxy: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_coords_level_tile_proxy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alternative_level_tile_proxy: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_alternative_level_tile_proxy: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_alternative_level_tile_proxy: GDExtensionMethodBindPtr = null
  private[classes] var mb_cleanup_invalid_tile_proxies: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_tile_proxies: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_pattern: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pattern: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_pattern: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_patterns_count: GDExtensionMethodBindPtr = null

  /** Godot enum `TileSet.TileShape`. */
  opaque type TileShape <: Long = Long

  object TileShape {
    final val Square: TileShape = 0L.asInstanceOf[TileShape]
    final val Isometric: TileShape = 1L.asInstanceOf[TileShape]
    final val HalfOffsetSquare: TileShape = 2L.asInstanceOf[TileShape]
    final val Hexagon: TileShape = 3L.asInstanceOf[TileShape]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TileShape = value.asInstanceOf[TileShape]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TileShape] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[TileShape]]

    extension (self: TileShape)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Square"
        case 1L => "Isometric"
        case 2L => "HalfOffsetSquare"
        case 3L => "Hexagon"
        case other => other.toString
      }
  }

  /** Godot enum `TileSet.TileLayout`. */
  opaque type TileLayout <: Long = Long

  object TileLayout {
    final val Stacked: TileLayout = 0L.asInstanceOf[TileLayout]
    final val StackedOffset: TileLayout = 1L.asInstanceOf[TileLayout]
    final val StairsRight: TileLayout = 2L.asInstanceOf[TileLayout]
    final val StairsDown: TileLayout = 3L.asInstanceOf[TileLayout]
    final val DiamondRight: TileLayout = 4L.asInstanceOf[TileLayout]
    final val DiamondDown: TileLayout = 5L.asInstanceOf[TileLayout]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TileLayout = value.asInstanceOf[TileLayout]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TileLayout] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[TileLayout]]

    extension (self: TileLayout)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Stacked"
        case 1L => "StackedOffset"
        case 2L => "StairsRight"
        case 3L => "StairsDown"
        case 4L => "DiamondRight"
        case 5L => "DiamondDown"
        case other => other.toString
      }
  }

  /** Godot enum `TileSet.TileOffsetAxis`. */
  opaque type TileOffsetAxis <: Long = Long

  object TileOffsetAxis {
    final val Horizontal: TileOffsetAxis = 0L.asInstanceOf[TileOffsetAxis]
    final val Vertical: TileOffsetAxis = 1L.asInstanceOf[TileOffsetAxis]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TileOffsetAxis = value.asInstanceOf[TileOffsetAxis]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TileOffsetAxis] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[TileOffsetAxis]]

    extension (self: TileOffsetAxis)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Horizontal"
        case 1L => "Vertical"
        case other => other.toString
      }
  }

  /** Godot enum `TileSet.CellNeighbor`. */
  opaque type CellNeighbor <: Long = Long

  object CellNeighbor {
    final val RightSide: CellNeighbor = 0L.asInstanceOf[CellNeighbor]
    final val RightCorner: CellNeighbor = 1L.asInstanceOf[CellNeighbor]
    final val BottomRightSide: CellNeighbor = 2L.asInstanceOf[CellNeighbor]
    final val BottomRightCorner: CellNeighbor = 3L.asInstanceOf[CellNeighbor]
    final val BottomSide: CellNeighbor = 4L.asInstanceOf[CellNeighbor]
    final val BottomCorner: CellNeighbor = 5L.asInstanceOf[CellNeighbor]
    final val BottomLeftSide: CellNeighbor = 6L.asInstanceOf[CellNeighbor]
    final val BottomLeftCorner: CellNeighbor = 7L.asInstanceOf[CellNeighbor]
    final val LeftSide: CellNeighbor = 8L.asInstanceOf[CellNeighbor]
    final val LeftCorner: CellNeighbor = 9L.asInstanceOf[CellNeighbor]
    final val TopLeftSide: CellNeighbor = 10L.asInstanceOf[CellNeighbor]
    final val TopLeftCorner: CellNeighbor = 11L.asInstanceOf[CellNeighbor]
    final val TopSide: CellNeighbor = 12L.asInstanceOf[CellNeighbor]
    final val TopCorner: CellNeighbor = 13L.asInstanceOf[CellNeighbor]
    final val TopRightSide: CellNeighbor = 14L.asInstanceOf[CellNeighbor]
    final val TopRightCorner: CellNeighbor = 15L.asInstanceOf[CellNeighbor]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CellNeighbor = value.asInstanceOf[CellNeighbor]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CellNeighbor] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L).asInstanceOf[scala.IArray[CellNeighbor]]

    extension (self: CellNeighbor)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "RightSide"
        case 1L => "RightCorner"
        case 2L => "BottomRightSide"
        case 3L => "BottomRightCorner"
        case 4L => "BottomSide"
        case 5L => "BottomCorner"
        case 6L => "BottomLeftSide"
        case 7L => "BottomLeftCorner"
        case 8L => "LeftSide"
        case 9L => "LeftCorner"
        case 10L => "TopLeftSide"
        case 11L => "TopLeftCorner"
        case 12L => "TopSide"
        case 13L => "TopCorner"
        case 14L => "TopRightSide"
        case 15L => "TopRightCorner"
        case other => other.toString
      }
  }

  /** Godot enum `TileSet.TerrainMode`. */
  opaque type TerrainMode <: Long = Long

  object TerrainMode {
    final val CornersAndSides: TerrainMode = 0L.asInstanceOf[TerrainMode]
    final val Corners: TerrainMode = 1L.asInstanceOf[TerrainMode]
    final val Sides: TerrainMode = 2L.asInstanceOf[TerrainMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TerrainMode = value.asInstanceOf[TerrainMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TerrainMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[TerrainMode]]

    extension (self: TerrainMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "CornersAndSides"
        case 1L => "Corners"
        case 2L => "Sides"
        case other => other.toString
      }
  }
}
