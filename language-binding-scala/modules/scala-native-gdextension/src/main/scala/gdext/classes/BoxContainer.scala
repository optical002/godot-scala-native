package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `BoxContainer`, extends `Container`. */
abstract class BoxContainer extends Container {
  override def godotClassName: String = "BoxContainer"

  /** BoxContainer.add_spacer */
  final def addSpacer(begin: Boolean): Control = {
    if (gdext.classes.BoxContainer.mb_add_spacer == null) gdext.classes.BoxContainer.mb_add_spacer = MethodBind.get("BoxContainer", "add_spacer", 1326660695L)
    Wrappers.borrowed[Control](Ptrcall.call1[Boolean, Long](gdext.classes.BoxContainer.mb_add_spacer, livePtr, begin))
  }

  /** BoxContainer.set_alignment */
  final def setAlignment(alignment: gdext.classes.BoxContainer.AlignmentMode): Unit = {
    if (gdext.classes.BoxContainer.mb_set_alignment == null) gdext.classes.BoxContainer.mb_set_alignment = MethodBind.get("BoxContainer", "set_alignment", 2456745134L)
    Ptrcall.callVoid1(gdext.classes.BoxContainer.mb_set_alignment, livePtr, alignment)
  }

  /** BoxContainer.get_alignment */
  final def getAlignment(): gdext.classes.BoxContainer.AlignmentMode = {
    if (gdext.classes.BoxContainer.mb_get_alignment == null) gdext.classes.BoxContainer.mb_get_alignment = MethodBind.get("BoxContainer", "get_alignment", 1915476527L)
    gdext.classes.BoxContainer.AlignmentMode(Ptrcall.call0[Long](gdext.classes.BoxContainer.mb_get_alignment, livePtr))
  }

  /** BoxContainer.set_vertical */
  final def setVertical(vertical: Boolean): Unit = {
    if (gdext.classes.BoxContainer.mb_set_vertical == null) gdext.classes.BoxContainer.mb_set_vertical = MethodBind.get("BoxContainer", "set_vertical", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BoxContainer.mb_set_vertical, livePtr, vertical)
  }

  /** BoxContainer.is_vertical */
  final def isVertical(): Boolean = {
    if (gdext.classes.BoxContainer.mb_is_vertical == null) gdext.classes.BoxContainer.mb_is_vertical = MethodBind.get("BoxContainer", "is_vertical", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BoxContainer.mb_is_vertical, livePtr)
  }

}

object BoxContainer {
  private[classes] var mb_add_spacer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertical: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_vertical: GDExtensionMethodBindPtr = null

  /** Godot enum `BoxContainer.AlignmentMode`. */
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
}
