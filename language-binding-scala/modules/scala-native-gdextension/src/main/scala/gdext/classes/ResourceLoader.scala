package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ResourceLoader`, extends `Object`. */
abstract class ResourceLoader extends Object {
  override def godotClassName: String = "ResourceLoader"

  /** ResourceLoader.load_threaded_request */
  final def loadThreadedRequest(path: String, typeHint: String = "", useSubThreads: Boolean = false, cacheMode: gdext.classes.ResourceLoader.CacheMode = gdext.classes.ResourceLoader.CacheMode(1L)): gdext.classes.Error = {
    if (gdext.classes.ResourceLoader.mb_load_threaded_request == null) gdext.classes.ResourceLoader.mb_load_threaded_request = MethodBind.get("ResourceLoader", "load_threaded_request", 3614384323L)
    gdext.classes.Error(Ptrcall.call4[String, String, Boolean, Long, Long](gdext.classes.ResourceLoader.mb_load_threaded_request, livePtr, path, typeHint, useSubThreads, cacheMode))
  }

  /** ResourceLoader.load_threaded_get. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def loadThreadedGet(path: String): Resource = {
    if (gdext.classes.ResourceLoader.mb_load_threaded_get == null) gdext.classes.ResourceLoader.mb_load_threaded_get = MethodBind.get("ResourceLoader", "load_threaded_get", 1748875256L)
    Wrappers.owned[Resource](Ptrcall.call1[String, Long](gdext.classes.ResourceLoader.mb_load_threaded_get, livePtr, path))
  }

  /** ResourceLoader.load. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def load(path: String, typeHint: String = "", cacheMode: gdext.classes.ResourceLoader.CacheMode = gdext.classes.ResourceLoader.CacheMode(1L)): Resource = {
    if (gdext.classes.ResourceLoader.mb_load == null) gdext.classes.ResourceLoader.mb_load = MethodBind.get("ResourceLoader", "load", 3358495409L)
    Wrappers.owned[Resource](Ptrcall.call3[String, String, Long, Long](gdext.classes.ResourceLoader.mb_load, livePtr, path, typeHint, cacheMode))
  }

  /** ResourceLoader.add_resource_format_loader */
  final def addResourceFormatLoader(formatLoader: ResourceFormatLoader, atFront: Boolean = false): Unit = {
    if (gdext.classes.ResourceLoader.mb_add_resource_format_loader == null) gdext.classes.ResourceLoader.mb_add_resource_format_loader = MethodBind.get("ResourceLoader", "add_resource_format_loader", 2896595483L)
    Ptrcall.callVoid2(gdext.classes.ResourceLoader.mb_add_resource_format_loader, livePtr, Wrappers.handle(formatLoader), atFront)
  }

  /** ResourceLoader.remove_resource_format_loader */
  final def removeResourceFormatLoader(formatLoader: ResourceFormatLoader): Unit = {
    if (gdext.classes.ResourceLoader.mb_remove_resource_format_loader == null) gdext.classes.ResourceLoader.mb_remove_resource_format_loader = MethodBind.get("ResourceLoader", "remove_resource_format_loader", 405397102L)
    Ptrcall.callVoid1(gdext.classes.ResourceLoader.mb_remove_resource_format_loader, livePtr, Wrappers.handle(formatLoader))
  }

  /** ResourceLoader.set_abort_on_missing_resources */
  final def setAbortOnMissingResources(abort: Boolean): Unit = {
    if (gdext.classes.ResourceLoader.mb_set_abort_on_missing_resources == null) gdext.classes.ResourceLoader.mb_set_abort_on_missing_resources = MethodBind.get("ResourceLoader", "set_abort_on_missing_resources", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ResourceLoader.mb_set_abort_on_missing_resources, livePtr, abort)
  }

  /** ResourceLoader.has_cached */
  final def hasCached(path: String): Boolean = {
    if (gdext.classes.ResourceLoader.mb_has_cached == null) gdext.classes.ResourceLoader.mb_has_cached = MethodBind.get("ResourceLoader", "has_cached", 2323990056L)
    Ptrcall.call1[String, Boolean](gdext.classes.ResourceLoader.mb_has_cached, livePtr, path)
  }

  /** ResourceLoader.get_cached_ref. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCachedRef(path: String): Resource = {
    if (gdext.classes.ResourceLoader.mb_get_cached_ref == null) gdext.classes.ResourceLoader.mb_get_cached_ref = MethodBind.get("ResourceLoader", "get_cached_ref", 1748875256L)
    Wrappers.owned[Resource](Ptrcall.call1[String, Long](gdext.classes.ResourceLoader.mb_get_cached_ref, livePtr, path))
  }

  /** ResourceLoader.exists */
  final def exists(path: String, typeHint: String = ""): Boolean = {
    if (gdext.classes.ResourceLoader.mb_exists == null) gdext.classes.ResourceLoader.mb_exists = MethodBind.get("ResourceLoader", "exists", 4185558881L)
    Ptrcall.call2[String, String, Boolean](gdext.classes.ResourceLoader.mb_exists, livePtr, path, typeHint)
  }

  /** ResourceLoader.get_resource_uid */
  final def getResourceUid(path: String): Long = {
    if (gdext.classes.ResourceLoader.mb_get_resource_uid == null) gdext.classes.ResourceLoader.mb_get_resource_uid = MethodBind.get("ResourceLoader", "get_resource_uid", 1597066294L)
    Ptrcall.call1[String, Long](gdext.classes.ResourceLoader.mb_get_resource_uid, livePtr, path)
  }

}

object ResourceLoader {
  private[classes] var mb_load_threaded_request: GDExtensionMethodBindPtr = null
  private[classes] var mb_load_threaded_get: GDExtensionMethodBindPtr = null
  private[classes] var mb_load: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_resource_format_loader: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_resource_format_loader: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_abort_on_missing_resources: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_cached: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cached_ref: GDExtensionMethodBindPtr = null
  private[classes] var mb_exists: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_resource_uid: GDExtensionMethodBindPtr = null

  private var instance: ResourceLoader = null

  /** The process-global ResourceLoader singleton instance. */
  def singleton: ResourceLoader = {
    if (instance == null)
      instance = Wrappers.borrowed[ResourceLoader](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("ResourceLoader").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: ResourceLoader.load_threaded_request */
  final def loadThreadedRequest(path: String, typeHint: String = "", useSubThreads: Boolean = false, cacheMode: gdext.classes.ResourceLoader.CacheMode = gdext.classes.ResourceLoader.CacheMode(1L)): gdext.classes.Error =
    singleton.loadThreadedRequest(path, typeHint, useSubThreads, cacheMode)

  /** Forwards to [[singleton]]: ResourceLoader.load_threaded_get */
  final def loadThreadedGet(path: String): Resource =
    singleton.loadThreadedGet(path)

  /** Forwards to [[singleton]]: ResourceLoader.load */
  final def load(path: String, typeHint: String = "", cacheMode: gdext.classes.ResourceLoader.CacheMode = gdext.classes.ResourceLoader.CacheMode(1L)): Resource =
    singleton.load(path, typeHint, cacheMode)

  /** Forwards to [[singleton]]: ResourceLoader.add_resource_format_loader */
  final def addResourceFormatLoader(formatLoader: ResourceFormatLoader, atFront: Boolean = false): Unit =
    singleton.addResourceFormatLoader(formatLoader, atFront)

  /** Forwards to [[singleton]]: ResourceLoader.remove_resource_format_loader */
  final def removeResourceFormatLoader(formatLoader: ResourceFormatLoader): Unit =
    singleton.removeResourceFormatLoader(formatLoader)

  /** Forwards to [[singleton]]: ResourceLoader.set_abort_on_missing_resources */
  final def setAbortOnMissingResources(abort: Boolean): Unit =
    singleton.setAbortOnMissingResources(abort)

  /** Forwards to [[singleton]]: ResourceLoader.has_cached */
  final def hasCached(path: String): Boolean =
    singleton.hasCached(path)

  /** Forwards to [[singleton]]: ResourceLoader.get_cached_ref */
  final def getCachedRef(path: String): Resource =
    singleton.getCachedRef(path)

  /** Forwards to [[singleton]]: ResourceLoader.exists */
  final def exists(path: String, typeHint: String = ""): Boolean =
    singleton.exists(path, typeHint)

  /** Forwards to [[singleton]]: ResourceLoader.get_resource_uid */
  final def getResourceUid(path: String): Long =
    singleton.getResourceUid(path)

  /** Godot enum `ResourceLoader.ThreadLoadStatus`. */
  opaque type ThreadLoadStatus <: Long = Long

  object ThreadLoadStatus {
    final val InvalidResource: ThreadLoadStatus = 0L.asInstanceOf[ThreadLoadStatus]
    final val InProgress: ThreadLoadStatus = 1L.asInstanceOf[ThreadLoadStatus]
    final val Failed: ThreadLoadStatus = 2L.asInstanceOf[ThreadLoadStatus]
    final val Loaded: ThreadLoadStatus = 3L.asInstanceOf[ThreadLoadStatus]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ThreadLoadStatus = value.asInstanceOf[ThreadLoadStatus]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ThreadLoadStatus] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ThreadLoadStatus]]

    extension (self: ThreadLoadStatus)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "InvalidResource"
        case 1L => "InProgress"
        case 2L => "Failed"
        case 3L => "Loaded"
        case other => other.toString
      }
  }

  /** Godot enum `ResourceLoader.CacheMode`. */
  opaque type CacheMode <: Long = Long

  object CacheMode {
    final val Ignore: CacheMode = 0L.asInstanceOf[CacheMode]
    final val Reuse: CacheMode = 1L.asInstanceOf[CacheMode]
    final val Replace: CacheMode = 2L.asInstanceOf[CacheMode]
    final val IgnoreDeep: CacheMode = 3L.asInstanceOf[CacheMode]
    final val ReplaceDeep: CacheMode = 4L.asInstanceOf[CacheMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CacheMode = value.asInstanceOf[CacheMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CacheMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[CacheMode]]

    extension (self: CacheMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Ignore"
        case 1L => "Reuse"
        case 2L => "Replace"
        case 3L => "IgnoreDeep"
        case 4L => "ReplaceDeep"
        case other => other.toString
      }
  }
}
