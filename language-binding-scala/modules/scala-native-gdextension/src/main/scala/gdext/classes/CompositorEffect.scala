package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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
  final def setEffectCallbackType(effectCallbackType: gdext.classes.CompositorEffect.EffectCallbackType): Unit = {
    if (gdext.classes.CompositorEffect.mb_set_effect_callback_type == null) gdext.classes.CompositorEffect.mb_set_effect_callback_type = MethodBind.get("CompositorEffect", "set_effect_callback_type", 1390728419L)
    Ptrcall.callVoid1(gdext.classes.CompositorEffect.mb_set_effect_callback_type, livePtr, effectCallbackType)
  }

  /** CompositorEffect.get_effect_callback_type */
  final def getEffectCallbackType(): gdext.classes.CompositorEffect.EffectCallbackType = {
    if (gdext.classes.CompositorEffect.mb_get_effect_callback_type == null) gdext.classes.CompositorEffect.mb_get_effect_callback_type = MethodBind.get("CompositorEffect", "get_effect_callback_type", 1221912590L)
    gdext.classes.CompositorEffect.EffectCallbackType(Ptrcall.call0[Long](gdext.classes.CompositorEffect.mb_get_effect_callback_type, livePtr))
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

  /** Godot enum `CompositorEffect.EffectCallbackType`. */
  opaque type EffectCallbackType <: Long = Long

  object EffectCallbackType {
    final val PreOpaque: EffectCallbackType = 0L.asInstanceOf[EffectCallbackType]
    final val PostOpaque: EffectCallbackType = 1L.asInstanceOf[EffectCallbackType]
    final val PostSky: EffectCallbackType = 2L.asInstanceOf[EffectCallbackType]
    final val PreTransparent: EffectCallbackType = 3L.asInstanceOf[EffectCallbackType]
    final val PostTransparent: EffectCallbackType = 4L.asInstanceOf[EffectCallbackType]
    final val Max: EffectCallbackType = 5L.asInstanceOf[EffectCallbackType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EffectCallbackType = value.asInstanceOf[EffectCallbackType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EffectCallbackType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[EffectCallbackType]]

    extension (self: EffectCallbackType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "PreOpaque"
        case 1L => "PostOpaque"
        case 2L => "PostSky"
        case 3L => "PreTransparent"
        case 4L => "PostTransparent"
        case 5L => "Max"
        case other => other.toString
      }
  }
}
