package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorContextMenuPlugin`, extends `RefCounted`. */
abstract class EditorContextMenuPlugin extends RefCounted {
  override def godotClassName: String = "EditorContextMenuPlugin"

  /** EditorContextMenuPlugin.add_context_menu_item_from_shortcut */
  final def addContextMenuItemFromShortcut(name: String, shortcut: Shortcut, icon: Texture2D): Unit =
    Ptrcall.callVoid3(MethodBind.get("EditorContextMenuPlugin", "add_context_menu_item_from_shortcut", 3799546916L), hostObject.objectPtr, name, shortcut.hostObject, icon.hostObject)

  /** EditorContextMenuPlugin.add_context_submenu_item */
  final def addContextSubmenuItem(name: String, menu: PopupMenu, icon: Texture2D): Unit =
    Ptrcall.callVoid3(MethodBind.get("EditorContextMenuPlugin", "add_context_submenu_item", 1994674995L), hostObject.objectPtr, name, menu.hostObject, icon.hostObject)

}
