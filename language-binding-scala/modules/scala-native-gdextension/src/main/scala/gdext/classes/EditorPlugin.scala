package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorPlugin`, extends `Node`. */
abstract class EditorPlugin extends Node {

  /** EditorPlugin.add_dock */
  final def addDock(dock: EditorDock): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "add_dock", 158651717L), hostObject.objectPtr, dock.hostObject)

  /** EditorPlugin.remove_dock */
  final def removeDock(dock: EditorDock): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_dock", 158651717L), hostObject.objectPtr, dock.hostObject)

  /** EditorPlugin.add_control_to_container */
  final def addControlToContainer(container: Long, control: Control): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorPlugin", "add_control_to_container", 3092750152L), hostObject.objectPtr, container, control.hostObject)

  /** EditorPlugin.remove_control_from_container */
  final def removeControlFromContainer(container: Long, control: Control): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorPlugin", "remove_control_from_container", 3092750152L), hostObject.objectPtr, container, control.hostObject)

  /** EditorPlugin.add_tool_submenu_item */
  final def addToolSubmenuItem(name: String, submenu: PopupMenu): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorPlugin", "add_tool_submenu_item", 1019428915L), hostObject.objectPtr, name, submenu.hostObject)

  /** EditorPlugin.remove_tool_menu_item */
  final def removeToolMenuItem(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_tool_menu_item", 83702148L), hostObject.objectPtr, name)

  /** EditorPlugin.get_export_as_menu */
  final def getExportAsMenu(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorPlugin", "get_export_as_menu", 1775878644L), hostObject.objectPtr)

  /** EditorPlugin.add_custom_type */
  final def addCustomType(`type`: String, base: String, script: Script, icon: Texture2D): Unit =
    Ptrcall.callVoid4(MethodBind.get("EditorPlugin", "add_custom_type", 1986814599L), hostObject.objectPtr, `type`, base, script.hostObject, icon.hostObject)

  /** EditorPlugin.remove_custom_type */
  final def removeCustomType(`type`: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_custom_type", 83702148L), hostObject.objectPtr, `type`)

  /** EditorPlugin.add_control_to_dock */
  final def addControlToDock(slot: Long, control: Control, shortcut: Shortcut): Unit =
    Ptrcall.callVoid3(MethodBind.get("EditorPlugin", "add_control_to_dock", 2994930786L), hostObject.objectPtr, slot, control.hostObject, shortcut.hostObject)

  /** EditorPlugin.remove_control_from_docks */
  final def removeControlFromDocks(control: Control): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_control_from_docks", 1496901182L), hostObject.objectPtr, control.hostObject)

  /** EditorPlugin.set_dock_tab_icon */
  final def setDockTabIcon(control: Control, icon: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorPlugin", "set_dock_tab_icon", 3450529724L), hostObject.objectPtr, control.hostObject, icon.hostObject)

  /** EditorPlugin.add_control_to_bottom_panel */
  final def addControlToBottomPanel(control: Control, title: String, shortcut: Shortcut): GodotObject =
    Ptrcall.call3[GodotObject, String, GodotObject, GodotObject](MethodBind.get("EditorPlugin", "add_control_to_bottom_panel", 111032269L), hostObject.objectPtr, control.hostObject, title, shortcut.hostObject)

  /** EditorPlugin.remove_control_from_bottom_panel */
  final def removeControlFromBottomPanel(control: Control): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_control_from_bottom_panel", 1496901182L), hostObject.objectPtr, control.hostObject)

  /** EditorPlugin.add_autoload_singleton */
  final def addAutoloadSingleton(name: String, path: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorPlugin", "add_autoload_singleton", 3186203200L), hostObject.objectPtr, name, path)

  /** EditorPlugin.remove_autoload_singleton */
  final def removeAutoloadSingleton(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_autoload_singleton", 83702148L), hostObject.objectPtr, name)

  /** EditorPlugin.update_overlays */
  final def updateOverlays(): Long =
    Ptrcall.call0[Long](MethodBind.get("EditorPlugin", "update_overlays", 3905245786L), hostObject.objectPtr)

  /** EditorPlugin.make_bottom_panel_item_visible */
  final def makeBottomPanelItemVisible(item: Control): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "make_bottom_panel_item_visible", 1496901182L), hostObject.objectPtr, item.hostObject)

  /** EditorPlugin.hide_bottom_panel */
  final def hideBottomPanel(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorPlugin", "hide_bottom_panel", 3218959716L), hostObject.objectPtr)

  /** EditorPlugin.get_undo_redo */
  final def getUndoRedo(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorPlugin", "get_undo_redo", 773492341L), hostObject.objectPtr)

  /** EditorPlugin.queue_save_layout */
  final def queueSaveLayout(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorPlugin", "queue_save_layout", 3218959716L), hostObject.objectPtr)

  /** EditorPlugin.add_translation_parser_plugin */
  final def addTranslationParserPlugin(parser: EditorTranslationParserPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "add_translation_parser_plugin", 3116463128L), hostObject.objectPtr, parser.hostObject)

  /** EditorPlugin.remove_translation_parser_plugin */
  final def removeTranslationParserPlugin(parser: EditorTranslationParserPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_translation_parser_plugin", 3116463128L), hostObject.objectPtr, parser.hostObject)

  /** EditorPlugin.add_import_plugin */
  final def addImportPlugin(importer: EditorImportPlugin, first_priority: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorPlugin", "add_import_plugin", 3113975762L), hostObject.objectPtr, importer.hostObject, first_priority)

  /** EditorPlugin.remove_import_plugin */
  final def removeImportPlugin(importer: EditorImportPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_import_plugin", 2312482773L), hostObject.objectPtr, importer.hostObject)

  /** EditorPlugin.add_scene_format_importer_plugin */
  final def addSceneFormatImporterPlugin(scene_format_importer: EditorSceneFormatImporter, first_priority: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorPlugin", "add_scene_format_importer_plugin", 2764104752L), hostObject.objectPtr, scene_format_importer.hostObject, first_priority)

  /** EditorPlugin.remove_scene_format_importer_plugin */
  final def removeSceneFormatImporterPlugin(scene_format_importer: EditorSceneFormatImporter): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_scene_format_importer_plugin", 2637776123L), hostObject.objectPtr, scene_format_importer.hostObject)

  /** EditorPlugin.add_scene_post_import_plugin */
  final def addScenePostImportPlugin(scene_import_plugin: EditorScenePostImportPlugin, first_priority: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorPlugin", "add_scene_post_import_plugin", 3492436322L), hostObject.objectPtr, scene_import_plugin.hostObject, first_priority)

  /** EditorPlugin.remove_scene_post_import_plugin */
  final def removeScenePostImportPlugin(scene_import_plugin: EditorScenePostImportPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_scene_post_import_plugin", 3045178206L), hostObject.objectPtr, scene_import_plugin.hostObject)

  /** EditorPlugin.add_export_plugin */
  final def addExportPlugin(plugin: EditorExportPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "add_export_plugin", 4095952207L), hostObject.objectPtr, plugin.hostObject)

  /** EditorPlugin.remove_export_plugin */
  final def removeExportPlugin(plugin: EditorExportPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_export_plugin", 4095952207L), hostObject.objectPtr, plugin.hostObject)

  /** EditorPlugin.add_export_platform */
  final def addExportPlatform(platform: EditorExportPlatform): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "add_export_platform", 3431312373L), hostObject.objectPtr, platform.hostObject)

  /** EditorPlugin.remove_export_platform */
  final def removeExportPlatform(platform: EditorExportPlatform): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_export_platform", 3431312373L), hostObject.objectPtr, platform.hostObject)

  /** EditorPlugin.add_node_3d_gizmo_plugin */
  final def addNode3dGizmoPlugin(plugin: EditorNode3DGizmoPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "add_node_3d_gizmo_plugin", 1541015022L), hostObject.objectPtr, plugin.hostObject)

  /** EditorPlugin.remove_node_3d_gizmo_plugin */
  final def removeNode3dGizmoPlugin(plugin: EditorNode3DGizmoPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_node_3d_gizmo_plugin", 1541015022L), hostObject.objectPtr, plugin.hostObject)

  /** EditorPlugin.add_inspector_plugin */
  final def addInspectorPlugin(plugin: EditorInspectorPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "add_inspector_plugin", 546395733L), hostObject.objectPtr, plugin.hostObject)

  /** EditorPlugin.remove_inspector_plugin */
  final def removeInspectorPlugin(plugin: EditorInspectorPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_inspector_plugin", 546395733L), hostObject.objectPtr, plugin.hostObject)

  /** EditorPlugin.add_resource_conversion_plugin */
  final def addResourceConversionPlugin(plugin: EditorResourceConversionPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "add_resource_conversion_plugin", 2124849111L), hostObject.objectPtr, plugin.hostObject)

  /** EditorPlugin.remove_resource_conversion_plugin */
  final def removeResourceConversionPlugin(plugin: EditorResourceConversionPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_resource_conversion_plugin", 2124849111L), hostObject.objectPtr, plugin.hostObject)

  /** EditorPlugin.set_input_event_forwarding_always_enabled */
  final def setInputEventForwardingAlwaysEnabled(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorPlugin", "set_input_event_forwarding_always_enabled", 3218959716L), hostObject.objectPtr)

  /** EditorPlugin.set_force_draw_over_forwarding_enabled */
  final def setForceDrawOverForwardingEnabled(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorPlugin", "set_force_draw_over_forwarding_enabled", 3218959716L), hostObject.objectPtr)

  /** EditorPlugin.add_context_menu_plugin */
  final def addContextMenuPlugin(slot: Long, plugin: EditorContextMenuPlugin): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorPlugin", "add_context_menu_plugin", 1904221872L), hostObject.objectPtr, slot, plugin.hostObject)

  /** EditorPlugin.remove_context_menu_plugin */
  final def removeContextMenuPlugin(plugin: EditorContextMenuPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_context_menu_plugin", 2281511854L), hostObject.objectPtr, plugin.hostObject)

  /** EditorPlugin.get_editor_interface */
  final def getEditorInterface(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorPlugin", "get_editor_interface", 4223731786L), hostObject.objectPtr)

  /** EditorPlugin.get_script_create_dialog */
  final def getScriptCreateDialog(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorPlugin", "get_script_create_dialog", 3121871482L), hostObject.objectPtr)

  /** EditorPlugin.add_debugger_plugin */
  final def addDebuggerPlugin(script: EditorDebuggerPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "add_debugger_plugin", 3749880309L), hostObject.objectPtr, script.hostObject)

  /** EditorPlugin.remove_debugger_plugin */
  final def removeDebuggerPlugin(script: EditorDebuggerPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorPlugin", "remove_debugger_plugin", 3749880309L), hostObject.objectPtr, script.hostObject)

  /** EditorPlugin.get_plugin_version */
  final def getPluginVersion(): String =
    Ptrcall.call0[String](MethodBind.get("EditorPlugin", "get_plugin_version", 201670096L), hostObject.objectPtr)

}

object EditorPlugin {
  /** Class metadata for Gd[EditorPlugin] lifetime management and casting. */
  given GodotClass[EditorPlugin] with {
    def className = "EditorPlugin"
    def isRefCounted = false
    def wrap(o: GodotObject): EditorPlugin = new EditorPlugin {}.withHost(o.objectPtr)
    def unwrap(t: EditorPlugin): GodotObject = t.hostObject
  }
}
