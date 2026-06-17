package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisibleOnScreenNotifier3D`, extends `VisualInstance3D`. */
abstract class VisibleOnScreenNotifier3D extends VisualInstance3D {

  /** VisibleOnScreenNotifier3D.set_aabb */
  final def setAabb(rect: io.github.optical002.godot.builtin.AABB): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisibleOnScreenNotifier3D", "set_aabb", 259215842L), hostObject.objectPtr, rect)

  /** VisibleOnScreenNotifier3D.is_on_screen */
  final def isOnScreen(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisibleOnScreenNotifier3D", "is_on_screen", 36873697L), hostObject.objectPtr)

}

object VisibleOnScreenNotifier3D {
  /** Class metadata for Gd[VisibleOnScreenNotifier3D] lifetime management and casting. */
  given GodotClass[VisibleOnScreenNotifier3D] with {
    def className = "VisibleOnScreenNotifier3D"
    def isRefCounted = false
    def wrap(o: GodotObject): VisibleOnScreenNotifier3D = new VisibleOnScreenNotifier3D {}.withHost(o.objectPtr)
    def unwrap(t: VisibleOnScreenNotifier3D): GodotObject = t.hostObject
  }
}
