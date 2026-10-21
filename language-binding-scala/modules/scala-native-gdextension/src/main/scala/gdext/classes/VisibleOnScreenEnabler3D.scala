package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisibleOnScreenEnabler3D`, extends `VisibleOnScreenNotifier3D`. */
abstract class VisibleOnScreenEnabler3D extends VisibleOnScreenNotifier3D {
  override def godotClassName: String = "VisibleOnScreenEnabler3D"

  /** VisibleOnScreenEnabler3D.set_enable_mode */
  final def setEnableMode(mode: Long): Unit = {
    if (gdext.classes.VisibleOnScreenEnabler3D.mb_set_enable_mode == null) gdext.classes.VisibleOnScreenEnabler3D.mb_set_enable_mode = MethodBind.get("VisibleOnScreenEnabler3D", "set_enable_mode", 320303646L)
    Ptrcall.callVoid1(gdext.classes.VisibleOnScreenEnabler3D.mb_set_enable_mode, livePtr, mode)
  }

  /** VisibleOnScreenEnabler3D.get_enable_mode */
  final def getEnableMode(): Long = {
    if (gdext.classes.VisibleOnScreenEnabler3D.mb_get_enable_mode == null) gdext.classes.VisibleOnScreenEnabler3D.mb_get_enable_mode = MethodBind.get("VisibleOnScreenEnabler3D", "get_enable_mode", 3352990031L)
    Ptrcall.call0[Long](gdext.classes.VisibleOnScreenEnabler3D.mb_get_enable_mode, livePtr)
  }

}

object VisibleOnScreenEnabler3D {
  private[classes] var mb_set_enable_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_mode: GDExtensionMethodBindPtr = null
}
