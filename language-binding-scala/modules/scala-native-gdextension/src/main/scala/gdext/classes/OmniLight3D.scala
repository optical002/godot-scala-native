package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OmniLight3D`, extends `Light3D`. */
abstract class OmniLight3D extends Light3D {
  override def godotClassName: String = "OmniLight3D"

  /** OmniLight3D.set_shadow_mode */
  final def setShadowMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OmniLight3D", "set_shadow_mode", 121862228L), hostObject.objectPtr, mode)

  /** OmniLight3D.get_shadow_mode */
  final def getShadowMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("OmniLight3D", "get_shadow_mode", 4181586331L), hostObject.objectPtr)

}
