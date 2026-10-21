package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SurfaceTool`, extends `RefCounted`. */
abstract class SurfaceTool extends RefCounted {
  override def godotClassName: String = "SurfaceTool"

  /** SurfaceTool.set_skin_weight_count */
  final def setSkinWeightCount(count: Long): Unit = {
    if (gdext.classes.SurfaceTool.mb_set_skin_weight_count == null) gdext.classes.SurfaceTool.mb_set_skin_weight_count = MethodBind.get("SurfaceTool", "set_skin_weight_count", 618679515L)
    Ptrcall.callVoid1(gdext.classes.SurfaceTool.mb_set_skin_weight_count, livePtr, count)
  }

  /** SurfaceTool.get_skin_weight_count */
  final def getSkinWeightCount(): Long = {
    if (gdext.classes.SurfaceTool.mb_get_skin_weight_count == null) gdext.classes.SurfaceTool.mb_get_skin_weight_count = MethodBind.get("SurfaceTool", "get_skin_weight_count", 1072401130L)
    Ptrcall.call0[Long](gdext.classes.SurfaceTool.mb_get_skin_weight_count, livePtr)
  }

  /** SurfaceTool.set_custom_format */
  final def setCustomFormat(channel_index: Long, format: Long): Unit = {
    if (gdext.classes.SurfaceTool.mb_set_custom_format == null) gdext.classes.SurfaceTool.mb_set_custom_format = MethodBind.get("SurfaceTool", "set_custom_format", 4087759856L)
    Ptrcall.callVoid2(gdext.classes.SurfaceTool.mb_set_custom_format, livePtr, channel_index, format)
  }

  /** SurfaceTool.get_custom_format */
  final def getCustomFormat(channel_index: Long): Long = {
    if (gdext.classes.SurfaceTool.mb_get_custom_format == null) gdext.classes.SurfaceTool.mb_get_custom_format = MethodBind.get("SurfaceTool", "get_custom_format", 839863283L)
    Ptrcall.call1[Long, Long](gdext.classes.SurfaceTool.mb_get_custom_format, livePtr, channel_index)
  }

  /** SurfaceTool.begin */
  final def begin(primitive: Long): Unit = {
    if (gdext.classes.SurfaceTool.mb_begin == null) gdext.classes.SurfaceTool.mb_begin = MethodBind.get("SurfaceTool", "begin", 2230304113L)
    Ptrcall.callVoid1(gdext.classes.SurfaceTool.mb_begin, livePtr, primitive)
  }

  /** SurfaceTool.add_vertex */
  final def addVertex(vertex: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.SurfaceTool.mb_add_vertex == null) gdext.classes.SurfaceTool.mb_add_vertex = MethodBind.get("SurfaceTool", "add_vertex", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.SurfaceTool.mb_add_vertex, livePtr, vertex)
  }

  /** SurfaceTool.set_color */
  final def setColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.SurfaceTool.mb_set_color == null) gdext.classes.SurfaceTool.mb_set_color = MethodBind.get("SurfaceTool", "set_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.SurfaceTool.mb_set_color, livePtr, color)
  }

  /** SurfaceTool.set_normal */
  final def setNormal(normal: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.SurfaceTool.mb_set_normal == null) gdext.classes.SurfaceTool.mb_set_normal = MethodBind.get("SurfaceTool", "set_normal", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.SurfaceTool.mb_set_normal, livePtr, normal)
  }

  /** SurfaceTool.set_tangent */
  final def setTangent(tangent: gdext.builtin.Plane): Unit = {
    if (gdext.classes.SurfaceTool.mb_set_tangent == null) gdext.classes.SurfaceTool.mb_set_tangent = MethodBind.get("SurfaceTool", "set_tangent", 3505987427L)
    Ptrcall.callVoid1(gdext.classes.SurfaceTool.mb_set_tangent, livePtr, tangent)
  }

  /** SurfaceTool.set_uv */
  final def setUv(uv: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.SurfaceTool.mb_set_uv == null) gdext.classes.SurfaceTool.mb_set_uv = MethodBind.get("SurfaceTool", "set_uv", 743155724L)
    Ptrcall.callVoid1(gdext.classes.SurfaceTool.mb_set_uv, livePtr, uv)
  }

  /** SurfaceTool.set_uv2 */
  final def setUv2(uv2: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.SurfaceTool.mb_set_uv2 == null) gdext.classes.SurfaceTool.mb_set_uv2 = MethodBind.get("SurfaceTool", "set_uv2", 743155724L)
    Ptrcall.callVoid1(gdext.classes.SurfaceTool.mb_set_uv2, livePtr, uv2)
  }

  /** SurfaceTool.set_custom */
  final def setCustom(channel_index: Long, custom_color: gdext.builtin.Color): Unit = {
    if (gdext.classes.SurfaceTool.mb_set_custom == null) gdext.classes.SurfaceTool.mb_set_custom = MethodBind.get("SurfaceTool", "set_custom", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.SurfaceTool.mb_set_custom, livePtr, channel_index, custom_color)
  }

  /** SurfaceTool.set_smooth_group */
  final def setSmoothGroup(index: Long): Unit = {
    if (gdext.classes.SurfaceTool.mb_set_smooth_group == null) gdext.classes.SurfaceTool.mb_set_smooth_group = MethodBind.get("SurfaceTool", "set_smooth_group", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SurfaceTool.mb_set_smooth_group, livePtr, index)
  }

  /** SurfaceTool.add_index */
  final def addIndex(index: Long): Unit = {
    if (gdext.classes.SurfaceTool.mb_add_index == null) gdext.classes.SurfaceTool.mb_add_index = MethodBind.get("SurfaceTool", "add_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SurfaceTool.mb_add_index, livePtr, index)
  }

  /** SurfaceTool.index */
  final def index(): Unit = {
    if (gdext.classes.SurfaceTool.mb_index == null) gdext.classes.SurfaceTool.mb_index = MethodBind.get("SurfaceTool", "index", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SurfaceTool.mb_index, livePtr)
  }

  /** SurfaceTool.deindex */
  final def deindex(): Unit = {
    if (gdext.classes.SurfaceTool.mb_deindex == null) gdext.classes.SurfaceTool.mb_deindex = MethodBind.get("SurfaceTool", "deindex", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SurfaceTool.mb_deindex, livePtr)
  }

  /** SurfaceTool.generate_normals */
  final def generateNormals(flip: Boolean): Unit = {
    if (gdext.classes.SurfaceTool.mb_generate_normals == null) gdext.classes.SurfaceTool.mb_generate_normals = MethodBind.get("SurfaceTool", "generate_normals", 107499316L)
    Ptrcall.callVoid1(gdext.classes.SurfaceTool.mb_generate_normals, livePtr, flip)
  }

  /** SurfaceTool.generate_tangents */
  final def generateTangents(): Unit = {
    if (gdext.classes.SurfaceTool.mb_generate_tangents == null) gdext.classes.SurfaceTool.mb_generate_tangents = MethodBind.get("SurfaceTool", "generate_tangents", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SurfaceTool.mb_generate_tangents, livePtr)
  }

  /** SurfaceTool.optimize_indices_for_cache */
  final def optimizeIndicesForCache(): Unit = {
    if (gdext.classes.SurfaceTool.mb_optimize_indices_for_cache == null) gdext.classes.SurfaceTool.mb_optimize_indices_for_cache = MethodBind.get("SurfaceTool", "optimize_indices_for_cache", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SurfaceTool.mb_optimize_indices_for_cache, livePtr)
  }

  /** SurfaceTool.get_aabb */
  final def getAabb(): gdext.builtin.AABB = {
    if (gdext.classes.SurfaceTool.mb_get_aabb == null) gdext.classes.SurfaceTool.mb_get_aabb = MethodBind.get("SurfaceTool", "get_aabb", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.SurfaceTool.mb_get_aabb, livePtr)
  }

  /** SurfaceTool.set_material */
  final def setMaterial(material: Material): Unit = {
    if (gdext.classes.SurfaceTool.mb_set_material == null) gdext.classes.SurfaceTool.mb_set_material = MethodBind.get("SurfaceTool", "set_material", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.SurfaceTool.mb_set_material, livePtr, Wrappers.handle(material))
  }

  /** SurfaceTool.get_primitive_type */
  final def getPrimitiveType(): Long = {
    if (gdext.classes.SurfaceTool.mb_get_primitive_type == null) gdext.classes.SurfaceTool.mb_get_primitive_type = MethodBind.get("SurfaceTool", "get_primitive_type", 768822145L)
    Ptrcall.call0[Long](gdext.classes.SurfaceTool.mb_get_primitive_type, livePtr)
  }

  /** SurfaceTool.clear */
  final def clear(): Unit = {
    if (gdext.classes.SurfaceTool.mb_clear == null) gdext.classes.SurfaceTool.mb_clear = MethodBind.get("SurfaceTool", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SurfaceTool.mb_clear, livePtr)
  }

  /** SurfaceTool.create_from */
  final def createFrom(existing: Mesh, surface: Long): Unit = {
    if (gdext.classes.SurfaceTool.mb_create_from == null) gdext.classes.SurfaceTool.mb_create_from = MethodBind.get("SurfaceTool", "create_from", 1767024570L)
    Ptrcall.callVoid2(gdext.classes.SurfaceTool.mb_create_from, livePtr, Wrappers.handle(existing), surface)
  }

  /** SurfaceTool.create_from_blend_shape */
  final def createFromBlendShape(existing: Mesh, surface: Long, blend_shape: String): Unit = {
    if (gdext.classes.SurfaceTool.mb_create_from_blend_shape == null) gdext.classes.SurfaceTool.mb_create_from_blend_shape = MethodBind.get("SurfaceTool", "create_from_blend_shape", 1306185582L)
    Ptrcall.callVoid3(gdext.classes.SurfaceTool.mb_create_from_blend_shape, livePtr, Wrappers.handle(existing), surface, blend_shape)
  }

  /** SurfaceTool.append_from */
  final def appendFrom(existing: Mesh, surface: Long, transform: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.SurfaceTool.mb_append_from == null) gdext.classes.SurfaceTool.mb_append_from = MethodBind.get("SurfaceTool", "append_from", 2217967155L)
    Ptrcall.callVoid3(gdext.classes.SurfaceTool.mb_append_from, livePtr, Wrappers.handle(existing), surface, transform)
  }

  /** SurfaceTool.commit. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def commit(existing: ArrayMesh, flags: Long): ArrayMesh = {
    if (gdext.classes.SurfaceTool.mb_commit == null) gdext.classes.SurfaceTool.mb_commit = MethodBind.get("SurfaceTool", "commit", 4107864055L)
    Wrappers.owned[ArrayMesh](Ptrcall.call2[GodotObject, Long, Long](gdext.classes.SurfaceTool.mb_commit, livePtr, Wrappers.handle(existing), flags))
  }

}

object SurfaceTool {
  private[classes] var mb_set_skin_weight_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skin_weight_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_vertex: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tangent: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uv: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uv2: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_smooth_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_deindex: GDExtensionMethodBindPtr = null
  private[classes] var mb_generate_normals: GDExtensionMethodBindPtr = null
  private[classes] var mb_generate_tangents: GDExtensionMethodBindPtr = null
  private[classes] var mb_optimize_indices_for_cache: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_primitive_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_from_blend_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_append_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_commit: GDExtensionMethodBindPtr = null
}
