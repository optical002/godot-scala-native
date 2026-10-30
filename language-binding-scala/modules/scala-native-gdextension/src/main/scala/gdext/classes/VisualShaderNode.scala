package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNode`, extends `Resource`. */
abstract class VisualShaderNode extends Resource {
  override def godotClassName: String = "VisualShaderNode"

  /** VisualShaderNode.get_default_input_port */
  final def getDefaultInputPort(`type`: gdext.classes.VisualShaderNode.PortType): Long = {
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

  /** Godot enum `VisualShaderNode.PortType`. */
  opaque type PortType <: Long = Long

  object PortType {
    final val Scalar: PortType = 0L.asInstanceOf[PortType]
    final val ScalarInt: PortType = 1L.asInstanceOf[PortType]
    final val ScalarUint: PortType = 2L.asInstanceOf[PortType]
    final val Vector2d: PortType = 3L.asInstanceOf[PortType]
    final val Vector3d: PortType = 4L.asInstanceOf[PortType]
    final val Vector4d: PortType = 5L.asInstanceOf[PortType]
    final val Boolean: PortType = 6L.asInstanceOf[PortType]
    final val Transform: PortType = 7L.asInstanceOf[PortType]
    final val Sampler: PortType = 8L.asInstanceOf[PortType]
    final val Max: PortType = 9L.asInstanceOf[PortType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PortType = value.asInstanceOf[PortType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PortType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L).asInstanceOf[scala.IArray[PortType]]

    extension (self: PortType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Scalar"
        case 1L => "ScalarInt"
        case 2L => "ScalarUint"
        case 3L => "Vector2d"
        case 4L => "Vector3d"
        case 5L => "Vector4d"
        case 6L => "Boolean"
        case 7L => "Transform"
        case 8L => "Sampler"
        case 9L => "Max"
        case other => other.toString
      }
  }
}
