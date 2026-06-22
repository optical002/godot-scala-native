package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TileData`, extends `Object`. */
abstract class TileData extends Object {

  /** TileData.set_flip_h */
  final def setFlipH(flip_h: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileData", "set_flip_h", 2586408642L), hostObject.objectPtr, flip_h)

  /** TileData.get_flip_h */
  final def getFlipH(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TileData", "get_flip_h", 36873697L), hostObject.objectPtr)

  /** TileData.set_flip_v */
  final def setFlipV(flip_v: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileData", "set_flip_v", 2586408642L), hostObject.objectPtr, flip_v)

  /** TileData.get_flip_v */
  final def getFlipV(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TileData", "get_flip_v", 36873697L), hostObject.objectPtr)

  /** TileData.set_transpose */
  final def setTranspose(transpose: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileData", "set_transpose", 2586408642L), hostObject.objectPtr, transpose)

  /** TileData.get_transpose */
  final def getTranspose(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TileData", "get_transpose", 36873697L), hostObject.objectPtr)

  /** TileData.set_material */
  final def setMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileData", "set_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** TileData.get_material */
  final def getMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TileData", "get_material", 5934680L), hostObject.objectPtr)

  /** TileData.set_texture_origin */
  final def setTextureOrigin(texture_origin: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileData", "set_texture_origin", 1130785943L), hostObject.objectPtr, texture_origin)

  /** TileData.get_texture_origin */
  final def getTextureOrigin(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("TileData", "get_texture_origin", 3690982128L), hostObject.objectPtr)

  /** TileData.set_modulate */
  final def setModulate(modulate: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileData", "set_modulate", 2920490490L), hostObject.objectPtr, modulate)

  /** TileData.get_modulate */
  final def getModulate(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("TileData", "get_modulate", 3444240500L), hostObject.objectPtr)

  /** TileData.set_z_index */
  final def setZIndex(z_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileData", "set_z_index", 1286410249L), hostObject.objectPtr, z_index)

  /** TileData.get_z_index */
  final def getZIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileData", "get_z_index", 3905245786L), hostObject.objectPtr)

  /** TileData.set_y_sort_origin */
  final def setYSortOrigin(y_sort_origin: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileData", "set_y_sort_origin", 1286410249L), hostObject.objectPtr, y_sort_origin)

  /** TileData.get_y_sort_origin */
  final def getYSortOrigin(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileData", "get_y_sort_origin", 3905245786L), hostObject.objectPtr)

  /** TileData.set_occluder_polygons_count */
  final def setOccluderPolygonsCount(layer_id: Long, polygons_count: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileData", "set_occluder_polygons_count", 3937882851L), hostObject.objectPtr, layer_id, polygons_count)

  /** TileData.get_occluder_polygons_count */
  final def getOccluderPolygonsCount(layer_id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TileData", "get_occluder_polygons_count", 923996154L), hostObject.objectPtr, layer_id)

  /** TileData.add_occluder_polygon */
  final def addOccluderPolygon(layer_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileData", "add_occluder_polygon", 1286410249L), hostObject.objectPtr, layer_id)

  /** TileData.remove_occluder_polygon */
  final def removeOccluderPolygon(layer_id: Long, polygon_index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileData", "remove_occluder_polygon", 3937882851L), hostObject.objectPtr, layer_id, polygon_index)

  /** TileData.set_occluder_polygon */
  final def setOccluderPolygon(layer_id: Long, polygon_index: Long, polygon: OccluderPolygon2D): Unit =
    Ptrcall.callVoid3(MethodBind.get("TileData", "set_occluder_polygon", 164249167L), hostObject.objectPtr, layer_id, polygon_index, polygon.hostObject)

  /** TileData.get_occluder_polygon */
  final def getOccluderPolygon(layer_id: Long, polygon_index: Long, flip_h: Boolean, flip_v: Boolean, transpose: Boolean): GodotObject =
    Ptrcall.call5[Long, Long, Boolean, Boolean, Boolean, GodotObject](MethodBind.get("TileData", "get_occluder_polygon", 971166743L), hostObject.objectPtr, layer_id, polygon_index, flip_h, flip_v, transpose)

  /** TileData.set_occluder */
  final def setOccluder(layer_id: Long, occluder_polygon: OccluderPolygon2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileData", "set_occluder", 914399637L), hostObject.objectPtr, layer_id, occluder_polygon.hostObject)

  /** TileData.get_occluder */
  final def getOccluder(layer_id: Long, flip_h: Boolean, flip_v: Boolean, transpose: Boolean): GodotObject =
    Ptrcall.call4[Long, Boolean, Boolean, Boolean, GodotObject](MethodBind.get("TileData", "get_occluder", 2377324099L), hostObject.objectPtr, layer_id, flip_h, flip_v, transpose)

  /** TileData.set_constant_linear_velocity */
  final def setConstantLinearVelocity(layer_id: Long, velocity: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileData", "set_constant_linear_velocity", 163021252L), hostObject.objectPtr, layer_id, velocity)

  /** TileData.get_constant_linear_velocity */
  final def getConstantLinearVelocity(layer_id: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("TileData", "get_constant_linear_velocity", 2299179447L), hostObject.objectPtr, layer_id)

  /** TileData.set_constant_angular_velocity */
  final def setConstantAngularVelocity(layer_id: Long, velocity: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileData", "set_constant_angular_velocity", 1602489585L), hostObject.objectPtr, layer_id, velocity)

  /** TileData.get_constant_angular_velocity */
  final def getConstantAngularVelocity(layer_id: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("TileData", "get_constant_angular_velocity", 2339986948L), hostObject.objectPtr, layer_id)

  /** TileData.set_collision_polygons_count */
  final def setCollisionPolygonsCount(layer_id: Long, polygons_count: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileData", "set_collision_polygons_count", 3937882851L), hostObject.objectPtr, layer_id, polygons_count)

  /** TileData.get_collision_polygons_count */
  final def getCollisionPolygonsCount(layer_id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TileData", "get_collision_polygons_count", 923996154L), hostObject.objectPtr, layer_id)

  /** TileData.add_collision_polygon */
  final def addCollisionPolygon(layer_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileData", "add_collision_polygon", 1286410249L), hostObject.objectPtr, layer_id)

  /** TileData.remove_collision_polygon */
  final def removeCollisionPolygon(layer_id: Long, polygon_index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileData", "remove_collision_polygon", 3937882851L), hostObject.objectPtr, layer_id, polygon_index)

  /** TileData.set_collision_polygon_one_way */
  final def setCollisionPolygonOneWay(layer_id: Long, polygon_index: Long, one_way: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("TileData", "set_collision_polygon_one_way", 1383440665L), hostObject.objectPtr, layer_id, polygon_index, one_way)

  /** TileData.is_collision_polygon_one_way */
  final def isCollisionPolygonOneWay(layer_id: Long, polygon_index: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("TileData", "is_collision_polygon_one_way", 2522259332L), hostObject.objectPtr, layer_id, polygon_index)

  /** TileData.set_collision_polygon_one_way_margin */
  final def setCollisionPolygonOneWayMargin(layer_id: Long, polygon_index: Long, one_way_margin: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("TileData", "set_collision_polygon_one_way_margin", 3506521499L), hostObject.objectPtr, layer_id, polygon_index, one_way_margin)

  /** TileData.get_collision_polygon_one_way_margin */
  final def getCollisionPolygonOneWayMargin(layer_id: Long, polygon_index: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("TileData", "get_collision_polygon_one_way_margin", 3085491603L), hostObject.objectPtr, layer_id, polygon_index)

  /** TileData.set_terrain_set */
  final def setTerrainSet(terrain_set: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileData", "set_terrain_set", 1286410249L), hostObject.objectPtr, terrain_set)

  /** TileData.get_terrain_set */
  final def getTerrainSet(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileData", "get_terrain_set", 3905245786L), hostObject.objectPtr)

  /** TileData.set_terrain */
  final def setTerrain(terrain: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileData", "set_terrain", 1286410249L), hostObject.objectPtr, terrain)

  /** TileData.get_terrain */
  final def getTerrain(): Long =
    Ptrcall.call0[Long](MethodBind.get("TileData", "get_terrain", 3905245786L), hostObject.objectPtr)

  /** TileData.set_terrain_peering_bit */
  final def setTerrainPeeringBit(peering_bit: Long, terrain: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileData", "set_terrain_peering_bit", 1084452308L), hostObject.objectPtr, peering_bit, terrain)

  /** TileData.get_terrain_peering_bit */
  final def getTerrainPeeringBit(peering_bit: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TileData", "get_terrain_peering_bit", 3831796792L), hostObject.objectPtr, peering_bit)

  /** TileData.is_valid_terrain_peering_bit */
  final def isValidTerrainPeeringBit(peering_bit: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TileData", "is_valid_terrain_peering_bit", 845723972L), hostObject.objectPtr, peering_bit)

  /** TileData.set_navigation_polygon */
  final def setNavigationPolygon(layer_id: Long, navigation_polygon: NavigationPolygon): Unit =
    Ptrcall.callVoid2(MethodBind.get("TileData", "set_navigation_polygon", 2224691167L), hostObject.objectPtr, layer_id, navigation_polygon.hostObject)

  /** TileData.get_navigation_polygon */
  final def getNavigationPolygon(layer_id: Long, flip_h: Boolean, flip_v: Boolean, transpose: Boolean): GodotObject =
    Ptrcall.call4[Long, Boolean, Boolean, Boolean, GodotObject](MethodBind.get("TileData", "get_navigation_polygon", 2907127272L), hostObject.objectPtr, layer_id, flip_h, flip_v, transpose)

  /** TileData.set_probability */
  final def setProbability(probability: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TileData", "set_probability", 373806689L), hostObject.objectPtr, probability)

  /** TileData.get_probability */
  final def getProbability(): Double =
    Ptrcall.call0[Double](MethodBind.get("TileData", "get_probability", 1740695150L), hostObject.objectPtr)

  /** TileData.has_custom_data */
  final def hasCustomData(layer_name: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("TileData", "has_custom_data", 3927539163L), hostObject.objectPtr, layer_name)

}

object TileData {
  /** Class metadata for Gd[TileData] lifetime management and casting. */
  given GodotClass[TileData] with {
    def className = "TileData"
    def isRefCounted = false
    def wrap(o: GodotObject): TileData = new TileData {}.withHost(o.objectPtr)
    def unwrap(t: TileData): GodotObject = t.hostObject
  }
}
