package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorContextMenuPlugin`, extends `RefCounted`. */
abstract class EditorContextMenuPlugin extends RefCounted {
  override def godotClassName: String = "EditorContextMenuPlugin"

  /** EditorContextMenuPlugin.add_context_menu_item_from_shortcut */
  final def addContextMenuItemFromShortcut(name: String, shortcut: Shortcut, icon: Texture2D = null): Unit = {
    if (gdext.classes.EditorContextMenuPlugin.mb_add_context_menu_item_from_shortcut == null) gdext.classes.EditorContextMenuPlugin.mb_add_context_menu_item_from_shortcut = MethodBind.get("EditorContextMenuPlugin", "add_context_menu_item_from_shortcut", 3799546916L)
    Ptrcall.callVoid3(gdext.classes.EditorContextMenuPlugin.mb_add_context_menu_item_from_shortcut, livePtr, name, Wrappers.handle(shortcut), Wrappers.handle(icon))
  }

  /** EditorContextMenuPlugin.add_context_submenu_item */
  final def addContextSubmenuItem(name: String, menu: PopupMenu, icon: Texture2D = null): Unit = {
    if (gdext.classes.EditorContextMenuPlugin.mb_add_context_submenu_item == null) gdext.classes.EditorContextMenuPlugin.mb_add_context_submenu_item = MethodBind.get("EditorContextMenuPlugin", "add_context_submenu_item", 1994674995L)
    Ptrcall.callVoid3(gdext.classes.EditorContextMenuPlugin.mb_add_context_submenu_item, livePtr, name, Wrappers.handle(menu), Wrappers.handle(icon))
  }

}

object EditorContextMenuPlugin {
  private[classes] var mb_add_context_menu_item_from_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_context_submenu_item: GDExtensionMethodBindPtr = null

  /** Godot enum `EditorContextMenuPlugin.ContextMenuSlot`. */
  opaque type ContextMenuSlot <: Long = Long

  object ContextMenuSlot {
    final val SceneTree: ContextMenuSlot = 0L.asInstanceOf[ContextMenuSlot]
    final val Filesystem: ContextMenuSlot = 1L.asInstanceOf[ContextMenuSlot]
    final val ScriptEditor: ContextMenuSlot = 2L.asInstanceOf[ContextMenuSlot]
    final val FilesystemCreate: ContextMenuSlot = 3L.asInstanceOf[ContextMenuSlot]
    final val ScriptEditorCode: ContextMenuSlot = 4L.asInstanceOf[ContextMenuSlot]
    final val SceneTabs: ContextMenuSlot = 5L.asInstanceOf[ContextMenuSlot]
    final val Slot2dEditor: ContextMenuSlot = 6L.asInstanceOf[ContextMenuSlot]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ContextMenuSlot = value.asInstanceOf[ContextMenuSlot]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ContextMenuSlot] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[ContextMenuSlot]]

    extension (self: ContextMenuSlot)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "SceneTree"
        case 1L => "Filesystem"
        case 2L => "ScriptEditor"
        case 3L => "FilesystemCreate"
        case 4L => "ScriptEditorCode"
        case 5L => "SceneTabs"
        case 6L => "Slot2dEditor"
        case other => other.toString
      }
  }
}
