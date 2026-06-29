package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Mesh`, extends `Resource`. */
abstract class Mesh extends Resource {
  override def godotClassName: String = "Mesh"

  /** Mesh.set_lightmap_size_hint */
  final def setLightmapSizeHint(size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("Mesh", "set_lightmap_size_hint", 1130785943L), hostObject.objectPtr, size)

  /** Mesh.get_lightmap_size_hint */
  final def getLightmapSizeHint(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("Mesh", "get_lightmap_size_hint", 3690982128L), hostObject.objectPtr)

  /** Mesh.get_aabb */
  final def getAabb(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("Mesh", "get_aabb", 1068685055L), hostObject.objectPtr)

  /** Mesh.get_surface_count */
  final def getSurfaceCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Mesh", "get_surface_count", 3905245786L), hostObject.objectPtr)

  /** Mesh.surface_set_material */
  final def surfaceSetMaterial(surf_idx: Long, material: Material): Unit =
    Ptrcall.callVoid2(MethodBind.get("Mesh", "surface_set_material", 3671737478L), hostObject.objectPtr, surf_idx, material.hostObject)

  /** Mesh.surface_get_material */
  final def surfaceGetMaterial(surf_idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("Mesh", "surface_get_material", 2897466400L), hostObject.objectPtr, surf_idx)

  /** Mesh.create_placeholder */
  final def createPlaceholder(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Mesh", "create_placeholder", 121922552L), hostObject.objectPtr)

  /** Mesh.create_trimesh_shape */
  final def createTrimeshShape(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Mesh", "create_trimesh_shape", 4160111210L), hostObject.objectPtr)

  /** Mesh.create_convex_shape */
  final def createConvexShape(clean: Boolean, simplify: Boolean): GodotObject =
    Ptrcall.call2[Boolean, Boolean, GodotObject](MethodBind.get("Mesh", "create_convex_shape", 2529984628L), hostObject.objectPtr, clean, simplify)

  /** Mesh.create_outline */
  final def createOutline(margin: Double): GodotObject =
    Ptrcall.call1[Double, GodotObject](MethodBind.get("Mesh", "create_outline", 1208642001L), hostObject.objectPtr, margin)

  /** Mesh.generate_triangle_mesh */
  final def generateTriangleMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Mesh", "generate_triangle_mesh", 3476533166L), hostObject.objectPtr)

}
