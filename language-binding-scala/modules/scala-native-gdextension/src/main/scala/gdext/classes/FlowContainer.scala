package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `FlowContainer`, extends `Container`. */
abstract class FlowContainer extends Container {

  /** FlowContainer.get_line_count */
  final def getLineCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("FlowContainer", "get_line_count", 3905245786L), hostObject.objectPtr)

  /** FlowContainer.set_alignment */
  final def setAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FlowContainer", "set_alignment", 575250951L), hostObject.objectPtr, alignment)

  /** FlowContainer.get_alignment */
  final def getAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("FlowContainer", "get_alignment", 3749743559L), hostObject.objectPtr)

  /** FlowContainer.set_last_wrap_alignment */
  final def setLastWrapAlignment(last_wrap_alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FlowContainer", "set_last_wrap_alignment", 2899697495L), hostObject.objectPtr, last_wrap_alignment)

  /** FlowContainer.get_last_wrap_alignment */
  final def getLastWrapAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("FlowContainer", "get_last_wrap_alignment", 3743456014L), hostObject.objectPtr)

  /** FlowContainer.set_vertical */
  final def setVertical(vertical: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FlowContainer", "set_vertical", 2586408642L), hostObject.objectPtr, vertical)

  /** FlowContainer.is_vertical */
  final def isVertical(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FlowContainer", "is_vertical", 36873697L), hostObject.objectPtr)

  /** FlowContainer.set_reverse_fill */
  final def setReverseFill(reverse_fill: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FlowContainer", "set_reverse_fill", 2586408642L), hostObject.objectPtr, reverse_fill)

  /** FlowContainer.is_reverse_fill */
  final def isReverseFill(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FlowContainer", "is_reverse_fill", 36873697L), hostObject.objectPtr)

}

object FlowContainer {
  /** Class metadata for Gd[FlowContainer] lifetime management and casting. */
  given GodotClass[FlowContainer] with {
    def className = "FlowContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): FlowContainer = new FlowContainer {}.withHost(o.objectPtr)
    def unwrap(t: FlowContainer): GodotObject = t.hostObject
  }
}
