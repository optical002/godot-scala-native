package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisibleOnScreenEnabler2D`, extends `VisibleOnScreenNotifier2D`. */
abstract class VisibleOnScreenEnabler2D extends VisibleOnScreenNotifier2D {
  override def godotClassName: String = "VisibleOnScreenEnabler2D"

  /** VisibleOnScreenEnabler2D.set_enable_mode */
  final def setEnableMode(mode: Long): Unit = {
    if (gdext.classes.VisibleOnScreenEnabler2D.mb_set_enable_mode == null) gdext.classes.VisibleOnScreenEnabler2D.mb_set_enable_mode = MethodBind.get("VisibleOnScreenEnabler2D", "set_enable_mode", 2961788752L)
    Ptrcall.callVoid1(gdext.classes.VisibleOnScreenEnabler2D.mb_set_enable_mode, livePtr, mode)
  }

  /** VisibleOnScreenEnabler2D.get_enable_mode */
  final def getEnableMode(): Long = {
    if (gdext.classes.VisibleOnScreenEnabler2D.mb_get_enable_mode == null) gdext.classes.VisibleOnScreenEnabler2D.mb_get_enable_mode = MethodBind.get("VisibleOnScreenEnabler2D", "get_enable_mode", 2650445576L)
    Ptrcall.call0[Long](gdext.classes.VisibleOnScreenEnabler2D.mb_get_enable_mode, livePtr)
  }

}

object VisibleOnScreenEnabler2D {
  private[classes] var mb_set_enable_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_mode: GDExtensionMethodBindPtr = null
}
