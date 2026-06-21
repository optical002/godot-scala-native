package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShader`, extends `Shader`. */
abstract class VisualShader extends Shader {

  /** VisualShader.set_mode */
  final def setMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShader", "set_mode", 3978014962L), hostObject.objectPtr, mode)

  /** VisualShader.add_node */
  final def addNode(`type`: Long, node: VisualShaderNode, position: gdext.builtin.Vector2, id: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("VisualShader", "add_node", 1560769431L), hostObject.objectPtr, `type`, node.hostObject, position, id)

  /** VisualShader.get_node */
  final def getNode(`type`: Long, id: Long): GodotObject =
    Ptrcall.call2[Long, Long, GodotObject](MethodBind.get("VisualShader", "get_node", 3784670312L), hostObject.objectPtr, `type`, id)

  /** VisualShader.set_node_position */
  final def setNodePosition(`type`: Long, id: Long, position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid3(MethodBind.get("VisualShader", "set_node_position", 2726660721L), hostObject.objectPtr, `type`, id, position)

  /** VisualShader.get_node_position */
  final def getNodePosition(`type`: Long, id: Long): gdext.builtin.Vector2 =
    Ptrcall.call2[Long, Long, gdext.builtin.Vector2](MethodBind.get("VisualShader", "get_node_position", 2175036082L), hostObject.objectPtr, `type`, id)

  /** VisualShader.get_valid_node_id */
  final def getValidNodeId(`type`: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("VisualShader", "get_valid_node_id", 629467342L), hostObject.objectPtr, `type`)

  /** VisualShader.remove_node */
  final def removeNode(`type`: Long, id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("VisualShader", "remove_node", 844050912L), hostObject.objectPtr, `type`, id)

  /** VisualShader.replace_node */
  final def replaceNode(`type`: Long, id: Long, new_class: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid3(MethodBind.get("VisualShader", "replace_node", 3144735253L), hostObject.objectPtr, `type`, id, new_class)

  /** VisualShader.is_node_connection */
  final def isNodeConnection(`type`: Long, from_node: Long, from_port: Long, to_node: Long, to_port: Long): Boolean =
    Ptrcall.call5[Long, Long, Long, Long, Long, Boolean](MethodBind.get("VisualShader", "is_node_connection", 3922381898L), hostObject.objectPtr, `type`, from_node, from_port, to_node, to_port)

  /** VisualShader.can_connect_nodes */
  final def canConnectNodes(`type`: Long, from_node: Long, from_port: Long, to_node: Long, to_port: Long): Boolean =
    Ptrcall.call5[Long, Long, Long, Long, Long, Boolean](MethodBind.get("VisualShader", "can_connect_nodes", 3922381898L), hostObject.objectPtr, `type`, from_node, from_port, to_node, to_port)

  /** VisualShader.connect_nodes */
  final def connectNodes(`type`: Long, from_node: Long, from_port: Long, to_node: Long, to_port: Long): Long =
    Ptrcall.call5[Long, Long, Long, Long, Long, Long](MethodBind.get("VisualShader", "connect_nodes", 3081049573L), hostObject.objectPtr, `type`, from_node, from_port, to_node, to_port)

  /** VisualShader.disconnect_nodes */
  final def disconnectNodes(`type`: Long, from_node: Long, from_port: Long, to_node: Long, to_port: Long): Unit =
    Ptrcall.callVoid5(MethodBind.get("VisualShader", "disconnect_nodes", 2268060358L), hostObject.objectPtr, `type`, from_node, from_port, to_node, to_port)

  /** VisualShader.connect_nodes_forced */
  final def connectNodesForced(`type`: Long, from_node: Long, from_port: Long, to_node: Long, to_port: Long): Unit =
    Ptrcall.callVoid5(MethodBind.get("VisualShader", "connect_nodes_forced", 2268060358L), hostObject.objectPtr, `type`, from_node, from_port, to_node, to_port)

  /** VisualShader.attach_node_to_frame */
  final def attachNodeToFrame(`type`: Long, id: Long, frame: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("VisualShader", "attach_node_to_frame", 2479945279L), hostObject.objectPtr, `type`, id, frame)

  /** VisualShader.detach_node_from_frame */
  final def detachNodeFromFrame(`type`: Long, id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("VisualShader", "detach_node_from_frame", 844050912L), hostObject.objectPtr, `type`, id)

  /** VisualShader.add_varying */
  final def addVarying(name: String, mode: Long, `type`: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("VisualShader", "add_varying", 2084110726L), hostObject.objectPtr, name, mode, `type`)

  /** VisualShader.remove_varying */
  final def removeVarying(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShader", "remove_varying", 83702148L), hostObject.objectPtr, name)

  /** VisualShader.has_varying */
  final def hasVarying(name: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("VisualShader", "has_varying", 3927539163L), hostObject.objectPtr, name)

  /** VisualShader.set_graph_offset */
  final def setGraphOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShader", "set_graph_offset", 743155724L), hostObject.objectPtr, offset)

  /** VisualShader.get_graph_offset */
  final def getGraphOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("VisualShader", "get_graph_offset", 3341600327L), hostObject.objectPtr)

}

object VisualShader {
  /** Class metadata for Gd[VisualShader] lifetime management and casting. */
  given GodotClass[VisualShader] with {
    def className = "VisualShader"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShader = new VisualShader {}.withHost(o.objectPtr)
    def unwrap(t: VisualShader): GodotObject = t.hostObject
  }
}
