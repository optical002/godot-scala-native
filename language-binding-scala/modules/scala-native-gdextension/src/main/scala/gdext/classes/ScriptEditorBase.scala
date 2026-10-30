package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ScriptEditorBase`, extends `VBoxContainer`. */
abstract class ScriptEditorBase extends VBoxContainer {
  override def godotClassName: String = "ScriptEditorBase"

  /** ScriptEditorBase.get_base_editor */
  final def getBaseEditor(): Control = {
    if (gdext.classes.ScriptEditorBase.mb_get_base_editor == null) gdext.classes.ScriptEditorBase.mb_get_base_editor = MethodBind.get("ScriptEditorBase", "get_base_editor", 2783021301L)
    Wrappers.borrowed[Control](Ptrcall.call0[Long](gdext.classes.ScriptEditorBase.mb_get_base_editor, livePtr))
  }

  /** ScriptEditorBase.add_syntax_highlighter */
  final def addSyntaxHighlighter(highlighter: EditorSyntaxHighlighter): Unit = {
    if (gdext.classes.ScriptEditorBase.mb_add_syntax_highlighter == null) gdext.classes.ScriptEditorBase.mb_add_syntax_highlighter = MethodBind.get("ScriptEditorBase", "add_syntax_highlighter", 1092774468L)
    Ptrcall.callVoid1(gdext.classes.ScriptEditorBase.mb_add_syntax_highlighter, livePtr, Wrappers.handle(highlighter))
  }

}

object ScriptEditorBase {
  private[classes] var mb_get_base_editor: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_syntax_highlighter: GDExtensionMethodBindPtr = null
}
