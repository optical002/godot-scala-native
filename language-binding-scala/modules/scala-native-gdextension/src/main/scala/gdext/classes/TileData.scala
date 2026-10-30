package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TileData`, extends `Object`. */
abstract class TileData extends Object {
  override def godotClassName: String = "TileData"

  /** TileData.set_flip_h */
  final def setFlipH(flipH: Boolean): Unit = {
    if (gdext.classes.TileData.mb_set_flip_h == null) gdext.classes.TileData.mb_set_flip_h = MethodBind.get("TileData", "set_flip_h", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_flip_h, livePtr, flipH)
  }

  /** TileData.get_flip_h */
  final def getFlipH(): Boolean = {
    if (gdext.classes.TileData.mb_get_flip_h == null) gdext.classes.TileData.mb_get_flip_h = MethodBind.get("TileData", "get_flip_h", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TileData.mb_get_flip_h, livePtr)
  }

  /** TileData.set_flip_v */
  final def setFlipV(flipV: Boolean): Unit = {
    if (gdext.classes.TileData.mb_set_flip_v == null) gdext.classes.TileData.mb_set_flip_v = MethodBind.get("TileData", "set_flip_v", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_flip_v, livePtr, flipV)
  }

  /** TileData.get_flip_v */
  final def getFlipV(): Boolean = {
    if (gdext.classes.TileData.mb_get_flip_v == null) gdext.classes.TileData.mb_get_flip_v = MethodBind.get("TileData", "get_flip_v", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TileData.mb_get_flip_v, livePtr)
  }

  /** TileData.set_transpose */
  final def setTranspose(transpose: Boolean): Unit = {
    if (gdext.classes.TileData.mb_set_transpose == null) gdext.classes.TileData.mb_set_transpose = MethodBind.get("TileData", "set_transpose", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_transpose, livePtr, transpose)
  }

  /** TileData.get_transpose */
  final def getTranspose(): Boolean = {
    if (gdext.classes.TileData.mb_get_transpose == null) gdext.classes.TileData.mb_get_transpose = MethodBind.get("TileData", "get_transpose", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TileData.mb_get_transpose, livePtr)
  }

  /** TileData.set_material */
  final def setMaterial(material: Material): Unit = {
    if (gdext.classes.TileData.mb_set_material == null) gdext.classes.TileData.mb_set_material = MethodBind.get("TileData", "set_material", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_material, livePtr, Wrappers.handle(material))
  }

  /** TileData.get_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMaterial(): Material = {
    if (gdext.classes.TileData.mb_get_material == null) gdext.classes.TileData.mb_get_material = MethodBind.get("TileData", "get_material", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.TileData.mb_get_material, livePtr))
  }

  /** TileData.set_texture_origin */
  final def setTextureOrigin(textureOrigin: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.TileData.mb_set_texture_origin == null) gdext.classes.TileData.mb_set_texture_origin = MethodBind.get("TileData", "set_texture_origin", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_texture_origin, livePtr, textureOrigin)
  }

  /** TileData.get_texture_origin */
  final def getTextureOrigin(): gdext.builtin.Vector2i = {
    if (gdext.classes.TileData.mb_get_texture_origin == null) gdext.classes.TileData.mb_get_texture_origin = MethodBind.get("TileData", "get_texture_origin", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.TileData.mb_get_texture_origin, livePtr)
  }

  /** TileData.set_modulate */
  final def setModulate(modulate: gdext.builtin.Color): Unit = {
    if (gdext.classes.TileData.mb_set_modulate == null) gdext.classes.TileData.mb_set_modulate = MethodBind.get("TileData", "set_modulate", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_modulate, livePtr, modulate)
  }

  /** TileData.get_modulate */
  final def getModulate(): gdext.builtin.Color = {
    if (gdext.classes.TileData.mb_get_modulate == null) gdext.classes.TileData.mb_get_modulate = MethodBind.get("TileData", "get_modulate", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.TileData.mb_get_modulate, livePtr)
  }

  /** TileData.set_z_index */
  final def setZIndex(zIndex: Long): Unit = {
    if (gdext.classes.TileData.mb_set_z_index == null) gdext.classes.TileData.mb_set_z_index = MethodBind.get("TileData", "set_z_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_z_index, livePtr, zIndex)
  }

  /** TileData.get_z_index */
  final def getZIndex(): Long = {
    if (gdext.classes.TileData.mb_get_z_index == null) gdext.classes.TileData.mb_get_z_index = MethodBind.get("TileData", "get_z_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileData.mb_get_z_index, livePtr)
  }

  /** TileData.set_y_sort_origin */
  final def setYSortOrigin(ySortOrigin: Long): Unit = {
    if (gdext.classes.TileData.mb_set_y_sort_origin == null) gdext.classes.TileData.mb_set_y_sort_origin = MethodBind.get("TileData", "set_y_sort_origin", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_y_sort_origin, livePtr, ySortOrigin)
  }

  /** TileData.get_y_sort_origin */
  final def getYSortOrigin(): Long = {
    if (gdext.classes.TileData.mb_get_y_sort_origin == null) gdext.classes.TileData.mb_get_y_sort_origin = MethodBind.get("TileData", "get_y_sort_origin", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileData.mb_get_y_sort_origin, livePtr)
  }

  /** TileData.set_occluder_polygons_count */
  final def setOccluderPolygonsCount(layerId: Long, polygonsCount: Long): Unit = {
    if (gdext.classes.TileData.mb_set_occluder_polygons_count == null) gdext.classes.TileData.mb_set_occluder_polygons_count = MethodBind.get("TileData", "set_occluder_polygons_count", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_set_occluder_polygons_count, livePtr, layerId, polygonsCount)
  }

  /** TileData.get_occluder_polygons_count */
  final def getOccluderPolygonsCount(layerId: Long): Long = {
    if (gdext.classes.TileData.mb_get_occluder_polygons_count == null) gdext.classes.TileData.mb_get_occluder_polygons_count = MethodBind.get("TileData", "get_occluder_polygons_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileData.mb_get_occluder_polygons_count, livePtr, layerId)
  }

  /** TileData.add_occluder_polygon */
  final def addOccluderPolygon(layerId: Long): Unit = {
    if (gdext.classes.TileData.mb_add_occluder_polygon == null) gdext.classes.TileData.mb_add_occluder_polygon = MethodBind.get("TileData", "add_occluder_polygon", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_add_occluder_polygon, livePtr, layerId)
  }

  /** TileData.remove_occluder_polygon */
  final def removeOccluderPolygon(layerId: Long, polygonIndex: Long): Unit = {
    if (gdext.classes.TileData.mb_remove_occluder_polygon == null) gdext.classes.TileData.mb_remove_occluder_polygon = MethodBind.get("TileData", "remove_occluder_polygon", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_remove_occluder_polygon, livePtr, layerId, polygonIndex)
  }

  /** TileData.set_occluder_polygon */
  final def setOccluderPolygon(layerId: Long, polygonIndex: Long, polygon: OccluderPolygon2D): Unit = {
    if (gdext.classes.TileData.mb_set_occluder_polygon == null) gdext.classes.TileData.mb_set_occluder_polygon = MethodBind.get("TileData", "set_occluder_polygon", 164249167L)
    Ptrcall.callVoid3(gdext.classes.TileData.mb_set_occluder_polygon, livePtr, layerId, polygonIndex, Wrappers.handle(polygon))
  }

  /** TileData.get_occluder_polygon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getOccluderPolygon(layerId: Long, polygonIndex: Long, flipH: Boolean = false, flipV: Boolean = false, transpose: Boolean = false): OccluderPolygon2D = {
    if (gdext.classes.TileData.mb_get_occluder_polygon == null) gdext.classes.TileData.mb_get_occluder_polygon = MethodBind.get("TileData", "get_occluder_polygon", 971166743L)
    Wrappers.owned[OccluderPolygon2D](Ptrcall.call5[Long, Long, Boolean, Boolean, Boolean, Long](gdext.classes.TileData.mb_get_occluder_polygon, livePtr, layerId, polygonIndex, flipH, flipV, transpose))
  }

  /** TileData.set_occluder */
  final def setOccluder(layerId: Long, occluderPolygon: OccluderPolygon2D): Unit = {
    if (gdext.classes.TileData.mb_set_occluder == null) gdext.classes.TileData.mb_set_occluder = MethodBind.get("TileData", "set_occluder", 914399637L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_set_occluder, livePtr, layerId, Wrappers.handle(occluderPolygon))
  }

  /** TileData.get_occluder. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getOccluder(layerId: Long, flipH: Boolean = false, flipV: Boolean = false, transpose: Boolean = false): OccluderPolygon2D = {
    if (gdext.classes.TileData.mb_get_occluder == null) gdext.classes.TileData.mb_get_occluder = MethodBind.get("TileData", "get_occluder", 2377324099L)
    Wrappers.owned[OccluderPolygon2D](Ptrcall.call4[Long, Boolean, Boolean, Boolean, Long](gdext.classes.TileData.mb_get_occluder, livePtr, layerId, flipH, flipV, transpose))
  }

  /** TileData.set_constant_linear_velocity */
  final def setConstantLinearVelocity(layerId: Long, velocity: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.TileData.mb_set_constant_linear_velocity == null) gdext.classes.TileData.mb_set_constant_linear_velocity = MethodBind.get("TileData", "set_constant_linear_velocity", 163021252L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_set_constant_linear_velocity, livePtr, layerId, velocity)
  }

  /** TileData.get_constant_linear_velocity */
  final def getConstantLinearVelocity(layerId: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.TileData.mb_get_constant_linear_velocity == null) gdext.classes.TileData.mb_get_constant_linear_velocity = MethodBind.get("TileData", "get_constant_linear_velocity", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.TileData.mb_get_constant_linear_velocity, livePtr, layerId)
  }

  /** TileData.set_constant_angular_velocity */
  final def setConstantAngularVelocity(layerId: Long, velocity: Double): Unit = {
    if (gdext.classes.TileData.mb_set_constant_angular_velocity == null) gdext.classes.TileData.mb_set_constant_angular_velocity = MethodBind.get("TileData", "set_constant_angular_velocity", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_set_constant_angular_velocity, livePtr, layerId, velocity)
  }

  /** TileData.get_constant_angular_velocity */
  final def getConstantAngularVelocity(layerId: Long): Double = {
    if (gdext.classes.TileData.mb_get_constant_angular_velocity == null) gdext.classes.TileData.mb_get_constant_angular_velocity = MethodBind.get("TileData", "get_constant_angular_velocity", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.TileData.mb_get_constant_angular_velocity, livePtr, layerId)
  }

  /** TileData.set_collision_polygons_count */
  final def setCollisionPolygonsCount(layerId: Long, polygonsCount: Long): Unit = {
    if (gdext.classes.TileData.mb_set_collision_polygons_count == null) gdext.classes.TileData.mb_set_collision_polygons_count = MethodBind.get("TileData", "set_collision_polygons_count", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_set_collision_polygons_count, livePtr, layerId, polygonsCount)
  }

  /** TileData.get_collision_polygons_count */
  final def getCollisionPolygonsCount(layerId: Long): Long = {
    if (gdext.classes.TileData.mb_get_collision_polygons_count == null) gdext.classes.TileData.mb_get_collision_polygons_count = MethodBind.get("TileData", "get_collision_polygons_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileData.mb_get_collision_polygons_count, livePtr, layerId)
  }

  /** TileData.add_collision_polygon */
  final def addCollisionPolygon(layerId: Long): Unit = {
    if (gdext.classes.TileData.mb_add_collision_polygon == null) gdext.classes.TileData.mb_add_collision_polygon = MethodBind.get("TileData", "add_collision_polygon", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_add_collision_polygon, livePtr, layerId)
  }

  /** TileData.remove_collision_polygon */
  final def removeCollisionPolygon(layerId: Long, polygonIndex: Long): Unit = {
    if (gdext.classes.TileData.mb_remove_collision_polygon == null) gdext.classes.TileData.mb_remove_collision_polygon = MethodBind.get("TileData", "remove_collision_polygon", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_remove_collision_polygon, livePtr, layerId, polygonIndex)
  }

  /** TileData.set_collision_polygon_one_way */
  final def setCollisionPolygonOneWay(layerId: Long, polygonIndex: Long, oneWay: Boolean): Unit = {
    if (gdext.classes.TileData.mb_set_collision_polygon_one_way == null) gdext.classes.TileData.mb_set_collision_polygon_one_way = MethodBind.get("TileData", "set_collision_polygon_one_way", 1383440665L)
    Ptrcall.callVoid3(gdext.classes.TileData.mb_set_collision_polygon_one_way, livePtr, layerId, polygonIndex, oneWay)
  }

  /** TileData.is_collision_polygon_one_way */
  final def isCollisionPolygonOneWay(layerId: Long, polygonIndex: Long): Boolean = {
    if (gdext.classes.TileData.mb_is_collision_polygon_one_way == null) gdext.classes.TileData.mb_is_collision_polygon_one_way = MethodBind.get("TileData", "is_collision_polygon_one_way", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.TileData.mb_is_collision_polygon_one_way, livePtr, layerId, polygonIndex)
  }

  /** TileData.set_collision_polygon_one_way_margin */
  final def setCollisionPolygonOneWayMargin(layerId: Long, polygonIndex: Long, oneWayMargin: Double): Unit = {
    if (gdext.classes.TileData.mb_set_collision_polygon_one_way_margin == null) gdext.classes.TileData.mb_set_collision_polygon_one_way_margin = MethodBind.get("TileData", "set_collision_polygon_one_way_margin", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.TileData.mb_set_collision_polygon_one_way_margin, livePtr, layerId, polygonIndex, oneWayMargin)
  }

  /** TileData.get_collision_polygon_one_way_margin */
  final def getCollisionPolygonOneWayMargin(layerId: Long, polygonIndex: Long): Double = {
    if (gdext.classes.TileData.mb_get_collision_polygon_one_way_margin == null) gdext.classes.TileData.mb_get_collision_polygon_one_way_margin = MethodBind.get("TileData", "get_collision_polygon_one_way_margin", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.TileData.mb_get_collision_polygon_one_way_margin, livePtr, layerId, polygonIndex)
  }

  /** TileData.set_terrain_set */
  final def setTerrainSet(terrainSet: Long): Unit = {
    if (gdext.classes.TileData.mb_set_terrain_set == null) gdext.classes.TileData.mb_set_terrain_set = MethodBind.get("TileData", "set_terrain_set", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_terrain_set, livePtr, terrainSet)
  }

  /** TileData.get_terrain_set */
  final def getTerrainSet(): Long = {
    if (gdext.classes.TileData.mb_get_terrain_set == null) gdext.classes.TileData.mb_get_terrain_set = MethodBind.get("TileData", "get_terrain_set", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileData.mb_get_terrain_set, livePtr)
  }

  /** TileData.set_terrain */
  final def setTerrain(terrain: Long): Unit = {
    if (gdext.classes.TileData.mb_set_terrain == null) gdext.classes.TileData.mb_set_terrain = MethodBind.get("TileData", "set_terrain", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_terrain, livePtr, terrain)
  }

  /** TileData.get_terrain */
  final def getTerrain(): Long = {
    if (gdext.classes.TileData.mb_get_terrain == null) gdext.classes.TileData.mb_get_terrain = MethodBind.get("TileData", "get_terrain", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileData.mb_get_terrain, livePtr)
  }

  /** TileData.set_terrain_peering_bit */
  final def setTerrainPeeringBit(peeringBit: gdext.classes.TileSet.CellNeighbor, terrain: Long): Unit = {
    if (gdext.classes.TileData.mb_set_terrain_peering_bit == null) gdext.classes.TileData.mb_set_terrain_peering_bit = MethodBind.get("TileData", "set_terrain_peering_bit", 1084452308L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_set_terrain_peering_bit, livePtr, peeringBit, terrain)
  }

  /** TileData.get_terrain_peering_bit */
  final def getTerrainPeeringBit(peeringBit: gdext.classes.TileSet.CellNeighbor): Long = {
    if (gdext.classes.TileData.mb_get_terrain_peering_bit == null) gdext.classes.TileData.mb_get_terrain_peering_bit = MethodBind.get("TileData", "get_terrain_peering_bit", 3831796792L)
    Ptrcall.call1[Long, Long](gdext.classes.TileData.mb_get_terrain_peering_bit, livePtr, peeringBit)
  }

  /** TileData.is_valid_terrain_peering_bit */
  final def isValidTerrainPeeringBit(peeringBit: gdext.classes.TileSet.CellNeighbor): Boolean = {
    if (gdext.classes.TileData.mb_is_valid_terrain_peering_bit == null) gdext.classes.TileData.mb_is_valid_terrain_peering_bit = MethodBind.get("TileData", "is_valid_terrain_peering_bit", 845723972L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TileData.mb_is_valid_terrain_peering_bit, livePtr, peeringBit)
  }

  /** TileData.set_navigation_polygon */
  final def setNavigationPolygon(layerId: Long, navigationPolygon: NavigationPolygon): Unit = {
    if (gdext.classes.TileData.mb_set_navigation_polygon == null) gdext.classes.TileData.mb_set_navigation_polygon = MethodBind.get("TileData", "set_navigation_polygon", 2224691167L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_set_navigation_polygon, livePtr, layerId, Wrappers.handle(navigationPolygon))
  }

  /** TileData.get_navigation_polygon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNavigationPolygon(layerId: Long, flipH: Boolean = false, flipV: Boolean = false, transpose: Boolean = false): NavigationPolygon = {
    if (gdext.classes.TileData.mb_get_navigation_polygon == null) gdext.classes.TileData.mb_get_navigation_polygon = MethodBind.get("TileData", "get_navigation_polygon", 2907127272L)
    Wrappers.owned[NavigationPolygon](Ptrcall.call4[Long, Boolean, Boolean, Boolean, Long](gdext.classes.TileData.mb_get_navigation_polygon, livePtr, layerId, flipH, flipV, transpose))
  }

  /** TileData.set_probability */
  final def setProbability(probability: Double): Unit = {
    if (gdext.classes.TileData.mb_set_probability == null) gdext.classes.TileData.mb_set_probability = MethodBind.get("TileData", "set_probability", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_probability, livePtr, probability)
  }

  /** TileData.get_probability */
  final def getProbability(): Double = {
    if (gdext.classes.TileData.mb_get_probability == null) gdext.classes.TileData.mb_get_probability = MethodBind.get("TileData", "get_probability", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TileData.mb_get_probability, livePtr)
  }

  /** TileData.has_custom_data */
  final def hasCustomData(layerName: String): Boolean = {
    if (gdext.classes.TileData.mb_has_custom_data == null) gdext.classes.TileData.mb_has_custom_data = MethodBind.get("TileData", "has_custom_data", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.TileData.mb_has_custom_data, livePtr, layerName)
  }

}

object TileData {
  private[classes] var mb_set_flip_h: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flip_h: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flip_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flip_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transpose: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transpose: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_origin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_origin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_z_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_z_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_y_sort_origin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_y_sort_origin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_occluder_polygons_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_occluder_polygons_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_occluder_polygon: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_occluder_polygon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_occluder_polygon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_occluder_polygon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_occluder: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_occluder: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_constant_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_constant_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_polygons_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_polygons_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_collision_polygon: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_collision_polygon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_polygon_one_way: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collision_polygon_one_way: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_polygon_one_way_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_polygon_one_way_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_terrain_set: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_terrain_set: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_terrain: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_terrain: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_terrain_peering_bit: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_terrain_peering_bit: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_valid_terrain_peering_bit: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_navigation_polygon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_navigation_polygon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_probability: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_probability: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_custom_data: GDExtensionMethodBindPtr = null
}
