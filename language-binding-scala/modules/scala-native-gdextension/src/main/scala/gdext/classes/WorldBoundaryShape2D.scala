package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `WorldBoundaryShape2D`, extends `Shape2D`. */
abstract class WorldBoundaryShape2D extends Shape2D {

  /** WorldBoundaryShape2D.set_normal */
  final def setNormal(normal: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("WorldBoundaryShape2D", "set_normal", 743155724L), hostObject.objectPtr, normal)

  /** WorldBoundaryShape2D.get_normal */
  final def getNormal(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("WorldBoundaryShape2D", "get_normal", 3341600327L), hostObject.objectPtr)

  /** WorldBoundaryShape2D.set_distance */
  final def setDistance(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("WorldBoundaryShape2D", "set_distance", 373806689L), hostObject.objectPtr, distance)

  /** WorldBoundaryShape2D.get_distance */
  final def getDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("WorldBoundaryShape2D", "get_distance", 1740695150L), hostObject.objectPtr)

}

object WorldBoundaryShape2D {
  /** Class metadata for Gd[WorldBoundaryShape2D] lifetime management and casting. */
  given GodotClass[WorldBoundaryShape2D] with {
    def className = "WorldBoundaryShape2D"
    def isRefCounted = true
    def wrap(o: GodotObject): WorldBoundaryShape2D = new WorldBoundaryShape2D {}.withHost(o.objectPtr)
    def unwrap(t: WorldBoundaryShape2D): GodotObject = t.hostObject
  }
}
