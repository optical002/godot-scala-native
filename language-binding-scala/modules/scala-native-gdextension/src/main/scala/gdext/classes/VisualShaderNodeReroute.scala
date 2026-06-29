package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeReroute`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeReroute extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeReroute"

  /** VisualShaderNodeReroute.get_port_type */
  final def getPortType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeReroute", "get_port_type", 1287173294L), hostObject.objectPtr)

}
