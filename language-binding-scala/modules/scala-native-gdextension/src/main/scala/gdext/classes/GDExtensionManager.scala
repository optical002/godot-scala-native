package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GDExtensionManager`, extends `Object`. */
abstract class GDExtensionManager extends Object {
  override def godotClassName: String = "GDExtensionManager"

  /** GDExtensionManager.load_extension */
  final def loadExtension(path: String): Long = {
    if (gdext.classes.GDExtensionManager.mb_load_extension == null) gdext.classes.GDExtensionManager.mb_load_extension = MethodBind.get("GDExtensionManager", "load_extension", 4024158731L)
    Ptrcall.call1[String, Long](gdext.classes.GDExtensionManager.mb_load_extension, livePtr, path)
  }

  /** GDExtensionManager.reload_extension */
  final def reloadExtension(path: String): Long = {
    if (gdext.classes.GDExtensionManager.mb_reload_extension == null) gdext.classes.GDExtensionManager.mb_reload_extension = MethodBind.get("GDExtensionManager", "reload_extension", 4024158731L)
    Ptrcall.call1[String, Long](gdext.classes.GDExtensionManager.mb_reload_extension, livePtr, path)
  }

  /** GDExtensionManager.unload_extension */
  final def unloadExtension(path: String): Long = {
    if (gdext.classes.GDExtensionManager.mb_unload_extension == null) gdext.classes.GDExtensionManager.mb_unload_extension = MethodBind.get("GDExtensionManager", "unload_extension", 4024158731L)
    Ptrcall.call1[String, Long](gdext.classes.GDExtensionManager.mb_unload_extension, livePtr, path)
  }

  /** GDExtensionManager.is_extension_loaded */
  final def isExtensionLoaded(path: String): Boolean = {
    if (gdext.classes.GDExtensionManager.mb_is_extension_loaded == null) gdext.classes.GDExtensionManager.mb_is_extension_loaded = MethodBind.get("GDExtensionManager", "is_extension_loaded", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.GDExtensionManager.mb_is_extension_loaded, livePtr, path)
  }

  /** GDExtensionManager.get_extension. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getExtension(path: String): GDExtension = {
    if (gdext.classes.GDExtensionManager.mb_get_extension == null) gdext.classes.GDExtensionManager.mb_get_extension = MethodBind.get("GDExtensionManager", "get_extension", 49743343L)
    Wrappers.owned[GDExtension](Ptrcall.call1[String, Long](gdext.classes.GDExtensionManager.mb_get_extension, livePtr, path))
  }

}

object GDExtensionManager {
  private[classes] var mb_load_extension: GDExtensionMethodBindPtr = null
  private[classes] var mb_reload_extension: GDExtensionMethodBindPtr = null
  private[classes] var mb_unload_extension: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_extension_loaded: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_extension: GDExtensionMethodBindPtr = null

  private var instance: GDExtensionManager = null

  /** The process-global GDExtensionManager singleton instance. */
  def singleton: GDExtensionManager = {
    if (instance == null)
      instance = Wrappers.borrowed[GDExtensionManager](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("GDExtensionManager").ptr)))
    instance
  }
}
