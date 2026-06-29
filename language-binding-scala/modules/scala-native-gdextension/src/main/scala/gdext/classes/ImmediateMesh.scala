package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ImmediateMesh`, extends `Mesh`. */
abstract class ImmediateMesh extends Mesh {
  override def godotClassName: String = "ImmediateMesh"

  /** ImmediateMesh.surface_begin */
  final def surfaceBegin(primitive: Long, material: Material): Unit =
    Ptrcall.callVoid2(MethodBind.get("ImmediateMesh", "surface_begin", 2794442543L), hostObject.objectPtr, primitive, material.hostObject)

  /** ImmediateMesh.surface_set_color */
  final def surfaceSetColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImmediateMesh", "surface_set_color", 2920490490L), hostObject.objectPtr, color)

  /** ImmediateMesh.surface_set_normal */
  final def surfaceSetNormal(normal: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImmediateMesh", "surface_set_normal", 3460891852L), hostObject.objectPtr, normal)

  /** ImmediateMesh.surface_set_tangent */
  final def surfaceSetTangent(tangent: gdext.builtin.Plane): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImmediateMesh", "surface_set_tangent", 3505987427L), hostObject.objectPtr, tangent)

  /** ImmediateMesh.surface_set_uv */
  final def surfaceSetUv(uv: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImmediateMesh", "surface_set_uv", 743155724L), hostObject.objectPtr, uv)

  /** ImmediateMesh.surface_set_uv2 */
  final def surfaceSetUv2(uv2: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImmediateMesh", "surface_set_uv2", 743155724L), hostObject.objectPtr, uv2)

  /** ImmediateMesh.surface_add_vertex */
  final def surfaceAddVertex(vertex: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImmediateMesh", "surface_add_vertex", 3460891852L), hostObject.objectPtr, vertex)

  /** ImmediateMesh.surface_add_vertex_2d */
  final def surfaceAddVertex2d(vertex: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImmediateMesh", "surface_add_vertex_2d", 743155724L), hostObject.objectPtr, vertex)

  /** ImmediateMesh.surface_end */
  final def surfaceEnd(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ImmediateMesh", "surface_end", 3218959716L), hostObject.objectPtr)

  /** ImmediateMesh.clear_surfaces */
  final def clearSurfaces(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ImmediateMesh", "clear_surfaces", 3218959716L), hostObject.objectPtr)

}
