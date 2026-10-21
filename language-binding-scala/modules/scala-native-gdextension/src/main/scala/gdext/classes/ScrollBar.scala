package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ScrollBar`, extends `Range`. */
abstract class ScrollBar extends Range {
  override def godotClassName: String = "ScrollBar"

  /** ScrollBar.set_custom_step */
  final def setCustomStep(step: Double): Unit = {
    if (gdext.classes.ScrollBar.mb_set_custom_step == null) gdext.classes.ScrollBar.mb_set_custom_step = MethodBind.get("ScrollBar", "set_custom_step", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ScrollBar.mb_set_custom_step, livePtr, step)
  }

  /** ScrollBar.get_custom_step */
  final def getCustomStep(): Double = {
    if (gdext.classes.ScrollBar.mb_get_custom_step == null) gdext.classes.ScrollBar.mb_get_custom_step = MethodBind.get("ScrollBar", "get_custom_step", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ScrollBar.mb_get_custom_step, livePtr)
  }

}

object ScrollBar {
  private[classes] var mb_set_custom_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_step: GDExtensionMethodBindPtr = null
}
