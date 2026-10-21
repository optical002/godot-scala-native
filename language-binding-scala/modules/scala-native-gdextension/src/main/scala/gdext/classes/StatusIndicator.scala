package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `StatusIndicator`, extends `Node`. */
abstract class StatusIndicator extends Node {
  override def godotClassName: String = "StatusIndicator"

  /** StatusIndicator.set_tooltip */
  final def setTooltip(tooltip: String): Unit = {
    if (gdext.classes.StatusIndicator.mb_set_tooltip == null) gdext.classes.StatusIndicator.mb_set_tooltip = MethodBind.get("StatusIndicator", "set_tooltip", 83702148L)
    Ptrcall.callVoid1(gdext.classes.StatusIndicator.mb_set_tooltip, livePtr, tooltip)
  }

  /** StatusIndicator.get_tooltip */
  final def getTooltip(): String = {
    if (gdext.classes.StatusIndicator.mb_get_tooltip == null) gdext.classes.StatusIndicator.mb_get_tooltip = MethodBind.get("StatusIndicator", "get_tooltip", 201670096L)
    Ptrcall.call0[String](gdext.classes.StatusIndicator.mb_get_tooltip, livePtr)
  }

  /** StatusIndicator.set_icon */
  final def setIcon(texture: Texture2D): Unit = {
    if (gdext.classes.StatusIndicator.mb_set_icon == null) gdext.classes.StatusIndicator.mb_set_icon = MethodBind.get("StatusIndicator", "set_icon", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.StatusIndicator.mb_set_icon, livePtr, Wrappers.handle(texture))
  }

  /** StatusIndicator.get_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getIcon(): Texture2D = {
    if (gdext.classes.StatusIndicator.mb_get_icon == null) gdext.classes.StatusIndicator.mb_get_icon = MethodBind.get("StatusIndicator", "get_icon", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.StatusIndicator.mb_get_icon, livePtr))
  }

  /** StatusIndicator.set_visible */
  final def setVisible(visible: Boolean): Unit = {
    if (gdext.classes.StatusIndicator.mb_set_visible == null) gdext.classes.StatusIndicator.mb_set_visible = MethodBind.get("StatusIndicator", "set_visible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.StatusIndicator.mb_set_visible, livePtr, visible)
  }

  /** StatusIndicator.is_visible */
  final def isVisible(): Boolean = {
    if (gdext.classes.StatusIndicator.mb_is_visible == null) gdext.classes.StatusIndicator.mb_is_visible = MethodBind.get("StatusIndicator", "is_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.StatusIndicator.mb_is_visible, livePtr)
  }

  /** StatusIndicator.get_rect */
  final def getRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.StatusIndicator.mb_get_rect == null) gdext.classes.StatusIndicator.mb_get_rect = MethodBind.get("StatusIndicator", "get_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.StatusIndicator.mb_get_rect, livePtr)
  }

}

object StatusIndicator {
  private[classes] var mb_set_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rect: GDExtensionMethodBindPtr = null
}
