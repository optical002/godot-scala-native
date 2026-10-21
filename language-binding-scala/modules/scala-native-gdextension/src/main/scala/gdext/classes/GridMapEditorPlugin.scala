package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GridMapEditorPlugin`, extends `EditorPlugin`. */
abstract class GridMapEditorPlugin extends EditorPlugin {
  override def godotClassName: String = "GridMapEditorPlugin"

  /** GridMapEditorPlugin.get_current_grid_map */
  final def getCurrentGridMap(): GridMap = {
    if (gdext.classes.GridMapEditorPlugin.mb_get_current_grid_map == null) gdext.classes.GridMapEditorPlugin.mb_get_current_grid_map = MethodBind.get("GridMapEditorPlugin", "get_current_grid_map", 1184264483L)
    Wrappers.borrowed[GridMap](Ptrcall.call0[Long](gdext.classes.GridMapEditorPlugin.mb_get_current_grid_map, livePtr))
  }

  /** GridMapEditorPlugin.set_selection */
  final def setSelection(begin: gdext.builtin.Vector3i, end: gdext.builtin.Vector3i): Unit = {
    if (gdext.classes.GridMapEditorPlugin.mb_set_selection == null) gdext.classes.GridMapEditorPlugin.mb_set_selection = MethodBind.get("GridMapEditorPlugin", "set_selection", 3659408297L)
    Ptrcall.callVoid2(gdext.classes.GridMapEditorPlugin.mb_set_selection, livePtr, begin, end)
  }

  /** GridMapEditorPlugin.clear_selection */
  final def clearSelection(): Unit = {
    if (gdext.classes.GridMapEditorPlugin.mb_clear_selection == null) gdext.classes.GridMapEditorPlugin.mb_clear_selection = MethodBind.get("GridMapEditorPlugin", "clear_selection", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.GridMapEditorPlugin.mb_clear_selection, livePtr)
  }

  /** GridMapEditorPlugin.get_selection */
  final def getSelection(): gdext.builtin.AABB = {
    if (gdext.classes.GridMapEditorPlugin.mb_get_selection == null) gdext.classes.GridMapEditorPlugin.mb_get_selection = MethodBind.get("GridMapEditorPlugin", "get_selection", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.GridMapEditorPlugin.mb_get_selection, livePtr)
  }

  /** GridMapEditorPlugin.has_selection */
  final def hasSelection(): Boolean = {
    if (gdext.classes.GridMapEditorPlugin.mb_has_selection == null) gdext.classes.GridMapEditorPlugin.mb_has_selection = MethodBind.get("GridMapEditorPlugin", "has_selection", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GridMapEditorPlugin.mb_has_selection, livePtr)
  }

  /** GridMapEditorPlugin.set_selected_palette_item */
  final def setSelectedPaletteItem(item: Long): Unit = {
    if (gdext.classes.GridMapEditorPlugin.mb_set_selected_palette_item == null) gdext.classes.GridMapEditorPlugin.mb_set_selected_palette_item = MethodBind.get("GridMapEditorPlugin", "set_selected_palette_item", 998575451L)
    Ptrcall.callVoid1(gdext.classes.GridMapEditorPlugin.mb_set_selected_palette_item, livePtr, item)
  }

  /** GridMapEditorPlugin.get_selected_palette_item */
  final def getSelectedPaletteItem(): Long = {
    if (gdext.classes.GridMapEditorPlugin.mb_get_selected_palette_item == null) gdext.classes.GridMapEditorPlugin.mb_get_selected_palette_item = MethodBind.get("GridMapEditorPlugin", "get_selected_palette_item", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GridMapEditorPlugin.mb_get_selected_palette_item, livePtr)
  }

}

object GridMapEditorPlugin {
  private[classes] var mb_get_current_grid_map: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_selected_palette_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selected_palette_item: GDExtensionMethodBindPtr = null
}
