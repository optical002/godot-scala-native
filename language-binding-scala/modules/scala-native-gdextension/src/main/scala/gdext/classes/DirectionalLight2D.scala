package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `DirectionalLight2D`, extends `Light2D`. */
abstract class DirectionalLight2D extends Light2D {
  override def godotClassName: String = "DirectionalLight2D"

  /** DirectionalLight2D.set_max_distance */
  final def setMaxDistance(pixels: Double): Unit = {
    if (gdext.classes.DirectionalLight2D.mb_set_max_distance == null) gdext.classes.DirectionalLight2D.mb_set_max_distance = MethodBind.get("DirectionalLight2D", "set_max_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.DirectionalLight2D.mb_set_max_distance, livePtr, pixels)
  }

  /** DirectionalLight2D.get_max_distance */
  final def getMaxDistance(): Double = {
    if (gdext.classes.DirectionalLight2D.mb_get_max_distance == null) gdext.classes.DirectionalLight2D.mb_get_max_distance = MethodBind.get("DirectionalLight2D", "get_max_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.DirectionalLight2D.mb_get_max_distance, livePtr)
  }

}

object DirectionalLight2D {
  private[classes] var mb_set_max_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_distance: GDExtensionMethodBindPtr = null
}
