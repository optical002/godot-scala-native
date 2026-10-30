package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `FileSystemDock`, extends `EditorDock`. */
abstract class FileSystemDock extends EditorDock {
  override def godotClassName: String = "FileSystemDock"

  /** FileSystemDock.navigate_to_path */
  final def navigateToPath(path: String): Unit = {
    if (gdext.classes.FileSystemDock.mb_navigate_to_path == null) gdext.classes.FileSystemDock.mb_navigate_to_path = MethodBind.get("FileSystemDock", "navigate_to_path", 83702148L)
    Ptrcall.callVoid1(gdext.classes.FileSystemDock.mb_navigate_to_path, livePtr, path)
  }

  /** FileSystemDock.add_resource_tooltip_plugin */
  final def addResourceTooltipPlugin(plugin: EditorResourceTooltipPlugin): Unit = {
    if (gdext.classes.FileSystemDock.mb_add_resource_tooltip_plugin == null) gdext.classes.FileSystemDock.mb_add_resource_tooltip_plugin = MethodBind.get("FileSystemDock", "add_resource_tooltip_plugin", 2258356838L)
    Ptrcall.callVoid1(gdext.classes.FileSystemDock.mb_add_resource_tooltip_plugin, livePtr, Wrappers.handle(plugin))
  }

  /** FileSystemDock.remove_resource_tooltip_plugin */
  final def removeResourceTooltipPlugin(plugin: EditorResourceTooltipPlugin): Unit = {
    if (gdext.classes.FileSystemDock.mb_remove_resource_tooltip_plugin == null) gdext.classes.FileSystemDock.mb_remove_resource_tooltip_plugin = MethodBind.get("FileSystemDock", "remove_resource_tooltip_plugin", 2258356838L)
    Ptrcall.callVoid1(gdext.classes.FileSystemDock.mb_remove_resource_tooltip_plugin, livePtr, Wrappers.handle(plugin))
  }

}

object FileSystemDock {
  private[classes] var mb_navigate_to_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_resource_tooltip_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_resource_tooltip_plugin: GDExtensionMethodBindPtr = null
}
