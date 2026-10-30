package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RenderSceneBuffersRD`, extends `RenderSceneBuffers`. */
abstract class RenderSceneBuffersRD extends RenderSceneBuffers {
  override def godotClassName: String = "RenderSceneBuffersRD"

  /** RenderSceneBuffersRD.has_texture */
  final def hasTexture(context: String, name: String): Boolean = {
    if (gdext.classes.RenderSceneBuffersRD.mb_has_texture == null) gdext.classes.RenderSceneBuffersRD.mb_has_texture = MethodBind.get("RenderSceneBuffersRD", "has_texture", 471820014L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.RenderSceneBuffersRD.mb_has_texture, livePtr, SnArg(context), SnArg(name))
  }

  /** RenderSceneBuffersRD.get_texture_format. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTextureFormat(context: String, name: String): RDTextureFormat = {
    if (gdext.classes.RenderSceneBuffersRD.mb_get_texture_format == null) gdext.classes.RenderSceneBuffersRD.mb_get_texture_format = MethodBind.get("RenderSceneBuffersRD", "get_texture_format", 371461758L)
    Wrappers.owned[RDTextureFormat](Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.RenderSceneBuffersRD.mb_get_texture_format, livePtr, SnArg(context), SnArg(name)))
  }

  /** RenderSceneBuffersRD.get_texture_slice_size */
  final def getTextureSliceSize(context: String, name: String, mipmap: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.RenderSceneBuffersRD.mb_get_texture_slice_size == null) gdext.classes.RenderSceneBuffersRD.mb_get_texture_slice_size = MethodBind.get("RenderSceneBuffersRD", "get_texture_slice_size", 2617625368L)
    Ptrcall.call3[SnArg, SnArg, Long, gdext.builtin.Vector2i](gdext.classes.RenderSceneBuffersRD.mb_get_texture_slice_size, livePtr, SnArg(context), SnArg(name), mipmap)
  }

  /** RenderSceneBuffersRD.clear_context */
  final def clearContext(context: String): Unit = {
    if (gdext.classes.RenderSceneBuffersRD.mb_clear_context == null) gdext.classes.RenderSceneBuffersRD.mb_clear_context = MethodBind.get("RenderSceneBuffersRD", "clear_context", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.RenderSceneBuffersRD.mb_clear_context, livePtr, SnArg(context))
  }

  /** RenderSceneBuffersRD.get_view_count */
  final def getViewCount(): Long = {
    if (gdext.classes.RenderSceneBuffersRD.mb_get_view_count == null) gdext.classes.RenderSceneBuffersRD.mb_get_view_count = MethodBind.get("RenderSceneBuffersRD", "get_view_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RenderSceneBuffersRD.mb_get_view_count, livePtr)
  }

  /** RenderSceneBuffersRD.get_internal_size */
  final def getInternalSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.RenderSceneBuffersRD.mb_get_internal_size == null) gdext.classes.RenderSceneBuffersRD.mb_get_internal_size = MethodBind.get("RenderSceneBuffersRD", "get_internal_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.RenderSceneBuffersRD.mb_get_internal_size, livePtr)
  }

  /** RenderSceneBuffersRD.get_target_size */
  final def getTargetSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.RenderSceneBuffersRD.mb_get_target_size == null) gdext.classes.RenderSceneBuffersRD.mb_get_target_size = MethodBind.get("RenderSceneBuffersRD", "get_target_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.RenderSceneBuffersRD.mb_get_target_size, livePtr)
  }

  /** RenderSceneBuffersRD.get_scaling_3d_mode */
  final def getScaling3dMode(): gdext.classes.RenderingServer.ViewportScaling3DMode = {
    if (gdext.classes.RenderSceneBuffersRD.mb_get_scaling_3d_mode == null) gdext.classes.RenderSceneBuffersRD.mb_get_scaling_3d_mode = MethodBind.get("RenderSceneBuffersRD", "get_scaling_3d_mode", 976778074L)
    gdext.classes.RenderingServer.ViewportScaling3DMode(Ptrcall.call0[Long](gdext.classes.RenderSceneBuffersRD.mb_get_scaling_3d_mode, livePtr))
  }

  /** RenderSceneBuffersRD.get_fsr_sharpness */
  final def getFsrSharpness(): Double = {
    if (gdext.classes.RenderSceneBuffersRD.mb_get_fsr_sharpness == null) gdext.classes.RenderSceneBuffersRD.mb_get_fsr_sharpness = MethodBind.get("RenderSceneBuffersRD", "get_fsr_sharpness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RenderSceneBuffersRD.mb_get_fsr_sharpness, livePtr)
  }

  /** RenderSceneBuffersRD.get_msaa_3d */
  final def getMsaa3d(): gdext.classes.RenderingServer.ViewportMSAA = {
    if (gdext.classes.RenderSceneBuffersRD.mb_get_msaa_3d == null) gdext.classes.RenderSceneBuffersRD.mb_get_msaa_3d = MethodBind.get("RenderSceneBuffersRD", "get_msaa_3d", 3109158617L)
    gdext.classes.RenderingServer.ViewportMSAA(Ptrcall.call0[Long](gdext.classes.RenderSceneBuffersRD.mb_get_msaa_3d, livePtr))
  }

  /** RenderSceneBuffersRD.get_texture_samples */
  final def getTextureSamples(): gdext.classes.RenderingDevice.TextureSamples = {
    if (gdext.classes.RenderSceneBuffersRD.mb_get_texture_samples == null) gdext.classes.RenderSceneBuffersRD.mb_get_texture_samples = MethodBind.get("RenderSceneBuffersRD", "get_texture_samples", 407791724L)
    gdext.classes.RenderingDevice.TextureSamples(Ptrcall.call0[Long](gdext.classes.RenderSceneBuffersRD.mb_get_texture_samples, livePtr))
  }

  /** RenderSceneBuffersRD.get_screen_space_aa */
  final def getScreenSpaceAa(): gdext.classes.RenderingServer.ViewportScreenSpaceAA = {
    if (gdext.classes.RenderSceneBuffersRD.mb_get_screen_space_aa == null) gdext.classes.RenderSceneBuffersRD.mb_get_screen_space_aa = MethodBind.get("RenderSceneBuffersRD", "get_screen_space_aa", 641513172L)
    gdext.classes.RenderingServer.ViewportScreenSpaceAA(Ptrcall.call0[Long](gdext.classes.RenderSceneBuffersRD.mb_get_screen_space_aa, livePtr))
  }

  /** RenderSceneBuffersRD.get_use_taa */
  final def getUseTaa(): Boolean = {
    if (gdext.classes.RenderSceneBuffersRD.mb_get_use_taa == null) gdext.classes.RenderSceneBuffersRD.mb_get_use_taa = MethodBind.get("RenderSceneBuffersRD", "get_use_taa", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RenderSceneBuffersRD.mb_get_use_taa, livePtr)
  }

  /** RenderSceneBuffersRD.get_use_debanding */
  final def getUseDebanding(): Boolean = {
    if (gdext.classes.RenderSceneBuffersRD.mb_get_use_debanding == null) gdext.classes.RenderSceneBuffersRD.mb_get_use_debanding = MethodBind.get("RenderSceneBuffersRD", "get_use_debanding", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RenderSceneBuffersRD.mb_get_use_debanding, livePtr)
  }

}

object RenderSceneBuffersRD {
  private[classes] var mb_has_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_slice_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_context: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_view_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_internal_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_target_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scaling_3d_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fsr_sharpness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_msaa_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_samples: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_screen_space_aa: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_taa: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_debanding: GDExtensionMethodBindPtr = null
}
