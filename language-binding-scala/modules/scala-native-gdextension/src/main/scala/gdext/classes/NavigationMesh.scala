package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationMesh`, extends `Resource`. */
abstract class NavigationMesh extends Resource {
  override def godotClassName: String = "NavigationMesh"

  /** NavigationMesh.set_sample_partition_type */
  final def setSamplePartitionType(samplePartitionType: gdext.classes.NavigationMesh.SamplePartitionType): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_sample_partition_type == null) gdext.classes.NavigationMesh.mb_set_sample_partition_type = MethodBind.get("NavigationMesh", "set_sample_partition_type", 2472437533L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_sample_partition_type, livePtr, samplePartitionType)
  }

  /** NavigationMesh.get_sample_partition_type */
  final def getSamplePartitionType(): gdext.classes.NavigationMesh.SamplePartitionType = {
    if (gdext.classes.NavigationMesh.mb_get_sample_partition_type == null) gdext.classes.NavigationMesh.mb_get_sample_partition_type = MethodBind.get("NavigationMesh", "get_sample_partition_type", 833513918L)
    gdext.classes.NavigationMesh.SamplePartitionType(Ptrcall.call0[Long](gdext.classes.NavigationMesh.mb_get_sample_partition_type, livePtr))
  }

  /** NavigationMesh.set_parsed_geometry_type */
  final def setParsedGeometryType(geometryType: gdext.classes.NavigationMesh.ParsedGeometryType): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_parsed_geometry_type == null) gdext.classes.NavigationMesh.mb_set_parsed_geometry_type = MethodBind.get("NavigationMesh", "set_parsed_geometry_type", 3064713163L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_parsed_geometry_type, livePtr, geometryType)
  }

  /** NavigationMesh.get_parsed_geometry_type */
  final def getParsedGeometryType(): gdext.classes.NavigationMesh.ParsedGeometryType = {
    if (gdext.classes.NavigationMesh.mb_get_parsed_geometry_type == null) gdext.classes.NavigationMesh.mb_get_parsed_geometry_type = MethodBind.get("NavigationMesh", "get_parsed_geometry_type", 3928011953L)
    gdext.classes.NavigationMesh.ParsedGeometryType(Ptrcall.call0[Long](gdext.classes.NavigationMesh.mb_get_parsed_geometry_type, livePtr))
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
  final def setCollisionMaskValue(layerNumber: Long, value: Boolean): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_collision_mask_value == null) gdext.classes.NavigationMesh.mb_set_collision_mask_value = MethodBind.get("NavigationMesh", "set_collision_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.NavigationMesh.mb_set_collision_mask_value, livePtr, layerNumber, value)
  }

  /** NavigationMesh.get_collision_mask_value */
  final def getCollisionMaskValue(layerNumber: Long): Boolean = {
    if (gdext.classes.NavigationMesh.mb_get_collision_mask_value == null) gdext.classes.NavigationMesh.mb_get_collision_mask_value = MethodBind.get("NavigationMesh", "get_collision_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NavigationMesh.mb_get_collision_mask_value, livePtr, layerNumber)
  }

  /** NavigationMesh.set_source_geometry_mode */
  final def setSourceGeometryMode(mask: gdext.classes.NavigationMesh.SourceGeometryMode): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_source_geometry_mode == null) gdext.classes.NavigationMesh.mb_set_source_geometry_mode = MethodBind.get("NavigationMesh", "set_source_geometry_mode", 2700825194L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_source_geometry_mode, livePtr, mask)
  }

  /** NavigationMesh.get_source_geometry_mode */
  final def getSourceGeometryMode(): gdext.classes.NavigationMesh.SourceGeometryMode = {
    if (gdext.classes.NavigationMesh.mb_get_source_geometry_mode == null) gdext.classes.NavigationMesh.mb_get_source_geometry_mode = MethodBind.get("NavigationMesh", "get_source_geometry_mode", 2770484141L)
    gdext.classes.NavigationMesh.SourceGeometryMode(Ptrcall.call0[Long](gdext.classes.NavigationMesh.mb_get_source_geometry_mode, livePtr))
  }

  /** NavigationMesh.set_source_group_name */
  final def setSourceGroupName(mask: String): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_source_group_name == null) gdext.classes.NavigationMesh.mb_set_source_group_name = MethodBind.get("NavigationMesh", "set_source_group_name", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_source_group_name, livePtr, SnArg(mask))
  }

  /** NavigationMesh.get_source_group_name */
  final def getSourceGroupName(): String = {
    if (gdext.classes.NavigationMesh.mb_get_source_group_name == null) gdext.classes.NavigationMesh.mb_get_source_group_name = MethodBind.get("NavigationMesh", "get_source_group_name", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.NavigationMesh.mb_get_source_group_name, livePtr)
  }

  /** NavigationMesh.set_cell_size */
  final def setCellSize(cellSize: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_cell_size == null) gdext.classes.NavigationMesh.mb_set_cell_size = MethodBind.get("NavigationMesh", "set_cell_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_cell_size, livePtr, cellSize)
  }

  /** NavigationMesh.get_cell_size */
  final def getCellSize(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_cell_size == null) gdext.classes.NavigationMesh.mb_get_cell_size = MethodBind.get("NavigationMesh", "get_cell_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_cell_size, livePtr)
  }

  /** NavigationMesh.set_cell_height */
  final def setCellHeight(cellHeight: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_cell_height == null) gdext.classes.NavigationMesh.mb_set_cell_height = MethodBind.get("NavigationMesh", "set_cell_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_cell_height, livePtr, cellHeight)
  }

  /** NavigationMesh.get_cell_height */
  final def getCellHeight(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_cell_height == null) gdext.classes.NavigationMesh.mb_get_cell_height = MethodBind.get("NavigationMesh", "get_cell_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_cell_height, livePtr)
  }

  /** NavigationMesh.set_border_size */
  final def setBorderSize(borderSize: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_border_size == null) gdext.classes.NavigationMesh.mb_set_border_size = MethodBind.get("NavigationMesh", "set_border_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_border_size, livePtr, borderSize)
  }

  /** NavigationMesh.get_border_size */
  final def getBorderSize(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_border_size == null) gdext.classes.NavigationMesh.mb_get_border_size = MethodBind.get("NavigationMesh", "get_border_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_border_size, livePtr)
  }

  /** NavigationMesh.set_agent_height */
  final def setAgentHeight(agentHeight: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_agent_height == null) gdext.classes.NavigationMesh.mb_set_agent_height = MethodBind.get("NavigationMesh", "set_agent_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_agent_height, livePtr, agentHeight)
  }

  /** NavigationMesh.get_agent_height */
  final def getAgentHeight(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_agent_height == null) gdext.classes.NavigationMesh.mb_get_agent_height = MethodBind.get("NavigationMesh", "get_agent_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_agent_height, livePtr)
  }

  /** NavigationMesh.set_agent_radius */
  final def setAgentRadius(agentRadius: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_agent_radius == null) gdext.classes.NavigationMesh.mb_set_agent_radius = MethodBind.get("NavigationMesh", "set_agent_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_agent_radius, livePtr, agentRadius)
  }

  /** NavigationMesh.get_agent_radius */
  final def getAgentRadius(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_agent_radius == null) gdext.classes.NavigationMesh.mb_get_agent_radius = MethodBind.get("NavigationMesh", "get_agent_radius", 191475506L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_agent_radius, livePtr)
  }

  /** NavigationMesh.set_agent_max_climb */
  final def setAgentMaxClimb(agentMaxClimb: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_agent_max_climb == null) gdext.classes.NavigationMesh.mb_set_agent_max_climb = MethodBind.get("NavigationMesh", "set_agent_max_climb", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_agent_max_climb, livePtr, agentMaxClimb)
  }

  /** NavigationMesh.get_agent_max_climb */
  final def getAgentMaxClimb(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_agent_max_climb == null) gdext.classes.NavigationMesh.mb_get_agent_max_climb = MethodBind.get("NavigationMesh", "get_agent_max_climb", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_agent_max_climb, livePtr)
  }

  /** NavigationMesh.set_agent_max_slope */
  final def setAgentMaxSlope(agentMaxSlope: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_agent_max_slope == null) gdext.classes.NavigationMesh.mb_set_agent_max_slope = MethodBind.get("NavigationMesh", "set_agent_max_slope", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_agent_max_slope, livePtr, agentMaxSlope)
  }

  /** NavigationMesh.get_agent_max_slope */
  final def getAgentMaxSlope(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_agent_max_slope == null) gdext.classes.NavigationMesh.mb_get_agent_max_slope = MethodBind.get("NavigationMesh", "get_agent_max_slope", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_agent_max_slope, livePtr)
  }

  /** NavigationMesh.set_region_min_size */
  final def setRegionMinSize(regionMinSize: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_region_min_size == null) gdext.classes.NavigationMesh.mb_set_region_min_size = MethodBind.get("NavigationMesh", "set_region_min_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_region_min_size, livePtr, regionMinSize)
  }

  /** NavigationMesh.get_region_min_size */
  final def getRegionMinSize(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_region_min_size == null) gdext.classes.NavigationMesh.mb_get_region_min_size = MethodBind.get("NavigationMesh", "get_region_min_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_region_min_size, livePtr)
  }

  /** NavigationMesh.set_region_merge_size */
  final def setRegionMergeSize(regionMergeSize: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_region_merge_size == null) gdext.classes.NavigationMesh.mb_set_region_merge_size = MethodBind.get("NavigationMesh", "set_region_merge_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_region_merge_size, livePtr, regionMergeSize)
  }

  /** NavigationMesh.get_region_merge_size */
  final def getRegionMergeSize(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_region_merge_size == null) gdext.classes.NavigationMesh.mb_get_region_merge_size = MethodBind.get("NavigationMesh", "get_region_merge_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_region_merge_size, livePtr)
  }

  /** NavigationMesh.set_edge_max_length */
  final def setEdgeMaxLength(edgeMaxLength: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_edge_max_length == null) gdext.classes.NavigationMesh.mb_set_edge_max_length = MethodBind.get("NavigationMesh", "set_edge_max_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_edge_max_length, livePtr, edgeMaxLength)
  }

  /** NavigationMesh.get_edge_max_length */
  final def getEdgeMaxLength(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_edge_max_length == null) gdext.classes.NavigationMesh.mb_get_edge_max_length = MethodBind.get("NavigationMesh", "get_edge_max_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_edge_max_length, livePtr)
  }

  /** NavigationMesh.set_edge_max_error */
  final def setEdgeMaxError(edgeMaxError: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_edge_max_error == null) gdext.classes.NavigationMesh.mb_set_edge_max_error = MethodBind.get("NavigationMesh", "set_edge_max_error", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_edge_max_error, livePtr, edgeMaxError)
  }

  /** NavigationMesh.get_edge_max_error */
  final def getEdgeMaxError(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_edge_max_error == null) gdext.classes.NavigationMesh.mb_get_edge_max_error = MethodBind.get("NavigationMesh", "get_edge_max_error", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_edge_max_error, livePtr)
  }

  /** NavigationMesh.set_vertices_per_polygon */
  final def setVerticesPerPolygon(verticesPerPolygon: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_vertices_per_polygon == null) gdext.classes.NavigationMesh.mb_set_vertices_per_polygon = MethodBind.get("NavigationMesh", "set_vertices_per_polygon", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_vertices_per_polygon, livePtr, verticesPerPolygon)
  }

  /** NavigationMesh.get_vertices_per_polygon */
  final def getVerticesPerPolygon(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_vertices_per_polygon == null) gdext.classes.NavigationMesh.mb_get_vertices_per_polygon = MethodBind.get("NavigationMesh", "get_vertices_per_polygon", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_vertices_per_polygon, livePtr)
  }

  /** NavigationMesh.set_detail_sample_distance */
  final def setDetailSampleDistance(detailSampleDist: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_detail_sample_distance == null) gdext.classes.NavigationMesh.mb_set_detail_sample_distance = MethodBind.get("NavigationMesh", "set_detail_sample_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_detail_sample_distance, livePtr, detailSampleDist)
  }

  /** NavigationMesh.get_detail_sample_distance */
  final def getDetailSampleDistance(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_detail_sample_distance == null) gdext.classes.NavigationMesh.mb_get_detail_sample_distance = MethodBind.get("NavigationMesh", "get_detail_sample_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_detail_sample_distance, livePtr)
  }

  /** NavigationMesh.set_detail_sample_max_error */
  final def setDetailSampleMaxError(detailSampleMaxError: Double): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_detail_sample_max_error == null) gdext.classes.NavigationMesh.mb_set_detail_sample_max_error = MethodBind.get("NavigationMesh", "set_detail_sample_max_error", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_detail_sample_max_error, livePtr, detailSampleMaxError)
  }

  /** NavigationMesh.get_detail_sample_max_error */
  final def getDetailSampleMaxError(): Double = {
    if (gdext.classes.NavigationMesh.mb_get_detail_sample_max_error == null) gdext.classes.NavigationMesh.mb_get_detail_sample_max_error = MethodBind.get("NavigationMesh", "get_detail_sample_max_error", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationMesh.mb_get_detail_sample_max_error, livePtr)
  }

  /** NavigationMesh.set_filter_low_hanging_obstacles */
  final def setFilterLowHangingObstacles(filterLowHangingObstacles: Boolean): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_filter_low_hanging_obstacles == null) gdext.classes.NavigationMesh.mb_set_filter_low_hanging_obstacles = MethodBind.get("NavigationMesh", "set_filter_low_hanging_obstacles", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_filter_low_hanging_obstacles, livePtr, filterLowHangingObstacles)
  }

  /** NavigationMesh.get_filter_low_hanging_obstacles */
  final def getFilterLowHangingObstacles(): Boolean = {
    if (gdext.classes.NavigationMesh.mb_get_filter_low_hanging_obstacles == null) gdext.classes.NavigationMesh.mb_get_filter_low_hanging_obstacles = MethodBind.get("NavigationMesh", "get_filter_low_hanging_obstacles", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationMesh.mb_get_filter_low_hanging_obstacles, livePtr)
  }

  /** NavigationMesh.set_filter_ledge_spans */
  final def setFilterLedgeSpans(filterLedgeSpans: Boolean): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_filter_ledge_spans == null) gdext.classes.NavigationMesh.mb_set_filter_ledge_spans = MethodBind.get("NavigationMesh", "set_filter_ledge_spans", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_filter_ledge_spans, livePtr, filterLedgeSpans)
  }

  /** NavigationMesh.get_filter_ledge_spans */
  final def getFilterLedgeSpans(): Boolean = {
    if (gdext.classes.NavigationMesh.mb_get_filter_ledge_spans == null) gdext.classes.NavigationMesh.mb_get_filter_ledge_spans = MethodBind.get("NavigationMesh", "get_filter_ledge_spans", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationMesh.mb_get_filter_ledge_spans, livePtr)
  }

  /** NavigationMesh.set_filter_walkable_low_height_spans */
  final def setFilterWalkableLowHeightSpans(filterWalkableLowHeightSpans: Boolean): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_filter_walkable_low_height_spans == null) gdext.classes.NavigationMesh.mb_set_filter_walkable_low_height_spans = MethodBind.get("NavigationMesh", "set_filter_walkable_low_height_spans", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_filter_walkable_low_height_spans, livePtr, filterWalkableLowHeightSpans)
  }

  /** NavigationMesh.get_filter_walkable_low_height_spans */
  final def getFilterWalkableLowHeightSpans(): Boolean = {
    if (gdext.classes.NavigationMesh.mb_get_filter_walkable_low_height_spans == null) gdext.classes.NavigationMesh.mb_get_filter_walkable_low_height_spans = MethodBind.get("NavigationMesh", "get_filter_walkable_low_height_spans", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationMesh.mb_get_filter_walkable_low_height_spans, livePtr)
  }

  /** NavigationMesh.set_filter_baking_aabb */
  final def setFilterBakingAabb(bakingAabb: gdext.builtin.AABB): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_filter_baking_aabb == null) gdext.classes.NavigationMesh.mb_set_filter_baking_aabb = MethodBind.get("NavigationMesh", "set_filter_baking_aabb", 259215842L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_filter_baking_aabb, livePtr, bakingAabb)
  }

  /** NavigationMesh.get_filter_baking_aabb */
  final def getFilterBakingAabb(): gdext.builtin.AABB = {
    if (gdext.classes.NavigationMesh.mb_get_filter_baking_aabb == null) gdext.classes.NavigationMesh.mb_get_filter_baking_aabb = MethodBind.get("NavigationMesh", "get_filter_baking_aabb", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.NavigationMesh.mb_get_filter_baking_aabb, livePtr)
  }

  /** NavigationMesh.set_filter_baking_aabb_offset */
  final def setFilterBakingAabbOffset(bakingAabbOffset: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.NavigationMesh.mb_set_filter_baking_aabb_offset == null) gdext.classes.NavigationMesh.mb_set_filter_baking_aabb_offset = MethodBind.get("NavigationMesh", "set_filter_baking_aabb_offset", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.NavigationMesh.mb_set_filter_baking_aabb_offset, livePtr, bakingAabbOffset)
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

  /** Godot enum `NavigationMesh.SamplePartitionType`. */
  opaque type SamplePartitionType <: Long = Long

  object SamplePartitionType {
    final val Watershed: SamplePartitionType = 0L.asInstanceOf[SamplePartitionType]
    final val Monotone: SamplePartitionType = 1L.asInstanceOf[SamplePartitionType]
    final val Layers: SamplePartitionType = 2L.asInstanceOf[SamplePartitionType]
    final val Max: SamplePartitionType = 3L.asInstanceOf[SamplePartitionType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SamplePartitionType = value.asInstanceOf[SamplePartitionType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SamplePartitionType] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[SamplePartitionType]]

    extension (self: SamplePartitionType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Watershed"
        case 1L => "Monotone"
        case 2L => "Layers"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `NavigationMesh.ParsedGeometryType`. */
  opaque type ParsedGeometryType <: Long = Long

  object ParsedGeometryType {
    final val MeshInstances: ParsedGeometryType = 0L.asInstanceOf[ParsedGeometryType]
    final val StaticColliders: ParsedGeometryType = 1L.asInstanceOf[ParsedGeometryType]
    final val Both: ParsedGeometryType = 2L.asInstanceOf[ParsedGeometryType]
    final val Max: ParsedGeometryType = 3L.asInstanceOf[ParsedGeometryType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ParsedGeometryType = value.asInstanceOf[ParsedGeometryType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ParsedGeometryType] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ParsedGeometryType]]

    extension (self: ParsedGeometryType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "MeshInstances"
        case 1L => "StaticColliders"
        case 2L => "Both"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `NavigationMesh.SourceGeometryMode`. */
  opaque type SourceGeometryMode <: Long = Long

  object SourceGeometryMode {
    final val RootNodeChildren: SourceGeometryMode = 0L.asInstanceOf[SourceGeometryMode]
    final val GroupsWithChildren: SourceGeometryMode = 1L.asInstanceOf[SourceGeometryMode]
    final val GroupsExplicit: SourceGeometryMode = 2L.asInstanceOf[SourceGeometryMode]
    final val Max: SourceGeometryMode = 3L.asInstanceOf[SourceGeometryMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SourceGeometryMode = value.asInstanceOf[SourceGeometryMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SourceGeometryMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[SourceGeometryMode]]

    extension (self: SourceGeometryMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "RootNodeChildren"
        case 1L => "GroupsWithChildren"
        case 2L => "GroupsExplicit"
        case 3L => "Max"
        case other => other.toString
      }
  }
}
