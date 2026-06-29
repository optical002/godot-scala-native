package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `DirectionalLight2D`, extends `Light2D`. */
abstract class DirectionalLight2D extends Light2D {
  override def godotClassName: String = "DirectionalLight2D"

  /** DirectionalLight2D.set_max_distance */
  final def setMaxDistance(pixels: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("DirectionalLight2D", "set_max_distance", 373806689L), hostObject.objectPtr, pixels)

  /** DirectionalLight2D.get_max_distance */
  final def getMaxDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("DirectionalLight2D", "get_max_distance", 1740695150L), hostObject.objectPtr)

}
