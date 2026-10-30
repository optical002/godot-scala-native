package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRInteractionProfile`, extends `Resource`. */
abstract class OpenXRInteractionProfile extends Resource {
  override def godotClassName: String = "OpenXRInteractionProfile"

  /** OpenXRInteractionProfile.set_interaction_profile_path */
  final def setInteractionProfilePath(interactionProfilePath: String): Unit = {
    if (gdext.classes.OpenXRInteractionProfile.mb_set_interaction_profile_path == null) gdext.classes.OpenXRInteractionProfile.mb_set_interaction_profile_path = MethodBind.get("OpenXRInteractionProfile", "set_interaction_profile_path", 83702148L)
    Ptrcall.callVoid1(gdext.classes.OpenXRInteractionProfile.mb_set_interaction_profile_path, livePtr, interactionProfilePath)
  }

  /** OpenXRInteractionProfile.get_interaction_profile_path */
  final def getInteractionProfilePath(): String = {
    if (gdext.classes.OpenXRInteractionProfile.mb_get_interaction_profile_path == null) gdext.classes.OpenXRInteractionProfile.mb_get_interaction_profile_path = MethodBind.get("OpenXRInteractionProfile", "get_interaction_profile_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.OpenXRInteractionProfile.mb_get_interaction_profile_path, livePtr)
  }

  /** OpenXRInteractionProfile.get_binding_count */
  final def getBindingCount(): Long = {
    if (gdext.classes.OpenXRInteractionProfile.mb_get_binding_count == null) gdext.classes.OpenXRInteractionProfile.mb_get_binding_count = MethodBind.get("OpenXRInteractionProfile", "get_binding_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OpenXRInteractionProfile.mb_get_binding_count, livePtr)
  }

  /** OpenXRInteractionProfile.get_binding. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getBinding(index: Long): OpenXRIPBinding = {
    if (gdext.classes.OpenXRInteractionProfile.mb_get_binding == null) gdext.classes.OpenXRInteractionProfile.mb_get_binding = MethodBind.get("OpenXRInteractionProfile", "get_binding", 3934429652L)
    Wrappers.owned[OpenXRIPBinding](Ptrcall.call1[Long, Long](gdext.classes.OpenXRInteractionProfile.mb_get_binding, livePtr, index))
  }

  /** OpenXRInteractionProfile.get_binding_modifier_count */
  final def getBindingModifierCount(): Long = {
    if (gdext.classes.OpenXRInteractionProfile.mb_get_binding_modifier_count == null) gdext.classes.OpenXRInteractionProfile.mb_get_binding_modifier_count = MethodBind.get("OpenXRInteractionProfile", "get_binding_modifier_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OpenXRInteractionProfile.mb_get_binding_modifier_count, livePtr)
  }

  /** OpenXRInteractionProfile.get_binding_modifier. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getBindingModifier(index: Long): OpenXRIPBindingModifier = {
    if (gdext.classes.OpenXRInteractionProfile.mb_get_binding_modifier == null) gdext.classes.OpenXRInteractionProfile.mb_get_binding_modifier = MethodBind.get("OpenXRInteractionProfile", "get_binding_modifier", 2419896583L)
    Wrappers.owned[OpenXRIPBindingModifier](Ptrcall.call1[Long, Long](gdext.classes.OpenXRInteractionProfile.mb_get_binding_modifier, livePtr, index))
  }

}

object OpenXRInteractionProfile {
  private[classes] var mb_set_interaction_profile_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_interaction_profile_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_binding_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_binding: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_binding_modifier_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_binding_modifier: GDExtensionMethodBindPtr = null
}
