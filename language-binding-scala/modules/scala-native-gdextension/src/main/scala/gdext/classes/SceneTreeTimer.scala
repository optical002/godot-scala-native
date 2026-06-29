package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SceneTreeTimer`, extends `RefCounted`. */
abstract class SceneTreeTimer extends RefCounted {
  override def godotClassName: String = "SceneTreeTimer"

  /** SceneTreeTimer.set_time_left */
  final def setTimeLeft(time: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneTreeTimer", "set_time_left", 373806689L), hostObject.objectPtr, time)

  /** SceneTreeTimer.get_time_left */
  final def getTimeLeft(): Double =
    Ptrcall.call0[Double](MethodBind.get("SceneTreeTimer", "get_time_left", 1740695150L), hostObject.objectPtr)

}
