package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationMesh`, extends `Resource`. */
abstract class NavigationMesh extends Resource {

  /** NavigationMesh.set_sample_partition_type */
  final def setSamplePartitionType(sample_partition_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_sample_partition_type", 2472437533L), hostObject.objectPtr, sample_partition_type)

  /** NavigationMesh.get_sample_partition_type */
  final def getSamplePartitionType(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationMesh", "get_sample_partition_type", 833513918L), hostObject.objectPtr)

  /** NavigationMesh.set_parsed_geometry_type */
  final def setParsedGeometryType(geometry_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_parsed_geometry_type", 3064713163L), hostObject.objectPtr, geometry_type)

  /** NavigationMesh.get_parsed_geometry_type */
  final def getParsedGeometryType(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationMesh", "get_parsed_geometry_type", 3928011953L), hostObject.objectPtr)

  /** NavigationMesh.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_collision_mask", 1286410249L), hostObject.objectPtr, mask)

  /** NavigationMesh.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationMesh", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** NavigationMesh.set_collision_mask_value */
  final def setCollisionMaskValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationMesh", "set_collision_mask_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** NavigationMesh.get_collision_mask_value */
  final def getCollisionMaskValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("NavigationMesh", "get_collision_mask_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** NavigationMesh.set_source_geometry_mode */
  final def setSourceGeometryMode(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_source_geometry_mode", 2700825194L), hostObject.objectPtr, mask)

  /** NavigationMesh.get_source_geometry_mode */
  final def getSourceGeometryMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationMesh", "get_source_geometry_mode", 2770484141L), hostObject.objectPtr)

  /** NavigationMesh.set_source_group_name */
  final def setSourceGroupName(mask: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_source_group_name", 3304788590L), hostObject.objectPtr, mask)

  /** NavigationMesh.get_source_group_name */
  final def getSourceGroupName(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("NavigationMesh", "get_source_group_name", 2002593661L), hostObject.objectPtr)

  /** NavigationMesh.set_cell_size */
  final def setCellSize(cell_size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_cell_size", 373806689L), hostObject.objectPtr, cell_size)

  /** NavigationMesh.get_cell_size */
  final def getCellSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationMesh", "get_cell_size", 1740695150L), hostObject.objectPtr)

  /** NavigationMesh.set_cell_height */
  final def setCellHeight(cell_height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_cell_height", 373806689L), hostObject.objectPtr, cell_height)

  /** NavigationMesh.get_cell_height */
  final def getCellHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationMesh", "get_cell_height", 1740695150L), hostObject.objectPtr)

  /** NavigationMesh.set_border_size */
  final def setBorderSize(border_size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_border_size", 373806689L), hostObject.objectPtr, border_size)

  /** NavigationMesh.get_border_size */
  final def getBorderSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationMesh", "get_border_size", 1740695150L), hostObject.objectPtr)

  /** NavigationMesh.set_agent_height */
  final def setAgentHeight(agent_height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_agent_height", 373806689L), hostObject.objectPtr, agent_height)

  /** NavigationMesh.get_agent_height */
  final def getAgentHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationMesh", "get_agent_height", 1740695150L), hostObject.objectPtr)

  /** NavigationMesh.set_agent_radius */
  final def setAgentRadius(agent_radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_agent_radius", 373806689L), hostObject.objectPtr, agent_radius)

  /** NavigationMesh.get_agent_radius */
  final def getAgentRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationMesh", "get_agent_radius", 191475506L), hostObject.objectPtr)

  /** NavigationMesh.set_agent_max_climb */
  final def setAgentMaxClimb(agent_max_climb: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_agent_max_climb", 373806689L), hostObject.objectPtr, agent_max_climb)

  /** NavigationMesh.get_agent_max_climb */
  final def getAgentMaxClimb(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationMesh", "get_agent_max_climb", 1740695150L), hostObject.objectPtr)

  /** NavigationMesh.set_agent_max_slope */
  final def setAgentMaxSlope(agent_max_slope: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_agent_max_slope", 373806689L), hostObject.objectPtr, agent_max_slope)

  /** NavigationMesh.get_agent_max_slope */
  final def getAgentMaxSlope(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationMesh", "get_agent_max_slope", 1740695150L), hostObject.objectPtr)

  /** NavigationMesh.set_region_min_size */
  final def setRegionMinSize(region_min_size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_region_min_size", 373806689L), hostObject.objectPtr, region_min_size)

  /** NavigationMesh.get_region_min_size */
  final def getRegionMinSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationMesh", "get_region_min_size", 1740695150L), hostObject.objectPtr)

  /** NavigationMesh.set_region_merge_size */
  final def setRegionMergeSize(region_merge_size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_region_merge_size", 373806689L), hostObject.objectPtr, region_merge_size)

  /** NavigationMesh.get_region_merge_size */
  final def getRegionMergeSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationMesh", "get_region_merge_size", 1740695150L), hostObject.objectPtr)

  /** NavigationMesh.set_edge_max_length */
  final def setEdgeMaxLength(edge_max_length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_edge_max_length", 373806689L), hostObject.objectPtr, edge_max_length)

  /** NavigationMesh.get_edge_max_length */
  final def getEdgeMaxLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationMesh", "get_edge_max_length", 1740695150L), hostObject.objectPtr)

  /** NavigationMesh.set_edge_max_error */
  final def setEdgeMaxError(edge_max_error: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_edge_max_error", 373806689L), hostObject.objectPtr, edge_max_error)

  /** NavigationMesh.get_edge_max_error */
  final def getEdgeMaxError(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationMesh", "get_edge_max_error", 1740695150L), hostObject.objectPtr)

  /** NavigationMesh.set_vertices_per_polygon */
  final def setVerticesPerPolygon(vertices_per_polygon: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_vertices_per_polygon", 373806689L), hostObject.objectPtr, vertices_per_polygon)

  /** NavigationMesh.get_vertices_per_polygon */
  final def getVerticesPerPolygon(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationMesh", "get_vertices_per_polygon", 1740695150L), hostObject.objectPtr)

  /** NavigationMesh.set_detail_sample_distance */
  final def setDetailSampleDistance(detail_sample_dist: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_detail_sample_distance", 373806689L), hostObject.objectPtr, detail_sample_dist)

  /** NavigationMesh.get_detail_sample_distance */
  final def getDetailSampleDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationMesh", "get_detail_sample_distance", 1740695150L), hostObject.objectPtr)

  /** NavigationMesh.set_detail_sample_max_error */
  final def setDetailSampleMaxError(detail_sample_max_error: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_detail_sample_max_error", 373806689L), hostObject.objectPtr, detail_sample_max_error)

  /** NavigationMesh.get_detail_sample_max_error */
  final def getDetailSampleMaxError(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationMesh", "get_detail_sample_max_error", 1740695150L), hostObject.objectPtr)

  /** NavigationMesh.set_filter_low_hanging_obstacles */
  final def setFilterLowHangingObstacles(filter_low_hanging_obstacles: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_filter_low_hanging_obstacles", 2586408642L), hostObject.objectPtr, filter_low_hanging_obstacles)

  /** NavigationMesh.get_filter_low_hanging_obstacles */
  final def getFilterLowHangingObstacles(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationMesh", "get_filter_low_hanging_obstacles", 36873697L), hostObject.objectPtr)

  /** NavigationMesh.set_filter_ledge_spans */
  final def setFilterLedgeSpans(filter_ledge_spans: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_filter_ledge_spans", 2586408642L), hostObject.objectPtr, filter_ledge_spans)

  /** NavigationMesh.get_filter_ledge_spans */
  final def getFilterLedgeSpans(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationMesh", "get_filter_ledge_spans", 36873697L), hostObject.objectPtr)

  /** NavigationMesh.set_filter_walkable_low_height_spans */
  final def setFilterWalkableLowHeightSpans(filter_walkable_low_height_spans: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_filter_walkable_low_height_spans", 2586408642L), hostObject.objectPtr, filter_walkable_low_height_spans)

  /** NavigationMesh.get_filter_walkable_low_height_spans */
  final def getFilterWalkableLowHeightSpans(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationMesh", "get_filter_walkable_low_height_spans", 36873697L), hostObject.objectPtr)

  /** NavigationMesh.set_filter_baking_aabb */
  final def setFilterBakingAabb(baking_aabb: gdext.builtin.AABB): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_filter_baking_aabb", 259215842L), hostObject.objectPtr, baking_aabb)

  /** NavigationMesh.get_filter_baking_aabb */
  final def getFilterBakingAabb(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("NavigationMesh", "get_filter_baking_aabb", 1068685055L), hostObject.objectPtr)

  /** NavigationMesh.set_filter_baking_aabb_offset */
  final def setFilterBakingAabbOffset(baking_aabb_offset: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "set_filter_baking_aabb_offset", 3460891852L), hostObject.objectPtr, baking_aabb_offset)

  /** NavigationMesh.get_filter_baking_aabb_offset */
  final def getFilterBakingAabbOffset(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("NavigationMesh", "get_filter_baking_aabb_offset", 3360562783L), hostObject.objectPtr)

  /** NavigationMesh.get_polygon_count */
  final def getPolygonCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationMesh", "get_polygon_count", 3905245786L), hostObject.objectPtr)

  /** NavigationMesh.clear_polygons */
  final def clearPolygons(): Unit =
    Ptrcall.callVoid0(MethodBind.get("NavigationMesh", "clear_polygons", 3218959716L), hostObject.objectPtr)

  /** NavigationMesh.create_from_mesh */
  final def createFromMesh(mesh: Mesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMesh", "create_from_mesh", 194775623L), hostObject.objectPtr, mesh.hostObject)

  /** NavigationMesh.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("NavigationMesh", "clear", 3218959716L), hostObject.objectPtr)

}

object NavigationMesh {
  /** Class metadata for Gd[NavigationMesh] lifetime management and casting. */
  given GodotClass[NavigationMesh] with {
    def className = "NavigationMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): NavigationMesh = new NavigationMesh {}.withHost(o.objectPtr)
    def unwrap(t: NavigationMesh): GodotObject = t.hostObject
  }
}
