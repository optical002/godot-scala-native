package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CompositorEffect`, extends `Resource`. */
abstract class CompositorEffect extends Resource {

  /** CompositorEffect.set_enabled */
  final def setEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CompositorEffect", "set_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** CompositorEffect.get_enabled */
  final def getEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CompositorEffect", "get_enabled", 36873697L), hostObject.objectPtr)

  /** CompositorEffect.set_effect_callback_type */
  final def setEffectCallbackType(effect_callback_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CompositorEffect", "set_effect_callback_type", 1390728419L), hostObject.objectPtr, effect_callback_type)

  /** CompositorEffect.get_effect_callback_type */
  final def getEffectCallbackType(): Long =
    Ptrcall.call0[Long](MethodBind.get("CompositorEffect", "get_effect_callback_type", 1221912590L), hostObject.objectPtr)

  /** CompositorEffect.set_access_resolved_color */
  final def setAccessResolvedColor(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CompositorEffect", "set_access_resolved_color", 2586408642L), hostObject.objectPtr, enable)

  /** CompositorEffect.get_access_resolved_color */
  final def getAccessResolvedColor(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CompositorEffect", "get_access_resolved_color", 36873697L), hostObject.objectPtr)

  /** CompositorEffect.set_access_resolved_depth */
  final def setAccessResolvedDepth(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CompositorEffect", "set_access_resolved_depth", 2586408642L), hostObject.objectPtr, enable)

  /** CompositorEffect.get_access_resolved_depth */
  final def getAccessResolvedDepth(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CompositorEffect", "get_access_resolved_depth", 36873697L), hostObject.objectPtr)

  /** CompositorEffect.set_needs_motion_vectors */
  final def setNeedsMotionVectors(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CompositorEffect", "set_needs_motion_vectors", 2586408642L), hostObject.objectPtr, enable)

  /** CompositorEffect.get_needs_motion_vectors */
  final def getNeedsMotionVectors(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CompositorEffect", "get_needs_motion_vectors", 36873697L), hostObject.objectPtr)

  /** CompositorEffect.set_needs_normal_roughness */
  final def setNeedsNormalRoughness(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CompositorEffect", "set_needs_normal_roughness", 2586408642L), hostObject.objectPtr, enable)

  /** CompositorEffect.get_needs_normal_roughness */
  final def getNeedsNormalRoughness(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CompositorEffect", "get_needs_normal_roughness", 36873697L), hostObject.objectPtr)

  /** CompositorEffect.set_needs_separate_specular */
  final def setNeedsSeparateSpecular(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CompositorEffect", "set_needs_separate_specular", 2586408642L), hostObject.objectPtr, enable)

  /** CompositorEffect.get_needs_separate_specular */
  final def getNeedsSeparateSpecular(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CompositorEffect", "get_needs_separate_specular", 36873697L), hostObject.objectPtr)

}

object CompositorEffect {
  /** Class metadata for Gd[CompositorEffect] lifetime management and casting. */
  given GodotClass[CompositorEffect] with {
    def className = "CompositorEffect"
    def isRefCounted = true
    def wrap(o: GodotObject): CompositorEffect = new CompositorEffect {}.withHost(o.objectPtr)
    def unwrap(t: CompositorEffect): GodotObject = t.hostObject
  }
}
