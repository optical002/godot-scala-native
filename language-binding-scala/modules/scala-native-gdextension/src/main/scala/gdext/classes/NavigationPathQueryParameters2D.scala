package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationPathQueryParameters2D`, extends `RefCounted`. */
abstract class NavigationPathQueryParameters2D extends RefCounted {
  override def godotClassName: String = "NavigationPathQueryParameters2D"

  /** NavigationPathQueryParameters2D.set_pathfinding_algorithm */
  final def setPathfindingAlgorithm(pathfinding_algorithm: Long): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_pathfinding_algorithm == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_pathfinding_algorithm = MethodBind.get("NavigationPathQueryParameters2D", "set_pathfinding_algorithm", 2783519915L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_pathfinding_algorithm, livePtr, pathfinding_algorithm)
  }

  /** NavigationPathQueryParameters2D.get_pathfinding_algorithm */
  final def getPathfindingAlgorithm(): Long = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_pathfinding_algorithm == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_pathfinding_algorithm = MethodBind.get("NavigationPathQueryParameters2D", "get_pathfinding_algorithm", 3000421146L)
    Ptrcall.call0[Long](gdext.classes.NavigationPathQueryParameters2D.mb_get_pathfinding_algorithm, livePtr)
  }

  /** NavigationPathQueryParameters2D.set_path_postprocessing */
  final def setPathPostprocessing(path_postprocessing: Long): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_path_postprocessing == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_path_postprocessing = MethodBind.get("NavigationPathQueryParameters2D", "set_path_postprocessing", 2864409082L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_path_postprocessing, livePtr, path_postprocessing)
  }

  /** NavigationPathQueryParameters2D.get_path_postprocessing */
  final def getPathPostprocessing(): Long = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_path_postprocessing == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_path_postprocessing = MethodBind.get("NavigationPathQueryParameters2D", "get_path_postprocessing", 3798118993L)
    Ptrcall.call0[Long](gdext.classes.NavigationPathQueryParameters2D.mb_get_path_postprocessing, livePtr)
  }

  /** NavigationPathQueryParameters2D.set_start_position */
  final def setStartPosition(start_position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_start_position == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_start_position = MethodBind.get("NavigationPathQueryParameters2D", "set_start_position", 743155724L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_start_position, livePtr, start_position)
  }

  /** NavigationPathQueryParameters2D.get_start_position */
  final def getStartPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_start_position == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_start_position = MethodBind.get("NavigationPathQueryParameters2D", "get_start_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.NavigationPathQueryParameters2D.mb_get_start_position, livePtr)
  }

  /** NavigationPathQueryParameters2D.set_target_position */
  final def setTargetPosition(target_position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_target_position == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_target_position = MethodBind.get("NavigationPathQueryParameters2D", "set_target_position", 743155724L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_target_position, livePtr, target_position)
  }

  /** NavigationPathQueryParameters2D.get_target_position */
  final def getTargetPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_target_position == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_target_position = MethodBind.get("NavigationPathQueryParameters2D", "get_target_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.NavigationPathQueryParameters2D.mb_get_target_position, livePtr)
  }

  /** NavigationPathQueryParameters2D.set_navigation_layers */
  final def setNavigationLayers(navigation_layers: Long): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_navigation_layers == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_navigation_layers = MethodBind.get("NavigationPathQueryParameters2D", "set_navigation_layers", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_navigation_layers, livePtr, navigation_layers)
  }

  /** NavigationPathQueryParameters2D.get_navigation_layers */
  final def getNavigationLayers(): Long = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_navigation_layers == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_navigation_layers = MethodBind.get("NavigationPathQueryParameters2D", "get_navigation_layers", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationPathQueryParameters2D.mb_get_navigation_layers, livePtr)
  }

  /** NavigationPathQueryParameters2D.set_metadata_flags */
  final def setMetadataFlags(flags: Long): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_metadata_flags == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_metadata_flags = MethodBind.get("NavigationPathQueryParameters2D", "set_metadata_flags", 24274129L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_metadata_flags, livePtr, flags)
  }

  /** NavigationPathQueryParameters2D.get_metadata_flags */
  final def getMetadataFlags(): Long = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_metadata_flags == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_metadata_flags = MethodBind.get("NavigationPathQueryParameters2D", "get_metadata_flags", 488152976L)
    Ptrcall.call0[Long](gdext.classes.NavigationPathQueryParameters2D.mb_get_metadata_flags, livePtr)
  }

  /** NavigationPathQueryParameters2D.set_simplify_path */
  final def setSimplifyPath(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_simplify_path == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_simplify_path = MethodBind.get("NavigationPathQueryParameters2D", "set_simplify_path", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_simplify_path, livePtr, enabled)
  }

  /** NavigationPathQueryParameters2D.get_simplify_path */
  final def getSimplifyPath(): Boolean = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_simplify_path == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_simplify_path = MethodBind.get("NavigationPathQueryParameters2D", "get_simplify_path", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationPathQueryParameters2D.mb_get_simplify_path, livePtr)
  }

  /** NavigationPathQueryParameters2D.set_simplify_epsilon */
  final def setSimplifyEpsilon(epsilon: Double): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_simplify_epsilon == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_simplify_epsilon = MethodBind.get("NavigationPathQueryParameters2D", "set_simplify_epsilon", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_simplify_epsilon, livePtr, epsilon)
  }

  /** NavigationPathQueryParameters2D.get_simplify_epsilon */
  final def getSimplifyEpsilon(): Double = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_simplify_epsilon == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_simplify_epsilon = MethodBind.get("NavigationPathQueryParameters2D", "get_simplify_epsilon", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationPathQueryParameters2D.mb_get_simplify_epsilon, livePtr)
  }

  /** NavigationPathQueryParameters2D.set_path_return_max_length */
  final def setPathReturnMaxLength(length: Double): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_path_return_max_length == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_path_return_max_length = MethodBind.get("NavigationPathQueryParameters2D", "set_path_return_max_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_path_return_max_length, livePtr, length)
  }

  /** NavigationPathQueryParameters2D.get_path_return_max_length */
  final def getPathReturnMaxLength(): Double = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_path_return_max_length == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_path_return_max_length = MethodBind.get("NavigationPathQueryParameters2D", "get_path_return_max_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationPathQueryParameters2D.mb_get_path_return_max_length, livePtr)
  }

  /** NavigationPathQueryParameters2D.set_path_return_max_radius */
  final def setPathReturnMaxRadius(radius: Double): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_path_return_max_radius == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_path_return_max_radius = MethodBind.get("NavigationPathQueryParameters2D", "set_path_return_max_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_path_return_max_radius, livePtr, radius)
  }

  /** NavigationPathQueryParameters2D.get_path_return_max_radius */
  final def getPathReturnMaxRadius(): Double = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_path_return_max_radius == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_path_return_max_radius = MethodBind.get("NavigationPathQueryParameters2D", "get_path_return_max_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationPathQueryParameters2D.mb_get_path_return_max_radius, livePtr)
  }

  /** NavigationPathQueryParameters2D.set_path_search_max_polygons */
  final def setPathSearchMaxPolygons(max_polygons: Long): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_path_search_max_polygons == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_path_search_max_polygons = MethodBind.get("NavigationPathQueryParameters2D", "set_path_search_max_polygons", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_path_search_max_polygons, livePtr, max_polygons)
  }

  /** NavigationPathQueryParameters2D.get_path_search_max_polygons */
  final def getPathSearchMaxPolygons(): Long = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_path_search_max_polygons == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_path_search_max_polygons = MethodBind.get("NavigationPathQueryParameters2D", "get_path_search_max_polygons", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationPathQueryParameters2D.mb_get_path_search_max_polygons, livePtr)
  }

  /** NavigationPathQueryParameters2D.set_path_search_max_distance */
  final def setPathSearchMaxDistance(distance: Double): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_path_search_max_distance == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_path_search_max_distance = MethodBind.get("NavigationPathQueryParameters2D", "set_path_search_max_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_path_search_max_distance, livePtr, distance)
  }

  /** NavigationPathQueryParameters2D.get_path_search_max_distance */
  final def getPathSearchMaxDistance(): Double = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_path_search_max_distance == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_path_search_max_distance = MethodBind.get("NavigationPathQueryParameters2D", "get_path_search_max_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationPathQueryParameters2D.mb_get_path_search_max_distance, livePtr)
  }

}

object NavigationPathQueryParameters2D {
  private[classes] var mb_set_pathfinding_algorithm: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pathfinding_algorithm: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_postprocessing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_postprocessing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_start_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_start_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_target_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_target_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_navigation_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_navigation_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_metadata_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_metadata_flags: GDExtensionMethodBindPtr = null
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
}
