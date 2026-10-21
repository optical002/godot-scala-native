package gdext.classes

import gdext.Godot
import gdext.builtin.*
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
  final def addSource(source: TileSetSource, atlas_source_id_override: Long): Long = {
    if (gdext.classes.TileSet.mb_add_source == null) gdext.classes.TileSet.mb_add_source = MethodBind.get("TileSet", "add_source", 1059186179L)
    Ptrcall.call2[GodotObject, Long, Long](gdext.classes.TileSet.mb_add_source, livePtr, Wrappers.handle(source), atlas_source_id_override)
  }

  /** TileSet.remove_source */
  final def removeSource(source_id: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_source == null) gdext.classes.TileSet.mb_remove_source = MethodBind.get("TileSet", "remove_source", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_remove_source, livePtr, source_id)
  }

  /** TileSet.set_source_id */
  final def setSourceId(source_id: Long, new_source_id: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_source_id == null) gdext.classes.TileSet.mb_set_source_id = MethodBind.get("TileSet", "set_source_id", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_source_id, livePtr, source_id, new_source_id)
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
  final def hasSource(source_id: Long): Boolean = {
    if (gdext.classes.TileSet.mb_has_source == null) gdext.classes.TileSet.mb_has_source = MethodBind.get("TileSet", "has_source", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TileSet.mb_has_source, livePtr, source_id)
  }

  /** TileSet.get_source. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSource(source_id: Long): TileSetSource = {
    if (gdext.classes.TileSet.mb_get_source == null) gdext.classes.TileSet.mb_get_source = MethodBind.get("TileSet", "get_source", 1763540252L)
    Wrappers.owned[TileSetSource](Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_source, livePtr, source_id))
  }

  /** TileSet.set_tile_shape */
  final def setTileShape(shape: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_tile_shape == null) gdext.classes.TileSet.mb_set_tile_shape = MethodBind.get("TileSet", "set_tile_shape", 2131427112L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_set_tile_shape, livePtr, shape)
  }

  /** TileSet.get_tile_shape */
  final def getTileShape(): Long = {
    if (gdext.classes.TileSet.mb_get_tile_shape == null) gdext.classes.TileSet.mb_get_tile_shape = MethodBind.get("TileSet", "get_tile_shape", 716918169L)
    Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_tile_shape, livePtr)
  }

  /** TileSet.set_tile_layout */
  final def setTileLayout(layout: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_tile_layout == null) gdext.classes.TileSet.mb_set_tile_layout = MethodBind.get("TileSet", "set_tile_layout", 1071216679L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_set_tile_layout, livePtr, layout)
  }

  /** TileSet.get_tile_layout */
  final def getTileLayout(): Long = {
    if (gdext.classes.TileSet.mb_get_tile_layout == null) gdext.classes.TileSet.mb_get_tile_layout = MethodBind.get("TileSet", "get_tile_layout", 194628839L)
    Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_tile_layout, livePtr)
  }

  /** TileSet.set_tile_offset_axis */
  final def setTileOffsetAxis(alignment: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_tile_offset_axis == null) gdext.classes.TileSet.mb_set_tile_offset_axis = MethodBind.get("TileSet", "set_tile_offset_axis", 3300198521L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_set_tile_offset_axis, livePtr, alignment)
  }

  /** TileSet.get_tile_offset_axis */
  final def getTileOffsetAxis(): Long = {
    if (gdext.classes.TileSet.mb_get_tile_offset_axis == null) gdext.classes.TileSet.mb_get_tile_offset_axis = MethodBind.get("TileSet", "get_tile_offset_axis", 762494114L)
    Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_tile_offset_axis, livePtr)
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
  final def setUvClipping(uv_clipping: Boolean): Unit = {
    if (gdext.classes.TileSet.mb_set_uv_clipping == null) gdext.classes.TileSet.mb_set_uv_clipping = MethodBind.get("TileSet", "set_uv_clipping", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_set_uv_clipping, livePtr, uv_clipping)
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
  final def addOcclusionLayer(to_position: Long): Unit = {
    if (gdext.classes.TileSet.mb_add_occlusion_layer == null) gdext.classes.TileSet.mb_add_occlusion_layer = MethodBind.get("TileSet", "add_occlusion_layer", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_add_occlusion_layer, livePtr, to_position)
  }

  /** TileSet.move_occlusion_layer */
  final def moveOcclusionLayer(layer_index: Long, to_position: Long): Unit = {
    if (gdext.classes.TileSet.mb_move_occlusion_layer == null) gdext.classes.TileSet.mb_move_occlusion_layer = MethodBind.get("TileSet", "move_occlusion_layer", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_move_occlusion_layer, livePtr, layer_index, to_position)
  }

  /** TileSet.remove_occlusion_layer */
  final def removeOcclusionLayer(layer_index: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_occlusion_layer == null) gdext.classes.TileSet.mb_remove_occlusion_layer = MethodBind.get("TileSet", "remove_occlusion_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_remove_occlusion_layer, livePtr, layer_index)
  }

  /** TileSet.set_occlusion_layer_light_mask */
  final def setOcclusionLayerLightMask(layer_index: Long, light_mask: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_occlusion_layer_light_mask == null) gdext.classes.TileSet.mb_set_occlusion_layer_light_mask = MethodBind.get("TileSet", "set_occlusion_layer_light_mask", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_occlusion_layer_light_mask, livePtr, layer_index, light_mask)
  }

  /** TileSet.get_occlusion_layer_light_mask */
  final def getOcclusionLayerLightMask(layer_index: Long): Long = {
    if (gdext.classes.TileSet.mb_get_occlusion_layer_light_mask == null) gdext.classes.TileSet.mb_get_occlusion_layer_light_mask = MethodBind.get("TileSet", "get_occlusion_layer_light_mask", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_occlusion_layer_light_mask, livePtr, layer_index)
  }

  /** TileSet.set_occlusion_layer_sdf_collision */
  final def setOcclusionLayerSdfCollision(layer_index: Long, sdf_collision: Boolean): Unit = {
    if (gdext.classes.TileSet.mb_set_occlusion_layer_sdf_collision == null) gdext.classes.TileSet.mb_set_occlusion_layer_sdf_collision = MethodBind.get("TileSet", "set_occlusion_layer_sdf_collision", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_occlusion_layer_sdf_collision, livePtr, layer_index, sdf_collision)
  }

  /** TileSet.get_occlusion_layer_sdf_collision */
  final def getOcclusionLayerSdfCollision(layer_index: Long): Boolean = {
    if (gdext.classes.TileSet.mb_get_occlusion_layer_sdf_collision == null) gdext.classes.TileSet.mb_get_occlusion_layer_sdf_collision = MethodBind.get("TileSet", "get_occlusion_layer_sdf_collision", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TileSet.mb_get_occlusion_layer_sdf_collision, livePtr, layer_index)
  }

  /** TileSet.get_physics_layers_count */
  final def getPhysicsLayersCount(): Long = {
    if (gdext.classes.TileSet.mb_get_physics_layers_count == null) gdext.classes.TileSet.mb_get_physics_layers_count = MethodBind.get("TileSet", "get_physics_layers_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_physics_layers_count, livePtr)
  }

  /** TileSet.add_physics_layer */
  final def addPhysicsLayer(to_position: Long): Unit = {
    if (gdext.classes.TileSet.mb_add_physics_layer == null) gdext.classes.TileSet.mb_add_physics_layer = MethodBind.get("TileSet", "add_physics_layer", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_add_physics_layer, livePtr, to_position)
  }

  /** TileSet.move_physics_layer */
  final def movePhysicsLayer(layer_index: Long, to_position: Long): Unit = {
    if (gdext.classes.TileSet.mb_move_physics_layer == null) gdext.classes.TileSet.mb_move_physics_layer = MethodBind.get("TileSet", "move_physics_layer", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_move_physics_layer, livePtr, layer_index, to_position)
  }

  /** TileSet.remove_physics_layer */
  final def removePhysicsLayer(layer_index: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_physics_layer == null) gdext.classes.TileSet.mb_remove_physics_layer = MethodBind.get("TileSet", "remove_physics_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_remove_physics_layer, livePtr, layer_index)
  }

  /** TileSet.set_physics_layer_collision_layer */
  final def setPhysicsLayerCollisionLayer(layer_index: Long, layer: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_physics_layer_collision_layer == null) gdext.classes.TileSet.mb_set_physics_layer_collision_layer = MethodBind.get("TileSet", "set_physics_layer_collision_layer", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_physics_layer_collision_layer, livePtr, layer_index, layer)
  }

  /** TileSet.get_physics_layer_collision_layer */
  final def getPhysicsLayerCollisionLayer(layer_index: Long): Long = {
    if (gdext.classes.TileSet.mb_get_physics_layer_collision_layer == null) gdext.classes.TileSet.mb_get_physics_layer_collision_layer = MethodBind.get("TileSet", "get_physics_layer_collision_layer", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_physics_layer_collision_layer, livePtr, layer_index)
  }

  /** TileSet.set_physics_layer_collision_mask */
  final def setPhysicsLayerCollisionMask(layer_index: Long, mask: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_physics_layer_collision_mask == null) gdext.classes.TileSet.mb_set_physics_layer_collision_mask = MethodBind.get("TileSet", "set_physics_layer_collision_mask", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_physics_layer_collision_mask, livePtr, layer_index, mask)
  }

  /** TileSet.get_physics_layer_collision_mask */
  final def getPhysicsLayerCollisionMask(layer_index: Long): Long = {
    if (gdext.classes.TileSet.mb_get_physics_layer_collision_mask == null) gdext.classes.TileSet.mb_get_physics_layer_collision_mask = MethodBind.get("TileSet", "get_physics_layer_collision_mask", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_physics_layer_collision_mask, livePtr, layer_index)
  }

  /** TileSet.set_physics_layer_collision_priority */
  final def setPhysicsLayerCollisionPriority(layer_index: Long, priority: Double): Unit = {
    if (gdext.classes.TileSet.mb_set_physics_layer_collision_priority == null) gdext.classes.TileSet.mb_set_physics_layer_collision_priority = MethodBind.get("TileSet", "set_physics_layer_collision_priority", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_physics_layer_collision_priority, livePtr, layer_index, priority)
  }

  /** TileSet.get_physics_layer_collision_priority */
  final def getPhysicsLayerCollisionPriority(layer_index: Long): Double = {
    if (gdext.classes.TileSet.mb_get_physics_layer_collision_priority == null) gdext.classes.TileSet.mb_get_physics_layer_collision_priority = MethodBind.get("TileSet", "get_physics_layer_collision_priority", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.TileSet.mb_get_physics_layer_collision_priority, livePtr, layer_index)
  }

  /** TileSet.set_physics_layer_physics_material */
  final def setPhysicsLayerPhysicsMaterial(layer_index: Long, physics_material: PhysicsMaterial): Unit = {
    if (gdext.classes.TileSet.mb_set_physics_layer_physics_material == null) gdext.classes.TileSet.mb_set_physics_layer_physics_material = MethodBind.get("TileSet", "set_physics_layer_physics_material", 1018687357L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_physics_layer_physics_material, livePtr, layer_index, Wrappers.handle(physics_material))
  }

  /** TileSet.get_physics_layer_physics_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPhysicsLayerPhysicsMaterial(layer_index: Long): PhysicsMaterial = {
    if (gdext.classes.TileSet.mb_get_physics_layer_physics_material == null) gdext.classes.TileSet.mb_get_physics_layer_physics_material = MethodBind.get("TileSet", "get_physics_layer_physics_material", 788318639L)
    Wrappers.owned[PhysicsMaterial](Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_physics_layer_physics_material, livePtr, layer_index))
  }

  /** TileSet.get_terrain_sets_count */
  final def getTerrainSetsCount(): Long = {
    if (gdext.classes.TileSet.mb_get_terrain_sets_count == null) gdext.classes.TileSet.mb_get_terrain_sets_count = MethodBind.get("TileSet", "get_terrain_sets_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_terrain_sets_count, livePtr)
  }

  /** TileSet.add_terrain_set */
  final def addTerrainSet(to_position: Long): Unit = {
    if (gdext.classes.TileSet.mb_add_terrain_set == null) gdext.classes.TileSet.mb_add_terrain_set = MethodBind.get("TileSet", "add_terrain_set", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_add_terrain_set, livePtr, to_position)
  }

  /** TileSet.move_terrain_set */
  final def moveTerrainSet(terrain_set: Long, to_position: Long): Unit = {
    if (gdext.classes.TileSet.mb_move_terrain_set == null) gdext.classes.TileSet.mb_move_terrain_set = MethodBind.get("TileSet", "move_terrain_set", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_move_terrain_set, livePtr, terrain_set, to_position)
  }

  /** TileSet.remove_terrain_set */
  final def removeTerrainSet(terrain_set: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_terrain_set == null) gdext.classes.TileSet.mb_remove_terrain_set = MethodBind.get("TileSet", "remove_terrain_set", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_remove_terrain_set, livePtr, terrain_set)
  }

  /** TileSet.set_terrain_set_mode */
  final def setTerrainSetMode(terrain_set: Long, mode: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_terrain_set_mode == null) gdext.classes.TileSet.mb_set_terrain_set_mode = MethodBind.get("TileSet", "set_terrain_set_mode", 3943003916L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_terrain_set_mode, livePtr, terrain_set, mode)
  }

  /** TileSet.get_terrain_set_mode */
  final def getTerrainSetMode(terrain_set: Long): Long = {
    if (gdext.classes.TileSet.mb_get_terrain_set_mode == null) gdext.classes.TileSet.mb_get_terrain_set_mode = MethodBind.get("TileSet", "get_terrain_set_mode", 2084469411L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_terrain_set_mode, livePtr, terrain_set)
  }

  /** TileSet.get_terrains_count */
  final def getTerrainsCount(terrain_set: Long): Long = {
    if (gdext.classes.TileSet.mb_get_terrains_count == null) gdext.classes.TileSet.mb_get_terrains_count = MethodBind.get("TileSet", "get_terrains_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_terrains_count, livePtr, terrain_set)
  }

  /** TileSet.add_terrain */
  final def addTerrain(terrain_set: Long, to_position: Long): Unit = {
    if (gdext.classes.TileSet.mb_add_terrain == null) gdext.classes.TileSet.mb_add_terrain = MethodBind.get("TileSet", "add_terrain", 1230568737L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_add_terrain, livePtr, terrain_set, to_position)
  }

  /** TileSet.move_terrain */
  final def moveTerrain(terrain_set: Long, terrain_index: Long, to_position: Long): Unit = {
    if (gdext.classes.TileSet.mb_move_terrain == null) gdext.classes.TileSet.mb_move_terrain = MethodBind.get("TileSet", "move_terrain", 1649997291L)
    Ptrcall.callVoid3(gdext.classes.TileSet.mb_move_terrain, livePtr, terrain_set, terrain_index, to_position)
  }

  /** TileSet.remove_terrain */
  final def removeTerrain(terrain_set: Long, terrain_index: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_terrain == null) gdext.classes.TileSet.mb_remove_terrain = MethodBind.get("TileSet", "remove_terrain", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_remove_terrain, livePtr, terrain_set, terrain_index)
  }

  /** TileSet.set_terrain_name */
  final def setTerrainName(terrain_set: Long, terrain_index: Long, name: String): Unit = {
    if (gdext.classes.TileSet.mb_set_terrain_name == null) gdext.classes.TileSet.mb_set_terrain_name = MethodBind.get("TileSet", "set_terrain_name", 2285447957L)
    Ptrcall.callVoid3(gdext.classes.TileSet.mb_set_terrain_name, livePtr, terrain_set, terrain_index, name)
  }

  /** TileSet.get_terrain_name */
  final def getTerrainName(terrain_set: Long, terrain_index: Long): String = {
    if (gdext.classes.TileSet.mb_get_terrain_name == null) gdext.classes.TileSet.mb_get_terrain_name = MethodBind.get("TileSet", "get_terrain_name", 1391810591L)
    Ptrcall.call2[Long, Long, String](gdext.classes.TileSet.mb_get_terrain_name, livePtr, terrain_set, terrain_index)
  }

  /** TileSet.set_terrain_color */
  final def setTerrainColor(terrain_set: Long, terrain_index: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.TileSet.mb_set_terrain_color == null) gdext.classes.TileSet.mb_set_terrain_color = MethodBind.get("TileSet", "set_terrain_color", 3733378741L)
    Ptrcall.callVoid3(gdext.classes.TileSet.mb_set_terrain_color, livePtr, terrain_set, terrain_index, color)
  }

  /** TileSet.get_terrain_color */
  final def getTerrainColor(terrain_set: Long, terrain_index: Long): gdext.builtin.Color = {
    if (gdext.classes.TileSet.mb_get_terrain_color == null) gdext.classes.TileSet.mb_get_terrain_color = MethodBind.get("TileSet", "get_terrain_color", 2165839948L)
    Ptrcall.call2[Long, Long, gdext.builtin.Color](gdext.classes.TileSet.mb_get_terrain_color, livePtr, terrain_set, terrain_index)
  }

  /** TileSet.get_navigation_layers_count */
  final def getNavigationLayersCount(): Long = {
    if (gdext.classes.TileSet.mb_get_navigation_layers_count == null) gdext.classes.TileSet.mb_get_navigation_layers_count = MethodBind.get("TileSet", "get_navigation_layers_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_navigation_layers_count, livePtr)
  }

  /** TileSet.add_navigation_layer */
  final def addNavigationLayer(to_position: Long): Unit = {
    if (gdext.classes.TileSet.mb_add_navigation_layer == null) gdext.classes.TileSet.mb_add_navigation_layer = MethodBind.get("TileSet", "add_navigation_layer", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_add_navigation_layer, livePtr, to_position)
  }

  /** TileSet.move_navigation_layer */
  final def moveNavigationLayer(layer_index: Long, to_position: Long): Unit = {
    if (gdext.classes.TileSet.mb_move_navigation_layer == null) gdext.classes.TileSet.mb_move_navigation_layer = MethodBind.get("TileSet", "move_navigation_layer", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_move_navigation_layer, livePtr, layer_index, to_position)
  }

  /** TileSet.remove_navigation_layer */
  final def removeNavigationLayer(layer_index: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_navigation_layer == null) gdext.classes.TileSet.mb_remove_navigation_layer = MethodBind.get("TileSet", "remove_navigation_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_remove_navigation_layer, livePtr, layer_index)
  }

  /** TileSet.set_navigation_layer_layers */
  final def setNavigationLayerLayers(layer_index: Long, layers: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_navigation_layer_layers == null) gdext.classes.TileSet.mb_set_navigation_layer_layers = MethodBind.get("TileSet", "set_navigation_layer_layers", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_navigation_layer_layers, livePtr, layer_index, layers)
  }

  /** TileSet.get_navigation_layer_layers */
  final def getNavigationLayerLayers(layer_index: Long): Long = {
    if (gdext.classes.TileSet.mb_get_navigation_layer_layers == null) gdext.classes.TileSet.mb_get_navigation_layer_layers = MethodBind.get("TileSet", "get_navigation_layer_layers", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_navigation_layer_layers, livePtr, layer_index)
  }

  /** TileSet.set_navigation_layer_layer_value */
  final def setNavigationLayerLayerValue(layer_index: Long, layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.TileSet.mb_set_navigation_layer_layer_value == null) gdext.classes.TileSet.mb_set_navigation_layer_layer_value = MethodBind.get("TileSet", "set_navigation_layer_layer_value", 1383440665L)
    Ptrcall.callVoid3(gdext.classes.TileSet.mb_set_navigation_layer_layer_value, livePtr, layer_index, layer_number, value)
  }

  /** TileSet.get_navigation_layer_layer_value */
  final def getNavigationLayerLayerValue(layer_index: Long, layer_number: Long): Boolean = {
    if (gdext.classes.TileSet.mb_get_navigation_layer_layer_value == null) gdext.classes.TileSet.mb_get_navigation_layer_layer_value = MethodBind.get("TileSet", "get_navigation_layer_layer_value", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.TileSet.mb_get_navigation_layer_layer_value, livePtr, layer_index, layer_number)
  }

  /** TileSet.get_custom_data_layers_count */
  final def getCustomDataLayersCount(): Long = {
    if (gdext.classes.TileSet.mb_get_custom_data_layers_count == null) gdext.classes.TileSet.mb_get_custom_data_layers_count = MethodBind.get("TileSet", "get_custom_data_layers_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileSet.mb_get_custom_data_layers_count, livePtr)
  }

  /** TileSet.add_custom_data_layer */
  final def addCustomDataLayer(to_position: Long): Unit = {
    if (gdext.classes.TileSet.mb_add_custom_data_layer == null) gdext.classes.TileSet.mb_add_custom_data_layer = MethodBind.get("TileSet", "add_custom_data_layer", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_add_custom_data_layer, livePtr, to_position)
  }

  /** TileSet.move_custom_data_layer */
  final def moveCustomDataLayer(layer_index: Long, to_position: Long): Unit = {
    if (gdext.classes.TileSet.mb_move_custom_data_layer == null) gdext.classes.TileSet.mb_move_custom_data_layer = MethodBind.get("TileSet", "move_custom_data_layer", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_move_custom_data_layer, livePtr, layer_index, to_position)
  }

  /** TileSet.remove_custom_data_layer */
  final def removeCustomDataLayer(layer_index: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_custom_data_layer == null) gdext.classes.TileSet.mb_remove_custom_data_layer = MethodBind.get("TileSet", "remove_custom_data_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_remove_custom_data_layer, livePtr, layer_index)
  }

  /** TileSet.get_custom_data_layer_by_name */
  final def getCustomDataLayerByName(layer_name: String): Long = {
    if (gdext.classes.TileSet.mb_get_custom_data_layer_by_name == null) gdext.classes.TileSet.mb_get_custom_data_layer_by_name = MethodBind.get("TileSet", "get_custom_data_layer_by_name", 1321353865L)
    Ptrcall.call1[String, Long](gdext.classes.TileSet.mb_get_custom_data_layer_by_name, livePtr, layer_name)
  }

  /** TileSet.set_custom_data_layer_name */
  final def setCustomDataLayerName(layer_index: Long, layer_name: String): Unit = {
    if (gdext.classes.TileSet.mb_set_custom_data_layer_name == null) gdext.classes.TileSet.mb_set_custom_data_layer_name = MethodBind.get("TileSet", "set_custom_data_layer_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_custom_data_layer_name, livePtr, layer_index, layer_name)
  }

  /** TileSet.has_custom_data_layer_by_name */
  final def hasCustomDataLayerByName(layer_name: String): Boolean = {
    if (gdext.classes.TileSet.mb_has_custom_data_layer_by_name == null) gdext.classes.TileSet.mb_has_custom_data_layer_by_name = MethodBind.get("TileSet", "has_custom_data_layer_by_name", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.TileSet.mb_has_custom_data_layer_by_name, livePtr, layer_name)
  }

  /** TileSet.get_custom_data_layer_name */
  final def getCustomDataLayerName(layer_index: Long): String = {
    if (gdext.classes.TileSet.mb_get_custom_data_layer_name == null) gdext.classes.TileSet.mb_get_custom_data_layer_name = MethodBind.get("TileSet", "get_custom_data_layer_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TileSet.mb_get_custom_data_layer_name, livePtr, layer_index)
  }

  /** TileSet.set_custom_data_layer_type */
  final def setCustomDataLayerType(layer_index: Long, layer_type: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_custom_data_layer_type == null) gdext.classes.TileSet.mb_set_custom_data_layer_type = MethodBind.get("TileSet", "set_custom_data_layer_type", 3492912874L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_custom_data_layer_type, livePtr, layer_index, layer_type)
  }

  /** TileSet.get_custom_data_layer_type */
  final def getCustomDataLayerType(layer_index: Long): Long = {
    if (gdext.classes.TileSet.mb_get_custom_data_layer_type == null) gdext.classes.TileSet.mb_get_custom_data_layer_type = MethodBind.get("TileSet", "get_custom_data_layer_type", 2990820875L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_custom_data_layer_type, livePtr, layer_index)
  }

  /** TileSet.set_source_level_tile_proxy */
  final def setSourceLevelTileProxy(source_from: Long, source_to: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_source_level_tile_proxy == null) gdext.classes.TileSet.mb_set_source_level_tile_proxy = MethodBind.get("TileSet", "set_source_level_tile_proxy", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_set_source_level_tile_proxy, livePtr, source_from, source_to)
  }

  /** TileSet.get_source_level_tile_proxy */
  final def getSourceLevelTileProxy(source_from: Long): Long = {
    if (gdext.classes.TileSet.mb_get_source_level_tile_proxy == null) gdext.classes.TileSet.mb_get_source_level_tile_proxy = MethodBind.get("TileSet", "get_source_level_tile_proxy", 3744713108L)
    Ptrcall.call1[Long, Long](gdext.classes.TileSet.mb_get_source_level_tile_proxy, livePtr, source_from)
  }

  /** TileSet.has_source_level_tile_proxy */
  final def hasSourceLevelTileProxy(source_from: Long): Boolean = {
    if (gdext.classes.TileSet.mb_has_source_level_tile_proxy == null) gdext.classes.TileSet.mb_has_source_level_tile_proxy = MethodBind.get("TileSet", "has_source_level_tile_proxy", 3067735520L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TileSet.mb_has_source_level_tile_proxy, livePtr, source_from)
  }

  /** TileSet.remove_source_level_tile_proxy */
  final def removeSourceLevelTileProxy(source_from: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_source_level_tile_proxy == null) gdext.classes.TileSet.mb_remove_source_level_tile_proxy = MethodBind.get("TileSet", "remove_source_level_tile_proxy", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileSet.mb_remove_source_level_tile_proxy, livePtr, source_from)
  }

  /** TileSet.set_coords_level_tile_proxy */
  final def setCoordsLevelTileProxy(p_source_from: Long, coords_from: gdext.builtin.Vector2i, source_to: Long, coords_to: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.TileSet.mb_set_coords_level_tile_proxy == null) gdext.classes.TileSet.mb_set_coords_level_tile_proxy = MethodBind.get("TileSet", "set_coords_level_tile_proxy", 1769939278L)
    Ptrcall.callVoid4(gdext.classes.TileSet.mb_set_coords_level_tile_proxy, livePtr, p_source_from, coords_from, source_to, coords_to)
  }

  /** TileSet.has_coords_level_tile_proxy */
  final def hasCoordsLevelTileProxy(source_from: Long, coords_from: gdext.builtin.Vector2i): Boolean = {
    if (gdext.classes.TileSet.mb_has_coords_level_tile_proxy == null) gdext.classes.TileSet.mb_has_coords_level_tile_proxy = MethodBind.get("TileSet", "has_coords_level_tile_proxy", 3957903770L)
    Ptrcall.call2[Long, gdext.builtin.Vector2i, Boolean](gdext.classes.TileSet.mb_has_coords_level_tile_proxy, livePtr, source_from, coords_from)
  }

  /** TileSet.remove_coords_level_tile_proxy */
  final def removeCoordsLevelTileProxy(source_from: Long, coords_from: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.TileSet.mb_remove_coords_level_tile_proxy == null) gdext.classes.TileSet.mb_remove_coords_level_tile_proxy = MethodBind.get("TileSet", "remove_coords_level_tile_proxy", 2311374912L)
    Ptrcall.callVoid2(gdext.classes.TileSet.mb_remove_coords_level_tile_proxy, livePtr, source_from, coords_from)
  }

  /** TileSet.set_alternative_level_tile_proxy */
  final def setAlternativeLevelTileProxy(source_from: Long, coords_from: gdext.builtin.Vector2i, alternative_from: Long, source_to: Long, coords_to: gdext.builtin.Vector2i, alternative_to: Long): Unit = {
    if (gdext.classes.TileSet.mb_set_alternative_level_tile_proxy == null) gdext.classes.TileSet.mb_set_alternative_level_tile_proxy = MethodBind.get("TileSet", "set_alternative_level_tile_proxy", 3862385460L)
    Ptrcall.callVoid6(gdext.classes.TileSet.mb_set_alternative_level_tile_proxy, livePtr, source_from, coords_from, alternative_from, source_to, coords_to, alternative_to)
  }

  /** TileSet.has_alternative_level_tile_proxy */
  final def hasAlternativeLevelTileProxy(source_from: Long, coords_from: gdext.builtin.Vector2i, alternative_from: Long): Boolean = {
    if (gdext.classes.TileSet.mb_has_alternative_level_tile_proxy == null) gdext.classes.TileSet.mb_has_alternative_level_tile_proxy = MethodBind.get("TileSet", "has_alternative_level_tile_proxy", 180086755L)
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Long, Boolean](gdext.classes.TileSet.mb_has_alternative_level_tile_proxy, livePtr, source_from, coords_from, alternative_from)
  }

  /** TileSet.remove_alternative_level_tile_proxy */
  final def removeAlternativeLevelTileProxy(source_from: Long, coords_from: gdext.builtin.Vector2i, alternative_from: Long): Unit = {
    if (gdext.classes.TileSet.mb_remove_alternative_level_tile_proxy == null) gdext.classes.TileSet.mb_remove_alternative_level_tile_proxy = MethodBind.get("TileSet", "remove_alternative_level_tile_proxy", 2328951467L)
    Ptrcall.callVoid3(gdext.classes.TileSet.mb_remove_alternative_level_tile_proxy, livePtr, source_from, coords_from, alternative_from)
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
  final def addPattern(pattern: TileMapPattern, index: Long): Long = {
    if (gdext.classes.TileSet.mb_add_pattern == null) gdext.classes.TileSet.mb_add_pattern = MethodBind.get("TileSet", "add_pattern", 763712015L)
    Ptrcall.call2[GodotObject, Long, Long](gdext.classes.TileSet.mb_add_pattern, livePtr, Wrappers.handle(pattern), index)
  }

  /** TileSet.get_pattern. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPattern(index: Long): TileMapPattern = {
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
}
