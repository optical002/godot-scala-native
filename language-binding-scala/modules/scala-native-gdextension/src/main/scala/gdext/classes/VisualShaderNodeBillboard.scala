package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeBillboard`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeBillboard extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeBillboard"

  /** VisualShaderNodeBillboard.set_billboard_type */
  final def setBillboardType(billboardType: gdext.classes.VisualShaderNodeBillboard.BillboardType): Unit = {
    if (gdext.classes.VisualShaderNodeBillboard.mb_set_billboard_type == null) gdext.classes.VisualShaderNodeBillboard.mb_set_billboard_type = MethodBind.get("VisualShaderNodeBillboard", "set_billboard_type", 1227463289L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeBillboard.mb_set_billboard_type, livePtr, billboardType)
  }

  /** VisualShaderNodeBillboard.get_billboard_type */
  final def getBillboardType(): gdext.classes.VisualShaderNodeBillboard.BillboardType = {
    if (gdext.classes.VisualShaderNodeBillboard.mb_get_billboard_type == null) gdext.classes.VisualShaderNodeBillboard.mb_get_billboard_type = MethodBind.get("VisualShaderNodeBillboard", "get_billboard_type", 3724188517L)
    gdext.classes.VisualShaderNodeBillboard.BillboardType(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeBillboard.mb_get_billboard_type, livePtr))
  }

  /** VisualShaderNodeBillboard.set_keep_scale_enabled */
  final def setKeepScaleEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeBillboard.mb_set_keep_scale_enabled == null) gdext.classes.VisualShaderNodeBillboard.mb_set_keep_scale_enabled = MethodBind.get("VisualShaderNodeBillboard", "set_keep_scale_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeBillboard.mb_set_keep_scale_enabled, livePtr, enabled)
  }

  /** VisualShaderNodeBillboard.is_keep_scale_enabled */
  final def isKeepScaleEnabled(): Boolean = {
    if (gdext.classes.VisualShaderNodeBillboard.mb_is_keep_scale_enabled == null) gdext.classes.VisualShaderNodeBillboard.mb_is_keep_scale_enabled = MethodBind.get("VisualShaderNodeBillboard", "is_keep_scale_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeBillboard.mb_is_keep_scale_enabled, livePtr)
  }

}

object VisualShaderNodeBillboard {
  private[classes] var mb_set_billboard_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_billboard_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_keep_scale_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_keep_scale_enabled: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeBillboard.BillboardType`. */
  opaque type BillboardType <: Long = Long

  object BillboardType {
    final val Disabled: BillboardType = 0L.asInstanceOf[BillboardType]
    final val Enabled: BillboardType = 1L.asInstanceOf[BillboardType]
    final val FixedY: BillboardType = 2L.asInstanceOf[BillboardType]
    final val Particles: BillboardType = 3L.asInstanceOf[BillboardType]
    final val Max: BillboardType = 4L.asInstanceOf[BillboardType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BillboardType = value.asInstanceOf[BillboardType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BillboardType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[BillboardType]]

    extension (self: BillboardType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Enabled"
        case 2L => "FixedY"
        case 3L => "Particles"
        case 4L => "Max"
        case other => other.toString
      }
  }
}
