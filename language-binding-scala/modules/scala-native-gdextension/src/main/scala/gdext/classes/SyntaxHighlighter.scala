package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SyntaxHighlighter`, extends `Resource`. */
abstract class SyntaxHighlighter extends Resource {
  override def godotClassName: String = "SyntaxHighlighter"

  /** SyntaxHighlighter.update_cache */
  final def updateCache(): Unit = {
    if (gdext.classes.SyntaxHighlighter.mb_update_cache == null) gdext.classes.SyntaxHighlighter.mb_update_cache = MethodBind.get("SyntaxHighlighter", "update_cache", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SyntaxHighlighter.mb_update_cache, livePtr)
  }

  /** SyntaxHighlighter.clear_highlighting_cache */
  final def clearHighlightingCache(): Unit = {
    if (gdext.classes.SyntaxHighlighter.mb_clear_highlighting_cache == null) gdext.classes.SyntaxHighlighter.mb_clear_highlighting_cache = MethodBind.get("SyntaxHighlighter", "clear_highlighting_cache", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SyntaxHighlighter.mb_clear_highlighting_cache, livePtr)
  }

  /** SyntaxHighlighter.get_text_edit */
  final def getTextEdit(): TextEdit = {
    if (gdext.classes.SyntaxHighlighter.mb_get_text_edit == null) gdext.classes.SyntaxHighlighter.mb_get_text_edit = MethodBind.get("SyntaxHighlighter", "get_text_edit", 1893027089L)
    Wrappers.borrowed[TextEdit](Ptrcall.call0[Long](gdext.classes.SyntaxHighlighter.mb_get_text_edit, livePtr))
  }

}

object SyntaxHighlighter {
  private[classes] var mb_update_cache: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_highlighting_cache: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_edit: GDExtensionMethodBindPtr = null
}
