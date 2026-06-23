package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsServer2D`, extends `Object`. */
abstract class PhysicsServer2D extends Object {

  /** PhysicsServer2D.set_active */
  final def setActive(active: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsServer2D", "set_active", 2586408642L), hostObject.objectPtr, active)

  /** PhysicsServer2D.get_process_info */
  final def getProcessInfo(process_info: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PhysicsServer2D", "get_process_info", 576496006L), hostObject.objectPtr, process_info)

}

object PhysicsServer2D {
  /** Class metadata for Gd[PhysicsServer2D] lifetime management and casting. */
  given GodotClass[PhysicsServer2D] with {
    def className = "PhysicsServer2D"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicsServer2D = new PhysicsServer2D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsServer2D): GodotObject = t.hostObject
  }

  /** The process-global PhysicsServer2D singleton instance. */
  def singleton: PhysicsServer2D = new PhysicsServer2D {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("PhysicsServer2D").ptr))
}
