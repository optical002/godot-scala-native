package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationServer3DManager`, extends `Object`. */
abstract class NavigationServer3DManager extends Object {

  /** NavigationServer3DManager.set_default_server */
  final def setDefaultServer(name: String, priority: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationServer3DManager", "set_default_server", 2956805083L), hostObject.objectPtr, name, priority)

}

object NavigationServer3DManager {
  /** Class metadata for Gd[NavigationServer3DManager] lifetime management and casting. */
  given GodotClass[NavigationServer3DManager] with {
    def className = "NavigationServer3DManager"
    def isRefCounted = false
    def wrap(o: GodotObject): NavigationServer3DManager = new NavigationServer3DManager {}.withHost(o.objectPtr)
    def unwrap(t: NavigationServer3DManager): GodotObject = t.hostObject
  }

  /** The process-global NavigationServer3DManager singleton instance. */
  def singleton: NavigationServer3DManager = new NavigationServer3DManager {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("NavigationServer3DManager").ptr))
}
