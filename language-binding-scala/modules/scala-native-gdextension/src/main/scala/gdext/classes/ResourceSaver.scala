package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceSaver`, extends `Object`. */
abstract class ResourceSaver extends Object {

  /** ResourceSaver.save */
  final def save(resource: Resource, path: String, flags: Long): Long =
    Ptrcall.call3[GodotObject, String, Long, Long](MethodBind.get("ResourceSaver", "save", 2983274697L), hostObject.objectPtr, resource.hostObject, path, flags)

  /** ResourceSaver.set_uid */
  final def setUid(resource: String, uid: Long): Long =
    Ptrcall.call2[String, Long, Long](MethodBind.get("ResourceSaver", "set_uid", 993915709L), hostObject.objectPtr, resource, uid)

  /** ResourceSaver.add_resource_format_saver */
  final def addResourceFormatSaver(format_saver: ResourceFormatSaver, at_front: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("ResourceSaver", "add_resource_format_saver", 362894272L), hostObject.objectPtr, format_saver.hostObject, at_front)

  /** ResourceSaver.remove_resource_format_saver */
  final def removeResourceFormatSaver(format_saver: ResourceFormatSaver): Unit =
    Ptrcall.callVoid1(MethodBind.get("ResourceSaver", "remove_resource_format_saver", 3373026878L), hostObject.objectPtr, format_saver.hostObject)

  /** ResourceSaver.get_resource_id_for_path */
  final def getResourceIdForPath(path: String, generate: Boolean): Long =
    Ptrcall.call2[String, Boolean, Long](MethodBind.get("ResourceSaver", "get_resource_id_for_path", 150756522L), hostObject.objectPtr, path, generate)

}

object ResourceSaver {
  /** Class metadata for Gd[ResourceSaver] lifetime management and casting. */
  given GodotClass[ResourceSaver] with {
    def className = "ResourceSaver"
    def isRefCounted = false
    def wrap(o: GodotObject): ResourceSaver = new ResourceSaver {}.withHost(o.objectPtr)
    def unwrap(t: ResourceSaver): GodotObject = t.hostObject
  }

  /** The process-global ResourceSaver singleton instance. */
  def singleton: ResourceSaver = new ResourceSaver {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("ResourceSaver").ptr))
}
