package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SyntaxHighlighter`, extends `Resource`. */
abstract class SyntaxHighlighter extends Resource {

  /** SyntaxHighlighter.update_cache */
  final def updateCache(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SyntaxHighlighter", "update_cache", 3218959716L), hostObject.objectPtr)

  /** SyntaxHighlighter.clear_highlighting_cache */
  final def clearHighlightingCache(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SyntaxHighlighter", "clear_highlighting_cache", 3218959716L), hostObject.objectPtr)

  /** SyntaxHighlighter.get_text_edit */
  final def getTextEdit(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SyntaxHighlighter", "get_text_edit", 1893027089L), hostObject.objectPtr)

}

object SyntaxHighlighter {
  /** Class metadata for Gd[SyntaxHighlighter] lifetime management and casting. */
  given GodotClass[SyntaxHighlighter] with {
    def className = "SyntaxHighlighter"
    def isRefCounted = true
    def wrap(o: GodotObject): SyntaxHighlighter = new SyntaxHighlighter {}.withHost(o.objectPtr)
    def unwrap(t: SyntaxHighlighter): GodotObject = t.hostObject
  }
}
