package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ImporterMesh`, extends `Resource`. */
abstract class ImporterMesh extends Resource {

  /** ImporterMesh.add_blend_shape */
  final def addBlendShape(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImporterMesh", "add_blend_shape", 83702148L), hostObject.objectPtr, name)

  /** ImporterMesh.get_blend_shape_count */
  final def getBlendShapeCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("ImporterMesh", "get_blend_shape_count", 3905245786L), hostObject.objectPtr)

  /** ImporterMesh.get_blend_shape_name */
  final def getBlendShapeName(blend_shape_idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("ImporterMesh", "get_blend_shape_name", 844755477L), hostObject.objectPtr, blend_shape_idx)

  /** ImporterMesh.set_blend_shape_mode */
  final def setBlendShapeMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImporterMesh", "set_blend_shape_mode", 227983991L), hostObject.objectPtr, mode)

  /** ImporterMesh.get_blend_shape_mode */
  final def getBlendShapeMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("ImporterMesh", "get_blend_shape_mode", 836485024L), hostObject.objectPtr)

  /** ImporterMesh.get_surface_count */
  final def getSurfaceCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("ImporterMesh", "get_surface_count", 3905245786L), hostObject.objectPtr)

  /** ImporterMesh.get_surface_primitive_type */
  final def getSurfacePrimitiveType(surface_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ImporterMesh", "get_surface_primitive_type", 3552571330L), hostObject.objectPtr, surface_idx)

  /** ImporterMesh.get_surface_name */
  final def getSurfaceName(surface_idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("ImporterMesh", "get_surface_name", 844755477L), hostObject.objectPtr, surface_idx)

  /** ImporterMesh.get_surface_lod_count */
  final def getSurfaceLodCount(surface_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ImporterMesh", "get_surface_lod_count", 923996154L), hostObject.objectPtr, surface_idx)

  /** ImporterMesh.get_surface_lod_size */
  final def getSurfaceLodSize(surface_idx: Long, lod_idx: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("ImporterMesh", "get_surface_lod_size", 3085491603L), hostObject.objectPtr, surface_idx, lod_idx)

  /** ImporterMesh.get_surface_material */
  final def getSurfaceMaterial(surface_idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("ImporterMesh", "get_surface_material", 2897466400L), hostObject.objectPtr, surface_idx)

  /** ImporterMesh.get_surface_format */
  final def getSurfaceFormat(surface_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ImporterMesh", "get_surface_format", 923996154L), hostObject.objectPtr, surface_idx)

  /** ImporterMesh.set_surface_name */
  final def setSurfaceName(surface_idx: Long, name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("ImporterMesh", "set_surface_name", 501894301L), hostObject.objectPtr, surface_idx, name)

  /** ImporterMesh.set_surface_material */
  final def setSurfaceMaterial(surface_idx: Long, material: Material): Unit =
    Ptrcall.callVoid2(MethodBind.get("ImporterMesh", "set_surface_material", 3671737478L), hostObject.objectPtr, surface_idx, material.hostObject)

  /** ImporterMesh.get_mesh */
  final def getMesh(base_mesh: ArrayMesh): GodotObject =
    Ptrcall.call1[GodotObject, GodotObject](MethodBind.get("ImporterMesh", "get_mesh", 1457573577L), hostObject.objectPtr, base_mesh.hostObject)

  /** ImporterMesh.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ImporterMesh", "clear", 3218959716L), hostObject.objectPtr)

  /** ImporterMesh.set_lightmap_size_hint */
  final def setLightmapSizeHint(size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImporterMesh", "set_lightmap_size_hint", 1130785943L), hostObject.objectPtr, size)

  /** ImporterMesh.get_lightmap_size_hint */
  final def getLightmapSizeHint(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("ImporterMesh", "get_lightmap_size_hint", 3690982128L), hostObject.objectPtr)

}

object ImporterMesh {
  /** Class metadata for Gd[ImporterMesh] lifetime management and casting. */
  given GodotClass[ImporterMesh] with {
    def className = "ImporterMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): ImporterMesh = new ImporterMesh {}.withHost(o.objectPtr)
    def unwrap(t: ImporterMesh): GodotObject = t.hostObject
  }
}
