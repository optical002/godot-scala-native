package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `World2D`, extends `Resource`. */
abstract class World2D extends Resource {

  /** World2D.get_direct_space_state */
  final def getDirectSpaceState(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("World2D", "get_direct_space_state", 2506717822L), hostObject.objectPtr)

}

object World2D {
  /** Class metadata for Gd[World2D] lifetime management and casting. */
  given GodotClass[World2D] with {
    def className = "World2D"
    def isRefCounted = true
    def wrap(o: GodotObject): World2D = new World2D {}.withHost(o.objectPtr)
    def unwrap(t: World2D): GodotObject = t.hostObject
  }
}
