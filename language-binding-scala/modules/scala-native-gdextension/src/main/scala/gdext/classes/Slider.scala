package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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
  final def setTicksOnBorders(ticksOnBorder: Boolean): Unit = {
    if (gdext.classes.Slider.mb_set_ticks_on_borders == null) gdext.classes.Slider.mb_set_ticks_on_borders = MethodBind.get("Slider", "set_ticks_on_borders", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Slider.mb_set_ticks_on_borders, livePtr, ticksOnBorder)
  }

  /** Slider.get_ticks_position */
  final def getTicksPosition(): gdext.classes.Slider.TickPosition = {
    if (gdext.classes.Slider.mb_get_ticks_position == null) gdext.classes.Slider.mb_get_ticks_position = MethodBind.get("Slider", "get_ticks_position", 3567635531L)
    gdext.classes.Slider.TickPosition(Ptrcall.call0[Long](gdext.classes.Slider.mb_get_ticks_position, livePtr))
  }

  /** Slider.set_ticks_position */
  final def setTicksPosition(ticksOnBorder: gdext.classes.Slider.TickPosition): Unit = {
    if (gdext.classes.Slider.mb_set_ticks_position == null) gdext.classes.Slider.mb_set_ticks_position = MethodBind.get("Slider", "set_ticks_position", 2952822224L)
    Ptrcall.callVoid1(gdext.classes.Slider.mb_set_ticks_position, livePtr, ticksOnBorder)
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

  /** Godot enum `Slider.TickPosition`. */
  opaque type TickPosition <: Long = Long

  object TickPosition {
    final val BottomRight: TickPosition = 0L.asInstanceOf[TickPosition]
    final val TopLeft: TickPosition = 1L.asInstanceOf[TickPosition]
    final val Both: TickPosition = 2L.asInstanceOf[TickPosition]
    final val Center: TickPosition = 3L.asInstanceOf[TickPosition]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TickPosition = value.asInstanceOf[TickPosition]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TickPosition] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[TickPosition]]

    extension (self: TickPosition)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "BottomRight"
        case 1L => "TopLeft"
        case 2L => "Both"
        case 3L => "Center"
        case other => other.toString
      }
  }
}
