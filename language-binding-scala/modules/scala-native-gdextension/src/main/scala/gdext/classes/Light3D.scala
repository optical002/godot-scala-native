package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Light3D`, extends `VisualInstance3D`. */
abstract class Light3D extends VisualInstance3D {
  override def godotClassName: String = "Light3D"

  /** Light3D.set_editor_only */
  final def setEditorOnly(editor_only: Boolean): Unit = {
    if (gdext.classes.Light3D.mb_set_editor_only == null) gdext.classes.Light3D.mb_set_editor_only = MethodBind.get("Light3D", "set_editor_only", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Light3D.mb_set_editor_only, livePtr, editor_only)
  }

  /** Light3D.is_editor_only */
  final def isEditorOnly(): Boolean = {
    if (gdext.classes.Light3D.mb_is_editor_only == null) gdext.classes.Light3D.mb_is_editor_only = MethodBind.get("Light3D", "is_editor_only", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Light3D.mb_is_editor_only, livePtr)
  }

  /** Light3D.set_param */
  final def setParam(param: Long, value: Double): Unit = {
    if (gdext.classes.Light3D.mb_set_param == null) gdext.classes.Light3D.mb_set_param = MethodBind.get("Light3D", "set_param", 1722734213L)
    Ptrcall.callVoid2(gdext.classes.Light3D.mb_set_param, livePtr, param, value)
  }

  /** Light3D.get_param */
  final def getParam(param: Long): Double = {
    if (gdext.classes.Light3D.mb_get_param == null) gdext.classes.Light3D.mb_get_param = MethodBind.get("Light3D", "get_param", 1844084987L)
    Ptrcall.call1[Long, Double](gdext.classes.Light3D.mb_get_param, livePtr, param)
  }

  /** Light3D.set_shadow */
  final def setShadow(enabled: Boolean): Unit = {
    if (gdext.classes.Light3D.mb_set_shadow == null) gdext.classes.Light3D.mb_set_shadow = MethodBind.get("Light3D", "set_shadow", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Light3D.mb_set_shadow, livePtr, enabled)
  }

  /** Light3D.has_shadow */
  final def hasShadow(): Boolean = {
    if (gdext.classes.Light3D.mb_has_shadow == null) gdext.classes.Light3D.mb_has_shadow = MethodBind.get("Light3D", "has_shadow", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Light3D.mb_has_shadow, livePtr)
  }

  /** Light3D.set_negative */
  final def setNegative(enabled: Boolean): Unit = {
    if (gdext.classes.Light3D.mb_set_negative == null) gdext.classes.Light3D.mb_set_negative = MethodBind.get("Light3D", "set_negative", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Light3D.mb_set_negative, livePtr, enabled)
  }

  /** Light3D.is_negative */
  final def isNegative(): Boolean = {
    if (gdext.classes.Light3D.mb_is_negative == null) gdext.classes.Light3D.mb_is_negative = MethodBind.get("Light3D", "is_negative", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Light3D.mb_is_negative, livePtr)
  }

  /** Light3D.set_cull_mask */
  final def setCullMask(cull_mask: Long): Unit = {
    if (gdext.classes.Light3D.mb_set_cull_mask == null) gdext.classes.Light3D.mb_set_cull_mask = MethodBind.get("Light3D", "set_cull_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Light3D.mb_set_cull_mask, livePtr, cull_mask)
  }

  /** Light3D.get_cull_mask */
  final def getCullMask(): Long = {
    if (gdext.classes.Light3D.mb_get_cull_mask == null) gdext.classes.Light3D.mb_get_cull_mask = MethodBind.get("Light3D", "get_cull_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Light3D.mb_get_cull_mask, livePtr)
  }

  /** Light3D.set_enable_distance_fade */
  final def setEnableDistanceFade(enable: Boolean): Unit = {
    if (gdext.classes.Light3D.mb_set_enable_distance_fade == null) gdext.classes.Light3D.mb_set_enable_distance_fade = MethodBind.get("Light3D", "set_enable_distance_fade", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Light3D.mb_set_enable_distance_fade, livePtr, enable)
  }

  /** Light3D.is_distance_fade_enabled */
  final def isDistanceFadeEnabled(): Boolean = {
    if (gdext.classes.Light3D.mb_is_distance_fade_enabled == null) gdext.classes.Light3D.mb_is_distance_fade_enabled = MethodBind.get("Light3D", "is_distance_fade_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Light3D.mb_is_distance_fade_enabled, livePtr)
  }

  /** Light3D.set_distance_fade_begin */
  final def setDistanceFadeBegin(distance: Double): Unit = {
    if (gdext.classes.Light3D.mb_set_distance_fade_begin == null) gdext.classes.Light3D.mb_set_distance_fade_begin = MethodBind.get("Light3D", "set_distance_fade_begin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Light3D.mb_set_distance_fade_begin, livePtr, distance)
  }

  /** Light3D.get_distance_fade_begin */
  final def getDistanceFadeBegin(): Double = {
    if (gdext.classes.Light3D.mb_get_distance_fade_begin == null) gdext.classes.Light3D.mb_get_distance_fade_begin = MethodBind.get("Light3D", "get_distance_fade_begin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Light3D.mb_get_distance_fade_begin, livePtr)
  }

  /** Light3D.set_distance_fade_shadow */
  final def setDistanceFadeShadow(distance: Double): Unit = {
    if (gdext.classes.Light3D.mb_set_distance_fade_shadow == null) gdext.classes.Light3D.mb_set_distance_fade_shadow = MethodBind.get("Light3D", "set_distance_fade_shadow", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Light3D.mb_set_distance_fade_shadow, livePtr, distance)
  }

  /** Light3D.get_distance_fade_shadow */
  final def getDistanceFadeShadow(): Double = {
    if (gdext.classes.Light3D.mb_get_distance_fade_shadow == null) gdext.classes.Light3D.mb_get_distance_fade_shadow = MethodBind.get("Light3D", "get_distance_fade_shadow", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Light3D.mb_get_distance_fade_shadow, livePtr)
  }

  /** Light3D.set_distance_fade_length */
  final def setDistanceFadeLength(distance: Double): Unit = {
    if (gdext.classes.Light3D.mb_set_distance_fade_length == null) gdext.classes.Light3D.mb_set_distance_fade_length = MethodBind.get("Light3D", "set_distance_fade_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Light3D.mb_set_distance_fade_length, livePtr, distance)
  }

  /** Light3D.get_distance_fade_length */
  final def getDistanceFadeLength(): Double = {
    if (gdext.classes.Light3D.mb_get_distance_fade_length == null) gdext.classes.Light3D.mb_get_distance_fade_length = MethodBind.get("Light3D", "get_distance_fade_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Light3D.mb_get_distance_fade_length, livePtr)
  }

  /** Light3D.set_color */
  final def setColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Light3D.mb_set_color == null) gdext.classes.Light3D.mb_set_color = MethodBind.get("Light3D", "set_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.Light3D.mb_set_color, livePtr, color)
  }

  /** Light3D.get_color */
  final def getColor(): gdext.builtin.Color = {
    if (gdext.classes.Light3D.mb_get_color == null) gdext.classes.Light3D.mb_get_color = MethodBind.get("Light3D", "get_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.Light3D.mb_get_color, livePtr)
  }

  /** Light3D.set_shadow_reverse_cull_face */
  final def setShadowReverseCullFace(enable: Boolean): Unit = {
    if (gdext.classes.Light3D.mb_set_shadow_reverse_cull_face == null) gdext.classes.Light3D.mb_set_shadow_reverse_cull_face = MethodBind.get("Light3D", "set_shadow_reverse_cull_face", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Light3D.mb_set_shadow_reverse_cull_face, livePtr, enable)
  }

  /** Light3D.get_shadow_reverse_cull_face */
  final def getShadowReverseCullFace(): Boolean = {
    if (gdext.classes.Light3D.mb_get_shadow_reverse_cull_face == null) gdext.classes.Light3D.mb_get_shadow_reverse_cull_face = MethodBind.get("Light3D", "get_shadow_reverse_cull_face", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Light3D.mb_get_shadow_reverse_cull_face, livePtr)
  }

  /** Light3D.set_shadow_caster_mask */
  final def setShadowCasterMask(caster_mask: Long): Unit = {
    if (gdext.classes.Light3D.mb_set_shadow_caster_mask == null) gdext.classes.Light3D.mb_set_shadow_caster_mask = MethodBind.get("Light3D", "set_shadow_caster_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Light3D.mb_set_shadow_caster_mask, livePtr, caster_mask)
  }

  /** Light3D.get_shadow_caster_mask */
  final def getShadowCasterMask(): Long = {
    if (gdext.classes.Light3D.mb_get_shadow_caster_mask == null) gdext.classes.Light3D.mb_get_shadow_caster_mask = MethodBind.get("Light3D", "get_shadow_caster_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Light3D.mb_get_shadow_caster_mask, livePtr)
  }

  /** Light3D.set_bake_mode */
  final def setBakeMode(bake_mode: Long): Unit = {
    if (gdext.classes.Light3D.mb_set_bake_mode == null) gdext.classes.Light3D.mb_set_bake_mode = MethodBind.get("Light3D", "set_bake_mode", 37739303L)
    Ptrcall.callVoid1(gdext.classes.Light3D.mb_set_bake_mode, livePtr, bake_mode)
  }

  /** Light3D.get_bake_mode */
  final def getBakeMode(): Long = {
    if (gdext.classes.Light3D.mb_get_bake_mode == null) gdext.classes.Light3D.mb_get_bake_mode = MethodBind.get("Light3D", "get_bake_mode", 371737608L)
    Ptrcall.call0[Long](gdext.classes.Light3D.mb_get_bake_mode, livePtr)
  }

  /** Light3D.set_projector */
  final def setProjector(projector: Texture2D): Unit = {
    if (gdext.classes.Light3D.mb_set_projector == null) gdext.classes.Light3D.mb_set_projector = MethodBind.get("Light3D", "set_projector", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.Light3D.mb_set_projector, livePtr, Wrappers.handle(projector))
  }

  /** Light3D.get_projector. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getProjector(): Texture2D = {
    if (gdext.classes.Light3D.mb_get_projector == null) gdext.classes.Light3D.mb_get_projector = MethodBind.get("Light3D", "get_projector", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.Light3D.mb_get_projector, livePtr))
  }

  /** Light3D.set_temperature */
  final def setTemperature(temperature: Double): Unit = {
    if (gdext.classes.Light3D.mb_set_temperature == null) gdext.classes.Light3D.mb_set_temperature = MethodBind.get("Light3D", "set_temperature", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Light3D.mb_set_temperature, livePtr, temperature)
  }

  /** Light3D.get_temperature */
  final def getTemperature(): Double = {
    if (gdext.classes.Light3D.mb_get_temperature == null) gdext.classes.Light3D.mb_get_temperature = MethodBind.get("Light3D", "get_temperature", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Light3D.mb_get_temperature, livePtr)
  }

  /** Light3D.get_correlated_color */
  final def getCorrelatedColor(): gdext.builtin.Color = {
    if (gdext.classes.Light3D.mb_get_correlated_color == null) gdext.classes.Light3D.mb_get_correlated_color = MethodBind.get("Light3D", "get_correlated_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.Light3D.mb_get_correlated_color, livePtr)
  }

}

object Light3D {
  private[classes] var mb_set_editor_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editor_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_param: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shadow: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_shadow: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_negative: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_negative: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cull_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cull_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_distance_fade: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_distance_fade_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_distance_fade_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_distance_fade_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_distance_fade_shadow: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_distance_fade_shadow: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_distance_fade_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_distance_fade_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shadow_reverse_cull_face: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadow_reverse_cull_face: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shadow_caster_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadow_caster_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bake_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bake_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_projector: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_projector: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_temperature: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_temperature: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_correlated_color: GDExtensionMethodBindPtr = null
}
