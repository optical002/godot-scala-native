package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeReroute`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeReroute extends VisualShaderNode {

  /** VisualShaderNodeReroute.get_port_type */
  final def getPortType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeReroute", "get_port_type", 1287173294L), hostObject.objectPtr)

}

object VisualShaderNodeReroute {
  /** Class metadata for Gd[VisualShaderNodeReroute] lifetime management and casting. */
  given GodotClass[VisualShaderNodeReroute] with {
    def className = "VisualShaderNodeReroute"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeReroute = new VisualShaderNodeReroute {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeReroute): GodotObject = t.hostObject
  }
}
