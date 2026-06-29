package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorPaths`, extends `Object`. */
abstract class EditorPaths extends Object {
  override def godotClassName: String = "EditorPaths"

  /** EditorPaths.get_data_dir */
  final def getDataDir(): String =
    Ptrcall.call0[String](MethodBind.get("EditorPaths", "get_data_dir", 201670096L), hostObject.objectPtr)

  /** EditorPaths.get_config_dir */
  final def getConfigDir(): String =
    Ptrcall.call0[String](MethodBind.get("EditorPaths", "get_config_dir", 201670096L), hostObject.objectPtr)

  /** EditorPaths.get_cache_dir */
  final def getCacheDir(): String =
    Ptrcall.call0[String](MethodBind.get("EditorPaths", "get_cache_dir", 201670096L), hostObject.objectPtr)

  /** EditorPaths.is_self_contained */
  final def isSelfContained(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorPaths", "is_self_contained", 36873697L), hostObject.objectPtr)

  /** EditorPaths.get_self_contained_file */
  final def getSelfContainedFile(): String =
    Ptrcall.call0[String](MethodBind.get("EditorPaths", "get_self_contained_file", 201670096L), hostObject.objectPtr)

  /** EditorPaths.get_project_settings_dir */
  final def getProjectSettingsDir(): String =
    Ptrcall.call0[String](MethodBind.get("EditorPaths", "get_project_settings_dir", 201670096L), hostObject.objectPtr)

}
