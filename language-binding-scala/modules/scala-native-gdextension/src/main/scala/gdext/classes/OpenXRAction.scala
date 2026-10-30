package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRAction`, extends `Resource`. */
abstract class OpenXRAction extends Resource {
  override def godotClassName: String = "OpenXRAction"

  /** OpenXRAction.set_localized_name */
  final def setLocalizedName(localizedName: String): Unit = {
    if (gdext.classes.OpenXRAction.mb_set_localized_name == null) gdext.classes.OpenXRAction.mb_set_localized_name = MethodBind.get("OpenXRAction", "set_localized_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAction.mb_set_localized_name, livePtr, localizedName)
  }

  /** OpenXRAction.get_localized_name */
  final def getLocalizedName(): String = {
    if (gdext.classes.OpenXRAction.mb_get_localized_name == null) gdext.classes.OpenXRAction.mb_get_localized_name = MethodBind.get("OpenXRAction", "get_localized_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.OpenXRAction.mb_get_localized_name, livePtr)
  }

  /** OpenXRAction.set_action_type */
  final def setActionType(actionType: gdext.classes.OpenXRAction.ActionType): Unit = {
    if (gdext.classes.OpenXRAction.mb_set_action_type == null) gdext.classes.OpenXRAction.mb_set_action_type = MethodBind.get("OpenXRAction", "set_action_type", 1675238366L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAction.mb_set_action_type, livePtr, actionType)
  }

  /** OpenXRAction.get_action_type */
  final def getActionType(): gdext.classes.OpenXRAction.ActionType = {
    if (gdext.classes.OpenXRAction.mb_get_action_type == null) gdext.classes.OpenXRAction.mb_get_action_type = MethodBind.get("OpenXRAction", "get_action_type", 3536542431L)
    gdext.classes.OpenXRAction.ActionType(Ptrcall.call0[Long](gdext.classes.OpenXRAction.mb_get_action_type, livePtr))
  }

}

object OpenXRAction {
  private[classes] var mb_set_localized_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_localized_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_action_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_action_type: GDExtensionMethodBindPtr = null

  /** Godot enum `OpenXRAction.ActionType`. */
  opaque type ActionType <: Long = Long

  object ActionType {
    final val Bool: ActionType = 0L.asInstanceOf[ActionType]
    final val Float: ActionType = 1L.asInstanceOf[ActionType]
    final val Vector2: ActionType = 2L.asInstanceOf[ActionType]
    final val Pose: ActionType = 3L.asInstanceOf[ActionType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ActionType = value.asInstanceOf[ActionType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ActionType] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ActionType]]

    extension (self: ActionType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Bool"
        case 1L => "Float"
        case 2L => "Vector2"
        case 3L => "Pose"
        case other => other.toString
      }
  }
}
