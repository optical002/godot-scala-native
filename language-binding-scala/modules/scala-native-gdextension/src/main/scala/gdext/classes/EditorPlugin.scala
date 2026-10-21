package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorPlugin`, extends `Node`. */
abstract class EditorPlugin extends Node {
  override def godotClassName: String = "EditorPlugin"

  /** EditorPlugin.add_dock */
  final def addDock(dock: EditorDock): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_dock == null) gdext.classes.EditorPlugin.mb_add_dock = MethodBind.get("EditorPlugin", "add_dock", 158651717L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_add_dock, livePtr, Wrappers.handle(dock))
  }

  /** EditorPlugin.remove_dock */
  final def removeDock(dock: EditorDock): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_dock == null) gdext.classes.EditorPlugin.mb_remove_dock = MethodBind.get("EditorPlugin", "remove_dock", 158651717L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_dock, livePtr, Wrappers.handle(dock))
  }

  /** EditorPlugin.add_control_to_container */
  final def addControlToContainer(container: Long, control: Control): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_control_to_container == null) gdext.classes.EditorPlugin.mb_add_control_to_container = MethodBind.get("EditorPlugin", "add_control_to_container", 3092750152L)
    Ptrcall.callVoid2(gdext.classes.EditorPlugin.mb_add_control_to_container, livePtr, container, Wrappers.handle(control))
  }

  /** EditorPlugin.remove_control_from_container */
  final def removeControlFromContainer(container: Long, control: Control): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_control_from_container == null) gdext.classes.EditorPlugin.mb_remove_control_from_container = MethodBind.get("EditorPlugin", "remove_control_from_container", 3092750152L)
    Ptrcall.callVoid2(gdext.classes.EditorPlugin.mb_remove_control_from_container, livePtr, container, Wrappers.handle(control))
  }

  /** EditorPlugin.add_tool_submenu_item */
  final def addToolSubmenuItem(name: String, submenu: PopupMenu): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_tool_submenu_item == null) gdext.classes.EditorPlugin.mb_add_tool_submenu_item = MethodBind.get("EditorPlugin", "add_tool_submenu_item", 1019428915L)
    Ptrcall.callVoid2(gdext.classes.EditorPlugin.mb_add_tool_submenu_item, livePtr, name, Wrappers.handle(submenu))
  }

  /** EditorPlugin.remove_tool_menu_item */
  final def removeToolMenuItem(name: String): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_tool_menu_item == null) gdext.classes.EditorPlugin.mb_remove_tool_menu_item = MethodBind.get("EditorPlugin", "remove_tool_menu_item", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_tool_menu_item, livePtr, name)
  }

  /** EditorPlugin.get_export_as_menu */
  final def getExportAsMenu(): PopupMenu = {
    if (gdext.classes.EditorPlugin.mb_get_export_as_menu == null) gdext.classes.EditorPlugin.mb_get_export_as_menu = MethodBind.get("EditorPlugin", "get_export_as_menu", 1775878644L)
    Wrappers.borrowed[PopupMenu](Ptrcall.call0[Long](gdext.classes.EditorPlugin.mb_get_export_as_menu, livePtr))
  }

  /** EditorPlugin.add_custom_type */
  final def addCustomType(`type`: String, base: String, script: Script, icon: Texture2D): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_custom_type == null) gdext.classes.EditorPlugin.mb_add_custom_type = MethodBind.get("EditorPlugin", "add_custom_type", 1986814599L)
    Ptrcall.callVoid4(gdext.classes.EditorPlugin.mb_add_custom_type, livePtr, `type`, base, Wrappers.handle(script), Wrappers.handle(icon))
  }

  /** EditorPlugin.remove_custom_type */
  final def removeCustomType(`type`: String): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_custom_type == null) gdext.classes.EditorPlugin.mb_remove_custom_type = MethodBind.get("EditorPlugin", "remove_custom_type", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_custom_type, livePtr, `type`)
  }

  /** EditorPlugin.add_control_to_dock */
  final def addControlToDock(slot: Long, control: Control, shortcut: Shortcut): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_control_to_dock == null) gdext.classes.EditorPlugin.mb_add_control_to_dock = MethodBind.get("EditorPlugin", "add_control_to_dock", 2994930786L)
    Ptrcall.callVoid3(gdext.classes.EditorPlugin.mb_add_control_to_dock, livePtr, slot, Wrappers.handle(control), Wrappers.handle(shortcut))
  }

  /** EditorPlugin.remove_control_from_docks */
  final def removeControlFromDocks(control: Control): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_control_from_docks == null) gdext.classes.EditorPlugin.mb_remove_control_from_docks = MethodBind.get("EditorPlugin", "remove_control_from_docks", 1496901182L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_control_from_docks, livePtr, Wrappers.handle(control))
  }

  /** EditorPlugin.set_dock_tab_icon */
  final def setDockTabIcon(control: Control, icon: Texture2D): Unit = {
    if (gdext.classes.EditorPlugin.mb_set_dock_tab_icon == null) gdext.classes.EditorPlugin.mb_set_dock_tab_icon = MethodBind.get("EditorPlugin", "set_dock_tab_icon", 3450529724L)
    Ptrcall.callVoid2(gdext.classes.EditorPlugin.mb_set_dock_tab_icon, livePtr, Wrappers.handle(control), Wrappers.handle(icon))
  }

  /** EditorPlugin.add_control_to_bottom_panel */
  final def addControlToBottomPanel(control: Control, title: String, shortcut: Shortcut): Button = {
    if (gdext.classes.EditorPlugin.mb_add_control_to_bottom_panel == null) gdext.classes.EditorPlugin.mb_add_control_to_bottom_panel = MethodBind.get("EditorPlugin", "add_control_to_bottom_panel", 111032269L)
    Wrappers.borrowed[Button](Ptrcall.call3[GodotObject, String, GodotObject, Long](gdext.classes.EditorPlugin.mb_add_control_to_bottom_panel, livePtr, Wrappers.handle(control), title, Wrappers.handle(shortcut)))
  }

  /** EditorPlugin.remove_control_from_bottom_panel */
  final def removeControlFromBottomPanel(control: Control): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_control_from_bottom_panel == null) gdext.classes.EditorPlugin.mb_remove_control_from_bottom_panel = MethodBind.get("EditorPlugin", "remove_control_from_bottom_panel", 1496901182L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_control_from_bottom_panel, livePtr, Wrappers.handle(control))
  }

  /** EditorPlugin.add_autoload_singleton */
  final def addAutoloadSingleton(name: String, path: String): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_autoload_singleton == null) gdext.classes.EditorPlugin.mb_add_autoload_singleton = MethodBind.get("EditorPlugin", "add_autoload_singleton", 3186203200L)
    Ptrcall.callVoid2(gdext.classes.EditorPlugin.mb_add_autoload_singleton, livePtr, name, path)
  }

  /** EditorPlugin.remove_autoload_singleton */
  final def removeAutoloadSingleton(name: String): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_autoload_singleton == null) gdext.classes.EditorPlugin.mb_remove_autoload_singleton = MethodBind.get("EditorPlugin", "remove_autoload_singleton", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_autoload_singleton, livePtr, name)
  }

  /** EditorPlugin.update_overlays */
  final def updateOverlays(): Long = {
    if (gdext.classes.EditorPlugin.mb_update_overlays == null) gdext.classes.EditorPlugin.mb_update_overlays = MethodBind.get("EditorPlugin", "update_overlays", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.EditorPlugin.mb_update_overlays, livePtr)
  }

  /** EditorPlugin.make_bottom_panel_item_visible */
  final def makeBottomPanelItemVisible(item: Control): Unit = {
    if (gdext.classes.EditorPlugin.mb_make_bottom_panel_item_visible == null) gdext.classes.EditorPlugin.mb_make_bottom_panel_item_visible = MethodBind.get("EditorPlugin", "make_bottom_panel_item_visible", 1496901182L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_make_bottom_panel_item_visible, livePtr, Wrappers.handle(item))
  }

  /** EditorPlugin.hide_bottom_panel */
  final def hideBottomPanel(): Unit = {
    if (gdext.classes.EditorPlugin.mb_hide_bottom_panel == null) gdext.classes.EditorPlugin.mb_hide_bottom_panel = MethodBind.get("EditorPlugin", "hide_bottom_panel", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorPlugin.mb_hide_bottom_panel, livePtr)
  }

  /** EditorPlugin.get_undo_redo */
  final def getUndoRedo(): EditorUndoRedoManager = {
    if (gdext.classes.EditorPlugin.mb_get_undo_redo == null) gdext.classes.EditorPlugin.mb_get_undo_redo = MethodBind.get("EditorPlugin", "get_undo_redo", 773492341L)
    Wrappers.borrowed[EditorUndoRedoManager](Ptrcall.call0[Long](gdext.classes.EditorPlugin.mb_get_undo_redo, livePtr))
  }

  /** EditorPlugin.queue_save_layout */
  final def queueSaveLayout(): Unit = {
    if (gdext.classes.EditorPlugin.mb_queue_save_layout == null) gdext.classes.EditorPlugin.mb_queue_save_layout = MethodBind.get("EditorPlugin", "queue_save_layout", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorPlugin.mb_queue_save_layout, livePtr)
  }

  /** EditorPlugin.add_translation_parser_plugin */
  final def addTranslationParserPlugin(parser: EditorTranslationParserPlugin): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_translation_parser_plugin == null) gdext.classes.EditorPlugin.mb_add_translation_parser_plugin = MethodBind.get("EditorPlugin", "add_translation_parser_plugin", 3116463128L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_add_translation_parser_plugin, livePtr, Wrappers.handle(parser))
  }

  /** EditorPlugin.remove_translation_parser_plugin */
  final def removeTranslationParserPlugin(parser: EditorTranslationParserPlugin): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_translation_parser_plugin == null) gdext.classes.EditorPlugin.mb_remove_translation_parser_plugin = MethodBind.get("EditorPlugin", "remove_translation_parser_plugin", 3116463128L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_translation_parser_plugin, livePtr, Wrappers.handle(parser))
  }

  /** EditorPlugin.add_import_plugin */
  final def addImportPlugin(importer: EditorImportPlugin, first_priority: Boolean): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_import_plugin == null) gdext.classes.EditorPlugin.mb_add_import_plugin = MethodBind.get("EditorPlugin", "add_import_plugin", 3113975762L)
    Ptrcall.callVoid2(gdext.classes.EditorPlugin.mb_add_import_plugin, livePtr, Wrappers.handle(importer), first_priority)
  }

  /** EditorPlugin.remove_import_plugin */
  final def removeImportPlugin(importer: EditorImportPlugin): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_import_plugin == null) gdext.classes.EditorPlugin.mb_remove_import_plugin = MethodBind.get("EditorPlugin", "remove_import_plugin", 2312482773L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_import_plugin, livePtr, Wrappers.handle(importer))
  }

  /** EditorPlugin.add_scene_format_importer_plugin */
  final def addSceneFormatImporterPlugin(scene_format_importer: EditorSceneFormatImporter, first_priority: Boolean): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_scene_format_importer_plugin == null) gdext.classes.EditorPlugin.mb_add_scene_format_importer_plugin = MethodBind.get("EditorPlugin", "add_scene_format_importer_plugin", 2764104752L)
    Ptrcall.callVoid2(gdext.classes.EditorPlugin.mb_add_scene_format_importer_plugin, livePtr, Wrappers.handle(scene_format_importer), first_priority)
  }

  /** EditorPlugin.remove_scene_format_importer_plugin */
  final def removeSceneFormatImporterPlugin(scene_format_importer: EditorSceneFormatImporter): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_scene_format_importer_plugin == null) gdext.classes.EditorPlugin.mb_remove_scene_format_importer_plugin = MethodBind.get("EditorPlugin", "remove_scene_format_importer_plugin", 2637776123L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_scene_format_importer_plugin, livePtr, Wrappers.handle(scene_format_importer))
  }

  /** EditorPlugin.add_scene_post_import_plugin */
  final def addScenePostImportPlugin(scene_import_plugin: EditorScenePostImportPlugin, first_priority: Boolean): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_scene_post_import_plugin == null) gdext.classes.EditorPlugin.mb_add_scene_post_import_plugin = MethodBind.get("EditorPlugin", "add_scene_post_import_plugin", 3492436322L)
    Ptrcall.callVoid2(gdext.classes.EditorPlugin.mb_add_scene_post_import_plugin, livePtr, Wrappers.handle(scene_import_plugin), first_priority)
  }

  /** EditorPlugin.remove_scene_post_import_plugin */
  final def removeScenePostImportPlugin(scene_import_plugin: EditorScenePostImportPlugin): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_scene_post_import_plugin == null) gdext.classes.EditorPlugin.mb_remove_scene_post_import_plugin = MethodBind.get("EditorPlugin", "remove_scene_post_import_plugin", 3045178206L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_scene_post_import_plugin, livePtr, Wrappers.handle(scene_import_plugin))
  }

  /** EditorPlugin.add_export_plugin */
  final def addExportPlugin(plugin: EditorExportPlugin): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_export_plugin == null) gdext.classes.EditorPlugin.mb_add_export_plugin = MethodBind.get("EditorPlugin", "add_export_plugin", 4095952207L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_add_export_plugin, livePtr, Wrappers.handle(plugin))
  }

  /** EditorPlugin.remove_export_plugin */
  final def removeExportPlugin(plugin: EditorExportPlugin): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_export_plugin == null) gdext.classes.EditorPlugin.mb_remove_export_plugin = MethodBind.get("EditorPlugin", "remove_export_plugin", 4095952207L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_export_plugin, livePtr, Wrappers.handle(plugin))
  }

  /** EditorPlugin.add_export_platform */
  final def addExportPlatform(platform: EditorExportPlatform): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_export_platform == null) gdext.classes.EditorPlugin.mb_add_export_platform = MethodBind.get("EditorPlugin", "add_export_platform", 3431312373L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_add_export_platform, livePtr, Wrappers.handle(platform))
  }

  /** EditorPlugin.remove_export_platform */
  final def removeExportPlatform(platform: EditorExportPlatform): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_export_platform == null) gdext.classes.EditorPlugin.mb_remove_export_platform = MethodBind.get("EditorPlugin", "remove_export_platform", 3431312373L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_export_platform, livePtr, Wrappers.handle(platform))
  }

  /** EditorPlugin.add_node_3d_gizmo_plugin */
  final def addNode3dGizmoPlugin(plugin: EditorNode3DGizmoPlugin): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_node_3d_gizmo_plugin == null) gdext.classes.EditorPlugin.mb_add_node_3d_gizmo_plugin = MethodBind.get("EditorPlugin", "add_node_3d_gizmo_plugin", 1541015022L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_add_node_3d_gizmo_plugin, livePtr, Wrappers.handle(plugin))
  }

  /** EditorPlugin.remove_node_3d_gizmo_plugin */
  final def removeNode3dGizmoPlugin(plugin: EditorNode3DGizmoPlugin): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_node_3d_gizmo_plugin == null) gdext.classes.EditorPlugin.mb_remove_node_3d_gizmo_plugin = MethodBind.get("EditorPlugin", "remove_node_3d_gizmo_plugin", 1541015022L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_node_3d_gizmo_plugin, livePtr, Wrappers.handle(plugin))
  }

  /** EditorPlugin.add_inspector_plugin */
  final def addInspectorPlugin(plugin: EditorInspectorPlugin): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_inspector_plugin == null) gdext.classes.EditorPlugin.mb_add_inspector_plugin = MethodBind.get("EditorPlugin", "add_inspector_plugin", 546395733L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_add_inspector_plugin, livePtr, Wrappers.handle(plugin))
  }

  /** EditorPlugin.remove_inspector_plugin */
  final def removeInspectorPlugin(plugin: EditorInspectorPlugin): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_inspector_plugin == null) gdext.classes.EditorPlugin.mb_remove_inspector_plugin = MethodBind.get("EditorPlugin", "remove_inspector_plugin", 546395733L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_inspector_plugin, livePtr, Wrappers.handle(plugin))
  }

  /** EditorPlugin.add_resource_conversion_plugin */
  final def addResourceConversionPlugin(plugin: EditorResourceConversionPlugin): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_resource_conversion_plugin == null) gdext.classes.EditorPlugin.mb_add_resource_conversion_plugin = MethodBind.get("EditorPlugin", "add_resource_conversion_plugin", 2124849111L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_add_resource_conversion_plugin, livePtr, Wrappers.handle(plugin))
  }

  /** EditorPlugin.remove_resource_conversion_plugin */
  final def removeResourceConversionPlugin(plugin: EditorResourceConversionPlugin): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_resource_conversion_plugin == null) gdext.classes.EditorPlugin.mb_remove_resource_conversion_plugin = MethodBind.get("EditorPlugin", "remove_resource_conversion_plugin", 2124849111L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_resource_conversion_plugin, livePtr, Wrappers.handle(plugin))
  }

  /** EditorPlugin.set_input_event_forwarding_always_enabled */
  final def setInputEventForwardingAlwaysEnabled(): Unit = {
    if (gdext.classes.EditorPlugin.mb_set_input_event_forwarding_always_enabled == null) gdext.classes.EditorPlugin.mb_set_input_event_forwarding_always_enabled = MethodBind.get("EditorPlugin", "set_input_event_forwarding_always_enabled", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorPlugin.mb_set_input_event_forwarding_always_enabled, livePtr)
  }

  /** EditorPlugin.set_force_draw_over_forwarding_enabled */
  final def setForceDrawOverForwardingEnabled(): Unit = {
    if (gdext.classes.EditorPlugin.mb_set_force_draw_over_forwarding_enabled == null) gdext.classes.EditorPlugin.mb_set_force_draw_over_forwarding_enabled = MethodBind.get("EditorPlugin", "set_force_draw_over_forwarding_enabled", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorPlugin.mb_set_force_draw_over_forwarding_enabled, livePtr)
  }

  /** EditorPlugin.add_context_menu_plugin */
  final def addContextMenuPlugin(slot: Long, plugin: EditorContextMenuPlugin): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_context_menu_plugin == null) gdext.classes.EditorPlugin.mb_add_context_menu_plugin = MethodBind.get("EditorPlugin", "add_context_menu_plugin", 1904221872L)
    Ptrcall.callVoid2(gdext.classes.EditorPlugin.mb_add_context_menu_plugin, livePtr, slot, Wrappers.handle(plugin))
  }

  /** EditorPlugin.remove_context_menu_plugin */
  final def removeContextMenuPlugin(plugin: EditorContextMenuPlugin): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_context_menu_plugin == null) gdext.classes.EditorPlugin.mb_remove_context_menu_plugin = MethodBind.get("EditorPlugin", "remove_context_menu_plugin", 2281511854L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_context_menu_plugin, livePtr, Wrappers.handle(plugin))
  }

  /** EditorPlugin.get_editor_interface */
  final def getEditorInterface(): EditorInterface = {
    if (gdext.classes.EditorPlugin.mb_get_editor_interface == null) gdext.classes.EditorPlugin.mb_get_editor_interface = MethodBind.get("EditorPlugin", "get_editor_interface", 4223731786L)
    Wrappers.borrowed[EditorInterface](Ptrcall.call0[Long](gdext.classes.EditorPlugin.mb_get_editor_interface, livePtr))
  }

  /** EditorPlugin.get_script_create_dialog */
  final def getScriptCreateDialog(): ScriptCreateDialog = {
    if (gdext.classes.EditorPlugin.mb_get_script_create_dialog == null) gdext.classes.EditorPlugin.mb_get_script_create_dialog = MethodBind.get("EditorPlugin", "get_script_create_dialog", 3121871482L)
    Wrappers.borrowed[ScriptCreateDialog](Ptrcall.call0[Long](gdext.classes.EditorPlugin.mb_get_script_create_dialog, livePtr))
  }

  /** EditorPlugin.add_debugger_plugin */
  final def addDebuggerPlugin(script: EditorDebuggerPlugin): Unit = {
    if (gdext.classes.EditorPlugin.mb_add_debugger_plugin == null) gdext.classes.EditorPlugin.mb_add_debugger_plugin = MethodBind.get("EditorPlugin", "add_debugger_plugin", 3749880309L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_add_debugger_plugin, livePtr, Wrappers.handle(script))
  }

  /** EditorPlugin.remove_debugger_plugin */
  final def removeDebuggerPlugin(script: EditorDebuggerPlugin): Unit = {
    if (gdext.classes.EditorPlugin.mb_remove_debugger_plugin == null) gdext.classes.EditorPlugin.mb_remove_debugger_plugin = MethodBind.get("EditorPlugin", "remove_debugger_plugin", 3749880309L)
    Ptrcall.callVoid1(gdext.classes.EditorPlugin.mb_remove_debugger_plugin, livePtr, Wrappers.handle(script))
  }

  /** EditorPlugin.get_plugin_version */
  final def getPluginVersion(): String = {
    if (gdext.classes.EditorPlugin.mb_get_plugin_version == null) gdext.classes.EditorPlugin.mb_get_plugin_version = MethodBind.get("EditorPlugin", "get_plugin_version", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorPlugin.mb_get_plugin_version, livePtr)
  }

}

object EditorPlugin {
  private[classes] var mb_add_dock: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_dock: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_control_to_container: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_control_from_container: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_tool_submenu_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_tool_menu_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_export_as_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_custom_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_custom_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_control_to_dock: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_control_from_docks: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dock_tab_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_control_to_bottom_panel: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_control_from_bottom_panel: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_autoload_singleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_autoload_singleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_update_overlays: GDExtensionMethodBindPtr = null
  private[classes] var mb_make_bottom_panel_item_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_hide_bottom_panel: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_undo_redo: GDExtensionMethodBindPtr = null
  private[classes] var mb_queue_save_layout: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_translation_parser_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_translation_parser_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_import_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_import_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_scene_format_importer_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_scene_format_importer_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_scene_post_import_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_scene_post_import_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_export_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_export_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_export_platform: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_export_platform: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_node_3d_gizmo_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_node_3d_gizmo_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_inspector_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_inspector_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_resource_conversion_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_resource_conversion_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_input_event_forwarding_always_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_force_draw_over_forwarding_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_context_menu_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_context_menu_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_editor_interface: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_script_create_dialog: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_debugger_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_debugger_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_plugin_version: GDExtensionMethodBindPtr = null
}
