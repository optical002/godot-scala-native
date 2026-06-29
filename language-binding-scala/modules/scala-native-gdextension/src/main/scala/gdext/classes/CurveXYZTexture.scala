package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CurveXYZTexture`, extends `Texture2D`. */
abstract class CurveXYZTexture extends Texture2D {
  override def godotClassName: String = "CurveXYZTexture"

  /** CurveXYZTexture.set_width */
  final def setWidth(width: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CurveXYZTexture", "set_width", 1286410249L), hostObject.objectPtr, width)

  /** CurveXYZTexture.set_curve_x */
  final def setCurveX(curve: Curve): Unit =
    Ptrcall.callVoid1(MethodBind.get("CurveXYZTexture", "set_curve_x", 270443179L), hostObject.objectPtr, curve.hostObject)

  /** CurveXYZTexture.get_curve_x */
  final def getCurveX(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CurveXYZTexture", "get_curve_x", 2460114913L), hostObject.objectPtr)

  /** CurveXYZTexture.set_curve_y */
  final def setCurveY(curve: Curve): Unit =
    Ptrcall.callVoid1(MethodBind.get("CurveXYZTexture", "set_curve_y", 270443179L), hostObject.objectPtr, curve.hostObject)

  /** CurveXYZTexture.get_curve_y */
  final def getCurveY(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CurveXYZTexture", "get_curve_y", 2460114913L), hostObject.objectPtr)

  /** CurveXYZTexture.set_curve_z */
  final def setCurveZ(curve: Curve): Unit =
    Ptrcall.callVoid1(MethodBind.get("CurveXYZTexture", "set_curve_z", 270443179L), hostObject.objectPtr, curve.hostObject)

  /** CurveXYZTexture.get_curve_z */
  final def getCurveZ(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CurveXYZTexture", "get_curve_z", 2460114913L), hostObject.objectPtr)

}
