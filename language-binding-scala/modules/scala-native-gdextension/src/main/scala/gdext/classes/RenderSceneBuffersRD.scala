package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderSceneBuffersRD`, extends `RenderSceneBuffers`. */
abstract class RenderSceneBuffersRD extends RenderSceneBuffers {

  /** RenderSceneBuffersRD.has_texture */
  final def hasTexture(context: gdext.builtin.StringName, name: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("RenderSceneBuffersRD", "has_texture", 471820014L), hostObject.objectPtr, context, name)

  /** RenderSceneBuffersRD.get_texture_format */
  final def getTextureFormat(context: gdext.builtin.StringName, name: gdext.builtin.StringName): GodotObject =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, GodotObject](MethodBind.get("RenderSceneBuffersRD", "get_texture_format", 371461758L), hostObject.objectPtr, context, name)

  /** RenderSceneBuffersRD.get_texture_slice_size */
  final def getTextureSliceSize(context: gdext.builtin.StringName, name: gdext.builtin.StringName, mipmap: Long): gdext.builtin.Vector2i =
    Ptrcall.call3[gdext.builtin.StringName, gdext.builtin.StringName, Long, gdext.builtin.Vector2i](MethodBind.get("RenderSceneBuffersRD", "get_texture_slice_size", 2617625368L), hostObject.objectPtr, context, name, mipmap)

  /** RenderSceneBuffersRD.clear_context */
  final def clearContext(context: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderSceneBuffersRD", "clear_context", 3304788590L), hostObject.objectPtr, context)

  /** RenderSceneBuffersRD.get_view_count */
  final def getViewCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderSceneBuffersRD", "get_view_count", 3905245786L), hostObject.objectPtr)

  /** RenderSceneBuffersRD.get_internal_size */
  final def getInternalSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("RenderSceneBuffersRD", "get_internal_size", 3690982128L), hostObject.objectPtr)

  /** RenderSceneBuffersRD.get_target_size */
  final def getTargetSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("RenderSceneBuffersRD", "get_target_size", 3690982128L), hostObject.objectPtr)

  /** RenderSceneBuffersRD.get_scaling_3d_mode */
  final def getScaling3dMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderSceneBuffersRD", "get_scaling_3d_mode", 976778074L), hostObject.objectPtr)

  /** RenderSceneBuffersRD.get_fsr_sharpness */
  final def getFsrSharpness(): Double =
    Ptrcall.call0[Double](MethodBind.get("RenderSceneBuffersRD", "get_fsr_sharpness", 1740695150L), hostObject.objectPtr)

  /** RenderSceneBuffersRD.get_msaa_3d */
  final def getMsaa3d(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderSceneBuffersRD", "get_msaa_3d", 3109158617L), hostObject.objectPtr)

  /** RenderSceneBuffersRD.get_texture_samples */
  final def getTextureSamples(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderSceneBuffersRD", "get_texture_samples", 407791724L), hostObject.objectPtr)

  /** RenderSceneBuffersRD.get_screen_space_aa */
  final def getScreenSpaceAa(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderSceneBuffersRD", "get_screen_space_aa", 641513172L), hostObject.objectPtr)

  /** RenderSceneBuffersRD.get_use_taa */
  final def getUseTaa(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RenderSceneBuffersRD", "get_use_taa", 36873697L), hostObject.objectPtr)

  /** RenderSceneBuffersRD.get_use_debanding */
  final def getUseDebanding(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RenderSceneBuffersRD", "get_use_debanding", 36873697L), hostObject.objectPtr)

}

object RenderSceneBuffersRD {
  /** Class metadata for Gd[RenderSceneBuffersRD] lifetime management and casting. */
  given GodotClass[RenderSceneBuffersRD] with {
    def className = "RenderSceneBuffersRD"
    def isRefCounted = true
    def wrap(o: GodotObject): RenderSceneBuffersRD = new RenderSceneBuffersRD {}.withHost(o.objectPtr)
    def unwrap(t: RenderSceneBuffersRD): GodotObject = t.hostObject
  }
}
