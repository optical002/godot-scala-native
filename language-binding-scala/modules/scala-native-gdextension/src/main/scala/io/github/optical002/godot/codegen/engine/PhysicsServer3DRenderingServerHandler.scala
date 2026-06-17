package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsServer3DRenderingServerHandler`, extends `Object`. */
abstract class PhysicsServer3DRenderingServerHandler extends Object {

  /** PhysicsServer3DRenderingServerHandler.set_vertex */
  final def setVertex(vertex_id: Long, vertex: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("PhysicsServer3DRenderingServerHandler", "set_vertex", 1530502735L), hostObject.objectPtr, vertex_id, vertex)

  /** PhysicsServer3DRenderingServerHandler.set_normal */
  final def setNormal(vertex_id: Long, normal: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("PhysicsServer3DRenderingServerHandler", "set_normal", 1530502735L), hostObject.objectPtr, vertex_id, normal)

  /** PhysicsServer3DRenderingServerHandler.set_aabb */
  final def setAabb(aabb: io.github.optical002.godot.builtin.AABB): Unit =
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
