package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `SceneState`, extends `RefCounted`. */
abstract class SceneState extends RefCounted {

  /** SceneState.get_path */
  final def getPath(): String =
    Ptrcall.call0[String](MethodBind.get("SceneState", "get_path", 201670096L), hostObject.objectPtr)

  /** SceneState.get_base_scene_state */
  final def getBaseSceneState(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SceneState", "get_base_scene_state", 3479783971L), hostObject.objectPtr)

  /** SceneState.get_node_count */
  final def getNodeCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("SceneState", "get_node_count", 3905245786L), hostObject.objectPtr)

  /** SceneState.get_node_type */
  final def getNodeType(idx: Long): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.StringName](MethodBind.get("SceneState", "get_node_type", 659327637L), hostObject.objectPtr, idx)

  /** SceneState.get_node_name */
  final def getNodeName(idx: Long): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.StringName](MethodBind.get("SceneState", "get_node_name", 659327637L), hostObject.objectPtr, idx)

  /** SceneState.is_node_instance_placeholder */
  final def isNodeInstancePlaceholder(idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("SceneState", "is_node_instance_placeholder", 1116898809L), hostObject.objectPtr, idx)

  /** SceneState.get_node_instance_placeholder */
  final def getNodeInstancePlaceholder(idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("SceneState", "get_node_instance_placeholder", 844755477L), hostObject.objectPtr, idx)

  /** SceneState.get_node_instance */
  final def getNodeInstance(idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("SceneState", "get_node_instance", 511017218L), hostObject.objectPtr, idx)

  /** SceneState.get_node_index */
  final def getNodeIndex(idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SceneState", "get_node_index", 923996154L), hostObject.objectPtr, idx)

  /** SceneState.get_node_property_count */
  final def getNodePropertyCount(idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SceneState", "get_node_property_count", 923996154L), hostObject.objectPtr, idx)

  /** SceneState.get_node_property_name */
  final def getNodePropertyName(idx: Long, prop_idx: Long): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call2[Long, Long, io.github.optical002.godot.builtin.StringName](MethodBind.get("SceneState", "get_node_property_name", 351665558L), hostObject.objectPtr, idx, prop_idx)

  /** SceneState.get_connection_count */
  final def getConnectionCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("SceneState", "get_connection_count", 3905245786L), hostObject.objectPtr)

  /** SceneState.get_connection_signal */
  final def getConnectionSignal(idx: Long): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.StringName](MethodBind.get("SceneState", "get_connection_signal", 659327637L), hostObject.objectPtr, idx)

  /** SceneState.get_connection_method */
  final def getConnectionMethod(idx: Long): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.StringName](MethodBind.get("SceneState", "get_connection_method", 659327637L), hostObject.objectPtr, idx)

  /** SceneState.get_connection_flags */
  final def getConnectionFlags(idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SceneState", "get_connection_flags", 923996154L), hostObject.objectPtr, idx)

  /** SceneState.get_connection_unbinds */
  final def getConnectionUnbinds(idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SceneState", "get_connection_unbinds", 923996154L), hostObject.objectPtr, idx)

}

object SceneState {
  /** Class metadata for Gd[SceneState] lifetime management and casting. */
  given GodotClass[SceneState] with {
    def className = "SceneState"
    def isRefCounted = true
    def wrap(o: GodotObject): SceneState = new SceneState {}.withHost(o.objectPtr)
    def unwrap(t: SceneState): GodotObject = t.hostObject
  }
}
