package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `TextServerManager`, extends `Object`. */
abstract class TextServerManager extends Object {

  /** TextServerManager.add_interface */
  final def addInterface(interface: TextServer): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextServerManager", "add_interface", 1799689403L), hostObject.objectPtr, interface.hostObject)

  /** TextServerManager.get_interface_count */
  final def getInterfaceCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextServerManager", "get_interface_count", 3905245786L), hostObject.objectPtr)

  /** TextServerManager.remove_interface */
  final def removeInterface(interface: TextServer): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextServerManager", "remove_interface", 1799689403L), hostObject.objectPtr, interface.hostObject)

  /** TextServerManager.get_interface */
  final def getInterface(idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TextServerManager", "get_interface", 1672475555L), hostObject.objectPtr, idx)

  /** TextServerManager.find_interface */
  final def findInterface(name: String): GodotObject =
    Ptrcall.call1[String, GodotObject](MethodBind.get("TextServerManager", "find_interface", 2240905781L), hostObject.objectPtr, name)

  /** TextServerManager.set_primary_interface */
  final def setPrimaryInterface(index: TextServer): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextServerManager", "set_primary_interface", 1799689403L), hostObject.objectPtr, index.hostObject)

  /** TextServerManager.get_primary_interface */
  final def getPrimaryInterface(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextServerManager", "get_primary_interface", 905850878L), hostObject.objectPtr)

}

object TextServerManager {
  /** Class metadata for Gd[TextServerManager] lifetime management and casting. */
  given GodotClass[TextServerManager] with {
    def className = "TextServerManager"
    def isRefCounted = false
    def wrap(o: GodotObject): TextServerManager = new TextServerManager {}.withHost(o.objectPtr)
    def unwrap(t: TextServerManager): GodotObject = t.hostObject
  }

  /** The process-global TextServerManager singleton instance. */
  def singleton: TextServerManager = new TextServerManager {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("TextServerManager").ptr))
}
