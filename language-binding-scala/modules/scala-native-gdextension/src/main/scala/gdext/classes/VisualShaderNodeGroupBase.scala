package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeGroupBase`, extends `VisualShaderNodeResizableBase`. */
abstract class VisualShaderNodeGroupBase extends VisualShaderNodeResizableBase {
  override def godotClassName: String = "VisualShaderNodeGroupBase"

  /** VisualShaderNodeGroupBase.set_inputs */
  final def setInputs(inputs: String): Unit = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_set_inputs == null) gdext.classes.VisualShaderNodeGroupBase.mb_set_inputs = MethodBind.get("VisualShaderNodeGroupBase", "set_inputs", 83702148L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeGroupBase.mb_set_inputs, livePtr, inputs)
  }

  /** VisualShaderNodeGroupBase.get_inputs */
  final def getInputs(): String = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_get_inputs == null) gdext.classes.VisualShaderNodeGroupBase.mb_get_inputs = MethodBind.get("VisualShaderNodeGroupBase", "get_inputs", 201670096L)
    Ptrcall.call0[String](gdext.classes.VisualShaderNodeGroupBase.mb_get_inputs, livePtr)
  }

  /** VisualShaderNodeGroupBase.set_outputs */
  final def setOutputs(outputs: String): Unit = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_set_outputs == null) gdext.classes.VisualShaderNodeGroupBase.mb_set_outputs = MethodBind.get("VisualShaderNodeGroupBase", "set_outputs", 83702148L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeGroupBase.mb_set_outputs, livePtr, outputs)
  }

  /** VisualShaderNodeGroupBase.get_outputs */
  final def getOutputs(): String = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_get_outputs == null) gdext.classes.VisualShaderNodeGroupBase.mb_get_outputs = MethodBind.get("VisualShaderNodeGroupBase", "get_outputs", 201670096L)
    Ptrcall.call0[String](gdext.classes.VisualShaderNodeGroupBase.mb_get_outputs, livePtr)
  }

  /** VisualShaderNodeGroupBase.is_valid_port_name */
  final def isValidPortName(name: String): Boolean = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_is_valid_port_name == null) gdext.classes.VisualShaderNodeGroupBase.mb_is_valid_port_name = MethodBind.get("VisualShaderNodeGroupBase", "is_valid_port_name", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.VisualShaderNodeGroupBase.mb_is_valid_port_name, livePtr, name)
  }

  /** VisualShaderNodeGroupBase.add_input_port */
  final def addInputPort(id: Long, `type`: Long, name: String): Unit = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_add_input_port == null) gdext.classes.VisualShaderNodeGroupBase.mb_add_input_port = MethodBind.get("VisualShaderNodeGroupBase", "add_input_port", 2285447957L)
    Ptrcall.callVoid3(gdext.classes.VisualShaderNodeGroupBase.mb_add_input_port, livePtr, id, `type`, name)
  }

  /** VisualShaderNodeGroupBase.remove_input_port */
  final def removeInputPort(id: Long): Unit = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_remove_input_port == null) gdext.classes.VisualShaderNodeGroupBase.mb_remove_input_port = MethodBind.get("VisualShaderNodeGroupBase", "remove_input_port", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeGroupBase.mb_remove_input_port, livePtr, id)
  }

  /** VisualShaderNodeGroupBase.get_input_port_count */
  final def getInputPortCount(): Long = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_get_input_port_count == null) gdext.classes.VisualShaderNodeGroupBase.mb_get_input_port_count = MethodBind.get("VisualShaderNodeGroupBase", "get_input_port_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeGroupBase.mb_get_input_port_count, livePtr)
  }

  /** VisualShaderNodeGroupBase.has_input_port */
  final def hasInputPort(id: Long): Boolean = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_has_input_port == null) gdext.classes.VisualShaderNodeGroupBase.mb_has_input_port = MethodBind.get("VisualShaderNodeGroupBase", "has_input_port", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.VisualShaderNodeGroupBase.mb_has_input_port, livePtr, id)
  }

  /** VisualShaderNodeGroupBase.clear_input_ports */
  final def clearInputPorts(): Unit = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_clear_input_ports == null) gdext.classes.VisualShaderNodeGroupBase.mb_clear_input_ports = MethodBind.get("VisualShaderNodeGroupBase", "clear_input_ports", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.VisualShaderNodeGroupBase.mb_clear_input_ports, livePtr)
  }

  /** VisualShaderNodeGroupBase.add_output_port */
  final def addOutputPort(id: Long, `type`: Long, name: String): Unit = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_add_output_port == null) gdext.classes.VisualShaderNodeGroupBase.mb_add_output_port = MethodBind.get("VisualShaderNodeGroupBase", "add_output_port", 2285447957L)
    Ptrcall.callVoid3(gdext.classes.VisualShaderNodeGroupBase.mb_add_output_port, livePtr, id, `type`, name)
  }

  /** VisualShaderNodeGroupBase.remove_output_port */
  final def removeOutputPort(id: Long): Unit = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_remove_output_port == null) gdext.classes.VisualShaderNodeGroupBase.mb_remove_output_port = MethodBind.get("VisualShaderNodeGroupBase", "remove_output_port", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeGroupBase.mb_remove_output_port, livePtr, id)
  }

  /** VisualShaderNodeGroupBase.get_output_port_count */
  final def getOutputPortCount(): Long = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_get_output_port_count == null) gdext.classes.VisualShaderNodeGroupBase.mb_get_output_port_count = MethodBind.get("VisualShaderNodeGroupBase", "get_output_port_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeGroupBase.mb_get_output_port_count, livePtr)
  }

  /** VisualShaderNodeGroupBase.has_output_port */
  final def hasOutputPort(id: Long): Boolean = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_has_output_port == null) gdext.classes.VisualShaderNodeGroupBase.mb_has_output_port = MethodBind.get("VisualShaderNodeGroupBase", "has_output_port", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.VisualShaderNodeGroupBase.mb_has_output_port, livePtr, id)
  }

  /** VisualShaderNodeGroupBase.clear_output_ports */
  final def clearOutputPorts(): Unit = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_clear_output_ports == null) gdext.classes.VisualShaderNodeGroupBase.mb_clear_output_ports = MethodBind.get("VisualShaderNodeGroupBase", "clear_output_ports", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.VisualShaderNodeGroupBase.mb_clear_output_ports, livePtr)
  }

  /** VisualShaderNodeGroupBase.set_input_port_name */
  final def setInputPortName(id: Long, name: String): Unit = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_set_input_port_name == null) gdext.classes.VisualShaderNodeGroupBase.mb_set_input_port_name = MethodBind.get("VisualShaderNodeGroupBase", "set_input_port_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.VisualShaderNodeGroupBase.mb_set_input_port_name, livePtr, id, name)
  }

  /** VisualShaderNodeGroupBase.set_input_port_type */
  final def setInputPortType(id: Long, `type`: Long): Unit = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_set_input_port_type == null) gdext.classes.VisualShaderNodeGroupBase.mb_set_input_port_type = MethodBind.get("VisualShaderNodeGroupBase", "set_input_port_type", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.VisualShaderNodeGroupBase.mb_set_input_port_type, livePtr, id, `type`)
  }

  /** VisualShaderNodeGroupBase.set_output_port_name */
  final def setOutputPortName(id: Long, name: String): Unit = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_set_output_port_name == null) gdext.classes.VisualShaderNodeGroupBase.mb_set_output_port_name = MethodBind.get("VisualShaderNodeGroupBase", "set_output_port_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.VisualShaderNodeGroupBase.mb_set_output_port_name, livePtr, id, name)
  }

  /** VisualShaderNodeGroupBase.set_output_port_type */
  final def setOutputPortType(id: Long, `type`: Long): Unit = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_set_output_port_type == null) gdext.classes.VisualShaderNodeGroupBase.mb_set_output_port_type = MethodBind.get("VisualShaderNodeGroupBase", "set_output_port_type", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.VisualShaderNodeGroupBase.mb_set_output_port_type, livePtr, id, `type`)
  }

  /** VisualShaderNodeGroupBase.get_free_input_port_id */
  final def getFreeInputPortId(): Long = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_get_free_input_port_id == null) gdext.classes.VisualShaderNodeGroupBase.mb_get_free_input_port_id = MethodBind.get("VisualShaderNodeGroupBase", "get_free_input_port_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeGroupBase.mb_get_free_input_port_id, livePtr)
  }

  /** VisualShaderNodeGroupBase.get_free_output_port_id */
  final def getFreeOutputPortId(): Long = {
    if (gdext.classes.VisualShaderNodeGroupBase.mb_get_free_output_port_id == null) gdext.classes.VisualShaderNodeGroupBase.mb_get_free_output_port_id = MethodBind.get("VisualShaderNodeGroupBase", "get_free_output_port_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeGroupBase.mb_get_free_output_port_id, livePtr)
  }

}

object VisualShaderNodeGroupBase {
  private[classes] var mb_set_inputs: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inputs: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_outputs: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_outputs: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_valid_port_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_input_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_input_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_port_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_input_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_input_ports: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_output_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_output_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_output_port_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_output_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_output_ports: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_input_port_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_input_port_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_output_port_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_output_port_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_free_input_port_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_free_output_port_id: GDExtensionMethodBindPtr = null
}
