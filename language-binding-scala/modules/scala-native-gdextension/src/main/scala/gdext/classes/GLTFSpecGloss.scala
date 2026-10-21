package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFSpecGloss`, extends `Resource`. */
abstract class GLTFSpecGloss extends Resource {
  override def godotClassName: String = "GLTFSpecGloss"

  /** GLTFSpecGloss.get_diffuse_img. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getDiffuseImg(): Image = {
    if (gdext.classes.GLTFSpecGloss.mb_get_diffuse_img == null) gdext.classes.GLTFSpecGloss.mb_get_diffuse_img = MethodBind.get("GLTFSpecGloss", "get_diffuse_img", 564927088L)
    Wrappers.owned[Image](Ptrcall.call0[Long](gdext.classes.GLTFSpecGloss.mb_get_diffuse_img, livePtr))
  }

  /** GLTFSpecGloss.set_diffuse_img */
  final def setDiffuseImg(diffuse_img: Image): Unit = {
    if (gdext.classes.GLTFSpecGloss.mb_set_diffuse_img == null) gdext.classes.GLTFSpecGloss.mb_set_diffuse_img = MethodBind.get("GLTFSpecGloss", "set_diffuse_img", 532598488L)
    Ptrcall.callVoid1(gdext.classes.GLTFSpecGloss.mb_set_diffuse_img, livePtr, Wrappers.handle(diffuse_img))
  }

  /** GLTFSpecGloss.get_diffuse_factor */
  final def getDiffuseFactor(): gdext.builtin.Color = {
    if (gdext.classes.GLTFSpecGloss.mb_get_diffuse_factor == null) gdext.classes.GLTFSpecGloss.mb_get_diffuse_factor = MethodBind.get("GLTFSpecGloss", "get_diffuse_factor", 3200896285L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.GLTFSpecGloss.mb_get_diffuse_factor, livePtr)
  }

  /** GLTFSpecGloss.set_diffuse_factor */
  final def setDiffuseFactor(diffuse_factor: gdext.builtin.Color): Unit = {
    if (gdext.classes.GLTFSpecGloss.mb_set_diffuse_factor == null) gdext.classes.GLTFSpecGloss.mb_set_diffuse_factor = MethodBind.get("GLTFSpecGloss", "set_diffuse_factor", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.GLTFSpecGloss.mb_set_diffuse_factor, livePtr, diffuse_factor)
  }

  /** GLTFSpecGloss.get_gloss_factor */
  final def getGlossFactor(): Double = {
    if (gdext.classes.GLTFSpecGloss.mb_get_gloss_factor == null) gdext.classes.GLTFSpecGloss.mb_get_gloss_factor = MethodBind.get("GLTFSpecGloss", "get_gloss_factor", 191475506L)
    Ptrcall.call0[Double](gdext.classes.GLTFSpecGloss.mb_get_gloss_factor, livePtr)
  }

  /** GLTFSpecGloss.set_gloss_factor */
  final def setGlossFactor(gloss_factor: Double): Unit = {
    if (gdext.classes.GLTFSpecGloss.mb_set_gloss_factor == null) gdext.classes.GLTFSpecGloss.mb_set_gloss_factor = MethodBind.get("GLTFSpecGloss", "set_gloss_factor", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFSpecGloss.mb_set_gloss_factor, livePtr, gloss_factor)
  }

  /** GLTFSpecGloss.get_specular_factor */
  final def getSpecularFactor(): gdext.builtin.Color = {
    if (gdext.classes.GLTFSpecGloss.mb_get_specular_factor == null) gdext.classes.GLTFSpecGloss.mb_get_specular_factor = MethodBind.get("GLTFSpecGloss", "get_specular_factor", 3200896285L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.GLTFSpecGloss.mb_get_specular_factor, livePtr)
  }

  /** GLTFSpecGloss.set_specular_factor */
  final def setSpecularFactor(specular_factor: gdext.builtin.Color): Unit = {
    if (gdext.classes.GLTFSpecGloss.mb_set_specular_factor == null) gdext.classes.GLTFSpecGloss.mb_set_specular_factor = MethodBind.get("GLTFSpecGloss", "set_specular_factor", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.GLTFSpecGloss.mb_set_specular_factor, livePtr, specular_factor)
  }

  /** GLTFSpecGloss.get_spec_gloss_img. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSpecGlossImg(): Image = {
    if (gdext.classes.GLTFSpecGloss.mb_get_spec_gloss_img == null) gdext.classes.GLTFSpecGloss.mb_get_spec_gloss_img = MethodBind.get("GLTFSpecGloss", "get_spec_gloss_img", 564927088L)
    Wrappers.owned[Image](Ptrcall.call0[Long](gdext.classes.GLTFSpecGloss.mb_get_spec_gloss_img, livePtr))
  }

  /** GLTFSpecGloss.set_spec_gloss_img */
  final def setSpecGlossImg(spec_gloss_img: Image): Unit = {
    if (gdext.classes.GLTFSpecGloss.mb_set_spec_gloss_img == null) gdext.classes.GLTFSpecGloss.mb_set_spec_gloss_img = MethodBind.get("GLTFSpecGloss", "set_spec_gloss_img", 532598488L)
    Ptrcall.callVoid1(gdext.classes.GLTFSpecGloss.mb_set_spec_gloss_img, livePtr, Wrappers.handle(spec_gloss_img))
  }

}

object GLTFSpecGloss {
  private[classes] var mb_get_diffuse_img: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_diffuse_img: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_diffuse_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_diffuse_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gloss_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gloss_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_specular_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_specular_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_spec_gloss_img: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_spec_gloss_img: GDExtensionMethodBindPtr = null
}
