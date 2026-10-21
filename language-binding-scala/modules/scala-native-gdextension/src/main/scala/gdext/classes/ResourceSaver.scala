package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ResourceSaver`, extends `Object`. */
abstract class ResourceSaver extends Object {
  override def godotClassName: String = "ResourceSaver"

  /** ResourceSaver.save */
  final def save(resource: Resource, path: String, flags: Long): Long = {
    if (gdext.classes.ResourceSaver.mb_save == null) gdext.classes.ResourceSaver.mb_save = MethodBind.get("ResourceSaver", "save", 2983274697L)
    Ptrcall.call3[GodotObject, String, Long, Long](gdext.classes.ResourceSaver.mb_save, livePtr, Wrappers.handle(resource), path, flags)
  }

  /** ResourceSaver.set_uid */
  final def setUid(resource: String, uid: Long): Long = {
    if (gdext.classes.ResourceSaver.mb_set_uid == null) gdext.classes.ResourceSaver.mb_set_uid = MethodBind.get("ResourceSaver", "set_uid", 993915709L)
    Ptrcall.call2[String, Long, Long](gdext.classes.ResourceSaver.mb_set_uid, livePtr, resource, uid)
  }

  /** ResourceSaver.add_resource_format_saver */
  final def addResourceFormatSaver(format_saver: ResourceFormatSaver, at_front: Boolean): Unit = {
    if (gdext.classes.ResourceSaver.mb_add_resource_format_saver == null) gdext.classes.ResourceSaver.mb_add_resource_format_saver = MethodBind.get("ResourceSaver", "add_resource_format_saver", 362894272L)
    Ptrcall.callVoid2(gdext.classes.ResourceSaver.mb_add_resource_format_saver, livePtr, Wrappers.handle(format_saver), at_front)
  }

  /** ResourceSaver.remove_resource_format_saver */
  final def removeResourceFormatSaver(format_saver: ResourceFormatSaver): Unit = {
    if (gdext.classes.ResourceSaver.mb_remove_resource_format_saver == null) gdext.classes.ResourceSaver.mb_remove_resource_format_saver = MethodBind.get("ResourceSaver", "remove_resource_format_saver", 3373026878L)
    Ptrcall.callVoid1(gdext.classes.ResourceSaver.mb_remove_resource_format_saver, livePtr, Wrappers.handle(format_saver))
  }

  /** ResourceSaver.get_resource_id_for_path */
  final def getResourceIdForPath(path: String, generate: Boolean): Long = {
    if (gdext.classes.ResourceSaver.mb_get_resource_id_for_path == null) gdext.classes.ResourceSaver.mb_get_resource_id_for_path = MethodBind.get("ResourceSaver", "get_resource_id_for_path", 150756522L)
    Ptrcall.call2[String, Boolean, Long](gdext.classes.ResourceSaver.mb_get_resource_id_for_path, livePtr, path, generate)
  }

}

object ResourceSaver {
  private[classes] var mb_save: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uid: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_resource_format_saver: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_resource_format_saver: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_resource_id_for_path: GDExtensionMethodBindPtr = null

  private var instance: ResourceSaver = null

  /** The process-global ResourceSaver singleton instance. */
  def singleton: ResourceSaver = {
    if (instance == null)
      instance = Wrappers.borrowed[ResourceSaver](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("ResourceSaver").ptr)))
    instance
  }
}
