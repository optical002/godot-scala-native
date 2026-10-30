package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NativeMenu`, extends `Object`. */
abstract class NativeMenu extends Object {
  override def godotClassName: String = "NativeMenu"

  /** NativeMenu.has_feature */
  final def hasFeature(feature: gdext.classes.NativeMenu.Feature): Boolean = {
    if (gdext.classes.NativeMenu.mb_has_feature == null) gdext.classes.NativeMenu.mb_has_feature = MethodBind.get("NativeMenu", "has_feature", 1708975490L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NativeMenu.mb_has_feature, livePtr, feature)
  }

  /** NativeMenu.has_system_menu */
  final def hasSystemMenu(menuId: gdext.classes.NativeMenu.SystemMenus): Boolean = {
    if (gdext.classes.NativeMenu.mb_has_system_menu == null) gdext.classes.NativeMenu.mb_has_system_menu = MethodBind.get("NativeMenu", "has_system_menu", 718213027L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NativeMenu.mb_has_system_menu, livePtr, menuId)
  }

  /** NativeMenu.get_system_menu_name */
  final def getSystemMenuName(menuId: gdext.classes.NativeMenu.SystemMenus): String = {
    if (gdext.classes.NativeMenu.mb_get_system_menu_name == null) gdext.classes.NativeMenu.mb_get_system_menu_name = MethodBind.get("NativeMenu", "get_system_menu_name", 1281499290L)
    Ptrcall.call1[Long, String](gdext.classes.NativeMenu.mb_get_system_menu_name, livePtr, menuId)
  }

  /** NativeMenu.get_system_menu_text */
  final def getSystemMenuText(menuId: gdext.classes.NativeMenu.SystemMenus): String = {
    if (gdext.classes.NativeMenu.mb_get_system_menu_text == null) gdext.classes.NativeMenu.mb_get_system_menu_text = MethodBind.get("NativeMenu", "get_system_menu_text", 1281499290L)
    Ptrcall.call1[Long, String](gdext.classes.NativeMenu.mb_get_system_menu_text, livePtr, menuId)
  }

  /** NativeMenu.set_system_menu_text */
  final def setSystemMenuText(menuId: gdext.classes.NativeMenu.SystemMenus, name: String): Unit = {
    if (gdext.classes.NativeMenu.mb_set_system_menu_text == null) gdext.classes.NativeMenu.mb_set_system_menu_text = MethodBind.get("NativeMenu", "set_system_menu_text", 3925225603L)
    Ptrcall.callVoid2(gdext.classes.NativeMenu.mb_set_system_menu_text, livePtr, menuId, name)
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

  /** Forwards to [[singleton]]: NativeMenu.has_feature */
  final def hasFeature(feature: gdext.classes.NativeMenu.Feature): Boolean =
    singleton.hasFeature(feature)

  /** Forwards to [[singleton]]: NativeMenu.has_system_menu */
  final def hasSystemMenu(menuId: gdext.classes.NativeMenu.SystemMenus): Boolean =
    singleton.hasSystemMenu(menuId)

  /** Forwards to [[singleton]]: NativeMenu.get_system_menu_name */
  final def getSystemMenuName(menuId: gdext.classes.NativeMenu.SystemMenus): String =
    singleton.getSystemMenuName(menuId)

  /** Forwards to [[singleton]]: NativeMenu.get_system_menu_text */
  final def getSystemMenuText(menuId: gdext.classes.NativeMenu.SystemMenus): String =
    singleton.getSystemMenuText(menuId)

  /** Forwards to [[singleton]]: NativeMenu.set_system_menu_text */
  final def setSystemMenuText(menuId: gdext.classes.NativeMenu.SystemMenus, name: String): Unit =
    singleton.setSystemMenuText(menuId, name)

  /** Godot enum `NativeMenu.Feature`. */
  opaque type Feature <: Long = Long

  object Feature {
    final val GlobalMenu: Feature = 0L.asInstanceOf[Feature]
    final val PopupMenu: Feature = 1L.asInstanceOf[Feature]
    final val OpenCloseCallback: Feature = 2L.asInstanceOf[Feature]
    final val HoverCallback: Feature = 3L.asInstanceOf[Feature]
    final val KeyCallback: Feature = 4L.asInstanceOf[Feature]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Feature = value.asInstanceOf[Feature]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Feature] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[Feature]]

    extension (self: Feature)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "GlobalMenu"
        case 1L => "PopupMenu"
        case 2L => "OpenCloseCallback"
        case 3L => "HoverCallback"
        case 4L => "KeyCallback"
        case other => other.toString
      }
  }

  /** Godot enum `NativeMenu.SystemMenus`. */
  opaque type SystemMenus <: Long = Long

  object SystemMenus {
    final val InvalidMenuId: SystemMenus = 0L.asInstanceOf[SystemMenus]
    final val MainMenuId: SystemMenus = 1L.asInstanceOf[SystemMenus]
    final val ApplicationMenuId: SystemMenus = 2L.asInstanceOf[SystemMenus]
    final val WindowMenuId: SystemMenus = 3L.asInstanceOf[SystemMenus]
    final val HelpMenuId: SystemMenus = 4L.asInstanceOf[SystemMenus]
    final val DockMenuId: SystemMenus = 5L.asInstanceOf[SystemMenus]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SystemMenus = value.asInstanceOf[SystemMenus]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SystemMenus] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[SystemMenus]]

    extension (self: SystemMenus)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "InvalidMenuId"
        case 1L => "MainMenuId"
        case 2L => "ApplicationMenuId"
        case 3L => "WindowMenuId"
        case 4L => "HelpMenuId"
        case 5L => "DockMenuId"
        case other => other.toString
      }
  }
}
