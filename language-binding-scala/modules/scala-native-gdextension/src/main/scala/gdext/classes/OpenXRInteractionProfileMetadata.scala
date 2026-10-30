package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRInteractionProfileMetadata`, extends `Object`. */
abstract class OpenXRInteractionProfileMetadata extends Object {
  override def godotClassName: String = "OpenXRInteractionProfileMetadata"

  /** OpenXRInteractionProfileMetadata.register_profile_rename */
  final def registerProfileRename(oldName: String, newName: String): Unit = {
    if (gdext.classes.OpenXRInteractionProfileMetadata.mb_register_profile_rename == null) gdext.classes.OpenXRInteractionProfileMetadata.mb_register_profile_rename = MethodBind.get("OpenXRInteractionProfileMetadata", "register_profile_rename", 3186203200L)
    Ptrcall.callVoid2(gdext.classes.OpenXRInteractionProfileMetadata.mb_register_profile_rename, livePtr, oldName, newName)
  }

  /** OpenXRInteractionProfileMetadata.register_path_rename */
  final def registerPathRename(oldName: String, newName: String): Unit = {
    if (gdext.classes.OpenXRInteractionProfileMetadata.mb_register_path_rename == null) gdext.classes.OpenXRInteractionProfileMetadata.mb_register_path_rename = MethodBind.get("OpenXRInteractionProfileMetadata", "register_path_rename", 3186203200L)
    Ptrcall.callVoid2(gdext.classes.OpenXRInteractionProfileMetadata.mb_register_path_rename, livePtr, oldName, newName)
  }

  /** OpenXRInteractionProfileMetadata.register_top_level_path */
  final def registerTopLevelPath(displayName: String, openxrPath: String, openxrExtensionNames: String): Unit = {
    if (gdext.classes.OpenXRInteractionProfileMetadata.mb_register_top_level_path == null) gdext.classes.OpenXRInteractionProfileMetadata.mb_register_top_level_path = MethodBind.get("OpenXRInteractionProfileMetadata", "register_top_level_path", 254767734L)
    Ptrcall.callVoid3(gdext.classes.OpenXRInteractionProfileMetadata.mb_register_top_level_path, livePtr, displayName, openxrPath, openxrExtensionNames)
  }

  /** OpenXRInteractionProfileMetadata.register_interaction_profile */
  final def registerInteractionProfile(displayName: String, openxrPath: String, openxrExtensionNames: String): Unit = {
    if (gdext.classes.OpenXRInteractionProfileMetadata.mb_register_interaction_profile == null) gdext.classes.OpenXRInteractionProfileMetadata.mb_register_interaction_profile = MethodBind.get("OpenXRInteractionProfileMetadata", "register_interaction_profile", 254767734L)
    Ptrcall.callVoid3(gdext.classes.OpenXRInteractionProfileMetadata.mb_register_interaction_profile, livePtr, displayName, openxrPath, openxrExtensionNames)
  }

  /** OpenXRInteractionProfileMetadata.register_io_path */
  final def registerIoPath(interactionProfile: String, displayName: String, toplevelPath: String, openxrPath: String, openxrExtensionNames: String, actionType: gdext.classes.OpenXRAction.ActionType): Unit = {
    if (gdext.classes.OpenXRInteractionProfileMetadata.mb_register_io_path == null) gdext.classes.OpenXRInteractionProfileMetadata.mb_register_io_path = MethodBind.get("OpenXRInteractionProfileMetadata", "register_io_path", 3443511926L)
    Ptrcall.callVoid6(gdext.classes.OpenXRInteractionProfileMetadata.mb_register_io_path, livePtr, interactionProfile, displayName, toplevelPath, openxrPath, openxrExtensionNames, actionType)
  }

}

object OpenXRInteractionProfileMetadata {
  private[classes] var mb_register_profile_rename: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_path_rename: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_top_level_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_interaction_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_io_path: GDExtensionMethodBindPtr = null
}
