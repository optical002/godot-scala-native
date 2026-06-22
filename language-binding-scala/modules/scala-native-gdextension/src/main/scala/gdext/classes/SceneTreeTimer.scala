package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SceneTreeTimer`, extends `RefCounted`. */
abstract class SceneTreeTimer extends RefCounted {

  /** SceneTreeTimer.set_time_left */
  final def setTimeLeft(time: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SceneTreeTimer", "set_time_left", 373806689L), hostObject.objectPtr, time)

  /** SceneTreeTimer.get_time_left */
  final def getTimeLeft(): Double =
    Ptrcall.call0[Double](MethodBind.get("SceneTreeTimer", "get_time_left", 1740695150L), hostObject.objectPtr)

}

object SceneTreeTimer {
  /** Class metadata for Gd[SceneTreeTimer] lifetime management and casting. */
  given GodotClass[SceneTreeTimer] with {
    def className = "SceneTreeTimer"
    def isRefCounted = true
    def wrap(o: GodotObject): SceneTreeTimer = new SceneTreeTimer {}.withHost(o.objectPtr)
    def unwrap(t: SceneTreeTimer): GodotObject = t.hostObject
  }
}
