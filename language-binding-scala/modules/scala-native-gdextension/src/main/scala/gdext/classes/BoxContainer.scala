package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `BoxContainer`, extends `Container`. */
abstract class BoxContainer extends Container {

  /** BoxContainer.add_spacer */
  final def addSpacer(begin: Boolean): GodotObject =
    Ptrcall.call1[Boolean, GodotObject](MethodBind.get("BoxContainer", "add_spacer", 1326660695L), hostObject.objectPtr, begin)

  /** BoxContainer.set_alignment */
  final def setAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoxContainer", "set_alignment", 2456745134L), hostObject.objectPtr, alignment)

  /** BoxContainer.get_alignment */
  final def getAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("BoxContainer", "get_alignment", 1915476527L), hostObject.objectPtr)

  /** BoxContainer.set_vertical */
  final def setVertical(vertical: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoxContainer", "set_vertical", 2586408642L), hostObject.objectPtr, vertical)

  /** BoxContainer.is_vertical */
  final def isVertical(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BoxContainer", "is_vertical", 36873697L), hostObject.objectPtr)

}

object BoxContainer {
  /** Class metadata for Gd[BoxContainer] lifetime management and casting. */
  given GodotClass[BoxContainer] with {
    def className = "BoxContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): BoxContainer = new BoxContainer {}.withHost(o.objectPtr)
    def unwrap(t: BoxContainer): GodotObject = t.hostObject
  }
}
