package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `GridMapEditorPlugin`, extends `EditorPlugin`. */
abstract class GridMapEditorPlugin extends EditorPlugin {

  /** GridMapEditorPlugin.get_current_grid_map */
  final def getCurrentGridMap(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GridMapEditorPlugin", "get_current_grid_map", 1184264483L), hostObject.objectPtr)

  /** GridMapEditorPlugin.set_selection */
  final def setSelection(begin: io.github.optical002.godot.builtin.Vector3i, end: io.github.optical002.godot.builtin.Vector3i): Unit =
    Ptrcall.callVoid2(MethodBind.get("GridMapEditorPlugin", "set_selection", 3659408297L), hostObject.objectPtr, begin, end)

  /** GridMapEditorPlugin.clear_selection */
  final def clearSelection(): Unit =
    Ptrcall.callVoid0(MethodBind.get("GridMapEditorPlugin", "clear_selection", 3218959716L), hostObject.objectPtr)

  /** GridMapEditorPlugin.get_selection */
  final def getSelection(): io.github.optical002.godot.builtin.AABB =
    Ptrcall.call0[io.github.optical002.godot.builtin.AABB](MethodBind.get("GridMapEditorPlugin", "get_selection", 1068685055L), hostObject.objectPtr)

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

object GridMapEditorPlugin {
  /** Class metadata for Gd[GridMapEditorPlugin] lifetime management and casting. */
  given GodotClass[GridMapEditorPlugin] with {
    def className = "GridMapEditorPlugin"
    def isRefCounted = false
    def wrap(o: GodotObject): GridMapEditorPlugin = new GridMapEditorPlugin {}.withHost(o.objectPtr)
    def unwrap(t: GridMapEditorPlugin): GodotObject = t.hostObject
  }
}
