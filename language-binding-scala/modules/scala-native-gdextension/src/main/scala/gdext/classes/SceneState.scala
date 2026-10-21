package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SceneState`, extends `RefCounted`. */
abstract class SceneState extends RefCounted {
  override def godotClassName: String = "SceneState"

  /** SceneState.get_path */
  final def getPath(): String = {
    if (gdext.classes.SceneState.mb_get_path == null) gdext.classes.SceneState.mb_get_path = MethodBind.get("SceneState", "get_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.SceneState.mb_get_path, livePtr)
  }

  /** SceneState.get_base_scene_state. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getBaseSceneState(): SceneState = {
    if (gdext.classes.SceneState.mb_get_base_scene_state == null) gdext.classes.SceneState.mb_get_base_scene_state = MethodBind.get("SceneState", "get_base_scene_state", 3479783971L)
    Wrappers.owned[SceneState](Ptrcall.call0[Long](gdext.classes.SceneState.mb_get_base_scene_state, livePtr))
  }

  /** SceneState.get_node_count */
  final def getNodeCount(): Long = {
    if (gdext.classes.SceneState.mb_get_node_count == null) gdext.classes.SceneState.mb_get_node_count = MethodBind.get("SceneState", "get_node_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SceneState.mb_get_node_count, livePtr)
  }

  /** SceneState.get_node_type */
  final def getNodeType(idx: Long): gdext.builtin.StringName = {
    if (gdext.classes.SceneState.mb_get_node_type == null) gdext.classes.SceneState.mb_get_node_type = MethodBind.get("SceneState", "get_node_type", 659327637L)
    Ptrcall.call1[Long, gdext.builtin.StringName](gdext.classes.SceneState.mb_get_node_type, livePtr, idx)
  }

  /** SceneState.get_node_name */
  final def getNodeName(idx: Long): gdext.builtin.StringName = {
    if (gdext.classes.SceneState.mb_get_node_name == null) gdext.classes.SceneState.mb_get_node_name = MethodBind.get("SceneState", "get_node_name", 659327637L)
    Ptrcall.call1[Long, gdext.builtin.StringName](gdext.classes.SceneState.mb_get_node_name, livePtr, idx)
  }

  /** SceneState.is_node_instance_placeholder */
  final def isNodeInstancePlaceholder(idx: Long): Boolean = {
    if (gdext.classes.SceneState.mb_is_node_instance_placeholder == null) gdext.classes.SceneState.mb_is_node_instance_placeholder = MethodBind.get("SceneState", "is_node_instance_placeholder", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SceneState.mb_is_node_instance_placeholder, livePtr, idx)
  }

  /** SceneState.get_node_instance_placeholder */
  final def getNodeInstancePlaceholder(idx: Long): String = {
    if (gdext.classes.SceneState.mb_get_node_instance_placeholder == null) gdext.classes.SceneState.mb_get_node_instance_placeholder = MethodBind.get("SceneState", "get_node_instance_placeholder", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.SceneState.mb_get_node_instance_placeholder, livePtr, idx)
  }

  /** SceneState.get_node_instance. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNodeInstance(idx: Long): PackedScene = {
    if (gdext.classes.SceneState.mb_get_node_instance == null) gdext.classes.SceneState.mb_get_node_instance = MethodBind.get("SceneState", "get_node_instance", 511017218L)
    Wrappers.owned[PackedScene](Ptrcall.call1[Long, Long](gdext.classes.SceneState.mb_get_node_instance, livePtr, idx))
  }

  /** SceneState.get_node_index */
  final def getNodeIndex(idx: Long): Long = {
    if (gdext.classes.SceneState.mb_get_node_index == null) gdext.classes.SceneState.mb_get_node_index = MethodBind.get("SceneState", "get_node_index", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.SceneState.mb_get_node_index, livePtr, idx)
  }

  /** SceneState.get_node_property_count */
  final def getNodePropertyCount(idx: Long): Long = {
    if (gdext.classes.SceneState.mb_get_node_property_count == null) gdext.classes.SceneState.mb_get_node_property_count = MethodBind.get("SceneState", "get_node_property_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.SceneState.mb_get_node_property_count, livePtr, idx)
  }

  /** SceneState.get_node_property_name */
  final def getNodePropertyName(idx: Long, prop_idx: Long): gdext.builtin.StringName = {
    if (gdext.classes.SceneState.mb_get_node_property_name == null) gdext.classes.SceneState.mb_get_node_property_name = MethodBind.get("SceneState", "get_node_property_name", 351665558L)
    Ptrcall.call2[Long, Long, gdext.builtin.StringName](gdext.classes.SceneState.mb_get_node_property_name, livePtr, idx, prop_idx)
  }

  /** SceneState.get_connection_count */
  final def getConnectionCount(): Long = {
    if (gdext.classes.SceneState.mb_get_connection_count == null) gdext.classes.SceneState.mb_get_connection_count = MethodBind.get("SceneState", "get_connection_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SceneState.mb_get_connection_count, livePtr)
  }

  /** SceneState.get_connection_signal */
  final def getConnectionSignal(idx: Long): gdext.builtin.StringName = {
    if (gdext.classes.SceneState.mb_get_connection_signal == null) gdext.classes.SceneState.mb_get_connection_signal = MethodBind.get("SceneState", "get_connection_signal", 659327637L)
    Ptrcall.call1[Long, gdext.builtin.StringName](gdext.classes.SceneState.mb_get_connection_signal, livePtr, idx)
  }

  /** SceneState.get_connection_method */
  final def getConnectionMethod(idx: Long): gdext.builtin.StringName = {
    if (gdext.classes.SceneState.mb_get_connection_method == null) gdext.classes.SceneState.mb_get_connection_method = MethodBind.get("SceneState", "get_connection_method", 659327637L)
    Ptrcall.call1[Long, gdext.builtin.StringName](gdext.classes.SceneState.mb_get_connection_method, livePtr, idx)
  }

  /** SceneState.get_connection_flags */
  final def getConnectionFlags(idx: Long): Long = {
    if (gdext.classes.SceneState.mb_get_connection_flags == null) gdext.classes.SceneState.mb_get_connection_flags = MethodBind.get("SceneState", "get_connection_flags", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.SceneState.mb_get_connection_flags, livePtr, idx)
  }

  /** SceneState.get_connection_unbinds */
  final def getConnectionUnbinds(idx: Long): Long = {
    if (gdext.classes.SceneState.mb_get_connection_unbinds == null) gdext.classes.SceneState.mb_get_connection_unbinds = MethodBind.get("SceneState", "get_connection_unbinds", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.SceneState.mb_get_connection_unbinds, livePtr, idx)
  }

}

object SceneState {
  private[classes] var mb_get_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_base_scene_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_node_instance_placeholder: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_instance_placeholder: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_instance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_property_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_property_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_connection_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_connection_signal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_connection_method: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_connection_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_connection_unbinds: GDExtensionMethodBindPtr = null
}
