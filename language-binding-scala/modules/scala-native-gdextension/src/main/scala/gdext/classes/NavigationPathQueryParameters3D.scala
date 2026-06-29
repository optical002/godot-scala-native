package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationPathQueryParameters3D`, extends `RefCounted`. */
abstract class NavigationPathQueryParameters3D extends RefCounted {
  override def godotClassName: String = "NavigationPathQueryParameters3D"

  /** NavigationPathQueryParameters3D.set_pathfinding_algorithm */
  final def setPathfindingAlgorithm(pathfinding_algorithm: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters3D", "set_pathfinding_algorithm", 394560454L), hostObject.objectPtr, pathfinding_algorithm)

  /** NavigationPathQueryParameters3D.get_pathfinding_algorithm */
  final def getPathfindingAlgorithm(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationPathQueryParameters3D", "get_pathfinding_algorithm", 3398491350L), hostObject.objectPtr)

  /** NavigationPathQueryParameters3D.set_path_postprocessing */
  final def setPathPostprocessing(path_postprocessing: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters3D", "set_path_postprocessing", 2267362344L), hostObject.objectPtr, path_postprocessing)

  /** NavigationPathQueryParameters3D.get_path_postprocessing */
  final def getPathPostprocessing(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationPathQueryParameters3D", "get_path_postprocessing", 3883858360L), hostObject.objectPtr)

  /** NavigationPathQueryParameters3D.set_start_position */
  final def setStartPosition(start_position: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters3D", "set_start_position", 3460891852L), hostObject.objectPtr, start_position)

  /** NavigationPathQueryParameters3D.get_start_position */
  final def getStartPosition(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("NavigationPathQueryParameters3D", "get_start_position", 3360562783L), hostObject.objectPtr)

  /** NavigationPathQueryParameters3D.set_target_position */
  final def setTargetPosition(target_position: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters3D", "set_target_position", 3460891852L), hostObject.objectPtr, target_position)

  /** NavigationPathQueryParameters3D.get_target_position */
  final def getTargetPosition(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("NavigationPathQueryParameters3D", "get_target_position", 3360562783L), hostObject.objectPtr)

  /** NavigationPathQueryParameters3D.set_navigation_layers */
  final def setNavigationLayers(navigation_layers: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters3D", "set_navigation_layers", 1286410249L), hostObject.objectPtr, navigation_layers)

  /** NavigationPathQueryParameters3D.get_navigation_layers */
  final def getNavigationLayers(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationPathQueryParameters3D", "get_navigation_layers", 3905245786L), hostObject.objectPtr)

  /** NavigationPathQueryParameters3D.set_metadata_flags */
  final def setMetadataFlags(flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters3D", "set_metadata_flags", 2713846708L), hostObject.objectPtr, flags)

  /** NavigationPathQueryParameters3D.get_metadata_flags */
  final def getMetadataFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationPathQueryParameters3D", "get_metadata_flags", 1582332802L), hostObject.objectPtr)

  /** NavigationPathQueryParameters3D.set_simplify_path */
  final def setSimplifyPath(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters3D", "set_simplify_path", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationPathQueryParameters3D.get_simplify_path */
  final def getSimplifyPath(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationPathQueryParameters3D", "get_simplify_path", 36873697L), hostObject.objectPtr)

  /** NavigationPathQueryParameters3D.set_simplify_epsilon */
  final def setSimplifyEpsilon(epsilon: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters3D", "set_simplify_epsilon", 373806689L), hostObject.objectPtr, epsilon)

  /** NavigationPathQueryParameters3D.get_simplify_epsilon */
  final def getSimplifyEpsilon(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationPathQueryParameters3D", "get_simplify_epsilon", 1740695150L), hostObject.objectPtr)

  /** NavigationPathQueryParameters3D.set_path_return_max_length */
  final def setPathReturnMaxLength(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters3D", "set_path_return_max_length", 373806689L), hostObject.objectPtr, length)

  /** NavigationPathQueryParameters3D.get_path_return_max_length */
  final def getPathReturnMaxLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationPathQueryParameters3D", "get_path_return_max_length", 1740695150L), hostObject.objectPtr)

  /** NavigationPathQueryParameters3D.set_path_return_max_radius */
  final def setPathReturnMaxRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters3D", "set_path_return_max_radius", 373806689L), hostObject.objectPtr, radius)

  /** NavigationPathQueryParameters3D.get_path_return_max_radius */
  final def getPathReturnMaxRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationPathQueryParameters3D", "get_path_return_max_radius", 1740695150L), hostObject.objectPtr)

  /** NavigationPathQueryParameters3D.set_path_search_max_polygons */
  final def setPathSearchMaxPolygons(max_polygons: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters3D", "set_path_search_max_polygons", 1286410249L), hostObject.objectPtr, max_polygons)

  /** NavigationPathQueryParameters3D.get_path_search_max_polygons */
  final def getPathSearchMaxPolygons(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationPathQueryParameters3D", "get_path_search_max_polygons", 3905245786L), hostObject.objectPtr)

  /** NavigationPathQueryParameters3D.set_path_search_max_distance */
  final def setPathSearchMaxDistance(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters3D", "set_path_search_max_distance", 373806689L), hostObject.objectPtr, distance)

  /** NavigationPathQueryParameters3D.get_path_search_max_distance */
  final def getPathSearchMaxDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationPathQueryParameters3D", "get_path_search_max_distance", 1740695150L), hostObject.objectPtr)

}
