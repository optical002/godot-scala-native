package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRActionMap`, extends `Resource`. */
abstract class OpenXRActionMap extends Resource {

  /** OpenXRActionMap.get_action_set_count */
  final def getActionSetCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRActionMap", "get_action_set_count", 3905245786L), hostObject.objectPtr)

  /** OpenXRActionMap.find_action_set */
  final def findActionSet(name: String): GodotObject =
    Ptrcall.call1[String, GodotObject](MethodBind.get("OpenXRActionMap", "find_action_set", 1888809267L), hostObject.objectPtr, name)

  /** OpenXRActionMap.get_action_set */
  final def getActionSet(idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("OpenXRActionMap", "get_action_set", 1789580336L), hostObject.objectPtr, idx)

  /** OpenXRActionMap.add_action_set */
  final def addActionSet(action_set: OpenXRActionSet): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRActionMap", "add_action_set", 2093310581L), hostObject.objectPtr, action_set.hostObject)

  /** OpenXRActionMap.remove_action_set */
  final def removeActionSet(action_set: OpenXRActionSet): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRActionMap", "remove_action_set", 2093310581L), hostObject.objectPtr, action_set.hostObject)

  /** OpenXRActionMap.get_interaction_profile_count */
  final def getInteractionProfileCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRActionMap", "get_interaction_profile_count", 3905245786L), hostObject.objectPtr)

  /** OpenXRActionMap.find_interaction_profile */
  final def findInteractionProfile(name: String): GodotObject =
    Ptrcall.call1[String, GodotObject](MethodBind.get("OpenXRActionMap", "find_interaction_profile", 3095875538L), hostObject.objectPtr, name)

  /** OpenXRActionMap.get_interaction_profile */
  final def getInteractionProfile(idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("OpenXRActionMap", "get_interaction_profile", 2546151210L), hostObject.objectPtr, idx)

  /** OpenXRActionMap.add_interaction_profile */
  final def addInteractionProfile(interaction_profile: OpenXRInteractionProfile): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRActionMap", "add_interaction_profile", 2697953512L), hostObject.objectPtr, interaction_profile.hostObject)

  /** OpenXRActionMap.remove_interaction_profile */
  final def removeInteractionProfile(interaction_profile: OpenXRInteractionProfile): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRActionMap", "remove_interaction_profile", 2697953512L), hostObject.objectPtr, interaction_profile.hostObject)

  /** OpenXRActionMap.create_default_action_sets */
  final def createDefaultActionSets(): Unit =
    Ptrcall.callVoid0(MethodBind.get("OpenXRActionMap", "create_default_action_sets", 3218959716L), hostObject.objectPtr)

}

object OpenXRActionMap {
  /** Class metadata for Gd[OpenXRActionMap] lifetime management and casting. */
  given GodotClass[OpenXRActionMap] with {
    def className = "OpenXRActionMap"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRActionMap = new OpenXRActionMap {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRActionMap): GodotObject = t.hostObject
  }
}
