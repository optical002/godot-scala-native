package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsServer3D`, extends `Object`. */
abstract class PhysicsServer3D extends Object {

  /** PhysicsServer3D.set_active */
  final def setActive(active: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsServer3D", "set_active", 2586408642L), hostObject.objectPtr, active)

  /** PhysicsServer3D.get_process_info */
  final def getProcessInfo(process_info: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PhysicsServer3D", "get_process_info", 1332958745L), hostObject.objectPtr, process_info)

}

object PhysicsServer3D {
  /** Class metadata for Gd[PhysicsServer3D] lifetime management and casting. */
  given GodotClass[PhysicsServer3D] with {
    def className = "PhysicsServer3D"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicsServer3D = new PhysicsServer3D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsServer3D): GodotObject = t.hostObject
  }

  /** The process-global PhysicsServer3D singleton instance. */
  def singleton: PhysicsServer3D = new PhysicsServer3D {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("PhysicsServer3D").ptr))
}
