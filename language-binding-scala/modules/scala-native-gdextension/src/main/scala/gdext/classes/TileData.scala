package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TileData`, extends `Object`. */
abstract class TileData extends Object {
  override def godotClassName: String = "TileData"

  /** TileData.set_flip_h */
  final def setFlipH(flip_h: Boolean): Unit = {
    if (gdext.classes.TileData.mb_set_flip_h == null) gdext.classes.TileData.mb_set_flip_h = MethodBind.get("TileData", "set_flip_h", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_flip_h, livePtr, flip_h)
  }

  /** TileData.get_flip_h */
  final def getFlipH(): Boolean = {
    if (gdext.classes.TileData.mb_get_flip_h == null) gdext.classes.TileData.mb_get_flip_h = MethodBind.get("TileData", "get_flip_h", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TileData.mb_get_flip_h, livePtr)
  }

  /** TileData.set_flip_v */
  final def setFlipV(flip_v: Boolean): Unit = {
    if (gdext.classes.TileData.mb_set_flip_v == null) gdext.classes.TileData.mb_set_flip_v = MethodBind.get("TileData", "set_flip_v", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_flip_v, livePtr, flip_v)
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
  final def setTextureOrigin(texture_origin: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.TileData.mb_set_texture_origin == null) gdext.classes.TileData.mb_set_texture_origin = MethodBind.get("TileData", "set_texture_origin", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_texture_origin, livePtr, texture_origin)
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
  final def setZIndex(z_index: Long): Unit = {
    if (gdext.classes.TileData.mb_set_z_index == null) gdext.classes.TileData.mb_set_z_index = MethodBind.get("TileData", "set_z_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_z_index, livePtr, z_index)
  }

  /** TileData.get_z_index */
  final def getZIndex(): Long = {
    if (gdext.classes.TileData.mb_get_z_index == null) gdext.classes.TileData.mb_get_z_index = MethodBind.get("TileData", "get_z_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileData.mb_get_z_index, livePtr)
  }

  /** TileData.set_y_sort_origin */
  final def setYSortOrigin(y_sort_origin: Long): Unit = {
    if (gdext.classes.TileData.mb_set_y_sort_origin == null) gdext.classes.TileData.mb_set_y_sort_origin = MethodBind.get("TileData", "set_y_sort_origin", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_y_sort_origin, livePtr, y_sort_origin)
  }

  /** TileData.get_y_sort_origin */
  final def getYSortOrigin(): Long = {
    if (gdext.classes.TileData.mb_get_y_sort_origin == null) gdext.classes.TileData.mb_get_y_sort_origin = MethodBind.get("TileData", "get_y_sort_origin", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TileData.mb_get_y_sort_origin, livePtr)
  }

  /** TileData.set_occluder_polygons_count */
  final def setOccluderPolygonsCount(layer_id: Long, polygons_count: Long): Unit = {
    if (gdext.classes.TileData.mb_set_occluder_polygons_count == null) gdext.classes.TileData.mb_set_occluder_polygons_count = MethodBind.get("TileData", "set_occluder_polygons_count", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_set_occluder_polygons_count, livePtr, layer_id, polygons_count)
  }

  /** TileData.get_occluder_polygons_count */
  final def getOccluderPolygonsCount(layer_id: Long): Long = {
    if (gdext.classes.TileData.mb_get_occluder_polygons_count == null) gdext.classes.TileData.mb_get_occluder_polygons_count = MethodBind.get("TileData", "get_occluder_polygons_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileData.mb_get_occluder_polygons_count, livePtr, layer_id)
  }

  /** TileData.add_occluder_polygon */
  final def addOccluderPolygon(layer_id: Long): Unit = {
    if (gdext.classes.TileData.mb_add_occluder_polygon == null) gdext.classes.TileData.mb_add_occluder_polygon = MethodBind.get("TileData", "add_occluder_polygon", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_add_occluder_polygon, livePtr, layer_id)
  }

  /** TileData.remove_occluder_polygon */
  final def removeOccluderPolygon(layer_id: Long, polygon_index: Long): Unit = {
    if (gdext.classes.TileData.mb_remove_occluder_polygon == null) gdext.classes.TileData.mb_remove_occluder_polygon = MethodBind.get("TileData", "remove_occluder_polygon", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_remove_occluder_polygon, livePtr, layer_id, polygon_index)
  }

  /** TileData.set_occluder_polygon */
  final def setOccluderPolygon(layer_id: Long, polygon_index: Long, polygon: OccluderPolygon2D): Unit = {
    if (gdext.classes.TileData.mb_set_occluder_polygon == null) gdext.classes.TileData.mb_set_occluder_polygon = MethodBind.get("TileData", "set_occluder_polygon", 164249167L)
    Ptrcall.callVoid3(gdext.classes.TileData.mb_set_occluder_polygon, livePtr, layer_id, polygon_index, Wrappers.handle(polygon))
  }

  /** TileData.get_occluder_polygon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getOccluderPolygon(layer_id: Long, polygon_index: Long, flip_h: Boolean, flip_v: Boolean, transpose: Boolean): OccluderPolygon2D = {
    if (gdext.classes.TileData.mb_get_occluder_polygon == null) gdext.classes.TileData.mb_get_occluder_polygon = MethodBind.get("TileData", "get_occluder_polygon", 971166743L)
    Wrappers.owned[OccluderPolygon2D](Ptrcall.call5[Long, Long, Boolean, Boolean, Boolean, Long](gdext.classes.TileData.mb_get_occluder_polygon, livePtr, layer_id, polygon_index, flip_h, flip_v, transpose))
  }

  /** TileData.set_occluder */
  final def setOccluder(layer_id: Long, occluder_polygon: OccluderPolygon2D): Unit = {
    if (gdext.classes.TileData.mb_set_occluder == null) gdext.classes.TileData.mb_set_occluder = MethodBind.get("TileData", "set_occluder", 914399637L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_set_occluder, livePtr, layer_id, Wrappers.handle(occluder_polygon))
  }

  /** TileData.get_occluder. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getOccluder(layer_id: Long, flip_h: Boolean, flip_v: Boolean, transpose: Boolean): OccluderPolygon2D = {
    if (gdext.classes.TileData.mb_get_occluder == null) gdext.classes.TileData.mb_get_occluder = MethodBind.get("TileData", "get_occluder", 2377324099L)
    Wrappers.owned[OccluderPolygon2D](Ptrcall.call4[Long, Boolean, Boolean, Boolean, Long](gdext.classes.TileData.mb_get_occluder, livePtr, layer_id, flip_h, flip_v, transpose))
  }

  /** TileData.set_constant_linear_velocity */
  final def setConstantLinearVelocity(layer_id: Long, velocity: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.TileData.mb_set_constant_linear_velocity == null) gdext.classes.TileData.mb_set_constant_linear_velocity = MethodBind.get("TileData", "set_constant_linear_velocity", 163021252L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_set_constant_linear_velocity, livePtr, layer_id, velocity)
  }

  /** TileData.get_constant_linear_velocity */
  final def getConstantLinearVelocity(layer_id: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.TileData.mb_get_constant_linear_velocity == null) gdext.classes.TileData.mb_get_constant_linear_velocity = MethodBind.get("TileData", "get_constant_linear_velocity", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.TileData.mb_get_constant_linear_velocity, livePtr, layer_id)
  }

  /** TileData.set_constant_angular_velocity */
  final def setConstantAngularVelocity(layer_id: Long, velocity: Double): Unit = {
    if (gdext.classes.TileData.mb_set_constant_angular_velocity == null) gdext.classes.TileData.mb_set_constant_angular_velocity = MethodBind.get("TileData", "set_constant_angular_velocity", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_set_constant_angular_velocity, livePtr, layer_id, velocity)
  }

  /** TileData.get_constant_angular_velocity */
  final def getConstantAngularVelocity(layer_id: Long): Double = {
    if (gdext.classes.TileData.mb_get_constant_angular_velocity == null) gdext.classes.TileData.mb_get_constant_angular_velocity = MethodBind.get("TileData", "get_constant_angular_velocity", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.TileData.mb_get_constant_angular_velocity, livePtr, layer_id)
  }

  /** TileData.set_collision_polygons_count */
  final def setCollisionPolygonsCount(layer_id: Long, polygons_count: Long): Unit = {
    if (gdext.classes.TileData.mb_set_collision_polygons_count == null) gdext.classes.TileData.mb_set_collision_polygons_count = MethodBind.get("TileData", "set_collision_polygons_count", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_set_collision_polygons_count, livePtr, layer_id, polygons_count)
  }

  /** TileData.get_collision_polygons_count */
  final def getCollisionPolygonsCount(layer_id: Long): Long = {
    if (gdext.classes.TileData.mb_get_collision_polygons_count == null) gdext.classes.TileData.mb_get_collision_polygons_count = MethodBind.get("TileData", "get_collision_polygons_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TileData.mb_get_collision_polygons_count, livePtr, layer_id)
  }

  /** TileData.add_collision_polygon */
  final def addCollisionPolygon(layer_id: Long): Unit = {
    if (gdext.classes.TileData.mb_add_collision_polygon == null) gdext.classes.TileData.mb_add_collision_polygon = MethodBind.get("TileData", "add_collision_polygon", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_add_collision_polygon, livePtr, layer_id)
  }

  /** TileData.remove_collision_polygon */
  final def removeCollisionPolygon(layer_id: Long, polygon_index: Long): Unit = {
    if (gdext.classes.TileData.mb_remove_collision_polygon == null) gdext.classes.TileData.mb_remove_collision_polygon = MethodBind.get("TileData", "remove_collision_polygon", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_remove_collision_polygon, livePtr, layer_id, polygon_index)
  }

  /** TileData.set_collision_polygon_one_way */
  final def setCollisionPolygonOneWay(layer_id: Long, polygon_index: Long, one_way: Boolean): Unit = {
    if (gdext.classes.TileData.mb_set_collision_polygon_one_way == null) gdext.classes.TileData.mb_set_collision_polygon_one_way = MethodBind.get("TileData", "set_collision_polygon_one_way", 1383440665L)
    Ptrcall.callVoid3(gdext.classes.TileData.mb_set_collision_polygon_one_way, livePtr, layer_id, polygon_index, one_way)
  }

  /** TileData.is_collision_polygon_one_way */
  final def isCollisionPolygonOneWay(layer_id: Long, polygon_index: Long): Boolean = {
    if (gdext.classes.TileData.mb_is_collision_polygon_one_way == null) gdext.classes.TileData.mb_is_collision_polygon_one_way = MethodBind.get("TileData", "is_collision_polygon_one_way", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.TileData.mb_is_collision_polygon_one_way, livePtr, layer_id, polygon_index)
  }

  /** TileData.set_collision_polygon_one_way_margin */
  final def setCollisionPolygonOneWayMargin(layer_id: Long, polygon_index: Long, one_way_margin: Double): Unit = {
    if (gdext.classes.TileData.mb_set_collision_polygon_one_way_margin == null) gdext.classes.TileData.mb_set_collision_polygon_one_way_margin = MethodBind.get("TileData", "set_collision_polygon_one_way_margin", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.TileData.mb_set_collision_polygon_one_way_margin, livePtr, layer_id, polygon_index, one_way_margin)
  }

  /** TileData.get_collision_polygon_one_way_margin */
  final def getCollisionPolygonOneWayMargin(layer_id: Long, polygon_index: Long): Double = {
    if (gdext.classes.TileData.mb_get_collision_polygon_one_way_margin == null) gdext.classes.TileData.mb_get_collision_polygon_one_way_margin = MethodBind.get("TileData", "get_collision_polygon_one_way_margin", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.TileData.mb_get_collision_polygon_one_way_margin, livePtr, layer_id, polygon_index)
  }

  /** TileData.set_terrain_set */
  final def setTerrainSet(terrain_set: Long): Unit = {
    if (gdext.classes.TileData.mb_set_terrain_set == null) gdext.classes.TileData.mb_set_terrain_set = MethodBind.get("TileData", "set_terrain_set", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TileData.mb_set_terrain_set, livePtr, terrain_set)
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
  final def setTerrainPeeringBit(peering_bit: Long, terrain: Long): Unit = {
    if (gdext.classes.TileData.mb_set_terrain_peering_bit == null) gdext.classes.TileData.mb_set_terrain_peering_bit = MethodBind.get("TileData", "set_terrain_peering_bit", 1084452308L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_set_terrain_peering_bit, livePtr, peering_bit, terrain)
  }

  /** TileData.get_terrain_peering_bit */
  final def getTerrainPeeringBit(peering_bit: Long): Long = {
    if (gdext.classes.TileData.mb_get_terrain_peering_bit == null) gdext.classes.TileData.mb_get_terrain_peering_bit = MethodBind.get("TileData", "get_terrain_peering_bit", 3831796792L)
    Ptrcall.call1[Long, Long](gdext.classes.TileData.mb_get_terrain_peering_bit, livePtr, peering_bit)
  }

  /** TileData.is_valid_terrain_peering_bit */
  final def isValidTerrainPeeringBit(peering_bit: Long): Boolean = {
    if (gdext.classes.TileData.mb_is_valid_terrain_peering_bit == null) gdext.classes.TileData.mb_is_valid_terrain_peering_bit = MethodBind.get("TileData", "is_valid_terrain_peering_bit", 845723972L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TileData.mb_is_valid_terrain_peering_bit, livePtr, peering_bit)
  }

  /** TileData.set_navigation_polygon */
  final def setNavigationPolygon(layer_id: Long, navigation_polygon: NavigationPolygon): Unit = {
    if (gdext.classes.TileData.mb_set_navigation_polygon == null) gdext.classes.TileData.mb_set_navigation_polygon = MethodBind.get("TileData", "set_navigation_polygon", 2224691167L)
    Ptrcall.callVoid2(gdext.classes.TileData.mb_set_navigation_polygon, livePtr, layer_id, Wrappers.handle(navigation_polygon))
  }

  /** TileData.get_navigation_polygon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNavigationPolygon(layer_id: Long, flip_h: Boolean, flip_v: Boolean, transpose: Boolean): NavigationPolygon = {
    if (gdext.classes.TileData.mb_get_navigation_polygon == null) gdext.classes.TileData.mb_get_navigation_polygon = MethodBind.get("TileData", "get_navigation_polygon", 2907127272L)
    Wrappers.owned[NavigationPolygon](Ptrcall.call4[Long, Boolean, Boolean, Boolean, Long](gdext.classes.TileData.mb_get_navigation_polygon, livePtr, layer_id, flip_h, flip_v, transpose))
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
  final def hasCustomData(layer_name: String): Boolean = {
    if (gdext.classes.TileData.mb_has_custom_data == null) gdext.classes.TileData.mb_has_custom_data = MethodBind.get("TileData", "has_custom_data", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.TileData.mb_has_custom_data, livePtr, layer_name)
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
