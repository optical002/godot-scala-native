package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisibleOnScreenEnabler3D`, extends `VisibleOnScreenNotifier3D`. */
abstract class VisibleOnScreenEnabler3D extends VisibleOnScreenNotifier3D {
  override def godotClassName: String = "VisibleOnScreenEnabler3D"

  /** VisibleOnScreenEnabler3D.set_enable_mode */
  final def setEnableMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisibleOnScreenEnabler3D", "set_enable_mode", 320303646L), hostObject.objectPtr, mode)

  /** VisibleOnScreenEnabler3D.get_enable_mode */
  final def getEnableMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisibleOnScreenEnabler3D", "get_enable_mode", 3352990031L), hostObject.objectPtr)

}
