package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `FileDialog`, extends `ConfirmationDialog`. */
abstract class FileDialog extends ConfirmationDialog {

  /** FileDialog.clear_filters */
  final def clearFilters(): Unit =
    Ptrcall.callVoid0(MethodBind.get("FileDialog", "clear_filters", 3218959716L), hostObject.objectPtr)

  /** FileDialog.add_filter */
  final def addFilter(filter: String, description: String, mime_type: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("FileDialog", "add_filter", 914921954L), hostObject.objectPtr, filter, description, mime_type)

  /** FileDialog.clear_filename_filter */
  final def clearFilenameFilter(): Unit =
    Ptrcall.callVoid0(MethodBind.get("FileDialog", "clear_filename_filter", 3218959716L), hostObject.objectPtr)

  /** FileDialog.set_filename_filter */
  final def setFilenameFilter(filter: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileDialog", "set_filename_filter", 83702148L), hostObject.objectPtr, filter)

  /** FileDialog.get_filename_filter */
  final def getFilenameFilter(): String =
    Ptrcall.call0[String](MethodBind.get("FileDialog", "get_filename_filter", 201670096L), hostObject.objectPtr)

  /** FileDialog.get_option_name */
  final def getOptionName(option: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("FileDialog", "get_option_name", 844755477L), hostObject.objectPtr, option)

  /** FileDialog.get_option_default */
  final def getOptionDefault(option: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("FileDialog", "get_option_default", 923996154L), hostObject.objectPtr, option)

  /** FileDialog.set_option_name */
  final def setOptionName(option: Long, name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("FileDialog", "set_option_name", 501894301L), hostObject.objectPtr, option, name)

  /** FileDialog.set_option_default */
  final def setOptionDefault(option: Long, default_value_index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("FileDialog", "set_option_default", 3937882851L), hostObject.objectPtr, option, default_value_index)

  /** FileDialog.set_option_count */
  final def setOptionCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileDialog", "set_option_count", 1286410249L), hostObject.objectPtr, count)

  /** FileDialog.get_option_count */
  final def getOptionCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("FileDialog", "get_option_count", 3905245786L), hostObject.objectPtr)

  /** FileDialog.get_current_dir */
  final def getCurrentDir(): String =
    Ptrcall.call0[String](MethodBind.get("FileDialog", "get_current_dir", 201670096L), hostObject.objectPtr)

  /** FileDialog.get_current_file */
  final def getCurrentFile(): String =
    Ptrcall.call0[String](MethodBind.get("FileDialog", "get_current_file", 201670096L), hostObject.objectPtr)

  /** FileDialog.get_current_path */
  final def getCurrentPath(): String =
    Ptrcall.call0[String](MethodBind.get("FileDialog", "get_current_path", 201670096L), hostObject.objectPtr)

  /** FileDialog.set_current_dir */
  final def setCurrentDir(dir: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileDialog", "set_current_dir", 83702148L), hostObject.objectPtr, dir)

  /** FileDialog.set_current_file */
  final def setCurrentFile(file: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileDialog", "set_current_file", 83702148L), hostObject.objectPtr, file)

  /** FileDialog.set_current_path */
  final def setCurrentPath(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileDialog", "set_current_path", 83702148L), hostObject.objectPtr, path)

  /** FileDialog.set_mode_overrides_title */
  final def setModeOverridesTitle(`override`: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileDialog", "set_mode_overrides_title", 2586408642L), hostObject.objectPtr, `override`)

  /** FileDialog.is_mode_overriding_title */
  final def isModeOverridingTitle(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FileDialog", "is_mode_overriding_title", 36873697L), hostObject.objectPtr)

  /** FileDialog.set_file_mode */
  final def setFileMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileDialog", "set_file_mode", 3654936397L), hostObject.objectPtr, mode)

  /** FileDialog.get_file_mode */
  final def getFileMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("FileDialog", "get_file_mode", 4074825319L), hostObject.objectPtr)

  /** FileDialog.set_display_mode */
  final def setDisplayMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileDialog", "set_display_mode", 2692197101L), hostObject.objectPtr, mode)

  /** FileDialog.get_display_mode */
  final def getDisplayMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("FileDialog", "get_display_mode", 1092104624L), hostObject.objectPtr)

  /** FileDialog.get_vbox */
  final def getVbox(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("FileDialog", "get_vbox", 915758477L), hostObject.objectPtr)

  /** FileDialog.get_line_edit */
  final def getLineEdit(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("FileDialog", "get_line_edit", 4071694264L), hostObject.objectPtr)

  /** FileDialog.set_access */
  final def setAccess(access: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileDialog", "set_access", 4104413466L), hostObject.objectPtr, access)

  /** FileDialog.get_access */
  final def getAccess(): Long =
    Ptrcall.call0[Long](MethodBind.get("FileDialog", "get_access", 3344081076L), hostObject.objectPtr)

  /** FileDialog.set_root_subfolder */
  final def setRootSubfolder(dir: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileDialog", "set_root_subfolder", 83702148L), hostObject.objectPtr, dir)

  /** FileDialog.get_root_subfolder */
  final def getRootSubfolder(): String =
    Ptrcall.call0[String](MethodBind.get("FileDialog", "get_root_subfolder", 201670096L), hostObject.objectPtr)

  /** FileDialog.set_show_hidden_files */
  final def setShowHiddenFiles(show: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileDialog", "set_show_hidden_files", 2586408642L), hostObject.objectPtr, show)

  /** FileDialog.is_showing_hidden_files */
  final def isShowingHiddenFiles(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FileDialog", "is_showing_hidden_files", 36873697L), hostObject.objectPtr)

  /** FileDialog.set_use_native_dialog */
  final def setUseNativeDialog(native: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileDialog", "set_use_native_dialog", 2586408642L), hostObject.objectPtr, native)

  /** FileDialog.get_use_native_dialog */
  final def getUseNativeDialog(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FileDialog", "get_use_native_dialog", 36873697L), hostObject.objectPtr)

  /** FileDialog.set_customization_flag_enabled */
  final def setCustomizationFlagEnabled(flag: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("FileDialog", "set_customization_flag_enabled", 3849177100L), hostObject.objectPtr, flag, enabled)

  /** FileDialog.is_customization_flag_enabled */
  final def isCustomizationFlagEnabled(flag: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("FileDialog", "is_customization_flag_enabled", 3722277863L), hostObject.objectPtr, flag)

  /** FileDialog.deselect_all */
  final def deselectAll(): Unit =
    Ptrcall.callVoid0(MethodBind.get("FileDialog", "deselect_all", 3218959716L), hostObject.objectPtr)

  /** FileDialog.popup_file_dialog */
  final def popupFileDialog(): Unit =
    Ptrcall.callVoid0(MethodBind.get("FileDialog", "popup_file_dialog", 3218959716L), hostObject.objectPtr)

  /** FileDialog.invalidate */
  final def invalidate(): Unit =
    Ptrcall.callVoid0(MethodBind.get("FileDialog", "invalidate", 3218959716L), hostObject.objectPtr)

}

object FileDialog {
  /** Class metadata for Gd[FileDialog] lifetime management and casting. */
  given GodotClass[FileDialog] with {
    def className = "FileDialog"
    def isRefCounted = false
    def wrap(o: GodotObject): FileDialog = new FileDialog {}.withHost(o.objectPtr)
    def unwrap(t: FileDialog): GodotObject = t.hostObject
  }
}
