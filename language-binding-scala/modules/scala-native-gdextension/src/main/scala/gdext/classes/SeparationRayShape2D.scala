package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SeparationRayShape2D`, extends `Shape2D`. */
abstract class SeparationRayShape2D extends Shape2D {
  override def godotClassName: String = "SeparationRayShape2D"

  /** SeparationRayShape2D.set_length */
  final def setLength(length: Double): Unit = {
    if (gdext.classes.SeparationRayShape2D.mb_set_length == null) gdext.classes.SeparationRayShape2D.mb_set_length = MethodBind.get("SeparationRayShape2D", "set_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SeparationRayShape2D.mb_set_length, livePtr, length)
  }

  /** SeparationRayShape2D.get_length */
  final def getLength(): Double = {
    if (gdext.classes.SeparationRayShape2D.mb_get_length == null) gdext.classes.SeparationRayShape2D.mb_get_length = MethodBind.get("SeparationRayShape2D", "get_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SeparationRayShape2D.mb_get_length, livePtr)
  }

  /** SeparationRayShape2D.set_slide_on_slope */
  final def setSlideOnSlope(active: Boolean): Unit = {
    if (gdext.classes.SeparationRayShape2D.mb_set_slide_on_slope == null) gdext.classes.SeparationRayShape2D.mb_set_slide_on_slope = MethodBind.get("SeparationRayShape2D", "set_slide_on_slope", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SeparationRayShape2D.mb_set_slide_on_slope, livePtr, active)
  }

  /** SeparationRayShape2D.get_slide_on_slope */
  final def getSlideOnSlope(): Boolean = {
    if (gdext.classes.SeparationRayShape2D.mb_get_slide_on_slope == null) gdext.classes.SeparationRayShape2D.mb_get_slide_on_slope = MethodBind.get("SeparationRayShape2D", "get_slide_on_slope", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SeparationRayShape2D.mb_get_slide_on_slope, livePtr)
  }

}

object SeparationRayShape2D {
  private[classes] var mb_set_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_slide_on_slope: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_slide_on_slope: GDExtensionMethodBindPtr = null
}
