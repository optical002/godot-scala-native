package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRIPBinding`, extends `Resource`. */
abstract class OpenXRIPBinding extends Resource {
  override def godotClassName: String = "OpenXRIPBinding"

  /** OpenXRIPBinding.set_action */
  final def setAction(action: OpenXRAction): Unit = {
    if (gdext.classes.OpenXRIPBinding.mb_set_action == null) gdext.classes.OpenXRIPBinding.mb_set_action = MethodBind.get("OpenXRIPBinding", "set_action", 349361333L)
    Ptrcall.callVoid1(gdext.classes.OpenXRIPBinding.mb_set_action, livePtr, Wrappers.handle(action))
  }

  /** OpenXRIPBinding.get_action. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getAction(): OpenXRAction = {
    if (gdext.classes.OpenXRIPBinding.mb_get_action == null) gdext.classes.OpenXRIPBinding.mb_get_action = MethodBind.get("OpenXRIPBinding", "get_action", 4072409085L)
    Wrappers.owned[OpenXRAction](Ptrcall.call0[Long](gdext.classes.OpenXRIPBinding.mb_get_action, livePtr))
  }

  /** OpenXRIPBinding.set_binding_path */
  final def setBindingPath(bindingPath: String): Unit = {
    if (gdext.classes.OpenXRIPBinding.mb_set_binding_path == null) gdext.classes.OpenXRIPBinding.mb_set_binding_path = MethodBind.get("OpenXRIPBinding", "set_binding_path", 83702148L)
    Ptrcall.callVoid1(gdext.classes.OpenXRIPBinding.mb_set_binding_path, livePtr, bindingPath)
  }

  /** OpenXRIPBinding.get_binding_path */
  final def getBindingPath(): String = {
    if (gdext.classes.OpenXRIPBinding.mb_get_binding_path == null) gdext.classes.OpenXRIPBinding.mb_get_binding_path = MethodBind.get("OpenXRIPBinding", "get_binding_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.OpenXRIPBinding.mb_get_binding_path, livePtr)
  }

  /** OpenXRIPBinding.get_binding_modifier_count */
  final def getBindingModifierCount(): Long = {
    if (gdext.classes.OpenXRIPBinding.mb_get_binding_modifier_count == null) gdext.classes.OpenXRIPBinding.mb_get_binding_modifier_count = MethodBind.get("OpenXRIPBinding", "get_binding_modifier_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OpenXRIPBinding.mb_get_binding_modifier_count, livePtr)
  }

  /** OpenXRIPBinding.get_binding_modifier. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getBindingModifier(index: Long): OpenXRActionBindingModifier = {
    if (gdext.classes.OpenXRIPBinding.mb_get_binding_modifier == null) gdext.classes.OpenXRIPBinding.mb_get_binding_modifier = MethodBind.get("OpenXRIPBinding", "get_binding_modifier", 3538296211L)
    Wrappers.owned[OpenXRActionBindingModifier](Ptrcall.call1[Long, Long](gdext.classes.OpenXRIPBinding.mb_get_binding_modifier, livePtr, index))
  }

  /** OpenXRIPBinding.get_path_count */
  final def getPathCount(): Long = {
    if (gdext.classes.OpenXRIPBinding.mb_get_path_count == null) gdext.classes.OpenXRIPBinding.mb_get_path_count = MethodBind.get("OpenXRIPBinding", "get_path_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OpenXRIPBinding.mb_get_path_count, livePtr)
  }

  /** OpenXRIPBinding.has_path */
  final def hasPath(path: String): Boolean = {
    if (gdext.classes.OpenXRIPBinding.mb_has_path == null) gdext.classes.OpenXRIPBinding.mb_has_path = MethodBind.get("OpenXRIPBinding", "has_path", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.OpenXRIPBinding.mb_has_path, livePtr, path)
  }

  /** OpenXRIPBinding.add_path */
  final def addPath(path: String): Unit = {
    if (gdext.classes.OpenXRIPBinding.mb_add_path == null) gdext.classes.OpenXRIPBinding.mb_add_path = MethodBind.get("OpenXRIPBinding", "add_path", 83702148L)
    Ptrcall.callVoid1(gdext.classes.OpenXRIPBinding.mb_add_path, livePtr, path)
  }

  /** OpenXRIPBinding.remove_path */
  final def removePath(path: String): Unit = {
    if (gdext.classes.OpenXRIPBinding.mb_remove_path == null) gdext.classes.OpenXRIPBinding.mb_remove_path = MethodBind.get("OpenXRIPBinding", "remove_path", 83702148L)
    Ptrcall.callVoid1(gdext.classes.OpenXRIPBinding.mb_remove_path, livePtr, path)
  }

}

object OpenXRIPBinding {
  private[classes] var mb_set_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_binding_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_binding_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_binding_modifier_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_binding_modifier: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_path: GDExtensionMethodBindPtr = null
}
