package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ScriptEditor`, extends `PanelContainer`. */
abstract class ScriptEditor extends PanelContainer {

  /** ScriptEditor.get_current_editor */
  final def getCurrentEditor(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ScriptEditor", "get_current_editor", 1906266726L), hostObject.objectPtr)

  /** ScriptEditor.register_syntax_highlighter */
  final def registerSyntaxHighlighter(syntax_highlighter: EditorSyntaxHighlighter): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScriptEditor", "register_syntax_highlighter", 1092774468L), hostObject.objectPtr, syntax_highlighter.hostObject)

  /** ScriptEditor.unregister_syntax_highlighter */
  final def unregisterSyntaxHighlighter(syntax_highlighter: EditorSyntaxHighlighter): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScriptEditor", "unregister_syntax_highlighter", 1092774468L), hostObject.objectPtr, syntax_highlighter.hostObject)

  /** ScriptEditor.goto_line */
  final def gotoLine(line_number: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScriptEditor", "goto_line", 1286410249L), hostObject.objectPtr, line_number)

  /** ScriptEditor.get_current_script */
  final def getCurrentScript(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ScriptEditor", "get_current_script", 2146468882L), hostObject.objectPtr)

  /** ScriptEditor.open_script_create_dialog */
  final def openScriptCreateDialog(base_name: String, base_path: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("ScriptEditor", "open_script_create_dialog", 3186203200L), hostObject.objectPtr, base_name, base_path)

  /** ScriptEditor.goto_help */
  final def gotoHelp(topic: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScriptEditor", "goto_help", 83702148L), hostObject.objectPtr, topic)

  /** ScriptEditor.update_docs_from_script */
  final def updateDocsFromScript(script: Script): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScriptEditor", "update_docs_from_script", 3657522847L), hostObject.objectPtr, script.hostObject)

  /** ScriptEditor.clear_docs_from_script */
  final def clearDocsFromScript(script: Script): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScriptEditor", "clear_docs_from_script", 3657522847L), hostObject.objectPtr, script.hostObject)

}

object ScriptEditor {
  /** Class metadata for Gd[ScriptEditor] lifetime management and casting. */
  given GodotClass[ScriptEditor] with {
    def className = "ScriptEditor"
    def isRefCounted = false
    def wrap(o: GodotObject): ScriptEditor = new ScriptEditor {}.withHost(o.objectPtr)
    def unwrap(t: ScriptEditor): GodotObject = t.hostObject
  }
}
