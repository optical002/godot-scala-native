package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationServer3DManager`, extends `Object`. */
abstract class NavigationServer3DManager extends Object {
  override def godotClassName: String = "NavigationServer3DManager"

  /** NavigationServer3DManager.set_default_server */
  final def setDefaultServer(name: String, priority: Long): Unit = {
    if (gdext.classes.NavigationServer3DManager.mb_set_default_server == null) gdext.classes.NavigationServer3DManager.mb_set_default_server = MethodBind.get("NavigationServer3DManager", "set_default_server", 2956805083L)
    Ptrcall.callVoid2(gdext.classes.NavigationServer3DManager.mb_set_default_server, livePtr, name, priority)
  }

}

object NavigationServer3DManager {
  private[classes] var mb_set_default_server: GDExtensionMethodBindPtr = null

  private var instance: NavigationServer3DManager = null

  /** The process-global NavigationServer3DManager singleton instance. */
  def singleton: NavigationServer3DManager = {
    if (instance == null)
      instance = Wrappers.borrowed[NavigationServer3DManager](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("NavigationServer3DManager").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: NavigationServer3DManager.set_default_server */
  final def setDefaultServer(name: String, priority: Long): Unit =
    singleton.setDefaultServer(name, priority)
}
