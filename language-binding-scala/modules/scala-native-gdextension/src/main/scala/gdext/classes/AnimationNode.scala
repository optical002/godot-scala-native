package gdext.classes

import gdext.Godot
import gdext.builtin.*
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
}
