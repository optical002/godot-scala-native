package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeCompare`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeCompare extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeCompare"

  /** VisualShaderNodeCompare.set_comparison_type */
  final def setComparisonType(`type`: gdext.classes.VisualShaderNodeCompare.ComparisonType): Unit = {
    if (gdext.classes.VisualShaderNodeCompare.mb_set_comparison_type == null) gdext.classes.VisualShaderNodeCompare.mb_set_comparison_type = MethodBind.get("VisualShaderNodeCompare", "set_comparison_type", 516558320L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeCompare.mb_set_comparison_type, livePtr, `type`)
  }

  /** VisualShaderNodeCompare.get_comparison_type */
  final def getComparisonType(): gdext.classes.VisualShaderNodeCompare.ComparisonType = {
    if (gdext.classes.VisualShaderNodeCompare.mb_get_comparison_type == null) gdext.classes.VisualShaderNodeCompare.mb_get_comparison_type = MethodBind.get("VisualShaderNodeCompare", "get_comparison_type", 3495315961L)
    gdext.classes.VisualShaderNodeCompare.ComparisonType(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeCompare.mb_get_comparison_type, livePtr))
  }

  /** VisualShaderNodeCompare.set_function */
  final def setFunction(func: gdext.classes.VisualShaderNodeCompare.Function): Unit = {
    if (gdext.classes.VisualShaderNodeCompare.mb_set_function == null) gdext.classes.VisualShaderNodeCompare.mb_set_function = MethodBind.get("VisualShaderNodeCompare", "set_function", 2370951349L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeCompare.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeCompare.get_function */
  final def getFunction(): gdext.classes.VisualShaderNodeCompare.Function = {
    if (gdext.classes.VisualShaderNodeCompare.mb_get_function == null) gdext.classes.VisualShaderNodeCompare.mb_get_function = MethodBind.get("VisualShaderNodeCompare", "get_function", 4089164265L)
    gdext.classes.VisualShaderNodeCompare.Function(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeCompare.mb_get_function, livePtr))
  }

  /** VisualShaderNodeCompare.set_condition */
  final def setCondition(condition: gdext.classes.VisualShaderNodeCompare.Condition): Unit = {
    if (gdext.classes.VisualShaderNodeCompare.mb_set_condition == null) gdext.classes.VisualShaderNodeCompare.mb_set_condition = MethodBind.get("VisualShaderNodeCompare", "set_condition", 918742392L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeCompare.mb_set_condition, livePtr, condition)
  }

  /** VisualShaderNodeCompare.get_condition */
  final def getCondition(): gdext.classes.VisualShaderNodeCompare.Condition = {
    if (gdext.classes.VisualShaderNodeCompare.mb_get_condition == null) gdext.classes.VisualShaderNodeCompare.mb_get_condition = MethodBind.get("VisualShaderNodeCompare", "get_condition", 3281078941L)
    gdext.classes.VisualShaderNodeCompare.Condition(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeCompare.mb_get_condition, livePtr))
  }

}

object VisualShaderNodeCompare {
  private[classes] var mb_set_comparison_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_comparison_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_condition: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_condition: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeCompare.ComparisonType`. */
  opaque type ComparisonType <: Long = Long

  object ComparisonType {
    final val Scalar: ComparisonType = 0L.asInstanceOf[ComparisonType]
    final val ScalarInt: ComparisonType = 1L.asInstanceOf[ComparisonType]
    final val ScalarUint: ComparisonType = 2L.asInstanceOf[ComparisonType]
    final val Vector2d: ComparisonType = 3L.asInstanceOf[ComparisonType]
    final val Vector3d: ComparisonType = 4L.asInstanceOf[ComparisonType]
    final val Vector4d: ComparisonType = 5L.asInstanceOf[ComparisonType]
    final val Boolean: ComparisonType = 6L.asInstanceOf[ComparisonType]
    final val Transform: ComparisonType = 7L.asInstanceOf[ComparisonType]
    final val Max: ComparisonType = 8L.asInstanceOf[ComparisonType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ComparisonType = value.asInstanceOf[ComparisonType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ComparisonType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L).asInstanceOf[scala.IArray[ComparisonType]]

    extension (self: ComparisonType)
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
        case 8L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `VisualShaderNodeCompare.Function`. */
  opaque type Function <: Long = Long

  object Function {
    final val Equal: Function = 0L.asInstanceOf[Function]
    final val NotEqual: Function = 1L.asInstanceOf[Function]
    final val GreaterThan: Function = 2L.asInstanceOf[Function]
    final val GreaterThanEqual: Function = 3L.asInstanceOf[Function]
    final val LessThan: Function = 4L.asInstanceOf[Function]
    final val LessThanEqual: Function = 5L.asInstanceOf[Function]
    final val Max: Function = 6L.asInstanceOf[Function]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Function = value.asInstanceOf[Function]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Function] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[Function]]

    extension (self: Function)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Equal"
        case 1L => "NotEqual"
        case 2L => "GreaterThan"
        case 3L => "GreaterThanEqual"
        case 4L => "LessThan"
        case 5L => "LessThanEqual"
        case 6L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `VisualShaderNodeCompare.Condition`. */
  opaque type Condition <: Long = Long

  object Condition {
    final val All: Condition = 0L.asInstanceOf[Condition]
    final val Any: Condition = 1L.asInstanceOf[Condition]
    final val Max: Condition = 2L.asInstanceOf[Condition]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Condition = value.asInstanceOf[Condition]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Condition] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[Condition]]

    extension (self: Condition)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "All"
        case 1L => "Any"
        case 2L => "Max"
        case other => other.toString
      }
  }
}
