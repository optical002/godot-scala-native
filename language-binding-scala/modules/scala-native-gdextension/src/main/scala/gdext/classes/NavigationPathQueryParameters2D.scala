package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationPathQueryParameters2D`, extends `RefCounted`. */
abstract class NavigationPathQueryParameters2D extends RefCounted {
  override def godotClassName: String = "NavigationPathQueryParameters2D"

  /** NavigationPathQueryParameters2D.set_pathfinding_algorithm */
  final def setPathfindingAlgorithm(pathfindingAlgorithm: gdext.classes.NavigationPathQueryParameters2D.PathfindingAlgorithm): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_pathfinding_algorithm == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_pathfinding_algorithm = MethodBind.get("NavigationPathQueryParameters2D", "set_pathfinding_algorithm", 2783519915L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_pathfinding_algorithm, livePtr, pathfindingAlgorithm)
  }

  /** NavigationPathQueryParameters2D.get_pathfinding_algorithm */
  final def getPathfindingAlgorithm(): gdext.classes.NavigationPathQueryParameters2D.PathfindingAlgorithm = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_pathfinding_algorithm == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_pathfinding_algorithm = MethodBind.get("NavigationPathQueryParameters2D", "get_pathfinding_algorithm", 3000421146L)
    gdext.classes.NavigationPathQueryParameters2D.PathfindingAlgorithm(Ptrcall.call0[Long](gdext.classes.NavigationPathQueryParameters2D.mb_get_pathfinding_algorithm, livePtr))
  }

  /** NavigationPathQueryParameters2D.set_path_postprocessing */
  final def setPathPostprocessing(pathPostprocessing: gdext.classes.NavigationPathQueryParameters2D.PathPostProcessing): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_path_postprocessing == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_path_postprocessing = MethodBind.get("NavigationPathQueryParameters2D", "set_path_postprocessing", 2864409082L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_path_postprocessing, livePtr, pathPostprocessing)
  }

  /** NavigationPathQueryParameters2D.get_path_postprocessing */
  final def getPathPostprocessing(): gdext.classes.NavigationPathQueryParameters2D.PathPostProcessing = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_path_postprocessing == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_path_postprocessing = MethodBind.get("NavigationPathQueryParameters2D", "get_path_postprocessing", 3798118993L)
    gdext.classes.NavigationPathQueryParameters2D.PathPostProcessing(Ptrcall.call0[Long](gdext.classes.NavigationPathQueryParameters2D.mb_get_path_postprocessing, livePtr))
  }

  /** NavigationPathQueryParameters2D.set_start_position */
  final def setStartPosition(startPosition: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_start_position == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_start_position = MethodBind.get("NavigationPathQueryParameters2D", "set_start_position", 743155724L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_start_position, livePtr, startPosition)
  }

  /** NavigationPathQueryParameters2D.get_start_position */
  final def getStartPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_start_position == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_start_position = MethodBind.get("NavigationPathQueryParameters2D", "get_start_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.NavigationPathQueryParameters2D.mb_get_start_position, livePtr)
  }

  /** NavigationPathQueryParameters2D.set_target_position */
  final def setTargetPosition(targetPosition: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_target_position == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_target_position = MethodBind.get("NavigationPathQueryParameters2D", "set_target_position", 743155724L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_target_position, livePtr, targetPosition)
  }

  /** NavigationPathQueryParameters2D.get_target_position */
  final def getTargetPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_target_position == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_target_position = MethodBind.get("NavigationPathQueryParameters2D", "get_target_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.NavigationPathQueryParameters2D.mb_get_target_position, livePtr)
  }

  /** NavigationPathQueryParameters2D.set_navigation_layers */
  final def setNavigationLayers(navigationLayers: Long): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_navigation_layers == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_navigation_layers = MethodBind.get("NavigationPathQueryParameters2D", "set_navigation_layers", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_navigation_layers, livePtr, navigationLayers)
  }

  /** NavigationPathQueryParameters2D.get_navigation_layers */
  final def getNavigationLayers(): Long = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_navigation_layers == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_navigation_layers = MethodBind.get("NavigationPathQueryParameters2D", "get_navigation_layers", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationPathQueryParameters2D.mb_get_navigation_layers, livePtr)
  }

  /** NavigationPathQueryParameters2D.set_metadata_flags */
  final def setMetadataFlags(flags: gdext.classes.NavigationPathQueryParameters2D.PathMetadataFlags): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_metadata_flags == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_metadata_flags = MethodBind.get("NavigationPathQueryParameters2D", "set_metadata_flags", 24274129L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_metadata_flags, livePtr, flags.asInstanceOf[Long])
  }

  /** NavigationPathQueryParameters2D.get_metadata_flags */
  final def getMetadataFlags(): gdext.classes.NavigationPathQueryParameters2D.PathMetadataFlags = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_get_metadata_flags == null) gdext.classes.NavigationPathQueryParameters2D.mb_get_metadata_flags = MethodBind.get("NavigationPathQueryParameters2D", "get_metadata_flags", 488152976L)
    gdext.classes.NavigationPathQueryParameters2D.PathMetadataFlags(Ptrcall.call0[Long](gdext.classes.NavigationPathQueryParameters2D.mb_get_metadata_flags, livePtr))
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
  final def setPathSearchMaxPolygons(maxPolygons: Long): Unit = {
    if (gdext.classes.NavigationPathQueryParameters2D.mb_set_path_search_max_polygons == null) gdext.classes.NavigationPathQueryParameters2D.mb_set_path_search_max_polygons = MethodBind.get("NavigationPathQueryParameters2D", "set_path_search_max_polygons", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryParameters2D.mb_set_path_search_max_polygons, livePtr, maxPolygons)
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

  /** Godot enum `NavigationPathQueryParameters2D.PathfindingAlgorithm`. */
  opaque type PathfindingAlgorithm <: Long = Long

  object PathfindingAlgorithm {
    final val PathfindingAlgorithmAstar: PathfindingAlgorithm = 0L.asInstanceOf[PathfindingAlgorithm]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PathfindingAlgorithm = value.asInstanceOf[PathfindingAlgorithm]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PathfindingAlgorithm] = scala.IArray[Long](0L).asInstanceOf[scala.IArray[PathfindingAlgorithm]]

    extension (self: PathfindingAlgorithm)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "PathfindingAlgorithmAstar"
        case other => other.toString
      }
  }

  /** Godot enum `NavigationPathQueryParameters2D.PathPostProcessing`. */
  opaque type PathPostProcessing <: Long = Long

  object PathPostProcessing {
    final val Corridorfunnel: PathPostProcessing = 0L.asInstanceOf[PathPostProcessing]
    final val Edgecentered: PathPostProcessing = 1L.asInstanceOf[PathPostProcessing]
    final val None: PathPostProcessing = 2L.asInstanceOf[PathPostProcessing]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PathPostProcessing = value.asInstanceOf[PathPostProcessing]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PathPostProcessing] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[PathPostProcessing]]

    extension (self: PathPostProcessing)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Corridorfunnel"
        case 1L => "Edgecentered"
        case 2L => "None"
        case other => other.toString
      }
  }

  /** Godot bitfield `NavigationPathQueryParameters2D.PathMetadataFlags`. */
  opaque type PathMetadataFlags = Long

  object PathMetadataFlags {
    final val None: PathMetadataFlags = 0L.asInstanceOf[PathMetadataFlags]
    final val Types: PathMetadataFlags = 1L.asInstanceOf[PathMetadataFlags]
    final val Rids: PathMetadataFlags = 2L.asInstanceOf[PathMetadataFlags]
    final val Owners: PathMetadataFlags = 4L.asInstanceOf[PathMetadataFlags]
    final val All: PathMetadataFlags = 7L.asInstanceOf[PathMetadataFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PathMetadataFlags = value.asInstanceOf[PathMetadataFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PathMetadataFlags] = scala.IArray[Long](0L, 1L, 2L, 4L, 7L).asInstanceOf[scala.IArray[PathMetadataFlags]]

    extension (self: PathMetadataFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Types"
        case 2L => "Rids"
        case 4L => "Owners"
        case 7L => "All"
        case other => other.toString
      }
    extension (self: PathMetadataFlags) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: PathMetadataFlags): PathMetadataFlags = (self.value | other.value).asInstanceOf[PathMetadataFlags]
      inline def &(other: PathMetadataFlags): PathMetadataFlags = (self.value & other.value).asInstanceOf[PathMetadataFlags]
      /** Every bit of `flag` is set. */
      inline def has(flag: PathMetadataFlags): Boolean = (self.value & flag.value) == flag.value
    }
  }
}
