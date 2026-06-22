package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `DirectionalLight2D`, extends `Light2D`. */
abstract class DirectionalLight2D extends Light2D {

  /** DirectionalLight2D.set_max_distance */
  final def setMaxDistance(pixels: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("DirectionalLight2D", "set_max_distance", 373806689L), hostObject.objectPtr, pixels)

  /** DirectionalLight2D.get_max_distance */
  final def getMaxDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("DirectionalLight2D", "get_max_distance", 1740695150L), hostObject.objectPtr)

}

object DirectionalLight2D {
  /** Class metadata for Gd[DirectionalLight2D] lifetime management and casting. */
  given GodotClass[DirectionalLight2D] with {
    def className = "DirectionalLight2D"
    def isRefCounted = false
    def wrap(o: GodotObject): DirectionalLight2D = new DirectionalLight2D {}.withHost(o.objectPtr)
    def unwrap(t: DirectionalLight2D): GodotObject = t.hostObject
  }
}
