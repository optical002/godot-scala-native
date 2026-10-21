package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `FontVariation`, extends `Font`. */
abstract class FontVariation extends Font {
  override def godotClassName: String = "FontVariation"

  /** FontVariation.set_base_font */
  final def setBaseFont(font: Font): Unit = {
    if (gdext.classes.FontVariation.mb_set_base_font == null) gdext.classes.FontVariation.mb_set_base_font = MethodBind.get("FontVariation", "set_base_font", 1262170328L)
    Ptrcall.callVoid1(gdext.classes.FontVariation.mb_set_base_font, livePtr, Wrappers.handle(font))
  }

  /** FontVariation.get_base_font. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getBaseFont(): Font = {
    if (gdext.classes.FontVariation.mb_get_base_font == null) gdext.classes.FontVariation.mb_get_base_font = MethodBind.get("FontVariation", "get_base_font", 3229501585L)
    Wrappers.owned[Font](Ptrcall.call0[Long](gdext.classes.FontVariation.mb_get_base_font, livePtr))
  }

  /** FontVariation.set_variation_embolden */
  final def setVariationEmbolden(strength: Double): Unit = {
    if (gdext.classes.FontVariation.mb_set_variation_embolden == null) gdext.classes.FontVariation.mb_set_variation_embolden = MethodBind.get("FontVariation", "set_variation_embolden", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FontVariation.mb_set_variation_embolden, livePtr, strength)
  }

  /** FontVariation.get_variation_embolden */
  final def getVariationEmbolden(): Double = {
    if (gdext.classes.FontVariation.mb_get_variation_embolden == null) gdext.classes.FontVariation.mb_get_variation_embolden = MethodBind.get("FontVariation", "get_variation_embolden", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FontVariation.mb_get_variation_embolden, livePtr)
  }

  /** FontVariation.set_variation_face_index */
  final def setVariationFaceIndex(face_index: Long): Unit = {
    if (gdext.classes.FontVariation.mb_set_variation_face_index == null) gdext.classes.FontVariation.mb_set_variation_face_index = MethodBind.get("FontVariation", "set_variation_face_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.FontVariation.mb_set_variation_face_index, livePtr, face_index)
  }

  /** FontVariation.get_variation_face_index */
  final def getVariationFaceIndex(): Long = {
    if (gdext.classes.FontVariation.mb_get_variation_face_index == null) gdext.classes.FontVariation.mb_get_variation_face_index = MethodBind.get("FontVariation", "get_variation_face_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FontVariation.mb_get_variation_face_index, livePtr)
  }

  /** FontVariation.set_variation_transform */
  final def setVariationTransform(transform: gdext.builtin.Transform2D): Unit = {
    if (gdext.classes.FontVariation.mb_set_variation_transform == null) gdext.classes.FontVariation.mb_set_variation_transform = MethodBind.get("FontVariation", "set_variation_transform", 2761652528L)
    Ptrcall.callVoid1(gdext.classes.FontVariation.mb_set_variation_transform, livePtr, transform)
  }

  /** FontVariation.get_variation_transform */
  final def getVariationTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.FontVariation.mb_get_variation_transform == null) gdext.classes.FontVariation.mb_get_variation_transform = MethodBind.get("FontVariation", "get_variation_transform", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.FontVariation.mb_get_variation_transform, livePtr)
  }

  /** FontVariation.set_spacing */
  final def setSpacing(spacing: Long, value: Long): Unit = {
    if (gdext.classes.FontVariation.mb_set_spacing == null) gdext.classes.FontVariation.mb_set_spacing = MethodBind.get("FontVariation", "set_spacing", 3122339690L)
    Ptrcall.callVoid2(gdext.classes.FontVariation.mb_set_spacing, livePtr, spacing, value)
  }

  /** FontVariation.set_baseline_offset */
  final def setBaselineOffset(baseline_offset: Double): Unit = {
    if (gdext.classes.FontVariation.mb_set_baseline_offset == null) gdext.classes.FontVariation.mb_set_baseline_offset = MethodBind.get("FontVariation", "set_baseline_offset", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FontVariation.mb_set_baseline_offset, livePtr, baseline_offset)
  }

  /** FontVariation.get_baseline_offset */
  final def getBaselineOffset(): Double = {
    if (gdext.classes.FontVariation.mb_get_baseline_offset == null) gdext.classes.FontVariation.mb_get_baseline_offset = MethodBind.get("FontVariation", "get_baseline_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FontVariation.mb_get_baseline_offset, livePtr)
  }

}

object FontVariation {
  private[classes] var mb_set_base_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_base_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_variation_embolden: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_variation_embolden: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_variation_face_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_variation_face_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_variation_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_variation_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_spacing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_baseline_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_baseline_offset: GDExtensionMethodBindPtr = null
}
