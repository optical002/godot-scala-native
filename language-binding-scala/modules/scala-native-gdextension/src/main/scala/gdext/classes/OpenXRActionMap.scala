package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRActionMap`, extends `Resource`. */
abstract class OpenXRActionMap extends Resource {
  override def godotClassName: String = "OpenXRActionMap"

  /** OpenXRActionMap.get_action_set_count */
  final def getActionSetCount(): Long = {
    if (gdext.classes.OpenXRActionMap.mb_get_action_set_count == null) gdext.classes.OpenXRActionMap.mb_get_action_set_count = MethodBind.get("OpenXRActionMap", "get_action_set_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OpenXRActionMap.mb_get_action_set_count, livePtr)
  }

  /** OpenXRActionMap.find_action_set. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def findActionSet(name: String): OpenXRActionSet = {
    if (gdext.classes.OpenXRActionMap.mb_find_action_set == null) gdext.classes.OpenXRActionMap.mb_find_action_set = MethodBind.get("OpenXRActionMap", "find_action_set", 1888809267L)
    Wrappers.owned[OpenXRActionSet](Ptrcall.call1[String, Long](gdext.classes.OpenXRActionMap.mb_find_action_set, livePtr, name))
  }

  /** OpenXRActionMap.get_action_set. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getActionSet(idx: Long): OpenXRActionSet = {
    if (gdext.classes.OpenXRActionMap.mb_get_action_set == null) gdext.classes.OpenXRActionMap.mb_get_action_set = MethodBind.get("OpenXRActionMap", "get_action_set", 1789580336L)
    Wrappers.owned[OpenXRActionSet](Ptrcall.call1[Long, Long](gdext.classes.OpenXRActionMap.mb_get_action_set, livePtr, idx))
  }

  /** OpenXRActionMap.add_action_set */
  final def addActionSet(actionSet: OpenXRActionSet): Unit = {
    if (gdext.classes.OpenXRActionMap.mb_add_action_set == null) gdext.classes.OpenXRActionMap.mb_add_action_set = MethodBind.get("OpenXRActionMap", "add_action_set", 2093310581L)
    Ptrcall.callVoid1(gdext.classes.OpenXRActionMap.mb_add_action_set, livePtr, Wrappers.handle(actionSet))
  }

  /** OpenXRActionMap.remove_action_set */
  final def removeActionSet(actionSet: OpenXRActionSet): Unit = {
    if (gdext.classes.OpenXRActionMap.mb_remove_action_set == null) gdext.classes.OpenXRActionMap.mb_remove_action_set = MethodBind.get("OpenXRActionMap", "remove_action_set", 2093310581L)
    Ptrcall.callVoid1(gdext.classes.OpenXRActionMap.mb_remove_action_set, livePtr, Wrappers.handle(actionSet))
  }

  /** OpenXRActionMap.get_interaction_profile_count */
  final def getInteractionProfileCount(): Long = {
    if (gdext.classes.OpenXRActionMap.mb_get_interaction_profile_count == null) gdext.classes.OpenXRActionMap.mb_get_interaction_profile_count = MethodBind.get("OpenXRActionMap", "get_interaction_profile_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OpenXRActionMap.mb_get_interaction_profile_count, livePtr)
  }

  /** OpenXRActionMap.find_interaction_profile. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def findInteractionProfile(name: String): OpenXRInteractionProfile = {
    if (gdext.classes.OpenXRActionMap.mb_find_interaction_profile == null) gdext.classes.OpenXRActionMap.mb_find_interaction_profile = MethodBind.get("OpenXRActionMap", "find_interaction_profile", 3095875538L)
    Wrappers.owned[OpenXRInteractionProfile](Ptrcall.call1[String, Long](gdext.classes.OpenXRActionMap.mb_find_interaction_profile, livePtr, name))
  }

  /** OpenXRActionMap.get_interaction_profile. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getInteractionProfile(idx: Long): OpenXRInteractionProfile = {
    if (gdext.classes.OpenXRActionMap.mb_get_interaction_profile == null) gdext.classes.OpenXRActionMap.mb_get_interaction_profile = MethodBind.get("OpenXRActionMap", "get_interaction_profile", 2546151210L)
    Wrappers.owned[OpenXRInteractionProfile](Ptrcall.call1[Long, Long](gdext.classes.OpenXRActionMap.mb_get_interaction_profile, livePtr, idx))
  }

  /** OpenXRActionMap.add_interaction_profile */
  final def addInteractionProfile(interactionProfile: OpenXRInteractionProfile): Unit = {
    if (gdext.classes.OpenXRActionMap.mb_add_interaction_profile == null) gdext.classes.OpenXRActionMap.mb_add_interaction_profile = MethodBind.get("OpenXRActionMap", "add_interaction_profile", 2697953512L)
    Ptrcall.callVoid1(gdext.classes.OpenXRActionMap.mb_add_interaction_profile, livePtr, Wrappers.handle(interactionProfile))
  }

  /** OpenXRActionMap.remove_interaction_profile */
  final def removeInteractionProfile(interactionProfile: OpenXRInteractionProfile): Unit = {
    if (gdext.classes.OpenXRActionMap.mb_remove_interaction_profile == null) gdext.classes.OpenXRActionMap.mb_remove_interaction_profile = MethodBind.get("OpenXRActionMap", "remove_interaction_profile", 2697953512L)
    Ptrcall.callVoid1(gdext.classes.OpenXRActionMap.mb_remove_interaction_profile, livePtr, Wrappers.handle(interactionProfile))
  }

  /** OpenXRActionMap.create_default_action_sets */
  final def createDefaultActionSets(): Unit = {
    if (gdext.classes.OpenXRActionMap.mb_create_default_action_sets == null) gdext.classes.OpenXRActionMap.mb_create_default_action_sets = MethodBind.get("OpenXRActionMap", "create_default_action_sets", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.OpenXRActionMap.mb_create_default_action_sets, livePtr)
  }

}

object OpenXRActionMap {
  private[classes] var mb_get_action_set_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_action_set: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_action_set: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_action_set: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_action_set: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_interaction_profile_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_interaction_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_interaction_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_interaction_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_interaction_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_default_action_sets: GDExtensionMethodBindPtr = null
}
