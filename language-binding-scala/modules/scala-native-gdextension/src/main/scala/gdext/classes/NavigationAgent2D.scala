package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationAgent2D`, extends `Node`. */
abstract class NavigationAgent2D extends Node {
  override def godotClassName: String = "NavigationAgent2D"

  /** NavigationAgent2D.set_avoidance_enabled */
  final def setAvoidanceEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_avoidance_enabled == null) gdext.classes.NavigationAgent2D.mb_set_avoidance_enabled = MethodBind.get("NavigationAgent2D", "set_avoidance_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_avoidance_enabled, livePtr, enabled)
  }

  /** NavigationAgent2D.get_avoidance_enabled */
  final def getAvoidanceEnabled(): Boolean = {
    if (gdext.classes.NavigationAgent2D.mb_get_avoidance_enabled == null) gdext.classes.NavigationAgent2D.mb_get_avoidance_enabled = MethodBind.get("NavigationAgent2D", "get_avoidance_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationAgent2D.mb_get_avoidance_enabled, livePtr)
  }

  /** NavigationAgent2D.set_path_desired_distance */
  final def setPathDesiredDistance(desiredDistance: Double): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_path_desired_distance == null) gdext.classes.NavigationAgent2D.mb_set_path_desired_distance = MethodBind.get("NavigationAgent2D", "set_path_desired_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_path_desired_distance, livePtr, desiredDistance)
  }

  /** NavigationAgent2D.get_path_desired_distance */
  final def getPathDesiredDistance(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_get_path_desired_distance == null) gdext.classes.NavigationAgent2D.mb_get_path_desired_distance = MethodBind.get("NavigationAgent2D", "get_path_desired_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_get_path_desired_distance, livePtr)
  }

  /** NavigationAgent2D.set_target_desired_distance */
  final def setTargetDesiredDistance(desiredDistance: Double): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_target_desired_distance == null) gdext.classes.NavigationAgent2D.mb_set_target_desired_distance = MethodBind.get("NavigationAgent2D", "set_target_desired_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_target_desired_distance, livePtr, desiredDistance)
  }

  /** NavigationAgent2D.get_target_desired_distance */
  final def getTargetDesiredDistance(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_get_target_desired_distance == null) gdext.classes.NavigationAgent2D.mb_get_target_desired_distance = MethodBind.get("NavigationAgent2D", "get_target_desired_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_get_target_desired_distance, livePtr)
  }

  /** NavigationAgent2D.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_radius == null) gdext.classes.NavigationAgent2D.mb_set_radius = MethodBind.get("NavigationAgent2D", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_radius, livePtr, radius)
  }

  /** NavigationAgent2D.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_get_radius == null) gdext.classes.NavigationAgent2D.mb_get_radius = MethodBind.get("NavigationAgent2D", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_get_radius, livePtr)
  }

  /** NavigationAgent2D.set_neighbor_distance */
  final def setNeighborDistance(neighborDistance: Double): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_neighbor_distance == null) gdext.classes.NavigationAgent2D.mb_set_neighbor_distance = MethodBind.get("NavigationAgent2D", "set_neighbor_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_neighbor_distance, livePtr, neighborDistance)
  }

  /** NavigationAgent2D.get_neighbor_distance */
  final def getNeighborDistance(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_get_neighbor_distance == null) gdext.classes.NavigationAgent2D.mb_get_neighbor_distance = MethodBind.get("NavigationAgent2D", "get_neighbor_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_get_neighbor_distance, livePtr)
  }

  /** NavigationAgent2D.set_max_neighbors */
  final def setMaxNeighbors(maxNeighbors: Long): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_max_neighbors == null) gdext.classes.NavigationAgent2D.mb_set_max_neighbors = MethodBind.get("NavigationAgent2D", "set_max_neighbors", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_max_neighbors, livePtr, maxNeighbors)
  }

  /** NavigationAgent2D.get_max_neighbors */
  final def getMaxNeighbors(): Long = {
    if (gdext.classes.NavigationAgent2D.mb_get_max_neighbors == null) gdext.classes.NavigationAgent2D.mb_get_max_neighbors = MethodBind.get("NavigationAgent2D", "get_max_neighbors", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationAgent2D.mb_get_max_neighbors, livePtr)
  }

  /** NavigationAgent2D.set_time_horizon_agents */
  final def setTimeHorizonAgents(timeHorizon: Double): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_time_horizon_agents == null) gdext.classes.NavigationAgent2D.mb_set_time_horizon_agents = MethodBind.get("NavigationAgent2D", "set_time_horizon_agents", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_time_horizon_agents, livePtr, timeHorizon)
  }

  /** NavigationAgent2D.get_time_horizon_agents */
  final def getTimeHorizonAgents(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_get_time_horizon_agents == null) gdext.classes.NavigationAgent2D.mb_get_time_horizon_agents = MethodBind.get("NavigationAgent2D", "get_time_horizon_agents", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_get_time_horizon_agents, livePtr)
  }

  /** NavigationAgent2D.set_time_horizon_obstacles */
  final def setTimeHorizonObstacles(timeHorizon: Double): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_time_horizon_obstacles == null) gdext.classes.NavigationAgent2D.mb_set_time_horizon_obstacles = MethodBind.get("NavigationAgent2D", "set_time_horizon_obstacles", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_time_horizon_obstacles, livePtr, timeHorizon)
  }

  /** NavigationAgent2D.get_time_horizon_obstacles */
  final def getTimeHorizonObstacles(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_get_time_horizon_obstacles == null) gdext.classes.NavigationAgent2D.mb_get_time_horizon_obstacles = MethodBind.get("NavigationAgent2D", "get_time_horizon_obstacles", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_get_time_horizon_obstacles, livePtr)
  }

  /** NavigationAgent2D.set_max_speed */
  final def setMaxSpeed(maxSpeed: Double): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_max_speed == null) gdext.classes.NavigationAgent2D.mb_set_max_speed = MethodBind.get("NavigationAgent2D", "set_max_speed", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_max_speed, livePtr, maxSpeed)
  }

  /** NavigationAgent2D.get_max_speed */
  final def getMaxSpeed(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_get_max_speed == null) gdext.classes.NavigationAgent2D.mb_get_max_speed = MethodBind.get("NavigationAgent2D", "get_max_speed", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_get_max_speed, livePtr)
  }

  /** NavigationAgent2D.set_path_max_distance */
  final def setPathMaxDistance(maxSpeed: Double): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_path_max_distance == null) gdext.classes.NavigationAgent2D.mb_set_path_max_distance = MethodBind.get("NavigationAgent2D", "set_path_max_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_path_max_distance, livePtr, maxSpeed)
  }

  /** NavigationAgent2D.get_path_max_distance */
  final def getPathMaxDistance(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_get_path_max_distance == null) gdext.classes.NavigationAgent2D.mb_get_path_max_distance = MethodBind.get("NavigationAgent2D", "get_path_max_distance", 191475506L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_get_path_max_distance, livePtr)
  }

  /** NavigationAgent2D.set_navigation_layers */
  final def setNavigationLayers(navigationLayers: Long): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_navigation_layers == null) gdext.classes.NavigationAgent2D.mb_set_navigation_layers = MethodBind.get("NavigationAgent2D", "set_navigation_layers", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_navigation_layers, livePtr, navigationLayers)
  }

  /** NavigationAgent2D.get_navigation_layers */
  final def getNavigationLayers(): Long = {
    if (gdext.classes.NavigationAgent2D.mb_get_navigation_layers == null) gdext.classes.NavigationAgent2D.mb_get_navigation_layers = MethodBind.get("NavigationAgent2D", "get_navigation_layers", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationAgent2D.mb_get_navigation_layers, livePtr)
  }

  /** NavigationAgent2D.set_navigation_layer_value */
  final def setNavigationLayerValue(layerNumber: Long, value: Boolean): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_navigation_layer_value == null) gdext.classes.NavigationAgent2D.mb_set_navigation_layer_value = MethodBind.get("NavigationAgent2D", "set_navigation_layer_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.NavigationAgent2D.mb_set_navigation_layer_value, livePtr, layerNumber, value)
  }

  /** NavigationAgent2D.get_navigation_layer_value */
  final def getNavigationLayerValue(layerNumber: Long): Boolean = {
    if (gdext.classes.NavigationAgent2D.mb_get_navigation_layer_value == null) gdext.classes.NavigationAgent2D.mb_get_navigation_layer_value = MethodBind.get("NavigationAgent2D", "get_navigation_layer_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NavigationAgent2D.mb_get_navigation_layer_value, livePtr, layerNumber)
  }

  /** NavigationAgent2D.set_pathfinding_algorithm */
  final def setPathfindingAlgorithm(pathfindingAlgorithm: gdext.classes.NavigationPathQueryParameters2D.PathfindingAlgorithm): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_pathfinding_algorithm == null) gdext.classes.NavigationAgent2D.mb_set_pathfinding_algorithm = MethodBind.get("NavigationAgent2D", "set_pathfinding_algorithm", 2783519915L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_pathfinding_algorithm, livePtr, pathfindingAlgorithm)
  }

  /** NavigationAgent2D.get_pathfinding_algorithm */
  final def getPathfindingAlgorithm(): gdext.classes.NavigationPathQueryParameters2D.PathfindingAlgorithm = {
    if (gdext.classes.NavigationAgent2D.mb_get_pathfinding_algorithm == null) gdext.classes.NavigationAgent2D.mb_get_pathfinding_algorithm = MethodBind.get("NavigationAgent2D", "get_pathfinding_algorithm", 3000421146L)
    gdext.classes.NavigationPathQueryParameters2D.PathfindingAlgorithm(Ptrcall.call0[Long](gdext.classes.NavigationAgent2D.mb_get_pathfinding_algorithm, livePtr))
  }

  /** NavigationAgent2D.set_path_postprocessing */
  final def setPathPostprocessing(pathPostprocessing: gdext.classes.NavigationPathQueryParameters2D.PathPostProcessing): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_path_postprocessing == null) gdext.classes.NavigationAgent2D.mb_set_path_postprocessing = MethodBind.get("NavigationAgent2D", "set_path_postprocessing", 2864409082L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_path_postprocessing, livePtr, pathPostprocessing)
  }

  /** NavigationAgent2D.get_path_postprocessing */
  final def getPathPostprocessing(): gdext.classes.NavigationPathQueryParameters2D.PathPostProcessing = {
    if (gdext.classes.NavigationAgent2D.mb_get_path_postprocessing == null) gdext.classes.NavigationAgent2D.mb_get_path_postprocessing = MethodBind.get("NavigationAgent2D", "get_path_postprocessing", 3798118993L)
    gdext.classes.NavigationPathQueryParameters2D.PathPostProcessing(Ptrcall.call0[Long](gdext.classes.NavigationAgent2D.mb_get_path_postprocessing, livePtr))
  }

  /** NavigationAgent2D.set_path_metadata_flags */
  final def setPathMetadataFlags(flags: gdext.classes.NavigationPathQueryParameters2D.PathMetadataFlags): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_path_metadata_flags == null) gdext.classes.NavigationAgent2D.mb_set_path_metadata_flags = MethodBind.get("NavigationAgent2D", "set_path_metadata_flags", 24274129L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_path_metadata_flags, livePtr, flags.asInstanceOf[Long])
  }

  /** NavigationAgent2D.get_path_metadata_flags */
  final def getPathMetadataFlags(): gdext.classes.NavigationPathQueryParameters2D.PathMetadataFlags = {
    if (gdext.classes.NavigationAgent2D.mb_get_path_metadata_flags == null) gdext.classes.NavigationAgent2D.mb_get_path_metadata_flags = MethodBind.get("NavigationAgent2D", "get_path_metadata_flags", 488152976L)
    gdext.classes.NavigationPathQueryParameters2D.PathMetadataFlags(Ptrcall.call0[Long](gdext.classes.NavigationAgent2D.mb_get_path_metadata_flags, livePtr))
  }

  /** NavigationAgent2D.set_target_position */
  final def setTargetPosition(position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_target_position == null) gdext.classes.NavigationAgent2D.mb_set_target_position = MethodBind.get("NavigationAgent2D", "set_target_position", 743155724L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_target_position, livePtr, position)
  }

  /** NavigationAgent2D.get_target_position */
  final def getTargetPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.NavigationAgent2D.mb_get_target_position == null) gdext.classes.NavigationAgent2D.mb_get_target_position = MethodBind.get("NavigationAgent2D", "get_target_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.NavigationAgent2D.mb_get_target_position, livePtr)
  }

  /** NavigationAgent2D.set_simplify_path */
  final def setSimplifyPath(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_simplify_path == null) gdext.classes.NavigationAgent2D.mb_set_simplify_path = MethodBind.get("NavigationAgent2D", "set_simplify_path", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_simplify_path, livePtr, enabled)
  }

  /** NavigationAgent2D.get_simplify_path */
  final def getSimplifyPath(): Boolean = {
    if (gdext.classes.NavigationAgent2D.mb_get_simplify_path == null) gdext.classes.NavigationAgent2D.mb_get_simplify_path = MethodBind.get("NavigationAgent2D", "get_simplify_path", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationAgent2D.mb_get_simplify_path, livePtr)
  }

  /** NavigationAgent2D.set_simplify_epsilon */
  final def setSimplifyEpsilon(epsilon: Double): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_simplify_epsilon == null) gdext.classes.NavigationAgent2D.mb_set_simplify_epsilon = MethodBind.get("NavigationAgent2D", "set_simplify_epsilon", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_simplify_epsilon, livePtr, epsilon)
  }

  /** NavigationAgent2D.get_simplify_epsilon */
  final def getSimplifyEpsilon(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_get_simplify_epsilon == null) gdext.classes.NavigationAgent2D.mb_get_simplify_epsilon = MethodBind.get("NavigationAgent2D", "get_simplify_epsilon", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_get_simplify_epsilon, livePtr)
  }

  /** NavigationAgent2D.set_path_return_max_length */
  final def setPathReturnMaxLength(length: Double): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_path_return_max_length == null) gdext.classes.NavigationAgent2D.mb_set_path_return_max_length = MethodBind.get("NavigationAgent2D", "set_path_return_max_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_path_return_max_length, livePtr, length)
  }

  /** NavigationAgent2D.get_path_return_max_length */
  final def getPathReturnMaxLength(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_get_path_return_max_length == null) gdext.classes.NavigationAgent2D.mb_get_path_return_max_length = MethodBind.get("NavigationAgent2D", "get_path_return_max_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_get_path_return_max_length, livePtr)
  }

  /** NavigationAgent2D.set_path_return_max_radius */
  final def setPathReturnMaxRadius(radius: Double): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_path_return_max_radius == null) gdext.classes.NavigationAgent2D.mb_set_path_return_max_radius = MethodBind.get("NavigationAgent2D", "set_path_return_max_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_path_return_max_radius, livePtr, radius)
  }

  /** NavigationAgent2D.get_path_return_max_radius */
  final def getPathReturnMaxRadius(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_get_path_return_max_radius == null) gdext.classes.NavigationAgent2D.mb_get_path_return_max_radius = MethodBind.get("NavigationAgent2D", "get_path_return_max_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_get_path_return_max_radius, livePtr)
  }

  /** NavigationAgent2D.set_path_search_max_polygons */
  final def setPathSearchMaxPolygons(maxPolygons: Long): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_path_search_max_polygons == null) gdext.classes.NavigationAgent2D.mb_set_path_search_max_polygons = MethodBind.get("NavigationAgent2D", "set_path_search_max_polygons", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_path_search_max_polygons, livePtr, maxPolygons)
  }

  /** NavigationAgent2D.get_path_search_max_polygons */
  final def getPathSearchMaxPolygons(): Long = {
    if (gdext.classes.NavigationAgent2D.mb_get_path_search_max_polygons == null) gdext.classes.NavigationAgent2D.mb_get_path_search_max_polygons = MethodBind.get("NavigationAgent2D", "get_path_search_max_polygons", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationAgent2D.mb_get_path_search_max_polygons, livePtr)
  }

  /** NavigationAgent2D.set_path_search_max_distance */
  final def setPathSearchMaxDistance(distance: Double): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_path_search_max_distance == null) gdext.classes.NavigationAgent2D.mb_set_path_search_max_distance = MethodBind.get("NavigationAgent2D", "set_path_search_max_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_path_search_max_distance, livePtr, distance)
  }

  /** NavigationAgent2D.get_path_search_max_distance */
  final def getPathSearchMaxDistance(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_get_path_search_max_distance == null) gdext.classes.NavigationAgent2D.mb_get_path_search_max_distance = MethodBind.get("NavigationAgent2D", "get_path_search_max_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_get_path_search_max_distance, livePtr)
  }

  /** NavigationAgent2D.get_path_length */
  final def getPathLength(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_get_path_length == null) gdext.classes.NavigationAgent2D.mb_get_path_length = MethodBind.get("NavigationAgent2D", "get_path_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_get_path_length, livePtr)
  }

  /** NavigationAgent2D.get_next_path_position */
  final def getNextPathPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.NavigationAgent2D.mb_get_next_path_position == null) gdext.classes.NavigationAgent2D.mb_get_next_path_position = MethodBind.get("NavigationAgent2D", "get_next_path_position", 1497962370L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.NavigationAgent2D.mb_get_next_path_position, livePtr)
  }

  /** NavigationAgent2D.set_velocity_forced */
  final def setVelocityForced(velocity: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_velocity_forced == null) gdext.classes.NavigationAgent2D.mb_set_velocity_forced = MethodBind.get("NavigationAgent2D", "set_velocity_forced", 743155724L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_velocity_forced, livePtr, velocity)
  }

  /** NavigationAgent2D.set_velocity */
  final def setVelocity(velocity: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_velocity == null) gdext.classes.NavigationAgent2D.mb_set_velocity = MethodBind.get("NavigationAgent2D", "set_velocity", 743155724L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_velocity, livePtr, velocity)
  }

  /** NavigationAgent2D.get_velocity */
  final def getVelocity(): gdext.builtin.Vector2 = {
    if (gdext.classes.NavigationAgent2D.mb_get_velocity == null) gdext.classes.NavigationAgent2D.mb_get_velocity = MethodBind.get("NavigationAgent2D", "get_velocity", 1497962370L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.NavigationAgent2D.mb_get_velocity, livePtr)
  }

  /** NavigationAgent2D.distance_to_target */
  final def distanceToTarget(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_distance_to_target == null) gdext.classes.NavigationAgent2D.mb_distance_to_target = MethodBind.get("NavigationAgent2D", "distance_to_target", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_distance_to_target, livePtr)
  }

  /** NavigationAgent2D.get_current_navigation_result. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCurrentNavigationResult(): NavigationPathQueryResult2D = {
    if (gdext.classes.NavigationAgent2D.mb_get_current_navigation_result == null) gdext.classes.NavigationAgent2D.mb_get_current_navigation_result = MethodBind.get("NavigationAgent2D", "get_current_navigation_result", 166799483L)
    Wrappers.owned[NavigationPathQueryResult2D](Ptrcall.call0[Long](gdext.classes.NavigationAgent2D.mb_get_current_navigation_result, livePtr))
  }

  /** NavigationAgent2D.get_current_navigation_path_index */
  final def getCurrentNavigationPathIndex(): Long = {
    if (gdext.classes.NavigationAgent2D.mb_get_current_navigation_path_index == null) gdext.classes.NavigationAgent2D.mb_get_current_navigation_path_index = MethodBind.get("NavigationAgent2D", "get_current_navigation_path_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationAgent2D.mb_get_current_navigation_path_index, livePtr)
  }

  /** NavigationAgent2D.is_target_reached */
  final def isTargetReached(): Boolean = {
    if (gdext.classes.NavigationAgent2D.mb_is_target_reached == null) gdext.classes.NavigationAgent2D.mb_is_target_reached = MethodBind.get("NavigationAgent2D", "is_target_reached", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationAgent2D.mb_is_target_reached, livePtr)
  }

  /** NavigationAgent2D.is_target_reachable */
  final def isTargetReachable(): Boolean = {
    if (gdext.classes.NavigationAgent2D.mb_is_target_reachable == null) gdext.classes.NavigationAgent2D.mb_is_target_reachable = MethodBind.get("NavigationAgent2D", "is_target_reachable", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationAgent2D.mb_is_target_reachable, livePtr)
  }

  /** NavigationAgent2D.is_navigation_finished */
  final def isNavigationFinished(): Boolean = {
    if (gdext.classes.NavigationAgent2D.mb_is_navigation_finished == null) gdext.classes.NavigationAgent2D.mb_is_navigation_finished = MethodBind.get("NavigationAgent2D", "is_navigation_finished", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationAgent2D.mb_is_navigation_finished, livePtr)
  }

  /** NavigationAgent2D.get_final_position */
  final def getFinalPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.NavigationAgent2D.mb_get_final_position == null) gdext.classes.NavigationAgent2D.mb_get_final_position = MethodBind.get("NavigationAgent2D", "get_final_position", 1497962370L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.NavigationAgent2D.mb_get_final_position, livePtr)
  }

  /** NavigationAgent2D.set_avoidance_layers */
  final def setAvoidanceLayers(layers: Long): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_avoidance_layers == null) gdext.classes.NavigationAgent2D.mb_set_avoidance_layers = MethodBind.get("NavigationAgent2D", "set_avoidance_layers", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_avoidance_layers, livePtr, layers)
  }

  /** NavigationAgent2D.get_avoidance_layers */
  final def getAvoidanceLayers(): Long = {
    if (gdext.classes.NavigationAgent2D.mb_get_avoidance_layers == null) gdext.classes.NavigationAgent2D.mb_get_avoidance_layers = MethodBind.get("NavigationAgent2D", "get_avoidance_layers", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationAgent2D.mb_get_avoidance_layers, livePtr)
  }

  /** NavigationAgent2D.set_avoidance_mask */
  final def setAvoidanceMask(mask: Long): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_avoidance_mask == null) gdext.classes.NavigationAgent2D.mb_set_avoidance_mask = MethodBind.get("NavigationAgent2D", "set_avoidance_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_avoidance_mask, livePtr, mask)
  }

  /** NavigationAgent2D.get_avoidance_mask */
  final def getAvoidanceMask(): Long = {
    if (gdext.classes.NavigationAgent2D.mb_get_avoidance_mask == null) gdext.classes.NavigationAgent2D.mb_get_avoidance_mask = MethodBind.get("NavigationAgent2D", "get_avoidance_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationAgent2D.mb_get_avoidance_mask, livePtr)
  }

  /** NavigationAgent2D.set_avoidance_layer_value */
  final def setAvoidanceLayerValue(layerNumber: Long, value: Boolean): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_avoidance_layer_value == null) gdext.classes.NavigationAgent2D.mb_set_avoidance_layer_value = MethodBind.get("NavigationAgent2D", "set_avoidance_layer_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.NavigationAgent2D.mb_set_avoidance_layer_value, livePtr, layerNumber, value)
  }

  /** NavigationAgent2D.get_avoidance_layer_value */
  final def getAvoidanceLayerValue(layerNumber: Long): Boolean = {
    if (gdext.classes.NavigationAgent2D.mb_get_avoidance_layer_value == null) gdext.classes.NavigationAgent2D.mb_get_avoidance_layer_value = MethodBind.get("NavigationAgent2D", "get_avoidance_layer_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NavigationAgent2D.mb_get_avoidance_layer_value, livePtr, layerNumber)
  }

  /** NavigationAgent2D.set_avoidance_mask_value */
  final def setAvoidanceMaskValue(maskNumber: Long, value: Boolean): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_avoidance_mask_value == null) gdext.classes.NavigationAgent2D.mb_set_avoidance_mask_value = MethodBind.get("NavigationAgent2D", "set_avoidance_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.NavigationAgent2D.mb_set_avoidance_mask_value, livePtr, maskNumber, value)
  }

  /** NavigationAgent2D.get_avoidance_mask_value */
  final def getAvoidanceMaskValue(maskNumber: Long): Boolean = {
    if (gdext.classes.NavigationAgent2D.mb_get_avoidance_mask_value == null) gdext.classes.NavigationAgent2D.mb_get_avoidance_mask_value = MethodBind.get("NavigationAgent2D", "get_avoidance_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NavigationAgent2D.mb_get_avoidance_mask_value, livePtr, maskNumber)
  }

  /** NavigationAgent2D.set_avoidance_priority */
  final def setAvoidancePriority(priority: Double): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_avoidance_priority == null) gdext.classes.NavigationAgent2D.mb_set_avoidance_priority = MethodBind.get("NavigationAgent2D", "set_avoidance_priority", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_avoidance_priority, livePtr, priority)
  }

  /** NavigationAgent2D.get_avoidance_priority */
  final def getAvoidancePriority(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_get_avoidance_priority == null) gdext.classes.NavigationAgent2D.mb_get_avoidance_priority = MethodBind.get("NavigationAgent2D", "get_avoidance_priority", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_get_avoidance_priority, livePtr)
  }

  /** NavigationAgent2D.set_debug_enabled */
  final def setDebugEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_debug_enabled == null) gdext.classes.NavigationAgent2D.mb_set_debug_enabled = MethodBind.get("NavigationAgent2D", "set_debug_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_debug_enabled, livePtr, enabled)
  }

  /** NavigationAgent2D.get_debug_enabled */
  final def getDebugEnabled(): Boolean = {
    if (gdext.classes.NavigationAgent2D.mb_get_debug_enabled == null) gdext.classes.NavigationAgent2D.mb_get_debug_enabled = MethodBind.get("NavigationAgent2D", "get_debug_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationAgent2D.mb_get_debug_enabled, livePtr)
  }

  /** NavigationAgent2D.set_debug_use_custom */
  final def setDebugUseCustom(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_debug_use_custom == null) gdext.classes.NavigationAgent2D.mb_set_debug_use_custom = MethodBind.get("NavigationAgent2D", "set_debug_use_custom", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_debug_use_custom, livePtr, enabled)
  }

  /** NavigationAgent2D.get_debug_use_custom */
  final def getDebugUseCustom(): Boolean = {
    if (gdext.classes.NavigationAgent2D.mb_get_debug_use_custom == null) gdext.classes.NavigationAgent2D.mb_get_debug_use_custom = MethodBind.get("NavigationAgent2D", "get_debug_use_custom", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationAgent2D.mb_get_debug_use_custom, livePtr)
  }

  /** NavigationAgent2D.set_debug_path_custom_color */
  final def setDebugPathCustomColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_debug_path_custom_color == null) gdext.classes.NavigationAgent2D.mb_set_debug_path_custom_color = MethodBind.get("NavigationAgent2D", "set_debug_path_custom_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_debug_path_custom_color, livePtr, color)
  }

  /** NavigationAgent2D.get_debug_path_custom_color */
  final def getDebugPathCustomColor(): gdext.builtin.Color = {
    if (gdext.classes.NavigationAgent2D.mb_get_debug_path_custom_color == null) gdext.classes.NavigationAgent2D.mb_get_debug_path_custom_color = MethodBind.get("NavigationAgent2D", "get_debug_path_custom_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.NavigationAgent2D.mb_get_debug_path_custom_color, livePtr)
  }

  /** NavigationAgent2D.set_debug_path_custom_point_size */
  final def setDebugPathCustomPointSize(pointSize: Double): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_debug_path_custom_point_size == null) gdext.classes.NavigationAgent2D.mb_set_debug_path_custom_point_size = MethodBind.get("NavigationAgent2D", "set_debug_path_custom_point_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_debug_path_custom_point_size, livePtr, pointSize)
  }

  /** NavigationAgent2D.get_debug_path_custom_point_size */
  final def getDebugPathCustomPointSize(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_get_debug_path_custom_point_size == null) gdext.classes.NavigationAgent2D.mb_get_debug_path_custom_point_size = MethodBind.get("NavigationAgent2D", "get_debug_path_custom_point_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_get_debug_path_custom_point_size, livePtr)
  }

  /** NavigationAgent2D.set_debug_path_custom_line_width */
  final def setDebugPathCustomLineWidth(lineWidth: Double): Unit = {
    if (gdext.classes.NavigationAgent2D.mb_set_debug_path_custom_line_width == null) gdext.classes.NavigationAgent2D.mb_set_debug_path_custom_line_width = MethodBind.get("NavigationAgent2D", "set_debug_path_custom_line_width", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationAgent2D.mb_set_debug_path_custom_line_width, livePtr, lineWidth)
  }

  /** NavigationAgent2D.get_debug_path_custom_line_width */
  final def getDebugPathCustomLineWidth(): Double = {
    if (gdext.classes.NavigationAgent2D.mb_get_debug_path_custom_line_width == null) gdext.classes.NavigationAgent2D.mb_get_debug_path_custom_line_width = MethodBind.get("NavigationAgent2D", "get_debug_path_custom_line_width", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationAgent2D.mb_get_debug_path_custom_line_width, livePtr)
  }

}

object NavigationAgent2D {
  private[classes] var mb_set_avoidance_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_avoidance_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_desired_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_desired_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_target_desired_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_target_desired_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
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
  private[classes] var mb_set_debug_path_custom_line_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_debug_path_custom_line_width: GDExtensionMethodBindPtr = null
}
