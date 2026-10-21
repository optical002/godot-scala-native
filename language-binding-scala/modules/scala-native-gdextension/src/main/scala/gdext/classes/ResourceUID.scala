package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ResourceUID`, extends `Object`. */
abstract class ResourceUID extends Object {
  override def godotClassName: String = "ResourceUID"

  /** ResourceUID.id_to_text */
  final def idToText(id: Long): String = {
    if (gdext.classes.ResourceUID.mb_id_to_text == null) gdext.classes.ResourceUID.mb_id_to_text = MethodBind.get("ResourceUID", "id_to_text", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.ResourceUID.mb_id_to_text, livePtr, id)
  }

  /** ResourceUID.text_to_id */
  final def textToId(text_id: String): Long = {
    if (gdext.classes.ResourceUID.mb_text_to_id == null) gdext.classes.ResourceUID.mb_text_to_id = MethodBind.get("ResourceUID", "text_to_id", 1321353865L)
    Ptrcall.call1[String, Long](gdext.classes.ResourceUID.mb_text_to_id, livePtr, text_id)
  }

  /** ResourceUID.create_id */
  final def createId(): Long = {
    if (gdext.classes.ResourceUID.mb_create_id == null) gdext.classes.ResourceUID.mb_create_id = MethodBind.get("ResourceUID", "create_id", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.ResourceUID.mb_create_id, livePtr)
  }

  /** ResourceUID.create_id_for_path */
  final def createIdForPath(path: String): Long = {
    if (gdext.classes.ResourceUID.mb_create_id_for_path == null) gdext.classes.ResourceUID.mb_create_id_for_path = MethodBind.get("ResourceUID", "create_id_for_path", 1597066294L)
    Ptrcall.call1[String, Long](gdext.classes.ResourceUID.mb_create_id_for_path, livePtr, path)
  }

  /** ResourceUID.has_id */
  final def hasId(id: Long): Boolean = {
    if (gdext.classes.ResourceUID.mb_has_id == null) gdext.classes.ResourceUID.mb_has_id = MethodBind.get("ResourceUID", "has_id", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.ResourceUID.mb_has_id, livePtr, id)
  }

  /** ResourceUID.add_id */
  final def addId(id: Long, path: String): Unit = {
    if (gdext.classes.ResourceUID.mb_add_id == null) gdext.classes.ResourceUID.mb_add_id = MethodBind.get("ResourceUID", "add_id", 501894301L)
    Ptrcall.callVoid2(gdext.classes.ResourceUID.mb_add_id, livePtr, id, path)
  }

  /** ResourceUID.set_id */
  final def setId(id: Long, path: String): Unit = {
    if (gdext.classes.ResourceUID.mb_set_id == null) gdext.classes.ResourceUID.mb_set_id = MethodBind.get("ResourceUID", "set_id", 501894301L)
    Ptrcall.callVoid2(gdext.classes.ResourceUID.mb_set_id, livePtr, id, path)
  }

  /** ResourceUID.get_id_path */
  final def getIdPath(id: Long): String = {
    if (gdext.classes.ResourceUID.mb_get_id_path == null) gdext.classes.ResourceUID.mb_get_id_path = MethodBind.get("ResourceUID", "get_id_path", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.ResourceUID.mb_get_id_path, livePtr, id)
  }

  /** ResourceUID.remove_id */
  final def removeId(id: Long): Unit = {
    if (gdext.classes.ResourceUID.mb_remove_id == null) gdext.classes.ResourceUID.mb_remove_id = MethodBind.get("ResourceUID", "remove_id", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ResourceUID.mb_remove_id, livePtr, id)
  }

}

object ResourceUID {
  private[classes] var mb_id_to_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_text_to_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_id_for_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_id_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_uid_to_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_path_to_uid: GDExtensionMethodBindPtr = null
  private[classes] var mb_ensure_path: GDExtensionMethodBindPtr = null

  private var instance: ResourceUID = null

  /** The process-global ResourceUID singleton instance. */
  def singleton: ResourceUID = {
    if (instance == null)
      instance = Wrappers.borrowed[ResourceUID](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("ResourceUID").ptr)))
    instance
  }

  /** ResourceUID.uid_to_path */
  final def uidToPath(uid: String): String = {
    if (gdext.classes.ResourceUID.mb_uid_to_path == null) gdext.classes.ResourceUID.mb_uid_to_path = MethodBind.get("ResourceUID", "uid_to_path", 1703090593L)
    Ptrcall.call1[String, String](gdext.classes.ResourceUID.mb_uid_to_path, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], uid)
  }

  /** ResourceUID.path_to_uid */
  final def pathToUid(path: String): String = {
    if (gdext.classes.ResourceUID.mb_path_to_uid == null) gdext.classes.ResourceUID.mb_path_to_uid = MethodBind.get("ResourceUID", "path_to_uid", 1703090593L)
    Ptrcall.call1[String, String](gdext.classes.ResourceUID.mb_path_to_uid, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path)
  }

  /** ResourceUID.ensure_path */
  final def ensurePath(path_or_uid: String): String = {
    if (gdext.classes.ResourceUID.mb_ensure_path == null) gdext.classes.ResourceUID.mb_ensure_path = MethodBind.get("ResourceUID", "ensure_path", 1703090593L)
    Ptrcall.call1[String, String](gdext.classes.ResourceUID.mb_ensure_path, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path_or_uid)
  }
}
