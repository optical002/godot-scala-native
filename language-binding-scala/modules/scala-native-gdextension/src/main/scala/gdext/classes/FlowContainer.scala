package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `FlowContainer`, extends `Container`. */
abstract class FlowContainer extends Container {
  override def godotClassName: String = "FlowContainer"

  /** FlowContainer.get_line_count */
  final def getLineCount(): Long = {
    if (gdext.classes.FlowContainer.mb_get_line_count == null) gdext.classes.FlowContainer.mb_get_line_count = MethodBind.get("FlowContainer", "get_line_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FlowContainer.mb_get_line_count, livePtr)
  }

  /** FlowContainer.set_alignment */
  final def setAlignment(alignment: gdext.classes.FlowContainer.AlignmentMode): Unit = {
    if (gdext.classes.FlowContainer.mb_set_alignment == null) gdext.classes.FlowContainer.mb_set_alignment = MethodBind.get("FlowContainer", "set_alignment", 575250951L)
    Ptrcall.callVoid1(gdext.classes.FlowContainer.mb_set_alignment, livePtr, alignment)
  }

  /** FlowContainer.get_alignment */
  final def getAlignment(): gdext.classes.FlowContainer.AlignmentMode = {
    if (gdext.classes.FlowContainer.mb_get_alignment == null) gdext.classes.FlowContainer.mb_get_alignment = MethodBind.get("FlowContainer", "get_alignment", 3749743559L)
    gdext.classes.FlowContainer.AlignmentMode(Ptrcall.call0[Long](gdext.classes.FlowContainer.mb_get_alignment, livePtr))
  }

  /** FlowContainer.set_last_wrap_alignment */
  final def setLastWrapAlignment(lastWrapAlignment: gdext.classes.FlowContainer.LastWrapAlignmentMode): Unit = {
    if (gdext.classes.FlowContainer.mb_set_last_wrap_alignment == null) gdext.classes.FlowContainer.mb_set_last_wrap_alignment = MethodBind.get("FlowContainer", "set_last_wrap_alignment", 2899697495L)
    Ptrcall.callVoid1(gdext.classes.FlowContainer.mb_set_last_wrap_alignment, livePtr, lastWrapAlignment)
  }

  /** FlowContainer.get_last_wrap_alignment */
  final def getLastWrapAlignment(): gdext.classes.FlowContainer.LastWrapAlignmentMode = {
    if (gdext.classes.FlowContainer.mb_get_last_wrap_alignment == null) gdext.classes.FlowContainer.mb_get_last_wrap_alignment = MethodBind.get("FlowContainer", "get_last_wrap_alignment", 3743456014L)
    gdext.classes.FlowContainer.LastWrapAlignmentMode(Ptrcall.call0[Long](gdext.classes.FlowContainer.mb_get_last_wrap_alignment, livePtr))
  }

  /** FlowContainer.set_vertical */
  final def setVertical(vertical: Boolean): Unit = {
    if (gdext.classes.FlowContainer.mb_set_vertical == null) gdext.classes.FlowContainer.mb_set_vertical = MethodBind.get("FlowContainer", "set_vertical", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FlowContainer.mb_set_vertical, livePtr, vertical)
  }

  /** FlowContainer.is_vertical */
  final def isVertical(): Boolean = {
    if (gdext.classes.FlowContainer.mb_is_vertical == null) gdext.classes.FlowContainer.mb_is_vertical = MethodBind.get("FlowContainer", "is_vertical", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FlowContainer.mb_is_vertical, livePtr)
  }

  /** FlowContainer.set_reverse_fill */
  final def setReverseFill(reverseFill: Boolean): Unit = {
    if (gdext.classes.FlowContainer.mb_set_reverse_fill == null) gdext.classes.FlowContainer.mb_set_reverse_fill = MethodBind.get("FlowContainer", "set_reverse_fill", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FlowContainer.mb_set_reverse_fill, livePtr, reverseFill)
  }

  /** FlowContainer.is_reverse_fill */
  final def isReverseFill(): Boolean = {
    if (gdext.classes.FlowContainer.mb_is_reverse_fill == null) gdext.classes.FlowContainer.mb_is_reverse_fill = MethodBind.get("FlowContainer", "is_reverse_fill", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FlowContainer.mb_is_reverse_fill, livePtr)
  }

}

object FlowContainer {
  private[classes] var mb_get_line_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_last_wrap_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_last_wrap_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertical: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_vertical: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reverse_fill: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_reverse_fill: GDExtensionMethodBindPtr = null

  /** Godot enum `FlowContainer.AlignmentMode`. */
  opaque type AlignmentMode <: Long = Long

  object AlignmentMode {
    final val Begin: AlignmentMode = 0L.asInstanceOf[AlignmentMode]
    final val Center: AlignmentMode = 1L.asInstanceOf[AlignmentMode]
    final val End: AlignmentMode = 2L.asInstanceOf[AlignmentMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AlignmentMode = value.asInstanceOf[AlignmentMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AlignmentMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[AlignmentMode]]

    extension (self: AlignmentMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Begin"
        case 1L => "Center"
        case 2L => "End"
        case other => other.toString
      }
  }

  /** Godot enum `FlowContainer.LastWrapAlignmentMode`. */
  opaque type LastWrapAlignmentMode <: Long = Long

  object LastWrapAlignmentMode {
    final val Inherit: LastWrapAlignmentMode = 0L.asInstanceOf[LastWrapAlignmentMode]
    final val Begin: LastWrapAlignmentMode = 1L.asInstanceOf[LastWrapAlignmentMode]
    final val Center: LastWrapAlignmentMode = 2L.asInstanceOf[LastWrapAlignmentMode]
    final val End: LastWrapAlignmentMode = 3L.asInstanceOf[LastWrapAlignmentMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LastWrapAlignmentMode = value.asInstanceOf[LastWrapAlignmentMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LastWrapAlignmentMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[LastWrapAlignmentMode]]

    extension (self: LastWrapAlignmentMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Inherit"
        case 1L => "Begin"
        case 2L => "Center"
        case 3L => "End"
        case other => other.toString
      }
  }
}
