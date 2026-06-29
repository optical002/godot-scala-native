package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CircleShape2D`, extends `Shape2D`. */
abstract class CircleShape2D extends Shape2D {
  override def godotClassName: String = "CircleShape2D"

  /** CircleShape2D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CircleShape2D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** CircleShape2D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CircleShape2D", "get_radius", 1740695150L), hostObject.objectPtr)

}
