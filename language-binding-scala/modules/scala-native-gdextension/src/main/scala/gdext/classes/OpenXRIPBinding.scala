package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRIPBinding`, extends `Resource`. */
abstract class OpenXRIPBinding extends Resource {

  /** OpenXRIPBinding.set_action */
  final def setAction(action: OpenXRAction): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRIPBinding", "set_action", 349361333L), hostObject.objectPtr, action.hostObject)

  /** OpenXRIPBinding.get_action */
  final def getAction(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("OpenXRIPBinding", "get_action", 4072409085L), hostObject.objectPtr)

  /** OpenXRIPBinding.set_binding_path */
  final def setBindingPath(binding_path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRIPBinding", "set_binding_path", 83702148L), hostObject.objectPtr, binding_path)

  /** OpenXRIPBinding.get_binding_path */
  final def getBindingPath(): String =
    Ptrcall.call0[String](MethodBind.get("OpenXRIPBinding", "get_binding_path", 201670096L), hostObject.objectPtr)

  /** OpenXRIPBinding.get_binding_modifier_count */
  final def getBindingModifierCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRIPBinding", "get_binding_modifier_count", 3905245786L), hostObject.objectPtr)

  /** OpenXRIPBinding.get_binding_modifier */
  final def getBindingModifier(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("OpenXRIPBinding", "get_binding_modifier", 3538296211L), hostObject.objectPtr, index)

  /** OpenXRIPBinding.get_path_count */
  final def getPathCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRIPBinding", "get_path_count", 3905245786L), hostObject.objectPtr)

  /** OpenXRIPBinding.has_path */
  final def hasPath(path: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("OpenXRIPBinding", "has_path", 3927539163L), hostObject.objectPtr, path)

  /** OpenXRIPBinding.add_path */
  final def addPath(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRIPBinding", "add_path", 83702148L), hostObject.objectPtr, path)

  /** OpenXRIPBinding.remove_path */
  final def removePath(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRIPBinding", "remove_path", 83702148L), hostObject.objectPtr, path)

}

object OpenXRIPBinding {
  /** Class metadata for Gd[OpenXRIPBinding] lifetime management and casting. */
  given GodotClass[OpenXRIPBinding] with {
    def className = "OpenXRIPBinding"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRIPBinding = new OpenXRIPBinding {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRIPBinding): GodotObject = t.hostObject
  }
}
