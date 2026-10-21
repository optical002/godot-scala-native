package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRInteractionProfileMetadata`, extends `Object`. */
abstract class OpenXRInteractionProfileMetadata extends Object {
  override def godotClassName: String = "OpenXRInteractionProfileMetadata"

  /** OpenXRInteractionProfileMetadata.register_profile_rename */
  final def registerProfileRename(old_name: String, new_name: String): Unit = {
    if (gdext.classes.OpenXRInteractionProfileMetadata.mb_register_profile_rename == null) gdext.classes.OpenXRInteractionProfileMetadata.mb_register_profile_rename = MethodBind.get("OpenXRInteractionProfileMetadata", "register_profile_rename", 3186203200L)
    Ptrcall.callVoid2(gdext.classes.OpenXRInteractionProfileMetadata.mb_register_profile_rename, livePtr, old_name, new_name)
  }

  /** OpenXRInteractionProfileMetadata.register_path_rename */
  final def registerPathRename(old_name: String, new_name: String): Unit = {
    if (gdext.classes.OpenXRInteractionProfileMetadata.mb_register_path_rename == null) gdext.classes.OpenXRInteractionProfileMetadata.mb_register_path_rename = MethodBind.get("OpenXRInteractionProfileMetadata", "register_path_rename", 3186203200L)
    Ptrcall.callVoid2(gdext.classes.OpenXRInteractionProfileMetadata.mb_register_path_rename, livePtr, old_name, new_name)
  }

  /** OpenXRInteractionProfileMetadata.register_top_level_path */
  final def registerTopLevelPath(display_name: String, openxr_path: String, openxr_extension_names: String): Unit = {
    if (gdext.classes.OpenXRInteractionProfileMetadata.mb_register_top_level_path == null) gdext.classes.OpenXRInteractionProfileMetadata.mb_register_top_level_path = MethodBind.get("OpenXRInteractionProfileMetadata", "register_top_level_path", 254767734L)
    Ptrcall.callVoid3(gdext.classes.OpenXRInteractionProfileMetadata.mb_register_top_level_path, livePtr, display_name, openxr_path, openxr_extension_names)
  }

  /** OpenXRInteractionProfileMetadata.register_interaction_profile */
  final def registerInteractionProfile(display_name: String, openxr_path: String, openxr_extension_names: String): Unit = {
    if (gdext.classes.OpenXRInteractionProfileMetadata.mb_register_interaction_profile == null) gdext.classes.OpenXRInteractionProfileMetadata.mb_register_interaction_profile = MethodBind.get("OpenXRInteractionProfileMetadata", "register_interaction_profile", 254767734L)
    Ptrcall.callVoid3(gdext.classes.OpenXRInteractionProfileMetadata.mb_register_interaction_profile, livePtr, display_name, openxr_path, openxr_extension_names)
  }

  /** OpenXRInteractionProfileMetadata.register_io_path */
  final def registerIoPath(interaction_profile: String, display_name: String, toplevel_path: String, openxr_path: String, openxr_extension_names: String, action_type: Long): Unit = {
    if (gdext.classes.OpenXRInteractionProfileMetadata.mb_register_io_path == null) gdext.classes.OpenXRInteractionProfileMetadata.mb_register_io_path = MethodBind.get("OpenXRInteractionProfileMetadata", "register_io_path", 3443511926L)
    Ptrcall.callVoid6(gdext.classes.OpenXRInteractionProfileMetadata.mb_register_io_path, livePtr, interaction_profile, display_name, toplevel_path, openxr_path, openxr_extension_names, action_type)
  }

}

object OpenXRInteractionProfileMetadata {
  private[classes] var mb_register_profile_rename: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_path_rename: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_top_level_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_interaction_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_io_path: GDExtensionMethodBindPtr = null
}
