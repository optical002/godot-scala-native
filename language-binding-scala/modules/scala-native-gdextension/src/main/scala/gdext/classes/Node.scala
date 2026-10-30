package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Node`, extends `Object`. */
abstract class Node extends Object {
  override def godotClassName: String = "Node"

  /** Node.add_sibling */
  final def addSibling(sibling: Node, forceReadableName: Boolean = false): Unit = {
    if (gdext.classes.Node.mb_add_sibling == null) gdext.classes.Node.mb_add_sibling = MethodBind.get("Node", "add_sibling", 2570952461L)
    Ptrcall.callVoid2(gdext.classes.Node.mb_add_sibling, livePtr, Wrappers.handle(sibling), forceReadableName)
  }

  /** Node.set_name */
  final def setName(name: String): Unit = {
    if (gdext.classes.Node.mb_set_name == null) gdext.classes.Node.mb_set_name = MethodBind.get("Node", "set_name", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_name, livePtr, SnArg(name))
  }

  /** Node.get_name */
  final def getName(): String = {
    if (gdext.classes.Node.mb_get_name == null) gdext.classes.Node.mb_get_name = MethodBind.get("Node", "get_name", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.Node.mb_get_name, livePtr)
  }

  /** Node.add_child */
  final def addChild(node: Node, forceReadableName: Boolean = false, internal: gdext.classes.Node.InternalMode = gdext.classes.Node.InternalMode(0L)): Unit = {
    if (gdext.classes.Node.mb_add_child == null) gdext.classes.Node.mb_add_child = MethodBind.get("Node", "add_child", 3863233950L)
    Ptrcall.callVoid3(gdext.classes.Node.mb_add_child, livePtr, Wrappers.handle(node), forceReadableName, internal)
  }

  /** Node.remove_child */
  final def removeChild(node: Node): Unit = {
    if (gdext.classes.Node.mb_remove_child == null) gdext.classes.Node.mb_remove_child = MethodBind.get("Node", "remove_child", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_remove_child, livePtr, Wrappers.handle(node))
  }

  /** Node.reparent */
  final def reparent(newParent: Node, keepGlobalTransform: Boolean = true): Unit = {
    if (gdext.classes.Node.mb_reparent == null) gdext.classes.Node.mb_reparent = MethodBind.get("Node", "reparent", 3685795103L)
    Ptrcall.callVoid2(gdext.classes.Node.mb_reparent, livePtr, Wrappers.handle(newParent), keepGlobalTransform)
  }

  /** Node.get_child_count */
  final def getChildCount(includeInternal: Boolean = false): Long = {
    if (gdext.classes.Node.mb_get_child_count == null) gdext.classes.Node.mb_get_child_count = MethodBind.get("Node", "get_child_count", 894402480L)
    Ptrcall.call1[Boolean, Long](gdext.classes.Node.mb_get_child_count, livePtr, includeInternal)
  }

  /** Node.get_child */
  final def getChild(idx: Long, includeInternal: Boolean = false): Node = {
    if (gdext.classes.Node.mb_get_child == null) gdext.classes.Node.mb_get_child = MethodBind.get("Node", "get_child", 541253412L)
    Wrappers.borrowed[Node](Ptrcall.call2[Long, Boolean, Long](gdext.classes.Node.mb_get_child, livePtr, idx, includeInternal))
  }

  /** Node.get_parent */
  final def getParent(): Node = {
    if (gdext.classes.Node.mb_get_parent == null) gdext.classes.Node.mb_get_parent = MethodBind.get("Node", "get_parent", 3160264692L)
    Wrappers.borrowed[Node](Ptrcall.call0[Long](gdext.classes.Node.mb_get_parent, livePtr))
  }

  /** Node.find_child */
  final def findChild(pattern: String, recursive: Boolean = true, owned: Boolean = true): Node = {
    if (gdext.classes.Node.mb_find_child == null) gdext.classes.Node.mb_find_child = MethodBind.get("Node", "find_child", 2008217037L)
    Wrappers.borrowed[Node](Ptrcall.call3[String, Boolean, Boolean, Long](gdext.classes.Node.mb_find_child, livePtr, pattern, recursive, owned))
  }

  /** Node.find_parent */
  final def findParent(pattern: String): Node = {
    if (gdext.classes.Node.mb_find_parent == null) gdext.classes.Node.mb_find_parent = MethodBind.get("Node", "find_parent", 1140089439L)
    Wrappers.borrowed[Node](Ptrcall.call1[String, Long](gdext.classes.Node.mb_find_parent, livePtr, pattern))
  }

  /** Node.is_inside_tree */
  final def isInsideTree(): Boolean = {
    if (gdext.classes.Node.mb_is_inside_tree == null) gdext.classes.Node.mb_is_inside_tree = MethodBind.get("Node", "is_inside_tree", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_is_inside_tree, livePtr)
  }

  /** Node.is_part_of_edited_scene */
  final def isPartOfEditedScene(): Boolean = {
    if (gdext.classes.Node.mb_is_part_of_edited_scene == null) gdext.classes.Node.mb_is_part_of_edited_scene = MethodBind.get("Node", "is_part_of_edited_scene", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_is_part_of_edited_scene, livePtr)
  }

  /** Node.is_ancestor_of */
  final def isAncestorOf(node: Node): Boolean = {
    if (gdext.classes.Node.mb_is_ancestor_of == null) gdext.classes.Node.mb_is_ancestor_of = MethodBind.get("Node", "is_ancestor_of", 3093956946L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.Node.mb_is_ancestor_of, livePtr, Wrappers.handle(node))
  }

  /** Node.is_greater_than */
  final def isGreaterThan(node: Node): Boolean = {
    if (gdext.classes.Node.mb_is_greater_than == null) gdext.classes.Node.mb_is_greater_than = MethodBind.get("Node", "is_greater_than", 3093956946L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.Node.mb_is_greater_than, livePtr, Wrappers.handle(node))
  }

  /** Node.add_to_group */
  final def addToGroup(group: String, persistent: Boolean = false): Unit = {
    if (gdext.classes.Node.mb_add_to_group == null) gdext.classes.Node.mb_add_to_group = MethodBind.get("Node", "add_to_group", 3683006648L)
    Ptrcall.callVoid2(gdext.classes.Node.mb_add_to_group, livePtr, SnArg(group), persistent)
  }

  /** Node.remove_from_group */
  final def removeFromGroup(group: String): Unit = {
    if (gdext.classes.Node.mb_remove_from_group == null) gdext.classes.Node.mb_remove_from_group = MethodBind.get("Node", "remove_from_group", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_remove_from_group, livePtr, SnArg(group))
  }

  /** Node.is_in_group */
  final def isInGroup(group: String): Boolean = {
    if (gdext.classes.Node.mb_is_in_group == null) gdext.classes.Node.mb_is_in_group = MethodBind.get("Node", "is_in_group", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Node.mb_is_in_group, livePtr, SnArg(group))
  }

  /** Node.move_child */
  final def moveChild(childNode: Node, toIndex: Long): Unit = {
    if (gdext.classes.Node.mb_move_child == null) gdext.classes.Node.mb_move_child = MethodBind.get("Node", "move_child", 3315886247L)
    Ptrcall.callVoid2(gdext.classes.Node.mb_move_child, livePtr, Wrappers.handle(childNode), toIndex)
  }

  /** Node.set_owner */
  final def setOwner(owner: Node): Unit = {
    if (gdext.classes.Node.mb_set_owner == null) gdext.classes.Node.mb_set_owner = MethodBind.get("Node", "set_owner", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_owner, livePtr, Wrappers.handle(owner))
  }

  /** Node.get_owner */
  final def getOwner(): Node = {
    if (gdext.classes.Node.mb_get_owner == null) gdext.classes.Node.mb_get_owner = MethodBind.get("Node", "get_owner", 3160264692L)
    Wrappers.borrowed[Node](Ptrcall.call0[Long](gdext.classes.Node.mb_get_owner, livePtr))
  }

  /** Node.get_index */
  final def getIndex(includeInternal: Boolean = false): Long = {
    if (gdext.classes.Node.mb_get_index == null) gdext.classes.Node.mb_get_index = MethodBind.get("Node", "get_index", 894402480L)
    Ptrcall.call1[Boolean, Long](gdext.classes.Node.mb_get_index, livePtr, includeInternal)
  }

  /** Node.print_tree */
  final def printTree(): Unit = {
    if (gdext.classes.Node.mb_print_tree == null) gdext.classes.Node.mb_print_tree = MethodBind.get("Node", "print_tree", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node.mb_print_tree, livePtr)
  }

  /** Node.print_tree_pretty */
  final def printTreePretty(): Unit = {
    if (gdext.classes.Node.mb_print_tree_pretty == null) gdext.classes.Node.mb_print_tree_pretty = MethodBind.get("Node", "print_tree_pretty", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node.mb_print_tree_pretty, livePtr)
  }

  /** Node.get_tree_string */
  final def getTreeString(): String = {
    if (gdext.classes.Node.mb_get_tree_string == null) gdext.classes.Node.mb_get_tree_string = MethodBind.get("Node", "get_tree_string", 2841200299L)
    Ptrcall.call0[String](gdext.classes.Node.mb_get_tree_string, livePtr)
  }

  /** Node.get_tree_string_pretty */
  final def getTreeStringPretty(): String = {
    if (gdext.classes.Node.mb_get_tree_string_pretty == null) gdext.classes.Node.mb_get_tree_string_pretty = MethodBind.get("Node", "get_tree_string_pretty", 2841200299L)
    Ptrcall.call0[String](gdext.classes.Node.mb_get_tree_string_pretty, livePtr)
  }

  /** Node.set_scene_file_path */
  final def setSceneFilePath(sceneFilePath: String): Unit = {
    if (gdext.classes.Node.mb_set_scene_file_path == null) gdext.classes.Node.mb_set_scene_file_path = MethodBind.get("Node", "set_scene_file_path", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_scene_file_path, livePtr, sceneFilePath)
  }

  /** Node.get_scene_file_path */
  final def getSceneFilePath(): String = {
    if (gdext.classes.Node.mb_get_scene_file_path == null) gdext.classes.Node.mb_get_scene_file_path = MethodBind.get("Node", "get_scene_file_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.Node.mb_get_scene_file_path, livePtr)
  }

  /** Node.propagate_notification */
  final def propagateNotification(what: Long): Unit = {
    if (gdext.classes.Node.mb_propagate_notification == null) gdext.classes.Node.mb_propagate_notification = MethodBind.get("Node", "propagate_notification", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_propagate_notification, livePtr, what)
  }

  /** Node.set_physics_process */
  final def setPhysicsProcess(enable: Boolean): Unit = {
    if (gdext.classes.Node.mb_set_physics_process == null) gdext.classes.Node.mb_set_physics_process = MethodBind.get("Node", "set_physics_process", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_physics_process, livePtr, enable)
  }

  /** Node.get_physics_process_delta_time */
  final def getPhysicsProcessDeltaTime(): Double = {
    if (gdext.classes.Node.mb_get_physics_process_delta_time == null) gdext.classes.Node.mb_get_physics_process_delta_time = MethodBind.get("Node", "get_physics_process_delta_time", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Node.mb_get_physics_process_delta_time, livePtr)
  }

  /** Node.is_physics_processing */
  final def isPhysicsProcessing(): Boolean = {
    if (gdext.classes.Node.mb_is_physics_processing == null) gdext.classes.Node.mb_is_physics_processing = MethodBind.get("Node", "is_physics_processing", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_is_physics_processing, livePtr)
  }

  /** Node.get_process_delta_time */
  final def getProcessDeltaTime(): Double = {
    if (gdext.classes.Node.mb_get_process_delta_time == null) gdext.classes.Node.mb_get_process_delta_time = MethodBind.get("Node", "get_process_delta_time", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Node.mb_get_process_delta_time, livePtr)
  }

  /** Node.set_process */
  final def setProcess(enable: Boolean): Unit = {
    if (gdext.classes.Node.mb_set_process == null) gdext.classes.Node.mb_set_process = MethodBind.get("Node", "set_process", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_process, livePtr, enable)
  }

  /** Node.set_process_priority */
  final def setProcessPriority(priority: Long): Unit = {
    if (gdext.classes.Node.mb_set_process_priority == null) gdext.classes.Node.mb_set_process_priority = MethodBind.get("Node", "set_process_priority", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_process_priority, livePtr, priority)
  }

  /** Node.get_process_priority */
  final def getProcessPriority(): Long = {
    if (gdext.classes.Node.mb_get_process_priority == null) gdext.classes.Node.mb_get_process_priority = MethodBind.get("Node", "get_process_priority", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Node.mb_get_process_priority, livePtr)
  }

  /** Node.set_physics_process_priority */
  final def setPhysicsProcessPriority(priority: Long): Unit = {
    if (gdext.classes.Node.mb_set_physics_process_priority == null) gdext.classes.Node.mb_set_physics_process_priority = MethodBind.get("Node", "set_physics_process_priority", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_physics_process_priority, livePtr, priority)
  }

  /** Node.get_physics_process_priority */
  final def getPhysicsProcessPriority(): Long = {
    if (gdext.classes.Node.mb_get_physics_process_priority == null) gdext.classes.Node.mb_get_physics_process_priority = MethodBind.get("Node", "get_physics_process_priority", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Node.mb_get_physics_process_priority, livePtr)
  }

  /** Node.is_processing */
  final def isProcessing(): Boolean = {
    if (gdext.classes.Node.mb_is_processing == null) gdext.classes.Node.mb_is_processing = MethodBind.get("Node", "is_processing", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_is_processing, livePtr)
  }

  /** Node.set_process_input */
  final def setProcessInput(enable: Boolean): Unit = {
    if (gdext.classes.Node.mb_set_process_input == null) gdext.classes.Node.mb_set_process_input = MethodBind.get("Node", "set_process_input", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_process_input, livePtr, enable)
  }

  /** Node.is_processing_input */
  final def isProcessingInput(): Boolean = {
    if (gdext.classes.Node.mb_is_processing_input == null) gdext.classes.Node.mb_is_processing_input = MethodBind.get("Node", "is_processing_input", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_is_processing_input, livePtr)
  }

  /** Node.set_process_shortcut_input */
  final def setProcessShortcutInput(enable: Boolean): Unit = {
    if (gdext.classes.Node.mb_set_process_shortcut_input == null) gdext.classes.Node.mb_set_process_shortcut_input = MethodBind.get("Node", "set_process_shortcut_input", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_process_shortcut_input, livePtr, enable)
  }

  /** Node.is_processing_shortcut_input */
  final def isProcessingShortcutInput(): Boolean = {
    if (gdext.classes.Node.mb_is_processing_shortcut_input == null) gdext.classes.Node.mb_is_processing_shortcut_input = MethodBind.get("Node", "is_processing_shortcut_input", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_is_processing_shortcut_input, livePtr)
  }

  /** Node.set_process_unhandled_input */
  final def setProcessUnhandledInput(enable: Boolean): Unit = {
    if (gdext.classes.Node.mb_set_process_unhandled_input == null) gdext.classes.Node.mb_set_process_unhandled_input = MethodBind.get("Node", "set_process_unhandled_input", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_process_unhandled_input, livePtr, enable)
  }

  /** Node.is_processing_unhandled_input */
  final def isProcessingUnhandledInput(): Boolean = {
    if (gdext.classes.Node.mb_is_processing_unhandled_input == null) gdext.classes.Node.mb_is_processing_unhandled_input = MethodBind.get("Node", "is_processing_unhandled_input", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_is_processing_unhandled_input, livePtr)
  }

  /** Node.set_process_unhandled_key_input */
  final def setProcessUnhandledKeyInput(enable: Boolean): Unit = {
    if (gdext.classes.Node.mb_set_process_unhandled_key_input == null) gdext.classes.Node.mb_set_process_unhandled_key_input = MethodBind.get("Node", "set_process_unhandled_key_input", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_process_unhandled_key_input, livePtr, enable)
  }

  /** Node.is_processing_unhandled_key_input */
  final def isProcessingUnhandledKeyInput(): Boolean = {
    if (gdext.classes.Node.mb_is_processing_unhandled_key_input == null) gdext.classes.Node.mb_is_processing_unhandled_key_input = MethodBind.get("Node", "is_processing_unhandled_key_input", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_is_processing_unhandled_key_input, livePtr)
  }

  /** Node.set_process_mode */
  final def setProcessMode(mode: gdext.classes.Node.ProcessMode): Unit = {
    if (gdext.classes.Node.mb_set_process_mode == null) gdext.classes.Node.mb_set_process_mode = MethodBind.get("Node", "set_process_mode", 1841290486L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_process_mode, livePtr, mode)
  }

  /** Node.get_process_mode */
  final def getProcessMode(): gdext.classes.Node.ProcessMode = {
    if (gdext.classes.Node.mb_get_process_mode == null) gdext.classes.Node.mb_get_process_mode = MethodBind.get("Node", "get_process_mode", 739966102L)
    gdext.classes.Node.ProcessMode(Ptrcall.call0[Long](gdext.classes.Node.mb_get_process_mode, livePtr))
  }

  /** Node.can_process */
  final def canProcess(): Boolean = {
    if (gdext.classes.Node.mb_can_process == null) gdext.classes.Node.mb_can_process = MethodBind.get("Node", "can_process", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_can_process, livePtr)
  }

  /** Node.set_process_thread_group */
  final def setProcessThreadGroup(mode: gdext.classes.Node.ProcessThreadGroup): Unit = {
    if (gdext.classes.Node.mb_set_process_thread_group == null) gdext.classes.Node.mb_set_process_thread_group = MethodBind.get("Node", "set_process_thread_group", 2275442745L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_process_thread_group, livePtr, mode)
  }

  /** Node.get_process_thread_group */
  final def getProcessThreadGroup(): gdext.classes.Node.ProcessThreadGroup = {
    if (gdext.classes.Node.mb_get_process_thread_group == null) gdext.classes.Node.mb_get_process_thread_group = MethodBind.get("Node", "get_process_thread_group", 1866404740L)
    gdext.classes.Node.ProcessThreadGroup(Ptrcall.call0[Long](gdext.classes.Node.mb_get_process_thread_group, livePtr))
  }

  /** Node.set_process_thread_messages */
  final def setProcessThreadMessages(flags: gdext.classes.Node.ProcessThreadMessages): Unit = {
    if (gdext.classes.Node.mb_set_process_thread_messages == null) gdext.classes.Node.mb_set_process_thread_messages = MethodBind.get("Node", "set_process_thread_messages", 1357280998L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_process_thread_messages, livePtr, flags.asInstanceOf[Long])
  }

  /** Node.get_process_thread_messages */
  final def getProcessThreadMessages(): gdext.classes.Node.ProcessThreadMessages = {
    if (gdext.classes.Node.mb_get_process_thread_messages == null) gdext.classes.Node.mb_get_process_thread_messages = MethodBind.get("Node", "get_process_thread_messages", 4228993612L)
    gdext.classes.Node.ProcessThreadMessages(Ptrcall.call0[Long](gdext.classes.Node.mb_get_process_thread_messages, livePtr))
  }

  /** Node.set_process_thread_group_order */
  final def setProcessThreadGroupOrder(order: Long): Unit = {
    if (gdext.classes.Node.mb_set_process_thread_group_order == null) gdext.classes.Node.mb_set_process_thread_group_order = MethodBind.get("Node", "set_process_thread_group_order", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_process_thread_group_order, livePtr, order)
  }

  /** Node.get_process_thread_group_order */
  final def getProcessThreadGroupOrder(): Long = {
    if (gdext.classes.Node.mb_get_process_thread_group_order == null) gdext.classes.Node.mb_get_process_thread_group_order = MethodBind.get("Node", "get_process_thread_group_order", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Node.mb_get_process_thread_group_order, livePtr)
  }

  /** Node.queue_accessibility_update */
  final def queueAccessibilityUpdate(): Unit = {
    if (gdext.classes.Node.mb_queue_accessibility_update == null) gdext.classes.Node.mb_queue_accessibility_update = MethodBind.get("Node", "queue_accessibility_update", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node.mb_queue_accessibility_update, livePtr)
  }

  /** Node.set_display_folded */
  final def setDisplayFolded(fold: Boolean): Unit = {
    if (gdext.classes.Node.mb_set_display_folded == null) gdext.classes.Node.mb_set_display_folded = MethodBind.get("Node", "set_display_folded", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_display_folded, livePtr, fold)
  }

  /** Node.is_displayed_folded */
  final def isDisplayedFolded(): Boolean = {
    if (gdext.classes.Node.mb_is_displayed_folded == null) gdext.classes.Node.mb_is_displayed_folded = MethodBind.get("Node", "is_displayed_folded", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_is_displayed_folded, livePtr)
  }

  /** Node.set_process_internal */
  final def setProcessInternal(enable: Boolean): Unit = {
    if (gdext.classes.Node.mb_set_process_internal == null) gdext.classes.Node.mb_set_process_internal = MethodBind.get("Node", "set_process_internal", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_process_internal, livePtr, enable)
  }

  /** Node.is_processing_internal */
  final def isProcessingInternal(): Boolean = {
    if (gdext.classes.Node.mb_is_processing_internal == null) gdext.classes.Node.mb_is_processing_internal = MethodBind.get("Node", "is_processing_internal", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_is_processing_internal, livePtr)
  }

  /** Node.set_physics_process_internal */
  final def setPhysicsProcessInternal(enable: Boolean): Unit = {
    if (gdext.classes.Node.mb_set_physics_process_internal == null) gdext.classes.Node.mb_set_physics_process_internal = MethodBind.get("Node", "set_physics_process_internal", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_physics_process_internal, livePtr, enable)
  }

  /** Node.is_physics_processing_internal */
  final def isPhysicsProcessingInternal(): Boolean = {
    if (gdext.classes.Node.mb_is_physics_processing_internal == null) gdext.classes.Node.mb_is_physics_processing_internal = MethodBind.get("Node", "is_physics_processing_internal", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_is_physics_processing_internal, livePtr)
  }

  /** Node.set_physics_interpolation_mode */
  final def setPhysicsInterpolationMode(mode: gdext.classes.Node.PhysicsInterpolationMode): Unit = {
    if (gdext.classes.Node.mb_set_physics_interpolation_mode == null) gdext.classes.Node.mb_set_physics_interpolation_mode = MethodBind.get("Node", "set_physics_interpolation_mode", 3202404928L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_physics_interpolation_mode, livePtr, mode)
  }

  /** Node.get_physics_interpolation_mode */
  final def getPhysicsInterpolationMode(): gdext.classes.Node.PhysicsInterpolationMode = {
    if (gdext.classes.Node.mb_get_physics_interpolation_mode == null) gdext.classes.Node.mb_get_physics_interpolation_mode = MethodBind.get("Node", "get_physics_interpolation_mode", 2920385216L)
    gdext.classes.Node.PhysicsInterpolationMode(Ptrcall.call0[Long](gdext.classes.Node.mb_get_physics_interpolation_mode, livePtr))
  }

  /** Node.is_physics_interpolated */
  final def isPhysicsInterpolated(): Boolean = {
    if (gdext.classes.Node.mb_is_physics_interpolated == null) gdext.classes.Node.mb_is_physics_interpolated = MethodBind.get("Node", "is_physics_interpolated", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_is_physics_interpolated, livePtr)
  }

  /** Node.is_physics_interpolated_and_enabled */
  final def isPhysicsInterpolatedAndEnabled(): Boolean = {
    if (gdext.classes.Node.mb_is_physics_interpolated_and_enabled == null) gdext.classes.Node.mb_is_physics_interpolated_and_enabled = MethodBind.get("Node", "is_physics_interpolated_and_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_is_physics_interpolated_and_enabled, livePtr)
  }

  /** Node.reset_physics_interpolation */
  final def resetPhysicsInterpolation(): Unit = {
    if (gdext.classes.Node.mb_reset_physics_interpolation == null) gdext.classes.Node.mb_reset_physics_interpolation = MethodBind.get("Node", "reset_physics_interpolation", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node.mb_reset_physics_interpolation, livePtr)
  }

  /** Node.set_auto_translate_mode */
  final def setAutoTranslateMode(mode: gdext.classes.Node.AutoTranslateMode): Unit = {
    if (gdext.classes.Node.mb_set_auto_translate_mode == null) gdext.classes.Node.mb_set_auto_translate_mode = MethodBind.get("Node", "set_auto_translate_mode", 776149714L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_auto_translate_mode, livePtr, mode)
  }

  /** Node.get_auto_translate_mode */
  final def getAutoTranslateMode(): gdext.classes.Node.AutoTranslateMode = {
    if (gdext.classes.Node.mb_get_auto_translate_mode == null) gdext.classes.Node.mb_get_auto_translate_mode = MethodBind.get("Node", "get_auto_translate_mode", 2498906432L)
    gdext.classes.Node.AutoTranslateMode(Ptrcall.call0[Long](gdext.classes.Node.mb_get_auto_translate_mode, livePtr))
  }

  /** Node.can_auto_translate */
  final def canAutoTranslate(): Boolean = {
    if (gdext.classes.Node.mb_can_auto_translate == null) gdext.classes.Node.mb_can_auto_translate = MethodBind.get("Node", "can_auto_translate", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_can_auto_translate, livePtr)
  }

  /** Node.set_translation_domain_inherited */
  final def setTranslationDomainInherited(): Unit = {
    if (gdext.classes.Node.mb_set_translation_domain_inherited == null) gdext.classes.Node.mb_set_translation_domain_inherited = MethodBind.get("Node", "set_translation_domain_inherited", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node.mb_set_translation_domain_inherited, livePtr)
  }

  /** Node.get_window */
  final def getWindow(): Window = {
    if (gdext.classes.Node.mb_get_window == null) gdext.classes.Node.mb_get_window = MethodBind.get("Node", "get_window", 1757182445L)
    Wrappers.borrowed[Window](Ptrcall.call0[Long](gdext.classes.Node.mb_get_window, livePtr))
  }

  /** Node.get_last_exclusive_window */
  final def getLastExclusiveWindow(): Window = {
    if (gdext.classes.Node.mb_get_last_exclusive_window == null) gdext.classes.Node.mb_get_last_exclusive_window = MethodBind.get("Node", "get_last_exclusive_window", 1757182445L)
    Wrappers.borrowed[Window](Ptrcall.call0[Long](gdext.classes.Node.mb_get_last_exclusive_window, livePtr))
  }

  /** Node.get_tree */
  final def getTree(): SceneTree = {
    if (gdext.classes.Node.mb_get_tree == null) gdext.classes.Node.mb_get_tree = MethodBind.get("Node", "get_tree", 2958820483L)
    Wrappers.borrowed[SceneTree](Ptrcall.call0[Long](gdext.classes.Node.mb_get_tree, livePtr))
  }

  /** Node.create_tween. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createTween(): Tween = {
    if (gdext.classes.Node.mb_create_tween == null) gdext.classes.Node.mb_create_tween = MethodBind.get("Node", "create_tween", 3426978995L)
    Wrappers.owned[Tween](Ptrcall.call0[Long](gdext.classes.Node.mb_create_tween, livePtr))
  }

  /** Node.duplicate */
  final def duplicate(flags: Long = 15L): Node = {
    if (gdext.classes.Node.mb_duplicate == null) gdext.classes.Node.mb_duplicate = MethodBind.get("Node", "duplicate", 3511555459L)
    Wrappers.borrowed[Node](Ptrcall.call1[Long, Long](gdext.classes.Node.mb_duplicate, livePtr, flags))
  }

  /** Node.replace_by */
  final def replaceBy(node: Node, keepGroups: Boolean = false): Unit = {
    if (gdext.classes.Node.mb_replace_by == null) gdext.classes.Node.mb_replace_by = MethodBind.get("Node", "replace_by", 2570952461L)
    Ptrcall.callVoid2(gdext.classes.Node.mb_replace_by, livePtr, Wrappers.handle(node), keepGroups)
  }

  /** Node.set_scene_instance_load_placeholder */
  final def setSceneInstanceLoadPlaceholder(loadPlaceholder: Boolean): Unit = {
    if (gdext.classes.Node.mb_set_scene_instance_load_placeholder == null) gdext.classes.Node.mb_set_scene_instance_load_placeholder = MethodBind.get("Node", "set_scene_instance_load_placeholder", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_scene_instance_load_placeholder, livePtr, loadPlaceholder)
  }

  /** Node.get_scene_instance_load_placeholder */
  final def getSceneInstanceLoadPlaceholder(): Boolean = {
    if (gdext.classes.Node.mb_get_scene_instance_load_placeholder == null) gdext.classes.Node.mb_get_scene_instance_load_placeholder = MethodBind.get("Node", "get_scene_instance_load_placeholder", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_get_scene_instance_load_placeholder, livePtr)
  }

  /** Node.set_editable_instance */
  final def setEditableInstance(node: Node, isEditable: Boolean): Unit = {
    if (gdext.classes.Node.mb_set_editable_instance == null) gdext.classes.Node.mb_set_editable_instance = MethodBind.get("Node", "set_editable_instance", 2731852923L)
    Ptrcall.callVoid2(gdext.classes.Node.mb_set_editable_instance, livePtr, Wrappers.handle(node), isEditable)
  }

  /** Node.is_editable_instance */
  final def isEditableInstance(node: Node): Boolean = {
    if (gdext.classes.Node.mb_is_editable_instance == null) gdext.classes.Node.mb_is_editable_instance = MethodBind.get("Node", "is_editable_instance", 3093956946L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.Node.mb_is_editable_instance, livePtr, Wrappers.handle(node))
  }

  /** Node.get_viewport */
  final def getViewport(): Viewport = {
    if (gdext.classes.Node.mb_get_viewport == null) gdext.classes.Node.mb_get_viewport = MethodBind.get("Node", "get_viewport", 3596683776L)
    Wrappers.borrowed[Viewport](Ptrcall.call0[Long](gdext.classes.Node.mb_get_viewport, livePtr))
  }

  /** Node.queue_free */
  final def queueFree(): Unit = {
    if (gdext.classes.Node.mb_queue_free == null) gdext.classes.Node.mb_queue_free = MethodBind.get("Node", "queue_free", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node.mb_queue_free, livePtr)
  }

  /** Node.request_ready */
  final def requestReady(): Unit = {
    if (gdext.classes.Node.mb_request_ready == null) gdext.classes.Node.mb_request_ready = MethodBind.get("Node", "request_ready", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node.mb_request_ready, livePtr)
  }

  /** Node.is_node_ready */
  final def isNodeReady(): Boolean = {
    if (gdext.classes.Node.mb_is_node_ready == null) gdext.classes.Node.mb_is_node_ready = MethodBind.get("Node", "is_node_ready", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_is_node_ready, livePtr)
  }

  /** Node.set_multiplayer_authority */
  final def setMultiplayerAuthority(id: Long, recursive: Boolean = true): Unit = {
    if (gdext.classes.Node.mb_set_multiplayer_authority == null) gdext.classes.Node.mb_set_multiplayer_authority = MethodBind.get("Node", "set_multiplayer_authority", 972357352L)
    Ptrcall.callVoid2(gdext.classes.Node.mb_set_multiplayer_authority, livePtr, id, recursive)
  }

  /** Node.get_multiplayer_authority */
  final def getMultiplayerAuthority(): Long = {
    if (gdext.classes.Node.mb_get_multiplayer_authority == null) gdext.classes.Node.mb_get_multiplayer_authority = MethodBind.get("Node", "get_multiplayer_authority", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Node.mb_get_multiplayer_authority, livePtr)
  }

  /** Node.is_multiplayer_authority */
  final def isMultiplayerAuthority(): Boolean = {
    if (gdext.classes.Node.mb_is_multiplayer_authority == null) gdext.classes.Node.mb_is_multiplayer_authority = MethodBind.get("Node", "is_multiplayer_authority", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_is_multiplayer_authority, livePtr)
  }

  /** Node.get_multiplayer. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMultiplayer(): MultiplayerAPI = {
    if (gdext.classes.Node.mb_get_multiplayer == null) gdext.classes.Node.mb_get_multiplayer = MethodBind.get("Node", "get_multiplayer", 406750475L)
    Wrappers.owned[MultiplayerAPI](Ptrcall.call0[Long](gdext.classes.Node.mb_get_multiplayer, livePtr))
  }

  /** Node.set_editor_description */
  final def setEditorDescription(editorDescription: String): Unit = {
    if (gdext.classes.Node.mb_set_editor_description == null) gdext.classes.Node.mb_set_editor_description = MethodBind.get("Node", "set_editor_description", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_editor_description, livePtr, editorDescription)
  }

  /** Node.get_editor_description */
  final def getEditorDescription(): String = {
    if (gdext.classes.Node.mb_get_editor_description == null) gdext.classes.Node.mb_get_editor_description = MethodBind.get("Node", "get_editor_description", 201670096L)
    Ptrcall.call0[String](gdext.classes.Node.mb_get_editor_description, livePtr)
  }

  /** Node.set_unique_name_in_owner */
  final def setUniqueNameInOwner(enable: Boolean): Unit = {
    if (gdext.classes.Node.mb_set_unique_name_in_owner == null) gdext.classes.Node.mb_set_unique_name_in_owner = MethodBind.get("Node", "set_unique_name_in_owner", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_set_unique_name_in_owner, livePtr, enable)
  }

  /** Node.is_unique_name_in_owner */
  final def isUniqueNameInOwner(): Boolean = {
    if (gdext.classes.Node.mb_is_unique_name_in_owner == null) gdext.classes.Node.mb_is_unique_name_in_owner = MethodBind.get("Node", "is_unique_name_in_owner", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node.mb_is_unique_name_in_owner, livePtr)
  }

  /** Node.atr */
  final def atr(message: String, context: String = ""): String = {
    if (gdext.classes.Node.mb_atr == null) gdext.classes.Node.mb_atr = MethodBind.get("Node", "atr", 3344478075L)
    Ptrcall.call2[String, SnArg, String](gdext.classes.Node.mb_atr, livePtr, message, SnArg(context))
  }

  /** Node.atr_n */
  final def atrN(message: String, pluralMessage: String, n: Long, context: String = ""): String = {
    if (gdext.classes.Node.mb_atr_n == null) gdext.classes.Node.mb_atr_n = MethodBind.get("Node", "atr_n", 259354841L)
    Ptrcall.call4[String, SnArg, Long, SnArg, String](gdext.classes.Node.mb_atr_n, livePtr, message, SnArg(pluralMessage), n, SnArg(context))
  }

  /** Node.update_configuration_warnings */
  final def updateConfigurationWarnings(): Unit = {
    if (gdext.classes.Node.mb_update_configuration_warnings == null) gdext.classes.Node.mb_update_configuration_warnings = MethodBind.get("Node", "update_configuration_warnings", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node.mb_update_configuration_warnings, livePtr)
  }

  /** Node.notify_deferred_thread_group */
  final def notifyDeferredThreadGroup(what: Long): Unit = {
    if (gdext.classes.Node.mb_notify_deferred_thread_group == null) gdext.classes.Node.mb_notify_deferred_thread_group = MethodBind.get("Node", "notify_deferred_thread_group", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_notify_deferred_thread_group, livePtr, what)
  }

  /** Node.notify_thread_safe */
  final def notifyThreadSafe(what: Long): Unit = {
    if (gdext.classes.Node.mb_notify_thread_safe == null) gdext.classes.Node.mb_notify_thread_safe = MethodBind.get("Node", "notify_thread_safe", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Node.mb_notify_thread_safe, livePtr, what)
  }

}

object Node {
  private[classes] var mb_print_orphan_nodes: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_sibling: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_child: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_child: GDExtensionMethodBindPtr = null
  private[classes] var mb_reparent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_child_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_child: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_parent: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_child: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_parent: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_inside_tree: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_part_of_edited_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_ancestor_of: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_greater_than: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_to_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_from_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_in_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_child: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_owner: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_owner: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_print_tree: GDExtensionMethodBindPtr = null
  private[classes] var mb_print_tree_pretty: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tree_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tree_string_pretty: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scene_file_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scene_file_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_propagate_notification: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_process: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_process_delta_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_physics_processing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_delta_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_process_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_process_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_processing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_processing_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_shortcut_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_processing_shortcut_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_unhandled_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_processing_unhandled_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_unhandled_key_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_processing_unhandled_key_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_can_process: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_thread_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_thread_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_thread_messages: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_thread_messages: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_thread_group_order: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_thread_group_order: GDExtensionMethodBindPtr = null
  private[classes] var mb_queue_accessibility_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_display_folded: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_displayed_folded: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_internal: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_processing_internal: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_process_internal: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_physics_processing_internal: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_interpolation_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_interpolation_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_physics_interpolated: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_physics_interpolated_and_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset_physics_interpolation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_translate_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_auto_translate_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_can_auto_translate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_translation_domain_inherited: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_window: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_last_exclusive_window: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tree: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_tween: GDExtensionMethodBindPtr = null
  private[classes] var mb_duplicate: GDExtensionMethodBindPtr = null
  private[classes] var mb_replace_by: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scene_instance_load_placeholder: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scene_instance_load_placeholder: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_editable_instance: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editable_instance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_viewport: GDExtensionMethodBindPtr = null
  private[classes] var mb_queue_free: GDExtensionMethodBindPtr = null
  private[classes] var mb_request_ready: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_node_ready: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_multiplayer_authority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_multiplayer_authority: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_multiplayer_authority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_multiplayer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_editor_description: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_editor_description: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_unique_name_in_owner: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_unique_name_in_owner: GDExtensionMethodBindPtr = null
  private[classes] var mb_atr: GDExtensionMethodBindPtr = null
  private[classes] var mb_atr_n: GDExtensionMethodBindPtr = null
  private[classes] var mb_update_configuration_warnings: GDExtensionMethodBindPtr = null
  private[classes] var mb_notify_deferred_thread_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_notify_thread_safe: GDExtensionMethodBindPtr = null

  /** Node.print_orphan_nodes */
  final def printOrphanNodes(): Unit = {
    if (gdext.classes.Node.mb_print_orphan_nodes == null) gdext.classes.Node.mb_print_orphan_nodes = MethodBind.get("Node", "print_orphan_nodes", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node.mb_print_orphan_nodes, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr])
  }

  /** Godot enum `Node.ProcessMode`. */
  opaque type ProcessMode <: Long = Long

  object ProcessMode {
    final val Inherit: ProcessMode = 0L.asInstanceOf[ProcessMode]
    final val Pausable: ProcessMode = 1L.asInstanceOf[ProcessMode]
    final val WhenPaused: ProcessMode = 2L.asInstanceOf[ProcessMode]
    final val Always: ProcessMode = 3L.asInstanceOf[ProcessMode]
    final val Disabled: ProcessMode = 4L.asInstanceOf[ProcessMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ProcessMode = value.asInstanceOf[ProcessMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ProcessMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[ProcessMode]]

    extension (self: ProcessMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Inherit"
        case 1L => "Pausable"
        case 2L => "WhenPaused"
        case 3L => "Always"
        case 4L => "Disabled"
        case other => other.toString
      }
  }

  /** Godot enum `Node.ProcessThreadGroup`. */
  opaque type ProcessThreadGroup <: Long = Long

  object ProcessThreadGroup {
    final val Inherit: ProcessThreadGroup = 0L.asInstanceOf[ProcessThreadGroup]
    final val MainThread: ProcessThreadGroup = 1L.asInstanceOf[ProcessThreadGroup]
    final val SubThread: ProcessThreadGroup = 2L.asInstanceOf[ProcessThreadGroup]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ProcessThreadGroup = value.asInstanceOf[ProcessThreadGroup]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ProcessThreadGroup] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ProcessThreadGroup]]

    extension (self: ProcessThreadGroup)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Inherit"
        case 1L => "MainThread"
        case 2L => "SubThread"
        case other => other.toString
      }
  }

  /** Godot bitfield `Node.ProcessThreadMessages`. */
  opaque type ProcessThreadMessages = Long

  object ProcessThreadMessages {
    final val Messages: ProcessThreadMessages = 1L.asInstanceOf[ProcessThreadMessages]
    final val MessagesPhysics: ProcessThreadMessages = 2L.asInstanceOf[ProcessThreadMessages]
    final val MessagesAll: ProcessThreadMessages = 3L.asInstanceOf[ProcessThreadMessages]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ProcessThreadMessages = value.asInstanceOf[ProcessThreadMessages]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ProcessThreadMessages] = scala.IArray[Long](1L, 2L, 3L).asInstanceOf[scala.IArray[ProcessThreadMessages]]

    extension (self: ProcessThreadMessages)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Messages"
        case 2L => "MessagesPhysics"
        case 3L => "MessagesAll"
        case other => other.toString
      }
    extension (self: ProcessThreadMessages) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: ProcessThreadMessages): ProcessThreadMessages = (self.value | other.value).asInstanceOf[ProcessThreadMessages]
      inline def &(other: ProcessThreadMessages): ProcessThreadMessages = (self.value & other.value).asInstanceOf[ProcessThreadMessages]
      /** Every bit of `flag` is set. */
      inline def has(flag: ProcessThreadMessages): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot enum `Node.PhysicsInterpolationMode`. */
  opaque type PhysicsInterpolationMode <: Long = Long

  object PhysicsInterpolationMode {
    final val Inherit: PhysicsInterpolationMode = 0L.asInstanceOf[PhysicsInterpolationMode]
    final val On: PhysicsInterpolationMode = 1L.asInstanceOf[PhysicsInterpolationMode]
    final val Off: PhysicsInterpolationMode = 2L.asInstanceOf[PhysicsInterpolationMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PhysicsInterpolationMode = value.asInstanceOf[PhysicsInterpolationMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PhysicsInterpolationMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[PhysicsInterpolationMode]]

    extension (self: PhysicsInterpolationMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Inherit"
        case 1L => "On"
        case 2L => "Off"
        case other => other.toString
      }
  }

  /** Godot enum `Node.DuplicateFlags`. */
  opaque type DuplicateFlags <: Long = Long

  object DuplicateFlags {
    final val Signals: DuplicateFlags = 1L.asInstanceOf[DuplicateFlags]
    final val Groups: DuplicateFlags = 2L.asInstanceOf[DuplicateFlags]
    final val Scripts: DuplicateFlags = 4L.asInstanceOf[DuplicateFlags]
    final val UseInstantiation: DuplicateFlags = 8L.asInstanceOf[DuplicateFlags]
    final val InternalState: DuplicateFlags = 16L.asInstanceOf[DuplicateFlags]
    final val Default: DuplicateFlags = 15L.asInstanceOf[DuplicateFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DuplicateFlags = value.asInstanceOf[DuplicateFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DuplicateFlags] = scala.IArray[Long](1L, 2L, 4L, 8L, 15L, 16L).asInstanceOf[scala.IArray[DuplicateFlags]]

    extension (self: DuplicateFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Signals"
        case 2L => "Groups"
        case 4L => "Scripts"
        case 8L => "UseInstantiation"
        case 15L => "Default"
        case 16L => "InternalState"
        case other => other.toString
      }
  }

  /** Godot enum `Node.InternalMode`. */
  opaque type InternalMode <: Long = Long

  object InternalMode {
    final val Disabled: InternalMode = 0L.asInstanceOf[InternalMode]
    final val Front: InternalMode = 1L.asInstanceOf[InternalMode]
    final val Back: InternalMode = 2L.asInstanceOf[InternalMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): InternalMode = value.asInstanceOf[InternalMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[InternalMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[InternalMode]]

    extension (self: InternalMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Front"
        case 2L => "Back"
        case other => other.toString
      }
  }

  /** Godot enum `Node.AutoTranslateMode`. */
  opaque type AutoTranslateMode <: Long = Long

  object AutoTranslateMode {
    final val Inherit: AutoTranslateMode = 0L.asInstanceOf[AutoTranslateMode]
    final val Always: AutoTranslateMode = 1L.asInstanceOf[AutoTranslateMode]
    final val Disabled: AutoTranslateMode = 2L.asInstanceOf[AutoTranslateMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AutoTranslateMode = value.asInstanceOf[AutoTranslateMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AutoTranslateMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[AutoTranslateMode]]

    extension (self: AutoTranslateMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Inherit"
        case 1L => "Always"
        case 2L => "Disabled"
        case other => other.toString
      }
  }
}
