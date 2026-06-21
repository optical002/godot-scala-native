package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ProjectSettings`, extends `Object`. */
abstract class ProjectSettings extends Object {

  /** ProjectSettings.has_setting */
  final def hasSetting(name: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("ProjectSettings", "has_setting", 3927539163L), hostObject.objectPtr, name)

  /** ProjectSettings.set_order */
  final def setOrder(name: String, position: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("ProjectSettings", "set_order", 2956805083L), hostObject.objectPtr, name, position)

  /** ProjectSettings.get_order */
  final def getOrder(name: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("ProjectSettings", "get_order", 1321353865L), hostObject.objectPtr, name)

  /** ProjectSettings.set_as_basic */
  final def setAsBasic(name: String, basic: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("ProjectSettings", "set_as_basic", 2678287736L), hostObject.objectPtr, name, basic)

  /** ProjectSettings.set_as_internal */
  final def setAsInternal(name: String, internal: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("ProjectSettings", "set_as_internal", 2678287736L), hostObject.objectPtr, name, internal)

  /** ProjectSettings.set_restart_if_changed */
  final def setRestartIfChanged(name: String, restart: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("ProjectSettings", "set_restart_if_changed", 2678287736L), hostObject.objectPtr, name, restart)

  /** ProjectSettings.clear */
  final def clear(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProjectSettings", "clear", 83702148L), hostObject.objectPtr, name)

  /** ProjectSettings.localize_path */
  final def localizePath(path: String): String =
    Ptrcall.call1[String, String](MethodBind.get("ProjectSettings", "localize_path", 3135753539L), hostObject.objectPtr, path)

  /** ProjectSettings.globalize_path */
  final def globalizePath(path: String): String =
    Ptrcall.call1[String, String](MethodBind.get("ProjectSettings", "globalize_path", 3135753539L), hostObject.objectPtr, path)

  /** ProjectSettings.save */
  final def save(): Long =
    Ptrcall.call0[Long](MethodBind.get("ProjectSettings", "save", 166280745L), hostObject.objectPtr)

  /** ProjectSettings.load_resource_pack */
  final def loadResourcePack(pack: String, replace_files: Boolean, offset: Long): Boolean =
    Ptrcall.call3[String, Boolean, Long, Boolean](MethodBind.get("ProjectSettings", "load_resource_pack", 708980503L), hostObject.objectPtr, pack, replace_files, offset)

  /** ProjectSettings.save_custom */
  final def saveCustom(file: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("ProjectSettings", "save_custom", 166001499L), hostObject.objectPtr, file)

  /** ProjectSettings.check_changed_settings_in_group */
  final def checkChangedSettingsInGroup(setting_prefix: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("ProjectSettings", "check_changed_settings_in_group", 3927539163L), hostObject.objectPtr, setting_prefix)

}

object ProjectSettings {
  /** Class metadata for Gd[ProjectSettings] lifetime management and casting. */
  given GodotClass[ProjectSettings] with {
    def className = "ProjectSettings"
    def isRefCounted = false
    def wrap(o: GodotObject): ProjectSettings = new ProjectSettings {}.withHost(o.objectPtr)
    def unwrap(t: ProjectSettings): GodotObject = t.hostObject
  }

  /** The process-global ProjectSettings singleton instance. */
  def singleton: ProjectSettings = new ProjectSettings {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("ProjectSettings").ptr))
}
