package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeParameter`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParameter extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParameter"

  /** VisualShaderNodeParameter.set_parameter_name */
  final def setParameterName(name: String): Unit = {
    if (gdext.classes.VisualShaderNodeParameter.mb_set_parameter_name == null) gdext.classes.VisualShaderNodeParameter.mb_set_parameter_name = MethodBind.get("VisualShaderNodeParameter", "set_parameter_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParameter.mb_set_parameter_name, livePtr, name)
  }

  /** VisualShaderNodeParameter.get_parameter_name */
  final def getParameterName(): String = {
    if (gdext.classes.VisualShaderNodeParameter.mb_get_parameter_name == null) gdext.classes.VisualShaderNodeParameter.mb_get_parameter_name = MethodBind.get("VisualShaderNodeParameter", "get_parameter_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.VisualShaderNodeParameter.mb_get_parameter_name, livePtr)
  }

  /** VisualShaderNodeParameter.set_qualifier */
  final def setQualifier(qualifier: gdext.classes.VisualShaderNodeParameter.Qualifier): Unit = {
    if (gdext.classes.VisualShaderNodeParameter.mb_set_qualifier == null) gdext.classes.VisualShaderNodeParameter.mb_set_qualifier = MethodBind.get("VisualShaderNodeParameter", "set_qualifier", 1276489447L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParameter.mb_set_qualifier, livePtr, qualifier)
  }

  /** VisualShaderNodeParameter.get_qualifier */
  final def getQualifier(): gdext.classes.VisualShaderNodeParameter.Qualifier = {
    if (gdext.classes.VisualShaderNodeParameter.mb_get_qualifier == null) gdext.classes.VisualShaderNodeParameter.mb_get_qualifier = MethodBind.get("VisualShaderNodeParameter", "get_qualifier", 3558406205L)
    gdext.classes.VisualShaderNodeParameter.Qualifier(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeParameter.mb_get_qualifier, livePtr))
  }

  /** VisualShaderNodeParameter.set_instance_index */
  final def setInstanceIndex(instanceIndex: Long): Unit = {
    if (gdext.classes.VisualShaderNodeParameter.mb_set_instance_index == null) gdext.classes.VisualShaderNodeParameter.mb_set_instance_index = MethodBind.get("VisualShaderNodeParameter", "set_instance_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParameter.mb_set_instance_index, livePtr, instanceIndex)
  }

  /** VisualShaderNodeParameter.get_instance_index */
  final def getInstanceIndex(): Long = {
    if (gdext.classes.VisualShaderNodeParameter.mb_get_instance_index == null) gdext.classes.VisualShaderNodeParameter.mb_get_instance_index = MethodBind.get("VisualShaderNodeParameter", "get_instance_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeParameter.mb_get_instance_index, livePtr)
  }

}

object VisualShaderNodeParameter {
  private[classes] var mb_set_parameter_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_parameter_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_qualifier: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_qualifier: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_instance_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_instance_index: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeParameter.Qualifier`. */
  opaque type Qualifier <: Long = Long

  object Qualifier {
    final val None: Qualifier = 0L.asInstanceOf[Qualifier]
    final val Global: Qualifier = 1L.asInstanceOf[Qualifier]
    final val Instance: Qualifier = 2L.asInstanceOf[Qualifier]
    final val InstanceIndex: Qualifier = 3L.asInstanceOf[Qualifier]
    final val Max: Qualifier = 4L.asInstanceOf[Qualifier]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Qualifier = value.asInstanceOf[Qualifier]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Qualifier] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[Qualifier]]

    extension (self: Qualifier)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Global"
        case 2L => "Instance"
        case 3L => "InstanceIndex"
        case 4L => "Max"
        case other => other.toString
      }
  }
}
