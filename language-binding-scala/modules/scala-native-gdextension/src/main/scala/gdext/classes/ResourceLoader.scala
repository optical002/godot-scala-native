package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceLoader`, extends `Object`. */
abstract class ResourceLoader extends Object {
  override def godotClassName: String = "ResourceLoader"

  /** ResourceLoader.load_threaded_request */
  final def loadThreadedRequest(path: String, type_hint: String, use_sub_threads: Boolean, cache_mode: Long): Long =
    Ptrcall.call4[String, String, Boolean, Long, Long](MethodBind.get("ResourceLoader", "load_threaded_request", 3614384323L), hostObject.objectPtr, path, type_hint, use_sub_threads, cache_mode)

  /** ResourceLoader.load_threaded_get */
  final def loadThreadedGet(path: String): GodotObject =
    Ptrcall.call1[String, GodotObject](MethodBind.get("ResourceLoader", "load_threaded_get", 1748875256L), hostObject.objectPtr, path)

  /** ResourceLoader.load */
  final def load(path: String, type_hint: String, cache_mode: Long): GodotObject =
    Ptrcall.call3[String, String, Long, GodotObject](MethodBind.get("ResourceLoader", "load", 3358495409L), hostObject.objectPtr, path, type_hint, cache_mode)

  /** ResourceLoader.add_resource_format_loader */
  final def addResourceFormatLoader(format_loader: ResourceFormatLoader, at_front: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("ResourceLoader", "add_resource_format_loader", 2896595483L), hostObject.objectPtr, format_loader.hostObject, at_front)

  /** ResourceLoader.remove_resource_format_loader */
  final def removeResourceFormatLoader(format_loader: ResourceFormatLoader): Unit =
    Ptrcall.callVoid1(MethodBind.get("ResourceLoader", "remove_resource_format_loader", 405397102L), hostObject.objectPtr, format_loader.hostObject)

  /** ResourceLoader.set_abort_on_missing_resources */
  final def setAbortOnMissingResources(abort: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ResourceLoader", "set_abort_on_missing_resources", 2586408642L), hostObject.objectPtr, abort)

  /** ResourceLoader.has_cached */
  final def hasCached(path: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("ResourceLoader", "has_cached", 2323990056L), hostObject.objectPtr, path)

  /** ResourceLoader.get_cached_ref */
  final def getCachedRef(path: String): GodotObject =
    Ptrcall.call1[String, GodotObject](MethodBind.get("ResourceLoader", "get_cached_ref", 1748875256L), hostObject.objectPtr, path)

  /** ResourceLoader.exists */
  final def exists(path: String, type_hint: String): Boolean =
    Ptrcall.call2[String, String, Boolean](MethodBind.get("ResourceLoader", "exists", 4185558881L), hostObject.objectPtr, path, type_hint)

  /** ResourceLoader.get_resource_uid */
  final def getResourceUid(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("ResourceLoader", "get_resource_uid", 1597066294L), hostObject.objectPtr, path)

}

object ResourceLoader {
  /** The process-global ResourceLoader singleton instance. */
  def singleton: ResourceLoader = new ResourceLoader {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("ResourceLoader").ptr))
}
