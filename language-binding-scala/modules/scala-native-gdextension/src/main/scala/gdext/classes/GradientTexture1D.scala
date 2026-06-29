package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GradientTexture1D`, extends `Texture2D`. */
abstract class GradientTexture1D extends Texture2D {
  override def godotClassName: String = "GradientTexture1D"

  /** GradientTexture1D.set_gradient */
  final def setGradient(gradient: Gradient): Unit =
    Ptrcall.callVoid1(MethodBind.get("GradientTexture1D", "set_gradient", 2756054477L), hostObject.objectPtr, gradient.hostObject)

  /** GradientTexture1D.get_gradient */
  final def getGradient(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GradientTexture1D", "get_gradient", 132272999L), hostObject.objectPtr)

  /** GradientTexture1D.set_width */
  final def setWidth(width: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GradientTexture1D", "set_width", 1286410249L), hostObject.objectPtr, width)

  /** GradientTexture1D.set_use_hdr */
  final def setUseHdr(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GradientTexture1D", "set_use_hdr", 2586408642L), hostObject.objectPtr, enabled)

  /** GradientTexture1D.is_using_hdr */
  final def isUsingHdr(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GradientTexture1D", "is_using_hdr", 36873697L), hostObject.objectPtr)

}
