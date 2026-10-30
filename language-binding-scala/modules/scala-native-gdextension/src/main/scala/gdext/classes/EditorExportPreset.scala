package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorExportPreset`, extends `RefCounted`. */
abstract class EditorExportPreset extends RefCounted {
  override def godotClassName: String = "EditorExportPreset"

  /** EditorExportPreset.has */
  final def has(property: String): Boolean = {
    if (gdext.classes.EditorExportPreset.mb_has == null) gdext.classes.EditorExportPreset.mb_has = MethodBind.get("EditorExportPreset", "has", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.EditorExportPreset.mb_has, livePtr, SnArg(property))
  }

  /** EditorExportPreset.get_customized_files_count */
  final def getCustomizedFilesCount(): Long = {
    if (gdext.classes.EditorExportPreset.mb_get_customized_files_count == null) gdext.classes.EditorExportPreset.mb_get_customized_files_count = MethodBind.get("EditorExportPreset", "get_customized_files_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.EditorExportPreset.mb_get_customized_files_count, livePtr)
  }

  /** EditorExportPreset.has_export_file */
  final def hasExportFile(path: String): Boolean = {
    if (gdext.classes.EditorExportPreset.mb_has_export_file == null) gdext.classes.EditorExportPreset.mb_has_export_file = MethodBind.get("EditorExportPreset", "has_export_file", 2323990056L)
    Ptrcall.call1[String, Boolean](gdext.classes.EditorExportPreset.mb_has_export_file, livePtr, path)
  }

  /** EditorExportPreset.get_file_export_mode */
  final def getFileExportMode(path: String, default: gdext.classes.EditorExportPreset.FileExportMode = gdext.classes.EditorExportPreset.FileExportMode(0L)): gdext.classes.EditorExportPreset.FileExportMode = {
    if (gdext.classes.EditorExportPreset.mb_get_file_export_mode == null) gdext.classes.EditorExportPreset.mb_get_file_export_mode = MethodBind.get("EditorExportPreset", "get_file_export_mode", 407825436L)
    gdext.classes.EditorExportPreset.FileExportMode(Ptrcall.call2[String, Long, Long](gdext.classes.EditorExportPreset.mb_get_file_export_mode, livePtr, path, default))
  }

  /** EditorExportPreset.get_preset_name */
  final def getPresetName(): String = {
    if (gdext.classes.EditorExportPreset.mb_get_preset_name == null) gdext.classes.EditorExportPreset.mb_get_preset_name = MethodBind.get("EditorExportPreset", "get_preset_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorExportPreset.mb_get_preset_name, livePtr)
  }

  /** EditorExportPreset.is_runnable */
  final def isRunnable(): Boolean = {
    if (gdext.classes.EditorExportPreset.mb_is_runnable == null) gdext.classes.EditorExportPreset.mb_is_runnable = MethodBind.get("EditorExportPreset", "is_runnable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorExportPreset.mb_is_runnable, livePtr)
  }

  /** EditorExportPreset.are_advanced_options_enabled */
  final def areAdvancedOptionsEnabled(): Boolean = {
    if (gdext.classes.EditorExportPreset.mb_are_advanced_options_enabled == null) gdext.classes.EditorExportPreset.mb_are_advanced_options_enabled = MethodBind.get("EditorExportPreset", "are_advanced_options_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorExportPreset.mb_are_advanced_options_enabled, livePtr)
  }

  /** EditorExportPreset.is_dedicated_server */
  final def isDedicatedServer(): Boolean = {
    if (gdext.classes.EditorExportPreset.mb_is_dedicated_server == null) gdext.classes.EditorExportPreset.mb_is_dedicated_server = MethodBind.get("EditorExportPreset", "is_dedicated_server", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorExportPreset.mb_is_dedicated_server, livePtr)
  }

  /** EditorExportPreset.get_export_filter */
  final def getExportFilter(): gdext.classes.EditorExportPreset.ExportFilter = {
    if (gdext.classes.EditorExportPreset.mb_get_export_filter == null) gdext.classes.EditorExportPreset.mb_get_export_filter = MethodBind.get("EditorExportPreset", "get_export_filter", 4227045696L)
    gdext.classes.EditorExportPreset.ExportFilter(Ptrcall.call0[Long](gdext.classes.EditorExportPreset.mb_get_export_filter, livePtr))
  }

  /** EditorExportPreset.get_include_filter */
  final def getIncludeFilter(): String = {
    if (gdext.classes.EditorExportPreset.mb_get_include_filter == null) gdext.classes.EditorExportPreset.mb_get_include_filter = MethodBind.get("EditorExportPreset", "get_include_filter", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorExportPreset.mb_get_include_filter, livePtr)
  }

  /** EditorExportPreset.get_exclude_filter */
  final def getExcludeFilter(): String = {
    if (gdext.classes.EditorExportPreset.mb_get_exclude_filter == null) gdext.classes.EditorExportPreset.mb_get_exclude_filter = MethodBind.get("EditorExportPreset", "get_exclude_filter", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorExportPreset.mb_get_exclude_filter, livePtr)
  }

  /** EditorExportPreset.get_custom_features */
  final def getCustomFeatures(): String = {
    if (gdext.classes.EditorExportPreset.mb_get_custom_features == null) gdext.classes.EditorExportPreset.mb_get_custom_features = MethodBind.get("EditorExportPreset", "get_custom_features", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorExportPreset.mb_get_custom_features, livePtr)
  }

  /** EditorExportPreset.get_export_path */
  final def getExportPath(): String = {
    if (gdext.classes.EditorExportPreset.mb_get_export_path == null) gdext.classes.EditorExportPreset.mb_get_export_path = MethodBind.get("EditorExportPreset", "get_export_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorExportPreset.mb_get_export_path, livePtr)
  }

  /** EditorExportPreset.get_encryption_in_filter */
  final def getEncryptionInFilter(): String = {
    if (gdext.classes.EditorExportPreset.mb_get_encryption_in_filter == null) gdext.classes.EditorExportPreset.mb_get_encryption_in_filter = MethodBind.get("EditorExportPreset", "get_encryption_in_filter", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorExportPreset.mb_get_encryption_in_filter, livePtr)
  }

  /** EditorExportPreset.get_encryption_ex_filter */
  final def getEncryptionExFilter(): String = {
    if (gdext.classes.EditorExportPreset.mb_get_encryption_ex_filter == null) gdext.classes.EditorExportPreset.mb_get_encryption_ex_filter = MethodBind.get("EditorExportPreset", "get_encryption_ex_filter", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorExportPreset.mb_get_encryption_ex_filter, livePtr)
  }

  /** EditorExportPreset.get_encrypt_pck */
  final def getEncryptPck(): Boolean = {
    if (gdext.classes.EditorExportPreset.mb_get_encrypt_pck == null) gdext.classes.EditorExportPreset.mb_get_encrypt_pck = MethodBind.get("EditorExportPreset", "get_encrypt_pck", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorExportPreset.mb_get_encrypt_pck, livePtr)
  }

  /** EditorExportPreset.get_encrypt_directory */
  final def getEncryptDirectory(): Boolean = {
    if (gdext.classes.EditorExportPreset.mb_get_encrypt_directory == null) gdext.classes.EditorExportPreset.mb_get_encrypt_directory = MethodBind.get("EditorExportPreset", "get_encrypt_directory", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorExportPreset.mb_get_encrypt_directory, livePtr)
  }

  /** EditorExportPreset.get_encryption_key */
  final def getEncryptionKey(): String = {
    if (gdext.classes.EditorExportPreset.mb_get_encryption_key == null) gdext.classes.EditorExportPreset.mb_get_encryption_key = MethodBind.get("EditorExportPreset", "get_encryption_key", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorExportPreset.mb_get_encryption_key, livePtr)
  }

  /** EditorExportPreset.get_script_export_mode */
  final def getScriptExportMode(): gdext.classes.EditorExportPreset.ScriptExportMode = {
    if (gdext.classes.EditorExportPreset.mb_get_script_export_mode == null) gdext.classes.EditorExportPreset.mb_get_script_export_mode = MethodBind.get("EditorExportPreset", "get_script_export_mode", 2835358398L)
    gdext.classes.EditorExportPreset.ScriptExportMode(Ptrcall.call0[Long](gdext.classes.EditorExportPreset.mb_get_script_export_mode, livePtr))
  }

  /** EditorExportPreset.get_version */
  final def getVersion(name: String, windowsVersion: Boolean): String = {
    if (gdext.classes.EditorExportPreset.mb_get_version == null) gdext.classes.EditorExportPreset.mb_get_version = MethodBind.get("EditorExportPreset", "get_version", 1132184663L)
    Ptrcall.call2[SnArg, Boolean, String](gdext.classes.EditorExportPreset.mb_get_version, livePtr, SnArg(name), windowsVersion)
  }

}

object EditorExportPreset {
  private[classes] var mb_has: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_customized_files_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_export_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_file_export_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_preset_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_runnable: GDExtensionMethodBindPtr = null
  private[classes] var mb_are_advanced_options_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_dedicated_server: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_export_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_include_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_exclude_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_features: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_export_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_encryption_in_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_encryption_ex_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_encrypt_pck: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_encrypt_directory: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_encryption_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_script_export_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_version: GDExtensionMethodBindPtr = null

  /** Godot enum `EditorExportPreset.ExportFilter`. */
  opaque type ExportFilter <: Long = Long

  object ExportFilter {
    final val ExportAllResources: ExportFilter = 0L.asInstanceOf[ExportFilter]
    final val ExportSelectedScenes: ExportFilter = 1L.asInstanceOf[ExportFilter]
    final val ExportSelectedResources: ExportFilter = 2L.asInstanceOf[ExportFilter]
    final val ExcludeSelectedResources: ExportFilter = 3L.asInstanceOf[ExportFilter]
    final val ExportCustomized: ExportFilter = 4L.asInstanceOf[ExportFilter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ExportFilter = value.asInstanceOf[ExportFilter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ExportFilter] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[ExportFilter]]

    extension (self: ExportFilter)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "ExportAllResources"
        case 1L => "ExportSelectedScenes"
        case 2L => "ExportSelectedResources"
        case 3L => "ExcludeSelectedResources"
        case 4L => "ExportCustomized"
        case other => other.toString
      }
  }

  /** Godot enum `EditorExportPreset.FileExportMode`. */
  opaque type FileExportMode <: Long = Long

  object FileExportMode {
    final val NotCustomized: FileExportMode = 0L.asInstanceOf[FileExportMode]
    final val Strip: FileExportMode = 1L.asInstanceOf[FileExportMode]
    final val Keep: FileExportMode = 2L.asInstanceOf[FileExportMode]
    final val Remove: FileExportMode = 3L.asInstanceOf[FileExportMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FileExportMode = value.asInstanceOf[FileExportMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FileExportMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[FileExportMode]]

    extension (self: FileExportMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "NotCustomized"
        case 1L => "Strip"
        case 2L => "Keep"
        case 3L => "Remove"
        case other => other.toString
      }
  }

  /** Godot enum `EditorExportPreset.ScriptExportMode`. */
  opaque type ScriptExportMode <: Long = Long

  object ScriptExportMode {
    final val Text: ScriptExportMode = 0L.asInstanceOf[ScriptExportMode]
    final val BinaryTokens: ScriptExportMode = 1L.asInstanceOf[ScriptExportMode]
    final val BinaryTokensCompressed: ScriptExportMode = 2L.asInstanceOf[ScriptExportMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ScriptExportMode = value.asInstanceOf[ScriptExportMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ScriptExportMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ScriptExportMode]]

    extension (self: ScriptExportMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Text"
        case 1L => "BinaryTokens"
        case 2L => "BinaryTokensCompressed"
        case other => other.toString
      }
  }
}
