package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRInteractionProfile`, extends `Resource`. */
abstract class OpenXRInteractionProfile extends Resource {

  /** OpenXRInteractionProfile.set_interaction_profile_path */
  final def setInteractionProfilePath(interaction_profile_path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRInteractionProfile", "set_interaction_profile_path", 83702148L), hostObject.objectPtr, interaction_profile_path)

  /** OpenXRInteractionProfile.get_interaction_profile_path */
  final def getInteractionProfilePath(): String =
    Ptrcall.call0[String](MethodBind.get("OpenXRInteractionProfile", "get_interaction_profile_path", 201670096L), hostObject.objectPtr)

  /** OpenXRInteractionProfile.get_binding_count */
  final def getBindingCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRInteractionProfile", "get_binding_count", 3905245786L), hostObject.objectPtr)

  /** OpenXRInteractionProfile.get_binding */
  final def getBinding(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("OpenXRInteractionProfile", "get_binding", 3934429652L), hostObject.objectPtr, index)

  /** OpenXRInteractionProfile.get_binding_modifier_count */
  final def getBindingModifierCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRInteractionProfile", "get_binding_modifier_count", 3905245786L), hostObject.objectPtr)

  /** OpenXRInteractionProfile.get_binding_modifier */
  final def getBindingModifier(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("OpenXRInteractionProfile", "get_binding_modifier", 2419896583L), hostObject.objectPtr, index)

}

object OpenXRInteractionProfile {
  /** Class metadata for Gd[OpenXRInteractionProfile] lifetime management and casting. */
  given GodotClass[OpenXRInteractionProfile] with {
    def className = "OpenXRInteractionProfile"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRInteractionProfile = new OpenXRInteractionProfile {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRInteractionProfile): GodotObject = t.hostObject
  }
}
