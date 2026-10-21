package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Mesh`, extends `Resource`. */
abstract class Mesh extends Resource {
  override def godotClassName: String = "Mesh"

  /** Mesh.set_lightmap_size_hint */
  final def setLightmapSizeHint(size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Mesh.mb_set_lightmap_size_hint == null) gdext.classes.Mesh.mb_set_lightmap_size_hint = MethodBind.get("Mesh", "set_lightmap_size_hint", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.Mesh.mb_set_lightmap_size_hint, livePtr, size)
  }

  /** Mesh.get_lightmap_size_hint */
  final def getLightmapSizeHint(): gdext.builtin.Vector2i = {
    if (gdext.classes.Mesh.mb_get_lightmap_size_hint == null) gdext.classes.Mesh.mb_get_lightmap_size_hint = MethodBind.get("Mesh", "get_lightmap_size_hint", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.Mesh.mb_get_lightmap_size_hint, livePtr)
  }

  /** Mesh.get_aabb */
  final def getAabb(): gdext.builtin.AABB = {
    if (gdext.classes.Mesh.mb_get_aabb == null) gdext.classes.Mesh.mb_get_aabb = MethodBind.get("Mesh", "get_aabb", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.Mesh.mb_get_aabb, livePtr)
  }

  /** Mesh.get_surface_count */
  final def getSurfaceCount(): Long = {
    if (gdext.classes.Mesh.mb_get_surface_count == null) gdext.classes.Mesh.mb_get_surface_count = MethodBind.get("Mesh", "get_surface_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Mesh.mb_get_surface_count, livePtr)
  }

  /** Mesh.surface_set_material */
  final def surfaceSetMaterial(surf_idx: Long, material: Material): Unit = {
    if (gdext.classes.Mesh.mb_surface_set_material == null) gdext.classes.Mesh.mb_surface_set_material = MethodBind.get("Mesh", "surface_set_material", 3671737478L)
    Ptrcall.callVoid2(gdext.classes.Mesh.mb_surface_set_material, livePtr, surf_idx, Wrappers.handle(material))
  }

  /** Mesh.surface_get_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def surfaceGetMaterial(surf_idx: Long): Material = {
    if (gdext.classes.Mesh.mb_surface_get_material == null) gdext.classes.Mesh.mb_surface_get_material = MethodBind.get("Mesh", "surface_get_material", 2897466400L)
    Wrappers.owned[Material](Ptrcall.call1[Long, Long](gdext.classes.Mesh.mb_surface_get_material, livePtr, surf_idx))
  }

  /** Mesh.create_placeholder. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createPlaceholder(): Resource = {
    if (gdext.classes.Mesh.mb_create_placeholder == null) gdext.classes.Mesh.mb_create_placeholder = MethodBind.get("Mesh", "create_placeholder", 121922552L)
    Wrappers.owned[Resource](Ptrcall.call0[Long](gdext.classes.Mesh.mb_create_placeholder, livePtr))
  }

  /** Mesh.create_trimesh_shape. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createTrimeshShape(): ConcavePolygonShape3D = {
    if (gdext.classes.Mesh.mb_create_trimesh_shape == null) gdext.classes.Mesh.mb_create_trimesh_shape = MethodBind.get("Mesh", "create_trimesh_shape", 4160111210L)
    Wrappers.owned[ConcavePolygonShape3D](Ptrcall.call0[Long](gdext.classes.Mesh.mb_create_trimesh_shape, livePtr))
  }

  /** Mesh.create_convex_shape. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createConvexShape(clean: Boolean, simplify: Boolean): ConvexPolygonShape3D = {
    if (gdext.classes.Mesh.mb_create_convex_shape == null) gdext.classes.Mesh.mb_create_convex_shape = MethodBind.get("Mesh", "create_convex_shape", 2529984628L)
    Wrappers.owned[ConvexPolygonShape3D](Ptrcall.call2[Boolean, Boolean, Long](gdext.classes.Mesh.mb_create_convex_shape, livePtr, clean, simplify))
  }

  /** Mesh.create_outline. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createOutline(margin: Double): Mesh = {
    if (gdext.classes.Mesh.mb_create_outline == null) gdext.classes.Mesh.mb_create_outline = MethodBind.get("Mesh", "create_outline", 1208642001L)
    Wrappers.owned[Mesh](Ptrcall.call1[Double, Long](gdext.classes.Mesh.mb_create_outline, livePtr, margin))
  }

  /** Mesh.generate_triangle_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def generateTriangleMesh(): TriangleMesh = {
    if (gdext.classes.Mesh.mb_generate_triangle_mesh == null) gdext.classes.Mesh.mb_generate_triangle_mesh = MethodBind.get("Mesh", "generate_triangle_mesh", 3476533166L)
    Wrappers.owned[TriangleMesh](Ptrcall.call0[Long](gdext.classes.Mesh.mb_generate_triangle_mesh, livePtr))
  }

}

object Mesh {
  private[classes] var mb_set_lightmap_size_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lightmap_size_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_surface_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_set_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_get_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_placeholder: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_trimesh_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_convex_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_outline: GDExtensionMethodBindPtr = null
  private[classes] var mb_generate_triangle_mesh: GDExtensionMethodBindPtr = null
}
