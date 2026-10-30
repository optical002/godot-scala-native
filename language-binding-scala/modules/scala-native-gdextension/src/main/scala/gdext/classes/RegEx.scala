package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RegEx`, extends `RefCounted`. */
abstract class RegEx extends RefCounted {
  override def godotClassName: String = "RegEx"

  /** RegEx.clear */
  final def clear(): Unit = {
    if (gdext.classes.RegEx.mb_clear == null) gdext.classes.RegEx.mb_clear = MethodBind.get("RegEx", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RegEx.mb_clear, livePtr)
  }

  /** RegEx.compile */
  final def compile(pattern: String, showError: Boolean = true): gdext.classes.Error = {
    if (gdext.classes.RegEx.mb_compile == null) gdext.classes.RegEx.mb_compile = MethodBind.get("RegEx", "compile", 3565188097L)
    gdext.classes.Error(Ptrcall.call2[String, Boolean, Long](gdext.classes.RegEx.mb_compile, livePtr, pattern, showError))
  }

  /** RegEx.search. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def search(subject: String, offset: Long = 0L, end: Long = -1L): RegExMatch = {
    if (gdext.classes.RegEx.mb_search == null) gdext.classes.RegEx.mb_search = MethodBind.get("RegEx", "search", 3365977994L)
    Wrappers.owned[RegExMatch](Ptrcall.call3[String, Long, Long, Long](gdext.classes.RegEx.mb_search, livePtr, subject, offset, end))
  }

  /** RegEx.sub */
  final def sub(subject: String, replacement: String, all: Boolean = false, offset: Long = 0L, end: Long = -1L): String = {
    if (gdext.classes.RegEx.mb_sub == null) gdext.classes.RegEx.mb_sub = MethodBind.get("RegEx", "sub", 54019702L)
    Ptrcall.call5[String, String, Boolean, Long, Long, String](gdext.classes.RegEx.mb_sub, livePtr, subject, replacement, all, offset, end)
  }

  /** RegEx.is_valid */
  final def isValid(): Boolean = {
    if (gdext.classes.RegEx.mb_is_valid == null) gdext.classes.RegEx.mb_is_valid = MethodBind.get("RegEx", "is_valid", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RegEx.mb_is_valid, livePtr)
  }

  /** RegEx.get_pattern */
  final def getPattern(): String = {
    if (gdext.classes.RegEx.mb_get_pattern == null) gdext.classes.RegEx.mb_get_pattern = MethodBind.get("RegEx", "get_pattern", 201670096L)
    Ptrcall.call0[String](gdext.classes.RegEx.mb_get_pattern, livePtr)
  }

  /** RegEx.get_group_count */
  final def getGroupCount(): Long = {
    if (gdext.classes.RegEx.mb_get_group_count == null) gdext.classes.RegEx.mb_get_group_count = MethodBind.get("RegEx", "get_group_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RegEx.mb_get_group_count, livePtr)
  }

}

object RegEx {
  private[classes] var mb_create_from_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_compile: GDExtensionMethodBindPtr = null
  private[classes] var mb_search: GDExtensionMethodBindPtr = null
  private[classes] var mb_sub: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_valid: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pattern: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_group_count: GDExtensionMethodBindPtr = null

  /** RegEx.create_from_string. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createFromString(pattern: String, showError: Boolean = true): RegEx = {
    if (gdext.classes.RegEx.mb_create_from_string == null) gdext.classes.RegEx.mb_create_from_string = MethodBind.get("RegEx", "create_from_string", 4249111514L)
    Wrappers.owned[RegEx](Ptrcall.call2[String, Boolean, Long](gdext.classes.RegEx.mb_create_from_string, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], pattern, showError))
  }
}
