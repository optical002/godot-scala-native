package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CircleShape2D`, extends `Shape2D`. */
abstract class CircleShape2D extends Shape2D {

  /** CircleShape2D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CircleShape2D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** CircleShape2D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CircleShape2D", "get_radius", 1740695150L), hostObject.objectPtr)

}

object CircleShape2D {
  /** Class metadata for Gd[CircleShape2D] lifetime management and casting. */
  given GodotClass[CircleShape2D] with {
    def className = "CircleShape2D"
    def isRefCounted = true
    def wrap(o: GodotObject): CircleShape2D = new CircleShape2D {}.withHost(o.objectPtr)
    def unwrap(t: CircleShape2D): GodotObject = t.hostObject
  }
}
