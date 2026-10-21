package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShader`, extends `Shader`. */
abstract class VisualShader extends Shader {
  override def godotClassName: String = "VisualShader"

  /** VisualShader.set_mode */
  final def setMode(mode: Long): Unit = {
    if (gdext.classes.VisualShader.mb_set_mode == null) gdext.classes.VisualShader.mb_set_mode = MethodBind.get("VisualShader", "set_mode", 3978014962L)
    Ptrcall.callVoid1(gdext.classes.VisualShader.mb_set_mode, livePtr, mode)
  }

  /** VisualShader.add_node */
  final def addNode(`type`: Long, node: VisualShaderNode, position: gdext.builtin.Vector2, id: Long): Unit = {
    if (gdext.classes.VisualShader.mb_add_node == null) gdext.classes.VisualShader.mb_add_node = MethodBind.get("VisualShader", "add_node", 1560769431L)
    Ptrcall.callVoid4(gdext.classes.VisualShader.mb_add_node, livePtr, `type`, Wrappers.handle(node), position, id)
  }

  /** VisualShader.get_node. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNode(`type`: Long, id: Long): VisualShaderNode = {
    if (gdext.classes.VisualShader.mb_get_node == null) gdext.classes.VisualShader.mb_get_node = MethodBind.get("VisualShader", "get_node", 3784670312L)
    Wrappers.owned[VisualShaderNode](Ptrcall.call2[Long, Long, Long](gdext.classes.VisualShader.mb_get_node, livePtr, `type`, id))
  }

  /** VisualShader.set_node_position */
  final def setNodePosition(`type`: Long, id: Long, position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.VisualShader.mb_set_node_position == null) gdext.classes.VisualShader.mb_set_node_position = MethodBind.get("VisualShader", "set_node_position", 2726660721L)
    Ptrcall.callVoid3(gdext.classes.VisualShader.mb_set_node_position, livePtr, `type`, id, position)
  }

  /** VisualShader.get_node_position */
  final def getNodePosition(`type`: Long, id: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.VisualShader.mb_get_node_position == null) gdext.classes.VisualShader.mb_get_node_position = MethodBind.get("VisualShader", "get_node_position", 2175036082L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector2](gdext.classes.VisualShader.mb_get_node_position, livePtr, `type`, id)
  }

  /** VisualShader.get_valid_node_id */
  final def getValidNodeId(`type`: Long): Long = {
    if (gdext.classes.VisualShader.mb_get_valid_node_id == null) gdext.classes.VisualShader.mb_get_valid_node_id = MethodBind.get("VisualShader", "get_valid_node_id", 629467342L)
    Ptrcall.call1[Long, Long](gdext.classes.VisualShader.mb_get_valid_node_id, livePtr, `type`)
  }

  /** VisualShader.remove_node */
  final def removeNode(`type`: Long, id: Long): Unit = {
    if (gdext.classes.VisualShader.mb_remove_node == null) gdext.classes.VisualShader.mb_remove_node = MethodBind.get("VisualShader", "remove_node", 844050912L)
    Ptrcall.callVoid2(gdext.classes.VisualShader.mb_remove_node, livePtr, `type`, id)
  }

  /** VisualShader.replace_node */
  final def replaceNode(`type`: Long, id: Long, new_class: gdext.builtin.StringName): Unit = {
    if (gdext.classes.VisualShader.mb_replace_node == null) gdext.classes.VisualShader.mb_replace_node = MethodBind.get("VisualShader", "replace_node", 3144735253L)
    Ptrcall.callVoid3(gdext.classes.VisualShader.mb_replace_node, livePtr, `type`, id, new_class)
  }

  /** VisualShader.is_node_connection */
  final def isNodeConnection(`type`: Long, from_node: Long, from_port: Long, to_node: Long, to_port: Long): Boolean = {
    if (gdext.classes.VisualShader.mb_is_node_connection == null) gdext.classes.VisualShader.mb_is_node_connection = MethodBind.get("VisualShader", "is_node_connection", 3922381898L)
    Ptrcall.call5[Long, Long, Long, Long, Long, Boolean](gdext.classes.VisualShader.mb_is_node_connection, livePtr, `type`, from_node, from_port, to_node, to_port)
  }

  /** VisualShader.can_connect_nodes */
  final def canConnectNodes(`type`: Long, from_node: Long, from_port: Long, to_node: Long, to_port: Long): Boolean = {
    if (gdext.classes.VisualShader.mb_can_connect_nodes == null) gdext.classes.VisualShader.mb_can_connect_nodes = MethodBind.get("VisualShader", "can_connect_nodes", 3922381898L)
    Ptrcall.call5[Long, Long, Long, Long, Long, Boolean](gdext.classes.VisualShader.mb_can_connect_nodes, livePtr, `type`, from_node, from_port, to_node, to_port)
  }

  /** VisualShader.connect_nodes */
  final def connectNodes(`type`: Long, from_node: Long, from_port: Long, to_node: Long, to_port: Long): Long = {
    if (gdext.classes.VisualShader.mb_connect_nodes == null) gdext.classes.VisualShader.mb_connect_nodes = MethodBind.get("VisualShader", "connect_nodes", 3081049573L)
    Ptrcall.call5[Long, Long, Long, Long, Long, Long](gdext.classes.VisualShader.mb_connect_nodes, livePtr, `type`, from_node, from_port, to_node, to_port)
  }

  /** VisualShader.disconnect_nodes */
  final def disconnectNodes(`type`: Long, from_node: Long, from_port: Long, to_node: Long, to_port: Long): Unit = {
    if (gdext.classes.VisualShader.mb_disconnect_nodes == null) gdext.classes.VisualShader.mb_disconnect_nodes = MethodBind.get("VisualShader", "disconnect_nodes", 2268060358L)
    Ptrcall.callVoid5(gdext.classes.VisualShader.mb_disconnect_nodes, livePtr, `type`, from_node, from_port, to_node, to_port)
  }

  /** VisualShader.connect_nodes_forced */
  final def connectNodesForced(`type`: Long, from_node: Long, from_port: Long, to_node: Long, to_port: Long): Unit = {
    if (gdext.classes.VisualShader.mb_connect_nodes_forced == null) gdext.classes.VisualShader.mb_connect_nodes_forced = MethodBind.get("VisualShader", "connect_nodes_forced", 2268060358L)
    Ptrcall.callVoid5(gdext.classes.VisualShader.mb_connect_nodes_forced, livePtr, `type`, from_node, from_port, to_node, to_port)
  }

  /** VisualShader.attach_node_to_frame */
  final def attachNodeToFrame(`type`: Long, id: Long, frame: Long): Unit = {
    if (gdext.classes.VisualShader.mb_attach_node_to_frame == null) gdext.classes.VisualShader.mb_attach_node_to_frame = MethodBind.get("VisualShader", "attach_node_to_frame", 2479945279L)
    Ptrcall.callVoid3(gdext.classes.VisualShader.mb_attach_node_to_frame, livePtr, `type`, id, frame)
  }

  /** VisualShader.detach_node_from_frame */
  final def detachNodeFromFrame(`type`: Long, id: Long): Unit = {
    if (gdext.classes.VisualShader.mb_detach_node_from_frame == null) gdext.classes.VisualShader.mb_detach_node_from_frame = MethodBind.get("VisualShader", "detach_node_from_frame", 844050912L)
    Ptrcall.callVoid2(gdext.classes.VisualShader.mb_detach_node_from_frame, livePtr, `type`, id)
  }

  /** VisualShader.add_varying */
  final def addVarying(name: String, mode: Long, `type`: Long): Unit = {
    if (gdext.classes.VisualShader.mb_add_varying == null) gdext.classes.VisualShader.mb_add_varying = MethodBind.get("VisualShader", "add_varying", 2084110726L)
    Ptrcall.callVoid3(gdext.classes.VisualShader.mb_add_varying, livePtr, name, mode, `type`)
  }

  /** VisualShader.remove_varying */
  final def removeVarying(name: String): Unit = {
    if (gdext.classes.VisualShader.mb_remove_varying == null) gdext.classes.VisualShader.mb_remove_varying = MethodBind.get("VisualShader", "remove_varying", 83702148L)
    Ptrcall.callVoid1(gdext.classes.VisualShader.mb_remove_varying, livePtr, name)
  }

  /** VisualShader.has_varying */
  final def hasVarying(name: String): Boolean = {
    if (gdext.classes.VisualShader.mb_has_varying == null) gdext.classes.VisualShader.mb_has_varying = MethodBind.get("VisualShader", "has_varying", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.VisualShader.mb_has_varying, livePtr, name)
  }

  /** VisualShader.set_graph_offset */
  final def setGraphOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.VisualShader.mb_set_graph_offset == null) gdext.classes.VisualShader.mb_set_graph_offset = MethodBind.get("VisualShader", "set_graph_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.VisualShader.mb_set_graph_offset, livePtr, offset)
  }

  /** VisualShader.get_graph_offset */
  final def getGraphOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.VisualShader.mb_get_graph_offset == null) gdext.classes.VisualShader.mb_get_graph_offset = MethodBind.get("VisualShader", "get_graph_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.VisualShader.mb_get_graph_offset, livePtr)
  }

}

object VisualShader {
  private[classes] var mb_set_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_node_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_valid_node_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_replace_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_node_connection: GDExtensionMethodBindPtr = null
  private[classes] var mb_can_connect_nodes: GDExtensionMethodBindPtr = null
  private[classes] var mb_connect_nodes: GDExtensionMethodBindPtr = null
  private[classes] var mb_disconnect_nodes: GDExtensionMethodBindPtr = null
  private[classes] var mb_connect_nodes_forced: GDExtensionMethodBindPtr = null
  private[classes] var mb_attach_node_to_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_detach_node_from_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_varying: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_varying: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_varying: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_graph_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_graph_offset: GDExtensionMethodBindPtr = null
}
