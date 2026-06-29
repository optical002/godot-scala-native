package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsServer3DRenderingServerHandler`, extends `Object`. */
abstract class PhysicsServer3DRenderingServerHandler extends Object {
  override def godotClassName: String = "PhysicsServer3DRenderingServerHandler"

  /** PhysicsServer3DRenderingServerHandler.set_vertex */
  final def setVertex(vertex_id: Long, vertex: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("PhysicsServer3DRenderingServerHandler", "set_vertex", 1530502735L), hostObject.objectPtr, vertex_id, vertex)

  /** PhysicsServer3DRenderingServerHandler.set_normal */
  final def setNormal(vertex_id: Long, normal: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("PhysicsServer3DRenderingServerHandler", "set_normal", 1530502735L), hostObject.objectPtr, vertex_id, normal)

  /** PhysicsServer3DRenderingServerHandler.set_aabb */
  final def setAabb(aabb: gdext.builtin.AABB): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsServer3DRenderingServerHandler", "set_aabb", 259215842L), hostObject.objectPtr, aabb)

}
