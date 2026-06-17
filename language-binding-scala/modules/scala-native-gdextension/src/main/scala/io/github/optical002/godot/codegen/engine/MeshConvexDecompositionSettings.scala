package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `MeshConvexDecompositionSettings`, extends `RefCounted`. */
abstract class MeshConvexDecompositionSettings extends RefCounted {

  /** MeshConvexDecompositionSettings.set_max_concavity */
  final def setMaxConcavity(max_concavity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshConvexDecompositionSettings", "set_max_concavity", 373806689L), hostObject.objectPtr, max_concavity)

  /** MeshConvexDecompositionSettings.get_max_concavity */
  final def getMaxConcavity(): Double =
    Ptrcall.call0[Double](MethodBind.get("MeshConvexDecompositionSettings", "get_max_concavity", 1740695150L), hostObject.objectPtr)

  /** MeshConvexDecompositionSettings.set_symmetry_planes_clipping_bias */
  final def setSymmetryPlanesClippingBias(symmetry_planes_clipping_bias: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshConvexDecompositionSettings", "set_symmetry_planes_clipping_bias", 373806689L), hostObject.objectPtr, symmetry_planes_clipping_bias)

  /** MeshConvexDecompositionSettings.get_symmetry_planes_clipping_bias */
  final def getSymmetryPlanesClippingBias(): Double =
    Ptrcall.call0[Double](MethodBind.get("MeshConvexDecompositionSettings", "get_symmetry_planes_clipping_bias", 1740695150L), hostObject.objectPtr)

  /** MeshConvexDecompositionSettings.set_revolution_axes_clipping_bias */
  final def setRevolutionAxesClippingBias(revolution_axes_clipping_bias: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshConvexDecompositionSettings", "set_revolution_axes_clipping_bias", 373806689L), hostObject.objectPtr, revolution_axes_clipping_bias)

  /** MeshConvexDecompositionSettings.get_revolution_axes_clipping_bias */
  final def getRevolutionAxesClippingBias(): Double =
    Ptrcall.call0[Double](MethodBind.get("MeshConvexDecompositionSettings", "get_revolution_axes_clipping_bias", 1740695150L), hostObject.objectPtr)

  /** MeshConvexDecompositionSettings.set_min_volume_per_convex_hull */
  final def setMinVolumePerConvexHull(min_volume_per_convex_hull: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshConvexDecompositionSettings", "set_min_volume_per_convex_hull", 373806689L), hostObject.objectPtr, min_volume_per_convex_hull)

  /** MeshConvexDecompositionSettings.get_min_volume_per_convex_hull */
  final def getMinVolumePerConvexHull(): Double =
    Ptrcall.call0[Double](MethodBind.get("MeshConvexDecompositionSettings", "get_min_volume_per_convex_hull", 1740695150L), hostObject.objectPtr)

  /** MeshConvexDecompositionSettings.set_resolution */
  final def setResolution(min_volume_per_convex_hull: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshConvexDecompositionSettings", "set_resolution", 1286410249L), hostObject.objectPtr, min_volume_per_convex_hull)

  /** MeshConvexDecompositionSettings.get_resolution */
  final def getResolution(): Long =
    Ptrcall.call0[Long](MethodBind.get("MeshConvexDecompositionSettings", "get_resolution", 3905245786L), hostObject.objectPtr)

  /** MeshConvexDecompositionSettings.set_max_num_vertices_per_convex_hull */
  final def setMaxNumVerticesPerConvexHull(max_num_vertices_per_convex_hull: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshConvexDecompositionSettings", "set_max_num_vertices_per_convex_hull", 1286410249L), hostObject.objectPtr, max_num_vertices_per_convex_hull)

  /** MeshConvexDecompositionSettings.get_max_num_vertices_per_convex_hull */
  final def getMaxNumVerticesPerConvexHull(): Long =
    Ptrcall.call0[Long](MethodBind.get("MeshConvexDecompositionSettings", "get_max_num_vertices_per_convex_hull", 3905245786L), hostObject.objectPtr)

  /** MeshConvexDecompositionSettings.set_plane_downsampling */
  final def setPlaneDownsampling(plane_downsampling: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshConvexDecompositionSettings", "set_plane_downsampling", 1286410249L), hostObject.objectPtr, plane_downsampling)

  /** MeshConvexDecompositionSettings.get_plane_downsampling */
  final def getPlaneDownsampling(): Long =
    Ptrcall.call0[Long](MethodBind.get("MeshConvexDecompositionSettings", "get_plane_downsampling", 3905245786L), hostObject.objectPtr)

  /** MeshConvexDecompositionSettings.set_convex_hull_downsampling */
  final def setConvexHullDownsampling(convex_hull_downsampling: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshConvexDecompositionSettings", "set_convex_hull_downsampling", 1286410249L), hostObject.objectPtr, convex_hull_downsampling)

  /** MeshConvexDecompositionSettings.get_convex_hull_downsampling */
  final def getConvexHullDownsampling(): Long =
    Ptrcall.call0[Long](MethodBind.get("MeshConvexDecompositionSettings", "get_convex_hull_downsampling", 3905245786L), hostObject.objectPtr)

  /** MeshConvexDecompositionSettings.set_normalize_mesh */
  final def setNormalizeMesh(normalize_mesh: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshConvexDecompositionSettings", "set_normalize_mesh", 2586408642L), hostObject.objectPtr, normalize_mesh)

  /** MeshConvexDecompositionSettings.get_normalize_mesh */
  final def getNormalizeMesh(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MeshConvexDecompositionSettings", "get_normalize_mesh", 36873697L), hostObject.objectPtr)

  /** MeshConvexDecompositionSettings.set_mode */
  final def setMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshConvexDecompositionSettings", "set_mode", 1668072869L), hostObject.objectPtr, mode)

  /** MeshConvexDecompositionSettings.get_mode */
  final def getMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("MeshConvexDecompositionSettings", "get_mode", 23479454L), hostObject.objectPtr)

  /** MeshConvexDecompositionSettings.set_convex_hull_approximation */
  final def setConvexHullApproximation(convex_hull_approximation: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshConvexDecompositionSettings", "set_convex_hull_approximation", 2586408642L), hostObject.objectPtr, convex_hull_approximation)

  /** MeshConvexDecompositionSettings.get_convex_hull_approximation */
  final def getConvexHullApproximation(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MeshConvexDecompositionSettings", "get_convex_hull_approximation", 36873697L), hostObject.objectPtr)

  /** MeshConvexDecompositionSettings.set_max_convex_hulls */
  final def setMaxConvexHulls(max_convex_hulls: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshConvexDecompositionSettings", "set_max_convex_hulls", 1286410249L), hostObject.objectPtr, max_convex_hulls)

  /** MeshConvexDecompositionSettings.get_max_convex_hulls */
  final def getMaxConvexHulls(): Long =
    Ptrcall.call0[Long](MethodBind.get("MeshConvexDecompositionSettings", "get_max_convex_hulls", 3905245786L), hostObject.objectPtr)

  /** MeshConvexDecompositionSettings.set_project_hull_vertices */
  final def setProjectHullVertices(project_hull_vertices: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshConvexDecompositionSettings", "set_project_hull_vertices", 2586408642L), hostObject.objectPtr, project_hull_vertices)

  /** MeshConvexDecompositionSettings.get_project_hull_vertices */
  final def getProjectHullVertices(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MeshConvexDecompositionSettings", "get_project_hull_vertices", 36873697L), hostObject.objectPtr)

}

object MeshConvexDecompositionSettings {
  /** Class metadata for Gd[MeshConvexDecompositionSettings] lifetime management and casting. */
  given GodotClass[MeshConvexDecompositionSettings] with {
    def className = "MeshConvexDecompositionSettings"
    def isRefCounted = true
    def wrap(o: GodotObject): MeshConvexDecompositionSettings = new MeshConvexDecompositionSettings {}.withHost(o.objectPtr)
    def unwrap(t: MeshConvexDecompositionSettings): GodotObject = t.hostObject
  }
}
