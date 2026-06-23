package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Slider`, extends `Range`. */
abstract class Slider extends Range {

  /** Slider.set_ticks */
  final def setTicks(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Slider", "set_ticks", 1286410249L), hostObject.objectPtr, count)

  /** Slider.get_ticks */
  final def getTicks(): Long =
    Ptrcall.call0[Long](MethodBind.get("Slider", "get_ticks", 3905245786L), hostObject.objectPtr)

  /** Slider.get_ticks_on_borders */
  final def getTicksOnBorders(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Slider", "get_ticks_on_borders", 36873697L), hostObject.objectPtr)

  /** Slider.set_ticks_on_borders */
  final def setTicksOnBorders(ticks_on_border: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Slider", "set_ticks_on_borders", 2586408642L), hostObject.objectPtr, ticks_on_border)

  /** Slider.get_ticks_position */
  final def getTicksPosition(): Long =
    Ptrcall.call0[Long](MethodBind.get("Slider", "get_ticks_position", 3567635531L), hostObject.objectPtr)

  /** Slider.set_ticks_position */
  final def setTicksPosition(ticks_on_border: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Slider", "set_ticks_position", 2952822224L), hostObject.objectPtr, ticks_on_border)

  /** Slider.set_editable */
  final def setEditable(editable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Slider", "set_editable", 2586408642L), hostObject.objectPtr, editable)

  /** Slider.is_editable */
  final def isEditable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Slider", "is_editable", 36873697L), hostObject.objectPtr)

  /** Slider.set_scrollable */
  final def setScrollable(scrollable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Slider", "set_scrollable", 2586408642L), hostObject.objectPtr, scrollable)

  /** Slider.is_scrollable */
  final def isScrollable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Slider", "is_scrollable", 36873697L), hostObject.objectPtr)

}

object Slider {
  /** Class metadata for Gd[Slider] lifetime management and casting. */
  given GodotClass[Slider] with {
    def className = "Slider"
    def isRefCounted = false
    def wrap(o: GodotObject): Slider = new Slider {}.withHost(o.objectPtr)
    def unwrap(t: Slider): GodotObject = t.hostObject
  }
}
