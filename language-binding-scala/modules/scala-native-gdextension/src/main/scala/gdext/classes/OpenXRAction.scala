package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRAction`, extends `Resource`. */
abstract class OpenXRAction extends Resource {
  override def godotClassName: String = "OpenXRAction"

  /** OpenXRAction.set_localized_name */
  final def setLocalizedName(localized_name: String): Unit = {
    if (gdext.classes.OpenXRAction.mb_set_localized_name == null) gdext.classes.OpenXRAction.mb_set_localized_name = MethodBind.get("OpenXRAction", "set_localized_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAction.mb_set_localized_name, livePtr, localized_name)
  }

  /** OpenXRAction.get_localized_name */
  final def getLocalizedName(): String = {
    if (gdext.classes.OpenXRAction.mb_get_localized_name == null) gdext.classes.OpenXRAction.mb_get_localized_name = MethodBind.get("OpenXRAction", "get_localized_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.OpenXRAction.mb_get_localized_name, livePtr)
  }

  /** OpenXRAction.set_action_type */
  final def setActionType(action_type: Long): Unit = {
    if (gdext.classes.OpenXRAction.mb_set_action_type == null) gdext.classes.OpenXRAction.mb_set_action_type = MethodBind.get("OpenXRAction", "set_action_type", 1675238366L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAction.mb_set_action_type, livePtr, action_type)
  }

  /** OpenXRAction.get_action_type */
  final def getActionType(): Long = {
    if (gdext.classes.OpenXRAction.mb_get_action_type == null) gdext.classes.OpenXRAction.mb_get_action_type = MethodBind.get("OpenXRAction", "get_action_type", 3536542431L)
    Ptrcall.call0[Long](gdext.classes.OpenXRAction.mb_get_action_type, livePtr)
  }

}

object OpenXRAction {
  private[classes] var mb_set_localized_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_localized_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_action_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_action_type: GDExtensionMethodBindPtr = null
}
