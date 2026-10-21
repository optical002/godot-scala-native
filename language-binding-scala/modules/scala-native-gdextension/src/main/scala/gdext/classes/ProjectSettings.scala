package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ProjectSettings`, extends `Object`. */
abstract class ProjectSettings extends Object {
  override def godotClassName: String = "ProjectSettings"

  /** ProjectSettings.has_setting */
  final def hasSetting(name: String): Boolean = {
    if (gdext.classes.ProjectSettings.mb_has_setting == null) gdext.classes.ProjectSettings.mb_has_setting = MethodBind.get("ProjectSettings", "has_setting", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.ProjectSettings.mb_has_setting, livePtr, name)
  }

  /** ProjectSettings.set_order */
  final def setOrder(name: String, position: Long): Unit = {
    if (gdext.classes.ProjectSettings.mb_set_order == null) gdext.classes.ProjectSettings.mb_set_order = MethodBind.get("ProjectSettings", "set_order", 2956805083L)
    Ptrcall.callVoid2(gdext.classes.ProjectSettings.mb_set_order, livePtr, name, position)
  }

  /** ProjectSettings.get_order */
  final def getOrder(name: String): Long = {
    if (gdext.classes.ProjectSettings.mb_get_order == null) gdext.classes.ProjectSettings.mb_get_order = MethodBind.get("ProjectSettings", "get_order", 1321353865L)
    Ptrcall.call1[String, Long](gdext.classes.ProjectSettings.mb_get_order, livePtr, name)
  }

  /** ProjectSettings.set_as_basic */
  final def setAsBasic(name: String, basic: Boolean): Unit = {
    if (gdext.classes.ProjectSettings.mb_set_as_basic == null) gdext.classes.ProjectSettings.mb_set_as_basic = MethodBind.get("ProjectSettings", "set_as_basic", 2678287736L)
    Ptrcall.callVoid2(gdext.classes.ProjectSettings.mb_set_as_basic, livePtr, name, basic)
  }

  /** ProjectSettings.set_as_internal */
  final def setAsInternal(name: String, internal: Boolean): Unit = {
    if (gdext.classes.ProjectSettings.mb_set_as_internal == null) gdext.classes.ProjectSettings.mb_set_as_internal = MethodBind.get("ProjectSettings", "set_as_internal", 2678287736L)
    Ptrcall.callVoid2(gdext.classes.ProjectSettings.mb_set_as_internal, livePtr, name, internal)
  }

  /** ProjectSettings.set_restart_if_changed */
  final def setRestartIfChanged(name: String, restart: Boolean): Unit = {
    if (gdext.classes.ProjectSettings.mb_set_restart_if_changed == null) gdext.classes.ProjectSettings.mb_set_restart_if_changed = MethodBind.get("ProjectSettings", "set_restart_if_changed", 2678287736L)
    Ptrcall.callVoid2(gdext.classes.ProjectSettings.mb_set_restart_if_changed, livePtr, name, restart)
  }

  /** ProjectSettings.clear */
  final def clear(name: String): Unit = {
    if (gdext.classes.ProjectSettings.mb_clear == null) gdext.classes.ProjectSettings.mb_clear = MethodBind.get("ProjectSettings", "clear", 83702148L)
    Ptrcall.callVoid1(gdext.classes.ProjectSettings.mb_clear, livePtr, name)
  }

  /** ProjectSettings.localize_path */
  final def localizePath(path: String): String = {
    if (gdext.classes.ProjectSettings.mb_localize_path == null) gdext.classes.ProjectSettings.mb_localize_path = MethodBind.get("ProjectSettings", "localize_path", 3135753539L)
    Ptrcall.call1[String, String](gdext.classes.ProjectSettings.mb_localize_path, livePtr, path)
  }

  /** ProjectSettings.globalize_path */
  final def globalizePath(path: String): String = {
    if (gdext.classes.ProjectSettings.mb_globalize_path == null) gdext.classes.ProjectSettings.mb_globalize_path = MethodBind.get("ProjectSettings", "globalize_path", 3135753539L)
    Ptrcall.call1[String, String](gdext.classes.ProjectSettings.mb_globalize_path, livePtr, path)
  }

  /** ProjectSettings.save */
  final def save(): Long = {
    if (gdext.classes.ProjectSettings.mb_save == null) gdext.classes.ProjectSettings.mb_save = MethodBind.get("ProjectSettings", "save", 166280745L)
    Ptrcall.call0[Long](gdext.classes.ProjectSettings.mb_save, livePtr)
  }

  /** ProjectSettings.load_resource_pack */
  final def loadResourcePack(pack: String, replace_files: Boolean, offset: Long): Boolean = {
    if (gdext.classes.ProjectSettings.mb_load_resource_pack == null) gdext.classes.ProjectSettings.mb_load_resource_pack = MethodBind.get("ProjectSettings", "load_resource_pack", 708980503L)
    Ptrcall.call3[String, Boolean, Long, Boolean](gdext.classes.ProjectSettings.mb_load_resource_pack, livePtr, pack, replace_files, offset)
  }

  /** ProjectSettings.save_custom */
  final def saveCustom(file: String): Long = {
    if (gdext.classes.ProjectSettings.mb_save_custom == null) gdext.classes.ProjectSettings.mb_save_custom = MethodBind.get("ProjectSettings", "save_custom", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.ProjectSettings.mb_save_custom, livePtr, file)
  }

  /** ProjectSettings.check_changed_settings_in_group */
  final def checkChangedSettingsInGroup(setting_prefix: String): Boolean = {
    if (gdext.classes.ProjectSettings.mb_check_changed_settings_in_group == null) gdext.classes.ProjectSettings.mb_check_changed_settings_in_group = MethodBind.get("ProjectSettings", "check_changed_settings_in_group", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.ProjectSettings.mb_check_changed_settings_in_group, livePtr, setting_prefix)
  }

}

object ProjectSettings {
  private[classes] var mb_has_setting: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_order: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_order: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_as_basic: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_as_internal: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_restart_if_changed: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_localize_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_globalize_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_save: GDExtensionMethodBindPtr = null
  private[classes] var mb_load_resource_pack: GDExtensionMethodBindPtr = null
  private[classes] var mb_save_custom: GDExtensionMethodBindPtr = null
  private[classes] var mb_check_changed_settings_in_group: GDExtensionMethodBindPtr = null

  private var instance: ProjectSettings = null

  /** The process-global ProjectSettings singleton instance. */
  def singleton: ProjectSettings = {
    if (instance == null)
      instance = Wrappers.borrowed[ProjectSettings](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("ProjectSettings").ptr)))
    instance
  }
}
