package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AspectRatioContainer`, extends `Container`. */
abstract class AspectRatioContainer extends Container {
  override def godotClassName: String = "AspectRatioContainer"

  /** AspectRatioContainer.set_ratio */
  final def setRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AspectRatioContainer", "set_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** AspectRatioContainer.get_ratio */
  final def getRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("AspectRatioContainer", "get_ratio", 1740695150L), hostObject.objectPtr)

  /** AspectRatioContainer.set_stretch_mode */
  final def setStretchMode(stretch_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AspectRatioContainer", "set_stretch_mode", 1876743467L), hostObject.objectPtr, stretch_mode)

  /** AspectRatioContainer.get_stretch_mode */
  final def getStretchMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("AspectRatioContainer", "get_stretch_mode", 3416449033L), hostObject.objectPtr)

  /** AspectRatioContainer.set_alignment_horizontal */
  final def setAlignmentHorizontal(alignment_horizontal: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AspectRatioContainer", "set_alignment_horizontal", 2147829016L), hostObject.objectPtr, alignment_horizontal)

  /** AspectRatioContainer.get_alignment_horizontal */
  final def getAlignmentHorizontal(): Long =
    Ptrcall.call0[Long](MethodBind.get("AspectRatioContainer", "get_alignment_horizontal", 3838875429L), hostObject.objectPtr)

  /** AspectRatioContainer.set_alignment_vertical */
  final def setAlignmentVertical(alignment_vertical: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AspectRatioContainer", "set_alignment_vertical", 2147829016L), hostObject.objectPtr, alignment_vertical)

  /** AspectRatioContainer.get_alignment_vertical */
  final def getAlignmentVertical(): Long =
    Ptrcall.call0[Long](MethodBind.get("AspectRatioContainer", "get_alignment_vertical", 3838875429L), hostObject.objectPtr)

}
