package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShader`, extends `Shader`. */
abstract class VisualShader extends Shader {
  override def godotClassName: String = "VisualShader"

  /** VisualShader.set_mode */
  final def setMode(mode: gdext.classes.Shader.Mode): Unit = {
    if (gdext.classes.VisualShader.mb_set_mode == null) gdext.classes.VisualShader.mb_set_mode = MethodBind.get("VisualShader", "set_mode", 3978014962L)
    Ptrcall.callVoid1(gdext.classes.VisualShader.mb_set_mode, livePtr, mode)
  }

  /** VisualShader.add_node */
  final def addNode(`type`: gdext.classes.VisualShader.Type, node: VisualShaderNode, position: gdext.builtin.Vector2, id: Long): Unit = {
    if (gdext.classes.VisualShader.mb_add_node == null) gdext.classes.VisualShader.mb_add_node = MethodBind.get("VisualShader", "add_node", 1560769431L)
    Ptrcall.callVoid4(gdext.classes.VisualShader.mb_add_node, livePtr, `type`, Wrappers.handle(node), position, id)
  }

  /** VisualShader.get_node. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNode(`type`: gdext.classes.VisualShader.Type, id: Long): VisualShaderNode = {
    if (gdext.classes.VisualShader.mb_get_node == null) gdext.classes.VisualShader.mb_get_node = MethodBind.get("VisualShader", "get_node", 3784670312L)
    Wrappers.owned[VisualShaderNode](Ptrcall.call2[Long, Long, Long](gdext.classes.VisualShader.mb_get_node, livePtr, `type`, id))
  }

  /** VisualShader.set_node_position */
  final def setNodePosition(`type`: gdext.classes.VisualShader.Type, id: Long, position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.VisualShader.mb_set_node_position == null) gdext.classes.VisualShader.mb_set_node_position = MethodBind.get("VisualShader", "set_node_position", 2726660721L)
    Ptrcall.callVoid3(gdext.classes.VisualShader.mb_set_node_position, livePtr, `type`, id, position)
  }

  /** VisualShader.get_node_position */
  final def getNodePosition(`type`: gdext.classes.VisualShader.Type, id: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.VisualShader.mb_get_node_position == null) gdext.classes.VisualShader.mb_get_node_position = MethodBind.get("VisualShader", "get_node_position", 2175036082L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector2](gdext.classes.VisualShader.mb_get_node_position, livePtr, `type`, id)
  }

  /** VisualShader.get_valid_node_id */
  final def getValidNodeId(`type`: gdext.classes.VisualShader.Type): Long = {
    if (gdext.classes.VisualShader.mb_get_valid_node_id == null) gdext.classes.VisualShader.mb_get_valid_node_id = MethodBind.get("VisualShader", "get_valid_node_id", 629467342L)
    Ptrcall.call1[Long, Long](gdext.classes.VisualShader.mb_get_valid_node_id, livePtr, `type`)
  }

  /** VisualShader.remove_node */
  final def removeNode(`type`: gdext.classes.VisualShader.Type, id: Long): Unit = {
    if (gdext.classes.VisualShader.mb_remove_node == null) gdext.classes.VisualShader.mb_remove_node = MethodBind.get("VisualShader", "remove_node", 844050912L)
    Ptrcall.callVoid2(gdext.classes.VisualShader.mb_remove_node, livePtr, `type`, id)
  }

  /** VisualShader.replace_node */
  final def replaceNode(`type`: gdext.classes.VisualShader.Type, id: Long, newClass: String): Unit = {
    if (gdext.classes.VisualShader.mb_replace_node == null) gdext.classes.VisualShader.mb_replace_node = MethodBind.get("VisualShader", "replace_node", 3144735253L)
    Ptrcall.callVoid3(gdext.classes.VisualShader.mb_replace_node, livePtr, `type`, id, SnArg(newClass))
  }

  /** VisualShader.is_node_connection */
  final def isNodeConnection(`type`: gdext.classes.VisualShader.Type, fromNode: Long, fromPort: Long, toNode: Long, toPort: Long): Boolean = {
    if (gdext.classes.VisualShader.mb_is_node_connection == null) gdext.classes.VisualShader.mb_is_node_connection = MethodBind.get("VisualShader", "is_node_connection", 3922381898L)
    Ptrcall.call5[Long, Long, Long, Long, Long, Boolean](gdext.classes.VisualShader.mb_is_node_connection, livePtr, `type`, fromNode, fromPort, toNode, toPort)
  }

  /** VisualShader.can_connect_nodes */
  final def canConnectNodes(`type`: gdext.classes.VisualShader.Type, fromNode: Long, fromPort: Long, toNode: Long, toPort: Long): Boolean = {
    if (gdext.classes.VisualShader.mb_can_connect_nodes == null) gdext.classes.VisualShader.mb_can_connect_nodes = MethodBind.get("VisualShader", "can_connect_nodes", 3922381898L)
    Ptrcall.call5[Long, Long, Long, Long, Long, Boolean](gdext.classes.VisualShader.mb_can_connect_nodes, livePtr, `type`, fromNode, fromPort, toNode, toPort)
  }

  /** VisualShader.connect_nodes */
  final def connectNodes(`type`: gdext.classes.VisualShader.Type, fromNode: Long, fromPort: Long, toNode: Long, toPort: Long): gdext.classes.Error = {
    if (gdext.classes.VisualShader.mb_connect_nodes == null) gdext.classes.VisualShader.mb_connect_nodes = MethodBind.get("VisualShader", "connect_nodes", 3081049573L)
    gdext.classes.Error(Ptrcall.call5[Long, Long, Long, Long, Long, Long](gdext.classes.VisualShader.mb_connect_nodes, livePtr, `type`, fromNode, fromPort, toNode, toPort))
  }

  /** VisualShader.disconnect_nodes */
  final def disconnectNodes(`type`: gdext.classes.VisualShader.Type, fromNode: Long, fromPort: Long, toNode: Long, toPort: Long): Unit = {
    if (gdext.classes.VisualShader.mb_disconnect_nodes == null) gdext.classes.VisualShader.mb_disconnect_nodes = MethodBind.get("VisualShader", "disconnect_nodes", 2268060358L)
    Ptrcall.callVoid5(gdext.classes.VisualShader.mb_disconnect_nodes, livePtr, `type`, fromNode, fromPort, toNode, toPort)
  }

  /** VisualShader.connect_nodes_forced */
  final def connectNodesForced(`type`: gdext.classes.VisualShader.Type, fromNode: Long, fromPort: Long, toNode: Long, toPort: Long): Unit = {
    if (gdext.classes.VisualShader.mb_connect_nodes_forced == null) gdext.classes.VisualShader.mb_connect_nodes_forced = MethodBind.get("VisualShader", "connect_nodes_forced", 2268060358L)
    Ptrcall.callVoid5(gdext.classes.VisualShader.mb_connect_nodes_forced, livePtr, `type`, fromNode, fromPort, toNode, toPort)
  }

  /** VisualShader.attach_node_to_frame */
  final def attachNodeToFrame(`type`: gdext.classes.VisualShader.Type, id: Long, frame: Long): Unit = {
    if (gdext.classes.VisualShader.mb_attach_node_to_frame == null) gdext.classes.VisualShader.mb_attach_node_to_frame = MethodBind.get("VisualShader", "attach_node_to_frame", 2479945279L)
    Ptrcall.callVoid3(gdext.classes.VisualShader.mb_attach_node_to_frame, livePtr, `type`, id, frame)
  }

  /** VisualShader.detach_node_from_frame */
  final def detachNodeFromFrame(`type`: gdext.classes.VisualShader.Type, id: Long): Unit = {
    if (gdext.classes.VisualShader.mb_detach_node_from_frame == null) gdext.classes.VisualShader.mb_detach_node_from_frame = MethodBind.get("VisualShader", "detach_node_from_frame", 844050912L)
    Ptrcall.callVoid2(gdext.classes.VisualShader.mb_detach_node_from_frame, livePtr, `type`, id)
  }

  /** VisualShader.add_varying */
  final def addVarying(name: String, mode: gdext.classes.VisualShader.VaryingMode, `type`: gdext.classes.VisualShader.VaryingType): Unit = {
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

  /** Godot enum `VisualShader.Type`. */
  opaque type Type <: Long = Long

  object Type {
    final val Vertex: Type = 0L.asInstanceOf[Type]
    final val Fragment: Type = 1L.asInstanceOf[Type]
    final val Light: Type = 2L.asInstanceOf[Type]
    final val Start: Type = 3L.asInstanceOf[Type]
    final val Process: Type = 4L.asInstanceOf[Type]
    final val Collide: Type = 5L.asInstanceOf[Type]
    final val StartCustom: Type = 6L.asInstanceOf[Type]
    final val ProcessCustom: Type = 7L.asInstanceOf[Type]
    final val Sky: Type = 8L.asInstanceOf[Type]
    final val Fog: Type = 9L.asInstanceOf[Type]
    final val Max: Type = 10L.asInstanceOf[Type]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Type = value.asInstanceOf[Type]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Type] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L).asInstanceOf[scala.IArray[Type]]

    extension (self: Type)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Vertex"
        case 1L => "Fragment"
        case 2L => "Light"
        case 3L => "Start"
        case 4L => "Process"
        case 5L => "Collide"
        case 6L => "StartCustom"
        case 7L => "ProcessCustom"
        case 8L => "Sky"
        case 9L => "Fog"
        case 10L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `VisualShader.VaryingMode`. */
  opaque type VaryingMode <: Long = Long

  object VaryingMode {
    final val VertexToFragLight: VaryingMode = 0L.asInstanceOf[VaryingMode]
    final val FragToLight: VaryingMode = 1L.asInstanceOf[VaryingMode]
    final val Max: VaryingMode = 2L.asInstanceOf[VaryingMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): VaryingMode = value.asInstanceOf[VaryingMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[VaryingMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[VaryingMode]]

    extension (self: VaryingMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "VertexToFragLight"
        case 1L => "FragToLight"
        case 2L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `VisualShader.VaryingType`. */
  opaque type VaryingType <: Long = Long

  object VaryingType {
    final val Float: VaryingType = 0L.asInstanceOf[VaryingType]
    final val Int: VaryingType = 1L.asInstanceOf[VaryingType]
    final val Uint: VaryingType = 2L.asInstanceOf[VaryingType]
    final val Vector2d: VaryingType = 3L.asInstanceOf[VaryingType]
    final val Vector3d: VaryingType = 4L.asInstanceOf[VaryingType]
    final val Vector4d: VaryingType = 5L.asInstanceOf[VaryingType]
    final val Boolean: VaryingType = 6L.asInstanceOf[VaryingType]
    final val Transform: VaryingType = 7L.asInstanceOf[VaryingType]
    final val Max: VaryingType = 8L.asInstanceOf[VaryingType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): VaryingType = value.asInstanceOf[VaryingType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[VaryingType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L).asInstanceOf[scala.IArray[VaryingType]]

    extension (self: VaryingType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Float"
        case 1L => "Int"
        case 2L => "Uint"
        case 3L => "Vector2d"
        case 4L => "Vector3d"
        case 5L => "Vector4d"
        case 6L => "Boolean"
        case 7L => "Transform"
        case 8L => "Max"
        case other => other.toString
      }
  }
}
