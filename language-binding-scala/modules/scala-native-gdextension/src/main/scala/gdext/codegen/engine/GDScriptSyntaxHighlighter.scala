package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GDScriptSyntaxHighlighter`, extends `EditorSyntaxHighlighter`. */
abstract class GDScriptSyntaxHighlighter extends EditorSyntaxHighlighter {

}

object GDScriptSyntaxHighlighter {
  /** Class metadata for Gd[GDScriptSyntaxHighlighter] lifetime management and casting. */
  given GodotClass[GDScriptSyntaxHighlighter] with {
    def className = "GDScriptSyntaxHighlighter"
    def isRefCounted = true
    def wrap(o: GodotObject): GDScriptSyntaxHighlighter = new GDScriptSyntaxHighlighter {}.withHost(o.objectPtr)
    def unwrap(t: GDScriptSyntaxHighlighter): GodotObject = t.hostObject
  }
}
