package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ResourceLoader`, extends `Object`. */
abstract class ResourceLoader extends Object {
  override def godotClassName: String = "ResourceLoader"

  /** ResourceLoader.load_threaded_request */
  final def loadThreadedRequest(path: String, type_hint: String, use_sub_threads: Boolean, cache_mode: Long): Long = {
    if (gdext.classes.ResourceLoader.mb_load_threaded_request == null) gdext.classes.ResourceLoader.mb_load_threaded_request = MethodBind.get("ResourceLoader", "load_threaded_request", 3614384323L)
    Ptrcall.call4[String, String, Boolean, Long, Long](gdext.classes.ResourceLoader.mb_load_threaded_request, livePtr, path, type_hint, use_sub_threads, cache_mode)
  }

  /** ResourceLoader.load_threaded_get. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def loadThreadedGet(path: String): Resource = {
    if (gdext.classes.ResourceLoader.mb_load_threaded_get == null) gdext.classes.ResourceLoader.mb_load_threaded_get = MethodBind.get("ResourceLoader", "load_threaded_get", 1748875256L)
    Wrappers.owned[Resource](Ptrcall.call1[String, Long](gdext.classes.ResourceLoader.mb_load_threaded_get, livePtr, path))
  }

  /** ResourceLoader.load. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def load(path: String, type_hint: String, cache_mode: Long): Resource = {
    if (gdext.classes.ResourceLoader.mb_load == null) gdext.classes.ResourceLoader.mb_load = MethodBind.get("ResourceLoader", "load", 3358495409L)
    Wrappers.owned[Resource](Ptrcall.call3[String, String, Long, Long](gdext.classes.ResourceLoader.mb_load, livePtr, path, type_hint, cache_mode))
  }

  /** ResourceLoader.add_resource_format_loader */
  final def addResourceFormatLoader(format_loader: ResourceFormatLoader, at_front: Boolean): Unit = {
    if (gdext.classes.ResourceLoader.mb_add_resource_format_loader == null) gdext.classes.ResourceLoader.mb_add_resource_format_loader = MethodBind.get("ResourceLoader", "add_resource_format_loader", 2896595483L)
    Ptrcall.callVoid2(gdext.classes.ResourceLoader.mb_add_resource_format_loader, livePtr, Wrappers.handle(format_loader), at_front)
  }

  /** ResourceLoader.remove_resource_format_loader */
  final def removeResourceFormatLoader(format_loader: ResourceFormatLoader): Unit = {
    if (gdext.classes.ResourceLoader.mb_remove_resource_format_loader == null) gdext.classes.ResourceLoader.mb_remove_resource_format_loader = MethodBind.get("ResourceLoader", "remove_resource_format_loader", 405397102L)
    Ptrcall.callVoid1(gdext.classes.ResourceLoader.mb_remove_resource_format_loader, livePtr, Wrappers.handle(format_loader))
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
  final def exists(path: String, type_hint: String): Boolean = {
    if (gdext.classes.ResourceLoader.mb_exists == null) gdext.classes.ResourceLoader.mb_exists = MethodBind.get("ResourceLoader", "exists", 4185558881L)
    Ptrcall.call2[String, String, Boolean](gdext.classes.ResourceLoader.mb_exists, livePtr, path, type_hint)
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
}
