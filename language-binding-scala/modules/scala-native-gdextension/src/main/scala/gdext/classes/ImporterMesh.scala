package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ImporterMesh`, extends `Resource`. */
abstract class ImporterMesh extends Resource {
  override def godotClassName: String = "ImporterMesh"

  /** ImporterMesh.add_blend_shape */
  final def addBlendShape(name: String): Unit = {
    if (gdext.classes.ImporterMesh.mb_add_blend_shape == null) gdext.classes.ImporterMesh.mb_add_blend_shape = MethodBind.get("ImporterMesh", "add_blend_shape", 83702148L)
    Ptrcall.callVoid1(gdext.classes.ImporterMesh.mb_add_blend_shape, livePtr, name)
  }

  /** ImporterMesh.get_blend_shape_count */
  final def getBlendShapeCount(): Long = {
    if (gdext.classes.ImporterMesh.mb_get_blend_shape_count == null) gdext.classes.ImporterMesh.mb_get_blend_shape_count = MethodBind.get("ImporterMesh", "get_blend_shape_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ImporterMesh.mb_get_blend_shape_count, livePtr)
  }

  /** ImporterMesh.get_blend_shape_name */
  final def getBlendShapeName(blendShapeIdx: Long): String = {
    if (gdext.classes.ImporterMesh.mb_get_blend_shape_name == null) gdext.classes.ImporterMesh.mb_get_blend_shape_name = MethodBind.get("ImporterMesh", "get_blend_shape_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.ImporterMesh.mb_get_blend_shape_name, livePtr, blendShapeIdx)
  }

  /** ImporterMesh.set_blend_shape_mode */
  final def setBlendShapeMode(mode: gdext.classes.Mesh.BlendShapeMode): Unit = {
    if (gdext.classes.ImporterMesh.mb_set_blend_shape_mode == null) gdext.classes.ImporterMesh.mb_set_blend_shape_mode = MethodBind.get("ImporterMesh", "set_blend_shape_mode", 227983991L)
    Ptrcall.callVoid1(gdext.classes.ImporterMesh.mb_set_blend_shape_mode, livePtr, mode)
  }

  /** ImporterMesh.get_blend_shape_mode */
  final def getBlendShapeMode(): gdext.classes.Mesh.BlendShapeMode = {
    if (gdext.classes.ImporterMesh.mb_get_blend_shape_mode == null) gdext.classes.ImporterMesh.mb_get_blend_shape_mode = MethodBind.get("ImporterMesh", "get_blend_shape_mode", 836485024L)
    gdext.classes.Mesh.BlendShapeMode(Ptrcall.call0[Long](gdext.classes.ImporterMesh.mb_get_blend_shape_mode, livePtr))
  }

  /** ImporterMesh.get_surface_count */
  final def getSurfaceCount(): Long = {
    if (gdext.classes.ImporterMesh.mb_get_surface_count == null) gdext.classes.ImporterMesh.mb_get_surface_count = MethodBind.get("ImporterMesh", "get_surface_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ImporterMesh.mb_get_surface_count, livePtr)
  }

  /** ImporterMesh.get_surface_primitive_type */
  final def getSurfacePrimitiveType(surfaceIdx: Long): gdext.classes.Mesh.PrimitiveType = {
    if (gdext.classes.ImporterMesh.mb_get_surface_primitive_type == null) gdext.classes.ImporterMesh.mb_get_surface_primitive_type = MethodBind.get("ImporterMesh", "get_surface_primitive_type", 3552571330L)
    gdext.classes.Mesh.PrimitiveType(Ptrcall.call1[Long, Long](gdext.classes.ImporterMesh.mb_get_surface_primitive_type, livePtr, surfaceIdx))
  }

  /** ImporterMesh.get_surface_name */
  final def getSurfaceName(surfaceIdx: Long): String = {
    if (gdext.classes.ImporterMesh.mb_get_surface_name == null) gdext.classes.ImporterMesh.mb_get_surface_name = MethodBind.get("ImporterMesh", "get_surface_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.ImporterMesh.mb_get_surface_name, livePtr, surfaceIdx)
  }

  /** ImporterMesh.get_surface_lod_count */
  final def getSurfaceLodCount(surfaceIdx: Long): Long = {
    if (gdext.classes.ImporterMesh.mb_get_surface_lod_count == null) gdext.classes.ImporterMesh.mb_get_surface_lod_count = MethodBind.get("ImporterMesh", "get_surface_lod_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.ImporterMesh.mb_get_surface_lod_count, livePtr, surfaceIdx)
  }

  /** ImporterMesh.get_surface_lod_size */
  final def getSurfaceLodSize(surfaceIdx: Long, lodIdx: Long): Double = {
    if (gdext.classes.ImporterMesh.mb_get_surface_lod_size == null) gdext.classes.ImporterMesh.mb_get_surface_lod_size = MethodBind.get("ImporterMesh", "get_surface_lod_size", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.ImporterMesh.mb_get_surface_lod_size, livePtr, surfaceIdx, lodIdx)
  }

  /** ImporterMesh.get_surface_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSurfaceMaterial(surfaceIdx: Long): Material = {
    if (gdext.classes.ImporterMesh.mb_get_surface_material == null) gdext.classes.ImporterMesh.mb_get_surface_material = MethodBind.get("ImporterMesh", "get_surface_material", 2897466400L)
    Wrappers.owned[Material](Ptrcall.call1[Long, Long](gdext.classes.ImporterMesh.mb_get_surface_material, livePtr, surfaceIdx))
  }

  /** ImporterMesh.get_surface_format */
  final def getSurfaceFormat(surfaceIdx: Long): Long = {
    if (gdext.classes.ImporterMesh.mb_get_surface_format == null) gdext.classes.ImporterMesh.mb_get_surface_format = MethodBind.get("ImporterMesh", "get_surface_format", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.ImporterMesh.mb_get_surface_format, livePtr, surfaceIdx)
  }

  /** ImporterMesh.set_surface_name */
  final def setSurfaceName(surfaceIdx: Long, name: String): Unit = {
    if (gdext.classes.ImporterMesh.mb_set_surface_name == null) gdext.classes.ImporterMesh.mb_set_surface_name = MethodBind.get("ImporterMesh", "set_surface_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.ImporterMesh.mb_set_surface_name, livePtr, surfaceIdx, name)
  }

  /** ImporterMesh.set_surface_material */
  final def setSurfaceMaterial(surfaceIdx: Long, material: Material): Unit = {
    if (gdext.classes.ImporterMesh.mb_set_surface_material == null) gdext.classes.ImporterMesh.mb_set_surface_material = MethodBind.get("ImporterMesh", "set_surface_material", 3671737478L)
    Ptrcall.callVoid2(gdext.classes.ImporterMesh.mb_set_surface_material, livePtr, surfaceIdx, Wrappers.handle(material))
  }

  /** ImporterMesh.get_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMesh(baseMesh: ArrayMesh = null): ArrayMesh = {
    if (gdext.classes.ImporterMesh.mb_get_mesh == null) gdext.classes.ImporterMesh.mb_get_mesh = MethodBind.get("ImporterMesh", "get_mesh", 1457573577L)
    Wrappers.owned[ArrayMesh](Ptrcall.call1[GodotObject, Long](gdext.classes.ImporterMesh.mb_get_mesh, livePtr, Wrappers.handle(baseMesh)))
  }

  /** ImporterMesh.clear */
  final def clear(): Unit = {
    if (gdext.classes.ImporterMesh.mb_clear == null) gdext.classes.ImporterMesh.mb_clear = MethodBind.get("ImporterMesh", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ImporterMesh.mb_clear, livePtr)
  }

  /** ImporterMesh.set_lightmap_size_hint */
  final def setLightmapSizeHint(size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.ImporterMesh.mb_set_lightmap_size_hint == null) gdext.classes.ImporterMesh.mb_set_lightmap_size_hint = MethodBind.get("ImporterMesh", "set_lightmap_size_hint", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.ImporterMesh.mb_set_lightmap_size_hint, livePtr, size)
  }

  /** ImporterMesh.get_lightmap_size_hint */
  final def getLightmapSizeHint(): gdext.builtin.Vector2i = {
    if (gdext.classes.ImporterMesh.mb_get_lightmap_size_hint == null) gdext.classes.ImporterMesh.mb_get_lightmap_size_hint = MethodBind.get("ImporterMesh", "get_lightmap_size_hint", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.ImporterMesh.mb_get_lightmap_size_hint, livePtr)
  }

}

object ImporterMesh {
  private[classes] var mb_add_blend_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_shape_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_shape_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_shape_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_shape_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_surface_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_surface_primitive_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_surface_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_surface_lod_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_surface_lod_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_surface_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_surface_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_surface_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_surface_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_from_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lightmap_size_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lightmap_size_hint: GDExtensionMethodBindPtr = null

  /** ImporterMesh.from_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def fromMesh(mesh: Mesh): ImporterMesh = {
    if (gdext.classes.ImporterMesh.mb_from_mesh == null) gdext.classes.ImporterMesh.mb_from_mesh = MethodBind.get("ImporterMesh", "from_mesh", 283226343L)
    Wrappers.owned[ImporterMesh](Ptrcall.call1[GodotObject, Long](gdext.classes.ImporterMesh.mb_from_mesh, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(mesh)))
  }
}
