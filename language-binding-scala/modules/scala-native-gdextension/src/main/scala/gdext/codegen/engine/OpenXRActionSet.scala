package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRActionSet`, extends `Resource`. */
abstract class OpenXRActionSet extends Resource {

  /** OpenXRActionSet.set_localized_name */
  final def setLocalizedName(localized_name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRActionSet", "set_localized_name", 83702148L), hostObject.objectPtr, localized_name)

  /** OpenXRActionSet.get_localized_name */
  final def getLocalizedName(): String =
    Ptrcall.call0[String](MethodBind.get("OpenXRActionSet", "get_localized_name", 201670096L), hostObject.objectPtr)

  /** OpenXRActionSet.set_priority */
  final def setPriority(priority: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRActionSet", "set_priority", 1286410249L), hostObject.objectPtr, priority)

  /** OpenXRActionSet.get_priority */
  final def getPriority(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRActionSet", "get_priority", 3905245786L), hostObject.objectPtr)

  /** OpenXRActionSet.get_action_count */
  final def getActionCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRActionSet", "get_action_count", 3905245786L), hostObject.objectPtr)

  /** OpenXRActionSet.add_action */
  final def addAction(action: OpenXRAction): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRActionSet", "add_action", 349361333L), hostObject.objectPtr, action.hostObject)

  /** OpenXRActionSet.remove_action */
  final def removeAction(action: OpenXRAction): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRActionSet", "remove_action", 349361333L), hostObject.objectPtr, action.hostObject)

}

object OpenXRActionSet {
  /** Class metadata for Gd[OpenXRActionSet] lifetime management and casting. */
  given GodotClass[OpenXRActionSet] with {
    def className = "OpenXRActionSet"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRActionSet = new OpenXRActionSet {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRActionSet): GodotObject = t.hostObject
  }
}
