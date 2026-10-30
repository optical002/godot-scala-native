package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRActionSet`, extends `Resource`. */
abstract class OpenXRActionSet extends Resource {
  override def godotClassName: String = "OpenXRActionSet"

  /** OpenXRActionSet.set_localized_name */
  final def setLocalizedName(localizedName: String): Unit = {
    if (gdext.classes.OpenXRActionSet.mb_set_localized_name == null) gdext.classes.OpenXRActionSet.mb_set_localized_name = MethodBind.get("OpenXRActionSet", "set_localized_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.OpenXRActionSet.mb_set_localized_name, livePtr, localizedName)
  }

  /** OpenXRActionSet.get_localized_name */
  final def getLocalizedName(): String = {
    if (gdext.classes.OpenXRActionSet.mb_get_localized_name == null) gdext.classes.OpenXRActionSet.mb_get_localized_name = MethodBind.get("OpenXRActionSet", "get_localized_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.OpenXRActionSet.mb_get_localized_name, livePtr)
  }

  /** OpenXRActionSet.set_priority */
  final def setPriority(priority: Long): Unit = {
    if (gdext.classes.OpenXRActionSet.mb_set_priority == null) gdext.classes.OpenXRActionSet.mb_set_priority = MethodBind.get("OpenXRActionSet", "set_priority", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OpenXRActionSet.mb_set_priority, livePtr, priority)
  }

  /** OpenXRActionSet.get_priority */
  final def getPriority(): Long = {
    if (gdext.classes.OpenXRActionSet.mb_get_priority == null) gdext.classes.OpenXRActionSet.mb_get_priority = MethodBind.get("OpenXRActionSet", "get_priority", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OpenXRActionSet.mb_get_priority, livePtr)
  }

  /** OpenXRActionSet.get_action_count */
  final def getActionCount(): Long = {
    if (gdext.classes.OpenXRActionSet.mb_get_action_count == null) gdext.classes.OpenXRActionSet.mb_get_action_count = MethodBind.get("OpenXRActionSet", "get_action_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OpenXRActionSet.mb_get_action_count, livePtr)
  }

  /** OpenXRActionSet.add_action */
  final def addAction(action: OpenXRAction): Unit = {
    if (gdext.classes.OpenXRActionSet.mb_add_action == null) gdext.classes.OpenXRActionSet.mb_add_action = MethodBind.get("OpenXRActionSet", "add_action", 349361333L)
    Ptrcall.callVoid1(gdext.classes.OpenXRActionSet.mb_add_action, livePtr, Wrappers.handle(action))
  }

  /** OpenXRActionSet.remove_action */
  final def removeAction(action: OpenXRAction): Unit = {
    if (gdext.classes.OpenXRActionSet.mb_remove_action == null) gdext.classes.OpenXRActionSet.mb_remove_action = MethodBind.get("OpenXRActionSet", "remove_action", 349361333L)
    Ptrcall.callVoid1(gdext.classes.OpenXRActionSet.mb_remove_action, livePtr, Wrappers.handle(action))
  }

}

object OpenXRActionSet {
  private[classes] var mb_set_localized_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_localized_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_action_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_action: GDExtensionMethodBindPtr = null
}
