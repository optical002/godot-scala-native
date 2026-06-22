package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorExportPreset`, extends `RefCounted`. */
abstract class EditorExportPreset extends RefCounted {

  /** EditorExportPreset.has */
  final def has(property: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("EditorExportPreset", "has", 2619796661L), hostObject.objectPtr, property)

  /** EditorExportPreset.get_customized_files_count */
  final def getCustomizedFilesCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("EditorExportPreset", "get_customized_files_count", 3905245786L), hostObject.objectPtr)

  /** EditorExportPreset.has_export_file */
  final def hasExportFile(path: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("EditorExportPreset", "has_export_file", 2323990056L), hostObject.objectPtr, path)

  /** EditorExportPreset.get_file_export_mode */
  final def getFileExportMode(path: String, default: Long): Long =
    Ptrcall.call2[String, Long, Long](MethodBind.get("EditorExportPreset", "get_file_export_mode", 407825436L), hostObject.objectPtr, path, default)

  /** EditorExportPreset.get_preset_name */
  final def getPresetName(): String =
    Ptrcall.call0[String](MethodBind.get("EditorExportPreset", "get_preset_name", 201670096L), hostObject.objectPtr)

  /** EditorExportPreset.is_runnable */
  final def isRunnable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorExportPreset", "is_runnable", 36873697L), hostObject.objectPtr)

  /** EditorExportPreset.are_advanced_options_enabled */
  final def areAdvancedOptionsEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorExportPreset", "are_advanced_options_enabled", 36873697L), hostObject.objectPtr)

  /** EditorExportPreset.is_dedicated_server */
  final def isDedicatedServer(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorExportPreset", "is_dedicated_server", 36873697L), hostObject.objectPtr)

  /** EditorExportPreset.get_export_filter */
  final def getExportFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("EditorExportPreset", "get_export_filter", 4227045696L), hostObject.objectPtr)

  /** EditorExportPreset.get_include_filter */
  final def getIncludeFilter(): String =
    Ptrcall.call0[String](MethodBind.get("EditorExportPreset", "get_include_filter", 201670096L), hostObject.objectPtr)

  /** EditorExportPreset.get_exclude_filter */
  final def getExcludeFilter(): String =
    Ptrcall.call0[String](MethodBind.get("EditorExportPreset", "get_exclude_filter", 201670096L), hostObject.objectPtr)

  /** EditorExportPreset.get_custom_features */
  final def getCustomFeatures(): String =
    Ptrcall.call0[String](MethodBind.get("EditorExportPreset", "get_custom_features", 201670096L), hostObject.objectPtr)

  /** EditorExportPreset.get_export_path */
  final def getExportPath(): String =
    Ptrcall.call0[String](MethodBind.get("EditorExportPreset", "get_export_path", 201670096L), hostObject.objectPtr)

  /** EditorExportPreset.get_encryption_in_filter */
  final def getEncryptionInFilter(): String =
    Ptrcall.call0[String](MethodBind.get("EditorExportPreset", "get_encryption_in_filter", 201670096L), hostObject.objectPtr)

  /** EditorExportPreset.get_encryption_ex_filter */
  final def getEncryptionExFilter(): String =
    Ptrcall.call0[String](MethodBind.get("EditorExportPreset", "get_encryption_ex_filter", 201670096L), hostObject.objectPtr)

  /** EditorExportPreset.get_encrypt_pck */
  final def getEncryptPck(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorExportPreset", "get_encrypt_pck", 36873697L), hostObject.objectPtr)

  /** EditorExportPreset.get_encrypt_directory */
  final def getEncryptDirectory(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorExportPreset", "get_encrypt_directory", 36873697L), hostObject.objectPtr)

  /** EditorExportPreset.get_encryption_key */
  final def getEncryptionKey(): String =
    Ptrcall.call0[String](MethodBind.get("EditorExportPreset", "get_encryption_key", 201670096L), hostObject.objectPtr)

  /** EditorExportPreset.get_script_export_mode */
  final def getScriptExportMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("EditorExportPreset", "get_script_export_mode", 2835358398L), hostObject.objectPtr)

  /** EditorExportPreset.get_version */
  final def getVersion(name: gdext.builtin.StringName, windows_version: Boolean): String =
    Ptrcall.call2[gdext.builtin.StringName, Boolean, String](MethodBind.get("EditorExportPreset", "get_version", 1132184663L), hostObject.objectPtr, name, windows_version)

}

object EditorExportPreset {
  /** Class metadata for Gd[EditorExportPreset] lifetime management and casting. */
  given GodotClass[EditorExportPreset] with {
    def className = "EditorExportPreset"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorExportPreset = new EditorExportPreset {}.withHost(o.objectPtr)
    def unwrap(t: EditorExportPreset): GodotObject = t.hostObject
  }
}
