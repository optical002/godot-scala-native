package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ArrayMesh`, extends `Mesh`. */
abstract class ArrayMesh extends Mesh {

  /** ArrayMesh.add_blend_shape */
  final def addBlendShape(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("ArrayMesh", "add_blend_shape", 3304788590L), hostObject.objectPtr, name)

  /** ArrayMesh.get_blend_shape_count */
  final def getBlendShapeCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("ArrayMesh", "get_blend_shape_count", 3905245786L), hostObject.objectPtr)

  /** ArrayMesh.get_blend_shape_name */
  final def getBlendShapeName(index: Long): gdext.builtin.StringName =
    Ptrcall.call1[Long, gdext.builtin.StringName](MethodBind.get("ArrayMesh", "get_blend_shape_name", 659327637L), hostObject.objectPtr, index)

  /** ArrayMesh.set_blend_shape_name */
  final def setBlendShapeName(index: Long, name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("ArrayMesh", "set_blend_shape_name", 3780747571L), hostObject.objectPtr, index, name)

  /** ArrayMesh.clear_blend_shapes */
  final def clearBlendShapes(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ArrayMesh", "clear_blend_shapes", 3218959716L), hostObject.objectPtr)

  /** ArrayMesh.set_blend_shape_mode */
  final def setBlendShapeMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ArrayMesh", "set_blend_shape_mode", 227983991L), hostObject.objectPtr, mode)

  /** ArrayMesh.get_blend_shape_mode */
  final def getBlendShapeMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("ArrayMesh", "get_blend_shape_mode", 836485024L), hostObject.objectPtr)

  /** ArrayMesh.clear_surfaces */
  final def clearSurfaces(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ArrayMesh", "clear_surfaces", 3218959716L), hostObject.objectPtr)

  /** ArrayMesh.surface_remove */
  final def surfaceRemove(surf_idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ArrayMesh", "surface_remove", 1286410249L), hostObject.objectPtr, surf_idx)

  /** ArrayMesh.surface_get_array_len */
  final def surfaceGetArrayLen(surf_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ArrayMesh", "surface_get_array_len", 923996154L), hostObject.objectPtr, surf_idx)

  /** ArrayMesh.surface_get_array_index_len */
  final def surfaceGetArrayIndexLen(surf_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ArrayMesh", "surface_get_array_index_len", 923996154L), hostObject.objectPtr, surf_idx)

  /** ArrayMesh.surface_get_format */
  final def surfaceGetFormat(surf_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ArrayMesh", "surface_get_format", 3718287884L), hostObject.objectPtr, surf_idx)

  /** ArrayMesh.surface_get_primitive_type */
  final def surfaceGetPrimitiveType(surf_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ArrayMesh", "surface_get_primitive_type", 4141943888L), hostObject.objectPtr, surf_idx)

  /** ArrayMesh.surface_find_by_name */
  final def surfaceFindByName(name: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("ArrayMesh", "surface_find_by_name", 1321353865L), hostObject.objectPtr, name)

  /** ArrayMesh.surface_set_name */
  final def surfaceSetName(surf_idx: Long, name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("ArrayMesh", "surface_set_name", 501894301L), hostObject.objectPtr, surf_idx, name)

  /** ArrayMesh.surface_get_name */
  final def surfaceGetName(surf_idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("ArrayMesh", "surface_get_name", 844755477L), hostObject.objectPtr, surf_idx)

  /** ArrayMesh.regen_normal_maps */
  final def regenNormalMaps(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ArrayMesh", "regen_normal_maps", 3218959716L), hostObject.objectPtr)

  /** ArrayMesh.lightmap_unwrap */
  final def lightmapUnwrap(transform: gdext.builtin.Transform3D, texel_size: Double): Long =
    Ptrcall.call2[gdext.builtin.Transform3D, Double, Long](MethodBind.get("ArrayMesh", "lightmap_unwrap", 1476641071L), hostObject.objectPtr, transform, texel_size)

  /** ArrayMesh.set_custom_aabb */
  final def setCustomAabb(aabb: gdext.builtin.AABB): Unit =
    Ptrcall.callVoid1(MethodBind.get("ArrayMesh", "set_custom_aabb", 259215842L), hostObject.objectPtr, aabb)

  /** ArrayMesh.get_custom_aabb */
  final def getCustomAabb(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("ArrayMesh", "get_custom_aabb", 1068685055L), hostObject.objectPtr)

  /** ArrayMesh.set_shadow_mesh */
  final def setShadowMesh(mesh: ArrayMesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("ArrayMesh", "set_shadow_mesh", 3377897901L), hostObject.objectPtr, mesh.hostObject)

  /** ArrayMesh.get_shadow_mesh */
  final def getShadowMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ArrayMesh", "get_shadow_mesh", 3206942465L), hostObject.objectPtr)

}

object ArrayMesh {
  /** Class metadata for Gd[ArrayMesh] lifetime management and casting. */
  given GodotClass[ArrayMesh] with {
    def className = "ArrayMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): ArrayMesh = new ArrayMesh {}.withHost(o.objectPtr)
    def unwrap(t: ArrayMesh): GodotObject = t.hostObject
  }
}
