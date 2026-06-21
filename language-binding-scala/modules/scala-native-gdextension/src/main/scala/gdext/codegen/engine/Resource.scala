package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Resource`, extends `RefCounted`. */
abstract class Resource extends RefCounted {

  /** Resource.set_path */
  final def setPath(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Resource", "set_path", 83702148L), hostObject.objectPtr, path)

  /** Resource.take_over_path */
  final def takeOverPath(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Resource", "take_over_path", 83702148L), hostObject.objectPtr, path)

  /** Resource.get_path */
  final def getPath(): String =
    Ptrcall.call0[String](MethodBind.get("Resource", "get_path", 201670096L), hostObject.objectPtr)

  /** Resource.set_path_cache */
  final def setPathCache(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Resource", "set_path_cache", 83702148L), hostObject.objectPtr, path)

  /** Resource.set_name */
  final def setName(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Resource", "set_name", 83702148L), hostObject.objectPtr, name)

  /** Resource.get_name */
  final def getName(): String =
    Ptrcall.call0[String](MethodBind.get("Resource", "get_name", 201670096L), hostObject.objectPtr)

  /** Resource.set_local_to_scene */
  final def setLocalToScene(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Resource", "set_local_to_scene", 2586408642L), hostObject.objectPtr, enable)

  /** Resource.is_local_to_scene */
  final def isLocalToScene(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Resource", "is_local_to_scene", 36873697L), hostObject.objectPtr)

  /** Resource.get_local_scene */
  final def getLocalScene(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Resource", "get_local_scene", 3160264692L), hostObject.objectPtr)

  /** Resource.setup_local_to_scene */
  final def setupLocalToScene(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Resource", "setup_local_to_scene", 3218959716L), hostObject.objectPtr)

  /** Resource.reset_state */
  final def resetState(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Resource", "reset_state", 3218959716L), hostObject.objectPtr)

  /** Resource.set_id_for_path */
  final def setIdForPath(path: String, id: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("Resource", "set_id_for_path", 3186203200L), hostObject.objectPtr, path, id)

  /** Resource.get_id_for_path */
  final def getIdForPath(path: String): String =
    Ptrcall.call1[String, String](MethodBind.get("Resource", "get_id_for_path", 3135753539L), hostObject.objectPtr, path)

  /** Resource.is_built_in */
  final def isBuiltIn(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Resource", "is_built_in", 36873697L), hostObject.objectPtr)

  /** Resource.set_scene_unique_id */
  final def setSceneUniqueId(id: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Resource", "set_scene_unique_id", 83702148L), hostObject.objectPtr, id)

  /** Resource.get_scene_unique_id */
  final def getSceneUniqueId(): String =
    Ptrcall.call0[String](MethodBind.get("Resource", "get_scene_unique_id", 201670096L), hostObject.objectPtr)

  /** Resource.emit_changed */
  final def emitChanged(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Resource", "emit_changed", 3218959716L), hostObject.objectPtr)

  /** Resource.duplicate */
  final def duplicate(deep: Boolean): GodotObject =
    Ptrcall.call1[Boolean, GodotObject](MethodBind.get("Resource", "duplicate", 482882304L), hostObject.objectPtr, deep)

  /** Resource.duplicate_deep */
  final def duplicateDeep(deep_subresources_mode: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("Resource", "duplicate_deep", 905779109L), hostObject.objectPtr, deep_subresources_mode)

}

object Resource {
  /** Class metadata for Gd[Resource] lifetime management and casting. */
  given GodotClass[Resource] with {
    def className = "Resource"
    def isRefCounted = true
    def wrap(o: GodotObject): Resource = new Resource {}.withHost(o.objectPtr)
    def unwrap(t: Resource): GodotObject = t.hostObject
  }
}
