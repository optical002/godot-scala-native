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
    Godot.interface.editor_add_plugin(StringNames.cached("ScalaExportPlugin").ptr)
    Log.file("[editor] registered ScalaExportPlugin + inspector plugin")
  }
}

/** EditorPlugin that installs the export inspector plugin. */
final class ScalaExportPlugin extends EditorPlugin {
  private var inspector: EditorInspectorPlugin = null

  override def _enter_tree(): Unit = {
    val handle = Godot.interface.classdb_construct_object2(
      StringNames.cached("ScalaExportInspectorPlugin").ptr
    )
    inspector = new EditorInspectorPlugin {}.withHost(handle)
    addInspectorPlugin(inspector)
    Log.file("[editor] ScalaExportPlugin: inspector plugin installed")
  }

  override def _exit_tree(): Unit =
    if (inspector != null) {
      removeInspectorPlugin(inspector)
      inspector = null
    }
}

/** Inspector plugin that recognises `Tscn[T]` scene exports. */
final class ScalaExportInspectorPlugin extends EditorInspectorPlugin {
  override def _can_handle(obj: GodotObject): Boolean = true

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
