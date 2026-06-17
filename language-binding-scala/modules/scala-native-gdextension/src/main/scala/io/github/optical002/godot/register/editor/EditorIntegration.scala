package io.github.optical002.godot.register.editor

import io.github.optical002.godot.{Godot, Log}
import io.github.optical002.godot.builtin.StringNames
import io.github.optical002.godot.engine.GodotObject
import io.github.optical002.godot.codegen.engine.{EditorInspectorPlugin, EditorPlugin}
import io.github.optical002.godot.register.*

/**
 * Editor-side integration for typed scene (`Tscn[T]`) exports.
 *
 * Godot has no native property hint to filter a PackedScene picker by root-node
 * type, so we install an [[EditorInspectorPlugin]] that, for properties recorded
 * in [[SceneExportRegistry]] (i.e. `Tscn[T]` exports), knows the required root
 * type `T`. Registration happens at the EDITOR initialization level (these are
 * tool classes, `isRuntime=false`), driven from `GodotEngine`.
 *
 * Status: the plugin pipeline (editor-level registration → `editor_add_plugin`
 * → `EditorPlugin._enter_tree` → `add_inspector_plugin` → the inspector's
 * `_can_handle`/`_parse_property`) is wired and exercised. The interactive
 * scene-picker widget that *rejects* a wrong-root scene needs a Callable→Scala
 * primitive (to react to the picker's selection signal) and is the remaining
 * follow-up; for now `_parse_property` detects scene exports and reports the
 * required root type.
 */
object EditorIntegration {

  /** Register the editor tool classes and add the plugin. Reload-safe. */
  def registerAtEditorLevel(): Unit = {
    Log.trace("registerAtEditorLevel: BEGIN")
    ClassRegistration.register(
      ClassDescriptor(
        className = "ScalaExportInspectorPlugin",
        parentClassName = "EditorInspectorPlugin",
        factory = () => new ScalaExportInspectorPlugin().asInstanceOf[GodotScriptClass],
        overriddenVirtuals = Set("_can_handle", "_parse_property"),
        isRuntime = false
      )
    )
    ClassRegistration.register(
      ClassDescriptor(
        className = "ScalaExportPlugin",
        parentClassName = "EditorPlugin",
        factory = () => new ScalaExportPlugin().asInstanceOf[GodotScriptClass],
        overriddenVirtuals = Set("_enter_tree", "_exit_tree"),
        isRuntime = false
      )
    )
    Log.trace("registerAtEditorLevel: editor_add_plugin(ScalaExportPlugin) begin")
    Godot.interface.editor_add_plugin(StringNames.cached("ScalaExportPlugin").ptr)
    Log.trace("registerAtEditorLevel: editor_add_plugin returned")
    Log.file("[editor] registered ScalaExportPlugin + inspector plugin")
  }
}

/** EditorPlugin that installs the export inspector plugin. */
final class ScalaExportPlugin extends EditorPlugin {
  private var inspector: EditorInspectorPlugin = null

  override def _enter_tree(): Unit = {
    Log.trace("ScalaExportPlugin._enter_tree: BEGIN")
    val handle = Godot.interface.classdb_construct_object2(
      StringNames.cached("ScalaExportInspectorPlugin").ptr
    )
    Log.trace("ScalaExportPlugin._enter_tree: inspector constructed")
    inspector = new EditorInspectorPlugin {}.withHost(handle)
    Log.trace("ScalaExportPlugin._enter_tree: addInspectorPlugin begin")
    addInspectorPlugin(inspector)
    Log.trace("ScalaExportPlugin._enter_tree: END")
    Log.file("[editor] ScalaExportPlugin: inspector plugin installed")
  }

  override def _exit_tree(): Unit = {
    Log.trace("ScalaExportPlugin._exit_tree: BEGIN")
    if (inspector != null) {
      removeInspectorPlugin(inspector)
      inspector = null
    }
    Log.trace("ScalaExportPlugin._exit_tree: END")
  }
}

/** Inspector plugin that recognises `Tscn[T]` scene exports. */
final class ScalaExportInspectorPlugin extends EditorInspectorPlugin {
  // Inert for now. This plugin's only intended job is filtering the scene picker
  // for `Tscn[T]` exports, which is unimplemented (`_parse_property` always
  // returns false and just logs). Claiming objects (returning true) makes Godot
  // route every property of every inspected object — and the sub-inspector it
  // builds for a custom `Resource` property — through our Scala dispatch; during
  // an editor hot-reload that reentrant path deadlocks the editor. Until the
  // scene-picker feature is built, stay out of the inspector entirely.
  override def _can_handle(obj: GodotObject): Boolean = false

  override def _parse_property(
    obj: GodotObject,
    varType: Long,
    name: String,
    hintType: Long,
    hintString: String,
    usage: Long,
    wide: Boolean
  ): Boolean = {
    val root = SceneExportRegistry.rootTypeByProp(name)
    if (root != null) {
      Log.file(
        s"[editor] scene export '$name': restrict picker to scenes with root '$root'"
      )
      // Returning false keeps Godot's default PackedScene picker. A custom
      // EditorProperty that rejects wrong-root scenes is the documented
      // follow-up (needs a Callable->Scala primitive for the selection signal).
      false
    } else false
  }
}
