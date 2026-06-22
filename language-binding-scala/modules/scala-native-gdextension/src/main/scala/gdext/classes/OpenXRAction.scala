package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRAction`, extends `Resource`. */
abstract class OpenXRAction extends Resource {

  /** OpenXRAction.set_localized_name */
  final def setLocalizedName(localized_name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAction", "set_localized_name", 83702148L), hostObject.objectPtr, localized_name)

  /** OpenXRAction.get_localized_name */
  final def getLocalizedName(): String =
    Ptrcall.call0[String](MethodBind.get("OpenXRAction", "get_localized_name", 201670096L), hostObject.objectPtr)

  /** OpenXRAction.set_action_type */
  final def setActionType(action_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAction", "set_action_type", 1675238366L), hostObject.objectPtr, action_type)

  /** OpenXRAction.get_action_type */
  final def getActionType(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRAction", "get_action_type", 3536542431L), hostObject.objectPtr)

}

object OpenXRAction {
  /** Class metadata for Gd[OpenXRAction] lifetime management and casting. */
  given GodotClass[OpenXRAction] with {
    def className = "OpenXRAction"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRAction = new OpenXRAction {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRAction): GodotObject = t.hostObject
  }
}
