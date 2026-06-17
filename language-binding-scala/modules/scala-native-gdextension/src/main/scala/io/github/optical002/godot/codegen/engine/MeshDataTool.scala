package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `MeshDataTool`, extends `RefCounted`. */
abstract class MeshDataTool extends RefCounted {

  /** MeshDataTool.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("MeshDataTool", "clear", 3218959716L), hostObject.objectPtr)

  /** MeshDataTool.create_from_surface */
  final def createFromSurface(mesh: ArrayMesh, surface: Long): Long =
    Ptrcall.call2[GodotObject, Long, Long](MethodBind.get("MeshDataTool", "create_from_surface", 2727020678L), hostObject.objectPtr, mesh.hostObject, surface)

  /** MeshDataTool.commit_to_surface */
  final def commitToSurface(mesh: ArrayMesh, compression_flags: Long): Long =
    Ptrcall.call2[GodotObject, Long, Long](MethodBind.get("MeshDataTool", "commit_to_surface", 2021686445L), hostObject.objectPtr, mesh.hostObject, compression_flags)

  /** MeshDataTool.get_format */
  final def getFormat(): Long =
    Ptrcall.call0[Long](MethodBind.get("MeshDataTool", "get_format", 3905245786L), hostObject.objectPtr)

  /** MeshDataTool.get_vertex_count */
  final def getVertexCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("MeshDataTool", "get_vertex_count", 3905245786L), hostObject.objectPtr)

  /** MeshDataTool.get_edge_count */
  final def getEdgeCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("MeshDataTool", "get_edge_count", 3905245786L), hostObject.objectPtr)

  /** MeshDataTool.get_face_count */
  final def getFaceCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("MeshDataTool", "get_face_count", 3905245786L), hostObject.objectPtr)

  /** MeshDataTool.set_vertex */
  final def setVertex(idx: Long, vertex: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshDataTool", "set_vertex", 1530502735L), hostObject.objectPtr, idx, vertex)

  /** MeshDataTool.get_vertex */
  final def getVertex(idx: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("MeshDataTool", "get_vertex", 711720468L), hostObject.objectPtr, idx)

  /** MeshDataTool.set_vertex_normal */
  final def setVertexNormal(idx: Long, normal: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshDataTool", "set_vertex_normal", 1530502735L), hostObject.objectPtr, idx, normal)

  /** MeshDataTool.get_vertex_normal */
  final def getVertexNormal(idx: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("MeshDataTool", "get_vertex_normal", 711720468L), hostObject.objectPtr, idx)

  /** MeshDataTool.set_vertex_tangent */
  final def setVertexTangent(idx: Long, tangent: io.github.optical002.godot.builtin.Plane): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshDataTool", "set_vertex_tangent", 1104099133L), hostObject.objectPtr, idx, tangent)

  /** MeshDataTool.get_vertex_tangent */
  final def getVertexTangent(idx: Long): io.github.optical002.godot.builtin.Plane =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Plane](MethodBind.get("MeshDataTool", "get_vertex_tangent", 1372055458L), hostObject.objectPtr, idx)

  /** MeshDataTool.set_vertex_uv */
  final def setVertexUv(idx: Long, uv: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshDataTool", "set_vertex_uv", 163021252L), hostObject.objectPtr, idx, uv)

  /** MeshDataTool.get_vertex_uv */
  final def getVertexUv(idx: Long): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector2](MethodBind.get("MeshDataTool", "get_vertex_uv", 2299179447L), hostObject.objectPtr, idx)

  /** MeshDataTool.set_vertex_uv2 */
  final def setVertexUv2(idx: Long, uv2: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshDataTool", "set_vertex_uv2", 163021252L), hostObject.objectPtr, idx, uv2)

  /** MeshDataTool.get_vertex_uv2 */
  final def getVertexUv2(idx: Long): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector2](MethodBind.get("MeshDataTool", "get_vertex_uv2", 2299179447L), hostObject.objectPtr, idx)

  /** MeshDataTool.set_vertex_color */
  final def setVertexColor(idx: Long, color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshDataTool", "set_vertex_color", 2878471219L), hostObject.objectPtr, idx, color)

  /** MeshDataTool.get_vertex_color */
  final def getVertexColor(idx: Long): io.github.optical002.godot.builtin.Color =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Color](MethodBind.get("MeshDataTool", "get_vertex_color", 3457211756L), hostObject.objectPtr, idx)

  /** MeshDataTool.get_edge_vertex */
  final def getEdgeVertex(idx: Long, vertex: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("MeshDataTool", "get_edge_vertex", 3175239445L), hostObject.objectPtr, idx, vertex)

  /** MeshDataTool.get_face_vertex */
  final def getFaceVertex(idx: Long, vertex: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("MeshDataTool", "get_face_vertex", 3175239445L), hostObject.objectPtr, idx, vertex)

  /** MeshDataTool.get_face_edge */
  final def getFaceEdge(idx: Long, edge: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("MeshDataTool", "get_face_edge", 3175239445L), hostObject.objectPtr, idx, edge)

  /** MeshDataTool.get_face_normal */
  final def getFaceNormal(idx: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("MeshDataTool", "get_face_normal", 711720468L), hostObject.objectPtr, idx)

  /** MeshDataTool.set_material */
  final def setMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshDataTool", "set_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** MeshDataTool.get_material */
  final def getMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("MeshDataTool", "get_material", 5934680L), hostObject.objectPtr)

}

object MeshDataTool {
  /** Class metadata for Gd[MeshDataTool] lifetime management and casting. */
  given GodotClass[MeshDataTool] with {
    def className = "MeshDataTool"
    def isRefCounted = true
    def wrap(o: GodotObject): MeshDataTool = new MeshDataTool {}.withHost(o.objectPtr)
    def unwrap(t: MeshDataTool): GodotObject = t.hostObject
  }
}
