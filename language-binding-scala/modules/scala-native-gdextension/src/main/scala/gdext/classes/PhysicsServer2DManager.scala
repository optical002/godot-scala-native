package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsServer2DManager`, extends `Object`. */
abstract class PhysicsServer2DManager extends Object {
  override def godotClassName: String = "PhysicsServer2DManager"

  /** PhysicsServer2DManager.set_default_server */
  final def setDefaultServer(name: String, priority: Long): Unit = {
    if (gdext.classes.PhysicsServer2DManager.mb_set_default_server == null) gdext.classes.PhysicsServer2DManager.mb_set_default_server = MethodBind.get("PhysicsServer2DManager", "set_default_server", 2956805083L)
    Ptrcall.callVoid2(gdext.classes.PhysicsServer2DManager.mb_set_default_server, livePtr, name, priority)
  }

}

object PhysicsServer2DManager {
  private[classes] var mb_set_default_server: GDExtensionMethodBindPtr = null

  private var instance: PhysicsServer2DManager = null

  /** The process-global PhysicsServer2DManager singleton instance. */
  def singleton: PhysicsServer2DManager = {
    if (instance == null)
      instance = Wrappers.borrowed[PhysicsServer2DManager](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("PhysicsServer2DManager").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: PhysicsServer2DManager.set_default_server */
  final def setDefaultServer(name: String, priority: Long): Unit =
    singleton.setDefaultServer(name, priority)
}
