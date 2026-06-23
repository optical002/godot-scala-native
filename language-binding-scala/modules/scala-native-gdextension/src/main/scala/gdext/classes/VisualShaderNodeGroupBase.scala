package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeGroupBase`, extends `VisualShaderNodeResizableBase`. */
abstract class VisualShaderNodeGroupBase extends VisualShaderNodeResizableBase {

  /** VisualShaderNodeGroupBase.set_inputs */
  final def setInputs(inputs: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeGroupBase", "set_inputs", 83702148L), hostObject.objectPtr, inputs)

  /** VisualShaderNodeGroupBase.get_inputs */
  final def getInputs(): String =
    Ptrcall.call0[String](MethodBind.get("VisualShaderNodeGroupBase", "get_inputs", 201670096L), hostObject.objectPtr)

  /** VisualShaderNodeGroupBase.set_outputs */
  final def setOutputs(outputs: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeGroupBase", "set_outputs", 83702148L), hostObject.objectPtr, outputs)

  /** VisualShaderNodeGroupBase.get_outputs */
  final def getOutputs(): String =
    Ptrcall.call0[String](MethodBind.get("VisualShaderNodeGroupBase", "get_outputs", 201670096L), hostObject.objectPtr)

  /** VisualShaderNodeGroupBase.is_valid_port_name */
  final def isValidPortName(name: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("VisualShaderNodeGroupBase", "is_valid_port_name", 3927539163L), hostObject.objectPtr, name)

  /** VisualShaderNodeGroupBase.add_input_port */
  final def addInputPort(id: Long, `type`: Long, name: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("VisualShaderNodeGroupBase", "add_input_port", 2285447957L), hostObject.objectPtr, id, `type`, name)

  /** VisualShaderNodeGroupBase.remove_input_port */
  final def removeInputPort(id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeGroupBase", "remove_input_port", 1286410249L), hostObject.objectPtr, id)

  /** VisualShaderNodeGroupBase.get_input_port_count */
  final def getInputPortCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeGroupBase", "get_input_port_count", 3905245786L), hostObject.objectPtr)

  /** VisualShaderNodeGroupBase.has_input_port */
  final def hasInputPort(id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("VisualShaderNodeGroupBase", "has_input_port", 1116898809L), hostObject.objectPtr, id)

  /** VisualShaderNodeGroupBase.clear_input_ports */
  final def clearInputPorts(): Unit =
    Ptrcall.callVoid0(MethodBind.get("VisualShaderNodeGroupBase", "clear_input_ports", 3218959716L), hostObject.objectPtr)

  /** VisualShaderNodeGroupBase.add_output_port */
  final def addOutputPort(id: Long, `type`: Long, name: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("VisualShaderNodeGroupBase", "add_output_port", 2285447957L), hostObject.objectPtr, id, `type`, name)

  /** VisualShaderNodeGroupBase.remove_output_port */
  final def removeOutputPort(id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeGroupBase", "remove_output_port", 1286410249L), hostObject.objectPtr, id)

  /** VisualShaderNodeGroupBase.get_output_port_count */
  final def getOutputPortCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeGroupBase", "get_output_port_count", 3905245786L), hostObject.objectPtr)

  /** VisualShaderNodeGroupBase.has_output_port */
  final def hasOutputPort(id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("VisualShaderNodeGroupBase", "has_output_port", 1116898809L), hostObject.objectPtr, id)

  /** VisualShaderNodeGroupBase.clear_output_ports */
  final def clearOutputPorts(): Unit =
    Ptrcall.callVoid0(MethodBind.get("VisualShaderNodeGroupBase", "clear_output_ports", 3218959716L), hostObject.objectPtr)

  /** VisualShaderNodeGroupBase.set_input_port_name */
  final def setInputPortName(id: Long, name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("VisualShaderNodeGroupBase", "set_input_port_name", 501894301L), hostObject.objectPtr, id, name)

  /** VisualShaderNodeGroupBase.set_input_port_type */
  final def setInputPortType(id: Long, `type`: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("VisualShaderNodeGroupBase", "set_input_port_type", 3937882851L), hostObject.objectPtr, id, `type`)

  /** VisualShaderNodeGroupBase.set_output_port_name */
  final def setOutputPortName(id: Long, name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("VisualShaderNodeGroupBase", "set_output_port_name", 501894301L), hostObject.objectPtr, id, name)

  /** VisualShaderNodeGroupBase.set_output_port_type */
  final def setOutputPortType(id: Long, `type`: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("VisualShaderNodeGroupBase", "set_output_port_type", 3937882851L), hostObject.objectPtr, id, `type`)

  /** VisualShaderNodeGroupBase.get_free_input_port_id */
  final def getFreeInputPortId(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeGroupBase", "get_free_input_port_id", 3905245786L), hostObject.objectPtr)

  /** VisualShaderNodeGroupBase.get_free_output_port_id */
  final def getFreeOutputPortId(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeGroupBase", "get_free_output_port_id", 3905245786L), hostObject.objectPtr)

}

object VisualShaderNodeGroupBase {
  /** Class metadata for Gd[VisualShaderNodeGroupBase] lifetime management and casting. */
  given GodotClass[VisualShaderNodeGroupBase] with {
    def className = "VisualShaderNodeGroupBase"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeGroupBase = new VisualShaderNodeGroupBase {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeGroupBase): GodotObject = t.hostObject
  }
}
