package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFSpecGloss`, extends `Resource`. */
abstract class GLTFSpecGloss extends Resource {

  /** GLTFSpecGloss.get_diffuse_img */
  final def getDiffuseImg(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GLTFSpecGloss", "get_diffuse_img", 564927088L), hostObject.objectPtr)

  /** GLTFSpecGloss.set_diffuse_img */
  final def setDiffuseImg(diffuse_img: Image): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFSpecGloss", "set_diffuse_img", 532598488L), hostObject.objectPtr, diffuse_img.hostObject)

  /** GLTFSpecGloss.get_diffuse_factor */
  final def getDiffuseFactor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("GLTFSpecGloss", "get_diffuse_factor", 3200896285L), hostObject.objectPtr)

  /** GLTFSpecGloss.set_diffuse_factor */
  final def setDiffuseFactor(diffuse_factor: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFSpecGloss", "set_diffuse_factor", 2920490490L), hostObject.objectPtr, diffuse_factor)

  /** GLTFSpecGloss.get_gloss_factor */
  final def getGlossFactor(): Double =
    Ptrcall.call0[Double](MethodBind.get("GLTFSpecGloss", "get_gloss_factor", 191475506L), hostObject.objectPtr)

  /** GLTFSpecGloss.set_gloss_factor */
  final def setGlossFactor(gloss_factor: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFSpecGloss", "set_gloss_factor", 373806689L), hostObject.objectPtr, gloss_factor)

  /** GLTFSpecGloss.get_specular_factor */
  final def getSpecularFactor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("GLTFSpecGloss", "get_specular_factor", 3200896285L), hostObject.objectPtr)

  /** GLTFSpecGloss.set_specular_factor */
  final def setSpecularFactor(specular_factor: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFSpecGloss", "set_specular_factor", 2920490490L), hostObject.objectPtr, specular_factor)

  /** GLTFSpecGloss.get_spec_gloss_img */
  final def getSpecGlossImg(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GLTFSpecGloss", "get_spec_gloss_img", 564927088L), hostObject.objectPtr)

  /** GLTFSpecGloss.set_spec_gloss_img */
  final def setSpecGlossImg(spec_gloss_img: Image): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFSpecGloss", "set_spec_gloss_img", 532598488L), hostObject.objectPtr, spec_gloss_img.hostObject)

}

object GLTFSpecGloss {
  /** Class metadata for Gd[GLTFSpecGloss] lifetime management and casting. */
  given GodotClass[GLTFSpecGloss] with {
    def className = "GLTFSpecGloss"
    def isRefCounted = true
    def wrap(o: GodotObject): GLTFSpecGloss = new GLTFSpecGloss {}.withHost(o.objectPtr)
    def unwrap(t: GLTFSpecGloss): GodotObject = t.hostObject
  }
}
