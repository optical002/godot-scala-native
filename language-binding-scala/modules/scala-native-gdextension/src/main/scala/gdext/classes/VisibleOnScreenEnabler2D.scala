package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisibleOnScreenEnabler2D`, extends `VisibleOnScreenNotifier2D`. */
abstract class VisibleOnScreenEnabler2D extends VisibleOnScreenNotifier2D {

  /** VisibleOnScreenEnabler2D.set_enable_mode */
  final def setEnableMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisibleOnScreenEnabler2D", "set_enable_mode", 2961788752L), hostObject.objectPtr, mode)

  /** VisibleOnScreenEnabler2D.get_enable_mode */
  final def getEnableMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisibleOnScreenEnabler2D", "get_enable_mode", 2650445576L), hostObject.objectPtr)

}

object VisibleOnScreenEnabler2D {
  /** Class metadata for Gd[VisibleOnScreenEnabler2D] lifetime management and casting. */
  given GodotClass[VisibleOnScreenEnabler2D] with {
    def className = "VisibleOnScreenEnabler2D"
    def isRefCounted = false
    def wrap(o: GodotObject): VisibleOnScreenEnabler2D = new VisibleOnScreenEnabler2D {}.withHost(o.objectPtr)
    def unwrap(t: VisibleOnScreenEnabler2D): GodotObject = t.hostObject
  }
}
