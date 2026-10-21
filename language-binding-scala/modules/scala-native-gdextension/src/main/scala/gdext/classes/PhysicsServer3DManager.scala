package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsServer3DManager`, extends `Object`. */
abstract class PhysicsServer3DManager extends Object {
  override def godotClassName: String = "PhysicsServer3DManager"

  /** PhysicsServer3DManager.set_default_server */
  final def setDefaultServer(name: String, priority: Long): Unit = {
    if (gdext.classes.PhysicsServer3DManager.mb_set_default_server == null) gdext.classes.PhysicsServer3DManager.mb_set_default_server = MethodBind.get("PhysicsServer3DManager", "set_default_server", 2956805083L)
    Ptrcall.callVoid2(gdext.classes.PhysicsServer3DManager.mb_set_default_server, livePtr, name, priority)
  }

}

object PhysicsServer3DManager {
  private[classes] var mb_set_default_server: GDExtensionMethodBindPtr = null

  private var instance: PhysicsServer3DManager = null

  /** The process-global PhysicsServer3DManager singleton instance. */
  def singleton: PhysicsServer3DManager = {
    if (instance == null)
      instance = Wrappers.borrowed[PhysicsServer3DManager](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("PhysicsServer3DManager").ptr)))
    instance
  }
}
