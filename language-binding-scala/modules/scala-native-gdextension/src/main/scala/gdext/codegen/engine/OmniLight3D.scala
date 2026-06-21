package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OmniLight3D`, extends `Light3D`. */
abstract class OmniLight3D extends Light3D {

  /** OmniLight3D.set_shadow_mode */
  final def setShadowMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OmniLight3D", "set_shadow_mode", 121862228L), hostObject.objectPtr, mode)

  /** OmniLight3D.get_shadow_mode */
  final def getShadowMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("OmniLight3D", "get_shadow_mode", 4181586331L), hostObject.objectPtr)

}

object OmniLight3D {
  /** Class metadata for Gd[OmniLight3D] lifetime management and casting. */
  given GodotClass[OmniLight3D] with {
    def className = "OmniLight3D"
    def isRefCounted = false
    def wrap(o: GodotObject): OmniLight3D = new OmniLight3D {}.withHost(o.objectPtr)
    def unwrap(t: OmniLight3D): GodotObject = t.hostObject
  }
}
