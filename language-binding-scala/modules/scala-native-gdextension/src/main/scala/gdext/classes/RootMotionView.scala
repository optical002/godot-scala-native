package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RootMotionView`, extends `VisualInstance3D`. */
abstract class RootMotionView extends VisualInstance3D {
  override def godotClassName: String = "RootMotionView"

  /** RootMotionView.set_color */
  final def setColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.RootMotionView.mb_set_color == null) gdext.classes.RootMotionView.mb_set_color = MethodBind.get("RootMotionView", "set_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.RootMotionView.mb_set_color, livePtr, color)
  }

  /** RootMotionView.get_color */
  final def getColor(): gdext.builtin.Color = {
    if (gdext.classes.RootMotionView.mb_get_color == null) gdext.classes.RootMotionView.mb_get_color = MethodBind.get("RootMotionView", "get_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.RootMotionView.mb_get_color, livePtr)
  }

  /** RootMotionView.set_cell_size */
  final def setCellSize(size: Double): Unit = {
    if (gdext.classes.RootMotionView.mb_set_cell_size == null) gdext.classes.RootMotionView.mb_set_cell_size = MethodBind.get("RootMotionView", "set_cell_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RootMotionView.mb_set_cell_size, livePtr, size)
  }

  /** RootMotionView.get_cell_size */
  final def getCellSize(): Double = {
    if (gdext.classes.RootMotionView.mb_get_cell_size == null) gdext.classes.RootMotionView.mb_get_cell_size = MethodBind.get("RootMotionView", "get_cell_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RootMotionView.mb_get_cell_size, livePtr)
  }

  /** RootMotionView.set_radius */
  final def setRadius(size: Double): Unit = {
    if (gdext.classes.RootMotionView.mb_set_radius == null) gdext.classes.RootMotionView.mb_set_radius = MethodBind.get("RootMotionView", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RootMotionView.mb_set_radius, livePtr, size)
  }

  /** RootMotionView.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.RootMotionView.mb_get_radius == null) gdext.classes.RootMotionView.mb_get_radius = MethodBind.get("RootMotionView", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RootMotionView.mb_get_radius, livePtr)
  }

  /** RootMotionView.set_zero_y */
  final def setZeroY(enable: Boolean): Unit = {
    if (gdext.classes.RootMotionView.mb_set_zero_y == null) gdext.classes.RootMotionView.mb_set_zero_y = MethodBind.get("RootMotionView", "set_zero_y", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RootMotionView.mb_set_zero_y, livePtr, enable)
  }

  /** RootMotionView.get_zero_y */
  final def getZeroY(): Boolean = {
    if (gdext.classes.RootMotionView.mb_get_zero_y == null) gdext.classes.RootMotionView.mb_get_zero_y = MethodBind.get("RootMotionView", "get_zero_y", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RootMotionView.mb_get_zero_y, livePtr)
  }

}

object RootMotionView {
  private[classes] var mb_set_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cell_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_zero_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_zero_y: GDExtensionMethodBindPtr = null
}
