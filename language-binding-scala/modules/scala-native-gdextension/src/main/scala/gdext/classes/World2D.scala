package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `World2D`, extends `Resource`. */
abstract class World2D extends Resource {
  override def godotClassName: String = "World2D"

  /** World2D.get_direct_space_state */
  final def getDirectSpaceState(): PhysicsDirectSpaceState2D = {
    if (gdext.classes.World2D.mb_get_direct_space_state == null) gdext.classes.World2D.mb_get_direct_space_state = MethodBind.get("World2D", "get_direct_space_state", 2506717822L)
    Wrappers.borrowed[PhysicsDirectSpaceState2D](Ptrcall.call0[Long](gdext.classes.World2D.mb_get_direct_space_state, livePtr))
  }

}

object World2D {
  private[classes] var mb_get_direct_space_state: GDExtensionMethodBindPtr = null
}
