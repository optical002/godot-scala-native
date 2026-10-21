package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNode`, extends `Resource`. */
abstract class VisualShaderNode extends Resource {
  override def godotClassName: String = "VisualShaderNode"

  /** VisualShaderNode.get_default_input_port */
  final def getDefaultInputPort(`type`: Long): Long = {
    if (gdext.classes.VisualShaderNode.mb_get_default_input_port == null) gdext.classes.VisualShaderNode.mb_get_default_input_port = MethodBind.get("VisualShaderNode", "get_default_input_port", 1894493699L)
    Ptrcall.call1[Long, Long](gdext.classes.VisualShaderNode.mb_get_default_input_port, livePtr, `type`)
  }

  /** VisualShaderNode.set_output_port_for_preview */
  final def setOutputPortForPreview(port: Long): Unit = {
    if (gdext.classes.VisualShaderNode.mb_set_output_port_for_preview == null) gdext.classes.VisualShaderNode.mb_set_output_port_for_preview = MethodBind.get("VisualShaderNode", "set_output_port_for_preview", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNode.mb_set_output_port_for_preview, livePtr, port)
  }

  /** VisualShaderNode.get_output_port_for_preview */
  final def getOutputPortForPreview(): Long = {
    if (gdext.classes.VisualShaderNode.mb_get_output_port_for_preview == null) gdext.classes.VisualShaderNode.mb_get_output_port_for_preview = MethodBind.get("VisualShaderNode", "get_output_port_for_preview", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNode.mb_get_output_port_for_preview, livePtr)
  }

  /** VisualShaderNode.remove_input_port_default_value */
  final def removeInputPortDefaultValue(port: Long): Unit = {
    if (gdext.classes.VisualShaderNode.mb_remove_input_port_default_value == null) gdext.classes.VisualShaderNode.mb_remove_input_port_default_value = MethodBind.get("VisualShaderNode", "remove_input_port_default_value", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNode.mb_remove_input_port_default_value, livePtr, port)
  }

  /** VisualShaderNode.clear_default_input_values */
  final def clearDefaultInputValues(): Unit = {
    if (gdext.classes.VisualShaderNode.mb_clear_default_input_values == null) gdext.classes.VisualShaderNode.mb_clear_default_input_values = MethodBind.get("VisualShaderNode", "clear_default_input_values", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.VisualShaderNode.mb_clear_default_input_values, livePtr)
  }

  /** VisualShaderNode.set_frame */
  final def setFrame(frame: Long): Unit = {
    if (gdext.classes.VisualShaderNode.mb_set_frame == null) gdext.classes.VisualShaderNode.mb_set_frame = MethodBind.get("VisualShaderNode", "set_frame", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNode.mb_set_frame, livePtr, frame)
  }

  /** VisualShaderNode.get_frame */
  final def getFrame(): Long = {
    if (gdext.classes.VisualShaderNode.mb_get_frame == null) gdext.classes.VisualShaderNode.mb_get_frame = MethodBind.get("VisualShaderNode", "get_frame", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNode.mb_get_frame, livePtr)
  }

}

object VisualShaderNode {
  private[classes] var mb_get_default_input_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_output_port_for_preview: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_output_port_for_preview: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_input_port_default_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_default_input_values: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame: GDExtensionMethodBindPtr = null
}
