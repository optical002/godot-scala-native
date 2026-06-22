package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsServer3DManager`, extends `Object`. */
abstract class PhysicsServer3DManager extends Object {

  /** PhysicsServer3DManager.set_default_server */
  final def setDefaultServer(name: String, priority: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("PhysicsServer3DManager", "set_default_server", 2956805083L), hostObject.objectPtr, name, priority)

}

object PhysicsServer3DManager {
  /** Class metadata for Gd[PhysicsServer3DManager] lifetime management and casting. */
  given GodotClass[PhysicsServer3DManager] with {
    def className = "PhysicsServer3DManager"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicsServer3DManager = new PhysicsServer3DManager {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsServer3DManager): GodotObject = t.hostObject
  }

  /** The process-global PhysicsServer3DManager singleton instance. */
  def singleton: PhysicsServer3DManager = new PhysicsServer3DManager {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("PhysicsServer3DManager").ptr))
}
