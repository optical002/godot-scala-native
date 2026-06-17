package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `SubViewportContainer`, extends `Container`. */
abstract class SubViewportContainer extends Container {

  /** SubViewportContainer.set_stretch */
  final def setStretch(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SubViewportContainer", "set_stretch", 2586408642L), hostObject.objectPtr, enable)

  /** SubViewportContainer.is_stretch_enabled */
  final def isStretchEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SubViewportContainer", "is_stretch_enabled", 36873697L), hostObject.objectPtr)

  /** SubViewportContainer.set_stretch_shrink */
  final def setStretchShrink(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SubViewportContainer", "set_stretch_shrink", 1286410249L), hostObject.objectPtr, amount)

  /** SubViewportContainer.get_stretch_shrink */
  final def getStretchShrink(): Long =
    Ptrcall.call0[Long](MethodBind.get("SubViewportContainer", "get_stretch_shrink", 3905245786L), hostObject.objectPtr)

  /** SubViewportContainer.set_mouse_target */
  final def setMouseTarget(amount: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SubViewportContainer", "set_mouse_target", 2586408642L), hostObject.objectPtr, amount)

  /** SubViewportContainer.is_mouse_target_enabled */
  final def isMouseTargetEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SubViewportContainer", "is_mouse_target_enabled", 2240911060L), hostObject.objectPtr)

}

object SubViewportContainer {
  /** Class metadata for Gd[SubViewportContainer] lifetime management and casting. */
  given GodotClass[SubViewportContainer] with {
    def className = "SubViewportContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): SubViewportContainer = new SubViewportContainer {}.withHost(o.objectPtr)
    def unwrap(t: SubViewportContainer): GodotObject = t.hostObject
  }
}
