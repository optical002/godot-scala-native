package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisibleOnScreenEnabler3D`, extends `VisibleOnScreenNotifier3D`. */
abstract class VisibleOnScreenEnabler3D extends VisibleOnScreenNotifier3D {

  /** VisibleOnScreenEnabler3D.set_enable_mode */
  final def setEnableMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisibleOnScreenEnabler3D", "set_enable_mode", 320303646L), hostObject.objectPtr, mode)

  /** VisibleOnScreenEnabler3D.get_enable_mode */
  final def getEnableMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisibleOnScreenEnabler3D", "get_enable_mode", 3352990031L), hostObject.objectPtr)

}

object VisibleOnScreenEnabler3D {
  /** Class metadata for Gd[VisibleOnScreenEnabler3D] lifetime management and casting. */
  given GodotClass[VisibleOnScreenEnabler3D] with {
    def className = "VisibleOnScreenEnabler3D"
    def isRefCounted = false
    def wrap(o: GodotObject): VisibleOnScreenEnabler3D = new VisibleOnScreenEnabler3D {}.withHost(o.objectPtr)
    def unwrap(t: VisibleOnScreenEnabler3D): GodotObject = t.hostObject
  }
}
