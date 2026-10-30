package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `FileDialog`, extends `ConfirmationDialog`. */
abstract class FileDialog extends ConfirmationDialog {
  override def godotClassName: String = "FileDialog"

  /** FileDialog.clear_filters */
  final def clearFilters(): Unit = {
    if (gdext.classes.FileDialog.mb_clear_filters == null) gdext.classes.FileDialog.mb_clear_filters = MethodBind.get("FileDialog", "clear_filters", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.FileDialog.mb_clear_filters, livePtr)
  }

  /** FileDialog.add_filter */
  final def addFilter(filter: String, description: String = "", mimeType: String = ""): Unit = {
    if (gdext.classes.FileDialog.mb_add_filter == null) gdext.classes.FileDialog.mb_add_filter = MethodBind.get("FileDialog", "add_filter", 914921954L)
    Ptrcall.callVoid3(gdext.classes.FileDialog.mb_add_filter, livePtr, filter, description, mimeType)
  }

  /** FileDialog.clear_filename_filter */
  final def clearFilenameFilter(): Unit = {
    if (gdext.classes.FileDialog.mb_clear_filename_filter == null) gdext.classes.FileDialog.mb_clear_filename_filter = MethodBind.get("FileDialog", "clear_filename_filter", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.FileDialog.mb_clear_filename_filter, livePtr)
  }

  /** FileDialog.set_filename_filter */
  final def setFilenameFilter(filter: String): Unit = {
    if (gdext.classes.FileDialog.mb_set_filename_filter == null) gdext.classes.FileDialog.mb_set_filename_filter = MethodBind.get("FileDialog", "set_filename_filter", 83702148L)
    Ptrcall.callVoid1(gdext.classes.FileDialog.mb_set_filename_filter, livePtr, filter)
  }

  /** FileDialog.get_filename_filter */
  final def getFilenameFilter(): String = {
    if (gdext.classes.FileDialog.mb_get_filename_filter == null) gdext.classes.FileDialog.mb_get_filename_filter = MethodBind.get("FileDialog", "get_filename_filter", 201670096L)
    Ptrcall.call0[String](gdext.classes.FileDialog.mb_get_filename_filter, livePtr)
  }

