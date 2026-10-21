package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CompositorEffect`, extends `Resource`. */
abstract class CompositorEffect extends Resource {
  override def godotClassName: String = "CompositorEffect"

  /** CompositorEffect.set_enabled */
  final def setEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.CompositorEffect.mb_set_enabled == null) gdext.classes.CompositorEffect.mb_set_enabled = MethodBind.get("CompositorEffect", "set_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CompositorEffect.mb_set_enabled, livePtr, enabled)
  }

  /** CompositorEffect.get_enabled */
  final def getEnabled(): Boolean = {
    if (gdext.classes.CompositorEffect.mb_get_enabled == null) gdext.classes.CompositorEffect.mb_get_enabled = MethodBind.get("CompositorEffect", "get_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CompositorEffect.mb_get_enabled, livePtr)
  }

  /** CompositorEffect.set_effect_callback_type */
  final def setEffectCallbackType(effect_callback_type: Long): Unit = {
    if (gdext.classes.CompositorEffect.mb_set_effect_callback_type == null) gdext.classes.CompositorEffect.mb_set_effect_callback_type = MethodBind.get("CompositorEffect", "set_effect_callback_type", 1390728419L)
    Ptrcall.callVoid1(gdext.classes.CompositorEffect.mb_set_effect_callback_type, livePtr, effect_callback_type)
  }

  /** CompositorEffect.get_effect_callback_type */
  final def getEffectCallbackType(): Long = {
    if (gdext.classes.CompositorEffect.mb_get_effect_callback_type == null) gdext.classes.CompositorEffect.mb_get_effect_callback_type = MethodBind.get("CompositorEffect", "get_effect_callback_type", 1221912590L)
    Ptrcall.call0[Long](gdext.classes.CompositorEffect.mb_get_effect_callback_type, livePtr)
  }

  /** CompositorEffect.set_access_resolved_color */
  final def setAccessResolvedColor(enable: Boolean): Unit = {
    if (gdext.classes.CompositorEffect.mb_set_access_resolved_color == null) gdext.classes.CompositorEffect.mb_set_access_resolved_color = MethodBind.get("CompositorEffect", "set_access_resolved_color", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CompositorEffect.mb_set_access_resolved_color, livePtr, enable)
  }

  /** CompositorEffect.get_access_resolved_color */
  final def getAccessResolvedColor(): Boolean = {
    if (gdext.classes.CompositorEffect.mb_get_access_resolved_color == null) gdext.classes.CompositorEffect.mb_get_access_resolved_color = MethodBind.get("CompositorEffect", "get_access_resolved_color", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CompositorEffect.mb_get_access_resolved_color, livePtr)
  }

  /** CompositorEffect.set_access_resolved_depth */
  final def setAccessResolvedDepth(enable: Boolean): Unit = {
    if (gdext.classes.CompositorEffect.mb_set_access_resolved_depth == null) gdext.classes.CompositorEffect.mb_set_access_resolved_depth = MethodBind.get("CompositorEffect", "set_access_resolved_depth", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CompositorEffect.mb_set_access_resolved_depth, livePtr, enable)
  }

  /** CompositorEffect.get_access_resolved_depth */
  final def getAccessResolvedDepth(): Boolean = {
    if (gdext.classes.CompositorEffect.mb_get_access_resolved_depth == null) gdext.classes.CompositorEffect.mb_get_access_resolved_depth = MethodBind.get("CompositorEffect", "get_access_resolved_depth", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CompositorEffect.mb_get_access_resolved_depth, livePtr)
  }

  /** CompositorEffect.set_needs_motion_vectors */
  final def setNeedsMotionVectors(enable: Boolean): Unit = {
    if (gdext.classes.CompositorEffect.mb_set_needs_motion_vectors == null) gdext.classes.CompositorEffect.mb_set_needs_motion_vectors = MethodBind.get("CompositorEffect", "set_needs_motion_vectors", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CompositorEffect.mb_set_needs_motion_vectors, livePtr, enable)
  }

  /** CompositorEffect.get_needs_motion_vectors */
  final def getNeedsMotionVectors(): Boolean = {
    if (gdext.classes.CompositorEffect.mb_get_needs_motion_vectors == null) gdext.classes.CompositorEffect.mb_get_needs_motion_vectors = MethodBind.get("CompositorEffect", "get_needs_motion_vectors", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CompositorEffect.mb_get_needs_motion_vectors, livePtr)
  }

  /** CompositorEffect.set_needs_normal_roughness */
  final def setNeedsNormalRoughness(enable: Boolean): Unit = {
    if (gdext.classes.CompositorEffect.mb_set_needs_normal_roughness == null) gdext.classes.CompositorEffect.mb_set_needs_normal_roughness = MethodBind.get("CompositorEffect", "set_needs_normal_roughness", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CompositorEffect.mb_set_needs_normal_roughness, livePtr, enable)
  }

  /** CompositorEffect.get_needs_normal_roughness */
  final def getNeedsNormalRoughness(): Boolean = {
    if (gdext.classes.CompositorEffect.mb_get_needs_normal_roughness == null) gdext.classes.CompositorEffect.mb_get_needs_normal_roughness = MethodBind.get("CompositorEffect", "get_needs_normal_roughness", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CompositorEffect.mb_get_needs_normal_roughness, livePtr)
  }

  /** CompositorEffect.set_needs_separate_specular */
  final def setNeedsSeparateSpecular(enable: Boolean): Unit = {
    if (gdext.classes.CompositorEffect.mb_set_needs_separate_specular == null) gdext.classes.CompositorEffect.mb_set_needs_separate_specular = MethodBind.get("CompositorEffect", "set_needs_separate_specular", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CompositorEffect.mb_set_needs_separate_specular, livePtr, enable)
  }

  /** CompositorEffect.get_needs_separate_specular */
  final def getNeedsSeparateSpecular(): Boolean = {
    if (gdext.classes.CompositorEffect.mb_get_needs_separate_specular == null) gdext.classes.CompositorEffect.mb_get_needs_separate_specular = MethodBind.get("CompositorEffect", "get_needs_separate_specular", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CompositorEffect.mb_get_needs_separate_specular, livePtr)
  }

}

object CompositorEffect {
  private[classes] var mb_set_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_effect_callback_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_effect_callback_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_access_resolved_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_access_resolved_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_access_resolved_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_access_resolved_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_needs_motion_vectors: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_needs_motion_vectors: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_needs_normal_roughness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_needs_normal_roughness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_needs_separate_specular: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_needs_separate_specular: GDExtensionMethodBindPtr = null
}
