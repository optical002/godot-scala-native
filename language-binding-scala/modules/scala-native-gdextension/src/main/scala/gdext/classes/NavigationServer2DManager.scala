package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationServer2DManager`, extends `Object`. */
abstract class NavigationServer2DManager extends Object {
  override def godotClassName: String = "NavigationServer2DManager"

  /** NavigationServer2DManager.set_default_server */
  final def setDefaultServer(name: String, priority: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationServer2DManager", "set_default_server", 2956805083L), hostObject.objectPtr, name, priority)

}

object NavigationServer2DManager {
  /** The process-global NavigationServer2DManager singleton instance. */
  def singleton: NavigationServer2DManager = new NavigationServer2DManager {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("NavigationServer2DManager").ptr))
}
