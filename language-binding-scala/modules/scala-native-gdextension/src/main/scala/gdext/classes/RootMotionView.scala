package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RootMotionView`, extends `VisualInstance3D`. */
abstract class RootMotionView extends VisualInstance3D {

  /** RootMotionView.set_color */
  final def setColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("RootMotionView", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** RootMotionView.get_color */
  final def getColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("RootMotionView", "get_color", 3444240500L), hostObject.objectPtr)

  /** RootMotionView.set_cell_size */
  final def setCellSize(size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RootMotionView", "set_cell_size", 373806689L), hostObject.objectPtr, size)

  /** RootMotionView.get_cell_size */
  final def getCellSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("RootMotionView", "get_cell_size", 1740695150L), hostObject.objectPtr)

  /** RootMotionView.set_radius */
  final def setRadius(size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RootMotionView", "set_radius", 373806689L), hostObject.objectPtr, size)

  /** RootMotionView.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("RootMotionView", "get_radius", 1740695150L), hostObject.objectPtr)

  /** RootMotionView.set_zero_y */
  final def setZeroY(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RootMotionView", "set_zero_y", 2586408642L), hostObject.objectPtr, enable)

  /** RootMotionView.get_zero_y */
  final def getZeroY(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RootMotionView", "get_zero_y", 36873697L), hostObject.objectPtr)

}

object RootMotionView {
  /** Class metadata for Gd[RootMotionView] lifetime management and casting. */
  given GodotClass[RootMotionView] with {
    def className = "RootMotionView"
    def isRefCounted = false
    def wrap(o: GodotObject): RootMotionView = new RootMotionView {}.withHost(o.objectPtr)
    def unwrap(t: RootMotionView): GodotObject = t.hostObject
  }
}
