package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorContextMenuPlugin`, extends `RefCounted`. */
abstract class EditorContextMenuPlugin extends RefCounted {
  override def godotClassName: String = "EditorContextMenuPlugin"

  /** EditorContextMenuPlugin.add_context_menu_item_from_shortcut */
  final def addContextMenuItemFromShortcut(name: String, shortcut: Shortcut, icon: Texture2D): Unit = {
    if (gdext.classes.EditorContextMenuPlugin.mb_add_context_menu_item_from_shortcut == null) gdext.classes.EditorContextMenuPlugin.mb_add_context_menu_item_from_shortcut = MethodBind.get("EditorContextMenuPlugin", "add_context_menu_item_from_shortcut", 3799546916L)
    Ptrcall.callVoid3(gdext.classes.EditorContextMenuPlugin.mb_add_context_menu_item_from_shortcut, livePtr, name, Wrappers.handle(shortcut), Wrappers.handle(icon))
  }

  /** EditorContextMenuPlugin.add_context_submenu_item */
  final def addContextSubmenuItem(name: String, menu: PopupMenu, icon: Texture2D): Unit = {
    if (gdext.classes.EditorContextMenuPlugin.mb_add_context_submenu_item == null) gdext.classes.EditorContextMenuPlugin.mb_add_context_submenu_item = MethodBind.get("EditorContextMenuPlugin", "add_context_submenu_item", 1994674995L)
    Ptrcall.callVoid3(gdext.classes.EditorContextMenuPlugin.mb_add_context_submenu_item, livePtr, name, Wrappers.handle(menu), Wrappers.handle(icon))
  }

}

object EditorContextMenuPlugin {
  private[classes] var mb_add_context_menu_item_from_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_context_submenu_item: GDExtensionMethodBindPtr = null
}
