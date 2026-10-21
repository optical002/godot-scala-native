package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ImmediateMesh`, extends `Mesh`. */
abstract class ImmediateMesh extends Mesh {
  override def godotClassName: String = "ImmediateMesh"

  /** ImmediateMesh.surface_begin */
  final def surfaceBegin(primitive: Long, material: Material): Unit = {
    if (gdext.classes.ImmediateMesh.mb_surface_begin == null) gdext.classes.ImmediateMesh.mb_surface_begin = MethodBind.get("ImmediateMesh", "surface_begin", 2794442543L)
    Ptrcall.callVoid2(gdext.classes.ImmediateMesh.mb_surface_begin, livePtr, primitive, Wrappers.handle(material))
  }

  /** ImmediateMesh.surface_set_color */
  final def surfaceSetColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ImmediateMesh.mb_surface_set_color == null) gdext.classes.ImmediateMesh.mb_surface_set_color = MethodBind.get("ImmediateMesh", "surface_set_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ImmediateMesh.mb_surface_set_color, livePtr, color)
  }

  /** ImmediateMesh.surface_set_normal */
  final def surfaceSetNormal(normal: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.ImmediateMesh.mb_surface_set_normal == null) gdext.classes.ImmediateMesh.mb_surface_set_normal = MethodBind.get("ImmediateMesh", "surface_set_normal", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.ImmediateMesh.mb_surface_set_normal, livePtr, normal)
  }

  /** ImmediateMesh.surface_set_tangent */
  final def surfaceSetTangent(tangent: gdext.builtin.Plane): Unit = {
    if (gdext.classes.ImmediateMesh.mb_surface_set_tangent == null) gdext.classes.ImmediateMesh.mb_surface_set_tangent = MethodBind.get("ImmediateMesh", "surface_set_tangent", 3505987427L)
    Ptrcall.callVoid1(gdext.classes.ImmediateMesh.mb_surface_set_tangent, livePtr, tangent)
  }

  /** ImmediateMesh.surface_set_uv */
  final def surfaceSetUv(uv: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.ImmediateMesh.mb_surface_set_uv == null) gdext.classes.ImmediateMesh.mb_surface_set_uv = MethodBind.get("ImmediateMesh", "surface_set_uv", 743155724L)
    Ptrcall.callVoid1(gdext.classes.ImmediateMesh.mb_surface_set_uv, livePtr, uv)
  }

  /** ImmediateMesh.surface_set_uv2 */
  final def surfaceSetUv2(uv2: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.ImmediateMesh.mb_surface_set_uv2 == null) gdext.classes.ImmediateMesh.mb_surface_set_uv2 = MethodBind.get("ImmediateMesh", "surface_set_uv2", 743155724L)
    Ptrcall.callVoid1(gdext.classes.ImmediateMesh.mb_surface_set_uv2, livePtr, uv2)
  }

  /** ImmediateMesh.surface_add_vertex */
  final def surfaceAddVertex(vertex: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.ImmediateMesh.mb_surface_add_vertex == null) gdext.classes.ImmediateMesh.mb_surface_add_vertex = MethodBind.get("ImmediateMesh", "surface_add_vertex", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.ImmediateMesh.mb_surface_add_vertex, livePtr, vertex)
  }

  /** ImmediateMesh.surface_add_vertex_2d */
  final def surfaceAddVertex2d(vertex: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.ImmediateMesh.mb_surface_add_vertex_2d == null) gdext.classes.ImmediateMesh.mb_surface_add_vertex_2d = MethodBind.get("ImmediateMesh", "surface_add_vertex_2d", 743155724L)
    Ptrcall.callVoid1(gdext.classes.ImmediateMesh.mb_surface_add_vertex_2d, livePtr, vertex)
  }

  /** ImmediateMesh.surface_end */
  final def surfaceEnd(): Unit = {
    if (gdext.classes.ImmediateMesh.mb_surface_end == null) gdext.classes.ImmediateMesh.mb_surface_end = MethodBind.get("ImmediateMesh", "surface_end", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ImmediateMesh.mb_surface_end, livePtr)
  }

  /** ImmediateMesh.clear_surfaces */
  final def clearSurfaces(): Unit = {
    if (gdext.classes.ImmediateMesh.mb_clear_surfaces == null) gdext.classes.ImmediateMesh.mb_clear_surfaces = MethodBind.get("ImmediateMesh", "clear_surfaces", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ImmediateMesh.mb_clear_surfaces, livePtr)
  }

}

object ImmediateMesh {
  private[classes] var mb_surface_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_set_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_set_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_set_tangent: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_set_uv: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_set_uv2: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_add_vertex: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_add_vertex_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_surface_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_surfaces: GDExtensionMethodBindPtr = null
}
