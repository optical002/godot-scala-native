package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NativeMenu`, extends `Object`. */
abstract class NativeMenu extends Object {
  override def godotClassName: String = "NativeMenu"

  /** NativeMenu.has_feature */
  final def hasFeature(feature: Long): Boolean = {
    if (gdext.classes.NativeMenu.mb_has_feature == null) gdext.classes.NativeMenu.mb_has_feature = MethodBind.get("NativeMenu", "has_feature", 1708975490L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NativeMenu.mb_has_feature, livePtr, feature)
  }

  /** NativeMenu.has_system_menu */
  final def hasSystemMenu(menu_id: Long): Boolean = {
    if (gdext.classes.NativeMenu.mb_has_system_menu == null) gdext.classes.NativeMenu.mb_has_system_menu = MethodBind.get("NativeMenu", "has_system_menu", 718213027L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NativeMenu.mb_has_system_menu, livePtr, menu_id)
  }

  /** NativeMenu.get_system_menu_name */
  final def getSystemMenuName(menu_id: Long): String = {
    if (gdext.classes.NativeMenu.mb_get_system_menu_name == null) gdext.classes.NativeMenu.mb_get_system_menu_name = MethodBind.get("NativeMenu", "get_system_menu_name", 1281499290L)
    Ptrcall.call1[Long, String](gdext.classes.NativeMenu.mb_get_system_menu_name, livePtr, menu_id)
  }

  /** NativeMenu.get_system_menu_text */
  final def getSystemMenuText(menu_id: Long): String = {
    if (gdext.classes.NativeMenu.mb_get_system_menu_text == null) gdext.classes.NativeMenu.mb_get_system_menu_text = MethodBind.get("NativeMenu", "get_system_menu_text", 1281499290L)
    Ptrcall.call1[Long, String](gdext.classes.NativeMenu.mb_get_system_menu_text, livePtr, menu_id)
  }

  /** NativeMenu.set_system_menu_text */
  final def setSystemMenuText(menu_id: Long, name: String): Unit = {
    if (gdext.classes.NativeMenu.mb_set_system_menu_text == null) gdext.classes.NativeMenu.mb_set_system_menu_text = MethodBind.get("NativeMenu", "set_system_menu_text", 3925225603L)
    Ptrcall.callVoid2(gdext.classes.NativeMenu.mb_set_system_menu_text, livePtr, menu_id, name)
  }

}

object NativeMenu {
  private[classes] var mb_has_feature: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_system_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_system_menu_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_system_menu_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_system_menu_text: GDExtensionMethodBindPtr = null

  private var instance: NativeMenu = null

  /** The process-global NativeMenu singleton instance. */
  def singleton: NativeMenu = {
    if (instance == null)
      instance = Wrappers.borrowed[NativeMenu](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("NativeMenu").ptr)))
    instance
  }
}
