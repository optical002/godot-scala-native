package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ScriptEditorBase`, extends `VBoxContainer`. */
abstract class ScriptEditorBase extends VBoxContainer {

  /** ScriptEditorBase.get_base_editor */
  final def getBaseEditor(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ScriptEditorBase", "get_base_editor", 2783021301L), hostObject.objectPtr)

  /** ScriptEditorBase.add_syntax_highlighter */
  final def addSyntaxHighlighter(highlighter: EditorSyntaxHighlighter): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScriptEditorBase", "add_syntax_highlighter", 1092774468L), hostObject.objectPtr, highlighter.hostObject)

}

object ScriptEditorBase {
  /** Class metadata for Gd[ScriptEditorBase] lifetime management and casting. */
  given GodotClass[ScriptEditorBase] with {
    def className = "ScriptEditorBase"
    def isRefCounted = false
    def wrap(o: GodotObject): ScriptEditorBase = new ScriptEditorBase {}.withHost(o.objectPtr)
    def unwrap(t: ScriptEditorBase): GodotObject = t.hostObject
  }
}
