package gdext.classes

import gdext.Godot
import gdext.builtin.*
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
  final def setStretchMode(stretch_mode: Long): Unit = {
    if (gdext.classes.AspectRatioContainer.mb_set_stretch_mode == null) gdext.classes.AspectRatioContainer.mb_set_stretch_mode = MethodBind.get("AspectRatioContainer", "set_stretch_mode", 1876743467L)
    Ptrcall.callVoid1(gdext.classes.AspectRatioContainer.mb_set_stretch_mode, livePtr, stretch_mode)
  }

  /** AspectRatioContainer.get_stretch_mode */
  final def getStretchMode(): Long = {
    if (gdext.classes.AspectRatioContainer.mb_get_stretch_mode == null) gdext.classes.AspectRatioContainer.mb_get_stretch_mode = MethodBind.get("AspectRatioContainer", "get_stretch_mode", 3416449033L)
    Ptrcall.call0[Long](gdext.classes.AspectRatioContainer.mb_get_stretch_mode, livePtr)
  }

  /** AspectRatioContainer.set_alignment_horizontal */
  final def setAlignmentHorizontal(alignment_horizontal: Long): Unit = {
    if (gdext.classes.AspectRatioContainer.mb_set_alignment_horizontal == null) gdext.classes.AspectRatioContainer.mb_set_alignment_horizontal = MethodBind.get("AspectRatioContainer", "set_alignment_horizontal", 2147829016L)
    Ptrcall.callVoid1(gdext.classes.AspectRatioContainer.mb_set_alignment_horizontal, livePtr, alignment_horizontal)
  }

  /** AspectRatioContainer.get_alignment_horizontal */
  final def getAlignmentHorizontal(): Long = {
    if (gdext.classes.AspectRatioContainer.mb_get_alignment_horizontal == null) gdext.classes.AspectRatioContainer.mb_get_alignment_horizontal = MethodBind.get("AspectRatioContainer", "get_alignment_horizontal", 3838875429L)
    Ptrcall.call0[Long](gdext.classes.AspectRatioContainer.mb_get_alignment_horizontal, livePtr)
  }

  /** AspectRatioContainer.set_alignment_vertical */
  final def setAlignmentVertical(alignment_vertical: Long): Unit = {
    if (gdext.classes.AspectRatioContainer.mb_set_alignment_vertical == null) gdext.classes.AspectRatioContainer.mb_set_alignment_vertical = MethodBind.get("AspectRatioContainer", "set_alignment_vertical", 2147829016L)
    Ptrcall.callVoid1(gdext.classes.AspectRatioContainer.mb_set_alignment_vertical, livePtr, alignment_vertical)
  }

  /** AspectRatioContainer.get_alignment_vertical */
  final def getAlignmentVertical(): Long = {
    if (gdext.classes.AspectRatioContainer.mb_get_alignment_vertical == null) gdext.classes.AspectRatioContainer.mb_get_alignment_vertical = MethodBind.get("AspectRatioContainer", "get_alignment_vertical", 3838875429L)
    Ptrcall.call0[Long](gdext.classes.AspectRatioContainer.mb_get_alignment_vertical, livePtr)
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
}
