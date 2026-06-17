package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `GodotInstance`, extends `Object`. */
abstract class GodotInstance extends Object {

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

object GodotInstance {
  /** Class metadata for Gd[GodotInstance] lifetime management and casting. */
  given GodotClass[GodotInstance] with {
    def className = "GodotInstance"
    def isRefCounted = false
    def wrap(o: GodotObject): GodotInstance = new GodotInstance {}.withHost(o.objectPtr)
    def unwrap(t: GodotInstance): GodotObject = t.hostObject
  }
}
