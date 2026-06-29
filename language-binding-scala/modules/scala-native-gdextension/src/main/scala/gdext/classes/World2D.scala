package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `World2D`, extends `Resource`. */
abstract class World2D extends Resource {
  override def godotClassName: String = "World2D"

  /** World2D.get_direct_space_state */
  final def getDirectSpaceState(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("World2D", "get_direct_space_state", 2506717822L), hostObject.objectPtr)

}
