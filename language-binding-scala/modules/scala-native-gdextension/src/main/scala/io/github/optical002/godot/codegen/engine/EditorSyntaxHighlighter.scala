package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
