package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SceneTree`, extends `MainLoop`. */
abstract class SceneTree extends MainLoop {
  override def godotClassName: String = "SceneTree"

  /** SceneTree.get_root */
  final def getRoot(): Window = {
    if (gdext.classes.SceneTree.mb_get_root == null) gdext.classes.SceneTree.mb_get_root = MethodBind.get("SceneTree", "get_root", 1757182445L)
    Wrappers.borrowed[Window](Ptrcall.call0[Long](gdext.classes.SceneTree.mb_get_root, livePtr))
  }

  /** SceneTree.has_group */
  final def hasGroup(name: String): Boolean = {
    if (gdext.classes.SceneTree.mb_has_group == null) gdext.classes.SceneTree.mb_has_group = MethodBind.get("SceneTree", "has_group", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.SceneTree.mb_has_group, livePtr, SnArg(name))
  }

  /** SceneTree.is_accessibility_enabled */
  final def isAccessibilityEnabled(): Boolean = {
    if (gdext.classes.SceneTree.mb_is_accessibility_enabled == null) gdext.classes.SceneTree.mb_is_accessibility_enabled = MethodBind.get("SceneTree", "is_accessibility_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SceneTree.mb_is_accessibility_enabled, livePtr)
  }

  /** SceneTree.is_accessibility_supported */
  final def isAccessibilitySupported(): Boolean = {
    if (gdext.classes.SceneTree.mb_is_accessibility_supported == null) gdext.classes.SceneTree.mb_is_accessibility_supported = MethodBind.get("SceneTree", "is_accessibility_supported", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SceneTree.mb_is_accessibility_supported, livePtr)
  }

  /** SceneTree.is_auto_accept_quit */
  final def isAutoAcceptQuit(): Boolean = {
    if (gdext.classes.SceneTree.mb_is_auto_accept_quit == null) gdext.classes.SceneTree.mb_is_auto_accept_quit = MethodBind.get("SceneTree", "is_auto_accept_quit", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SceneTree.mb_is_auto_accept_quit, livePtr)
  }

  /** SceneTree.set_auto_accept_quit */
  final def setAutoAcceptQuit(enabled: Boolean): Unit = {
    if (gdext.classes.SceneTree.mb_set_auto_accept_quit == null) gdext.classes.SceneTree.mb_set_auto_accept_quit = MethodBind.get("SceneTree", "set_auto_accept_quit", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SceneTree.mb_set_auto_accept_quit, livePtr, enabled)
  }

  /** SceneTree.is_quit_on_go_back */
  final def isQuitOnGoBack(): Boolean = {
    if (gdext.classes.SceneTree.mb_is_quit_on_go_back == null) gdext.classes.SceneTree.mb_is_quit_on_go_back = MethodBind.get("SceneTree", "is_quit_on_go_back", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SceneTree.mb_is_quit_on_go_back, livePtr)
  }

  /** SceneTree.set_quit_on_go_back */
  final def setQuitOnGoBack(enabled: Boolean): Unit = {
    if (gdext.classes.SceneTree.mb_set_quit_on_go_back == null) gdext.classes.SceneTree.mb_set_quit_on_go_back = MethodBind.get("SceneTree", "set_quit_on_go_back", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SceneTree.mb_set_quit_on_go_back, livePtr, enabled)
  }

  /** SceneTree.set_debug_collisions_hint */
  final def setDebugCollisionsHint(enable: Boolean): Unit = {
    if (gdext.classes.SceneTree.mb_set_debug_collisions_hint == null) gdext.classes.SceneTree.mb_set_debug_collisions_hint = MethodBind.get("SceneTree", "set_debug_collisions_hint", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SceneTree.mb_set_debug_collisions_hint, livePtr, enable)
  }

  /** SceneTree.is_debugging_collisions_hint */
  final def isDebuggingCollisionsHint(): Boolean = {
    if (gdext.classes.SceneTree.mb_is_debugging_collisions_hint == null) gdext.classes.SceneTree.mb_is_debugging_collisions_hint = MethodBind.get("SceneTree", "is_debugging_collisions_hint", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SceneTree.mb_is_debugging_collisions_hint, livePtr)
  }

  /** SceneTree.set_debug_paths_hint */
  final def setDebugPathsHint(enable: Boolean): Unit = {
    if (gdext.classes.SceneTree.mb_set_debug_paths_hint == null) gdext.classes.SceneTree.mb_set_debug_paths_hint = MethodBind.get("SceneTree", "set_debug_paths_hint", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SceneTree.mb_set_debug_paths_hint, livePtr, enable)
  }

  /** SceneTree.is_debugging_paths_hint */
  final def isDebuggingPathsHint(): Boolean = {
    if (gdext.classes.SceneTree.mb_is_debugging_paths_hint == null) gdext.classes.SceneTree.mb_is_debugging_paths_hint = MethodBind.get("SceneTree", "is_debugging_paths_hint", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SceneTree.mb_is_debugging_paths_hint, livePtr)
  }

  /** SceneTree.set_debug_navigation_hint */
  final def setDebugNavigationHint(enable: Boolean): Unit = {
    if (gdext.classes.SceneTree.mb_set_debug_navigation_hint == null) gdext.classes.SceneTree.mb_set_debug_navigation_hint = MethodBind.get("SceneTree", "set_debug_navigation_hint", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SceneTree.mb_set_debug_navigation_hint, livePtr, enable)
  }

  /** SceneTree.is_debugging_navigation_hint */
  final def isDebuggingNavigationHint(): Boolean = {
    if (gdext.classes.SceneTree.mb_is_debugging_navigation_hint == null) gdext.classes.SceneTree.mb_is_debugging_navigation_hint = MethodBind.get("SceneTree", "is_debugging_navigation_hint", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SceneTree.mb_is_debugging_navigation_hint, livePtr)
  }

  /** SceneTree.set_edited_scene_root */
  final def setEditedSceneRoot(scene: Node): Unit = {
    if (gdext.classes.SceneTree.mb_set_edited_scene_root == null) gdext.classes.SceneTree.mb_set_edited_scene_root = MethodBind.get("SceneTree", "set_edited_scene_root", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.SceneTree.mb_set_edited_scene_root, livePtr, Wrappers.handle(scene))
  }

  /** SceneTree.get_edited_scene_root */
  final def getEditedSceneRoot(): Node = {
    if (gdext.classes.SceneTree.mb_get_edited_scene_root == null) gdext.classes.SceneTree.mb_get_edited_scene_root = MethodBind.get("SceneTree", "get_edited_scene_root", 3160264692L)
    Wrappers.borrowed[Node](Ptrcall.call0[Long](gdext.classes.SceneTree.mb_get_edited_scene_root, livePtr))
  }

  /** SceneTree.set_pause */
  final def setPause(enable: Boolean): Unit = {
    if (gdext.classes.SceneTree.mb_set_pause == null) gdext.classes.SceneTree.mb_set_pause = MethodBind.get("SceneTree", "set_pause", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SceneTree.mb_set_pause, livePtr, enable)
  }

  /** SceneTree.is_paused */
  final def isPaused(): Boolean = {
    if (gdext.classes.SceneTree.mb_is_paused == null) gdext.classes.SceneTree.mb_is_paused = MethodBind.get("SceneTree", "is_paused", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SceneTree.mb_is_paused, livePtr)
  }

  /** SceneTree.create_timer. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createTimer(timeSec: Double, processAlways: Boolean = true, processInPhysics: Boolean = false, ignoreTimeScale: Boolean = false): SceneTreeTimer = {
    if (gdext.classes.SceneTree.mb_create_timer == null) gdext.classes.SceneTree.mb_create_timer = MethodBind.get("SceneTree", "create_timer", 2709170273L)
    Wrappers.owned[SceneTreeTimer](Ptrcall.call4[Double, Boolean, Boolean, Boolean, Long](gdext.classes.SceneTree.mb_create_timer, livePtr, timeSec, processAlways, processInPhysics, ignoreTimeScale))
  }

  /** SceneTree.create_tween. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createTween(): Tween = {
    if (gdext.classes.SceneTree.mb_create_tween == null) gdext.classes.SceneTree.mb_create_tween = MethodBind.get("SceneTree", "create_tween", 3426978995L)
    Wrappers.owned[Tween](Ptrcall.call0[Long](gdext.classes.SceneTree.mb_create_tween, livePtr))
  }

  /** SceneTree.get_node_count */
  final def getNodeCount(): Long = {
    if (gdext.classes.SceneTree.mb_get_node_count == null) gdext.classes.SceneTree.mb_get_node_count = MethodBind.get("SceneTree", "get_node_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SceneTree.mb_get_node_count, livePtr)
  }

  /** SceneTree.get_frame */
  final def getFrame(): Long = {
    if (gdext.classes.SceneTree.mb_get_frame == null) gdext.classes.SceneTree.mb_get_frame = MethodBind.get("SceneTree", "get_frame", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SceneTree.mb_get_frame, livePtr)
  }

  /** SceneTree.quit */
  final def quit(exitCode: Long = 0L): Unit = {
    if (gdext.classes.SceneTree.mb_quit == null) gdext.classes.SceneTree.mb_quit = MethodBind.get("SceneTree", "quit", 1995695955L)
    Ptrcall.callVoid1(gdext.classes.SceneTree.mb_quit, livePtr, exitCode)
  }

  /** SceneTree.set_physics_interpolation_enabled */
  final def setPhysicsInterpolationEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.SceneTree.mb_set_physics_interpolation_enabled == null) gdext.classes.SceneTree.mb_set_physics_interpolation_enabled = MethodBind.get("SceneTree", "set_physics_interpolation_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SceneTree.mb_set_physics_interpolation_enabled, livePtr, enabled)
  }

  /** SceneTree.is_physics_interpolation_enabled */
  final def isPhysicsInterpolationEnabled(): Boolean = {
    if (gdext.classes.SceneTree.mb_is_physics_interpolation_enabled == null) gdext.classes.SceneTree.mb_is_physics_interpolation_enabled = MethodBind.get("SceneTree", "is_physics_interpolation_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SceneTree.mb_is_physics_interpolation_enabled, livePtr)
  }

  /** SceneTree.queue_delete */
  final def queueDelete(obj: Object): Unit = {
    if (gdext.classes.SceneTree.mb_queue_delete == null) gdext.classes.SceneTree.mb_queue_delete = MethodBind.get("SceneTree", "queue_delete", 3975164845L)
    Ptrcall.callVoid1(gdext.classes.SceneTree.mb_queue_delete, livePtr, Wrappers.handle(obj))
  }

  /** SceneTree.notify_group_flags */
  final def notifyGroupFlags(callFlags: Long, group: String, notification: Long): Unit = {
    if (gdext.classes.SceneTree.mb_notify_group_flags == null) gdext.classes.SceneTree.mb_notify_group_flags = MethodBind.get("SceneTree", "notify_group_flags", 1245489420L)
    Ptrcall.callVoid3(gdext.classes.SceneTree.mb_notify_group_flags, livePtr, callFlags, SnArg(group), notification)
  }

  /** SceneTree.notify_group */
  final def notifyGroup(group: String, notification: Long): Unit = {
    if (gdext.classes.SceneTree.mb_notify_group == null) gdext.classes.SceneTree.mb_notify_group = MethodBind.get("SceneTree", "notify_group", 2415702435L)
    Ptrcall.callVoid2(gdext.classes.SceneTree.mb_notify_group, livePtr, SnArg(group), notification)
  }

  /** SceneTree.get_first_node_in_group */
  final def getFirstNodeInGroup(group: String): Node = {
    if (gdext.classes.SceneTree.mb_get_first_node_in_group == null) gdext.classes.SceneTree.mb_get_first_node_in_group = MethodBind.get("SceneTree", "get_first_node_in_group", 4071044623L)
    Wrappers.borrowed[Node](Ptrcall.call1[SnArg, Long](gdext.classes.SceneTree.mb_get_first_node_in_group, livePtr, SnArg(group)))
  }

  /** SceneTree.get_node_count_in_group */
  final def getNodeCountInGroup(group: String): Long = {
    if (gdext.classes.SceneTree.mb_get_node_count_in_group == null) gdext.classes.SceneTree.mb_get_node_count_in_group = MethodBind.get("SceneTree", "get_node_count_in_group", 2458036349L)
    Ptrcall.call1[SnArg, Long](gdext.classes.SceneTree.mb_get_node_count_in_group, livePtr, SnArg(group))
  }

  /** SceneTree.set_current_scene */
  final def setCurrentScene(childNode: Node): Unit = {
    if (gdext.classes.SceneTree.mb_set_current_scene == null) gdext.classes.SceneTree.mb_set_current_scene = MethodBind.get("SceneTree", "set_current_scene", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.SceneTree.mb_set_current_scene, livePtr, Wrappers.handle(childNode))
  }

  /** SceneTree.get_current_scene */
  final def getCurrentScene(): Node = {
    if (gdext.classes.SceneTree.mb_get_current_scene == null) gdext.classes.SceneTree.mb_get_current_scene = MethodBind.get("SceneTree", "get_current_scene", 3160264692L)
    Wrappers.borrowed[Node](Ptrcall.call0[Long](gdext.classes.SceneTree.mb_get_current_scene, livePtr))
  }

  /** SceneTree.change_scene_to_file */
  final def changeSceneToFile(path: String): gdext.classes.Error = {
    if (gdext.classes.SceneTree.mb_change_scene_to_file == null) gdext.classes.SceneTree.mb_change_scene_to_file = MethodBind.get("SceneTree", "change_scene_to_file", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.SceneTree.mb_change_scene_to_file, livePtr, path))
  }

  /** SceneTree.change_scene_to_packed */
  final def changeSceneToPacked(packedScene: PackedScene): gdext.classes.Error = {
    if (gdext.classes.SceneTree.mb_change_scene_to_packed == null) gdext.classes.SceneTree.mb_change_scene_to_packed = MethodBind.get("SceneTree", "change_scene_to_packed", 107349098L)
    gdext.classes.Error(Ptrcall.call1[GodotObject, Long](gdext.classes.SceneTree.mb_change_scene_to_packed, livePtr, Wrappers.handle(packedScene)))
  }

  /** SceneTree.change_scene_to_node */
  final def changeSceneToNode(node: Node): gdext.classes.Error = {
    if (gdext.classes.SceneTree.mb_change_scene_to_node == null) gdext.classes.SceneTree.mb_change_scene_to_node = MethodBind.get("SceneTree", "change_scene_to_node", 2584678054L)
    gdext.classes.Error(Ptrcall.call1[GodotObject, Long](gdext.classes.SceneTree.mb_change_scene_to_node, livePtr, Wrappers.handle(node)))
  }

  /** SceneTree.reload_current_scene */
  final def reloadCurrentScene(): gdext.classes.Error = {
    if (gdext.classes.SceneTree.mb_reload_current_scene == null) gdext.classes.SceneTree.mb_reload_current_scene = MethodBind.get("SceneTree", "reload_current_scene", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.SceneTree.mb_reload_current_scene, livePtr))
  }

  /** SceneTree.unload_current_scene */
  final def unloadCurrentScene(): Unit = {
    if (gdext.classes.SceneTree.mb_unload_current_scene == null) gdext.classes.SceneTree.mb_unload_current_scene = MethodBind.get("SceneTree", "unload_current_scene", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SceneTree.mb_unload_current_scene, livePtr)
  }

  /** SceneTree.set_multiplayer_poll_enabled */
  final def setMultiplayerPollEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.SceneTree.mb_set_multiplayer_poll_enabled == null) gdext.classes.SceneTree.mb_set_multiplayer_poll_enabled = MethodBind.get("SceneTree", "set_multiplayer_poll_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SceneTree.mb_set_multiplayer_poll_enabled, livePtr, enabled)
  }

  /** SceneTree.is_multiplayer_poll_enabled */
  final def isMultiplayerPollEnabled(): Boolean = {
    if (gdext.classes.SceneTree.mb_is_multiplayer_poll_enabled == null) gdext.classes.SceneTree.mb_is_multiplayer_poll_enabled = MethodBind.get("SceneTree", "is_multiplayer_poll_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SceneTree.mb_is_multiplayer_poll_enabled, livePtr)
  }

}

object SceneTree {
  private[classes] var mb_get_root: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_accessibility_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_accessibility_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_auto_accept_quit: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_accept_quit: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_quit_on_go_back: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_quit_on_go_back: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_collisions_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_debugging_collisions_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_paths_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_debugging_paths_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_navigation_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_debugging_navigation_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_edited_scene_root: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_edited_scene_root: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pause: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_paused: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_timer: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_tween: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_quit: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_interpolation_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_physics_interpolation_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_queue_delete: GDExtensionMethodBindPtr = null
  private[classes] var mb_notify_group_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_notify_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_first_node_in_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_count_in_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_current_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_change_scene_to_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_change_scene_to_packed: GDExtensionMethodBindPtr = null
  private[classes] var mb_change_scene_to_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_reload_current_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_unload_current_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_multiplayer_poll_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_multiplayer_poll_enabled: GDExtensionMethodBindPtr = null

  /** Godot enum `SceneTree.GroupCallFlags`. */
  opaque type GroupCallFlags <: Long = Long

  object GroupCallFlags {
    final val Default: GroupCallFlags = 0L.asInstanceOf[GroupCallFlags]
    final val Reverse: GroupCallFlags = 1L.asInstanceOf[GroupCallFlags]
    final val Deferred: GroupCallFlags = 2L.asInstanceOf[GroupCallFlags]
    final val Unique: GroupCallFlags = 4L.asInstanceOf[GroupCallFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): GroupCallFlags = value.asInstanceOf[GroupCallFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[GroupCallFlags] = scala.IArray[Long](0L, 1L, 2L, 4L).asInstanceOf[scala.IArray[GroupCallFlags]]

    extension (self: GroupCallFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Default"
        case 1L => "Reverse"
        case 2L => "Deferred"
        case 4L => "Unique"
        case other => other.toString
      }
  }
}
