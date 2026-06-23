package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRInteractionProfileMetadata`, extends `Object`. */
abstract class OpenXRInteractionProfileMetadata extends Object {

  /** OpenXRInteractionProfileMetadata.register_profile_rename */
  final def registerProfileRename(old_name: String, new_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("OpenXRInteractionProfileMetadata", "register_profile_rename", 3186203200L), hostObject.objectPtr, old_name, new_name)

  /** OpenXRInteractionProfileMetadata.register_path_rename */
  final def registerPathRename(old_name: String, new_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("OpenXRInteractionProfileMetadata", "register_path_rename", 3186203200L), hostObject.objectPtr, old_name, new_name)

  /** OpenXRInteractionProfileMetadata.register_top_level_path */
  final def registerTopLevelPath(display_name: String, openxr_path: String, openxr_extension_names: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("OpenXRInteractionProfileMetadata", "register_top_level_path", 254767734L), hostObject.objectPtr, display_name, openxr_path, openxr_extension_names)

  /** OpenXRInteractionProfileMetadata.register_interaction_profile */
  final def registerInteractionProfile(display_name: String, openxr_path: String, openxr_extension_names: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("OpenXRInteractionProfileMetadata", "register_interaction_profile", 254767734L), hostObject.objectPtr, display_name, openxr_path, openxr_extension_names)

  /** OpenXRInteractionProfileMetadata.register_io_path */
  final def registerIoPath(interaction_profile: String, display_name: String, toplevel_path: String, openxr_path: String, openxr_extension_names: String, action_type: Long): Unit =
    Ptrcall.callVoid6(MethodBind.get("OpenXRInteractionProfileMetadata", "register_io_path", 3443511926L), hostObject.objectPtr, interaction_profile, display_name, toplevel_path, openxr_path, openxr_extension_names, action_type)

}

object OpenXRInteractionProfileMetadata {
  /** Class metadata for Gd[OpenXRInteractionProfileMetadata] lifetime management and casting. */
  given GodotClass[OpenXRInteractionProfileMetadata] with {
    def className = "OpenXRInteractionProfileMetadata"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRInteractionProfileMetadata = new OpenXRInteractionProfileMetadata {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRInteractionProfileMetadata): GodotObject = t.hostObject
  }
}
