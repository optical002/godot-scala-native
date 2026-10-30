package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RenderSceneBuffersConfiguration`, extends `RefCounted`. */
abstract class RenderSceneBuffersConfiguration extends RefCounted {
  override def godotClassName: String = "RenderSceneBuffersConfiguration"

  /** RenderSceneBuffersConfiguration.get_internal_size */
  final def getInternalSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_get_internal_size == null) gdext.classes.RenderSceneBuffersConfiguration.mb_get_internal_size = MethodBind.get("RenderSceneBuffersConfiguration", "get_internal_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.RenderSceneBuffersConfiguration.mb_get_internal_size, livePtr)
  }

  /** RenderSceneBuffersConfiguration.set_internal_size */
  final def setInternalSize(internalSize: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_set_internal_size == null) gdext.classes.RenderSceneBuffersConfiguration.mb_set_internal_size = MethodBind.get("RenderSceneBuffersConfiguration", "set_internal_size", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.RenderSceneBuffersConfiguration.mb_set_internal_size, livePtr, internalSize)
  }

  /** RenderSceneBuffersConfiguration.get_target_size */
  final def getTargetSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_get_target_size == null) gdext.classes.RenderSceneBuffersConfiguration.mb_get_target_size = MethodBind.get("RenderSceneBuffersConfiguration", "get_target_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.RenderSceneBuffersConfiguration.mb_get_target_size, livePtr)
  }

  /** RenderSceneBuffersConfiguration.set_target_size */
  final def setTargetSize(targetSize: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_set_target_size == null) gdext.classes.RenderSceneBuffersConfiguration.mb_set_target_size = MethodBind.get("RenderSceneBuffersConfiguration", "set_target_size", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.RenderSceneBuffersConfiguration.mb_set_target_size, livePtr, targetSize)
  }

  /** RenderSceneBuffersConfiguration.get_view_count */
  final def getViewCount(): Long = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_get_view_count == null) gdext.classes.RenderSceneBuffersConfiguration.mb_get_view_count = MethodBind.get("RenderSceneBuffersConfiguration", "get_view_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RenderSceneBuffersConfiguration.mb_get_view_count, livePtr)
  }

  /** RenderSceneBuffersConfiguration.set_view_count */
  final def setViewCount(viewCount: Long): Unit = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_set_view_count == null) gdext.classes.RenderSceneBuffersConfiguration.mb_set_view_count = MethodBind.get("RenderSceneBuffersConfiguration", "set_view_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RenderSceneBuffersConfiguration.mb_set_view_count, livePtr, viewCount)
  }

  /** RenderSceneBuffersConfiguration.get_scaling_3d_mode */
  final def getScaling3dMode(): gdext.classes.RenderingServer.ViewportScaling3DMode = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_get_scaling_3d_mode == null) gdext.classes.RenderSceneBuffersConfiguration.mb_get_scaling_3d_mode = MethodBind.get("RenderSceneBuffersConfiguration", "get_scaling_3d_mode", 976778074L)
    gdext.classes.RenderingServer.ViewportScaling3DMode(Ptrcall.call0[Long](gdext.classes.RenderSceneBuffersConfiguration.mb_get_scaling_3d_mode, livePtr))
  }

  /** RenderSceneBuffersConfiguration.set_scaling_3d_mode */
  final def setScaling3dMode(scaling3dMode: gdext.classes.RenderingServer.ViewportScaling3DMode): Unit = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_set_scaling_3d_mode == null) gdext.classes.RenderSceneBuffersConfiguration.mb_set_scaling_3d_mode = MethodBind.get("RenderSceneBuffersConfiguration", "set_scaling_3d_mode", 447477857L)
    Ptrcall.callVoid1(gdext.classes.RenderSceneBuffersConfiguration.mb_set_scaling_3d_mode, livePtr, scaling3dMode)
  }

  /** RenderSceneBuffersConfiguration.get_msaa_3d */
  final def getMsaa3d(): gdext.classes.RenderingServer.ViewportMSAA = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_get_msaa_3d == null) gdext.classes.RenderSceneBuffersConfiguration.mb_get_msaa_3d = MethodBind.get("RenderSceneBuffersConfiguration", "get_msaa_3d", 3109158617L)
    gdext.classes.RenderingServer.ViewportMSAA(Ptrcall.call0[Long](gdext.classes.RenderSceneBuffersConfiguration.mb_get_msaa_3d, livePtr))
  }

  /** RenderSceneBuffersConfiguration.set_msaa_3d */
  final def setMsaa3d(msaa3d: gdext.classes.RenderingServer.ViewportMSAA): Unit = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_set_msaa_3d == null) gdext.classes.RenderSceneBuffersConfiguration.mb_set_msaa_3d = MethodBind.get("RenderSceneBuffersConfiguration", "set_msaa_3d", 3952630748L)
    Ptrcall.callVoid1(gdext.classes.RenderSceneBuffersConfiguration.mb_set_msaa_3d, livePtr, msaa3d)
  }

  /** RenderSceneBuffersConfiguration.get_screen_space_aa */
  final def getScreenSpaceAa(): gdext.classes.RenderingServer.ViewportScreenSpaceAA = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_get_screen_space_aa == null) gdext.classes.RenderSceneBuffersConfiguration.mb_get_screen_space_aa = MethodBind.get("RenderSceneBuffersConfiguration", "get_screen_space_aa", 641513172L)
    gdext.classes.RenderingServer.ViewportScreenSpaceAA(Ptrcall.call0[Long](gdext.classes.RenderSceneBuffersConfiguration.mb_get_screen_space_aa, livePtr))
  }

  /** RenderSceneBuffersConfiguration.set_screen_space_aa */
  final def setScreenSpaceAa(screenSpaceAa: gdext.classes.RenderingServer.ViewportScreenSpaceAA): Unit = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_set_screen_space_aa == null) gdext.classes.RenderSceneBuffersConfiguration.mb_set_screen_space_aa = MethodBind.get("RenderSceneBuffersConfiguration", "set_screen_space_aa", 139543108L)
    Ptrcall.callVoid1(gdext.classes.RenderSceneBuffersConfiguration.mb_set_screen_space_aa, livePtr, screenSpaceAa)
  }

  /** RenderSceneBuffersConfiguration.get_fsr_sharpness */
  final def getFsrSharpness(): Double = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_get_fsr_sharpness == null) gdext.classes.RenderSceneBuffersConfiguration.mb_get_fsr_sharpness = MethodBind.get("RenderSceneBuffersConfiguration", "get_fsr_sharpness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RenderSceneBuffersConfiguration.mb_get_fsr_sharpness, livePtr)
  }

  /** RenderSceneBuffersConfiguration.set_fsr_sharpness */
  final def setFsrSharpness(fsrSharpness: Double): Unit = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_set_fsr_sharpness == null) gdext.classes.RenderSceneBuffersConfiguration.mb_set_fsr_sharpness = MethodBind.get("RenderSceneBuffersConfiguration", "set_fsr_sharpness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RenderSceneBuffersConfiguration.mb_set_fsr_sharpness, livePtr, fsrSharpness)
  }

  /** RenderSceneBuffersConfiguration.get_texture_mipmap_bias */
  final def getTextureMipmapBias(): Double = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_get_texture_mipmap_bias == null) gdext.classes.RenderSceneBuffersConfiguration.mb_get_texture_mipmap_bias = MethodBind.get("RenderSceneBuffersConfiguration", "get_texture_mipmap_bias", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RenderSceneBuffersConfiguration.mb_get_texture_mipmap_bias, livePtr)
  }

  /** RenderSceneBuffersConfiguration.set_texture_mipmap_bias */
  final def setTextureMipmapBias(textureMipmapBias: Double): Unit = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_set_texture_mipmap_bias == null) gdext.classes.RenderSceneBuffersConfiguration.mb_set_texture_mipmap_bias = MethodBind.get("RenderSceneBuffersConfiguration", "set_texture_mipmap_bias", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RenderSceneBuffersConfiguration.mb_set_texture_mipmap_bias, livePtr, textureMipmapBias)
  }

  /** RenderSceneBuffersConfiguration.get_anisotropic_filtering_level */
  final def getAnisotropicFilteringLevel(): gdext.classes.RenderingServer.ViewportAnisotropicFiltering = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_get_anisotropic_filtering_level == null) gdext.classes.RenderSceneBuffersConfiguration.mb_get_anisotropic_filtering_level = MethodBind.get("RenderSceneBuffersConfiguration", "get_anisotropic_filtering_level", 1617414954L)
    gdext.classes.RenderingServer.ViewportAnisotropicFiltering(Ptrcall.call0[Long](gdext.classes.RenderSceneBuffersConfiguration.mb_get_anisotropic_filtering_level, livePtr))
  }

  /** RenderSceneBuffersConfiguration.set_anisotropic_filtering_level */
  final def setAnisotropicFilteringLevel(anisotropicFilteringLevel: gdext.classes.RenderingServer.ViewportAnisotropicFiltering): Unit = {
    if (gdext.classes.RenderSceneBuffersConfiguration.mb_set_anisotropic_filtering_level == null) gdext.classes.RenderSceneBuffersConfiguration.mb_set_anisotropic_filtering_level = MethodBind.get("RenderSceneBuffersConfiguration", "set_anisotropic_filtering_level", 2559658741L)
    Ptrcall.callVoid1(gdext.classes.RenderSceneBuffersConfiguration.mb_set_anisotropic_filtering_level, livePtr, anisotropicFilteringLevel)
  }

}

object RenderSceneBuffersConfiguration {
  private[classes] var mb_get_internal_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_internal_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_target_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_target_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_view_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_view_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scaling_3d_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scaling_3d_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_msaa_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_msaa_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_screen_space_aa: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_screen_space_aa: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fsr_sharpness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fsr_sharpness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_mipmap_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_mipmap_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_anisotropic_filtering_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_anisotropic_filtering_level: GDExtensionMethodBindPtr = null
}
