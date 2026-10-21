package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeFrame`, extends `VisualShaderNodeResizableBase`. */
abstract class VisualShaderNodeFrame extends VisualShaderNodeResizableBase {
  override def godotClassName: String = "VisualShaderNodeFrame"

  /** VisualShaderNodeFrame.set_title */
  final def setTitle(title: String): Unit = {
    if (gdext.classes.VisualShaderNodeFrame.mb_set_title == null) gdext.classes.VisualShaderNodeFrame.mb_set_title = MethodBind.get("VisualShaderNodeFrame", "set_title", 83702148L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFrame.mb_set_title, livePtr, title)
  }

  /** VisualShaderNodeFrame.get_title */
  final def getTitle(): String = {
    if (gdext.classes.VisualShaderNodeFrame.mb_get_title == null) gdext.classes.VisualShaderNodeFrame.mb_get_title = MethodBind.get("VisualShaderNodeFrame", "get_title", 201670096L)
    Ptrcall.call0[String](gdext.classes.VisualShaderNodeFrame.mb_get_title, livePtr)
  }

  /** VisualShaderNodeFrame.set_tint_color_enabled */
  final def setTintColorEnabled(enable: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeFrame.mb_set_tint_color_enabled == null) gdext.classes.VisualShaderNodeFrame.mb_set_tint_color_enabled = MethodBind.get("VisualShaderNodeFrame", "set_tint_color_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFrame.mb_set_tint_color_enabled, livePtr, enable)
  }

  /** VisualShaderNodeFrame.is_tint_color_enabled */
  final def isTintColorEnabled(): Boolean = {
    if (gdext.classes.VisualShaderNodeFrame.mb_is_tint_color_enabled == null) gdext.classes.VisualShaderNodeFrame.mb_is_tint_color_enabled = MethodBind.get("VisualShaderNodeFrame", "is_tint_color_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeFrame.mb_is_tint_color_enabled, livePtr)
  }

  /** VisualShaderNodeFrame.set_tint_color */
  final def setTintColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.VisualShaderNodeFrame.mb_set_tint_color == null) gdext.classes.VisualShaderNodeFrame.mb_set_tint_color = MethodBind.get("VisualShaderNodeFrame", "set_tint_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFrame.mb_set_tint_color, livePtr, color)
  }

  /** VisualShaderNodeFrame.get_tint_color */
  final def getTintColor(): gdext.builtin.Color = {
    if (gdext.classes.VisualShaderNodeFrame.mb_get_tint_color == null) gdext.classes.VisualShaderNodeFrame.mb_get_tint_color = MethodBind.get("VisualShaderNodeFrame", "get_tint_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.VisualShaderNodeFrame.mb_get_tint_color, livePtr)
  }

  /** VisualShaderNodeFrame.set_autoshrink_enabled */
  final def setAutoshrinkEnabled(enable: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeFrame.mb_set_autoshrink_enabled == null) gdext.classes.VisualShaderNodeFrame.mb_set_autoshrink_enabled = MethodBind.get("VisualShaderNodeFrame", "set_autoshrink_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFrame.mb_set_autoshrink_enabled, livePtr, enable)
  }

  /** VisualShaderNodeFrame.is_autoshrink_enabled */
  final def isAutoshrinkEnabled(): Boolean = {
    if (gdext.classes.VisualShaderNodeFrame.mb_is_autoshrink_enabled == null) gdext.classes.VisualShaderNodeFrame.mb_is_autoshrink_enabled = MethodBind.get("VisualShaderNodeFrame", "is_autoshrink_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeFrame.mb_is_autoshrink_enabled, livePtr)
  }

  /** VisualShaderNodeFrame.add_attached_node */
  final def addAttachedNode(node: Long): Unit = {
    if (gdext.classes.VisualShaderNodeFrame.mb_add_attached_node == null) gdext.classes.VisualShaderNodeFrame.mb_add_attached_node = MethodBind.get("VisualShaderNodeFrame", "add_attached_node", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFrame.mb_add_attached_node, livePtr, node)
  }

  /** VisualShaderNodeFrame.remove_attached_node */
  final def removeAttachedNode(node: Long): Unit = {
    if (gdext.classes.VisualShaderNodeFrame.mb_remove_attached_node == null) gdext.classes.VisualShaderNodeFrame.mb_remove_attached_node = MethodBind.get("VisualShaderNodeFrame", "remove_attached_node", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFrame.mb_remove_attached_node, livePtr, node)
  }

}

object VisualShaderNodeFrame {
  private[classes] var mb_set_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tint_color_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_tint_color_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tint_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tint_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autoshrink_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_autoshrink_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_attached_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_attached_node: GDExtensionMethodBindPtr = null
}
