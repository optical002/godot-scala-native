package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `FileSystemDock`, extends `EditorDock`. */
abstract class FileSystemDock extends EditorDock {

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

object FileSystemDock {
  /** Class metadata for Gd[FileSystemDock] lifetime management and casting. */
  given GodotClass[FileSystemDock] with {
    def className = "FileSystemDock"
    def isRefCounted = false
    def wrap(o: GodotObject): FileSystemDock = new FileSystemDock {}.withHost(o.objectPtr)
    def unwrap(t: FileSystemDock): GodotObject = t.hostObject
  }
}
