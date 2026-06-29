package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNode`, extends `Resource`. */
abstract class AnimationNode extends Resource {
  override def godotClassName: String = "AnimationNode"

  /** AnimationNode.add_input */
  final def addInput(name: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("AnimationNode", "add_input", 2323990056L), hostObject.objectPtr, name)

  /** AnimationNode.remove_input */
  final def removeInput(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNode", "remove_input", 1286410249L), hostObject.objectPtr, index)

  /** AnimationNode.set_input_name */
  final def setInputName(input: Long, name: String): Boolean =
    Ptrcall.call2[Long, String, Boolean](MethodBind.get("AnimationNode", "set_input_name", 215573526L), hostObject.objectPtr, input, name)

  /** AnimationNode.get_input_name */
  final def getInputName(input: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("AnimationNode", "get_input_name", 844755477L), hostObject.objectPtr, input)

  /** AnimationNode.get_input_count */
  final def getInputCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationNode", "get_input_count", 3905245786L), hostObject.objectPtr)

  /** AnimationNode.find_input */
  final def findInput(name: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("AnimationNode", "find_input", 1321353865L), hostObject.objectPtr, name)

  /** AnimationNode.set_filter_enabled */
  final def setFilterEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNode", "set_filter_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** AnimationNode.is_filter_enabled */
  final def isFilterEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNode", "is_filter_enabled", 36873697L), hostObject.objectPtr)

  /** AnimationNode.get_processing_animation_tree_instance_id */
  final def getProcessingAnimationTreeInstanceId(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationNode", "get_processing_animation_tree_instance_id", 3905245786L), hostObject.objectPtr)

  /** AnimationNode.is_process_testing */
  final def isProcessTesting(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNode", "is_process_testing", 36873697L), hostObject.objectPtr)

}
