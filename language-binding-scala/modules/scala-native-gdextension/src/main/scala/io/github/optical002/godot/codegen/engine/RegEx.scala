package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RegEx`, extends `RefCounted`. */
abstract class RegEx extends RefCounted {

  /** RegEx.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RegEx", "clear", 3218959716L), hostObject.objectPtr)

  /** RegEx.compile */
  final def compile(pattern: String, show_error: Boolean): Long =
    Ptrcall.call2[String, Boolean, Long](MethodBind.get("RegEx", "compile", 3565188097L), hostObject.objectPtr, pattern, show_error)

  /** RegEx.search */
  final def search(subject: String, offset: Long, end: Long): GodotObject =
    Ptrcall.call3[String, Long, Long, GodotObject](MethodBind.get("RegEx", "search", 3365977994L), hostObject.objectPtr, subject, offset, end)

  /** RegEx.sub */
  final def sub(subject: String, replacement: String, all: Boolean, offset: Long, end: Long): String =
    Ptrcall.call5[String, String, Boolean, Long, Long, String](MethodBind.get("RegEx", "sub", 54019702L), hostObject.objectPtr, subject, replacement, all, offset, end)

  /** RegEx.is_valid */
  final def isValid(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RegEx", "is_valid", 36873697L), hostObject.objectPtr)

  /** RegEx.get_pattern */
  final def getPattern(): String =
    Ptrcall.call0[String](MethodBind.get("RegEx", "get_pattern", 201670096L), hostObject.objectPtr)

  /** RegEx.get_group_count */
  final def getGroupCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RegEx", "get_group_count", 3905245786L), hostObject.objectPtr)

}

object RegEx {
  /** Class metadata for Gd[RegEx] lifetime management and casting. */
  given GodotClass[RegEx] with {
    def className = "RegEx"
    def isRefCounted = true
    def wrap(o: GodotObject): RegEx = new RegEx {}.withHost(o.objectPtr)
    def unwrap(t: RegEx): GodotObject = t.hostObject
  }
}
