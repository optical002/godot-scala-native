package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CodeHighlighter`, extends `SyntaxHighlighter`. */
abstract class CodeHighlighter extends SyntaxHighlighter {

  /** CodeHighlighter.add_keyword_color */
  final def addKeywordColor(keyword: String, color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("CodeHighlighter", "add_keyword_color", 1636512886L), hostObject.objectPtr, keyword, color)

  /** CodeHighlighter.remove_keyword_color */
  final def removeKeywordColor(keyword: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeHighlighter", "remove_keyword_color", 83702148L), hostObject.objectPtr, keyword)

  /** CodeHighlighter.has_keyword_color */
  final def hasKeywordColor(keyword: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("CodeHighlighter", "has_keyword_color", 3927539163L), hostObject.objectPtr, keyword)

  /** CodeHighlighter.get_keyword_color */
  final def getKeywordColor(keyword: String): io.github.optical002.godot.builtin.Color =
    Ptrcall.call1[String, io.github.optical002.godot.builtin.Color](MethodBind.get("CodeHighlighter", "get_keyword_color", 3855908743L), hostObject.objectPtr, keyword)

  /** CodeHighlighter.clear_keyword_colors */
  final def clearKeywordColors(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeHighlighter", "clear_keyword_colors", 3218959716L), hostObject.objectPtr)

  /** CodeHighlighter.add_member_keyword_color */
  final def addMemberKeywordColor(member_keyword: String, color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("CodeHighlighter", "add_member_keyword_color", 1636512886L), hostObject.objectPtr, member_keyword, color)

  /** CodeHighlighter.remove_member_keyword_color */
  final def removeMemberKeywordColor(member_keyword: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeHighlighter", "remove_member_keyword_color", 83702148L), hostObject.objectPtr, member_keyword)

  /** CodeHighlighter.has_member_keyword_color */
  final def hasMemberKeywordColor(member_keyword: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("CodeHighlighter", "has_member_keyword_color", 3927539163L), hostObject.objectPtr, member_keyword)

  /** CodeHighlighter.get_member_keyword_color */
  final def getMemberKeywordColor(member_keyword: String): io.github.optical002.godot.builtin.Color =
    Ptrcall.call1[String, io.github.optical002.godot.builtin.Color](MethodBind.get("CodeHighlighter", "get_member_keyword_color", 3855908743L), hostObject.objectPtr, member_keyword)

  /** CodeHighlighter.clear_member_keyword_colors */
  final def clearMemberKeywordColors(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeHighlighter", "clear_member_keyword_colors", 3218959716L), hostObject.objectPtr)

  /** CodeHighlighter.add_color_region */
  final def addColorRegion(start_key: String, end_key: String, color: io.github.optical002.godot.builtin.Color, line_only: Boolean): Unit =
    Ptrcall.callVoid4(MethodBind.get("CodeHighlighter", "add_color_region", 2924977451L), hostObject.objectPtr, start_key, end_key, color, line_only)

  /** CodeHighlighter.remove_color_region */
  final def removeColorRegion(start_key: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeHighlighter", "remove_color_region", 83702148L), hostObject.objectPtr, start_key)

  /** CodeHighlighter.has_color_region */
  final def hasColorRegion(start_key: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("CodeHighlighter", "has_color_region", 3927539163L), hostObject.objectPtr, start_key)

  /** CodeHighlighter.clear_color_regions */
  final def clearColorRegions(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeHighlighter", "clear_color_regions", 3218959716L), hostObject.objectPtr)

  /** CodeHighlighter.set_function_color */
  final def setFunctionColor(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeHighlighter", "set_function_color", 2920490490L), hostObject.objectPtr, color)

  /** CodeHighlighter.get_function_color */
  final def getFunctionColor(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("CodeHighlighter", "get_function_color", 3444240500L), hostObject.objectPtr)

  /** CodeHighlighter.set_number_color */
  final def setNumberColor(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeHighlighter", "set_number_color", 2920490490L), hostObject.objectPtr, color)

  /** CodeHighlighter.get_number_color */
  final def getNumberColor(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("CodeHighlighter", "get_number_color", 3444240500L), hostObject.objectPtr)

  /** CodeHighlighter.set_symbol_color */
  final def setSymbolColor(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeHighlighter", "set_symbol_color", 2920490490L), hostObject.objectPtr, color)

  /** CodeHighlighter.get_symbol_color */
  final def getSymbolColor(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("CodeHighlighter", "get_symbol_color", 3444240500L), hostObject.objectPtr)

  /** CodeHighlighter.set_member_variable_color */
  final def setMemberVariableColor(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeHighlighter", "set_member_variable_color", 2920490490L), hostObject.objectPtr, color)

  /** CodeHighlighter.get_member_variable_color */
  final def getMemberVariableColor(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("CodeHighlighter", "get_member_variable_color", 3444240500L), hostObject.objectPtr)

}

object CodeHighlighter {
  /** Class metadata for Gd[CodeHighlighter] lifetime management and casting. */
  given GodotClass[CodeHighlighter] with {
    def className = "CodeHighlighter"
    def isRefCounted = true
    def wrap(o: GodotObject): CodeHighlighter = new CodeHighlighter {}.withHost(o.objectPtr)
    def unwrap(t: CodeHighlighter): GodotObject = t.hostObject
  }
}
