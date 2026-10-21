package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Decal`, extends `VisualInstance3D`. */
abstract class Decal extends VisualInstance3D {
  override def godotClassName: String = "Decal"

  /** Decal.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Decal.mb_set_size == null) gdext.classes.Decal.mb_set_size = MethodBind.get("Decal", "set_size", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Decal.mb_set_size, livePtr, size)
  }

  /** Decal.get_size */
  final def getSize(): gdext.builtin.Vector3 = {
    if (gdext.classes.Decal.mb_get_size == null) gdext.classes.Decal.mb_get_size = MethodBind.get("Decal", "get_size", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.Decal.mb_get_size, livePtr)
  }

  /** Decal.set_texture */
  final def setTexture(`type`: Long, texture: Texture2D): Unit = {
    if (gdext.classes.Decal.mb_set_texture == null) gdext.classes.Decal.mb_set_texture = MethodBind.get("Decal", "set_texture", 2086764391L)
    Ptrcall.callVoid2(gdext.classes.Decal.mb_set_texture, livePtr, `type`, Wrappers.handle(texture))
  }

  /** Decal.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(`type`: Long): Texture2D = {
    if (gdext.classes.Decal.mb_get_texture == null) gdext.classes.Decal.mb_get_texture = MethodBind.get("Decal", "get_texture", 3244119503L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.Decal.mb_get_texture, livePtr, `type`))
  }

  /** Decal.set_emission_energy */
  final def setEmissionEnergy(energy: Double): Unit = {
    if (gdext.classes.Decal.mb_set_emission_energy == null) gdext.classes.Decal.mb_set_emission_energy = MethodBind.get("Decal", "set_emission_energy", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Decal.mb_set_emission_energy, livePtr, energy)
  }

  /** Decal.get_emission_energy */
  final def getEmissionEnergy(): Double = {
    if (gdext.classes.Decal.mb_get_emission_energy == null) gdext.classes.Decal.mb_get_emission_energy = MethodBind.get("Decal", "get_emission_energy", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Decal.mb_get_emission_energy, livePtr)
  }

  /** Decal.set_albedo_mix */
  final def setAlbedoMix(energy: Double): Unit = {
    if (gdext.classes.Decal.mb_set_albedo_mix == null) gdext.classes.Decal.mb_set_albedo_mix = MethodBind.get("Decal", "set_albedo_mix", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Decal.mb_set_albedo_mix, livePtr, energy)
  }

  /** Decal.get_albedo_mix */
  final def getAlbedoMix(): Double = {
    if (gdext.classes.Decal.mb_get_albedo_mix == null) gdext.classes.Decal.mb_get_albedo_mix = MethodBind.get("Decal", "get_albedo_mix", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Decal.mb_get_albedo_mix, livePtr)
  }

  /** Decal.set_modulate */
  final def setModulate(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Decal.mb_set_modulate == null) gdext.classes.Decal.mb_set_modulate = MethodBind.get("Decal", "set_modulate", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.Decal.mb_set_modulate, livePtr, color)
  }

  /** Decal.get_modulate */
  final def getModulate(): gdext.builtin.Color = {
    if (gdext.classes.Decal.mb_get_modulate == null) gdext.classes.Decal.mb_get_modulate = MethodBind.get("Decal", "get_modulate", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.Decal.mb_get_modulate, livePtr)
  }

  /** Decal.set_upper_fade */
  final def setUpperFade(fade: Double): Unit = {
    if (gdext.classes.Decal.mb_set_upper_fade == null) gdext.classes.Decal.mb_set_upper_fade = MethodBind.get("Decal", "set_upper_fade", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Decal.mb_set_upper_fade, livePtr, fade)
  }

  /** Decal.get_upper_fade */
  final def getUpperFade(): Double = {
    if (gdext.classes.Decal.mb_get_upper_fade == null) gdext.classes.Decal.mb_get_upper_fade = MethodBind.get("Decal", "get_upper_fade", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Decal.mb_get_upper_fade, livePtr)
  }

  /** Decal.set_lower_fade */
  final def setLowerFade(fade: Double): Unit = {
    if (gdext.classes.Decal.mb_set_lower_fade == null) gdext.classes.Decal.mb_set_lower_fade = MethodBind.get("Decal", "set_lower_fade", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Decal.mb_set_lower_fade, livePtr, fade)
  }

  /** Decal.get_lower_fade */
  final def getLowerFade(): Double = {
    if (gdext.classes.Decal.mb_get_lower_fade == null) gdext.classes.Decal.mb_get_lower_fade = MethodBind.get("Decal", "get_lower_fade", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Decal.mb_get_lower_fade, livePtr)
  }

  /** Decal.set_normal_fade */
  final def setNormalFade(fade: Double): Unit = {
    if (gdext.classes.Decal.mb_set_normal_fade == null) gdext.classes.Decal.mb_set_normal_fade = MethodBind.get("Decal", "set_normal_fade", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Decal.mb_set_normal_fade, livePtr, fade)
  }

  /** Decal.get_normal_fade */
  final def getNormalFade(): Double = {
    if (gdext.classes.Decal.mb_get_normal_fade == null) gdext.classes.Decal.mb_get_normal_fade = MethodBind.get("Decal", "get_normal_fade", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Decal.mb_get_normal_fade, livePtr)
  }

  /** Decal.set_enable_distance_fade */
  final def setEnableDistanceFade(enable: Boolean): Unit = {
    if (gdext.classes.Decal.mb_set_enable_distance_fade == null) gdext.classes.Decal.mb_set_enable_distance_fade = MethodBind.get("Decal", "set_enable_distance_fade", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Decal.mb_set_enable_distance_fade, livePtr, enable)
  }

  /** Decal.is_distance_fade_enabled */
  final def isDistanceFadeEnabled(): Boolean = {
    if (gdext.classes.Decal.mb_is_distance_fade_enabled == null) gdext.classes.Decal.mb_is_distance_fade_enabled = MethodBind.get("Decal", "is_distance_fade_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Decal.mb_is_distance_fade_enabled, livePtr)
  }

  /** Decal.set_distance_fade_begin */
  final def setDistanceFadeBegin(distance: Double): Unit = {
    if (gdext.classes.Decal.mb_set_distance_fade_begin == null) gdext.classes.Decal.mb_set_distance_fade_begin = MethodBind.get("Decal", "set_distance_fade_begin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Decal.mb_set_distance_fade_begin, livePtr, distance)
  }

  /** Decal.get_distance_fade_begin */
  final def getDistanceFadeBegin(): Double = {
    if (gdext.classes.Decal.mb_get_distance_fade_begin == null) gdext.classes.Decal.mb_get_distance_fade_begin = MethodBind.get("Decal", "get_distance_fade_begin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Decal.mb_get_distance_fade_begin, livePtr)
  }

  /** Decal.set_distance_fade_length */
  final def setDistanceFadeLength(distance: Double): Unit = {
    if (gdext.classes.Decal.mb_set_distance_fade_length == null) gdext.classes.Decal.mb_set_distance_fade_length = MethodBind.get("Decal", "set_distance_fade_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Decal.mb_set_distance_fade_length, livePtr, distance)
  }

  /** Decal.get_distance_fade_length */
  final def getDistanceFadeLength(): Double = {
    if (gdext.classes.Decal.mb_get_distance_fade_length == null) gdext.classes.Decal.mb_get_distance_fade_length = MethodBind.get("Decal", "get_distance_fade_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Decal.mb_get_distance_fade_length, livePtr)
  }

  /** Decal.set_cull_mask */
  final def setCullMask(mask: Long): Unit = {
    if (gdext.classes.Decal.mb_set_cull_mask == null) gdext.classes.Decal.mb_set_cull_mask = MethodBind.get("Decal", "set_cull_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Decal.mb_set_cull_mask, livePtr, mask)
  }

  /** Decal.get_cull_mask */
  final def getCullMask(): Long = {
    if (gdext.classes.Decal.mb_get_cull_mask == null) gdext.classes.Decal.mb_get_cull_mask = MethodBind.get("Decal", "get_cull_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Decal.mb_get_cull_mask, livePtr)
  }

}

object Decal {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_albedo_mix: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_albedo_mix: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_upper_fade: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_upper_fade: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lower_fade: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lower_fade: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_normal_fade: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_normal_fade: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_distance_fade: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_distance_fade_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_distance_fade_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_distance_fade_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_distance_fade_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_distance_fade_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cull_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cull_mask: GDExtensionMethodBindPtr = null
}
