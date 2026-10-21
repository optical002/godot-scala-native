package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisibleOnScreenNotifier3D`, extends `VisualInstance3D`. */
abstract class VisibleOnScreenNotifier3D extends VisualInstance3D {
  override def godotClassName: String = "VisibleOnScreenNotifier3D"

  /** VisibleOnScreenNotifier3D.set_aabb */
  final def setAabb(rect: gdext.builtin.AABB): Unit = {
    if (gdext.classes.VisibleOnScreenNotifier3D.mb_set_aabb == null) gdext.classes.VisibleOnScreenNotifier3D.mb_set_aabb = MethodBind.get("VisibleOnScreenNotifier3D", "set_aabb", 259215842L)
    Ptrcall.callVoid1(gdext.classes.VisibleOnScreenNotifier3D.mb_set_aabb, livePtr, rect)
  }

  /** VisibleOnScreenNotifier3D.is_on_screen */
  final def isOnScreen(): Boolean = {
    if (gdext.classes.VisibleOnScreenNotifier3D.mb_is_on_screen == null) gdext.classes.VisibleOnScreenNotifier3D.mb_is_on_screen = MethodBind.get("VisibleOnScreenNotifier3D", "is_on_screen", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisibleOnScreenNotifier3D.mb_is_on_screen, livePtr)
  }

}

object VisibleOnScreenNotifier3D {
  private[classes] var mb_set_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_on_screen: GDExtensionMethodBindPtr = null
}
