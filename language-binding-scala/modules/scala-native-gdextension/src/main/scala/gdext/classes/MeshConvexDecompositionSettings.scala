package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MeshConvexDecompositionSettings`, extends `RefCounted`. */
abstract class MeshConvexDecompositionSettings extends RefCounted {
  override def godotClassName: String = "MeshConvexDecompositionSettings"

  /** MeshConvexDecompositionSettings.set_max_concavity */
  final def setMaxConcavity(maxConcavity: Double): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_max_concavity == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_max_concavity = MethodBind.get("MeshConvexDecompositionSettings", "set_max_concavity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_max_concavity, livePtr, maxConcavity)
  }

  /** MeshConvexDecompositionSettings.get_max_concavity */
  final def getMaxConcavity(): Double = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_max_concavity == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_max_concavity = MethodBind.get("MeshConvexDecompositionSettings", "get_max_concavity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MeshConvexDecompositionSettings.mb_get_max_concavity, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_symmetry_planes_clipping_bias */
  final def setSymmetryPlanesClippingBias(symmetryPlanesClippingBias: Double): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_symmetry_planes_clipping_bias == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_symmetry_planes_clipping_bias = MethodBind.get("MeshConvexDecompositionSettings", "set_symmetry_planes_clipping_bias", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_symmetry_planes_clipping_bias, livePtr, symmetryPlanesClippingBias)
  }

  /** MeshConvexDecompositionSettings.get_symmetry_planes_clipping_bias */
  final def getSymmetryPlanesClippingBias(): Double = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_symmetry_planes_clipping_bias == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_symmetry_planes_clipping_bias = MethodBind.get("MeshConvexDecompositionSettings", "get_symmetry_planes_clipping_bias", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MeshConvexDecompositionSettings.mb_get_symmetry_planes_clipping_bias, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_revolution_axes_clipping_bias */
  final def setRevolutionAxesClippingBias(revolutionAxesClippingBias: Double): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_revolution_axes_clipping_bias == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_revolution_axes_clipping_bias = MethodBind.get("MeshConvexDecompositionSettings", "set_revolution_axes_clipping_bias", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_revolution_axes_clipping_bias, livePtr, revolutionAxesClippingBias)
  }

  /** MeshConvexDecompositionSettings.get_revolution_axes_clipping_bias */
  final def getRevolutionAxesClippingBias(): Double = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_revolution_axes_clipping_bias == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_revolution_axes_clipping_bias = MethodBind.get("MeshConvexDecompositionSettings", "get_revolution_axes_clipping_bias", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MeshConvexDecompositionSettings.mb_get_revolution_axes_clipping_bias, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_min_volume_per_convex_hull */
  final def setMinVolumePerConvexHull(minVolumePerConvexHull: Double): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_min_volume_per_convex_hull == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_min_volume_per_convex_hull = MethodBind.get("MeshConvexDecompositionSettings", "set_min_volume_per_convex_hull", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_min_volume_per_convex_hull, livePtr, minVolumePerConvexHull)
  }

  /** MeshConvexDecompositionSettings.get_min_volume_per_convex_hull */
  final def getMinVolumePerConvexHull(): Double = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_min_volume_per_convex_hull == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_min_volume_per_convex_hull = MethodBind.get("MeshConvexDecompositionSettings", "get_min_volume_per_convex_hull", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MeshConvexDecompositionSettings.mb_get_min_volume_per_convex_hull, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_resolution */
  final def setResolution(minVolumePerConvexHull: Long): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_resolution == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_resolution = MethodBind.get("MeshConvexDecompositionSettings", "set_resolution", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_resolution, livePtr, minVolumePerConvexHull)
  }

  /** MeshConvexDecompositionSettings.get_resolution */
  final def getResolution(): Long = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_resolution == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_resolution = MethodBind.get("MeshConvexDecompositionSettings", "get_resolution", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshConvexDecompositionSettings.mb_get_resolution, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_max_num_vertices_per_convex_hull */
  final def setMaxNumVerticesPerConvexHull(maxNumVerticesPerConvexHull: Long): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_max_num_vertices_per_convex_hull == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_max_num_vertices_per_convex_hull = MethodBind.get("MeshConvexDecompositionSettings", "set_max_num_vertices_per_convex_hull", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_max_num_vertices_per_convex_hull, livePtr, maxNumVerticesPerConvexHull)
  }

  /** MeshConvexDecompositionSettings.get_max_num_vertices_per_convex_hull */
  final def getMaxNumVerticesPerConvexHull(): Long = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_max_num_vertices_per_convex_hull == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_max_num_vertices_per_convex_hull = MethodBind.get("MeshConvexDecompositionSettings", "get_max_num_vertices_per_convex_hull", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshConvexDecompositionSettings.mb_get_max_num_vertices_per_convex_hull, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_plane_downsampling */
  final def setPlaneDownsampling(planeDownsampling: Long): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_plane_downsampling == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_plane_downsampling = MethodBind.get("MeshConvexDecompositionSettings", "set_plane_downsampling", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_plane_downsampling, livePtr, planeDownsampling)
  }

  /** MeshConvexDecompositionSettings.get_plane_downsampling */
  final def getPlaneDownsampling(): Long = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_plane_downsampling == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_plane_downsampling = MethodBind.get("MeshConvexDecompositionSettings", "get_plane_downsampling", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshConvexDecompositionSettings.mb_get_plane_downsampling, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_convex_hull_downsampling */
  final def setConvexHullDownsampling(convexHullDownsampling: Long): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_convex_hull_downsampling == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_convex_hull_downsampling = MethodBind.get("MeshConvexDecompositionSettings", "set_convex_hull_downsampling", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_convex_hull_downsampling, livePtr, convexHullDownsampling)
  }

  /** MeshConvexDecompositionSettings.get_convex_hull_downsampling */
  final def getConvexHullDownsampling(): Long = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_convex_hull_downsampling == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_convex_hull_downsampling = MethodBind.get("MeshConvexDecompositionSettings", "get_convex_hull_downsampling", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshConvexDecompositionSettings.mb_get_convex_hull_downsampling, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_normalize_mesh */
  final def setNormalizeMesh(normalizeMesh: Boolean): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_normalize_mesh == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_normalize_mesh = MethodBind.get("MeshConvexDecompositionSettings", "set_normalize_mesh", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_normalize_mesh, livePtr, normalizeMesh)
  }

  /** MeshConvexDecompositionSettings.get_normalize_mesh */
  final def getNormalizeMesh(): Boolean = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_normalize_mesh == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_normalize_mesh = MethodBind.get("MeshConvexDecompositionSettings", "get_normalize_mesh", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.MeshConvexDecompositionSettings.mb_get_normalize_mesh, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_mode */
  final def setMode(mode: gdext.classes.MeshConvexDecompositionSettings.Mode): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_mode == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_mode = MethodBind.get("MeshConvexDecompositionSettings", "set_mode", 1668072869L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_mode, livePtr, mode)
  }

  /** MeshConvexDecompositionSettings.get_mode */
  final def getMode(): gdext.classes.MeshConvexDecompositionSettings.Mode = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_mode == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_mode = MethodBind.get("MeshConvexDecompositionSettings", "get_mode", 23479454L)
    gdext.classes.MeshConvexDecompositionSettings.Mode(Ptrcall.call0[Long](gdext.classes.MeshConvexDecompositionSettings.mb_get_mode, livePtr))
  }

  /** MeshConvexDecompositionSettings.set_convex_hull_approximation */
  final def setConvexHullApproximation(convexHullApproximation: Boolean): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_convex_hull_approximation == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_convex_hull_approximation = MethodBind.get("MeshConvexDecompositionSettings", "set_convex_hull_approximation", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_convex_hull_approximation, livePtr, convexHullApproximation)
  }

  /** MeshConvexDecompositionSettings.get_convex_hull_approximation */
  final def getConvexHullApproximation(): Boolean = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_convex_hull_approximation == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_convex_hull_approximation = MethodBind.get("MeshConvexDecompositionSettings", "get_convex_hull_approximation", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.MeshConvexDecompositionSettings.mb_get_convex_hull_approximation, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_max_convex_hulls */
  final def setMaxConvexHulls(maxConvexHulls: Long): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_max_convex_hulls == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_max_convex_hulls = MethodBind.get("MeshConvexDecompositionSettings", "set_max_convex_hulls", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_max_convex_hulls, livePtr, maxConvexHulls)
  }

  /** MeshConvexDecompositionSettings.get_max_convex_hulls */
  final def getMaxConvexHulls(): Long = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_max_convex_hulls == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_max_convex_hulls = MethodBind.get("MeshConvexDecompositionSettings", "get_max_convex_hulls", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshConvexDecompositionSettings.mb_get_max_convex_hulls, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_project_hull_vertices */
  final def setProjectHullVertices(projectHullVertices: Boolean): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_project_hull_vertices == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_project_hull_vertices = MethodBind.get("MeshConvexDecompositionSettings", "set_project_hull_vertices", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_project_hull_vertices, livePtr, projectHullVertices)
  }

  /** MeshConvexDecompositionSettings.get_project_hull_vertices */
  final def getProjectHullVertices(): Boolean = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_project_hull_vertices == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_project_hull_vertices = MethodBind.get("MeshConvexDecompositionSettings", "get_project_hull_vertices", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.MeshConvexDecompositionSettings.mb_get_project_hull_vertices, livePtr)
  }

}

object MeshConvexDecompositionSettings {
  private[classes] var mb_set_max_concavity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_concavity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_symmetry_planes_clipping_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_symmetry_planes_clipping_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_revolution_axes_clipping_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_revolution_axes_clipping_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_min_volume_per_convex_hull: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min_volume_per_convex_hull: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_resolution: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_resolution: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_num_vertices_per_convex_hull: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_num_vertices_per_convex_hull: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_plane_downsampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_plane_downsampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_convex_hull_downsampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_convex_hull_downsampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_normalize_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_normalize_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_convex_hull_approximation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_convex_hull_approximation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_convex_hulls: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_convex_hulls: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_project_hull_vertices: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_project_hull_vertices: GDExtensionMethodBindPtr = null

  /** Godot enum `MeshConvexDecompositionSettings.Mode`. */
  opaque type Mode <: Long = Long

  object Mode {
    final val Voxel: Mode = 0L.asInstanceOf[Mode]
    final val Tetrahedron: Mode = 1L.asInstanceOf[Mode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Mode = value.asInstanceOf[Mode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Mode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[Mode]]

    extension (self: Mode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Voxel"
        case 1L => "Tetrahedron"
        case other => other.toString
      }
  }
}
