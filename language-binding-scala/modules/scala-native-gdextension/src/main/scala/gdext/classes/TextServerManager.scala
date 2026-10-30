package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TextServerManager`, extends `Object`. */
abstract class TextServerManager extends Object {
  override def godotClassName: String = "TextServerManager"

  /** TextServerManager.add_interface */
  final def addInterface(interface: TextServer): Unit = {
    if (gdext.classes.TextServerManager.mb_add_interface == null) gdext.classes.TextServerManager.mb_add_interface = MethodBind.get("TextServerManager", "add_interface", 1799689403L)
    Ptrcall.callVoid1(gdext.classes.TextServerManager.mb_add_interface, livePtr, Wrappers.handle(interface))
  }

  /** TextServerManager.get_interface_count */
  final def getInterfaceCount(): Long = {
    if (gdext.classes.TextServerManager.mb_get_interface_count == null) gdext.classes.TextServerManager.mb_get_interface_count = MethodBind.get("TextServerManager", "get_interface_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextServerManager.mb_get_interface_count, livePtr)
  }

  /** TextServerManager.remove_interface */
  final def removeInterface(interface: TextServer): Unit = {
    if (gdext.classes.TextServerManager.mb_remove_interface == null) gdext.classes.TextServerManager.mb_remove_interface = MethodBind.get("TextServerManager", "remove_interface", 1799689403L)
    Ptrcall.callVoid1(gdext.classes.TextServerManager.mb_remove_interface, livePtr, Wrappers.handle(interface))
  }

  /** TextServerManager.get_interface. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getInterface(idx: Long): TextServer = {
    if (gdext.classes.TextServerManager.mb_get_interface == null) gdext.classes.TextServerManager.mb_get_interface = MethodBind.get("TextServerManager", "get_interface", 1672475555L)
    Wrappers.owned[TextServer](Ptrcall.call1[Long, Long](gdext.classes.TextServerManager.mb_get_interface, livePtr, idx))
  }

  /** TextServerManager.find_interface. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def findInterface(name: String): TextServer = {
    if (gdext.classes.TextServerManager.mb_find_interface == null) gdext.classes.TextServerManager.mb_find_interface = MethodBind.get("TextServerManager", "find_interface", 2240905781L)
    Wrappers.owned[TextServer](Ptrcall.call1[String, Long](gdext.classes.TextServerManager.mb_find_interface, livePtr, name))
  }

  /** TextServerManager.set_primary_interface */
  final def setPrimaryInterface(index: TextServer): Unit = {
    if (gdext.classes.TextServerManager.mb_set_primary_interface == null) gdext.classes.TextServerManager.mb_set_primary_interface = MethodBind.get("TextServerManager", "set_primary_interface", 1799689403L)
    Ptrcall.callVoid1(gdext.classes.TextServerManager.mb_set_primary_interface, livePtr, Wrappers.handle(index))
  }

  /** TextServerManager.get_primary_interface. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPrimaryInterface(): TextServer = {
    if (gdext.classes.TextServerManager.mb_get_primary_interface == null) gdext.classes.TextServerManager.mb_get_primary_interface = MethodBind.get("TextServerManager", "get_primary_interface", 905850878L)
    Wrappers.owned[TextServer](Ptrcall.call0[Long](gdext.classes.TextServerManager.mb_get_primary_interface, livePtr))
  }

}

object TextServerManager {
  private[classes] var mb_add_interface: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_interface_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_interface: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_interface: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_interface: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_primary_interface: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_primary_interface: GDExtensionMethodBindPtr = null

  private var instance: TextServerManager = null

  /** The process-global TextServerManager singleton instance. */
  def singleton: TextServerManager = {
    if (instance == null)
      instance = Wrappers.borrowed[TextServerManager](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("TextServerManager").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: TextServerManager.add_interface */
  final def addInterface(interface: TextServer): Unit =
    singleton.addInterface(interface)

  /** Forwards to [[singleton]]: TextServerManager.get_interface_count */
  final def getInterfaceCount(): Long =
    singleton.getInterfaceCount()

  /** Forwards to [[singleton]]: TextServerManager.remove_interface */
  final def removeInterface(interface: TextServer): Unit =
    singleton.removeInterface(interface)

  /** Forwards to [[singleton]]: TextServerManager.get_interface */
  final def getInterface(idx: Long): TextServer =
    singleton.getInterface(idx)

  /** Forwards to [[singleton]]: TextServerManager.find_interface */
  final def findInterface(name: String): TextServer =
    singleton.findInterface(name)

  /** Forwards to [[singleton]]: TextServerManager.set_primary_interface */
  final def setPrimaryInterface(index: TextServer): Unit =
    singleton.setPrimaryInterface(index)

  /** Forwards to [[singleton]]: TextServerManager.get_primary_interface */
  final def getPrimaryInterface(): TextServer =
    singleton.getPrimaryInterface()
}
