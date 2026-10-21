package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationServer2DManager`, extends `Object`. */
abstract class NavigationServer2DManager extends Object {
  override def godotClassName: String = "NavigationServer2DManager"

  /** NavigationServer2DManager.set_default_server */
  final def setDefaultServer(name: String, priority: Long): Unit = {
    if (gdext.classes.NavigationServer2DManager.mb_set_default_server == null) gdext.classes.NavigationServer2DManager.mb_set_default_server = MethodBind.get("NavigationServer2DManager", "set_default_server", 2956805083L)
    Ptrcall.callVoid2(gdext.classes.NavigationServer2DManager.mb_set_default_server, livePtr, name, priority)
  }

}

object NavigationServer2DManager {
  private[classes] var mb_set_default_server: GDExtensionMethodBindPtr = null

  private var instance: NavigationServer2DManager = null

  /** The process-global NavigationServer2DManager singleton instance. */
  def singleton: NavigationServer2DManager = {
    if (instance == null)
      instance = Wrappers.borrowed[NavigationServer2DManager](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("NavigationServer2DManager").ptr)))
    instance
  }
}
