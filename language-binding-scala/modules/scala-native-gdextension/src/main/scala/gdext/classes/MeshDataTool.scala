package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MeshDataTool`, extends `RefCounted`. */
abstract class MeshDataTool extends RefCounted {
  override def godotClassName: String = "MeshDataTool"

  /** MeshDataTool.clear */
  final def clear(): Unit = {
    if (gdext.classes.MeshDataTool.mb_clear == null) gdext.classes.MeshDataTool.mb_clear = MethodBind.get("MeshDataTool", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.MeshDataTool.mb_clear, livePtr)
  }

  /** MeshDataTool.create_from_surface */
  final def createFromSurface(mesh: ArrayMesh, surface: Long): gdext.classes.Error = {
    if (gdext.classes.MeshDataTool.mb_create_from_surface == null) gdext.classes.MeshDataTool.mb_create_from_surface = MethodBind.get("MeshDataTool", "create_from_surface", 2727020678L)
    gdext.classes.Error(Ptrcall.call2[GodotObject, Long, Long](gdext.classes.MeshDataTool.mb_create_from_surface, livePtr, Wrappers.handle(mesh), surface))
  }

  /** MeshDataTool.commit_to_surface */
  final def commitToSurface(mesh: ArrayMesh, compressionFlags: Long = 0L): gdext.classes.Error = {
    if (gdext.classes.MeshDataTool.mb_commit_to_surface == null) gdext.classes.MeshDataTool.mb_commit_to_surface = MethodBind.get("MeshDataTool", "commit_to_surface", 2021686445L)
    gdext.classes.Error(Ptrcall.call2[GodotObject, Long, Long](gdext.classes.MeshDataTool.mb_commit_to_surface, livePtr, Wrappers.handle(mesh), compressionFlags))
  }

  /** MeshDataTool.get_format */
  final def getFormat(): Long = {
    if (gdext.classes.MeshDataTool.mb_get_format == null) gdext.classes.MeshDataTool.mb_get_format = MethodBind.get("MeshDataTool", "get_format", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshDataTool.mb_get_format, livePtr)
  }

  /** MeshDataTool.get_vertex_count */
  final def getVertexCount(): Long = {
    if (gdext.classes.MeshDataTool.mb_get_vertex_count == null) gdext.classes.MeshDataTool.mb_get_vertex_count = MethodBind.get("MeshDataTool", "get_vertex_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshDataTool.mb_get_vertex_count, livePtr)
  }

  /** MeshDataTool.get_edge_count */
  final def getEdgeCount(): Long = {
    if (gdext.classes.MeshDataTool.mb_get_edge_count == null) gdext.classes.MeshDataTool.mb_get_edge_count = MethodBind.get("MeshDataTool", "get_edge_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshDataTool.mb_get_edge_count, livePtr)
  }

  /** MeshDataTool.get_face_count */
  final def getFaceCount(): Long = {
    if (gdext.classes.MeshDataTool.mb_get_face_count == null) gdext.classes.MeshDataTool.mb_get_face_count = MethodBind.get("MeshDataTool", "get_face_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshDataTool.mb_get_face_count, livePtr)
  }

  /** MeshDataTool.set_vertex */
  final def setVertex(idx: Long, vertex: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.MeshDataTool.mb_set_vertex == null) gdext.classes.MeshDataTool.mb_set_vertex = MethodBind.get("MeshDataTool", "set_vertex", 1530502735L)
    Ptrcall.callVoid2(gdext.classes.MeshDataTool.mb_set_vertex, livePtr, idx, vertex)
  }

  /** MeshDataTool.get_vertex */
  final def getVertex(idx: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.MeshDataTool.mb_get_vertex == null) gdext.classes.MeshDataTool.mb_get_vertex = MethodBind.get("MeshDataTool", "get_vertex", 711720468L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.MeshDataTool.mb_get_vertex, livePtr, idx)
  }

  /** MeshDataTool.set_vertex_normal */
  final def setVertexNormal(idx: Long, normal: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.MeshDataTool.mb_set_vertex_normal == null) gdext.classes.MeshDataTool.mb_set_vertex_normal = MethodBind.get("MeshDataTool", "set_vertex_normal", 1530502735L)
    Ptrcall.callVoid2(gdext.classes.MeshDataTool.mb_set_vertex_normal, livePtr, idx, normal)
  }

  /** MeshDataTool.get_vertex_normal */
  final def getVertexNormal(idx: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.MeshDataTool.mb_get_vertex_normal == null) gdext.classes.MeshDataTool.mb_get_vertex_normal = MethodBind.get("MeshDataTool", "get_vertex_normal", 711720468L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.MeshDataTool.mb_get_vertex_normal, livePtr, idx)
  }

  /** MeshDataTool.set_vertex_tangent */
  final def setVertexTangent(idx: Long, tangent: gdext.builtin.Plane): Unit = {
    if (gdext.classes.MeshDataTool.mb_set_vertex_tangent == null) gdext.classes.MeshDataTool.mb_set_vertex_tangent = MethodBind.get("MeshDataTool", "set_vertex_tangent", 1104099133L)
    Ptrcall.callVoid2(gdext.classes.MeshDataTool.mb_set_vertex_tangent, livePtr, idx, tangent)
  }

  /** MeshDataTool.get_vertex_tangent */
  final def getVertexTangent(idx: Long): gdext.builtin.Plane = {
    if (gdext.classes.MeshDataTool.mb_get_vertex_tangent == null) gdext.classes.MeshDataTool.mb_get_vertex_tangent = MethodBind.get("MeshDataTool", "get_vertex_tangent", 1372055458L)
    Ptrcall.call1[Long, gdext.builtin.Plane](gdext.classes.MeshDataTool.mb_get_vertex_tangent, livePtr, idx)
  }

  /** MeshDataTool.set_vertex_uv */
  final def setVertexUv(idx: Long, uv: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.MeshDataTool.mb_set_vertex_uv == null) gdext.classes.MeshDataTool.mb_set_vertex_uv = MethodBind.get("MeshDataTool", "set_vertex_uv", 163021252L)
    Ptrcall.callVoid2(gdext.classes.MeshDataTool.mb_set_vertex_uv, livePtr, idx, uv)
  }

  /** MeshDataTool.get_vertex_uv */
  final def getVertexUv(idx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.MeshDataTool.mb_get_vertex_uv == null) gdext.classes.MeshDataTool.mb_get_vertex_uv = MethodBind.get("MeshDataTool", "get_vertex_uv", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.MeshDataTool.mb_get_vertex_uv, livePtr, idx)
  }

  /** MeshDataTool.set_vertex_uv2 */
  final def setVertexUv2(idx: Long, uv2: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.MeshDataTool.mb_set_vertex_uv2 == null) gdext.classes.MeshDataTool.mb_set_vertex_uv2 = MethodBind.get("MeshDataTool", "set_vertex_uv2", 163021252L)
    Ptrcall.callVoid2(gdext.classes.MeshDataTool.mb_set_vertex_uv2, livePtr, idx, uv2)
  }

  /** MeshDataTool.get_vertex_uv2 */
  final def getVertexUv2(idx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.MeshDataTool.mb_get_vertex_uv2 == null) gdext.classes.MeshDataTool.mb_get_vertex_uv2 = MethodBind.get("MeshDataTool", "get_vertex_uv2", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.MeshDataTool.mb_get_vertex_uv2, livePtr, idx)
  }

  /** MeshDataTool.set_vertex_color */
  final def setVertexColor(idx: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.MeshDataTool.mb_set_vertex_color == null) gdext.classes.MeshDataTool.mb_set_vertex_color = MethodBind.get("MeshDataTool", "set_vertex_color", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.MeshDataTool.mb_set_vertex_color, livePtr, idx, color)
  }

  /** MeshDataTool.get_vertex_color */
  final def getVertexColor(idx: Long): gdext.builtin.Color = {
    if (gdext.classes.MeshDataTool.mb_get_vertex_color == null) gdext.classes.MeshDataTool.mb_get_vertex_color = MethodBind.get("MeshDataTool", "get_vertex_color", 3457211756L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.MeshDataTool.mb_get_vertex_color, livePtr, idx)
  }

  /** MeshDataTool.get_edge_vertex */
  final def getEdgeVertex(idx: Long, vertex: Long): Long = {
    if (gdext.classes.MeshDataTool.mb_get_edge_vertex == null) gdext.classes.MeshDataTool.mb_get_edge_vertex = MethodBind.get("MeshDataTool", "get_edge_vertex", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.MeshDataTool.mb_get_edge_vertex, livePtr, idx, vertex)
  }

  /** MeshDataTool.get_face_vertex */
  final def getFaceVertex(idx: Long, vertex: Long): Long = {
    if (gdext.classes.MeshDataTool.mb_get_face_vertex == null) gdext.classes.MeshDataTool.mb_get_face_vertex = MethodBind.get("MeshDataTool", "get_face_vertex", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.MeshDataTool.mb_get_face_vertex, livePtr, idx, vertex)
  }

  /** MeshDataTool.get_face_edge */
  final def getFaceEdge(idx: Long, edge: Long): Long = {
    if (gdext.classes.MeshDataTool.mb_get_face_edge == null) gdext.classes.MeshDataTool.mb_get_face_edge = MethodBind.get("MeshDataTool", "get_face_edge", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.MeshDataTool.mb_get_face_edge, livePtr, idx, edge)
  }

  /** MeshDataTool.get_face_normal */
  final def getFaceNormal(idx: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.MeshDataTool.mb_get_face_normal == null) gdext.classes.MeshDataTool.mb_get_face_normal = MethodBind.get("MeshDataTool", "get_face_normal", 711720468L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.MeshDataTool.mb_get_face_normal, livePtr, idx)
  }

  /** MeshDataTool.set_material */
  final def setMaterial(material: Material): Unit = {
    if (gdext.classes.MeshDataTool.mb_set_material == null) gdext.classes.MeshDataTool.mb_set_material = MethodBind.get("MeshDataTool", "set_material", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.MeshDataTool.mb_set_material, livePtr, Wrappers.handle(material))
  }

  /** MeshDataTool.get_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMaterial(): Material = {
    if (gdext.classes.MeshDataTool.mb_get_material == null) gdext.classes.MeshDataTool.mb_get_material = MethodBind.get("MeshDataTool", "get_material", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.MeshDataTool.mb_get_material, livePtr))
  }

}

object MeshDataTool {
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_from_surface: GDExtensionMethodBindPtr = null
  private[classes] var mb_commit_to_surface: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertex_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_edge_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_face_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertex: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertex: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertex_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertex_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertex_tangent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertex_tangent: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertex_uv: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertex_uv: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertex_uv2: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertex_uv2: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertex_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertex_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_edge_vertex: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_face_vertex: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_face_edge: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_face_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_material: GDExtensionMethodBindPtr = null
}
