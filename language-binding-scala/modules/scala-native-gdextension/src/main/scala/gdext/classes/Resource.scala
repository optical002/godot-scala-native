package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Resource`, extends `RefCounted`. */
abstract class Resource extends RefCounted {
  override def godotClassName: String = "Resource"

  /** Resource.set_path */
  final def setPath(path: String): Unit = {
    if (gdext.classes.Resource.mb_set_path == null) gdext.classes.Resource.mb_set_path = MethodBind.get("Resource", "set_path", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Resource.mb_set_path, livePtr, path)
  }

  /** Resource.take_over_path */
  final def takeOverPath(path: String): Unit = {
    if (gdext.classes.Resource.mb_take_over_path == null) gdext.classes.Resource.mb_take_over_path = MethodBind.get("Resource", "take_over_path", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Resource.mb_take_over_path, livePtr, path)
  }

  /** Resource.get_path */
  final def getPath(): String = {
    if (gdext.classes.Resource.mb_get_path == null) gdext.classes.Resource.mb_get_path = MethodBind.get("Resource", "get_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.Resource.mb_get_path, livePtr)
  }

  /** Resource.set_path_cache */
  final def setPathCache(path: String): Unit = {
    if (gdext.classes.Resource.mb_set_path_cache == null) gdext.classes.Resource.mb_set_path_cache = MethodBind.get("Resource", "set_path_cache", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Resource.mb_set_path_cache, livePtr, path)
  }

  /** Resource.set_name */
  final def setName(name: String): Unit = {
    if (gdext.classes.Resource.mb_set_name == null) gdext.classes.Resource.mb_set_name = MethodBind.get("Resource", "set_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Resource.mb_set_name, livePtr, name)
  }

  /** Resource.get_name */
  final def getName(): String = {
    if (gdext.classes.Resource.mb_get_name == null) gdext.classes.Resource.mb_get_name = MethodBind.get("Resource", "get_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.Resource.mb_get_name, livePtr)
  }

  /** Resource.set_local_to_scene */
  final def setLocalToScene(enable: Boolean): Unit = {
    if (gdext.classes.Resource.mb_set_local_to_scene == null) gdext.classes.Resource.mb_set_local_to_scene = MethodBind.get("Resource", "set_local_to_scene", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Resource.mb_set_local_to_scene, livePtr, enable)
  }

  /** Resource.is_local_to_scene */
  final def isLocalToScene(): Boolean = {
    if (gdext.classes.Resource.mb_is_local_to_scene == null) gdext.classes.Resource.mb_is_local_to_scene = MethodBind.get("Resource", "is_local_to_scene", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Resource.mb_is_local_to_scene, livePtr)
  }

  /** Resource.get_local_scene */
  final def getLocalScene(): Node = {
    if (gdext.classes.Resource.mb_get_local_scene == null) gdext.classes.Resource.mb_get_local_scene = MethodBind.get("Resource", "get_local_scene", 3160264692L)
    Wrappers.borrowed[Node](Ptrcall.call0[Long](gdext.classes.Resource.mb_get_local_scene, livePtr))
  }

  /** Resource.setup_local_to_scene */
  final def setupLocalToScene(): Unit = {
    if (gdext.classes.Resource.mb_setup_local_to_scene == null) gdext.classes.Resource.mb_setup_local_to_scene = MethodBind.get("Resource", "setup_local_to_scene", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Resource.mb_setup_local_to_scene, livePtr)
  }

  /** Resource.reset_state */
  final def resetState(): Unit = {
    if (gdext.classes.Resource.mb_reset_state == null) gdext.classes.Resource.mb_reset_state = MethodBind.get("Resource", "reset_state", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Resource.mb_reset_state, livePtr)
  }

  /** Resource.set_id_for_path */
  final def setIdForPath(path: String, id: String): Unit = {
    if (gdext.classes.Resource.mb_set_id_for_path == null) gdext.classes.Resource.mb_set_id_for_path = MethodBind.get("Resource", "set_id_for_path", 3186203200L)
    Ptrcall.callVoid2(gdext.classes.Resource.mb_set_id_for_path, livePtr, path, id)
  }

  /** Resource.get_id_for_path */
  final def getIdForPath(path: String): String = {
    if (gdext.classes.Resource.mb_get_id_for_path == null) gdext.classes.Resource.mb_get_id_for_path = MethodBind.get("Resource", "get_id_for_path", 3135753539L)
    Ptrcall.call1[String, String](gdext.classes.Resource.mb_get_id_for_path, livePtr, path)
  }

  /** Resource.is_built_in */
  final def isBuiltIn(): Boolean = {
    if (gdext.classes.Resource.mb_is_built_in == null) gdext.classes.Resource.mb_is_built_in = MethodBind.get("Resource", "is_built_in", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Resource.mb_is_built_in, livePtr)
  }

  /** Resource.set_scene_unique_id */
  final def setSceneUniqueId(id: String): Unit = {
    if (gdext.classes.Resource.mb_set_scene_unique_id == null) gdext.classes.Resource.mb_set_scene_unique_id = MethodBind.get("Resource", "set_scene_unique_id", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Resource.mb_set_scene_unique_id, livePtr, id)
  }

  /** Resource.get_scene_unique_id */
  final def getSceneUniqueId(): String = {
    if (gdext.classes.Resource.mb_get_scene_unique_id == null) gdext.classes.Resource.mb_get_scene_unique_id = MethodBind.get("Resource", "get_scene_unique_id", 201670096L)
    Ptrcall.call0[String](gdext.classes.Resource.mb_get_scene_unique_id, livePtr)
  }

  /** Resource.emit_changed */
  final def emitChanged(): Unit = {
    if (gdext.classes.Resource.mb_emit_changed == null) gdext.classes.Resource.mb_emit_changed = MethodBind.get("Resource", "emit_changed", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Resource.mb_emit_changed, livePtr)
  }

  /** Resource.duplicate. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def duplicate(deep: Boolean): Resource = {
    if (gdext.classes.Resource.mb_duplicate == null) gdext.classes.Resource.mb_duplicate = MethodBind.get("Resource", "duplicate", 482882304L)
    Wrappers.owned[Resource](Ptrcall.call1[Boolean, Long](gdext.classes.Resource.mb_duplicate, livePtr, deep))
  }

  /** Resource.duplicate_deep. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def duplicateDeep(deep_subresources_mode: Long): Resource = {
    if (gdext.classes.Resource.mb_duplicate_deep == null) gdext.classes.Resource.mb_duplicate_deep = MethodBind.get("Resource", "duplicate_deep", 905779109L)
    Wrappers.owned[Resource](Ptrcall.call1[Long, Long](gdext.classes.Resource.mb_duplicate_deep, livePtr, deep_subresources_mode))
  }

}

object Resource {
  private[classes] var mb_set_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_take_over_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_path_cache: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_local_to_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_local_to_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_local_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_setup_local_to_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_id_for_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_id_for_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_built_in: GDExtensionMethodBindPtr = null
  private[classes] var mb_generate_scene_unique_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scene_unique_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scene_unique_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_emit_changed: GDExtensionMethodBindPtr = null
  private[classes] var mb_duplicate: GDExtensionMethodBindPtr = null
  private[classes] var mb_duplicate_deep: GDExtensionMethodBindPtr = null

  /** Resource.generate_scene_unique_id */
  final def generateSceneUniqueId(): String = {
    if (gdext.classes.Resource.mb_generate_scene_unique_id == null) gdext.classes.Resource.mb_generate_scene_unique_id = MethodBind.get("Resource", "generate_scene_unique_id", 2841200299L)
    Ptrcall.call0[String](gdext.classes.Resource.mb_generate_scene_unique_id, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr])
  }
}
