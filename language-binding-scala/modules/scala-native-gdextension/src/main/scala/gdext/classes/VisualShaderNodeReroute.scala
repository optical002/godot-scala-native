package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeReroute`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeReroute extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeReroute"

  /** VisualShaderNodeReroute.get_port_type */
  final def getPortType(): Long = {
    if (gdext.classes.VisualShaderNodeReroute.mb_get_port_type == null) gdext.classes.VisualShaderNodeReroute.mb_get_port_type = MethodBind.get("VisualShaderNodeReroute", "get_port_type", 1287173294L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeReroute.mb_get_port_type, livePtr)
  }

}

object VisualShaderNodeReroute {
  private[classes] var mb_get_port_type: GDExtensionMethodBindPtr = null
}
