package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GDExtensionManager`, extends `Object`. */
abstract class GDExtensionManager extends Object {

  /** GDExtensionManager.load_extension */
  final def loadExtension(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("GDExtensionManager", "load_extension", 4024158731L), hostObject.objectPtr, path)

  /** GDExtensionManager.reload_extension */
  final def reloadExtension(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("GDExtensionManager", "reload_extension", 4024158731L), hostObject.objectPtr, path)

  /** GDExtensionManager.unload_extension */
  final def unloadExtension(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("GDExtensionManager", "unload_extension", 4024158731L), hostObject.objectPtr, path)

  /** GDExtensionManager.is_extension_loaded */
  final def isExtensionLoaded(path: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("GDExtensionManager", "is_extension_loaded", 3927539163L), hostObject.objectPtr, path)

  /** GDExtensionManager.get_extension */
  final def getExtension(path: String): GodotObject =
    Ptrcall.call1[String, GodotObject](MethodBind.get("GDExtensionManager", "get_extension", 49743343L), hostObject.objectPtr, path)

}

object GDExtensionManager {
  /** Class metadata for Gd[GDExtensionManager] lifetime management and casting. */
  given GodotClass[GDExtensionManager] with {
    def className = "GDExtensionManager"
    def isRefCounted = false
    def wrap(o: GodotObject): GDExtensionManager = new GDExtensionManager {}.withHost(o.objectPtr)
    def unwrap(t: GDExtensionManager): GodotObject = t.hostObject
  }

  /** The process-global GDExtensionManager singleton instance. */
  def singleton: GDExtensionManager = new GDExtensionManager {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("GDExtensionManager").ptr))
}
