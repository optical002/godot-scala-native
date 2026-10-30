package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AspectRatioContainer`, extends `Container`. */
abstract class AspectRatioContainer extends Container {
  override def godotClassName: String = "AspectRatioContainer"

  /** AspectRatioContainer.set_ratio */
  final def setRatio(ratio: Double): Unit = {
    if (gdext.classes.AspectRatioContainer.mb_set_ratio == null) gdext.classes.AspectRatioContainer.mb_set_ratio = MethodBind.get("AspectRatioContainer", "set_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AspectRatioContainer.mb_set_ratio, livePtr, ratio)
  }

  /** AspectRatioContainer.get_ratio */
  final def getRatio(): Double = {
    if (gdext.classes.AspectRatioContainer.mb_get_ratio == null) gdext.classes.AspectRatioContainer.mb_get_ratio = MethodBind.get("AspectRatioContainer", "get_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AspectRatioContainer.mb_get_ratio, livePtr)
  }

  /** AspectRatioContainer.set_stretch_mode */
  final def setStretchMode(stretchMode: gdext.classes.AspectRatioContainer.StretchMode): Unit = {
    if (gdext.classes.AspectRatioContainer.mb_set_stretch_mode == null) gdext.classes.AspectRatioContainer.mb_set_stretch_mode = MethodBind.get("AspectRatioContainer", "set_stretch_mode", 1876743467L)
    Ptrcall.callVoid1(gdext.classes.AspectRatioContainer.mb_set_stretch_mode, livePtr, stretchMode)
  }

  /** AspectRatioContainer.get_stretch_mode */
  final def getStretchMode(): gdext.classes.AspectRatioContainer.StretchMode = {
    if (gdext.classes.AspectRatioContainer.mb_get_stretch_mode == null) gdext.classes.AspectRatioContainer.mb_get_stretch_mode = MethodBind.get("AspectRatioContainer", "get_stretch_mode", 3416449033L)
    gdext.classes.AspectRatioContainer.StretchMode(Ptrcall.call0[Long](gdext.classes.AspectRatioContainer.mb_get_stretch_mode, livePtr))
  }

  /** AspectRatioContainer.set_alignment_horizontal */
  final def setAlignmentHorizontal(alignmentHorizontal: gdext.classes.AspectRatioContainer.AlignmentMode): Unit = {
    if (gdext.classes.AspectRatioContainer.mb_set_alignment_horizontal == null) gdext.classes.AspectRatioContainer.mb_set_alignment_horizontal = MethodBind.get("AspectRatioContainer", "set_alignment_horizontal", 2147829016L)
    Ptrcall.callVoid1(gdext.classes.AspectRatioContainer.mb_set_alignment_horizontal, livePtr, alignmentHorizontal)
  }

  /** AspectRatioContainer.get_alignment_horizontal */
  final def getAlignmentHorizontal(): gdext.classes.AspectRatioContainer.AlignmentMode = {
    if (gdext.classes.AspectRatioContainer.mb_get_alignment_horizontal == null) gdext.classes.AspectRatioContainer.mb_get_alignment_horizontal = MethodBind.get("AspectRatioContainer", "get_alignment_horizontal", 3838875429L)
    gdext.classes.AspectRatioContainer.AlignmentMode(Ptrcall.call0[Long](gdext.classes.AspectRatioContainer.mb_get_alignment_horizontal, livePtr))
  }

  /** AspectRatioContainer.set_alignment_vertical */
  final def setAlignmentVertical(alignmentVertical: gdext.classes.AspectRatioContainer.AlignmentMode): Unit = {
    if (gdext.classes.AspectRatioContainer.mb_set_alignment_vertical == null) gdext.classes.AspectRatioContainer.mb_set_alignment_vertical = MethodBind.get("AspectRatioContainer", "set_alignment_vertical", 2147829016L)
    Ptrcall.callVoid1(gdext.classes.AspectRatioContainer.mb_set_alignment_vertical, livePtr, alignmentVertical)
  }

  /** AspectRatioContainer.get_alignment_vertical */
  final def getAlignmentVertical(): gdext.classes.AspectRatioContainer.AlignmentMode = {
    if (gdext.classes.AspectRatioContainer.mb_get_alignment_vertical == null) gdext.classes.AspectRatioContainer.mb_get_alignment_vertical = MethodBind.get("AspectRatioContainer", "get_alignment_vertical", 3838875429L)
    gdext.classes.AspectRatioContainer.AlignmentMode(Ptrcall.call0[Long](gdext.classes.AspectRatioContainer.mb_get_alignment_vertical, livePtr))
  }

}

object AspectRatioContainer {
  private[classes] var mb_set_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stretch_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stretch_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alignment_horizontal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alignment_horizontal: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alignment_vertical: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alignment_vertical: GDExtensionMethodBindPtr = null

  /** Godot enum `AspectRatioContainer.StretchMode`. */
  opaque type StretchMode <: Long = Long

  object StretchMode {
    final val WidthControlsHeight: StretchMode = 0L.asInstanceOf[StretchMode]
    final val HeightControlsWidth: StretchMode = 1L.asInstanceOf[StretchMode]
    final val Fit: StretchMode = 2L.asInstanceOf[StretchMode]
    final val Cover: StretchMode = 3L.asInstanceOf[StretchMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): StretchMode = value.asInstanceOf[StretchMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[StretchMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[StretchMode]]

    extension (self: StretchMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "WidthControlsHeight"
        case 1L => "HeightControlsWidth"
        case 2L => "Fit"
        case 3L => "Cover"
        case other => other.toString
      }
  }

  /** Godot enum `AspectRatioContainer.AlignmentMode`. */
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
