package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Node`, extends `Object`. */
abstract class Node extends Object {

  /** Node.add_sibling */
  final def addSibling(sibling: Node, force_readable_name: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Node", "add_sibling", 2570952461L), hostObject.objectPtr, sibling.hostObject, force_readable_name)

  /** Node.remove_child */
  final def removeChild(node: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "remove_child", 1078189570L), hostObject.objectPtr, node.hostObject)

  /** Node.reparent */
  final def reparent(new_parent: Node, keep_global_transform: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Node", "reparent", 3685795103L), hostObject.objectPtr, new_parent.hostObject, keep_global_transform)

  /** Node.get_child_count */
  final def getChildCount(include_internal: Boolean): Long =
    Ptrcall.call1[Boolean, Long](MethodBind.get("Node", "get_child_count", 894402480L), hostObject.objectPtr, include_internal)

  /** Node.get_child */
  final def getChild(idx: Long, include_internal: Boolean): GodotObject =
    Ptrcall.call2[Long, Boolean, GodotObject](MethodBind.get("Node", "get_child", 541253412L), hostObject.objectPtr, idx, include_internal)

  /** Node.get_parent */
  final def getParent(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Node", "get_parent", 3160264692L), hostObject.objectPtr)

  /** Node.find_parent */
  final def findParent(pattern: String): GodotObject =
    Ptrcall.call1[String, GodotObject](MethodBind.get("Node", "find_parent", 1140089439L), hostObject.objectPtr, pattern)

  /** Node.is_inside_tree */
  final def isInsideTree(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "is_inside_tree", 36873697L), hostObject.objectPtr)

  /** Node.is_part_of_edited_scene */
  final def isPartOfEditedScene(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "is_part_of_edited_scene", 36873697L), hostObject.objectPtr)

  /** Node.is_ancestor_of */
  final def isAncestorOf(node: Node): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("Node", "is_ancestor_of", 3093956946L), hostObject.objectPtr, node.hostObject)

  /** Node.is_greater_than */
  final def isGreaterThan(node: Node): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("Node", "is_greater_than", 3093956946L), hostObject.objectPtr, node.hostObject)

  /** Node.move_child */
  final def moveChild(child_node: Node, to_index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Node", "move_child", 3315886247L), hostObject.objectPtr, child_node.hostObject, to_index)

  /** Node.set_owner */
  final def setOwner(owner: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_owner", 1078189570L), hostObject.objectPtr, owner.hostObject)

  /** Node.get_owner */
  final def getOwner(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Node", "get_owner", 3160264692L), hostObject.objectPtr)

  /** Node.get_index */
  final def getIndex(include_internal: Boolean): Long =
    Ptrcall.call1[Boolean, Long](MethodBind.get("Node", "get_index", 894402480L), hostObject.objectPtr, include_internal)

  /** Node.print_tree */
  final def printTree(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Node", "print_tree", 3218959716L), hostObject.objectPtr)

  /** Node.print_tree_pretty */
  final def printTreePretty(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Node", "print_tree_pretty", 3218959716L), hostObject.objectPtr)

  /** Node.get_tree_string */
  final def getTreeString(): String =
    Ptrcall.call0[String](MethodBind.get("Node", "get_tree_string", 2841200299L), hostObject.objectPtr)

  /** Node.get_tree_string_pretty */
  final def getTreeStringPretty(): String =
    Ptrcall.call0[String](MethodBind.get("Node", "get_tree_string_pretty", 2841200299L), hostObject.objectPtr)

  /** Node.set_scene_file_path */
  final def setSceneFilePath(scene_file_path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_scene_file_path", 83702148L), hostObject.objectPtr, scene_file_path)

  /** Node.get_scene_file_path */
  final def getSceneFilePath(): String =
    Ptrcall.call0[String](MethodBind.get("Node", "get_scene_file_path", 201670096L), hostObject.objectPtr)

  /** Node.propagate_notification */
  final def propagateNotification(what: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "propagate_notification", 1286410249L), hostObject.objectPtr, what)

  /** Node.set_physics_process */
  final def setPhysicsProcess(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_physics_process", 2586408642L), hostObject.objectPtr, enable)

  /** Node.get_physics_process_delta_time */
  final def getPhysicsProcessDeltaTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("Node", "get_physics_process_delta_time", 1740695150L), hostObject.objectPtr)

  /** Node.is_physics_processing */
  final def isPhysicsProcessing(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "is_physics_processing", 36873697L), hostObject.objectPtr)

  /** Node.get_process_delta_time */
  final def getProcessDeltaTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("Node", "get_process_delta_time", 1740695150L), hostObject.objectPtr)

  /** Node.set_process */
  final def setProcess(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_process", 2586408642L), hostObject.objectPtr, enable)

  /** Node.set_process_priority */
  final def setProcessPriority(priority: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_process_priority", 1286410249L), hostObject.objectPtr, priority)

  /** Node.get_process_priority */
  final def getProcessPriority(): Long =
    Ptrcall.call0[Long](MethodBind.get("Node", "get_process_priority", 3905245786L), hostObject.objectPtr)

  /** Node.set_physics_process_priority */
  final def setPhysicsProcessPriority(priority: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_physics_process_priority", 1286410249L), hostObject.objectPtr, priority)

  /** Node.get_physics_process_priority */
  final def getPhysicsProcessPriority(): Long =
    Ptrcall.call0[Long](MethodBind.get("Node", "get_physics_process_priority", 3905245786L), hostObject.objectPtr)

  /** Node.is_processing */
  final def isProcessing(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "is_processing", 36873697L), hostObject.objectPtr)

  /** Node.set_process_input */
  final def setProcessInput(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_process_input", 2586408642L), hostObject.objectPtr, enable)

  /** Node.is_processing_input */
  final def isProcessingInput(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "is_processing_input", 36873697L), hostObject.objectPtr)

  /** Node.set_process_shortcut_input */
  final def setProcessShortcutInput(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_process_shortcut_input", 2586408642L), hostObject.objectPtr, enable)

  /** Node.is_processing_shortcut_input */
  final def isProcessingShortcutInput(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "is_processing_shortcut_input", 36873697L), hostObject.objectPtr)

  /** Node.set_process_unhandled_input */
  final def setProcessUnhandledInput(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_process_unhandled_input", 2586408642L), hostObject.objectPtr, enable)

  /** Node.is_processing_unhandled_input */
  final def isProcessingUnhandledInput(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "is_processing_unhandled_input", 36873697L), hostObject.objectPtr)

  /** Node.set_process_unhandled_key_input */
  final def setProcessUnhandledKeyInput(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_process_unhandled_key_input", 2586408642L), hostObject.objectPtr, enable)

  /** Node.is_processing_unhandled_key_input */
  final def isProcessingUnhandledKeyInput(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "is_processing_unhandled_key_input", 36873697L), hostObject.objectPtr)

  /** Node.can_process */
  final def canProcess(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "can_process", 36873697L), hostObject.objectPtr)

  /** Node.set_process_thread_group_order */
  final def setProcessThreadGroupOrder(order: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_process_thread_group_order", 1286410249L), hostObject.objectPtr, order)

  /** Node.get_process_thread_group_order */
  final def getProcessThreadGroupOrder(): Long =
    Ptrcall.call0[Long](MethodBind.get("Node", "get_process_thread_group_order", 3905245786L), hostObject.objectPtr)

  /** Node.queue_accessibility_update */
  final def queueAccessibilityUpdate(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Node", "queue_accessibility_update", 3218959716L), hostObject.objectPtr)

  /** Node.set_display_folded */
  final def setDisplayFolded(fold: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_display_folded", 2586408642L), hostObject.objectPtr, fold)

  /** Node.is_displayed_folded */
  final def isDisplayedFolded(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "is_displayed_folded", 36873697L), hostObject.objectPtr)

  /** Node.set_process_internal */
  final def setProcessInternal(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_process_internal", 2586408642L), hostObject.objectPtr, enable)

  /** Node.is_processing_internal */
  final def isProcessingInternal(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "is_processing_internal", 36873697L), hostObject.objectPtr)

  /** Node.set_physics_process_internal */
  final def setPhysicsProcessInternal(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_physics_process_internal", 2586408642L), hostObject.objectPtr, enable)

  /** Node.is_physics_processing_internal */
  final def isPhysicsProcessingInternal(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "is_physics_processing_internal", 36873697L), hostObject.objectPtr)

  /** Node.is_physics_interpolated */
  final def isPhysicsInterpolated(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "is_physics_interpolated", 36873697L), hostObject.objectPtr)

  /** Node.is_physics_interpolated_and_enabled */
  final def isPhysicsInterpolatedAndEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "is_physics_interpolated_and_enabled", 36873697L), hostObject.objectPtr)

  /** Node.reset_physics_interpolation */
  final def resetPhysicsInterpolation(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Node", "reset_physics_interpolation", 3218959716L), hostObject.objectPtr)

  /** Node.can_auto_translate */
  final def canAutoTranslate(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "can_auto_translate", 36873697L), hostObject.objectPtr)

  /** Node.set_translation_domain_inherited */
  final def setTranslationDomainInherited(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Node", "set_translation_domain_inherited", 3218959716L), hostObject.objectPtr)

  /** Node.duplicate */
  final def duplicate(flags: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("Node", "duplicate", 3511555459L), hostObject.objectPtr, flags)

  /** Node.replace_by */
  final def replaceBy(node: Node, keep_groups: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Node", "replace_by", 2570952461L), hostObject.objectPtr, node.hostObject, keep_groups)

  /** Node.set_scene_instance_load_placeholder */
  final def setSceneInstanceLoadPlaceholder(load_placeholder: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_scene_instance_load_placeholder", 2586408642L), hostObject.objectPtr, load_placeholder)

  /** Node.get_scene_instance_load_placeholder */
  final def getSceneInstanceLoadPlaceholder(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "get_scene_instance_load_placeholder", 36873697L), hostObject.objectPtr)

  /** Node.set_editable_instance */
  final def setEditableInstance(node: Node, is_editable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Node", "set_editable_instance", 2731852923L), hostObject.objectPtr, node.hostObject, is_editable)

  /** Node.is_editable_instance */
  final def isEditableInstance(node: Node): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("Node", "is_editable_instance", 3093956946L), hostObject.objectPtr, node.hostObject)

  /** Node.queue_free */
  final def queueFree(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Node", "queue_free", 3218959716L), hostObject.objectPtr)

  /** Node.request_ready */
  final def requestReady(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Node", "request_ready", 3218959716L), hostObject.objectPtr)

  /** Node.is_node_ready */
  final def isNodeReady(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "is_node_ready", 36873697L), hostObject.objectPtr)

  /** Node.set_multiplayer_authority */
  final def setMultiplayerAuthority(id: Long, recursive: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Node", "set_multiplayer_authority", 972357352L), hostObject.objectPtr, id, recursive)

  /** Node.get_multiplayer_authority */
  final def getMultiplayerAuthority(): Long =
    Ptrcall.call0[Long](MethodBind.get("Node", "get_multiplayer_authority", 3905245786L), hostObject.objectPtr)

  /** Node.is_multiplayer_authority */
  final def isMultiplayerAuthority(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "is_multiplayer_authority", 36873697L), hostObject.objectPtr)

  /** Node.set_editor_description */
  final def setEditorDescription(editor_description: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_editor_description", 83702148L), hostObject.objectPtr, editor_description)

  /** Node.get_editor_description */
  final def getEditorDescription(): String =
    Ptrcall.call0[String](MethodBind.get("Node", "get_editor_description", 201670096L), hostObject.objectPtr)

  /** Node.set_unique_name_in_owner */
  final def setUniqueNameInOwner(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "set_unique_name_in_owner", 2586408642L), hostObject.objectPtr, enable)

  /** Node.is_unique_name_in_owner */
  final def isUniqueNameInOwner(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node", "is_unique_name_in_owner", 36873697L), hostObject.objectPtr)

  /** Node.update_configuration_warnings */
  final def updateConfigurationWarnings(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Node", "update_configuration_warnings", 3218959716L), hostObject.objectPtr)

  /** Node.notify_deferred_thread_group */
  final def notifyDeferredThreadGroup(what: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "notify_deferred_thread_group", 1286410249L), hostObject.objectPtr, what)

  /** Node.notify_thread_safe */
  final def notifyThreadSafe(what: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node", "notify_thread_safe", 1286410249L), hostObject.objectPtr, what)

}

object Node {
  /** Class metadata for Gd[Node] lifetime management and casting. */
  given GodotClass[Node] with {
    def className = "Node"
    def isRefCounted = false
    def wrap(o: GodotObject): Node = new Node {}.withHost(o.objectPtr)
    def unwrap(t: Node): GodotObject = t.hostObject
  }
}
