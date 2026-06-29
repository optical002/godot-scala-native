package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationPathQueryParameters2D`, extends `RefCounted`. */
abstract class NavigationPathQueryParameters2D extends RefCounted {
  override def godotClassName: String = "NavigationPathQueryParameters2D"

  /** NavigationPathQueryParameters2D.set_pathfinding_algorithm */
  final def setPathfindingAlgorithm(pathfinding_algorithm: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters2D", "set_pathfinding_algorithm", 2783519915L), hostObject.objectPtr, pathfinding_algorithm)

  /** NavigationPathQueryParameters2D.get_pathfinding_algorithm */
  final def getPathfindingAlgorithm(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationPathQueryParameters2D", "get_pathfinding_algorithm", 3000421146L), hostObject.objectPtr)

  /** NavigationPathQueryParameters2D.set_path_postprocessing */
  final def setPathPostprocessing(path_postprocessing: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters2D", "set_path_postprocessing", 2864409082L), hostObject.objectPtr, path_postprocessing)

  /** NavigationPathQueryParameters2D.get_path_postprocessing */
  final def getPathPostprocessing(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationPathQueryParameters2D", "get_path_postprocessing", 3798118993L), hostObject.objectPtr)

  /** NavigationPathQueryParameters2D.set_start_position */
  final def setStartPosition(start_position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters2D", "set_start_position", 743155724L), hostObject.objectPtr, start_position)

  /** NavigationPathQueryParameters2D.get_start_position */
  final def getStartPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("NavigationPathQueryParameters2D", "get_start_position", 3341600327L), hostObject.objectPtr)

  /** NavigationPathQueryParameters2D.set_target_position */
  final def setTargetPosition(target_position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters2D", "set_target_position", 743155724L), hostObject.objectPtr, target_position)

  /** NavigationPathQueryParameters2D.get_target_position */
  final def getTargetPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("NavigationPathQueryParameters2D", "get_target_position", 3341600327L), hostObject.objectPtr)

  /** NavigationPathQueryParameters2D.set_navigation_layers */
  final def setNavigationLayers(navigation_layers: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters2D", "set_navigation_layers", 1286410249L), hostObject.objectPtr, navigation_layers)

  /** NavigationPathQueryParameters2D.get_navigation_layers */
  final def getNavigationLayers(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationPathQueryParameters2D", "get_navigation_layers", 3905245786L), hostObject.objectPtr)

  /** NavigationPathQueryParameters2D.set_metadata_flags */
  final def setMetadataFlags(flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters2D", "set_metadata_flags", 24274129L), hostObject.objectPtr, flags)

  /** NavigationPathQueryParameters2D.get_metadata_flags */
  final def getMetadataFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationPathQueryParameters2D", "get_metadata_flags", 488152976L), hostObject.objectPtr)

  /** NavigationPathQueryParameters2D.set_simplify_path */
  final def setSimplifyPath(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters2D", "set_simplify_path", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationPathQueryParameters2D.get_simplify_path */
  final def getSimplifyPath(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationPathQueryParameters2D", "get_simplify_path", 36873697L), hostObject.objectPtr)

  /** NavigationPathQueryParameters2D.set_simplify_epsilon */
  final def setSimplifyEpsilon(epsilon: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters2D", "set_simplify_epsilon", 373806689L), hostObject.objectPtr, epsilon)

  /** NavigationPathQueryParameters2D.get_simplify_epsilon */
  final def getSimplifyEpsilon(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationPathQueryParameters2D", "get_simplify_epsilon", 1740695150L), hostObject.objectPtr)

  /** NavigationPathQueryParameters2D.set_path_return_max_length */
  final def setPathReturnMaxLength(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters2D", "set_path_return_max_length", 373806689L), hostObject.objectPtr, length)

  /** NavigationPathQueryParameters2D.get_path_return_max_length */
  final def getPathReturnMaxLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationPathQueryParameters2D", "get_path_return_max_length", 1740695150L), hostObject.objectPtr)

  /** NavigationPathQueryParameters2D.set_path_return_max_radius */
  final def setPathReturnMaxRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters2D", "set_path_return_max_radius", 373806689L), hostObject.objectPtr, radius)

  /** NavigationPathQueryParameters2D.get_path_return_max_radius */
  final def getPathReturnMaxRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationPathQueryParameters2D", "get_path_return_max_radius", 1740695150L), hostObject.objectPtr)

  /** NavigationPathQueryParameters2D.set_path_search_max_polygons */
  final def setPathSearchMaxPolygons(max_polygons: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters2D", "set_path_search_max_polygons", 1286410249L), hostObject.objectPtr, max_polygons)

  /** NavigationPathQueryParameters2D.get_path_search_max_polygons */
  final def getPathSearchMaxPolygons(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationPathQueryParameters2D", "get_path_search_max_polygons", 3905245786L), hostObject.objectPtr)

  /** NavigationPathQueryParameters2D.set_path_search_max_distance */
  final def setPathSearchMaxDistance(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryParameters2D", "set_path_search_max_distance", 373806689L), hostObject.objectPtr, distance)

  /** NavigationPathQueryParameters2D.get_path_search_max_distance */
  final def getPathSearchMaxDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationPathQueryParameters2D", "get_path_search_max_distance", 1740695150L), hostObject.objectPtr)

}
