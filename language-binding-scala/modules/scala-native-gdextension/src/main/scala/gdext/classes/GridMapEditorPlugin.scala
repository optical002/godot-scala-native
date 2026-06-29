package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GridMapEditorPlugin`, extends `EditorPlugin`. */
abstract class GridMapEditorPlugin extends EditorPlugin {
  override def godotClassName: String = "GridMapEditorPlugin"

  /** GridMapEditorPlugin.get_current_grid_map */
  final def getCurrentGridMap(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GridMapEditorPlugin", "get_current_grid_map", 1184264483L), hostObject.objectPtr)

  /** GridMapEditorPlugin.set_selection */
  final def setSelection(begin: gdext.builtin.Vector3i, end: gdext.builtin.Vector3i): Unit =
    Ptrcall.callVoid2(MethodBind.get("GridMapEditorPlugin", "set_selection", 3659408297L), hostObject.objectPtr, begin, end)

  /** GridMapEditorPlugin.clear_selection */
  final def clearSelection(): Unit =
    Ptrcall.callVoid0(MethodBind.get("GridMapEditorPlugin", "clear_selection", 3218959716L), hostObject.objectPtr)

  /** GridMapEditorPlugin.get_selection */
  final def getSelection(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("GridMapEditorPlugin", "get_selection", 1068685055L), hostObject.objectPtr)

  /** GridMapEditorPlugin.has_selection */
  final def hasSelection(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GridMapEditorPlugin", "has_selection", 36873697L), hostObject.objectPtr)

  /** GridMapEditorPlugin.set_selected_palette_item */
  final def setSelectedPaletteItem(item: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GridMapEditorPlugin", "set_selected_palette_item", 998575451L), hostObject.objectPtr, item)

  /** GridMapEditorPlugin.get_selected_palette_item */
  final def getSelectedPaletteItem(): Long =
    Ptrcall.call0[Long](MethodBind.get("GridMapEditorPlugin", "get_selected_palette_item", 3905245786L), hostObject.objectPtr)

}
