package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SceneTree`, extends `MainLoop`. */
abstract class SceneTree extends MainLoop {

  /** SceneTree.get_root */
  final def getRoot(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SceneTree", "get_root", 1757182445L), hostObject.objectPtr)

  /** SceneTree.has_group */
  final def hasGroup(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("SceneTree", "has_group", 2619796661L), hostObject.objectPtr, name)

  /** SceneTree.is_accessibility_enabled */
  final def isAccessibilityEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SceneTree", "is_accessibility_enabled", 36873697L), hostObject.objectPtr)

  /** SceneTree.is_accessibility_supported */
  final def isAccessibilitySupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SceneTree", "is_accessibility_supported", 36873697L), hostObject.objectPtr)

  /** SceneTree.is_auto_accept_quit */
  final def isAutoAcceptQuit(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SceneTree", "is_auto_accept_quit", 36873697L), hostObject.objectPtr)

  /** SceneTree.set_auto_accept_quit */
  final def setAutoAcceptQuit(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneTree", "set_auto_accept_quit", 2586408642L), hostObject.objectPtr, enabled)

  /** SceneTree.is_quit_on_go_back */
  final def isQuitOnGoBack(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SceneTree", "is_quit_on_go_back", 36873697L), hostObject.objectPtr)

  /** SceneTree.set_quit_on_go_back */
  final def setQuitOnGoBack(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneTree", "set_quit_on_go_back", 2586408642L), hostObject.objectPtr, enabled)

  /** SceneTree.set_debug_collisions_hint */
  final def setDebugCollisionsHint(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneTree", "set_debug_collisions_hint", 2586408642L), hostObject.objectPtr, enable)

  /** SceneTree.is_debugging_collisions_hint */
  final def isDebuggingCollisionsHint(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SceneTree", "is_debugging_collisions_hint", 36873697L), hostObject.objectPtr)

  /** SceneTree.set_debug_paths_hint */
  final def setDebugPathsHint(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneTree", "set_debug_paths_hint", 2586408642L), hostObject.objectPtr, enable)

  /** SceneTree.is_debugging_paths_hint */
  final def isDebuggingPathsHint(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SceneTree", "is_debugging_paths_hint", 36873697L), hostObject.objectPtr)

  /** SceneTree.set_debug_navigation_hint */
  final def setDebugNavigationHint(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneTree", "set_debug_navigation_hint", 2586408642L), hostObject.objectPtr, enable)

  /** SceneTree.is_debugging_navigation_hint */
  final def isDebuggingNavigationHint(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SceneTree", "is_debugging_navigation_hint", 36873697L), hostObject.objectPtr)

  /** SceneTree.set_edited_scene_root */
  final def setEditedSceneRoot(scene: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneTree", "set_edited_scene_root", 1078189570L), hostObject.objectPtr, scene.hostObject)

  /** SceneTree.get_edited_scene_root */
  final def getEditedSceneRoot(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SceneTree", "get_edited_scene_root", 3160264692L), hostObject.objectPtr)

  /** SceneTree.set_pause */
  final def setPause(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneTree", "set_pause", 2586408642L), hostObject.objectPtr, enable)

  /** SceneTree.is_paused */
  final def isPaused(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SceneTree", "is_paused", 36873697L), hostObject.objectPtr)

  /** SceneTree.create_timer */
  final def createTimer(time_sec: Double, process_always: Boolean, process_in_physics: Boolean, ignore_time_scale: Boolean): GodotObject =
    Ptrcall.call4[Double, Boolean, Boolean, Boolean, GodotObject](MethodBind.get("SceneTree", "create_timer", 2709170273L), hostObject.objectPtr, time_sec, process_always, process_in_physics, ignore_time_scale)

  /** SceneTree.create_tween */
  final def createTween(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SceneTree", "create_tween", 3426978995L), hostObject.objectPtr)

  /** SceneTree.get_node_count */
  final def getNodeCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("SceneTree", "get_node_count", 3905245786L), hostObject.objectPtr)

  /** SceneTree.get_frame */
  final def getFrame(): Long =
    Ptrcall.call0[Long](MethodBind.get("SceneTree", "get_frame", 3905245786L), hostObject.objectPtr)

  /** SceneTree.quit */
  final def quit(exit_code: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneTree", "quit", 1995695955L), hostObject.objectPtr, exit_code)

  /** SceneTree.set_physics_interpolation_enabled */
  final def setPhysicsInterpolationEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneTree", "set_physics_interpolation_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** SceneTree.is_physics_interpolation_enabled */
  final def isPhysicsInterpolationEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SceneTree", "is_physics_interpolation_enabled", 36873697L), hostObject.objectPtr)

  /** SceneTree.queue_delete */
  final def queueDelete(obj: Object): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneTree", "queue_delete", 3975164845L), hostObject.objectPtr, obj.hostObject)

  /** SceneTree.notify_group_flags */
  final def notifyGroupFlags(call_flags: Long, group: gdext.builtin.StringName, notification: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("SceneTree", "notify_group_flags", 1245489420L), hostObject.objectPtr, call_flags, group, notification)

  /** SceneTree.notify_group */
  final def notifyGroup(group: gdext.builtin.StringName, notification: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SceneTree", "notify_group", 2415702435L), hostObject.objectPtr, group, notification)

  /** SceneTree.get_first_node_in_group */
  final def getFirstNodeInGroup(group: gdext.builtin.StringName): GodotObject =
    Ptrcall.call1[gdext.builtin.StringName, GodotObject](MethodBind.get("SceneTree", "get_first_node_in_group", 4071044623L), hostObject.objectPtr, group)

  /** SceneTree.get_node_count_in_group */
  final def getNodeCountInGroup(group: gdext.builtin.StringName): Long =
    Ptrcall.call1[gdext.builtin.StringName, Long](MethodBind.get("SceneTree", "get_node_count_in_group", 2458036349L), hostObject.objectPtr, group)

  /** SceneTree.set_current_scene */
  final def setCurrentScene(child_node: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneTree", "set_current_scene", 1078189570L), hostObject.objectPtr, child_node.hostObject)

  /** SceneTree.get_current_scene */
  final def getCurrentScene(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SceneTree", "get_current_scene", 3160264692L), hostObject.objectPtr)

  /** SceneTree.change_scene_to_file */
  final def changeSceneToFile(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("SceneTree", "change_scene_to_file", 166001499L), hostObject.objectPtr, path)

  /** SceneTree.change_scene_to_packed */
  final def changeSceneToPacked(packed_scene: PackedScene): Long =
    Ptrcall.call1[GodotObject, Long](MethodBind.get("SceneTree", "change_scene_to_packed", 107349098L), hostObject.objectPtr, packed_scene.hostObject)

  /** SceneTree.change_scene_to_node */
  final def changeSceneToNode(node: Node): Long =
    Ptrcall.call1[GodotObject, Long](MethodBind.get("SceneTree", "change_scene_to_node", 2584678054L), hostObject.objectPtr, node.hostObject)

  /** SceneTree.reload_current_scene */
  final def reloadCurrentScene(): Long =
    Ptrcall.call0[Long](MethodBind.get("SceneTree", "reload_current_scene", 166280745L), hostObject.objectPtr)

  /** SceneTree.unload_current_scene */
  final def unloadCurrentScene(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SceneTree", "unload_current_scene", 3218959716L), hostObject.objectPtr)

  /** SceneTree.set_multiplayer_poll_enabled */
  final def setMultiplayerPollEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneTree", "set_multiplayer_poll_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** SceneTree.is_multiplayer_poll_enabled */
  final def isMultiplayerPollEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SceneTree", "is_multiplayer_poll_enabled", 36873697L), hostObject.objectPtr)

}

object SceneTree {
  /** Class metadata for Gd[SceneTree] lifetime management and casting. */
  given GodotClass[SceneTree] with {
    def className = "SceneTree"
    def isRefCounted = false
    def wrap(o: GodotObject): SceneTree = new SceneTree {}.withHost(o.objectPtr)
    def unwrap(t: SceneTree): GodotObject = t.hostObject
  }
}
