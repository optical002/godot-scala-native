package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OmniLight3D`, extends `Light3D`. */
abstract class OmniLight3D extends Light3D {
  override def godotClassName: String = "OmniLight3D"

  /** OmniLight3D.set_shadow_mode */
  final def setShadowMode(mode: Long): Unit = {
    if (gdext.classes.OmniLight3D.mb_set_shadow_mode == null) gdext.classes.OmniLight3D.mb_set_shadow_mode = MethodBind.get("OmniLight3D", "set_shadow_mode", 121862228L)
    Ptrcall.callVoid1(gdext.classes.OmniLight3D.mb_set_shadow_mode, livePtr, mode)
  }

  /** OmniLight3D.get_shadow_mode */
  final def getShadowMode(): Long = {
    if (gdext.classes.OmniLight3D.mb_get_shadow_mode == null) gdext.classes.OmniLight3D.mb_get_shadow_mode = MethodBind.get("OmniLight3D", "get_shadow_mode", 4181586331L)
    Ptrcall.call0[Long](gdext.classes.OmniLight3D.mb_get_shadow_mode, livePtr)
  }

}

object OmniLight3D {
  private[classes] var mb_set_shadow_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadow_mode: GDExtensionMethodBindPtr = null
}
