package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ScriptBacktrace`, extends `RefCounted`. */
abstract class ScriptBacktrace extends RefCounted {

  /** ScriptBacktrace.get_language_name */
  final def getLanguageName(): String =
    Ptrcall.call0[String](MethodBind.get("ScriptBacktrace", "get_language_name", 201670096L), hostObject.objectPtr)

  /** ScriptBacktrace.is_empty */
  final def isEmpty(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ScriptBacktrace", "is_empty", 36873697L), hostObject.objectPtr)

  /** ScriptBacktrace.get_frame_count */
  final def getFrameCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("ScriptBacktrace", "get_frame_count", 3905245786L), hostObject.objectPtr)

  /** ScriptBacktrace.get_frame_function */
  final def getFrameFunction(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("ScriptBacktrace", "get_frame_function", 844755477L), hostObject.objectPtr, index)

  /** ScriptBacktrace.get_frame_file */
  final def getFrameFile(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("ScriptBacktrace", "get_frame_file", 844755477L), hostObject.objectPtr, index)

  /** ScriptBacktrace.get_frame_line */
  final def getFrameLine(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ScriptBacktrace", "get_frame_line", 923996154L), hostObject.objectPtr, index)

  /** ScriptBacktrace.get_global_variable_count */
  final def getGlobalVariableCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("ScriptBacktrace", "get_global_variable_count", 3905245786L), hostObject.objectPtr)

  /** ScriptBacktrace.get_global_variable_name */
  final def getGlobalVariableName(variable_index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("ScriptBacktrace", "get_global_variable_name", 844755477L), hostObject.objectPtr, variable_index)

  /** ScriptBacktrace.get_local_variable_count */
  final def getLocalVariableCount(frame_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ScriptBacktrace", "get_local_variable_count", 923996154L), hostObject.objectPtr, frame_index)

  /** ScriptBacktrace.get_local_variable_name */
  final def getLocalVariableName(frame_index: Long, variable_index: Long): String =
    Ptrcall.call2[Long, Long, String](MethodBind.get("ScriptBacktrace", "get_local_variable_name", 1391810591L), hostObject.objectPtr, frame_index, variable_index)

  /** ScriptBacktrace.get_member_variable_count */
  final def getMemberVariableCount(frame_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ScriptBacktrace", "get_member_variable_count", 923996154L), hostObject.objectPtr, frame_index)

  /** ScriptBacktrace.get_member_variable_name */
  final def getMemberVariableName(frame_index: Long, variable_index: Long): String =
    Ptrcall.call2[Long, Long, String](MethodBind.get("ScriptBacktrace", "get_member_variable_name", 1391810591L), hostObject.objectPtr, frame_index, variable_index)

  /** ScriptBacktrace.format */
  final def format(indent_all: Long, indent_frames: Long): String =
    Ptrcall.call2[Long, Long, String](MethodBind.get("ScriptBacktrace", "format", 3464456933L), hostObject.objectPtr, indent_all, indent_frames)

}

object ScriptBacktrace {
  /** Class metadata for Gd[ScriptBacktrace] lifetime management and casting. */
  given GodotClass[ScriptBacktrace] with {
    def className = "ScriptBacktrace"
    def isRefCounted = true
    def wrap(o: GodotObject): ScriptBacktrace = new ScriptBacktrace {}.withHost(o.objectPtr)
    def unwrap(t: ScriptBacktrace): GodotObject = t.hostObject
  }
}
