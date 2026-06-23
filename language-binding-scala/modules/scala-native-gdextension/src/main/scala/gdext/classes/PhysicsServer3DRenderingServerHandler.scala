package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsServer3DRenderingServerHandler`, extends `Object`. */
abstract class PhysicsServer3DRenderingServerHandler extends Object {

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

object PhysicsServer3DRenderingServerHandler {
  /** Class metadata for Gd[PhysicsServer3DRenderingServerHandler] lifetime management and casting. */
  given GodotClass[PhysicsServer3DRenderingServerHandler] with {
    def className = "PhysicsServer3DRenderingServerHandler"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicsServer3DRenderingServerHandler = new PhysicsServer3DRenderingServerHandler {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsServer3DRenderingServerHandler): GodotObject = t.hostObject
  }
}
