package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationServer2DManager`, extends `Object`. */
abstract class NavigationServer2DManager extends Object {

  /** NavigationServer2DManager.set_default_server */
  final def setDefaultServer(name: String, priority: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationServer2DManager", "set_default_server", 2956805083L), hostObject.objectPtr, name, priority)

}

object NavigationServer2DManager {
  /** Class metadata for Gd[NavigationServer2DManager] lifetime management and casting. */
  given GodotClass[NavigationServer2DManager] with {
    def className = "NavigationServer2DManager"
    def isRefCounted = false
    def wrap(o: GodotObject): NavigationServer2DManager = new NavigationServer2DManager {}.withHost(o.objectPtr)
    def unwrap(t: NavigationServer2DManager): GodotObject = t.hostObject
  }

  /** The process-global NavigationServer2DManager singleton instance. */
  def singleton: NavigationServer2DManager = new NavigationServer2DManager {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("NavigationServer2DManager").ptr))
}
