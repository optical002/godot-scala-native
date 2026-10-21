package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationAgent3D`, extends `Node`. */
abstract class NavigationAgent3D extends Node {
  override def godotClassName: String = "NavigationAgent3D"

  /** NavigationAgent3D.set_avoidance_enabled */
  final def setAvoidanceEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_avoidance_enabled == null) gdext.classes.NavigationAgent3D.mb_set_avoidance_enabled = MethodBind.get("NavigationAgent3D", "set_avoidance_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_avoidance_enabled, livePtr, enabled)
  }

  /** NavigationAgent3D.get_avoidance_enabled */
  final def getAvoidanceEnabled(): Boolean = {
    if (gdext.classes.NavigationAgent3D.mb_get_avoidance_enabled == null) gdext.classes.NavigationAgent3D.mb_get_avoidance_enabled = MethodBind.get("NavigationAgent3D", "get_avoidance_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationAgent3D.mb_get_avoidance_enabled, livePtr)
  }

  /** NavigationAgent3D.set_path_desired_distance */
  final def setPathDesiredDistance(desired_distance: Double): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_path_desired_distance == null) gdext.classes.NavigationAgent3D.mb_set_path_desired_distance = MethodBind.get("NavigationAgent3D", "set_path_desired_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_path_desired_distance, livePtr, desired_distance)
  }

  /** NavigationAgent3D.get_path_desired_distance */
  final def getPathDesiredDistance(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_path_desired_distance == null) gdext.classes.NavigationAgent3D.mb_get_path_desired_distance = MethodBind.get("NavigationAgent3D", "get_path_desired_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_path_desired_distance, livePtr)
  }

  /** NavigationAgent3D.set_target_desired_distance */
  final def setTargetDesiredDistance(desired_distance: Double): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_target_desired_distance == null) gdext.classes.NavigationAgent3D.mb_set_target_desired_distance = MethodBind.get("NavigationAgent3D", "set_target_desired_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_target_desired_distance, livePtr, desired_distance)
  }

  /** NavigationAgent3D.get_target_desired_distance */
  final def getTargetDesiredDistance(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_target_desired_distance == null) gdext.classes.NavigationAgent3D.mb_get_target_desired_distance = MethodBind.get("NavigationAgent3D", "get_target_desired_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_target_desired_distance, livePtr)
  }

  /** NavigationAgent3D.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_radius == null) gdext.classes.NavigationAgent3D.mb_set_radius = MethodBind.get("NavigationAgent3D", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_radius, livePtr, radius)
  }

  /** NavigationAgent3D.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_radius == null) gdext.classes.NavigationAgent3D.mb_get_radius = MethodBind.get("NavigationAgent3D", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_radius, livePtr)
  }

  /** NavigationAgent3D.set_height */
  final def setHeight(height: Double): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_height == null) gdext.classes.NavigationAgent3D.mb_set_height = MethodBind.get("NavigationAgent3D", "set_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_height, livePtr, height)
  }

  /** NavigationAgent3D.get_height */
  final def getHeight(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_height == null) gdext.classes.NavigationAgent3D.mb_get_height = MethodBind.get("NavigationAgent3D", "get_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_height, livePtr)
  }

  /** NavigationAgent3D.set_path_height_offset */
  final def setPathHeightOffset(path_height_offset: Double): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_path_height_offset == null) gdext.classes.NavigationAgent3D.mb_set_path_height_offset = MethodBind.get("NavigationAgent3D", "set_path_height_offset", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_path_height_offset, livePtr, path_height_offset)
  }

  /** NavigationAgent3D.get_path_height_offset */
  final def getPathHeightOffset(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_path_height_offset == null) gdext.classes.NavigationAgent3D.mb_get_path_height_offset = MethodBind.get("NavigationAgent3D", "get_path_height_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_path_height_offset, livePtr)
  }

  /** NavigationAgent3D.set_use_3d_avoidance */
  final def setUse3dAvoidance(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_use_3d_avoidance == null) gdext.classes.NavigationAgent3D.mb_set_use_3d_avoidance = MethodBind.get("NavigationAgent3D", "set_use_3d_avoidance", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_use_3d_avoidance, livePtr, enabled)
  }

  /** NavigationAgent3D.get_use_3d_avoidance */
  final def getUse3dAvoidance(): Boolean = {
    if (gdext.classes.NavigationAgent3D.mb_get_use_3d_avoidance == null) gdext.classes.NavigationAgent3D.mb_get_use_3d_avoidance = MethodBind.get("NavigationAgent3D", "get_use_3d_avoidance", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationAgent3D.mb_get_use_3d_avoidance, livePtr)
  }

  /** NavigationAgent3D.set_keep_y_velocity */
  final def setKeepYVelocity(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_keep_y_velocity == null) gdext.classes.NavigationAgent3D.mb_set_keep_y_velocity = MethodBind.get("NavigationAgent3D", "set_keep_y_velocity", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_keep_y_velocity, livePtr, enabled)
  }

  /** NavigationAgent3D.get_keep_y_velocity */
  final def getKeepYVelocity(): Boolean = {
    if (gdext.classes.NavigationAgent3D.mb_get_keep_y_velocity == null) gdext.classes.NavigationAgent3D.mb_get_keep_y_velocity = MethodBind.get("NavigationAgent3D", "get_keep_y_velocity", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationAgent3D.mb_get_keep_y_velocity, livePtr)
  }

  /** NavigationAgent3D.set_neighbor_distance */
  final def setNeighborDistance(neighbor_distance: Double): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_neighbor_distance == null) gdext.classes.NavigationAgent3D.mb_set_neighbor_distance = MethodBind.get("NavigationAgent3D", "set_neighbor_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_neighbor_distance, livePtr, neighbor_distance)
  }

  /** NavigationAgent3D.get_neighbor_distance */
  final def getNeighborDistance(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_neighbor_distance == null) gdext.classes.NavigationAgent3D.mb_get_neighbor_distance = MethodBind.get("NavigationAgent3D", "get_neighbor_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_neighbor_distance, livePtr)
  }

  /** NavigationAgent3D.set_max_neighbors */
  final def setMaxNeighbors(max_neighbors: Long): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_max_neighbors == null) gdext.classes.NavigationAgent3D.mb_set_max_neighbors = MethodBind.get("NavigationAgent3D", "set_max_neighbors", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_max_neighbors, livePtr, max_neighbors)
  }

  /** NavigationAgent3D.get_max_neighbors */
  final def getMaxNeighbors(): Long = {
    if (gdext.classes.NavigationAgent3D.mb_get_max_neighbors == null) gdext.classes.NavigationAgent3D.mb_get_max_neighbors = MethodBind.get("NavigationAgent3D", "get_max_neighbors", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationAgent3D.mb_get_max_neighbors, livePtr)
  }

  /** NavigationAgent3D.set_time_horizon_agents */
  final def setTimeHorizonAgents(time_horizon: Double): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_time_horizon_agents == null) gdext.classes.NavigationAgent3D.mb_set_time_horizon_agents = MethodBind.get("NavigationAgent3D", "set_time_horizon_agents", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_time_horizon_agents, livePtr, time_horizon)
  }

  /** NavigationAgent3D.get_time_horizon_agents */
  final def getTimeHorizonAgents(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_time_horizon_agents == null) gdext.classes.NavigationAgent3D.mb_get_time_horizon_agents = MethodBind.get("NavigationAgent3D", "get_time_horizon_agents", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_time_horizon_agents, livePtr)
  }

  /** NavigationAgent3D.set_time_horizon_obstacles */
  final def setTimeHorizonObstacles(time_horizon: Double): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_time_horizon_obstacles == null) gdext.classes.NavigationAgent3D.mb_set_time_horizon_obstacles = MethodBind.get("NavigationAgent3D", "set_time_horizon_obstacles", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_time_horizon_obstacles, livePtr, time_horizon)
  }

  /** NavigationAgent3D.get_time_horizon_obstacles */
  final def getTimeHorizonObstacles(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_time_horizon_obstacles == null) gdext.classes.NavigationAgent3D.mb_get_time_horizon_obstacles = MethodBind.get("NavigationAgent3D", "get_time_horizon_obstacles", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_time_horizon_obstacles, livePtr)
  }

  /** NavigationAgent3D.set_max_speed */
  final def setMaxSpeed(max_speed: Double): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_max_speed == null) gdext.classes.NavigationAgent3D.mb_set_max_speed = MethodBind.get("NavigationAgent3D", "set_max_speed", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_max_speed, livePtr, max_speed)
  }

  /** NavigationAgent3D.get_max_speed */
  final def getMaxSpeed(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_max_speed == null) gdext.classes.NavigationAgent3D.mb_get_max_speed = MethodBind.get("NavigationAgent3D", "get_max_speed", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_max_speed, livePtr)
  }

  /** NavigationAgent3D.set_path_max_distance */
  final def setPathMaxDistance(max_speed: Double): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_path_max_distance == null) gdext.classes.NavigationAgent3D.mb_set_path_max_distance = MethodBind.get("NavigationAgent3D", "set_path_max_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_path_max_distance, livePtr, max_speed)
  }

  /** NavigationAgent3D.get_path_max_distance */
  final def getPathMaxDistance(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_path_max_distance == null) gdext.classes.NavigationAgent3D.mb_get_path_max_distance = MethodBind.get("NavigationAgent3D", "get_path_max_distance", 191475506L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_path_max_distance, livePtr)
  }

  /** NavigationAgent3D.set_navigation_layers */
  final def setNavigationLayers(navigation_layers: Long): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_navigation_layers == null) gdext.classes.NavigationAgent3D.mb_set_navigation_layers = MethodBind.get("NavigationAgent3D", "set_navigation_layers", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_navigation_layers, livePtr, navigation_layers)
  }

  /** NavigationAgent3D.get_navigation_layers */
  final def getNavigationLayers(): Long = {
    if (gdext.classes.NavigationAgent3D.mb_get_navigation_layers == null) gdext.classes.NavigationAgent3D.mb_get_navigation_layers = MethodBind.get("NavigationAgent3D", "get_navigation_layers", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationAgent3D.mb_get_navigation_layers, livePtr)
  }

  /** NavigationAgent3D.set_navigation_layer_value */
  final def setNavigationLayerValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_navigation_layer_value == null) gdext.classes.NavigationAgent3D.mb_set_navigation_layer_value = MethodBind.get("NavigationAgent3D", "set_navigation_layer_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.NavigationAgent3D.mb_set_navigation_layer_value, livePtr, layer_number, value)
  }

  /** NavigationAgent3D.get_navigation_layer_value */
  final def getNavigationLayerValue(layer_number: Long): Boolean = {
    if (gdext.classes.NavigationAgent3D.mb_get_navigation_layer_value == null) gdext.classes.NavigationAgent3D.mb_get_navigation_layer_value = MethodBind.get("NavigationAgent3D", "get_navigation_layer_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NavigationAgent3D.mb_get_navigation_layer_value, livePtr, layer_number)
  }

  /** NavigationAgent3D.set_pathfinding_algorithm */
  final def setPathfindingAlgorithm(pathfinding_algorithm: Long): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_pathfinding_algorithm == null) gdext.classes.NavigationAgent3D.mb_set_pathfinding_algorithm = MethodBind.get("NavigationAgent3D", "set_pathfinding_algorithm", 394560454L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_pathfinding_algorithm, livePtr, pathfinding_algorithm)
  }

  /** NavigationAgent3D.get_pathfinding_algorithm */
  final def getPathfindingAlgorithm(): Long = {
    if (gdext.classes.NavigationAgent3D.mb_get_pathfinding_algorithm == null) gdext.classes.NavigationAgent3D.mb_get_pathfinding_algorithm = MethodBind.get("NavigationAgent3D", "get_pathfinding_algorithm", 3398491350L)
    Ptrcall.call0[Long](gdext.classes.NavigationAgent3D.mb_get_pathfinding_algorithm, livePtr)
  }

  /** NavigationAgent3D.set_path_postprocessing */
  final def setPathPostprocessing(path_postprocessing: Long): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_path_postprocessing == null) gdext.classes.NavigationAgent3D.mb_set_path_postprocessing = MethodBind.get("NavigationAgent3D", "set_path_postprocessing", 2267362344L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_path_postprocessing, livePtr, path_postprocessing)
  }

  /** NavigationAgent3D.get_path_postprocessing */
  final def getPathPostprocessing(): Long = {
    if (gdext.classes.NavigationAgent3D.mb_get_path_postprocessing == null) gdext.classes.NavigationAgent3D.mb_get_path_postprocessing = MethodBind.get("NavigationAgent3D", "get_path_postprocessing", 3883858360L)
    Ptrcall.call0[Long](gdext.classes.NavigationAgent3D.mb_get_path_postprocessing, livePtr)
  }

  /** NavigationAgent3D.set_path_metadata_flags */
  final def setPathMetadataFlags(flags: Long): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_path_metadata_flags == null) gdext.classes.NavigationAgent3D.mb_set_path_metadata_flags = MethodBind.get("NavigationAgent3D", "set_path_metadata_flags", 2713846708L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_path_metadata_flags, livePtr, flags)
  }

  /** NavigationAgent3D.get_path_metadata_flags */
  final def getPathMetadataFlags(): Long = {
    if (gdext.classes.NavigationAgent3D.mb_get_path_metadata_flags == null) gdext.classes.NavigationAgent3D.mb_get_path_metadata_flags = MethodBind.get("NavigationAgent3D", "get_path_metadata_flags", 1582332802L)
    Ptrcall.call0[Long](gdext.classes.NavigationAgent3D.mb_get_path_metadata_flags, livePtr)
  }

  /** NavigationAgent3D.set_target_position */
  final def setTargetPosition(position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_target_position == null) gdext.classes.NavigationAgent3D.mb_set_target_position = MethodBind.get("NavigationAgent3D", "set_target_position", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_target_position, livePtr, position)
  }

  /** NavigationAgent3D.get_target_position */
  final def getTargetPosition(): gdext.builtin.Vector3 = {
    if (gdext.classes.NavigationAgent3D.mb_get_target_position == null) gdext.classes.NavigationAgent3D.mb_get_target_position = MethodBind.get("NavigationAgent3D", "get_target_position", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.NavigationAgent3D.mb_get_target_position, livePtr)
  }

  /** NavigationAgent3D.set_simplify_path */
  final def setSimplifyPath(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_simplify_path == null) gdext.classes.NavigationAgent3D.mb_set_simplify_path = MethodBind.get("NavigationAgent3D", "set_simplify_path", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_simplify_path, livePtr, enabled)
  }

  /** NavigationAgent3D.get_simplify_path */
  final def getSimplifyPath(): Boolean = {
    if (gdext.classes.NavigationAgent3D.mb_get_simplify_path == null) gdext.classes.NavigationAgent3D.mb_get_simplify_path = MethodBind.get("NavigationAgent3D", "get_simplify_path", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationAgent3D.mb_get_simplify_path, livePtr)
  }

  /** NavigationAgent3D.set_simplify_epsilon */
  final def setSimplifyEpsilon(epsilon: Double): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_simplify_epsilon == null) gdext.classes.NavigationAgent3D.mb_set_simplify_epsilon = MethodBind.get("NavigationAgent3D", "set_simplify_epsilon", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_simplify_epsilon, livePtr, epsilon)
  }

  /** NavigationAgent3D.get_simplify_epsilon */
  final def getSimplifyEpsilon(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_simplify_epsilon == null) gdext.classes.NavigationAgent3D.mb_get_simplify_epsilon = MethodBind.get("NavigationAgent3D", "get_simplify_epsilon", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_simplify_epsilon, livePtr)
  }

  /** NavigationAgent3D.set_path_return_max_length */
  final def setPathReturnMaxLength(length: Double): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_path_return_max_length == null) gdext.classes.NavigationAgent3D.mb_set_path_return_max_length = MethodBind.get("NavigationAgent3D", "set_path_return_max_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_path_return_max_length, livePtr, length)
  }

  /** NavigationAgent3D.get_path_return_max_length */
  final def getPathReturnMaxLength(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_path_return_max_length == null) gdext.classes.NavigationAgent3D.mb_get_path_return_max_length = MethodBind.get("NavigationAgent3D", "get_path_return_max_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_path_return_max_length, livePtr)
  }

  /** NavigationAgent3D.set_path_return_max_radius */
  final def setPathReturnMaxRadius(radius: Double): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_path_return_max_radius == null) gdext.classes.NavigationAgent3D.mb_set_path_return_max_radius = MethodBind.get("NavigationAgent3D", "set_path_return_max_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_path_return_max_radius, livePtr, radius)
  }

  /** NavigationAgent3D.get_path_return_max_radius */
  final def getPathReturnMaxRadius(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_path_return_max_radius == null) gdext.classes.NavigationAgent3D.mb_get_path_return_max_radius = MethodBind.get("NavigationAgent3D", "get_path_return_max_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_path_return_max_radius, livePtr)
  }

  /** NavigationAgent3D.set_path_search_max_polygons */
  final def setPathSearchMaxPolygons(max_polygons: Long): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_path_search_max_polygons == null) gdext.classes.NavigationAgent3D.mb_set_path_search_max_polygons = MethodBind.get("NavigationAgent3D", "set_path_search_max_polygons", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_path_search_max_polygons, livePtr, max_polygons)
  }

  /** NavigationAgent3D.get_path_search_max_polygons */
  final def getPathSearchMaxPolygons(): Long = {
    if (gdext.classes.NavigationAgent3D.mb_get_path_search_max_polygons == null) gdext.classes.NavigationAgent3D.mb_get_path_search_max_polygons = MethodBind.get("NavigationAgent3D", "get_path_search_max_polygons", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationAgent3D.mb_get_path_search_max_polygons, livePtr)
  }

  /** NavigationAgent3D.set_path_search_max_distance */
  final def setPathSearchMaxDistance(distance: Double): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_path_search_max_distance == null) gdext.classes.NavigationAgent3D.mb_set_path_search_max_distance = MethodBind.get("NavigationAgent3D", "set_path_search_max_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_path_search_max_distance, livePtr, distance)
  }

  /** NavigationAgent3D.get_path_search_max_distance */
  final def getPathSearchMaxDistance(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_path_search_max_distance == null) gdext.classes.NavigationAgent3D.mb_get_path_search_max_distance = MethodBind.get("NavigationAgent3D", "get_path_search_max_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_path_search_max_distance, livePtr)
  }

  /** NavigationAgent3D.get_path_length */
  final def getPathLength(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_path_length == null) gdext.classes.NavigationAgent3D.mb_get_path_length = MethodBind.get("NavigationAgent3D", "get_path_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_path_length, livePtr)
  }

  /** NavigationAgent3D.get_next_path_position */
  final def getNextPathPosition(): gdext.builtin.Vector3 = {
    if (gdext.classes.NavigationAgent3D.mb_get_next_path_position == null) gdext.classes.NavigationAgent3D.mb_get_next_path_position = MethodBind.get("NavigationAgent3D", "get_next_path_position", 3783033775L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.NavigationAgent3D.mb_get_next_path_position, livePtr)
  }

  /** NavigationAgent3D.set_velocity_forced */
  final def setVelocityForced(velocity: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_velocity_forced == null) gdext.classes.NavigationAgent3D.mb_set_velocity_forced = MethodBind.get("NavigationAgent3D", "set_velocity_forced", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_velocity_forced, livePtr, velocity)
  }

  /** NavigationAgent3D.set_velocity */
  final def setVelocity(velocity: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_velocity == null) gdext.classes.NavigationAgent3D.mb_set_velocity = MethodBind.get("NavigationAgent3D", "set_velocity", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_velocity, livePtr, velocity)
  }

  /** NavigationAgent3D.get_velocity */
  final def getVelocity(): gdext.builtin.Vector3 = {
    if (gdext.classes.NavigationAgent3D.mb_get_velocity == null) gdext.classes.NavigationAgent3D.mb_get_velocity = MethodBind.get("NavigationAgent3D", "get_velocity", 3783033775L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.NavigationAgent3D.mb_get_velocity, livePtr)
  }

  /** NavigationAgent3D.distance_to_target */
  final def distanceToTarget(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_distance_to_target == null) gdext.classes.NavigationAgent3D.mb_distance_to_target = MethodBind.get("NavigationAgent3D", "distance_to_target", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_distance_to_target, livePtr)
  }

  /** NavigationAgent3D.get_current_navigation_result. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCurrentNavigationResult(): NavigationPathQueryResult3D = {
    if (gdext.classes.NavigationAgent3D.mb_get_current_navigation_result == null) gdext.classes.NavigationAgent3D.mb_get_current_navigation_result = MethodBind.get("NavigationAgent3D", "get_current_navigation_result", 728825684L)
    Wrappers.owned[NavigationPathQueryResult3D](Ptrcall.call0[Long](gdext.classes.NavigationAgent3D.mb_get_current_navigation_result, livePtr))
  }

  /** NavigationAgent3D.get_current_navigation_path_index */
  final def getCurrentNavigationPathIndex(): Long = {
    if (gdext.classes.NavigationAgent3D.mb_get_current_navigation_path_index == null) gdext.classes.NavigationAgent3D.mb_get_current_navigation_path_index = MethodBind.get("NavigationAgent3D", "get_current_navigation_path_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationAgent3D.mb_get_current_navigation_path_index, livePtr)
  }

  /** NavigationAgent3D.is_target_reached */
  final def isTargetReached(): Boolean = {
    if (gdext.classes.NavigationAgent3D.mb_is_target_reached == null) gdext.classes.NavigationAgent3D.mb_is_target_reached = MethodBind.get("NavigationAgent3D", "is_target_reached", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationAgent3D.mb_is_target_reached, livePtr)
  }

  /** NavigationAgent3D.is_target_reachable */
  final def isTargetReachable(): Boolean = {
    if (gdext.classes.NavigationAgent3D.mb_is_target_reachable == null) gdext.classes.NavigationAgent3D.mb_is_target_reachable = MethodBind.get("NavigationAgent3D", "is_target_reachable", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationAgent3D.mb_is_target_reachable, livePtr)
  }

  /** NavigationAgent3D.is_navigation_finished */
  final def isNavigationFinished(): Boolean = {
    if (gdext.classes.NavigationAgent3D.mb_is_navigation_finished == null) gdext.classes.NavigationAgent3D.mb_is_navigation_finished = MethodBind.get("NavigationAgent3D", "is_navigation_finished", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationAgent3D.mb_is_navigation_finished, livePtr)
  }

  /** NavigationAgent3D.get_final_position */
  final def getFinalPosition(): gdext.builtin.Vector3 = {
    if (gdext.classes.NavigationAgent3D.mb_get_final_position == null) gdext.classes.NavigationAgent3D.mb_get_final_position = MethodBind.get("NavigationAgent3D", "get_final_position", 3783033775L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.NavigationAgent3D.mb_get_final_position, livePtr)
  }

  /** NavigationAgent3D.set_avoidance_layers */
  final def setAvoidanceLayers(layers: Long): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_avoidance_layers == null) gdext.classes.NavigationAgent3D.mb_set_avoidance_layers = MethodBind.get("NavigationAgent3D", "set_avoidance_layers", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_avoidance_layers, livePtr, layers)
  }

  /** NavigationAgent3D.get_avoidance_layers */
  final def getAvoidanceLayers(): Long = {
    if (gdext.classes.NavigationAgent3D.mb_get_avoidance_layers == null) gdext.classes.NavigationAgent3D.mb_get_avoidance_layers = MethodBind.get("NavigationAgent3D", "get_avoidance_layers", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationAgent3D.mb_get_avoidance_layers, livePtr)
  }

  /** NavigationAgent3D.set_avoidance_mask */
  final def setAvoidanceMask(mask: Long): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_avoidance_mask == null) gdext.classes.NavigationAgent3D.mb_set_avoidance_mask = MethodBind.get("NavigationAgent3D", "set_avoidance_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_avoidance_mask, livePtr, mask)
  }

  /** NavigationAgent3D.get_avoidance_mask */
  final def getAvoidanceMask(): Long = {
    if (gdext.classes.NavigationAgent3D.mb_get_avoidance_mask == null) gdext.classes.NavigationAgent3D.mb_get_avoidance_mask = MethodBind.get("NavigationAgent3D", "get_avoidance_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationAgent3D.mb_get_avoidance_mask, livePtr)
  }

  /** NavigationAgent3D.set_avoidance_layer_value */
  final def setAvoidanceLayerValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_avoidance_layer_value == null) gdext.classes.NavigationAgent3D.mb_set_avoidance_layer_value = MethodBind.get("NavigationAgent3D", "set_avoidance_layer_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.NavigationAgent3D.mb_set_avoidance_layer_value, livePtr, layer_number, value)
  }

  /** NavigationAgent3D.get_avoidance_layer_value */
  final def getAvoidanceLayerValue(layer_number: Long): Boolean = {
    if (gdext.classes.NavigationAgent3D.mb_get_avoidance_layer_value == null) gdext.classes.NavigationAgent3D.mb_get_avoidance_layer_value = MethodBind.get("NavigationAgent3D", "get_avoidance_layer_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NavigationAgent3D.mb_get_avoidance_layer_value, livePtr, layer_number)
  }

  /** NavigationAgent3D.set_avoidance_mask_value */
  final def setAvoidanceMaskValue(mask_number: Long, value: Boolean): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_avoidance_mask_value == null) gdext.classes.NavigationAgent3D.mb_set_avoidance_mask_value = MethodBind.get("NavigationAgent3D", "set_avoidance_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.NavigationAgent3D.mb_set_avoidance_mask_value, livePtr, mask_number, value)
  }

  /** NavigationAgent3D.get_avoidance_mask_value */
  final def getAvoidanceMaskValue(mask_number: Long): Boolean = {
    if (gdext.classes.NavigationAgent3D.mb_get_avoidance_mask_value == null) gdext.classes.NavigationAgent3D.mb_get_avoidance_mask_value = MethodBind.get("NavigationAgent3D", "get_avoidance_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NavigationAgent3D.mb_get_avoidance_mask_value, livePtr, mask_number)
  }

  /** NavigationAgent3D.set_avoidance_priority */
  final def setAvoidancePriority(priority: Double): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_avoidance_priority == null) gdext.classes.NavigationAgent3D.mb_set_avoidance_priority = MethodBind.get("NavigationAgent3D", "set_avoidance_priority", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_avoidance_priority, livePtr, priority)
  }

  /** NavigationAgent3D.get_avoidance_priority */
  final def getAvoidancePriority(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_avoidance_priority == null) gdext.classes.NavigationAgent3D.mb_get_avoidance_priority = MethodBind.get("NavigationAgent3D", "get_avoidance_priority", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_avoidance_priority, livePtr)
  }

  /** NavigationAgent3D.set_debug_enabled */
  final def setDebugEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_debug_enabled == null) gdext.classes.NavigationAgent3D.mb_set_debug_enabled = MethodBind.get("NavigationAgent3D", "set_debug_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_debug_enabled, livePtr, enabled)
  }

  /** NavigationAgent3D.get_debug_enabled */
  final def getDebugEnabled(): Boolean = {
    if (gdext.classes.NavigationAgent3D.mb_get_debug_enabled == null) gdext.classes.NavigationAgent3D.mb_get_debug_enabled = MethodBind.get("NavigationAgent3D", "get_debug_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationAgent3D.mb_get_debug_enabled, livePtr)
  }

  /** NavigationAgent3D.set_debug_use_custom */
  final def setDebugUseCustom(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_debug_use_custom == null) gdext.classes.NavigationAgent3D.mb_set_debug_use_custom = MethodBind.get("NavigationAgent3D", "set_debug_use_custom", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_debug_use_custom, livePtr, enabled)
  }

  /** NavigationAgent3D.get_debug_use_custom */
  final def getDebugUseCustom(): Boolean = {
    if (gdext.classes.NavigationAgent3D.mb_get_debug_use_custom == null) gdext.classes.NavigationAgent3D.mb_get_debug_use_custom = MethodBind.get("NavigationAgent3D", "get_debug_use_custom", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationAgent3D.mb_get_debug_use_custom, livePtr)
  }

  /** NavigationAgent3D.set_debug_path_custom_color */
  final def setDebugPathCustomColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_debug_path_custom_color == null) gdext.classes.NavigationAgent3D.mb_set_debug_path_custom_color = MethodBind.get("NavigationAgent3D", "set_debug_path_custom_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_debug_path_custom_color, livePtr, color)
  }

  /** NavigationAgent3D.get_debug_path_custom_color */
  final def getDebugPathCustomColor(): gdext.builtin.Color = {
    if (gdext.classes.NavigationAgent3D.mb_get_debug_path_custom_color == null) gdext.classes.NavigationAgent3D.mb_get_debug_path_custom_color = MethodBind.get("NavigationAgent3D", "get_debug_path_custom_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.NavigationAgent3D.mb_get_debug_path_custom_color, livePtr)
  }

  /** NavigationAgent3D.set_debug_path_custom_point_size */
  final def setDebugPathCustomPointSize(point_size: Double): Unit = {
    if (gdext.classes.NavigationAgent3D.mb_set_debug_path_custom_point_size == null) gdext.classes.NavigationAgent3D.mb_set_debug_path_custom_point_size = MethodBind.get("NavigationAgent3D", "set_debug_path_custom_point_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent3D.mb_set_debug_path_custom_point_size, livePtr, point_size)
  }

  /** NavigationAgent3D.get_debug_path_custom_point_size */
  final def getDebugPathCustomPointSize(): Double = {
    if (gdext.classes.NavigationAgent3D.mb_get_debug_path_custom_point_size == null) gdext.classes.NavigationAgent3D.mb_get_debug_path_custom_point_size = MethodBind.get("NavigationAgent3D", "get_debug_path_custom_point_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent3D.mb_get_debug_path_custom_point_size, livePtr)
  }

}

object NavigationAgent3D {
  private[classes] var mb_set_avoidance_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_avoidance_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_desired_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_desired_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_target_desired_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_target_desired_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_height_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_height_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_3d_avoidance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_3d_avoidance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_keep_y_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_keep_y_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_neighbor_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_neighbor_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_neighbors: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_neighbors: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_time_horizon_agents: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_time_horizon_agents: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_time_horizon_obstacles: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_time_horizon_obstacles: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_max_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_max_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_navigation_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_navigation_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_navigation_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_navigation_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pathfinding_algorithm: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pathfinding_algorithm: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_postprocessing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_postprocessing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_metadata_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_metadata_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_target_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_target_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_simplify_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_simplify_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_simplify_epsilon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_simplify_epsilon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_return_max_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_return_max_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_return_max_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_return_max_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_search_max_polygons: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_search_max_polygons: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_search_max_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_search_max_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_next_path_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_velocity_forced: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_distance_to_target: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_navigation_result: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_navigation_path_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_target_reached: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_target_reachable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_navigation_finished: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_final_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_avoidance_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_avoidance_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_avoidance_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_avoidance_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_avoidance_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_avoidance_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_avoidance_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_avoidance_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_avoidance_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_avoidance_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_debug_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_use_custom: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_debug_use_custom: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_path_custom_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_debug_path_custom_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_path_custom_point_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_debug_path_custom_point_size: GDExtensionMethodBindPtr = null
}
