package gdext.register.editor

import gdext.{Godot, Log}
import gdext.builtin.StringNames
import gdext.engine.GodotObject
import gdext.classes.{EditorInspectorPlugin, EditorPlugin}
import gdext.register.*

/**
 * Editor-side integration for typed scene (`Tscn[T]`) exports.
 *
 * Installs an [[EditorInspectorPlugin]]; for `Tscn[T]` properties (recorded in
 * [[SceneExportRegistry]]) it knows the required root node type `T`. Registered
 * at the EDITOR init level (tool classes, `isRuntime=false`).
 *
 * Status — the plugin pipeline (editor registration → `editor_add_plugin` →
 * `EditorPlugin._enter_tree` → `add_inspector_plugin` → `_can_handle`/
 * `_parse_property`) is wired and the reusable primitives for a custom picker
 * exist (`Callable`, `Signals.connect`, `SignalRegistration.callDeferred`,
 * `MethodRegistration.registerAction`, a custom `EditorProperty` that renders).
 *
 * **Follow-up (deferred):** a custom property editor that filters the scene
 * picker by root type. Two blockers remain: (1) a child `Control` (e.g. a
 * `Button`) added to an extension-created `EditorProperty` **segfaults reading
 * its theme on enter-tree** ("theme items too early") — unresolved across
 * pre-tree / `_ready` / `call_deferred` / minimal-`addChild` attempts; likely a
 * theme-owner propagation issue for extension `EditorProperty`s. (2) The picker
 * UI also needs engine methods absent from the curated codegen (`PopupMenu.popup`,
 * `DirAccess`/`PackedStringArray` for scanning, `EditorProperty.emit_changed`).
 * Until then the plugin stays inert and the default (unfiltered) PackedScene
 * picker is used.
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
  // Inert: a custom scene-picker editor is the deferred follow-up (see
  // EditorIntegration's docs — blocked on a Godot child-control theme crash and
  // some missing engine bindings). Returning false keeps Godot's default
  // PackedScene picker and stays out of every other inspection.
  override def _can_handle(obj: GodotObject): Boolean = false

  override def _parse_property(
    obj: GodotObject,
    varType: Long,
    name: String,
    hintType: Long,
    hintString: String,
    usage: Long,
    wide: Boolean
  ): Boolean = false
}
