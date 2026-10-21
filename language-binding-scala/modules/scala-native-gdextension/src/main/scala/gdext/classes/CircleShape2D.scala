package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CircleShape2D`, extends `Shape2D`. */
abstract class CircleShape2D extends Shape2D {
  override def godotClassName: String = "CircleShape2D"

  /** CircleShape2D.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.CircleShape2D.mb_set_radius == null) gdext.classes.CircleShape2D.mb_set_radius = MethodBind.get("CircleShape2D", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CircleShape2D.mb_set_radius, livePtr, radius)
  }

  /** CircleShape2D.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.CircleShape2D.mb_get_radius == null) gdext.classes.CircleShape2D.mb_get_radius = MethodBind.get("CircleShape2D", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CircleShape2D.mb_get_radius, livePtr)
  }

}

object CircleShape2D {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
}
