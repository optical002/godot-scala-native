package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `DirectionalLight3D`, extends `Light3D`. */
abstract class DirectionalLight3D extends Light3D {

  /** DirectionalLight3D.set_shadow_mode */
  final def setShadowMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("DirectionalLight3D", "set_shadow_mode", 1261211726L), hostObject.objectPtr, mode)

  /** DirectionalLight3D.get_shadow_mode */
  final def getShadowMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("DirectionalLight3D", "get_shadow_mode", 2765228544L), hostObject.objectPtr)

  /** DirectionalLight3D.set_blend_splits */
  final def setBlendSplits(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("DirectionalLight3D", "set_blend_splits", 2586408642L), hostObject.objectPtr, enabled)

  /** DirectionalLight3D.is_blend_splits_enabled */
  final def isBlendSplitsEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DirectionalLight3D", "is_blend_splits_enabled", 36873697L), hostObject.objectPtr)

  /** DirectionalLight3D.set_sky_mode */
  final def setSkyMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("DirectionalLight3D", "set_sky_mode", 2691194817L), hostObject.objectPtr, mode)

  /** DirectionalLight3D.get_sky_mode */
  final def getSkyMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("DirectionalLight3D", "get_sky_mode", 3819982774L), hostObject.objectPtr)

}

object DirectionalLight3D {
  /** Class metadata for Gd[DirectionalLight3D] lifetime management and casting. */
  given GodotClass[DirectionalLight3D] with {
    def className = "DirectionalLight3D"
    def isRefCounted = false
    def wrap(o: GodotObject): DirectionalLight3D = new DirectionalLight3D {}.withHost(o.objectPtr)
    def unwrap(t: DirectionalLight3D): GodotObject = t.hostObject
  }
}
