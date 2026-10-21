package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SceneTreeTimer`, extends `RefCounted`. */
abstract class SceneTreeTimer extends RefCounted {
  override def godotClassName: String = "SceneTreeTimer"

  /** SceneTreeTimer.set_time_left */
  final def setTimeLeft(time: Double): Unit = {
    if (gdext.classes.SceneTreeTimer.mb_set_time_left == null) gdext.classes.SceneTreeTimer.mb_set_time_left = MethodBind.get("SceneTreeTimer", "set_time_left", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SceneTreeTimer.mb_set_time_left, livePtr, time)
  }

  /** SceneTreeTimer.get_time_left */
  final def getTimeLeft(): Double = {
    if (gdext.classes.SceneTreeTimer.mb_get_time_left == null) gdext.classes.SceneTreeTimer.mb_get_time_left = MethodBind.get("SceneTreeTimer", "get_time_left", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SceneTreeTimer.mb_get_time_left, livePtr)
  }

}

object SceneTreeTimer {
  private[classes] var mb_set_time_left: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_time_left: GDExtensionMethodBindPtr = null
}
