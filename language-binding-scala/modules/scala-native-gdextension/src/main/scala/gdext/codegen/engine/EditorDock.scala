package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorDock`, extends `MarginContainer`. */
abstract class EditorDock extends MarginContainer {

  /** EditorDock.open */
  final def open(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorDock", "open", 3218959716L), hostObject.objectPtr)

  /** EditorDock.make_visible */
  final def makeVisible(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorDock", "make_visible", 3218959716L), hostObject.objectPtr)

  /** EditorDock.close */
  final def close(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorDock", "close", 3218959716L), hostObject.objectPtr)

  /** EditorDock.set_title */
  final def setTitle(title: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorDock", "set_title", 83702148L), hostObject.objectPtr, title)

  /** EditorDock.get_title */
  final def getTitle(): String =
    Ptrcall.call0[String](MethodBind.get("EditorDock", "get_title", 201670096L), hostObject.objectPtr)

  /** EditorDock.set_layout_key */
  final def setLayoutKey(layout_key: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorDock", "set_layout_key", 83702148L), hostObject.objectPtr, layout_key)

  /** EditorDock.get_layout_key */
  final def getLayoutKey(): String =
    Ptrcall.call0[String](MethodBind.get("EditorDock", "get_layout_key", 201670096L), hostObject.objectPtr)

  /** EditorDock.set_global */
  final def setGlobal(global: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorDock", "set_global", 2586408642L), hostObject.objectPtr, global)

  /** EditorDock.is_global */
  final def isGlobal(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorDock", "is_global", 36873697L), hostObject.objectPtr)

  /** EditorDock.set_transient */
  final def setTransient(transient: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorDock", "set_transient", 2586408642L), hostObject.objectPtr, transient)

  /** EditorDock.is_transient */
  final def isTransient(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorDock", "is_transient", 36873697L), hostObject.objectPtr)

  /** EditorDock.set_closable */
  final def setClosable(closable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorDock", "set_closable", 2586408642L), hostObject.objectPtr, closable)

  /** EditorDock.is_closable */
  final def isClosable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorDock", "is_closable", 36873697L), hostObject.objectPtr)

  /** EditorDock.set_icon_name */
  final def setIconName(icon_name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorDock", "set_icon_name", 3304788590L), hostObject.objectPtr, icon_name)

  /** EditorDock.get_icon_name */
  final def getIconName(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("EditorDock", "get_icon_name", 2002593661L), hostObject.objectPtr)

  /** EditorDock.set_dock_icon */
  final def setDockIcon(icon: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorDock", "set_dock_icon", 4051416890L), hostObject.objectPtr, icon.hostObject)

  /** EditorDock.get_dock_icon */
  final def getDockIcon(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorDock", "get_dock_icon", 3635182373L), hostObject.objectPtr)

  /** EditorDock.set_force_show_icon */
  final def setForceShowIcon(force: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorDock", "set_force_show_icon", 2586408642L), hostObject.objectPtr, force)

  /** EditorDock.get_force_show_icon */
  final def getForceShowIcon(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorDock", "get_force_show_icon", 36873697L), hostObject.objectPtr)

  /** EditorDock.set_title_color */
  final def setTitleColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorDock", "set_title_color", 2920490490L), hostObject.objectPtr, color)

  /** EditorDock.get_title_color */
  final def getTitleColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("EditorDock", "get_title_color", 3444240500L), hostObject.objectPtr)

  /** EditorDock.set_dock_shortcut */
  final def setDockShortcut(shortcut: Shortcut): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorDock", "set_dock_shortcut", 857163497L), hostObject.objectPtr, shortcut.hostObject)

  /** EditorDock.get_dock_shortcut */
  final def getDockShortcut(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorDock", "get_dock_shortcut", 3415666916L), hostObject.objectPtr)

  /** EditorDock.set_default_slot */
  final def setDefaultSlot(slot: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorDock", "set_default_slot", 4142995464L), hostObject.objectPtr, slot)

  /** EditorDock.get_default_slot */
  final def getDefaultSlot(): Long =
    Ptrcall.call0[Long](MethodBind.get("EditorDock", "get_default_slot", 3298961740L), hostObject.objectPtr)

  /** EditorDock.set_available_layouts */
  final def setAvailableLayouts(layouts: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorDock", "set_available_layouts", 3440531249L), hostObject.objectPtr, layouts)

  /** EditorDock.get_available_layouts */
  final def getAvailableLayouts(): Long =
    Ptrcall.call0[Long](MethodBind.get("EditorDock", "get_available_layouts", 495015512L), hostObject.objectPtr)

}

object EditorDock {
  /** Class metadata for Gd[EditorDock] lifetime management and casting. */
  given GodotClass[EditorDock] with {
    def className = "EditorDock"
    def isRefCounted = false
    def wrap(o: GodotObject): EditorDock = new EditorDock {}.withHost(o.objectPtr)
    def unwrap(t: EditorDock): GodotObject = t.hostObject
  }
}
