package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeIntParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeIntParameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeIntParameter"

  /** VisualShaderNodeIntParameter.set_hint */
  final def setHint(hint: gdext.classes.VisualShaderNodeIntParameter.Hint): Unit = {
    if (gdext.classes.VisualShaderNodeIntParameter.mb_set_hint == null) gdext.classes.VisualShaderNodeIntParameter.mb_set_hint = MethodBind.get("VisualShaderNodeIntParameter", "set_hint", 2540512075L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeIntParameter.mb_set_hint, livePtr, hint)
  }

  /** VisualShaderNodeIntParameter.get_hint */
  final def getHint(): gdext.classes.VisualShaderNodeIntParameter.Hint = {
    if (gdext.classes.VisualShaderNodeIntParameter.mb_get_hint == null) gdext.classes.VisualShaderNodeIntParameter.mb_get_hint = MethodBind.get("VisualShaderNodeIntParameter", "get_hint", 4250814924L)
    gdext.classes.VisualShaderNodeIntParameter.Hint(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeIntParameter.mb_get_hint, livePtr))
  }

  /** VisualShaderNodeIntParameter.set_min */
  final def setMin(value: Long): Unit = {
    if (gdext.classes.VisualShaderNodeIntParameter.mb_set_min == null) gdext.classes.VisualShaderNodeIntParameter.mb_set_min = MethodBind.get("VisualShaderNodeIntParameter", "set_min", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeIntParameter.mb_set_min, livePtr, value)
  }

  /** VisualShaderNodeIntParameter.get_min */
  final def getMin(): Long = {
    if (gdext.classes.VisualShaderNodeIntParameter.mb_get_min == null) gdext.classes.VisualShaderNodeIntParameter.mb_get_min = MethodBind.get("VisualShaderNodeIntParameter", "get_min", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeIntParameter.mb_get_min, livePtr)
  }

  /** VisualShaderNodeIntParameter.set_max */
  final def setMax(value: Long): Unit = {
    if (gdext.classes.VisualShaderNodeIntParameter.mb_set_max == null) gdext.classes.VisualShaderNodeIntParameter.mb_set_max = MethodBind.get("VisualShaderNodeIntParameter", "set_max", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeIntParameter.mb_set_max, livePtr, value)
  }

  /** VisualShaderNodeIntParameter.get_max */
  final def getMax(): Long = {
    if (gdext.classes.VisualShaderNodeIntParameter.mb_get_max == null) gdext.classes.VisualShaderNodeIntParameter.mb_get_max = MethodBind.get("VisualShaderNodeIntParameter", "get_max", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeIntParameter.mb_get_max, livePtr)
  }

  /** VisualShaderNodeIntParameter.set_step */
  final def setStep(value: Long): Unit = {
    if (gdext.classes.VisualShaderNodeIntParameter.mb_set_step == null) gdext.classes.VisualShaderNodeIntParameter.mb_set_step = MethodBind.get("VisualShaderNodeIntParameter", "set_step", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeIntParameter.mb_set_step, livePtr, value)
  }

  /** VisualShaderNodeIntParameter.get_step */
  final def getStep(): Long = {
    if (gdext.classes.VisualShaderNodeIntParameter.mb_get_step == null) gdext.classes.VisualShaderNodeIntParameter.mb_get_step = MethodBind.get("VisualShaderNodeIntParameter", "get_step", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeIntParameter.mb_get_step, livePtr)
  }

  /** VisualShaderNodeIntParameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeIntParameter.mb_set_default_value_enabled == null) gdext.classes.VisualShaderNodeIntParameter.mb_set_default_value_enabled = MethodBind.get("VisualShaderNodeIntParameter", "set_default_value_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeIntParameter.mb_set_default_value_enabled, livePtr, enabled)
  }

  /** VisualShaderNodeIntParameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean = {
    if (gdext.classes.VisualShaderNodeIntParameter.mb_is_default_value_enabled == null) gdext.classes.VisualShaderNodeIntParameter.mb_is_default_value_enabled = MethodBind.get("VisualShaderNodeIntParameter", "is_default_value_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeIntParameter.mb_is_default_value_enabled, livePtr)
  }

  /** VisualShaderNodeIntParameter.set_default_value */
  final def setDefaultValue(value: Long): Unit = {
    if (gdext.classes.VisualShaderNodeIntParameter.mb_set_default_value == null) gdext.classes.VisualShaderNodeIntParameter.mb_set_default_value = MethodBind.get("VisualShaderNodeIntParameter", "set_default_value", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeIntParameter.mb_set_default_value, livePtr, value)
  }

  /** VisualShaderNodeIntParameter.get_default_value */
  final def getDefaultValue(): Long = {
    if (gdext.classes.VisualShaderNodeIntParameter.mb_get_default_value == null) gdext.classes.VisualShaderNodeIntParameter.mb_get_default_value = MethodBind.get("VisualShaderNodeIntParameter", "get_default_value", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeIntParameter.mb_get_default_value, livePtr)
  }

}

object VisualShaderNodeIntParameter {
  private[classes] var mb_set_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_value: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeIntParameter.Hint`. */
  opaque type Hint <: Long = Long

  object Hint {
    final val None: Hint = 0L.asInstanceOf[Hint]
    final val Range: Hint = 1L.asInstanceOf[Hint]
    final val RangeStep: Hint = 2L.asInstanceOf[Hint]
    final val Enum: Hint = 3L.asInstanceOf[Hint]
    final val Max: Hint = 4L.asInstanceOf[Hint]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Hint = value.asInstanceOf[Hint]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Hint] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[Hint]]

    extension (self: Hint)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Range"
        case 2L => "RangeStep"
        case 3L => "Enum"
        case 4L => "Max"
        case other => other.toString
      }
  }
}
