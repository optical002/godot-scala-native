package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisibleOnScreenNotifier2D`, extends `Node2D`. */
abstract class VisibleOnScreenNotifier2D extends Node2D {
  override def godotClassName: String = "VisibleOnScreenNotifier2D"

  /** VisibleOnScreenNotifier2D.set_rect */
  final def setRect(rect: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.VisibleOnScreenNotifier2D.mb_set_rect == null) gdext.classes.VisibleOnScreenNotifier2D.mb_set_rect = MethodBind.get("VisibleOnScreenNotifier2D", "set_rect", 2046264180L)
    Ptrcall.callVoid1(gdext.classes.VisibleOnScreenNotifier2D.mb_set_rect, livePtr, rect)
  }

  /** VisibleOnScreenNotifier2D.get_rect */
  final def getRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.VisibleOnScreenNotifier2D.mb_get_rect == null) gdext.classes.VisibleOnScreenNotifier2D.mb_get_rect = MethodBind.get("VisibleOnScreenNotifier2D", "get_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.VisibleOnScreenNotifier2D.mb_get_rect, livePtr)
  }

  /** VisibleOnScreenNotifier2D.set_show_rect */
  final def setShowRect(show_rect: Boolean): Unit = {
    if (gdext.classes.VisibleOnScreenNotifier2D.mb_set_show_rect == null) gdext.classes.VisibleOnScreenNotifier2D.mb_set_show_rect = MethodBind.get("VisibleOnScreenNotifier2D", "set_show_rect", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisibleOnScreenNotifier2D.mb_set_show_rect, livePtr, show_rect)
  }

  /** VisibleOnScreenNotifier2D.is_showing_rect */
  final def isShowingRect(): Boolean = {
    if (gdext.classes.VisibleOnScreenNotifier2D.mb_is_showing_rect == null) gdext.classes.VisibleOnScreenNotifier2D.mb_is_showing_rect = MethodBind.get("VisibleOnScreenNotifier2D", "is_showing_rect", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisibleOnScreenNotifier2D.mb_is_showing_rect, livePtr)
  }

  /** VisibleOnScreenNotifier2D.is_on_screen */
  final def isOnScreen(): Boolean = {
    if (gdext.classes.VisibleOnScreenNotifier2D.mb_is_on_screen == null) gdext.classes.VisibleOnScreenNotifier2D.mb_is_on_screen = MethodBind.get("VisibleOnScreenNotifier2D", "is_on_screen", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisibleOnScreenNotifier2D.mb_is_on_screen, livePtr)
  }

}

object VisibleOnScreenNotifier2D {
  private[classes] var mb_set_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_show_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_showing_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_on_screen: GDExtensionMethodBindPtr = null
}
