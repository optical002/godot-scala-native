package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ArrayMesh`, extends `Mesh`. */
abstract class ArrayMesh extends Mesh {
  override def godotClassName: String = "ArrayMesh"

  /** ArrayMesh.add_blend_shape */
  final def addBlendShape(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.ArrayMesh.mb_add_blend_shape == null) gdext.classes.ArrayMesh.mb_add_blend_shape = MethodBind.get("ArrayMesh", "add_blend_shape", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.ArrayMesh.mb_add_blend_shape, livePtr, name)
  }

  /** ArrayMesh.get_blend_shape_count */
  final def getBlendShapeCount(): Long = {
    if (gdext.classes.ArrayMesh.mb_get_blend_shape_count == null) gdext.classes.ArrayMesh.mb_get_blend_shape_count = MethodBind.get("ArrayMesh", "get_blend_shape_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ArrayMesh.mb_get_blend_shape_count, livePtr)
  }

  /** ArrayMesh.get_blend_shape_name */
  final def getBlendShapeName(index: Long): gdext.builtin.StringName = {
    if (gdext.classes.ArrayMesh.mb_get_blend_shape_name == null) gdext.classes.ArrayMesh.mb_get_blend_shape_name = MethodBind.get("ArrayMesh", "get_blend_shape_name", 659327637L)
    Ptrcall.call1[Long, gdext.builtin.StringName](gdext.classes.ArrayMesh.mb_get_blend_shape_name, livePtr, index)
  }

  /** ArrayMesh.set_blend_shape_name */
  final def setBlendShapeName(index: Long, name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.ArrayMesh.mb_set_blend_shape_name == null) gdext.classes.ArrayMesh.mb_set_blend_shape_name = MethodBind.get("ArrayMesh", "set_blend_shape_name", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.ArrayMesh.mb_set_blend_shape_name, livePtr, index, name)
  }

  /** ArrayMesh.clear_blend_shapes */
  final def clearBlendShapes(): Unit = {
    if (gdext.classes.ArrayMesh.mb_clear_blend_shapes == null) gdext.classes.ArrayMesh.mb_clear_blend_shapes = MethodBind.get("ArrayMesh", "clear_blend_shapes", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ArrayMesh.mb_clear_blend_shapes, livePtr)
  }

  /** ArrayMesh.set_blend_shape_mode */
  final def setBlendShapeMode(mode: Long): Unit = {
    if (gdext.classes.ArrayMesh.mb_set_blend_shape_mode == null) gdext.classes.ArrayMesh.mb_set_blend_shape_mode = MethodBind.get("ArrayMesh", "set_blend_shape_mode", 227983991L)
    Ptrcall.callVoid1(gdext.classes.ArrayMesh.mb_set_blend_shape_mode, livePtr, mode)
  }

  /** ArrayMesh.get_blend_shape_mode */
  final def getBlendShapeMode(): Long = {
    if (gdext.classes.ArrayMesh.mb_get_blend_shape_mode == null) gdext.classes.ArrayMesh.mb_get_blend_shape_mode = MethodBind.get("ArrayMesh", "get_blend_shape_mode", 836485024L)
    Ptrcall.call0[Long](gdext.classes.ArrayMesh.mb_get_blend_shape_mode, livePtr)
  }

  /** ArrayMesh.clear_surfaces */
  final def clearSurfaces(): Unit = {
    if (gdext.classes.ArrayMesh.mb_clear_surfaces == null) gdext.classes.ArrayMesh.mb_clear_surfaces = MethodBind.get("ArrayMesh", "clear_surfaces", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ArrayMesh.mb_clear_surfaces, livePtr)
  }

  /** ArrayMesh.surface_remove */
  final def surfaceRemove(surf_idx: Long): Unit = {
    if (gdext.classes.ArrayMesh.mb_surface_remove == null) gdext.classes.ArrayMesh.mb_surface_remove = MethodBind.get("ArrayMesh", "surface_remove", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ArrayMesh.mb_surface_remove, livePtr, surf_idx)
  }

  /** ArrayMesh.surface_get_array_len */
  final def surfaceGetArrayLen(surf_idx: Long): Long = {
    if (gdext.classes.ArrayMesh.mb_surface_get_array_len == null) gdext.classes.ArrayMesh.mb_surface_get_array_len = MethodBind.get("ArrayMesh", "surface_get_array_len", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.ArrayMesh.mb_surface_get_array_len, livePtr, surf_idx)
  }

  /** ArrayMesh.surface_get_array_index_len */
  final def surfaceGetArrayIndexLen(surf_idx: Long): Long = {
    if (gdext.classes.ArrayMesh.mb_surface_get_array_index_len == null) gdext.classes.ArrayMesh.mb_surface_get_array_index_len = MethodBind.get("ArrayMesh", "surface_get_array_index_len", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.ArrayMesh.mb_surface_get_array_index_len, livePtr, surf_idx)
  }

  /** ArrayMesh.surface_get_format */
  final def surfaceGetFormat(surf_idx: Long): Long = {
    if (gdext.classes.ArrayMesh.mb_surface_get_format == null) gdext.classes.ArrayMesh.mb_surface_get_format = MethodBind.get("ArrayMesh", "surface_get_format", 3718287884L)
    Ptrcall.call1[Long, Long](gdext.classes.ArrayMesh.mb_surface_get_format, livePtr, surf_idx)
  }

  /** ArrayMesh.surface_get_primitive_type */
  final def surfaceGetPrimitiveType(surf_idx: Long): Long = {
    if (gdext.classes.ArrayMesh.mb_surface_get_primitive_type == null) gdext.classes.ArrayMesh.mb_surface_get_primitive_type = MethodBind.get("ArrayMesh", "surface_get_primitive_type", 4141943888L)
    Ptrcall.call1[Long, Long](gdext.classes.ArrayMesh.mb_surface_get_primitive_type, livePtr, surf_idx)
  }

  /** ArrayMesh.surface_find_by_name */
  final def surfaceFindByName(name: String): Long = {
    if (gdext.classes.ArrayMesh.mb_surface_find_by_name == null) gdext.classes.ArrayMesh.mb_surface_find_by_name = MethodBind.get("ArrayMesh", "surface_find_by_name", 1321353865L)
    Ptrcall.call1[String, Long](gdext.classes.ArrayMesh.mb_surface_find_by_name, livePtr, name)
  }

  /** ArrayMesh.surface_set_name */
  final def surfaceSetName(surf_idx: Long, name: String): Unit = {
    if (gdext.classes.ArrayMesh.mb_surface_set_name == null) gdext.classes.ArrayMesh.mb_surface_set_name = MethodBind.get("ArrayMesh", "surface_set_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.ArrayMesh.mb_surface_set_name, livePtr, surf_idx, name)
  }

  /** ArrayMesh.surface_get_name */
  final def surfaceGetName(surf_idx: Long): String = {
    if (gdext.classes.ArrayMesh.mb_surface_get_name == null) gdext.classes.ArrayMesh.mb_surface_get_name = MethodBind.get("ArrayMesh", "surface_get_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.ArrayMesh.mb_surface_get_name, livePtr, surf_idx)
  }

  /** ArrayMesh.regen_normal_maps */
  final def regenNormalMaps(): Unit = {
    if (gdext.classes.ArrayMesh.mb_regen_normal_maps == null) gdext.classes.ArrayMesh.mb_regen_normal_maps = MethodBind.get("ArrayMesh", "regen_normal_maps", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ArrayMesh.mb_regen_normal_maps, livePtr)
  }

  /** ArrayMesh.lightmap_unwrap */
  final def lightmapUnwrap(transform: gdext.builtin.Transform3D, texel_size: Double): Long = {
    if (gdext.classes.ArrayMesh.mb_lightmap_unwrap == null) gdext.classes.ArrayMesh.mb_lightmap_unwrap = MethodBind.get("ArrayMesh", "lightmap_unwrap", 1476641071L)
    Ptrcall.call2[gdext.builtin.Transform3D, Double, Long](gdext.classes.ArrayMesh.mb_lightmap_unwrap, livePtr, transform, texel_size)
  }

  /** ArrayMesh.set_custom_aabb */
  final def setCustomAabb(aabb: gdext.builtin.AABB): Unit = {
    if (gdext.classes.ArrayMesh.mb_set_custom_aabb == null) gdext.classes.ArrayMesh.mb_set_custom_aabb = MethodBind.get("ArrayMesh", "set_custom_aabb", 259215842L)
    Ptrcall.callVoid1(gdext.classes.ArrayMesh.mb_set_custom_aabb, livePtr, aabb)
  }

  /** ArrayMesh.get_custom_aabb */
  final def getCustomAabb(): gdext.builtin.AABB = {
    if (gdext.classes.ArrayMesh.mb_get_custom_aabb == null) gdext.classes.ArrayMesh.mb_get_custom_aabb = MethodBind.get("ArrayMesh", "get_custom_aabb", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.ArrayMesh.mb_get_custom_aabb, livePtr)
  }

  /** ArrayMesh.set_shadow_mesh */
  final def setShadowMesh(mesh: ArrayMesh): Unit = {
    if (gdext.classes.ArrayMesh.mb_set_shadow_mesh == null) gdext.classes.ArrayMesh.mb_set_shadow_mesh = MethodBind.get("ArrayMesh", "set_shadow_mesh", 3377897901L)
    Ptrcall.callVoid1(gdext.classes.ArrayMesh.mb_set_shadow_mesh, livePtr, Wrappers.handle(mesh))
  }

  /** ArrayMesh.get_shadow_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getShadowMesh(): ArrayMesh = {
    if (gdext.classes.ArrayMesh.mb_get_shadow_mesh == null) gdext.classes.ArrayMesh.mb_get_shadow_mesh = MethodBind.get("ArrayMesh", "get_shadow_mesh", 3206942465L)
    Wrappers.owned[ArrayMesh](Ptrcall.call0[Long](gdext.classes.ArrayMesh.mb_get_shadow_mesh, livePtr))
  }

}

object ArrayMesh {
  private[classes] var mb_add_blend_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_shape_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_shape_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_shape_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_blend_shapes: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_shape_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_shape_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_surfaces: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_remove: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_get_array_len: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_get_array_index_len: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_get_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_get_primitive_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_find_by_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_set_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_get_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_regen_normal_maps: GDExtensionMethodBindPtr = null
  private[classes] var mb_lightmap_unwrap: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shadow_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadow_mesh: GDExtensionMethodBindPtr = null
}
