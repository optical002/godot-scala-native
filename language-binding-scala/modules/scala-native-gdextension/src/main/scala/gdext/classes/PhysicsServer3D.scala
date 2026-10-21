package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsServer3D`, extends `Object`. */
abstract class PhysicsServer3D extends Object {
  override def godotClassName: String = "PhysicsServer3D"

  /** PhysicsServer3D.set_active */
  final def setActive(active: Boolean): Unit = {
    if (gdext.classes.PhysicsServer3D.mb_set_active == null) gdext.classes.PhysicsServer3D.mb_set_active = MethodBind.get("PhysicsServer3D", "set_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsServer3D.mb_set_active, livePtr, active)
  }

  /** PhysicsServer3D.get_process_info */
  final def getProcessInfo(process_info: Long): Long = {
    if (gdext.classes.PhysicsServer3D.mb_get_process_info == null) gdext.classes.PhysicsServer3D.mb_get_process_info = MethodBind.get("PhysicsServer3D", "get_process_info", 1332958745L)
    Ptrcall.call1[Long, Long](gdext.classes.PhysicsServer3D.mb_get_process_info, livePtr, process_info)
  }

}

object PhysicsServer3D {
  private[classes] var mb_set_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_info: GDExtensionMethodBindPtr = null

  private var instance: PhysicsServer3D = null

  /** The process-global PhysicsServer3D singleton instance. */
  def singleton: PhysicsServer3D = {
    if (instance == null)
      instance = Wrappers.borrowed[PhysicsServer3D](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("PhysicsServer3D").ptr)))
    instance
  }
}
