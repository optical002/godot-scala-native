package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorSyntaxHighlighter`, extends `SyntaxHighlighter`. */
abstract class EditorSyntaxHighlighter extends SyntaxHighlighter {

}

object EditorSyntaxHighlighter {
  /** Class metadata for Gd[EditorSyntaxHighlighter] lifetime management and casting. */
  given GodotClass[EditorSyntaxHighlighter] with {
    def className = "EditorSyntaxHighlighter"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorSyntaxHighlighter = new EditorSyntaxHighlighter {}.withHost(o.objectPtr)
    def unwrap(t: EditorSyntaxHighlighter): GodotObject = t.hostObject
  }
}
