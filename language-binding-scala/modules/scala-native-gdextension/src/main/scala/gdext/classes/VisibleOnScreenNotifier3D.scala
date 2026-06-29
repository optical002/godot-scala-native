package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisibleOnScreenNotifier3D`, extends `VisualInstance3D`. */
abstract class VisibleOnScreenNotifier3D extends VisualInstance3D {
  override def godotClassName: String = "VisibleOnScreenNotifier3D"

  /** VisibleOnScreenNotifier3D.set_aabb */
  final def setAabb(rect: gdext.builtin.AABB): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisibleOnScreenNotifier3D", "set_aabb", 259215842L), hostObject.objectPtr, rect)

  /** VisibleOnScreenNotifier3D.is_on_screen */
  final def isOnScreen(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisibleOnScreenNotifier3D", "is_on_screen", 36873697L), hostObject.objectPtr)

}
