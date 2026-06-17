package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `InputMap`, extends `Object`. */
abstract class InputMap extends Object {

  /** InputMap.has_action */
  final def hasAction(action: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("InputMap", "has_action", 2619796661L), hostObject.objectPtr, action)

  /** InputMap.add_action */
  final def addAction(action: io.github.optical002.godot.builtin.StringName, deadzone: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("InputMap", "add_action", 1195233573L), hostObject.objectPtr, action, deadzone)

  /** InputMap.erase_action */
  final def eraseAction(action: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputMap", "erase_action", 3304788590L), hostObject.objectPtr, action)

  /** InputMap.get_action_description */
  final def getActionDescription(action: io.github.optical002.godot.builtin.StringName): String =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, String](MethodBind.get("InputMap", "get_action_description", 957595536L), hostObject.objectPtr, action)

  /** InputMap.action_set_deadzone */
  final def actionSetDeadzone(action: io.github.optical002.godot.builtin.StringName, deadzone: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("InputMap", "action_set_deadzone", 4135858297L), hostObject.objectPtr, action, deadzone)

  /** InputMap.action_get_deadzone */
  final def actionGetDeadzone(action: io.github.optical002.godot.builtin.StringName): Double =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Double](MethodBind.get("InputMap", "action_get_deadzone", 1391627649L), hostObject.objectPtr, action)

  /** InputMap.action_add_event */
  final def actionAddEvent(action: io.github.optical002.godot.builtin.StringName, event: InputEvent): Unit =
    Ptrcall.callVoid2(MethodBind.get("InputMap", "action_add_event", 518302593L), hostObject.objectPtr, action, event.hostObject)

  /** InputMap.action_has_event */
  final def actionHasEvent(action: io.github.optical002.godot.builtin.StringName, event: InputEvent): Boolean =
    Ptrcall.call2[io.github.optical002.godot.builtin.StringName, GodotObject, Boolean](MethodBind.get("InputMap", "action_has_event", 1185871985L), hostObject.objectPtr, action, event.hostObject)

  /** InputMap.action_erase_event */
  final def actionEraseEvent(action: io.github.optical002.godot.builtin.StringName, event: InputEvent): Unit =
    Ptrcall.callVoid2(MethodBind.get("InputMap", "action_erase_event", 518302593L), hostObject.objectPtr, action, event.hostObject)

  /** InputMap.action_erase_events */
  final def actionEraseEvents(action: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputMap", "action_erase_events", 3304788590L), hostObject.objectPtr, action)

  /** InputMap.event_is_action */
  final def eventIsAction(event: InputEvent, action: io.github.optical002.godot.builtin.StringName, exact_match: Boolean): Boolean =
    Ptrcall.call3[GodotObject, io.github.optical002.godot.builtin.StringName, Boolean, Boolean](MethodBind.get("InputMap", "event_is_action", 3193353650L), hostObject.objectPtr, event.hostObject, action, exact_match)

  /** InputMap.load_from_project_settings */
  final def loadFromProjectSettings(): Unit =
    Ptrcall.callVoid0(MethodBind.get("InputMap", "load_from_project_settings", 3218959716L), hostObject.objectPtr)

}

object InputMap {
  /** Class metadata for Gd[InputMap] lifetime management and casting. */
  given GodotClass[InputMap] with {
    def className = "InputMap"
    def isRefCounted = false
    def wrap(o: GodotObject): InputMap = new InputMap {}.withHost(o.objectPtr)
    def unwrap(t: InputMap): GodotObject = t.hostObject
  }

  /** The process-global InputMap singleton instance. */
  def singleton: InputMap = new InputMap {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("InputMap").ptr))
}
