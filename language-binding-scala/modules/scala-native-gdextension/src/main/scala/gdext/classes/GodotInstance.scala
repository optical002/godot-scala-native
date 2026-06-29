package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GodotInstance`, extends `Object`. */
abstract class GodotInstance extends Object {
  override def godotClassName: String = "GodotInstance"

  /** GodotInstance.start */
  final def start(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GodotInstance", "start", 2240911060L), hostObject.objectPtr)

  /** GodotInstance.is_started */
  final def isStarted(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GodotInstance", "is_started", 2240911060L), hostObject.objectPtr)

  /** GodotInstance.iteration */
  final def iteration(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GodotInstance", "iteration", 2240911060L), hostObject.objectPtr)

  /** GodotInstance.focus_in */
  final def focusIn(): Unit =
    Ptrcall.callVoid0(MethodBind.get("GodotInstance", "focus_in", 3218959716L), hostObject.objectPtr)

  /** GodotInstance.focus_out */
  final def focusOut(): Unit =
    Ptrcall.callVoid0(MethodBind.get("GodotInstance", "focus_out", 3218959716L), hostObject.objectPtr)

  /** GodotInstance.pause */
  final def pause(): Unit =
    Ptrcall.callVoid0(MethodBind.get("GodotInstance", "pause", 3218959716L), hostObject.objectPtr)

  /** GodotInstance.resume */
  final def resume(): Unit =
    Ptrcall.callVoid0(MethodBind.get("GodotInstance", "resume", 3218959716L), hostObject.objectPtr)

}
