package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ScriptEditorBase`, extends `VBoxContainer`. */
abstract class ScriptEditorBase extends VBoxContainer {
  override def godotClassName: String = "ScriptEditorBase"

  /** ScriptEditorBase.get_base_editor */
  final def getBaseEditor(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ScriptEditorBase", "get_base_editor", 2783021301L), hostObject.objectPtr)

  /** ScriptEditorBase.add_syntax_highlighter */
  final def addSyntaxHighlighter(highlighter: EditorSyntaxHighlighter): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScriptEditorBase", "add_syntax_highlighter", 1092774468L), hostObject.objectPtr, highlighter.hostObject)

}
