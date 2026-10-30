package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorExportPlatformExtension`, extends `EditorExportPlatform`. */
abstract class EditorExportPlatformExtension extends EditorExportPlatform {
  override def godotClassName: String = "EditorExportPlatformExtension"

  /** EditorExportPlatformExtension.set_config_error */
  final def setConfigError(errorText: String): Unit = {
    if (gdext.classes.EditorExportPlatformExtension.mb_set_config_error == null) gdext.classes.EditorExportPlatformExtension.mb_set_config_error = MethodBind.get("EditorExportPlatformExtension", "set_config_error", 3089850668L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlatformExtension.mb_set_config_error, livePtr, errorText)
  }

  /** EditorExportPlatformExtension.get_config_error */
  final def getConfigError(): String = {
    if (gdext.classes.EditorExportPlatformExtension.mb_get_config_error == null) gdext.classes.EditorExportPlatformExtension.mb_get_config_error = MethodBind.get("EditorExportPlatformExtension", "get_config_error", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorExportPlatformExtension.mb_get_config_error, livePtr)
  }

  /** EditorExportPlatformExtension.set_config_missing_templates */
  final def setConfigMissingTemplates(missingTemplates: Boolean): Unit = {
    if (gdext.classes.EditorExportPlatformExtension.mb_set_config_missing_templates == null) gdext.classes.EditorExportPlatformExtension.mb_set_config_missing_templates = MethodBind.get("EditorExportPlatformExtension", "set_config_missing_templates", 1695273946L)
    Ptrcall.callVoid1(gdext.classes.EditorExportPlatformExtension.mb_set_config_missing_templates, livePtr, missingTemplates)
  }

  /** EditorExportPlatformExtension.get_config_missing_templates */
  final def getConfigMissingTemplates(): Boolean = {
    if (gdext.classes.EditorExportPlatformExtension.mb_get_config_missing_templates == null) gdext.classes.EditorExportPlatformExtension.mb_get_config_missing_templates = MethodBind.get("EditorExportPlatformExtension", "get_config_missing_templates", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorExportPlatformExtension.mb_get_config_missing_templates, livePtr)
  }

}

object EditorExportPlatformExtension {
  private[classes] var mb_set_config_error: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_config_error: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_config_missing_templates: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_config_missing_templates: GDExtensionMethodBindPtr = null
}
