package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorInterface`, extends `Object`. */
abstract class EditorInterface extends Object {

  /** EditorInterface.restart_editor */
  final def restartEditor(save: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorInterface", "restart_editor", 3216645846L), hostObject.objectPtr, save)

  /** EditorInterface.get_command_palette */
  final def getCommandPalette(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInterface", "get_command_palette", 2471163807L), hostObject.objectPtr)

  /** EditorInterface.get_resource_filesystem */
  final def getResourceFilesystem(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInterface", "get_resource_filesystem", 780151678L), hostObject.objectPtr)

  /** EditorInterface.get_editor_paths */
  final def getEditorPaths(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInterface", "get_editor_paths", 1595760068L), hostObject.objectPtr)

  /** EditorInterface.get_resource_previewer */
  final def getResourcePreviewer(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInterface", "get_resource_previewer", 943486957L), hostObject.objectPtr)

  /** EditorInterface.get_selection */
  final def getSelection(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInterface", "get_selection", 2690272531L), hostObject.objectPtr)

  /** EditorInterface.get_editor_settings */
  final def getEditorSettings(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInterface", "get_editor_settings", 4086932459L), hostObject.objectPtr)

  /** EditorInterface.get_editor_toaster */
  final def getEditorToaster(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInterface", "get_editor_toaster", 3612675797L), hostObject.objectPtr)

  /** EditorInterface.get_editor_undo_redo */
  final def getEditorUndoRedo(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInterface", "get_editor_undo_redo", 3819628421L), hostObject.objectPtr)

  /** EditorInterface.set_plugin_enabled */
  final def setPluginEnabled(plugin: String, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorInterface", "set_plugin_enabled", 2678287736L), hostObject.objectPtr, plugin, enabled)

  /** EditorInterface.is_plugin_enabled */
  final def isPluginEnabled(plugin: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("EditorInterface", "is_plugin_enabled", 3927539163L), hostObject.objectPtr, plugin)

  /** EditorInterface.get_editor_theme */
  final def getEditorTheme(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInterface", "get_editor_theme", 3846893731L), hostObject.objectPtr)

  /** EditorInterface.get_base_control */
  final def getBaseControl(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInterface", "get_base_control", 2783021301L), hostObject.objectPtr)

  /** EditorInterface.get_editor_main_screen */
  final def getEditorMainScreen(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInterface", "get_editor_main_screen", 1706218421L), hostObject.objectPtr)

  /** EditorInterface.get_script_editor */
  final def getScriptEditor(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInterface", "get_script_editor", 90868003L), hostObject.objectPtr)

  /** EditorInterface.get_editor_viewport_2d */
  final def getEditorViewport2d(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInterface", "get_editor_viewport_2d", 3750751911L), hostObject.objectPtr)

  /** EditorInterface.get_editor_viewport_3d */
  final def getEditorViewport3d(idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("EditorInterface", "get_editor_viewport_3d", 1970834490L), hostObject.objectPtr, idx)

  /** EditorInterface.set_main_screen_editor */
  final def setMainScreenEditor(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorInterface", "set_main_screen_editor", 83702148L), hostObject.objectPtr, name)

  /** EditorInterface.set_distraction_free_mode */
  final def setDistractionFreeMode(enter: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorInterface", "set_distraction_free_mode", 2586408642L), hostObject.objectPtr, enter)

  /** EditorInterface.is_distraction_free_mode_enabled */
  final def isDistractionFreeModeEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorInterface", "is_distraction_free_mode_enabled", 36873697L), hostObject.objectPtr)

  /** EditorInterface.is_multi_window_enabled */
  final def isMultiWindowEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorInterface", "is_multi_window_enabled", 36873697L), hostObject.objectPtr)

  /** EditorInterface.get_editor_scale */
  final def getEditorScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("EditorInterface", "get_editor_scale", 1740695150L), hostObject.objectPtr)

  /** EditorInterface.get_editor_language */
  final def getEditorLanguage(): String =
    Ptrcall.call0[String](MethodBind.get("EditorInterface", "get_editor_language", 201670096L), hostObject.objectPtr)

  /** EditorInterface.is_node_3d_snap_enabled */
  final def isNode3dSnapEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorInterface", "is_node_3d_snap_enabled", 36873697L), hostObject.objectPtr)

  /** EditorInterface.get_node_3d_translate_snap */
  final def getNode3dTranslateSnap(): Double =
    Ptrcall.call0[Double](MethodBind.get("EditorInterface", "get_node_3d_translate_snap", 1740695150L), hostObject.objectPtr)

  /** EditorInterface.get_node_3d_rotate_snap */
  final def getNode3dRotateSnap(): Double =
    Ptrcall.call0[Double](MethodBind.get("EditorInterface", "get_node_3d_rotate_snap", 1740695150L), hostObject.objectPtr)

  /** EditorInterface.get_node_3d_scale_snap */
  final def getNode3dScaleSnap(): Double =
    Ptrcall.call0[Double](MethodBind.get("EditorInterface", "get_node_3d_scale_snap", 1740695150L), hostObject.objectPtr)

  /** EditorInterface.popup_dialog */
  final def popupDialog(dialog: Window, rect: gdext.builtin.Rect2i): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorInterface", "popup_dialog", 2015770942L), hostObject.objectPtr, dialog.hostObject, rect)

  /** EditorInterface.popup_dialog_centered */
  final def popupDialogCentered(dialog: Window, minsize: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorInterface", "popup_dialog_centered", 346557367L), hostObject.objectPtr, dialog.hostObject, minsize)

  /** EditorInterface.popup_dialog_centered_ratio */
  final def popupDialogCenteredRatio(dialog: Window, ratio: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorInterface", "popup_dialog_centered_ratio", 2093669136L), hostObject.objectPtr, dialog.hostObject, ratio)

  /** EditorInterface.popup_dialog_centered_clamped */
  final def popupDialogCenteredClamped(dialog: Window, minsize: gdext.builtin.Vector2i, fallback_ratio: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("EditorInterface", "popup_dialog_centered_clamped", 3763385571L), hostObject.objectPtr, dialog.hostObject, minsize, fallback_ratio)

  /** EditorInterface.get_current_feature_profile */
  final def getCurrentFeatureProfile(): String =
    Ptrcall.call0[String](MethodBind.get("EditorInterface", "get_current_feature_profile", 201670096L), hostObject.objectPtr)

  /** EditorInterface.set_current_feature_profile */
  final def setCurrentFeatureProfile(profile_name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorInterface", "set_current_feature_profile", 83702148L), hostObject.objectPtr, profile_name)

  /** EditorInterface.get_file_system_dock */
  final def getFileSystemDock(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInterface", "get_file_system_dock", 3751012327L), hostObject.objectPtr)

  /** EditorInterface.select_file */
  final def selectFile(file: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorInterface", "select_file", 83702148L), hostObject.objectPtr, file)

  /** EditorInterface.get_current_path */
  final def getCurrentPath(): String =
    Ptrcall.call0[String](MethodBind.get("EditorInterface", "get_current_path", 201670096L), hostObject.objectPtr)

  /** EditorInterface.get_current_directory */
  final def getCurrentDirectory(): String =
    Ptrcall.call0[String](MethodBind.get("EditorInterface", "get_current_directory", 201670096L), hostObject.objectPtr)

  /** EditorInterface.get_inspector */
  final def getInspector(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInterface", "get_inspector", 3517113938L), hostObject.objectPtr)

  /** EditorInterface.inspect_object */
  final def inspectObject(`object`: Object, for_property: String, inspector_only: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("EditorInterface", "inspect_object", 127962172L), hostObject.objectPtr, `object`.hostObject, for_property, inspector_only)

  /** EditorInterface.edit_resource */
  final def editResource(resource: Resource): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorInterface", "edit_resource", 968641751L), hostObject.objectPtr, resource.hostObject)

  /** EditorInterface.edit_node */
  final def editNode(node: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorInterface", "edit_node", 1078189570L), hostObject.objectPtr, node.hostObject)

  /** EditorInterface.edit_script */
  final def editScript(script: Script, line: Long, column: Long, grab_focus: Boolean): Unit =
    Ptrcall.callVoid4(MethodBind.get("EditorInterface", "edit_script", 219829402L), hostObject.objectPtr, script.hostObject, line, column, grab_focus)

  /** EditorInterface.open_scene_from_path */
  final def openSceneFromPath(scene_filepath: String, set_inherited: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorInterface", "open_scene_from_path", 1168363258L), hostObject.objectPtr, scene_filepath, set_inherited)

  /** EditorInterface.reload_scene_from_path */
  final def reloadSceneFromPath(scene_filepath: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorInterface", "reload_scene_from_path", 83702148L), hostObject.objectPtr, scene_filepath)

  /** EditorInterface.set_object_edited */
  final def setObjectEdited(`object`: Object, edited: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorInterface", "set_object_edited", 1462101905L), hostObject.objectPtr, `object`.hostObject, edited)

  /** EditorInterface.is_object_edited */
  final def isObjectEdited(`object`: Object): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("EditorInterface", "is_object_edited", 397768994L), hostObject.objectPtr, `object`.hostObject)

  /** EditorInterface.get_edited_scene_root */
  final def getEditedSceneRoot(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorInterface", "get_edited_scene_root", 3160264692L), hostObject.objectPtr)

  /** EditorInterface.add_root_node */
  final def addRootNode(node: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorInterface", "add_root_node", 1078189570L), hostObject.objectPtr, node.hostObject)

  /** EditorInterface.save_scene */
  final def saveScene(): Long =
    Ptrcall.call0[Long](MethodBind.get("EditorInterface", "save_scene", 166280745L), hostObject.objectPtr)

  /** EditorInterface.save_scene_as */
  final def saveSceneAs(path: String, with_preview: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorInterface", "save_scene_as", 3647332257L), hostObject.objectPtr, path, with_preview)

  /** EditorInterface.save_all_scenes */
  final def saveAllScenes(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorInterface", "save_all_scenes", 3218959716L), hostObject.objectPtr)

  /** EditorInterface.close_scene */
  final def closeScene(): Long =
    Ptrcall.call0[Long](MethodBind.get("EditorInterface", "close_scene", 166280745L), hostObject.objectPtr)

  /** EditorInterface.mark_scene_as_unsaved */
  final def markSceneAsUnsaved(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorInterface", "mark_scene_as_unsaved", 3218959716L), hostObject.objectPtr)

  /** EditorInterface.play_main_scene */
  final def playMainScene(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorInterface", "play_main_scene", 3218959716L), hostObject.objectPtr)

  /** EditorInterface.play_current_scene */
  final def playCurrentScene(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorInterface", "play_current_scene", 3218959716L), hostObject.objectPtr)

  /** EditorInterface.play_custom_scene */
  final def playCustomScene(scene_filepath: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorInterface", "play_custom_scene", 83702148L), hostObject.objectPtr, scene_filepath)

  /** EditorInterface.stop_playing_scene */
  final def stopPlayingScene(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorInterface", "stop_playing_scene", 3218959716L), hostObject.objectPtr)

  /** EditorInterface.is_playing_scene */
  final def isPlayingScene(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorInterface", "is_playing_scene", 36873697L), hostObject.objectPtr)

  /** EditorInterface.get_playing_scene */
  final def getPlayingScene(): String =
    Ptrcall.call0[String](MethodBind.get("EditorInterface", "get_playing_scene", 201670096L), hostObject.objectPtr)

  /** EditorInterface.set_movie_maker_enabled */
  final def setMovieMakerEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorInterface", "set_movie_maker_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** EditorInterface.is_movie_maker_enabled */
  final def isMovieMakerEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorInterface", "is_movie_maker_enabled", 36873697L), hostObject.objectPtr)

}

object EditorInterface {
  /** Class metadata for Gd[EditorInterface] lifetime management and casting. */
  given GodotClass[EditorInterface] with {
    def className = "EditorInterface"
    def isRefCounted = false
    def wrap(o: GodotObject): EditorInterface = new EditorInterface {}.withHost(o.objectPtr)
    def unwrap(t: EditorInterface): GodotObject = t.hostObject
  }

  /** The process-global EditorInterface singleton instance. */
  def singleton: EditorInterface = new EditorInterface {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("EditorInterface").ptr))
}
