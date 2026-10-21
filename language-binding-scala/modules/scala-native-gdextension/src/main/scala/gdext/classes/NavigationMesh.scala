package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationMesh`, extends `Resource`. */
abstract class NavigationMesh extends Resource {
  override def godotClassName: String = "NavigationMesh"

  /** NavigationMesh.set_sample_partition_type */
  final def setSamplePartitionType(sample_partition_type: Long): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_sample_partition_type == null) gdext.classes.NavigationMesh.mb_set_sample_partition_type = MethodBind.get("NavigationMesh", "set_sample_partition_type", 2472437533L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_sample_partition_type, livePtr, sample_partition_type)
  }

  /** NavigationMesh.get_sample_partition_type */
  final def getSamplePartitionType(): Long = {
    if (gdext.classes.NavigationMesh.mb_get_sample_partition_type == null) gdext.classes.NavigationMesh.mb_get_sample_partition_type = MethodBind.get("NavigationMesh", "get_sample_partition_type", 833513918L)
    Ptrcall.call0[Long](gdext.classes.NavigationMesh.mb_get_sample_partition_type, livePtr)
  }

  /** NavigationMesh.set_parsed_geometry_type */
  final def setParsedGeometryType(geometry_type: Long): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_parsed_geometry_type == null) gdext.classes.NavigationMesh.mb_set_parsed_geometry_type = MethodBind.get("NavigationMesh", "set_parsed_geometry_type", 3064713163L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_parsed_geometry_type, livePtr, geometry_type)
  }

  /** NavigationMesh.get_parsed_geometry_type */
  final def getParsedGeometryType(): Long = {
    if (gdext.classes.NavigationMesh.mb_get_parsed_geometry_type == null) gdext.classes.NavigationMesh.mb_get_parsed_geometry_type = MethodBind.get("NavigationMesh", "get_parsed_geometry_type", 3928011953L)
    Ptrcall.call0[Long](gdext.classes.NavigationMesh.mb_get_parsed_geometry_type, livePtr)
  }

  /** NavigationMesh.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_collision_mask == null) gdext.classes.NavigationMesh.mb_set_collision_mask = MethodBind.get("NavigationMesh", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_collision_mask, livePtr, mask)
  }

  /** NavigationMesh.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.NavigationMesh.mb_get_collision_mask == null) gdext.classes.NavigationMesh.mb_get_collision_mask = MethodBind.get("NavigationMesh", "get_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationMesh.mb_get_collision_mask, livePtr)
  }

  /** NavigationMesh.set_collision_mask_value */
  final def setCollisionMaskValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_collision_mask_value == null) gdext.classes.NavigationMesh.mb_set_collision_mask_value = MethodBind.get("NavigationMesh", "set_collision_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.NavigationMesh.mb_set_collision_mask_value, livePtr, layer_number, value)
  }

  /** NavigationMesh.get_collision_mask_value */
  final def getCollisionMaskValue(layer_number: Long): Boolean = {
    if (gdext.classes.NavigationMesh.mb_get_collision_mask_value == null) gdext.classes.NavigationMesh.mb_get_collision_mask_value = MethodBind.get("NavigationMesh", "get_collision_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NavigationMesh.mb_get_collision_mask_value, livePtr, layer_number)
  }

  /** NavigationMesh.set_source_geometry_mode */
  final def setSourceGeometryMode(mask: Long): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_source_geometry_mode == null) gdext.classes.NavigationMesh.mb_set_source_geometry_mode = MethodBind.get("NavigationMesh", "set_source_geometry_mode", 2700825194L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_source_geometry_mode, livePtr, mask)
  }

  /** NavigationMesh.get_source_geometry_mode */
  final def getSourceGeometryMode(): Long = {
    if (gdext.classes.NavigationMesh.mb_get_source_geometry_mode == null) gdext.classes.NavigationMesh.mb_get_source_geometry_mode = MethodBind.get("NavigationMesh", "get_source_geometry_mode", 2770484141L)
    Ptrcall.call0[Long](gdext.classes.NavigationMesh.mb_get_source_geometry_mode, livePtr)
  }

  /** NavigationMesh.set_source_group_name */
  final def setSourceGroupName(mask: gdext.builtin.StringName): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_source_group_name == null) gdext.classes.NavigationMesh.mb_set_source_group_name = MethodBind.get("NavigationMesh", "set_source_group_name", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_source_group_name, livePtr, mask)
  }

  /** NavigationMesh.get_source_group_name */
  final def getSourceGroupName(): gdext.builtin.StringName = {
    if (gdext.classes.NavigationMesh.mb_get_source_group_name == null) gdext.classes.NavigationMesh.mb_get_source_group_name = MethodBind.get("NavigationMesh", "get_source_group_name", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.NavigationMesh.mb_get_source_group_name, livePtr)
  }

  /** NavigationMesh.set_cell_size */
  final def setCellSize(cell_size: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_cell_size == null) gdext.classes.NavigationMesh.mb_set_cell_size = MethodBind.get("NavigationMesh", "set_cell_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_cell_size, livePtr, cell_size)
  }

  /** NavigationMesh.get_cell_size */
  final def getCellSize(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_cell_size == null) gdext.classes.NavigationMesh.mb_get_cell_size = MethodBind.get("NavigationMesh", "get_cell_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_cell_size, livePtr)
  }

  /** NavigationMesh.set_cell_height */
  final def setCellHeight(cell_height: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_cell_height == null) gdext.classes.NavigationMesh.mb_set_cell_height = MethodBind.get("NavigationMesh", "set_cell_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_cell_height, livePtr, cell_height)
  }

  /** NavigationMesh.get_cell_height */
  final def getCellHeight(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_cell_height == null) gdext.classes.NavigationMesh.mb_get_cell_height = MethodBind.get("NavigationMesh", "get_cell_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_cell_height, livePtr)
  }

  /** NavigationMesh.set_border_size */
  final def setBorderSize(border_size: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_border_size == null) gdext.classes.NavigationMesh.mb_set_border_size = MethodBind.get("NavigationMesh", "set_border_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_border_size, livePtr, border_size)
  }

  /** NavigationMesh.get_border_size */
  final def getBorderSize(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_border_size == null) gdext.classes.NavigationMesh.mb_get_border_size = MethodBind.get("NavigationMesh", "get_border_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_border_size, livePtr)
  }

  /** NavigationMesh.set_agent_height */
  final def setAgentHeight(agent_height: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_agent_height == null) gdext.classes.NavigationMesh.mb_set_agent_height = MethodBind.get("NavigationMesh", "set_agent_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_agent_height, livePtr, agent_height)
  }

  /** NavigationMesh.get_agent_height */
  final def getAgentHeight(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_agent_height == null) gdext.classes.NavigationMesh.mb_get_agent_height = MethodBind.get("NavigationMesh", "get_agent_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_agent_height, livePtr)
  }

  /** NavigationMesh.set_agent_radius */
  final def setAgentRadius(agent_radius: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_agent_radius == null) gdext.classes.NavigationMesh.mb_set_agent_radius = MethodBind.get("NavigationMesh", "set_agent_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_agent_radius, livePtr, agent_radius)
  }

  /** NavigationMesh.get_agent_radius */
  final def getAgentRadius(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_agent_radius == null) gdext.classes.NavigationMesh.mb_get_agent_radius = MethodBind.get("NavigationMesh", "get_agent_radius", 191475506L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_agent_radius, livePtr)
  }

  /** NavigationMesh.set_agent_max_climb */
  final def setAgentMaxClimb(agent_max_climb: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_agent_max_climb == null) gdext.classes.NavigationMesh.mb_set_agent_max_climb = MethodBind.get("NavigationMesh", "set_agent_max_climb", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_agent_max_climb, livePtr, agent_max_climb)
  }

  /** NavigationMesh.get_agent_max_climb */
  final def getAgentMaxClimb(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_agent_max_climb == null) gdext.classes.NavigationMesh.mb_get_agent_max_climb = MethodBind.get("NavigationMesh", "get_agent_max_climb", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_agent_max_climb, livePtr)
  }

  /** NavigationMesh.set_agent_max_slope */
  final def setAgentMaxSlope(agent_max_slope: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_agent_max_slope == null) gdext.classes.NavigationMesh.mb_set_agent_max_slope = MethodBind.get("NavigationMesh", "set_agent_max_slope", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_agent_max_slope, livePtr, agent_max_slope)
  }

  /** NavigationMesh.get_agent_max_slope */
  final def getAgentMaxSlope(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_agent_max_slope == null) gdext.classes.NavigationMesh.mb_get_agent_max_slope = MethodBind.get("NavigationMesh", "get_agent_max_slope", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_agent_max_slope, livePtr)
  }

  /** NavigationMesh.set_region_min_size */
  final def setRegionMinSize(region_min_size: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_region_min_size == null) gdext.classes.NavigationMesh.mb_set_region_min_size = MethodBind.get("NavigationMesh", "set_region_min_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_region_min_size, livePtr, region_min_size)
  }

  /** NavigationMesh.get_region_min_size */
  final def getRegionMinSize(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_region_min_size == null) gdext.classes.NavigationMesh.mb_get_region_min_size = MethodBind.get("NavigationMesh", "get_region_min_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_region_min_size, livePtr)
  }

  /** NavigationMesh.set_region_merge_size */
  final def setRegionMergeSize(region_merge_size: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_region_merge_size == null) gdext.classes.NavigationMesh.mb_set_region_merge_size = MethodBind.get("NavigationMesh", "set_region_merge_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_region_merge_size, livePtr, region_merge_size)
  }

  /** NavigationMesh.get_region_merge_size */
  final def getRegionMergeSize(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_region_merge_size == null) gdext.classes.NavigationMesh.mb_get_region_merge_size = MethodBind.get("NavigationMesh", "get_region_merge_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_region_merge_size, livePtr)
  }

  /** NavigationMesh.set_edge_max_length */
  final def setEdgeMaxLength(edge_max_length: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_edge_max_length == null) gdext.classes.NavigationMesh.mb_set_edge_max_length = MethodBind.get("NavigationMesh", "set_edge_max_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_edge_max_length, livePtr, edge_max_length)
  }

  /** NavigationMesh.get_edge_max_length */
  final def getEdgeMaxLength(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_edge_max_length == null) gdext.classes.NavigationMesh.mb_get_edge_max_length = MethodBind.get("NavigationMesh", "get_edge_max_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_edge_max_length, livePtr)
  }

  /** NavigationMesh.set_edge_max_error */
  final def setEdgeMaxError(edge_max_error: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_edge_max_error == null) gdext.classes.NavigationMesh.mb_set_edge_max_error = MethodBind.get("NavigationMesh", "set_edge_max_error", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_edge_max_error, livePtr, edge_max_error)
  }

  /** NavigationMesh.get_edge_max_error */
  final def getEdgeMaxError(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_edge_max_error == null) gdext.classes.NavigationMesh.mb_get_edge_max_error = MethodBind.get("NavigationMesh", "get_edge_max_error", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_edge_max_error, livePtr)
  }

  /** NavigationMesh.set_vertices_per_polygon */
  final def setVerticesPerPolygon(vertices_per_polygon: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_vertices_per_polygon == null) gdext.classes.NavigationMesh.mb_set_vertices_per_polygon = MethodBind.get("NavigationMesh", "set_vertices_per_polygon", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_vertices_per_polygon, livePtr, vertices_per_polygon)
  }

  /** NavigationMesh.get_vertices_per_polygon */
  final def getVerticesPerPolygon(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_vertices_per_polygon == null) gdext.classes.NavigationMesh.mb_get_vertices_per_polygon = MethodBind.get("NavigationMesh", "get_vertices_per_polygon", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_vertices_per_polygon, livePtr)
  }

  /** NavigationMesh.set_detail_sample_distance */
  final def setDetailSampleDistance(detail_sample_dist: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_detail_sample_distance == null) gdext.classes.NavigationMesh.mb_set_detail_sample_distance = MethodBind.get("NavigationMesh", "set_detail_sample_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_detail_sample_distance, livePtr, detail_sample_dist)
  }

  /** NavigationMesh.get_detail_sample_distance */
  final def getDetailSampleDistance(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_detail_sample_distance == null) gdext.classes.NavigationMesh.mb_get_detail_sample_distance = MethodBind.get("NavigationMesh", "get_detail_sample_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_detail_sample_distance, livePtr)
  }

  /** NavigationMesh.set_detail_sample_max_error */
  final def setDetailSampleMaxError(detail_sample_max_error: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_detail_sample_max_error == null) gdext.classes.NavigationMesh.mb_set_detail_sample_max_error = MethodBind.get("NavigationMesh", "set_detail_sample_max_error", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_detail_sample_max_error, livePtr, detail_sample_max_error)
  }

  /** NavigationMesh.get_detail_sample_max_error */
  final def getDetailSampleMaxError(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_detail_sample_max_error == null) gdext.classes.NavigationMesh.mb_get_detail_sample_max_error = MethodBind.get("NavigationMesh", "get_detail_sample_max_error", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_detail_sample_max_error, livePtr)
  }

  /** NavigationMesh.set_filter_low_hanging_obstacles */
  final def setFilterLowHangingObstacles(filter_low_hanging_obstacles: Boolean): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_filter_low_hanging_obstacles == null) gdext.classes.NavigationMesh.mb_set_filter_low_hanging_obstacles = MethodBind.get("NavigationMesh", "set_filter_low_hanging_obstacles", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_filter_low_hanging_obstacles, livePtr, filter_low_hanging_obstacles)
  }

  /** NavigationMesh.get_filter_low_hanging_obstacles */
  final def getFilterLowHangingObstacles(): Boolean = {
    if (gdext.classes.NavigationMesh.mb_get_filter_low_hanging_obstacles == null) gdext.classes.NavigationMesh.mb_get_filter_low_hanging_obstacles = MethodBind.get("NavigationMesh", "get_filter_low_hanging_obstacles", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationMesh.mb_get_filter_low_hanging_obstacles, livePtr)
  }

  /** NavigationMesh.set_filter_ledge_spans */
  final def setFilterLedgeSpans(filter_ledge_spans: Boolean): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_filter_ledge_spans == null) gdext.classes.NavigationMesh.mb_set_filter_ledge_spans = MethodBind.get("NavigationMesh", "set_filter_ledge_spans", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_filter_ledge_spans, livePtr, filter_ledge_spans)
  }

  /** NavigationMesh.get_filter_ledge_spans */
  final def getFilterLedgeSpans(): Boolean = {
    if (gdext.classes.NavigationMesh.mb_get_filter_ledge_spans == null) gdext.classes.NavigationMesh.mb_get_filter_ledge_spans = MethodBind.get("NavigationMesh", "get_filter_ledge_spans", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationMesh.mb_get_filter_ledge_spans, livePtr)
  }

  /** NavigationMesh.set_filter_walkable_low_height_spans */
  final def setFilterWalkableLowHeightSpans(filter_walkable_low_height_spans: Boolean): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_filter_walkable_low_height_spans == null) gdext.classes.NavigationMesh.mb_set_filter_walkable_low_height_spans = MethodBind.get("NavigationMesh", "set_filter_walkable_low_height_spans", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_filter_walkable_low_height_spans, livePtr, filter_walkable_low_height_spans)
  }

  /** NavigationMesh.get_filter_walkable_low_height_spans */
  final def getFilterWalkableLowHeightSpans(): Boolean = {
    if (gdext.classes.NavigationMesh.mb_get_filter_walkable_low_height_spans == null) gdext.classes.NavigationMesh.mb_get_filter_walkable_low_height_spans = MethodBind.get("NavigationMesh", "get_filter_walkable_low_height_spans", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationMesh.mb_get_filter_walkable_low_height_spans, livePtr)
  }

  /** NavigationMesh.set_filter_baking_aabb */
  final def setFilterBakingAabb(baking_aabb: gdext.builtin.AABB): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_filter_baking_aabb == null) gdext.classes.NavigationMesh.mb_set_filter_baking_aabb = MethodBind.get("NavigationMesh", "set_filter_baking_aabb", 259215842L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_filter_baking_aabb, livePtr, baking_aabb)
  }

  /** NavigationMesh.get_filter_baking_aabb */
  final def getFilterBakingAabb(): gdext.builtin.AABB = {
    if (gdext.classes.NavigationMesh.mb_get_filter_baking_aabb == null) gdext.classes.NavigationMesh.mb_get_filter_baking_aabb = MethodBind.get("NavigationMesh", "get_filter_baking_aabb", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.NavigationMesh.mb_get_filter_baking_aabb, livePtr)
  }

  /** NavigationMesh.set_filter_baking_aabb_offset */
  final def setFilterBakingAabbOffset(baking_aabb_offset: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_filter_baking_aabb_offset == null) gdext.classes.NavigationMesh.mb_set_filter_baking_aabb_offset = MethodBind.get("NavigationMesh", "set_filter_baking_aabb_offset", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_filter_baking_aabb_offset, livePtr, baking_aabb_offset)
  }

  /** NavigationMesh.get_filter_baking_aabb_offset */
  final def getFilterBakingAabbOffset(): gdext.builtin.Vector3 = {
    if (gdext.classes.NavigationMesh.mb_get_filter_baking_aabb_offset == null) gdext.classes.NavigationMesh.mb_get_filter_baking_aabb_offset = MethodBind.get("NavigationMesh", "get_filter_baking_aabb_offset", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.NavigationMesh.mb_get_filter_baking_aabb_offset, livePtr)
  }

  /** NavigationMesh.get_polygon_count */
  final def getPolygonCount(): Long = {
    if (gdext.classes.NavigationMesh.mb_get_polygon_count == null) gdext.classes.NavigationMesh.mb_get_polygon_count = MethodBind.get("NavigationMesh", "get_polygon_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationMesh.mb_get_polygon_count, livePtr)
  }

  /** NavigationMesh.clear_polygons */
  final def clearPolygons(): Unit = {
    if (gdext.classes.NavigationMesh.mb_clear_polygons == null) gdext.classes.NavigationMesh.mb_clear_polygons = MethodBind.get("NavigationMesh", "clear_polygons", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.NavigationMesh.mb_clear_polygons, livePtr)
  }

  /** NavigationMesh.create_from_mesh */
  final def createFromMesh(mesh: Mesh): Unit = {
    if (gdext.classes.NavigationMesh.mb_create_from_mesh == null) gdext.classes.NavigationMesh.mb_create_from_mesh = MethodBind.get("NavigationMesh", "create_from_mesh", 194775623L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_create_from_mesh, livePtr, Wrappers.handle(mesh))
  }

  /** NavigationMesh.clear */
  final def clear(): Unit = {
    if (gdext.classes.NavigationMesh.mb_clear == null) gdext.classes.NavigationMesh.mb_clear = MethodBind.get("NavigationMesh", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.NavigationMesh.mb_clear, livePtr)
  }

}

object NavigationMesh {
  private[classes] var mb_set_sample_partition_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sample_partition_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_parsed_geometry_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_parsed_geometry_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_source_geometry_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_source_geometry_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_source_group_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_source_group_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cell_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cell_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_border_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_border_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_agent_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_agent_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_agent_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_agent_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_agent_max_climb: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_agent_max_climb: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_agent_max_slope: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_agent_max_slope: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_region_min_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_region_min_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_region_merge_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_region_merge_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_edge_max_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_edge_max_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_edge_max_error: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_edge_max_error: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertices_per_polygon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertices_per_polygon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_detail_sample_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_detail_sample_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_detail_sample_max_error: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_detail_sample_max_error: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_filter_low_hanging_obstacles: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_filter_low_hanging_obstacles: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_filter_ledge_spans: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_filter_ledge_spans: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_filter_walkable_low_height_spans: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_filter_walkable_low_height_spans: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_filter_baking_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_filter_baking_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_filter_baking_aabb_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_filter_baking_aabb_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_polygon_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_polygons: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_from_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
}
