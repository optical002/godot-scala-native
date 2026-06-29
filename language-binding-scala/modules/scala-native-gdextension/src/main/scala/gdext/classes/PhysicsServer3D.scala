package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsServer3D`, extends `Object`. */
abstract class PhysicsServer3D extends Object {
  override def godotClassName: String = "PhysicsServer3D"

  /** PhysicsServer3D.set_active */
  final def setActive(active: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsServer3D", "set_active", 2586408642L), hostObject.objectPtr, active)

  /** PhysicsServer3D.get_process_info */
  final def getProcessInfo(process_info: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PhysicsServer3D", "get_process_info", 1332958745L), hostObject.objectPtr, process_info)

}

object PhysicsServer3D {
  /** The process-global PhysicsServer3D singleton instance. */
  def singleton: PhysicsServer3D = new PhysicsServer3D {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("PhysicsServer3D").ptr))
}
