package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationNode`, extends `Resource`. */
abstract class AnimationNode extends Resource {
  override def godotClassName: String = "AnimationNode"

  /** AnimationNode.add_input */
  final def addInput(name: String): Boolean = {
    if (gdext.classes.AnimationNode.mb_add_input == null) gdext.classes.AnimationNode.mb_add_input = MethodBind.get("AnimationNode", "add_input", 2323990056L)
    Ptrcall.call1[String, Boolean](gdext.classes.AnimationNode.mb_add_input, livePtr, name)
  }

  /** AnimationNode.remove_input */
  final def removeInput(index: Long): Unit = {
    if (gdext.classes.AnimationNode.mb_remove_input == null) gdext.classes.AnimationNode.mb_remove_input = MethodBind.get("AnimationNode", "remove_input", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AnimationNode.mb_remove_input, livePtr, index)
  }

  /** AnimationNode.set_input_name */
  final def setInputName(input: Long, name: String): Boolean = {
    if (gdext.classes.AnimationNode.mb_set_input_name == null) gdext.classes.AnimationNode.mb_set_input_name = MethodBind.get("AnimationNode", "set_input_name", 215573526L)
    Ptrcall.call2[Long, String, Boolean](gdext.classes.AnimationNode.mb_set_input_name, livePtr, input, name)
  }

  /** AnimationNode.get_input_name */
  final def getInputName(input: Long): String = {
    if (gdext.classes.AnimationNode.mb_get_input_name == null) gdext.classes.AnimationNode.mb_get_input_name = MethodBind.get("AnimationNode", "get_input_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.AnimationNode.mb_get_input_name, livePtr, input)
  }

  /** AnimationNode.get_input_count */
  final def getInputCount(): Long = {
    if (gdext.classes.AnimationNode.mb_get_input_count == null) gdext.classes.AnimationNode.mb_get_input_count = MethodBind.get("AnimationNode", "get_input_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AnimationNode.mb_get_input_count, livePtr)
  }

  /** AnimationNode.find_input */
  final def findInput(name: String): Long = {
    if (gdext.classes.AnimationNode.mb_find_input == null) gdext.classes.AnimationNode.mb_find_input = MethodBind.get("AnimationNode", "find_input", 1321353865L)
    Ptrcall.call1[String, Long](gdext.classes.AnimationNode.mb_find_input, livePtr, name)
  }

  /** AnimationNode.set_filter_enabled */
  final def setFilterEnabled(enable: Boolean): Unit = {
    if (gdext.classes.AnimationNode.mb_set_filter_enabled == null) gdext.classes.AnimationNode.mb_set_filter_enabled = MethodBind.get("AnimationNode", "set_filter_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNode.mb_set_filter_enabled, livePtr, enable)
  }

  /** AnimationNode.is_filter_enabled */
  final def isFilterEnabled(): Boolean = {
    if (gdext.classes.AnimationNode.mb_is_filter_enabled == null) gdext.classes.AnimationNode.mb_is_filter_enabled = MethodBind.get("AnimationNode", "is_filter_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNode.mb_is_filter_enabled, livePtr)
  }

  /** AnimationNode.get_processing_animation_tree_instance_id */
  final def getProcessingAnimationTreeInstanceId(): Long = {
    if (gdext.classes.AnimationNode.mb_get_processing_animation_tree_instance_id == null) gdext.classes.AnimationNode.mb_get_processing_animation_tree_instance_id = MethodBind.get("AnimationNode", "get_processing_animation_tree_instance_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AnimationNode.mb_get_processing_animation_tree_instance_id, livePtr)
  }

  /** AnimationNode.is_process_testing */
  final def isProcessTesting(): Boolean = {
    if (gdext.classes.AnimationNode.mb_is_process_testing == null) gdext.classes.AnimationNode.mb_is_process_testing = MethodBind.get("AnimationNode", "is_process_testing", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNode.mb_is_process_testing, livePtr)
  }

}

object AnimationNode {
  private[classes] var mb_add_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_input_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_filter_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_filter_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_processing_animation_tree_instance_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_process_testing: GDExtensionMethodBindPtr = null

  /** Godot enum `AnimationNode.FilterAction`. */
  opaque type FilterAction <: Long = Long

  object FilterAction {
    final val Ignore: FilterAction = 0L.asInstanceOf[FilterAction]
    final val Pass: FilterAction = 1L.asInstanceOf[FilterAction]
    final val Stop: FilterAction = 2L.asInstanceOf[FilterAction]
    final val Blend: FilterAction = 3L.asInstanceOf[FilterAction]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FilterAction = value.asInstanceOf[FilterAction]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FilterAction] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[FilterAction]]

    extension (self: FilterAction)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Ignore"
        case 1L => "Pass"
        case 2L => "Stop"
        case 3L => "Blend"
        case other => other.toString
      }
  }
}
