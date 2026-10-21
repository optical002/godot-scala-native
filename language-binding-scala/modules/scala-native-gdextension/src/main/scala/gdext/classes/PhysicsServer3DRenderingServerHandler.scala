package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsServer3DRenderingServerHandler`, extends `Object`. */
abstract class PhysicsServer3DRenderingServerHandler extends Object {
  override def godotClassName: String = "PhysicsServer3DRenderingServerHandler"

  /** PhysicsServer3DRenderingServerHandler.set_vertex */
  final def setVertex(vertex_id: Long, vertex: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.PhysicsServer3DRenderingServerHandler.mb_set_vertex == null) gdext.classes.PhysicsServer3DRenderingServerHandler.mb_set_vertex = MethodBind.get("PhysicsServer3DRenderingServerHandler", "set_vertex", 1530502735L)
    Ptrcall.callVoid2(gdext.classes.PhysicsServer3DRenderingServerHandler.mb_set_vertex, livePtr, vertex_id, vertex)
  }

  /** PhysicsServer3DRenderingServerHandler.set_normal */
  final def setNormal(vertex_id: Long, normal: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.PhysicsServer3DRenderingServerHandler.mb_set_normal == null) gdext.classes.PhysicsServer3DRenderingServerHandler.mb_set_normal = MethodBind.get("PhysicsServer3DRenderingServerHandler", "set_normal", 1530502735L)
    Ptrcall.callVoid2(gdext.classes.PhysicsServer3DRenderingServerHandler.mb_set_normal, livePtr, vertex_id, normal)
  }

  /** PhysicsServer3DRenderingServerHandler.set_aabb */
  final def setAabb(aabb: gdext.builtin.AABB): Unit = {
    if (gdext.classes.PhysicsServer3DRenderingServerHandler.mb_set_aabb == null) gdext.classes.PhysicsServer3DRenderingServerHandler.mb_set_aabb = MethodBind.get("PhysicsServer3DRenderingServerHandler", "set_aabb", 259215842L)
    Ptrcall.callVoid1(gdext.classes.PhysicsServer3DRenderingServerHandler.mb_set_aabb, livePtr, aabb)
  }

}

object PhysicsServer3DRenderingServerHandler {
  private[classes] var mb_set_vertex: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_aabb: GDExtensionMethodBindPtr = null
}
