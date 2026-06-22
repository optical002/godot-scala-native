package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorSettings`, extends `Resource`. */
abstract class EditorSettings extends Resource {

  /** EditorSettings.has_setting */
  final def hasSetting(name: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("EditorSettings", "has_setting", 3927539163L), hostObject.objectPtr, name)

  /** EditorSettings.erase */
  final def erase(property: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorSettings", "erase", 83702148L), hostObject.objectPtr, property)

  /** EditorSettings.add_shortcut */
  final def addShortcut(path: String, shortcut: Shortcut): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorSettings", "add_shortcut", 4124020929L), hostObject.objectPtr, path, shortcut.hostObject)

  /** EditorSettings.remove_shortcut */
  final def removeShortcut(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorSettings", "remove_shortcut", 83702148L), hostObject.objectPtr, path)

  /** EditorSettings.is_shortcut */
  final def isShortcut(path: String, event: InputEvent): Boolean =
    Ptrcall.call2[String, GodotObject, Boolean](MethodBind.get("EditorSettings", "is_shortcut", 699917945L), hostObject.objectPtr, path, event.hostObject)

  /** EditorSettings.has_shortcut */
  final def hasShortcut(path: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("EditorSettings", "has_shortcut", 3927539163L), hostObject.objectPtr, path)

  /** EditorSettings.get_shortcut */
  final def getShortcut(path: String): GodotObject =
    Ptrcall.call1[String, GodotObject](MethodBind.get("EditorSettings", "get_shortcut", 1149070301L), hostObject.objectPtr, path)

  /** EditorSettings.check_changed_settings_in_group */
  final def checkChangedSettingsInGroup(setting_prefix: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("EditorSettings", "check_changed_settings_in_group", 3927539163L), hostObject.objectPtr, setting_prefix)

  /** EditorSettings.mark_setting_changed */
  final def markSettingChanged(setting: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorSettings", "mark_setting_changed", 83702148L), hostObject.objectPtr, setting)

}

object EditorSettings {
  /** Class metadata for Gd[EditorSettings] lifetime management and casting. */
  given GodotClass[EditorSettings] with {
    def className = "EditorSettings"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorSettings = new EditorSettings {}.withHost(o.objectPtr)
    def unwrap(t: EditorSettings): GodotObject = t.hostObject
  }
}
