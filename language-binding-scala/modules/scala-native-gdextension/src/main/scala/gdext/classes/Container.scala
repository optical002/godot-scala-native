package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Container`, extends `Control`. */
abstract class Container extends Control {
  override def godotClassName: String = "Container"

  /** Container.queue_sort */
  final def queueSort(): Unit = {
    if (gdext.classes.Container.mb_queue_sort == null) gdext.classes.Container.mb_queue_sort = MethodBind.get("Container", "queue_sort", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Container.mb_queue_sort, livePtr)
  }

  /** Container.fit_child_in_rect */
  final def fitChildInRect(child: Control, rect: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.Container.mb_fit_child_in_rect == null) gdext.classes.Container.mb_fit_child_in_rect = MethodBind.get("Container", "fit_child_in_rect", 1993438598L)
    Ptrcall.callVoid2(gdext.classes.Container.mb_fit_child_in_rect, livePtr, Wrappers.handle(child), rect)
  }

}

object Container {
  private[classes] var mb_queue_sort: GDExtensionMethodBindPtr = null
  private[classes] var mb_fit_child_in_rect: GDExtensionMethodBindPtr = null
}
