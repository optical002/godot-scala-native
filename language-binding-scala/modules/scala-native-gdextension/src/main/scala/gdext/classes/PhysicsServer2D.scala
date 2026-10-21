package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsServer2D`, extends `Object`. */
abstract class PhysicsServer2D extends Object {
  override def godotClassName: String = "PhysicsServer2D"

  /** PhysicsServer2D.set_active */
  final def setActive(active: Boolean): Unit = {
    if (gdext.classes.PhysicsServer2D.mb_set_active == null) gdext.classes.PhysicsServer2D.mb_set_active = MethodBind.get("PhysicsServer2D", "set_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsServer2D.mb_set_active, livePtr, active)
  }

  /** PhysicsServer2D.get_process_info */
  final def getProcessInfo(process_info: Long): Long = {
    if (gdext.classes.PhysicsServer2D.mb_get_process_info == null) gdext.classes.PhysicsServer2D.mb_get_process_info = MethodBind.get("PhysicsServer2D", "get_process_info", 576496006L)
    Ptrcall.call1[Long, Long](gdext.classes.PhysicsServer2D.mb_get_process_info, livePtr, process_info)
  }

}

object PhysicsServer2D {
  private[classes] var mb_set_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_info: GDExtensionMethodBindPtr = null

  private var instance: PhysicsServer2D = null

  /** The process-global PhysicsServer2D singleton instance. */
  def singleton: PhysicsServer2D = {
    if (instance == null)
      instance = Wrappers.borrowed[PhysicsServer2D](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("PhysicsServer2D").ptr)))
    instance
  }
}
