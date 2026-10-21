package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ResourcePreloader`, extends `Node`. */
abstract class ResourcePreloader extends Node {
  override def godotClassName: String = "ResourcePreloader"

  /** ResourcePreloader.add_resource */
  final def addResource(name: gdext.builtin.StringName, resource: Resource): Unit = {
    if (gdext.classes.ResourcePreloader.mb_add_resource == null) gdext.classes.ResourcePreloader.mb_add_resource = MethodBind.get("ResourcePreloader", "add_resource", 1168801743L)
    Ptrcall.callVoid2(gdext.classes.ResourcePreloader.mb_add_resource, livePtr, name, Wrappers.handle(resource))
  }

  /** ResourcePreloader.remove_resource */
  final def removeResource(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.ResourcePreloader.mb_remove_resource == null) gdext.classes.ResourcePreloader.mb_remove_resource = MethodBind.get("ResourcePreloader", "remove_resource", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.ResourcePreloader.mb_remove_resource, livePtr, name)
  }

  /** ResourcePreloader.rename_resource */
  final def renameResource(name: gdext.builtin.StringName, newname: gdext.builtin.StringName): Unit = {
    if (gdext.classes.ResourcePreloader.mb_rename_resource == null) gdext.classes.ResourcePreloader.mb_rename_resource = MethodBind.get("ResourcePreloader", "rename_resource", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.ResourcePreloader.mb_rename_resource, livePtr, name, newname)
  }

  /** ResourcePreloader.has_resource */
  final def hasResource(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.ResourcePreloader.mb_has_resource == null) gdext.classes.ResourcePreloader.mb_has_resource = MethodBind.get("ResourcePreloader", "has_resource", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.ResourcePreloader.mb_has_resource, livePtr, name)
  }

  /** ResourcePreloader.get_resource. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getResource(name: gdext.builtin.StringName): Resource = {
    if (gdext.classes.ResourcePreloader.mb_get_resource == null) gdext.classes.ResourcePreloader.mb_get_resource = MethodBind.get("ResourcePreloader", "get_resource", 3742749261L)
    Wrappers.owned[Resource](Ptrcall.call1[gdext.builtin.StringName, Long](gdext.classes.ResourcePreloader.mb_get_resource, livePtr, name))
  }

}

object ResourcePreloader {
  private[classes] var mb_add_resource: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_resource: GDExtensionMethodBindPtr = null
  private[classes] var mb_rename_resource: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_resource: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_resource: GDExtensionMethodBindPtr = null
}
