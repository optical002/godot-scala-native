package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `TextureProgressBar`, extends `Range`. */
abstract class TextureProgressBar extends Range {
  override def godotClassName: String = "TextureProgressBar"

  /** TextureProgressBar.set_under_texture */
  final def setUnderTexture(tex: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureProgressBar", "set_under_texture", 4051416890L), hostObject.objectPtr, tex.hostObject)

  /** TextureProgressBar.get_under_texture */
  final def getUnderTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextureProgressBar", "get_under_texture", 3635182373L), hostObject.objectPtr)

  /** TextureProgressBar.set_progress_texture */
  final def setProgressTexture(tex: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureProgressBar", "set_progress_texture", 4051416890L), hostObject.objectPtr, tex.hostObject)

  /** TextureProgressBar.get_progress_texture */
  final def getProgressTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextureProgressBar", "get_progress_texture", 3635182373L), hostObject.objectPtr)

  /** TextureProgressBar.set_over_texture */
  final def setOverTexture(tex: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureProgressBar", "set_over_texture", 4051416890L), hostObject.objectPtr, tex.hostObject)

  /** TextureProgressBar.get_over_texture */
  final def getOverTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextureProgressBar", "get_over_texture", 3635182373L), hostObject.objectPtr)

  /** TextureProgressBar.set_fill_mode */
  final def setFillMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureProgressBar", "set_fill_mode", 1286410249L), hostObject.objectPtr, mode)

  /** TextureProgressBar.get_fill_mode */
  final def getFillMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextureProgressBar", "get_fill_mode", 2455072627L), hostObject.objectPtr)

  /** TextureProgressBar.set_tint_under */
  final def setTintUnder(tint: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureProgressBar", "set_tint_under", 2920490490L), hostObject.objectPtr, tint)

  /** TextureProgressBar.get_tint_under */
  final def getTintUnder(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("TextureProgressBar", "get_tint_under", 3444240500L), hostObject.objectPtr)

  /** TextureProgressBar.set_tint_progress */
  final def setTintProgress(tint: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureProgressBar", "set_tint_progress", 2920490490L), hostObject.objectPtr, tint)

  /** TextureProgressBar.get_tint_progress */
  final def getTintProgress(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("TextureProgressBar", "get_tint_progress", 3444240500L), hostObject.objectPtr)

  /** TextureProgressBar.set_tint_over */
  final def setTintOver(tint: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureProgressBar", "set_tint_over", 2920490490L), hostObject.objectPtr, tint)

  /** TextureProgressBar.get_tint_over */
  final def getTintOver(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("TextureProgressBar", "get_tint_over", 3444240500L), hostObject.objectPtr)

  /** TextureProgressBar.set_texture_progress_offset */
  final def setTextureProgressOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureProgressBar", "set_texture_progress_offset", 743155724L), hostObject.objectPtr, offset)

  /** TextureProgressBar.get_texture_progress_offset */
  final def getTextureProgressOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("TextureProgressBar", "get_texture_progress_offset", 3341600327L), hostObject.objectPtr)

  /** TextureProgressBar.set_radial_initial_angle */
  final def setRadialInitialAngle(mode: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureProgressBar", "set_radial_initial_angle", 373806689L), hostObject.objectPtr, mode)

  /** TextureProgressBar.get_radial_initial_angle */
  final def getRadialInitialAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextureProgressBar", "get_radial_initial_angle", 191475506L), hostObject.objectPtr)

  /** TextureProgressBar.set_radial_center_offset */
  final def setRadialCenterOffset(mode: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureProgressBar", "set_radial_center_offset", 743155724L), hostObject.objectPtr, mode)

  /** TextureProgressBar.get_radial_center_offset */
  final def getRadialCenterOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("TextureProgressBar", "get_radial_center_offset", 1497962370L), hostObject.objectPtr)

  /** TextureProgressBar.set_fill_degrees */
  final def setFillDegrees(mode: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureProgressBar", "set_fill_degrees", 373806689L), hostObject.objectPtr, mode)

  /** TextureProgressBar.get_fill_degrees */
  final def getFillDegrees(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextureProgressBar", "get_fill_degrees", 191475506L), hostObject.objectPtr)

  /** TextureProgressBar.set_stretch_margin */
  final def setStretchMargin(margin: Long, value: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextureProgressBar", "set_stretch_margin", 437707142L), hostObject.objectPtr, margin, value)

  /** TextureProgressBar.get_stretch_margin */
  final def getStretchMargin(margin: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextureProgressBar", "get_stretch_margin", 1983885014L), hostObject.objectPtr, margin)

  /** TextureProgressBar.set_nine_patch_stretch */
  final def setNinePatchStretch(stretch: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextureProgressBar", "set_nine_patch_stretch", 2586408642L), hostObject.objectPtr, stretch)

  /** TextureProgressBar.get_nine_patch_stretch */
  final def getNinePatchStretch(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextureProgressBar", "get_nine_patch_stretch", 36873697L), hostObject.objectPtr)

}
