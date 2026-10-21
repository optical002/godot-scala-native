package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MeshConvexDecompositionSettings`, extends `RefCounted`. */
abstract class MeshConvexDecompositionSettings extends RefCounted {
  override def godotClassName: String = "MeshConvexDecompositionSettings"

  /** MeshConvexDecompositionSettings.set_max_concavity */
  final def setMaxConcavity(max_concavity: Double): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_max_concavity == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_max_concavity = MethodBind.get("MeshConvexDecompositionSettings", "set_max_concavity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_max_concavity, livePtr, max_concavity)
  }

  /** MeshConvexDecompositionSettings.get_max_concavity */
  final def getMaxConcavity(): Double = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_max_concavity == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_max_concavity = MethodBind.get("MeshConvexDecompositionSettings", "get_max_concavity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MeshConvexDecompositionSettings.mb_get_max_concavity, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_symmetry_planes_clipping_bias */
  final def setSymmetryPlanesClippingBias(symmetry_planes_clipping_bias: Double): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_symmetry_planes_clipping_bias == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_symmetry_planes_clipping_bias = MethodBind.get("MeshConvexDecompositionSettings", "set_symmetry_planes_clipping_bias", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_symmetry_planes_clipping_bias, livePtr, symmetry_planes_clipping_bias)
  }

  /** MeshConvexDecompositionSettings.get_symmetry_planes_clipping_bias */
  final def getSymmetryPlanesClippingBias(): Double = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_symmetry_planes_clipping_bias == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_symmetry_planes_clipping_bias = MethodBind.get("MeshConvexDecompositionSettings", "get_symmetry_planes_clipping_bias", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MeshConvexDecompositionSettings.mb_get_symmetry_planes_clipping_bias, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_revolution_axes_clipping_bias */
  final def setRevolutionAxesClippingBias(revolution_axes_clipping_bias: Double): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_revolution_axes_clipping_bias == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_revolution_axes_clipping_bias = MethodBind.get("MeshConvexDecompositionSettings", "set_revolution_axes_clipping_bias", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_revolution_axes_clipping_bias, livePtr, revolution_axes_clipping_bias)
  }

  /** MeshConvexDecompositionSettings.get_revolution_axes_clipping_bias */
  final def getRevolutionAxesClippingBias(): Double = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_revolution_axes_clipping_bias == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_revolution_axes_clipping_bias = MethodBind.get("MeshConvexDecompositionSettings", "get_revolution_axes_clipping_bias", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MeshConvexDecompositionSettings.mb_get_revolution_axes_clipping_bias, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_min_volume_per_convex_hull */
  final def setMinVolumePerConvexHull(min_volume_per_convex_hull: Double): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_min_volume_per_convex_hull == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_min_volume_per_convex_hull = MethodBind.get("MeshConvexDecompositionSettings", "set_min_volume_per_convex_hull", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_min_volume_per_convex_hull, livePtr, min_volume_per_convex_hull)
  }

  /** MeshConvexDecompositionSettings.get_min_volume_per_convex_hull */
  final def getMinVolumePerConvexHull(): Double = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_min_volume_per_convex_hull == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_min_volume_per_convex_hull = MethodBind.get("MeshConvexDecompositionSettings", "get_min_volume_per_convex_hull", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MeshConvexDecompositionSettings.mb_get_min_volume_per_convex_hull, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_resolution */
  final def setResolution(min_volume_per_convex_hull: Long): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_resolution == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_resolution = MethodBind.get("MeshConvexDecompositionSettings", "set_resolution", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_resolution, livePtr, min_volume_per_convex_hull)
  }

  /** MeshConvexDecompositionSettings.get_resolution */
  final def getResolution(): Long = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_resolution == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_resolution = MethodBind.get("MeshConvexDecompositionSettings", "get_resolution", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshConvexDecompositionSettings.mb_get_resolution, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_max_num_vertices_per_convex_hull */
  final def setMaxNumVerticesPerConvexHull(max_num_vertices_per_convex_hull: Long): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_max_num_vertices_per_convex_hull == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_max_num_vertices_per_convex_hull = MethodBind.get("MeshConvexDecompositionSettings", "set_max_num_vertices_per_convex_hull", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_max_num_vertices_per_convex_hull, livePtr, max_num_vertices_per_convex_hull)
  }

  /** MeshConvexDecompositionSettings.get_max_num_vertices_per_convex_hull */
  final def getMaxNumVerticesPerConvexHull(): Long = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_max_num_vertices_per_convex_hull == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_max_num_vertices_per_convex_hull = MethodBind.get("MeshConvexDecompositionSettings", "get_max_num_vertices_per_convex_hull", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshConvexDecompositionSettings.mb_get_max_num_vertices_per_convex_hull, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_plane_downsampling */
  final def setPlaneDownsampling(plane_downsampling: Long): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_plane_downsampling == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_plane_downsampling = MethodBind.get("MeshConvexDecompositionSettings", "set_plane_downsampling", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_plane_downsampling, livePtr, plane_downsampling)
  }

  /** MeshConvexDecompositionSettings.get_plane_downsampling */
  final def getPlaneDownsampling(): Long = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_plane_downsampling == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_plane_downsampling = MethodBind.get("MeshConvexDecompositionSettings", "get_plane_downsampling", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshConvexDecompositionSettings.mb_get_plane_downsampling, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_convex_hull_downsampling */
  final def setConvexHullDownsampling(convex_hull_downsampling: Long): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_convex_hull_downsampling == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_convex_hull_downsampling = MethodBind.get("MeshConvexDecompositionSettings", "set_convex_hull_downsampling", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_convex_hull_downsampling, livePtr, convex_hull_downsampling)
  }

  /** MeshConvexDecompositionSettings.get_convex_hull_downsampling */
  final def getConvexHullDownsampling(): Long = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_convex_hull_downsampling == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_convex_hull_downsampling = MethodBind.get("MeshConvexDecompositionSettings", "get_convex_hull_downsampling", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshConvexDecompositionSettings.mb_get_convex_hull_downsampling, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_normalize_mesh */
  final def setNormalizeMesh(normalize_mesh: Boolean): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_normalize_mesh == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_normalize_mesh = MethodBind.get("MeshConvexDecompositionSettings", "set_normalize_mesh", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_normalize_mesh, livePtr, normalize_mesh)
  }

  /** MeshConvexDecompositionSettings.get_normalize_mesh */
  final def getNormalizeMesh(): Boolean = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_normalize_mesh == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_normalize_mesh = MethodBind.get("MeshConvexDecompositionSettings", "get_normalize_mesh", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.MeshConvexDecompositionSettings.mb_get_normalize_mesh, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_mode */
  final def setMode(mode: Long): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_mode == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_mode = MethodBind.get("MeshConvexDecompositionSettings", "set_mode", 1668072869L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_mode, livePtr, mode)
  }

  /** MeshConvexDecompositionSettings.get_mode */
  final def getMode(): Long = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_mode == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_mode = MethodBind.get("MeshConvexDecompositionSettings", "get_mode", 23479454L)
    Ptrcall.call0[Long](gdext.classes.MeshConvexDecompositionSettings.mb_get_mode, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_convex_hull_approximation */
  final def setConvexHullApproximation(convex_hull_approximation: Boolean): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_convex_hull_approximation == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_convex_hull_approximation = MethodBind.get("MeshConvexDecompositionSettings", "set_convex_hull_approximation", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_convex_hull_approximation, livePtr, convex_hull_approximation)
  }

  /** MeshConvexDecompositionSettings.get_convex_hull_approximation */
  final def getConvexHullApproximation(): Boolean = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_convex_hull_approximation == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_convex_hull_approximation = MethodBind.get("MeshConvexDecompositionSettings", "get_convex_hull_approximation", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.MeshConvexDecompositionSettings.mb_get_convex_hull_approximation, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_max_convex_hulls */
  final def setMaxConvexHulls(max_convex_hulls: Long): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_max_convex_hulls == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_max_convex_hulls = MethodBind.get("MeshConvexDecompositionSettings", "set_max_convex_hulls", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_max_convex_hulls, livePtr, max_convex_hulls)
  }

  /** MeshConvexDecompositionSettings.get_max_convex_hulls */
  final def getMaxConvexHulls(): Long = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_get_max_convex_hulls == null) gdext.classes.MeshConvexDecompositionSettings.mb_get_max_convex_hulls = MethodBind.get("MeshConvexDecompositionSettings", "get_max_convex_hulls", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshConvexDecompositionSettings.mb_get_max_convex_hulls, livePtr)
  }

  /** MeshConvexDecompositionSettings.set_project_hull_vertices */
  final def setProjectHullVertices(project_hull_vertices: Boolean): Unit = {
    if (gdext.classes.MeshConvexDecompositionSettings.mb_set_project_hull_vertices == null) gdext.classes.MeshConvexDecompositionSettings.mb_set_project_hull_vertices = MethodBind.get("MeshConvexDecompositionSettings", "set_project_hull_vertices", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MeshConvexDecompositionSettings.mb_set_project_hull_vertices, livePtr, project_hull_vertices)
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
}
