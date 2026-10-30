package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ScriptEditor`, extends `PanelContainer`. */
abstract class ScriptEditor extends PanelContainer {
  override def godotClassName: String = "ScriptEditor"

  /** ScriptEditor.get_current_editor */
  final def getCurrentEditor(): ScriptEditorBase = {
    if (gdext.classes.ScriptEditor.mb_get_current_editor == null) gdext.classes.ScriptEditor.mb_get_current_editor = MethodBind.get("ScriptEditor", "get_current_editor", 1906266726L)
    Wrappers.borrowed[ScriptEditorBase](Ptrcall.call0[Long](gdext.classes.ScriptEditor.mb_get_current_editor, livePtr))
  }

  /** ScriptEditor.register_syntax_highlighter */
  final def registerSyntaxHighlighter(syntaxHighlighter: EditorSyntaxHighlighter): Unit = {
    if (gdext.classes.ScriptEditor.mb_register_syntax_highlighter == null) gdext.classes.ScriptEditor.mb_register_syntax_highlighter = MethodBind.get("ScriptEditor", "register_syntax_highlighter", 1092774468L)
    Ptrcall.callVoid1(gdext.classes.ScriptEditor.mb_register_syntax_highlighter, livePtr, Wrappers.handle(syntaxHighlighter))
  }

  /** ScriptEditor.unregister_syntax_highlighter */
  final def unregisterSyntaxHighlighter(syntaxHighlighter: EditorSyntaxHighlighter): Unit = {
    if (gdext.classes.ScriptEditor.mb_unregister_syntax_highlighter == null) gdext.classes.ScriptEditor.mb_unregister_syntax_highlighter = MethodBind.get("ScriptEditor", "unregister_syntax_highlighter", 1092774468L)
    Ptrcall.callVoid1(gdext.classes.ScriptEditor.mb_unregister_syntax_highlighter, livePtr, Wrappers.handle(syntaxHighlighter))
  }

  /** ScriptEditor.goto_line */
  final def gotoLine(lineNumber: Long): Unit = {
    if (gdext.classes.ScriptEditor.mb_goto_line == null) gdext.classes.ScriptEditor.mb_goto_line = MethodBind.get("ScriptEditor", "goto_line", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ScriptEditor.mb_goto_line, livePtr, lineNumber)
  }

  /** ScriptEditor.get_current_script. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCurrentScript(): Script = {
    if (gdext.classes.ScriptEditor.mb_get_current_script == null) gdext.classes.ScriptEditor.mb_get_current_script = MethodBind.get("ScriptEditor", "get_current_script", 2146468882L)
    Wrappers.owned[Script](Ptrcall.call0[Long](gdext.classes.ScriptEditor.mb_get_current_script, livePtr))
  }

  /** ScriptEditor.open_script_create_dialog */
  final def openScriptCreateDialog(baseName: String, basePath: String): Unit = {
    if (gdext.classes.ScriptEditor.mb_open_script_create_dialog == null) gdext.classes.ScriptEditor.mb_open_script_create_dialog = MethodBind.get("ScriptEditor", "open_script_create_dialog", 3186203200L)
    Ptrcall.callVoid2(gdext.classes.ScriptEditor.mb_open_script_create_dialog, livePtr, baseName, basePath)
  }

  /** ScriptEditor.goto_help */
  final def gotoHelp(topic: String): Unit = {
    if (gdext.classes.ScriptEditor.mb_goto_help == null) gdext.classes.ScriptEditor.mb_goto_help = MethodBind.get("ScriptEditor", "goto_help", 83702148L)
    Ptrcall.callVoid1(gdext.classes.ScriptEditor.mb_goto_help, livePtr, topic)
  }

  /** ScriptEditor.update_docs_from_script */
  final def updateDocsFromScript(script: Script): Unit = {
    if (gdext.classes.ScriptEditor.mb_update_docs_from_script == null) gdext.classes.ScriptEditor.mb_update_docs_from_script = MethodBind.get("ScriptEditor", "update_docs_from_script", 3657522847L)
    Ptrcall.callVoid1(gdext.classes.ScriptEditor.mb_update_docs_from_script, livePtr, Wrappers.handle(script))
  }

  /** ScriptEditor.clear_docs_from_script */
  final def clearDocsFromScript(script: Script): Unit = {
    if (gdext.classes.ScriptEditor.mb_clear_docs_from_script == null) gdext.classes.ScriptEditor.mb_clear_docs_from_script = MethodBind.get("ScriptEditor", "clear_docs_from_script", 3657522847L)
    Ptrcall.callVoid1(gdext.classes.ScriptEditor.mb_clear_docs_from_script, livePtr, Wrappers.handle(script))
  }

}

object ScriptEditor {
  private[classes] var mb_get_current_editor: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_syntax_highlighter: GDExtensionMethodBindPtr = null
  private[classes] var mb_unregister_syntax_highlighter: GDExtensionMethodBindPtr = null
  private[classes] var mb_goto_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_script: GDExtensionMethodBindPtr = null
  private[classes] var mb_open_script_create_dialog: GDExtensionMethodBindPtr = null
  private[classes] var mb_goto_help: GDExtensionMethodBindPtr = null
  private[classes] var mb_update_docs_from_script: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_docs_from_script: GDExtensionMethodBindPtr = null
}
