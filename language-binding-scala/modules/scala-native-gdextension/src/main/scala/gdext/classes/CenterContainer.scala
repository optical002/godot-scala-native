package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CenterContainer`, extends `Container`. */
abstract class CenterContainer extends Container {

  /** CenterContainer.set_use_top_left */
  final def setUseTopLeft(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CenterContainer", "set_use_top_left", 2586408642L), hostObject.objectPtr, enable)

  /** CenterContainer.is_using_top_left */
  final def isUsingTopLeft(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CenterContainer", "is_using_top_left", 36873697L), hostObject.objectPtr)

}

object CenterContainer {
  /** Class metadata for Gd[CenterContainer] lifetime management and casting. */
  given GodotClass[CenterContainer] with {
    def className = "CenterContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): CenterContainer = new CenterContainer {}.withHost(o.objectPtr)
    def unwrap(t: CenterContainer): GodotObject = t.hostObject
  }
}
