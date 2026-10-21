package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Slider`, extends `Range`. */
abstract class Slider extends Range {
  override def godotClassName: String = "Slider"

  /** Slider.set_ticks */
  final def setTicks(count: Long): Unit = {
    if (gdext.classes.Slider.mb_set_ticks == null) gdext.classes.Slider.mb_set_ticks = MethodBind.get("Slider", "set_ticks", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Slider.mb_set_ticks, livePtr, count)
  }

  /** Slider.get_ticks */
  final def getTicks(): Long = {
    if (gdext.classes.Slider.mb_get_ticks == null) gdext.classes.Slider.mb_get_ticks = MethodBind.get("Slider", "get_ticks", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Slider.mb_get_ticks, livePtr)
  }

  /** Slider.get_ticks_on_borders */
  final def getTicksOnBorders(): Boolean = {
    if (gdext.classes.Slider.mb_get_ticks_on_borders == null) gdext.classes.Slider.mb_get_ticks_on_borders = MethodBind.get("Slider", "get_ticks_on_borders", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Slider.mb_get_ticks_on_borders, livePtr)
  }

  /** Slider.set_ticks_on_borders */
  final def setTicksOnBorders(ticks_on_border: Boolean): Unit = {
    if (gdext.classes.Slider.mb_set_ticks_on_borders == null) gdext.classes.Slider.mb_set_ticks_on_borders = MethodBind.get("Slider", "set_ticks_on_borders", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Slider.mb_set_ticks_on_borders, livePtr, ticks_on_border)
  }

  /** Slider.get_ticks_position */
  final def getTicksPosition(): Long = {
    if (gdext.classes.Slider.mb_get_ticks_position == null) gdext.classes.Slider.mb_get_ticks_position = MethodBind.get("Slider", "get_ticks_position", 3567635531L)
    Ptrcall.call0[Long](gdext.classes.Slider.mb_get_ticks_position, livePtr)
  }

  /** Slider.set_ticks_position */
  final def setTicksPosition(ticks_on_border: Long): Unit = {
    if (gdext.classes.Slider.mb_set_ticks_position == null) gdext.classes.Slider.mb_set_ticks_position = MethodBind.get("Slider", "set_ticks_position", 2952822224L)
    Ptrcall.callVoid1(gdext.classes.Slider.mb_set_ticks_position, livePtr, ticks_on_border)
  }

  /** Slider.set_editable */
  final def setEditable(editable: Boolean): Unit = {
    if (gdext.classes.Slider.mb_set_editable == null) gdext.classes.Slider.mb_set_editable = MethodBind.get("Slider", "set_editable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Slider.mb_set_editable, livePtr, editable)
  }

  /** Slider.is_editable */
  final def isEditable(): Boolean = {
    if (gdext.classes.Slider.mb_is_editable == null) gdext.classes.Slider.mb_is_editable = MethodBind.get("Slider", "is_editable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Slider.mb_is_editable, livePtr)
  }

  /** Slider.set_scrollable */
  final def setScrollable(scrollable: Boolean): Unit = {
    if (gdext.classes.Slider.mb_set_scrollable == null) gdext.classes.Slider.mb_set_scrollable = MethodBind.get("Slider", "set_scrollable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Slider.mb_set_scrollable, livePtr, scrollable)
  }

  /** Slider.is_scrollable */
  final def isScrollable(): Boolean = {
    if (gdext.classes.Slider.mb_is_scrollable == null) gdext.classes.Slider.mb_is_scrollable = MethodBind.get("Slider", "is_scrollable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Slider.mb_is_scrollable, livePtr)
  }

}

object Slider {
  private[classes] var mb_set_ticks: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ticks: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ticks_on_borders: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ticks_on_borders: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ticks_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ticks_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_editable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scrollable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_scrollable: GDExtensionMethodBindPtr = null
}
