package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `FileSystemDock`, extends `EditorDock`. */
abstract class FileSystemDock extends EditorDock {
  override def godotClassName: String = "FileSystemDock"

  /** FileSystemDock.navigate_to_path */
  final def navigateToPath(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileSystemDock", "navigate_to_path", 83702148L), hostObject.objectPtr, path)

  /** FileSystemDock.add_resource_tooltip_plugin */
  final def addResourceTooltipPlugin(plugin: EditorResourceTooltipPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileSystemDock", "add_resource_tooltip_plugin", 2258356838L), hostObject.objectPtr, plugin.hostObject)

  /** FileSystemDock.remove_resource_tooltip_plugin */
  final def removeResourceTooltipPlugin(plugin: EditorResourceTooltipPlugin): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileSystemDock", "remove_resource_tooltip_plugin", 2258356838L), hostObject.objectPtr, plugin.hostObject)

}
