package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `FontVariation`, extends `Font`. */
abstract class FontVariation extends Font {

  /** FontVariation.set_base_font */
  final def setBaseFont(font: Font): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontVariation", "set_base_font", 1262170328L), hostObject.objectPtr, font.hostObject)

  /** FontVariation.get_base_font */
  final def getBaseFont(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("FontVariation", "get_base_font", 3229501585L), hostObject.objectPtr)

  /** FontVariation.set_variation_embolden */
  final def setVariationEmbolden(strength: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontVariation", "set_variation_embolden", 373806689L), hostObject.objectPtr, strength)

  /** FontVariation.get_variation_embolden */
  final def getVariationEmbolden(): Double =
    Ptrcall.call0[Double](MethodBind.get("FontVariation", "get_variation_embolden", 1740695150L), hostObject.objectPtr)

  /** FontVariation.set_variation_face_index */
  final def setVariationFaceIndex(face_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontVariation", "set_variation_face_index", 1286410249L), hostObject.objectPtr, face_index)

  /** FontVariation.get_variation_face_index */
  final def getVariationFaceIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("FontVariation", "get_variation_face_index", 3905245786L), hostObject.objectPtr)

  /** FontVariation.set_variation_transform */
  final def setVariationTransform(transform: gdext.builtin.Transform2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontVariation", "set_variation_transform", 2761652528L), hostObject.objectPtr, transform)

  /** FontVariation.get_variation_transform */
  final def getVariationTransform(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("FontVariation", "get_variation_transform", 3814499831L), hostObject.objectPtr)

  /** FontVariation.set_spacing */
  final def setSpacing(spacing: Long, value: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("FontVariation", "set_spacing", 3122339690L), hostObject.objectPtr, spacing, value)

  /** FontVariation.set_baseline_offset */
  final def setBaselineOffset(baseline_offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontVariation", "set_baseline_offset", 373806689L), hostObject.objectPtr, baseline_offset)

  /** FontVariation.get_baseline_offset */
  final def getBaselineOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("FontVariation", "get_baseline_offset", 1740695150L), hostObject.objectPtr)

}

object FontVariation {
  /** Class metadata for Gd[FontVariation] lifetime management and casting. */
  given GodotClass[FontVariation] with {
    def className = "FontVariation"
    def isRefCounted = true
    def wrap(o: GodotObject): FontVariation = new FontVariation {}.withHost(o.objectPtr)
    def unwrap(t: FontVariation): GodotObject = t.hostObject
  }
}
