package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorSettings`, extends `Resource`. */
abstract class EditorSettings extends Resource {
  override def godotClassName: String = "EditorSettings"

  /** EditorSettings.has_setting */
  final def hasSetting(name: String): Boolean = {
    if (gdext.classes.EditorSettings.mb_has_setting == null) gdext.classes.EditorSettings.mb_has_setting = MethodBind.get("EditorSettings", "has_setting", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.EditorSettings.mb_has_setting, livePtr, name)
  }

  /** EditorSettings.erase */
  final def erase(property: String): Unit = {
    if (gdext.classes.EditorSettings.mb_erase == null) gdext.classes.EditorSettings.mb_erase = MethodBind.get("EditorSettings", "erase", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorSettings.mb_erase, livePtr, property)
  }

  /** EditorSettings.add_shortcut */
  final def addShortcut(path: String, shortcut: Shortcut): Unit = {
    if (gdext.classes.EditorSettings.mb_add_shortcut == null) gdext.classes.EditorSettings.mb_add_shortcut = MethodBind.get("EditorSettings", "add_shortcut", 4124020929L)
    Ptrcall.callVoid2(gdext.classes.EditorSettings.mb_add_shortcut, livePtr, path, Wrappers.handle(shortcut))
  }

  /** EditorSettings.remove_shortcut */
  final def removeShortcut(path: String): Unit = {
    if (gdext.classes.EditorSettings.mb_remove_shortcut == null) gdext.classes.EditorSettings.mb_remove_shortcut = MethodBind.get("EditorSettings", "remove_shortcut", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorSettings.mb_remove_shortcut, livePtr, path)
  }

  /** EditorSettings.is_shortcut */
  final def isShortcut(path: String, event: InputEvent): Boolean = {
    if (gdext.classes.EditorSettings.mb_is_shortcut == null) gdext.classes.EditorSettings.mb_is_shortcut = MethodBind.get("EditorSettings", "is_shortcut", 699917945L)
    Ptrcall.call2[String, GodotObject, Boolean](gdext.classes.EditorSettings.mb_is_shortcut, livePtr, path, Wrappers.handle(event))
  }

  /** EditorSettings.has_shortcut */
  final def hasShortcut(path: String): Boolean = {
    if (gdext.classes.EditorSettings.mb_has_shortcut == null) gdext.classes.EditorSettings.mb_has_shortcut = MethodBind.get("EditorSettings", "has_shortcut", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.EditorSettings.mb_has_shortcut, livePtr, path)
  }

  /** EditorSettings.get_shortcut. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getShortcut(path: String): Shortcut = {
    if (gdext.classes.EditorSettings.mb_get_shortcut == null) gdext.classes.EditorSettings.mb_get_shortcut = MethodBind.get("EditorSettings", "get_shortcut", 1149070301L)
    Wrappers.owned[Shortcut](Ptrcall.call1[String, Long](gdext.classes.EditorSettings.mb_get_shortcut, livePtr, path))
  }

  /** EditorSettings.check_changed_settings_in_group */
  final def checkChangedSettingsInGroup(settingPrefix: String): Boolean = {
    if (gdext.classes.EditorSettings.mb_check_changed_settings_in_group == null) gdext.classes.EditorSettings.mb_check_changed_settings_in_group = MethodBind.get("EditorSettings", "check_changed_settings_in_group", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.EditorSettings.mb_check_changed_settings_in_group, livePtr, settingPrefix)
  }

  /** EditorSettings.mark_setting_changed */
  final def markSettingChanged(setting: String): Unit = {
    if (gdext.classes.EditorSettings.mb_mark_setting_changed == null) gdext.classes.EditorSettings.mb_mark_setting_changed = MethodBind.get("EditorSettings", "mark_setting_changed", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorSettings.mb_mark_setting_changed, livePtr, setting)
  }

}

object EditorSettings {
  private[classes] var mb_has_setting: GDExtensionMethodBindPtr = null
  private[classes] var mb_erase: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_check_changed_settings_in_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_mark_setting_changed: GDExtensionMethodBindPtr = null
}
