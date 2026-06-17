package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `TileSet`, extends `Resource`. */
abstract class TileSet extends Resource {

  /** TileSet.get_next_source_id */
  final def getNextSourceId(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileSet", "get_next_source_id", 3905245786L), hostObject.objectPtr)

  /** TileSet.add_source */
  final def addSource(source: TileSetSource, atlas_source_id_override: Long): Long =
    Ptrcall.call2[GodotObject, Long, Long](MethodBind.get("TileSet", "add_source", 1059186179L), hostObject.objectPtr, source.hostObject, atlas_source_id_override)

  /** TileSet.remove_source */
  final def removeSource(source_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "remove_source", 1286410249L), hostObject.objectPtr, source_id)

  /** TileSet.set_source_id */
  final def setSourceId(source_id: Long, new_source_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "set_source_id", 3937882851L), hostObject.objectPtr, source_id, new_source_id)

  /** TileSet.get_source_count */
  final def getSourceCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileSet", "get_source_count", 3905245786L), hostObject.objectPtr)

  /** TileSet.get_source_id */
  final def getSourceId(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TileSet", "get_source_id", 923996154L), hostObject.objectPtr, index)

  /** TileSet.has_source */
  final def hasSource(source_id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TileSet", "has_source", 1116898809L), hostObject.objectPtr, source_id)

  /** TileSet.get_source */
  final def getSource(source_id: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TileSet", "get_source", 1763540252L), hostObject.objectPtr, source_id)

  /** TileSet.set_tile_shape */
  final def setTileShape(shape: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "set_tile_shape", 2131427112L), hostObject.objectPtr, shape)

  /** TileSet.get_tile_shape */
  final def getTileShape(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileSet", "get_tile_shape", 716918169L), hostObject.objectPtr)

  /** TileSet.set_tile_layout */
  final def setTileLayout(layout: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "set_tile_layout", 1071216679L), hostObject.objectPtr, layout)

  /** TileSet.get_tile_layout */
  final def getTileLayout(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileSet", "get_tile_layout", 194628839L), hostObject.objectPtr)

  /** TileSet.set_tile_offset_axis */
  final def setTileOffsetAxis(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "set_tile_offset_axis", 3300198521L), hostObject.objectPtr, alignment)

  /** TileSet.get_tile_offset_axis */
  final def getTileOffsetAxis(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileSet", "get_tile_offset_axis", 762494114L), hostObject.objectPtr)

  /** TileSet.set_tile_size */
  final def setTileSize(size: io.github.optical002.godot.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "set_tile_size", 1130785943L), hostObject.objectPtr, size)

  /** TileSet.get_tile_size */
  final def getTileSize(): io.github.optical002.godot.builtin.Vector2i =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2i](MethodBind.get("TileSet", "get_tile_size", 3690982128L), hostObject.objectPtr)

  /** TileSet.set_uv_clipping */
  final def setUvClipping(uv_clipping: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "set_uv_clipping", 2586408642L), hostObject.objectPtr, uv_clipping)

  /** TileSet.is_uv_clipping */
  final def isUvClipping(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TileSet", "is_uv_clipping", 36873697L), hostObject.objectPtr)

  /** TileSet.get_occlusion_layers_count */
  final def getOcclusionLayersCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileSet", "get_occlusion_layers_count", 3905245786L), hostObject.objectPtr)

  /** TileSet.add_occlusion_layer */
  final def addOcclusionLayer(to_position: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "add_occlusion_layer", 1025054187L), hostObject.objectPtr, to_position)

  /** TileSet.move_occlusion_layer */
  final def moveOcclusionLayer(layer_index: Long, to_position: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "move_occlusion_layer", 3937882851L), hostObject.objectPtr, layer_index, to_position)

  /** TileSet.remove_occlusion_layer */
  final def removeOcclusionLayer(layer_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "remove_occlusion_layer", 1286410249L), hostObject.objectPtr, layer_index)

  /** TileSet.set_occlusion_layer_light_mask */
  final def setOcclusionLayerLightMask(layer_index: Long, light_mask: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "set_occlusion_layer_light_mask", 3937882851L), hostObject.objectPtr, layer_index, light_mask)

  /** TileSet.get_occlusion_layer_light_mask */
  final def getOcclusionLayerLightMask(layer_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TileSet", "get_occlusion_layer_light_mask", 923996154L), hostObject.objectPtr, layer_index)

  /** TileSet.set_occlusion_layer_sdf_collision */
  final def setOcclusionLayerSdfCollision(layer_index: Long, sdf_collision: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "set_occlusion_layer_sdf_collision", 300928843L), hostObject.objectPtr, layer_index, sdf_collision)

  /** TileSet.get_occlusion_layer_sdf_collision */
  final def getOcclusionLayerSdfCollision(layer_index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TileSet", "get_occlusion_layer_sdf_collision", 1116898809L), hostObject.objectPtr, layer_index)

  /** TileSet.get_physics_layers_count */
  final def getPhysicsLayersCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileSet", "get_physics_layers_count", 3905245786L), hostObject.objectPtr)

  /** TileSet.add_physics_layer */
  final def addPhysicsLayer(to_position: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "add_physics_layer", 1025054187L), hostObject.objectPtr, to_position)

  /** TileSet.move_physics_layer */
  final def movePhysicsLayer(layer_index: Long, to_position: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "move_physics_layer", 3937882851L), hostObject.objectPtr, layer_index, to_position)

  /** TileSet.remove_physics_layer */
  final def removePhysicsLayer(layer_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "remove_physics_layer", 1286410249L), hostObject.objectPtr, layer_index)

  /** TileSet.set_physics_layer_collision_layer */
  final def setPhysicsLayerCollisionLayer(layer_index: Long, layer: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "set_physics_layer_collision_layer", 3937882851L), hostObject.objectPtr, layer_index, layer)

  /** TileSet.get_physics_layer_collision_layer */
  final def getPhysicsLayerCollisionLayer(layer_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TileSet", "get_physics_layer_collision_layer", 923996154L), hostObject.objectPtr, layer_index)

  /** TileSet.set_physics_layer_collision_mask */
  final def setPhysicsLayerCollisionMask(layer_index: Long, mask: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "set_physics_layer_collision_mask", 3937882851L), hostObject.objectPtr, layer_index, mask)

  /** TileSet.get_physics_layer_collision_mask */
  final def getPhysicsLayerCollisionMask(layer_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TileSet", "get_physics_layer_collision_mask", 923996154L), hostObject.objectPtr, layer_index)

  /** TileSet.set_physics_layer_collision_priority */
  final def setPhysicsLayerCollisionPriority(layer_index: Long, priority: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "set_physics_layer_collision_priority", 1602489585L), hostObject.objectPtr, layer_index, priority)

  /** TileSet.get_physics_layer_collision_priority */
  final def getPhysicsLayerCollisionPriority(layer_index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("TileSet", "get_physics_layer_collision_priority", 2339986948L), hostObject.objectPtr, layer_index)

  /** TileSet.set_physics_layer_physics_material */
  final def setPhysicsLayerPhysicsMaterial(layer_index: Long, physics_material: PhysicsMaterial): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "set_physics_layer_physics_material", 1018687357L), hostObject.objectPtr, layer_index, physics_material.hostObject)

  /** TileSet.get_physics_layer_physics_material */
  final def getPhysicsLayerPhysicsMaterial(layer_index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TileSet", "get_physics_layer_physics_material", 788318639L), hostObject.objectPtr, layer_index)

  /** TileSet.get_terrain_sets_count */
  final def getTerrainSetsCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileSet", "get_terrain_sets_count", 3905245786L), hostObject.objectPtr)

  /** TileSet.add_terrain_set */
  final def addTerrainSet(to_position: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "add_terrain_set", 1025054187L), hostObject.objectPtr, to_position)

  /** TileSet.move_terrain_set */
  final def moveTerrainSet(terrain_set: Long, to_position: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "move_terrain_set", 3937882851L), hostObject.objectPtr, terrain_set, to_position)

  /** TileSet.remove_terrain_set */
  final def removeTerrainSet(terrain_set: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "remove_terrain_set", 1286410249L), hostObject.objectPtr, terrain_set)

  /** TileSet.set_terrain_set_mode */
  final def setTerrainSetMode(terrain_set: Long, mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "set_terrain_set_mode", 3943003916L), hostObject.objectPtr, terrain_set, mode)

  /** TileSet.get_terrain_set_mode */
  final def getTerrainSetMode(terrain_set: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TileSet", "get_terrain_set_mode", 2084469411L), hostObject.objectPtr, terrain_set)

  /** TileSet.get_terrains_count */
  final def getTerrainsCount(terrain_set: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TileSet", "get_terrains_count", 923996154L), hostObject.objectPtr, terrain_set)

  /** TileSet.add_terrain */
  final def addTerrain(terrain_set: Long, to_position: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "add_terrain", 1230568737L), hostObject.objectPtr, terrain_set, to_position)

  /** TileSet.move_terrain */
  final def moveTerrain(terrain_set: Long, terrain_index: Long, to_position: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("TileSet", "move_terrain", 1649997291L), hostObject.objectPtr, terrain_set, terrain_index, to_position)

  /** TileSet.remove_terrain */
  final def removeTerrain(terrain_set: Long, terrain_index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "remove_terrain", 3937882851L), hostObject.objectPtr, terrain_set, terrain_index)

  /** TileSet.set_terrain_name */
  final def setTerrainName(terrain_set: Long, terrain_index: Long, name: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("TileSet", "set_terrain_name", 2285447957L), hostObject.objectPtr, terrain_set, terrain_index, name)

  /** TileSet.get_terrain_name */
  final def getTerrainName(terrain_set: Long, terrain_index: Long): String =
    Ptrcall.call2[Long, Long, String](MethodBind.get("TileSet", "get_terrain_name", 1391810591L), hostObject.objectPtr, terrain_set, terrain_index)

  /** TileSet.set_terrain_color */
  final def setTerrainColor(terrain_set: Long, terrain_index: Long, color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid3(MethodBind.get("TileSet", "set_terrain_color", 3733378741L), hostObject.objectPtr, terrain_set, terrain_index, color)

  /** TileSet.get_terrain_color */
  final def getTerrainColor(terrain_set: Long, terrain_index: Long): io.github.optical002.godot.builtin.Color =
    Ptrcall.call2[Long, Long, io.github.optical002.godot.builtin.Color](MethodBind.get("TileSet", "get_terrain_color", 2165839948L), hostObject.objectPtr, terrain_set, terrain_index)

  /** TileSet.get_navigation_layers_count */
  final def getNavigationLayersCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileSet", "get_navigation_layers_count", 3905245786L), hostObject.objectPtr)

  /** TileSet.add_navigation_layer */
  final def addNavigationLayer(to_position: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "add_navigation_layer", 1025054187L), hostObject.objectPtr, to_position)

  /** TileSet.move_navigation_layer */
  final def moveNavigationLayer(layer_index: Long, to_position: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "move_navigation_layer", 3937882851L), hostObject.objectPtr, layer_index, to_position)

  /** TileSet.remove_navigation_layer */
  final def removeNavigationLayer(layer_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "remove_navigation_layer", 1286410249L), hostObject.objectPtr, layer_index)

  /** TileSet.set_navigation_layer_layers */
  final def setNavigationLayerLayers(layer_index: Long, layers: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "set_navigation_layer_layers", 3937882851L), hostObject.objectPtr, layer_index, layers)

  /** TileSet.get_navigation_layer_layers */
  final def getNavigationLayerLayers(layer_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TileSet", "get_navigation_layer_layers", 923996154L), hostObject.objectPtr, layer_index)

  /** TileSet.set_navigation_layer_layer_value */
  final def setNavigationLayerLayerValue(layer_index: Long, layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("TileSet", "set_navigation_layer_layer_value", 1383440665L), hostObject.objectPtr, layer_index, layer_number, value)

  /** TileSet.get_navigation_layer_layer_value */
  final def getNavigationLayerLayerValue(layer_index: Long, layer_number: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("TileSet", "get_navigation_layer_layer_value", 2522259332L), hostObject.objectPtr, layer_index, layer_number)

  /** TileSet.get_custom_data_layers_count */
  final def getCustomDataLayersCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileSet", "get_custom_data_layers_count", 3905245786L), hostObject.objectPtr)

  /** TileSet.add_custom_data_layer */
  final def addCustomDataLayer(to_position: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "add_custom_data_layer", 1025054187L), hostObject.objectPtr, to_position)

  /** TileSet.move_custom_data_layer */
  final def moveCustomDataLayer(layer_index: Long, to_position: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "move_custom_data_layer", 3937882851L), hostObject.objectPtr, layer_index, to_position)

  /** TileSet.remove_custom_data_layer */
  final def removeCustomDataLayer(layer_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "remove_custom_data_layer", 1286410249L), hostObject.objectPtr, layer_index)

  /** TileSet.get_custom_data_layer_by_name */
  final def getCustomDataLayerByName(layer_name: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("TileSet", "get_custom_data_layer_by_name", 1321353865L), hostObject.objectPtr, layer_name)

  /** TileSet.set_custom_data_layer_name */
  final def setCustomDataLayerName(layer_index: Long, layer_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "set_custom_data_layer_name", 501894301L), hostObject.objectPtr, layer_index, layer_name)

  /** TileSet.has_custom_data_layer_by_name */
  final def hasCustomDataLayerByName(layer_name: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("TileSet", "has_custom_data_layer_by_name", 3927539163L), hostObject.objectPtr, layer_name)

  /** TileSet.get_custom_data_layer_name */
  final def getCustomDataLayerName(layer_index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TileSet", "get_custom_data_layer_name", 844755477L), hostObject.objectPtr, layer_index)

  /** TileSet.set_custom_data_layer_type */
  final def setCustomDataLayerType(layer_index: Long, layer_type: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "set_custom_data_layer_type", 3492912874L), hostObject.objectPtr, layer_index, layer_type)

  /** TileSet.get_custom_data_layer_type */
  final def getCustomDataLayerType(layer_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TileSet", "get_custom_data_layer_type", 2990820875L), hostObject.objectPtr, layer_index)

  /** TileSet.set_source_level_tile_proxy */
  final def setSourceLevelTileProxy(source_from: Long, source_to: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "set_source_level_tile_proxy", 3937882851L), hostObject.objectPtr, source_from, source_to)

  /** TileSet.get_source_level_tile_proxy */
  final def getSourceLevelTileProxy(source_from: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TileSet", "get_source_level_tile_proxy", 3744713108L), hostObject.objectPtr, source_from)

  /** TileSet.has_source_level_tile_proxy */
  final def hasSourceLevelTileProxy(source_from: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TileSet", "has_source_level_tile_proxy", 3067735520L), hostObject.objectPtr, source_from)

  /** TileSet.remove_source_level_tile_proxy */
  final def removeSourceLevelTileProxy(source_from: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "remove_source_level_tile_proxy", 1286410249L), hostObject.objectPtr, source_from)

  /** TileSet.set_coords_level_tile_proxy */
  final def setCoordsLevelTileProxy(p_source_from: Long, coords_from: io.github.optical002.godot.builtin.Vector2i, source_to: Long, coords_to: io.github.optical002.godot.builtin.Vector2i): Unit =
    Ptrcall.callVoid4(MethodBind.get("TileSet", "set_coords_level_tile_proxy", 1769939278L), hostObject.objectPtr, p_source_from, coords_from, source_to, coords_to)

  /** TileSet.has_coords_level_tile_proxy */
  final def hasCoordsLevelTileProxy(source_from: Long, coords_from: io.github.optical002.godot.builtin.Vector2i): Boolean =
    Ptrcall.call2[Long, io.github.optical002.godot.builtin.Vector2i, Boolean](MethodBind.get("TileSet", "has_coords_level_tile_proxy", 3957903770L), hostObject.objectPtr, source_from, coords_from)

  /** TileSet.remove_coords_level_tile_proxy */
  final def removeCoordsLevelTileProxy(source_from: Long, coords_from: io.github.optical002.godot.builtin.Vector2i): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileSet", "remove_coords_level_tile_proxy", 2311374912L), hostObject.objectPtr, source_from, coords_from)

  /** TileSet.set_alternative_level_tile_proxy */
  final def setAlternativeLevelTileProxy(source_from: Long, coords_from: io.github.optical002.godot.builtin.Vector2i, alternative_from: Long, source_to: Long, coords_to: io.github.optical002.godot.builtin.Vector2i, alternative_to: Long): Unit =
    Ptrcall.callVoid6(MethodBind.get("TileSet", "set_alternative_level_tile_proxy", 3862385460L), hostObject.objectPtr, source_from, coords_from, alternative_from, source_to, coords_to, alternative_to)

  /** TileSet.has_alternative_level_tile_proxy */
  final def hasAlternativeLevelTileProxy(source_from: Long, coords_from: io.github.optical002.godot.builtin.Vector2i, alternative_from: Long): Boolean =
    Ptrcall.call3[Long, io.github.optical002.godot.builtin.Vector2i, Long, Boolean](MethodBind.get("TileSet", "has_alternative_level_tile_proxy", 180086755L), hostObject.objectPtr, source_from, coords_from, alternative_from)

  /** TileSet.remove_alternative_level_tile_proxy */
  final def removeAlternativeLevelTileProxy(source_from: Long, coords_from: io.github.optical002.godot.builtin.Vector2i, alternative_from: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("TileSet", "remove_alternative_level_tile_proxy", 2328951467L), hostObject.objectPtr, source_from, coords_from, alternative_from)

  /** TileSet.cleanup_invalid_tile_proxies */
  final def cleanupInvalidTileProxies(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TileSet", "cleanup_invalid_tile_proxies", 3218959716L), hostObject.objectPtr)

  /** TileSet.clear_tile_proxies */
  final def clearTileProxies(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TileSet", "clear_tile_proxies", 3218959716L), hostObject.objectPtr)

  /** TileSet.add_pattern */
  final def addPattern(pattern: TileMapPattern, index: Long): Long =
    Ptrcall.call2[GodotObject, Long, Long](MethodBind.get("TileSet", "add_pattern", 763712015L), hostObject.objectPtr, pattern.hostObject, index)

  /** TileSet.get_pattern */
  final def getPattern(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TileSet", "get_pattern", 4207737510L), hostObject.objectPtr, index)

  /** TileSet.remove_pattern */
  final def removePattern(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileSet", "remove_pattern", 1286410249L), hostObject.objectPtr, index)

  /** TileSet.get_patterns_count */
  final def getPatternsCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileSet", "get_patterns_count", 2455072627L), hostObject.objectPtr)

}

object TileSet {
  /** Class metadata for Gd[TileSet] lifetime management and casting. */
  given GodotClass[TileSet] with {
    def className = "TileSet"
    def isRefCounted = true
    def wrap(o: GodotObject): TileSet = new TileSet {}.withHost(o.objectPtr)
    def unwrap(t: TileSet): GodotObject = t.hostObject
  }
}