  /** FileDialog.get_option_name */
  final def getOptionName(option: Long): String = {
    if (gdext.classes.FileDialog.mb_get_option_name == null) gdext.classes.FileDialog.mb_get_option_name = MethodBind.get("FileDialog", "get_option_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.FileDialog.mb_get_option_name, livePtr, option)
  }

  /** FileDialog.get_option_default */
  final def getOptionDefault(option: Long): Long = {
    if (gdext.classes.FileDialog.mb_get_option_default == null) gdext.classes.FileDialog.mb_get_option_default = MethodBind.get("FileDialog", "get_option_default", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.FileDialog.mb_get_option_default, livePtr, option)
  }

  /** FileDialog.set_option_name */
  final def setOptionName(option: Long, name: String): Unit = {
    if (gdext.classes.FileDialog.mb_set_option_name == null) gdext.classes.FileDialog.mb_set_option_name = MethodBind.get("FileDialog", "set_option_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.FileDialog.mb_set_option_name, livePtr, option, name)
  }

  /** FileDialog.set_option_default */
  final def setOptionDefault(option: Long, defaultValueIndex: Long): Unit = {
    if (gdext.classes.FileDialog.mb_set_option_default == null) gdext.classes.FileDialog.mb_set_option_default = MethodBind.get("FileDialog", "set_option_default", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.FileDialog.mb_set_option_default, livePtr, option, defaultValueIndex)
  }

  /** FileDialog.set_option_count */
  final def setOptionCount(count: Long): Unit = {
    if (gdext.classes.FileDialog.mb_set_option_count == null) gdext.classes.FileDialog.mb_set_option_count = MethodBind.get("FileDialog", "set_option_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.FileDialog.mb_set_option_count, livePtr, count)
  }

  /** FileDialog.get_option_count */
  final def getOptionCount(): Long = {
    if (gdext.classes.FileDialog.mb_get_option_count == null) gdext.classes.FileDialog.mb_get_option_count = MethodBind.get("FileDialog", "get_option_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FileDialog.mb_get_option_count, livePtr)
  }

  /** FileDialog.get_current_dir */
  final def getCurrentDir(): String = {
    if (gdext.classes.FileDialog.mb_get_current_dir == null) gdext.classes.FileDialog.mb_get_current_dir = MethodBind.get("FileDialog", "get_current_dir", 201670096L)
    Ptrcall.call0[String](gdext.classes.FileDialog.mb_get_current_dir, livePtr)
  }

  /** FileDialog.get_current_file */
  final def getCurrentFile(): String = {
    if (gdext.classes.FileDialog.mb_get_current_file == null) gdext.classes.FileDialog.mb_get_current_file = MethodBind.get("FileDialog", "get_current_file", 201670096L)
    Ptrcall.call0[String](gdext.classes.FileDialog.mb_get_current_file, livePtr)
  }

  /** FileDialog.get_current_path */
  final def getCurrentPath(): String = {
    if (gdext.classes.FileDialog.mb_get_current_path == null) gdext.classes.FileDialog.mb_get_current_path = MethodBind.get("FileDialog", "get_current_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.FileDialog.mb_get_current_path, livePtr)
  }

  /** FileDialog.set_current_dir */
  final def setCurrentDir(dir: String): Unit = {
    if (gdext.classes.FileDialog.mb_set_current_dir == null) gdext.classes.FileDialog.mb_set_current_dir = MethodBind.get("FileDialog", "set_current_dir", 83702148L)
    Ptrcall.callVoid1(gdext.classes.FileDialog.mb_set_current_dir, livePtr, dir)
  }

  /** FileDialog.set_current_file */
  final def setCurrentFile(file: String): Unit = {
    if (gdext.classes.FileDialog.mb_set_current_file == null) gdext.classes.FileDialog.mb_set_current_file = MethodBind.get("FileDialog", "set_current_file", 83702148L)
    Ptrcall.callVoid1(gdext.classes.FileDialog.mb_set_current_file, livePtr, file)
  }

  /** FileDialog.set_current_path */
  final def setCurrentPath(path: String): Unit = {
    if (gdext.classes.FileDialog.mb_set_current_path == null) gdext.classes.FileDialog.mb_set_current_path = MethodBind.get("FileDialog", "set_current_path", 83702148L)
    Ptrcall.callVoid1(gdext.classes.FileDialog.mb_set_current_path, livePtr, path)
  }

  /** FileDialog.set_mode_overrides_title */
  final def setModeOverridesTitle(`override`: Boolean): Unit = {
    if (gdext.classes.FileDialog.mb_set_mode_overrides_title == null) gdext.classes.FileDialog.mb_set_mode_overrides_title = MethodBind.get("FileDialog", "set_mode_overrides_title", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FileDialog.mb_set_mode_overrides_title, livePtr, `override`)
  }

  /** FileDialog.is_mode_overriding_title */
  final def isModeOverridingTitle(): Boolean = {
    if (gdext.classes.FileDialog.mb_is_mode_overriding_title == null) gdext.classes.FileDialog.mb_is_mode_overriding_title = MethodBind.get("FileDialog", "is_mode_overriding_title", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FileDialog.mb_is_mode_overriding_title, livePtr)
  }

  /** FileDialog.set_file_mode */
  final def setFileMode(mode: gdext.classes.FileDialog.FileMode): Unit = {
    if (gdext.classes.FileDialog.mb_set_file_mode == null) gdext.classes.FileDialog.mb_set_file_mode = MethodBind.get("FileDialog", "set_file_mode", 3654936397L)
    Ptrcall.callVoid1(gdext.classes.FileDialog.mb_set_file_mode, livePtr, mode)
  }

  /** FileDialog.get_file_mode */
  final def getFileMode(): gdext.classes.FileDialog.FileMode = {
    if (gdext.classes.FileDialog.mb_get_file_mode == null) gdext.classes.FileDialog.mb_get_file_mode = MethodBind.get("FileDialog", "get_file_mode", 4074825319L)
    gdext.classes.FileDialog.FileMode(Ptrcall.call0[Long](gdext.classes.FileDialog.mb_get_file_mode, livePtr))
  }

  /** FileDialog.set_display_mode */
  final def setDisplayMode(mode: gdext.classes.FileDialog.DisplayMode): Unit = {
    if (gdext.classes.FileDialog.mb_set_display_mode == null) gdext.classes.FileDialog.mb_set_display_mode = MethodBind.get("FileDialog", "set_display_mode", 2692197101L)
    Ptrcall.callVoid1(gdext.classes.FileDialog.mb_set_display_mode, livePtr, mode)
  }

  /** FileDialog.get_display_mode */
  final def getDisplayMode(): gdext.classes.FileDialog.DisplayMode = {
    if (gdext.classes.FileDialog.mb_get_display_mode == null) gdext.classes.FileDialog.mb_get_display_mode = MethodBind.get("FileDialog", "get_display_mode", 1092104624L)
    gdext.classes.FileDialog.DisplayMode(Ptrcall.call0[Long](gdext.classes.FileDialog.mb_get_display_mode, livePtr))
  }

  /** FileDialog.get_vbox */
  final def getVbox(): VBoxContainer = {
    if (gdext.classes.FileDialog.mb_get_vbox == null) gdext.classes.FileDialog.mb_get_vbox = MethodBind.get("FileDialog", "get_vbox", 915758477L)
    Wrappers.borrowed[VBoxContainer](Ptrcall.call0[Long](gdext.classes.FileDialog.mb_get_vbox, livePtr))
  }

  /** FileDialog.get_line_edit */
  final def getLineEdit(): LineEdit = {
    if (gdext.classes.FileDialog.mb_get_line_edit == null) gdext.classes.FileDialog.mb_get_line_edit = MethodBind.get("FileDialog", "get_line_edit", 4071694264L)
    Wrappers.borrowed[LineEdit](Ptrcall.call0[Long](gdext.classes.FileDialog.mb_get_line_edit, livePtr))
  }

  /** FileDialog.set_access */
  final def setAccess(access: gdext.classes.FileDialog.Access): Unit = {
    if (gdext.classes.FileDialog.mb_set_access == null) gdext.classes.FileDialog.mb_set_access = MethodBind.get("FileDialog", "set_access", 4104413466L)
    Ptrcall.callVoid1(gdext.classes.FileDialog.mb_set_access, livePtr, access)
  }

  /** FileDialog.get_access */
  final def getAccess(): gdext.classes.FileDialog.Access = {
    if (gdext.classes.FileDialog.mb_get_access == null) gdext.classes.FileDialog.mb_get_access = MethodBind.get("FileDialog", "get_access", 3344081076L)
    gdext.classes.FileDialog.Access(Ptrcall.call0[Long](gdext.classes.FileDialog.mb_get_access, livePtr))
  }

  /** FileDialog.set_root_subfolder */
  final def setRootSubfolder(dir: String): Unit = {
    if (gdext.classes.FileDialog.mb_set_root_subfolder == null) gdext.classes.FileDialog.mb_set_root_subfolder = MethodBind.get("FileDialog", "set_root_subfolder", 83702148L)
    Ptrcall.callVoid1(gdext.classes.FileDialog.mb_set_root_subfolder, livePtr, dir)
  }

  /** FileDialog.get_root_subfolder */
  final def getRootSubfolder(): String = {
    if (gdext.classes.FileDialog.mb_get_root_subfolder == null) gdext.classes.FileDialog.mb_get_root_subfolder = MethodBind.get("FileDialog", "get_root_subfolder", 201670096L)
    Ptrcall.call0[String](gdext.classes.FileDialog.mb_get_root_subfolder, livePtr)
  }

  /** FileDialog.set_show_hidden_files */
  final def setShowHiddenFiles(show: Boolean): Unit = {
    if (gdext.classes.FileDialog.mb_set_show_hidden_files == null) gdext.classes.FileDialog.mb_set_show_hidden_files = MethodBind.get("FileDialog", "set_show_hidden_files", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FileDialog.mb_set_show_hidden_files, livePtr, show)
  }

  /** FileDialog.is_showing_hidden_files */
  final def isShowingHiddenFiles(): Boolean = {
    if (gdext.classes.FileDialog.mb_is_showing_hidden_files == null) gdext.classes.FileDialog.mb_is_showing_hidden_files = MethodBind.get("FileDialog", "is_showing_hidden_files", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FileDialog.mb_is_showing_hidden_files, livePtr)
  }

  /** FileDialog.set_use_native_dialog */
  final def setUseNativeDialog(native: Boolean): Unit = {
    if (gdext.classes.FileDialog.mb_set_use_native_dialog == null) gdext.classes.FileDialog.mb_set_use_native_dialog = MethodBind.get("FileDialog", "set_use_native_dialog", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FileDialog.mb_set_use_native_dialog, livePtr, native)
  }

  /** FileDialog.get_use_native_dialog */
  final def getUseNativeDialog(): Boolean = {
    if (gdext.classes.FileDialog.mb_get_use_native_dialog == null) gdext.classes.FileDialog.mb_get_use_native_dialog = MethodBind.get("FileDialog", "get_use_native_dialog", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FileDialog.mb_get_use_native_dialog, livePtr)
  }

  /** FileDialog.set_customization_flag_enabled */
  final def setCustomizationFlagEnabled(flag: gdext.classes.FileDialog.Customization, enabled: Boolean): Unit = {
    if (gdext.classes.FileDialog.mb_set_customization_flag_enabled == null) gdext.classes.FileDialog.mb_set_customization_flag_enabled = MethodBind.get("FileDialog", "set_customization_flag_enabled", 3849177100L)
    Ptrcall.callVoid2(gdext.classes.FileDialog.mb_set_customization_flag_enabled, livePtr, flag, enabled)
  }

  /** FileDialog.is_customization_flag_enabled */
  final def isCustomizationFlagEnabled(flag: gdext.classes.FileDialog.Customization): Boolean = {
    if (gdext.classes.FileDialog.mb_is_customization_flag_enabled == null) gdext.classes.FileDialog.mb_is_customization_flag_enabled = MethodBind.get("FileDialog", "is_customization_flag_enabled", 3722277863L)
    Ptrcall.call1[Long, Boolean](gdext.classes.FileDialog.mb_is_customization_flag_enabled, livePtr, flag)
  }

  /** FileDialog.deselect_all */
  final def deselectAll(): Unit = {
    if (gdext.classes.FileDialog.mb_deselect_all == null) gdext.classes.FileDialog.mb_deselect_all = MethodBind.get("FileDialog", "deselect_all", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.FileDialog.mb_deselect_all, livePtr)
  }

  /** FileDialog.popup_file_dialog */
  final def popupFileDialog(): Unit = {
    if (gdext.classes.FileDialog.mb_popup_file_dialog == null) gdext.classes.FileDialog.mb_popup_file_dialog = MethodBind.get("FileDialog", "popup_file_dialog", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.FileDialog.mb_popup_file_dialog, livePtr)
  }

  /** FileDialog.invalidate */
  final def invalidate(): Unit = {
    if (gdext.classes.FileDialog.mb_invalidate == null) gdext.classes.FileDialog.mb_invalidate = MethodBind.get("FileDialog", "invalidate", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.FileDialog.mb_invalidate, livePtr)
  }

}

object FileDialog {
  private[classes] var mb_clear_filters: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_filename_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_filename_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_filename_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_option_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_option_default: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_option_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_option_default: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_option_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_option_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_dir: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_current_dir: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_current_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_current_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mode_overrides_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_mode_overriding_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_file_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_file_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_display_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_display_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vbox: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_edit: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_access: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_access: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_root_subfolder: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_subfolder: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_show_hidden_files: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_showing_hidden_files: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_native_dialog: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_native_dialog: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_customization_flag_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_customization_flag_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_deselect_all: GDExtensionMethodBindPtr = null
  private[classes] var mb_popup_file_dialog: GDExtensionMethodBindPtr = null
  private[classes] var mb_invalidate: GDExtensionMethodBindPtr = null

  /** Godot enum `FileDialog.FileMode`. */
  opaque type FileMode <: Long = Long

  object FileMode {
    final val OpenFile: FileMode = 0L.asInstanceOf[FileMode]
    final val OpenFiles: FileMode = 1L.asInstanceOf[FileMode]
    final val OpenDir: FileMode = 2L.asInstanceOf[FileMode]
    final val OpenAny: FileMode = 3L.asInstanceOf[FileMode]
    final val SaveFile: FileMode = 4L.asInstanceOf[FileMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FileMode = value.asInstanceOf[FileMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FileMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[FileMode]]

    extension (self: FileMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "OpenFile"
        case 1L => "OpenFiles"
        case 2L => "OpenDir"
        case 3L => "OpenAny"
        case 4L => "SaveFile"
        case other => other.toString
      }
  }

  /** Godot enum `FileDialog.Access`. */
  opaque type Access <: Long = Long

  object Access {
    final val Resources: Access = 0L.asInstanceOf[Access]
    final val Userdata: Access = 1L.asInstanceOf[Access]
    final val Filesystem: Access = 2L.asInstanceOf[Access]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Access = value.asInstanceOf[Access]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Access] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[Access]]

    extension (self: Access)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Resources"
        case 1L => "Userdata"
        case 2L => "Filesystem"
        case other => other.toString
      }
  }

  /** Godot enum `FileDialog.DisplayMode`. */
  opaque type DisplayMode <: Long = Long

  object DisplayMode {
    final val Thumbnails: DisplayMode = 0L.asInstanceOf[DisplayMode]
    final val List: DisplayMode = 1L.asInstanceOf[DisplayMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DisplayMode = value.asInstanceOf[DisplayMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DisplayMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[DisplayMode]]

    extension (self: DisplayMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Thumbnails"
        case 1L => "List"
        case other => other.toString
      }
  }

  /** Godot enum `FileDialog.Customization`. */
  opaque type Customization <: Long = Long

  object Customization {
    final val HiddenFiles: Customization = 0L.asInstanceOf[Customization]
    final val CreateFolder: Customization = 1L.asInstanceOf[Customization]
    final val FileFilter: Customization = 2L.asInstanceOf[Customization]
    final val FileSort: Customization = 3L.asInstanceOf[Customization]
    final val Favorites: Customization = 4L.asInstanceOf[Customization]
    final val Recent: Customization = 5L.asInstanceOf[Customization]
    final val Layout: Customization = 6L.asInstanceOf[Customization]
    final val OverwriteWarning: Customization = 7L.asInstanceOf[Customization]
    final val Delete: Customization = 8L.asInstanceOf[Customization]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Customization = value.asInstanceOf[Customization]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Customization] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L).asInstanceOf[scala.IArray[Customization]]

    extension (self: Customization)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "HiddenFiles"
        case 1L => "CreateFolder"
        case 2L => "FileFilter"
        case 3L => "FileSort"
        case 4L => "Favorites"
        case 5L => "Recent"
        case 6L => "Layout"
        case 7L => "OverwriteWarning"
        case 8L => "Delete"
        case other => other.toString
      }
  }
}
