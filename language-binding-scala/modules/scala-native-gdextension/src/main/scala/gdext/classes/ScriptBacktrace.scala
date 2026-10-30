package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ScriptBacktrace`, extends `RefCounted`. */
abstract class ScriptBacktrace extends RefCounted {
  override def godotClassName: String = "ScriptBacktrace"

  /** ScriptBacktrace.get_language_name */
  final def getLanguageName(): String = {
    if (gdext.classes.ScriptBacktrace.mb_get_language_name == null) gdext.classes.ScriptBacktrace.mb_get_language_name = MethodBind.get("ScriptBacktrace", "get_language_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.ScriptBacktrace.mb_get_language_name, livePtr)
  }

  /** ScriptBacktrace.is_empty */
  final def isEmpty(): Boolean = {
    if (gdext.classes.ScriptBacktrace.mb_is_empty == null) gdext.classes.ScriptBacktrace.mb_is_empty = MethodBind.get("ScriptBacktrace", "is_empty", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ScriptBacktrace.mb_is_empty, livePtr)
  }

  /** ScriptBacktrace.get_frame_count */
  final def getFrameCount(): Long = {
    if (gdext.classes.ScriptBacktrace.mb_get_frame_count == null) gdext.classes.ScriptBacktrace.mb_get_frame_count = MethodBind.get("ScriptBacktrace", "get_frame_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ScriptBacktrace.mb_get_frame_count, livePtr)
  }

  /** ScriptBacktrace.get_frame_function */
  final def getFrameFunction(index: Long): String = {
    if (gdext.classes.ScriptBacktrace.mb_get_frame_function == null) gdext.classes.ScriptBacktrace.mb_get_frame_function = MethodBind.get("ScriptBacktrace", "get_frame_function", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.ScriptBacktrace.mb_get_frame_function, livePtr, index)
  }

  /** ScriptBacktrace.get_frame_file */
  final def getFrameFile(index: Long): String = {
    if (gdext.classes.ScriptBacktrace.mb_get_frame_file == null) gdext.classes.ScriptBacktrace.mb_get_frame_file = MethodBind.get("ScriptBacktrace", "get_frame_file", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.ScriptBacktrace.mb_get_frame_file, livePtr, index)
  }

  /** ScriptBacktrace.get_frame_line */
  final def getFrameLine(index: Long): Long = {
    if (gdext.classes.ScriptBacktrace.mb_get_frame_line == null) gdext.classes.ScriptBacktrace.mb_get_frame_line = MethodBind.get("ScriptBacktrace", "get_frame_line", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.ScriptBacktrace.mb_get_frame_line, livePtr, index)
  }

  /** ScriptBacktrace.get_global_variable_count */
  final def getGlobalVariableCount(): Long = {
    if (gdext.classes.ScriptBacktrace.mb_get_global_variable_count == null) gdext.classes.ScriptBacktrace.mb_get_global_variable_count = MethodBind.get("ScriptBacktrace", "get_global_variable_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ScriptBacktrace.mb_get_global_variable_count, livePtr)
  }

  /** ScriptBacktrace.get_global_variable_name */
  final def getGlobalVariableName(variableIndex: Long): String = {
    if (gdext.classes.ScriptBacktrace.mb_get_global_variable_name == null) gdext.classes.ScriptBacktrace.mb_get_global_variable_name = MethodBind.get("ScriptBacktrace", "get_global_variable_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.ScriptBacktrace.mb_get_global_variable_name, livePtr, variableIndex)
  }

  /** ScriptBacktrace.get_local_variable_count */
  final def getLocalVariableCount(frameIndex: Long): Long = {
    if (gdext.classes.ScriptBacktrace.mb_get_local_variable_count == null) gdext.classes.ScriptBacktrace.mb_get_local_variable_count = MethodBind.get("ScriptBacktrace", "get_local_variable_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.ScriptBacktrace.mb_get_local_variable_count, livePtr, frameIndex)
  }

  /** ScriptBacktrace.get_local_variable_name */
  final def getLocalVariableName(frameIndex: Long, variableIndex: Long): String = {
    if (gdext.classes.ScriptBacktrace.mb_get_local_variable_name == null) gdext.classes.ScriptBacktrace.mb_get_local_variable_name = MethodBind.get("ScriptBacktrace", "get_local_variable_name", 1391810591L)
    Ptrcall.call2[Long, Long, String](gdext.classes.ScriptBacktrace.mb_get_local_variable_name, livePtr, frameIndex, variableIndex)
  }

  /** ScriptBacktrace.get_member_variable_count */
  final def getMemberVariableCount(frameIndex: Long): Long = {
    if (gdext.classes.ScriptBacktrace.mb_get_member_variable_count == null) gdext.classes.ScriptBacktrace.mb_get_member_variable_count = MethodBind.get("ScriptBacktrace", "get_member_variable_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.ScriptBacktrace.mb_get_member_variable_count, livePtr, frameIndex)
  }

  /** ScriptBacktrace.get_member_variable_name */
  final def getMemberVariableName(frameIndex: Long, variableIndex: Long): String = {
    if (gdext.classes.ScriptBacktrace.mb_get_member_variable_name == null) gdext.classes.ScriptBacktrace.mb_get_member_variable_name = MethodBind.get("ScriptBacktrace", "get_member_variable_name", 1391810591L)
    Ptrcall.call2[Long, Long, String](gdext.classes.ScriptBacktrace.mb_get_member_variable_name, livePtr, frameIndex, variableIndex)
  }

  /** ScriptBacktrace.format */
  final def format(indentAll: Long = 0L, indentFrames: Long = 4L): String = {
    if (gdext.classes.ScriptBacktrace.mb_format == null) gdext.classes.ScriptBacktrace.mb_format = MethodBind.get("ScriptBacktrace", "format", 3464456933L)
    Ptrcall.call2[Long, Long, String](gdext.classes.ScriptBacktrace.mb_format, livePtr, indentAll, indentFrames)
  }

}

object ScriptBacktrace {
  private[classes] var mb_get_language_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_empty: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_variable_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_variable_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_local_variable_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_local_variable_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_member_variable_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_member_variable_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_format: GDExtensionMethodBindPtr = null
}
