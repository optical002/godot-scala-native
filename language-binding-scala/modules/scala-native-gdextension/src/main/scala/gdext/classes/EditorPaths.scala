package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorPaths`, extends `Object`. */
abstract class EditorPaths extends Object {
  override def godotClassName: String = "EditorPaths"

  /** EditorPaths.get_data_dir */
  final def getDataDir(): String = {
    if (gdext.classes.EditorPaths.mb_get_data_dir == null) gdext.classes.EditorPaths.mb_get_data_dir = MethodBind.get("EditorPaths", "get_data_dir", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorPaths.mb_get_data_dir, livePtr)
  }

  /** EditorPaths.get_config_dir */
  final def getConfigDir(): String = {
    if (gdext.classes.EditorPaths.mb_get_config_dir == null) gdext.classes.EditorPaths.mb_get_config_dir = MethodBind.get("EditorPaths", "get_config_dir", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorPaths.mb_get_config_dir, livePtr)
  }

  /** EditorPaths.get_cache_dir */
  final def getCacheDir(): String = {
    if (gdext.classes.EditorPaths.mb_get_cache_dir == null) gdext.classes.EditorPaths.mb_get_cache_dir = MethodBind.get("EditorPaths", "get_cache_dir", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorPaths.mb_get_cache_dir, livePtr)
  }

  /** EditorPaths.is_self_contained */
  final def isSelfContained(): Boolean = {
    if (gdext.classes.EditorPaths.mb_is_self_contained == null) gdext.classes.EditorPaths.mb_is_self_contained = MethodBind.get("EditorPaths", "is_self_contained", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorPaths.mb_is_self_contained, livePtr)
  }

  /** EditorPaths.get_self_contained_file */
  final def getSelfContainedFile(): String = {
    if (gdext.classes.EditorPaths.mb_get_self_contained_file == null) gdext.classes.EditorPaths.mb_get_self_contained_file = MethodBind.get("EditorPaths", "get_self_contained_file", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorPaths.mb_get_self_contained_file, livePtr)
  }

  /** EditorPaths.get_project_settings_dir */
  final def getProjectSettingsDir(): String = {
    if (gdext.classes.EditorPaths.mb_get_project_settings_dir == null) gdext.classes.EditorPaths.mb_get_project_settings_dir = MethodBind.get("EditorPaths", "get_project_settings_dir", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorPaths.mb_get_project_settings_dir, livePtr)
  }

}

object EditorPaths {
  private[classes] var mb_get_data_dir: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_config_dir: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cache_dir: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_self_contained: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_self_contained_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_project_settings_dir: GDExtensionMethodBindPtr = null
}
