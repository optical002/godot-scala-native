package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceUID`, extends `Object`. */
abstract class ResourceUID extends Object {

  /** ResourceUID.id_to_text */
  final def idToText(id: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("ResourceUID", "id_to_text", 844755477L), hostObject.objectPtr, id)

  /** ResourceUID.text_to_id */
  final def textToId(text_id: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("ResourceUID", "text_to_id", 1321353865L), hostObject.objectPtr, text_id)

  /** ResourceUID.create_id */
  final def createId(): Long =
    Ptrcall.call0[Long](MethodBind.get("ResourceUID", "create_id", 2455072627L), hostObject.objectPtr)

  /** ResourceUID.create_id_for_path */
  final def createIdForPath(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("ResourceUID", "create_id_for_path", 1597066294L), hostObject.objectPtr, path)

  /** ResourceUID.has_id */
  final def hasId(id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("ResourceUID", "has_id", 1116898809L), hostObject.objectPtr, id)

  /** ResourceUID.add_id */
  final def addId(id: Long, path: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("ResourceUID", "add_id", 501894301L), hostObject.objectPtr, id, path)

  /** ResourceUID.set_id */
  final def setId(id: Long, path: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("ResourceUID", "set_id", 501894301L), hostObject.objectPtr, id, path)

  /** ResourceUID.get_id_path */
  final def getIdPath(id: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("ResourceUID", "get_id_path", 844755477L), hostObject.objectPtr, id)

  /** ResourceUID.remove_id */
  final def removeId(id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ResourceUID", "remove_id", 1286410249L), hostObject.objectPtr, id)

}

object ResourceUID {
  /** Class metadata for Gd[ResourceUID] lifetime management and casting. */
  given GodotClass[ResourceUID] with {
    def className = "ResourceUID"
    def isRefCounted = false
    def wrap(o: GodotObject): ResourceUID = new ResourceUID {}.withHost(o.objectPtr)
    def unwrap(t: ResourceUID): GodotObject = t.hostObject
  }

  /** The process-global ResourceUID singleton instance. */
  def singleton: ResourceUID = new ResourceUID {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("ResourceUID").ptr))
}
