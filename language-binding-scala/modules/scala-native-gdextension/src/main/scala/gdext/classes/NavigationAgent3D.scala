package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationAgent3D`, extends `Node`. */
abstract class NavigationAgent3D extends Node {

  /** NavigationAgent3D.set_avoidance_enabled */
  final def setAvoidanceEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_avoidance_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationAgent3D.get_avoidance_enabled */
  final def getAvoidanceEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationAgent3D", "get_avoidance_enabled", 36873697L), hostObject.objectPtr)

  /** NavigationAgent3D.set_path_desired_distance */
  final def setPathDesiredDistance(desired_distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_path_desired_distance", 373806689L), hostObject.objectPtr, desired_distance)

  /** NavigationAgent3D.get_path_desired_distance */
  final def getPathDesiredDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_path_desired_distance", 1740695150L), hostObject.objectPtr)

  /** NavigationAgent3D.set_target_desired_distance */
  final def setTargetDesiredDistance(desired_distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_target_desired_distance", 373806689L), hostObject.objectPtr, desired_distance)

  /** NavigationAgent3D.get_target_desired_distance */
  final def getTargetDesiredDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_target_desired_distance", 1740695150L), hostObject.objectPtr)

  /** NavigationAgent3D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** NavigationAgent3D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_radius", 1740695150L), hostObject.objectPtr)

  /** NavigationAgent3D.set_height */
  final def setHeight(height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_height", 373806689L), hostObject.objectPtr, height)

  /** NavigationAgent3D.get_height */
  final def getHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_height", 1740695150L), hostObject.objectPtr)

  /** NavigationAgent3D.set_path_height_offset */
  final def setPathHeightOffset(path_height_offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_path_height_offset", 373806689L), hostObject.objectPtr, path_height_offset)

  /** NavigationAgent3D.get_path_height_offset */
  final def getPathHeightOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_path_height_offset", 1740695150L), hostObject.objectPtr)

  /** NavigationAgent3D.set_use_3d_avoidance */
  final def setUse3dAvoidance(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_use_3d_avoidance", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationAgent3D.get_use_3d_avoidance */
  final def getUse3dAvoidance(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationAgent3D", "get_use_3d_avoidance", 36873697L), hostObject.objectPtr)

  /** NavigationAgent3D.set_keep_y_velocity */
  final def setKeepYVelocity(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_keep_y_velocity", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationAgent3D.get_keep_y_velocity */
  final def getKeepYVelocity(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationAgent3D", "get_keep_y_velocity", 36873697L), hostObject.objectPtr)

  /** NavigationAgent3D.set_neighbor_distance */
  final def setNeighborDistance(neighbor_distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_neighbor_distance", 373806689L), hostObject.objectPtr, neighbor_distance)

  /** NavigationAgent3D.get_neighbor_distance */
  final def getNeighborDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_neighbor_distance", 1740695150L), hostObject.objectPtr)

  /** NavigationAgent3D.set_max_neighbors */
  final def setMaxNeighbors(max_neighbors: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_max_neighbors", 1286410249L), hostObject.objectPtr, max_neighbors)

  /** NavigationAgent3D.get_max_neighbors */
  final def getMaxNeighbors(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationAgent3D", "get_max_neighbors", 3905245786L), hostObject.objectPtr)

  /** NavigationAgent3D.set_time_horizon_agents */
  final def setTimeHorizonAgents(time_horizon: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_time_horizon_agents", 373806689L), hostObject.objectPtr, time_horizon)

  /** NavigationAgent3D.get_time_horizon_agents */
  final def getTimeHorizonAgents(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_time_horizon_agents", 1740695150L), hostObject.objectPtr)

  /** NavigationAgent3D.set_time_horizon_obstacles */
  final def setTimeHorizonObstacles(time_horizon: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_time_horizon_obstacles", 373806689L), hostObject.objectPtr, time_horizon)

  /** NavigationAgent3D.get_time_horizon_obstacles */
  final def getTimeHorizonObstacles(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_time_horizon_obstacles", 1740695150L), hostObject.objectPtr)

  /** NavigationAgent3D.set_max_speed */
  final def setMaxSpeed(max_speed: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_max_speed", 373806689L), hostObject.objectPtr, max_speed)

  /** NavigationAgent3D.get_max_speed */
  final def getMaxSpeed(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_max_speed", 1740695150L), hostObject.objectPtr)

  /** NavigationAgent3D.set_path_max_distance */
  final def setPathMaxDistance(max_speed: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_path_max_distance", 373806689L), hostObject.objectPtr, max_speed)

  /** NavigationAgent3D.get_path_max_distance */
  final def getPathMaxDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_path_max_distance", 191475506L), hostObject.objectPtr)

  /** NavigationAgent3D.set_navigation_layers */
  final def setNavigationLayers(navigation_layers: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_navigation_layers", 1286410249L), hostObject.objectPtr, navigation_layers)

  /** NavigationAgent3D.get_navigation_layers */
  final def getNavigationLayers(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationAgent3D", "get_navigation_layers", 3905245786L), hostObject.objectPtr)

  /** NavigationAgent3D.set_navigation_layer_value */
  final def setNavigationLayerValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationAgent3D", "set_navigation_layer_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** NavigationAgent3D.get_navigation_layer_value */
  final def getNavigationLayerValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("NavigationAgent3D", "get_navigation_layer_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** NavigationAgent3D.set_pathfinding_algorithm */
  final def setPathfindingAlgorithm(pathfinding_algorithm: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_pathfinding_algorithm", 394560454L), hostObject.objectPtr, pathfinding_algorithm)

  /** NavigationAgent3D.get_pathfinding_algorithm */
  final def getPathfindingAlgorithm(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationAgent3D", "get_pathfinding_algorithm", 3398491350L), hostObject.objectPtr)

  /** NavigationAgent3D.set_path_postprocessing */
  final def setPathPostprocessing(path_postprocessing: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_path_postprocessing", 2267362344L), hostObject.objectPtr, path_postprocessing)

  /** NavigationAgent3D.get_path_postprocessing */
  final def getPathPostprocessing(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationAgent3D", "get_path_postprocessing", 3883858360L), hostObject.objectPtr)

  /** NavigationAgent3D.set_path_metadata_flags */
  final def setPathMetadataFlags(flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_path_metadata_flags", 2713846708L), hostObject.objectPtr, flags)

  /** NavigationAgent3D.get_path_metadata_flags */
  final def getPathMetadataFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationAgent3D", "get_path_metadata_flags", 1582332802L), hostObject.objectPtr)

  /** NavigationAgent3D.set_target_position */
  final def setTargetPosition(position: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_target_position", 3460891852L), hostObject.objectPtr, position)

  /** NavigationAgent3D.get_target_position */
  final def getTargetPosition(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("NavigationAgent3D", "get_target_position", 3360562783L), hostObject.objectPtr)

  /** NavigationAgent3D.set_simplify_path */
  final def setSimplifyPath(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_simplify_path", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationAgent3D.get_simplify_path */
  final def getSimplifyPath(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationAgent3D", "get_simplify_path", 36873697L), hostObject.objectPtr)

  /** NavigationAgent3D.set_simplify_epsilon */
  final def setSimplifyEpsilon(epsilon: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_simplify_epsilon", 373806689L), hostObject.objectPtr, epsilon)

  /** NavigationAgent3D.get_simplify_epsilon */
  final def getSimplifyEpsilon(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_simplify_epsilon", 1740695150L), hostObject.objectPtr)

  /** NavigationAgent3D.set_path_return_max_length */
  final def setPathReturnMaxLength(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_path_return_max_length", 373806689L), hostObject.objectPtr, length)

  /** NavigationAgent3D.get_path_return_max_length */
  final def getPathReturnMaxLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_path_return_max_length", 1740695150L), hostObject.objectPtr)

  /** NavigationAgent3D.set_path_return_max_radius */
  final def setPathReturnMaxRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_path_return_max_radius", 373806689L), hostObject.objectPtr, radius)

  /** NavigationAgent3D.get_path_return_max_radius */
  final def getPathReturnMaxRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_path_return_max_radius", 1740695150L), hostObject.objectPtr)

  /** NavigationAgent3D.set_path_search_max_polygons */
  final def setPathSearchMaxPolygons(max_polygons: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_path_search_max_polygons", 1286410249L), hostObject.objectPtr, max_polygons)

  /** NavigationAgent3D.get_path_search_max_polygons */
  final def getPathSearchMaxPolygons(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationAgent3D", "get_path_search_max_polygons", 3905245786L), hostObject.objectPtr)

  /** NavigationAgent3D.set_path_search_max_distance */
  final def setPathSearchMaxDistance(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_path_search_max_distance", 373806689L), hostObject.objectPtr, distance)

  /** NavigationAgent3D.get_path_search_max_distance */
  final def getPathSearchMaxDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_path_search_max_distance", 1740695150L), hostObject.objectPtr)

  /** NavigationAgent3D.get_path_length */
  final def getPathLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_path_length", 1740695150L), hostObject.objectPtr)

  /** NavigationAgent3D.get_next_path_position */
  final def getNextPathPosition(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("NavigationAgent3D", "get_next_path_position", 3783033775L), hostObject.objectPtr)

  /** NavigationAgent3D.set_velocity_forced */
  final def setVelocityForced(velocity: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_velocity_forced", 3460891852L), hostObject.objectPtr, velocity)

  /** NavigationAgent3D.set_velocity */
  final def setVelocity(velocity: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_velocity", 3460891852L), hostObject.objectPtr, velocity)

  /** NavigationAgent3D.get_velocity */
  final def getVelocity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("NavigationAgent3D", "get_velocity", 3783033775L), hostObject.objectPtr)

  /** NavigationAgent3D.distance_to_target */
  final def distanceToTarget(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "distance_to_target", 1740695150L), hostObject.objectPtr)

  /** NavigationAgent3D.get_current_navigation_result */
  final def getCurrentNavigationResult(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("NavigationAgent3D", "get_current_navigation_result", 728825684L), hostObject.objectPtr)

  /** NavigationAgent3D.get_current_navigation_path_index */
  final def getCurrentNavigationPathIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationAgent3D", "get_current_navigation_path_index", 3905245786L), hostObject.objectPtr)

  /** NavigationAgent3D.is_target_reached */
  final def isTargetReached(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationAgent3D", "is_target_reached", 36873697L), hostObject.objectPtr)

  /** NavigationAgent3D.is_target_reachable */
  final def isTargetReachable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationAgent3D", "is_target_reachable", 2240911060L), hostObject.objectPtr)

  /** NavigationAgent3D.is_navigation_finished */
  final def isNavigationFinished(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationAgent3D", "is_navigation_finished", 2240911060L), hostObject.objectPtr)

  /** NavigationAgent3D.get_final_position */
  final def getFinalPosition(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("NavigationAgent3D", "get_final_position", 3783033775L), hostObject.objectPtr)

  /** NavigationAgent3D.set_avoidance_layers */
  final def setAvoidanceLayers(layers: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_avoidance_layers", 1286410249L), hostObject.objectPtr, layers)

  /** NavigationAgent3D.get_avoidance_layers */
  final def getAvoidanceLayers(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationAgent3D", "get_avoidance_layers", 3905245786L), hostObject.objectPtr)

  /** NavigationAgent3D.set_avoidance_mask */
  final def setAvoidanceMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_avoidance_mask", 1286410249L), hostObject.objectPtr, mask)

  /** NavigationAgent3D.get_avoidance_mask */
  final def getAvoidanceMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationAgent3D", "get_avoidance_mask", 3905245786L), hostObject.objectPtr)

  /** NavigationAgent3D.set_avoidance_layer_value */
  final def setAvoidanceLayerValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationAgent3D", "set_avoidance_layer_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** NavigationAgent3D.get_avoidance_layer_value */
  final def getAvoidanceLayerValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("NavigationAgent3D", "get_avoidance_layer_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** NavigationAgent3D.set_avoidance_mask_value */
  final def setAvoidanceMaskValue(mask_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationAgent3D", "set_avoidance_mask_value", 300928843L), hostObject.objectPtr, mask_number, value)

  /** NavigationAgent3D.get_avoidance_mask_value */
  final def getAvoidanceMaskValue(mask_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("NavigationAgent3D", "get_avoidance_mask_value", 1116898809L), hostObject.objectPtr, mask_number)

  /** NavigationAgent3D.set_avoidance_priority */
  final def setAvoidancePriority(priority: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_avoidance_priority", 373806689L), hostObject.objectPtr, priority)

  /** NavigationAgent3D.get_avoidance_priority */
  final def getAvoidancePriority(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_avoidance_priority", 1740695150L), hostObject.objectPtr)

  /** NavigationAgent3D.set_debug_enabled */
  final def setDebugEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_debug_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationAgent3D.get_debug_enabled */
  final def getDebugEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationAgent3D", "get_debug_enabled", 36873697L), hostObject.objectPtr)

  /** NavigationAgent3D.set_debug_use_custom */
  final def setDebugUseCustom(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_debug_use_custom", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationAgent3D.get_debug_use_custom */
  final def getDebugUseCustom(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationAgent3D", "get_debug_use_custom", 36873697L), hostObject.objectPtr)

  /** NavigationAgent3D.set_debug_path_custom_color */
  final def setDebugPathCustomColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_debug_path_custom_color", 2920490490L), hostObject.objectPtr, color)

  /** NavigationAgent3D.get_debug_path_custom_color */
  final def getDebugPathCustomColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("NavigationAgent3D", "get_debug_path_custom_color", 3444240500L), hostObject.objectPtr)

  /** NavigationAgent3D.set_debug_path_custom_point_size */
  final def setDebugPathCustomPointSize(point_size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationAgent3D", "set_debug_path_custom_point_size", 373806689L), hostObject.objectPtr, point_size)

  /** NavigationAgent3D.get_debug_path_custom_point_size */
  final def getDebugPathCustomPointSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationAgent3D", "get_debug_path_custom_point_size", 1740695150L), hostObject.objectPtr)

}

object NavigationAgent3D {
  /** Class metadata for Gd[NavigationAgent3D] lifetime management and casting. */
  given GodotClass[NavigationAgent3D] with {
    def className = "NavigationAgent3D"
    def isRefCounted = false
    def wrap(o: GodotObject): NavigationAgent3D = new NavigationAgent3D {}.withHost(o.objectPtr)
    def unwrap(t: NavigationAgent3D): GodotObject = t.hostObject
  }
}
