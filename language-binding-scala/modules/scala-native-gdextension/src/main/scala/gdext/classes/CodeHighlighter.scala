package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CodeHighlighter`, extends `SyntaxHighlighter`. */
abstract class CodeHighlighter extends SyntaxHighlighter {
  override def godotClassName: String = "CodeHighlighter"

  /** CodeHighlighter.add_keyword_color */
  final def addKeywordColor(keyword: String, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.CodeHighlighter.mb_add_keyword_color == null) gdext.classes.CodeHighlighter.mb_add_keyword_color = MethodBind.get("CodeHighlighter", "add_keyword_color", 1636512886L)
    Ptrcall.callVoid2(gdext.classes.CodeHighlighter.mb_add_keyword_color, livePtr, keyword, color)
  }

  /** CodeHighlighter.remove_keyword_color */
  final def removeKeywordColor(keyword: String): Unit = {
    if (gdext.classes.CodeHighlighter.mb_remove_keyword_color == null) gdext.classes.CodeHighlighter.mb_remove_keyword_color = MethodBind.get("CodeHighlighter", "remove_keyword_color", 83702148L)
    Ptrcall.callVoid1(gdext.classes.CodeHighlighter.mb_remove_keyword_color, livePtr, keyword)
  }

  /** CodeHighlighter.has_keyword_color */
  final def hasKeywordColor(keyword: String): Boolean = {
    if (gdext.classes.CodeHighlighter.mb_has_keyword_color == null) gdext.classes.CodeHighlighter.mb_has_keyword_color = MethodBind.get("CodeHighlighter", "has_keyword_color", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.CodeHighlighter.mb_has_keyword_color, livePtr, keyword)
  }

  /** CodeHighlighter.get_keyword_color */
  final def getKeywordColor(keyword: String): gdext.builtin.Color = {
    if (gdext.classes.CodeHighlighter.mb_get_keyword_color == null) gdext.classes.CodeHighlighter.mb_get_keyword_color = MethodBind.get("CodeHighlighter", "get_keyword_color", 3855908743L)
    Ptrcall.call1[String, gdext.builtin.Color](gdext.classes.CodeHighlighter.mb_get_keyword_color, livePtr, keyword)
  }

  /** CodeHighlighter.clear_keyword_colors */
  final def clearKeywordColors(): Unit = {
    if (gdext.classes.CodeHighlighter.mb_clear_keyword_colors == null) gdext.classes.CodeHighlighter.mb_clear_keyword_colors = MethodBind.get("CodeHighlighter", "clear_keyword_colors", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeHighlighter.mb_clear_keyword_colors, livePtr)
  }

  /** CodeHighlighter.add_member_keyword_color */
  final def addMemberKeywordColor(member_keyword: String, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.CodeHighlighter.mb_add_member_keyword_color == null) gdext.classes.CodeHighlighter.mb_add_member_keyword_color = MethodBind.get("CodeHighlighter", "add_member_keyword_color", 1636512886L)
    Ptrcall.callVoid2(gdext.classes.CodeHighlighter.mb_add_member_keyword_color, livePtr, member_keyword, color)
  }

  /** CodeHighlighter.remove_member_keyword_color */
  final def removeMemberKeywordColor(member_keyword: String): Unit = {
    if (gdext.classes.CodeHighlighter.mb_remove_member_keyword_color == null) gdext.classes.CodeHighlighter.mb_remove_member_keyword_color = MethodBind.get("CodeHighlighter", "remove_member_keyword_color", 83702148L)
    Ptrcall.callVoid1(gdext.classes.CodeHighlighter.mb_remove_member_keyword_color, livePtr, member_keyword)
  }

  /** CodeHighlighter.has_member_keyword_color */
  final def hasMemberKeywordColor(member_keyword: String): Boolean = {
    if (gdext.classes.CodeHighlighter.mb_has_member_keyword_color == null) gdext.classes.CodeHighlighter.mb_has_member_keyword_color = MethodBind.get("CodeHighlighter", "has_member_keyword_color", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.CodeHighlighter.mb_has_member_keyword_color, livePtr, member_keyword)
  }

  /** CodeHighlighter.get_member_keyword_color */
  final def getMemberKeywordColor(member_keyword: String): gdext.builtin.Color = {
    if (gdext.classes.CodeHighlighter.mb_get_member_keyword_color == null) gdext.classes.CodeHighlighter.mb_get_member_keyword_color = MethodBind.get("CodeHighlighter", "get_member_keyword_color", 3855908743L)
    Ptrcall.call1[String, gdext.builtin.Color](gdext.classes.CodeHighlighter.mb_get_member_keyword_color, livePtr, member_keyword)
  }

  /** CodeHighlighter.clear_member_keyword_colors */
  final def clearMemberKeywordColors(): Unit = {
    if (gdext.classes.CodeHighlighter.mb_clear_member_keyword_colors == null) gdext.classes.CodeHighlighter.mb_clear_member_keyword_colors = MethodBind.get("CodeHighlighter", "clear_member_keyword_colors", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeHighlighter.mb_clear_member_keyword_colors, livePtr)
  }

  /** CodeHighlighter.add_color_region */
  final def addColorRegion(start_key: String, end_key: String, color: gdext.builtin.Color, line_only: Boolean): Unit = {
    if (gdext.classes.CodeHighlighter.mb_add_color_region == null) gdext.classes.CodeHighlighter.mb_add_color_region = MethodBind.get("CodeHighlighter", "add_color_region", 2924977451L)
    Ptrcall.callVoid4(gdext.classes.CodeHighlighter.mb_add_color_region, livePtr, start_key, end_key, color, line_only)
  }

  /** CodeHighlighter.remove_color_region */
  final def removeColorRegion(start_key: String): Unit = {
    if (gdext.classes.CodeHighlighter.mb_remove_color_region == null) gdext.classes.CodeHighlighter.mb_remove_color_region = MethodBind.get("CodeHighlighter", "remove_color_region", 83702148L)
    Ptrcall.callVoid1(gdext.classes.CodeHighlighter.mb_remove_color_region, livePtr, start_key)
  }

  /** CodeHighlighter.has_color_region */
  final def hasColorRegion(start_key: String): Boolean = {
    if (gdext.classes.CodeHighlighter.mb_has_color_region == null) gdext.classes.CodeHighlighter.mb_has_color_region = MethodBind.get("CodeHighlighter", "has_color_region", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.CodeHighlighter.mb_has_color_region, livePtr, start_key)
  }

  /** CodeHighlighter.clear_color_regions */
  final def clearColorRegions(): Unit = {
    if (gdext.classes.CodeHighlighter.mb_clear_color_regions == null) gdext.classes.CodeHighlighter.mb_clear_color_regions = MethodBind.get("CodeHighlighter", "clear_color_regions", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeHighlighter.mb_clear_color_regions, livePtr)
  }

  /** CodeHighlighter.set_function_color */
  final def setFunctionColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.CodeHighlighter.mb_set_function_color == null) gdext.classes.CodeHighlighter.mb_set_function_color = MethodBind.get("CodeHighlighter", "set_function_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.CodeHighlighter.mb_set_function_color, livePtr, color)
  }

  /** CodeHighlighter.get_function_color */
  final def getFunctionColor(): gdext.builtin.Color = {
    if (gdext.classes.CodeHighlighter.mb_get_function_color == null) gdext.classes.CodeHighlighter.mb_get_function_color = MethodBind.get("CodeHighlighter", "get_function_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.CodeHighlighter.mb_get_function_color, livePtr)
  }

  /** CodeHighlighter.set_number_color */
  final def setNumberColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.CodeHighlighter.mb_set_number_color == null) gdext.classes.CodeHighlighter.mb_set_number_color = MethodBind.get("CodeHighlighter", "set_number_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.CodeHighlighter.mb_set_number_color, livePtr, color)
  }

  /** CodeHighlighter.get_number_color */
  final def getNumberColor(): gdext.builtin.Color = {
    if (gdext.classes.CodeHighlighter.mb_get_number_color == null) gdext.classes.CodeHighlighter.mb_get_number_color = MethodBind.get("CodeHighlighter", "get_number_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.CodeHighlighter.mb_get_number_color, livePtr)
  }

  /** CodeHighlighter.set_symbol_color */
  final def setSymbolColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.CodeHighlighter.mb_set_symbol_color == null) gdext.classes.CodeHighlighter.mb_set_symbol_color = MethodBind.get("CodeHighlighter", "set_symbol_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.CodeHighlighter.mb_set_symbol_color, livePtr, color)
  }

  /** CodeHighlighter.get_symbol_color */
  final def getSymbolColor(): gdext.builtin.Color = {
    if (gdext.classes.CodeHighlighter.mb_get_symbol_color == null) gdext.classes.CodeHighlighter.mb_get_symbol_color = MethodBind.get("CodeHighlighter", "get_symbol_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.CodeHighlighter.mb_get_symbol_color, livePtr)
  }

  /** CodeHighlighter.set_member_variable_color */
  final def setMemberVariableColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.CodeHighlighter.mb_set_member_variable_color == null) gdext.classes.CodeHighlighter.mb_set_member_variable_color = MethodBind.get("CodeHighlighter", "set_member_variable_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.CodeHighlighter.mb_set_member_variable_color, livePtr, color)
  }

  /** CodeHighlighter.get_member_variable_color */
  final def getMemberVariableColor(): gdext.builtin.Color = {
    if (gdext.classes.CodeHighlighter.mb_get_member_variable_color == null) gdext.classes.CodeHighlighter.mb_get_member_variable_color = MethodBind.get("CodeHighlighter", "get_member_variable_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.CodeHighlighter.mb_get_member_variable_color, livePtr)
  }

}

object CodeHighlighter {
  private[classes] var mb_add_keyword_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_keyword_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_keyword_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_keyword_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_keyword_colors: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_member_keyword_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_member_keyword_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_member_keyword_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_member_keyword_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_member_keyword_colors: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_color_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_color_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_color_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_color_regions: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_function_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_number_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_number_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_symbol_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_symbol_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_member_variable_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_member_variable_color: GDExtensionMethodBindPtr = null
}
