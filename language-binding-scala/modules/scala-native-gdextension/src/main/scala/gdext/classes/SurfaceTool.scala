package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SurfaceTool`, extends `RefCounted`. */
abstract class SurfaceTool extends RefCounted {
  override def godotClassName: String = "SurfaceTool"

  /** SurfaceTool.set_skin_weight_count */
  final def setSkinWeightCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SurfaceTool", "set_skin_weight_count", 618679515L), hostObject.objectPtr, count)

  /** SurfaceTool.get_skin_weight_count */
  final def getSkinWeightCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("SurfaceTool", "get_skin_weight_count", 1072401130L), hostObject.objectPtr)

  /** SurfaceTool.set_custom_format */
  final def setCustomFormat(channel_index: Long, format: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SurfaceTool", "set_custom_format", 4087759856L), hostObject.objectPtr, channel_index, format)

  /** SurfaceTool.get_custom_format */
  final def getCustomFormat(channel_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SurfaceTool", "get_custom_format", 839863283L), hostObject.objectPtr, channel_index)

  /** SurfaceTool.begin */
  final def begin(primitive: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SurfaceTool", "begin", 2230304113L), hostObject.objectPtr, primitive)

  /** SurfaceTool.add_vertex */
  final def addVertex(vertex: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("SurfaceTool", "add_vertex", 3460891852L), hostObject.objectPtr, vertex)

  /** SurfaceTool.set_color */
  final def setColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("SurfaceTool", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** SurfaceTool.set_normal */
  final def setNormal(normal: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("SurfaceTool", "set_normal", 3460891852L), hostObject.objectPtr, normal)

  /** SurfaceTool.set_tangent */
  final def setTangent(tangent: gdext.builtin.Plane): Unit =
    Ptrcall.callVoid1(MethodBind.get("SurfaceTool", "set_tangent", 3505987427L), hostObject.objectPtr, tangent)

  /** SurfaceTool.set_uv */
  final def setUv(uv: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("SurfaceTool", "set_uv", 743155724L), hostObject.objectPtr, uv)

  /** SurfaceTool.set_uv2 */
  final def setUv2(uv2: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("SurfaceTool", "set_uv2", 743155724L), hostObject.objectPtr, uv2)

  /** SurfaceTool.set_custom */
  final def setCustom(channel_index: Long, custom_color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("SurfaceTool", "set_custom", 2878471219L), hostObject.objectPtr, channel_index, custom_color)

  /** SurfaceTool.set_smooth_group */
  final def setSmoothGroup(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SurfaceTool", "set_smooth_group", 1286410249L), hostObject.objectPtr, index)

  /** SurfaceTool.add_index */
  final def addIndex(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SurfaceTool", "add_index", 1286410249L), hostObject.objectPtr, index)

  /** SurfaceTool.index */
  final def index(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SurfaceTool", "index", 3218959716L), hostObject.objectPtr)

  /** SurfaceTool.deindex */
  final def deindex(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SurfaceTool", "deindex", 3218959716L), hostObject.objectPtr)

  /** SurfaceTool.generate_normals */
  final def generateNormals(flip: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SurfaceTool", "generate_normals", 107499316L), hostObject.objectPtr, flip)

  /** SurfaceTool.generate_tangents */
  final def generateTangents(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SurfaceTool", "generate_tangents", 3218959716L), hostObject.objectPtr)

  /** SurfaceTool.optimize_indices_for_cache */
  final def optimizeIndicesForCache(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SurfaceTool", "optimize_indices_for_cache", 3218959716L), hostObject.objectPtr)

  /** SurfaceTool.get_aabb */
  final def getAabb(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("SurfaceTool", "get_aabb", 1068685055L), hostObject.objectPtr)

  /** SurfaceTool.set_material */
  final def setMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("SurfaceTool", "set_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** SurfaceTool.get_primitive_type */
  final def getPrimitiveType(): Long =
    Ptrcall.call0[Long](MethodBind.get("SurfaceTool", "get_primitive_type", 768822145L), hostObject.objectPtr)

  /** SurfaceTool.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SurfaceTool", "clear", 3218959716L), hostObject.objectPtr)

  /** SurfaceTool.create_from */
  final def createFrom(existing: Mesh, surface: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SurfaceTool", "create_from", 1767024570L), hostObject.objectPtr, existing.hostObject, surface)

  /** SurfaceTool.create_from_blend_shape */
  final def createFromBlendShape(existing: Mesh, surface: Long, blend_shape: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("SurfaceTool", "create_from_blend_shape", 1306185582L), hostObject.objectPtr, existing.hostObject, surface, blend_shape)

  /** SurfaceTool.append_from */
  final def appendFrom(existing: Mesh, surface: Long, transform: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid3(MethodBind.get("SurfaceTool", "append_from", 2217967155L), hostObject.objectPtr, existing.hostObject, surface, transform)

  /** SurfaceTool.commit */
  final def commit(existing: ArrayMesh, flags: Long): GodotObject =
    Ptrcall.call2[GodotObject, Long, GodotObject](MethodBind.get("SurfaceTool", "commit", 4107864055L), hostObject.objectPtr, existing.hostObject, flags)

}
