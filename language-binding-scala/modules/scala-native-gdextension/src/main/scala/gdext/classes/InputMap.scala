package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputMap`, extends `Object`. */
abstract class InputMap extends Object {
  override def godotClassName: String = "InputMap"

  /** InputMap.has_action */
  final def hasAction(action: String): Boolean = {
    if (gdext.classes.InputMap.mb_has_action == null) gdext.classes.InputMap.mb_has_action = MethodBind.get("InputMap", "has_action", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.InputMap.mb_has_action, livePtr, SnArg(action))
  }

  /** InputMap.add_action */
  final def addAction(action: String, deadzone: Double = 0.2): Unit = {
    if (gdext.classes.InputMap.mb_add_action == null) gdext.classes.InputMap.mb_add_action = MethodBind.get("InputMap", "add_action", 1195233573L)
    Ptrcall.callVoid2(gdext.classes.InputMap.mb_add_action, livePtr, SnArg(action), deadzone)
  }

  /** InputMap.erase_action */
  final def eraseAction(action: String): Unit = {
    if (gdext.classes.InputMap.mb_erase_action == null) gdext.classes.InputMap.mb_erase_action = MethodBind.get("InputMap", "erase_action", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.InputMap.mb_erase_action, livePtr, SnArg(action))
  }

  /** InputMap.get_action_description */
  final def getActionDescription(action: String): String = {
    if (gdext.classes.InputMap.mb_get_action_description == null) gdext.classes.InputMap.mb_get_action_description = MethodBind.get("InputMap", "get_action_description", 957595536L)
    Ptrcall.call1[SnArg, String](gdext.classes.InputMap.mb_get_action_description, livePtr, SnArg(action))
  }

  /** InputMap.action_set_deadzone */
  final def actionSetDeadzone(action: String, deadzone: Double): Unit = {
    if (gdext.classes.InputMap.mb_action_set_deadzone == null) gdext.classes.InputMap.mb_action_set_deadzone = MethodBind.get("InputMap", "action_set_deadzone", 4135858297L)
    Ptrcall.callVoid2(gdext.classes.InputMap.mb_action_set_deadzone, livePtr, SnArg(action), deadzone)
  }

  /** InputMap.action_get_deadzone */
  final def actionGetDeadzone(action: String): Double = {
    if (gdext.classes.InputMap.mb_action_get_deadzone == null) gdext.classes.InputMap.mb_action_get_deadzone = MethodBind.get("InputMap", "action_get_deadzone", 1391627649L)
    Ptrcall.call1[SnArg, Double](gdext.classes.InputMap.mb_action_get_deadzone, livePtr, SnArg(action))
  }

  /** InputMap.action_add_event */
  final def actionAddEvent(action: String, event: InputEvent): Unit = {
    if (gdext.classes.InputMap.mb_action_add_event == null) gdext.classes.InputMap.mb_action_add_event = MethodBind.get("InputMap", "action_add_event", 518302593L)
    Ptrcall.callVoid2(gdext.classes.InputMap.mb_action_add_event, livePtr, SnArg(action), Wrappers.handle(event))
  }

  /** InputMap.action_has_event */
  final def actionHasEvent(action: String, event: InputEvent): Boolean = {
    if (gdext.classes.InputMap.mb_action_has_event == null) gdext.classes.InputMap.mb_action_has_event = MethodBind.get("InputMap", "action_has_event", 1185871985L)
    Ptrcall.call2[SnArg, GodotObject, Boolean](gdext.classes.InputMap.mb_action_has_event, livePtr, SnArg(action), Wrappers.handle(event))
  }

  /** InputMap.action_erase_event */
  final def actionEraseEvent(action: String, event: InputEvent): Unit = {
    if (gdext.classes.InputMap.mb_action_erase_event == null) gdext.classes.InputMap.mb_action_erase_event = MethodBind.get("InputMap", "action_erase_event", 518302593L)
    Ptrcall.callVoid2(gdext.classes.InputMap.mb_action_erase_event, livePtr, SnArg(action), Wrappers.handle(event))
  }

  /** InputMap.action_erase_events */
  final def actionEraseEvents(action: String): Unit = {
    if (gdext.classes.InputMap.mb_action_erase_events == null) gdext.classes.InputMap.mb_action_erase_events = MethodBind.get("InputMap", "action_erase_events", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.InputMap.mb_action_erase_events, livePtr, SnArg(action))
  }

  /** InputMap.event_is_action */
  final def eventIsAction(event: InputEvent, action: String, exactMatch: Boolean = false): Boolean = {
    if (gdext.classes.InputMap.mb_event_is_action == null) gdext.classes.InputMap.mb_event_is_action = MethodBind.get("InputMap", "event_is_action", 3193353650L)
    Ptrcall.call3[GodotObject, SnArg, Boolean, Boolean](gdext.classes.InputMap.mb_event_is_action, livePtr, Wrappers.handle(event), SnArg(action), exactMatch)
  }

  /** InputMap.load_from_project_settings */
  final def loadFromProjectSettings(): Unit = {
    if (gdext.classes.InputMap.mb_load_from_project_settings == null) gdext.classes.InputMap.mb_load_from_project_settings = MethodBind.get("InputMap", "load_from_project_settings", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.InputMap.mb_load_from_project_settings, livePtr)
  }

}

object InputMap {
  private[classes] var mb_has_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_erase_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_action_description: GDExtensionMethodBindPtr = null
  private[classes] var mb_action_set_deadzone: GDExtensionMethodBindPtr = null
  private[classes] var mb_action_get_deadzone: GDExtensionMethodBindPtr = null
  private[classes] var mb_action_add_event: GDExtensionMethodBindPtr = null
  private[classes] var mb_action_has_event: GDExtensionMethodBindPtr = null
  private[classes] var mb_action_erase_event: GDExtensionMethodBindPtr = null
  private[classes] var mb_action_erase_events: GDExtensionMethodBindPtr = null
  private[classes] var mb_event_is_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_load_from_project_settings: GDExtensionMethodBindPtr = null

  private var instance: InputMap = null

  /** The process-global InputMap singleton instance. */
  def singleton: InputMap = {
    if (instance == null)
      instance = Wrappers.borrowed[InputMap](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("InputMap").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: InputMap.has_action */
  final def hasAction(action: String): Boolean =
    singleton.hasAction(action)

  /** Forwards to [[singleton]]: InputMap.add_action */
  final def addAction(action: String, deadzone: Double = 0.2): Unit =
    singleton.addAction(action, deadzone)

  /** Forwards to [[singleton]]: InputMap.erase_action */
  final def eraseAction(action: String): Unit =
    singleton.eraseAction(action)

  /** Forwards to [[singleton]]: InputMap.get_action_description */
  final def getActionDescription(action: String): String =
    singleton.getActionDescription(action)

  /** Forwards to [[singleton]]: InputMap.action_set_deadzone */
  final def actionSetDeadzone(action: String, deadzone: Double): Unit =
    singleton.actionSetDeadzone(action, deadzone)

  /** Forwards to [[singleton]]: InputMap.action_get_deadzone */
  final def actionGetDeadzone(action: String): Double =
    singleton.actionGetDeadzone(action)

  /** Forwards to [[singleton]]: InputMap.action_add_event */
  final def actionAddEvent(action: String, event: InputEvent): Unit =
    singleton.actionAddEvent(action, event)

  /** Forwards to [[singleton]]: InputMap.action_has_event */
  final def actionHasEvent(action: String, event: InputEvent): Boolean =
    singleton.actionHasEvent(action, event)

  /** Forwards to [[singleton]]: InputMap.action_erase_event */
  final def actionEraseEvent(action: String, event: InputEvent): Unit =
    singleton.actionEraseEvent(action, event)

  /** Forwards to [[singleton]]: InputMap.action_erase_events */
  final def actionEraseEvents(action: String): Unit =
    singleton.actionEraseEvents(action)

  /** Forwards to [[singleton]]: InputMap.event_is_action */
  final def eventIsAction(event: InputEvent, action: String, exactMatch: Boolean = false): Boolean =
    singleton.eventIsAction(event, action, exactMatch)

  /** Forwards to [[singleton]]: InputMap.load_from_project_settings */
  final def loadFromProjectSettings(): Unit =
    singleton.loadFromProjectSettings()
}
