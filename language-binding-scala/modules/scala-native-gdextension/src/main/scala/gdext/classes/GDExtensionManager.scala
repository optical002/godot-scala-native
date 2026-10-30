package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GDExtensionManager`, extends `Object`. */
abstract class GDExtensionManager extends Object {
  override def godotClassName: String = "GDExtensionManager"

  /** GDExtensionManager.load_extension */
  final def loadExtension(path: String): gdext.classes.GDExtensionManager.LoadStatus = {
    if (gdext.classes.GDExtensionManager.mb_load_extension == null) gdext.classes.GDExtensionManager.mb_load_extension = MethodBind.get("GDExtensionManager", "load_extension", 4024158731L)
    gdext.classes.GDExtensionManager.LoadStatus(Ptrcall.call1[String, Long](gdext.classes.GDExtensionManager.mb_load_extension, livePtr, path))
  }

  /** GDExtensionManager.reload_extension */
  final def reloadExtension(path: String): gdext.classes.GDExtensionManager.LoadStatus = {
    if (gdext.classes.GDExtensionManager.mb_reload_extension == null) gdext.classes.GDExtensionManager.mb_reload_extension = MethodBind.get("GDExtensionManager", "reload_extension", 4024158731L)
    gdext.classes.GDExtensionManager.LoadStatus(Ptrcall.call1[String, Long](gdext.classes.GDExtensionManager.mb_reload_extension, livePtr, path))
  }

  /** GDExtensionManager.unload_extension */
  final def unloadExtension(path: String): gdext.classes.GDExtensionManager.LoadStatus = {
    if (gdext.classes.GDExtensionManager.mb_unload_extension == null) gdext.classes.GDExtensionManager.mb_unload_extension = MethodBind.get("GDExtensionManager", "unload_extension", 4024158731L)
    gdext.classes.GDExtensionManager.LoadStatus(Ptrcall.call1[String, Long](gdext.classes.GDExtensionManager.mb_unload_extension, livePtr, path))
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

  /** Forwards to [[singleton]]: GDExtensionManager.load_extension */
  final def loadExtension(path: String): gdext.classes.GDExtensionManager.LoadStatus =
    singleton.loadExtension(path)

  /** Forwards to [[singleton]]: GDExtensionManager.reload_extension */
  final def reloadExtension(path: String): gdext.classes.GDExtensionManager.LoadStatus =
    singleton.reloadExtension(path)

  /** Forwards to [[singleton]]: GDExtensionManager.unload_extension */
  final def unloadExtension(path: String): gdext.classes.GDExtensionManager.LoadStatus =
    singleton.unloadExtension(path)

  /** Forwards to [[singleton]]: GDExtensionManager.is_extension_loaded */
  final def isExtensionLoaded(path: String): Boolean =
    singleton.isExtensionLoaded(path)

  /** Forwards to [[singleton]]: GDExtensionManager.get_extension */
  final def getExtension(path: String): GDExtension =
    singleton.getExtension(path)

  /** Godot enum `GDExtensionManager.LoadStatus`. */
  opaque type LoadStatus <: Long = Long

  object LoadStatus {
    final val Ok: LoadStatus = 0L.asInstanceOf[LoadStatus]
    final val Failed: LoadStatus = 1L.asInstanceOf[LoadStatus]
    final val AlreadyLoaded: LoadStatus = 2L.asInstanceOf[LoadStatus]
    final val NotLoaded: LoadStatus = 3L.asInstanceOf[LoadStatus]
    final val NeedsRestart: LoadStatus = 4L.asInstanceOf[LoadStatus]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LoadStatus = value.asInstanceOf[LoadStatus]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LoadStatus] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[LoadStatus]]

    extension (self: LoadStatus)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Ok"
        case 1L => "Failed"
        case 2L => "AlreadyLoaded"
        case 3L => "NotLoaded"
        case 4L => "NeedsRestart"
        case other => other.toString
      }
  }
}
