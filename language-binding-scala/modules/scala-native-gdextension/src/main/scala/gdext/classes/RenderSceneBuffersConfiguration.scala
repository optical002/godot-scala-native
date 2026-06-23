package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderSceneBuffersConfiguration`, extends `RefCounted`. */
abstract class RenderSceneBuffersConfiguration extends RefCounted {

  /** RenderSceneBuffersConfiguration.get_internal_size */
  final def getInternalSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("RenderSceneBuffersConfiguration", "get_internal_size", 3690982128L), hostObject.objectPtr)

  /** RenderSceneBuffersConfiguration.set_internal_size */
  final def setInternalSize(internal_size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderSceneBuffersConfiguration", "set_internal_size", 1130785943L), hostObject.objectPtr, internal_size)

  /** RenderSceneBuffersConfiguration.get_target_size */
  final def getTargetSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("RenderSceneBuffersConfiguration", "get_target_size", 3690982128L), hostObject.objectPtr)

  /** RenderSceneBuffersConfiguration.set_target_size */
  final def setTargetSize(target_size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderSceneBuffersConfiguration", "set_target_size", 1130785943L), hostObject.objectPtr, target_size)

  /** RenderSceneBuffersConfiguration.get_view_count */
  final def getViewCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderSceneBuffersConfiguration", "get_view_count", 3905245786L), hostObject.objectPtr)

  /** RenderSceneBuffersConfiguration.set_view_count */
  final def setViewCount(view_count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderSceneBuffersConfiguration", "set_view_count", 1286410249L), hostObject.objectPtr, view_count)

  /** RenderSceneBuffersConfiguration.get_scaling_3d_mode */
  final def getScaling3dMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderSceneBuffersConfiguration", "get_scaling_3d_mode", 976778074L), hostObject.objectPtr)

  /** RenderSceneBuffersConfiguration.set_scaling_3d_mode */
  final def setScaling3dMode(scaling_3d_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderSceneBuffersConfiguration", "set_scaling_3d_mode", 447477857L), hostObject.objectPtr, scaling_3d_mode)

  /** RenderSceneBuffersConfiguration.get_msaa_3d */
  final def getMsaa3d(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderSceneBuffersConfiguration", "get_msaa_3d", 3109158617L), hostObject.objectPtr)

  /** RenderSceneBuffersConfiguration.set_msaa_3d */
  final def setMsaa3d(msaa_3d: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderSceneBuffersConfiguration", "set_msaa_3d", 3952630748L), hostObject.objectPtr, msaa_3d)

  /** RenderSceneBuffersConfiguration.get_screen_space_aa */
  final def getScreenSpaceAa(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderSceneBuffersConfiguration", "get_screen_space_aa", 641513172L), hostObject.objectPtr)

  /** RenderSceneBuffersConfiguration.set_screen_space_aa */
  final def setScreenSpaceAa(screen_space_aa: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderSceneBuffersConfiguration", "set_screen_space_aa", 139543108L), hostObject.objectPtr, screen_space_aa)

  /** RenderSceneBuffersConfiguration.get_fsr_sharpness */
  final def getFsrSharpness(): Double =
    Ptrcall.call0[Double](MethodBind.get("RenderSceneBuffersConfiguration", "get_fsr_sharpness", 1740695150L), hostObject.objectPtr)

  /** RenderSceneBuffersConfiguration.set_fsr_sharpness */
  final def setFsrSharpness(fsr_sharpness: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderSceneBuffersConfiguration", "set_fsr_sharpness", 373806689L), hostObject.objectPtr, fsr_sharpness)

  /** RenderSceneBuffersConfiguration.get_texture_mipmap_bias */
  final def getTextureMipmapBias(): Double =
    Ptrcall.call0[Double](MethodBind.get("RenderSceneBuffersConfiguration", "get_texture_mipmap_bias", 1740695150L), hostObject.objectPtr)

  /** RenderSceneBuffersConfiguration.set_texture_mipmap_bias */
  final def setTextureMipmapBias(texture_mipmap_bias: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderSceneBuffersConfiguration", "set_texture_mipmap_bias", 373806689L), hostObject.objectPtr, texture_mipmap_bias)

  /** RenderSceneBuffersConfiguration.get_anisotropic_filtering_level */
  final def getAnisotropicFilteringLevel(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderSceneBuffersConfiguration", "get_anisotropic_filtering_level", 1617414954L), hostObject.objectPtr)

  /** RenderSceneBuffersConfiguration.set_anisotropic_filtering_level */
  final def setAnisotropicFilteringLevel(anisotropic_filtering_level: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderSceneBuffersConfiguration", "set_anisotropic_filtering_level", 2559658741L), hostObject.objectPtr, anisotropic_filtering_level)

}

object RenderSceneBuffersConfiguration {
  /** Class metadata for Gd[RenderSceneBuffersConfiguration] lifetime management and casting. */
  given GodotClass[RenderSceneBuffersConfiguration] with {
    def className = "RenderSceneBuffersConfiguration"
    def isRefCounted = true
    def wrap(o: GodotObject): RenderSceneBuffersConfiguration = new RenderSceneBuffersConfiguration {}.withHost(o.objectPtr)
    def unwrap(t: RenderSceneBuffersConfiguration): GodotObject = t.hostObject
  }
}
