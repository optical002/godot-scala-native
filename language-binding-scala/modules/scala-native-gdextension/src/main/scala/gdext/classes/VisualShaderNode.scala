package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNode`, extends `Resource`. */
abstract class VisualShaderNode extends Resource {
  override def godotClassName: String = "VisualShaderNode"

  /** VisualShaderNode.get_default_input_port */
  final def getDefaultInputPort(`type`: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("VisualShaderNode", "get_default_input_port", 1894493699L), hostObject.objectPtr, `type`)

  /** VisualShaderNode.set_output_port_for_preview */
  final def setOutputPortForPreview(port: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNode", "set_output_port_for_preview", 1286410249L), hostObject.objectPtr, port)

  /** VisualShaderNode.get_output_port_for_preview */
  final def getOutputPortForPreview(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNode", "get_output_port_for_preview", 3905245786L), hostObject.objectPtr)

  /** VisualShaderNode.remove_input_port_default_value */
  final def removeInputPortDefaultValue(port: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNode", "remove_input_port_default_value", 1286410249L), hostObject.objectPtr, port)

  /** VisualShaderNode.clear_default_input_values */
  final def clearDefaultInputValues(): Unit =
    Ptrcall.callVoid0(MethodBind.get("VisualShaderNode", "clear_default_input_values", 3218959716L), hostObject.objectPtr)

  /** VisualShaderNode.set_frame */
  final def setFrame(frame: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNode", "set_frame", 1286410249L), hostObject.objectPtr, frame)

  /** VisualShaderNode.get_frame */
  final def getFrame(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNode", "get_frame", 3905245786L), hostObject.objectPtr)

}
