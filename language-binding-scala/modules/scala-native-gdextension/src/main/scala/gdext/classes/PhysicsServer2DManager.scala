package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsServer2DManager`, extends `Object`. */
abstract class PhysicsServer2DManager extends Object {

  /** PhysicsServer2DManager.set_default_server */
  final def setDefaultServer(name: String, priority: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("PhysicsServer2DManager", "set_default_server", 2956805083L), hostObject.objectPtr, name, priority)

}

object PhysicsServer2DManager {
  /** Class metadata for Gd[PhysicsServer2DManager] lifetime management and casting. */
  given GodotClass[PhysicsServer2DManager] with {
    def className = "PhysicsServer2DManager"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicsServer2DManager = new PhysicsServer2DManager {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsServer2DManager): GodotObject = t.hostObject
  }

  /** The process-global PhysicsServer2DManager singleton instance. */
  def singleton: PhysicsServer2DManager = new PhysicsServer2DManager {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("PhysicsServer2DManager").ptr))
}
