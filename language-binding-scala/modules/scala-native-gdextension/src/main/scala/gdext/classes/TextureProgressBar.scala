package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TextureProgressBar`, extends `Range`. */
abstract class TextureProgressBar extends Range {
  override def godotClassName: String = "TextureProgressBar"

  /** TextureProgressBar.set_under_texture */
  final def setUnderTexture(tex: Texture2D): Unit = {
    if (gdext.classes.TextureProgressBar.mb_set_under_texture == null) gdext.classes.TextureProgressBar.mb_set_under_texture = MethodBind.get("TextureProgressBar", "set_under_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.TextureProgressBar.mb_set_under_texture, livePtr, Wrappers.handle(tex))
  }

  /** TextureProgressBar.get_under_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getUnderTexture(): Texture2D = {
    if (gdext.classes.TextureProgressBar.mb_get_under_texture == null) gdext.classes.TextureProgressBar.mb_get_under_texture = MethodBind.get("TextureProgressBar", "get_under_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.TextureProgressBar.mb_get_under_texture, livePtr))
  }

  /** TextureProgressBar.set_progress_texture */
  final def setProgressTexture(tex: Texture2D): Unit = {
    if (gdext.classes.TextureProgressBar.mb_set_progress_texture == null) gdext.classes.TextureProgressBar.mb_set_progress_texture = MethodBind.get("TextureProgressBar", "set_progress_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.TextureProgressBar.mb_set_progress_texture, livePtr, Wrappers.handle(tex))
  }

  /** TextureProgressBar.get_progress_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getProgressTexture(): Texture2D = {
    if (gdext.classes.TextureProgressBar.mb_get_progress_texture == null) gdext.classes.TextureProgressBar.mb_get_progress_texture = MethodBind.get("TextureProgressBar", "get_progress_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.TextureProgressBar.mb_get_progress_texture, livePtr))
  }

  /** TextureProgressBar.set_over_texture */
  final def setOverTexture(tex: Texture2D): Unit = {
    if (gdext.classes.TextureProgressBar.mb_set_over_texture == null) gdext.classes.TextureProgressBar.mb_set_over_texture = MethodBind.get("TextureProgressBar", "set_over_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.TextureProgressBar.mb_set_over_texture, livePtr, Wrappers.handle(tex))
  }

  /** TextureProgressBar.get_over_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getOverTexture(): Texture2D = {
    if (gdext.classes.TextureProgressBar.mb_get_over_texture == null) gdext.classes.TextureProgressBar.mb_get_over_texture = MethodBind.get("TextureProgressBar", "get_over_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.TextureProgressBar.mb_get_over_texture, livePtr))
  }

  /** TextureProgressBar.set_fill_mode */
  final def setFillMode(mode: Long): Unit = {
    if (gdext.classes.TextureProgressBar.mb_set_fill_mode == null) gdext.classes.TextureProgressBar.mb_set_fill_mode = MethodBind.get("TextureProgressBar", "set_fill_mode", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TextureProgressBar.mb_set_fill_mode, livePtr, mode)
  }

  /** TextureProgressBar.get_fill_mode */
  final def getFillMode(): Long = {
    if (gdext.classes.TextureProgressBar.mb_get_fill_mode == null) gdext.classes.TextureProgressBar.mb_get_fill_mode = MethodBind.get("TextureProgressBar", "get_fill_mode", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.TextureProgressBar.mb_get_fill_mode, livePtr)
  }

  /** TextureProgressBar.set_tint_under */
  final def setTintUnder(tint: gdext.builtin.Color): Unit = {
    if (gdext.classes.TextureProgressBar.mb_set_tint_under == null) gdext.classes.TextureProgressBar.mb_set_tint_under = MethodBind.get("TextureProgressBar", "set_tint_under", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.TextureProgressBar.mb_set_tint_under, livePtr, tint)
  }

  /** TextureProgressBar.get_tint_under */
  final def getTintUnder(): gdext.builtin.Color = {
    if (gdext.classes.TextureProgressBar.mb_get_tint_under == null) gdext.classes.TextureProgressBar.mb_get_tint_under = MethodBind.get("TextureProgressBar", "get_tint_under", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.TextureProgressBar.mb_get_tint_under, livePtr)
  }

  /** TextureProgressBar.set_tint_progress */
  final def setTintProgress(tint: gdext.builtin.Color): Unit = {
    if (gdext.classes.TextureProgressBar.mb_set_tint_progress == null) gdext.classes.TextureProgressBar.mb_set_tint_progress = MethodBind.get("TextureProgressBar", "set_tint_progress", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.TextureProgressBar.mb_set_tint_progress, livePtr, tint)
  }

  /** TextureProgressBar.get_tint_progress */
  final def getTintProgress(): gdext.builtin.Color = {
    if (gdext.classes.TextureProgressBar.mb_get_tint_progress == null) gdext.classes.TextureProgressBar.mb_get_tint_progress = MethodBind.get("TextureProgressBar", "get_tint_progress", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.TextureProgressBar.mb_get_tint_progress, livePtr)
  }

  /** TextureProgressBar.set_tint_over */
  final def setTintOver(tint: gdext.builtin.Color): Unit = {
    if (gdext.classes.TextureProgressBar.mb_set_tint_over == null) gdext.classes.TextureProgressBar.mb_set_tint_over = MethodBind.get("TextureProgressBar", "set_tint_over", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.TextureProgressBar.mb_set_tint_over, livePtr, tint)
  }

  /** TextureProgressBar.get_tint_over */
  final def getTintOver(): gdext.builtin.Color = {
    if (gdext.classes.TextureProgressBar.mb_get_tint_over == null) gdext.classes.TextureProgressBar.mb_get_tint_over = MethodBind.get("TextureProgressBar", "get_tint_over", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.TextureProgressBar.mb_get_tint_over, livePtr)
  }

  /** TextureProgressBar.set_texture_progress_offset */
  final def setTextureProgressOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.TextureProgressBar.mb_set_texture_progress_offset == null) gdext.classes.TextureProgressBar.mb_set_texture_progress_offset = MethodBind.get("TextureProgressBar", "set_texture_progress_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.TextureProgressBar.mb_set_texture_progress_offset, livePtr, offset)
  }

  /** TextureProgressBar.get_texture_progress_offset */
  final def getTextureProgressOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.TextureProgressBar.mb_get_texture_progress_offset == null) gdext.classes.TextureProgressBar.mb_get_texture_progress_offset = MethodBind.get("TextureProgressBar", "get_texture_progress_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.TextureProgressBar.mb_get_texture_progress_offset, livePtr)
  }

  /** TextureProgressBar.set_radial_initial_angle */
  final def setRadialInitialAngle(mode: Double): Unit = {
    if (gdext.classes.TextureProgressBar.mb_set_radial_initial_angle == null) gdext.classes.TextureProgressBar.mb_set_radial_initial_angle = MethodBind.get("TextureProgressBar", "set_radial_initial_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TextureProgressBar.mb_set_radial_initial_angle, livePtr, mode)
  }

  /** TextureProgressBar.get_radial_initial_angle */
  final def getRadialInitialAngle(): Double = {
    if (gdext.classes.TextureProgressBar.mb_get_radial_initial_angle == null) gdext.classes.TextureProgressBar.mb_get_radial_initial_angle = MethodBind.get("TextureProgressBar", "get_radial_initial_angle", 191475506L)
    Ptrcall.call0[Double](gdext.classes.TextureProgressBar.mb_get_radial_initial_angle, livePtr)
  }

  /** TextureProgressBar.set_radial_center_offset */
  final def setRadialCenterOffset(mode: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.TextureProgressBar.mb_set_radial_center_offset == null) gdext.classes.TextureProgressBar.mb_set_radial_center_offset = MethodBind.get("TextureProgressBar", "set_radial_center_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.TextureProgressBar.mb_set_radial_center_offset, livePtr, mode)
  }

  /** TextureProgressBar.get_radial_center_offset */
  final def getRadialCenterOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.TextureProgressBar.mb_get_radial_center_offset == null) gdext.classes.TextureProgressBar.mb_get_radial_center_offset = MethodBind.get("TextureProgressBar", "get_radial_center_offset", 1497962370L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.TextureProgressBar.mb_get_radial_center_offset, livePtr)
  }

  /** TextureProgressBar.set_fill_degrees */
  final def setFillDegrees(mode: Double): Unit = {
    if (gdext.classes.TextureProgressBar.mb_set_fill_degrees == null) gdext.classes.TextureProgressBar.mb_set_fill_degrees = MethodBind.get("TextureProgressBar", "set_fill_degrees", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TextureProgressBar.mb_set_fill_degrees, livePtr, mode)
  }

  /** TextureProgressBar.get_fill_degrees */
  final def getFillDegrees(): Double = {
    if (gdext.classes.TextureProgressBar.mb_get_fill_degrees == null) gdext.classes.TextureProgressBar.mb_get_fill_degrees = MethodBind.get("TextureProgressBar", "get_fill_degrees", 191475506L)
    Ptrcall.call0[Double](gdext.classes.TextureProgressBar.mb_get_fill_degrees, livePtr)
  }

  /** TextureProgressBar.set_stretch_margin */
  final def setStretchMargin(margin: gdext.classes.Side, value: Long): Unit = {
    if (gdext.classes.TextureProgressBar.mb_set_stretch_margin == null) gdext.classes.TextureProgressBar.mb_set_stretch_margin = MethodBind.get("TextureProgressBar", "set_stretch_margin", 437707142L)
    Ptrcall.callVoid2(gdext.classes.TextureProgressBar.mb_set_stretch_margin, livePtr, margin, value)
  }

  /** TextureProgressBar.get_stretch_margin */
  final def getStretchMargin(margin: gdext.classes.Side): Long = {
    if (gdext.classes.TextureProgressBar.mb_get_stretch_margin == null) gdext.classes.TextureProgressBar.mb_get_stretch_margin = MethodBind.get("TextureProgressBar", "get_stretch_margin", 1983885014L)
    Ptrcall.call1[Long, Long](gdext.classes.TextureProgressBar.mb_get_stretch_margin, livePtr, margin)
  }

  /** TextureProgressBar.set_nine_patch_stretch */
  final def setNinePatchStretch(stretch: Boolean): Unit = {
    if (gdext.classes.TextureProgressBar.mb_set_nine_patch_stretch == null) gdext.classes.TextureProgressBar.mb_set_nine_patch_stretch = MethodBind.get("TextureProgressBar", "set_nine_patch_stretch", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextureProgressBar.mb_set_nine_patch_stretch, livePtr, stretch)
  }

  /** TextureProgressBar.get_nine_patch_stretch */
  final def getNinePatchStretch(): Boolean = {
    if (gdext.classes.TextureProgressBar.mb_get_nine_patch_stretch == null) gdext.classes.TextureProgressBar.mb_get_nine_patch_stretch = MethodBind.get("TextureProgressBar", "get_nine_patch_stretch", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextureProgressBar.mb_get_nine_patch_stretch, livePtr)
  }

}

object TextureProgressBar {
  private[classes] var mb_set_under_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_under_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_progress_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_progress_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_over_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_over_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fill_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fill_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tint_under: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tint_under: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tint_progress: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tint_progress: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tint_over: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tint_over: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_progress_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_progress_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_radial_initial_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radial_initial_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_radial_center_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radial_center_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fill_degrees: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fill_degrees: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stretch_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stretch_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_nine_patch_stretch: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_nine_patch_stretch: GDExtensionMethodBindPtr = null

  /** Godot enum `TextureProgressBar.FillMode`. */
  opaque type FillMode <: Long = Long

  object FillMode {
    final val LeftToRight: FillMode = 0L.asInstanceOf[FillMode]
    final val RightToLeft: FillMode = 1L.asInstanceOf[FillMode]
    final val TopToBottom: FillMode = 2L.asInstanceOf[FillMode]
    final val BottomToTop: FillMode = 3L.asInstanceOf[FillMode]
    final val Clockwise: FillMode = 4L.asInstanceOf[FillMode]
    final val CounterClockwise: FillMode = 5L.asInstanceOf[FillMode]
    final val BilinearLeftAndRight: FillMode = 6L.asInstanceOf[FillMode]
    final val BilinearTopAndBottom: FillMode = 7L.asInstanceOf[FillMode]
    final val ClockwiseAndCounterClockwise: FillMode = 8L.asInstanceOf[FillMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FillMode = value.asInstanceOf[FillMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FillMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L).asInstanceOf[scala.IArray[FillMode]]

    extension (self: FillMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "LeftToRight"
        case 1L => "RightToLeft"
        case 2L => "TopToBottom"
        case 3L => "BottomToTop"
        case 4L => "Clockwise"
        case 5L => "CounterClockwise"
        case 6L => "BilinearLeftAndRight"
        case 7L => "BilinearTopAndBottom"
        case 8L => "ClockwiseAndCounterClockwise"
        case other => other.toString
      }
  }
}
