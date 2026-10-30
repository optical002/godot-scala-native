package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorInterface`, extends `Object`. */
abstract class EditorInterface extends Object {
  override def godotClassName: String = "EditorInterface"

  /** EditorInterface.restart_editor */
  final def restartEditor(save: Boolean = true): Unit = {
    if (gdext.classes.EditorInterface.mb_restart_editor == null) gdext.classes.EditorInterface.mb_restart_editor = MethodBind.get("EditorInterface", "restart_editor", 3216645846L)
    Ptrcall.callVoid1(gdext.classes.EditorInterface.mb_restart_editor, livePtr, save)
  }

  /** EditorInterface.get_command_palette */
  final def getCommandPalette(): EditorCommandPalette = {
    if (gdext.classes.EditorInterface.mb_get_command_palette == null) gdext.classes.EditorInterface.mb_get_command_palette = MethodBind.get("EditorInterface", "get_command_palette", 2471163807L)
    Wrappers.borrowed[EditorCommandPalette](Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_get_command_palette, livePtr))
  }

  /** EditorInterface.get_resource_filesystem */
  final def getResourceFilesystem(): EditorFileSystem = {
    if (gdext.classes.EditorInterface.mb_get_resource_filesystem == null) gdext.classes.EditorInterface.mb_get_resource_filesystem = MethodBind.get("EditorInterface", "get_resource_filesystem", 780151678L)
    Wrappers.borrowed[EditorFileSystem](Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_get_resource_filesystem, livePtr))
  }

  /** EditorInterface.get_editor_paths */
  final def getEditorPaths(): EditorPaths = {
    if (gdext.classes.EditorInterface.mb_get_editor_paths == null) gdext.classes.EditorInterface.mb_get_editor_paths = MethodBind.get("EditorInterface", "get_editor_paths", 1595760068L)
    Wrappers.borrowed[EditorPaths](Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_get_editor_paths, livePtr))
  }

  /** EditorInterface.get_resource_previewer */
  final def getResourcePreviewer(): EditorResourcePreview = {
    if (gdext.classes.EditorInterface.mb_get_resource_previewer == null) gdext.classes.EditorInterface.mb_get_resource_previewer = MethodBind.get("EditorInterface", "get_resource_previewer", 943486957L)
    Wrappers.borrowed[EditorResourcePreview](Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_get_resource_previewer, livePtr))
  }

  /** EditorInterface.get_selection */
  final def getSelection(): EditorSelection = {
    if (gdext.classes.EditorInterface.mb_get_selection == null) gdext.classes.EditorInterface.mb_get_selection = MethodBind.get("EditorInterface", "get_selection", 2690272531L)
    Wrappers.borrowed[EditorSelection](Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_get_selection, livePtr))
  }

  /** EditorInterface.get_editor_settings. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getEditorSettings(): EditorSettings = {
    if (gdext.classes.EditorInterface.mb_get_editor_settings == null) gdext.classes.EditorInterface.mb_get_editor_settings = MethodBind.get("EditorInterface", "get_editor_settings", 4086932459L)
    Wrappers.owned[EditorSettings](Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_get_editor_settings, livePtr))
  }

  /** EditorInterface.get_editor_toaster */
  final def getEditorToaster(): EditorToaster = {
    if (gdext.classes.EditorInterface.mb_get_editor_toaster == null) gdext.classes.EditorInterface.mb_get_editor_toaster = MethodBind.get("EditorInterface", "get_editor_toaster", 3612675797L)
    Wrappers.borrowed[EditorToaster](Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_get_editor_toaster, livePtr))
  }

  /** EditorInterface.get_editor_undo_redo */
  final def getEditorUndoRedo(): EditorUndoRedoManager = {
    if (gdext.classes.EditorInterface.mb_get_editor_undo_redo == null) gdext.classes.EditorInterface.mb_get_editor_undo_redo = MethodBind.get("EditorInterface", "get_editor_undo_redo", 3819628421L)
    Wrappers.borrowed[EditorUndoRedoManager](Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_get_editor_undo_redo, livePtr))
  }

  /** EditorInterface.set_plugin_enabled */
  final def setPluginEnabled(plugin: String, enabled: Boolean): Unit = {
    if (gdext.classes.EditorInterface.mb_set_plugin_enabled == null) gdext.classes.EditorInterface.mb_set_plugin_enabled = MethodBind.get("EditorInterface", "set_plugin_enabled", 2678287736L)
    Ptrcall.callVoid2(gdext.classes.EditorInterface.mb_set_plugin_enabled, livePtr, plugin, enabled)
  }

  /** EditorInterface.is_plugin_enabled */
  final def isPluginEnabled(plugin: String): Boolean = {
    if (gdext.classes.EditorInterface.mb_is_plugin_enabled == null) gdext.classes.EditorInterface.mb_is_plugin_enabled = MethodBind.get("EditorInterface", "is_plugin_enabled", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.EditorInterface.mb_is_plugin_enabled, livePtr, plugin)
  }

  /** EditorInterface.get_editor_theme. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getEditorTheme(): Theme = {
    if (gdext.classes.EditorInterface.mb_get_editor_theme == null) gdext.classes.EditorInterface.mb_get_editor_theme = MethodBind.get("EditorInterface", "get_editor_theme", 3846893731L)
    Wrappers.owned[Theme](Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_get_editor_theme, livePtr))
  }

  /** EditorInterface.get_base_control */
  final def getBaseControl(): Control = {
    if (gdext.classes.EditorInterface.mb_get_base_control == null) gdext.classes.EditorInterface.mb_get_base_control = MethodBind.get("EditorInterface", "get_base_control", 2783021301L)
    Wrappers.borrowed[Control](Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_get_base_control, livePtr))
  }

  /** EditorInterface.get_editor_main_screen */
  final def getEditorMainScreen(): VBoxContainer = {
    if (gdext.classes.EditorInterface.mb_get_editor_main_screen == null) gdext.classes.EditorInterface.mb_get_editor_main_screen = MethodBind.get("EditorInterface", "get_editor_main_screen", 1706218421L)
    Wrappers.borrowed[VBoxContainer](Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_get_editor_main_screen, livePtr))
  }

  /** EditorInterface.get_script_editor */
  final def getScriptEditor(): ScriptEditor = {
    if (gdext.classes.EditorInterface.mb_get_script_editor == null) gdext.classes.EditorInterface.mb_get_script_editor = MethodBind.get("EditorInterface", "get_script_editor", 90868003L)
    Wrappers.borrowed[ScriptEditor](Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_get_script_editor, livePtr))
  }

  /** EditorInterface.get_editor_viewport_2d */
  final def getEditorViewport2d(): SubViewport = {
    if (gdext.classes.EditorInterface.mb_get_editor_viewport_2d == null) gdext.classes.EditorInterface.mb_get_editor_viewport_2d = MethodBind.get("EditorInterface", "get_editor_viewport_2d", 3750751911L)
    Wrappers.borrowed[SubViewport](Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_get_editor_viewport_2d, livePtr))
  }

  /** EditorInterface.get_editor_viewport_3d */
  final def getEditorViewport3d(idx: Long = 0L): SubViewport = {
    if (gdext.classes.EditorInterface.mb_get_editor_viewport_3d == null) gdext.classes.EditorInterface.mb_get_editor_viewport_3d = MethodBind.get("EditorInterface", "get_editor_viewport_3d", 1970834490L)
    Wrappers.borrowed[SubViewport](Ptrcall.call1[Long, Long](gdext.classes.EditorInterface.mb_get_editor_viewport_3d, livePtr, idx))
  }

  /** EditorInterface.set_main_screen_editor */
  final def setMainScreenEditor(name: String): Unit = {
    if (gdext.classes.EditorInterface.mb_set_main_screen_editor == null) gdext.classes.EditorInterface.mb_set_main_screen_editor = MethodBind.get("EditorInterface", "set_main_screen_editor", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorInterface.mb_set_main_screen_editor, livePtr, name)
  }

  /** EditorInterface.set_distraction_free_mode */
  final def setDistractionFreeMode(enter: Boolean): Unit = {
    if (gdext.classes.EditorInterface.mb_set_distraction_free_mode == null) gdext.classes.EditorInterface.mb_set_distraction_free_mode = MethodBind.get("EditorInterface", "set_distraction_free_mode", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorInterface.mb_set_distraction_free_mode, livePtr, enter)
  }

  /** EditorInterface.is_distraction_free_mode_enabled */
  final def isDistractionFreeModeEnabled(): Boolean = {
    if (gdext.classes.EditorInterface.mb_is_distraction_free_mode_enabled == null) gdext.classes.EditorInterface.mb_is_distraction_free_mode_enabled = MethodBind.get("EditorInterface", "is_distraction_free_mode_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorInterface.mb_is_distraction_free_mode_enabled, livePtr)
  }

  /** EditorInterface.is_multi_window_enabled */
  final def isMultiWindowEnabled(): Boolean = {
    if (gdext.classes.EditorInterface.mb_is_multi_window_enabled == null) gdext.classes.EditorInterface.mb_is_multi_window_enabled = MethodBind.get("EditorInterface", "is_multi_window_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorInterface.mb_is_multi_window_enabled, livePtr)
  }

  /** EditorInterface.get_editor_scale */
  final def getEditorScale(): Double = {
    if (gdext.classes.EditorInterface.mb_get_editor_scale == null) gdext.classes.EditorInterface.mb_get_editor_scale = MethodBind.get("EditorInterface", "get_editor_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.EditorInterface.mb_get_editor_scale, livePtr)
  }

  /** EditorInterface.get_editor_language */
  final def getEditorLanguage(): String = {
    if (gdext.classes.EditorInterface.mb_get_editor_language == null) gdext.classes.EditorInterface.mb_get_editor_language = MethodBind.get("EditorInterface", "get_editor_language", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorInterface.mb_get_editor_language, livePtr)
  }

  /** EditorInterface.is_node_3d_snap_enabled */
  final def isNode3dSnapEnabled(): Boolean = {
    if (gdext.classes.EditorInterface.mb_is_node_3d_snap_enabled == null) gdext.classes.EditorInterface.mb_is_node_3d_snap_enabled = MethodBind.get("EditorInterface", "is_node_3d_snap_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorInterface.mb_is_node_3d_snap_enabled, livePtr)
  }

  /** EditorInterface.get_node_3d_translate_snap */
  final def getNode3dTranslateSnap(): Double = {
    if (gdext.classes.EditorInterface.mb_get_node_3d_translate_snap == null) gdext.classes.EditorInterface.mb_get_node_3d_translate_snap = MethodBind.get("EditorInterface", "get_node_3d_translate_snap", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.EditorInterface.mb_get_node_3d_translate_snap, livePtr)
  }

  /** EditorInterface.get_node_3d_rotate_snap */
  final def getNode3dRotateSnap(): Double = {
    if (gdext.classes.EditorInterface.mb_get_node_3d_rotate_snap == null) gdext.classes.EditorInterface.mb_get_node_3d_rotate_snap = MethodBind.get("EditorInterface", "get_node_3d_rotate_snap", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.EditorInterface.mb_get_node_3d_rotate_snap, livePtr)
  }

  /** EditorInterface.get_node_3d_scale_snap */
  final def getNode3dScaleSnap(): Double = {
    if (gdext.classes.EditorInterface.mb_get_node_3d_scale_snap == null) gdext.classes.EditorInterface.mb_get_node_3d_scale_snap = MethodBind.get("EditorInterface", "get_node_3d_scale_snap", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.EditorInterface.mb_get_node_3d_scale_snap, livePtr)
  }

  /** EditorInterface.popup_dialog */
  final def popupDialog(dialog: Window, rect: gdext.builtin.Rect2i): Unit = {
    if (gdext.classes.EditorInterface.mb_popup_dialog == null) gdext.classes.EditorInterface.mb_popup_dialog = MethodBind.get("EditorInterface", "popup_dialog", 2015770942L)
    Ptrcall.callVoid2(gdext.classes.EditorInterface.mb_popup_dialog, livePtr, Wrappers.handle(dialog), rect)
  }

  /** EditorInterface.popup_dialog_centered */
  final def popupDialogCentered(dialog: Window, minsize: gdext.builtin.Vector2i = gdext.builtin.Vector2i(0, 0)): Unit = {
    if (gdext.classes.EditorInterface.mb_popup_dialog_centered == null) gdext.classes.EditorInterface.mb_popup_dialog_centered = MethodBind.get("EditorInterface", "popup_dialog_centered", 346557367L)
    Ptrcall.callVoid2(gdext.classes.EditorInterface.mb_popup_dialog_centered, livePtr, Wrappers.handle(dialog), minsize)
  }

  /** EditorInterface.popup_dialog_centered_ratio */
  final def popupDialogCenteredRatio(dialog: Window, ratio: Double = 0.8): Unit = {
    if (gdext.classes.EditorInterface.mb_popup_dialog_centered_ratio == null) gdext.classes.EditorInterface.mb_popup_dialog_centered_ratio = MethodBind.get("EditorInterface", "popup_dialog_centered_ratio", 2093669136L)
    Ptrcall.callVoid2(gdext.classes.EditorInterface.mb_popup_dialog_centered_ratio, livePtr, Wrappers.handle(dialog), ratio)
  }

  /** EditorInterface.popup_dialog_centered_clamped */
  final def popupDialogCenteredClamped(dialog: Window, minsize: gdext.builtin.Vector2i = gdext.builtin.Vector2i(0, 0), fallbackRatio: Double = 0.75): Unit = {
    if (gdext.classes.EditorInterface.mb_popup_dialog_centered_clamped == null) gdext.classes.EditorInterface.mb_popup_dialog_centered_clamped = MethodBind.get("EditorInterface", "popup_dialog_centered_clamped", 3763385571L)
    Ptrcall.callVoid3(gdext.classes.EditorInterface.mb_popup_dialog_centered_clamped, livePtr, Wrappers.handle(dialog), minsize, fallbackRatio)
  }

  /** EditorInterface.get_current_feature_profile */
  final def getCurrentFeatureProfile(): String = {
    if (gdext.classes.EditorInterface.mb_get_current_feature_profile == null) gdext.classes.EditorInterface.mb_get_current_feature_profile = MethodBind.get("EditorInterface", "get_current_feature_profile", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorInterface.mb_get_current_feature_profile, livePtr)
  }

  /** EditorInterface.set_current_feature_profile */
  final def setCurrentFeatureProfile(profileName: String): Unit = {
    if (gdext.classes.EditorInterface.mb_set_current_feature_profile == null) gdext.classes.EditorInterface.mb_set_current_feature_profile = MethodBind.get("EditorInterface", "set_current_feature_profile", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorInterface.mb_set_current_feature_profile, livePtr, profileName)
  }

  /** EditorInterface.get_file_system_dock */
  final def getFileSystemDock(): FileSystemDock = {
    if (gdext.classes.EditorInterface.mb_get_file_system_dock == null) gdext.classes.EditorInterface.mb_get_file_system_dock = MethodBind.get("EditorInterface", "get_file_system_dock", 3751012327L)
    Wrappers.borrowed[FileSystemDock](Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_get_file_system_dock, livePtr))
  }

  /** EditorInterface.select_file */
  final def selectFile(file: String): Unit = {
    if (gdext.classes.EditorInterface.mb_select_file == null) gdext.classes.EditorInterface.mb_select_file = MethodBind.get("EditorInterface", "select_file", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorInterface.mb_select_file, livePtr, file)
  }

  /** EditorInterface.get_current_path */
  final def getCurrentPath(): String = {
    if (gdext.classes.EditorInterface.mb_get_current_path == null) gdext.classes.EditorInterface.mb_get_current_path = MethodBind.get("EditorInterface", "get_current_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorInterface.mb_get_current_path, livePtr)
  }

  /** EditorInterface.get_current_directory */
  final def getCurrentDirectory(): String = {
    if (gdext.classes.EditorInterface.mb_get_current_directory == null) gdext.classes.EditorInterface.mb_get_current_directory = MethodBind.get("EditorInterface", "get_current_directory", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorInterface.mb_get_current_directory, livePtr)
  }

  /** EditorInterface.get_inspector */
  final def getInspector(): EditorInspector = {
    if (gdext.classes.EditorInterface.mb_get_inspector == null) gdext.classes.EditorInterface.mb_get_inspector = MethodBind.get("EditorInterface", "get_inspector", 3517113938L)
    Wrappers.borrowed[EditorInspector](Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_get_inspector, livePtr))
  }

  /** EditorInterface.inspect_object */
  final def inspectObject(`object`: Object, forProperty: String = "", inspectorOnly: Boolean = false): Unit = {
    if (gdext.classes.EditorInterface.mb_inspect_object == null) gdext.classes.EditorInterface.mb_inspect_object = MethodBind.get("EditorInterface", "inspect_object", 127962172L)
    Ptrcall.callVoid3(gdext.classes.EditorInterface.mb_inspect_object, livePtr, Wrappers.handle(`object`), forProperty, inspectorOnly)
  }

  /** EditorInterface.edit_resource */
  final def editResource(resource: Resource): Unit = {
    if (gdext.classes.EditorInterface.mb_edit_resource == null) gdext.classes.EditorInterface.mb_edit_resource = MethodBind.get("EditorInterface", "edit_resource", 968641751L)
    Ptrcall.callVoid1(gdext.classes.EditorInterface.mb_edit_resource, livePtr, Wrappers.handle(resource))
  }

  /** EditorInterface.edit_node */
  final def editNode(node: Node): Unit = {
    if (gdext.classes.EditorInterface.mb_edit_node == null) gdext.classes.EditorInterface.mb_edit_node = MethodBind.get("EditorInterface", "edit_node", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.EditorInterface.mb_edit_node, livePtr, Wrappers.handle(node))
  }

  /** EditorInterface.edit_script */
  final def editScript(script: Script, line: Long = -1L, column: Long = 0L, grabFocus: Boolean = true): Unit = {
    if (gdext.classes.EditorInterface.mb_edit_script == null) gdext.classes.EditorInterface.mb_edit_script = MethodBind.get("EditorInterface", "edit_script", 219829402L)
    Ptrcall.callVoid4(gdext.classes.EditorInterface.mb_edit_script, livePtr, Wrappers.handle(script), line, column, grabFocus)
  }

  /** EditorInterface.open_scene_from_path */
  final def openSceneFromPath(sceneFilepath: String, setInherited: Boolean = false): Unit = {
    if (gdext.classes.EditorInterface.mb_open_scene_from_path == null) gdext.classes.EditorInterface.mb_open_scene_from_path = MethodBind.get("EditorInterface", "open_scene_from_path", 1168363258L)
    Ptrcall.callVoid2(gdext.classes.EditorInterface.mb_open_scene_from_path, livePtr, sceneFilepath, setInherited)
  }

  /** EditorInterface.reload_scene_from_path */
  final def reloadSceneFromPath(sceneFilepath: String): Unit = {
    if (gdext.classes.EditorInterface.mb_reload_scene_from_path == null) gdext.classes.EditorInterface.mb_reload_scene_from_path = MethodBind.get("EditorInterface", "reload_scene_from_path", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorInterface.mb_reload_scene_from_path, livePtr, sceneFilepath)
  }

  /** EditorInterface.set_object_edited */
  final def setObjectEdited(`object`: Object, edited: Boolean): Unit = {
    if (gdext.classes.EditorInterface.mb_set_object_edited == null) gdext.classes.EditorInterface.mb_set_object_edited = MethodBind.get("EditorInterface", "set_object_edited", 1462101905L)
    Ptrcall.callVoid2(gdext.classes.EditorInterface.mb_set_object_edited, livePtr, Wrappers.handle(`object`), edited)
  }

  /** EditorInterface.is_object_edited */
  final def isObjectEdited(`object`: Object): Boolean = {
    if (gdext.classes.EditorInterface.mb_is_object_edited == null) gdext.classes.EditorInterface.mb_is_object_edited = MethodBind.get("EditorInterface", "is_object_edited", 397768994L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.EditorInterface.mb_is_object_edited, livePtr, Wrappers.handle(`object`))
  }

  /** EditorInterface.get_edited_scene_root */
  final def getEditedSceneRoot(): Node = {
    if (gdext.classes.EditorInterface.mb_get_edited_scene_root == null) gdext.classes.EditorInterface.mb_get_edited_scene_root = MethodBind.get("EditorInterface", "get_edited_scene_root", 3160264692L)
    Wrappers.borrowed[Node](Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_get_edited_scene_root, livePtr))
  }

  /** EditorInterface.add_root_node */
  final def addRootNode(node: Node): Unit = {
    if (gdext.classes.EditorInterface.mb_add_root_node == null) gdext.classes.EditorInterface.mb_add_root_node = MethodBind.get("EditorInterface", "add_root_node", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.EditorInterface.mb_add_root_node, livePtr, Wrappers.handle(node))
  }

  /** EditorInterface.save_scene */
  final def saveScene(): gdext.classes.Error = {
    if (gdext.classes.EditorInterface.mb_save_scene == null) gdext.classes.EditorInterface.mb_save_scene = MethodBind.get("EditorInterface", "save_scene", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_save_scene, livePtr))
  }

  /** EditorInterface.save_scene_as */
  final def saveSceneAs(path: String, withPreview: Boolean = true): Unit = {
    if (gdext.classes.EditorInterface.mb_save_scene_as == null) gdext.classes.EditorInterface.mb_save_scene_as = MethodBind.get("EditorInterface", "save_scene_as", 3647332257L)
    Ptrcall.callVoid2(gdext.classes.EditorInterface.mb_save_scene_as, livePtr, path, withPreview)
  }

  /** EditorInterface.save_all_scenes */
  final def saveAllScenes(): Unit = {
    if (gdext.classes.EditorInterface.mb_save_all_scenes == null) gdext.classes.EditorInterface.mb_save_all_scenes = MethodBind.get("EditorInterface", "save_all_scenes", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorInterface.mb_save_all_scenes, livePtr)
  }

  /** EditorInterface.close_scene */
  final def closeScene(): gdext.classes.Error = {
    if (gdext.classes.EditorInterface.mb_close_scene == null) gdext.classes.EditorInterface.mb_close_scene = MethodBind.get("EditorInterface", "close_scene", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.EditorInterface.mb_close_scene, livePtr))
  }

  /** EditorInterface.mark_scene_as_unsaved */
  final def markSceneAsUnsaved(): Unit = {
    if (gdext.classes.EditorInterface.mb_mark_scene_as_unsaved == null) gdext.classes.EditorInterface.mb_mark_scene_as_unsaved = MethodBind.get("EditorInterface", "mark_scene_as_unsaved", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorInterface.mb_mark_scene_as_unsaved, livePtr)
  }

  /** EditorInterface.play_main_scene */
  final def playMainScene(): Unit = {
    if (gdext.classes.EditorInterface.mb_play_main_scene == null) gdext.classes.EditorInterface.mb_play_main_scene = MethodBind.get("EditorInterface", "play_main_scene", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorInterface.mb_play_main_scene, livePtr)
  }

  /** EditorInterface.play_current_scene */
  final def playCurrentScene(): Unit = {
    if (gdext.classes.EditorInterface.mb_play_current_scene == null) gdext.classes.EditorInterface.mb_play_current_scene = MethodBind.get("EditorInterface", "play_current_scene", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorInterface.mb_play_current_scene, livePtr)
  }

  /** EditorInterface.play_custom_scene */
  final def playCustomScene(sceneFilepath: String): Unit = {
    if (gdext.classes.EditorInterface.mb_play_custom_scene == null) gdext.classes.EditorInterface.mb_play_custom_scene = MethodBind.get("EditorInterface", "play_custom_scene", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorInterface.mb_play_custom_scene, livePtr, sceneFilepath)
  }

  /** EditorInterface.stop_playing_scene */
  final def stopPlayingScene(): Unit = {
    if (gdext.classes.EditorInterface.mb_stop_playing_scene == null) gdext.classes.EditorInterface.mb_stop_playing_scene = MethodBind.get("EditorInterface", "stop_playing_scene", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorInterface.mb_stop_playing_scene, livePtr)
  }

  /** EditorInterface.is_playing_scene */
  final def isPlayingScene(): Boolean = {
    if (gdext.classes.EditorInterface.mb_is_playing_scene == null) gdext.classes.EditorInterface.mb_is_playing_scene = MethodBind.get("EditorInterface", "is_playing_scene", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorInterface.mb_is_playing_scene, livePtr)
  }

  /** EditorInterface.get_playing_scene */
  final def getPlayingScene(): String = {
    if (gdext.classes.EditorInterface.mb_get_playing_scene == null) gdext.classes.EditorInterface.mb_get_playing_scene = MethodBind.get("EditorInterface", "get_playing_scene", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorInterface.mb_get_playing_scene, livePtr)
  }

  /** EditorInterface.set_movie_maker_enabled */
  final def setMovieMakerEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.EditorInterface.mb_set_movie_maker_enabled == null) gdext.classes.EditorInterface.mb_set_movie_maker_enabled = MethodBind.get("EditorInterface", "set_movie_maker_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorInterface.mb_set_movie_maker_enabled, livePtr, enabled)
  }

  /** EditorInterface.is_movie_maker_enabled */
  final def isMovieMakerEnabled(): Boolean = {
    if (gdext.classes.EditorInterface.mb_is_movie_maker_enabled == null) gdext.classes.EditorInterface.mb_is_movie_maker_enabled = MethodBind.get("EditorInterface", "is_movie_maker_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorInterface.mb_is_movie_maker_enabled, livePtr)
  }

}

object EditorInterface {
  private[classes] var mb_restart_editor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_command_palette: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_resource_filesystem: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_editor_paths: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_resource_previewer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_editor_settings: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_editor_toaster: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_editor_undo_redo: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_plugin_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_plugin_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_editor_theme: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_base_control: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_editor_main_screen: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_script_editor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_editor_viewport_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_editor_viewport_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_main_screen_editor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_distraction_free_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_distraction_free_mode_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_multi_window_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_editor_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_editor_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_node_3d_snap_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_3d_translate_snap: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_3d_rotate_snap: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_3d_scale_snap: GDExtensionMethodBindPtr = null
  private[classes] var mb_popup_dialog: GDExtensionMethodBindPtr = null
  private[classes] var mb_popup_dialog_centered: GDExtensionMethodBindPtr = null
  private[classes] var mb_popup_dialog_centered_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_popup_dialog_centered_clamped: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_feature_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_current_feature_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_file_system_dock: GDExtensionMethodBindPtr = null
  private[classes] var mb_select_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_directory: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inspector: GDExtensionMethodBindPtr = null
  private[classes] var mb_inspect_object: GDExtensionMethodBindPtr = null
  private[classes] var mb_edit_resource: GDExtensionMethodBindPtr = null
  private[classes] var mb_edit_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_edit_script: GDExtensionMethodBindPtr = null
  private[classes] var mb_open_scene_from_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_reload_scene_from_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_object_edited: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_object_edited: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_edited_scene_root: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_root_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_save_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_save_scene_as: GDExtensionMethodBindPtr = null
  private[classes] var mb_save_all_scenes: GDExtensionMethodBindPtr = null
  private[classes] var mb_close_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_mark_scene_as_unsaved: GDExtensionMethodBindPtr = null
  private[classes] var mb_play_main_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_play_current_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_play_custom_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_stop_playing_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_playing_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_playing_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_movie_maker_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_movie_maker_enabled: GDExtensionMethodBindPtr = null

  private var instance: EditorInterface = null

  /** The process-global EditorInterface singleton instance. */
  def singleton: EditorInterface = {
    if (instance == null)
      instance = Wrappers.borrowed[EditorInterface](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("EditorInterface").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: EditorInterface.restart_editor */
  final def restartEditor(save: Boolean = true): Unit =
    singleton.restartEditor(save)

  /** Forwards to [[singleton]]: EditorInterface.get_command_palette */
  final def getCommandPalette(): EditorCommandPalette =
    singleton.getCommandPalette()

  /** Forwards to [[singleton]]: EditorInterface.get_resource_filesystem */
  final def getResourceFilesystem(): EditorFileSystem =
    singleton.getResourceFilesystem()

  /** Forwards to [[singleton]]: EditorInterface.get_editor_paths */
  final def getEditorPaths(): EditorPaths =
    singleton.getEditorPaths()

  /** Forwards to [[singleton]]: EditorInterface.get_resource_previewer */
  final def getResourcePreviewer(): EditorResourcePreview =
    singleton.getResourcePreviewer()

  /** Forwards to [[singleton]]: EditorInterface.get_selection */
  final def getSelection(): EditorSelection =
    singleton.getSelection()

  /** Forwards to [[singleton]]: EditorInterface.get_editor_settings */
  final def getEditorSettings(): EditorSettings =
    singleton.getEditorSettings()

  /** Forwards to [[singleton]]: EditorInterface.get_editor_toaster */
  final def getEditorToaster(): EditorToaster =
    singleton.getEditorToaster()

  /** Forwards to [[singleton]]: EditorInterface.get_editor_undo_redo */
  final def getEditorUndoRedo(): EditorUndoRedoManager =
    singleton.getEditorUndoRedo()

  /** Forwards to [[singleton]]: EditorInterface.set_plugin_enabled */
  final def setPluginEnabled(plugin: String, enabled: Boolean): Unit =
    singleton.setPluginEnabled(plugin, enabled)

  /** Forwards to [[singleton]]: EditorInterface.is_plugin_enabled */
  final def isPluginEnabled(plugin: String): Boolean =
    singleton.isPluginEnabled(plugin)

  /** Forwards to [[singleton]]: EditorInterface.get_editor_theme */
  final def getEditorTheme(): Theme =
    singleton.getEditorTheme()

  /** Forwards to [[singleton]]: EditorInterface.get_base_control */
  final def getBaseControl(): Control =
    singleton.getBaseControl()

  /** Forwards to [[singleton]]: EditorInterface.get_editor_main_screen */
  final def getEditorMainScreen(): VBoxContainer =
    singleton.getEditorMainScreen()

  /** Forwards to [[singleton]]: EditorInterface.get_script_editor */
  final def getScriptEditor(): ScriptEditor =
    singleton.getScriptEditor()

  /** Forwards to [[singleton]]: EditorInterface.get_editor_viewport_2d */
  final def getEditorViewport2d(): SubViewport =
    singleton.getEditorViewport2d()

  /** Forwards to [[singleton]]: EditorInterface.get_editor_viewport_3d */
  final def getEditorViewport3d(idx: Long = 0L): SubViewport =
    singleton.getEditorViewport3d(idx)

  /** Forwards to [[singleton]]: EditorInterface.set_main_screen_editor */
  final def setMainScreenEditor(name: String): Unit =
    singleton.setMainScreenEditor(name)

  /** Forwards to [[singleton]]: EditorInterface.set_distraction_free_mode */
  final def setDistractionFreeMode(enter: Boolean): Unit =
    singleton.setDistractionFreeMode(enter)

  /** Forwards to [[singleton]]: EditorInterface.is_distraction_free_mode_enabled */
  final def isDistractionFreeModeEnabled(): Boolean =
    singleton.isDistractionFreeModeEnabled()

  /** Forwards to [[singleton]]: EditorInterface.is_multi_window_enabled */
  final def isMultiWindowEnabled(): Boolean =
    singleton.isMultiWindowEnabled()

  /** Forwards to [[singleton]]: EditorInterface.get_editor_scale */
  final def getEditorScale(): Double =
    singleton.getEditorScale()

  /** Forwards to [[singleton]]: EditorInterface.get_editor_language */
  final def getEditorLanguage(): String =
    singleton.getEditorLanguage()

  /** Forwards to [[singleton]]: EditorInterface.is_node_3d_snap_enabled */
  final def isNode3dSnapEnabled(): Boolean =
    singleton.isNode3dSnapEnabled()

  /** Forwards to [[singleton]]: EditorInterface.get_node_3d_translate_snap */
  final def getNode3dTranslateSnap(): Double =
    singleton.getNode3dTranslateSnap()

  /** Forwards to [[singleton]]: EditorInterface.get_node_3d_rotate_snap */
  final def getNode3dRotateSnap(): Double =
    singleton.getNode3dRotateSnap()

  /** Forwards to [[singleton]]: EditorInterface.get_node_3d_scale_snap */
  final def getNode3dScaleSnap(): Double =
    singleton.getNode3dScaleSnap()

  /** Forwards to [[singleton]]: EditorInterface.popup_dialog */
  final def popupDialog(dialog: Window, rect: gdext.builtin.Rect2i): Unit =
    singleton.popupDialog(dialog, rect)

  /** Forwards to [[singleton]]: EditorInterface.popup_dialog_centered */
  final def popupDialogCentered(dialog: Window, minsize: gdext.builtin.Vector2i = gdext.builtin.Vector2i(0, 0)): Unit =
    singleton.popupDialogCentered(dialog, minsize)

  /** Forwards to [[singleton]]: EditorInterface.popup_dialog_centered_ratio */
  final def popupDialogCenteredRatio(dialog: Window, ratio: Double = 0.8): Unit =
    singleton.popupDialogCenteredRatio(dialog, ratio)

  /** Forwards to [[singleton]]: EditorInterface.popup_dialog_centered_clamped */
  final def popupDialogCenteredClamped(dialog: Window, minsize: gdext.builtin.Vector2i = gdext.builtin.Vector2i(0, 0), fallbackRatio: Double = 0.75): Unit =
    singleton.popupDialogCenteredClamped(dialog, minsize, fallbackRatio)

  /** Forwards to [[singleton]]: EditorInterface.get_current_feature_profile */
  final def getCurrentFeatureProfile(): String =
    singleton.getCurrentFeatureProfile()

  /** Forwards to [[singleton]]: EditorInterface.set_current_feature_profile */
  final def setCurrentFeatureProfile(profileName: String): Unit =
    singleton.setCurrentFeatureProfile(profileName)

  /** Forwards to [[singleton]]: EditorInterface.get_file_system_dock */
  final def getFileSystemDock(): FileSystemDock =
    singleton.getFileSystemDock()

  /** Forwards to [[singleton]]: EditorInterface.select_file */
  final def selectFile(file: String): Unit =
    singleton.selectFile(file)

  /** Forwards to [[singleton]]: EditorInterface.get_current_path */
  final def getCurrentPath(): String =
    singleton.getCurrentPath()

  /** Forwards to [[singleton]]: EditorInterface.get_current_directory */
  final def getCurrentDirectory(): String =
    singleton.getCurrentDirectory()

  /** Forwards to [[singleton]]: EditorInterface.get_inspector */
  final def getInspector(): EditorInspector =
    singleton.getInspector()

  /** Forwards to [[singleton]]: EditorInterface.inspect_object */
  final def inspectObject(`object`: Object, forProperty: String = "", inspectorOnly: Boolean = false): Unit =
    singleton.inspectObject(`object`, forProperty, inspectorOnly)

  /** Forwards to [[singleton]]: EditorInterface.edit_resource */
  final def editResource(resource: Resource): Unit =
    singleton.editResource(resource)

  /** Forwards to [[singleton]]: EditorInterface.edit_node */
  final def editNode(node: Node): Unit =
    singleton.editNode(node)

  /** Forwards to [[singleton]]: EditorInterface.edit_script */
  final def editScript(script: Script, line: Long = -1L, column: Long = 0L, grabFocus: Boolean = true): Unit =
    singleton.editScript(script, line, column, grabFocus)

  /** Forwards to [[singleton]]: EditorInterface.open_scene_from_path */
  final def openSceneFromPath(sceneFilepath: String, setInherited: Boolean = false): Unit =
    singleton.openSceneFromPath(sceneFilepath, setInherited)

  /** Forwards to [[singleton]]: EditorInterface.reload_scene_from_path */
  final def reloadSceneFromPath(sceneFilepath: String): Unit =
    singleton.reloadSceneFromPath(sceneFilepath)

  /** Forwards to [[singleton]]: EditorInterface.set_object_edited */
  final def setObjectEdited(`object`: Object, edited: Boolean): Unit =
    singleton.setObjectEdited(`object`, edited)

  /** Forwards to [[singleton]]: EditorInterface.is_object_edited */
  final def isObjectEdited(`object`: Object): Boolean =
    singleton.isObjectEdited(`object`)

  /** Forwards to [[singleton]]: EditorInterface.get_edited_scene_root */
  final def getEditedSceneRoot(): Node =
    singleton.getEditedSceneRoot()

  /** Forwards to [[singleton]]: EditorInterface.add_root_node */
  final def addRootNode(node: Node): Unit =
    singleton.addRootNode(node)

  /** Forwards to [[singleton]]: EditorInterface.save_scene */
  final def saveScene(): gdext.classes.Error =
    singleton.saveScene()

  /** Forwards to [[singleton]]: EditorInterface.save_scene_as */
  final def saveSceneAs(path: String, withPreview: Boolean = true): Unit =
    singleton.saveSceneAs(path, withPreview)

  /** Forwards to [[singleton]]: EditorInterface.save_all_scenes */
  final def saveAllScenes(): Unit =
    singleton.saveAllScenes()

  /** Forwards to [[singleton]]: EditorInterface.close_scene */
  final def closeScene(): gdext.classes.Error =
    singleton.closeScene()

  /** Forwards to [[singleton]]: EditorInterface.mark_scene_as_unsaved */
  final def markSceneAsUnsaved(): Unit =
    singleton.markSceneAsUnsaved()

  /** Forwards to [[singleton]]: EditorInterface.play_main_scene */
  final def playMainScene(): Unit =
    singleton.playMainScene()

  /** Forwards to [[singleton]]: EditorInterface.play_current_scene */
  final def playCurrentScene(): Unit =
    singleton.playCurrentScene()

  /** Forwards to [[singleton]]: EditorInterface.play_custom_scene */
  final def playCustomScene(sceneFilepath: String): Unit =
    singleton.playCustomScene(sceneFilepath)

  /** Forwards to [[singleton]]: EditorInterface.stop_playing_scene */
  final def stopPlayingScene(): Unit =
    singleton.stopPlayingScene()

  /** Forwards to [[singleton]]: EditorInterface.is_playing_scene */
  final def isPlayingScene(): Boolean =
    singleton.isPlayingScene()

  /** Forwards to [[singleton]]: EditorInterface.get_playing_scene */
  final def getPlayingScene(): String =
    singleton.getPlayingScene()

  /** Forwards to [[singleton]]: EditorInterface.set_movie_maker_enabled */
  final def setMovieMakerEnabled(enabled: Boolean): Unit =
    singleton.setMovieMakerEnabled(enabled)

  /** Forwards to [[singleton]]: EditorInterface.is_movie_maker_enabled */
  final def isMovieMakerEnabled(): Boolean =
    singleton.isMovieMakerEnabled()
}
