package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CurveTexture`, extends `Texture2D`. */
abstract class CurveTexture extends Texture2D {
  override def godotClassName: String = "CurveTexture"

  /** CurveTexture.set_width */
  final def setWidth(width: Long): Unit = {
    if (gdext.classes.CurveTexture.mb_set_width == null) gdext.classes.CurveTexture.mb_set_width = MethodBind.get("CurveTexture", "set_width", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CurveTexture.mb_set_width, livePtr, width)
  }

  /** CurveTexture.set_curve */
  final def setCurve(curve: Curve): Unit = {
    if (gdext.classes.CurveTexture.mb_set_curve == null) gdext.classes.CurveTexture.mb_set_curve = MethodBind.get("CurveTexture", "set_curve", 270443179L)
    Ptrcall.callVoid1(gdext.classes.CurveTexture.mb_set_curve, livePtr, Wrappers.handle(curve))
  }

  /** CurveTexture.get_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCurve(): Curve = {
    if (gdext.classes.CurveTexture.mb_get_curve == null) gdext.classes.CurveTexture.mb_get_curve = MethodBind.get("CurveTexture", "get_curve", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.CurveTexture.mb_get_curve, livePtr))
  }

  /** CurveTexture.set_texture_mode */
  final def setTextureMode(textureMode: gdext.classes.CurveTexture.TextureMode): Unit = {
    if (gdext.classes.CurveTexture.mb_set_texture_mode == null) gdext.classes.CurveTexture.mb_set_texture_mode = MethodBind.get("CurveTexture", "set_texture_mode", 1321955367L)
    Ptrcall.callVoid1(gdext.classes.CurveTexture.mb_set_texture_mode, livePtr, textureMode)
  }

  /** CurveTexture.get_texture_mode */
  final def getTextureMode(): gdext.classes.CurveTexture.TextureMode = {
    if (gdext.classes.CurveTexture.mb_get_texture_mode == null) gdext.classes.CurveTexture.mb_get_texture_mode = MethodBind.get("CurveTexture", "get_texture_mode", 715756376L)
    gdext.classes.CurveTexture.TextureMode(Ptrcall.call0[Long](gdext.classes.CurveTexture.mb_get_texture_mode, livePtr))
  }

}

object CurveTexture {
  private[classes] var mb_set_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_mode: GDExtensionMethodBindPtr = null

  /** Godot enum `CurveTexture.TextureMode`. */
  opaque type TextureMode <: Long = Long

  object TextureMode {
    final val Rgb: TextureMode = 0L.asInstanceOf[TextureMode]
    final val Red: TextureMode = 1L.asInstanceOf[TextureMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureMode = value.asInstanceOf[TextureMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[TextureMode]]

    extension (self: TextureMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Rgb"
        case 1L => "Red"
        case other => other.toString
      }
  }
}
